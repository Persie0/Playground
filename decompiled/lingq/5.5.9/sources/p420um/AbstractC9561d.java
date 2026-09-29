package p420um;

import androidx.datastore.preferences.PreferencesProto$Value;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6816a;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import mn.C7650g;
import p372rm.AbstractC8852n;
import p372rm.C8850m;
import p372rm.InterfaceC8830c;
import p372rm.InterfaceC8835e0;
import p372rm.InterfaceC8837f0;
import p372rm.InterfaceC8838g;
import p372rm.InterfaceC8842i;
import p372rm.InterfaceC8847k0;
import p372rm.InterfaceC8853n0;
import p492xn.C10260i;
import p543do.AbstractC5257t;
import sm.InterfaceC9077e;

/* JADX INFO: renamed from: um.d */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC9561d extends AbstractC9581n implements InterfaceC8835e0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC9561d(InterfaceC9077e interfaceC9077e) {
        super(interfaceC9077e, C7650g.f42092d);
        if (interfaceC9077e != null) {
        } else {
            m18006N(0);
            throw null;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: N */
    public static /* synthetic */ void m18006N(int i10) {
        String str;
        int i11;
        switch (i10) {
            case 2:
            case 3:
            case 4:
            case 5:
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
            case 8:
            case 9:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case 2:
            case 3:
            case 4:
            case 5:
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
            case 8:
            case 9:
                i11 = 2;
                break;
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
                objArr[0] = "substitutor";
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
            case 8:
            case 9:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractReceiverParameterDescriptor";
                break;
            default:
                objArr[0] = "annotations";
                break;
        }
        switch (i10) {
            case 2:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 3:
                objArr[1] = "getTypeParameters";
                break;
            case 4:
                objArr[1] = "getType";
                break;
            case 5:
                objArr[1] = "getValueParameters";
                break;
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                objArr[1] = "getVisibility";
                break;
            case 8:
                objArr[1] = "getOriginal";
                break;
            case 9:
                objArr[1] = "getSource";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractReceiverParameterDescriptor";
                break;
        }
        switch (i10) {
            case 1:
                objArr[2] = "substitute";
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
            case 8:
            case 9:
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i10) {
            case 2:
            case 3:
            case 4:
            case 5:
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
            case 8:
            case 9:
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // p372rm.InterfaceC8838g
    /* JADX INFO: renamed from: C */
    public final <R, D> R mo11871C(InterfaceC8842i<R, D> interfaceC8842i, D d10) {
        return interfaceC8842i.mo14057f(this, d10);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6816a
    /* JADX INFO: renamed from: M */
    public final boolean mo5278M() {
        return false;
    }

    @Override // p420um.AbstractC9581n, p372rm.InterfaceC8838g
    /* JADX INFO: renamed from: b */
    public final InterfaceC6816a mo11875b() {
        return this;
    }

    @Override // p420um.AbstractC9581n, p372rm.InterfaceC8838g
    /* JADX INFO: renamed from: b */
    public final InterfaceC8838g mo11875b() {
        return this;
    }

    @Override // p372rm.InterfaceC8851m0
    /* JADX INFO: renamed from: c */
    public final AbstractC5257t mo11884c() {
        AbstractC5257t abstractC5257tMo17105c = getValue().mo17105c();
        if (abstractC5257tMo17105c != null) {
            return abstractC5257tMo17105c;
        }
        m18006N(4);
        throw null;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p372rm.InterfaceC8841h0
    /* JADX INFO: renamed from: d */
    public final AbstractC9561d mo5312d(TypeSubstitutor typeSubstitutor) {
        if (typeSubstitutor == null) {
            m18006N(1);
            throw null;
        }
        if (typeSubstitutor.m14203h()) {
            return this;
        }
        AbstractC5257t abstractC5257tM14205k = mo11876g() instanceof InterfaceC8830c ? typeSubstitutor.m14205k(mo11884c(), Variance.OUT_VARIANCE) : typeSubstitutor.m14205k(mo11884c(), Variance.INVARIANT);
        if (abstractC5257tM14205k == null) {
            return null;
        }
        return abstractC5257tM14205k == mo11884c() ? this : new C9568g0(mo11876g(), new C10260i(abstractC5257tM14205k), mo11289w());
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p372rm.InterfaceC8846k, p372rm.InterfaceC8862t
    /* JADX INFO: renamed from: f */
    public final AbstractC8852n mo11886f() {
        C8850m.i iVar = C8850m.f46739f;
        if (iVar != null) {
            return iVar;
        }
        m18006N(7);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6816a
    /* JADX INFO: renamed from: i */
    public final List<InterfaceC8853n0> mo11889i() {
        List<InterfaceC8853n0> listEmptyList = Collections.emptyList();
        if (listEmptyList != null) {
            return listEmptyList;
        }
        m18006N(5);
        throw null;
    }

    @Override // p372rm.InterfaceC8844j
    /* JADX INFO: renamed from: j */
    public final InterfaceC8837f0 mo11890j() {
        return InterfaceC8837f0.f46730a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6816a
    /* JADX INFO: renamed from: m0 */
    public final InterfaceC8835e0 mo11892m0() {
        return null;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6816a
    /* JADX INFO: renamed from: p */
    public final Collection<? extends InterfaceC6816a> mo11893p() {
        Set setEmptySet = Collections.emptySet();
        if (setEmptySet != null) {
            return setEmptySet;
        }
        m18006N(6);
        throw null;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6816a
    /* JADX INFO: renamed from: r */
    public final List<InterfaceC8847k0> mo11895r() {
        List<InterfaceC8847k0> listEmptyList = Collections.emptyList();
        if (listEmptyList != null) {
            return listEmptyList;
        }
        m18006N(3);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6816a
    /* JADX INFO: renamed from: s0 */
    public final InterfaceC8835e0 mo11896s0() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6816a
    /* JADX INFO: renamed from: y */
    public final AbstractC5257t mo11900y() {
        return mo11884c();
    }
}
