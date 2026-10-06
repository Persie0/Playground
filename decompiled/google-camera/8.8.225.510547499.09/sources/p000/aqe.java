package p000;

import android.support.wearable.complications.rendering.p002EM.voNZjxiJou;
import java.util.Locale;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class aqe {

    /* JADX INFO: renamed from: a */
    public final String f2115a;

    /* JADX INFO: renamed from: b */
    public final String f2116b;

    /* JADX INFO: renamed from: c */
    public final boolean f2117c;

    /* JADX INFO: renamed from: d */
    public final int f2118d;

    /* JADX INFO: renamed from: e */
    public final String f2119e;

    /* JADX INFO: renamed from: f */
    public final int f2120f;

    /* JADX INFO: renamed from: g */
    public final int f2121g;

    public aqe(String str, String str2, boolean z, int i, String str3, int i2) {
        this.f2115a = str;
        this.f2116b = str2;
        this.f2117c = z;
        this.f2118d = i;
        this.f2119e = str3;
        this.f2120f = i2;
        Locale locale = Locale.US;
        locale.getClass();
        String upperCase = str2.toUpperCase(locale);
        upperCase.getClass();
        int i3 = ook.m18804r(upperCase, "INT") ? 3 : (ook.m18804r(upperCase, "CHAR") || ook.m18804r(upperCase, "CLOB") || ook.m18804r(upperCase, "TEXT")) ? 2 : ook.m18804r(upperCase, "BLOB") ? 5 : (ook.m18804r(upperCase, "REAL") || ook.m18804r(upperCase, "FLOA") || ook.m18804r(upperCase, "DOUB")) ? 4 : 1;
        this.f2121g = i3;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aqe)) {
            return false;
        }
        aqe aqeVar = (aqe) obj;
        if (this.f2118d != aqeVar.f2118d || !ooc.m18737c(this.f2115a, aqeVar.f2115a) || this.f2117c != aqeVar.f2117c) {
            return false;
        }
        if (this.f2120f == 1 && aqeVar.f2120f == 2 && (str3 = this.f2119e) != null && !afd.m456d(str3, aqeVar.f2119e)) {
            return false;
        }
        if (this.f2120f != 2 || aqeVar.f2120f != 1 || (str2 = aqeVar.f2119e) == null || afd.m456d(str2, this.f2119e)) {
            return (this.f2120f != aqeVar.f2120f || ((str = this.f2119e) == null ? aqeVar.f2119e == null : afd.m456d(str, aqeVar.f2119e))) && this.f2121g == aqeVar.f2121g;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.f2115a.hashCode() * 31) + this.f2121g) * 31) + (true != this.f2117c ? 1237 : 1231)) * 31) + this.f2118d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Column{name='");
        sb.append(this.f2115a);
        sb.append("', type='");
        sb.append(this.f2116b);
        sb.append("', affinity='");
        sb.append(this.f2121g);
        sb.append("', notNull=");
        sb.append(this.f2117c);
        sb.append(voNZjxiJou.qavqrxu);
        sb.append(this.f2118d);
        sb.append(", defaultValue='");
        String str = this.f2119e;
        if (str == null) {
            str = "undefined";
        }
        sb.append(str);
        sb.append("'}");
        return sb.toString();
    }
}
