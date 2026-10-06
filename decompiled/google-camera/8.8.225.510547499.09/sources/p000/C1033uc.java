package p000;

/* JADX INFO: renamed from: uc */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class C1033uc {

    /* JADX INFO: renamed from: a */
    public final C0986sj f47723a;

    /* JADX INFO: renamed from: b */
    public final C0947qy f47724b;

    public /* synthetic */ C1033uc(C0986sj c0986sj, C0947qy c0947qy, int i) {
        this.f47723a = 1 == (i & 1) ? null : c0986sj;
        this.f47724b = (i & 2) != 0 ? null : c0947qy;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1033uc)) {
            return false;
        }
        C1033uc c1033uc = (C1033uc) obj;
        return ooc.m18737c(this.f47723a, c1033uc.f47723a) && ooc.m18737c(this.f47724b, c1033uc.f47724b);
    }

    public final int hashCode() {
        C0986sj c0986sj = this.f47723a;
        int iHashCode = c0986sj == null ? 0 : c0986sj.hashCode();
        C0947qy c0947qy = this.f47724b;
        return (iHashCode * 31) + (c0947qy != null ? c0947qy.f47513a : 0);
    }

    public final String toString() {
        return "OpenCameraResult(cameraState=" + this.f47723a + ", errorCode=" + this.f47724b + ')';
    }
}
