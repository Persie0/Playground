package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public enum nua implements nxt {
    f44608a(0),
    CAMERA_MOVED_TOO_FAST(1),
    f44610c(2),
    TOO_EARLY_FOR_HDR_PLUS_RESULT(3),
    NOT_ENOUGH_MOTION(4);


    /* JADX INFO: renamed from: f */
    public final int f44614f;

    nua(int i) {
        this.f44614f = i;
    }

    @Override // p000.nxt
    /* JADX INFO: renamed from: a */
    public final int mo14936a() {
        return this.f44614f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f44614f);
    }
}
