/*
 * MCDocs by Tazzernator 
 * (Andrew Tajsic ~ atajsicDesigns ~ http://atajsic.com)
 * 
 * THIS PLUGIN IS LICENSED UNDER THE WTFPL - (Do What The Fuck You Want To Public License)
 * 
 * This program is free software. It comes without any warranty, to
 * the extent permitted by applicable law. You can redistribute it
 * and/or modify it under the terms of the Do What The Fuck You Want
 * To Public License, Version 2, as published by Sam Hocevar. See
 * http://sam.zoy.org/wtfpl/COPYING for more details.
 * 
 * TERMS AND CONDITIONS FOR COPYING, DISTRIBUTION AND MODIFICATION
 *   
 * 0. You just DO WHAT THE FUCK YOU WANT TO.
 *   
 * */

package com.tazzernator.bukkit.mcdocs;

public class MCDocsPlayerJoin {
	
	protected String message;
	protected String group;
	protected String playerName;
	
	public MCDocsPlayerJoin(String message, String group, String playerName){
		this.message = (message != null) ? message : "";
		this.group = (group != null) ? group : "";
		this.playerName = (playerName != null) ? playerName : "";
	}
	
	public String getMessage(){
		return message;
	}
	
	public String getGroup(){
		return group;
	}
	
	public String getPlayerName(){
		return playerName;
	}
}