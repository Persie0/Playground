package p000;

import android.os.Looper;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class etz implements eos {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ fcp f19896a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ fmh f19897b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ igb f19898c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ AtomicBoolean f19899d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ euf f19900e;

    /* JADX INFO: renamed from: f */
    final /* synthetic */ ikt f19901f;

    public etz(euf eufVar, fcp fcpVar, fmh fmhVar, ikt iktVar, igb igbVar, AtomicBoolean atomicBoolean) {
        this.f19900e = eufVar;
        this.f19896a = fcpVar;
        this.f19897b = fmhVar;
        this.f19901f = iktVar;
        this.f19898c = igbVar;
        this.f19899d = atomicBoolean;
    }

    @Override // p000.eos
    /* JADX INFO: renamed from: a */
    public final nps mo7604a(int i) {
        this.f19900e.m7892B(false);
        switch (i - 1) {
            case 1:
                this.f19896a.mo8169an(4, System.currentTimeMillis());
                break;
            default:
                this.f19896a.mo8169an(5, System.currentTimeMillis());
                break;
        }
        return this.f19897b.mo7604a(i);
    }

    @Override // p000.eos
    /* JADX INFO: renamed from: b */
    public final nps mo7605b(int i) {
        if (!this.f19901f.f31381h) {
            nps npsVarB = this.f19897b.mo7605b(i);
            jvh.m13557e(Looper.getMainLooper()).post(new esc(this, 17));
            return npsVarB;
        }
        this.f19896a.mo8169an(2, System.currentTimeMillis());
        this.f19901f.m11408a();
        this.f19898c.mo11208P();
        if (!this.f19899d.get()) {
            this.f19900e.f19917D.m8582c();
        }
        return kxk.m14965K(true);
    }
}
