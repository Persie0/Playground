package p000;

import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class vq9 {

    /* JADX INFO: renamed from: a */
    public final String f65792a;

    /* JADX INFO: renamed from: b */
    public final String f65793b;

    /* JADX INFO: renamed from: c */
    public final boolean f65794c;

    /* JADX INFO: renamed from: d */
    public final int f65795d;

    /* JADX INFO: renamed from: e */
    public final String f65796e;

    /* JADX INFO: renamed from: f */
    public final int f65797f;

    /* JADX INFO: renamed from: g */
    public final int f65798g;

    public vq9(String str, String str2, int i, boolean z, int i2, String str3) {
        str.getClass();
        str2.getClass();
        this.f65792a = str;
        this.f65793b = str2;
        this.f65794c = z;
        this.f65795d = i;
        this.f65796e = str3;
        this.f65797f = i2;
        String upperCase = str2.toUpperCase(Locale.ROOT);
        upperCase.getClass();
        this.f65798g = vk9.m23380c0(upperCase, "INT", false) ? 3 : (vk9.m23380c0(upperCase, "CHAR", false) || vk9.m23380c0(upperCase, "CLOB", false) || vk9.m23380c0(upperCase, "TEXT", false)) ? 2 : vk9.m23380c0(upperCase, "BLOB", false) ? 5 : (vk9.m23380c0(upperCase, "REAL", false) || vk9.m23380c0(upperCase, "FLOA", false) || vk9.m23380c0(upperCase, "DOUB", false)) ? 4 : 1;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof vq9) {
                boolean z = this.f65795d > 0;
                vq9 vq9Var = (vq9) obj;
                int i = vq9Var.f65797f;
                if (z == (vq9Var.f65795d > 0) && fa4.m11650l(this.f65792a, vq9Var.f65792a) && this.f65794c == vq9Var.f65794c) {
                    String str = vq9Var.f65796e;
                    int i2 = this.f65797f;
                    String str2 = this.f65796e;
                    if ((i2 != 1 || i != 2 || str2 == null || e6d.m10896a(str2, str)) && ((i2 != 2 || i != 1 || str == null || e6d.m10896a(str, str2)) && ((i2 == 0 || i2 != i || (str2 == null ? str == null : e6d.m10896a(str2, str))) && this.f65798g == vq9Var.f65798g))) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((this.f65792a.hashCode() * 31) + this.f65798g) * 31) + (this.f65794c ? 1231 : 1237)) * 31) + this.f65795d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("\n            |Column {\n            |   name = '");
        sb.append(this.f65792a);
        sb.append("',\n            |   type = '");
        sb.append(this.f65793b);
        sb.append("',\n            |   affinity = '");
        sb.append(this.f65798g);
        sb.append("',\n            |   notNull = '");
        sb.append(this.f65794c);
        sb.append("',\n            |   primaryKeyPosition = '");
        sb.append(this.f65795d);
        sb.append("',\n            |   defaultValue = '");
        String str = this.f65796e;
        if (str == null) {
            str = "undefined";
        }
        sb.append(str);
        sb.append("'\n            |}\n        ");
        return wk9.m24028K(wk9.m24030M(sb.toString()), "    ");
    }
}
