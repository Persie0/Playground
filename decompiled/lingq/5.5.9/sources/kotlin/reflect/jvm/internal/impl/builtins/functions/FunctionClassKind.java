package kotlin.reflect.jvm.internal.impl.builtins.functions;

import androidx.activity.result.C0204c;
import dm.C5207g;
import kotlin.reflect.jvm.internal.impl.builtins.C6797e;
import mn.C7646c;
import mn.C7648e;
import mo.C7661i;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'KFunction' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:399)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:364)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:349)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:315)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:288)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes2.dex */
public final class FunctionClassKind {
    private static final /* synthetic */ FunctionClassKind[] $VALUES;
    public static final C6798a Companion;
    public static final FunctionClassKind KFunction;
    public static final FunctionClassKind KSuspendFunction;
    private final String classNamePrefix;
    private final boolean isReflectType;
    private final boolean isSuspendType;
    private final C7646c packageFqName;
    public static final FunctionClassKind Function = new FunctionClassKind("Function", 0, C6797e.f38344j, "Function", false, false);
    public static final FunctionClassKind SuspendFunction = new FunctionClassKind("SuspendFunction", 1, C6797e.f38338d, "SuspendFunction", true, false);

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassKind$a */
    public static final class C6798a {

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassKind$a$a */
        public static final class a {

            /* JADX INFO: renamed from: a */
            public final FunctionClassKind f38404a;

            /* JADX INFO: renamed from: b */
            public final int f38405b;

            public a(FunctionClassKind functionClassKind, int i10) {
                this.f38404a = functionClassKind;
                this.f38405b = i10;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return this.f38404a == aVar.f38404a && this.f38405b == aVar.f38405b;
            }

            public final int hashCode() {
                return (this.f38404a.hashCode() * 31) + this.f38405b;
            }

            public final String toString() {
                StringBuilder sb2 = new StringBuilder("KindWithArity(kind=");
                sb2.append(this.f38404a);
                sb2.append(", arity=");
                return C0204c.m853l(sb2, this.f38405b, ')');
            }
        }

        /* JADX INFO: renamed from: a */
        public static a m13571a(String str, C7646c c7646c) {
            FunctionClassKind functionClassKind;
            Integer numValueOf;
            C5207g.m11111f(c7646c, "packageFqName");
            FunctionClassKind[] functionClassKindArrValues = FunctionClassKind.values();
            int length = functionClassKindArrValues.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    functionClassKind = null;
                    break;
                }
                functionClassKind = functionClassKindArrValues[i10];
                if (C5207g.m11106a(functionClassKind.getPackageFqName(), c7646c) && C7661i.m15256V2(str, functionClassKind.getClassNamePrefix(), false)) {
                    break;
                }
                i10++;
            }
            if (functionClassKind == null) {
                return null;
            }
            String strSubstring = str.substring(functionClassKind.getClassNamePrefix().length());
            C5207g.m11110e(strSubstring, "this as java.lang.String).substring(startIndex)");
            if (strSubstring.length() == 0) {
                numValueOf = null;
                break;
            }
            int length2 = strSubstring.length();
            int i11 = 0;
            int i12 = 0;
            while (true) {
                if (i11 >= length2) {
                    numValueOf = Integer.valueOf(i12);
                    break;
                }
                int iCharAt = strSubstring.charAt(i11) - '0';
                if (!(iCharAt >= 0 && iCharAt < 10)) {
                    numValueOf = null;
                    break;
                }
                i12 = (i12 * 10) + iCharAt;
                i11++;
            }
            if (numValueOf != null) {
                return new a(functionClassKind, numValueOf.intValue());
            }
            return null;
        }
    }

    private static final /* synthetic */ FunctionClassKind[] $values() {
        return new FunctionClassKind[]{Function, SuspendFunction, KFunction, KSuspendFunction};
    }

    static {
        C7646c c7646c = C6797e.f38341g;
        KFunction = new FunctionClassKind("KFunction", 2, c7646c, "KFunction", false, true);
        KSuspendFunction = new FunctionClassKind("KSuspendFunction", 3, c7646c, "KSuspendFunction", true, true);
        $VALUES = $values();
        Companion = new C6798a();
    }

    private FunctionClassKind(String str, int i10, C7646c c7646c, String str2, boolean z10, boolean z11) {
        super(str, i10);
        this.packageFqName = c7646c;
        this.classNamePrefix = str2;
        this.isSuspendType = z10;
        this.isReflectType = z11;
    }

    public static FunctionClassKind valueOf(String str) {
        return (FunctionClassKind) Enum.valueOf(FunctionClassKind.class, str);
    }

    public static FunctionClassKind[] values() {
        return (FunctionClassKind[]) $VALUES.clone();
    }

    public final String getClassNamePrefix() {
        return this.classNamePrefix;
    }

    public final C7646c getPackageFqName() {
        return this.packageFqName;
    }

    public final C7648e numberedClassName(int i10) {
        return C7648e.m15232l(this.classNamePrefix + i10);
    }
}
