package p000;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ddb implements Runnable {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ ddb f35477b = new ddb(0);

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ ddb f35478c = new ddb(2);

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ ddb f35479d = new ddb(3);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f35480a;

    public /* synthetic */ ddb(int i) {
        this.f35480a = i;
    }

    /* JADX INFO: renamed from: a */
    private final /* synthetic */ void m10301a() {
    }

    /* JADX INFO: renamed from: b */
    private final void m10302b() {
    }

    /* JADX INFO: renamed from: c */
    private final /* synthetic */ void m10303c() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f35480a) {
            case 0:
            case 1:
            case 2:
                return;
            default:
                throw new IllegalStateException("Span was closed by an invalid call to SpanEndSignal.run()");
        }
    }
}
