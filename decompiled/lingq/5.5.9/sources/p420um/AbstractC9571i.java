package p420um;

import androidx.datastore.preferences.PreferencesProto$Value;
import co.InterfaceC2073e;
import co.InterfaceC2076h;
import dm.C5207g;
import fo.C5602h;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.builtins.AbstractC6795c;
import kotlin.reflect.jvm.internal.impl.resolve.C7012a;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import mn.C7648e;
import p372rm.InterfaceC8834e;
import p372rm.InterfaceC8837f0;
import p372rm.InterfaceC8838g;
import p372rm.InterfaceC8842i;
import p372rm.InterfaceC8843i0;
import p372rm.InterfaceC8844j;
import p372rm.InterfaceC8847k0;
import p543do.AbstractC5257t;
import p543do.AbstractC5265x;
import p543do.InterfaceC5240k0;
import sm.InterfaceC9077e;

/* JADX INFO: renamed from: um.i */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC9571i extends AbstractC9582o implements InterfaceC8847k0 {

    /* JADX INFO: renamed from: e */
    public final Variance f49195e;

    /* JADX INFO: renamed from: f */
    public final boolean f49196f;

    /* JADX INFO: renamed from: g */
    public final int f49197g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC2073e<InterfaceC5240k0> f49198h;

    /* JADX INFO: renamed from: i */
    public final InterfaceC2073e<AbstractC5265x> f49199i;

    /* JADX INFO: renamed from: j */
    public final InterfaceC2076h f49200j;

    /* JADX INFO: renamed from: um.i$a */
    public class a extends AbstractTypeConstructor {

        /* JADX INFO: renamed from: c */
        public final InterfaceC8843i0 f49201c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ AbstractC9571i f49202d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AbstractC9571i abstractC9571i, InterfaceC2076h interfaceC2076h, InterfaceC8843i0 interfaceC8843i0) {
            super(interfaceC2076h);
            if (interfaceC2076h == null) {
                m18026k(0);
                throw null;
            }
            this.f49202d = abstractC9571i;
            this.f49201c = interfaceC8843i0;
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 2 */
        /* JADX INFO: renamed from: k */
        public static /* synthetic */ void m18026k(int i10) {
            String str = (i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5 || i10 == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5 || i10 == 8) ? 2 : 3];
            switch (i10) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 8:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor$TypeParameterTypeConstructor";
                    break;
                case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                    objArr[0] = "type";
                    break;
                case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                    objArr[0] = "supertypes";
                    break;
                case 9:
                    objArr[0] = "classifier";
                    break;
                default:
                    objArr[0] = "storageManager";
                    break;
            }
            if (i10 == 1) {
                objArr[1] = "computeSupertypes";
            } else if (i10 == 2) {
                objArr[1] = "getParameters";
            } else if (i10 == 3) {
                objArr[1] = "getDeclarationDescriptor";
            } else if (i10 == 4) {
                objArr[1] = "getBuiltIns";
            } else if (i10 == 5) {
                objArr[1] = "getSupertypeLoopChecker";
            } else if (i10 != 8) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor$TypeParameterTypeConstructor";
            } else {
                objArr[1] = "processSupertypesWithoutCycles";
            }
            switch (i10) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 8:
                    break;
                case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                    objArr[2] = "reportSupertypeLoopError";
                    break;
                case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                    objArr[2] = "processSupertypesWithoutCycles";
                    break;
                case 9:
                    objArr[2] = "isSameClassifier";
                    break;
                default:
                    objArr[2] = "<init>";
                    break;
            }
            String str2 = String.format(str, objArr);
            if (i10 != 1 && i10 != 2 && i10 != 3 && i10 != 4 && i10 != 5 && i10 != 8) {
                throw new IllegalArgumentException(str2);
            }
            throw new IllegalStateException(str2);
        }

        @Override // p543do.AbstractC5231g
        /* JADX INFO: renamed from: c */
        public final boolean mo11230c(InterfaceC8834e interfaceC8834e) {
            if (interfaceC8834e instanceof InterfaceC8847k0) {
                AbstractC9571i abstractC9571i = this.f49202d;
                C5207g.m11111f(abstractC9571i, "a");
                if (C7012a.m14093c(C7012a.f39644a, abstractC9571i, (InterfaceC8847k0) interfaceC8834e, true)) {
                    return true;
                }
            }
            return false;
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
        /* JADX INFO: renamed from: d */
        public final Collection<AbstractC5257t> mo11258d() {
            List<AbstractC5257t> listMo11215W0 = this.f49202d.mo11215W0();
            if (listMo11215W0 != null) {
                return listMo11215W0;
            }
            m18026k(1);
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
        /* JADX INFO: renamed from: e */
        public final AbstractC5257t mo11231e() {
            return C5602h.m11912c(ErrorTypeKind.CYCLIC_UPPER_BOUNDS, new String[0]);
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
        /* JADX INFO: renamed from: g */
        public final InterfaceC8843i0 mo11259g() {
            InterfaceC8843i0 interfaceC8843i0 = this.f49201c;
            if (interfaceC8843i0 != null) {
                return interfaceC8843i0;
            }
            m18026k(5);
            throw null;
        }

        /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
        /* JADX INFO: renamed from: i */
        public final List<AbstractC5257t> mo14177i(List<AbstractC5257t> list) {
            if (list == null) {
                m18026k(7);
                throw null;
            }
            List<AbstractC5257t> listMo11213P0 = this.f49202d.mo11213P0(list);
            if (listMo11213P0 != null) {
                return listMo11213P0;
            }
            m18026k(8);
            throw null;
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
        /* JADX INFO: renamed from: j */
        public final void mo14178j(AbstractC5257t abstractC5257t) {
            if (abstractC5257t != null) {
                this.f49202d.mo11214V0(abstractC5257t);
            } else {
                m18026k(6);
                throw null;
            }
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // p543do.InterfaceC5240k0
        /* JADX INFO: renamed from: o */
        public final AbstractC6795c mo11234o() {
            AbstractC6795c abstractC6795cM14108e = DescriptorUtilsKt.m14108e(this.f49202d);
            if (abstractC6795cM14108e != null) {
                return abstractC6795cM14108e;
            }
            m18026k(4);
            throw null;
        }

        @Override // p543do.InterfaceC5240k0
        /* JADX INFO: renamed from: q */
        public final InterfaceC8834e mo11235q() {
            AbstractC9571i abstractC9571i = this.f49202d;
            if (abstractC9571i != null) {
                return abstractC9571i;
            }
            m18026k(3);
            throw null;
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // p543do.InterfaceC5240k0
        /* JADX INFO: renamed from: r */
        public final List<InterfaceC8847k0> mo11260r() {
            List<InterfaceC8847k0> listEmptyList = Collections.emptyList();
            if (listEmptyList != null) {
                return listEmptyList;
            }
            m18026k(2);
            throw null;
        }

        @Override // p543do.InterfaceC5240k0
        /* JADX INFO: renamed from: s */
        public final boolean mo11261s() {
            return true;
        }

        public final String toString() {
            return this.f49202d.mo11874a().f42086a;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    public AbstractC9571i(InterfaceC2076h interfaceC2076h, InterfaceC8838g interfaceC8838g, InterfaceC9077e interfaceC9077e, C7648e c7648e, Variance variance, boolean z10, int i10, InterfaceC8843i0 interfaceC8843i0) {
        InterfaceC8837f0.a aVar = InterfaceC8837f0.f46730a;
        if (interfaceC2076h == null) {
            m18025N(0);
            throw null;
        }
        if (interfaceC8838g == null) {
            m18025N(1);
            throw null;
        }
        if (interfaceC9077e == null) {
            m18025N(2);
            throw null;
        }
        if (c7648e == null) {
            m18025N(3);
            throw null;
        }
        if (variance == null) {
            m18025N(4);
            throw null;
        }
        if (interfaceC8843i0 == null) {
            m18025N(6);
            throw null;
        }
        super(interfaceC8838g, interfaceC9077e, c7648e, aVar);
        this.f49195e = variance;
        this.f49196f = z10;
        this.f49197g = i10;
        this.f49198h = interfaceC2076h.mo6217b(new C9565f(this, interfaceC2076h, interfaceC8843i0));
        this.f49199i = interfaceC2076h.mo6217b(new C9569h(this, c7648e));
        this.f49200j = interfaceC2076h;
    }

    /* JADX INFO: renamed from: N */
    public static /* synthetic */ void m18025N(int i10) {
        String str;
        int i11;
        switch (i10) {
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 12:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                i11 = 2;
                break;
            case 12:
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
                objArr[0] = "containingDeclaration";
                break;
            case 2:
                objArr[0] = "annotations";
                break;
            case 3:
                objArr[0] = "name";
                break;
            case 4:
                objArr[0] = "variance";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                objArr[0] = "supertypeLoopChecker";
                break;
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor";
                break;
            case 12:
                objArr[0] = "bounds";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        switch (i10) {
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                objArr[1] = "getVariance";
                break;
            case 8:
                objArr[1] = "getUpperBounds";
                break;
            case 9:
                objArr[1] = "getTypeConstructor";
                break;
            case 10:
                objArr[1] = "getDefaultType";
                break;
            case 11:
                objArr[1] = "getOriginal";
                break;
            case 12:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor";
                break;
            case 13:
                objArr[1] = "processBoundsWithoutCycles";
                break;
            case 14:
                objArr[1] = "getStorageManager";
                break;
        }
        switch (i10) {
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                break;
            case 12:
                objArr[2] = "processBoundsWithoutCycles";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i10) {
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                throw new IllegalStateException(str2);
            case 12:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // p372rm.InterfaceC8838g
    /* JADX INFO: renamed from: C */
    public final <R, D> R mo11871C(InterfaceC8842i<R, D> interfaceC8842i, D d10) {
        return interfaceC8842i.mo14055d(this, d10);
    }

    @Override // p420um.AbstractC9582o
    /* JADX INFO: renamed from: J0 */
    public final InterfaceC8844j mo18004P0() {
        return this;
    }

    @Override // p372rm.InterfaceC8847k0
    /* JADX INFO: renamed from: L */
    public final boolean mo17087L() {
        return this.f49196f;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: P0 */
    public List<AbstractC5257t> mo11213P0(List<AbstractC5257t> list) {
        if (list == null) {
            m18025N(12);
            throw null;
        }
        if (list != null) {
            return list;
        }
        m18025N(13);
        throw null;
    }

    /* JADX INFO: renamed from: V0 */
    public abstract void mo11214V0(AbstractC5257t abstractC5257t);

    /* JADX INFO: renamed from: W0 */
    public abstract List<AbstractC5257t> mo11215W0();

    @Override // p420um.AbstractC9582o, p420um.AbstractC9581n, p372rm.InterfaceC8838g
    /* JADX INFO: renamed from: b */
    public final InterfaceC8834e mo18004P0() {
        return this;
    }

    @Override // p420um.AbstractC9582o, p420um.AbstractC9581n, p372rm.InterfaceC8838g
    /* JADX INFO: renamed from: b */
    public final InterfaceC8838g mo18004P0() {
        return this;
    }

    @Override // p420um.AbstractC9582o, p420um.AbstractC9581n, p372rm.InterfaceC8838g
    /* JADX INFO: renamed from: b */
    public final InterfaceC8847k0 mo18004P0() {
        return this;
    }

    @Override // p372rm.InterfaceC8847k0
    public final int getIndex() {
        return this.f49197g;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p372rm.InterfaceC8847k0
    public final List<AbstractC5257t> getUpperBounds() {
        List<AbstractC5257t> listMo11278p = ((a) mo13600k()).mo11278p();
        if (listMo11278p != null) {
            return listMo11278p;
        }
        m18025N(8);
        throw null;
    }

    @Override // p372rm.InterfaceC8847k0, p372rm.InterfaceC8834e
    /* JADX INFO: renamed from: k */
    public final InterfaceC5240k0 mo13600k() {
        InterfaceC5240k0 interfaceC5240k0Mo807E = this.f49198h.mo807E();
        if (interfaceC5240k0Mo807E != null) {
            return interfaceC5240k0Mo807E;
        }
        m18025N(9);
        throw null;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p372rm.InterfaceC8847k0
    /* JADX INFO: renamed from: n */
    public final Variance mo17088n() {
        Variance variance = this.f49195e;
        if (variance != null) {
            return variance;
        }
        m18025N(7);
        throw null;
    }

    @Override // p372rm.InterfaceC8847k0
    /* JADX INFO: renamed from: o0 */
    public final InterfaceC2076h mo17089o0() {
        InterfaceC2076h interfaceC2076h = this.f49200j;
        if (interfaceC2076h != null) {
            return interfaceC2076h;
        }
        m18025N(14);
        throw null;
    }

    @Override // p372rm.InterfaceC8834e
    /* JADX INFO: renamed from: v */
    public final AbstractC5265x mo5316v() {
        AbstractC5265x abstractC5265xMo807E = this.f49199i.mo807E();
        if (abstractC5265xMo807E != null) {
            return abstractC5265xMo807E;
        }
        m18025N(10);
        throw null;
    }

    @Override // p372rm.InterfaceC8847k0
    /* JADX INFO: renamed from: v0 */
    public final boolean mo17090v0() {
        return false;
    }
}
