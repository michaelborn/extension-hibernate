package org.opencfmlfoundation.extension.orm.hibernate.tuplizer;
import org.hibernate.EntityNameResolver;
import org.opencfmlfoundation.extension.orm.hibernate.HibernateCaster;
import org.opencfmlfoundation.extension.orm.hibernate.HibernatePageException;

import railo.runtime.Component;
import railo.runtime.exp.PageException;


public  class CFCEntityNameResolver implements EntityNameResolver {
	public static final CFCEntityNameResolver INSTANCE = new CFCEntityNameResolver();

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String resolveEntityName(Object entity) {
		try {
			Component cfc = HibernateCaster.toComponent(entity);
			return HibernateCaster.getEntityName(cfc);
		} catch (PageException pe) {
			//print.printST(e);
			throw new HibernatePageException(pe);
		}
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean equals(Object obj) {
		return getClass().equals( obj.getClass() );
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int hashCode() {
		return getClass().hashCode();
	}
}