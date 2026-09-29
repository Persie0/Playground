package p000;

import android.os.Handler;
import android.os.Looper;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class bb4 {

    /* JADX INFO: renamed from: h */
    public static boolean f8268h = false;

    /* JADX INFO: renamed from: i */
    public static final bb4 f8269i = new bb4();

    /* JADX INFO: renamed from: b */
    public WeakReference f8271b;

    /* JADX INFO: renamed from: a */
    public final Handler f8270a = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: c */
    public int f8272c = 0;

    /* JADX INFO: renamed from: d */
    public boolean f8273d = false;

    /* JADX INFO: renamed from: e */
    public final CopyOnWriteArrayList f8274e = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: f */
    public final RunnableC3795yg f8275f = new RunnableC3795yg(this, 5);

    /* JADX INFO: renamed from: g */
    public final C3600t6 f8276g = new C3600t6(this, 2);

    /* JADX INFO: renamed from: a */
    public final void m3555a(ab4 ab4Var) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f8274e;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            if (((WeakReference) it.next()).get() == ab4Var) {
                return;
            }
        }
        copyOnWriteArrayList.add(new WeakReference(ab4Var));
    }
}
