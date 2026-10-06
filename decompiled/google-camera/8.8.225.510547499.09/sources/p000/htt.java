package p000;

import android.view.ViewPropertyAnimator;
import com.google.android.apps.camera.autotimer.p006ui.AutoTimerIndicatorView;
import com.google.android.apps.camera.bottombar.C0100R;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
class htt extends hts {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ htv f29543a;

    public htt(htv htvVar) {
        this.f29543a = htvVar;
    }

    @Override // p000.hts
    /* JADX INFO: renamed from: b */
    public void mo10751b() {
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Object, java.util.List] */
    @Override // p000.hts, p000.hjn, p000.hjo
    /* JADX INFO: renamed from: f */
    public final void mo5711f() {
        this.f29543a.f29551h.m10697b(false);
        this.f29543a.f29546c.startAutoTimerCapturing();
        htv htvVar = this.f29543a;
        htvVar.f29552i = htvVar.f29545b.mo11019r();
        this.f29543a.f29545b.mo11013l(false);
        this.f29543a.f29545b.mo11023v(false);
        this.f29543a.f29547d.mo11200H();
        this.f29543a.f29548e.m10837d(false);
        this.f29543a.f29549f.mo9127m();
        iqh.m11599c();
        clo cloVar = this.f29543a.f29544a;
        lku.m15616K(cloVar.f6147a.f34942d == clv.IDLE, "Cannot transition to CAPTURING from %s", cloVar.f6147a.f34942d);
        cloVar.m3925d(clv.CAPTURING);
        cmg cmgVar = cloVar.f6148b;
        AutoTimerIndicatorView autoTimerIndicatorView = cmgVar.f6219c;
        if (autoTimerIndicatorView != null) {
            ViewPropertyAnimator viewPropertyAnimator = autoTimerIndicatorView.f6499f;
            if (viewPropertyAnimator != null) {
                lku.m15662p(viewPropertyAnimator);
                viewPropertyAnimator.cancel();
                autoTimerIndicatorView.f6499f = null;
            }
            ViewPropertyAnimator listener = autoTimerIndicatorView.animate().setDuration(AutoTimerIndicatorView.f6494a.toMillis()).alpha(1.0f).setListener(new cmh(autoTimerIndicatorView));
            listener.start();
            autoTimerIndicatorView.f6499f = listener;
            autoTimerIndicatorView.m4040b(autoTimerIndicatorView.getLeft(), autoTimerIndicatorView.getTop(), autoTimerIndicatorView.getRight(), autoTimerIndicatorView.getBottom());
            autoTimerIndicatorView.addOnLayoutChangeListener(autoTimerIndicatorView.f6496c);
            cmgVar.f6220d = true;
        }
        mpx mpxVar = cloVar.f6151e;
        mpxVar.f41307b++;
        ((msd) mpxVar.f41311f).m16859d();
        ((msd) mpxVar.f41311f).m16860e();
        mpxVar.f41308c.clear();
        mpxVar.f41306a.clear();
        cloVar.f6149c.mo10316b(C0100R.raw.video_start);
    }

