///*
// * Decompiled with CFR.
// *
// * Could not load the following classes:
// *  com.sign.test.service.Service
// */
//package com.sign.test.test;
//
//import com.sign.test.service.Service;
//import java.lang.reflect.InvocationHandler;
//import java.lang.reflect.Method;
//import java.lang.reflect.Proxy;
//import java.lang.reflect.UndeclaredThrowableException;
//import org.aopalliance.aop.Advice;
//import org.springframework.aop.Advisor;
//import org.springframework.aop.SpringProxy;
//import org.springframework.aop.TargetSource;
//import org.springframework.aop.framework.Advised;
//import org.springframework.aop.framework.AopConfigException;
//import org.springframework.core.DecoratingProxy;
//
//public final class $Proxy18
//		extends Proxy
//		implements Service,
//		SpringProxy,
//		Advised,
//		DecoratingProxy {
//	private static Method m1;
//	private static Method m9;
//	private static Method m19;
//	private static Method m16;
//	private static Method m3;
//	private static Method m10;
//	private static Method m6;
//	private static Method m15;
//	private static Method m24;
//	private static Method m22;
//	private static Method m21;
//	private static Method m0;
//	private static Method m7;
//	private static Method m13;
//	private static Method m18;
//	private static Method m4;
//	private static Method m2;
//	private static Method m26;
//	private static Method m8;
//	private static Method m27;
//	private static Method m11;
//	private static Method m23;
//	private static Method m25;
//	private static Method m12;
//	private static Method m17;
//	private static Method m14;
//	private static Method m20;
//	private static Method m5;
//
//	public final void setTargetSource(TargetSource targetSource) {
//		try {
//			this.h.invoke(this, m4, new Object[]{targetSource});
//			return;
//		}
//		catch (Error | RuntimeException throwable) {
//			throw throwable;
//		}
//		catch (Throwable throwable) {
//			throw new UndeclaredThrowableException(throwable);
//		}
//	}
//
//	public final Class getTargetClass() {
//		try {
//			return (Class)this.h.invoke(this, m26, null);
//		}
//		catch (Error | RuntimeException throwable) {
//			throw throwable;
//		}
//		catch (Throwable throwable) {
//			throw new UndeclaredThrowableException(throwable);
//		}
//	}
//
//	public final boolean isPreFiltered() {
//		try {
//			return (Boolean)this.h.invoke(this, m5, null);
//		}
//		catch (Error | RuntimeException throwable) {
//			throw throwable;
//		}
//		catch (Throwable throwable) {
//			throw new UndeclaredThrowableException(throwable);
//		}
//	}
//
//	public final Class[] getProxiedInterfaces() {
//		try {
//			return (Class[])this.h.invoke(this, m6, null);
//		}
//		catch (Error | RuntimeException throwable) {
//			throw throwable;
//		}
//		catch (Throwable throwable) {
//			throw new UndeclaredThrowableException(throwable);
//		}
//	}
//
//	public final boolean isInterfaceProxied(Class class_) {
//		try {
//			return (Boolean)this.h.invoke(this, m7, new Object[]{class_});
//		}
//		catch (Error | RuntimeException throwable) {
//			throw throwable;
//		}
//		catch (Throwable throwable) {
//			throw new UndeclaredThrowableException(throwable);
//		}
//	}
//
//	public final void addAdvisor(int n, Advisor advisor) throws AopConfigException {
//		try {
//			this.h.invoke(this, m8, new Object[]{n, advisor});
//			return;
//		}
//		catch (Error | RuntimeException throwable) {
//			throw throwable;
//		}
//		catch (Throwable throwable) {
//			throw new UndeclaredThrowableException(throwable);
//		}
//	}
//
//	public final void addAdvisor(Advisor advisor) throws AopConfigException {
//		try {
//			this.h.invoke(this, m9, new Object[]{advisor});
//			return;
//		}
//		catch (Error | RuntimeException throwable) {
//			throw throwable;
//		}
//		catch (Throwable throwable) {
//			throw new UndeclaredThrowableException(throwable);
//		}
//	}
//
//	public final boolean removeAdvisor(Advisor advisor) {
//		try {
//			return (Boolean)this.h.invoke(this, m11, new Object[]{advisor});
//		}
//		catch (Error | RuntimeException throwable) {
//			throw throwable;
//		}
//		catch (Throwable throwable) {
//			throw new UndeclaredThrowableException(throwable);
//		}
//	}
//
//	public final void removeAdvisor(int n) throws AopConfigException {
//		try {
//			this.h.invoke(this, m10, new Object[]{n});
//			return;
//		}
//		catch (Error | RuntimeException throwable) {
//			throw throwable;
//		}
//		catch (Throwable throwable) {
//			throw new UndeclaredThrowableException(throwable);
//		}
//	}
//
//	public final boolean replaceAdvisor(Advisor advisor, Advisor advisor2) throws AopConfigException {
//		try {
//			return (Boolean)this.h.invoke(this, m12, new Object[]{advisor, advisor2});
//		}
//		catch (Error | RuntimeException throwable) {
//			throw throwable;
//		}
//		catch (Throwable throwable) {
//			throw new UndeclaredThrowableException(throwable);
//		}
//	}
//
//	public final boolean removeAdvice(Advice advice) {
//		try {
//			return (Boolean)this.h.invoke(this, m13, new Object[]{advice});
//		}
//		catch (Error | RuntimeException throwable) {
//			throw throwable;
//		}
//		catch (Throwable throwable) {
//			throw new UndeclaredThrowableException(throwable);
//		}
//	}
//
//	public final String toProxyConfigString() {
//		try {
//			return (String)this.h.invoke(this, m14, null);
//		}
//		catch (Error | RuntimeException throwable) {
//			throw throwable;
//		}
//		catch (Throwable throwable) {
//			throw new UndeclaredThrowableException(throwable);
//		}
//	}
//
//	public final Class getDecoratedClass() {
//		try {
//			return (Class)this.h.invoke(this, m27, null);
//		}
//		catch (Error | RuntimeException throwable) {
//			throw throwable;
//		}
//		catch (Throwable throwable) {
//			throw new UndeclaredThrowableException(throwable);
//		}
//	}
//
//	public final TargetSource getTargetSource() {
//		try {
//			return (TargetSource)this.h.invoke(this, m15, null);
//		}
//		catch (Error | RuntimeException throwable) {
//			throw throwable;
//		}
//		catch (Throwable throwable) {
//			throw new UndeclaredThrowableException(throwable);
//		}
//	}
//
//	public final boolean isProxyTargetClass() {
//		try {
//			return (Boolean)this.h.invoke(this, m16, null);
//		}
//		catch (Error | RuntimeException throwable) {
//			throw throwable;
//		}
//		catch (Throwable throwable) {
//			throw new UndeclaredThrowableException(throwable);
//		}
//	}
//
//	public final void setPreFiltered(boolean bl) {
//		try {
//			this.h.invoke(this, m17, new Object[]{bl});
//			return;
//		}
//		catch (Error | RuntimeException throwable) {
//			throw throwable;
//		}
//		catch (Throwable throwable) {
//			throw new UndeclaredThrowableException(throwable);
//		}
//	}
//
//	public final void setExposeProxy(boolean bl) {
//		try {
//			this.h.invoke(this, m18, new Object[]{bl});
//			return;
//		}
//		catch (Error | RuntimeException throwable) {
//			throw throwable;
//		}
//		catch (Throwable throwable) {
//			throw new UndeclaredThrowableException(throwable);
//		}
//	}
//
//	public final boolean isExposeProxy() {
//		try {
//			return (Boolean)this.h.invoke(this, m19, null);
//		}
//		catch (Error | RuntimeException throwable) {
//			throw throwable;
//		}
//		catch (Throwable throwable) {
//			throw new UndeclaredThrowableException(throwable);
//		}
//	}
//
//	public final Advisor[] getAdvisors() {
//		try {
//			return (Advisor[])this.h.invoke(this, m20, null);
//		}
//		catch (Error | RuntimeException throwable) {
//			throw throwable;
//		}
//		catch (Throwable throwable) {
//			throw new UndeclaredThrowableException(throwable);
//		}
//	}
//
//	public final void addAdvice(int n, Advice advice) throws AopConfigException {
//		try {
//			this.h.invoke(this, m22, new Object[]{n, advice});
//			return;
//		}
//		catch (Error | RuntimeException throwable) {
//			throw throwable;
//		}
//		catch (Throwable throwable) {
//			throw new UndeclaredThrowableException(throwable);
//		}
//	}
//
//	public final void addAdvice(Advice advice) throws AopConfigException {
//		try {
//			this.h.invoke(this, m21, new Object[]{advice});
//			return;
//		}
//		catch (Error | RuntimeException throwable) {
//			throw throwable;
//		}
//		catch (Throwable throwable) {
//			throw new UndeclaredThrowableException(throwable);
//		}
//	}
//
//	public $Proxy18(InvocationHandler invocationHandler) {
//		super(invocationHandler);
//	}
//
//	static {
//		try {
//			m1 = Class.forName("java.lang.Object").getMethod("equals", Class.forName("java.lang.Object"));
//			m9 = Class.forName("org.springframework.aop.framework.Advised").getMethod("addAdvisor", Class.forName("org.springframework.aop.Advisor"));
//			m19 = Class.forName("org.springframework.aop.framework.Advised").getMethod("isExposeProxy", new Class[0]);
//			m16 = Class.forName("org.springframework.aop.framework.Advised").getMethod("isProxyTargetClass", new Class[0]);
//			m3 = Class.forName("com.sign.test.service.Service").getMethod("query", new Class[0]);
//			m10 = Class.forName("org.springframework.aop.framework.Advised").getMethod("removeAdvisor", Integer.TYPE);
//			m6 = Class.forName("org.springframework.aop.framework.Advised").getMethod("getProxiedInterfaces", new Class[0]);
//			m15 = Class.forName("org.springframework.aop.framework.Advised").getMethod("getTargetSource", new Class[0]);
//			m24 = Class.forName("org.springframework.aop.framework.Advised").getMethod("indexOf", Class.forName("org.springframework.aop.Advisor"));
//			m22 = Class.forName("org.springframework.aop.framework.Advised").getMethod("addAdvice", Integer.TYPE, Class.forName("org.aopalliance.aop.Advice"));
//			m21 = Class.forName("org.springframework.aop.framework.Advised").getMethod("addAdvice", Class.forName("org.aopalliance.aop.Advice"));
//			m0 = Class.forName("java.lang.Object").getMethod("hashCode", new Class[0]);
//			m7 = Class.forName("org.springframework.aop.framework.Advised").getMethod("isInterfaceProxied", Class.forName("java.lang.Class"));
//			m13 = Class.forName("org.springframework.aop.framework.Advised").getMethod("removeAdvice", Class.forName("org.aopalliance.aop.Advice"));
//			m18 = Class.forName("org.springframework.aop.framework.Advised").getMethod("setExposeProxy", Boolean.TYPE);
//			m4 = Class.forName("org.springframework.aop.framework.Advised").getMethod("setTargetSource", Class.forName("org.springframework.aop.TargetSource"));
//			m2 = Class.forName("java.lang.Object").getMethod("toString", new Class[0]);
//			m26 = Class.forName("org.springframework.aop.framework.Advised").getMethod("getTargetClass", new Class[0]);
//			m8 = Class.forName("org.springframework.aop.framework.Advised").getMethod("addAdvisor", Integer.TYPE, Class.forName("org.springframework.aop.Advisor"));
//			m27 = Class.forName("org.springframework.core.DecoratingProxy").getMethod("getDecoratedClass", new Class[0]);
//			m11 = Class.forName("org.springframework.aop.framework.Advised").getMethod("removeAdvisor", Class.forName("org.springframework.aop.Advisor"));
//			m23 = Class.forName("org.springframework.aop.framework.Advised").getMethod("indexOf", Class.forName("org.aopalliance.aop.Advice"));
//			m25 = Class.forName("org.springframework.aop.framework.Advised").getMethod("isFrozen", new Class[0]);
//			m12 = Class.forName("org.springframework.aop.framework.Advised").getMethod("replaceAdvisor", Class.forName("org.springframework.aop.Advisor"), Class.forName("org.springframework.aop.Advisor"));
//			m17 = Class.forName("org.springframework.aop.framework.Advised").getMethod("setPreFiltered", Boolean.TYPE);
//			m14 = Class.forName("org.springframework.aop.framework.Advised").getMethod("toProxyConfigString", new Class[0]);
//			m20 = Class.forName("org.springframework.aop.framework.Advised").getMethod("getAdvisors", new Class[0]);
//			m5 = Class.forName("org.springframework.aop.framework.Advised").getMethod("isPreFiltered", new Class[0]);
//			return;
//		}
//		catch (NoSuchMethodException noSuchMethodException) {
//			throw new NoSuchMethodError(noSuchMethodException.getMessage());
//		}
//		catch (ClassNotFoundException classNotFoundException) {
//			throw new NoClassDefFoundError(classNotFoundException.getMessage());
//		}
//	}
//
//	public final boolean equals(Object object) {
//		try {
//			return (Boolean)this.h.invoke(this, m1, new Object[]{object});
//		}
//		catch (Error | RuntimeException throwable) {
//			throw throwable;
//		}
//		catch (Throwable throwable) {
//			throw new UndeclaredThrowableException(throwable);
//		}
//	}
//
//	public final String toString() {
//		try {
//			return (String)this.h.invoke(this, m2, null);
//		}
//		catch (Error | RuntimeException throwable) {
//			throw throwable;
//		}
//		catch (Throwable throwable) {
//			throw new UndeclaredThrowableException(throwable);
//		}
//	}
//
//	public final int hashCode() {
//		try {
//			return (Integer)this.h.invoke(this, m0, null);
//		}
//		catch (Error | RuntimeException throwable) {
//			throw throwable;
//		}
//		catch (Throwable throwable) {
//			throw new UndeclaredThrowableException(throwable);
//		}
//	}
//
//	public final int indexOf(Advisor advisor) {
//		try {
//			return (Integer)this.h.invoke(this, m24, new Object[]{advisor});
//		}
//		catch (Error | RuntimeException throwable) {
//			throw throwable;
//		}
//		catch (Throwable throwable) {
//			throw new UndeclaredThrowableException(throwable);
//		}
//	}
//
//	public final int indexOf(Advice advice) {
//		try {
//			return (Integer)this.h.invoke(this, m23, new Object[]{advice});
//		}
//		catch (Error | RuntimeException throwable) {
//			throw throwable;
//		}
//		catch (Throwable throwable) {
//			throw new UndeclaredThrowableException(throwable);
//		}
//	}
//
//	public final boolean isFrozen() {
//		try {
//			return (Boolean)this.h.invoke(this, m25, null);
//		}
//		catch (Error | RuntimeException throwable) {
//			throw throwable;
//		}
//		catch (Throwable throwable) {
//			throw new UndeclaredThrowableException(throwable);
//		}
//	}
//
//	public final void query() {
//		try {
//			this.h.invoke(this, m3, null);
//			return;
//		}
//		catch (Error | RuntimeException throwable) {
//			throw throwable;
//		}
//		catch (Throwable throwable) {
//			throw new UndeclaredThrowableException(throwable);
//		}
//	}
//}