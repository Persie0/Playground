package com.google.firebase.perf.metrics;

import android.R;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.view.View;
import androidx.lifecycle.Lifecycle$Event;
import com.google.firebase.perf.metrics.AppStartTrace;
import com.google.firebase.perf.p010v1.ApplicationProcessState;
import com.google.firebase.perf.session.PerfSession;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.util.Constants$TraceNames;
import com.google.firebase.perf.util.Timer;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p000.C3723wi;
import p000.RunnableC0806bd;
import p000.ViewTreeObserverOnDrawListenerC3585ss;
import p000.b8a;
import p000.cl7;
import p000.dh1;
import p000.ds6;
import p000.e8a;
import p000.k50;
import p000.kh1;
import p000.mba;
import p000.mz6;
import p000.q43;
import p000.s46;
import p000.tb5;
import p000.ux5;
import p000.x53;
import p000.zh7;

/* JADX INFO: loaded from: classes.dex */
public class AppStartTrace implements Application.ActivityLifecycleCallbacks, tb5 {

    /* JADX INFO: renamed from: R */
    public static final Timer f13742R = new Timer();

    /* JADX INFO: renamed from: S */
    public static final long f13743S = 60000000;

    /* JADX INFO: renamed from: T */
    public static final long f13744T = 50000;

    /* JADX INFO: renamed from: U */
    public static volatile AppStartTrace f13745U;

    /* JADX INFO: renamed from: V */
    public static ThreadPoolExecutor f13746V;

    /* JADX INFO: renamed from: M */
    public PerfSession f13752M;

    /* JADX INFO: renamed from: b */
    public final mba f13758b;

    /* JADX INFO: renamed from: c */
    public final dh1 f13759c;

    /* JADX INFO: renamed from: d */
    public final b8a f13760d;

    /* JADX INFO: renamed from: e */
    public Application f13761e;

    /* JADX INFO: renamed from: g */
    public final Timer f13763g;

    /* JADX INFO: renamed from: h */
    public final Timer f13764h;

    /* JADX INFO: renamed from: a */
    public boolean f13757a = false;

    /* JADX INFO: renamed from: f */
    public boolean f13762f = false;

    /* JADX INFO: renamed from: i */
    public Timer f13765i = null;

    /* JADX INFO: renamed from: j */
    public Timer f13766j = null;

    /* JADX INFO: renamed from: k */
    public Timer f13767k = null;

    /* JADX INFO: renamed from: l */
    public Timer f13768l = null;

    /* JADX INFO: renamed from: H */
    public Timer f13747H = null;

    /* JADX INFO: renamed from: I */
    public Timer f13748I = null;

    /* JADX INFO: renamed from: J */
    public Timer f13749J = null;

    /* JADX INFO: renamed from: K */
    public Timer f13750K = null;

    /* JADX INFO: renamed from: L */
    public Timer f13751L = null;

    /* JADX INFO: renamed from: N */
    public boolean f13753N = false;

    /* JADX INFO: renamed from: O */
    public int f13754O = 0;

    /* JADX INFO: renamed from: P */
    public final ViewTreeObserverOnDrawListenerC3585ss f13755P = new ViewTreeObserverOnDrawListenerC3585ss(this);

    /* JADX INFO: renamed from: Q */
    public boolean f13756Q = false;

    public AppStartTrace(mba mbaVar, s46 s46Var, dh1 dh1Var, ThreadPoolExecutor threadPoolExecutor) {
        Timer timer = null;
        this.f13758b = mbaVar;
        this.f13759c = dh1Var;
        f13746V = threadPoolExecutor;
        b8a b8aVarM10924L = e8a.m10924L();
        b8aVarM10924L.m3482m("_experiment_app_start_ttid");
        this.f13760d = b8aVarM10924L;
        long startElapsedRealtime = Process.getStartElapsedRealtime();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long micros = timeUnit.toMicros(startElapsedRealtime);
        this.f13763g = new Timer((micros - (SystemClock.elapsedRealtimeNanos() / 1000)) + timeUnit.toMicros(System.currentTimeMillis()), micros);
        k50 k50Var = (k50) q43.m19641c().m19645b(k50.class);
        if (k50Var != null) {
            long micros2 = timeUnit.toMicros(k50Var.f46719b);
            timer = new Timer((micros2 - (SystemClock.elapsedRealtimeNanos() / 1000)) + timeUnit.toMicros(System.currentTimeMillis()), micros2);
        }
        this.f13764h = timer;
    }

