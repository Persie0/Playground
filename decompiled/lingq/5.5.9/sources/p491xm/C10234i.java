package p491xm;

import dm.C5207g;
import gn.InterfaceC5820a;
import gn.InterfaceC5826f;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;
import kotlin.collections.EmptyList;

/* JADX INFO: renamed from: xm.i */
/* JADX INFO: loaded from: classes2.dex */
public final class C10234i extends AbstractC10248w implements InterfaceC5826f {

    /* JADX INFO: renamed from: a */
    public final Type f51663a;

    /* JADX INFO: renamed from: b */
    public final AbstractC10248w f51664b;

    /* JADX INFO: renamed from: c */
    public final EmptyList f51665c;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public C10234i(Type type) {
        AbstractC10248w c10246u;
        AbstractC10248w c10246u2;
        this.f51663a = type;
        if (!(type instanceof GenericArrayType)) {
            if (type instanceof Class) {
                Class cls = (Class) type;
                if (cls.isArray()) {
                    Class<?> componentType = cls.getComponentType();
                    C5207g.m11110e(componentType, "getComponentType()");
                    c10246u = componentType.isPrimitive() ? new C10246u(componentType) : ((componentType instanceof GenericArrayType) || componentType.isArray()) ? new C10234i(componentType) : componentType instanceof WildcardType ? new C10251z((WildcardType) componentType) : new C10236k(componentType);
                }
            }
            throw new IllegalArgumentException("Not an array type (" + type.getClass() + "): " + type);
        }
        Type genericComponentType = ((GenericArrayType) type).getGenericComponentType();
        C5207g.m11110e(genericComponentType, "genericComponentType");
        boolean z10 = genericComponentType instanceof Class;
        if (z10) {
            Class cls2 = (Class) genericComponentType;
            c10246u2 = cls2.isPrimitive() ? new C10246u(cls2) : c10246u2;
            this.f51664b = c10246u2;
            this.f51665c = EmptyList.f38032a;
        }
        c10246u = ((genericComponentType instanceof GenericArrayType) || (z10 && ((Class) genericComponentType).isArray())) ? new C10234i(genericComponentType) : genericComponentType instanceof WildcardType ? new C10251z((WildcardType) genericComponentType) : new C10236k(genericComponentType);
        c10246u2 = c10246u;
        this.f51664b = c10246u2;
        this.f51665c = EmptyList.f38032a;
    }

    @Override // gn.InterfaceC5826f
    /* JADX INFO: renamed from: S */
    public final AbstractC10248w mo12243S() {
        return this.f51664b;
    }

    @Override // p491xm.AbstractC10248w
    /* JADX INFO: renamed from: Y */
    public final Type mo19213Y() {
        return this.f51663a;
    }

    @Override // gn.InterfaceC5824d
    /* JADX INFO: renamed from: w */
    public final Collection<InterfaceC5820a> mo12240w() {
        return this.f51665c;
    }

    @Override // gn.InterfaceC5824d
    /* JADX INFO: renamed from: x */
    public final void mo12241x() {
    }
}
