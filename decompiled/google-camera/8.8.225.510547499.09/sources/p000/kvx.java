package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public enum kvx implements nxt {
    NONE(0),
    PHOTO_OCR(1),
    BARHOPPER(2),
    f37466d(3);


    /* JADX INFO: renamed from: e */
    private final int f37468e;

    kvx(int i) {
        this.f37468e = i;
    }

    @Override // p000.nxt
    /* JADX INFO: renamed from: a */
    public final int mo14936a() {
        return this.f37468e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f37468e);
    }
}
