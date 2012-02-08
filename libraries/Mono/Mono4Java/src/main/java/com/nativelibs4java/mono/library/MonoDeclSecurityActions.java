package com.nativelibs4java.mono.library;
/**
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a>, <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class MonoDeclSecurityActions extends com.ochafik.lang.jnaerator.runtime.Structure<MonoDeclSecurityActions, MonoDeclSecurityActions.ByValue, MonoDeclSecurityActions.ByReference> {
	/// C type : MonoDeclSecurityEntry
	public com.nativelibs4java.mono.library.MonoDeclSecurityEntry demand;
	/// C type : MonoDeclSecurityEntry
	public com.nativelibs4java.mono.library.MonoDeclSecurityEntry noncasdemand;
	/// C type : MonoDeclSecurityEntry
	public com.nativelibs4java.mono.library.MonoDeclSecurityEntry demandchoice;
	public MonoDeclSecurityActions() {
		super();
	}
	/**
	 * @param demand C type : MonoDeclSecurityEntry<br>
	 * @param noncasdemand C type : MonoDeclSecurityEntry<br>
	 * @param demandchoice C type : MonoDeclSecurityEntry
	 */
	public MonoDeclSecurityActions(com.nativelibs4java.mono.library.MonoDeclSecurityEntry demand, com.nativelibs4java.mono.library.MonoDeclSecurityEntry noncasdemand, com.nativelibs4java.mono.library.MonoDeclSecurityEntry demandchoice) {
		super();
		this.demand = demand;
		this.noncasdemand = noncasdemand;
		this.demandchoice = demandchoice;
	}
	protected ByReference newByReference() { return new ByReference(); }
	protected ByValue newByValue() { return new ByValue(); }
	protected MonoDeclSecurityActions newInstance() { return new MonoDeclSecurityActions(); }
	public static MonoDeclSecurityActions[] newArray(int arrayLength) {
		return com.ochafik.lang.jnaerator.runtime.Structure.newArray(MonoDeclSecurityActions.class, arrayLength);
	}
	public static class ByReference extends MonoDeclSecurityActions implements com.sun.jna.Structure.ByReference {}
	public static class ByValue extends MonoDeclSecurityActions implements com.sun.jna.Structure.ByValue {}
}
