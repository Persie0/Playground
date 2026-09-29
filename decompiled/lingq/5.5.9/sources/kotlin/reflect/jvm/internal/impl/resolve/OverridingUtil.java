package kotlin.reflect.jvm.internal.impl.resolve;

import ae.C0062b;
import androidx.datastore.preferences.PreferencesProto$Value;
import cm.InterfaceC2052l;
import cm.InterfaceC2056p;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import dm.C5207g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.ServiceLoader;
import jo.C6532d;
import kotlin.collections.C6752c;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6816a;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6822c;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC6823d;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractC6828b;
import kotlin.reflect.jvm.internal.impl.types.C7057a;
import kotlin.reflect.jvm.internal.impl.types.TypeCheckerState;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypePreparator;
import mn.C7648e;
import p102eo.AbstractC5439d;
import p102eo.InterfaceC5438c;
import p260m8.C7499b;
import p372rm.AbstractC8852n;
import p372rm.C8850m;
import p372rm.InterfaceC8829b0;
import p372rm.InterfaceC8830c;
import p372rm.InterfaceC8833d0;
import p372rm.InterfaceC8835e0;
import p372rm.InterfaceC8838g;
import p372rm.InterfaceC8846k;
import p372rm.InterfaceC8847k0;
import p372rm.InterfaceC8853n0;
import p420um.AbstractC9560c0;
import p420um.C9562d0;
import p543do.AbstractC5257t;
import p543do.AbstractC5262v0;
import p543do.InterfaceC5240k0;
import pn.AbstractC8416g;
import pn.C8413d;
import pn.C8417h;
import pn.C8418i;
import pn.C8419j;
import pn.C8420k;
import pn.C8421l;
import pn.C8422m;
import sl.C9072e;
import tl.C9325m;

/* JADX INFO: loaded from: classes2.dex */
public final class OverridingUtil {

    /* JADX INFO: renamed from: e */
    public static final List<ExternalOverridabilityCondition> f39631e = C6752c.m13453u0(ServiceLoader.load(ExternalOverridabilityCondition.class, ExternalOverridabilityCondition.class.getClassLoader()));

    /* JADX INFO: renamed from: f */
    public static final OverridingUtil f39632f;

    /* JADX INFO: renamed from: g */
    public static final C7009a f39633g;

    /* JADX INFO: renamed from: a */
    public final AbstractC5439d f39634a;

    /* JADX INFO: renamed from: b */
    public final KotlinTypePreparator f39635b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC5438c.a f39636c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC2056p<AbstractC5257t, AbstractC5257t, Boolean> f39637d;

    public static class OverrideCompatibilityInfo {

        /* JADX INFO: renamed from: b */
        public static final OverrideCompatibilityInfo f39638b = new OverrideCompatibilityInfo(Result.OVERRIDABLE, "SUCCESS");

        /* JADX INFO: renamed from: a */
        public final Result f39639a;

        public enum Result {
            OVERRIDABLE,
            INCOMPATIBLE,
            CONFLICT
        }

        public OverrideCompatibilityInfo(Result result, String str) {
            if (result != null) {
                this.f39639a = result;
            } else {
                m14087a(3);
                throw null;
            }
        }

        /* JADX WARN: Code duplicated, block: B:27:0x0040  */
        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m14087a(int i10) {
            String str = (i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4) ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[(i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4) ? 3 : 2];
            if (i10 == 1 || i10 == 2) {
                objArr[0] = "debugMessage";
            } else if (i10 == 3) {
                objArr[0] = "success";
            } else if (i10 != 4) {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$OverrideCompatibilityInfo";
            } else {
                objArr[0] = "debugMessage";
            }
            switch (i10) {
                case 1:
                case 2:
                case 3:
                case 4:
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$OverrideCompatibilityInfo";
                    break;
                case 5:
                    objArr[1] = "getResult";
                    break;
                case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                    objArr[1] = "getDebugMessage";
                    break;
                default:
                    objArr[1] = "success";
                    break;
            }
            if (i10 == 1) {
                objArr[2] = "incompatible";
            } else if (i10 == 2) {
                objArr[2] = "conflict";
            } else if (i10 == 3 || i10 == 4) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i10 != 1 && i10 != 2 && i10 != 3 && i10 != 4) {
                throw new IllegalStateException(str2);
            }
            throw new IllegalArgumentException(str2);
        }

        /* JADX INFO: renamed from: b */
        public static OverrideCompatibilityInfo m14088b(String str) {
            return new OverrideCompatibilityInfo(Result.CONFLICT, str);
        }

        /* JADX INFO: renamed from: d */
        public static OverrideCompatibilityInfo m14089d(String str) {
            return new OverrideCompatibilityInfo(Result.INCOMPATIBLE, str);
        }

