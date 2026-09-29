package mn;

import androidx.datastore.preferences.PreferencesProto$Value;
import cm.InterfaceC2052l;
import dm.C5207g;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: mn.d */
/* JADX INFO: loaded from: classes2.dex */
public final class C7647d {

    /* JADX INFO: renamed from: e */
    public static final C7648e f42079e = C7648e.m15234o("<root>");

    /* JADX INFO: renamed from: f */
    public static final Pattern f42080f = Pattern.compile("\\.");

    /* JADX INFO: renamed from: g */
    public static final a f42081g = new a();

    /* JADX INFO: renamed from: a */
    public final String f42082a;

    /* JADX INFO: renamed from: b */
    public transient C7646c f42083b;

    /* JADX INFO: renamed from: c */
    public transient C7647d f42084c;

    /* JADX INFO: renamed from: d */
    public transient C7648e f42085d;

    /* JADX INFO: renamed from: mn.d$a */
    public static class a implements InterfaceC2052l<String, C7648e> {
        @Override // cm.InterfaceC2052l
        /* JADX INFO: renamed from: n */
        public final C7648e mo528n(String str) {
            return C7648e.m15231i(str);
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public C7647d(String str) {
        if (str != null) {
            this.f42082a = str;
        } else {
            m15222a(2);
            throw null;
        }
    }

    public C7647d(String str, C7646c c7646c) {
        if (str == null) {
            m15222a(0);
            throw null;
        }
        if (c7646c == null) {
            m15222a(1);
            throw null;
        }
        this.f42082a = str;
        this.f42083b = c7646c;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public C7647d(String str, C7647d c7647d, C7648e c7648e) {
        if (str == null) {
            m15222a(3);
            throw null;
        }
        this.f42082a = str;
        this.f42084c = c7647d;
        this.f42085d = c7648e;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m15222a(int i10) {
        String str;
        int i11;
        switch (i10) {
            case 4:
            case 5:
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 17:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
            case 9:
            case 15:
            case 16:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case 4:
            case 5:
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 17:
                i11 = 2;
                break;
            case 9:
            case 15:
            case 16:
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        if (i10 != 1) {
            switch (i10) {
                case 4:
                case 5:
                case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                case 8:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 17:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/name/FqNameUnsafe";
                    break;
                case 9:
                    objArr[0] = "name";
                    break;
                case 15:
                    objArr[0] = "segment";
                    break;
                case 16:
                    objArr[0] = "shortName";
                    break;
                default:
                    objArr[0] = "fqName";
                    break;
            }
        } else {
            objArr[0] = "safe";
        }
        switch (i10) {
            case 4:
                objArr[1] = "asString";
                break;
            case 5:
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                objArr[1] = "toSafe";
                break;
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
            case 8:
                objArr[1] = "parent";
                break;
            case 9:
            case 15:
            case 16:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/name/FqNameUnsafe";
                break;
            case 10:
            case 11:
                objArr[1] = "shortName";
                break;
            case 12:
            case 13:
                objArr[1] = "shortNameOrSpecial";
                break;
            case 14:
                objArr[1] = "pathSegments";
                break;
            case 17:
                objArr[1] = "toString";
                break;
        }
        switch (i10) {
            case 4:
            case 5:
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 17:
                break;
            case 9:
                objArr[2] = "child";
                break;
            case 15:
                objArr[2] = "startsWith";
                break;
            case 16:
                objArr[2] = "topLevel";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i10) {
            case 4:
            case 5:
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 17:
                throw new IllegalStateException(str2);
            case 9:
            case 15:
            case 16:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: b */
    public final C7647d m15223b(C7648e c7648e) {
        String strM15235f;
        if (c7648e == null) {
            m15222a(9);
            throw null;
        }
        if (m15225d()) {
            strM15235f = c7648e.m15235f();
        } else {
            strM15235f = this.f42082a + "." + c7648e.m15235f();
        }
        return new C7647d(strM15235f, this, c7648e);
    }

    /* JADX INFO: renamed from: c */
    public final void m15224c() {
        String str = this.f42082a;
        int iLastIndexOf = str.lastIndexOf(46);
        if (iLastIndexOf >= 0) {
            this.f42085d = C7648e.m15231i(str.substring(iLastIndexOf + 1));
            this.f42084c = new C7647d(str.substring(0, iLastIndexOf));
        } else {
            this.f42085d = C7648e.m15231i(str);
            this.f42084c = C7646c.f42076c.m15221i();
        }
    }

    /* JADX INFO: renamed from: d */
    public final boolean m15225d() {
        return this.f42082a.isEmpty();
    }

    /* JADX INFO: renamed from: e */
    public final boolean m15226e() {
        if (this.f42083b == null) {
            String str = this.f42082a;
            if (str == null) {
                m15222a(4);
                throw null;
            }
            if (str.indexOf(60) >= 0) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C7647d) && this.f42082a.equals(((C7647d) obj).f42082a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: f */
    public final List<C7648e> m15227f() {
        List<C7648e> listEmptyList;
        if (m15225d()) {
            listEmptyList = Collections.emptyList();
        } else {
            String[] strArrSplit = f42080f.split(this.f42082a);
            C5207g.m11111f(strArrSplit, "<this>");
            a aVar = f42081g;
            C5207g.m11111f(aVar, "transform");
            ArrayList arrayList = new ArrayList(strArrSplit.length);
            for (String str : strArrSplit) {
                arrayList.add(aVar.mo528n(str));
            }
            listEmptyList = arrayList;
        }
        if (listEmptyList != null) {
            return listEmptyList;
        }
        m15222a(14);
        throw null;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: g */
    public final C7648e m15228g() {
        C7648e c7648e = this.f42085d;
        if (c7648e != null) {
            if (c7648e != null) {
                return c7648e;
            }
            m15222a(10);
            throw null;
        }
        if (m15225d()) {
            throw new IllegalStateException("root");
        }
        m15224c();
        C7648e c7648e2 = this.f42085d;
        if (c7648e2 != null) {
            return c7648e2;
        }
        m15222a(11);
        throw null;
    }

    /* JADX INFO: renamed from: h */
    public final C7646c m15229h() {
        C7646c c7646c = this.f42083b;
        if (c7646c == null) {
            C7646c c7646c2 = new C7646c(this);
            this.f42083b = c7646c2;
            return c7646c2;
        }
        if (c7646c != null) {
            return c7646c;
        }
        m15222a(5);
        throw null;
    }

    public final int hashCode() {
        return this.f42082a.hashCode();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public final String toString() {
        String strM15235f = m15225d() ? f42079e.m15235f() : this.f42082a;
        if (strM15235f != null) {
            return strM15235f;
        }
        m15222a(17);
        throw null;
    }
}
