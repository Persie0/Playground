package mn;

import androidx.datastore.preferences.PreferencesProto$Value;

/* JADX INFO: renamed from: mn.e */
/* JADX INFO: loaded from: classes2.dex */
public final class C7648e implements Comparable<C7648e> {

    /* JADX INFO: renamed from: a */
    public final String f42086a;

    /* JADX INFO: renamed from: b */
    public final boolean f42087b;

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public C7648e(String str, boolean z10) {
        if (str == null) {
            m15230a(0);
            throw null;
        }
        this.f42086a = str;
        this.f42087b = z10;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m15230a(int i10) {
        String str = (i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4) ? 2 : 3];
        if (i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/name/Name";
        } else {
            objArr[0] = "name";
        }
        if (i10 == 1) {
            objArr[1] = "asString";
        } else if (i10 == 2) {
            objArr[1] = "getIdentifier";
        } else if (i10 == 3 || i10 == 4) {
            objArr[1] = "asStringStripSpecialMarkers";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/name/Name";
        }
        switch (i10) {
            case 1:
            case 2:
            case 3:
            case 4:
                break;
            case 5:
                objArr[2] = "identifier";
                break;
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                objArr[2] = "isValidIdentifier";
                break;
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                objArr[2] = "special";
                break;
            case 8:
                objArr[2] = "guessByFirstCharacter";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 != 1 && i10 != 2 && i10 != 3 && i10 != 4) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: i */
    public static C7648e m15231i(String str) {
        if (str != null) {
            return str.startsWith("<") ? m15234o(str) : m15232l(str);
        }
        m15230a(8);
        throw null;
    }

    /* JADX INFO: renamed from: l */
    public static C7648e m15232l(String str) {
        if (str != null) {
            return new C7648e(str, false);
        }
        m15230a(5);
        throw null;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: m */
    public static boolean m15233m(String str) {
        int i10;
        if (str == null) {
            m15230a(6);
            throw null;
        }
        if (!str.isEmpty() && !str.startsWith("<")) {
            for (0; i10 < str.length(); i10 + 1) {
                char cCharAt = str.charAt(i10);
                i10 = (cCharAt == '.' || cCharAt == '/' || cCharAt == '\\') ? 0 : i10 + 1;
                return false;
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: o */
    public static C7648e m15234o(String str) {
        if (str == null) {
            m15230a(7);
            throw null;
        }
        if (str.startsWith("<")) {
            return new C7648e(str, true);
        }
        throw new IllegalArgumentException("special name must start with '<': ".concat(str));
    }

    @Override // java.lang.Comparable
    public final int compareTo(C7648e c7648e) {
        return this.f42086a.compareTo(c7648e.f42086a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7648e)) {
            return false;
        }
        C7648e c7648e = (C7648e) obj;
        return this.f42087b == c7648e.f42087b && this.f42086a.equals(c7648e.f42086a);
    }

    /* JADX INFO: renamed from: f */
    public final String m15235f() {
        String str = this.f42086a;
        if (str != null) {
            return str;
        }
        m15230a(1);
        throw null;
    }

    /* JADX INFO: renamed from: g */
    public final String m15236g() {
        if (this.f42087b) {
            throw new IllegalStateException("not identifier: " + this);
        }
        String strM15235f = m15235f();
        if (strM15235f != null) {
            return strM15235f;
        }
        m15230a(2);
        throw null;
    }

    public final int hashCode() {
        return (this.f42086a.hashCode() * 31) + (this.f42087b ? 1 : 0);
    }

    public final String toString() {
        return this.f42086a;
    }
}
