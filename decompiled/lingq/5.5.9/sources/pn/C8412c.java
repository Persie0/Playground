package pn;

import androidx.datastore.preferences.PreferencesProto$Value;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.builtins.C6797e;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6816a;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6822c;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.C6830d;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import mn.C7648e;
import p372rm.AbstractC8852n;
import p372rm.C8850m;
import p372rm.InterfaceC8829b0;
import p372rm.InterfaceC8830c;
import p372rm.InterfaceC8837f0;
import p372rm.InterfaceC8838g;
import p420um.C9564e0;
import p420um.C9566f0;
import p420um.C9568g0;
import p420um.C9570h0;
import p420um.C9573j;
import p492xn.C10254c;
import p492xn.C10255d;
import p543do.AbstractC5257t;
import sm.InterfaceC9077e;

/* JADX INFO: renamed from: pn.c */
/* JADX INFO: loaded from: classes2.dex */
public final class C8412c {

    /* JADX INFO: renamed from: pn.c$a */
    public static class a extends C9573j {
        /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
        public a(DeserializedClassDescriptor deserializedClassDescriptor) {
            AbstractC8852n abstractC8852n;
            super(deserializedClassDescriptor, null, InterfaceC9077e.a.f47365a, true, CallableMemberDescriptor.Kind.DECLARATION, InterfaceC8837f0.f46730a);
            List listEmptyList = Collections.emptyList();
            int i10 = C8413d.f45539a;
            ClassKind classKind = ClassKind.ENUM_CLASS;
            ClassKind classKind2 = deserializedClassDescriptor.f39768k;
            if (classKind2 == classKind || classKind2.isSingleton()) {
                abstractC8852n = C8850m.f46734a;
                if (abstractC8852n == null) {
                    C8413d.m16442a(49);
                    throw null;
                }
            } else if (C8413d.m16458q(deserializedClassDescriptor)) {
                abstractC8852n = C8850m.f46734a;
                if (abstractC8852n == null) {
                    C8413d.m16442a(51);
                    throw null;
                }
            } else if (C8413d.m16452k(deserializedClassDescriptor)) {
                abstractC8852n = C8850m.f46745l;
                if (abstractC8852n == null) {
                    C8413d.m16442a(52);
                    throw null;
                }
            } else {
                abstractC8852n = C8850m.f46738e;
                if (abstractC8852n == null) {
                    C8413d.m16442a(53);
                    throw null;
                }
            }
            m18029g1(listEmptyList, abstractC8852n);
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m16432a(int i10) {
        String str = (i10 == 12 || i10 == 23 || i10 == 25) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 12 || i10 == 23 || i10 == 25) ? 2 : 3];
        switch (i10) {
            case 1:
            case 4:
            case 8:
            case 14:
            case 16:
            case 18:
            case 30:
            case 32:
            case 34:
                objArr[0] = "annotations";
                break;
            case 2:
            case 5:
            case 9:
                objArr[0] = "parameterAnnotations";
                break;
            case 3:
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
            case 13:
            case 15:
            case 17:
            default:
                objArr[0] = "propertyDescriptor";
                break;
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
            case 11:
            case 19:
                objArr[0] = "sourceElement";
                break;
            case 10:
                objArr[0] = "visibility";
                break;
            case 12:
            case 23:
            case 25:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory";
                break;
            case 20:
                objArr[0] = "containingClass";
                break;
            case 21:
                objArr[0] = "source";
                break;
            case 22:
            case 24:
                objArr[0] = "enumClass";
                break;
            case 26:
            case 27:
            case 28:
                objArr[0] = "descriptor";
                break;
            case 29:
            case 31:
            case 33:
                objArr[0] = "owner";
                break;
        }
        if (i10 == 12) {
            objArr[1] = "createSetter";
        } else if (i10 == 23) {
            objArr[1] = "createEnumValuesMethod";
        } else if (i10 != 25) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory";
        } else {
            objArr[1] = "createEnumValueOfMethod";
        }
        switch (i10) {
            case 3:
            case 4:
            case 5:
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
            case 8:
            case 9:
            case 10:
            case 11:
                objArr[2] = "createSetter";
                break;
            case 12:
            case 23:
            case 25:
                break;
            case 13:
            case 14:
                objArr[2] = "createDefaultGetter";
                break;
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                objArr[2] = "createGetter";
                break;
            case 20:
            case 21:
                objArr[2] = "createPrimaryConstructorForObject";
                break;
            case 22:
                objArr[2] = "createEnumValuesMethod";
                break;
            case 24:
                objArr[2] = "createEnumValueOfMethod";
                break;
            case 26:
                objArr[2] = "isEnumValuesMethod";
                break;
            case 27:
                objArr[2] = "isEnumValueOfMethod";
                break;
            case 28:
                objArr[2] = "isEnumSpecialMethod";
                break;
            case 29:
            case 30:
                objArr[2] = "createExtensionReceiverParameterForCallable";
                break;
            case 31:
            case 32:
                objArr[2] = "createContextReceiverParameterForCallable";
                break;
            case 33:
            case 34:
                objArr[2] = "createContextReceiverParameterForClass";
                break;
            default:
                objArr[2] = "createDefaultSetter";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 != 12 && i10 != 23 && i10 != 25) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    /* JADX INFO: renamed from: b */
    public static C9568g0 m16433b(InterfaceC6816a interfaceC6816a, AbstractC5257t abstractC5257t, InterfaceC9077e interfaceC9077e) {
        if (interfaceC9077e == null) {
            m16432a(32);
            throw null;
        }
        if (abstractC5257t == null) {
            return null;
        }
        return new C9568g0(interfaceC6816a, new C10254c(interfaceC6816a, abstractC5257t, null), interfaceC9077e);
    }

