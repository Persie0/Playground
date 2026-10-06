package p000;

import androidx.lifecycle.LiveData$LifecycleBoundObserver;
import com.google.android.apps.camera.evcomp.AZCp.HRLmc;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class alc {

    /* JADX INFO: renamed from: a */
    public static final Object f623a = new Object();

    /* JADX INFO: renamed from: b */
    public final Object f624b = new Object();

    /* JADX INFO: renamed from: c */
    public final C0943qu f625c = new C0943qu();

    /* JADX INFO: renamed from: d */
    public int f626d = 0;

    /* JADX INFO: renamed from: e */
    public boolean f627e;

    /* JADX INFO: renamed from: f */
    public volatile Object f628f;

    /* JADX INFO: renamed from: g */
    public volatile Object f629g;

    /* JADX INFO: renamed from: h */
    public int f630h;

    /* JADX INFO: renamed from: i */
    public final Runnable f631i;

    /* JADX INFO: renamed from: j */
    private boolean f632j;

    /* JADX INFO: renamed from: k */
    private boolean f633k;

    public alc() {
        Object obj = f623a;
        this.f629g = obj;
        this.f631i = new RunnableC0852nk(this, 14);
        this.f628f = obj;
        this.f630h = -1;
    }

    /* JADX INFO: renamed from: a */
    public static void m897a(String str) {
        if (C0933qk.m19346b().m19347c()) {
            return;
        }
        throw new IllegalStateException("Cannot invoke " + str + HRLmc.MaOTLabHpgAvgNx);
    }

    /* JADX INFO: renamed from: h */
    private final void m898h(alb albVar) {
        if (albVar.f620d) {
            if (!albVar.mo893f()) {
                albVar.m896d(false);
                return;
            }
            int i = albVar.f621e;
            int i2 = this.f630h;
            if (i >= i2) {
                return;
            }
            albVar.f621e = i2;
            albVar.f619c.mo906a(this.f628f);
        }
    }

    /* JADX INFO: renamed from: b */
    final void m899b(alb albVar) {
        if (this.f632j) {
            this.f633k = true;
            return;
        }
        this.f632j = true;
        while (true) {
            this.f633k = false;
            if (albVar != null) {
                m898h(albVar);
            } else {
                C0940qr c0940qrM19358e = this.f625c.m19358e();
                while (c0940qrM19358e.hasNext()) {
                    m898h((alb) ((C0939qq) c0940qrM19358e.next()).f47500b);
                    if (this.f633k) {
                        break;
                    }
                }
            }
            if (!this.f633k) {
                this.f632j = false;
                return;
            }
            albVar = null;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m900c(akv akvVar, ale aleVar) {
        m897a("observe");
        if (akvVar.getLifecycle().f598a == akr.DESTROYED) {
            return;
        }
        LiveData$LifecycleBoundObserver liveData$LifecycleBoundObserver = new LiveData$LifecycleBoundObserver(this, akvVar, aleVar);
        alb albVar = (alb) this.f625c.m19359f(aleVar, liveData$LifecycleBoundObserver);
        if (albVar != null && !albVar.mo895c(akvVar)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (albVar != null) {
            return;
        }
        akvVar.getLifecycle().m879a(liveData$LifecycleBoundObserver);
    }

    /* JADX INFO: renamed from: d */
    protected void mo901d() {
    }

    /* JADX INFO: renamed from: e */
    protected void mo902e() {
    }

    /* JADX INFO: renamed from: f */
    public void mo903f(ale aleVar) {
        m897a("removeObserver");
        alb albVar = (alb) this.f625c.mo19349b(aleVar);
        if (albVar == null) {
            return;
        }
        albVar.mo894b();
        albVar.m896d(false);
    }

    /* JADX INFO: renamed from: g */
    public void mo904g(Object obj) {
        throw null;
    }
}
