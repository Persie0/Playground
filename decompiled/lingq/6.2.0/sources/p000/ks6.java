package p000;

import android.graphics.Typeface;
import android.os.PowerManager;
import androidx.compose.p002ui.platform.C0413y;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.selects.C3247b;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ks6 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f48388a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f48389b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f48390c;

    public /* synthetic */ ks6(int i, Object obj, Object obj2) {
        this.f48388a = i;
        this.f48389b = obj;
        this.f48390c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        PowerManager.WakeLock wakeLock;
        switch (this.f48388a) {
            case 0:
                ((C3247b) ((gu8) this.f48389b)).m15593i((ls6) this.f48390c, xfa.f68157a);
                return;
            case 1:
                ((AbstractC3584sr) this.f48389b).mo21649R((Typeface) this.f48390c);
                return;
            case 2:
                ((vp1) this.f48389b).m23462a((h50) this.f48390c);
                return;
            case 3:
                ny8 ny8Var = (ny8) this.f48389b;
                Runnable runnable = (Runnable) this.f48390c;
                ny8Var.getClass();
                try {
                    runnable.run();
                    return;
                } catch (Throwable th) {
                    ny8Var.m17682I(Thread.currentThread(), th);
                    return;
                }
            case 4:
                Runnable runnable2 = (Runnable) this.f48389b;
                by8 by8Var = (by8) this.f48390c;
                try {
                    runnable2.run();
                    return;
                } finally {
                    by8Var.m4224a();
                }
            case 5:
                mba mbaVar = (mba) this.f48389b;
                t67 t67Var = (t67) this.f48390c;
                mbaVar.getClass();
                mbaVar.m16752d(t67Var.f61913a, t67Var.f61914b);
                return;
            case 6:
                wn9 wn9Var = (wn9) this.f48389b;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f48390c;
                qfa qfaVar = (qfa) wn9Var.f67096c;
                qfaVar.getClass();
                if (atomicBoolean.get()) {
                    new Thread(new ks6(7, qfaVar, atomicBoolean), "ExoPlayer:WakeLockManager").start();
                    return;
                }
                return;
            case 7:
                qfa qfaVar2 = (qfa) this.f48389b;
                AtomicBoolean atomicBoolean2 = (AtomicBoolean) this.f48390c;
                synchronized (qfaVar2) {
                    if (atomicBoolean2.get() && (wakeLock = (PowerManager.WakeLock) qfaVar2.f57706b) != null) {
                        wakeLock.release();
                    }
                    break;
                }
                return;
            default:
                C0413y c0413y = (C0413y) this.f48389b;
                AbstractC3572sf abstractC3572sf = (AbstractC3572sf) this.f48390c;
                if (c0413y.f4875c) {
                    return;
                }
                c0413y.f4876d = abstractC3572sf;
                abstractC3572sf.mo21323g(c0413y);
                return;
        }
    }
}
