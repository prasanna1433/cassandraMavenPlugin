/**
 * Created by p0s00gu on 4/26/17.
 */


import com.datastax.driver.core.*;
import org.junit.Test;
import org.junit.Before;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class CassandraTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(CassandraTest.class);
    public static Cluster cluster;
    Session session=null;

    @Before
    public void loadData() {
        cluster = com.datastax.driver.core.Cluster.builder()
                .addContactPoints("127.0.0.1")
                .withPort(Integer.valueOf("9042"))
                .build();
        session=cluster.connect("inventory");

    }


    @Test
    public void generateMessages1(){
        //KeyspaceMetadata keyspaceCql = cluster.getMetadata().getKeyspace("\"inventory\"");
        session.execute("select * from inventory.emp;");
    }
}
