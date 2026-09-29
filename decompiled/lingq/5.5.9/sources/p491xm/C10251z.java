package p491xm;

import dm.C5207g;
import gn.InterfaceC5820a;
import gn.InterfaceC5821a0;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;
import kotlin.collections.C6744b;
import kotlin.collections.EmptyList;

/* JADX INFO: renamed from: xm.z */
/* JADX INFO: loaded from: classes2.dex */
public final class C10251z extends AbstractC10248w implements InterfaceC5821a0 {

    /* JADX INFO: renamed from: a */
    public final WildcardType f51683a;

    /* JADX INFO: renamed from: b */
    public final EmptyList f51684b = EmptyList.f38032a;

    public C10251z(WildcardType wildcardType) {
        this.f51683a = wildcardType;
    }

    @Override // gn.InterfaceC5821a0
    /* JADX INFO: renamed from: R */
    public final boolean mo12235R() {
        Type[] upperBounds = this.f51683a.getUpperBounds();
        C5207g.m11110e(upperBounds, "reflectType.upperBounds");
        return !C5207g.m11106a(C6744b.m13380l0(upperBounds), Object.class);
    }

    @Override // p491xm.AbstractC10248w
    /* JADX INFO: renamed from: Y */
    public final Type mo19213Y() {
        return this.f51683a;
    }

    @Override // gn.InterfaceC5824d
    /* JADX INFO: renamed from: w */
    public final Collection<InterfaceC5820a> mo12240w() {
        return this.f51684b;
    }

    @Override // gn.InterfaceC5824d
    /* JADX INFO: renamed from: x */
    public final void mo12241x() {
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // gn.InterfaceC5821a0
    /* JADX INFO: renamed from: z */
    public final AbstractC10248w mo12236z() {
        AbstractC10248w c10234i;
        WildcardType wildcardType = this.f51683a;
        Type[] upperBounds = wildcardType.getUpperBounds();
        Type[] lowerBounds = wildcardType.getLowerBounds();
        if (upperBounds.length > 1 || lowerBounds.length > 1) {
            throw new UnsupportedOperationException("Wildcard types with many bounds are not yet supported: " + wildcardType);
        }
        if (lowerBounds.length != 1) {
            if (upperBounds.length == 1) {
                Type type = (Type) C6744b.m13388t0(upperBounds);
                if (!C5207g.m11106a(type, Object.class)) {
                    C5207g.m11110e(type, "ub");
                    boolean z10 = type instanceof Class;
                    if (z10) {
                        Class cls = (Class) type;
                        if (cls.isPrimitive()) {
                            return new C10246u(cls);
                        }
                    }
                    if ((type instanceof GenericArrayType) || (z10 && ((Class) type).isArray())) {
                        c10234i = new C10234i(type);
                    } else {
                        c10234i = type instanceof WildcardType ? new C10251z((WildcardType) type) : new C10236k(type);
                    }
                }
            }
            return null;
        }
        Object objM13388t0 = C6744b.m13388t0(lowerBounds);
        C5207g.m11110e(objM13388t0, "lowerBounds.single()");
        Type type2 = (Type) objM13388t0;
        boolean z11 = type2 instanceof Class;
        if (z11) {
            Class cls2 = (Class) type2;
            if (cls2.isPrimitive()) {
                return new C10246u(cls2);
            }
        }
        if ((type2 instanceof GenericArrayType) || (z11 && ((Class) type2).isArray())) {
            c10234i = new C10234i(type2);
        } else {
            c10234i = type2 instanceof WildcardType ? new C10251z((WildcardType) type2) : new C10236k(type2);
        }
        return c10234i;
    }
}
