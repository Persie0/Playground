package com.google.firebase.messaging;

import android.app.Application;
import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Binder;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p000.AbstractC3122is;
import p000.AbstractC3352my;
import p000.C3275kv;
import p000.C3336mi;
import p000.C3440oy;
import p000.C3487q7;
import p000.C3552rx;
import p000.C3600t6;
import p000.InterfaceC3036gf;
import p000.ah1;
import p000.cd1;
import p000.cn5;
import p000.co7;
import p000.fp9;
import p000.fs6;
import p000.gld;
import p000.gna;
import p000.lda;
import p000.lj1;
import p000.o76;
import p000.q43;
import p000.qg2;
import p000.r41;
import p000.um9;
import p000.uo7;
import p000.wj8;
import p000.x43;

/* JADX INFO: loaded from: classes.dex */
public class FirebaseMessaging {

    /* JADX INFO: renamed from: j */
    public static C3336mi f13718j;

    /* JADX INFO: renamed from: k */
    public static uo7 f13719k = new cd1(8);

    /* JADX INFO: renamed from: l */
    public static ScheduledThreadPoolExecutor f13720l;

    /* JADX INFO: renamed from: a */
    public final q43 f13721a;

    /* JADX INFO: renamed from: b */
    public final Context f13722b;

    /* JADX INFO: renamed from: c */
    public final co7 f13723c;

    /* JADX INFO: renamed from: d */
    public final fs6 f13724d;

    /* JADX INFO: renamed from: e */
    public final C3552rx f13725e;

    /* JADX INFO: renamed from: f */
    public final ScheduledThreadPoolExecutor f13726f;

    /* JADX INFO: renamed from: g */
    public final ThreadPoolExecutor f13727g;

    /* JADX INFO: renamed from: h */
    public final lj1 f13728h;

    /* JADX INFO: renamed from: i */
    public boolean f13729i;

