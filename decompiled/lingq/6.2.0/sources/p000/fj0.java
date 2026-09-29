package p000;

/* JADX INFO: loaded from: classes.dex */
public abstract class fj0 {

    /* JADX INFO: renamed from: a */
    public static final ku0 f39170a = new ku0(-1, null, null, 0);

    /* JADX INFO: renamed from: b */
    public static final int f39171b = ci8.m4708U(32, "kotlinx.coroutines.bufferedChannel.segmentSize", 12);

    /* JADX INFO: renamed from: c */
    public static final int f39172c = ci8.m4708U(10000, "kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations", 12);

    /* JADX INFO: renamed from: d */
    public static final C0842cc f39173d = new C0842cc("BUFFERED", 5);

    /* JADX INFO: renamed from: e */
    public static final C0842cc f39174e = new C0842cc("SHOULD_BUFFER", 5);

    /* JADX INFO: renamed from: f */
    public static final C0842cc f39175f = new C0842cc("S_RESUMING_BY_RCV", 5);

    /* JADX INFO: renamed from: g */
    public static final C0842cc f39176g = new C0842cc("RESUMING_BY_EB", 5);

    /* JADX INFO: renamed from: h */
    public static final C0842cc f39177h = new C0842cc("POISONED", 5);

    /* JADX INFO: renamed from: i */
    public static final C0842cc f39178i = new C0842cc("DONE_RCV", 5);

    /* JADX INFO: renamed from: j */
    public static final C0842cc f39179j = new C0842cc("INTERRUPTED_SEND", 5);

    /* JADX INFO: renamed from: k */
    public static final C0842cc f39180k = new C0842cc("INTERRUPTED_RCV", 5);

    /* JADX INFO: renamed from: l */
    public static final C0842cc f39181l = new C0842cc("CHANNEL_CLOSED", 5);

    /* JADX INFO: renamed from: m */
    public static final C0842cc f39182m = new C0842cc("SUSPEND", 5);

    /* JADX INFO: renamed from: n */
    public static final C0842cc f39183n = new C0842cc("SUSPEND_NO_WAITER", 5);

    /* JADX INFO: renamed from: o */
    public static final C0842cc f39184o = new C0842cc("FAILED", 5);

    /* JADX INFO: renamed from: p */
    public static final C0842cc f39185p = new C0842cc("NO_RECEIVE_RESULT", 5);

    /* JADX INFO: renamed from: q */
    public static final C0842cc f39186q = new C0842cc("CLOSE_HANDLER_CLOSED", 5);

    /* JADX INFO: renamed from: r */
    public static final C0842cc f39187r = new C0842cc("CLOSE_HANDLER_INVOKED", 5);

    /* JADX INFO: renamed from: s */
    public static final C0842cc f39188s = new C0842cc("NO_CLOSE_CAUSE", 5);

    /* JADX INFO: renamed from: a */
    public static final boolean m11887a(qm0 qm0Var, Object obj, aj3 aj3Var) {
        C0842cc c0842ccMo10139d = qm0Var.mo10139d(obj, aj3Var);
        if (c0842ccMo10139d == null) {
            return false;
        }
        qm0Var.mo10142s(c0842ccMo10139d);
        return true;
    }
}
