package p000;

import android.content.Context;
import android.util.Log;
import com.google.firebase.crashlytics.internal.common.C1148a;
import com.google.firebase.crashlytics.internal.concurrency.C1149a;
import com.google.firebase.crashlytics.internal.settings.C1150a;
import java.io.File;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
public final class tp1 {

    /* JADX INFO: renamed from: a */
    public final Context f62654a;

    /* JADX INFO: renamed from: b */
    public final tz1 f62655b;

    /* JADX INFO: renamed from: c */
    public final bl2 f62656c;

    /* JADX INFO: renamed from: d */
    public final long f62657d;

    /* JADX INFO: renamed from: e */
    public b64 f62658e;

    /* JADX INFO: renamed from: f */
    public b64 f62659f;

    /* JADX INFO: renamed from: g */
    public C1148a f62660g;

    /* JADX INFO: renamed from: h */
    public final dz3 f62661h;

    /* JADX INFO: renamed from: i */
    public final t33 f62662i;

    /* JADX INFO: renamed from: j */
    public final C3333mf f62663j;

    /* JADX INFO: renamed from: k */
    public final C3333mf f62664k;

    /* JADX INFO: renamed from: l */
    public final np1 f62665l;

    /* JADX INFO: renamed from: m */
    public final up1 f62666m;

    /* JADX INFO: renamed from: n */
    public final cc4 f62667n;

    /* JADX INFO: renamed from: o */
    public final C1149a f62668o;

    public tp1(q43 q43Var, dz3 dz3Var, up1 up1Var, tz1 tz1Var, C3333mf c3333mf, C3333mf c3333mf2, t33 t33Var, np1 np1Var, cc4 cc4Var, C1149a c1149a) {
        this.f62655b = tz1Var;
        q43Var.m19644a();
        this.f62654a = q43Var.f57252a;
        this.f62661h = dz3Var;
        this.f62666m = up1Var;
        this.f62663j = c3333mf;
        this.f62664k = c3333mf2;
        this.f62662i = t33Var;
        this.f62665l = np1Var;
        this.f62667n = cc4Var;
        this.f62668o = c1149a;
        this.f62657d = System.currentTimeMillis();
        this.f62656c = new bl2(29);
    }

    /* JADX INFO: renamed from: a */
    public final void m22260a(C1150a c1150a) {
        C1149a.m6679a();
        C1149a.m6679a();
        this.f62658e.m3353f();
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "Initialization marker file was created.", null);
        }
        try {
            try {
                this.f62663j.mo11842b(new qp1(this));
                this.f62660g.m6677g();
                if (!c1150a.m6684b().f43295b.f40031a) {
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", "Collection of crash reports disabled in Crashlytics settings.", null);
                    }
                    throw new RuntimeException("Collection of crash reports disabled in Crashlytics settings.");
                }
                if (!this.f62660g.m6674d(c1150a)) {
                    Log.w("FirebaseCrashlytics", "Previous sessions could not be finalized.", null);
                }
                this.f62660g.m6678h(((wr9) c1150a.f13679i.get()).f67208a);
                m22262c();
            } catch (Exception e) {
                Log.e("FirebaseCrashlytics", "Crashlytics encountered a problem during asynchronous initialization.", e);
                m22262c();
            }
        } catch (Throwable th) {
            m22262c();
            throw th;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m22261b(C1150a c1150a) {
        Future<?> futureSubmit = this.f62668o.f13668a.f34397a.submit(new RunnableC0806bd(17, this, c1150a));
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously.", null);
        }
        try {
            futureSubmit.get(3L, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            Log.e("FirebaseCrashlytics", "Crashlytics was interrupted during initialization.", e);
            Thread.currentThread().interrupt();
        } catch (ExecutionException e2) {
            Log.e("FirebaseCrashlytics", "Crashlytics encountered a problem during initialization.", e2);
        } catch (TimeoutException e3) {
            Log.e("FirebaseCrashlytics", "Crashlytics timed out during initialization.", e3);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m22262c() {
        C1149a.m6679a();
        try {
            b64 b64Var = this.f62658e;
            t33 t33Var = (t33) b64Var.f8007b;
            String str = (String) b64Var.f8006a;
            t33Var.getClass();
            if (new File((File) t33Var.f61788c, str).delete()) {
                return;
            }
            Log.w("FirebaseCrashlytics", "Initialization marker file was not properly removed.", null);
        } catch (Exception e) {
            Log.e("FirebaseCrashlytics", "Problem encountered deleting Crashlytics initialization marker.", e);
        }
    }
}
