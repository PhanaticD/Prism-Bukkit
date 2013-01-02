package me.botsko.prism.actions;

import me.botsko.prism.actiontypes.ActionType;

public interface Action {
	
	
	/**
	 * 
	 * @return
	 */
	public String getAction_time();
	
	
	/**
	 * 
	 * @return
	 */
	public ActionType getType();
	
	
	/**
	 * 
	 * @return
	 */
	public String getWorld_name();
	
	
	/**
	 * 
	 * @return
	 */
	public String getPlayer_name();
	
	
	/**
	 * 
	 * @return
	 */
	public double getX();
	
	
	/**
	 * 
	 * @return
	 */
	public double getY();
	
	
	/**
	 * 
	 * @return
	 */
	public double getZ();
	
	
	/**
	 * 
	 * @return
	 */
	public String getData();

	
	/**
	 * 
	 * @return
	 */
	public String getDisplay_date();


	/**
	 * 
	 * @return
	 */
	public String getDisplay_time();


	/**
	 * 
	 * @return
	 */
	public int getId();
	
	
	/**
	 * 
	 * @return
	 */
	public String getNiceName();
	
}