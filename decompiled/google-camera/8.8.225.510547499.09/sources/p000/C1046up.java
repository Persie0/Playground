package p000;

import androidx.wear.ambient.AmbientDelegate;

/* JADX INFO: renamed from: up */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class C1046up {

    /* JADX INFO: renamed from: a */
    public final C0947qy f47760a;

    /* JADX INFO: renamed from: b */
    public final AmbientDelegate f47761b;

    public /* synthetic */ C1046up(AmbientDelegate ambientDelegate, C0947qy c0947qy, int i, byte[] bArr) {
        this.f47761b = 1 == (i & 1) ? null : ambientDelegate;
        this.f47760a = (i & 2) != 0 ? null : c0947qy;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1046up)) {
            return false;
        }
        C1046up c1046up = (C1046up) obj;
        return ooc.m18737c(this.f47761b, c1046up.f47761b) && ooc.m18737c(this.f47760a, c1046up.f47760a);
    }

    public final int hashCode() {
        AmbientDelegate ambientDelegate = this.f47761b;
        int iHashCode = ambientDelegate == null ? 0 : ambientDelegate.hashCode();
        C0947qy c0947qy = this.f47760a;
        return (iHashCode * 31) + (c0947qy != null ? c0947qy.f47513a : 0);
    }

    public final String toString() {
        return "OpenVirtualCameraResult(activeCamera=" + this.f47761b + ", lastCameraError=" + this.f47760a + ')';
    }
}
