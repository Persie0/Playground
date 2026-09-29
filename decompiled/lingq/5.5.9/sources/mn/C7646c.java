package mn;

import androidx.datastore.preferences.PreferencesProto$Value;

/* JADX INFO: renamed from: mn.c */
/* JADX INFO: loaded from: classes2.dex */
public final class C7646c {

    /* JADX INFO: renamed from: c */
    public static final C7646c f42076c = new C7646c("");

    /* JADX INFO: renamed from: a */
    public final C7647d f42077a;

    /* JADX INFO: renamed from: b */
    public transient C7646c f42078b;

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public C7646c(String str) {
        if (str != null) {
            this.f42077a = new C7647d(str, this);
        } else {
            m15212a(1);
            throw null;
        }
    }

    public C7646c(C7647d c7647d) {
        if (c7647d != null) {
            this.f42077a = c7647d;
        } else {
            m15212a(2);
            throw null;
        }
    }

    public C7646c(C7647d c7647d, C7646c c7646c) {
        this.f42077a = c7647d;
        this.f42078b = c7646c;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m15212a(int i10) {
        String str;
        int i11;
        switch (i10) {
            case 4:
            case 5:
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
            case 9:
            case 10:
            case 11:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
            case 8:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case 4:
            case 5:
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
            case 9:
            case 10:
            case 11:
                i11 = 2;
                break;
            default:
            case 8:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
            case 2:
            case 3:
                objArr[0] = "fqName";
                break;
            case 4:
            case 5:
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
            case 9:
            case 10:
            case 11:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/name/FqName";
                break;
            case 8:
                objArr[0] = "name";
                break;
            case 12:
                objArr[0] = "segment";
                break;
            case 13:
                objArr[0] = "shortName";
                break;
            default:
                objArr[0] = "names";
                break;
        }
        switch (i10) {
            case 4:
                objArr[1] = "asString";
                break;
            case 5:
                objArr[1] = "toUnsafe";
                break;
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                objArr[1] = "parent";
                break;
            case 8:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/name/FqName";
                break;
            case 9:
                objArr[1] = "shortName";
                break;
            case 10:
                objArr[1] = "shortNameOrSpecial";
                break;
            case 11:
                objArr[1] = "pathSegments";
                break;
        }
        switch (i10) {
            case 1:
            case 2:
            case 3:
                objArr[2] = "<init>";
                break;
            case 4:
            case 5:
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
            case 9:
            case 10:
            case 11:
                break;
            case 8:
                objArr[2] = "child";
                break;
            case 12:
                objArr[2] = "startsWith";
                break;
            case 13:
                objArr[2] = "topLevel";
                break;
            default:
                objArr[2] = "fromSegments";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i10) {
            case 4:
            case 5:
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
            case 9:
            case 10:
            case 11:
                throw new IllegalStateException(str2);
            case 8:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: j */
    public static C7646c m15213j(C7648e c7648e) {
        if (c7648e == null) {
            m15212a(13);
            throw null;
        }
        if (c7648e != null) {
            return new C7646c(new C7647d(c7648e.m15235f(), f42076c.m15221i(), c7648e));
        }
        C7647d.m15222a(16);
        throw null;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: b */
    public final String m15214b() {
        String str = this.f42077a.f42082a;
        if (str != null) {
            return str;
        }
        C7647d.m15222a(4);
        throw null;
    }

    /* JADX INFO: renamed from: c */
    public final C7646c m15215c(C7648e c7648e) {
        if (c7648e != null) {
            return new C7646c(this.f42077a.m15223b(c7648e), this);
        }
        m15212a(8);
        throw null;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m15216d() {
        return this.f42077a.m15225d();
    }

    /* JADX INFO: renamed from: e */
    public final C7646c m15217e() {
        C7646c c7646c = this.f42078b;
        if (c7646c != null) {
            if (c7646c != null) {
                return c7646c;
            }
            m15212a(6);
            throw null;
        }
        if (m15216d()) {
            throw new IllegalStateException("root");
        }
        C7647d c7647d = this.f42077a;
        C7647d c7647d2 = c7647d.f42084c;
        if (c7647d2 == null) {
            if (c7647d.m15225d()) {
                throw new IllegalStateException("root");
            }
            c7647d.m15224c();
            c7647d2 = c7647d.f42084c;
            if (c7647d2 == null) {
                C7647d.m15222a(8);
                throw null;
            }
        }
        C7646c c7646c2 = new C7646c(c7647d2);
        this.f42078b = c7646c2;
        return c7646c2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C7646c) && this.f42077a.equals(((C7646c) obj).f42077a);
    }

    /* JADX INFO: renamed from: f */
    public final C7648e m15218f() {
        C7648e c7648eM15228g = this.f42077a.m15228g();
        if (c7648eM15228g != null) {
            return c7648eM15228g;
        }
        m15212a(9);
        throw null;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: g */
    public final C7648e m15219g() {
        C7648e c7648eM15228g;
        C7647d c7647d = this.f42077a;
        if (c7647d.m15225d()) {
            c7648eM15228g = C7647d.f42079e;
            if (c7648eM15228g == null) {
                C7647d.m15222a(12);
                throw null;
            }
        } else {
            c7648eM15228g = c7647d.m15228g();
            if (c7648eM15228g == null) {
                C7647d.m15222a(13);
                throw null;
            }
        }
        return c7648eM15228g;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: h */
    public final boolean m15220h(C7648e c7648e) {
        if (c7648e == null) {
            m15212a(12);
            throw null;
        }
        C7647d c7647d = this.f42077a;
        if (c7647d.m15225d()) {
            return false;
        }
        String str = c7647d.f42082a;
        int iIndexOf = str.indexOf(46);
        String strM15235f = c7648e.m15235f();
        if (iIndexOf == -1) {
            iIndexOf = str.length();
        }
        return str.regionMatches(0, strM15235f, 0, iIndexOf);
    }

    public final int hashCode() {
        return this.f42077a.hashCode();
    }

    /* JADX INFO: renamed from: i */
    public final C7647d m15221i() {
        C7647d c7647d = this.f42077a;
        if (c7647d != null) {
            return c7647d;
        }
        m15212a(5);
        throw null;
    }

    public final String toString() {
        return this.f42077a.toString();
    }
}
