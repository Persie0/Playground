package kotlin.reflect.jvm.internal.impl.types;

import ae.C0062b;
import androidx.datastore.preferences.PreferencesProto$Value;
import dm.C5206f;
import dm.C5207g;
import fo.C5602h;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C6744b;
import kotlin.reflect.jvm.internal.impl.builtins.AbstractC6795c;
import kotlin.reflect.jvm.internal.impl.builtins.C6797e;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.CompositeAnnotations;
import kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.typesApproximation.CapturedTypeApproximationKt;
import p139go.InterfaceC5852f;
import p260m8.C7499b;
import p348qn.InterfaceC8652b;
import p372rm.InterfaceC8847k0;
import p543do.AbstractC5244m0;
import p543do.AbstractC5249p;
import p543do.AbstractC5252q0;
import p543do.AbstractC5257t;
import p543do.AbstractC5262v0;
import p543do.AbstractC5265x;
import p543do.C5219a;
import p543do.C5245n;
import p543do.C5250p0;
import p543do.C5255s;
import p543do.C5256s0;
import p543do.C5258t0;
import p543do.InterfaceC5233h;
import p543do.InterfaceC5240k0;
import p543do.InterfaceC5246n0;
import p543do.InterfaceC5260u0;
import p543do.InterfaceC5263w;
import sm.C9079g;
import sm.InterfaceC9077e;

/* JADX INFO: loaded from: classes2.dex */
public final class TypeSubstitutor {

    /* JADX INFO: renamed from: b */
    public static final TypeSubstitutor f39894b = m14199e(AbstractC5252q0.f33344a);

    /* JADX INFO: renamed from: a */
    public final AbstractC5252q0 f39895a;

    public static final class SubstitutionException extends Exception {
        public SubstitutionException() {
            super("Out-projection in in-position");
        }
    }

    public enum VarianceConflictType {
        NO_CONFLICT,
        IN_IN_OUT_POSITION,
        OUT_IN_IN_POSITION
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor$a */
    public static /* synthetic */ class C7056a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f39896a;

