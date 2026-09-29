package p000;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class eua implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: d */
    public static final HashMap f37916d = new HashMap();

    /* JADX INFO: renamed from: a */
    public final WeakReference f37917a;

    /* JADX INFO: renamed from: b */
    public final Handler f37918b = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: c */
    public final AtomicBoolean f37919c = new AtomicBoolean(false);

    public eua(Activity activity) {
        this.f37917a = new WeakReference(activity);
    }

    /* JADX INFO: renamed from: a */
    public final void m11351a() {
        if (lp1.f49971a.contains(this)) {
            return;
        }
        try {
            mt6 mt6Var = new mt6(this, 16);
            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                mt6Var.run();
            } else {
                this.f37918b.post(mt6Var);
            }
        } catch (Throwable th) {
            lp1.m16420a(this, th);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        if (lp1.f49971a.contains(this)) {
            return;
        }
        try {
            m11351a();
        } catch (Throwable th) {
            lp1.m16420a(this, th);
        }
    }
}
