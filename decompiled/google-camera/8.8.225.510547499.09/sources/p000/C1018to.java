package p000;

/* JADX INFO: renamed from: to */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class C1018to extends C0748jo {

    /* JADX INFO: renamed from: a */
    public final C0947qy f47685a;

    public C1018to(C0947qy c0947qy) {
        this.f47685a = c0947qy;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1018to) && ooc.m18737c(this.f47685a, ((C1018to) obj).f47685a);
    }

    public final int hashCode() {
        C0947qy c0947qy = this.f47685a;
        if (c0947qy == null) {
            return 0;
        }
        return c0947qy.f47513a;
    }

    public final String toString() {
        return "CameraStateClosing(cameraErrorCode=" + this.f47685a + ')';
    }
}
