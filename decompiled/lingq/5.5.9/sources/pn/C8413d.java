package pn;

import androidx.datastore.preferences.PreferencesProto$Value;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import fo.C5602h;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6816a;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import mn.C7646c;
import mn.C7647d;
import mn.C7650g;
import p372rm.C8850m;
import p372rm.InterfaceC8830c;
import p372rm.InterfaceC8833d0;
import p372rm.InterfaceC8834e;
import p372rm.InterfaceC8836f;
import p372rm.InterfaceC8838g;
import p372rm.InterfaceC8839g0;
import p372rm.InterfaceC8844j;
import p372rm.InterfaceC8846k;
import p372rm.InterfaceC8863u;
import p372rm.InterfaceC8865w;
import p372rm.InterfaceC8868z;
import p543do.AbstractC5257t;
import p543do.InterfaceC5240k0;

/* JADX INFO: renamed from: pn.d */
/* JADX INFO: loaded from: classes2.dex */
public final class C8413d {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f45539a = 0;

    static {
        new C7646c("kotlin.jvm.JvmName");
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m16442a(int i10) {
        String str;
        int i11;
        switch (i10) {
            case 4:
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 60:
            case 62:
            case 69:
            case 73:
            case 80:
            case 81:
            case 83:
            case 86:
            case 91:
            case 93:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case 4:
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 60:
            case 62:
            case 69:
            case 73:
            case 80:
            case 81:
            case 83:
            case 86:
            case 91:
            case 93:
                i11 = 2;
                break;
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
            case 2:
            case 3:
            case 5:
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
            case 8:
            case 11:
            case 13:
            case 14:
            case 15:
            case 21:
            case 23:
            case 24:
            case 34:
            case 35:
            case 36:
            case 57:
            case 58:
            case 59:
            case 61:
            case 79:
            case 92:
            case 94:
                objArr[0] = "descriptor";
                break;
            case 4:
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 60:
            case 62:
            case 69:
            case 73:
            case 80:
            case 81:
            case 83:
            case 86:
            case 91:
            case 93:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorUtils";
                break;
            case 16:
                objArr[0] = "first";
                break;
            case 17:
                objArr[0] = "second";
                break;
            case 18:
            case 19:
                objArr[0] = "aClass";
                break;
            case 20:
                objArr[0] = "kotlinType";
                break;
            case 25:
                objArr[0] = "declarationDescriptor";
                break;
            case 26:
            case 28:
                objArr[0] = "subClass";
                break;
            case 27:
            case 29:
            case 33:
                objArr[0] = "superClass";
                break;
            case 30:
            case 32:
            case 45:
            case 64:
                objArr[0] = "type";
                break;
            case 31:
                objArr[0] = "other";
                break;
            case 37:
                objArr[0] = "classKind";
                break;
            case 38:
            case 39:
            case 41:
            case 44:
            case 48:
            case 54:
            case 65:
            case 66:
            case 67:
            case 74:
            case 75:
                objArr[0] = "classDescriptor";
                break;
            case 46:
                objArr[0] = "typeConstructor";
                break;
            case 55:
                objArr[0] = "innerClassName";
                break;
            case 56:
                objArr[0] = "location";
                break;
            case 63:
                objArr[0] = "variable";
                break;
            case 68:
                objArr[0] = "f";
                break;
            case 70:
                objArr[0] = "current";
                break;
            case 71:
                objArr[0] = "result";
                break;
            case 72:
                objArr[0] = "memberDescriptor";
                break;
            case 76:
            case 77:
            case 78:
                objArr[0] = "annotated";
                break;
            case 82:
            case 84:
            case 87:
            case 89:
                objArr[0] = "scope";
                break;
            case 85:
            case ModuleDescriptor.MODULE_VERSION /* 88 */:
            case 90:
                objArr[0] = "name";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i10) {
            case 4:
                objArr[1] = "getFqNameSafe";
                break;
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                objArr[1] = "getFqNameUnsafe";
                break;
            case 9:
            case 10:
                objArr[1] = "getFqNameFromTopLevelClass";
                break;
            case 12:
                objArr[1] = "getClassIdForNonLocalClass";
                break;
            case 22:
                objArr[1] = "getContainingModule";
                break;
            case 40:
                objArr[1] = "getSuperclassDescriptors";
                break;
            case 42:
            case 43:
                objArr[1] = "getSuperClassType";
                break;
            case 47:
                objArr[1] = "getClassDescriptorForTypeConstructor";
                break;
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
                objArr[1] = "getDefaultConstructorVisibility";
                break;
            case 60:
                objArr[1] = "unwrapFakeOverride";
                break;
            case 62:
                objArr[1] = "unwrapFakeOverrideToAnyDeclaration";
                break;
            case 69:
                objArr[1] = "getAllOverriddenDescriptors";
                break;
            case 73:
                objArr[1] = "getAllOverriddenDeclarations";
                break;
            case 80:
            case 81:
                objArr[1] = "getContainingSourceFile";
                break;
            case 83:
                objArr[1] = "getAllDescriptors";
                break;
            case 86:
                objArr[1] = "getFunctionByName";
                break;
            case 91:
                objArr[1] = "getPropertyByName";
                break;
            case 93:
                objArr[1] = "getDirectMember";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorUtils";
                break;
        }
        switch (i10) {
            case 1:
                objArr[2] = "isLocal";
                break;
            case 2:
                objArr[2] = "getFqName";
                break;
            case 3:
                objArr[2] = "getFqNameSafe";
                break;
            case 4:
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 60:
            case 62:
            case 69:
            case 73:
            case 80:
            case 81:
            case 83:
            case 86:
            case 91:
            case 93:
                break;
            case 5:
                objArr[2] = "getFqNameSafeIfPossible";
                break;
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                objArr[2] = "getFqNameUnsafe";
                break;
            case 8:
                objArr[2] = "getFqNameFromTopLevelClass";
                break;
            case 11:
                objArr[2] = "getClassIdForNonLocalClass";
                break;
            case 13:
                objArr[2] = "isExtension";
                break;
            case 14:
                objArr[2] = "isOverride";
                break;
            case 15:
                objArr[2] = "isStaticDeclaration";
                break;
            case 16:
            case 17:
                objArr[2] = "areInSameModule";
                break;
            case 18:
            case 19:
                objArr[2] = "getParentOfType";
                break;
            case 20:
            case 23:
                objArr[2] = "getContainingModuleOrNull";
                break;
            case 21:
                objArr[2] = "getContainingModule";
                break;
            case 24:
                objArr[2] = "getContainingClass";
                break;
            case 25:
                objArr[2] = "isAncestor";
                break;
            case 26:
            case 27:
                objArr[2] = "isDirectSubclass";
                break;
            case 28:
            case 29:
                objArr[2] = "isSubclass";
                break;
            case 30:
            case 31:
                objArr[2] = "isSameClass";
                break;
            case 32:
            case 33:
                objArr[2] = "isSubtypeOfClass";
                break;
            case 34:
                objArr[2] = "isAnonymousObject";
                break;
            case 35:
                objArr[2] = "isAnonymousFunction";
                break;
            case 36:
                objArr[2] = "isEnumEntry";
                break;
            case 37:
                objArr[2] = "isKindOf";
                break;
            case 38:
                objArr[2] = "hasAbstractMembers";
                break;
            case 39:
                objArr[2] = "getSuperclassDescriptors";
                break;
            case 41:
                objArr[2] = "getSuperClassType";
                break;
            case 44:
                objArr[2] = "getSuperClassDescriptor";
                break;
            case 45:
                objArr[2] = "getClassDescriptorForType";
                break;
            case 46:
                objArr[2] = "getClassDescriptorForTypeConstructor";
                break;
            case 48:
                objArr[2] = "getDefaultConstructorVisibility";
                break;
            case 54:
            case 55:
            case 56:
                objArr[2] = "getInnerClassByName";
                break;
            case 57:
                objArr[2] = "isStaticNestedClass";
                break;
            case 58:
                objArr[2] = "isTopLevelOrInnerClass";
                break;
            case 59:
                objArr[2] = "unwrapFakeOverride";
                break;
            case 61:
                objArr[2] = "unwrapFakeOverrideToAnyDeclaration";
                break;
            case 63:
            case 64:
                objArr[2] = "shouldRecordInitializerForProperty";
                break;
            case 65:
                objArr[2] = "classCanHaveAbstractFakeOverride";
                break;
            case 66:
                objArr[2] = "classCanHaveAbstractDeclaration";
                break;
            case 67:
                objArr[2] = "classCanHaveOpenMembers";
                break;
            case 68:
                objArr[2] = "getAllOverriddenDescriptors";
                break;
            case 70:
            case 71:
                objArr[2] = "collectAllOverriddenDescriptors";
                break;
            case 72:
                objArr[2] = "getAllOverriddenDeclarations";
                break;
            case 74:
                objArr[2] = "isSingletonOrAnonymousObject";
                break;
            case 75:
                objArr[2] = "canHaveDeclaredConstructors";
                break;
            case 76:
                objArr[2] = "getJvmName";
                break;
            case 77:
                objArr[2] = "findJvmNameAnnotation";
                break;
            case 78:
                objArr[2] = "hasJvmNameAnnotation";
                break;
            case 79:
                objArr[2] = "getContainingSourceFile";
                break;
            case 82:
                objArr[2] = "getAllDescriptors";
                break;
            case 84:
            case 85:
                objArr[2] = "getFunctionByName";
                break;
            case 87:
            case ModuleDescriptor.MODULE_VERSION /* 88 */:
                objArr[2] = "getFunctionByNameOrNull";
                break;
            case 89:
            case 90:
                objArr[2] = "getPropertyByName";
                break;
            case 92:
                objArr[2] = "getDirectMember";
                break;
            case 94:
                objArr[2] = "isMethodOfAny";
                break;
            default:
                objArr[2] = "getDispatchReceiverParameterIfNeeded";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i10) {
            case 4:
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 60:
            case 62:
            case 69:
            case 73:
            case 80:
            case 81:
            case 83:
            case 86:
            case 91:
            case 93:
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m16443b(InterfaceC6816a interfaceC6816a, LinkedHashSet linkedHashSet) {
        if (interfaceC6816a == null) {
            m16442a(70);
            throw null;
        }
        if (linkedHashSet.contains(interfaceC6816a)) {
            return;
        }
        Iterator<? extends InterfaceC6816a> it = interfaceC6816a.mo18004P0().mo11893p().iterator();
        while (it.hasNext()) {
            InterfaceC6816a interfaceC6816aMo11875b = it.next().mo18004P0();
            m16443b(interfaceC6816aMo11875b, linkedHashSet);
            linkedHashSet.add(interfaceC6816aMo11875b);
        }
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: c */
    public static InterfaceC8830c m16444c(AbstractC5257t abstractC5257t) {
        if (abstractC5257t == null) {
            m16442a(45);
            throw null;
        }
        InterfaceC5240k0 interfaceC5240k0Mo11250X0 = abstractC5257t.mo11250X0();
        if (interfaceC5240k0Mo11250X0 == null) {
            m16442a(46);
            throw null;
        }
        InterfaceC8830c interfaceC8830c = (InterfaceC8830c) interfaceC5240k0Mo11250X0.mo11235q();
        if (interfaceC8830c != null) {
            return interfaceC8830c;
        }
        m16442a(47);
        throw null;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: d */
    public static InterfaceC8863u m16445d(InterfaceC8838g interfaceC8838g) {
        if (interfaceC8838g == null) {
            m16442a(21);
            throw null;
        }
        InterfaceC8863u interfaceC8863uM16446e = m16446e(interfaceC8838g);
        if (interfaceC8863uM16446e != null) {
            return interfaceC8863uM16446e;
        }
        m16442a(22);
        throw null;
    }

    /* JADX INFO: renamed from: e */
    public static InterfaceC8863u m16446e(InterfaceC8838g interfaceC8838g) {
        InterfaceC8838g interfaceC8838gMo11876g = interfaceC8838g;
        if (interfaceC8838gMo11876g == null) {
            m16442a(23);
            throw null;
        }
        while (interfaceC8838gMo11876g != null) {
            if (interfaceC8838gMo11876g instanceof InterfaceC8863u) {
                return (InterfaceC8863u) interfaceC8838gMo11876g;
            }
            if (interfaceC8838gMo11876g instanceof InterfaceC8868z) {
                return ((InterfaceC8868z) interfaceC8838gMo11876g).mo13625C0();
            }
            interfaceC8838gMo11876g = interfaceC8838gMo11876g.mo11876g();
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public static InterfaceC8839g0 m16447f(InterfaceC8838g interfaceC8838g) {
        InterfaceC8838g interfaceC8838gMo13621K0 = interfaceC8838g;
        if (interfaceC8838gMo13621K0 == null) {
            m16442a(79);
            throw null;
        }
        if (interfaceC8838gMo13621K0 instanceof InterfaceC8833d0) {
            interfaceC8838gMo13621K0 = ((InterfaceC8833d0) interfaceC8838gMo13621K0).mo13621K0();
        }
        boolean z10 = interfaceC8838gMo13621K0 instanceof InterfaceC8844j;
        InterfaceC8839g0.a aVar = InterfaceC8839g0.f46731a;
        if (z10) {
            ((InterfaceC8844j) interfaceC8838gMo13621K0).mo11890j().mo12989a();
        }
        return aVar;
    }

    /* JADX INFO: renamed from: g */
    public static C7647d m16448g(InterfaceC8838g interfaceC8838g) {
        if (interfaceC8838g != null) {
            C7646c c7646cM16449h = m16449h(interfaceC8838g);
            return c7646cM16449h != null ? c7646cM16449h.m15221i() : m16448g(interfaceC8838g.mo11876g()).m15223b(interfaceC8838g.mo11874a());
        }
        m16442a(2);
        throw null;
    }

    /* JADX INFO: renamed from: h */
    public static C7646c m16449h(InterfaceC8838g interfaceC8838g) {
        if (interfaceC8838g == null) {
            m16442a(5);
            throw null;
        }
        if (!(interfaceC8838g instanceof InterfaceC8863u) && !C5602h.m11915f(interfaceC8838g)) {
            if (interfaceC8838g instanceof InterfaceC8868z) {
                return ((InterfaceC8868z) interfaceC8838g).mo13627e();
            }
            if (interfaceC8838g instanceof InterfaceC8865w) {
                return ((InterfaceC8865w) interfaceC8838g).mo17120e();
            }
            return null;
        }
        return C7646c.f42076c;
    }

    /* JADX INFO: renamed from: i */
    public static <D extends InterfaceC8838g> D m16450i(InterfaceC8838g interfaceC8838g, Class<D> cls, boolean z10) {
        InterfaceC8838g interfaceC8838g2 = interfaceC8838g;
        if (interfaceC8838g2 == null) {
            return null;
        }
        if (z10) {
            interfaceC8838g2 = (D) interfaceC8838g2.mo11876g();
        }
        while (interfaceC8838g2 != null) {
            if (cls.isInstance(interfaceC8838g2)) {
                return (D) interfaceC8838g2;
            }
            interfaceC8838g2 = (D) interfaceC8838g2.mo11876g();
        }
        return null;
    }

    /* JADX INFO: renamed from: j */
    public static InterfaceC8830c m16451j(InterfaceC8830c interfaceC8830c) {
        if (interfaceC8830c == null) {
            m16442a(44);
            throw null;
        }
        Iterator<AbstractC5257t> it = interfaceC8830c.mo13600k().mo11278p().iterator();
        while (it.hasNext()) {
            InterfaceC8830c interfaceC8830cM16444c = m16444c(it.next());
            if (interfaceC8830cM16444c.mo13602u() != ClassKind.INTERFACE) {
                return interfaceC8830cM16444c;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: k */
    public static boolean m16452k(InterfaceC8838g interfaceC8838g) {
        return m16455n(interfaceC8838g, ClassKind.CLASS) && interfaceC8838g.mo11874a().equals(C7650g.f42089a);
    }

    /* JADX INFO: renamed from: l */
    public static boolean m16453l(InterfaceC8838g interfaceC8838g) {
        return m16455n(interfaceC8838g, ClassKind.OBJECT) && ((InterfaceC8830c) interfaceC8838g).mo13589E();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: m */
    public static boolean m16454m(InterfaceC8838g interfaceC8838g) {
        if (interfaceC8838g != null) {
            return m16455n(interfaceC8838g, ClassKind.ENUM_ENTRY);
        }
        m16442a(36);
        throw null;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: n */
    public static boolean m16455n(InterfaceC8838g interfaceC8838g, ClassKind classKind) {
        if (classKind != null) {
            return (interfaceC8838g instanceof InterfaceC8830c) && ((InterfaceC8830c) interfaceC8838g).mo13602u() == classKind;
        }
        m16442a(37);
        throw null;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: o */
    public static boolean m16456o(InterfaceC8838g interfaceC8838g) {
        InterfaceC8838g interfaceC8838gMo11876g = interfaceC8838g;
        if (interfaceC8838gMo11876g == null) {
            m16442a(1);
            throw null;
        }
        while (true) {
            boolean z10 = false;
            if (interfaceC8838gMo11876g == null) {
                return false;
            }
            if (!m16452k(interfaceC8838gMo11876g)) {
                if ((interfaceC8838gMo11876g instanceof InterfaceC8846k) && ((InterfaceC8846k) interfaceC8838gMo11876g).mo11886f() == C8850m.f46739f) {
                    z10 = true;
                }
                if (!z10) {
                    interfaceC8838gMo11876g = interfaceC8838gMo11876g.mo11876g();
                }
            }
            return true;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: p */
    public static boolean m16457p(AbstractC5257t abstractC5257t, InterfaceC8830c interfaceC8830c) {
        if (abstractC5257t == null) {
            m16442a(30);
            throw null;
        }
        if (interfaceC8830c == null) {
            m16442a(31);
            throw null;
        }
        InterfaceC8834e interfaceC8834eMo11235q = abstractC5257t.mo11250X0().mo11235q();
        if (interfaceC8834eMo11235q != null) {
            InterfaceC8838g interfaceC8838gMo11875b = interfaceC8834eMo11235q.mo18004P0();
            if ((interfaceC8838gMo11875b instanceof InterfaceC8834e) && interfaceC8830c.mo13600k().equals(((InterfaceC8834e) interfaceC8838gMo11875b).mo13600k())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: q */
    public static boolean m16458q(InterfaceC8836f interfaceC8836f) {
        if (m16455n(interfaceC8836f, ClassKind.CLASS) || m16455n(interfaceC8836f, ClassKind.INTERFACE)) {
            if (((InterfaceC8830c) interfaceC8836f).mo11891l() == Modality.SEALED) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: r */
    public static boolean m16459r(InterfaceC8830c interfaceC8830c, InterfaceC8830c interfaceC8830c2) {
        return m16460s(interfaceC8830c.mo5316v(), interfaceC8830c2.mo18004P0());
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: s */
    public static boolean m16460s(AbstractC5257t abstractC5257t, InterfaceC8830c interfaceC8830c) {
        if (abstractC5257t == null) {
            m16442a(32);
            throw null;
        }
        if (interfaceC8830c == null) {
            m16442a(33);
            throw null;
        }
        if (m16457p(abstractC5257t, interfaceC8830c)) {
            return true;
        }
        Iterator<AbstractC5257t> it = abstractC5257t.mo11250X0().mo11278p().iterator();
        while (it.hasNext()) {
            if (m16460s(it.next(), interfaceC8830c)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: t */
    public static boolean m16461t(InterfaceC8838g interfaceC8838g) {
        return interfaceC8838g != null && (interfaceC8838g.mo11876g() instanceof InterfaceC8865w);
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: u */
    public static <D extends CallableMemberDescriptor> D m16462u(D d10) {
        D d11 = d10;
        if (d11 == null) {
            m16442a(59);
            throw null;
        }
        while (d11.mo11897u() == CallableMemberDescriptor.Kind.FAKE_OVERRIDE) {
            Collection<? extends CallableMemberDescriptor> collectionMo11893p = d11.mo11893p();
            if (collectionMo11893p.isEmpty()) {
                throw new IllegalStateException("Fake override should have at least one overridden descriptor: " + d11);
            }
            d11 = (D) collectionMo11893p.iterator().next();
        }
        return d11;
    }

    /* JADX INFO: renamed from: v */
    public static <D extends InterfaceC8846k> D m16463v(D d10) {
        return d10 instanceof CallableMemberDescriptor ? m16462u((CallableMemberDescriptor) d10) : d10;
    }
}
