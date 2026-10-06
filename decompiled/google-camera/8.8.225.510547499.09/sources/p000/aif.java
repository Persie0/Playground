package p000;

import android.os.Looper;
import androidx.wear.ambient.AmbientMode;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class aif {

    /* JADX INFO: renamed from: j */
    private static final ThreadLocal f428j = new ThreadLocal();

    /* JADX INFO: renamed from: g */
    public final aie f435g;

    /* JADX INFO: renamed from: h */
    public aid f436h;

    /* JADX INFO: renamed from: a */
    public final C1117xf f429a = new C1117xf();

    /* JADX INFO: renamed from: b */
    public final ArrayList f430b = new ArrayList();

    /* JADX INFO: renamed from: i */
    public final AmbientMode.AmbientController f437i = new AmbientMode.AmbientController(this);

    /* JADX INFO: renamed from: c */
    public final Runnable f431c = new RunnableC0852nk(this, 13);

    /* JADX INFO: renamed from: d */
    public long f432d = 0;

    /* JADX INFO: renamed from: e */
    public boolean f433e = false;

    /* JADX INFO: renamed from: f */
    public float f434f = 1.0f;

    public aif(aie aieVar) {
        this.f435g = aieVar;
    }

    /* JADX INFO: renamed from: a */
    public static aif m771a() {
        ThreadLocal threadLocal = f428j;
        if (threadLocal.get() == null) {
            threadLocal.set(new aif(new aie()));
        }
        return (aif) threadLocal.get();
    }

    /* JADX INFO: renamed from: b */
    public final boolean m772b() {
        return Thread.currentThread() == ((Looper) this.f435g.f427b).getThread();
    }
}
