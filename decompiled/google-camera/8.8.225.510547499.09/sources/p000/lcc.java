package p000;

import android.opengl.EGL14;
import android.opengl.EGL15;
import android.opengl.EGLSync;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class lcc extends kze implements lby {

    /* JADX INFO: renamed from: d */
    private static final Callable f37904d = new mpj(1);

    /* JADX INFO: renamed from: e */
    private final Executor f37906e;

    /* JADX INFO: renamed from: f */
    private final kzx f37907f;

    /* JADX INFO: renamed from: g */
    private final lav f37908g = lav.m15121j();

    /* JADX INFO: renamed from: h */
    private final HashMap f37909h = new HashMap();

    /* JADX INFO: renamed from: c */
    public volatile boolean f37905c = true;

    /* JADX INFO: renamed from: i */
    private final nqf f37910i = nqf.m17621g();

    public lcc(Executor executor) {
        this.f37906e = executor;
        this.f37907f = lqi.m15863h(executor, f37904d);
    }

    /* JADX INFO: renamed from: j */
    public static EGLSync m15159j() {
        return EGL15.eglCreateSync(EGL14.eglGetDisplay(0), 12537, new long[]{12344}, 0);
    }

    /* JADX INFO: renamed from: n */
    private final Collection m15160n() {
        ArrayList arrayList;
        synchronized (this.f37909h) {
            arrayList = new ArrayList(this.f37909h.values());
            this.f37909h.clear();
        }
        return arrayList;
    }

    @Override // p000.kze
    /* JADX INFO: renamed from: b */
    protected final laa mo15085b() {
        Collection collectionM15160n = m15160n();
        Executor executor = this.f37906e;
        lcb lcbVar = lcb.f37902a;
        ArrayList arrayList = new ArrayList();
        Iterator it = collectionM15160n.iterator();
        while (it.hasNext()) {
            arrayList.add(lqi.m15864i(it.next()));
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((kzx) it2.next()).mo15103b(executor, lcbVar));
        }
        return laa.m15114j(lqi.m15865j(arrayList2).mo15103b(this.f37906e, new kzs(this.f37908g, 2)).mo15103b(this.f37906e, new lcb(1)).mo15103b(this.f37906e, new lad(this, 2)));
    }

    @Override // p000.kze
    /* JADX INFO: renamed from: cn */
    protected final void mo15086cn() {
        Iterator it = m15160n().iterator();
        while (it.hasNext()) {
            ((lgg) it.next()).close();
        }
        ((ldx) lqi.m15868m(this.f37908g)).close();
        this.f37905c = false;
        this.f37906e.execute(new kxw(this, 9));
        lqi.m15868m(mo15161k());
    }

    @Override // p000.lby
    /* JADX INFO: renamed from: d */
    public final ldb mo15152d() {
        final nqf nqfVarM17621g = nqf.m17621g();
        try {
            execute(new Runnable() { // from class: lbz
                @Override // java.lang.Runnable
                public final void run() {
                    nqfVarM17621g.mo14894e(kua.m14880s(lcc.m15159j()));
                }
            });
            return new lda(nqfVarM17621g, 1);
        } catch (RejectedExecutionException e) {
            if (this.f37905c) {
                throw new IllegalStateException("Unable to schedule EGLSync!", e);
            }
            return new lda(this.f37910i, 0);
        }
    }

    @Override // p000.lby
    /* JADX INFO: renamed from: e */
    public final leb mo15153e() {
        return ((ldi) ((ldx) lqi.m15866k(this.f37908g)).m15167f()).mo15185h();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (!this.f37905c) {
            throw new RejectedExecutionException("Attempting to execute task on a GLContext that is already closed!");
        }
        this.f37906e.execute(runnable);
    }

    @Override // p000.lby
    /* JADX INFO: renamed from: f */
    public final void mo15154f(lde ldeVar, Runnable runnable) {
        execute(new lca());
    }

    @Override // p000.lby
    /* JADX INFO: renamed from: g */
    public final boolean mo15155g() {
        return lqi.m15867l(this.f37907f) == Thread.currentThread();
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, lgb] */
    @Override // p000.lby
    /* JADX INFO: renamed from: h */
    public final lgg mo15156h(Object obj, msi msiVar) {
        lgg lggVar;
        synchronized (this.f37909h) {
            lgg lggVar2 = (lgg) this.f37909h.get(obj);
            if (lggVar2 == null) {
                try {
                    lggVar2 = new lgg((lgb) msiVar.mo6051a());
                    this.f37909h.put(obj, lggVar2);
                } catch (Throwable th) {
                    throw msm.m16866a(th);
                }
            }
            if (!lggVar2.f38207d.get()) {
                throw new lgd();
            }
            lggVar2.f38206c.f38203a.incrementAndGet();
            lggVar = new lgg(lggVar2.f38206c);
        }
        return lggVar;
    }

    @Override // p000.lby
    /* JADX INFO: renamed from: i */
    public final ldx mo15157i() {
        return (ldx) lqi.m15866k(this.f37908g);
    }

    /* JADX INFO: renamed from: k */
    public laa mo15161k() {
        return kzz.f37797a;
    }

    /* JADX INFO: renamed from: l */
    public final void m15162l() {
        ldb ldbVarM14880s = kua.m14880s(m15159j());
        try {
            ldbVarM14880s.mo15194a();
            ldbVarM14880s.close();
            this.f37910i.mo14894e(true);
        } catch (Throwable th) {
            try {
                ldbVarM14880s.close();
            } catch (Throwable th2) {
                try {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                } catch (Exception e) {
                }
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m15163m(ldx ldxVar) {
        this.f37908g.m15130l(ldxVar);
    }
}
