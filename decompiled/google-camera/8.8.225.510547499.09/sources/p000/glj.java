package p000;

import com.google.android.libraries.social.licenses.GWO.HEePJw;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;
import p021j$.util.Collection$EL;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class glj implements kfc {

    /* JADX INFO: renamed from: a */
    public static final nbh f25491a = nbh.m17259h("com/google/android/apps/camera/pixelcamerakit/commands/framebuffer/PckDynamicFrameBuffer");

    /* JADX INFO: renamed from: b */
    public final ReentrantLock f25492b = new ReentrantLock(true);

    /* JADX INFO: renamed from: c */
    public final List f25493c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public String f25494d;

    /* JADX INFO: renamed from: e */
    public kfc f25495e;

    /* JADX INFO: renamed from: f */
    public kfa f25496f;

    /* JADX INFO: renamed from: g */
    public boolean f25497g;

    /* JADX INFO: renamed from: h */
    public final kfb f25498h;

    /* JADX INFO: renamed from: i */
    private final kfk f25499i;

    public glj(kfk kfkVar, jwn jwnVar, jvb jvbVar, Executor executor, Map map, int i, String str) {
        this.f25494d = "";
        dtb dtbVar = new dtb(this, 5);
        this.f25498h = dtbVar;
        lku.m15669w(true ^ map.isEmpty());
        this.f25499i = kfkVar;
        if (str != null) {
            kho khoVar = (kho) map.get(str);
            khoVar.getClass();
            this.f25495e = kfkVar.mo14131r(khoVar, i);
            Collection$EL.stream(khoVar.f36067c).map(egh.f13952r).collect(muc.f41626a);
            this.f25495e.mo9411k(dtbVar);
            this.f25494d = str;
        } else {
            this.f25495e = new gle((kho) map.values().iterator().next(), i);
        }
        try {
            jvbVar.m13537d(jwnVar.mo3830a(new glh(this, map, kfkVar, executor, 0), executor));
        } catch (RejectedExecutionException e) {
            ((nbe) ((nbe) f25491a.m17252c()).mo17276G((char) 2945)).mo17293r("Error attaching active camera monitor: %s", e.getMessage());
        }
    }

    /* JADX INFO: renamed from: t */
    private static void m9421t(kfk kfkVar, kfc kfcVar) {
        if (kfcVar != null) {
            kfcVar.close();
            for (kgg kggVar : kfcVar.mo9417q().f36067c) {
                if (gls.m9445g(kggVar)) {
                    kfkVar.mo14118e(kggVar);
                }
            }
        }
    }

    @Override // p000.kfc
    /* JADX INFO: renamed from: a */
    public final int mo9401a() {
        return this.f25495e.mo9401a();
    }

    @Override // p000.kfc
    /* JADX INFO: renamed from: b */
    public final int mo9402b() {
        return this.f25495e.mo9402b();
    }

    @Override // p000.kfc
    /* JADX INFO: renamed from: c */
    public final key mo9403c() {
        return this.f25495e.mo9403c();
    }

    @Override // p000.kfc, p000.kba, java.lang.AutoCloseable
    public final void close() {
        if (this.f25497g) {
            return;
        }
        synchronized (this) {
            this.f25493c.clear();
        }
        kba kbaVarM9422r = m9422r();
        try {
            this.f25497g = true;
            this.f25495e.mo9412l(this.f25498h);
            m9421t(this.f25499i, this.f25495e);
            kbaVarM9422r.close();
        } catch (Throwable th) {
            try {
                kbaVarM9422r.close();
            } catch (Throwable th2) {
                try {
                    Throwable.class.getDeclaredMethod(HEePJw.gyT, Throwable.class).invoke(th, th2);
                } catch (Exception e) {
                }
            }
            throw th;
        }
    }

    @Override // p000.kfc
    /* JADX INFO: renamed from: d */
    public final key mo9404d(mrp mrpVar) {
        return this.f25495e.mo9404d(mrpVar);
    }

    @Override // p000.kfc
    /* JADX INFO: renamed from: e */
    public final key mo9405e() {
        return this.f25495e.mo9405e();
    }

    @Override // p000.kfc
    /* JADX INFO: renamed from: f */
    public final key mo9406f(mrp mrpVar) {
        return this.f25495e.mo9406f(mrpVar);
    }

    @Override // p000.kfc
    /* JADX INFO: renamed from: g */
    public final key mo9407g() {
        return this.f25495e.mo9407g();
    }

    @Override // p000.kfc
    /* JADX INFO: renamed from: h */
    public final key mo9408h() {
        return this.f25495e.mo9408h();
    }

    @Override // p000.kfc
    /* JADX INFO: renamed from: i */
    public final List mo9409i() {
        return this.f25495e.mo9409i();
    }

    @Override // p000.kfc
    /* JADX INFO: renamed from: j */
    public final List mo9410j() {
        return this.f25495e.mo9410j();
    }

    @Override // p000.kfc
    /* JADX INFO: renamed from: k */
    public final synchronized void mo9411k(kfb kfbVar) {
        this.f25493c.add(kfbVar);
    }

    @Override // p000.kfc
    /* JADX INFO: renamed from: l */
    public final synchronized void mo9412l(kfb kfbVar) {
        this.f25493c.remove(kfbVar);
    }

    @Override // p000.kfc
    /* JADX INFO: renamed from: m */
    public final void mo9413m(int i) {
        this.f25495e.mo9413m(i);
    }

    @Override // p000.kfc
    /* JADX INFO: renamed from: n */
    public final void mo9414n(kfa kfaVar) {
        this.f25496f = kfaVar;
        this.f25495e.mo9414n(kfaVar);
    }

    @Override // p000.kfc
    /* JADX INFO: renamed from: o */
    public final boolean mo9415o(kfd kfdVar) {
        return this.f25495e.mo9415o(kfdVar);
    }

    @Override // p000.kfc
    /* JADX INFO: renamed from: p */
    public final boolean mo9416p() {
        return this.f25495e.mo9416p();
    }

    @Override // p000.kfc
    /* JADX INFO: renamed from: q */
    public final kho mo9417q() {
        return this.f25495e.mo9417q();
    }

    /* JADX INFO: renamed from: r */
    public final kba m9422r() {
        this.f25492b.lock();
        return new gto(this, new AtomicBoolean(true), 1);
    }

    /* JADX INFO: renamed from: s */
    final /* synthetic */ void m9423s(Map map, kfk kfkVar, Executor executor, String str) {
        ReentrantLock reentrantLock;
        Thread.currentThread().getId();
        this.f25492b.lock();
        try {
            if (!this.f25497g && map.containsKey(str) && !str.equals(this.f25494d)) {
                int iMo9401a = this.f25495e.mo9401a();
                this.f25495e.mo9412l(this.f25498h);
                kfc kfcVar = this.f25495e;
                Collection$EL.stream(kfcVar.mo9417q().f36067c).map(egh.f13952r).collect(muc.f41626a);
                m9421t(kfkVar, kfcVar);
                gli gliVar = new gli(this, str, map, kfkVar, iMo9401a, 0);
                gliVar.hashCode();
                try {
                    executor.execute(gliVar);
                    this.f25494d = str;
                    return;
                } catch (RejectedExecutionException e) {
                    ((nbe) ((nbe) ((nbe) f25491a.m17252c()).mo17283h(e)).mo17276G(2957)).mo17293r("Error attaching FrameBuffer for camera %s", str);
                    reentrantLock = this.f25492b;
                    reentrantLock.unlock();
                }
            }
            reentrantLock = this.f25492b;
            reentrantLock.unlock();
        } catch (Throwable th) {
            this.f25492b.unlock();
            throw th;
        }
    }
}