    /* JADX INFO: renamed from: c */
    public static C9564e0 m16434c(InterfaceC8829b0 interfaceC8829b0, InterfaceC9077e interfaceC9077e) {
        return m16439h(interfaceC8829b0, interfaceC9077e, true, interfaceC8829b0.mo11890j());
    }

    /* JADX INFO: renamed from: d */
    public static C9566f0 m16435d(InterfaceC8829b0 interfaceC8829b0, InterfaceC9077e interfaceC9077e) {
        InterfaceC9077e.a.C10670a c10670a = InterfaceC9077e.a.f47365a;
        InterfaceC8837f0 interfaceC8837f0Mo11890j = interfaceC8829b0.mo11890j();
        if (interfaceC8837f0Mo11890j != null) {
            return m16440i(interfaceC8829b0, interfaceC9077e, c10670a, true, interfaceC8829b0.mo11886f(), interfaceC8837f0Mo11890j);
        }
        m16432a(6);
        throw null;
    }

    /* JADX INFO: renamed from: e */
    public static C9570h0 m16436e(InterfaceC8830c interfaceC8830c) {
        if (interfaceC8830c == null) {
            m16432a(24);
            throw null;
        }
        InterfaceC9077e.a.C10670a c10670a = InterfaceC9077e.a.f47365a;
        C9570h0 c9570h0M18022f1 = C9570h0.m18022f1(interfaceC8830c, C6797e.f38336b, CallableMemberDescriptor.Kind.SYNTHESIZED, interfaceC8830c.mo11890j());
        return c9570h0M18022f1.mo13636Y0(null, null, Collections.emptyList(), Collections.emptyList(), Collections.singletonList(new C6830d(c9570h0M18022f1, null, 0, c10670a, C7648e.m15232l("value"), DescriptorUtilsKt.m14108e(interfaceC8830c).m13563v(), false, false, false, null, interfaceC8830c.mo11890j())), interfaceC8830c.mo5316v(), Modality.FINAL, C8850m.f46738e);
    }

    /* JADX INFO: renamed from: f */
    public static C9570h0 m16437f(InterfaceC8830c interfaceC8830c) {
        if (interfaceC8830c == null) {
            m16432a(22);
            throw null;
        }
        return C9570h0.m18022f1(interfaceC8830c, C6797e.f38335a, CallableMemberDescriptor.Kind.SYNTHESIZED, interfaceC8830c.mo11890j()).mo13636Y0(null, null, Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), DescriptorUtilsKt.m14108e(interfaceC8830c).m13551h(interfaceC8830c.mo5316v(), Variance.INVARIANT), Modality.FINAL, C8850m.f46738e);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: g */
    public static C9568g0 m16438g(InterfaceC6816a interfaceC6816a, AbstractC5257t abstractC5257t, InterfaceC9077e interfaceC9077e) {
        if (interfaceC6816a == null) {
            m16432a(29);
            throw null;
        }
        if (abstractC5257t == null) {
            return null;
        }
        return new C9568g0(interfaceC6816a, new C10255d(interfaceC6816a, abstractC5257t, null), interfaceC9077e);
    }

    /* JADX INFO: renamed from: h */
    public static C9564e0 m16439h(InterfaceC8829b0 interfaceC8829b0, InterfaceC9077e interfaceC9077e, boolean z10, InterfaceC8837f0 interfaceC8837f0) {
        if (interfaceC9077e == null) {
            m16432a(18);
            throw null;
        }
        if (interfaceC8837f0 != null) {
            return new C9564e0(interfaceC8829b0, interfaceC9077e, interfaceC8829b0.mo11891l(), interfaceC8829b0.mo11886f(), z10, false, false, CallableMemberDescriptor.Kind.DECLARATION, null, interfaceC8837f0);
        }
        m16432a(19);
        throw null;
    }

    /* JADX INFO: renamed from: i */
    public static C9566f0 m16440i(InterfaceC8829b0 interfaceC8829b0, InterfaceC9077e interfaceC9077e, InterfaceC9077e interfaceC9077e2, boolean z10, AbstractC8852n abstractC8852n, InterfaceC8837f0 interfaceC8837f0) {
        if (interfaceC9077e == null) {
            m16432a(8);
            throw null;
        }
        if (interfaceC9077e2 == null) {
            m16432a(9);
            throw null;
        }
        if (abstractC8852n == null) {
            m16432a(10);
            throw null;
        }
        if (interfaceC8837f0 == null) {
            m16432a(11);
            throw null;
        }
        C9566f0 c9566f0 = new C9566f0(interfaceC8829b0, interfaceC9077e, interfaceC8829b0.mo11891l(), abstractC8852n, z10, false, false, CallableMemberDescriptor.Kind.DECLARATION, null, interfaceC8837f0);
        c9566f0.f49188H = C9566f0.m18018W0(c9566f0, interfaceC8829b0.mo11884c(), interfaceC9077e2);
        return c9566f0;
    }

    /* JADX INFO: renamed from: j */
    public static boolean m16441j(InterfaceC6822c interfaceC6822c) {
        if (interfaceC6822c.mo11897u() == CallableMemberDescriptor.Kind.SYNTHESIZED) {
            InterfaceC8838g interfaceC8838gMo11876g = interfaceC6822c.mo11876g();
            int i10 = C8413d.f45539a;
            if (C8413d.m16455n(interfaceC8838gMo11876g, ClassKind.ENUM_CLASS)) {
                return true;
            }
        }
        return false;
    }
}
