package p491xm;

import dm.C5207g;
import gn.InterfaceC5820a;
import gn.InterfaceC5836p;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.collections.C6752c;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C6831a;
import mn.C7646c;
import mn.C7648e;
import mn.C7650g;
import p372rm.AbstractC8859q0;

/* JADX INFO: renamed from: xm.q */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC10242q extends AbstractC10238m implements InterfaceC10232g, InterfaceC10244s, InterfaceC5836p {
    @Override // p491xm.InterfaceC10232g
    /* JADX INFO: renamed from: D */
    public final AnnotatedElement mo13652D() {
        Member memberMo19214Y = mo19214Y();
        C5207g.m11109d(memberMo19214Y, "null cannot be cast to non-null type java.lang.reflect.AnnotatedElement");
        return (AnnotatedElement) memberMo19214Y;
    }

    @Override // p491xm.InterfaceC10244s
    /* JADX INFO: renamed from: J */
    public final int mo13653J() {
        return mo19214Y().getModifiers();
    }

    @Override // gn.InterfaceC5838r
    /* JADX INFO: renamed from: P */
    public final boolean mo12276P() {
        return Modifier.isAbstract(mo13653J());
    }

    @Override // gn.InterfaceC5838r
    /* JADX INFO: renamed from: X */
    public final boolean mo12277X() {
        return Modifier.isStatic(mo13653J());
    }

    /* JADX INFO: renamed from: Y */
    public abstract Member mo19214Y();

    /* JADX WARN: Code duplicated, block: B:32:0x0086  */
    /* JADX WARN: Code duplicated, block: B:42:0x00a8  */
    /* JADX INFO: renamed from: Z */
    public final ArrayList m19215Z(Type[] typeArr, Annotation[][] annotationArr, boolean z10) throws IllegalAccessException, InvocationTargetException {
        ArrayList arrayList;
        AbstractC10248w c10234i;
        AbstractC10248w c10246u;
        String str;
        Method method;
        ArrayList arrayList2 = new ArrayList(typeArr.length);
        C10228c c10228c = C10228c.f51655a;
        Member memberMo19214Y = mo19214Y();
        C5207g.m11111f(memberMo19214Y, "member");
        C10228c.a aVarM19210a = C10228c.f51656b;
        if (aVarM19210a == null) {
            synchronized (c10228c) {
                aVarM19210a = C10228c.f51656b;
                if (aVarM19210a == null) {
                    aVarM19210a = C10228c.m19210a(memberMo19214Y);
                    C10228c.f51656b = aVarM19210a;
                }
            }
        }
        Method method2 = aVarM19210a.f51657a;
        if (method2 == null || (method = aVarM19210a.f51658b) == null) {
            arrayList = null;
        } else {
            Object objInvoke = method2.invoke(memberMo19214Y, new Object[0]);
            C5207g.m11109d(objInvoke, "null cannot be cast to non-null type kotlin.Array<*>");
            Object[] objArr = (Object[]) objInvoke;
            arrayList = new ArrayList(objArr.length);
            for (Object obj : objArr) {
                Object objInvoke2 = method.invoke(obj, new Object[0]);
                C5207g.m11109d(objInvoke2, "null cannot be cast to non-null type kotlin.String");
                arrayList.add((String) objInvoke2);
            }
        }
        int size = arrayList != null ? arrayList.size() - typeArr.length : 0;
        int length = typeArr.length;
        int i10 = 0;
        while (i10 < length) {
            Type type = typeArr[i10];
            C5207g.m11111f(type, "type");
            boolean z11 = type instanceof Class;
            if (z11) {
                Class cls = (Class) type;
                if (cls.isPrimitive()) {
                    c10246u = new C10246u(cls);
                } else {
                    if (!(type instanceof GenericArrayType) || (z11 && ((Class) type).isArray())) {
                        c10234i = new C10234i(type);
                    } else {
                        c10234i = type instanceof WildcardType ? new C10251z((WildcardType) type) : new C10236k(type);
                    }
                    c10246u = c10234i;
                }
            } else {
                if (type instanceof GenericArrayType) {
                    c10234i = new C10234i(type);
                } else {
                    c10234i = new C10234i(type);
                }
                c10246u = c10234i;
            }
            if (arrayList != null) {
                str = (String) C6752c.m13426T(i10 + size, arrayList);
                if (str == null) {
                    throw new IllegalStateException(("No parameter with index " + i10 + '+' + size + " (name=" + mo12280a() + " type=" + c10246u + ") in " + this).toString());
                }
            } else {
                str = null;
            }
            arrayList2.add(new C10250y(c10246u, annotationArr[i10], str, z10 && i10 == typeArr.length + (-1)));
            i10++;
        }
        return arrayList2;
    }

    @Override // gn.InterfaceC5839s
    /* JADX INFO: renamed from: a */
    public final C7648e mo12280a() {
        String name = mo19214Y().getName();
        C7648e c7648eM15232l = name != null ? C7648e.m15232l(name) : null;
        return c7648eM15232l == null ? C7650g.f42089a : c7648eM15232l;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof AbstractC10242q) && C5207g.m11106a(mo19214Y(), ((AbstractC10242q) obj).mo19214Y());
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
        return mo19214Y().hashCode();
    }

    @Override // gn.InterfaceC5836p
    /* JADX INFO: renamed from: o */
    public final C6831a mo12272o() {
        Class<?> declaringClass = mo19214Y().getDeclaringClass();
        C5207g.m11110e(declaringClass, "member.declaringClass");
        return new C6831a(declaringClass);
    }

    @Override // gn.InterfaceC5838r
    /* JADX INFO: renamed from: q */
    public final boolean mo12279q() {
        return Modifier.isFinal(mo13653J());
    }

    public final String toString() {
        return getClass().getName() + ": " + mo19214Y();
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
}
