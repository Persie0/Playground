package p000;

import android.content.pm.ResolveInfo;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hhs {

    /* JADX INFO: renamed from: a */
    public final ResolveInfo f27855a;

    /* JADX INFO: renamed from: b */
    public final boolean f27856b;

    /* JADX INFO: renamed from: c */
    public final boolean f27857c;

    /* JADX INFO: renamed from: d */
    public final boolean f27858d;

    public hhs() {
    }

    public hhs(ResolveInfo resolveInfo, boolean z, boolean z2, boolean z3) {
        this.f27855a = resolveInfo;
        this.f27856b = z;
        this.f27857c = z2;
        this.f27858d = z3;
    }

    /* JADX INFO: renamed from: a */
    public static hzv m10314a() {
        hzv hzvVar = new hzv();
        hzvVar.m10969g(false);
        return hzvVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hhs) {
            hhs hhsVar = (hhs) obj;
            if (this.f27855a.equals(hhsVar.f27855a) && this.f27856b == hhsVar.f27856b && this.f27857c == hhsVar.f27857c && this.f27858d == hhsVar.f27858d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f27855a.hashCode() ^ 1000003;
        int i = true != this.f27856b ? 1237 : 1231;
        return (((((iHashCode * 1000003) ^ i) * 1000003) ^ (true != this.f27857c ? 1237 : 1231)) * 1000003) ^ (true == this.f27858d ? 1231 : 1237);
    }

    public final String toString() {
        return "SocialQueryingResult{resolveInfo=" + String.valueOf(this.f27855a) + ", selected=" + this.f27856b + ", preselected=" + this.f27857c + ", supported=" + this.f27858d + "}";
    }
}
