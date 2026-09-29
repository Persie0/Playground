package p000;

import com.lingq.core.domain.model.server.ServerEnvironment;

/* JADX INFO: loaded from: classes2.dex */
public final class rc2 {

    /* JADX INFO: renamed from: a */
    public final ServerEnvironment f59061a;

    /* JADX INFO: renamed from: b */
    public final boolean f59062b;

    /* JADX INFO: renamed from: c */
    public final boolean f59063c;

    public rc2(ServerEnvironment serverEnvironment, boolean z, boolean z2) {
        serverEnvironment.getClass();
        this.f59061a = serverEnvironment;
        this.f59062b = z;
        this.f59063c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rc2)) {
            return false;
        }
        rc2 rc2Var = (rc2) obj;
        return this.f59061a == rc2Var.f59061a && this.f59062b == rc2Var.f59062b && this.f59063c == rc2Var.f59063c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f59063c) + g9a.m12428e(this.f59061a.hashCode() * 31, 31, this.f59062b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DevOptionsState(currentServerEnvironment=");
        sb.append(this.f59061a);
        sb.append(", devOptionsAvailable=");
        sb.append(this.f59062b);
        sb.append(", devOptionsUnlocked=");
        return AbstractC3393o1.m17740o(sb, this.f59063c, ")");
    }
}
