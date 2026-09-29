package com.google.firebase.messaging;

import ae.C0065e;
import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import androidx.activity.RunnableC0183b;
import androidx.activity.RunnableC0191j;
import androidx.annotation.Keep;
import bf.InterfaceC1379a;
import cf.InterfaceC2005b;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;
import com.kochava.tracker.BuildConfig;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p045c9.C1750d;
import p073df.InterfaceC5162d;
import p136gc.AbstractC5751g;
import p136gc.C5752h;
import p174i9.C6224n;
import p176ib.C6272i;
import p200jf.InterfaceC6475g;
import p276nb.ThreadFactoryC7736a;
import p286o2.RunnableC7907g;
import p395t8.InterfaceC9224f;
import p402u0.C9371n;
import p533ze.C10479a;
import p533ze.InterfaceC10480b;
import p533ze.InterfaceC10482d;

/* JADX INFO: loaded from: classes.dex */
public class FirebaseMessaging {

    /* JADX INFO: renamed from: l */
    public static final long f16303l = TimeUnit.HOURS.toSeconds(8);

    /* JADX INFO: renamed from: m */
    public static C3260w f16304m;

    /* JADX INFO: renamed from: n */
    @SuppressLint({"FirebaseUnknownNullness"})
    public static InterfaceC9224f f16305n;

    /* JADX INFO: renamed from: o */
    public static ScheduledThreadPoolExecutor f16306o;

    /* JADX INFO: renamed from: a */
    public final C0065e f16307a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC1379a f16308b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC5162d f16309c;

    /* JADX INFO: renamed from: d */
    public final Context f16310d;

    /* JADX INFO: renamed from: e */
    public final C3249l f16311e;

    /* JADX INFO: renamed from: f */
    public final C3257t f16312f;

    /* JADX INFO: renamed from: g */
    public final C3229a f16313g;

    /* JADX INFO: renamed from: h */
    public final Executor f16314h;

    /* JADX INFO: renamed from: i */
    public final Executor f16315i;

    /* JADX INFO: renamed from: j */
    public final C3252o f16316j;

    /* JADX INFO: renamed from: k */
    public boolean f16317k;

    /* JADX INFO: renamed from: com.google.firebase.messaging.FirebaseMessaging$a */
    public class C3229a {

        /* JADX INFO: renamed from: a */
        public final InterfaceC10482d f16318a;

        /* JADX INFO: renamed from: b */
        public boolean f16319b;

        /* JADX INFO: renamed from: c */
        public Boolean f16320c;

