package p000;

import com.lingq.core.settings.ViewKeys;

/* JADX INFO: loaded from: classes2.dex */
public final class n19 extends h29 {

    /* JADX INFO: renamed from: a */
    public final ViewKeys f52185a;

    /* JADX INFO: renamed from: b */
    public final int f52186b;

    /* JADX INFO: renamed from: c */
    public final int f52187c;

    /* JADX INFO: renamed from: d */
    public final int f52188d;

    /* JADX INFO: renamed from: e */
    public final String f52189e;

    /* JADX INFO: renamed from: f */
    public final boolean f52190f;

    public n19(ViewKeys viewKeys, int i, int i2, int i3, String str, boolean z) {
        viewKeys.getClass();
        this.f52185a = viewKeys;
        this.f52186b = i;
        this.f52187c = i2;
        this.f52188d = i3;
        this.f52189e = str;
        this.f52190f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n19)) {
            return false;
        }
        n19 n19Var = (n19) obj;
        return this.f52185a == n19Var.f52185a && this.f52186b == n19Var.f52186b && this.f52187c == n19Var.f52187c && this.f52188d == n19Var.f52188d && this.f52189e.equals(n19Var.f52189e) && this.f52190f == n19Var.f52190f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f52190f) + ux5.m22980c(wq1.m24106b(this.f52188d, wq1.m24106b(this.f52187c, wq1.m24106b(this.f52186b, this.f52185a.hashCode() * 31, 31), 31), 31), this.f52189e, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioTranscription(key=");
        sb.append(this.f52185a);
        sb.append(", title=");
        sb.append(this.f52186b);
        sb.append(", balance=");
        hn1.m13360j(this.f52187c, this.f52188d, ", desc=", ", date=", sb);
        sb.append(this.f52189e);
        sb.append(", requestPlus=");
        sb.append(this.f52190f);
        sb.append(")");
        return sb.toString();
    }
}
