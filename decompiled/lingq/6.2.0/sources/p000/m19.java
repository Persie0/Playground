package p000;

import com.lingq.core.settings.ViewKeys;

/* JADX INFO: loaded from: classes2.dex */
public final class m19 extends h29 {

    /* JADX INFO: renamed from: a */
    public final long f50438a;

    /* JADX INFO: renamed from: b */
    public final String f50439b;

    /* JADX INFO: renamed from: c */
    public final ViewKeys f50440c;

    public m19(long j, String str, ViewKeys viewKeys) {
        viewKeys.getClass();
        this.f50438a = j;
        this.f50439b = str;
        this.f50440c = viewKeys;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m19)) {
            return false;
        }
        m19 m19Var = (m19) obj;
        return this.f50438a == m19Var.f50438a && this.f50439b.equals(m19Var.f50439b) && this.f50440c == m19Var.f50440c;
    }

    public final int hashCode() {
        return this.f50440c.hashCode() + ux5.m22980c(Long.hashCode(this.f50438a) * 31, this.f50439b, 31);
    }

    public final String toString() {
        return "About(versionCode=" + this.f50438a + ", versionName=" + this.f50439b + ", key=" + this.f50440c + ")";
    }
}
