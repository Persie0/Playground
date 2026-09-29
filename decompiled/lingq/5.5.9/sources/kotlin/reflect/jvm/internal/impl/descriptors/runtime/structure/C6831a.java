package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import cm.InterfaceC2052l;
import dm.C5207g;
import gn.InterfaceC5820a;
import gn.InterfaceC5827g;
import gn.InterfaceC5830j;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C6744b;
import kotlin.collections.EmptyList;
import kotlin.sequences.C7073a;
import mn.C7646c;
import mn.C7648e;
import p041c5.C1702c;
import p372rm.AbstractC8859q0;
import p385sf.C9000b;
import p491xm.AbstractC10238m;
import p491xm.C10227b;
import p491xm.C10236k;
import p491xm.C10247v;
import p491xm.C10249x;
import p491xm.InterfaceC10232g;
import p491xm.InterfaceC10244s;
import tl.C9325m;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C6831a extends AbstractC10238m implements InterfaceC10232g, InterfaceC10244s, InterfaceC5827g {

    /* JADX INFO: renamed from: a */
    public final Class<?> f38594a;

    public C6831a(Class<?> cls) {
        C5207g.m11111f(cls, "klass");
        this.f38594a = cls;
    }

    @Override // gn.InterfaceC5827g
    /* JADX INFO: renamed from: A */
    public final void mo12244A() {
    }

    @Override // gn.InterfaceC5827g
    /* JADX INFO: renamed from: B */
    public final List mo12245B() {
        Method[] declaredMethods = this.f38594a.getDeclaredMethods();
        C5207g.m11110e(declaredMethods, "klass.declaredMethods");
        return C9000b.m17255u(C7073a.m14267b3(C7073a.m14261V2(C7073a.m14255P2(C6744b.m13376h0(declaredMethods), new InterfaceC2052l<Method, Boolean>() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaClass$methods$1
            {
                super(1);
            }

            /* JADX WARN: Code duplicated, block: B:15:0x0052  */
            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final Boolean mo528n(Method method) {
                boolean zEquals;
                Method method2 = method;
                boolean z10 = false;
                if (!method2.isSynthetic()) {
                    if (this.f38592b.mo12246H()) {
                        String name = method2.getName();
                        if (C5207g.m11106a(name, "values")) {
                            Class<?>[] parameterTypes = method2.getParameterTypes();
                            C5207g.m11110e(parameterTypes, "method.parameterTypes");
                            if (parameterTypes.length == 0) {
                                zEquals = true;
                            } else {
                                zEquals = false;
                            }
                        } else if (C5207g.m11106a(name, "valueOf")) {
                            zEquals = Arrays.equals(method2.getParameterTypes(), new Class[]{String.class});
                        } else {
                            zEquals = false;
                        }
                        if (!zEquals) {
                            z10 = true;
                        }
                    } else {
                        z10 = true;
                    }
                }
                return Boolean.valueOf(z10);
            }
        }), ReflectJavaClass$methods$2.f38593j)));
    }

    @Override // p491xm.InterfaceC10232g
    /* JADX INFO: renamed from: D */
    public final AnnotatedElement mo13652D() {
        return this.f38594a;
    }

    @Override // gn.InterfaceC5827g
    /* JADX INFO: renamed from: H */
    public final boolean mo12246H() {
        return this.f38594a.isEnum();
    }

    @Override // p491xm.InterfaceC10244s
    /* JADX INFO: renamed from: J */
    public final int mo13653J() {
        return this.f38594a.getModifiers();
    }

    @Override // gn.InterfaceC5827g
    /* JADX INFO: renamed from: K */
    public final boolean mo12247K() throws IllegalAccessException, InvocationTargetException {
        Class<?> cls = this.f38594a;
        C5207g.m11111f(cls, "clazz");
        C10227b.a aVar = C10227b.f51650a;
        Boolean bool = null;
        boolean zBooleanValue = false;
        if (aVar == null) {
            try {
                aVar = new C10227b.a(Class.class.getMethod("isSealed", new Class[0]), Class.class.getMethod("getPermittedSubclasses", new Class[0]), Class.class.getMethod("isRecord", new Class[0]), Class.class.getMethod("getRecordComponents", new Class[0]));
            } catch (NoSuchMethodException unused) {
                aVar = new C10227b.a(null, null, null, null);
            }
            C10227b.f51650a = aVar;
        }
        Method method = aVar.f51651a;
        if (method != null) {
            Object objInvoke = method.invoke(cls, new Object[0]);
            C5207g.m11109d(objInvoke, "null cannot be cast to non-null type kotlin.Boolean");
            bool = (Boolean) objInvoke;
        }
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        }
        return zBooleanValue;
    }

    @Override // gn.InterfaceC5827g
    /* JADX INFO: renamed from: O */
    public final boolean mo12248O() {
        return this.f38594a.isInterface();
    }

    @Override // gn.InterfaceC5838r
    /* JADX INFO: renamed from: P */
    public final boolean mo12276P() {
        return Modifier.isAbstract(mo13653J());
    }

    @Override // gn.InterfaceC5827g
    /* JADX INFO: renamed from: Q */
    public final void mo12249Q() {
    }

    @Override // gn.InterfaceC5827g
    /* JADX INFO: renamed from: U */
    public final Collection<InterfaceC5830j> mo12250U() throws IllegalAccessException, InvocationTargetException {
        Collection<InterfaceC5830j> arrayList;
        Class<?> cls = this.f38594a;
        C5207g.m11111f(cls, "clazz");
        C10227b.a aVar = C10227b.f51650a;
        Class[] clsArr = null;
        if (aVar == null) {
            try {
                aVar = new C10227b.a(Class.class.getMethod("isSealed", new Class[0]), Class.class.getMethod("getPermittedSubclasses", new Class[0]), Class.class.getMethod("isRecord", new Class[0]), Class.class.getMethod("getRecordComponents", new Class[0]));
            } catch (NoSuchMethodException unused) {
                aVar = new C10227b.a(null, null, null, null);
            }
            C10227b.f51650a = aVar;
        }
        Method method = aVar.f51652b;
        if (method != null) {
            Object objInvoke = method.invoke(cls, new Object[0]);
            C5207g.m11109d(objInvoke, "null cannot be cast to non-null type kotlin.Array<java.lang.Class<*>>");
            clsArr = (Class[]) objInvoke;
        }
        if (clsArr != null) {
            arrayList = new ArrayList<>(clsArr.length);
            for (Class cls2 : clsArr) {
                arrayList.add(new C10236k(cls2));
            }
        } else {
            arrayList = EmptyList.f38032a;
        }
        return arrayList;
    }

    @Override // gn.InterfaceC5827g
    /* JADX INFO: renamed from: W */
    public final List mo12251W() {
        Class<?>[] declaredClasses = this.f38594a.getDeclaredClasses();
        C5207g.m11110e(declaredClasses, "klass.declaredClasses");
        return C9000b.m17255u(C7073a.m14267b3(C7073a.m14262W2(C7073a.m14256Q2(C6744b.m13376h0(declaredClasses), new InterfaceC2052l<Class<?>, Boolean>() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaClass$innerClassNames$1
            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final Boolean mo528n(Class<?> cls) {
                return Boolean.valueOf(cls.getSimpleName().length() == 0);
            }
        }), new InterfaceC2052l<Class<?>, C7648e>() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaClass$innerClassNames$2
            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final C7648e mo528n(Class<?> cls) {
                String simpleName = cls.getSimpleName();
                if (!C7648e.m15233m(simpleName)) {
                    simpleName = null;
                }
                if (simpleName != null) {
                    return C7648e.m15232l(simpleName);
                }
                return null;
            }
        })));
    }

    @Override // gn.InterfaceC5838r
    /* JADX INFO: renamed from: X */
    public final boolean mo12277X() {
        return Modifier.isStatic(mo13653J());
    }

    @Override // gn.InterfaceC5839s
    /* JADX INFO: renamed from: a */
    public final C7648e mo12280a() {
        return C7648e.m15232l(this.f38594a.getSimpleName());
    }

    @Override // gn.InterfaceC5827g
    /* JADX INFO: renamed from: e */
    public final C7646c mo12252e() {
        C7646c c7646cM15204b = ReflectClassUtilKt.m13648a(this.f38594a).m15204b();
        C5207g.m11110e(c7646cM15204b, "klass.classId.asSingleFqName()");
        return c7646cM15204b;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C6831a) {
            if (C5207g.m11106a(this.f38594a, ((C6831a) obj).f38594a)) {
                return true;
            }
        }
        return false;
    }

    @Override // gn.InterfaceC5838r
    /* JADX INFO: renamed from: f */
    public final AbstractC8859q0 mo12278f() {
        return InterfaceC10244s.a.m19217a(this);
    }

    @Override // gn.InterfaceC5824d
    /* JADX INFO: renamed from: h */
    public final InterfaceC5820a mo12239h(C7646c c7646c) {
        return InterfaceC10232g.a.m19211a(this, c7646c);
    }

    public final int hashCode() {
        return this.f38594a.hashCode();
    }

    @Override // gn.InterfaceC5827g
    /* JADX INFO: renamed from: l */
    public final List mo12253l() {
        Constructor<?>[] declaredConstructors = this.f38594a.getDeclaredConstructors();
        C5207g.m11110e(declaredConstructors, "klass.declaredConstructors");
        return C9000b.m17255u(C7073a.m14267b3(C7073a.m14261V2(C7073a.m14256Q2(C6744b.m13376h0(declaredConstructors), ReflectJavaClass$constructors$1.f38586j), ReflectJavaClass$constructors$2.f38587j)));
    }

    @Override // gn.InterfaceC5827g
    /* JADX INFO: renamed from: n */
    public final ArrayList mo12254n() {
        Class<?> cls = this.f38594a;
        C5207g.m11111f(cls, "clazz");
        C10227b.a aVar = C10227b.f51650a;
        if (aVar == null) {
            try {
                aVar = new C10227b.a(Class.class.getMethod("isSealed", new Class[0]), Class.class.getMethod("getPermittedSubclasses", new Class[0]), Class.class.getMethod("isRecord", new Class[0]), Class.class.getMethod("getRecordComponents", new Class[0]));
            } catch (NoSuchMethodException unused) {
                aVar = new C10227b.a(null, null, null, null);
            }
            C10227b.f51650a = aVar;
        }
        Method method = aVar.f51654d;
        Object[] objArr = method != null ? (Object[]) method.invoke(cls, new Object[0]) : null;
        if (objArr == null) {
            objArr = new Object[0];
        }
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            arrayList.add(new C10247v(obj));
        }
        return arrayList;
    }

    @Override // gn.InterfaceC5827g
    /* JADX INFO: renamed from: p */
    public final Collection<InterfaceC5830j> mo12255p() {
        Class<?> cls = this.f38594a;
        if (C5207g.m11106a(cls, Object.class)) {
            return EmptyList.f38032a;
        }
        C1702c c1702c = new C1702c(2);
        Type genericSuperclass = cls.getGenericSuperclass();
        c1702c.m5436c(genericSuperclass != null ? genericSuperclass : Object.class);
        Type[] genericInterfaces = cls.getGenericInterfaces();
        C5207g.m11110e(genericInterfaces, "klass.genericInterfaces");
        c1702c.m5438e(genericInterfaces);
        List listM17252r = C9000b.m17252r(c1702c.m5442i(new Type[c1702c.m5441h()]));
        ArrayList arrayList = new ArrayList(C9325m.m17681z(listM17252r, 10));
        Iterator it = listM17252r.iterator();
        while (it.hasNext()) {
            arrayList.add(new C10236k((Type) it.next()));
        }
        return arrayList;
    }

    @Override // gn.InterfaceC5838r
    /* JADX INFO: renamed from: q */
    public final boolean mo12279q() {
        return Modifier.isFinal(mo13653J());
    }

    @Override // gn.InterfaceC5845y
    /* JADX INFO: renamed from: r */
    public final ArrayList mo12287r() {
        TypeVariable<Class<?>>[] typeParameters = this.f38594a.getTypeParameters();
        C5207g.m11110e(typeParameters, "klass.typeParameters");
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable<Class<?>> typeVariable : typeParameters) {
            arrayList.add(new C10249x(typeVariable));
        }
        return arrayList;
    }

    @Override // gn.InterfaceC5827g
    /* JADX INFO: renamed from: t */
    public final boolean mo12256t() {
        return this.f38594a.isAnnotation();
    }

    public final String toString() {
        return C6831a.class.getName() + ": " + this.f38594a;
    }

    @Override // gn.InterfaceC5827g
    /* JADX INFO: renamed from: u */
    public final C6831a mo12257u() {
        Class<?> declaringClass = this.f38594a.getDeclaringClass();
        if (declaringClass != null) {
            return new C6831a(declaringClass);
        }
        return null;
    }

    @Override // gn.InterfaceC5827g
    /* JADX INFO: renamed from: v */
    public final List mo12258v() {
        Field[] declaredFields = this.f38594a.getDeclaredFields();
        C5207g.m11110e(declaredFields, "klass.declaredFields");
        return C9000b.m17255u(C7073a.m14267b3(C7073a.m14261V2(C7073a.m14256Q2(C6744b.m13376h0(declaredFields), ReflectJavaClass$fields$1.f38588j), ReflectJavaClass$fields$2.f38589j)));
    }

    @Override // gn.InterfaceC5824d
    /* JADX INFO: renamed from: w */
    public final Collection mo12240w() {
        return InterfaceC10232g.a.m19212b(this);
    }

    @Override // gn.InterfaceC5824d
    /* JADX INFO: renamed from: x */
    public final void mo12241x() {
    }

    @Override // gn.InterfaceC5827g
    /* JADX INFO: renamed from: y */
    public final boolean mo12259y() throws IllegalAccessException, InvocationTargetException {
        Class<?> cls = this.f38594a;
        C5207g.m11111f(cls, "clazz");
        C10227b.a aVar = C10227b.f51650a;
        Boolean bool = null;
        boolean zBooleanValue = false;
        if (aVar == null) {
            try {
                aVar = new C10227b.a(Class.class.getMethod("isSealed", new Class[0]), Class.class.getMethod("getPermittedSubclasses", new Class[0]), Class.class.getMethod("isRecord", new Class[0]), Class.class.getMethod("getRecordComponents", new Class[0]));
            } catch (NoSuchMethodException unused) {
                aVar = new C10227b.a(null, null, null, null);
            }
            C10227b.f51650a = aVar;
        }
        Method method = aVar.f51653c;
        if (method != null) {
            Object objInvoke = method.invoke(cls, new Object[0]);
            C5207g.m11109d(objInvoke, "null cannot be cast to non-null type kotlin.Boolean");
            bool = (Boolean) objInvoke;
        }
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        }
        return zBooleanValue;
    }
}
