package p491xm;

import dm.C5207g;
import gn.InterfaceC5820a;
import gn.InterfaceC5829i;
import gn.InterfaceC5830j;
import gn.InterfaceC5843w;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C6831a;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import mn.C7646c;
import tl.C9325m;

/* JADX INFO: renamed from: xm.k */
/* JADX INFO: loaded from: classes2.dex */
public final class C10236k extends AbstractC10248w implements InterfaceC5830j {

    /* JADX INFO: renamed from: a */
    public final Type f51667a;

    /* JADX INFO: renamed from: b */
    public final AbstractC10238m f51668b;

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public C10236k(Type type) {
        AbstractC10238m c6831a;
        C5207g.m11111f(type, "reflectType");
        this.f51667a = type;
        if (type instanceof Class) {
            c6831a = new C6831a((Class) type);
        } else if (type instanceof TypeVariable) {
            c6831a = new C10249x((TypeVariable) type);
        } else {
            if (!(type instanceof ParameterizedType)) {
                throw new IllegalStateException("Not a classifier type (" + type.getClass() + "): " + type);
            }
            Type rawType = ((ParameterizedType) type).getRawType();
            C5207g.m11109d(rawType, "null cannot be cast to non-null type java.lang.Class<*>");
            c6831a = new C6831a((Class) rawType);
        }
        this.f51668b = c6831a;
    }

    @Override // gn.InterfaceC5830j
    /* JADX INFO: renamed from: E */
    public final boolean mo12261E() {
        Type type = this.f51667a;
        if (!(type instanceof Class)) {
            return false;
        }
        TypeVariable[] typeParameters = ((Class) type).getTypeParameters();
        C5207g.m11110e(typeParameters, "getTypeParameters()");
        return (typeParameters.length == 0) ^ true;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // gn.InterfaceC5830j
    /* JADX INFO: renamed from: F */
    public final String mo12262F() {
        throw new UnsupportedOperationException("Type not found: " + this.f51667a);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0047  */
    /* JADX WARN: Code duplicated, block: B:21:0x0071  */
    @Override // gn.InterfaceC5830j
    /* JADX INFO: renamed from: L */
    public final ArrayList mo12263L() {
        InterfaceC5843w c10234i;
        InterfaceC5843w c10246u;
        List<Type> listM13650c = ReflectClassUtilKt.m13650c(this.f51667a);
        ArrayList arrayList = new ArrayList(C9325m.m17681z(listM13650c, 10));
        for (Type type : listM13650c) {
            C5207g.m11111f(type, "type");
            boolean z10 = type instanceof Class;
            if (z10) {
                Class cls = (Class) type;
                if (cls.isPrimitive()) {
                    c10246u = new C10246u(cls);
                } else {
                    if (!(type instanceof GenericArrayType) || (z10 && ((Class) type).isArray())) {
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
            arrayList.add(c10246u);
        }
        return arrayList;
    }

    @Override // p491xm.AbstractC10248w
    /* JADX INFO: renamed from: Y */
    public final Type mo19213Y() {
        return this.f51667a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [gn.i, xm.m] */
    @Override // gn.InterfaceC5830j
    /* JADX INFO: renamed from: g */
    public final InterfaceC5829i mo12264g() {
        return this.f51668b;
    }

    @Override // p491xm.AbstractC10248w, gn.InterfaceC5824d
    /* JADX INFO: renamed from: h */
    public final InterfaceC5820a mo12239h(C7646c c7646c) {
        C5207g.m11111f(c7646c, "fqName");
        return null;
    }

    @Override // gn.InterfaceC5830j
    /* JADX INFO: renamed from: s */
    public final String mo12265s() {
        return this.f51667a.toString();
    }

    @Override // gn.InterfaceC5824d
    /* JADX INFO: renamed from: w */
    public final Collection<InterfaceC5820a> mo12240w() {
        return EmptyList.f38032a;
    }

    @Override // gn.InterfaceC5824d
    /* JADX INFO: renamed from: x */
    public final void mo12241x() {
    }
}
