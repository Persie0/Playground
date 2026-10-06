package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public enum njf implements nxt {
    UNKNOWN_STATUS(0),
    NOT_HEEDED(2),
    HEEDED(1);


    /* JADX INFO: renamed from: d */
    public final int f42905d;

    njf(int i) {
        this.f42905d = i;
    }

    @Override // p000.nxt
    /* JADX INFO: renamed from: a */
    public final int mo14936a() {
        return this.f42905d;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f42905d);
    }
}