        static {
            int[] iArr = new int[VarianceConflictType.values().length];
            f39896a = iArr;
            try {
                iArr[VarianceConflictType.OUT_IN_IN_POSITION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f39896a[VarianceConflictType.IN_IN_OUT_POSITION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f39896a[VarianceConflictType.NO_CONFLICT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public TypeSubstitutor(AbstractC5252q0 abstractC5252q0) {
        if (abstractC5252q0 != null) {
            this.f39895a = abstractC5252q0;
        } else {
            m14195a(7);
            throw null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:15:0x002a A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:30:0x004b A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:33:0x0057  */
    /* JADX WARN: Code duplicated, block: B:34:0x005e  */
    /* JADX WARN: Code duplicated, block: B:35:0x0064  */
    /* JADX WARN: Code duplicated, block: B:36:0x006a  */
    /* JADX WARN: Code duplicated, block: B:37:0x0071  */
    /* JADX WARN: Code duplicated, block: B:38:0x0078  */
    /* JADX WARN: Code duplicated, block: B:39:0x007e  */
    /* JADX WARN: Code duplicated, block: B:40:0x0086  */
    /* JADX WARN: Code duplicated, block: B:41:0x008c  */
    /* JADX WARN: Code duplicated, block: B:42:0x0093  */
    /* JADX WARN: Code duplicated, block: B:43:0x009a  */
    /* JADX WARN: Code duplicated, block: B:44:0x009f  */
    /* JADX WARN: Code duplicated, block: B:45:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:47:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:50:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:52:0x00c8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:53:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:55:0x00cd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:56:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:57:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:59:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:61:0x00da  */
    /* JADX WARN: Code duplicated, block: B:63:0x00de  */
    /* JADX WARN: Code duplicated, block: B:64:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:65:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:66:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:67:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:69:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:70:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:71:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:72:0x0105  */
    /* JADX WARN: Code duplicated, block: B:74:0x010d  */
    /* JADX WARN: Code duplicated, block: B:75:0x010e  */
    /* JADX WARN: Code duplicated, block: B:76:0x0114  */
    /* JADX WARN: Code duplicated, block: B:77:0x0118  */
    /* JADX WARN: Code duplicated, block: B:78:0x011d  */
    /* JADX WARN: Code duplicated, block: B:79:0x0121  */
    /* JADX WARN: Code duplicated, block: B:80:0x0124  */
    /* JADX WARN: Code duplicated, block: B:81:0x012a  */
    /* JADX WARN: Code duplicated, block: B:82:0x0132  */
    /* JADX WARN: Code duplicated, block: B:83:0x0135  */
    /* JADX WARN: Code duplicated, block: B:84:0x013a  */
    /* JADX WARN: Code duplicated, block: B:94:0x0154  */
    /* JADX WARN: Code duplicated, block: B:95:0x0157  */
    /* JADX WARN: Code duplicated, block: B:96:0x015a  */
    /* JADX WARN: Code duplicated, block: B:97:0x015d  */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m14195a(int i10) {
        String str;
        int i11;
        Object[] objArr;
        String str2;
        if (i10 != 1 && i10 != 2 && i10 != 8 && i10 != 34 && i10 != 37) {
            switch (i10) {
                default:
                    switch (i10) {
                        default:
                            switch (i10) {
                                default:
                                    switch (i10) {
                                        case 40:
                                        case 41:
                                        case 42:
                                            break;
                                        default:
                                            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                                            break;
                                    }
                                case 29:
                                case 30:
                                case 31:
                                case 32:
                                    str = "@NotNull method %s.%s must not return null";
                                    break;
                            }
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                            str = "@NotNull method %s.%s must not return null";
                            break;
                    }
                case 11:
                case 12:
                case 13:
                    str = "@NotNull method %s.%s must not return null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i10 != 1 && i10 != 2 && i10 != 8 && i10 != 34 && i10 != 37) {
            switch (i10) {
                default:
                    switch (i10) {
                        default:
                            switch (i10) {
                                default:
                                    switch (i10) {
                                        case 40:
                                        case 41:
                                        case 42:
                                            break;
                                        default:
                                            i11 = 3;
                                            break;
                                    }
                                case 29:
                                case 30:
                                case 31:
                                case 32:
                                    i11 = 2;
                                    break;
                            }
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                            i11 = 2;
                            break;
                    }
                case 11:
                case 12:
                case 13:
                    i11 = 2;
                    break;
            }
            objArr = new Object[i11];
            switch (i10) {
                case 1:
                case 2:
                case 8:
                case 11:
                case 12:
                case 13:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 29:
                case 30:
                case 31:
                case 32:
                case 34:
                case 37:
                case 40:
                case 41:
                case 42:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor";
                    break;
                case 3:
                    objArr[0] = "first";
                    break;
                case 4:
                    objArr[0] = "second";
                    break;
                case 5:
                    objArr[0] = "substitutionContext";
                    break;
                case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                    objArr[0] = "context";
                    break;
                case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                default:
                    objArr[0] = "substitution";
                    break;
                case 9:
                case 14:
                    objArr[0] = "type";
                    break;
                case 10:
                case 15:
                    objArr[0] = "howThisTypeIsUsed";
                    break;
                case 16:
                case 17:
                case 36:
                    objArr[0] = "typeProjection";
                    break;
                case 18:
                case 28:
                    objArr[0] = "originalProjection";
                    break;
                case 26:
                    objArr[0] = "originalType";
                    break;
                case 27:
                    objArr[0] = "substituted";
                    break;
                case 33:
                    objArr[0] = "annotations";
                    break;
                case 35:
                case 38:
                    objArr[0] = "typeParameterVariance";
                    break;
                case 39:
                    objArr[0] = "projectionKind";
                    break;
            }
            if (i10 != 1) {
                objArr[1] = "replaceWithNonApproximatingSubstitution";
            } else if (i10 != 2) {
                objArr[1] = "replaceWithContravariantApproximatingSubstitution";
            } else if (i10 != 8) {
                objArr[1] = "getSubstitution";
            } else if (i10 != 34) {
                if (i10 != 37) {
                    switch (i10) {
                        case 11:
                        case 12:
                        case 13:
                            objArr[1] = "safeSubstitute";
                            break;
                        default:
                            switch (i10) {
                                case 19:
                                case 20:
                                case 21:
                                case 22:
                                case 23:
                                case 24:
                                case 25:
                                    objArr[1] = "unsafeSubstitute";
                                    break;
                                default:
                                    switch (i10) {
                                        case 29:
                                        case 30:
                                        case 31:
                                        case 32:
                                            objArr[1] = "projectedTypeForConflictedTypeWithUnsafeVariance";
                                            break;
                                        default:
                                            switch (i10) {
                                                case 40:
                                                case 41:
                                                case 42:
                                                    break;
                                                default:
                                                    objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor";
                                                    break;
                                            }
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                }
                objArr[1] = "combine";
            } else {
                objArr[1] = "filterOutUnsafeVariance";
            }
            switch (i10) {
                case 1:
                case 2:
                case 8:
                case 11:
                case 12:
                case 13:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 29:
                case 30:
                case 31:
                case 32:
                case 34:
                case 37:
                case 40:
                case 41:
                case 42:
                    break;
                case 3:
                case 4:
                    objArr[2] = "createChainedSubstitutor";
                    break;
                case 5:
                case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                    objArr[2] = "create";
                    break;
                case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                    objArr[2] = "<init>";
                    break;
                case 9:
                case 10:
                    objArr[2] = "safeSubstitute";
                    break;
                case 14:
                case 15:
                case 16:
                    objArr[2] = "substitute";
                    break;
                case 17:
                    objArr[2] = "substituteWithoutApproximation";
                    break;
                case 18:
                    objArr[2] = "unsafeSubstitute";
                    break;
                case 26:
                case 27:
                case 28:
                    objArr[2] = "projectedTypeForConflictedTypeWithUnsafeVariance";
                    break;
                case 33:
                    objArr[2] = "filterOutUnsafeVariance";
                    break;
                case 35:
                case 36:
                case 38:
                case 39:
                    objArr[2] = "combine";
                    break;
                default:
                    objArr[2] = "create";
                    break;
            }
            str2 = String.format(str, objArr);
            if (i10 != 1 && i10 != 2 && i10 != 8 && i10 != 34 && i10 != 37) {
                switch (i10) {
                    case 11:
                    case 12:
                    case 13:
                        break;
                    default:
                        switch (i10) {
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                                break;
                            default:
                                switch (i10) {
                                    case 29:
                                    case 30:
                                    case 31:
                                    case 32:
                                        break;
                                    default:
                                        switch (i10) {
                                            case 40:
                                            case 41:
                                            case 42:
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
        i11 = 2;
        objArr = new Object[i11];
        switch (i10) {
            case 1:
            case 2:
            case 8:
            case 11:
            case 12:
            case 13:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 29:
            case 30:
            case 31:
            case 32:
            case 34:
            case 37:
            case 40:
            case 41:
            case 42:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor";
                break;
            case 3:
                objArr[0] = "first";
                break;
            case 4:
                objArr[0] = "second";
                break;
            case 5:
                objArr[0] = "substitutionContext";
                break;
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                objArr[0] = "context";
                break;
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
            default:
                objArr[0] = "substitution";
                break;
            case 9:
            case 14:
                objArr[0] = "type";
                break;
            case 10:
            case 15:
                objArr[0] = "howThisTypeIsUsed";
                break;
            case 16:
            case 17:
            case 36:
                objArr[0] = "typeProjection";
                break;
            case 18:
            case 28:
                objArr[0] = "originalProjection";
                break;
            case 26:
                objArr[0] = "originalType";
                break;
            case 27:
                objArr[0] = "substituted";
                break;
            case 33:
                objArr[0] = "annotations";
                break;
            case 35:
            case 38:
                objArr[0] = "typeParameterVariance";
                break;
            case 39:
                objArr[0] = "projectionKind";
                break;
        }
        if (i10 != 1) {
            objArr[1] = "replaceWithNonApproximatingSubstitution";
        } else if (i10 != 2) {
            objArr[1] = "replaceWithContravariantApproximatingSubstitution";
        } else if (i10 != 8) {
            objArr[1] = "getSubstitution";
        } else if (i10 != 34) {
            if (i10 != 37) {
                switch (i10) {
                    case 11:
                    case 12:
                    case 13:
                        objArr[1] = "safeSubstitute";
                        break;
                    default:
                        switch (i10) {
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                                objArr[1] = "unsafeSubstitute";
                                break;
                            default:
                                switch (i10) {
                                    case 29:
                                    case 30:
                                    case 31:
                                    case 32:
                                        objArr[1] = "projectedTypeForConflictedTypeWithUnsafeVariance";
                                        break;
                                    default:
                                        switch (i10) {
                                            case 40:
                                            case 41:
                                            case 42:
                                                break;
                                            default:
                                                objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor";
                                                break;
                                        }
                                        break;
                                }
                                break;
                        }
                        break;
                }
            }
            objArr[1] = "combine";
        } else {
            objArr[1] = "filterOutUnsafeVariance";
        }
        switch (i10) {
            case 1:
            case 2:
            case 8:
            case 11:
            case 12:
            case 13:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 29:
            case 30:
            case 31:
            case 32:
            case 34:
            case 37:
            case 40:
            case 41:
            case 42:
                break;
            case 3:
            case 4:
                objArr[2] = "createChainedSubstitutor";
                break;
            case 5:
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                objArr[2] = "create";
                break;
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                objArr[2] = "<init>";
                break;
            case 9:
            case 10:
                objArr[2] = "safeSubstitute";
                break;
            case 14:
            case 15:
            case 16:
                objArr[2] = "substitute";
                break;
            case 17:
                objArr[2] = "substituteWithoutApproximation";
                break;
            case 18:
                objArr[2] = "unsafeSubstitute";
                break;
            case 26:
            case 27:
            case 28:
                objArr[2] = "projectedTypeForConflictedTypeWithUnsafeVariance";
                break;
            case 33:
                objArr[2] = "filterOutUnsafeVariance";
                break;
            case 35:
            case 36:
            case 38:
            case 39:
                objArr[2] = "combine";
                break;
            default:
                objArr[2] = "create";
                break;
        }
        str2 = String.format(str, objArr);
        if (i10 != 1) {
            switch (i10) {
                case 11:
                case 12:
                case 13:
                    break;
                default:
                    switch (i10) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                            break;
                        default:
                            switch (i10) {
                                case 29:
                                case 30:
                                case 31:
                                case 32:
                                    break;
                                default:
                                    switch (i10) {
                                        case 40:
                                        case 41:
                                        case 42:
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

    /* JADX WARN: Unreachable blocks removed: 4, instructions: 4 */
    /* JADX INFO: renamed from: b */
    public static Variance m14196b(Variance variance, Variance variance2) {
        if (variance == null) {
            m14195a(38);
            throw null;
        }
        if (variance2 == null) {
            m14195a(39);
            throw null;
        }
        Variance variance3 = Variance.INVARIANT;
        if (variance == variance3) {
            if (variance2 != null) {
                return variance2;
            }
            m14195a(40);
            throw null;
        }
        if (variance2 == variance3) {
            if (variance != null) {
                return variance;
            }
            m14195a(41);
            throw null;
        }
        if (variance == variance2) {
            if (variance2 != null) {
                return variance2;
            }
            m14195a(42);
            throw null;
        }
        throw new AssertionError("Variance conflict: type parameter variance '" + variance + "' and projection kind '" + variance2 + "' cannot be combined");
    }

    /* JADX INFO: renamed from: c */
    public static VarianceConflictType m14197c(Variance variance, Variance variance2) {
        Variance variance3 = Variance.IN_VARIANCE;
        if (variance == variance3 && variance2 == Variance.OUT_VARIANCE) {
            return VarianceConflictType.OUT_IN_IN_POSITION;
        }
        return (variance == Variance.OUT_VARIANCE && variance2 == variance3) ? VarianceConflictType.IN_IN_OUT_POSITION : VarianceConflictType.NO_CONFLICT;
    }

    /* JADX INFO: renamed from: d */
    public static TypeSubstitutor m14198d(AbstractC5257t abstractC5257t) {
        if (abstractC5257t == null) {
            m14195a(6);
            throw null;
        }
        return m14199e(AbstractC5244m0.f33335b.m11281b(abstractC5257t.mo11250X0(), abstractC5257t.mo11240V0()));
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: e */
    public static TypeSubstitutor m14199e(AbstractC5252q0 abstractC5252q0) {
        if (abstractC5252q0 != null) {
            return new TypeSubstitutor(abstractC5252q0);
        }
        m14195a(0);
        throw null;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: f */
    public static TypeSubstitutor m14200f(AbstractC5252q0 abstractC5252q0, AbstractC5252q0 abstractC5252q1) {
        AbstractC5252q0 c5245n = abstractC5252q0;
        if (c5245n == null) {
            m14195a(3);
            throw null;
        }
        if (abstractC5252q1 == null) {
            m14195a(4);
            throw null;
        }
        int i10 = C5245n.f33336d;
        if (c5245n.mo11276e()) {
            c5245n = abstractC5252q1;
        } else if (!abstractC5252q1.mo11276e()) {
            c5245n = new C5245n(c5245n, abstractC5252q1);
        }
        return m14199e(c5245n);
    }

    /* JADX INFO: renamed from: j */
    public static String m14201j(Object obj) {
        try {
            return obj.toString();
        } catch (Throwable th2) {
            if (C7499b.m14928Z(th2)) {
                throw th2;
            }
            return "[Exception while computing toString(): " + th2 + "]";
        }
    }

    /* JADX INFO: renamed from: g */
    public final AbstractC5252q0 m14202g() {
        AbstractC5252q0 abstractC5252q0 = this.f39895a;
        if (abstractC5252q0 != null) {
            return abstractC5252q0;
        }
        m14195a(8);
        throw null;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m14203h() {
        return this.f39895a.mo11276e();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: i */
    public final AbstractC5257t m14204i(AbstractC5257t abstractC5257t, Variance variance) {
        if (abstractC5257t == null) {
            m14195a(9);
            throw null;
        }
        if (variance == null) {
            m14195a(10);
            throw null;
        }
        if (m14203h()) {
            if (abstractC5257t != null) {
                return abstractC5257t;
            }
            m14195a(11);
            throw null;
        }
        try {
            AbstractC5257t abstractC5257tMo11236c = m14206l(new C5250p0(abstractC5257t, variance), null, 0).mo11236c();
            if (abstractC5257tMo11236c != null) {
                return abstractC5257tMo11236c;
            }
            m14195a(12);
            throw null;
        } catch (SubstitutionException e10) {
            return C5602h.m11912c(ErrorTypeKind.UNABLE_TO_SUBSTITUTE_TYPE, e10.getMessage());
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: k */
    public final AbstractC5257t m14205k(AbstractC5257t abstractC5257t, Variance variance) {
        if (abstractC5257t == null) {
            m14195a(14);
            throw null;
        }
        if (variance == null) {
            m14195a(15);
            throw null;
        }
        InterfaceC5246n0 c5250p0 = new C5250p0(m14202g().mo11277f(abstractC5257t, variance), variance);
        if (!m14203h()) {
            try {
                c5250p0 = m14206l(c5250p0, null, 0);
            } catch (SubstitutionException unused) {
                c5250p0 = null;
            }
        }
        AbstractC5252q0 abstractC5252q0 = this.f39895a;
        if (abstractC5252q0.mo11274a() || abstractC5252q0.mo11282b()) {
            c5250p0 = CapturedTypeApproximationKt.m14241b(c5250p0, abstractC5252q0.mo11282b());
        }
        if (c5250p0 == null) {
            return null;
        }
        return c5250p0.mo11236c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: l */
    public final InterfaceC5246n0 m14206l(InterfaceC5246n0 interfaceC5246n0, InterfaceC8847k0 interfaceC8847k0, int i10) throws SubstitutionException {
        TypeSubstitutor typeSubstitutor;
        AbstractC5257t abstractC5257tM14205k = null;
        if (interfaceC5246n0 == null) {
            m14195a(18);
            throw null;
        }
        AbstractC5252q0 abstractC5252q0 = this.f39895a;
        if (i10 > 100) {
            throw new IllegalStateException("Recursion too deep. Most likely infinite loop while substituting " + m14201j(interfaceC5246n0) + "; substitution: " + m14201j(abstractC5252q0));
        }
        if (interfaceC5246n0.mo11239f()) {
            return interfaceC5246n0;
        }
        AbstractC5257t abstractC5257tMo11236c = interfaceC5246n0.mo11236c();
        if (abstractC5257tMo11236c instanceof InterfaceC5260u0) {
            InterfaceC5260u0 interfaceC5260u0 = (InterfaceC5260u0) abstractC5257tMo11236c;
            AbstractC5262v0 abstractC5262v0Mo11227P0 = interfaceC5260u0.mo11227P0();
            AbstractC5257t abstractC5257tMo11226P = interfaceC5260u0.mo11226P();
            InterfaceC5246n0 interfaceC5246n0M14206l = m14206l(new C5250p0(abstractC5262v0Mo11227P0, interfaceC5246n0.mo11237d()), interfaceC8847k0, i10 + 1);
            return interfaceC5246n0M14206l.mo11239f() ? interfaceC5246n0M14206l : new C5250p0(C0062b.m247A2(interfaceC5246n0M14206l.mo11236c().mo11288a1(), m14205k(abstractC5257tMo11226P, interfaceC5246n0.mo11237d())), interfaceC5246n0M14206l.mo11237d());
        }
        if (!C7499b.m14925W(abstractC5257tMo11236c) && !(abstractC5257tMo11236c.mo11288a1() instanceof InterfaceC5263w)) {
            InterfaceC5246n0 interfaceC5246n0Mo11279d = abstractC5252q0.mo11279d(abstractC5257tMo11236c);
            if (interfaceC5246n0Mo11279d == null) {
                interfaceC5246n0Mo11279d = null;
            } else if (abstractC5257tMo11236c.mo11289w().mo5292x(C6797e.a.f38402y)) {
                InterfaceC5240k0 interfaceC5240k0Mo11250X0 = interfaceC5246n0Mo11279d.mo11236c().mo11250X0();
                if (interfaceC5240k0Mo11250X0 instanceof NewCapturedTypeConstructor) {
                    InterfaceC5246n0 interfaceC5246n1 = ((NewCapturedTypeConstructor) interfaceC5240k0Mo11250X0).f39904a;
                    Variance varianceMo11237d = interfaceC5246n1.mo11237d();
                    VarianceConflictType varianceConflictTypeM14197c = m14197c(interfaceC5246n0.mo11237d(), varianceMo11237d);
                    VarianceConflictType varianceConflictType = VarianceConflictType.OUT_IN_IN_POSITION;
                    if (varianceConflictTypeM14197c == varianceConflictType) {
                        interfaceC5246n0Mo11279d = new C5250p0(interfaceC5246n1.mo11236c());
                    } else if (interfaceC8847k0 != null && m14197c(interfaceC8847k0.mo17088n(), varianceMo11237d) == varianceConflictType) {
                        interfaceC5246n0Mo11279d = new C5250p0(interfaceC5246n1.mo11236c());
                    }
                }
            }
            Variance varianceMo11237d2 = interfaceC5246n0.mo11237d();
            if (interfaceC5246n0Mo11279d == null && C0062b.m410w1(abstractC5257tMo11236c)) {
                InterfaceC5852f interfaceC5852fMo11288a1 = abstractC5257tMo11236c.mo11288a1();
                InterfaceC5233h interfaceC5233h = interfaceC5852fMo11288a1 instanceof InterfaceC5233h ? (InterfaceC5233h) interfaceC5852fMo11288a1 : null;
                if (!(interfaceC5233h != null ? interfaceC5233h.mo11268J0() : false)) {
                    AbstractC5249p abstractC5249pM300Q = C0062b.m300Q(abstractC5257tMo11236c);
                    AbstractC5265x abstractC5265x = abstractC5249pM300Q.f33340b;
                    int i11 = i10 + 1;
                    InterfaceC5246n0 interfaceC5246n0M14206l2 = m14206l(new C5250p0(abstractC5265x, varianceMo11237d2), interfaceC8847k0, i11);
                    AbstractC5265x abstractC5265x2 = abstractC5249pM300Q.f33341c;
                    InterfaceC5246n0 interfaceC5246n0M14206l3 = m14206l(new C5250p0(abstractC5265x2, varianceMo11237d2), interfaceC8847k0, i11);
                    return (interfaceC5246n0M14206l2.mo11236c() == abstractC5265x && interfaceC5246n0M14206l3.mo11236c() == abstractC5265x2) ? interfaceC5246n0 : new C5250p0(KotlinTypeFactory.m14184c(C5206f.m11024u0(interfaceC5246n0M14206l2.mo11236c()), C5206f.m11024u0(interfaceC5246n0M14206l3.mo11236c())), interfaceC5246n0M14206l2.mo11237d());
                }
            }
            if (!AbstractC6795c.m13533F(abstractC5257tMo11236c) && !C7499b.m14926X(abstractC5257tMo11236c)) {
                if (interfaceC5246n0Mo11279d != null) {
                    VarianceConflictType varianceConflictTypeM14197c2 = m14197c(varianceMo11237d2, interfaceC5246n0Mo11279d.mo11237d());
                    if (!(abstractC5257tMo11236c.mo11250X0() instanceof InterfaceC8652b)) {
                        int i12 = C7056a.f39896a[varianceConflictTypeM14197c2.ordinal()];
                        if (i12 == 1) {
                            throw new SubstitutionException();
                        }
                        if (i12 == 2) {
                            return new C5250p0(abstractC5257tMo11236c.mo11250X0().mo11234o().m13559p(), Variance.OUT_VARIANCE);
                        }
                    }
                    InterfaceC5852f interfaceC5852fMo11288a2 = abstractC5257tMo11236c.mo11288a1();
                    InterfaceC5233h interfaceC5233h2 = interfaceC5852fMo11288a2 instanceof InterfaceC5233h ? (InterfaceC5233h) interfaceC5852fMo11288a2 : null;
                    if (interfaceC5233h2 == null || !interfaceC5233h2.mo11268J0()) {
                        interfaceC5233h2 = null;
                    }
                    if (interfaceC5246n0Mo11279d.mo11239f()) {
                        return interfaceC5246n0Mo11279d;
                    }
                    AbstractC5257t abstractC5257tMo11269N = interfaceC5233h2 != null ? interfaceC5233h2.mo11269N(interfaceC5246n0Mo11279d.mo11236c()) : C5258t0.m11300k(interfaceC5246n0Mo11279d.mo11236c(), abstractC5257tMo11236c.mo11242Y0());
                    if (!abstractC5257tMo11236c.mo11289w().isEmpty()) {
                        InterfaceC9077e interfaceC9077eMo11275c = abstractC5252q0.mo11275c(abstractC5257tMo11236c.mo11289w());
                        if (interfaceC9077eMo11275c == null) {
                            m14195a(33);
                            throw null;
                        }
                        if (interfaceC9077eMo11275c.mo5292x(C6797e.a.f38402y)) {
                            interfaceC9077eMo11275c = new C9079g(interfaceC9077eMo11275c, new C5256s0());
                        }
                        abstractC5257tMo11269N = TypeUtilsKt.m14236m(abstractC5257tMo11269N, new CompositeAnnotations((List<? extends InterfaceC9077e>) C6744b.m13391w0(new InterfaceC9077e[]{abstractC5257tMo11269N.mo11289w(), interfaceC9077eMo11275c})));
                    }
                    if (varianceConflictTypeM14197c2 == VarianceConflictType.NO_CONFLICT) {
                        varianceMo11237d2 = m14196b(varianceMo11237d2, interfaceC5246n0Mo11279d.mo11237d());
                    }
                    return new C5250p0(abstractC5257tMo11269N, varianceMo11237d2);
                }
                AbstractC5257t abstractC5257tMo11236c2 = interfaceC5246n0.mo11236c();
                Variance varianceMo11237d3 = interfaceC5246n0.mo11237d();
                if (abstractC5257tMo11236c2.mo11250X0().mo11235q() instanceof InterfaceC8847k0) {
                    return interfaceC5246n0;
                }
                AbstractC5262v0 abstractC5262v0Mo11288a1 = abstractC5257tMo11236c2.mo11288a1();
                C5219a c5219a = abstractC5262v0Mo11288a1 instanceof C5219a ? (C5219a) abstractC5262v0Mo11288a1 : null;
                AbstractC5265x abstractC5265x3 = c5219a != null ? c5219a.f33302c : null;
                if (abstractC5265x3 != null) {
                    if ((abstractC5252q0 instanceof C5255s) && abstractC5252q0.mo11282b()) {
                        C5255s c5255s = (C5255s) abstractC5252q0;
                        typeSubstitutor = new TypeSubstitutor(new C5255s(c5255s.f33348b, c5255s.f33349c, false));
                    } else {
                        typeSubstitutor = this;
                    }
                    abstractC5257tM14205k = typeSubstitutor.m14205k(abstractC5265x3, Variance.INVARIANT);
                }
                List<InterfaceC8847k0> listMo11260r = abstractC5257tMo11236c2.mo11250X0().mo11260r();
                List<InterfaceC5246n0> listMo11240V0 = abstractC5257tMo11236c2.mo11240V0();
                ArrayList arrayList = new ArrayList(listMo11260r.size());
                boolean z10 = false;
                for (int i13 = 0; i13 < listMo11260r.size(); i13++) {
                    InterfaceC8847k0 interfaceC8847k1 = listMo11260r.get(i13);
                    InterfaceC5246n0 interfaceC5246n2 = listMo11240V0.get(i13);
                    InterfaceC5246n0 interfaceC5246n0M14206l4 = m14206l(interfaceC5246n2, interfaceC8847k1, i10 + 1);
                    int i14 = C7056a.f39896a[m14197c(interfaceC8847k1.mo17088n(), interfaceC5246n0M14206l4.mo11237d()).ordinal()];
                    if (i14 == 1 || i14 == 2) {
                        interfaceC5246n0M14206l4 = C5258t0.m11302m(interfaceC8847k1);
                    } else if (i14 == 3) {
                        Variance varianceMo17088n = interfaceC8847k1.mo17088n();
                        Variance variance = Variance.INVARIANT;
                        if (varianceMo17088n != variance && !interfaceC5246n0M14206l4.mo11239f()) {
                            interfaceC5246n0M14206l4 = new C5250p0(interfaceC5246n0M14206l4.mo11236c(), variance);
                        }
                    }
                    if (interfaceC5246n0M14206l4 != interfaceC5246n2) {
                        z10 = true;
                    }
                    arrayList.add(interfaceC5246n0M14206l4);
                }
                if (z10) {
                    listMo11240V0 = arrayList;
                }
                InterfaceC9077e interfaceC9077eMo11275c2 = abstractC5252q0.mo11275c(abstractC5257tMo11236c2.mo11289w());
                C5207g.m11111f(listMo11240V0, "newArguments");
                C5207g.m11111f(interfaceC9077eMo11275c2, "newAnnotations");
                AbstractC5257t abstractC5257tM11014m1 = C5206f.m11014m1(abstractC5257tMo11236c2, listMo11240V0, interfaceC9077eMo11275c2, 4);
                if ((abstractC5257tM11014m1 instanceof AbstractC5265x) && (abstractC5257tM14205k instanceof AbstractC5265x)) {
                    abstractC5257tM11014m1 = C0062b.m423z2((AbstractC5265x) abstractC5257tM11014m1, (AbstractC5265x) abstractC5257tM14205k);
                }
                return new C5250p0(abstractC5257tM11014m1, varianceMo11237d3);
            }
        }
        return interfaceC5246n0;
    }
}
