package p420um;

import androidx.datastore.preferences.PreferencesProto$Value;
import cm.InterfaceC2041a;
import co.InterfaceC2073e;
import co.InterfaceC2076h;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.SubstitutingScope;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import mn.C7648e;
import p102eo.AbstractC5439d;
import p372rm.InterfaceC8830c;
import p372rm.InterfaceC8834e;
import p372rm.InterfaceC8835e0;
import p372rm.InterfaceC8838g;
import p372rm.InterfaceC8842i;
import p466wn.C9983f;
import p543do.AbstractC5252q0;
import p543do.AbstractC5265x;
import p543do.C5258t0;
import pn.C8413d;

/* JADX INFO: renamed from: um.b */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC9557b extends AbstractC9590w {

    /* JADX INFO: renamed from: a */
    public final C7648e f49133a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC2073e<AbstractC5265x> f49134b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC2073e<MemberScope> f49135c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC2073e<InterfaceC8835e0> f49136d;

    /* JADX INFO: renamed from: um.b$a */
    public class a implements InterfaceC2041a<AbstractC5265x> {
        public a() {
        }

        @Override // cm.InterfaceC2041a
        /* JADX INFO: renamed from: E */
        public final AbstractC5265x mo807E() {
            AbstractC9557b abstractC9557b = AbstractC9557b.this;
            return C5258t0.m11304o(abstractC9557b, abstractC9557b.mo13688N0(), new C9555a(this));
        }
    }

    /* JADX INFO: renamed from: um.b$b */
    public class b implements InterfaceC2041a<MemberScope> {
        public b() {
        }

        @Override // cm.InterfaceC2041a
        /* JADX INFO: renamed from: E */
        public final MemberScope mo807E() {
            return new C9983f(AbstractC9557b.this.mo13688N0());
        }
    }

    /* JADX INFO: renamed from: um.b$c */
    public class c implements InterfaceC2041a<InterfaceC8835e0> {
        public c() {
        }

        @Override // cm.InterfaceC2041a
        /* JADX INFO: renamed from: E */
        public final InterfaceC8835e0 mo807E() {
            return new C9588u(AbstractC9557b.this);
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public AbstractC9557b(InterfaceC2076h interfaceC2076h, C7648e c7648e) {
        if (interfaceC2076h == null) {
            m18000J0(0);
            throw null;
        }
        if (c7648e == null) {
            m18000J0(1);
            throw null;
        }
        this.f49133a = c7648e;
        this.f49134b = interfaceC2076h.mo6217b(new a());
        this.f49135c = interfaceC2076h.mo6217b(new b());
        this.f49136d = interfaceC2076h.mo6217b(new c());
    }

    /* JADX INFO: renamed from: J0 */
    public static /* synthetic */ void m18000J0(int i10) {
        String str = (i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5 || i10 == 6 || i10 == 9 || i10 == 12 || i10 == 14 || i10 == 16 || i10 == 17 || i10 == 19 || i10 == 20) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5 || i10 == 6 || i10 == 9 || i10 == 12 || i10 == 14 || i10 == 16 || i10 == 17 || i10 == 19 || i10 == 20) ? 2 : 3];
        switch (i10) {
            case 1:
                objArr[0] = "name";
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
            case 9:
            case 12:
            case 14:
            case 16:
            case 17:
            case 19:
            case 20:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractClassDescriptor";
                break;
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
            case 13:
                objArr[0] = "typeArguments";
                break;
            case 8:
            case 11:
                objArr[0] = "kotlinTypeRefiner";
                break;
            case 10:
            case 15:
                objArr[0] = "typeSubstitution";
                break;
            case 18:
                objArr[0] = "substitutor";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        if (i10 == 2) {
            objArr[1] = "getName";
        } else if (i10 == 3) {
            objArr[1] = "getOriginal";
        } else if (i10 == 4) {
            objArr[1] = "getUnsubstitutedInnerClassesScope";
        } else if (i10 == 5) {
            objArr[1] = "getThisAsReceiverParameter";
        } else if (i10 == 6) {
            objArr[1] = "getContextReceivers";
        } else if (i10 == 9 || i10 == 12 || i10 == 14 || i10 == 16) {
            objArr[1] = "getMemberScope";
        } else if (i10 == 17) {
            objArr[1] = "getUnsubstitutedMemberScope";
        } else if (i10 == 19) {
            objArr[1] = "substitute";
        } else if (i10 != 20) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractClassDescriptor";
        } else {
            objArr[1] = "getDefaultType";
        }
        switch (i10) {
            case 2:
            case 3:
            case 4:
            case 5:
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
            case 9:
            case 12:
            case 14:
            case 16:
            case 17:
            case 19:
            case 20:
                break;
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
                objArr[2] = "getMemberScope";
                break;
            case 18:
                objArr[2] = "substitute";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 != 2 && i10 != 3 && i10 != 4 && i10 != 5 && i10 != 6 && i10 != 9 && i10 != 12 && i10 != 14 && i10 != 16 && i10 != 17 && i10 != 19 && i10 != 20) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // p372rm.InterfaceC8838g
    /* JADX INFO: renamed from: C */
    public final <R, D> R mo11871C(InterfaceC8842i<R, D> interfaceC8842i, D d10) {
        return interfaceC8842i.mo14053b(this, d10);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p372rm.InterfaceC8830c
    /* JADX INFO: renamed from: H0 */
    public MemberScope mo13687H0() {
        MemberScope memberScopeMo807E = this.f49135c.mo807E();
        if (memberScopeMo807E != null) {
            return memberScopeMo807E;
        }
        m18000J0(4);
        throw null;
    }

    @Override // p420um.AbstractC9590w
    /* JADX INFO: renamed from: N */
    public MemberScope mo11844N(AbstractC5252q0 abstractC5252q0, AbstractC5439d abstractC5439d) {
        if (abstractC5252q0 == null) {
            m18000J0(10);
            throw null;
        }
        if (abstractC5439d == null) {
            m18000J0(11);
            throw null;
        }
        if (!abstractC5252q0.mo11276e()) {
            return new SubstitutingScope(mo13593P(abstractC5439d), TypeSubstitutor.m14199e(abstractC5252q0));
        }
        MemberScope memberScopeMo13593P = mo13593P(abstractC5439d);
        if (memberScopeMo13593P != null) {
            return memberScopeMo13593P;
        }
        m18000J0(12);
        throw null;
    }

    @Override // p372rm.InterfaceC8830c
    /* JADX INFO: renamed from: N0 */
    public MemberScope mo13688N0() {
        MemberScope memberScopeMo13593P = mo13593P(DescriptorUtilsKt.m14112i(C8413d.m16445d(this)));
        if (memberScopeMo13593P != null) {
            return memberScopeMo13593P;
        }
        m18000J0(17);
        throw null;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p372rm.InterfaceC8841h0
    /* JADX INFO: renamed from: P0, reason: merged with bridge method [inline-methods] */
    public InterfaceC8830c mo5312d(TypeSubstitutor typeSubstitutor) {
        if (typeSubstitutor != null) {
            return typeSubstitutor.m14203h() ? this : new C9589v(this, typeSubstitutor);
        }
        m18000J0(18);
        throw null;
    }

    @Override // p372rm.InterfaceC8830c
    /* JADX INFO: renamed from: Q0 */
    public List<InterfaceC8835e0> mo14140Q0() {
        List<InterfaceC8835e0> listEmptyList = Collections.emptyList();
        if (listEmptyList != null) {
            return listEmptyList;
        }
        m18000J0(6);
        throw null;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p372rm.InterfaceC8830c
    /* JADX INFO: renamed from: T0 */
    public final MemberScope mo17091T0(AbstractC5252q0 abstractC5252q0) {
        if (abstractC5252q0 == null) {
            m18000J0(15);
            throw null;
        }
        MemberScope memberScopeMo11844N = mo11844N(abstractC5252q0, DescriptorUtilsKt.m14112i(C8413d.m16445d(this)));
        if (memberScopeMo11844N != null) {
            return memberScopeMo11844N;
        }
        m18000J0(16);
        throw null;
    }

    @Override // p372rm.InterfaceC8830c
    /* JADX INFO: renamed from: U0 */
    public final InterfaceC8835e0 mo17092U0() {
        InterfaceC8835e0 interfaceC8835e0Mo807E = this.f49136d.mo807E();
        if (interfaceC8835e0Mo807E != null) {
            return interfaceC8835e0Mo807E;
        }
        m18000J0(5);
        throw null;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p372rm.InterfaceC8838g
    /* JADX INFO: renamed from: a */
    public final C7648e mo11874a() {
        C7648e c7648e = this.f49133a;
        if (c7648e != null) {
            return c7648e;
        }
        m18000J0(2);
        throw null;
    }

    @Override // p420um.AbstractC9590w, p372rm.InterfaceC8830c, p372rm.InterfaceC8838g
    /* JADX INFO: renamed from: b */
    public final InterfaceC8830c mo11875b() {
        return this;
    }

    @Override // p420um.AbstractC9590w, p372rm.InterfaceC8830c, p372rm.InterfaceC8838g
    /* JADX INFO: renamed from: b */
    public final InterfaceC8834e mo11875b() {
        return this;
    }

    @Override // p420um.AbstractC9590w, p372rm.InterfaceC8838g
    /* JADX INFO: renamed from: b */
    public final InterfaceC8838g mo11875b() {
        return this;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p372rm.InterfaceC8830c, p372rm.InterfaceC8834e
    /* JADX INFO: renamed from: v */
    public final AbstractC5265x mo5316v() {
        AbstractC5265x abstractC5265xMo807E = this.f49134b.mo807E();
        if (abstractC5265xMo807E != null) {
            return abstractC5265xMo807E;
        }
        m18000J0(20);
        throw null;
    }
}
