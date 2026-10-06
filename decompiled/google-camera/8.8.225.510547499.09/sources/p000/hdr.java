package p000;

import android.graphics.Bitmap;
import android.graphics.PointF;
import android.os.CountDownTimer;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class hdr extends CountDownTimer {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ PointF f27374a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ hdt f27375b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hdr(hdt hdtVar, long j, long j2, PointF pointF) {
        super(j, j2);
        this.f27375b = hdtVar;
        this.f27374a = pointF;
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        Callable callable;
        hdt hdtVar = this.f27375b;
        if (hdtVar.f27385i) {
            return;
        }
        hdtVar.f27386j = null;
        hdtVar.f27379c.m10141a();
        hdt hdtVar2 = this.f27375b;
        mrm mrmVarM16829i = mqu.f41450a;
        synchronized (hdtVar2) {
            callable = hdtVar2.f27384h;
        }
        if (callable != null) {
            try {
                mrm mrmVar = (mrm) callable.call();
                if (mrmVar.mo16813g()) {
                    mrmVarM16829i = mrm.m16829i(((ihy) mrmVar.mo16809c()).f31023a);
                }
            } catch (Exception e) {
                ((nbe) ((nbe) ((nbe) hdt.f27377a.m17251b()).mo17283h(e)).mo17276G((char) 3483)).mo17290o("Grabbing viewfinder screenshot failed.");
            }
        }
        if (mrmVarM16829i.mo16813g()) {
            this.f27375b.f27378b.mo8151Z(26, 8);
            this.f27375b.f27388l.m17609f(0);
            iad iadVar = this.f27375b.f27380d;
            ofk ofkVarM17743c = nvn.m17743c();
            ofkVarM17743c.f45859g = (Bitmap) mrmVarM16829i.mo16809c();
            ofkVarM17743c.f45857e = this.f27374a;
            iadVar.f30130h = ofkVarM17743c.m18465b();
            if (this.f27375b.f27381e.mo8564b(ikw.LENS)) {
                return;
            }
            this.f27375b.f27380d.m10980f();
        }
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j) {
    }
}
