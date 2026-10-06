package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public enum nhl implements nxt {
    UNKNOWN_CAMERA_DIRECTION(0),
    FRONT(1),
    BACK(2);


    /* JADX INFO: renamed from: d */
    public final int f42341d;

    nhl(int i) {
        this.f42341d = i;
    }

    @Override // p000.nxt
    /* JADX INFO: renamed from: a */
    public final int mo14936a() {
        return this.f42341d;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f42341d);
    }
}
