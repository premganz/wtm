package org.spo.svc3.trx.pgs.mas01.cmd;

public class WA01T 
{
	private String list_pagination_link;

	private String section_list_heading;

	private String page_sub_title;

	private String page_id;

	private String page_content_text;

	private String list_pagination_txt;

	private SECTION_FEED_ZN[] SECTION_FEED_ZN;

	private String list_pagination_ic;

	private String page_title;

	public String getList_pagination_link ()
	{
		return list_pagination_link;
	}

	public void setList_pagination_link (String list_pagination_link)
	{
		this.list_pagination_link = list_pagination_link;
	}

	public String getSection_list_heading ()
	{
		return section_list_heading;
	}

	public void setSection_list_heading (String section_list_heading)
	{
		this.section_list_heading = section_list_heading;
	}

	public String getPage_sub_title ()
	{
		return page_sub_title;
	}

	public void setPage_sub_title (String page_sub_title)
	{
		this.page_sub_title = page_sub_title;
	}

	public String getPage_id ()
	{
		return page_id;
	}

	public void setPage_id (String page_id)
	{
		this.page_id = page_id;
	}

	public String getPage_content_text ()
	{
		return page_content_text;
	}

	public void setPage_content_text (String page_content_text)
	{
		this.page_content_text = page_content_text;
	}

	public String getList_pagination_txt ()
	{
		return list_pagination_txt;
	}

	public void setList_pagination_txt (String list_pagination_txt)
	{
		this.list_pagination_txt = list_pagination_txt;
	}

	public SECTION_FEED_ZN[] getSECTION_FEED_ZN ()
	{
		return SECTION_FEED_ZN;
	}

	public void setSECTION_FEED_ZN (SECTION_FEED_ZN[] SECTION_FEED_ZN)
	{
		this.SECTION_FEED_ZN = SECTION_FEED_ZN;
	}

	public String getList_pagination_ic ()
	{
		return list_pagination_ic;
	}

	public void setList_pagination_ic (String list_pagination_ic)
	{
		this.list_pagination_ic = list_pagination_ic;
	}

	public String getPage_title ()
	{
		return page_title;
	}

	public void setPage_title (String page_title)
	{
		this.page_title = page_title;
	}

	@Override
	public String toString()
	{
		return "ClassPojo [list_pagination_link = "+list_pagination_link+", section_list_heading = "+section_list_heading+", page_sub_title = "+page_sub_title+", page_id = "+page_id+", page_content_text = "+page_content_text+", list_pagination_txt = "+list_pagination_txt+", SECTION_FEED_ZN = "+SECTION_FEED_ZN+", list_pagination_ic = "+list_pagination_ic+", page_title = "+page_title+"]";
	}
}



class SECTION_FEED_ZN
{
	private String id;

	private String meta_date;

	private String brief_content;

	private String cover_media_type_cd;

	private String cover_media_url;

	private String likes;

	private String meta_tags;

	private String meta_author;

	public String getId ()
	{
		return id;
	}

	public void setId (String id)
	{
		this.id = id;
	}

	public String getMeta_date ()
	{
		return meta_date;
	}

	public void setMeta_date (String meta_date)
	{
		this.meta_date = meta_date;
	}

	public String getBrief_content ()
	{
		return brief_content;
	}

	public void setBrief_content (String brief_content)
	{
		this.brief_content = brief_content;
	}

	public String getCover_media_type_cd ()
	{
		return cover_media_type_cd;
	}

	public void setCover_media_type_cd (String cover_media_type_cd)
	{
		this.cover_media_type_cd = cover_media_type_cd;
	}

	public String getCover_media_url ()
	{
		return cover_media_url;
	}

	public void setCover_media_url (String cover_media_url)
	{
		this.cover_media_url = cover_media_url;
	}

	public String getLikes ()
	{
		return likes;
	}

	public void setLikes (String likes)
	{
		this.likes = likes;
	}

	public String getMeta_tags ()
	{
		return meta_tags;
	}

	public void setMeta_tags (String meta_tags)
	{
		this.meta_tags = meta_tags;
	}

	public String getMeta_author ()
	{
		return meta_author;
	}

	public void setMeta_author (String meta_author)
	{
		this.meta_author = meta_author;
	}

	@Override
	public String toString()
	{
		return "ClassPojo [id = "+id+", meta_date = "+meta_date+", brief_content = "+brief_content+", cover_media_type_cd = "+cover_media_type_cd+", cover_media_url = "+cover_media_url+", likes = "+likes+", meta_tags = "+meta_tags+", meta_author = "+meta_author+"]";
	}
}


