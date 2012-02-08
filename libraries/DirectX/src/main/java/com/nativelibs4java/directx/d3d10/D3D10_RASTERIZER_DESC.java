package com.nativelibs4java.directx.d3d10;
import com.nativelibs4java.directx.d3d10.D3d10Library.D3D10_CULL_MODE;
import com.nativelibs4java.directx.d3d10.D3d10Library.D3D10_FILL_MODE;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ValuedEnum;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * <i>native declaration : d3d10.h:276</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("d3d10") 
public class D3D10_RASTERIZER_DESC extends StructObject {
	/// C type : D3D10_FILL_MODE
	@Field(0) 
	public ValuedEnum<D3D10_FILL_MODE > FillMode() {
		return this.io.getEnumField(this, 0);
	}
	/// C type : D3D10_FILL_MODE
	@Field(0) 
	public D3D10_RASTERIZER_DESC FillMode(ValuedEnum<D3D10_FILL_MODE > FillMode) {
		this.io.setEnumField(this, 0, FillMode);
		return this;
	}
	/// C type : D3D10_CULL_MODE
	@Field(1) 
	public ValuedEnum<D3D10_CULL_MODE > CullMode() {
		return this.io.getEnumField(this, 1);
	}
	/// C type : D3D10_CULL_MODE
	@Field(1) 
	public D3D10_RASTERIZER_DESC CullMode(ValuedEnum<D3D10_CULL_MODE > CullMode) {
		this.io.setEnumField(this, 1, CullMode);
		return this;
	}
	@Field(2) 
	public int FrontCounterClockwise() {
		return this.io.getIntField(this, 2);
	}
	@Field(2) 
	public D3D10_RASTERIZER_DESC FrontCounterClockwise(int FrontCounterClockwise) {
		this.io.setIntField(this, 2, FrontCounterClockwise);
		return this;
	}
	@Field(3) 
	public int DepthBias() {
		return this.io.getIntField(this, 3);
	}
	@Field(3) 
	public D3D10_RASTERIZER_DESC DepthBias(int DepthBias) {
		this.io.setIntField(this, 3, DepthBias);
		return this;
	}
	@Field(4) 
	public float DepthBiasClamp() {
		return this.io.getFloatField(this, 4);
	}
	@Field(4) 
	public D3D10_RASTERIZER_DESC DepthBiasClamp(float DepthBiasClamp) {
		this.io.setFloatField(this, 4, DepthBiasClamp);
		return this;
	}
	@Field(5) 
	public float SlopeScaledDepthBias() {
		return this.io.getFloatField(this, 5);
	}
	@Field(5) 
	public D3D10_RASTERIZER_DESC SlopeScaledDepthBias(float SlopeScaledDepthBias) {
		this.io.setFloatField(this, 5, SlopeScaledDepthBias);
		return this;
	}
	@Field(6) 
	public int DepthClipEnable() {
		return this.io.getIntField(this, 6);
	}
	@Field(6) 
	public D3D10_RASTERIZER_DESC DepthClipEnable(int DepthClipEnable) {
		this.io.setIntField(this, 6, DepthClipEnable);
		return this;
	}
	@Field(7) 
	public int ScissorEnable() {
		return this.io.getIntField(this, 7);
	}
	@Field(7) 
	public D3D10_RASTERIZER_DESC ScissorEnable(int ScissorEnable) {
		this.io.setIntField(this, 7, ScissorEnable);
		return this;
	}
	@Field(8) 
	public int MultisampleEnable() {
		return this.io.getIntField(this, 8);
	}
	@Field(8) 
	public D3D10_RASTERIZER_DESC MultisampleEnable(int MultisampleEnable) {
		this.io.setIntField(this, 8, MultisampleEnable);
		return this;
	}
	@Field(9) 
	public int AntialiasedLineEnable() {
		return this.io.getIntField(this, 9);
	}
	@Field(9) 
	public D3D10_RASTERIZER_DESC AntialiasedLineEnable(int AntialiasedLineEnable) {
		this.io.setIntField(this, 9, AntialiasedLineEnable);
		return this;
	}
}
