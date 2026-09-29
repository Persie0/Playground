package kotlin.reflect.jvm.internal.impl.builtins;

import ae.C0062b;
import androidx.datastore.preferences.PreferencesProto$Value;
import co.InterfaceC2071c;
import co.InterfaceC2073e;
import co.InterfaceC2076h;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.kochava.tracker.BuildConfig;
import dm.C5206f;
import dm.C5207g;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6822c;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.C6829c;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import mn.C7645b;
import mn.C7646c;
import mn.C7647d;
import mn.C7648e;
import om.C8087d;
import om.C8088e;
import om.C8091h;
import om.InterfaceC8084a;
import p372rm.InterfaceC8829b0;
import p372rm.InterfaceC8830c;
import p372rm.InterfaceC8833d0;
import p372rm.InterfaceC8834e;
import p372rm.InterfaceC8838g;
import p372rm.InterfaceC8863u;
import p372rm.InterfaceC8865w;
import p372rm.InterfaceC8866x;
import p420um.C9564e0;
import p543do.AbstractC5257t;
import p543do.AbstractC5262v0;
import p543do.AbstractC5265x;
import p543do.C5250p0;
import p543do.C5258t0;
import p543do.InterfaceC5240k0;
import pm.C8406a;
import pn.C8413d;
import sm.InterfaceC9077e;
import tm.InterfaceC9339a;
import tm.InterfaceC9340b;
import tm.InterfaceC9341c;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.builtins.c */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6795c {

    /* JADX INFO: renamed from: e */
    public static final C7648e f38322e = C7648e.m15234o("<built-ins module>");

    /* JADX INFO: renamed from: a */
    public C6829c f38323a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC2073e<a> f38324b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC2071c<C7648e, InterfaceC8830c> f38325c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC2076h f38326d;

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.builtins.c$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public final Map<PrimitiveType, AbstractC5265x> f38327a;

        /* JADX INFO: renamed from: b */
        public final Map<AbstractC5257t, AbstractC5265x> f38328b;

        /* JADX INFO: renamed from: c */
        public final Map<AbstractC5265x, AbstractC5265x> f38329c;

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        public a() {
            throw null;
        }

        public a(EnumMap enumMap, HashMap map, HashMap map2) {
            this.f38327a = enumMap;
            this.f38328b = map;
            this.f38329c = map2;
        }
    }

    public AbstractC6795c(LockBasedStorageManager lockBasedStorageManager) {
        this.f38326d = lockBasedStorageManager;
        lockBasedStorageManager.mo6217b(new C8087d(this));
        this.f38324b = lockBasedStorageManager.mo6217b(new C6794b(this));
        this.f38325c = lockBasedStorageManager.mo6221f(new C8088e(this));
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: A */
    public static boolean m13528A(InterfaceC8838g interfaceC8838g) {
        if (interfaceC8838g == null) {
            m13540a(9);
            throw null;
        }
        boolean z10 = false;
        if (C8413d.m16450i(interfaceC8838g, InterfaceC8084a.class, false) != null) {
            z10 = true;
        }
        return z10;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: B */
    public static boolean m13529B(AbstractC5257t abstractC5257t, C7647d c7647d) {
        if (abstractC5257t == null) {
            m13540a(97);
            throw null;
        }
        if (c7647d != null) {
            return m13538K(abstractC5257t.mo11250X0(), c7647d);
        }
        m13540a(98);
        throw null;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: C */
    public static boolean m13530C(AbstractC5257t abstractC5257t, C7647d c7647d) {
        if (c7647d != null) {
            return m13529B(abstractC5257t, c7647d) && !abstractC5257t.mo11242Y0();
        }
        m13540a(135);
        throw null;
    }

    /* JADX INFO: renamed from: D */
    public static boolean m13531D(InterfaceC6822c interfaceC6822c) {
        if (interfaceC6822c.mo18004P0().mo11289w().mo5292x(C6797e.a.f38390m)) {
            return true;
        }
        if (!(interfaceC6822c instanceof InterfaceC8829b0)) {
            return false;
        }
        InterfaceC8829b0 interfaceC8829b0 = (InterfaceC8829b0) interfaceC6822c;
        boolean zMo11894q0 = interfaceC8829b0.mo11894q0();
        C9564e0 c9564e0Mo11888h = interfaceC8829b0.mo11888h();
        InterfaceC8833d0 interfaceC8833d0Mo11887g0 = interfaceC8829b0.mo11887g0();
        if (c9564e0Mo11888h != null && m13531D(c9564e0Mo11888h)) {
            if (!zMo11894q0) {
                return true;
            }
            if (interfaceC8833d0Mo11887g0 != null && m13531D(interfaceC8833d0Mo11887g0)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: E */
    public static boolean m13532E(AbstractC5257t abstractC5257t, C7647d c7647d) {
        if (c7647d != null) {
            return !abstractC5257t.mo11242Y0() && m13529B(abstractC5257t, c7647d);
        }
        m13540a(106);
        throw null;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: F */
    public static boolean m13533F(AbstractC5257t abstractC5257t) {
        if (abstractC5257t == null) {
            m13540a(136);
            throw null;
        }
        if (abstractC5257t != null) {
            return m13529B(abstractC5257t, C6797e.a.f38377b) && !C5258t0.m11296g(abstractC5257t);
        }
        m13540a(138);
        throw null;
    }

    /* JADX INFO: renamed from: G */
    public static boolean m13534G(AbstractC5257t abstractC5257t) {
        InterfaceC8834e interfaceC8834eMo11235q = abstractC5257t.mo11250X0().mo11235q();
        return (interfaceC8834eMo11235q == null || m13543s(interfaceC8834eMo11235q) == null) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0037  */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: H */
    public static boolean m13535H(AbstractC5257t abstractC5257t) {
        boolean z10;
        if (abstractC5257t == null) {
            m13540a(94);
            throw null;
        }
        if (abstractC5257t.mo11242Y0()) {
            return false;
        }
        InterfaceC8834e interfaceC8834eMo11235q = abstractC5257t.mo11250X0().mo11235q();
        if (interfaceC8834eMo11235q instanceof InterfaceC8830c) {
            InterfaceC8830c interfaceC8830c = (InterfaceC8830c) interfaceC8834eMo11235q;
            if (interfaceC8830c == null) {
                m13540a(96);
                throw null;
            }
            if (m13544u(interfaceC8830c) != null) {
                z10 = true;
            } else {
                z10 = false;
            }
        } else {
            z10 = false;
        }
        return z10;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: I */
    public static boolean m13536I(InterfaceC8830c interfaceC8830c) {
        if (interfaceC8830c == null) {
            m13540a(107);
            throw null;
        }
        if (!m13542c(interfaceC8830c, C6797e.a.f38375a) && !m13542c(interfaceC8830c, C6797e.a.f38377b)) {
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: J */
    public static boolean m13537J(AbstractC5257t abstractC5257t) {
        return m13532E(abstractC5257t, C6797e.a.f38383f);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: K */
    public static boolean m13538K(InterfaceC5240k0 interfaceC5240k0, C7647d c7647d) {
        if (interfaceC5240k0 == null) {
            m13540a(101);
            throw null;
        }
        if (c7647d != null) {
            InterfaceC8834e interfaceC8834eMo11235q = interfaceC5240k0.mo11235q();
            return (interfaceC8834eMo11235q instanceof InterfaceC8830c) && m13542c(interfaceC8834eMo11235q, c7647d);
        }
        m13540a(102);
        throw null;
    }

    /* JADX INFO: renamed from: L */
    public static boolean m13539L(InterfaceC8838g interfaceC8838g) {
        if (interfaceC8838g == null) {
            m13540a(10);
            throw null;
        }
        while (interfaceC8838g != null) {
            if (interfaceC8838g instanceof InterfaceC8865w) {
                return ((InterfaceC8865w) interfaceC8838g).mo17120e().m15220h(C6797e.f38343i);
            }
            interfaceC8838g = interfaceC8838g.mo11876g();
        }
        return false;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m13540a(int i10) {
        String str;
        int i11;
        switch (i10) {
            case 3:
            case 4:
            case 5:
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
            case 8:
            case 11:
            case 13:
            case 15:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 68:
            case 69:
            case 70:
            case 74:
            case 81:
            case 84:
            case 86:
            case 87:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 9:
            case 10:
            case 12:
            case 14:
            case 16:
            case 17:
            case 46:
            case 53:
            case 67:
            case 71:
            case 72:
            case 73:
            case 75:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 82:
            case 83:
            case 85:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case 3:
            case 4:
            case 5:
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
            case 8:
            case 11:
            case 13:
            case 15:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 68:
            case 69:
            case 70:
            case 74:
            case 81:
            case 84:
            case 86:
            case 87:
                i11 = 2;
                break;
            case 9:
            case 10:
            case 12:
            case 14:
            case 16:
            case 17:
            case 46:
            case 53:
            case 67:
            case 71:
            case 72:
            case 73:
            case 75:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 82:
            case 83:
            case 85:
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
            case 72:
                objArr[0] = "module";
                break;
            case 2:
                objArr[0] = "computation";
                break;
            case 3:
            case 4:
            case 5:
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
            case 8:
            case 11:
            case 13:
            case 15:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 68:
            case 69:
            case 70:
            case 74:
            case 81:
            case 84:
            case 86:
            case 87:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns";
                break;
            case 9:
            case 10:
            case 76:
            case 77:
            case 89:
            case 96:
            case 103:
            case 107:
            case 108:
            case 145:
            case 146:
            case 148:
            case 156:
            case 157:
            case 158:
            case 159:
                objArr[0] = "descriptor";
                break;
            case 12:
            case 98:
            case 100:
            case 102:
            case 104:
            case 106:
            case 135:
                objArr[0] = "fqName";
                break;
            case 14:
                objArr[0] = "simpleName";
                break;
            case 16:
            case 17:
            case 53:
            case ModuleDescriptor.MODULE_VERSION /* 88 */:
            case 90:
            case 91:
            case 92:
            case 93:
            case 94:
            case 95:
            case 97:
            case 99:
            case 105:
            case 109:
            case 110:
            case 111:
            case 113:
            case 114:
            case 115:
            case 116:
            case 117:
            case 118:
            case 119:
            case 120:
            case 121:
            case 122:
            case 123:
            case 124:
            case 125:
            case 126:
            case 127:
            case BuildConfig.SDK_TRUNCATE_LENGTH /* 128 */:
            case 129:
            case 130:
            case 131:
            case 132:
            case 133:
            case 134:
            case 136:
            case 137:
            case 138:
            case 139:
            case 140:
            case 141:
            case 142:
            case 143:
            case 144:
            case 147:
            case 149:
            case 150:
            case 151:
            case 152:
            case 153:
            case 154:
            case 155:
            case 161:
                objArr[0] = "type";
                break;
            case 46:
                objArr[0] = "classSimpleName";
                break;
            case 67:
                objArr[0] = "arrayType";
                break;
            case 71:
                objArr[0] = "notNullArrayType";
                break;
            case 73:
                objArr[0] = "primitiveType";
                break;
            case 75:
                objArr[0] = "kotlinType";
                break;
            case 78:
            case 82:
                objArr[0] = "projectionType";
                break;
            case 79:
            case 83:
            case 85:
                objArr[0] = "argument";
                break;
            case 80:
                objArr[0] = "annotations";
                break;
            case 101:
                objArr[0] = "typeConstructor";
                break;
            case 112:
                objArr[0] = "classDescriptor";
                break;
            case 160:
                objArr[0] = "declarationDescriptor";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        switch (i10) {
            case 3:
                objArr[1] = "getAdditionalClassPartsProvider";
                break;
            case 4:
                objArr[1] = "getPlatformDependentDeclarationFilter";
                break;
            case 5:
                objArr[1] = "getClassDescriptorFactories";
                break;
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                objArr[1] = "getStorageManager";
                break;
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                objArr[1] = "getBuiltInsModule";
                break;
            case 8:
                objArr[1] = "getBuiltInPackagesImportedByDefault";
                break;
            case 9:
            case 10:
            case 12:
            case 14:
            case 16:
            case 17:
            case 46:
            case 53:
            case 67:
            case 71:
            case 72:
            case 73:
            case 75:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 82:
            case 83:
            case 85:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns";
                break;
            case 11:
                objArr[1] = "getBuiltInsPackageScope";
                break;
            case 13:
                objArr[1] = "getBuiltInClassByFqName";
                break;
            case 15:
                objArr[1] = "getBuiltInClassByName";
                break;
            case 18:
                objArr[1] = "getSuspendFunction";
                break;
            case 19:
                objArr[1] = "getKFunction";
                break;
            case 20:
                objArr[1] = "getKSuspendFunction";
                break;
            case 21:
                objArr[1] = "getKClass";
                break;
            case 22:
                objArr[1] = "getKCallable";
                break;
            case 23:
                objArr[1] = "getKProperty";
                break;
            case 24:
                objArr[1] = "getKProperty0";
                break;
            case 25:
                objArr[1] = "getKProperty1";
                break;
            case 26:
                objArr[1] = "getKProperty2";
                break;
            case 27:
                objArr[1] = "getKMutableProperty0";
                break;
            case 28:
                objArr[1] = "getKMutableProperty1";
                break;
            case 29:
                objArr[1] = "getKMutableProperty2";
                break;
            case 30:
                objArr[1] = "getIterator";
                break;
            case 31:
                objArr[1] = "getIterable";
                break;
            case 32:
                objArr[1] = "getMutableIterable";
                break;
            case 33:
                objArr[1] = "getMutableIterator";
                break;
            case 34:
                objArr[1] = "getCollection";
                break;
            case 35:
                objArr[1] = "getMutableCollection";
                break;
            case 36:
                objArr[1] = "getList";
                break;
            case 37:
                objArr[1] = "getMutableList";
                break;
            case 38:
                objArr[1] = "getSet";
                break;
            case 39:
                objArr[1] = "getMutableSet";
                break;
            case 40:
                objArr[1] = "getMap";
                break;
            case 41:
                objArr[1] = "getMutableMap";
                break;
            case 42:
                objArr[1] = "getMapEntry";
                break;
            case 43:
                objArr[1] = "getMutableMapEntry";
                break;
            case 44:
                objArr[1] = "getListIterator";
                break;
            case 45:
                objArr[1] = "getMutableListIterator";
                break;
            case 47:
                objArr[1] = "getBuiltInTypeByClassName";
                break;
            case 48:
                objArr[1] = "getNothingType";
                break;
            case 49:
                objArr[1] = "getNullableNothingType";
                break;
            case 50:
                objArr[1] = "getAnyType";
                break;
            case 51:
                objArr[1] = "getNullableAnyType";
                break;
            case 52:
                objArr[1] = "getDefaultBound";
                break;
            case 54:
                objArr[1] = "getPrimitiveKotlinType";
                break;
            case 55:
                objArr[1] = "getNumberType";
                break;
            case 56:
                objArr[1] = "getByteType";
                break;
            case 57:
                objArr[1] = "getShortType";
                break;
            case 58:
                objArr[1] = "getIntType";
                break;
            case 59:
                objArr[1] = "getLongType";
                break;
            case 60:
                objArr[1] = "getFloatType";
                break;
            case 61:
                objArr[1] = "getDoubleType";
                break;
            case 62:
                objArr[1] = "getCharType";
                break;
            case 63:
                objArr[1] = "getBooleanType";
                break;
            case 64:
                objArr[1] = "getUnitType";
                break;
            case 65:
                objArr[1] = "getStringType";
                break;
            case 66:
                objArr[1] = "getIterableType";
                break;
            case 68:
            case 69:
            case 70:
                objArr[1] = "getArrayElementType";
                break;
            case 74:
                objArr[1] = "getPrimitiveArrayKotlinType";
                break;
            case 81:
            case 84:
                objArr[1] = "getArrayType";
                break;
            case 86:
                objArr[1] = "getEnumType";
                break;
            case 87:
                objArr[1] = "getAnnotationType";
                break;
        }
        switch (i10) {
            case 1:
                objArr[2] = "setBuiltInsModule";
                break;
            case 2:
                objArr[2] = "setPostponedBuiltinsModuleComputation";
                break;
            case 3:
            case 4:
            case 5:
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
            case 8:
            case 11:
            case 13:
            case 15:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 68:
            case 69:
            case 70:
            case 74:
            case 81:
            case 84:
            case 86:
            case 87:
                break;
            case 9:
                objArr[2] = "isBuiltIn";
                break;
            case 10:
                objArr[2] = "isUnderKotlinPackage";
                break;
            case 12:
                objArr[2] = "getBuiltInClassByFqName";
                break;
            case 14:
                objArr[2] = "getBuiltInClassByName";
                break;
            case 16:
                objArr[2] = "getPrimitiveClassDescriptor";
                break;
            case 17:
                objArr[2] = "getPrimitiveArrayClassDescriptor";
                break;
            case 46:
                objArr[2] = "getBuiltInTypeByClassName";
                break;
            case 53:
                objArr[2] = "getPrimitiveKotlinType";
                break;
            case 67:
                objArr[2] = "getArrayElementType";
                break;
            case 71:
            case 72:
                objArr[2] = "getElementTypeForUnsignedArray";
                break;
            case 73:
                objArr[2] = "getPrimitiveArrayKotlinType";
                break;
            case 75:
                objArr[2] = "getPrimitiveArrayKotlinTypeByPrimitiveKotlinType";
                break;
            case 76:
            case 93:
                objArr[2] = "getPrimitiveType";
                break;
            case 77:
                objArr[2] = "getPrimitiveArrayType";
                break;
            case 78:
            case 79:
            case 80:
            case 82:
            case 83:
                objArr[2] = "getArrayType";
                break;
            case 85:
                objArr[2] = "getEnumType";
                break;
            case ModuleDescriptor.MODULE_VERSION /* 88 */:
                objArr[2] = "isArray";
                break;
            case 89:
            case 90:
                objArr[2] = "isArrayOrPrimitiveArray";
                break;
            case 91:
                objArr[2] = "isPrimitiveArray";
                break;
            case 92:
                objArr[2] = "getPrimitiveArrayElementType";
                break;
            case 94:
                objArr[2] = "isPrimitiveType";
                break;
            case 95:
                objArr[2] = "isPrimitiveTypeOrNullablePrimitiveType";
                break;
            case 96:
                objArr[2] = "isPrimitiveClass";
                break;
            case 97:
            case 98:
            case 99:
            case 100:
                objArr[2] = "isConstructedFromGivenClass";
                break;
            case 101:
            case 102:
                objArr[2] = "isTypeConstructorForGivenClass";
                break;
            case 103:
            case 104:
                objArr[2] = "classFqNameEquals";
                break;
            case 105:
            case 106:
                objArr[2] = "isNotNullConstructedFromGivenClass";
                break;
            case 107:
                objArr[2] = "isSpecialClassWithNoSupertypes";
                break;
            case 108:
            case 109:
                objArr[2] = "isAny";
                break;
            case 110:
            case 112:
                objArr[2] = "isBoolean";
                break;
            case 111:
                objArr[2] = "isBooleanOrNullableBoolean";
                break;
            case 113:
                objArr[2] = "isNumber";
                break;
            case 114:
                objArr[2] = "isChar";
                break;
            case 115:
                objArr[2] = "isCharOrNullableChar";
                break;
            case 116:
                objArr[2] = "isInt";
                break;
            case 117:
                objArr[2] = "isByte";
                break;
            case 118:
                objArr[2] = "isLong";
                break;
            case 119:
                objArr[2] = "isLongOrNullableLong";
                break;
            case 120:
                objArr[2] = "isShort";
                break;
            case 121:
                objArr[2] = "isFloat";
                break;
            case 122:
                objArr[2] = "isFloatOrNullableFloat";
                break;
            case 123:
                objArr[2] = "isDouble";
                break;
            case 124:
                objArr[2] = "isUByte";
                break;
            case 125:
                objArr[2] = "isUShort";
                break;
            case 126:
                objArr[2] = "isUInt";
                break;
            case 127:
                objArr[2] = "isULong";
                break;
            case BuildConfig.SDK_TRUNCATE_LENGTH /* 128 */:
                objArr[2] = "isUByteArray";
                break;
            case 129:
                objArr[2] = "isUShortArray";
                break;
            case 130:
                objArr[2] = "isUIntArray";
                break;
            case 131:
                objArr[2] = "isULongArray";
                break;
            case 132:
                objArr[2] = "isUnsignedArrayType";
                break;
            case 133:
                objArr[2] = "isDoubleOrNullableDouble";
                break;
            case 134:
            case 135:
                objArr[2] = "isConstructedFromGivenClassAndNotNullable";
                break;
            case 136:
                objArr[2] = "isNothing";
                break;
            case 137:
                objArr[2] = "isNullableNothing";
                break;
            case 138:
                objArr[2] = "isNothingOrNullableNothing";
                break;
            case 139:
                objArr[2] = "isAnyOrNullableAny";
                break;
            case 140:
                objArr[2] = "isNullableAny";
                break;
            case 141:
                objArr[2] = "isDefaultBound";
                break;
            case 142:
                objArr[2] = "isUnit";
                break;
            case 143:
                objArr[2] = "isUnitOrNullableUnit";
                break;
            case 144:
                objArr[2] = "isBooleanOrSubtype";
                break;
            case 145:
                objArr[2] = "isMemberOfAny";
                break;
            case 146:
            case 147:
                objArr[2] = "isEnum";
                break;
            case 148:
            case 149:
                objArr[2] = "isComparable";
                break;
            case 150:
                objArr[2] = "isCollectionOrNullableCollection";
                break;
            case 151:
                objArr[2] = "isListOrNullableList";
                break;
            case 152:
                objArr[2] = "isSetOrNullableSet";
                break;
            case 153:
                objArr[2] = "isMapOrNullableMap";
                break;
            case 154:
                objArr[2] = "isIterableOrNullableIterable";
                break;
            case 155:
                objArr[2] = "isThrowableOrNullableThrowable";
                break;
            case 156:
                objArr[2] = "isThrowable";
                break;
            case 157:
                objArr[2] = "isKClass";
                break;
            case 158:
                objArr[2] = "isNonPrimitiveArray";
                break;
            case 159:
                objArr[2] = "isCloneable";
                break;
            case 160:
                objArr[2] = "isDeprecated";
                break;
            case 161:
                objArr[2] = "isNotNullOrNullableFunctionSupertype";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i10) {
            case 3:
            case 4:
            case 5:
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
            case 8:
            case 11:
            case 13:
            case 15:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 68:
            case 69:
            case 70:
            case 74:
            case 81:
            case 84:
            case 86:
            case 87:
                throw new IllegalStateException(str2);
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: b */
    public static AbstractC5265x m13541b(AbstractC6795c abstractC6795c, String str) {
        if (str == null) {
            abstractC6795c.getClass();
            m13540a(46);
            throw null;
        }
        AbstractC5265x abstractC5265xMo5316v = abstractC6795c.m13554k(str).mo5316v();
        if (abstractC5265xMo5316v != null) {
            return abstractC5265xMo5316v;
        }
        m13540a(47);
        throw null;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: c */
    public static boolean m13542c(InterfaceC8834e interfaceC8834e, C7647d c7647d) {
        if (interfaceC8834e == null) {
            m13540a(103);
            throw null;
        }
        if (c7647d != null) {
            return interfaceC8834e.mo11874a().equals(c7647d.m15228g()) && c7647d.equals(C8413d.m16448g(interfaceC8834e));
        }
        m13540a(104);
        throw null;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: s */
    public static PrimitiveType m13543s(InterfaceC8834e interfaceC8834e) {
        if (interfaceC8834e == null) {
            m13540a(77);
            throw null;
        }
        if (C6797e.a.f38376a0.contains(interfaceC8834e.mo11874a())) {
            return (PrimitiveType) C6797e.a.f38380c0.get(C8413d.m16448g(interfaceC8834e));
        }
        return null;
    }

    /* JADX INFO: renamed from: u */
    public static PrimitiveType m13544u(InterfaceC8838g interfaceC8838g) {
        if (interfaceC8838g == null) {
            m13540a(76);
            throw null;
        }
        if (C6797e.a.f38374Z.contains(interfaceC8838g.mo11874a())) {
            return (PrimitiveType) C6797e.a.f38378b0.get(C8413d.m16448g(interfaceC8838g));
        }
        return null;
    }

    /* JADX INFO: renamed from: y */
    public static boolean m13545y(AbstractC5257t abstractC5257t) {
        if (abstractC5257t != null) {
            return m13529B(abstractC5257t, C6797e.a.f38375a);
        }
        m13540a(139);
        throw null;
    }

    /* JADX INFO: renamed from: z */
    public static boolean m13546z(AbstractC5257t abstractC5257t) {
        if (abstractC5257t != null) {
            return m13529B(abstractC5257t, C6797e.a.f38384g);
        }
        m13540a(88);
        throw null;
    }

    /* JADX INFO: renamed from: d */
    public final void m13547d(boolean z10) {
        C7648e c7648e = f38322e;
        C5207g.m11111f(c7648e, "moduleName");
        InterfaceC2076h interfaceC2076h = this.f38326d;
        C5207g.m11111f(interfaceC2076h, "storageManager");
        C6829c c6829c = new C6829c(c7648e, interfaceC2076h, this, 48);
        this.f38323a = c6829c;
        BuiltInsLoader.f38313a.getClass();
        InterfaceC8866x interfaceC8866xMo13527a = BuiltInsLoader.Companion.f38315b.getValue().mo13527a(this.f38326d, this.f38323a, mo13556m(), mo13560q(), mo13548e(), z10);
        C5207g.m11111f(interfaceC8866xMo13527a, "providerForModuleContent");
        c6829c.f38569h = interfaceC8866xMo13527a;
        C6829c c6829c2 = this.f38323a;
        c6829c2.m13642P0(c6829c2);
    }

    /* JADX INFO: renamed from: e */
    public InterfaceC9339a mo13548e() {
        return InterfaceC9339a.a.f48072a;
    }

    /* JADX INFO: renamed from: f */
    public final AbstractC5265x m13549f() {
        AbstractC5265x abstractC5265xMo5316v = m13554k("Any").mo5316v();
        if (abstractC5265xMo5316v != null) {
            return abstractC5265xMo5316v;
        }
        m13540a(50);
        throw null;
    }

    /* JADX WARN: Unreachable blocks removed: 3, instructions: 3 */
    /* JADX INFO: renamed from: g */
    public final AbstractC5257t m13550g(AbstractC5257t abstractC5257t) {
        C7645b c7645bM14109f;
        C7645b c7645b;
        InterfaceC8830c interfaceC8830cM13584a;
        AbstractC5265x abstractC5265xMo5316v = null;
        if (abstractC5257t == null) {
            m13540a(67);
            throw null;
        }
        if (m13546z(abstractC5257t)) {
            if (abstractC5257t.mo11240V0().size() != 1) {
                throw new IllegalStateException();
            }
            AbstractC5257t abstractC5257tMo11236c = abstractC5257t.mo11240V0().get(0).mo11236c();
            if (abstractC5257tMo11236c != null) {
                return abstractC5257tMo11236c;
            }
            m13540a(68);
            throw null;
        }
        AbstractC5262v0 abstractC5262v0M11298i = C5258t0.m11298i(abstractC5257t);
        AbstractC5265x abstractC5265x = this.f38324b.mo807E().f38329c.get(abstractC5262v0M11298i);
        if (abstractC5265x != null) {
            return abstractC5265x;
        }
        int i10 = C8413d.f45539a;
        InterfaceC8834e interfaceC8834eMo11235q = abstractC5262v0M11298i.mo11250X0().mo11235q();
        InterfaceC8863u interfaceC8863uM16446e = interfaceC8834eMo11235q == null ? null : C8413d.m16446e(interfaceC8834eMo11235q);
        if (interfaceC8863uM16446e != null) {
            InterfaceC8834e interfaceC8834eMo11235q2 = abstractC5262v0M11298i.mo11250X0().mo11235q();
            if (interfaceC8834eMo11235q2 != null) {
                Set<C7648e> set = C8091h.f43909a;
                C7648e c7648eMo11874a = interfaceC8834eMo11235q2.mo11874a();
                C5207g.m11111f(c7648eMo11874a, "name");
                if (C8091h.f43913e.contains(c7648eMo11874a) && (c7645bM14109f = DescriptorUtilsKt.m14109f(interfaceC8834eMo11235q2)) != null && (c7645b = C8091h.f43911c.get(c7645bM14109f)) != null && (interfaceC8830cM13584a = FindClassInModuleKt.m13584a(interfaceC8863uM16446e, c7645b)) != null) {
                    abstractC5265xMo5316v = interfaceC8830cM13584a.mo5316v();
                }
            }
            if (abstractC5265xMo5316v != null) {
                return abstractC5265xMo5316v;
            }
        }
        throw new IllegalStateException("not array: " + abstractC5257t);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: h */
    public final AbstractC5265x m13551h(AbstractC5262v0 abstractC5262v0, Variance variance) {
        if (variance == null) {
            m13540a(82);
            throw null;
        }
        if (abstractC5262v0 != null) {
            return m13552i(variance, abstractC5262v0, InterfaceC9077e.a.f47365a);
        }
        m13540a(83);
        throw null;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: i */
    public final AbstractC5265x m13552i(Variance variance, AbstractC5257t abstractC5257t, InterfaceC9077e interfaceC9077e) {
        if (variance == null) {
            m13540a(78);
            throw null;
        }
        if (abstractC5257t != null) {
            return KotlinTypeFactory.m14186e(C0062b.m379o2(interfaceC9077e), m13554k("Array"), Collections.singletonList(new C5250p0(abstractC5257t, variance)));
        }
        m13540a(79);
        throw null;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: j */
    public final InterfaceC8830c m13553j(C7646c c7646c) {
        if (c7646c == null) {
            m13540a(12);
            throw null;
        }
        InterfaceC8830c interfaceC8830cM11016o1 = C5206f.m11016o1(m13555l(), c7646c, NoLookupLocation.FROM_BUILTINS);
        if (interfaceC8830cM11016o1 != null) {
            return interfaceC8830cM11016o1;
        }
        m13540a(13);
        throw null;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: k */
    public final InterfaceC8830c m13554k(String str) {
        if (str == null) {
            m13540a(14);
            throw null;
        }
        InterfaceC8830c interfaceC8830c = (InterfaceC8830c) ((LockBasedStorageManager.C7045k) this.f38325c).mo528n(C7648e.m15232l(str));
        if (interfaceC8830c != null) {
            return interfaceC8830c;
        }
        m13540a(15);
        throw null;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: l */
    public final C6829c m13555l() {
        C6829c c6829c = this.f38323a;
        c6829c.getClass();
        if (c6829c != null) {
            return c6829c;
        }
        m13540a(7);
        throw null;
    }

    /* JADX INFO: renamed from: m */
    public Iterable<InterfaceC9340b> mo13556m() {
        List listSingletonList = Collections.singletonList(new C8406a(this.f38326d, m13555l()));
        if (listSingletonList != null) {
            return listSingletonList;
        }
        m13540a(5);
        throw null;
    }

    /* JADX INFO: renamed from: n */
    public final AbstractC5265x m13557n() {
        return m13559p();
    }

    /* JADX INFO: renamed from: o */
    public final AbstractC5265x m13558o() {
        AbstractC5265x abstractC5265xMo5316v = m13554k("Nothing").mo5316v();
        if (abstractC5265xMo5316v != null) {
            return abstractC5265xMo5316v;
        }
        m13540a(48);
        throw null;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: p */
    public final AbstractC5265x m13559p() {
        AbstractC5265x abstractC5265xMo11219e1 = m13549f().mo11217b1(true);
        if (abstractC5265xMo11219e1 != null) {
            return abstractC5265xMo11219e1;
        }
        m13540a(51);
        throw null;
    }

    /* JADX INFO: renamed from: q */
    public InterfaceC9341c mo13560q() {
        return InterfaceC9341c.b.f48074a;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: r */
    public final AbstractC5265x m13561r(PrimitiveType primitiveType) {
        if (primitiveType == null) {
            m13540a(73);
            throw null;
        }
        AbstractC5265x abstractC5265x = this.f38324b.mo807E().f38327a.get(primitiveType);
        if (abstractC5265x != null) {
            return abstractC5265x;
        }
        m13540a(74);
        throw null;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: t */
    public final AbstractC5265x m13562t(PrimitiveType primitiveType) {
        if (primitiveType == null) {
            m13540a(53);
            throw null;
        }
        if (primitiveType == null) {
            m13540a(16);
            throw null;
        }
        AbstractC5265x abstractC5265xMo5316v = m13554k(primitiveType.getTypeName().m15235f()).mo5316v();
        if (abstractC5265xMo5316v != null) {
            return abstractC5265xMo5316v;
        }
        m13540a(54);
        throw null;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: v */
    public final AbstractC5265x m13563v() {
        AbstractC5265x abstractC5265xMo5316v = m13554k("String").mo5316v();
        if (abstractC5265xMo5316v != null) {
            return abstractC5265xMo5316v;
        }
        m13540a(65);
        throw null;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: w */
    public final InterfaceC8830c m13564w(int i10) {
        InterfaceC8830c interfaceC8830cM13553j = m13553j(C6797e.f38338d.m15215c(C7648e.m15232l(FunctionClassKind.SuspendFunction.getClassNamePrefix() + i10)));
        if (interfaceC8830cM13553j != null) {
            return interfaceC8830cM13553j;
        }
        m13540a(18);
        throw null;
    }

    /* JADX INFO: renamed from: x */
    public final AbstractC5265x m13565x() {
        AbstractC5265x abstractC5265xMo5316v = m13554k("Unit").mo5316v();
        if (abstractC5265xMo5316v != null) {
            return abstractC5265xMo5316v;
        }
        m13540a(64);
        throw null;
    }
}
