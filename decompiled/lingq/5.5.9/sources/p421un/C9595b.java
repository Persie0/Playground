package p421un;

import androidx.datastore.preferences.PreferencesProto$Value;
import mn.C7645b;
import mn.C7646c;

/* JADX INFO: renamed from: un.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C9595b {

    /* JADX INFO: renamed from: a */
    public final String f49262a;

    public C9595b(String str) {
        if (str != null) {
            this.f49262a = str;
        } else {
            m18063a(5);
            throw null;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m18063a(int i10) {
        String str = (i10 == 3 || i10 == 6 || i10 == 7 || i10 == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 3 || i10 == 6 || i10 == 7 || i10 == 8) ? 2 : 3];
        switch (i10) {
            case 1:
                objArr[0] = "classId";
                break;
            case 2:
            case 4:
                objArr[0] = "fqName";
                break;
            case 3:
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
            case 8:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmClassName";
                break;
            default:
            case 5:
                objArr[0] = "internalName";
                break;
        }
        if (i10 == 3) {
            objArr[1] = "byFqNameWithoutInnerClasses";
        } else if (i10 == 6) {
            objArr[1] = "getFqNameForClassNameWithoutDollars";
        } else if (i10 == 7) {
            objArr[1] = "getPackageFqName";
        } else if (i10 != 8) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmClassName";
        } else {
            objArr[1] = "getInternalName";
        }
        switch (i10) {
            case 1:
                objArr[2] = "byClassId";
                break;
            case 2:
            case 4:
                objArr[2] = "byFqNameWithoutInnerClasses";
                break;
            case 3:
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
            case 8:
                break;
            case 5:
                objArr[2] = "<init>";
                break;
            default:
                objArr[2] = "byInternalName";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 != 3 && i10 != 6 && i10 != 7 && i10 != 8) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    /* JADX INFO: renamed from: b */
    public static C9595b m18064b(C7645b c7645b) {
        if (c7645b == null) {
            m18063a(1);
            throw null;
        }
        C7646c c7646cM15208h = c7645b.m15208h();
        String strReplace = c7645b.m15209i().m15214b().replace('.', '$');
        if (c7646cM15208h.m15216d()) {
            return new C9595b(strReplace);
        }
        return new C9595b(c7646cM15208h.m15214b().replace('.', '/') + "/" + strReplace);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: c */
    public static C9595b m18065c(C7646c c7646c) {
        if (c7646c != null) {
            return new C9595b(c7646c.m15214b().replace('.', '/'));
        }
        m18063a(2);
        throw null;
    }

    /* JADX INFO: renamed from: d */
    public static C9595b m18066d(String str) {
        if (str != null) {
            return new C9595b(str);
        }
        m18063a(0);
        throw null;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: e */
    public final String m18067e() {
        String str = this.f49262a;
        if (str != null) {
            return str;
        }
        m18063a(8);
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C9595b.class != obj.getClass()) {
            return false;
        }
        return this.f49262a.equals(((C9595b) obj).f49262a);
    }

    public final int hashCode() {
        return this.f49262a.hashCode();
    }

    public final String toString() {
        return this.f49262a;
    }
}
