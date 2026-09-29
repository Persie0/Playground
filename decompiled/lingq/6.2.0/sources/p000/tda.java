package p000;

/* JADX INFO: loaded from: classes.dex */
public final class tda {

    /* JADX INFO: renamed from: a */
    public final xa3 f62168a;

    /* JADX INFO: renamed from: b */
    public final bc3 f62169b;

    /* JADX INFO: renamed from: c */
    public final int f62170c;

    /* JADX INFO: renamed from: d */
    public final int f62171d;

    /* JADX INFO: renamed from: e */
    public final Object f62172e;

    public tda(xa3 xa3Var, bc3 bc3Var, int i, int i2, Object obj) {
        this.f62168a = xa3Var;
        this.f62169b = bc3Var;
        this.f62170c = i;
        this.f62171d = i2;
        this.f62172e = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tda)) {
            return false;
        }
        tda tdaVar = (tda) obj;
        return fa4.m11650l(this.f62168a, tdaVar.f62168a) && fa4.m11650l(this.f62169b, tdaVar.f62169b) && this.f62170c == tdaVar.f62170c && this.f62171d == tdaVar.f62171d && fa4.m11650l(this.f62172e, tdaVar.f62172e);
    }

    public final int hashCode() {
        xa3 xa3Var = this.f62168a;
        int iM24106b = wq1.m24106b(this.f62171d, wq1.m24106b(this.f62170c, (((xa3Var == null ? 0 : xa3Var.hashCode()) * 31) + this.f62169b.f8327a) * 31, 31), 31);
        Object obj = this.f62172e;
        return iM24106b + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("TypefaceRequest(fontFamily=");
        sb.append(this.f62168a);
        sb.append(", fontWeight=");
        sb.append(this.f62169b);
        sb.append(", fontStyle=");
        String str2 = "Invalid";
        int i = this.f62170c;
        if (i == 0) {
            str = "Normal";
        } else {
            str = i == 1 ? "Italic" : "Invalid";
        }
        sb.append((Object) str);
        sb.append(", fontSynthesis=");
        int i2 = this.f62171d;
        if (i2 == 0) {
            str2 = "None";
        } else if (i2 == 1) {
            str2 = "Weight";
        } else if (i2 == 2) {
            str2 = "Style";
        } else if (i2 == 65535) {
            str2 = "All";
        }
        sb.append((Object) str2);
        sb.append(", resourceLoaderCacheKey=");
        sb.append(this.f62172e);
        sb.append(')');
        return sb.toString();
    }
}
