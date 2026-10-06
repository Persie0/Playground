package p000;

import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class chb implements hjk {

    /* JADX INFO: renamed from: a */
    private static final nbh f5715a = nbh.m17259h("com/google/android/apps/camera/app/CacheCameraInfoBehavior");

    /* JADX INFO: renamed from: b */
    private final kbz f5716b;

    /* JADX INFO: renamed from: c */
    private final dnn f5717c;

    /* JADX INFO: renamed from: d */
    private final dhv f5718d;

    /* JADX INFO: renamed from: e */
    private final kms f5719e;

    public chb(kms kmsVar, kbz kbzVar, dnn dnnVar, dhv dhvVar) {
        this.f5719e = kmsVar;
        this.f5716b = kbzVar;
        this.f5717c = dnnVar;
        this.f5718d = dhvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f5716b.mo13961e("#cacheDeviceInfo");
        kmg kmgVarM6439b = this.f5717c.m6439b(this.f5719e, this.f5718d, kmq.BACK);
        if (kmgVarM6439b != null) {
            fvu fvuVarM14581f = this.f5719e.m14581f(kmgVarM6439b);
            fvuVarM14581f.mo14572y();
            Iterator it = fvuVarM14581f.mo14533B().iterator();
            while (it.hasNext()) {
                this.f5719e.m14581f((kmg) it.next()).mo14572y();
            }
            fvuVarM14581f.mo14573z();
            fvuVarM14581f.mo14532A();
        } else {
            ((nbe) ((nbe) f5715a.m17252c()).mo17276G((char) 133)).mo17290o("No back-facing camera found.");
        }
        this.f5716b.mo13962f();
    }
}
