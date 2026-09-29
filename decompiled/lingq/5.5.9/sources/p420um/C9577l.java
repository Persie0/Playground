package p420um;

import androidx.datastore.preferences.PreferencesProto$Value;
import co.InterfaceC2076h;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import mn.C7648e;
import p102eo.AbstractC5439d;
import p372rm.AbstractC8849l0;
import p372rm.AbstractC8852n;
import p372rm.C8850m;
import p372rm.InterfaceC8828b;
import p372rm.InterfaceC8830c;
import p372rm.InterfaceC8837f0;
import p372rm.InterfaceC8838g;
import p372rm.InterfaceC8847k0;
import p543do.AbstractC5265x;
import p543do.C5229f;
import p543do.InterfaceC5240k0;
import sm.InterfaceC9077e;

/* JADX INFO: renamed from: um.l */
/* JADX INFO: loaded from: classes2.dex */
public class C9577l extends AbstractC9575k {

    /* JADX INFO: renamed from: H */
    public InterfaceC8828b f49212H;

    /* JADX INFO: renamed from: h */
    public final Modality f49213h;

    /* JADX INFO: renamed from: i */
    public final ClassKind f49214i;

    /* JADX INFO: renamed from: j */
    public final C5229f f49215j;

    /* JADX INFO: renamed from: k */
    public MemberScope f49216k;