    public FirebaseMessaging(q43 q43Var, uo7 uo7Var, uo7 uo7Var2, x43 x43Var, uo7 uo7Var3, um9 um9Var) {
        q43Var.m19644a();
        Context context = q43Var.f57252a;
        final lj1 lj1Var = new lj1();
        final int i = 0;
        lj1Var.f49732b = 0;
        lj1Var.f49733c = context;
        final co7 co7Var = new co7(q43Var, lj1Var, uo7Var, uo7Var2, x43Var);
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new o76("Firebase-Messaging-Task"));
        final int i2 = 1;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new o76("Firebase-Messaging-Init"));
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new o76("Firebase-Messaging-File-Io"));
        this.f13729i = false;
        f13719k = uo7Var3;
        this.f13721a = q43Var;
        this.f13725e = new C3552rx(this, um9Var);
        q43Var.m19644a();
        final Context context2 = q43Var.f57252a;
        this.f13722b = context2;
        C3600t6 c3600t6 = new C3600t6(1);
        this.f13728h = lj1Var;
        this.f13723c = co7Var;
        this.f13724d = new fs6(executorServiceNewSingleThreadExecutor);
        this.f13726f = scheduledThreadPoolExecutor;
        this.f13727g = threadPoolExecutor;
        q43Var.m19644a();
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(c3600t6);
        } else {
            Log.w("FirebaseMessaging", "Context " + context + " was not an application, can't register for lifecycle callbacks. Some notification events may be dropped as a result.");
        }
        scheduledThreadPoolExecutor.execute(new Runnable(this) { // from class: z43

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ FirebaseMessaging f70861b;

            {
                this.f70861b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                tld tldVarM5974b;
                int i3 = i;
                FirebaseMessaging firebaseMessaging = this.f70861b;
                switch (i3) {
                    case 0:
                        if (firebaseMessaging.f13725e.m20974i() && firebaseMessaging.m6711h(firebaseMessaging.m6707d())) {
                            synchronized (firebaseMessaging) {
                                if (!firebaseMessaging.f13729i) {
                                    firebaseMessaging.m6710g(0L);
                                }
                                break;
                            }
                            return;
                        }
                        return;
                    default:
                        final Context context3 = firebaseMessaging.f13722b;
                        AbstractC3122is.m14111y(context3);
                        co7 co7Var2 = firebaseMessaging.f13723c;
                        final boolean zM6709f = firebaseMessaging.m6709f();
                        SharedPreferences sharedPreferencesM17087F = AbstractC3352my.m17087F(context3);
                        if (!sharedPreferencesM17087F.contains("proxy_retention") || sharedPreferencesM17087F.getBoolean("proxy_retention", false) != zM6709f) {
                            wj8 wj8Var = (wj8) co7Var2.f10361d;
                            if (wj8Var.f66939c.m21586w() >= 241100000) {
                                Bundle bundle = new Bundle();
                                bundle.putBoolean("proxy_retention", zM6709f);
                                tldVarM5974b = gld.m12739h(wj8Var.f66938b).m12744i(4, bundle);
                            } else {
                                tldVarM5974b = Tasks.m5974b(new IOException("SERVICE_NOT_AVAILABLE"));
                            }
                            tldVarM5974b.mo5963e(new ExecutorC3014fu(1), new js6() { // from class: wo7
                                @Override // p000.js6
                                /* JADX INFO: renamed from: g */
                                public final void mo320g(Object obj) {
                                    SharedPreferences.Editor editorEdit = AbstractC3352my.m17087F(context3).edit();
                                    editorEdit.putBoolean("proxy_retention", zM6709f);
                                    editorEdit.apply();
                                }
                            });
                        }
                        if (firebaseMessaging.m6709f()) {
                            firebaseMessaging.m6708e();
                            return;
                        }
                        return;
                }
            }
        });
        final ScheduledThreadPoolExecutor scheduledThreadPoolExecutor2 = new ScheduledThreadPoolExecutor(1, new o76("Firebase-Messaging-Topics-Io"));
        Tasks.m5973a(new Callable() { // from class: s7a
            @Override // java.util.concurrent.Callable
            public final Object call() {
                r7a r7aVar;
                Context context3 = context2;
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor3 = scheduledThreadPoolExecutor2;
                FirebaseMessaging firebaseMessaging = this;
                lj1 lj1Var2 = lj1Var;
                co7 co7Var2 = co7Var;
                synchronized (r7a.class) {
                    try {
                        WeakReference weakReference = r7a.f58860b;
                        r7a r7aVar2 = weakReference != null ? (r7a) weakReference.get() : null;
                        if (r7aVar2 == null) {
                            SharedPreferences sharedPreferences = context3.getSharedPreferences("com.google.android.gms.appid", 0);
                            r7aVar = new r7a();
                            synchronized (r7aVar) {
                                r7aVar.f58861a = w41.m23705m(sharedPreferences, scheduledThreadPoolExecutor3);
                            }
                            r7a.f58860b = new WeakReference(r7aVar);
                        } else {
                            r7aVar = r7aVar2;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return new t7a(firebaseMessaging, lj1Var2, r7aVar, co7Var2, context3, scheduledThreadPoolExecutor3);
            }
        }, scheduledThreadPoolExecutor2).mo5963e(scheduledThreadPoolExecutor, new C3487q7(this, 12));
        scheduledThreadPoolExecutor.execute(new Runnable(this) { // from class: z43

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ FirebaseMessaging f70861b;

            {
                this.f70861b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                tld tldVarM5974b;
                int i3 = i2;
                FirebaseMessaging firebaseMessaging = this.f70861b;
                switch (i3) {
                    case 0:
                        if (firebaseMessaging.f13725e.m20974i() && firebaseMessaging.m6711h(firebaseMessaging.m6707d())) {
                            synchronized (firebaseMessaging) {
                                if (!firebaseMessaging.f13729i) {
                                    firebaseMessaging.m6710g(0L);
                                }
                                break;
                            }
                            return;
                        }
                        return;
                    default:
                        final Context context3 = firebaseMessaging.f13722b;
                        AbstractC3122is.m14111y(context3);
                        co7 co7Var2 = firebaseMessaging.f13723c;
                        final boolean zM6709f = firebaseMessaging.m6709f();
                        SharedPreferences sharedPreferencesM17087F = AbstractC3352my.m17087F(context3);
                        if (!sharedPreferencesM17087F.contains("proxy_retention") || sharedPreferencesM17087F.getBoolean("proxy_retention", false) != zM6709f) {
                            wj8 wj8Var = (wj8) co7Var2.f10361d;
                            if (wj8Var.f66939c.m21586w() >= 241100000) {
                                Bundle bundle = new Bundle();
                                bundle.putBoolean("proxy_retention", zM6709f);
                                tldVarM5974b = gld.m12739h(wj8Var.f66938b).m12744i(4, bundle);
                            } else {
                                tldVarM5974b = Tasks.m5974b(new IOException("SERVICE_NOT_AVAILABLE"));
                            }
                            tldVarM5974b.mo5963e(new ExecutorC3014fu(1), new js6() { // from class: wo7
                                @Override // p000.js6
                                /* JADX INFO: renamed from: g */
                                public final void mo320g(Object obj) {
                                    SharedPreferences.Editor editorEdit = AbstractC3352my.m17087F(context3).edit();
                                    editorEdit.putBoolean("proxy_retention", zM6709f);
                                    editorEdit.apply();
                                }
                            });
                        }
                        if (firebaseMessaging.m6709f()) {
                            firebaseMessaging.m6708e();
                            return;
                        }
                        return;
                }
            }
        });
    }

    /* JADX INFO: renamed from: b */
    public static void m6704b(Runnable runnable, long j) {
        synchronized (FirebaseMessaging.class) {
            try {
                if (f13720l == null) {
                    f13720l = new ScheduledThreadPoolExecutor(1, new o76("TAG"));
                }
                f13720l.schedule(runnable, j, TimeUnit.SECONDS);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static synchronized C3336mi m6705c(Context context) {
        try {
            if (f13718j == null) {
                f13718j = new C3336mi(context);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f13718j;
    }

    public static synchronized FirebaseMessaging getInstance(q43 q43Var) {
        FirebaseMessaging firebaseMessaging;
        firebaseMessaging = (FirebaseMessaging) q43Var.m19645b(FirebaseMessaging.class);
        lda.m16131q(firebaseMessaging, "Firebase Messaging component is not present");
        return firebaseMessaging;
    }

    /* JADX INFO: renamed from: a */
    public final String m6706a() {
        Task taskMo5965g;
        cn5 cn5VarM6707d = m6707d();
        if (!m6711h(cn5VarM6707d)) {
            return (String) cn5VarM6707d.f10327b;
        }
        String strM16245c = lj1.m16245c(this.f13721a);
        fs6 fs6Var = this.f13724d;
        synchronized (fs6Var) {
            taskMo5965g = (Task) ((C3275kv) fs6Var.f39591c).get(strM16245c);
            if (taskMo5965g == null) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Making new request for: " + strM16245c);
                }
                co7 co7Var = this.f13723c;
                taskMo5965g = co7Var.m4935m(co7Var.m4940v(lj1.m16245c((q43) co7Var.f10359b), "*", new Bundle())).mo5972n(this.f13727g, new ah1(this, strM16245c, cn5VarM6707d)).mo5965g((Executor) fs6Var.f39590b, new r41(8, fs6Var, strM16245c));
                ((C3275kv) fs6Var.f39591c).put(strM16245c, taskMo5965g);
            } else if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Joining ongoing request for: " + strM16245c);
            }
        }
        try {
            return (String) Tasks.await(taskMo5965g);
        } catch (InterruptedException | ExecutionException e) {
            throw new IOException(e);
        }
    }

    /* JADX INFO: renamed from: d */
    public final cn5 m6707d() {
        cn5 cn5VarM4895c;
        C3336mi c3336miM6705c = m6705c(this.f13722b);
        q43 q43Var = this.f13721a;
        q43Var.m19644a();
        String strM19646d = "[DEFAULT]".equals(q43Var.f57253b) ? "" : q43Var.m19646d();
        String strM16245c = lj1.m16245c(this.f13721a);
        synchronized (c3336miM6705c) {
            cn5VarM4895c = cn5.m4895c(c3336miM6705c.f51344a.getString(strM19646d + "|T|" + strM16245c + "|*", null));
        }
        return cn5VarM4895c;
    }

    /* JADX INFO: renamed from: e */
    public final void m6708e() {
        wj8 wj8Var = (wj8) this.f13723c.f10361d;
        (wj8Var.f66939c.m21586w() >= 241100000 ? gld.m12739h(wj8Var.f66938b).m12745j(5, Bundle.EMPTY).mo5964f(qg2.f57747c, gna.f41056d) : Tasks.m5974b(new IOException("SERVICE_NOT_AVAILABLE"))).mo5963e(this.f13726f, new C3440oy(this, 15));
    }

    /* JADX INFO: renamed from: f */
    public final boolean m6709f() {
        Context context = this.f13722b;
        AbstractC3122is.m14111y(context);
        if (Binder.getCallingUid() != context.getApplicationInfo().uid) {
            Log.e("FirebaseMessaging", "error retrieving notification delegate for package " + context.getPackageName());
            return false;
        }
        if ("com.google.android.gms".equals(((NotificationManager) context.getSystemService(NotificationManager.class)).getNotificationDelegate())) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "GMS core is set for proxying");
            }
            if (this.f13721a.m19645b(InterfaceC3036gf.class) != null) {
                return true;
            }
            if (AbstractC3352my.m17143v() && f13719k != null) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public final synchronized void m6710g(long j) {
        m6704b(new fp9(this, Math.min(Math.max(30L, 2 * j), 28800L)), j);
        this.f13729i = true;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m6711h(cn5 cn5Var) {
        if (cn5Var != null) {
            return System.currentTimeMillis() > cn5Var.f10326a + 604800000 || !this.f13728h.m16247b().equals((String) cn5Var.f10328c);
        }
        return true;
    }
}
