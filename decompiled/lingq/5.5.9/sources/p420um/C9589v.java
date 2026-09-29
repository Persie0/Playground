package p420um;

import ae.C0062b;
import androidx.datastore.preferences.PreferencesProto$Value;
import dm.C5207g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.SubstitutingScope;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import mn.C7648e;
import p102eo.AbstractC5439d;
import p139go.InterfaceC5853g;
import p372rm.AbstractC8849l0;
import p372rm.AbstractC8852n;
import p372rm.C8858q;
import p372rm.C8864v;
import p372rm.InterfaceC8828b;
import p372rm.InterfaceC8830c;
import p372rm.InterfaceC8835e0;
import p372rm.InterfaceC8837f0;
import p372rm.InterfaceC8838g;
import p372rm.InterfaceC8840h;
import p372rm.InterfaceC8842i;
import p372rm.InterfaceC8847k0;
import p385sf.C9000b;
import p543do.AbstractC5252q0;
import p543do.AbstractC5257t;
import p543do.AbstractC5265x;
import p543do.C5225d;
import p543do.C5229f;
import p543do.C5238j0;
import p543do.C5258t0;
import p543do.InterfaceC5240k0;
import p543do.InterfaceC5246n0;
import pn.C8413d;
import sm.InterfaceC9077e;
import tl.C9325m;

/* JADX INFO: renamed from: um.v */
/* JADX INFO: loaded from: classes2.dex */
public final class C9589v extends AbstractC9590w {

    /* JADX INFO: renamed from: a */
    public final AbstractC9590w f49243a;

    /* JADX INFO: renamed from: b */
    public final TypeSubstitutor f49244b;

    /* JADX INFO: renamed from: c */
    public TypeSubstitutor f49245c;

    /* JADX INFO: renamed from: d */
    public ArrayList f49246d;

    /* JADX INFO: renamed from: e */
    public ArrayList f49247e;

    /* JADX INFO: renamed from: f */
    public C5229f f49248f;

    public C9589v(AbstractC9590w abstractC9590w, TypeSubstitutor typeSubstitutor) {
        this.f49243a = abstractC9590w;
        this.f49244b = typeSubstitutor;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x005c  */
    /* JADX WARN: Code duplicated, block: B:35:0x0061  */
    /* JADX WARN: Code duplicated, block: B:36:0x0066  */
    /* JADX INFO: renamed from: J0 */
    public static /* synthetic */ void m18052J0(int i10) {
        String str = (i10 == 2 || i10 == 3 || i10 == 5 || i10 == 6 || i10 == 8 || i10 == 10 || i10 == 13 || i10 == 23) ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[(i10 == 2 || i10 == 3 || i10 == 5 || i10 == 6 || i10 == 8 || i10 == 10 || i10 == 13 || i10 == 23) ? 3 : 2];
        if (i10 == 2) {
            objArr[0] = "typeArguments";
        } else if (i10 == 3) {
            objArr[0] = "kotlinTypeRefiner";
        } else if (i10 == 5) {
            objArr[0] = "typeSubstitution";
        } else if (i10 == 6) {
            objArr[0] = "kotlinTypeRefiner";
        } else if (i10 == 8) {
            objArr[0] = "typeArguments";
        } else if (i10 == 10) {
            objArr[0] = "typeSubstitution";
        } else if (i10 == 13) {
            objArr[0] = "kotlinTypeRefiner";
        } else if (i10 != 23) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazySubstitutingClassDescriptor";
        } else {
            objArr[0] = "substitutor";
        }
        switch (i10) {
            case 2:
            case 3:
            case 5:
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
            case 8:
            case 10:
            case 13:
            case 23:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazySubstitutingClassDescriptor";
                break;
            case 4:
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
            case 9:
            case 11:
                objArr[1] = "getMemberScope";
                break;
            case 12:
            case 14:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 15:
                objArr[1] = "getStaticScope";
                break;
            case 16:
                objArr[1] = "getDefaultType";
                break;
            case 17:
                objArr[1] = "getContextReceivers";
                break;
            case 18:
                objArr[1] = "getConstructors";
                break;
            case 19:
                objArr[1] = "getAnnotations";
                break;
            case 20:
                objArr[1] = "getName";
                break;
            case 21:
                objArr[1] = "getOriginal";
                break;
            case 22:
                objArr[1] = "getContainingDeclaration";
                break;
            case 24:
                objArr[1] = "substitute";
                break;
            case 25:
                objArr[1] = "getKind";
                break;
            case 26:
                objArr[1] = "getModality";
                break;
            case 27:
                objArr[1] = "getVisibility";
                break;
            case 28:
                objArr[1] = "getUnsubstitutedInnerClassesScope";
                break;
            case 29:
                objArr[1] = "getSource";
                break;
            case 30:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 31:
                objArr[1] = "getSealedSubclasses";
                break;
            default:
                objArr[1] = "getTypeConstructor";
                break;
        }
        if (i10 == 2 || i10 == 3 || i10 == 5 || i10 == 6 || i10 == 8 || i10 == 10) {
            objArr[2] = "getMemberScope";
        } else if (i10 == 13) {
            objArr[2] = "getUnsubstitutedMemberScope";
        } else if (i10 == 23) {
            objArr[2] = "substitute";
        }
        String str2 = String.format(str, objArr);
        if (i10 != 2 && i10 != 3 && i10 != 5 && i10 != 6 && i10 != 8 && i10 != 10 && i10 != 13 && i10 != 23) {
            throw new IllegalStateException(str2);
        }
        throw new IllegalArgumentException(str2);
    }

