package p000;

import android.content.Context;
import android.graphics.Typeface;
import android.net.ConnectivityManager;
import android.os.Bundle;
import android.util.Log;
import androidx.savedstate.Recreator;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.Executor;
import p000.akq;
import p000.akv;
import p000.aqm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bzm {

    /* JADX INFO: renamed from: d */
    private static volatile bzm f4818d;

    /* JADX INFO: renamed from: a */
    public boolean f4819a;

    /* JADX INFO: renamed from: b */
    public final Object f4820b;

    /* JADX INFO: renamed from: c */
    public final Object f4821c;

    public bzm() {
    }

    public bzm(Executor executor) {
        executor.getClass();
        this.f4820b = new Object();
        this.f4821c = new ArrayList();
    }

    public bzm(mkm mkmVar, Typeface typeface) {
        this.f4821c = typeface;
        this.f4820b = mkmVar;
    }

    /* JADX INFO: renamed from: a */
    static bzm m3218a(Context context) {
        if (f4818d == null) {
            synchronized (bzm.class) {
                if (f4818d == null) {
                    f4818d = new bzm(context.getApplicationContext());
                }
            }
        }
        return f4818d;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r0v14, types: [cbc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [cbc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, java.util.Set] */
    /* JADX INFO: renamed from: b */
    final synchronized void m3219b(byw bywVar) {
        this.f4820b.add(bywVar);
        if (!this.f4819a && !this.f4820b.isEmpty()) {
            Object obj = this.f4821c;
            boolean z = true;
            ((jwl) obj).f34954a = ((ConnectivityManager) ((jwl) obj).f34955b.mo2844a()).getActiveNetwork() != null;
            try {
                ((ConnectivityManager) ((jwl) obj).f34955b.mo2844a()).registerDefaultNetworkCallback((ConnectivityManager.NetworkCallback) ((jwl) obj).f34957d);
            } catch (RuntimeException e) {
                if (Log.isLoggable("ConnectivityMonitor", 5)) {
                    Log.w("ConnectivityMonitor", "Failed to register callback", e);
                }
                z = false;
            }
            this.f4819a = z;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r0v3, types: [cbc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.util.Set] */
    /* JADX INFO: renamed from: c */
    final synchronized void m3220c(byw bywVar) {
        this.f4820b.remove(bywVar);
        if (this.f4819a && this.f4820b.isEmpty()) {
            Object obj = this.f4821c;
            ((ConnectivityManager) ((jwl) obj).f34955b.mo2844a()).unregisterNetworkCallback((ConnectivityManager.NetworkCallback) ((jwl) obj).f34957d);
            this.f4819a = false;
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m3221d() {
        this.f4819a = true;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, mkm] */
    /* JADX INFO: renamed from: e */
    public final void m3222e(Typeface typeface) {
        if (this.f4819a) {
            return;
        }
        this.f4820b.mo16417a(typeface);
    }

    /* JADX INFO: renamed from: f */
    public final void m3223f() {
        m3222e((Typeface) this.f4821c);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [aqn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [aqn, java.lang.Object] */
    /* JADX INFO: renamed from: g */
    public final void m3224g() {
        aks lifecycle = this.f4821c.getLifecycle();
        lifecycle.getClass();
        if (lifecycle.f598a != akr.f593b) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        lifecycle.m879a(new Recreator(this.f4821c));
        final aqm aqmVar = (aqm) this.f4820b;
        if (aqmVar.f2141b) {
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        lifecycle.m879a(new akt() { // from class: androidx.savedstate.SavedStateRegistry$$ExternalSyntheticLambda0
            @Override // p000.akt
            /* JADX INFO: renamed from: a */
            public final void mo883a(akv akvVar, akq akqVar) {
                boolean z;
                aqm aqmVar2 = aqmVar;
                if (akqVar == akq.ON_START) {
                    z = true;
                } else if (akqVar != akq.ON_STOP) {
                    return;
                } else {
                    z = false;
                }
                aqmVar2.f2144e = z;
            }
        });
        aqmVar.f2141b = true;
        this.f4819a = true;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [aqn, java.lang.Object] */
    /* JADX INFO: renamed from: h */
    public final void m3225h(Bundle bundle) {
        if (!this.f4819a) {
            m3224g();
        }
        aks lifecycle = this.f4821c.getLifecycle();
        lifecycle.getClass();
        if (lifecycle.f598a.m872a(akr.f595d)) {
            StringBuilder sb = new StringBuilder();
            sb.append("performRestore cannot be called when owner is ");
            akr akrVar = lifecycle.f598a;
            sb.append(akrVar);
            throw new IllegalStateException("performRestore cannot be called when owner is ".concat(String.valueOf(akrVar)));
        }
        aqm aqmVar = (aqm) this.f4820b;
        if (!aqmVar.f2141b) {
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).");
        }
        if (aqmVar.f2143d) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        aqmVar.f2142c = bundle != null ? bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key") : null;
        aqmVar.f2143d = true;
    }

    /* JADX INFO: renamed from: i */
    public final void m3226i(Bundle bundle) {
        bundle.getClass();
        Object obj = this.f4820b;
        Bundle bundle2 = new Bundle();
        aqm aqmVar = (aqm) obj;
        Bundle bundle3 = aqmVar.f2142c;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        C0940qr c0940qrM19358e = aqmVar.f2140a.m19358e();
        while (c0940qrM19358e.hasNext()) {
            C0939qq c0939qq = (C0939qq) c0940qrM19358e.next();
            bundle2.putBundle((String) c0939qq.f47499a, ((aql) c0939qq.f47500b).mo910a());
        }
        if (bundle2.isEmpty()) {
            return;
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }

    public bzm(aqn aqnVar) {
        this.f4821c = aqnVar;
        this.f4820b = new aqm();
    }

    private bzm(Context context) {
        this.f4820b = new HashSet();
        this.f4821c = new jwl(bzq.m3279s(new bzj(context)), new bzk(this));
    }
}
