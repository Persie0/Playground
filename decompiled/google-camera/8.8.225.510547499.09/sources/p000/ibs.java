package p000;

import android.content.Context;
import android.view.WindowManager;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ibs {

    /* JADX INFO: renamed from: d */
    private final icg f30266d;

    /* JADX INFO: renamed from: e */
    private final WindowManager f30267e;

    /* JADX INFO: renamed from: f */
    private final Context f30268f;

    /* JADX INFO: renamed from: g */
    private int f30269g;

    /* JADX INFO: renamed from: b */
    private float f30264b = 0.0f;

    /* JADX INFO: renamed from: c */
    private float f30265c = 0.0f;

    /* JADX INFO: renamed from: a */
    public boolean f30263a = true;

    public ibs(icg icgVar, WindowManager windowManager, Context context) {
        this.f30266d = icgVar;
        this.f30267e = windowManager;
        this.f30268f = context;
    }

    /* JADX INFO: renamed from: e */
    private final void m11026e(boolean z, hzj hzjVar) {
        if (Math.abs(this.f30264b) <= ill.m11431b(80.0f) && Math.abs(this.f30265c) <= 3.0f) {
            m11029a();
            return;
        }
        float f = this.f30264b;
        boolean zM11027f = m11027f(z, hzjVar);
        int i = f > 0.0f ? 2 : 1;
        if (!zM11027f) {
            this.f30266d.mo11022u(i, false);
            return;
        }
        int rotation = this.f30267e.getDefaultDisplay().getRotation();
        if ((!m11028g(hzjVar) && rotation == 3) || (m11028g(hzjVar) && rotation == 1)) {
            i = i == 2 ? 1 : 2;
        }
        ibq ibqVar = (ibq) this.f30266d;
        if (!((hzp) ibqVar.f30225j.mo6051a()).f30074a.f30073i.equals(hzj.f30014d)) {
            if (i == 1) {
                ibqVar.f30224i.mo9112L(2);
            } else {
                ibqVar.f30224i.mo9113M();
            }
        }
        m11029a();
    }

    /* JADX INFO: renamed from: f */
    private final boolean m11027f(boolean z, hzj hzjVar) {
        if (m11028g(hzjVar)) {
            return z;
        }
        return z == ilk.m11427e(ilk.m11426b(this.f30267e.getDefaultDisplay(), this.f30268f));
    }

    /* JADX INFO: renamed from: g */
    private static final boolean m11028g(hzj hzjVar) {
        return hzjVar.equals(hzj.TABLET_LAYOUT) || hzjVar.equals(hzj.STARFISH_LAYOUT);
    }

    /* JADX INFO: renamed from: a */
    public final void m11029a() {
        this.f30269g = 0;
        this.f30264b = 0.0f;
        this.f30265c = 0.0f;
        ibq ibqVar = (ibq) this.f30266d;
        ibqVar.f30217b.setClickable(true);
        ibqVar.f30219d.mo11197E(true);
        ibqVar.f30220e.m7600g(1);
    }

    /* JADX INFO: renamed from: b */
    public final void m11030b(boolean z, hzj hzjVar) {
        if (this.f30263a || m11027f(z, hzjVar)) {
            m11026e(z, hzjVar);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m11031c(float f) {
        if (this.f30267e.getDefaultDisplay().getRotation() == 1) {
            f = -f;
        }
        this.f30265c = f / 1000.0f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0046, code lost:
    
        if (r3.f30266d.mo11016o() != false) goto L24;
     */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m11032d(float f, boolean z, hzj hzjVar) {
        boolean z2 = !m11027f(z, hzjVar);
        if (this.f30263a || !z2) {
            if (z && this.f30267e.getDefaultDisplay().getRotation() == 1) {
                f = -f;
            }
            float f2 = this.f30264b + f;
            this.f30264b = f2;
            int i = this.f30269g + 1;
            this.f30269g = i;
            if (i <= 2) {
                return;
            }
            if (z2) {
                if (f2 <= 0.0f || !this.f30266d.mo11017p()) {
                    f2 = this.f30264b;
                    if (f2 < 0.0f) {
                    }
                }
                m11029a();
                return;
            }
            if (z2) {
                Math.abs(f2);
                ill.m11431b(5.0f);
            }
            if (Math.abs(this.f30264b) >= ill.m11431b(80.0f)) {
                m11026e(z, hzjVar);
            }
        }
    }
}