    /* JADX INFO: renamed from: l */
    public Set<InterfaceC8828b> f49217l;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Unreachable blocks removed: 3, instructions: 3 */
    public C9577l(InterfaceC8838g interfaceC8838g, C7648e c7648e, Modality modality, ClassKind classKind, List list, InterfaceC2076h interfaceC2076h) {
        InterfaceC8837f0.a aVar = InterfaceC8837f0.f46730a;
        if (interfaceC8838g == null) {
            m18037J0(0);
            throw null;
        }
        if (c7648e == null) {
            m18037J0(1);
            throw null;
        }
        if (modality == null) {
            m18037J0(2);
            throw null;
        }
        if (classKind == null) {
            m18037J0(3);
            throw null;
        }
        if (list == null) {
            m18037J0(4);
            throw null;
        }
        if (interfaceC2076h == null) {
            m18037J0(6);
            throw null;
        }
        super(interfaceC2076h, interfaceC8838g, c7648e, aVar);
        this.f49213h = modality;
        this.f49214i = classKind;
        this.f49215j = new C5229f(this, Collections.emptyList(), list, interfaceC2076h);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 2 */
    /* JADX INFO: renamed from: J0 */
    public static /* synthetic */ void m18037J0(int i10) {
        String str;
        int i11;
        switch (i10) {
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
            case 12:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
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
                objArr[0] = "name";
                break;
            case 2:
                objArr[0] = "modality";
                break;
            case 3:
                objArr[0] = "kind";
                break;
            case 4:
                objArr[0] = "supertypes";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                objArr[0] = "storageManager";
                break;
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                objArr[0] = "unsubstitutedMemberScope";
                break;
            case 8:
                objArr[0] = "constructors";
                break;
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorImpl";
                break;
            case 12:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i10) {
            case 9:
                objArr[1] = "getAnnotations";
                break;
            case 10:
                objArr[1] = "getTypeConstructor";
                break;
            case 11:
                objArr[1] = "getConstructors";
                break;
            case 12:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorImpl";
                break;
            case 13:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 14:
                objArr[1] = "getStaticScope";
                break;
            case 15:
                objArr[1] = "getKind";
                break;
            case 16:
                objArr[1] = "getModality";
                break;
            case 17:
                objArr[1] = "getVisibility";
                break;
            case 18:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 19:
                objArr[1] = "getSealedSubclasses";
                break;
        }
        switch (i10) {
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
            case 8:
                objArr[2] = "initialize";
                break;
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                break;
            case 12:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i10) {
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                throw new IllegalStateException(str2);
            case 12:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // p372rm.InterfaceC8830c
    /* JADX INFO: renamed from: E */
    public final boolean mo13589E() {
        return false;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p372rm.InterfaceC8830c
    /* JADX INFO: renamed from: G */
    public final Collection<InterfaceC8828b> mo13590G() {
        Set<InterfaceC8828b> set = this.f49217l;
        if (set != null) {
            return set;
        }
        m18037J0(11);
        throw null;
    }

    @Override // p372rm.InterfaceC8830c
    /* JADX INFO: renamed from: I0 */
    public final AbstractC8849l0<AbstractC5265x> mo13591I0() {
        return null;
    }

    @Override // p372rm.InterfaceC8830c
    /* JADX INFO: renamed from: J */
    public final boolean mo13592J() {
        return false;
    }

    @Override // p372rm.InterfaceC8862t
    /* JADX INFO: renamed from: O0 */
    public final boolean mo11881O0() {
        return false;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // p420um.AbstractC9590w
    /* JADX INFO: renamed from: P */
    public final MemberScope mo13593P(AbstractC5439d abstractC5439d) {
        if (abstractC5439d == null) {
            m18037J0(12);
            throw null;
        }
        MemberScope memberScope = this.f49216k;
        if (memberScope != null) {
            return memberScope;
        }
        m18037J0(13);
        throw null;
    }

    @Override // p372rm.InterfaceC8830c
    /* JADX INFO: renamed from: S */
    public final boolean mo13594S() {
        return false;
    }

    @Override // p372rm.InterfaceC8830c
    /* JADX INFO: renamed from: S0 */
    public final boolean mo13595S0() {
        return false;
    }

    @Override // p372rm.InterfaceC8862t
    /* JADX INFO: renamed from: T */
    public final boolean mo11882T() {
        return false;
    }

    @Override // p372rm.InterfaceC8836f
    /* JADX INFO: renamed from: U */
    public final boolean mo13596U() {
        return false;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: V0 */
    public final void m18038V0(MemberScope memberScope, Set set, C9573j c9573j) {
        if (memberScope == null) {
            m18037J0(7);
            throw null;
        }
        if (set == null) {
            m18037J0(8);
            throw null;
        }
        this.f49216k = memberScope;
        this.f49217l = set;
        this.f49212H = c9573j;
    }

    @Override // p372rm.InterfaceC8830c
    /* JADX INFO: renamed from: Y */
    public final InterfaceC8828b mo13597Y() {
        return this.f49212H;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p372rm.InterfaceC8830c
    /* JADX INFO: renamed from: Z */
    public final MemberScope mo13598Z() {
        MemberScope.C7015a c7015a = MemberScope.C7015a.f39670b;
        if (c7015a != null) {
            return c7015a;
        }
        m18037J0(14);
        throw null;
    }

    @Override // p372rm.InterfaceC8830c
    /* JADX INFO: renamed from: b0 */
    public final InterfaceC8830c mo13599b0() {
        return null;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p372rm.InterfaceC8830c, p372rm.InterfaceC8846k, p372rm.InterfaceC8862t
    /* JADX INFO: renamed from: f */
    public final AbstractC8852n mo11886f() {
        C8850m.h hVar = C8850m.f46738e;
        if (hVar != null) {
            return hVar;
        }
        m18037J0(17);
        throw null;
    }

    @Override // p372rm.InterfaceC8834e
    /* JADX INFO: renamed from: k */
    public final InterfaceC5240k0 mo13600k() {
        C5229f c5229f = this.f49215j;
        if (c5229f != null) {
            return c5229f;
        }
        m18037J0(10);
        throw null;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p372rm.InterfaceC8830c, p372rm.InterfaceC8862t
    /* JADX INFO: renamed from: l */
    public final Modality mo11891l() {
        Modality modality = this.f49213h;
        if (modality != null) {
            return modality;
        }
        m18037J0(16);
        throw null;
    }

    @Override // p372rm.InterfaceC8830c
    /* JADX INFO: renamed from: m */
    public final Collection<InterfaceC8830c> mo13601m() {
        List listEmptyList = Collections.emptyList();
        if (listEmptyList != null) {
            return listEmptyList;
        }
        m18037J0(19);
        throw null;
    }

    public String toString() {
        return "class " + mo11874a();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p372rm.InterfaceC8830c
    /* JADX INFO: renamed from: u */
    public final ClassKind mo13602u() {
        ClassKind classKind = this.f49214i;
        if (classKind != null) {
            return classKind;
        }
        m18037J0(15);
        throw null;
    }

    @Override // sm.InterfaceC9073a
    /* JADX INFO: renamed from: w */
    public final InterfaceC9077e mo11289w() {
        return InterfaceC9077e.a.f47365a;
    }

    @Override // p372rm.InterfaceC8830c
    /* JADX INFO: renamed from: x */
    public final boolean mo13603x() {
        return false;
    }

    @Override // p372rm.InterfaceC8830c, p372rm.InterfaceC8836f
    /* JADX INFO: renamed from: z */
    public final List<InterfaceC8847k0> mo13604z() {
        List<InterfaceC8847k0> listEmptyList = Collections.emptyList();
        if (listEmptyList != null) {
            return listEmptyList;
        }
        m18037J0(18);
        throw null;
    }
}
