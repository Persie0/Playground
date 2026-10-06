package p000;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Handler;
import com.google.android.apps.camera.bottombar.C0100R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hfg implements gyi, chn {

    /* JADX INFO: renamed from: g */
    private static final mxk f27546g = mxk.m17139K(gyw.NORMAL, gyw.HDR_PLUS, gyw.f26883d, gyw.PORTRAIT);

    /* JADX INFO: renamed from: a */
    public final oju f27547a;

    /* JADX INFO: renamed from: b */
    public final hfx f27548b;

    /* JADX INFO: renamed from: c */
    public final Handler f27549c;

    /* JADX INFO: renamed from: d */
    public final Runnable f27550d = new gxw(this, 18);

    /* JADX INFO: renamed from: e */
    public final Activity f27551e;

    /* JADX INFO: renamed from: f */
    public gyu f27552f;

    /* JADX INFO: renamed from: h */
    private final oju f27553h;

    /* JADX INFO: renamed from: i */
    private final jvd f27554i;

    /* JADX INFO: renamed from: j */
    private final Resources f27555j;

    /* JADX INFO: renamed from: k */
    private final eby f27556k;

    /* JADX INFO: renamed from: l */
    private gyu f27557l;

    public hfg(oju ojuVar, oju ojuVar2, hfx hfxVar, jvd jvdVar, Handler handler, Activity activity, Resources resources, eby ebyVar) {
        this.f27547a = ojuVar;
        this.f27553h = ojuVar2;
        this.f27548b = hfxVar;
        this.f27554i = jvdVar;
        this.f27549c = handler;
        this.f27551e = activity;
        this.f27555j = resources;
        this.f27556k = ebyVar;
    }

    /* JADX INFO: renamed from: d */
    private final void m10191d(gyu gyuVar) {
        m10194b();
        m10195c();
        m10193f(gyuVar);
        if (gyuVar.equals(this.f27552f)) {
            this.f27549c.postDelayed(this.f27550d, this.f27555j.getInteger(C0100R.integer.social_handle_reveal_delay));
        }
    }

    /* JADX INFO: renamed from: e */
    private final void m10192e(gyu gyuVar) {
        m10194b();
        chp chpVar = ((hgk) this.f27547a.get()).f27684t;
        gyu gyuVarMo3744d = chpVar == null ? null : chpVar.mo3733b().mo3744d();
        m10195c();
        m10193f(gyuVar);
        gyu gyuVar2 = this.f27552f;
        if (gyuVar2 == null) {
            ((hgk) this.f27547a.get()).mo10201j();
        } else if (gyuVar2.equals(gyuVar)) {
            this.f27552f = null;
        }
        if (gyuVarMo3744d == null || !gyuVarMo3744d.equals(gyuVar)) {
            return;
        }
        ((hgk) this.f27547a.get()).mo10202k();
    }

    /* JADX INFO: renamed from: f */
    private final void m10193f(gyu gyuVar) {
        if (gyuVar.equals(this.f27557l)) {
            m10195c();
            this.f27557l = null;
            ((hfu) this.f27553h.get()).m10216k(hgn.SLOW_CAPTURE);
        }
    }

    @Override // p000.chn
    /* JADX INFO: renamed from: a */
    public final void mo3727a() {
        chp chpVar = ((hgk) this.f27547a.get()).f27684t;
        boolean z = (chpVar == null || chpVar.mo3733b().mo3750j()) ? false : true;
        boolean z2 = chpVar != null && chpVar.mo3733b().mo3750j();
        m10195c();
        if (z) {
            jvd jvdVar = this.f27554i;
            hgk hgkVar = (hgk) this.f27547a.get();
            hgkVar.getClass();
            jvdVar.m13541c(new gxw(hgkVar, 19));
            return;
        }
        if (z2) {
            jvd jvdVar2 = this.f27554i;
            hgk hgkVar2 = (hgk) this.f27547a.get();
            hgkVar2.getClass();
            jvdVar2.m13541c(new gxw(hgkVar2, 20));
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m10194b() {
        this.f27549c.removeCallbacks(this.f27550d);
    }

    /* JADX INFO: renamed from: c */
    public final void m10195c() {
        String hexString = Integer.toHexString(((hgk) this.f27547a.get()).hashCode());
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        sb.append(hexString);
        sb.append("]");
    }

    @Override // p000.gyi
    /* JADX INFO: renamed from: j */
    public final void mo3957j(gyu gyuVar) {
        m10192e(gyuVar);
    }

    @Override // p000.gyi
    /* JADX INFO: renamed from: k */
    public final void mo3958k(gyu gyuVar) {
        m10195c();
        m10191d(gyuVar);
    }

    @Override // p000.gyi
    /* JADX INFO: renamed from: l */
    public final void mo3959l(gyu gyuVar) {
        m10195c();
        m10191d(gyuVar);
    }

    @Override // p000.gyi
    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void mo3960m(long j) {
    }

    @Override // p000.gyi
    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void mo3961n(Bitmap bitmap) {
    }

    @Override // p000.gyi
    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void mo3962o(Bitmap bitmap, int i) {
        jib.m13195D(this, bitmap);
    }

    @Override // p000.gyi
    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void mo3963p(gyu gyuVar, kbb kbbVar) {
    }

    @Override // p000.gyi
    /* JADX INFO: renamed from: q */
    public final void mo3964q(gyu gyuVar, gyp gypVar, gyx gyxVar) {
        m10194b();
        gyw gywVar = gypVar.f26867c;
        m10195c();
        this.f27552f = gyuVar;
        boolean z = true;
        boolean z2 = f27546g.contains(gywVar) && ((Boolean) this.f27556k.f13316b.mo3831be()).booleanValue();
        if (!gywVar.equals(gyw.LONG_EXPOSURE) && !z2) {
            z = false;
        }
        if (((hfu) this.f27553h.get()).f27601q == 0 && z) {
            m10195c();
            ((hfu) this.f27553h.get()).m10215j(hgn.SLOW_CAPTURE);
            this.f27557l = gyuVar;
        }
    }

    @Override // p000.gyi
    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void mo3965r(gyu gyuVar) {
    }

    @Override // p000.gyi
    /* JADX INFO: renamed from: x */
    public final void mo3971x(gyu gyuVar) {
        m10192e(gyuVar);
    }
}
