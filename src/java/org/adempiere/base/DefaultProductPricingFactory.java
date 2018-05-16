package org.adempiere.base;

import org.compiere.impl.MProductPricing;
import org.compiere.product.IProductPricingFactory;

public class DefaultProductPricingFactory implements IProductPricingFactory {
	
	/**
	 * default constructor 
	 */
	public DefaultProductPricingFactory() {
	}

	@Override
	public AbstractProductPricing newProductPricingInstance() {
		return new MProductPricing();
	}

}

