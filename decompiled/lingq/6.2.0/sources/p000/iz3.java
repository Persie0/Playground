package p000;

import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public final class iz3 {

    /* JADX INFO: renamed from: a */
    public final String f44797a;

    /* JADX INFO: renamed from: b */
    public final String f44798b;

    /* JADX INFO: renamed from: c */
    public final ho5 f44799c;

    /* JADX INFO: renamed from: d */
    public final File f44800d;

    /* JADX INFO: renamed from: e */
    public final String f44801e;

    /* JADX INFO: renamed from: f */
    public final pj5 f44802f;

    public iz3(String str, String str2, ho5 ho5Var, File file, String str3, pj5 pj5Var) {
        str.getClass();
        ho5Var.getClass();
        this.f44797a = str;
        this.f44798b = str2;
        this.f44799c = ho5Var;
        this.f44800d = file;
        this.f44801e = str3;
        this.f44802f = pj5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iz3)) {
            return false;
        }
        iz3 iz3Var = (iz3) obj;
        return fa4.m11650l(this.f44797a, iz3Var.f44797a) && this.f44798b.equals(iz3Var.f44798b) && fa4.m11650l(this.f44799c, iz3Var.f44799c) && this.f44800d.equals(iz3Var.f44800d) && this.f44801e.equals(iz3Var.f44801e) && fa4.m11650l(this.f44802f, iz3Var.f44802f);
    }

    public final int hashCode() {
        int iM22980c = ux5.m22980c((this.f44800d.hashCode() + ((this.f44799c.hashCode() + ux5.m22980c(this.f44797a.hashCode() * 31, this.f44798b, 961)) * 31)) * 31, this.f44801e, 31);
        pj5 pj5Var = this.f44802f;
        return iM22980c + (pj5Var == null ? 0 : pj5Var.hashCode());
    }

    public final String toString() {
        return "IdentityConfiguration(instanceName=" + this.f44797a + ", apiKey=" + this.f44798b + ", experimentApiKey=null, identityStorageProvider=" + this.f44799c + ", storageDirectory=" + this.f44800d + ", fileName=" + this.f44801e + ", logger=" + this.f44802f + ')';
    }
}
