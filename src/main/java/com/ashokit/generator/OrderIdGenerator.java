package com.ashokit.generator;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

public class OrderIdGenerator implements IdentifierGenerator {

	@Override
	public Object generate(SharedSessionContractImplementor session, Object object) throws HibernateException {
		String prefix = "kloc";
		String suffix = "";
		try {
		
			Connection con= (Connection) session.getJdbcConnectionAccess();
	Statement stmt=	con.createStatement();
		String sql="select order_id_seq.nextval from dual";
	
    ResultSet rs=	  stmt.executeQuery(sql);
		if(rs.next()) {
			int seqval =rs.getInt(1);
			suffix = String.valueOf(seqval);
		}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return prefix+suffix;
	}

}
