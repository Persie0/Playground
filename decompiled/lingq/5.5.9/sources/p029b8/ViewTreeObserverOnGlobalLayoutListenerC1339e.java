package p029b8;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.activity.RunnableC0193l;
import dm.C5207g;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import p173i8.C6205a;
import p476x7.C10106e;

/* JADX INFO: renamed from: b8.e */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC1339e implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: d */
    public static final HashMap f8147d = new HashMap();

    /* JADX INFO: renamed from: a */
    public final WeakReference<Activity> f8148a;

    /* JADX INFO: renamed from: b */
    public final Handler f8149b = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: c */
    public final AtomicBoolean f8150c = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b8.e$a */
    public static final class a {
        /* JADX INFO: renamed from: a */
        public static void m4919a(Activity activity) {
            C5207g.m11111f(activity, "activity");
            int iHashCode = activity.hashCode();
            HashMap map = ViewTreeObserverOnGlobalLayoutListenerC1339e.f8147d;
            HashMap map2 = null;
            if (!C6205a.m12742b(ViewTreeObserverOnGlobalLayoutListenerC1339e.class)) {
                try {
                    map2 = ViewTreeObserverOnGlobalLayoutListenerC1339e.f8147d;
                } catch (Throwable th2) {
                    C6205a.m12741a(ViewTreeObserverOnGlobalLayoutListenerC1339e.class, th2);
                }
            }
            Integer numValueOf = Integer.valueOf(iHashCode);
            Object viewTreeObserverOnGlobalLayoutListenerC1339e = map2.get(numValueOf);
            if (viewTreeObserverOnGlobalLayoutListenerC1339e == null) {
                viewTreeObserverOnGlobalLayoutListenerC1339e = new ViewTreeObserverOnGlobalLayoutListenerC1339e(activity);
                map2.put(numValueOf, viewTreeObserverOnGlobalLayoutListenerC1339e);
            }
            ViewTreeObserverOnGlobalLayoutListenerC1339e viewTreeObserverOnGlobalLayoutListenerC1339e2 = (ViewTreeObserverOnGlobalLayoutListenerC1339e) viewTreeObserverOnGlobalLayoutListenerC1339e;
            if (C6205a.m12742b(ViewTreeObserverOnGlobalLayoutListenerC1339e.class)) {
                return;
            }
            try {
                if (C6205a.m12742b(viewTreeObserverOnGlobalLayoutListenerC1339e2)) {
                    return;
                }
                try {
                    if (viewTreeObserverOnGlobalLayoutListenerC1339e2.f8150c.getAndSet(true)) {
                        return;
                    }
                    int i10 = C10106e.f51261a;
                    View viewM18963b = C10106e.m18963b(viewTreeObserverOnGlobalLayoutListenerC1339e2.f8148a.get());
                    if (viewM18963b == null) {
                        return;
                    }
                    ViewTreeObserver viewTreeObserver = viewM18963b.getViewTreeObserver();
                    if (viewTreeObserver.isAlive()) {
                        viewTreeObserver.addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC1339e2);
                        viewTreeObserverOnGlobalLayoutListenerC1339e2.m4918a();
                        return;
                    }
                } catch (Throwable th3) {
                    C6205a.m12741a(viewTreeObserverOnGlobalLayoutListenerC1339e2, th3);
                    return;
                }
                C6205a.m12741a(ViewTreeObserverOnGlobalLayoutListenerC1339e.class, th);
            } catch (Throwable th4) {
                C6205a.m12741a(ViewTreeObserverOnGlobalLayoutListenerC1339e.class, th4);
            }
        }

        /* JADX INFO: renamed from: b */
        public static void m4920b(Activity activity) {
            C5207g.m11111f(activity, "activity");
            int iHashCode = activity.hashCode();
            HashMap map = ViewTreeObserverOnGlobalLayoutListenerC1339e.f8147d;
            HashMap map2 = null;
            if (!C6205a.m12742b(ViewTreeObserverOnGlobalLayoutListenerC1339e.class)) {
                try {
                    map2 = ViewTreeObserverOnGlobalLayoutListenerC1339e.f8147d;
                } catch (Throwable th2) {
                    C6205a.m12741a(ViewTreeObserverOnGlobalLayoutListenerC1339e.class, th2);
                }
            }
            ViewTreeObserverOnGlobalLayoutListenerC1339e viewTreeObserverOnGlobalLayoutListenerC1339e = (ViewTreeObserverOnGlobalLayoutListenerC1339e) map2.remove(Integer.valueOf(iHashCode));
            if (viewTreeObserverOnGlobalLayoutListenerC1339e == null || C6205a.m12742b(ViewTreeObserverOnGlobalLayoutListenerC1339e.class)) {
                return;
            }
            try {
                if (C6205a.m12742b(viewTreeObserverOnGlobalLayoutListenerC1339e)) {
                    return;
                }
                try {
                    if (viewTreeObserverOnGlobalLayoutListenerC1339e.f8150c.getAndSet(false)) {
                        int i10 = C10106e.f51261a;
                        View viewM18963b = C10106e.m18963b(viewTreeObserverOnGlobalLayoutListenerC1339e.f8148a.get());
                        if (viewM18963b == null) {
                            return;
                        }
                        ViewTreeObserver viewTreeObserver = viewM18963b.getViewTreeObserver();
                        if (viewTreeObserver.isAlive()) {
                            viewTreeObserver.removeOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC1339e);
                            return;
                        }
                        return;
                    }
                    return;
                } catch (Throwable th3) {
                    C6205a.m12741a(viewTreeObserverOnGlobalLayoutListenerC1339e, th3);
                    return;
                }
                C6205a.m12741a(ViewTreeObserverOnGlobalLayoutListenerC1339e.class, th);
            } catch (Throwable th4) {
                C6205a.m12741a(ViewTreeObserverOnGlobalLayoutListenerC1339e.class, th4);
            }
        }
    }

    public ViewTreeObserverOnGlobalLayoutListenerC1339e(Activity activity) {
        this.f8148a = new WeakReference<>(activity);
    }

    /* JADX INFO: renamed from: a */
    public final void m4918a() {
        if (C6205a.m12742b(this)) {
            return;
        }
        try {
            RunnableC0193l runnableC0193l = new RunnableC0193l(8, this);
            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                runnableC0193l.run();
            } else {
                this.f8149b.post(runnableC0193l);
            }
        } catch (Throwable th2) {
            C6205a.m12741a(this, th2);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        if (C6205a.m12742b(this)) {
            return;
        }
        try {
            m4918a();
        } catch (Throwable th2) {
            C6205a.m12741a(this, th2);
        }
    }
}
