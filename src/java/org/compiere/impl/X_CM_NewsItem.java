/******************************************************************************
 * Product: iDempiere ERP & CRM Smart Business Solution                       *
 * Copyright (C) 1999-2012 ComPiere, Inc. All Rights Reserved.                *
 * This program is free software, you can redistribute it and/or modify it    *
 * under the terms version 2 of the GNU General Public License as published   *
 * by the Free Software Foundation. This program is distributed in the hope   *
 * that it will be useful, but WITHOUT ANY WARRANTY, without even the implied *
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.           *
 * See the GNU General Public License for more details.                       *
 * You should have received a copy of the GNU General Public License along    *
 * with this program, if not, write to the Free Software Foundation, Inc.,    *
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.                     *
 * For the text or an alternative of this public license, you may reach us    *
 * ComPiere, Inc., 2620 Augustine Dr. #245, Santa Clara, CA 95054, USA        *
 * or via info@compiere.org or http://www.idempiere.org/license.html           *
 *****************************************************************************/
/** Generated Model - DO NOT CHANGE */
package org.compiere.impl;

import org.compiere.model.I_CM_NewsItem;
import org.compiere.model.I_Persistent;

import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.Properties;

/** Generated Model for CM_NewsItem
 *  @author iDempiere (generated) 
 *  @version Release 5.1 - $Id$ */
public class X_CM_NewsItem extends PO implements I_CM_NewsItem, I_Persistent
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20171031L;

    /** Standard Constructor */
    public X_CM_NewsItem (Properties ctx, int CM_NewsItem_ID, String trxName)
    {
      super (ctx, CM_NewsItem_ID, trxName);
      /** if (CM_NewsItem_ID == 0)
        {
			setCM_NewsChannel_ID (0);
			setCM_NewsItem_ID (0);
        } */
    }

    /** Load Constructor */
    public X_CM_NewsItem (Properties ctx, ResultSet rs, String trxName)
    {
      super (ctx, rs, trxName);
    }

    /** AccessLevel
      * @return 6 - System - Client 
      */
    protected int get_AccessLevel()
    {
      return accessLevel.intValue();
    }

    /** Load Meta Data */
    protected POInfo initPO (Properties ctx)
    {
      POInfo poi = POInfo.getPOInfo (ctx, Table_ID, get_TrxName());
      return poi;
    }

    public String toString()
    {
      StringBuffer sb = new StringBuffer ("X_CM_NewsItem[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set Author.
		@param Author 
		Author/Creator of the Entity
	  */
	public void setAuthor (String Author)
	{
		set_Value (COLUMNNAME_Author, Author);
	}

	/** Get Author.
		@return Author/Creator of the Entity
	  */
	public String getAuthor () 
	{
		return (String)get_Value(COLUMNNAME_Author);
	}

	public org.compiere.model.I_CM_NewsChannel getCM_NewsChannel() throws RuntimeException
    {
		return (org.compiere.model.I_CM_NewsChannel)MTable.get(getCtx(), org.compiere.model.I_CM_NewsChannel.Table_Name)
			.getPO(getCM_NewsChannel_ID(), get_TrxName());	}

	/** Set News Channel.
		@param CM_NewsChannel_ID 
		News channel for rss feed
	  */
	public void setCM_NewsChannel_ID (int CM_NewsChannel_ID)
	{
		if (CM_NewsChannel_ID < 1) 
			set_Value (COLUMNNAME_CM_NewsChannel_ID, null);
		else 
			set_Value (COLUMNNAME_CM_NewsChannel_ID, Integer.valueOf(CM_NewsChannel_ID));
	}

	/** Get News Channel.
		@return News channel for rss feed
	  */
	public int getCM_NewsChannel_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_CM_NewsChannel_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set News Item / Article.
		@param CM_NewsItem_ID 
		News item or article defines base content
	  */
	public void setCM_NewsItem_ID (int CM_NewsItem_ID)
	{
		if (CM_NewsItem_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_CM_NewsItem_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_CM_NewsItem_ID, Integer.valueOf(CM_NewsItem_ID));
	}

	/** Get News Item / Article.
		@return News item or article defines base content
	  */
	public int getCM_NewsItem_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_CM_NewsItem_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set CM_NewsItem_UU.
		@param CM_NewsItem_UU CM_NewsItem_UU	  */
	public void setCM_NewsItem_UU (String CM_NewsItem_UU)
	{
		set_Value (COLUMNNAME_CM_NewsItem_UU, CM_NewsItem_UU);
	}

	/** Get CM_NewsItem_UU.
		@return CM_NewsItem_UU	  */
	public String getCM_NewsItem_UU () 
	{
		return (String)get_Value(COLUMNNAME_CM_NewsItem_UU);
	}

	/** Set Content HTML.
		@param ContentHTML 
		Contains the content itself
	  */
	public void setContentHTML (String ContentHTML)
	{
		set_Value (COLUMNNAME_ContentHTML, ContentHTML);
	}

	/** Get Content HTML.
		@return Contains the content itself
	  */
	public String getContentHTML () 
	{
		return (String)get_Value(COLUMNNAME_ContentHTML);
	}

	/** Set Description.
		@param Description 
		Optional short description of the record
	  */
	public void setDescription (String Description)
	{
		set_Value (COLUMNNAME_Description, Description);
	}

	/** Get Description.
		@return Optional short description of the record
	  */
	public String getDescription () 
	{
		return (String)get_Value(COLUMNNAME_Description);
	}

	/** Set LinkURL.
		@param LinkURL 
		Contains URL to a target
	  */
	public void setLinkURL (String LinkURL)
	{
		set_Value (COLUMNNAME_LinkURL, LinkURL);
	}

	/** Get LinkURL.
		@return Contains URL to a target
	  */
	public String getLinkURL () 
	{
		return (String)get_Value(COLUMNNAME_LinkURL);
	}

	/** Set Publication Date.
		@param PubDate 
		Date on which this article will / should get published
	  */
	public void setPubDate (Timestamp PubDate)
	{
		set_Value (COLUMNNAME_PubDate, PubDate);
	}

	/** Get Publication Date.
		@return Date on which this article will / should get published
	  */
	public Timestamp getPubDate () 
	{
		return (Timestamp)get_Value(COLUMNNAME_PubDate);
	}

	/** Set Title.
		@param Title 
		Name this entity is referred to as
	  */
	public void setTitle (String Title)
	{
		set_Value (COLUMNNAME_Title, Title);
	}

	/** Get Title.
		@return Name this entity is referred to as
	  */
	public String getTitle () 
	{
		return (String)get_Value(COLUMNNAME_Title);
	}
}