        /* JADX INFO: renamed from: c */
        public final Result m14090c() {
            Result result = this.f39639a;
            if (result != null) {
                return result;
            }
            m14087a(5);
            throw null;
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil$a */
    public static class C7009a implements InterfaceC5438c.a {
        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* JADX INFO: renamed from: b */
        public static /* synthetic */ void m14091b(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "a";
            } else {
                objArr[0] = "b";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$1";
            objArr[2] = "equals";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // p102eo.InterfaceC5438c.a
        /* JADX INFO: renamed from: a */
        public final boolean mo11658a(InterfaceC5240k0 interfaceC5240k0, InterfaceC5240k0 interfaceC5240k1) {
            if (interfaceC5240k0 == null) {
                m14091b(0);
                throw null;
            }
            if (interfaceC5240k1 != null) {
                return interfaceC5240k0.equals(interfaceC5240k1);
            }
            m14091b(1);
            throw null;
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil$b */
    public static /* synthetic */ class C7010b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f39640a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f39641b;

        /* JADX INFO: renamed from: c */
        public static final /* synthetic */ int[] f39642c;

        static {
            int[] iArr = new int[Modality.values().length];
            f39642c = iArr;
            try {
                iArr[Modality.FINAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f39642c[Modality.SEALED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f39642c[Modality.OPEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f39642c[Modality.ABSTRACT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[OverrideCompatibilityInfo.Result.values().length];
            f39641b = iArr2;
            try {
                iArr2[OverrideCompatibilityInfo.Result.OVERRIDABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f39641b[OverrideCompatibilityInfo.Result.CONFLICT.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f39641b[OverrideCompatibilityInfo.Result.INCOMPATIBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr3 = new int[ExternalOverridabilityCondition.Result.values().length];
            f39640a = iArr3;
            try {
                iArr3[ExternalOverridabilityCondition.Result.OVERRIDABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f39640a[ExternalOverridabilityCondition.Result.CONFLICT.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f39640a[ExternalOverridabilityCondition.Result.INCOMPATIBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f39640a[ExternalOverridabilityCondition.Result.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    static {
        C7009a c7009a = new C7009a();
        f39633g = c7009a;
        f39632f = new OverridingUtil(c7009a, AbstractC5439d.a.f33983a, KotlinTypePreparator.C7059a.f39903a);
    }

    /* JADX WARN: Unreachable blocks removed: 3, instructions: 3 */
    public OverridingUtil(InterfaceC5438c.a aVar, AbstractC5439d.a aVar2, KotlinTypePreparator.C7059a c7059a) {
        if (aVar == null) {
            m14068a(5);
            throw null;
        }
        if (aVar2 == null) {
            m14068a(6);
            throw null;
        }
        if (c7059a == null) {
            m14068a(7);
            throw null;
        }
        this.f39636c = aVar;
        this.f39634a = aVar2;
        this.f39635b = c7059a;
        this.f39637d = null;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:17:0x0039 A[FALL_THROUGH] */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m14068a(int i10) {
        String str;
        int i11;
        if (i10 != 11 && i10 != 12 && i10 != 16 && i10 != 21 && i10 != 95 && i10 != 98 && i10 != 103 && i10 != 44 && i10 != 45) {
            switch (i10) {
                default:
                    switch (i10) {
                        default:
                            switch (i10) {
                                default:
                                    switch (i10) {
                                        case 90:
                                        case 91:
                                        case 92:
                                            break;
                                        default:
                                            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                                            break;
                                    }
                                case 80:
                                case 81:
                                case 82:
                                case 83:
                                case 84:
                                    str = "@NotNull method %s.%s must not return null";
                                    break;
                            }
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                        case 38:
                        case 39:
                            str = "@NotNull method %s.%s must not return null";
                            break;
                    }
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                    str = "@NotNull method %s.%s must not return null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i10 != 11 && i10 != 12 && i10 != 16 && i10 != 21 && i10 != 95 && i10 != 98 && i10 != 103 && i10 != 44 && i10 != 45) {
            switch (i10) {
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                    i11 = 2;
                    break;
                default:
                    switch (i10) {
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                        case 38:
                        case 39:
                            i11 = 2;
                            break;
                        default:
                            switch (i10) {
                                case 80:
                                case 81:
                                case 82:
                                case 83:
                                case 84:
                                    i11 = 2;
                                    break;
                                default:
                                    switch (i10) {
                                        case 90:
                                        case 91:
                                        case 92:
                                            i11 = 2;
                                            break;
                                        default:
                                            i11 = 3;
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        } else {
            i11 = 2;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                objArr[0] = "kotlinTypePreparator";
                break;
            case 2:
                objArr[0] = "customSubtype";
                break;
            case 3:
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
            default:
                objArr[0] = "kotlinTypeRefiner";
                break;
            case 4:
                objArr[0] = "equalityAxioms";
                break;
            case 5:
                objArr[0] = "axioms";
                break;
            case 8:
            case 9:
                objArr[0] = "candidateSet";
                break;
            case 10:
                objArr[0] = "transformFirst";
                break;
            case 11:
            case 12:
            case 16:
            case 21:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 44:
            case 45:
            case 80:
            case 81:
            case 82:
            case 83:
            case 84:
            case 90:
            case 91:
            case 92:
            case 95:
            case 98:
            case 103:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil";
                break;
            case 13:
                objArr[0] = "f";
                break;
            case 14:
                objArr[0] = "g";
                break;
            case 15:
            case 17:
                objArr[0] = "descriptor";
                break;
            case 18:
                objArr[0] = "result";
                break;
            case 19:
            case 22:
            case 30:
            case 40:
                objArr[0] = "superDescriptor";
                break;
            case 20:
            case 23:
            case 31:
            case 41:
                objArr[0] = "subDescriptor";
                break;
            case 42:
                objArr[0] = "firstParameters";
                break;
            case 43:
                objArr[0] = "secondParameters";
                break;
            case 46:
                objArr[0] = "typeInSuper";
                break;
            case 47:
                objArr[0] = "typeInSub";
                break;
            case 48:
            case 51:
            case 77:
                objArr[0] = "typeCheckerState";
                break;
            case 49:
                objArr[0] = "superTypeParameter";
                break;
            case 50:
                objArr[0] = "subTypeParameter";
                break;
            case 52:
                objArr[0] = "name";
                break;
            case 53:
                objArr[0] = "membersFromSupertypes";
                break;
            case 54:
                objArr[0] = "membersFromCurrent";
                break;
            case 55:
            case 61:
            case 64:
            case 86:
            case 89:
            case 96:
                objArr[0] = "current";
                break;
            case 56:
            case 62:
            case 66:
            case 87:
            case 106:
                objArr[0] = "strategy";
                break;
            case 57:
                objArr[0] = "overriding";
                break;
            case 58:
                objArr[0] = "fromSuper";
                break;
            case 59:
                objArr[0] = "fromCurrent";
                break;
            case 60:
                objArr[0] = "descriptorsFromSuper";
                break;
            case 63:
            case 65:
                objArr[0] = "notOverridden";
                break;
            case 67:
            case 69:
            case 73:
                objArr[0] = "a";
                break;
            case 68:
            case 70:
            case 75:
                objArr[0] = "b";
                break;
            case 71:
                objArr[0] = "candidate";
                break;
            case 72:
            case ModuleDescriptor.MODULE_VERSION /* 88 */:
            case 93:
            case 109:
                objArr[0] = "descriptors";
                break;
            case 74:
                objArr[0] = "aReturnType";
                break;
            case 76:
                objArr[0] = "bReturnType";
                break;
            case 78:
            case 85:
                objArr[0] = "overridables";
                break;
            case 79:
            case 101:
                objArr[0] = "descriptorByHandle";
                break;
            case 94:
                objArr[0] = "classModality";
                break;
            case 97:
                objArr[0] = "toFilter";
                break;
            case 99:
            case 104:
                objArr[0] = "overrider";
                break;
            case 100:
            case 105:
                objArr[0] = "extractFrom";
                break;
            case 102:
                objArr[0] = "onConflict";
                break;
            case 107:
            case 108:
                objArr[0] = "memberDescriptor";
                break;
        }
        if (i10 == 11 || i10 == 12) {
            objArr[1] = "filterOverrides";
        } else if (i10 == 16) {
            objArr[1] = "getOverriddenDeclarations";
        } else if (i10 == 21) {
            objArr[1] = "isOverridableBy";
        } else if (i10 == 95) {
            objArr[1] = "getMinimalModality";
        } else if (i10 == 98) {
            objArr[1] = "filterVisibleFakeOverrides";
        } else if (i10 == 103) {
            objArr[1] = "extractMembersOverridableInBothWays";
        } else if (i10 != 44 && i10 != 45) {
            switch (i10) {
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                    objArr[1] = "isOverridableBy";
                    break;
                default:
                    switch (i10) {
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                        case 38:
                        case 39:
                            objArr[1] = "isOverridableByWithoutExternalConditions";
                            break;
                        default:
                            switch (i10) {
                                case 80:
                                case 81:
                                case 82:
                                case 83:
                                case 84:
                                    objArr[1] = "selectMostSpecificMember";
                                    break;
                                default:
                                    switch (i10) {
                                        case 90:
                                        case 91:
                                        case 92:
                                            objArr[1] = "determineModalityForFakeOverride";
                                            break;
                                        default:
                                            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil";
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        } else {
            objArr[1] = "createTypeCheckerState";
        }
        switch (i10) {
            case 1:
            case 2:
                objArr[2] = "createWithTypePreparatorAndCustomSubtype";
                break;
            case 3:
            case 4:
                objArr[2] = "create";
                break;
            case 5:
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                objArr[2] = "<init>";
                break;
            case 8:
                objArr[2] = "filterOutOverridden";
                break;
            case 9:
            case 10:
                objArr[2] = "filterOverrides";
                break;
            case 11:
            case 12:
            case 16:
            case 21:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 44:
            case 45:
            case 80:
            case 81:
            case 82:
            case 83:
            case 84:
            case 90:
            case 91:
            case 92:
            case 95:
            case 98:
            case 103:
                break;
            case 13:
            case 14:
                objArr[2] = "overrides";
                break;
            case 15:
                objArr[2] = "getOverriddenDeclarations";
                break;
            case 17:
            case 18:
                objArr[2] = "collectOverriddenDeclarations";
                break;
            case 19:
            case 20:
            case 22:
            case 23:
                objArr[2] = "isOverridableBy";
                break;
            case 30:
            case 31:
                objArr[2] = "isOverridableByWithoutExternalConditions";
                break;
            case 40:
            case 41:
                objArr[2] = "getBasicOverridabilityProblem";
                break;
            case 42:
            case 43:
                objArr[2] = "createTypeCheckerState";
                break;
            case 46:
            case 47:
            case 48:
                objArr[2] = "areTypesEquivalent";
                break;
            case 49:
            case 50:
            case 51:
                objArr[2] = "areTypeParametersEquivalent";
                break;
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
                objArr[2] = "generateOverridesInFunctionGroup";
                break;
            case 57:
            case 58:
                objArr[2] = "isVisibleForOverride";
                break;
            case 59:
            case 60:
            case 61:
            case 62:
                objArr[2] = "extractAndBindOverridesForMember";
                break;
            case 63:
                objArr[2] = "allHasSameContainingDeclaration";
                break;
            case 64:
            case 65:
            case 66:
                objArr[2] = "createAndBindFakeOverrides";
                break;
            case 67:
            case 68:
                objArr[2] = "isMoreSpecific";
                break;
            case 69:
            case 70:
                objArr[2] = "isVisibilityMoreSpecific";
                break;
            case 71:
            case 72:
                objArr[2] = "isMoreSpecificThenAllOf";
                break;
            case 73:
            case 74:
            case 75:
            case 76:
            case 77:
                objArr[2] = "isReturnTypeMoreSpecific";
                break;
            case 78:
            case 79:
                objArr[2] = "selectMostSpecificMember";
                break;
            case 85:
            case 86:
            case 87:
                objArr[2] = "createAndBindFakeOverride";
                break;
            case ModuleDescriptor.MODULE_VERSION /* 88 */:
            case 89:
                objArr[2] = "determineModalityForFakeOverride";
                break;
            case 93:
            case 94:
                objArr[2] = "getMinimalModality";
                break;
            case 96:
            case 97:
                objArr[2] = "filterVisibleFakeOverrides";
                break;
            case 99:
            case 100:
            case 101:
            case 102:
            case 104:
            case 105:
            case 106:
                objArr[2] = "extractMembersOverridableInBothWays";
                break;
            case 107:
                objArr[2] = "resolveUnknownVisibilityForMember";
                break;
            case 108:
                objArr[2] = "computeVisibilityToInherit";
                break;
            case 109:
                objArr[2] = "findMaxVisibility";
                break;
            default:
                objArr[2] = "createWithTypeRefiner";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 != 11 && i10 != 12 && i10 != 16 && i10 != 21 && i10 != 95 && i10 != 98 && i10 != 103 && i10 != 44 && i10 != 45) {
            switch (i10) {
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                    break;
                default:
                    switch (i10) {
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                        case 38:
                        case 39:
                            break;
                        default:
                            switch (i10) {
                                case 80:
                                case 81:
                                case 82:
                                case 83:
                                case 84:
                                    break;
                                default:
                                    switch (i10) {
                                        case 90:
                                        case 91:
                                        case 92:
                                            break;
                                        default:
                                            throw new IllegalArgumentException(str2);
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        }
        throw new IllegalStateException(str2);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m14069b(AbstractC5257t abstractC5257t, AbstractC5257t abstractC5257t2, TypeCheckerState typeCheckerState) {
        if (abstractC5257t == null) {
            m14068a(46);
            throw null;
        }
        if (abstractC5257t2 == null) {
            m14068a(47);
            throw null;
        }
        if (C7499b.m14926X(abstractC5257t) && C7499b.m14926X(abstractC5257t2)) {
            return true;
        }
        return C7057a.m14211e(typeCheckerState, abstractC5257t.mo11288a1(), abstractC5257t2.mo11288a1());
    }

    /* JADX INFO: renamed from: c */
    public static void m14070c(CallableMemberDescriptor callableMemberDescriptor, LinkedHashSet linkedHashSet) {
        if (callableMemberDescriptor == null) {
            m14068a(17);
            throw null;
        }
        if (callableMemberDescriptor.mo11897u().isReal()) {
            linkedHashSet.add(callableMemberDescriptor);
            return;
        }
        if (callableMemberDescriptor.mo11893p().isEmpty()) {
            throw new IllegalStateException("No overridden descriptors found for (fake override) " + callableMemberDescriptor);
        }
        Iterator<? extends CallableMemberDescriptor> it = callableMemberDescriptor.mo11893p().iterator();
        while (it.hasNext()) {
            m14070c(it.next(), linkedHashSet);
        }
    }

    /* JADX INFO: renamed from: d */
    public static ArrayList m14071d(InterfaceC6816a interfaceC6816a) {
        InterfaceC8835e0 interfaceC8835e0Mo11896s0 = interfaceC6816a.mo11896s0();
        ArrayList arrayList = new ArrayList();
        if (interfaceC8835e0Mo11896s0 != null) {
            arrayList.add(interfaceC8835e0Mo11896s0.mo11884c());
        }
        Iterator<InterfaceC8853n0> it = interfaceC6816a.mo11889i().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().mo11884c());
        }
        return arrayList;
    }

    /* JADX WARN: Unreachable blocks removed: 3, instructions: 3 */
    /* JADX INFO: renamed from: e */
    public static void m14072e(Collection collection, InterfaceC8830c interfaceC8830c, AbstractC8416g abstractC8416g) {
        Modality modalityMo11891l;
        InterfaceC6816a interfaceC6816a;
        InterfaceC6816a interfaceC6816a2;
        if (collection == null) {
            m14068a(85);
            throw null;
        }
        if (interfaceC8830c == null) {
            m14068a(86);
            throw null;
        }
        ArrayList arrayListM13420N = C6752c.m13420N(collection, new C8418i(interfaceC8830c));
        boolean zIsEmpty = arrayListM13420N.isEmpty();
        if (!zIsEmpty) {
            collection = arrayListM13420N;
        }
        Iterator it = collection.iterator();
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        while (true) {
            if (!it.hasNext()) {
                if (interfaceC8830c.mo11882T() && interfaceC8830c.mo11891l() != Modality.ABSTRACT && interfaceC8830c.mo11891l() != Modality.SEALED) {
                    z10 = true;
                }
                if (z11 && !z12) {
                    modalityMo11891l = Modality.OPEN;
                    if (modalityMo11891l != null) {
                        break;
                    }
                    m14068a(91);
                    throw null;
                }
                if (!z11 && z12) {
                    modalityMo11891l = z10 ? interfaceC8830c.mo11891l() : Modality.ABSTRACT;
                    if (modalityMo11891l != null) {
                        break;
                    }
                    m14068a(92);
                    throw null;
                }
                HashSet<CallableMemberDescriptor> hashSet = new HashSet();
                for (CallableMemberDescriptor callableMemberDescriptor : collection) {
                    if (callableMemberDescriptor == null) {
                        m14068a(15);
                        throw null;
                    }
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    m14070c(callableMemberDescriptor, linkedHashSet);
                    hashSet.addAll(linkedHashSet);
                }
                if (!hashSet.isEmpty()) {
                }
                if (hashSet.size() > 1) {
                    LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                    for (Object obj : hashSet) {
                        Iterator it2 = linkedHashSet2.iterator();
                        do {
                            while (true) {
                                if (!it2.hasNext()) {
                                    linkedHashSet2.add(obj);
                                    break;
                                }
                                interfaceC6816a = (InterfaceC6816a) obj;
                                interfaceC6816a2 = (InterfaceC6816a) it2.next();
                                if (m14079q(interfaceC6816a, interfaceC6816a2)) {
                                    it2.remove();
                                }
                            }
                        } while (!m14079q(interfaceC6816a2, interfaceC6816a));
                    }
                    hashSet = linkedHashSet2;
                }
                Modality modalityMo11891l2 = interfaceC8830c.mo11891l();
                if (modalityMo11891l2 == null) {
                    m14068a(94);
                    throw null;
                }
                Modality modality = Modality.ABSTRACT;
                for (CallableMemberDescriptor callableMemberDescriptor2 : hashSet) {
                    Modality modalityMo11891l3 = (z10 && callableMemberDescriptor2.mo11891l() == Modality.ABSTRACT) ? modalityMo11891l2 : callableMemberDescriptor2.mo11891l();
                    if (modalityMo11891l3.compareTo(modality) < 0) {
                        modality = modalityMo11891l3;
                    }
                }
                if (modality != null) {
                    modalityMo11891l = modality;
                    break;
                } else {
                    m14068a(95);
                    throw null;
                }
            }
            CallableMemberDescriptor callableMemberDescriptor3 = (CallableMemberDescriptor) it.next();
            int i10 = C7010b.f39642c[callableMemberDescriptor3.mo11891l().ordinal()];
            if (i10 == 1) {
                modalityMo11891l = Modality.FINAL;
                if (modalityMo11891l != null) {
                    break;
                }
                m14068a(90);
                throw null;
            }
            if (i10 == 2) {
                throw new IllegalStateException("Member cannot have SEALED modality: " + callableMemberDescriptor3);
            }
            if (i10 == 3) {
                z11 = true;
            } else if (i10 == 4) {
                z12 = true;
            }
        }
        CallableMemberDescriptor callableMemberDescriptorMo11846B = ((CallableMemberDescriptor) m14081s(collection, new C8417h())).mo11846B(interfaceC8830c, modalityMo11891l, zIsEmpty ? C8850m.f46741h : C8850m.f46740g, CallableMemberDescriptor.Kind.FAKE_OVERRIDE);
        abstractC8416g.mo525g0(callableMemberDescriptorMo11846B, collection);
        abstractC8416g.mo526i(callableMemberDescriptorMo11846B);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: g */
    public static ArrayList m14073g(Object obj, LinkedList linkedList, InterfaceC2052l interfaceC2052l, InterfaceC2052l interfaceC2052l2) {
        if (obj == null) {
            m14068a(99);
            throw null;
        }
        if (interfaceC2052l == null) {
            m14068a(101);
            throw null;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(obj);
        InterfaceC6816a interfaceC6816a = (InterfaceC6816a) interfaceC2052l.mo528n(obj);
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            InterfaceC6816a interfaceC6816a2 = (InterfaceC6816a) interfaceC2052l.mo528n(next);
            if (obj == next) {
                it.remove();
            } else {
                OverrideCompatibilityInfo.Result resultM14075j = m14075j(interfaceC6816a, interfaceC6816a2);
                if (resultM14075j == OverrideCompatibilityInfo.Result.OVERRIDABLE) {
                    arrayList.add(next);
                    it.remove();
                } else if (resultM14075j == OverrideCompatibilityInfo.Result.CONFLICT) {
                    interfaceC2052l2.mo528n(next);
                    it.remove();
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: i */
    public static OverrideCompatibilityInfo m14074i(InterfaceC6816a interfaceC6816a, InterfaceC6816a interfaceC6816a2) {
        boolean z10;
        OverrideCompatibilityInfo overrideCompatibilityInfoM14089d;
        if (interfaceC6816a == null) {
            m14068a(40);
            throw null;
        }
        if (interfaceC6816a2 == null) {
            m14068a(41);
            throw null;
        }
        boolean z11 = interfaceC6816a instanceof InterfaceC6822c;
        if ((!z11 || (interfaceC6816a2 instanceof InterfaceC6822c)) && (!((z10 = interfaceC6816a instanceof InterfaceC8829b0)) || (interfaceC6816a2 instanceof InterfaceC8829b0))) {
            if (!z11 && !z10) {
                throw new IllegalArgumentException("This type of CallableDescriptor cannot be checked for overridability: " + interfaceC6816a);
            }
            if (!interfaceC6816a.mo11874a().equals(interfaceC6816a2.mo11874a())) {
                return OverrideCompatibilityInfo.m14089d("Name mismatch");
            }
            if ((interfaceC6816a.mo11896s0() == null) != (interfaceC6816a2.mo11896s0() == null)) {
                overrideCompatibilityInfoM14089d = OverrideCompatibilityInfo.m14089d("Receiver presence mismatch");
            } else {
                overrideCompatibilityInfoM14089d = interfaceC6816a.mo11889i().size() != interfaceC6816a2.mo11889i().size() ? OverrideCompatibilityInfo.m14089d("Value parameter number mismatch") : null;
            }
            if (overrideCompatibilityInfoM14089d != null) {
                return overrideCompatibilityInfoM14089d;
            }
            return null;
        }
        return OverrideCompatibilityInfo.m14089d("Member kind mismatch");
    }

    /* JADX INFO: renamed from: j */
    public static OverrideCompatibilityInfo.Result m14075j(InterfaceC6816a interfaceC6816a, InterfaceC6816a interfaceC6816a2) {
        OverridingUtil overridingUtil = f39632f;
        OverrideCompatibilityInfo.Result resultM14090c = overridingUtil.m14084l(interfaceC6816a2, interfaceC6816a, null).m14090c();
        OverrideCompatibilityInfo.Result resultM14090c2 = overridingUtil.m14084l(interfaceC6816a, interfaceC6816a2, null).m14090c();
        OverrideCompatibilityInfo.Result result = OverrideCompatibilityInfo.Result.OVERRIDABLE;
        if (resultM14090c == result && resultM14090c2 == result) {
            return result;
        }
        OverrideCompatibilityInfo.Result result2 = OverrideCompatibilityInfo.Result.CONFLICT;
        if (resultM14090c != result2 && resultM14090c2 != result2) {
            return OverrideCompatibilityInfo.Result.INCOMPATIBLE;
        }
        return result2;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: k */
    public static boolean m14076k(InterfaceC6816a interfaceC6816a, InterfaceC6816a interfaceC6816a2) {
        if (interfaceC6816a == null) {
            m14068a(67);
            throw null;
        }
        if (interfaceC6816a2 == null) {
            m14068a(68);
            throw null;
        }
        AbstractC5257t abstractC5257tMo11900y = interfaceC6816a.mo11900y();
        AbstractC5257t abstractC5257tMo11900y2 = interfaceC6816a2.mo11900y();
        boolean z10 = false;
        if (!m14078p(interfaceC6816a, interfaceC6816a2)) {
            return false;
        }
        TypeCheckerState typeCheckerStateM14082f = f39632f.m14082f(interfaceC6816a.mo11895r(), interfaceC6816a2.mo11895r());
        if (interfaceC6816a instanceof InterfaceC6822c) {
            return m14077o(interfaceC6816a, abstractC5257tMo11900y, interfaceC6816a2, abstractC5257tMo11900y2, typeCheckerStateM14082f);
        }
        if (!(interfaceC6816a instanceof InterfaceC8829b0)) {
            throw new IllegalArgumentException("Unexpected callable: " + interfaceC6816a.getClass());
        }
        InterfaceC8829b0 interfaceC8829b0 = (InterfaceC8829b0) interfaceC6816a;
        InterfaceC8829b0 interfaceC8829b1 = (InterfaceC8829b0) interfaceC6816a2;
        InterfaceC8833d0 interfaceC8833d0Mo11887g0 = interfaceC8829b0.mo11887g0();
        InterfaceC8833d0 interfaceC8833d0Mo11887g1 = interfaceC8829b1.mo11887g0();
        if (!((interfaceC8833d0Mo11887g0 == null || interfaceC8833d0Mo11887g1 == null) ? true : m14078p(interfaceC8833d0Mo11887g0, interfaceC8833d0Mo11887g1))) {
            return false;
        }
        if (interfaceC8829b0.mo11894q0() && interfaceC8829b1.mo11894q0()) {
            return C7057a.m14211e(typeCheckerStateM14082f, abstractC5257tMo11900y.mo11288a1(), abstractC5257tMo11900y2.mo11288a1());
        }
        if ((interfaceC8829b0.mo11894q0() || !interfaceC8829b1.mo11894q0()) && m14077o(interfaceC6816a, abstractC5257tMo11900y, interfaceC6816a2, abstractC5257tMo11900y2, typeCheckerStateM14082f)) {
            z10 = true;
        }
        return z10;
    }

    /* JADX INFO: renamed from: o */
    public static boolean m14077o(InterfaceC6816a interfaceC6816a, AbstractC5257t abstractC5257t, InterfaceC6816a interfaceC6816a2, AbstractC5257t abstractC5257t2, TypeCheckerState typeCheckerState) {
        if (interfaceC6816a == null) {
            m14068a(73);
            throw null;
        }
        if (abstractC5257t == null) {
            m14068a(74);
            throw null;
        }
        if (interfaceC6816a2 == null) {
            m14068a(75);
            throw null;
        }
        if (abstractC5257t2 == null) {
            m14068a(76);
            throw null;
        }
        C7057a c7057a = C7057a.f39897a;
        AbstractC5262v0 abstractC5262v0Mo11288a1 = abstractC5257t.mo11288a1();
        AbstractC5262v0 abstractC5262v0Mo11288a2 = abstractC5257t2.mo11288a1();
        C5207g.m11111f(abstractC5262v0Mo11288a1, "subType");
        C5207g.m11111f(abstractC5262v0Mo11288a2, "superType");
        return C7057a.m14215i(c7057a, typeCheckerState, abstractC5262v0Mo11288a1, abstractC5262v0Mo11288a2);
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: p */
    public static boolean m14078p(InterfaceC8846k interfaceC8846k, InterfaceC8846k interfaceC8846k2) {
        if (interfaceC8846k == null) {
            m14068a(69);
            throw null;
        }
        if (interfaceC8846k2 == null) {
            m14068a(70);
            throw null;
        }
        Integer numM17099b = C8850m.m17099b(interfaceC8846k.mo11886f(), interfaceC8846k2.mo11886f());
        if (numM17099b != null && numM17099b.intValue() < 0) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: q */
    public static boolean m14079q(InterfaceC6816a interfaceC6816a, InterfaceC6816a interfaceC6816a2) {
        if (interfaceC6816a == null) {
            m14068a(13);
            throw null;
        }
        if (interfaceC6816a2 == null) {
            m14068a(14);
            throw null;
        }
        boolean zEquals = interfaceC6816a.equals(interfaceC6816a2);
        C7012a c7012a = C7012a.f39644a;
        if (!zEquals && c7012a.m14095a(interfaceC6816a.mo18004P0(), interfaceC6816a2.mo18004P0(), false, true)) {
            return true;
        }
        InterfaceC6816a interfaceC6816aMo18004P0 = interfaceC6816a2.mo18004P0();
        int i10 = C8413d.f45539a;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        C8413d.m16443b(interfaceC6816a.mo18004P0(), linkedHashSet);
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            if (c7012a.m14095a(interfaceC6816aMo18004P0, (InterfaceC6816a) it.next(), false, true)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: r */
    public static void m14080r(CallableMemberDescriptor callableMemberDescriptor, InterfaceC2052l<CallableMemberDescriptor, C9072e> interfaceC2052l) {
        AbstractC8852n abstractC8852n;
        AbstractC8852n abstractC8852nMo17096d;
        AbstractC8852n abstractC8852n2;
        if (callableMemberDescriptor == null) {
            m14068a(107);
            throw null;
        }
        Iterator<? extends CallableMemberDescriptor> it = callableMemberDescriptor.mo11893p().iterator();
        loop0: while (true) {
            while (true) {
                if (!it.hasNext()) {
                    break loop0;
                }
                CallableMemberDescriptor next = it.next();
                if (next.mo11886f() == C8850m.f46740g) {
                    m14080r(next, interfaceC2052l);
                }
            }
        }
        if (callableMemberDescriptor.mo11886f() != C8850m.f46740g) {
            return;
        }
        Collection<? extends CallableMemberDescriptor> collectionMo11893p = callableMemberDescriptor.mo11893p();
        if (collectionMo11893p == null) {
            m14068a(109);
            throw null;
        }
        if (!collectionMo11893p.isEmpty()) {
            Iterator<? extends CallableMemberDescriptor> it2 = collectionMo11893p.iterator();
            loop4: while (true) {
                abstractC8852n = null;
                while (true) {
                    while (true) {
                        if (!it2.hasNext()) {
                            break loop4;
                        }
                        AbstractC8852n abstractC8852nMo11886f = it2.next().mo11886f();
                        if (abstractC8852n != null) {
                            Integer numM17099b = C8850m.m17099b(abstractC8852nMo11886f, abstractC8852n);
                            if (numM17099b != null) {
                                if (numM17099b.intValue() > 0) {
                                }
                            }
                        }
                        abstractC8852n = abstractC8852nMo11886f;
                    }
                }
            }
            if (abstractC8852n != null) {
                Iterator<? extends CallableMemberDescriptor> it3 = collectionMo11893p.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        abstractC8852nMo17096d = abstractC8852n;
                        break;
                    }
                    Integer numM17099b2 = C8850m.m17099b(abstractC8852n, it3.next().mo11886f());
                    if (numM17099b2 != null && numM17099b2.intValue() >= 0) {
                    }
                    abstractC8852nMo17096d = null;
                    break;
                }
            }
            abstractC8852nMo17096d = null;
            break;
        }
        abstractC8852nMo17096d = C8850m.f46745l;
        if (abstractC8852nMo17096d == null) {
            abstractC8852nMo17096d = null;
        } else if (callableMemberDescriptor.mo11897u() == CallableMemberDescriptor.Kind.FAKE_OVERRIDE) {
            Iterator<? extends CallableMemberDescriptor> it4 = collectionMo11893p.iterator();
            while (true) {
                if (it4.hasNext()) {
                    CallableMemberDescriptor next2 = it4.next();
                    if (next2.mo11891l() != Modality.ABSTRACT && !next2.mo11886f().equals(abstractC8852nMo17096d)) {
                        abstractC8852nMo17096d = null;
                    }
                }
            }
        } else {
            abstractC8852nMo17096d = abstractC8852nMo17096d.mo17096d();
        }
        if (abstractC8852nMo17096d == null) {
            if (interfaceC2052l != null) {
                interfaceC2052l.mo528n(callableMemberDescriptor);
            }
            abstractC8852n2 = C8850m.f46738e;
        } else {
            abstractC8852n2 = abstractC8852nMo17096d;
        }
        if (callableMemberDescriptor instanceof C9562d0) {
            C9562d0 c9562d0 = (C9562d0) callableMemberDescriptor;
            if (abstractC8852n2 == null) {
                C9562d0.m18007N(20);
                throw null;
            }
            c9562d0.f49168j = abstractC8852n2;
            Iterator it5 = ((InterfaceC8829b0) callableMemberDescriptor).mo11880A().iterator();
            while (it5.hasNext()) {
                m14080r((InterfaceC6823d) it5.next(), abstractC8852nMo17096d == null ? null : interfaceC2052l);
            }
            return;
        }
        if (callableMemberDescriptor instanceof AbstractC6828b) {
            AbstractC6828b abstractC6828b = (AbstractC6828b) callableMemberDescriptor;
            if (abstractC8852n2 != null) {
                abstractC6828b.f38539l = abstractC8852n2;
                return;
            } else {
                AbstractC6828b.m13633N(10);
                throw null;
            }
        }
        AbstractC9560c0 abstractC9560c0 = (AbstractC9560c0) callableMemberDescriptor;
        abstractC9560c0.f49150k = abstractC8852n2;
        if (abstractC8852n2 != abstractC9560c0.mo13621K0().mo11886f()) {
            abstractC9560c0.f49144e = false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unreachable blocks removed: 3, instructions: 3 */
    /* JADX INFO: renamed from: s */
    public static <H> H m14081s(Collection<H> collection, InterfaceC2052l<H, InterfaceC6816a> interfaceC2052l) {
        H h10;
        boolean z10;
        if (interfaceC2052l == 0) {
            m14068a(79);
            throw null;
        }
        if (collection.size() == 1) {
            H h11 = (H) C6752c.m13422P(collection);
            if (h11 != null) {
                return h11;
            }
            m14068a(80);
            throw null;
        }
        ArrayList arrayList = new ArrayList(2);
        ArrayList arrayList2 = new ArrayList(C9325m.m17681z(collection, 10));
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            arrayList2.add(interfaceC2052l.mo528n(it.next()));
        }
        H h12 = (H) C6752c.m13422P(collection);
        InterfaceC6816a interfaceC6816a = (InterfaceC6816a) interfaceC2052l.mo528n(h12);
        for (H h13 : collection) {
            InterfaceC6816a interfaceC6816a2 = (InterfaceC6816a) interfaceC2052l.mo528n(h13);
            if (interfaceC6816a2 == null) {
                m14068a(71);
                throw null;
            }
            Iterator it2 = arrayList2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    z10 = true;
                    break;
                }
                if (!m14076k(interfaceC6816a2, (InterfaceC6816a) it2.next())) {
                    z10 = false;
                    break;
                }
            }
            if (z10) {
                arrayList.add(h13);
            }
            if (m14076k(interfaceC6816a2, interfaceC6816a) && !m14076k(interfaceC6816a, interfaceC6816a2)) {
                h12 = h13;
            }
        }
        if (arrayList.isEmpty()) {
            if (h12 != null) {
                return h12;
            }
            m14068a(81);
            throw null;
        }
        if (arrayList.size() == 1) {
            H h14 = (H) C6752c.m13422P(arrayList);
            if (h14 != null) {
                return h14;
            }
            m14068a(82);
            throw null;
        }
        Iterator it3 = arrayList.iterator();
        do {
            if (!it3.hasNext()) {
                h10 = null;
                break;
            }
            h10 = (H) it3.next();
        } while (C0062b.m410w1(((InterfaceC6816a) interfaceC2052l.mo528n(h10)).mo11900y()));
        if (h10 != null) {
            return h10;
        }
        H h15 = (H) C6752c.m13422P(arrayList);
        if (h15 != null) {
            return h15;
        }
        m14068a(84);
        throw null;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: f */
    public final TypeCheckerState m14082f(List<InterfaceC8847k0> list, List<InterfaceC8847k0> list2) {
        if (list == null) {
            m14068a(42);
            throw null;
        }
        if (list2 == null) {
            m14068a(43);
            throw null;
        }
        if (list.isEmpty()) {
            C8422m c8422m = new C8422m(null, this.f39636c, this.f39634a, this.f39635b, this.f39637d);
            InterfaceC2056p<AbstractC5257t, AbstractC5257t, Boolean> interfaceC2056p = c8422m.f45549e;
            AbstractC5439d abstractC5439d = c8422m.f45547c;
            KotlinTypePreparator kotlinTypePreparator = c8422m.f45548d;
            if (interfaceC2056p != null) {
                return new C8421l(c8422m, kotlinTypePreparator, abstractC5439d);
            }
            C5207g.m11111f(kotlinTypePreparator, "kotlinTypePreparator");
            C5207g.m11111f(abstractC5439d, "kotlinTypeRefiner");
            return new TypeCheckerState(true, true, c8422m, kotlinTypePreparator, abstractC5439d);
        }
        HashMap map = new HashMap();
        for (int i10 = 0; i10 < list.size(); i10++) {
            map.put(list.get(i10).mo13600k(), list2.get(i10).mo13600k());
        }
        C8422m c8422m2 = new C8422m(map, this.f39636c, this.f39634a, this.f39635b, this.f39637d);
        InterfaceC2056p<AbstractC5257t, AbstractC5257t, Boolean> interfaceC2056p2 = c8422m2.f45549e;
        AbstractC5439d abstractC5439d2 = c8422m2.f45547c;
        KotlinTypePreparator kotlinTypePreparator2 = c8422m2.f45548d;
        if (interfaceC2056p2 != null) {
            return new C8421l(c8422m2, kotlinTypePreparator2, abstractC5439d2);
        }
        C5207g.m11111f(kotlinTypePreparator2, "kotlinTypePreparator");
        C5207g.m11111f(abstractC5439d2, "kotlinTypeRefiner");
        return new TypeCheckerState(true, true, c8422m2, kotlinTypePreparator2, abstractC5439d2);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x006a  */
    /* JADX INFO: renamed from: h */
    public final void m14083h(C7648e c7648e, Collection collection, Collection collection2, InterfaceC8830c interfaceC8830c, AbstractC8416g abstractC8416g) {
        Integer numM17099b;
        boolean z10;
        if (c7648e == null) {
            m14068a(52);
            throw null;
        }
        if (collection == null) {
            m14068a(53);
            throw null;
        }
        if (collection2 == null) {
            m14068a(54);
            throw null;
        }
        if (interfaceC8830c == null) {
            m14068a(55);
            throw null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(collection);
        Iterator it = collection2.iterator();
        while (true) {
            boolean z11 = true;
            if (!it.hasNext()) {
                if (linkedHashSet.size() >= 2) {
                    InterfaceC8838g interfaceC8838gMo11876g = ((CallableMemberDescriptor) linkedHashSet.iterator().next()).mo11876g();
                    if (!linkedHashSet.isEmpty()) {
                        Iterator it2 = linkedHashSet.iterator();
                        while (it2.hasNext()) {
                            if (!Boolean.valueOf(((CallableMemberDescriptor) it2.next()).mo11876g() == interfaceC8838gMo11876g).booleanValue()) {
                                z11 = false;
                                break;
                            }
                        }
                    }
                }
                if (z11) {
                    Iterator it3 = linkedHashSet.iterator();
                    while (it3.hasNext()) {
                        m14072e(Collections.singleton((CallableMemberDescriptor) it3.next()), interfaceC8830c, abstractC8416g);
                    }
                    return;
                }
                LinkedList<CallableMemberDescriptor> linkedList = new LinkedList(linkedHashSet);
                while (!linkedList.isEmpty()) {
                    linkedList.isEmpty();
                    CallableMemberDescriptor callableMemberDescriptor = null;
                    for (CallableMemberDescriptor callableMemberDescriptor2 : linkedList) {
                        if (callableMemberDescriptor == null || ((numM17099b = C8850m.m17099b(callableMemberDescriptor.mo11886f(), callableMemberDescriptor2.mo11886f())) != null && numM17099b.intValue() < 0)) {
                            callableMemberDescriptor = callableMemberDescriptor2;
                        }
                    }
                    C5207g.m11108c(callableMemberDescriptor);
                    m14072e(m14073g(callableMemberDescriptor, linkedList, new C8419j(), new C8420k(abstractC8416g, callableMemberDescriptor)), interfaceC8830c, abstractC8416g);
                }
                return;
            }
            CallableMemberDescriptor callableMemberDescriptor3 = (CallableMemberDescriptor) it.next();
            if (callableMemberDescriptor3 == null) {
                m14068a(59);
                throw null;
            }
            ArrayList arrayList = new ArrayList(collection.size());
            C6532d c6532d = new C6532d();
            Iterator it4 = collection.iterator();
            while (it4.hasNext()) {
                CallableMemberDescriptor callableMemberDescriptor4 = (CallableMemberDescriptor) it4.next();
                OverrideCompatibilityInfo.Result resultM14090c = m14084l(callableMemberDescriptor4, callableMemberDescriptor3, interfaceC8830c).m14090c();
                if (C8850m.m17102e(callableMemberDescriptor4.mo11886f())) {
                    z10 = false;
                } else if (C8850m.m17100c(C8850m.f46747n, callableMemberDescriptor4, callableMemberDescriptor3) == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                int i10 = C7010b.f39641b[resultM14090c.ordinal()];
                if (i10 == 1) {
                    if (z10) {
                        c6532d.add(callableMemberDescriptor4);
                    }
                    arrayList.add(callableMemberDescriptor4);
                } else if (i10 == 2) {
                    if (z10) {
                        abstractC8416g.mo527k0(callableMemberDescriptor4, callableMemberDescriptor3);
                    }
                    arrayList.add(callableMemberDescriptor4);
                }
            }
            abstractC8416g.mo525g0(callableMemberDescriptor3, c6532d);
            linkedHashSet.removeAll(arrayList);
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: l */
    public final OverrideCompatibilityInfo m14084l(InterfaceC6816a interfaceC6816a, InterfaceC6816a interfaceC6816a2, InterfaceC8830c interfaceC8830c) {
        if (interfaceC6816a == null) {
            m14068a(19);
            throw null;
        }
        if (interfaceC6816a2 == null) {
            m14068a(20);
            throw null;
        }
        OverrideCompatibilityInfo overrideCompatibilityInfoM14085m = m14085m(interfaceC6816a, interfaceC6816a2, interfaceC8830c, false);
        if (overrideCompatibilityInfoM14085m != null) {
            return overrideCompatibilityInfoM14085m;
        }
        m14068a(21);
        throw null;
    }

    /* JADX INFO: renamed from: m */
    public final OverrideCompatibilityInfo m14085m(InterfaceC6816a interfaceC6816a, InterfaceC6816a interfaceC6816a2, InterfaceC8830c interfaceC8830c, boolean z10) {
        if (interfaceC6816a == null) {
            m14068a(22);
            throw null;
        }
        if (interfaceC6816a2 == null) {
            m14068a(23);
            throw null;
        }
        OverrideCompatibilityInfo overrideCompatibilityInfoM14086n = m14086n(interfaceC6816a, interfaceC6816a2, z10);
        boolean z11 = overrideCompatibilityInfoM14086n.m14090c() == OverrideCompatibilityInfo.Result.OVERRIDABLE;
        List<ExternalOverridabilityCondition> list = f39631e;
        for (ExternalOverridabilityCondition externalOverridabilityCondition : list) {
            if (externalOverridabilityCondition.mo13657b() != ExternalOverridabilityCondition.Contract.CONFLICTS_ONLY && (!z11 || externalOverridabilityCondition.mo13657b() != ExternalOverridabilityCondition.Contract.SUCCESS_ONLY)) {
                int i10 = C7010b.f39640a[externalOverridabilityCondition.mo13656a(interfaceC6816a, interfaceC6816a2, interfaceC8830c).ordinal()];
                if (i10 == 1) {
                    z11 = true;
                } else {
                    if (i10 == 2) {
                        return OverrideCompatibilityInfo.m14088b("External condition failed");
                    }
                    if (i10 == 3) {
                        return OverrideCompatibilityInfo.m14089d("External condition");
                    }
                }
            }
        }
        if (!z11) {
            return overrideCompatibilityInfoM14086n;
        }
        for (ExternalOverridabilityCondition externalOverridabilityCondition2 : list) {
            if (externalOverridabilityCondition2.mo13657b() == ExternalOverridabilityCondition.Contract.CONFLICTS_ONLY) {
                int i11 = C7010b.f39640a[externalOverridabilityCondition2.mo13656a(interfaceC6816a, interfaceC6816a2, interfaceC8830c).ordinal()];
                if (i11 == 1) {
                    throw new IllegalStateException("Contract violation in " + externalOverridabilityCondition2.getClass().getName() + " condition. It's not supposed to end with success");
                }
                if (i11 == 2) {
                    return OverrideCompatibilityInfo.m14088b("External condition failed");
                }
                if (i11 == 3) {
                    return OverrideCompatibilityInfo.m14089d("External condition");
                }
            }
        }
        OverrideCompatibilityInfo overrideCompatibilityInfo = OverrideCompatibilityInfo.f39638b;
        if (overrideCompatibilityInfo != null) {
            return overrideCompatibilityInfo;
        }
        OverrideCompatibilityInfo.m14087a(0);
        throw null;
    }

    /* JADX INFO: renamed from: n */
    public final OverrideCompatibilityInfo m14086n(InterfaceC6816a interfaceC6816a, InterfaceC6816a interfaceC6816a2, boolean z10) {
        boolean z11;
        if (interfaceC6816a == null) {
            m14068a(30);
            throw null;
        }
        if (interfaceC6816a2 == null) {
            m14068a(31);
            throw null;
        }
        OverrideCompatibilityInfo overrideCompatibilityInfoM14074i = m14074i(interfaceC6816a, interfaceC6816a2);
        if (overrideCompatibilityInfoM14074i != null) {
            return overrideCompatibilityInfoM14074i;
        }
        ArrayList arrayListM14071d = m14071d(interfaceC6816a);
        ArrayList arrayListM14071d2 = m14071d(interfaceC6816a2);
        List<InterfaceC8847k0> listMo11895r = interfaceC6816a.mo11895r();
        List<InterfaceC8847k0> listMo11895r2 = interfaceC6816a2.mo11895r();
        if (listMo11895r.size() != listMo11895r2.size()) {
            for (int i10 = 0; i10 < arrayListM14071d.size(); i10++) {
                if (!InterfaceC5438c.f33982a.mo11657a((AbstractC5257t) arrayListM14071d.get(i10), (AbstractC5257t) arrayListM14071d2.get(i10))) {
                    return OverrideCompatibilityInfo.m14089d("Type parameter number mismatch");
                }
            }
            return OverrideCompatibilityInfo.m14088b("Type parameter number mismatch");
        }
        TypeCheckerState typeCheckerStateM14082f = m14082f(listMo11895r, listMo11895r2);
        for (int i11 = 0; i11 < listMo11895r.size(); i11++) {
            InterfaceC8847k0 interfaceC8847k0 = listMo11895r.get(i11);
            InterfaceC8847k0 interfaceC8847k1 = listMo11895r2.get(i11);
            if (interfaceC8847k0 == null) {
                m14068a(49);
                throw null;
            }
            if (interfaceC8847k1 == null) {
                m14068a(50);
                throw null;
            }
            List<AbstractC5257t> upperBounds = interfaceC8847k0.getUpperBounds();
            ArrayList arrayList = new ArrayList(interfaceC8847k1.getUpperBounds());
            if (upperBounds.size() != arrayList.size()) {
                z11 = false;
                break;
            }
            Iterator<AbstractC5257t> it = upperBounds.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z11 = true;
                    break;
                }
                AbstractC5257t next = it.next();
                ListIterator listIterator = arrayList.listIterator();
                while (true) {
                    if (!listIterator.hasNext()) {
                        z11 = false;
                        break;
                    }
                    if (m14069b(next, (AbstractC5257t) listIterator.next(), typeCheckerStateM14082f)) {
                        listIterator.remove();
                    }
                }
            }
            if (!z11) {
                return OverrideCompatibilityInfo.m14089d("Type parameter bounds mismatch");
            }
        }
        for (int i12 = 0; i12 < arrayListM14071d.size(); i12++) {
            if (!m14069b((AbstractC5257t) arrayListM14071d.get(i12), (AbstractC5257t) arrayListM14071d2.get(i12), typeCheckerStateM14082f)) {
                return OverrideCompatibilityInfo.m14089d("Value parameter type mismatch");
            }
        }
        if ((interfaceC6816a instanceof InterfaceC6822c) && (interfaceC6816a2 instanceof InterfaceC6822c) && ((InterfaceC6822c) interfaceC6816a).mo5294F0() != ((InterfaceC6822c) interfaceC6816a2).mo5294F0()) {
            return OverrideCompatibilityInfo.m14088b("Incompatible suspendability");
        }
        if (z10) {
            AbstractC5257t abstractC5257tMo11900y = interfaceC6816a.mo11900y();
            AbstractC5257t abstractC5257tMo11900y2 = interfaceC6816a2.mo11900y();
            if (abstractC5257tMo11900y != null && abstractC5257tMo11900y2 != null) {
                if (!(C7499b.m14926X(abstractC5257tMo11900y2) && C7499b.m14926X(abstractC5257tMo11900y))) {
                    C7057a c7057a = C7057a.f39897a;
                    AbstractC5262v0 abstractC5262v0Mo11288a1 = abstractC5257tMo11900y2.mo11288a1();
                    AbstractC5262v0 abstractC5262v0Mo11288a2 = abstractC5257tMo11900y.mo11288a1();
                    C5207g.m11111f(abstractC5262v0Mo11288a1, "subType");
                    C5207g.m11111f(abstractC5262v0Mo11288a2, "superType");
                    if (!C7057a.m14215i(c7057a, typeCheckerStateM14082f, abstractC5262v0Mo11288a1, abstractC5262v0Mo11288a2)) {
                        return OverrideCompatibilityInfo.m14088b("Return type mismatch");
                    }
                }
            }
        }
        OverrideCompatibilityInfo overrideCompatibilityInfo = OverrideCompatibilityInfo.f39638b;
        if (overrideCompatibilityInfo != null) {
            return overrideCompatibilityInfo;
        }
        OverrideCompatibilityInfo.m14087a(0);
        throw null;
    }
}
