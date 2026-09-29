package p420um;

import androidx.datastore.preferences.PreferencesProto$Value;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6822c;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6824e;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractC6828b;
import mn.C7648e;
import p372rm.AbstractC8848l;
import p372rm.AbstractC8852n;
import p372rm.InterfaceC8835e0;
import p372rm.InterfaceC8837f0;
import p372rm.InterfaceC8838g;
import p543do.AbstractC5257t;
import sm.InterfaceC9077e;

/* JADX INFO: renamed from: um.h0 */
/* JADX INFO: loaded from: classes2.dex */
public class C9570h0 extends AbstractC6828b implements InterfaceC6824e {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    public C9570h0(InterfaceC8838g interfaceC8838g, InterfaceC6824e interfaceC6824e, InterfaceC9077e interfaceC9077e, C7648e c7648e, CallableMemberDescriptor.Kind kind, InterfaceC8837f0 interfaceC8837f0) {
        super(kind, interfaceC8838g, interfaceC6824e, interfaceC8837f0, interfaceC9077e, c7648e);
        if (interfaceC8838g == null) {
            m18021N(0);
            throw null;
        }
        if (interfaceC9077e == null) {
            m18021N(1);
            throw null;
        }
        if (c7648e == null) {
            m18021N(2);
            throw null;
        }
        if (kind == null) {
            m18021N(3);
            throw null;
        }
        if (interfaceC8837f0 != null) {
        } else {
            m18021N(4);
            throw null;
        }
    }

