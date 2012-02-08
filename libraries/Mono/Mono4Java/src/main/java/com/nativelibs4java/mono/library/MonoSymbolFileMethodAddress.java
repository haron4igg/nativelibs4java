package com.nativelibs4java.mono.library;
/**
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a>, <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class MonoSymbolFileMethodAddress extends com.ochafik.lang.jnaerator.runtime.Structure<MonoSymbolFileMethodAddress, MonoSymbolFileMethodAddress.ByValue, MonoSymbolFileMethodAddress.ByReference> {
	public int size;
	/// C type : const char*
	public com.sun.jna.Pointer start_address;
	/// C type : const char*
	public com.sun.jna.Pointer end_address;
	/// C type : const char*
	public com.sun.jna.Pointer method_start_address;
	/// C type : const char*
	public com.sun.jna.Pointer method_end_address;
	/// C type : const char*
	public com.sun.jna.Pointer wrapper_address;
	public int has_this;
	public int num_params;
	public int variable_table_offset;
	public int type_table_offset;
	public int num_line_numbers;
	public int line_number_offset;
	/// C type : char[1]
	public byte[] data = new byte[(1)];
	public MonoSymbolFileMethodAddress() {
		super();
	}
	protected ByReference newByReference() { return new ByReference(); }
	protected ByValue newByValue() { return new ByValue(); }
	protected MonoSymbolFileMethodAddress newInstance() { return new MonoSymbolFileMethodAddress(); }
	public static MonoSymbolFileMethodAddress[] newArray(int arrayLength) {
		return com.ochafik.lang.jnaerator.runtime.Structure.newArray(MonoSymbolFileMethodAddress.class, arrayLength);
	}
	public static class ByReference extends MonoSymbolFileMethodAddress implements com.sun.jna.Structure.ByReference {}
	public static class ByValue extends MonoSymbolFileMethodAddress implements com.sun.jna.Structure.ByValue {}
}
