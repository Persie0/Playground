package p000;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.SparseIntArray;
import com.google.firebase.perf.metrics.Trace;
import com.google.firebase.perf.p010v1.ApplicationProcessState;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.util.Constants$CounterNames;
import com.google.firebase.perf.util.Constants$TraceNames;
import com.google.firebase.perf.util.Timer;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: us */
/* JADX INFO: loaded from: classes.dex */
public final class C3659us implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: M */
    public static final C3723wi f64261M = C3723wi.m23970d();

    /* JADX INFO: renamed from: N */
    public static volatile C3659us f64262N;

    /* JADX INFO: renamed from: H */
    public Timer f64263H;

    /* JADX INFO: renamed from: I */
    public Timer f64264I;

    /* JADX INFO: renamed from: J */
    public ApplicationProcessState f64265J;

    /* JADX INFO: renamed from: K */
    public boolean f64266K;

    /* JADX INFO: renamed from: L */
    public boolean f64267L;

    /* JADX INFO: renamed from: a */
    public final WeakHashMap f64268a;

    /* JADX INFO: renamed from: b */
    public final WeakHashMap f64269b;

    /* JADX INFO: renamed from: c */
    public final WeakHashMap f64270c;

    /* JADX INFO: renamed from: d */
    public final WeakHashMap f64271d;

    /* JADX INFO: renamed from: e */
    public final HashMap f64272e;

    /* JADX INFO: renamed from: f */
    public final HashSet f64273f;

    /* JADX INFO: renamed from: g */
    public final HashSet f64274g;

    /* JADX INFO: renamed from: h */
    public final AtomicInteger f64275h;

    /* JADX INFO: renamed from: i */
    public final mba f64276i;

    /* JADX INFO: renamed from: j */
    public final dh1 f64277j;

    /* JADX INFO: renamed from: k */
    public final s46 f64278k;

    /* JADX INFO: renamed from: l */
    public final boolean f64279l;

    public C3659us(mba mbaVar, s46 s46Var) {
        dh1 dh1VarM10376e = dh1.m10376e();
        C3723wi c3723wi = ug3.f63881e;
        this.f64268a = new WeakHashMap();
        this.f64269b = new WeakHashMap();
        this.f64270c = new WeakHashMap();
        this.f64271d = new WeakHashMap();
        this.f64272e = new HashMap();
        this.f64273f = new HashSet();
        this.f64274g = new HashSet();
        this.f64275h = new AtomicInteger(0);
        this.f64265J = ApplicationProcessState.BACKGROUND;
        this.f64266K = false;
        this.f64267L = true;
        this.f64276i = mbaVar;
        this.f64278k = s46Var;
        this.f64277j = dh1VarM10376e;
        this.f64279l = true;
    }

    /* JADX INFO: renamed from: a */
    public static C3659us m22881a() {
        if (f64262N == null) {
            synchronized (C3659us.class) {
                try {
                    if (f64262N == null) {
                        f64262N = new C3659us(mba.f50883N, new s46(8));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f64262N;
    }

    /* JADX INFO: renamed from: b */
    public final void m22882b(String str) {
        synchronized (this.f64272e) {
            try {
                Long l = (Long) this.f64272e.get(str);
                HashMap map = this.f64272e;
                if (l == null) {
                    map.put(str, 1L);
                } else {
                    map.put(str, Long.valueOf(l.longValue() + 1));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m22883c() {
        synchronized (this.f64274g) {
            try {
                Iterator it = this.f64274g.iterator();
                while (it.hasNext()) {
                    if (((h53) it.next()) != null) {
                        try {
                            C3723wi c3723wi = g53.f40227b;
                        } catch (IllegalStateException e) {
                            h53.f41801a.m23976g("FirebaseApp is not initialized. Firebase Performance will not be collecting any performance metrics until initialized. %s", e);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m22884d(Activity activity) {
        mz6 mz6Var;
        WeakHashMap weakHashMap = this.f64271d;
        Trace trace = (Trace) weakHashMap.get(activity);
        if (trace == null) {
            return;
        }
        weakHashMap.remove(activity);
        ug3 ug3Var = (ug3) this.f64269b.get(activity);
        qn3 qn3Var = ug3Var.f63883b;
        HashMap map = ug3Var.f63884c;
        C3723wi c3723wi = ug3.f63881e;
        if (ug3Var.f63885d) {
            if (!map.isEmpty()) {
                c3723wi.m23971a("Sub-recordings are still ongoing! Sub-recordings should be stopped first before stopping Activity screen trace.");
                map.clear();
            }
            mz6 mz6VarM22725a = ug3Var.m22725a();
            try {
                qn3Var.m20051E(ug3Var.f63882a);
            } catch (IllegalArgumentException | NullPointerException e) {
                if (e instanceof NullPointerException) {
                    throw e;
                }
                c3723wi.m23976g("View not hardware accelerated. Unable to collect FrameMetrics. %s", e.toString());
                mz6VarM22725a = new mz6();
            }
            sg3 sg3Var = (sg3) qn3Var.f57974a;
            Object obj = sg3Var.f60817c;
            sg3Var.f60817c = new SparseIntArray[9];
            ug3Var.f63885d = false;
            mz6Var = mz6VarM22725a;
        } else {
            c3723wi.m23971a("Cannot stop because no recording was started");
            mz6Var = new mz6();
        }
        if (mz6Var.m17160b()) {
            dn8.m10498a(trace, (tg3) mz6Var.m17159a());
            trace.stop();
        } else {
            f64261M.m23976g("Failed to record frame data for %s.", activity.getClass().getSimpleName());
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m22885e(String str, Timer timer, Timer timer2) {
        if (this.f64277j.m10390n()) {
            b8a b8aVarM10924L = e8a.m10924L();
            b8aVarM10924L.m3482m(str);
            b8aVarM10924L.m3480k(timer.f13787a);
            b8aVarM10924L.m3481l(timer.m6743b(timer2));
            c77 c77VarM6735a = SessionManager.getInstance().perfSession().m6735a();
            b8aVarM10924L.m22767h();
            e8a.m10930x((e8a) b8aVarM10924L.f64019b, c77VarM6735a);
            int andSet = this.f64275h.getAndSet(0);
            synchronized (this.f64272e) {
                try {
                    HashMap map = this.f64272e;
                    b8aVarM10924L.m22767h();
                    e8a.m10926t((e8a) b8aVarM10924L.f64019b).putAll(map);
                    if (andSet != 0) {
                        b8aVarM10924L.m3479j(Constants$CounterNames.TRACE_STARTED_NOT_STOPPED.toString(), andSet);
                    }
                    this.f64272e.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.f64276i.m16751c((e8a) b8aVarM10924L.m22766g(), ApplicationProcessState.FOREGROUND_BACKGROUND);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m22886f(Activity activity) {
        if (this.f64279l && this.f64277j.m10390n()) {
            ug3 ug3Var = new ug3(activity);
            this.f64269b.put(activity, ug3Var);
            if (activity instanceof id3) {
                pf3 pf3Var = new pf3(this.f64278k, this.f64276i, this, ug3Var);
                this.f64270c.put(activity, pf3Var);
                ((id3) activity).m13792j().m2152Y(pf3Var, true);
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m22887g(ApplicationProcessState applicationProcessState) {
        this.f64265J = applicationProcessState;
        synchronized (this.f64273f) {
            try {
                Iterator it = this.f64273f.iterator();
                while (it.hasNext()) {
                    InterfaceC3622ts interfaceC3622ts = (InterfaceC3622ts) ((WeakReference) it.next()).get();
                    if (interfaceC3622ts != null) {
                        interfaceC3622ts.onUpdateAppState(this.f64265J);
                    } else {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        m22886f(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        this.f64269b.remove(activity);
        WeakHashMap weakHashMap = this.f64270c;
        if (weakHashMap.containsKey(activity)) {
            ((id3) activity).m13792j().m2176l0((ge3) weakHashMap.remove(activity));
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityResumed(Activity activity) {
        try {
            if (this.f64268a.isEmpty()) {
                this.f64278k.getClass();
                this.f64263H = new Timer();
                this.f64268a.put(activity, Boolean.TRUE);
                if (this.f64267L) {
                    m22887g(ApplicationProcessState.FOREGROUND);
                    m22883c();
                    this.f64267L = false;
                } else {
                    m22885e(Constants$TraceNames.BACKGROUND_TRACE_NAME.toString(), this.f64264I, this.f64263H);
                    m22887g(ApplicationProcessState.FOREGROUND);
                }
            } else {
                this.f64268a.put(activity, Boolean.TRUE);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityStarted(Activity activity) {
        try {
            if (this.f64279l && this.f64277j.m10390n()) {
                if (!this.f64269b.containsKey(activity)) {
                    m22886f(activity);
                }
                ((ug3) this.f64269b.get(activity)).m22726b();
                Trace trace = new Trace("_st_".concat(activity.getClass().getSimpleName()), this.f64276i, this.f64278k, this);
                trace.start();
                this.f64271d.put(activity, trace);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityStopped(Activity activity) {
        try {
            if (this.f64279l) {
                m22884d(activity);
            }
            if (this.f64268a.containsKey(activity)) {
                this.f64268a.remove(activity);
                if (this.f64268a.isEmpty()) {
                    this.f64278k.getClass();
                    this.f64264I = new Timer();
                    m22885e(Constants$TraceNames.FOREGROUND_TRACE_NAME.toString(), this.f64263H, this.f64264I);
                    m22887g(ApplicationProcessState.BACKGROUND);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