    /* JADX INFO: renamed from: N */
    public static /* synthetic */ void m18021N(int i10) {
        String str = (i10 == 13 || i10 == 18 || i10 == 23 || i10 == 24 || i10 == 29 || i10 == 30) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 13 || i10 == 18 || i10 == 23 || i10 == 24 || i10 == 29 || i10 == 30) ? 2 : 3];
        switch (i10) {
            case 1:
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
            case 27:
                objArr[0] = "annotations";
                break;
            case 2:
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                objArr[0] = "name";
                break;
            case 3:
            case 8:
            case 26:
                objArr[0] = "kind";
                break;
            case 4:
            case 9:
            case 28:
                objArr[0] = "source";
                break;
            case 5:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 10:
            case 15:
            case 20:
                objArr[0] = "typeParameters";
                break;
            case 11:
            case 16:
            case 21:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 12:
            case 17:
            case 22:
                objArr[0] = "visibility";
                break;
            case 13:
            case 18:
            case 23:
            case 24:
            case 29:
            case 30:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/SimpleFunctionDescriptorImpl";
                break;
            case 14:
            case 19:
                objArr[0] = "contextReceiverParameters";
                break;
            case 25:
                objArr[0] = "newOwner";
                break;
        }
        if (i10 == 13 || i10 == 18 || i10 == 23) {
            objArr[1] = "initialize";
        } else if (i10 == 24) {
            objArr[1] = "getOriginal";
        } else if (i10 == 29) {
            objArr[1] = "copy";
        } else if (i10 != 30) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/SimpleFunctionDescriptorImpl";
        } else {
            objArr[1] = "newCopyBuilder";
        }
        switch (i10) {
            case 5:
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
            case 8:
            case 9:
                objArr[2] = "create";
                break;
            case 10:
            case 11:
            case 12:
            case 14:
            case 15:
            case 16:
            case 17:
            case 19:
            case 20:
            case 21:
            case 22:
                objArr[2] = "initialize";
                break;
            case 13:
            case 18:
            case 23:
            case 24:
            case 29:
            case 30:
                break;
            case 25:
            case 26:
            case 27:
            case 28:
                objArr[2] = "createSubstitutedCopy";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 != 13 && i10 != 18 && i10 != 23 && i10 != 24 && i10 != 29 && i10 != 30) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: f1 */
    public static C9570h0 m18022f1(InterfaceC8838g interfaceC8838g, C7648e c7648e, CallableMemberDescriptor.Kind kind, InterfaceC8837f0 interfaceC8837f0) {
        InterfaceC9077e.a.C10670a c10670a = InterfaceC9077e.a.f47365a;
        if (interfaceC8838g == null) {
            m18021N(5);
            throw null;
        }
        if (c7648e == null) {
            m18021N(7);
            throw null;
        }
        if (kind == null) {
            m18021N(8);
            throw null;
        }
        if (interfaceC8837f0 != null) {
            return new C9570h0(interfaceC8838g, null, c10670a, c7648e, kind, interfaceC8837f0);
        }
        m18021N(9);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractC6828b, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6822c
    /* JADX INFO: renamed from: M0 */
    public InterfaceC6822c.a<? extends InterfaceC6824e> mo11848M0() {
        return super.mo11848M0();
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractC6828b
    /* JADX INFO: renamed from: V0 */
    public AbstractC6828b mo5279V0(CallableMemberDescriptor.Kind kind, InterfaceC8838g interfaceC8838g, InterfaceC6822c interfaceC6822c, InterfaceC8837f0 interfaceC8837f0, InterfaceC9077e interfaceC9077e, C7648e c7648e) {
        if (interfaceC8838g == null) {
            m18021N(25);
            throw null;
        }
        if (kind == null) {
            m18021N(26);
            throw null;
        }
        if (interfaceC9077e == null) {
            m18021N(27);
            throw null;
        }
        InterfaceC6824e interfaceC6824e = (InterfaceC6824e) interfaceC6822c;
        if (c7648e == null) {
            c7648e = mo11874a();
        }
        return new C9570h0(interfaceC8838g, interfaceC6824e, interfaceC9077e, c7648e, kind, interfaceC8837f0);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractC6828b
    /* JADX INFO: renamed from: e1, reason: merged with bridge method [inline-methods] */
    public InterfaceC6824e mo11846B(InterfaceC8838g interfaceC8838g, Modality modality, AbstractC8848l abstractC8848l, CallableMemberDescriptor.Kind kind) {
        return (InterfaceC6824e) super.mo11846B(interfaceC8838g, modality, abstractC8848l, kind);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractC6828b, p420um.AbstractC9582o, p420um.AbstractC9581n, p372rm.InterfaceC8838g
    /* JADX INFO: renamed from: g1, reason: merged with bridge method [inline-methods] */
    public final InterfaceC6824e mo18004P0() {
        InterfaceC6824e interfaceC6824e = (InterfaceC6824e) super.mo18004P0();
        if (interfaceC6824e != null) {
            return interfaceC6824e;
        }
        m18021N(24);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractC6828b
    /* JADX INFO: renamed from: h1, reason: merged with bridge method [inline-methods] */
    public final C9570h0 mo13636Y0(C9568g0 c9568g0, InterfaceC8835e0 interfaceC8835e0, List list, List list2, List list3, AbstractC5257t abstractC5257t, Modality modality, AbstractC8852n abstractC8852n) {
        if (list == null) {
            m18021N(14);
            throw null;
        }
        if (list2 == null) {
            m18021N(15);
            throw null;
        }
        if (list3 == null) {
            m18021N(16);
            throw null;
        }
        if (abstractC8852n == null) {
            m18021N(17);
            throw null;
        }
        C9570h0 c9570h0Mo13679i1 = mo13679i1(c9568g0, interfaceC8835e0, list, list2, list3, abstractC5257t, modality, abstractC8852n, null);
        if (c9570h0Mo13679i1 != null) {
            return c9570h0Mo13679i1;
        }
        m18021N(18);
        throw null;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: i1 */
    public C9570h0 mo13679i1(C9568g0 c9568g0, InterfaceC8835e0 interfaceC8835e0, List list, List list2, List list3, AbstractC5257t abstractC5257t, Modality modality, AbstractC8852n abstractC8852n, Map map) {
        if (list == null) {
            m18021N(19);
            throw null;
        }
        if (list2 == null) {
            m18021N(20);
            throw null;
        }
        if (list3 == null) {
            m18021N(21);
            throw null;
        }
        if (abstractC8852n == null) {
            m18021N(22);
            throw null;
        }
        super.mo13636Y0(c9568g0, interfaceC8835e0, list, list2, list3, abstractC5257t, modality, abstractC8852n);
        if (map != null && !map.isEmpty()) {
            this.f38531Y = new LinkedHashMap(map);
        }
        return this;
    }
}
