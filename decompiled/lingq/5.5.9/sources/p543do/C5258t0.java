package p543do;

import ae.C0062b;
import androidx.datastore.preferences.PreferencesProto$Value;
import cm.InterfaceC2052l;
import fo.C5600f;
import fo.C5602h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import jo.C6532d;
import kotlin.collections.C6752c;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.StarProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import p102eo.AbstractC5439d;
import p102eo.InterfaceC5444i;
import p372rm.InterfaceC8830c;
import p372rm.InterfaceC8836f;
import p372rm.InterfaceC8847k0;

/* JADX INFO: renamed from: do.t0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5258t0 {

    /* JADX INFO: renamed from: a */
    public static final C5600f f33352a = C5602h.m11912c(ErrorTypeKind.DONT_CARE, new String[0]);

    /* JADX INFO: renamed from: b */
    public static final C5600f f33353b = C5602h.m11912c(ErrorTypeKind.UNINFERRED_LAMBDA_PARAMETER_TYPE, new String[0]);

    /* JADX INFO: renamed from: c */
    public static final a f33354c = new a("NO_EXPECTED_TYPE");

    /* JADX INFO: renamed from: d */
    public static final a f33355d = new a("UNIT_EXPECTED_TYPE");

    /* JADX INFO: renamed from: do.t0$a */
    public static class a extends AbstractC5241l {

        /* JADX INFO: renamed from: b */
        public final String f33356b;

        public a(String str) {
            this.f33356b = str;
        }

        /* JADX WARN: Code duplicated, block: B:23:0x0040  */
        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* JADX INFO: renamed from: j1 */
        public static /* synthetic */ void m11306j1(int i10) {
            String str = (i10 == 1 || i10 == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i10 == 1 || i10 == 4) ? 2 : 3];
            if (i10 == 1) {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils$SpecialType";
            } else if (i10 == 2) {
                objArr[0] = "delegate";
            } else if (i10 == 3) {
                objArr[0] = "kotlinTypeRefiner";
            } else if (i10 != 4) {
                objArr[0] = "newAttributes";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils$SpecialType";
            }
            if (i10 == 1) {
                objArr[1] = "toString";
            } else if (i10 != 4) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils$SpecialType";
            } else {
                objArr[1] = "refine";
            }
            if (i10 != 1) {
                if (i10 == 2) {
                    objArr[2] = "replaceDelegate";
                } else if (i10 == 3) {
                    objArr[2] = "refine";
                } else if (i10 != 4) {
                    objArr[2] = "replaceAttributes";
                }
            }
            String str2 = String.format(str, objArr);
            if (i10 != 1 && i10 != 4) {
                throw new IllegalArgumentException(str2);
            }
            throw new IllegalStateException(str2);
        }

        @Override // p543do.AbstractC5241l, p543do.AbstractC5257t
        /* JADX INFO: renamed from: Z0 */
        public final AbstractC5257t mo11216Z0(AbstractC5439d abstractC5439d) {
            if (abstractC5439d != null) {
                return this;
            }
            m11306j1(3);
            throw null;
        }

        @Override // p543do.AbstractC5265x, p543do.AbstractC5262v0
        /* JADX INFO: renamed from: b1 */
        public final /* bridge */ /* synthetic */ AbstractC5262v0 mo11217b1(boolean z10) {
            mo11217b1(z10);
            throw null;
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // p543do.AbstractC5241l, p543do.AbstractC5262v0
        /* JADX INFO: renamed from: c1 */
        public final AbstractC5262v0 mo11216Z0(AbstractC5439d abstractC5439d) {
            if (abstractC5439d != null) {
                return this;
            }
            m11306j1(3);
            throw null;
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // p543do.AbstractC5265x, p543do.AbstractC5262v0
        /* JADX INFO: renamed from: d1 */
        public final /* bridge */ /* synthetic */ AbstractC5262v0 mo11243d1(C5238j0 c5238j0) {
            mo11243d1(c5238j0);
            throw null;
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // p543do.AbstractC5265x
        /* JADX INFO: renamed from: e1 */
        public final AbstractC5265x mo11217b1(boolean z10) {
            throw new IllegalStateException(this.f33356b);
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // p543do.AbstractC5265x
        /* JADX INFO: renamed from: f1 */
        public final AbstractC5265x mo11243d1(C5238j0 c5238j0) {
            if (c5238j0 != null) {
                throw new IllegalStateException(this.f33356b);
            }
            m11306j1(0);
            throw null;
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // p543do.AbstractC5241l
        /* JADX INFO: renamed from: g1 */
        public final AbstractC5265x mo11221g1() {
            throw new IllegalStateException(this.f33356b);
        }

        @Override // p543do.AbstractC5241l
        /* JADX INFO: renamed from: h1 */
        public final AbstractC5265x mo11216Z0(AbstractC5439d abstractC5439d) {
            if (abstractC5439d != null) {
                return this;
            }
            m11306j1(3);
            throw null;
        }

        @Override // p543do.AbstractC5241l
        /* JADX INFO: renamed from: i1 */
        public final AbstractC5241l mo11223i1(AbstractC5265x abstractC5265x) {
            throw new IllegalStateException(this.f33356b);
        }

        @Override // p543do.AbstractC5265x
        public final String toString() {
            String str = this.f33356b;
            if (str != null) {
                return str;
            }
            m11306j1(1);
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003b  */
    /* JADX WARN: Code duplicated, block: B:75:0x010f  */
    /* JADX WARN: Code duplicated, block: B:82:0x012a  */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m11290a(int i10) {
        String str;
        int i11;
        if (i10 != 4 && i10 != 9 && i10 != 11 && i10 != 15 && i10 != 17 && i10 != 19 && i10 != 26 && i10 != 35 && i10 != 47 && i10 != 52 && i10 != 6 && i10 != 7) {
            switch (i10) {
                case 55:
                case 56:
                case 57:
                case 58:
                    str = "@NotNull method %s.%s must not return null";
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i10 != 4 && i10 != 9 && i10 != 11 && i10 != 15 && i10 != 17 && i10 != 19 && i10 != 26 && i10 != 35 && i10 != 47 && i10 != 52 && i10 != 6 && i10 != 7) {
            switch (i10) {
                case 55:
                case 56:
                case 57:
                case 58:
                    i11 = 2;
                    break;
                default:
                    i11 = 3;
                    break;
            }
        } else {
            i11 = 2;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 4:
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
            case 9:
            case 11:
            case 15:
            case 17:
            case 19:
            case 26:
            case 35:
            case 47:
            case 52:
            case 55:
            case 56:
            case 57:
            case 58:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils";
                break;
            case 5:
            case 8:
            case 10:
            case 18:
            case 23:
            case 25:
            case 27:
            case 28:
            case 29:
            case 30:
            case 38:
            case 40:
            default:
                objArr[0] = "type";
                break;
            case 12:
                objArr[0] = "typeConstructor";
                break;
            case 13:
                objArr[0] = "unsubstitutedMemberScope";
                break;
            case 14:
                objArr[0] = "refinedTypeFactory";
                break;
            case 16:
                objArr[0] = "parameters";
                break;
            case 20:
                objArr[0] = "subType";
                break;
            case 21:
                objArr[0] = "superType";
                break;
            case 22:
                objArr[0] = "substitutor";
                break;
            case 24:
                objArr[0] = "result";
                break;
            case 31:
            case 33:
                objArr[0] = "clazz";
                break;
            case 32:
                objArr[0] = "typeArguments";
                break;
            case 34:
                objArr[0] = "projections";
                break;
            case 36:
                objArr[0] = "a";
                break;
            case 37:
                objArr[0] = "b";
                break;
            case 39:
                objArr[0] = "typeParameters";
                break;
            case 41:
                objArr[0] = "typeParameterConstructors";
                break;
            case 42:
                objArr[0] = "specialType";
                break;
            case 43:
            case 44:
                objArr[0] = "isSpecialType";
                break;
            case 45:
                objArr[0] = "parameterDescriptor";
                break;
            case 46:
            case 50:
                objArr[0] = "numberValueTypeConstructor";
                break;
            case 48:
            case 49:
                objArr[0] = "supertypes";
                break;
            case 51:
            case 54:
                objArr[0] = "expectedType";
                break;
            case 53:
                objArr[0] = "literalTypeConstructor";
                break;
        }
        if (i10 == 4) {
            objArr[1] = "makeNullableAsSpecified";
        } else if (i10 == 9) {
            objArr[1] = "makeNullableIfNeeded";
        } else if (i10 == 11 || i10 == 15) {
            objArr[1] = "makeUnsubstitutedType";
        } else if (i10 == 17) {
            objArr[1] = "getDefaultTypeProjections";
        } else if (i10 == 19) {
            objArr[1] = "getImmediateSupertypes";
        } else if (i10 == 26) {
            objArr[1] = "getAllSupertypes";
        } else if (i10 == 35) {
            objArr[1] = "substituteProjectionsForParameters";
        } else if (i10 == 47) {
            objArr[1] = "getDefaultPrimitiveNumberType";
        } else if (i10 != 52) {
            if (i10 != 6 && i10 != 7) {
                switch (i10) {
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                        objArr[1] = "getPrimitiveNumberType";
                        break;
                    default:
                        objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils";
                        break;
                }
            } else {
                objArr[1] = "makeNullableIfNeeded";
            }
        } else {
            objArr[1] = "getPrimitiveNumberType";
        }
        switch (i10) {
            case 1:
                objArr[2] = "makeNullable";
                break;
            case 2:
                objArr[2] = "makeNotNullable";
                break;
            case 3:
                objArr[2] = "makeNullableAsSpecified";
                break;
            case 4:
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
            case 9:
            case 11:
            case 15:
            case 17:
            case 19:
            case 26:
            case 35:
            case 47:
            case 52:
            case 55:
            case 56:
            case 57:
            case 58:
                break;
            case 5:
            case 8:
                objArr[2] = "makeNullableIfNeeded";
                break;
            case 10:
                objArr[2] = "canHaveSubtypes";
                break;
            case 12:
            case 13:
            case 14:
                objArr[2] = "makeUnsubstitutedType";
                break;
            case 16:
                objArr[2] = "getDefaultTypeProjections";
                break;
            case 18:
                objArr[2] = "getImmediateSupertypes";
                break;
            case 20:
            case 21:
            case 22:
                objArr[2] = "createSubstitutedSupertype";
                break;
            case 23:
            case 24:
                objArr[2] = "collectAllSupertypes";
                break;
            case 25:
                objArr[2] = "getAllSupertypes";
                break;
            case 27:
                objArr[2] = "isNullableType";
                break;
            case 28:
                objArr[2] = "acceptsNullable";
                break;
            case 29:
                objArr[2] = "hasNullableSuperType";
                break;
            case 30:
                objArr[2] = "getClassDescriptor";
                break;
            case 31:
            case 32:
                objArr[2] = "substituteParameters";
                break;
            case 33:
            case 34:
                objArr[2] = "substituteProjectionsForParameters";
                break;
            case 36:
            case 37:
                objArr[2] = "equalTypes";
                break;
            case 38:
            case 39:
                objArr[2] = "dependsOnTypeParameters";
                break;
            case 40:
            case 41:
                objArr[2] = "dependsOnTypeConstructors";
                break;
            case 42:
            case 43:
            case 44:
                objArr[2] = "contains";
                break;
            case 45:
                objArr[2] = "makeStarProjection";
                break;
            case 46:
            case 48:
                objArr[2] = "getDefaultPrimitiveNumberType";
                break;
            case 49:
                objArr[2] = "findByFqName";
                break;
            case 50:
            case 51:
            case 53:
            case 54:
                objArr[2] = "getPrimitiveNumberType";
                break;
            case 59:
                objArr[2] = "isTypeParameter";
                break;
            case 60:
                objArr[2] = "isReifiedTypeParameter";
                break;
            case 61:
                objArr[2] = "isNonReifiedTypeParameter";
                break;
            case 62:
                objArr[2] = "getTypeParameterDescriptorOrNull";
                break;
            default:
                objArr[2] = "noExpectedType";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 != 4 && i10 != 9 && i10 != 11 && i10 != 15 && i10 != 17 && i10 != 19 && i10 != 26 && i10 != 35 && i10 != 47 && i10 != 52 && i10 != 6 && i10 != 7) {
            switch (i10) {
                case 55:
                case 56:
                case 57:
                case 58:
                    break;
                default:
                    throw new IllegalArgumentException(str2);
            }
        }
        throw new IllegalStateException(str2);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m11291b(AbstractC5257t abstractC5257t) {
        if (abstractC5257t == null) {
            m11290a(28);
            throw null;
        }
        if (abstractC5257t.mo11242Y0()) {
            return true;
        }
        return C0062b.m410w1(abstractC5257t) && m11291b(C0062b.m300Q(abstractC5257t).f33341c);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m11292c(AbstractC5257t abstractC5257t, InterfaceC2052l<AbstractC5262v0, Boolean> interfaceC2052l) {
        if (interfaceC2052l != null) {
            return m11293d(abstractC5257t, interfaceC2052l, null);
        }
        m11290a(43);
        throw null;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m11293d(AbstractC5257t abstractC5257t, InterfaceC2052l<AbstractC5262v0, Boolean> interfaceC2052l, C6532d<AbstractC5257t> c6532d) {
        InterfaceC5246n0 next;
        AbstractC5249p abstractC5249p = null;
        if (interfaceC2052l == null) {
            m11290a(44);
            throw null;
        }
        if (abstractC5257t == null) {
            return false;
        }
        AbstractC5262v0 abstractC5262v0Mo11288a1 = abstractC5257t.mo11288a1();
        if (m11305p(abstractC5257t)) {
            return interfaceC2052l.mo528n(abstractC5262v0Mo11288a1).booleanValue();
        }
        if (c6532d != null && c6532d.contains(abstractC5257t)) {
            return false;
        }
        if (interfaceC2052l.mo528n(abstractC5262v0Mo11288a1).booleanValue()) {
            return true;
        }
        if (c6532d == null) {
            c6532d = new C6532d<>();
        }
        c6532d.add(abstractC5257t);
        if (abstractC5262v0Mo11288a1 instanceof AbstractC5249p) {
            abstractC5249p = (AbstractC5249p) abstractC5262v0Mo11288a1;
        }
        if (abstractC5249p == null || (!m11293d(abstractC5249p.f33340b, interfaceC2052l, c6532d) && !m11293d(abstractC5249p.f33341c, interfaceC2052l, c6532d))) {
            if ((abstractC5262v0Mo11288a1 instanceof C5237j) && m11293d(((C5237j) abstractC5262v0Mo11288a1).f33327b, interfaceC2052l, c6532d)) {
                return true;
            }
            InterfaceC5240k0 interfaceC5240k0Mo11250X0 = abstractC5257t.mo11250X0();
            if (interfaceC5240k0Mo11250X0 instanceof IntersectionTypeConstructor) {
                Iterator<AbstractC5257t> it = ((IntersectionTypeConstructor) interfaceC5240k0Mo11250X0).f39864b.iterator();
                while (it.hasNext()) {
                    if (m11293d(it.next(), interfaceC2052l, c6532d)) {
                        return true;
                    }
                }
                return false;
            }
            Iterator<InterfaceC5246n0> it2 = abstractC5257t.mo11240V0().iterator();
            do {
                while (it2.hasNext()) {
                    next = it2.next();
                    if (next.mo11239f()) {
                    }
                }
                return false;
            } while (!m11293d(next.mo11236c(), interfaceC2052l, c6532d));
            return true;
        }
        return true;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: e */
    public static List<InterfaceC5246n0> m11294e(List<InterfaceC8847k0> list) {
        if (list == null) {
            m11290a(16);
            throw null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<InterfaceC8847k0> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new C5250p0(it.next().mo5316v()));
        }
        List<InterfaceC5246n0> listM13453u0 = C6752c.m13453u0(arrayList);
        if (listM13453u0 != null) {
            return listM13453u0;
        }
        m11290a(17);
        throw null;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: f */
    public static boolean m11295f(AbstractC5257t abstractC5257t) {
        if (abstractC5257t == null) {
            m11290a(29);
            throw null;
        }
        if (abstractC5257t.mo11250X0().mo11235q() instanceof InterfaceC8830c) {
            return false;
        }
        TypeSubstitutor typeSubstitutorM14198d = TypeSubstitutor.m14198d(abstractC5257t);
        Collection<AbstractC5257t> collectionMo11278p = abstractC5257t.mo11250X0().mo11278p();
        ArrayList arrayList = new ArrayList(collectionMo11278p.size());
        for (AbstractC5257t abstractC5257t2 : collectionMo11278p) {
            if (abstractC5257t2 == null) {
                m11290a(21);
                throw null;
            }
            AbstractC5257t abstractC5257tM14205k = typeSubstitutorM14198d.m14205k(abstractC5257t2, Variance.INVARIANT);
            AbstractC5257t abstractC5257tM11300k = abstractC5257tM14205k != null ? m11300k(abstractC5257tM14205k, abstractC5257t.mo11242Y0()) : null;
            if (abstractC5257tM11300k != null) {
                arrayList.add(abstractC5257tM11300k);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (m11296g((AbstractC5257t) it.next())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public static boolean m11296g(AbstractC5257t abstractC5257t) {
        if (abstractC5257t == null) {
            m11290a(27);
            throw null;
        }
        boolean z10 = true;
        if (abstractC5257t.mo11242Y0()) {
            return true;
        }
        if (C0062b.m410w1(abstractC5257t) && m11296g(C0062b.m300Q(abstractC5257t).f33341c)) {
            return true;
        }
        if (abstractC5257t.mo11288a1() instanceof C5237j) {
            return false;
        }
        if (m11297h(abstractC5257t)) {
            return m11295f(abstractC5257t);
        }
        if (abstractC5257t instanceof AbstractC5223c) {
            InterfaceC8847k0 interfaceC8847k0M11668a = ((AbstractC5223c) abstractC5257t).f33306b.m11668a();
            if (interfaceC8847k0M11668a != null && !m11295f(interfaceC8847k0M11668a.mo5316v())) {
                z10 = false;
            }
            return z10;
        }
        InterfaceC5240k0 interfaceC5240k0Mo11250X0 = abstractC5257t.mo11250X0();
        if (interfaceC5240k0Mo11250X0 instanceof IntersectionTypeConstructor) {
            Iterator<AbstractC5257t> it = interfaceC5240k0Mo11250X0.mo11278p().iterator();
            while (it.hasNext()) {
                if (m11296g(it.next())) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: h */
    public static boolean m11297h(AbstractC5257t abstractC5257t) {
        if (abstractC5257t == null) {
            m11290a(59);
            throw null;
        }
        if (abstractC5257t == null) {
            m11290a(62);
            throw null;
        }
        if ((abstractC5257t.mo11250X0().mo11235q() instanceof InterfaceC8847k0 ? (InterfaceC8847k0) abstractC5257t.mo11250X0().mo11235q() : null) == null && !(abstractC5257t.mo11250X0() instanceof InterfaceC5444i)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: i */
    public static AbstractC5262v0 m11298i(AbstractC5257t abstractC5257t) {
        if (abstractC5257t != null) {
            return m11299j(abstractC5257t, false);
        }
        m11290a(2);
        throw null;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: j */
    public static AbstractC5262v0 m11299j(AbstractC5257t abstractC5257t, boolean z10) {
        if (abstractC5257t == null) {
            m11290a(3);
            throw null;
        }
        AbstractC5262v0 abstractC5262v0Mo11217b1 = abstractC5257t.mo11288a1().mo11217b1(z10);
        if (abstractC5262v0Mo11217b1 != null) {
            return abstractC5262v0Mo11217b1;
        }
        m11290a(4);
        throw null;
    }

    /* JADX INFO: renamed from: k */
    public static AbstractC5257t m11300k(AbstractC5257t abstractC5257t, boolean z10) {
        if (abstractC5257t != null) {
            return z10 ? m11299j(abstractC5257t, true) : abstractC5257t;
        }
        m11290a(8);
        throw null;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: l */
    public static AbstractC5265x m11301l(AbstractC5265x abstractC5265x, boolean z10) {
        if (abstractC5265x == null) {
            m11290a(5);
            throw null;
        }
        if (!z10) {
            if (abstractC5265x != null) {
                return abstractC5265x;
            }
            m11290a(7);
            throw null;
        }
        AbstractC5265x abstractC5265xMo11217b1 = abstractC5265x.mo11217b1(true);
        if (abstractC5265xMo11217b1 != null) {
            return abstractC5265xMo11217b1;
        }
        m11290a(6);
        throw null;
    }

    /* JADX INFO: renamed from: m */
    public static StarProjectionImpl m11302m(InterfaceC8847k0 interfaceC8847k0) {
        if (interfaceC8847k0 != null) {
            return new StarProjectionImpl(interfaceC8847k0);
        }
        m11290a(45);
        throw null;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: n */
    public static AbstractC5265x m11303n(InterfaceC5240k0 interfaceC5240k0, MemberScope memberScope, InterfaceC2052l<AbstractC5439d, AbstractC5265x> interfaceC2052l) {
        if (interfaceC5240k0 == null) {
            m11290a(12);
            throw null;
        }
        if (memberScope == null) {
            m11290a(13);
            throw null;
        }
        if (interfaceC2052l == null) {
            m11290a(14);
            throw null;
        }
        List<InterfaceC5246n0> listM11294e = m11294e(interfaceC5240k0.mo11260r());
        C5238j0.f33329b.getClass();
        return KotlinTypeFactory.m14188g(C5238j0.f33330c, interfaceC5240k0, listM11294e, false, memberScope, interfaceC2052l);
    }

    /* JADX INFO: renamed from: o */
    public static AbstractC5265x m11304o(InterfaceC8836f interfaceC8836f, MemberScope memberScope, InterfaceC2052l interfaceC2052l) {
        return C5602h.m11915f(interfaceC8836f) ? C5602h.m11912c(ErrorTypeKind.UNABLE_TO_SUBSTITUTE_TYPE, interfaceC8836f.toString()) : m11303n(interfaceC8836f.mo13600k(), memberScope, interfaceC2052l);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: p */
    public static boolean m11305p(AbstractC5257t abstractC5257t) {
        if (abstractC5257t != null) {
            return abstractC5257t == f33354c || abstractC5257t == f33355d;
        }
        m11290a(0);
        throw null;
    }
}
