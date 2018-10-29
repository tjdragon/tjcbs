package tjcbs.schema;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Arrays;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.inject.Guice;
import com.google.inject.Injector;

import liquibase.Liquibase;
import liquibase.database.Database;
import liquibase.database.DatabaseFactory;
import liquibase.database.jvm.JdbcConnection;
import liquibase.resource.ClassLoaderResourceAccessor;
import tjcbs.db.TJCBSDB;

public class SchemaUpdaterMain {
	private static final Logger log = LoggerFactory.getLogger(SchemaUpdaterMain.class);
	
	@Inject
	public SchemaUpdaterMain() {
	}
	
	public void update() throws Exception {
		final Connection conn = getConnection();
		final Database liquidDb = DatabaseFactory.getInstance()
				                                 .findCorrectDatabaseImplementation(new JdbcConnection(conn));
		final Liquibase liquidBase = new Liquibase("tjcbs-change-log.xml", new ClassLoaderResourceAccessor(), liquidDb);

		liquidBase.update("LCL");
		liquidBase.forceReleaseLocks();
		
		conn.close();
	}
	
	private Connection getConnection() throws Exception {
		return DriverManager.getConnection(TJCBSDB.DB_URL);
	}

	public static void main(String[] args) throws Exception {
		log.info("main({})", Arrays.toString(args));
		
		final Injector injector = Guice.createInjector(new SchemaUpdaterModule());
		final SchemaUpdaterMain schemaUpdater = injector.getInstance(SchemaUpdaterMain.class);
		schemaUpdater.update();
	}
}
