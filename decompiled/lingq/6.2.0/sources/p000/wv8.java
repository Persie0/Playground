package p000;

/* JADX INFO: loaded from: classes.dex */
public abstract class wv8 {

    /* JADX INFO: renamed from: b */
    public static final C0842cc f67390b;

    /* JADX INFO: renamed from: c */
    public static final C0842cc f67391c;

    /* JADX INFO: renamed from: d */
    public static final C0842cc f67392d;

    /* JADX INFO: renamed from: e */
    public static final C0842cc f67393e;

    /* JADX INFO: renamed from: a */
    public static final int f67389a = ci8.m4708U(100, "kotlinx.coroutines.semaphore.maxSpinCycles", 12);

    /* JADX INFO: renamed from: f */
    public static final int f67394f = ci8.m4708U(16, "kotlinx.coroutines.semaphore.segmentSize", 12);

    static {
        int i = 5;
        f67390b = new C0842cc("PERMIT", i);
        f67391c = new C0842cc("TAKEN", i);
        f67392d = new C0842cc("BROKEN", i);
        f67393e = new C0842cc("CANCELLED", i);
    }
}
