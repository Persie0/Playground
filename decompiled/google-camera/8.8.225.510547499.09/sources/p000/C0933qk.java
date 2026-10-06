package p000;

import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: qk */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class C0933qk extends C0210gh {

    /* JADX INFO: renamed from: a */
    public static final Executor f47490a = new ExecutorC0932qj(0);

    /* JADX INFO: renamed from: c */
    private static volatile C0933qk f47491c;

    /* JADX INFO: renamed from: b */
    public final C0210gh f47492b;

    /* JADX INFO: renamed from: d */
    private final C0210gh f47493d;

    private C0933qk() {
        C0935qm c0935qm = new C0935qm();
        this.f47493d = c0935qm;
        this.f47492b = c0935qm;
    }

    /* JADX INFO: renamed from: b */
    public static C0933qk m19346b() {
        if (f47491c != null) {
            return f47491c;
        }
        synchronized (C0933qk.class) {
            if (f47491c == null) {
                f47491c = new C0933qk();
            }
        }
        return f47491c;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m19347c() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }
}