    @Override // p372rm.InterfaceC8838g
    /* JADX INFO: renamed from: C */
    public final <R, D> R mo11871C(InterfaceC8842i<R, D> interfaceC8842i, D d10) {
        return interfaceC8842i.mo14053b(this, d10);
    }

    @Override // p372rm.InterfaceC8862t
    /* JADX INFO: renamed from: D */
    public final boolean mo5293D() {
        return this.f49243a.mo5293D();
    }

    @Override // p372rm.InterfaceC8830c
    /* JADX INFO: renamed from: E */
    public final boolean mo13589E() {
        return this.f49243a.mo13589E();
    }

    @Override // p372rm.InterfaceC8830c
    /* JADX INFO: renamed from: G */
    public final Collection<InterfaceC8828b> mo13590G() {
        Collection<InterfaceC8828b> collectionMo13590G = this.f49243a.mo13590G();
        ArrayList arrayList = new ArrayList(collectionMo13590G.size());
        for (InterfaceC8828b interfaceC8828b : collectionMo13590G) {
            arrayList.add(((InterfaceC8828b) interfaceC8828b.mo11848M0().mo11861k(interfaceC8828b.mo18004P0()).mo11857g(interfaceC8828b.mo11891l()).mo11863m(interfaceC8828b.mo11886f()).mo11865o(interfaceC8828b.mo11897u()).mo11862l().mo11851a()).mo5312d(m18053P0()));
        }
        return arrayList;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p372rm.InterfaceC8830c
    /* JADX INFO: renamed from: H0 */
    public final MemberScope mo13687H0() {
        MemberScope memberScopeMo13687H0 = this.f49243a.mo13687H0();
        if (memberScopeMo13687H0 != null) {
            return memberScopeMo13687H0;
        }
        m18052J0(28);
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p372rm.InterfaceC8830c
    /* JADX INFO: renamed from: I0 */
    public final AbstractC8849l0<AbstractC5265x> mo13591I0() {
        AbstractC8849l0<AbstractC5265x> abstractC8849l0Mo13591I0 = this.f49243a.mo13591I0();
        if (abstractC8849l0Mo13591I0 == null) {
            return null;
        }
        boolean z10 = abstractC8849l0Mo13591I0 instanceof C8858q;
        TypeSubstitutor typeSubstitutor = this.f49244b;
        if (z10) {
            C8858q c8858q = (C8858q) abstractC8849l0Mo13591I0;
            AbstractC5265x abstractC5265x = (AbstractC5265x) c8858q.f46763b;
            if (abstractC5265x != null && !typeSubstitutor.m14203h()) {
                abstractC5265x = (AbstractC5265x) m18053P0().m14205k(abstractC5265x, Variance.INVARIANT);
            }
            return new C8858q(c8858q.f46762a, abstractC5265x);
        }
        if (!(abstractC8849l0Mo13591I0 instanceof C8864v)) {
            throw new NoWhenBranchMatchedException();
        }
        Collection<Pair> collectionMo17097a = abstractC8849l0Mo13591I0.mo17097a();
        ArrayList arrayList = new ArrayList(C9325m.m17681z(collectionMo17097a, 10));
        for (Pair pair : collectionMo17097a) {
            C7648e c7648e = (C7648e) pair.f38012a;
            AbstractC5265x abstractC5265x2 = (AbstractC5265x) ((InterfaceC5853g) pair.f38013b);
            if (abstractC5265x2 != null) {
                if (!typeSubstitutor.m14203h()) {
                    abstractC5265x2 = (AbstractC5265x) m18053P0().m14205k(abstractC5265x2, Variance.INVARIANT);
                }
            }
            arrayList.add(new Pair(c7648e, abstractC5265x2));
        }
        return new C8864v(arrayList);
    }

    @Override // p372rm.InterfaceC8830c
    /* JADX INFO: renamed from: J */
    public final boolean mo13592J() {
        return this.f49243a.mo13592J();
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // p420um.AbstractC9590w
    /* JADX INFO: renamed from: N */
    public final MemberScope mo11844N(AbstractC5252q0 abstractC5252q0, AbstractC5439d abstractC5439d) {
        if (abstractC5252q0 == null) {
            m18052J0(5);
            throw null;
        }
        if (abstractC5439d == null) {
            m18052J0(6);
            throw null;
        }
        MemberScope memberScopeMo11844N = this.f49243a.mo11844N(abstractC5252q0, abstractC5439d);
        if (!this.f49244b.m14203h()) {
            return new SubstitutingScope(memberScopeMo11844N, m18053P0());
        }
        if (memberScopeMo11844N != null) {
            return memberScopeMo11844N;
        }
        m18052J0(7);
        throw null;
    }

    @Override // p372rm.InterfaceC8830c
    /* JADX INFO: renamed from: N0 */
    public final MemberScope mo13688N0() {
        MemberScope memberScopeMo13593P = mo13593P(DescriptorUtilsKt.m14112i(C8413d.m16445d(this.f49243a)));
        if (memberScopeMo13593P != null) {
            return memberScopeMo13593P;
        }
        m18052J0(12);
        throw null;
    }

    @Override // p372rm.InterfaceC8862t
    /* JADX INFO: renamed from: O0 */
    public final boolean mo11881O0() {
        return this.f49243a.mo11881O0();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p420um.AbstractC9590w
    /* JADX INFO: renamed from: P */
    public final MemberScope mo13593P(AbstractC5439d abstractC5439d) {
        if (abstractC5439d == null) {
            m18052J0(13);
            throw null;
        }
        MemberScope memberScopeMo13593P = this.f49243a.mo13593P(abstractC5439d);
        if (!this.f49244b.m14203h()) {
            return new SubstitutingScope(memberScopeMo13593P, m18053P0());
        }
        if (memberScopeMo13593P != null) {
            return memberScopeMo13593P;
        }
        m18052J0(14);
        throw null;
    }

    /* JADX INFO: renamed from: P0 */
    public final TypeSubstitutor m18053P0() {
        if (this.f49245c == null) {
            TypeSubstitutor typeSubstitutor = this.f49244b;
            if (typeSubstitutor.m14203h()) {
                this.f49245c = typeSubstitutor;
            } else {
                List<InterfaceC8847k0> listMo11260r = this.f49243a.mo13600k().mo11260r();
                this.f49246d = new ArrayList(listMo11260r.size());
                this.f49245c = C0062b.m359j2(listMo11260r, typeSubstitutor.m14202g(), this, this.f49246d);
                ArrayList arrayList = this.f49246d;
                C5207g.m11111f(arrayList, "<this>");
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                loop0: while (true) {
                    while (true) {
                        if (!it.hasNext()) {
                            break loop0;
                        }
                        Object next = it.next();
                        if (Boolean.valueOf(!((InterfaceC8847k0) next).mo17090v0()).booleanValue()) {
                            arrayList2.add(next);
                        }
                    }
                }
                this.f49247e = arrayList2;
            }
        }
        return this.f49245c;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p372rm.InterfaceC8830c
    /* JADX INFO: renamed from: Q0 */
    public final List<InterfaceC8835e0> mo14140Q0() {
        List<InterfaceC8835e0> listEmptyList = Collections.emptyList();
        if (listEmptyList != null) {
            return listEmptyList;
        }
        m18052J0(17);
        throw null;
    }

    @Override // p372rm.InterfaceC8830c
    /* JADX INFO: renamed from: S */
    public final boolean mo13594S() {
        return this.f49243a.mo13594S();
    }

    @Override // p372rm.InterfaceC8830c
    /* JADX INFO: renamed from: S0 */
    public final boolean mo13595S0() {
        return this.f49243a.mo13595S0();
    }

    @Override // p372rm.InterfaceC8862t
    /* JADX INFO: renamed from: T */
    public final boolean mo11882T() {
        return this.f49243a.mo11882T();
    }

    @Override // p372rm.InterfaceC8830c
    /* JADX INFO: renamed from: T0 */
    public final MemberScope mo17091T0(AbstractC5252q0 abstractC5252q0) {
        if (abstractC5252q0 == null) {
            m18052J0(10);
            throw null;
        }
        MemberScope memberScopeMo11844N = mo11844N(abstractC5252q0, DescriptorUtilsKt.m14112i(C8413d.m16445d(this)));
        if (memberScopeMo11844N != null) {
            return memberScopeMo11844N;
        }
        m18052J0(11);
        throw null;
    }

    @Override // p372rm.InterfaceC8836f
    /* JADX INFO: renamed from: U */
    public final boolean mo13596U() {
        return this.f49243a.mo13596U();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p372rm.InterfaceC8830c
    /* JADX INFO: renamed from: U0 */
    public final InterfaceC8835e0 mo17092U0() {
        throw new UnsupportedOperationException();
    }

    @Override // p372rm.InterfaceC8830c
    /* JADX INFO: renamed from: Y */
    public final InterfaceC8828b mo13597Y() {
        return this.f49243a.mo13597Y();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p372rm.InterfaceC8830c
    /* JADX INFO: renamed from: Z */
    public final MemberScope mo13598Z() {
        MemberScope memberScopeMo13598Z = this.f49243a.mo13598Z();
        if (memberScopeMo13598Z != null) {
            return memberScopeMo13598Z;
        }
        m18052J0(15);
        throw null;
    }

    @Override // p372rm.InterfaceC8838g
    /* JADX INFO: renamed from: a */
    public final C7648e mo11874a() {
        C7648e c7648eMo11874a = this.f49243a.mo11874a();
        if (c7648eMo11874a != null) {
            return c7648eMo11874a;
        }
        m18052J0(20);
        throw null;
    }

    @Override // p420um.AbstractC9590w, p372rm.InterfaceC8830c, p372rm.InterfaceC8838g
    /* JADX INFO: renamed from: b */
    public final InterfaceC8830c mo18004P0() {
        InterfaceC8830c interfaceC8830cMo11875b = this.f49243a.mo18004P0();
        if (interfaceC8830cMo11875b != null) {
            return interfaceC8830cMo11875b;
        }
        m18052J0(21);
        throw null;
    }

    @Override // p372rm.InterfaceC8830c
    /* JADX INFO: renamed from: b0 */
    public final InterfaceC8830c mo13599b0() {
        return this.f49243a.mo13599b0();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p372rm.InterfaceC8841h0
    /* JADX INFO: renamed from: d */
    public final InterfaceC8840h mo5312d(TypeSubstitutor typeSubstitutor) {
        if (typeSubstitutor != null) {
            return typeSubstitutor.m14203h() ? this : new C9589v(this, TypeSubstitutor.m14200f(typeSubstitutor.m14202g(), m18053P0().m14202g()));
        }
        m18052J0(23);
        throw null;
    }

    @Override // p372rm.InterfaceC8830c, p372rm.InterfaceC8846k, p372rm.InterfaceC8862t
    /* JADX INFO: renamed from: f */
    public final AbstractC8852n mo11886f() {
        AbstractC8852n abstractC8852nMo11886f = this.f49243a.mo11886f();
        if (abstractC8852nMo11886f != null) {
            return abstractC8852nMo11886f;
        }
        m18052J0(27);
        throw null;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p372rm.InterfaceC8838g
    /* JADX INFO: renamed from: g */
    public final InterfaceC8838g mo11876g() {
        InterfaceC8838g interfaceC8838gMo11876g = this.f49243a.mo11876g();
        if (interfaceC8838gMo11876g != null) {
            return interfaceC8838gMo11876g;
        }
        m18052J0(22);
        throw null;
    }

    @Override // p372rm.InterfaceC8844j
    /* JADX INFO: renamed from: j */
    public final InterfaceC8837f0 mo11890j() {
        return InterfaceC8837f0.f46730a;
    }

    @Override // p372rm.InterfaceC8834e
    /* JADX INFO: renamed from: k */
    public final InterfaceC5240k0 mo13600k() {
        InterfaceC5240k0 interfaceC5240k0Mo13600k = this.f49243a.mo13600k();
        if (this.f49244b.m14203h()) {
            if (interfaceC5240k0Mo13600k != null) {
                return interfaceC5240k0Mo13600k;
            }
            m18052J0(0);
            throw null;
        }
        if (this.f49248f == null) {
            TypeSubstitutor typeSubstitutorM18053P0 = m18053P0();
            Collection<AbstractC5257t> collectionMo11278p = interfaceC5240k0Mo13600k.mo11278p();
            ArrayList arrayList = new ArrayList(collectionMo11278p.size());
            Iterator<AbstractC5257t> it = collectionMo11278p.iterator();
            while (it.hasNext()) {
                arrayList.add(typeSubstitutorM18053P0.m14205k(it.next(), Variance.INVARIANT));
            }
            this.f49248f = new C5229f(this, this.f49246d, arrayList, LockBasedStorageManager.f39828e);
        }
        C5229f c5229f = this.f49248f;
        if (c5229f != null) {
            return c5229f;
        }
        m18052J0(1);
        throw null;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p372rm.InterfaceC8830c, p372rm.InterfaceC8862t
    /* JADX INFO: renamed from: l */
    public final Modality mo11891l() {
        Modality modalityMo11891l = this.f49243a.mo11891l();
        if (modalityMo11891l != null) {
            return modalityMo11891l;
        }
        m18052J0(26);
        throw null;
    }

    @Override // p372rm.InterfaceC8830c
    /* JADX INFO: renamed from: m */
    public final Collection<InterfaceC8830c> mo13601m() {
        Collection<InterfaceC8830c> collectionMo13601m = this.f49243a.mo13601m();
        if (collectionMo13601m != null) {
            return collectionMo13601m;
        }
        m18052J0(31);
        throw null;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p372rm.InterfaceC8830c
    /* JADX INFO: renamed from: u */
    public final ClassKind mo13602u() {
        ClassKind classKindMo13602u = this.f49243a.mo13602u();
        if (classKindMo13602u != null) {
            return classKindMo13602u;
        }
        m18052J0(25);
        throw null;
    }

    @Override // p372rm.InterfaceC8830c, p372rm.InterfaceC8834e
    /* JADX INFO: renamed from: v */
    public final AbstractC5265x mo5316v() {
        C5238j0 c5238j0M11272c;
        List<InterfaceC5246n0> listM11294e = C5258t0.m11294e(mo13600k().mo11260r());
        InterfaceC9077e interfaceC9077eMo11289w = mo11289w();
        C5207g.m11111f(interfaceC9077eMo11289w, "annotations");
        if (interfaceC9077eMo11289w.isEmpty()) {
            C5238j0.f33329b.getClass();
            c5238j0M11272c = C5238j0.f33330c;
        } else {
            C5238j0.a aVar = C5238j0.f33329b;
            List listM17251q = C9000b.m17251q(new C5225d(interfaceC9077eMo11289w));
            aVar.getClass();
            c5238j0M11272c = C5238j0.a.m11272c(listM17251q);
        }
        return KotlinTypeFactory.m14189h(listM11294e, mo13688N0(), c5238j0M11272c, mo13600k(), false);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // sm.InterfaceC9073a
    /* JADX INFO: renamed from: w */
    public final InterfaceC9077e mo11289w() {
        InterfaceC9077e interfaceC9077eMo11289w = this.f49243a.mo11289w();
        if (interfaceC9077eMo11289w != null) {
            return interfaceC9077eMo11289w;
        }
        m18052J0(19);
        throw null;
    }

    @Override // p372rm.InterfaceC8830c
    /* JADX INFO: renamed from: x */
    public final boolean mo13603x() {
        return this.f49243a.mo13603x();
    }

    @Override // p372rm.InterfaceC8830c, p372rm.InterfaceC8836f
    /* JADX INFO: renamed from: z */
    public final List<InterfaceC8847k0> mo13604z() {
        m18053P0();
        ArrayList arrayList = this.f49247e;
        if (arrayList != null) {
            return arrayList;
        }
        m18052J0(30);
        throw null;
    }
}
