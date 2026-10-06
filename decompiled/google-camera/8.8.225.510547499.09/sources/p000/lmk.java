package p000;

import android.os.Process;
import android.os.Trace;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class lmk {

    /* JADX INFO: renamed from: a */
    public static final lmk f38672a = new lmk();

    /* JADX INFO: renamed from: b */
    public volatile boolean f38673b;

    /* JADX INFO: renamed from: c */
    public volatile long f38674c;

    /* JADX INFO: renamed from: d */
    public volatile long f38675d;

    /* JADX INFO: renamed from: e */
    public volatile long f38676e;

    /* JADX INFO: renamed from: f */
    public volatile long f38677f;

    /* JADX INFO: renamed from: g */
    public volatile long f38678g;

    /* JADX INFO: renamed from: h */
    public volatile long f38679h;

    /* JADX INFO: renamed from: i */
    public volatile long f38680i;

    /* JADX INFO: renamed from: j */
    public volatile long f38681j;

    /* JADX INFO: renamed from: k */
    public volatile lgp f38682k;

    /* JADX INFO: renamed from: l */
    public final lmj f38683l = new lmj();

    /* JADX INFO: renamed from: m */
    public final lmc f38684m = new lmc();

    /* JADX INFO: renamed from: n */
    public final lmc f38685n = new lmc();

    /* JADX INFO: renamed from: a */
    public static void m15730a(String str, long j) {
        Trace.setCounter(str, j - Process.getStartElapsedRealtime());
        Trace.setCounter(str, 0L);
    }
}
