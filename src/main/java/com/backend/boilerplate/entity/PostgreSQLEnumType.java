package com.backend.boilerplate.entity;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Types;

/**
 * @author sarvesh
 * @version 0.0.1
 * @since 0.0.1
 */
@SuppressWarnings("squid:S3740")
public class PostgreSQLEnumType extends org.hibernate.type.EnumType {

    @SuppressWarnings("squid:RedundantThrowsDeclarationCheck")
    @Override
    public void nullSafeSet(PreparedStatement st, Object value, int index, SharedSessionContractImplementor session)
        throws HibernateException, SQLException {
        if (value == null) {
            st.setNull(index, Types.OTHER);
        } else {
            st.setObject(index, value.toString(), Types.OTHER);
        }
    }
}