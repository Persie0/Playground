package bn;

import androidx.datastore.preferences.PreferencesProto$Value;
import dm.C5206f;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6816a;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6822c;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractC6828b;
import mn.C7648e;
import p123fn.InterfaceC5593a;
import p372rm.InterfaceC8830c;
import p372rm.InterfaceC8837f0;
import p372rm.InterfaceC8838g;
import p420um.C9573j;
import p543do.AbstractC5257t;
import pn.C8412c;
import sm.InterfaceC9077e;

/* JADX INFO: renamed from: bn.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C1618b extends C9573j implements InterfaceC1617a {

    /* JADX INFO: renamed from: a0 */
    public Boolean f9138a0;

    /* JADX INFO: renamed from: b0 */
    public Boolean f9139b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public C1618b(InterfaceC8830c interfaceC8830c, C1618b c1618b, InterfaceC9077e interfaceC9077e, boolean z10, CallableMemberDescriptor.Kind kind, InterfaceC8837f0 interfaceC8837f0) {
        super(interfaceC8830c, c1618b, interfaceC9077e, z10, kind, interfaceC8837f0);
        if (interfaceC8830c == null) {
            m5276N(0);
            throw null;
        }
        if (interfaceC9077e == null) {
            m5276N(1);
            throw null;
        }
        if (kind == null) {
            m5276N(2);
            throw null;
        }
        if (interfaceC8837f0 == null) {
            m5276N(3);
            throw null;
        }
        this.f9138a0 = null;
        this.f9139b0 = null;
    }

    /* JADX INFO: renamed from: N */
    public static /* synthetic */ void m5276N(int i10) {
        String str = (i10 == 11 || i10 == 18) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 11 || i10 == 18) ? 2 : 3];
        switch (i10) {
            case 1:
            case 5:
            case 9:
            case 15:
                objArr[0] = "annotations";
                break;
            case 2:
            case 8:
            case 13:
                objArr[0] = "kind";
                break;
            case 3:
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
            case 10:
                objArr[0] = "source";
                break;
            case 4:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
            case 12:
                objArr[0] = "newOwner";
                break;
            case 11:
            case 18:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaClassConstructorDescriptor";
                break;
            case 14:
                objArr[0] = "sourceElement";
                break;
            case 16:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case 17:
                objArr[0] = "enhancedReturnType";
                break;
        }
        if (i10 == 11) {
            objArr[1] = "createSubstitutedCopy";
        } else if (i10 != 18) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaClassConstructorDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i10) {
            case 4:
            case 5:
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                objArr[2] = "createJavaConstructor";
                break;
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
            case 8:
            case 9:
            case 10:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 11:
            case 18:
                break;
            case 12:
            case 13:
            case 14:
            case 15:
                objArr[2] = "createDescriptor";
                break;
            case 16:
            case 17:
                objArr[2] = "enhance";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 != 11 && i10 != 18) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    /* JADX INFO: renamed from: i1 */
    public static C1618b m5277i1(InterfaceC8830c interfaceC8830c, InterfaceC9077e interfaceC9077e, boolean z10, InterfaceC5593a interfaceC5593a) {
        if (interfaceC8830c == null) {
            m5276N(4);
            throw null;
        }
        if (interfaceC5593a != null) {
            return new C1618b(interfaceC8830c, null, interfaceC9077e, z10, CallableMemberDescriptor.Kind.DECLARATION, interfaceC5593a);
        }
        m5276N(6);
        throw null;
    }

    @Override // bn.InterfaceC1617a
    /* JADX INFO: renamed from: D0 */
    public final InterfaceC1617a mo5275D0(AbstractC5257t abstractC5257t, ArrayList arrayList, AbstractC5257t abstractC5257t2, Pair pair) {
        C1618b c1618bM5283j1 = m5283j1(mo11897u(), mo11876g(), null, mo11890j(), mo11289w());
        c1618bM5283j1.mo13636Y0(abstractC5257t == null ? null : C8412c.m16438g(c1618bM5283j1, abstractC5257t, InterfaceC9077e.a.f47365a), this.f38537j, EmptyList.f38032a, mo11895r(), C5206f.m10982C0(arrayList, mo11889i(), c1618bM5283j1), abstractC5257t2, mo11891l(), mo11886f());
        if (pair != null) {
            c1618bM5283j1.m13638a1((InterfaceC6816a.a) pair.f38012a, pair.f38013b);
        }
        return c1618bM5283j1;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractC6828b, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6816a
    /* JADX INFO: renamed from: M */
    public final boolean mo5278M() {
        return this.f9139b0.booleanValue();
    }

    @Override // p420um.C9573j, kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractC6828b
    /* JADX INFO: renamed from: V0 */
    public final /* bridge */ /* synthetic */ AbstractC6828b mo5279V0(CallableMemberDescriptor.Kind kind, InterfaceC8838g interfaceC8838g, InterfaceC6822c interfaceC6822c, InterfaceC8837f0 interfaceC8837f0, InterfaceC9077e interfaceC9077e, C7648e c7648e) {
        return m5283j1(kind, interfaceC8838g, interfaceC6822c, interfaceC8837f0, interfaceC9077e);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractC6828b
    /* JADX INFO: renamed from: b1 */
    public final void mo5280b1(boolean z10) {
        this.f9138a0 = Boolean.valueOf(z10);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractC6828b
    /* JADX INFO: renamed from: c1 */
    public final void mo5281c1(boolean z10) {
        this.f9139b0 = Boolean.valueOf(z10);
    }

    @Override // p420um.C9573j
    /* JADX INFO: renamed from: e1 */
    public final /* bridge */ /* synthetic */ C9573j mo5279V0(CallableMemberDescriptor.Kind kind, InterfaceC8838g interfaceC8838g, InterfaceC6822c interfaceC6822c, InterfaceC8837f0 interfaceC8837f0, InterfaceC9077e interfaceC9077e, C7648e c7648e) {
        return m5283j1(kind, interfaceC8838g, interfaceC6822c, interfaceC8837f0, interfaceC9077e);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: j1 */
    public final C1618b m5283j1(CallableMemberDescriptor.Kind kind, InterfaceC8838g interfaceC8838g, InterfaceC6822c interfaceC6822c, InterfaceC8837f0 interfaceC8837f0, InterfaceC9077e interfaceC9077e) {
        if (interfaceC8838g == null) {
            m5276N(7);
            throw null;
        }
        if (kind == null) {
            m5276N(8);
            throw null;
        }
        if (interfaceC9077e == null) {
            m5276N(9);
            throw null;
        }
        if (interfaceC8837f0 == null) {
            m5276N(10);
            throw null;
        }
        if (kind == CallableMemberDescriptor.Kind.DECLARATION || kind == CallableMemberDescriptor.Kind.SYNTHESIZED) {
            C1618b c1618b = new C1618b((InterfaceC8830c) interfaceC8838g, (C1618b) interfaceC6822c, interfaceC9077e, this.f49205Z, kind, interfaceC8837f0);
            c1618b.mo5280b1(this.f9138a0.booleanValue());
            c1618b.mo5281c1(mo5278M());
            return c1618b;
        }
        throw new IllegalStateException("Attempt at creating a constructor that is not a declaration: \ncopy from: " + this + "\nnewOwner: " + interfaceC8838g + "\nkind: " + kind);
    }
}