        public C3229a(InterfaceC10482d interfaceC10482d) {
            this.f16318a = interfaceC10482d;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v4, types: [com.google.firebase.messaging.k] */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* JADX INFO: renamed from: a */
        public final synchronized void m9235a() {
            if (this.f16319b) {
                return;
            }
            Boolean boolM9236b = m9236b();
            this.f16320c = boolM9236b;
            if (boolM9236b == null) {
                this.f16318a.mo11762a(new InterfaceC10480b() { // from class: com.google.firebase.messaging.k
                    @Override // p533ze.InterfaceC10480b
                    /* JADX INFO: renamed from: a */
                    public final void mo5936a(C10479a c10479a) {
                        boolean zBooleanValue;
                        FirebaseMessaging.C3229a c3229a = this.f16399a;
                        synchronized (c3229a) {
                            c3229a.m9235a();
                            Boolean bool = c3229a.f16320c;
                            zBooleanValue = bool != null ? bool.booleanValue() : FirebaseMessaging.this.f16307a.m440g();
                        }
                        if (zBooleanValue) {
                            C3260w c3260w = FirebaseMessaging.f16304m;
                            FirebaseMessaging.this.m9232e();
                        }
                    }
                });
            }
            this.f16319b = true;
        }

        /* JADX INFO: renamed from: b */
        public final Boolean m9236b() {
            ApplicationInfo applicationInfo;
            Bundle bundle;
            C0065e c0065e = FirebaseMessaging.this.f16307a;
            c0065e.m437a();
            Context context = c0065e.f171a;
            SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("auto_init")) {
                return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
            }
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), BuildConfig.SDK_TRUNCATE_LENGTH)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("firebase_messaging_auto_init_enabled")) {
                    return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            return null;
        }
    }

    public FirebaseMessaging() {
        throw null;
    }

    public FirebaseMessaging(C0065e c0065e, InterfaceC1379a interfaceC1379a, InterfaceC2005b<InterfaceC6475g> interfaceC2005b, InterfaceC2005b<HeartBeatInfo> interfaceC2005b2, InterfaceC5162d interfaceC5162d, InterfaceC9224f interfaceC9224f, InterfaceC10482d interfaceC10482d) {
        c0065e.m437a();
        Context context = c0065e.f171a;
        final C3252o c3252o = new C3252o(context);
        final C3249l c3249l = new C3249l(c0065e, c3252o, interfaceC2005b, interfaceC2005b2, interfaceC5162d);
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new ThreadFactoryC7736a("Firebase-Messaging-Task"));
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new ThreadFactoryC7736a("Firebase-Messaging-Init"));
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC7736a("Firebase-Messaging-File-Io"));
        this.f16317k = false;
        f16305n = interfaceC9224f;
        this.f16307a = c0065e;
        this.f16308b = interfaceC1379a;
        this.f16309c = interfaceC5162d;
        this.f16313g = new C3229a(interfaceC10482d);
        c0065e.m437a();
        final Context context2 = c0065e.f171a;
        this.f16310d = context2;
        C3247j c3247j = new C3247j();
        this.f16316j = c3252o;
        this.f16311e = c3249l;
        this.f16312f = new C3257t(executorServiceNewSingleThreadExecutor);
        this.f16314h = scheduledThreadPoolExecutor;
        this.f16315i = threadPoolExecutor;
        c0065e.m437a();
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(c3247j);
        } else {
            Log.w("FirebaseMessaging", "Context " + context + " was not an application, can't register for lifecycle callbacks. Some notification events may be dropped as a result.");
        }
        if (interfaceC1379a != null) {
            interfaceC1379a.m4965c();
        }
        scheduledThreadPoolExecutor.execute(new RunnableC0183b(16, this));
        final ScheduledThreadPoolExecutor scheduledThreadPoolExecutor2 = new ScheduledThreadPoolExecutor(1, new ThreadFactoryC7736a("Firebase-Messaging-Topics-Io"));
        int i10 = C3234b0.f16352j;
        Tasks.m8538b(scheduledThreadPoolExecutor2, new Callable() { // from class: com.google.firebase.messaging.a0
            /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C3263z c3263z;
                Context context3 = context2;
                ScheduledExecutorService scheduledExecutorService = scheduledThreadPoolExecutor2;
                FirebaseMessaging firebaseMessaging = this;
                C3252o c3252o2 = c3252o;
                C3249l c3249l2 = c3249l;
                synchronized (C3263z.class) {
                    WeakReference<C3263z> weakReference = C3263z.f16460b;
                    c3263z = weakReference != null ? weakReference.get() : null;
                    if (c3263z == null) {
                        SharedPreferences sharedPreferences = context3.getSharedPreferences("com.google.android.gms.appid", 0);
                        C3263z c3263z2 = new C3263z(sharedPreferences, scheduledExecutorService);
                        synchronized (c3263z2) {
                            c3263z2.f16461a = C3259v.m9293a(sharedPreferences, scheduledExecutorService);
                        }
                        C3263z.f16460b = new WeakReference<>(c3263z2);
                        c3263z = c3263z2;
                    }
                }
                return new C3234b0(firebaseMessaging, c3252o2, c3263z, c3249l2, context3, scheduledExecutorService);
            }
        }).mo12103e(scheduledThreadPoolExecutor, new C9371n(11, this));
        scheduledThreadPoolExecutor.execute(new RunnableC0191j(17, this));
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @SuppressLint({"ThreadPoolCreation"})
    /* JADX INFO: renamed from: b */
    public static void m9228b(RunnableC3261x runnableC3261x, long j10) {
        synchronized (FirebaseMessaging.class) {
            if (f16306o == null) {
                f16306o = new ScheduledThreadPoolExecutor(1, new ThreadFactoryC7736a("TAG"));
            }
            f16306o.schedule(runnableC3261x, j10, TimeUnit.SECONDS);
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Keep
    public static synchronized FirebaseMessaging getInstance(C0065e c0065e) {
        FirebaseMessaging firebaseMessaging;
        c0065e.m437a();
        firebaseMessaging = (FirebaseMessaging) c0065e.f174d.mo11748a(FirebaseMessaging.class);
        C6272i.m12916j(firebaseMessaging, "Firebase Messaging component is not present");
        return firebaseMessaging;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    public final String m9229a() throws IOException {
        AbstractC5751g abstractC5751gMo12105g;
        InterfaceC1379a interfaceC1379a = this.f16308b;
        if (interfaceC1379a != null) {
            try {
                return (String) Tasks.m8537a(interfaceC1379a.m4964b());
            } catch (InterruptedException | ExecutionException e10) {
                throw new IOException(e10);
            }
        }
        C3260w.a aVarM9231d = m9231d();
        if (!m9234g(aVarM9231d)) {
            return aVarM9231d.f16449a;
        }
        String strM9271a = C3252o.m9271a(this.f16307a);
        C3257t c3257t = this.f16312f;
        synchronized (c3257t) {
            try {
                abstractC5751gMo12105g = (AbstractC5751g) c3257t.f16436b.getOrDefault(strM9271a, null);
                if (abstractC5751gMo12105g == null) {
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "Making new request for: " + strM9271a);
                    }
                    C3249l c3249l = this.f16311e;
                    abstractC5751gMo12105g = c3249l.m9265a(c3249l.m9267c(C3252o.m9271a(c3249l.f16400a), "*", new Bundle())).mo12112n(this.f16315i, new C6224n(2, this, strM9271a, aVarM9231d)).mo12105g(c3257t.f16435a, new C1750d(c3257t, 7, strM9271a));
                    c3257t.f16436b.put(strM9271a, abstractC5751gMo12105g);
                } else if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Joining ongoing request for: " + strM9271a);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        try {
            return (String) Tasks.m8537a(abstractC5751gMo12105g);
        } catch (InterruptedException | ExecutionException e11) {
            throw new IOException(e11);
        }
    }

    /* JADX INFO: renamed from: c */
    public final AbstractC5751g<String> m9230c() {
        InterfaceC1379a interfaceC1379a = this.f16308b;
        if (interfaceC1379a != null) {
            return interfaceC1379a.m4964b();
        }
        C5752h c5752h = new C5752h();
        this.f16314h.execute(new RunnableC7907g(this, 18, c5752h));
        return c5752h.f34812a;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: d */
    public final C3260w.a m9231d() {
        C3260w c3260w;
        C3260w.a aVarM9295b;
        Context context = this.f16310d;
        synchronized (FirebaseMessaging.class) {
            if (f16304m == null) {
                f16304m = new C3260w(context);
            }
            c3260w = f16304m;
        }
        C0065e c0065e = this.f16307a;
        c0065e.m437a();
        String strM438c = "[DEFAULT]".equals(c0065e.f172b) ? "" : c0065e.m438c();
        String strM9271a = C3252o.m9271a(this.f16307a);
        synchronized (c3260w) {
            try {
                aVarM9295b = C3260w.a.m9295b(c3260w.f16447a.getString(strM438c + "|T|" + strM9271a + "|*", null));
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return aVarM9295b;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: e */
    public final void m9232e() {
        InterfaceC1379a interfaceC1379a = this.f16308b;
        if (interfaceC1379a != null) {
            interfaceC1379a.m4963a();
            return;
        }
        if (m9234g(m9231d())) {
            synchronized (this) {
                try {
                    if (!this.f16317k) {
                        m9233f(0L);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: f */
    public final synchronized void m9233f(long j10) {
        try {
            m9228b(new RunnableC3261x(this, Math.min(Math.max(30L, 2 * j10), f16303l)), j10);
            this.f16317k = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: g */
    public final boolean m9234g(C3260w.a aVar) {
        String str;
        if (aVar == null) {
            return true;
        }
        C3252o c3252o = this.f16316j;
        synchronized (c3252o) {
            if (c3252o.f16410b == null) {
                c3252o.m9274d();
            }
            str = c3252o.f16410b;
        }
        return (System.currentTimeMillis() > (aVar.f16451c + C3260w.a.f16448d) ? 1 : (System.currentTimeMillis() == (aVar.f16451c + C3260w.a.f16448d) ? 0 : -1)) > 0 || !str.equals(aVar.f16450b);
    }
}
