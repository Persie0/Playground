package mn;

import androidx.datastore.preferences.PreferencesProto$Value;

/* JADX INFO: renamed from: mn.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C7645b {

    /* JADX INFO: renamed from: a */
    public final C7646c f42073a;

    /* JADX INFO: renamed from: b */
    public final C7646c f42074b;

    /* JADX INFO: renamed from: c */
    public final boolean f42075c;

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public C7645b(C7646c c7646c, C7646c c7646c2, boolean z10) {
        if (c7646c == null) {
            m15200a(1);
            throw null;
        }
        this.f42073a = c7646c;
        this.f42074b = c7646c2;
        this.f42075c = z10;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public C7645b(C7646c c7646c, C7648e c7648e) {
        this(c7646c, C7646c.m15213j(c7648e), false);
        if (c7646c == null) {
            m15200a(3);
            throw null;
        }
        if (c7648e != null) {
        } else {
            m15200a(4);
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001a  */
    /* JADX WARN: Code duplicated, block: B:21:0x0031  */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m15200a(int i10) {
        String str;
        int i11;
        if (i10 != 5 && i10 != 6 && i10 != 7 && i10 != 9) {
            switch (i10) {
                case 13:
                case 14:
                case 15:
                case 16:
                    str = "@NotNull method %s.%s must not return null";
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i10 != 5 && i10 != 6 && i10 != 7 && i10 != 9) {
            switch (i10) {
                case 13:
                case 14:
                case 15:
                case 16:
                    i11 = 2;
                    break;
                default:
                    i11 = 3;
                    break;
            }
        } else {
            i11 = 2;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
            case 3:
                objArr[0] = "packageFqName";
                break;
            case 2:
                objArr[0] = "relativeClassName";
                break;
            case 4:
                objArr[0] = "topLevelName";
                break;
            case 5:
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/name/ClassId";
                break;
            case 8:
                objArr[0] = "name";
                break;
            case 10:
                objArr[0] = "segment";
                break;
            case 11:
            case 12:
                objArr[0] = "string";
                break;
            default:
                objArr[0] = "topLevelFqName";
                break;
        }
        if (i10 == 5) {
            objArr[1] = "getPackageFqName";
        } else if (i10 == 6) {
            objArr[1] = "getRelativeClassName";
        } else if (i10 == 7) {
            objArr[1] = "getShortClassName";
        } else if (i10 != 9) {
            switch (i10) {
                case 13:
                case 14:
                    objArr[1] = "asString";
                    break;
                case 15:
                case 16:
                    objArr[1] = "asFqNameString";
                    break;
                default:
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/name/ClassId";
                    break;
            }
        } else {
            objArr[1] = "asSingleFqName";
        }
        switch (i10) {
            case 1:
            case 2:
            case 3:
            case 4:
                objArr[2] = "<init>";
                break;
            case 5:
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
                break;
            case 8:
                objArr[2] = "createNestedClassId";
                break;
            case 10:
                objArr[2] = "startsWith";
                break;
            case 11:
            case 12:
                objArr[2] = "fromString";
                break;
            default:
                objArr[2] = "topLevel";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 != 5 && i10 != 6 && i10 != 7 && i10 != 9) {
            switch (i10) {
                case 13:
                case 14:
                case 15:
                case 16:
                    break;
                default:
                    throw new IllegalArgumentException(str2);
            }
        }
        throw new IllegalStateException(str2);
    }

    /* JADX INFO: renamed from: e */
    public static C7645b m15201e(String str) {
        return m15202f(str, false);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: f */
    public static C7645b m15202f(String str, boolean z10) {
        String str2;
        String strSubstring = str;
        if (strSubstring == null) {
            m15200a(12);
            throw null;
        }
        int iLastIndexOf = strSubstring.lastIndexOf("/");
        if (iLastIndexOf == -1) {
            str2 = "";
        } else {
            String strReplace = strSubstring.substring(0, iLastIndexOf).replace('/', '.');
            strSubstring = strSubstring.substring(iLastIndexOf + 1);
            str2 = strReplace;
        }
        return new C7645b(new C7646c(str2), new C7646c(strSubstring), z10);
    }

    /* JADX INFO: renamed from: l */
    public static C7645b m15203l(C7646c c7646c) {
        if (c7646c != null) {
            return new C7645b(c7646c.m15217e(), c7646c.m15218f());
        }
        m15200a(0);
        throw null;
    }

    /* JADX INFO: renamed from: b */
    public final C7646c m15204b() {
        C7646c c7646c = this.f42073a;
        boolean zM15216d = c7646c.m15216d();
        C7646c c7646c2 = this.f42074b;
        if (zM15216d) {
            if (c7646c2 != null) {
                return c7646c2;
            }
            m15200a(9);
            throw null;
        }
        return new C7646c(c7646c.m15214b() + "." + c7646c2.m15214b());
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: c */
    public final String m15205c() {
        C7646c c7646c = this.f42073a;
        boolean zM15216d = c7646c.m15216d();
        C7646c c7646c2 = this.f42074b;
        if (zM15216d) {
            String strM15214b = c7646c2.m15214b();
            if (strM15214b != null) {
                return strM15214b;
            }
            m15200a(13);
            throw null;
        }
        String str = c7646c.m15214b().replace('.', '/') + "/" + c7646c2.m15214b();
        if (str != null) {
            return str;
        }
        m15200a(14);
        throw null;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: d */
    public final C7645b m15206d(C7648e c7648e) {
        if (c7648e != null) {
            return new C7645b(m15208h(), this.f42074b.m15215c(c7648e), this.f42075c);
        }
        m15200a(8);
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C7645b.class != obj.getClass()) {
            return false;
        }
        C7645b c7645b = (C7645b) obj;
        return this.f42073a.equals(c7645b.f42073a) && this.f42074b.equals(c7645b.f42074b) && this.f42075c == c7645b.f42075c;
    }

    /* JADX INFO: renamed from: g */
    public final C7645b m15207g() {
        C7646c c7646cM15217e = this.f42074b.m15217e();
        if (c7646cM15217e.m15216d()) {
            return null;
        }
        return new C7645b(m15208h(), c7646cM15217e, this.f42075c);
    }

    /* JADX INFO: renamed from: h */
    public final C7646c m15208h() {
        C7646c c7646c = this.f42073a;
        if (c7646c != null) {
            return c7646c;
        }
        m15200a(5);
        throw null;
    }

    public final int hashCode() {
        return Boolean.valueOf(this.f42075c).hashCode() + ((this.f42074b.hashCode() + (this.f42073a.hashCode() * 31)) * 31);
    }

    /* JADX INFO: renamed from: i */
    public final C7646c m15209i() {
        C7646c c7646c = this.f42074b;
        if (c7646c != null) {
            return c7646c;
        }
        m15200a(6);
        throw null;
    }

    /* JADX INFO: renamed from: j */
    public final C7648e m15210j() {
        C7648e c7648eM15218f = this.f42074b.m15218f();
        if (c7648eM15218f != null) {
            return c7648eM15218f;
        }
        m15200a(7);
        throw null;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m15211k() {
        return !this.f42074b.m15217e().m15216d();
    }

    public final String toString() {
        if (!this.f42073a.m15216d()) {
            return m15205c();
        }
        return "/" + m15205c();
    }
}