    /* JADX WARN: Type inference failed for: r1v16, types: [fcp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v23, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v15, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r8v8, types: [java.lang.Object, java.util.List] */
    @Override // p000.hts, p000.hjn, p000.hjo
    /* JADX INFO: renamed from: g */
    public final void mo5712g() {
        clo cloVar = this.f29543a.f29544a;
        lku.m15616K(cloVar.f6147a.f34942d == clv.CAPTURING, "Cannot transition to IDLE from %s", cloVar.f6147a.f34942d);
        cloVar.m3925d(clv.IDLE);
        cmg cmgVar = cloVar.f6148b;
        AutoTimerIndicatorView autoTimerIndicatorView = cmgVar.f6219c;
        if (autoTimerIndicatorView != null) {
            ViewPropertyAnimator viewPropertyAnimator = autoTimerIndicatorView.f6499f;
            if (viewPropertyAnimator != null) {
                lku.m15662p(viewPropertyAnimator);
                viewPropertyAnimator.cancel();
                autoTimerIndicatorView.f6499f = null;
            }
            ViewPropertyAnimator listener = autoTimerIndicatorView.animate().setDuration(AutoTimerIndicatorView.f6494a.toMillis()).alpha(0.0f).setListener(new cmi(autoTimerIndicatorView));
            listener.start();
            autoTimerIndicatorView.f6499f = listener;
            autoTimerIndicatorView.removeOnLayoutChangeListener(autoTimerIndicatorView.f6496c);
            cmgVar.f6220d = false;
        }
        msd msdVar = (msd) cloVar.f6151e.f41311f;
        if (msdVar.f41535a) {
            msdVar.m16861f();
        }
        if (cloVar.f6151e.f41307b > 0) {
            dsx dsxVar = cloVar.f6152f;
            nxl nxlVarM18137O = nlf.f43500h.m18137O();
            String string = ((UUID) ((mpx) dsxVar.f12521a).f41310e).toString();
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            nxq nxqVar = nxlVarM18137O.f44974b;
            nlf nlfVar = (nlf) nxqVar;
            string.getClass();
            nlfVar.f43502a |= 1;
            nlfVar.f43503b = string;
            int i = ((mpx) dsxVar.f12521a).f41307b;
            if (!nxqVar.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            nxq nxqVar2 = nxlVarM18137O.f44974b;
            nlf nlfVar2 = (nlf) nxqVar2;
            nlfVar2.f43502a |= 2;
            nlfVar2.f43504c = i;
            if (!nxqVar2.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            nlf nlfVar3 = (nlf) nxlVarM18137O.f44974b;
            nlfVar3.f43505d = 0;
            nlfVar3.f43502a |= 4;
            long jM16857a = ((msd) ((mpx) dsxVar.f12521a).f41311f).m16857a(TimeUnit.MILLISECONDS);
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            nlf nlfVar4 = (nlf) nxlVarM18137O.f44974b;
            nlfVar4.f43502a |= 8;
            nlfVar4.f43506e = jM16857a;
            int size = ((mpx) dsxVar.f12521a).f41308c.size();
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            nlf nlfVar5 = (nlf) nxlVarM18137O.f44974b;
            nlfVar5.f43502a |= 16;
            nlfVar5.f43507f = size;
            if (size > 1) {
                int i2 = size - 1;
                long jLongValue = ((Long) ((mpx) dsxVar.f12521a).f41308c.get(i2)).longValue() - ((Long) ((mpx) dsxVar.f12521a).f41308c.get(0)).longValue();
                if (!nxlVarM18137O.f44974b.m18142ac()) {
                    nxlVarM18137O.mo18106p();
                }
                long j = jLongValue / ((long) i2);
                nlf nlfVar6 = (nlf) nxlVarM18137O.f44974b;
                nlfVar6.f43502a |= 32;
                nlfVar6.f43508g = j;
            }
            dsxVar.f12522b.mo8131F((nlf) nxlVarM18137O.mo18103l());
        }
        cloVar.f6149c.mo10316b(C0100R.raw.video_stop);
        this.f29543a.f29546c.stopAutoTimerCapturing();
        htv htvVar = this.f29543a;
        htvVar.f29545b.mo11013l(htvVar.f29552i);
        htv htvVar2 = this.f29543a;
        htvVar2.f29545b.mo11023v(htvVar2.f29552i);
        this.f29543a.f29547d.mo11217Y();
        this.f29543a.f29548e.m10837d(true);
        this.f29543a.f29549f.mo9126l();
        iqh.m11600d();
        if (((Boolean) ((jwf) this.f29543a.f29553j.f3651a).f34942d).booleanValue()) {
            this.f29543a.f29551h.m10700e();
        }
        if (this.f29543a.f29550g.mo11746aa() || !this.f29543a.f29550g.mo11745Z(ikw.PHOTO)) {
            this.f29543a.f29550g.mo11765p();
        }
    }
}
