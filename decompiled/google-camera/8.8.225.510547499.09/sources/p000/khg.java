package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class khg {

    /* JADX INFO: renamed from: a */
    private final long f36016a;

    public khg() {
        int i;
        synchronized (kiu.class) {
            i = kiu.f36220c;
            kiu.f36220c = i + 1;
        }
        this.f36016a = i;
    }

    public final String toString() {
        return "FrameServer-" + this.f36016a;
    }
}
