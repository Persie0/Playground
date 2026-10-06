package p000;

/* JADX INFO: renamed from: qy */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class C0947qy {

    /* JADX INFO: renamed from: a */
    public final int f47513a;

    private /* synthetic */ C0947qy(int i) {
        this.f47513a = i;
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ C0947qy m19364a(int i) {
        return new C0947qy(i);
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m19365b(int i, int i2) {
        return i == i2;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C0947qy) && this.f47513a == ((C0947qy) obj).f47513a;
    }

    public final int hashCode() {
        return this.f47513a;
    }

    public final String toString() {
        return "CameraError(value=" + this.f47513a + ')';
    }
}
