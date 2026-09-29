package androidx.compose.p002ui.platform;

import android.os.Handler;
import android.view.Choreographer;
import java.util.ArrayList;
import kotlin.AbstractC3192a;
import p000.C0825bv;
import p000.C2932dl;
import p000.ChoreographerFrameCallbackC2968el;
import p000.cs4;
import p000.kn1;
import p000.nn1;

/* JADX INFO: renamed from: androidx.compose.ui.platform.i */
/* JADX INFO: loaded from: classes.dex */
public final class C0397i extends nn1 {

    /* JADX INFO: renamed from: H */
    public static final cs4 f4770H = AbstractC3192a.m15356a(AndroidUiDispatcher$Companion$Main$2.f4524b);

    /* JADX INFO: renamed from: I */
    public static final C2932dl f4771I = new C2932dl(0);

    /* JADX INFO: renamed from: c */
    public final Choreographer f4772c;

    /* JADX INFO: renamed from: d */
    public final Handler f4773d;

    /* JADX INFO: renamed from: i */
    public boolean f4778i;

    /* JADX INFO: renamed from: j */
    public boolean f4779j;

    /* JADX INFO: renamed from: l */
    public final C0398j f4781l;

    /* JADX INFO: renamed from: e */
    public final Object f4774e = new Object();

    /* JADX INFO: renamed from: f */
    public final C0825bv f4775f = new C0825bv();

    /* JADX INFO: renamed from: g */
    public ArrayList f4776g = new ArrayList();

    /* JADX INFO: renamed from: h */
    public ArrayList f4777h = new ArrayList();

    /* JADX INFO: renamed from: k */
    public final ChoreographerFrameCallbackC2968el f4780k = new ChoreographerFrameCallbackC2968el(this);

    public C0397i(Choreographer choreographer, Handler handler) {
        this.f4772c = choreographer;
        this.f4773d = handler;
        this.f4781l = new C0398j(choreographer, this);
    }

    /* JADX INFO: renamed from: g0 */
    public static final void m1798g0(C0397i c0397i) {
        Runnable runnable;
        boolean z;
        do {
            synchronized (c0397i.f4774e) {
                C0825bv c0825bv = c0397i.f4775f;
                runnable = (Runnable) (c0825bv.isEmpty() ? null : c0825bv.removeFirst());
            }
            while (runnable != null) {
                runnable.run();
                synchronized (c0397i.f4774e) {
                    C0825bv c0825bv2 = c0397i.f4775f;
                    runnable = (Runnable) (c0825bv2.isEmpty() ? null : c0825bv2.removeFirst());
                }
            }
            synchronized (c0397i.f4774e) {
                if (c0397i.f4775f.isEmpty()) {
                    z = false;
                    c0397i.f4778i = false;
                } else {
                    z = true;
                }
            }
        } while (z);
    }

    @Override // p000.nn1
    /* JADX INFO: renamed from: T */
    public final void mo385T(kn1 kn1Var, Runnable runnable) {
        synchronized (this.f4774e) {
            this.f4775f.addLast(runnable);
            if (!this.f4778i) {
                this.f4778i = true;
                this.f4773d.post(this.f4780k);
                if (!this.f4779j) {
                    this.f4779j = true;
                    this.f4772c.postFrameCallback(this.f4780k);
                }
            }
        }
    }
}
