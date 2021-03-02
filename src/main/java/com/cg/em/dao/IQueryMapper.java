package com.cg.em.dao;

public interface IQueryMapper {
	public static final String ADD_Event_QRY = 
			"INSERT INTO event(eventId,  eventTitle, eventLocation, dateSheduled, eventCost) VALUES(?,?,?,?,?)";
	public static final String MODIFY_Event_QRY = 
			"UPDATE event SET eventTitle=?,eventLocation=?,dateSheduled=?,eventCost WHERE eventId=?";
	public static final String DEL_Event_QRY = 
			"DELETE FROM event WHERE eventId=?";
	public static final String GET_ALL_Events_QRY = 
			"SELECT * FROM event";
	public static final String GET_Event_QRY = 
			"SELECT * FROM event WHERE eventLocation=?"
			+ "ORDER BY eventLocation DESC";
	public static final String GET_Event_By_Date =
			"SELECT * FROM , GROUP BY dateSheduled DESC ";
			

}
