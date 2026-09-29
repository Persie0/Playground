package p420um;

import androidx.datastore.preferences.PreferencesProto$Value;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6816a;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6822c;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6823d;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import mn.C7648e;
import p372rm.AbstractC8848l;
import p372rm.AbstractC8852n;
import p372rm.InterfaceC8829b0;
import p372rm.InterfaceC8835e0;
import p372rm.InterfaceC8837f0;
import p372rm.InterfaceC8838g;
import p372rm.InterfaceC8840h;
import p372rm.InterfaceC8847k0;
import sm.InterfaceC9077e;

/* JADX INFO: renamed from: um.c0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC9560c0 extends AbstractC9582o implements InterfaceC6823d {

    /* JADX INFO: renamed from: e */
    public boolean f49144e;

    /* JADX INFO: renamed from: f */
    public final boolean f49145f;

    /* JADX INFO: renamed from: g */
    public final Modality f49146g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC8829b0 f49147h;

    /* JADX INFO: renamed from: i */
    public final boolean f49148i;

    /* JADX INFO: renamed from: j */
    public final CallableMemberDescriptor.Kind f49149j;

    /* JADX INFO: renamed from: k */
    public AbstractC8852n f49150k;

    /* JADX INFO: renamed from: l */
    public InterfaceC6822c f49151l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    public AbstractC9560c0(Modality modality, AbstractC8852n abstractC8852n, InterfaceC8829b0 interfaceC8829b0, InterfaceC9077e interfaceC9077e, C7648e c7648e, boolean z10, boolean z11, boolean z12, CallableMemberDescriptor.Kind kind, InterfaceC8837f0 interfaceC8837f0) {
        super(interfaceC8829b0.mo11876g(), interfaceC9077e, c7648e, interfaceC8837f0);
        if (modality == null) {
            m18003N(0);
            throw null;
        }
        if (abstractC8852n == null) {
            m18003N(1);
            throw null;
        }
        if (interfaceC9077e == null) {
            m18003N(3);
            throw null;
        }
        if (interfaceC8837f0 == null) {
            m18003N(5);
            throw null;
        }
        this.f49151l = null;
        this.f49146g = modality;
        this.f49150k = abstractC8852n;
        this.f49147h = interfaceC8829b0;
        this.f49144e = z10;
        this.f49145f = z11;
        this.f49148i = z12;
        this.f49149j = kind;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: N */
    public static /* synthetic */ void m18003N(int i10) {
        String str;
        int i11;
        switch (i10) {
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
                i11 = 2;
                break;
            default:
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
                objArr[0] = "visibility";
                break;
            case 2:
                objArr[0] = "correspondingProperty";
                break;
            case 3:
                objArr[0] = "annotations";
                break;
            case 4:
                objArr[0] = "name";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyAccessorDescriptorImpl";
                break;
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                objArr[0] = "substitutor";
                break;
            case 15:
                objArr[0] = "overriddenDescriptors";
                break;
            default:
                objArr[0] = "modality";
                break;
        }
        switch (i10) {
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                objArr[1] = "getKind";
                break;
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyAccessorDescriptorImpl";
                break;
            case 8:
                objArr[1] = "getTypeParameters";
                break;
            case 9:
                objArr[1] = "getModality";
                break;
            case 10:
                objArr[1] = "getVisibility";
                break;
            case 11:
                objArr[1] = "getCorrespondingVariable";
                break;
            case 12:
                objArr[1] = "getCorrespondingProperty";
                break;
            case 13:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 14:
                objArr[1] = "getOverriddenDescriptors";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyAccessorDescriptorImpl";
                break;
        }
        switch (i10) {
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
                break;
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                objArr[2] = "substitute";
                break;
            case 15:
                objArr[2] = "setOverriddenDescriptors";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i10) {
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
                throw new IllegalStateException(str2);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    /* JADX INFO: renamed from: B */
    public final CallableMemberDescriptor mo11846B(InterfaceC8838g interfaceC8838g, Modality modality, AbstractC8848l abstractC8848l, CallableMemberDescriptor.Kind kind) {
        throw new UnsupportedOperationException("Accessors must be copied by the corresponding property");
    }

    @Override // p372rm.InterfaceC8862t
    /* JADX INFO: renamed from: D */
    public final boolean mo5293D() {
        return this.f49145f;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6822c
    /* JADX INFO: renamed from: E0 */
    public final boolean mo13616E0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6822c
    /* JADX INFO: renamed from: F0 */
    public final boolean mo5294F0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    /* JADX INFO: renamed from: G0 */
    public final void mo11847G0(Collection<? extends CallableMemberDescriptor> collection) {
        if (collection != null) {
            return;
        }
        m18003N(15);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6823d
    /* JADX INFO: renamed from: K0 */
    public final InterfaceC8829b0 mo13621K0() {
        InterfaceC8829b0 interfaceC8829b0 = this.f49147h;
        if (interfaceC8829b0 != null) {
            return interfaceC8829b0;
        }
        m18003N(12);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6822c
    /* JADX INFO: renamed from: L0 */
    public final boolean mo13617L0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6816a
    /* JADX INFO: renamed from: M */
    public final boolean mo5278M() {
        return false;
    }

    @Override // p372rm.InterfaceC8862t
    /* JADX INFO: renamed from: O0 */
    public final boolean mo11881O0() {
        return false;
    }

    @Override // p420um.AbstractC9582o, p420um.AbstractC9581n, p372rm.InterfaceC8838g
    /* JADX INFO: renamed from: P0 */
    public abstract InterfaceC6823d mo18004P0();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6822c
    /* JADX INFO: renamed from: R0 */
    public final boolean mo13618R0() {
        return false;
    }

    @Override // p372rm.InterfaceC8862t
    /* JADX INFO: renamed from: T */
    public final boolean mo11882T() {
        return false;
    }

    /* JADX INFO: renamed from: V0 */
    public final ArrayList m18005V0(boolean z10) {
        ArrayList arrayList = new ArrayList(0);
        Iterator<? extends CallableMemberDescriptor> it = mo13621K0().mo11893p().iterator();
        while (it.hasNext()) {
            InterfaceC8829b0 interfaceC8829b0 = (InterfaceC8829b0) it.next();
            InterfaceC8840h interfaceC8840hMo11888h = z10 ? interfaceC8829b0.mo11888h() : interfaceC8829b0.mo11887g0();
            if (interfaceC8840hMo11888h != null) {
                arrayList.add(interfaceC8840hMo11888h);
            }
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6822c
    /* JADX INFO: renamed from: W */
    public final boolean mo5296W() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6822c
    /* JADX INFO: renamed from: X */
    public final boolean mo13619X() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6823d
    /* JADX INFO: renamed from: c0 */
    public final boolean mo13622c0() {
        return this.f49144e;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6822c, p372rm.InterfaceC8841h0
    /* JADX INFO: renamed from: d */
    public final InterfaceC6822c mo5312d(TypeSubstitutor typeSubstitutor) {
        if (typeSubstitutor != null) {
            throw new UnsupportedOperationException();
        }
        m18003N(7);
        throw null;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p372rm.InterfaceC8841h0
    /* JADX INFO: renamed from: d */
    public final /* bridge */ /* synthetic */ InterfaceC8840h mo5312d(TypeSubstitutor typeSubstitutor) {
        mo5312d(typeSubstitutor);
        throw null;
    }

    @Override // p372rm.InterfaceC8846k, p372rm.InterfaceC8862t
    /* JADX INFO: renamed from: f */
    public final AbstractC8852n mo11886f() {
        AbstractC8852n abstractC8852n = this.f49150k;
        if (abstractC8852n != null) {
            return abstractC8852n;
        }
        m18003N(10);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6822c
    /* JADX INFO: renamed from: k0 */
    public final InterfaceC6822c mo13620k0() {
        return this.f49151l;
    }

    @Override // p372rm.InterfaceC8862t
    /* JADX INFO: renamed from: l */
    public final Modality mo11891l() {
        Modality modality = this.f49146g;
        if (modality != null) {
            return modality;
        }
        m18003N(9);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6816a
    /* JADX INFO: renamed from: m0 */
    public final InterfaceC8835e0 mo11892m0() {
        return mo13621K0().mo11892m0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6816a
    /* JADX INFO: renamed from: p0 */
    public final <V> V mo5289p0(InterfaceC6816a.a<V> aVar) {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6816a
    /* JADX INFO: renamed from: r */
    public final List<InterfaceC8847k0> mo11895r() {
        List<InterfaceC8847k0> listEmptyList = Collections.emptyList();
        if (listEmptyList != null) {
            return listEmptyList;
        }
        m18003N(8);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6816a
    /* JADX INFO: renamed from: s0 */
    public final InterfaceC8835e0 mo11896s0() {
        return mo13621K0().mo11896s0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    /* JADX INFO: renamed from: u */
    public final CallableMemberDescriptor.Kind mo11897u() {
        CallableMemberDescriptor.Kind kind = this.f49149j;
        if (kind != null) {
            return kind;
        }
        m18003N(6);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6822c
    /* JADX INFO: renamed from: x */
    public final boolean mo5301x() {
        return this.f49148i;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6816a
    /* JADX INFO: renamed from: y0 */
    public final List<InterfaceC8835e0> mo11901y0() {
        List<InterfaceC8835e0> listMo11901y0 = mo13621K0().mo11901y0();
        if (listMo11901y0 != null) {
            return listMo11901y0;
        }
        m18003N(13);
        throw null;
    }
}