    /* JADX INFO: renamed from: f */
    public static boolean m6725f(Application application) {
        ActivityManager activityManager = (ActivityManager) application.getSystemService("activity");
        if (activityManager == null) {
            return true;
        }
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return false;
        }
        String packageName = application.getPackageName();
        String strM22990m = ux5.m22990m(packageName, ":");
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.importance == 100 && (runningAppProcessInfo.processName.equals(packageName) || runningAppProcessInfo.processName.startsWith(strM22990m))) {
                return true;
            }
        }
        return false;
    }

    public static void setLauncherActivityOnCreateTime(String str) {
    }

    public static void setLauncherActivityOnResumeTime(String str) {
    }

    public static void setLauncherActivityOnStartTime(String str) {
    }

    /* JADX INFO: renamed from: a */
    public final Timer m6726a() {
        Timer timer = this.f13764h;
        return timer != null ? timer : f13742R;
    }

    /* JADX INFO: renamed from: d */
    public final Timer m6727d() {
        Timer timer = this.f13763g;
        return timer != null ? timer : m6726a();
    }

    /* JADX INFO: renamed from: g */
    public final void m6728g(b8a b8aVar) {
        if (this.f13749J == null || this.f13750K == null || this.f13751L == null) {
            return;
        }
        f13746V.execute(new RunnableC0806bd(5, this, b8aVar));
        m6729h();
    }

    /* JADX INFO: renamed from: h */
    public final synchronized void m6729h() {
        if (this.f13757a) {
            cl7.f10231h.f10237f.mo21331x(this);
            this.f13761e.unregisterActivityLifecycleCallbacks(this);
            this.f13757a = false;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityCreated(Activity activity, Bundle bundle) {
        try {
            Timer timer = this.f13766j;
            if (timer != null) {
                if (Build.VERSION.SDK_INT < 34 || timer.m6742a() > f13744T) {
                    this.f13753N = true;
                }
                this.f13766j = null;
            }
            if (!this.f13753N && this.f13765i == null) {
                this.f13756Q = this.f13756Q || m6725f(this.f13761e);
                new WeakReference(activity);
                this.f13765i = new Timer();
                if (m6727d().m6743b(this.f13765i) > f13743S) {
                    this.f13762f = true;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        View viewFindViewById;
        if (this.f13753N || this.f13762f) {
            return;
        }
        dh1 dh1Var = this.f13759c;
        dh1Var.getClass();
        mz6 mz6VarM10386g = dh1Var.m10386g(kh1.m15232i0());
        if ((mz6VarM10386g.m17160b() ? ((Boolean) mz6VarM10386g.m17159a()).booleanValue() : false) && (viewFindViewById = activity.findViewById(R.id.content)) != null) {
            viewFindViewById.getViewTreeObserver().removeOnDrawListener(this.f13755P);
        }
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [rs] */
    /* JADX WARN: Type inference failed for: r4v2, types: [rs] */
    /* JADX WARN: Type inference failed for: r4v4, types: [rs] */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityResumed(Activity activity) {
        View viewFindViewById;
        try {
            if (!this.f13753N && !this.f13762f) {
                dh1 dh1Var = this.f13759c;
                dh1Var.getClass();
                mz6 mz6VarM10386g = dh1Var.m10386g(kh1.m15232i0());
                final int i = 0;
                boolean zBooleanValue = mz6VarM10386g.m17160b() ? ((Boolean) mz6VarM10386g.m17159a()).booleanValue() : false;
                if (zBooleanValue && (viewFindViewById = activity.findViewById(R.id.content)) != null) {
                    viewFindViewById.getViewTreeObserver().addOnDrawListener(this.f13755P);
                    x53.m24286a(viewFindViewById, new Runnable(this) { // from class: rs

                        /* JADX INFO: renamed from: b */
                        public final /* synthetic */ AppStartTrace f59747b;

                        {
                            this.f59747b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            int i2 = i;
                            AppStartTrace appStartTrace = this.f59747b;
                            switch (i2) {
                                case 0:
                                    b8a b8aVar = appStartTrace.f13760d;
                                    if (appStartTrace.f13751L == null) {
                                        appStartTrace.f13751L = new Timer();
                                        b8a b8aVarM10924L = e8a.m10924L();
                                        b8aVarM10924L.m3482m("_experiment_onDrawFoQ");
                                        b8aVarM10924L.m3480k(appStartTrace.m6727d().f13787a);
                                        b8aVarM10924L.m3481l(appStartTrace.m6727d().m6743b(appStartTrace.f13751L));
                                        b8aVar.m3478i((e8a) b8aVarM10924L.m22766g());
                                        if (appStartTrace.f13763g != null) {
                                            b8a b8aVarM10924L2 = e8a.m10924L();
                                            b8aVarM10924L2.m3482m("_experiment_procStart_to_classLoad");
                                            b8aVarM10924L2.m3480k(appStartTrace.m6727d().f13787a);
                                            b8aVarM10924L2.m3481l(appStartTrace.m6727d().m6743b(appStartTrace.m6726a()));
                                            b8aVar.m3478i((e8a) b8aVarM10924L2.m22766g());
                                        }
                                        String str = appStartTrace.f13756Q ? "true" : "false";
                                        b8aVar.m22767h();
                                        e8a.m10929w((e8a) b8aVar.f64019b).put("systemDeterminedForeground", str);
                                        b8aVar.m3479j("onDrawCount", appStartTrace.f13754O);
                                        c77 c77VarM6735a = appStartTrace.f13752M.m6735a();
                                        b8aVar.m22767h();
                                        e8a.m10930x((e8a) b8aVar.f64019b, c77VarM6735a);
                                        appStartTrace.m6728g(b8aVar);
                                        break;
                                    }
                                    break;
                                case 1:
                                    b8a b8aVar2 = appStartTrace.f13760d;
                                    if (appStartTrace.f13749J == null) {
                                        appStartTrace.f13749J = new Timer();
                                        b8aVar2.m3480k(appStartTrace.m6727d().f13787a);
                                        b8aVar2.m3481l(appStartTrace.m6727d().m6743b(appStartTrace.f13749J));
                                        appStartTrace.m6728g(b8aVar2);
                                        break;
                                    }
                                    break;
                                case 2:
                                    b8a b8aVar3 = appStartTrace.f13760d;
                                    if (appStartTrace.f13750K == null) {
                                        appStartTrace.f13750K = new Timer();
                                        b8a b8aVarM10924L3 = e8a.m10924L();
                                        b8aVarM10924L3.m3482m("_experiment_preDrawFoQ");
                                        b8aVarM10924L3.m3480k(appStartTrace.m6727d().f13787a);
                                        b8aVarM10924L3.m3481l(appStartTrace.m6727d().m6743b(appStartTrace.f13750K));
                                        b8aVar3.m3478i((e8a) b8aVarM10924L3.m22766g());
                                        appStartTrace.m6728g(b8aVar3);
                                        break;
                                    }
                                    break;
                                default:
                                    Timer timer = AppStartTrace.f13742R;
                                    b8a b8aVarM10924L4 = e8a.m10924L();
                                    b8aVarM10924L4.m3482m(Constants$TraceNames.APP_START_TRACE_NAME.toString());
                                    b8aVarM10924L4.m3480k(appStartTrace.m6726a().f13787a);
                                    b8aVarM10924L4.m3481l(appStartTrace.m6726a().m6743b(appStartTrace.f13768l));
                                    ArrayList arrayList = new ArrayList(3);
                                    b8a b8aVarM10924L5 = e8a.m10924L();
                                    b8aVarM10924L5.m3482m(Constants$TraceNames.ON_CREATE_TRACE_NAME.toString());
                                    b8aVarM10924L5.m3480k(appStartTrace.m6726a().f13787a);
                                    b8aVarM10924L5.m3481l(appStartTrace.m6726a().m6743b(appStartTrace.f13765i));
                                    arrayList.add((e8a) b8aVarM10924L5.m22766g());
                                    if (appStartTrace.f13767k != null) {
                                        b8a b8aVarM10924L6 = e8a.m10924L();
                                        b8aVarM10924L6.m3482m(Constants$TraceNames.ON_START_TRACE_NAME.toString());
                                        b8aVarM10924L6.m3480k(appStartTrace.f13765i.f13787a);
                                        b8aVarM10924L6.m3481l(appStartTrace.f13765i.m6743b(appStartTrace.f13767k));
                                        arrayList.add((e8a) b8aVarM10924L6.m22766g());
                                        b8a b8aVarM10924L7 = e8a.m10924L();
                                        b8aVarM10924L7.m3482m(Constants$TraceNames.ON_RESUME_TRACE_NAME.toString());
                                        b8aVarM10924L7.m3480k(appStartTrace.f13767k.f13787a);
                                        b8aVarM10924L7.m3481l(appStartTrace.f13767k.m6743b(appStartTrace.f13768l));
                                        arrayList.add((e8a) b8aVarM10924L7.m22766g());
                                    }
                                    b8aVarM10924L4.m22767h();
                                    e8a.m10928v((e8a) b8aVarM10924L4.f64019b, arrayList);
                                    c77 c77VarM6735a2 = appStartTrace.f13752M.m6735a();
                                    b8aVarM10924L4.m22767h();
                                    e8a.m10930x((e8a) b8aVarM10924L4.f64019b, c77VarM6735a2);
                                    appStartTrace.f13758b.m16751c((e8a) b8aVarM10924L4.m22766g(), ApplicationProcessState.FOREGROUND_BACKGROUND);
                                    break;
                            }
                        }
                    });
                    final int i2 = 1;
                    final int i3 = 2;
                    zh7.m25657a(viewFindViewById, new Runnable(this) { // from class: rs

                        /* JADX INFO: renamed from: b */
                        public final /* synthetic */ AppStartTrace f59747b;

                        {
                            this.f59747b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            int i4 = i2;
                            AppStartTrace appStartTrace = this.f59747b;
                            switch (i4) {
                                case 0:
                                    b8a b8aVar = appStartTrace.f13760d;
                                    if (appStartTrace.f13751L == null) {
                                        appStartTrace.f13751L = new Timer();
                                        b8a b8aVarM10924L = e8a.m10924L();
                                        b8aVarM10924L.m3482m("_experiment_onDrawFoQ");
                                        b8aVarM10924L.m3480k(appStartTrace.m6727d().f13787a);
                                        b8aVarM10924L.m3481l(appStartTrace.m6727d().m6743b(appStartTrace.f13751L));
                                        b8aVar.m3478i((e8a) b8aVarM10924L.m22766g());
                                        if (appStartTrace.f13763g != null) {
                                            b8a b8aVarM10924L2 = e8a.m10924L();
                                            b8aVarM10924L2.m3482m("_experiment_procStart_to_classLoad");
                                            b8aVarM10924L2.m3480k(appStartTrace.m6727d().f13787a);
                                            b8aVarM10924L2.m3481l(appStartTrace.m6727d().m6743b(appStartTrace.m6726a()));
                                            b8aVar.m3478i((e8a) b8aVarM10924L2.m22766g());
                                        }
                                        String str = appStartTrace.f13756Q ? "true" : "false";
                                        b8aVar.m22767h();
                                        e8a.m10929w((e8a) b8aVar.f64019b).put("systemDeterminedForeground", str);
                                        b8aVar.m3479j("onDrawCount", appStartTrace.f13754O);
                                        c77 c77VarM6735a = appStartTrace.f13752M.m6735a();
                                        b8aVar.m22767h();
                                        e8a.m10930x((e8a) b8aVar.f64019b, c77VarM6735a);
                                        appStartTrace.m6728g(b8aVar);
                                        break;
                                    }
                                    break;
                                case 1:
                                    b8a b8aVar2 = appStartTrace.f13760d;
                                    if (appStartTrace.f13749J == null) {
                                        appStartTrace.f13749J = new Timer();
                                        b8aVar2.m3480k(appStartTrace.m6727d().f13787a);
                                        b8aVar2.m3481l(appStartTrace.m6727d().m6743b(appStartTrace.f13749J));
                                        appStartTrace.m6728g(b8aVar2);
                                        break;
                                    }
                                    break;
                                case 2:
                                    b8a b8aVar3 = appStartTrace.f13760d;
                                    if (appStartTrace.f13750K == null) {
                                        appStartTrace.f13750K = new Timer();
                                        b8a b8aVarM10924L3 = e8a.m10924L();
                                        b8aVarM10924L3.m3482m("_experiment_preDrawFoQ");
                                        b8aVarM10924L3.m3480k(appStartTrace.m6727d().f13787a);
                                        b8aVarM10924L3.m3481l(appStartTrace.m6727d().m6743b(appStartTrace.f13750K));
                                        b8aVar3.m3478i((e8a) b8aVarM10924L3.m22766g());
                                        appStartTrace.m6728g(b8aVar3);
                                        break;
                                    }
                                    break;
                                default:
                                    Timer timer = AppStartTrace.f13742R;
                                    b8a b8aVarM10924L4 = e8a.m10924L();
                                    b8aVarM10924L4.m3482m(Constants$TraceNames.APP_START_TRACE_NAME.toString());
                                    b8aVarM10924L4.m3480k(appStartTrace.m6726a().f13787a);
                                    b8aVarM10924L4.m3481l(appStartTrace.m6726a().m6743b(appStartTrace.f13768l));
                                    ArrayList arrayList = new ArrayList(3);
                                    b8a b8aVarM10924L5 = e8a.m10924L();
                                    b8aVarM10924L5.m3482m(Constants$TraceNames.ON_CREATE_TRACE_NAME.toString());
                                    b8aVarM10924L5.m3480k(appStartTrace.m6726a().f13787a);
                                    b8aVarM10924L5.m3481l(appStartTrace.m6726a().m6743b(appStartTrace.f13765i));
                                    arrayList.add((e8a) b8aVarM10924L5.m22766g());
                                    if (appStartTrace.f13767k != null) {
                                        b8a b8aVarM10924L6 = e8a.m10924L();
                                        b8aVarM10924L6.m3482m(Constants$TraceNames.ON_START_TRACE_NAME.toString());
                                        b8aVarM10924L6.m3480k(appStartTrace.f13765i.f13787a);
                                        b8aVarM10924L6.m3481l(appStartTrace.f13765i.m6743b(appStartTrace.f13767k));
                                        arrayList.add((e8a) b8aVarM10924L6.m22766g());
                                        b8a b8aVarM10924L7 = e8a.m10924L();
                                        b8aVarM10924L7.m3482m(Constants$TraceNames.ON_RESUME_TRACE_NAME.toString());
                                        b8aVarM10924L7.m3480k(appStartTrace.f13767k.f13787a);
                                        b8aVarM10924L7.m3481l(appStartTrace.f13767k.m6743b(appStartTrace.f13768l));
                                        arrayList.add((e8a) b8aVarM10924L7.m22766g());
                                    }
                                    b8aVarM10924L4.m22767h();
                                    e8a.m10928v((e8a) b8aVarM10924L4.f64019b, arrayList);
                                    c77 c77VarM6735a2 = appStartTrace.f13752M.m6735a();
                                    b8aVarM10924L4.m22767h();
                                    e8a.m10930x((e8a) b8aVarM10924L4.f64019b, c77VarM6735a2);
                                    appStartTrace.f13758b.m16751c((e8a) b8aVarM10924L4.m22766g(), ApplicationProcessState.FOREGROUND_BACKGROUND);
                                    break;
                            }
                        }
                    }, new Runnable(this) { // from class: rs

                        /* JADX INFO: renamed from: b */
                        public final /* synthetic */ AppStartTrace f59747b;

                        {
                            this.f59747b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            int i4 = i3;
                            AppStartTrace appStartTrace = this.f59747b;
                            switch (i4) {
                                case 0:
                                    b8a b8aVar = appStartTrace.f13760d;
                                    if (appStartTrace.f13751L == null) {
                                        appStartTrace.f13751L = new Timer();
                                        b8a b8aVarM10924L = e8a.m10924L();
                                        b8aVarM10924L.m3482m("_experiment_onDrawFoQ");
                                        b8aVarM10924L.m3480k(appStartTrace.m6727d().f13787a);
                                        b8aVarM10924L.m3481l(appStartTrace.m6727d().m6743b(appStartTrace.f13751L));
                                        b8aVar.m3478i((e8a) b8aVarM10924L.m22766g());
                                        if (appStartTrace.f13763g != null) {
                                            b8a b8aVarM10924L2 = e8a.m10924L();
                                            b8aVarM10924L2.m3482m("_experiment_procStart_to_classLoad");
                                            b8aVarM10924L2.m3480k(appStartTrace.m6727d().f13787a);
                                            b8aVarM10924L2.m3481l(appStartTrace.m6727d().m6743b(appStartTrace.m6726a()));
                                            b8aVar.m3478i((e8a) b8aVarM10924L2.m22766g());
                                        }
                                        String str = appStartTrace.f13756Q ? "true" : "false";
                                        b8aVar.m22767h();
                                        e8a.m10929w((e8a) b8aVar.f64019b).put("systemDeterminedForeground", str);
                                        b8aVar.m3479j("onDrawCount", appStartTrace.f13754O);
                                        c77 c77VarM6735a = appStartTrace.f13752M.m6735a();
                                        b8aVar.m22767h();
                                        e8a.m10930x((e8a) b8aVar.f64019b, c77VarM6735a);
                                        appStartTrace.m6728g(b8aVar);
                                        break;
                                    }
                                    break;
                                case 1:
                                    b8a b8aVar2 = appStartTrace.f13760d;
                                    if (appStartTrace.f13749J == null) {
                                        appStartTrace.f13749J = new Timer();
                                        b8aVar2.m3480k(appStartTrace.m6727d().f13787a);
                                        b8aVar2.m3481l(appStartTrace.m6727d().m6743b(appStartTrace.f13749J));
                                        appStartTrace.m6728g(b8aVar2);
                                        break;
                                    }
                                    break;
                                case 2:
                                    b8a b8aVar3 = appStartTrace.f13760d;
                                    if (appStartTrace.f13750K == null) {
                                        appStartTrace.f13750K = new Timer();
                                        b8a b8aVarM10924L3 = e8a.m10924L();
                                        b8aVarM10924L3.m3482m("_experiment_preDrawFoQ");
                                        b8aVarM10924L3.m3480k(appStartTrace.m6727d().f13787a);
                                        b8aVarM10924L3.m3481l(appStartTrace.m6727d().m6743b(appStartTrace.f13750K));
                                        b8aVar3.m3478i((e8a) b8aVarM10924L3.m22766g());
                                        appStartTrace.m6728g(b8aVar3);
                                        break;
                                    }
                                    break;
                                default:
                                    Timer timer = AppStartTrace.f13742R;
                                    b8a b8aVarM10924L4 = e8a.m10924L();
                                    b8aVarM10924L4.m3482m(Constants$TraceNames.APP_START_TRACE_NAME.toString());
                                    b8aVarM10924L4.m3480k(appStartTrace.m6726a().f13787a);
                                    b8aVarM10924L4.m3481l(appStartTrace.m6726a().m6743b(appStartTrace.f13768l));
                                    ArrayList arrayList = new ArrayList(3);
                                    b8a b8aVarM10924L5 = e8a.m10924L();
                                    b8aVarM10924L5.m3482m(Constants$TraceNames.ON_CREATE_TRACE_NAME.toString());
                                    b8aVarM10924L5.m3480k(appStartTrace.m6726a().f13787a);
                                    b8aVarM10924L5.m3481l(appStartTrace.m6726a().m6743b(appStartTrace.f13765i));
                                    arrayList.add((e8a) b8aVarM10924L5.m22766g());
                                    if (appStartTrace.f13767k != null) {
                                        b8a b8aVarM10924L6 = e8a.m10924L();
                                        b8aVarM10924L6.m3482m(Constants$TraceNames.ON_START_TRACE_NAME.toString());
                                        b8aVarM10924L6.m3480k(appStartTrace.f13765i.f13787a);
                                        b8aVarM10924L6.m3481l(appStartTrace.f13765i.m6743b(appStartTrace.f13767k));
                                        arrayList.add((e8a) b8aVarM10924L6.m22766g());
                                        b8a b8aVarM10924L7 = e8a.m10924L();
                                        b8aVarM10924L7.m3482m(Constants$TraceNames.ON_RESUME_TRACE_NAME.toString());
                                        b8aVarM10924L7.m3480k(appStartTrace.f13767k.f13787a);
                                        b8aVarM10924L7.m3481l(appStartTrace.f13767k.m6743b(appStartTrace.f13768l));
                                        arrayList.add((e8a) b8aVarM10924L7.m22766g());
                                    }
                                    b8aVarM10924L4.m22767h();
                                    e8a.m10928v((e8a) b8aVarM10924L4.f64019b, arrayList);
                                    c77 c77VarM6735a2 = appStartTrace.f13752M.m6735a();
                                    b8aVarM10924L4.m22767h();
                                    e8a.m10930x((e8a) b8aVarM10924L4.f64019b, c77VarM6735a2);
                                    appStartTrace.f13758b.m16751c((e8a) b8aVarM10924L4.m22766g(), ApplicationProcessState.FOREGROUND_BACKGROUND);
                                    break;
                            }
                        }
                    });
                }
                if (this.f13768l != null) {
                    return;
                }
                new WeakReference(activity);
                this.f13768l = new Timer();
                this.f13752M = SessionManager.getInstance().perfSession();
                C3723wi.m23970d().m23971a("onResume(): " + activity.getClass().getName() + ": " + m6726a().m6743b(this.f13768l) + " microseconds");
                final int i4 = 3;
                f13746V.execute(new Runnable(this) { // from class: rs

                    /* JADX INFO: renamed from: b */
                    public final /* synthetic */ AppStartTrace f59747b;

                    {
                        this.f59747b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        int i5 = i4;
                        AppStartTrace appStartTrace = this.f59747b;
                        switch (i5) {
                            case 0:
                                b8a b8aVar = appStartTrace.f13760d;
                                if (appStartTrace.f13751L == null) {
                                    appStartTrace.f13751L = new Timer();
                                    b8a b8aVarM10924L = e8a.m10924L();
                                    b8aVarM10924L.m3482m("_experiment_onDrawFoQ");
                                    b8aVarM10924L.m3480k(appStartTrace.m6727d().f13787a);
                                    b8aVarM10924L.m3481l(appStartTrace.m6727d().m6743b(appStartTrace.f13751L));
                                    b8aVar.m3478i((e8a) b8aVarM10924L.m22766g());
                                    if (appStartTrace.f13763g != null) {
                                        b8a b8aVarM10924L2 = e8a.m10924L();
                                        b8aVarM10924L2.m3482m("_experiment_procStart_to_classLoad");
                                        b8aVarM10924L2.m3480k(appStartTrace.m6727d().f13787a);
                                        b8aVarM10924L2.m3481l(appStartTrace.m6727d().m6743b(appStartTrace.m6726a()));
                                        b8aVar.m3478i((e8a) b8aVarM10924L2.m22766g());
                                    }
                                    String str = appStartTrace.f13756Q ? "true" : "false";
                                    b8aVar.m22767h();
                                    e8a.m10929w((e8a) b8aVar.f64019b).put("systemDeterminedForeground", str);
                                    b8aVar.m3479j("onDrawCount", appStartTrace.f13754O);
                                    c77 c77VarM6735a = appStartTrace.f13752M.m6735a();
                                    b8aVar.m22767h();
                                    e8a.m10930x((e8a) b8aVar.f64019b, c77VarM6735a);
                                    appStartTrace.m6728g(b8aVar);
                                    break;
                                }
                                break;
                            case 1:
                                b8a b8aVar2 = appStartTrace.f13760d;
                                if (appStartTrace.f13749J == null) {
                                    appStartTrace.f13749J = new Timer();
                                    b8aVar2.m3480k(appStartTrace.m6727d().f13787a);
                                    b8aVar2.m3481l(appStartTrace.m6727d().m6743b(appStartTrace.f13749J));
                                    appStartTrace.m6728g(b8aVar2);
                                    break;
                                }
                                break;
                            case 2:
                                b8a b8aVar3 = appStartTrace.f13760d;
                                if (appStartTrace.f13750K == null) {
                                    appStartTrace.f13750K = new Timer();
                                    b8a b8aVarM10924L3 = e8a.m10924L();
                                    b8aVarM10924L3.m3482m("_experiment_preDrawFoQ");
                                    b8aVarM10924L3.m3480k(appStartTrace.m6727d().f13787a);
                                    b8aVarM10924L3.m3481l(appStartTrace.m6727d().m6743b(appStartTrace.f13750K));
                                    b8aVar3.m3478i((e8a) b8aVarM10924L3.m22766g());
                                    appStartTrace.m6728g(b8aVar3);
                                    break;
                                }
                                break;
                            default:
                                Timer timer = AppStartTrace.f13742R;
                                b8a b8aVarM10924L4 = e8a.m10924L();
                                b8aVarM10924L4.m3482m(Constants$TraceNames.APP_START_TRACE_NAME.toString());
                                b8aVarM10924L4.m3480k(appStartTrace.m6726a().f13787a);
                                b8aVarM10924L4.m3481l(appStartTrace.m6726a().m6743b(appStartTrace.f13768l));
                                ArrayList arrayList = new ArrayList(3);
                                b8a b8aVarM10924L5 = e8a.m10924L();
                                b8aVarM10924L5.m3482m(Constants$TraceNames.ON_CREATE_TRACE_NAME.toString());
                                b8aVarM10924L5.m3480k(appStartTrace.m6726a().f13787a);
                                b8aVarM10924L5.m3481l(appStartTrace.m6726a().m6743b(appStartTrace.f13765i));
                                arrayList.add((e8a) b8aVarM10924L5.m22766g());
                                if (appStartTrace.f13767k != null) {
                                    b8a b8aVarM10924L6 = e8a.m10924L();
                                    b8aVarM10924L6.m3482m(Constants$TraceNames.ON_START_TRACE_NAME.toString());
                                    b8aVarM10924L6.m3480k(appStartTrace.f13765i.f13787a);
                                    b8aVarM10924L6.m3481l(appStartTrace.f13765i.m6743b(appStartTrace.f13767k));
                                    arrayList.add((e8a) b8aVarM10924L6.m22766g());
                                    b8a b8aVarM10924L7 = e8a.m10924L();
                                    b8aVarM10924L7.m3482m(Constants$TraceNames.ON_RESUME_TRACE_NAME.toString());
                                    b8aVarM10924L7.m3480k(appStartTrace.f13767k.f13787a);
                                    b8aVarM10924L7.m3481l(appStartTrace.f13767k.m6743b(appStartTrace.f13768l));
                                    arrayList.add((e8a) b8aVarM10924L7.m22766g());
                                }
                                b8aVarM10924L4.m22767h();
                                e8a.m10928v((e8a) b8aVarM10924L4.f64019b, arrayList);
                                c77 c77VarM6735a2 = appStartTrace.f13752M.m6735a();
                                b8aVarM10924L4.m22767h();
                                e8a.m10930x((e8a) b8aVarM10924L4.f64019b, c77VarM6735a2);
                                appStartTrace.f13758b.m16751c((e8a) b8aVarM10924L4.m22766g(), ApplicationProcessState.FOREGROUND_BACKGROUND);
                                break;
                        }
                    }
                });
                if (!zBooleanValue) {
                    m6729h();
                }
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
        if (!this.f13753N && this.f13767k == null && !this.f13762f) {
            this.f13767k = new Timer();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @ds6(Lifecycle$Event.ON_STOP)
    public void onAppEnteredBackground() {
        if (this.f13753N || this.f13762f || this.f13748I != null) {
            return;
        }
        this.f13748I = new Timer();
        b8a b8aVarM10924L = e8a.m10924L();
        b8aVarM10924L.m3482m("_experiment_firstBackgrounding");
        b8aVarM10924L.m3480k(m6727d().f13787a);
        b8aVarM10924L.m3481l(m6727d().m6743b(this.f13748I));
        this.f13760d.m3478i((e8a) b8aVarM10924L.m22766g());
    }

    @ds6(Lifecycle$Event.ON_START)
    public void onAppEnteredForeground() {
        if (this.f13753N || this.f13762f || this.f13747H != null) {
            return;
        }
        this.f13747H = new Timer();
        b8a b8aVarM10924L = e8a.m10924L();
        b8aVarM10924L.m3482m("_experiment_firstForegrounding");
        b8aVarM10924L.m3480k(m6727d().f13787a);
        b8aVarM10924L.m3481l(m6727d().m6743b(this.f13747H));
        this.f13760d.m3478i((e8a) b8aVarM10924L.m22766g());
    }
}
