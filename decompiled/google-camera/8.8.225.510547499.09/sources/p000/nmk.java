package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public enum nmk implements nxt {
    NO_STABILIZATION(0),
    STEADY_FACE(1),
    STANDARD(2),
    CINEMATIC(3),
    LOCKED(4),
    ACTIVE(5);


    /* JADX INFO: renamed from: g */
    public final int f43841g;

    nmk(int i) {
        this.f43841g = i;
    }

    @Override // p000.nxt
    /* JADX INFO: renamed from: a */
    public final int mo14936a() {
        return this.f43841g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f43841g);
    }
}
