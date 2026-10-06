package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public enum htd {
    HIDDEN(0.0f, 255, 255, 255),
    IDLE(0.16f, 255, 255, 255),
    ACTIVE(0.72f, 255, 255, 255),
    WARNING(0.86f, 217, 48, 37);


    /* JADX INFO: renamed from: e */
    public final int f29495e;

    /* JADX INFO: renamed from: f */
    public final int f29496f;

    /* JADX INFO: renamed from: g */
    public final int f29497g;

    /* JADX INFO: renamed from: i */
    private final float f29498i;

    htd(float f, int i, int i2, int i3) {
        this.f29498i = f;
        this.f29495e = i;
        this.f29496f = i2;
        this.f29497g = i3;
    }

    /* JADX INFO: renamed from: a */
    public final int m10732a() {
        return (int) (this.f29498i * 255.0f);
    }
}
