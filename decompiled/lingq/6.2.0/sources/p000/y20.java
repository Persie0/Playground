package p000;

import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
public final class y20 {

    /* JADX INFO: renamed from: a */
    public final x20 f69115a;

    /* JADX INFO: renamed from: b */
    public final String f69116b;

    /* JADX INFO: renamed from: c */
    public final File f69117c;

    public y20(x20 x20Var, String str, File file) {
        this.f69115a = x20Var;
        if (str == null) {
            C3386nv.m17635v("Null sessionId");
            throw null;
        }
        this.f69116b = str;
        if (file != null) {
            this.f69117c = file;
        } else {
            C3386nv.m17635v("Null reportFile");
            throw null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static y20 m24849a(x20 x20Var, String str, File file) {
        return new y20(x20Var, str, file);
    }

    /* JADX INFO: renamed from: b */
    public final vq1 m24850b() {
        return this.f69115a;
    }

    /* JADX INFO: renamed from: c */
    public final File m24851c() {
        return this.f69117c;
    }

    /* JADX INFO: renamed from: d */
    public final String m24852d() {
        return this.f69116b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof y20)) {
            return false;
        }
        y20 y20Var = (y20) obj;
        return this.f69115a.equals(y20Var.f69115a) && this.f69116b.equals(y20Var.f69116b) && this.f69117c.equals(y20Var.f69117c);
    }

    public final int hashCode() {
        return this.f69117c.hashCode() ^ ((((this.f69115a.hashCode() ^ 1000003) * 1000003) ^ this.f69116b.hashCode()) * 1000003);
    }

    public final String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.f69115a + ", sessionId=" + this.f69116b + ", reportFile=" + this.f69117c + "}";
    }
}
