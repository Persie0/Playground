package p000;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Parcelable;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.google.android.apps.camera.bottombar.BottomBar;
import com.google.android.apps.camera.bottombar.C0100R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hfu implements hgo, fbp, fbb, fbl, fbo, fbn {

    /* JADX INFO: renamed from: t */
    private static final nbh f27578t = nbh.m17259h("com/google/android/apps/camera/socialshare/SocialShareControllerImpl");

    /* JADX INFO: renamed from: A */
    private final dkg f27579A;

    /* JADX INFO: renamed from: B */
    private final Handler f27580B;

    /* JADX INFO: renamed from: E */
    private final cvy f27583E;

    /* JADX INFO: renamed from: F */
    private final ihk f27584F;

    /* JADX INFO: renamed from: a */
    public final Activity f27585a;

    /* JADX INFO: renamed from: b */
    public final Resources f27586b;

    /* JADX INFO: renamed from: c */
    public final oju f27587c;

    /* JADX INFO: renamed from: d */
    public final hgm f27588d;

    /* JADX INFO: renamed from: e */
    public final hfg f27589e;

    /* JADX INFO: renamed from: f */
    public final huf f27590f;

    /* JADX INFO: renamed from: g */
    public final chv f27591g;

    /* JADX INFO: renamed from: h */
    public final gye f27592h;

    /* JADX INFO: renamed from: i */
    public final jwn f27593i;

    /* JADX INFO: renamed from: j */
    public final BottomBar f27594j;

    /* JADX INFO: renamed from: k */
    public final fba f27595k;

    /* JADX INFO: renamed from: l */
    public final jvd f27596l;

    /* JADX INFO: renamed from: m */
    public final hah f27597m;

    /* JADX INFO: renamed from: n */
    public final hai f27598n;

    /* JADX INFO: renamed from: s */
    public final cdu f27603s;

    /* JADX INFO: renamed from: u */
    private final hfx f27604u;

    /* JADX INFO: renamed from: v */
    private final gxa f27605v;

    /* JADX INFO: renamed from: w */
    private final hhi f27606w;

    /* JADX INFO: renamed from: x */
    private final hgy f27607x;

    /* JADX INFO: renamed from: y */
    private final boolean f27608y;

    /* JADX INFO: renamed from: z */
    private final gvo f27609z;

    /* JADX INFO: renamed from: C */
    private final Set f27581C = new HashSet();

    /* JADX INFO: renamed from: o */
    public final List f27599o = new ArrayList();

    /* JADX INFO: renamed from: p */
    public final hgp f27600p = new hfs(this);

    /* JADX INFO: renamed from: D */
    private boolean f27582D = false;

    /* JADX INFO: renamed from: q */
    public int f27601q = 0;

    /* JADX INFO: renamed from: r */
    public String f27602r = "";

    public hfu(Activity activity, oju ojuVar, hgm hgmVar, hfx hfxVar, gxa gxaVar, hfg hfgVar, huf hufVar, chv chvVar, gye gyeVar, jww jwwVar, BottomBar bottomBar, fba fbaVar, cdu cduVar, hhi hhiVar, hgy hgyVar, boolean z, gvo gvoVar, dkg dkgVar, cvy cvyVar, jvd jvdVar, hah hahVar, hai haiVar, ihk ihkVar, Handler handler, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f27585a = activity;
        this.f27586b = activity.getResources();
        this.f27587c = ojuVar;
        this.f27588d = hgmVar;
        this.f27604u = hfxVar;
        this.f27605v = gxaVar;
        this.f27589e = hfgVar;
        this.f27590f = hufVar;
        this.f27591g = chvVar;
        this.f27592h = gyeVar;
        this.f27593i = jwj.m13624c(jwwVar);
        this.f27594j = bottomBar;
        this.f27595k = fbaVar;
        this.f27603s = cduVar;
        this.f27606w = hhiVar;
        this.f27607x = hgyVar;
        this.f27608y = z;
        this.f27609z = gvoVar;
        this.f27579A = dkgVar;
        this.f27583E = cvyVar;
        this.f27596l = jvdVar;
        this.f27597m = hahVar;
        this.f27598n = haiVar;
        this.f27584F = ihkVar;
        this.f27580B = handler;
    }

    /* JADX INFO: renamed from: l */
    private final void m10209l(boolean z, chp chpVar) {
        if (this.f27608y && chpVar != null) {
            this.f27609z.mo9796d(chpVar.mo3733b(), chpVar.mo3734c());
            return;
        }
        if (this.f27604u.m10225i(chpVar) != 1) {
            ((hgk) this.f27587c.get()).mo10201j();
            return;
        }
        chpVar.getClass();
        chq chqVarMo3733b = chpVar.mo3733b();
        gyu gyuVarMo3744d = chqVarMo3733b.mo3744d();
        gyh gyhVarMo9921a = gyuVarMo3744d == null ? null : this.f27605v.mo9921a(gyuVarMo3744d);
        boolean z2 = gyhVarMo9921a != null && gyhVarMo9921a.mo9651a().f35516e >= 100;
        if (!chqVarMo3733b.mo3750j() || z2) {
            ((hgk) this.f27587c.get()).mo10197b(chpVar, z);
        } else {
            ((hgk) this.f27587c.get()).mo10199d(chpVar, z);
        }
    }

    @Override // p000.hgo
    /* JADX INFO: renamed from: a */
    public final void mo10210a(hgp hgpVar) {
        synchronized (this.f27599o) {
            this.f27599o.size();
            this.f27599o.add(hgpVar);
        }
    }

    @Override // p000.fbb
    /* JADX INFO: renamed from: b */
    public final void mo8098b(int i, int i2) {
        if (i == 1000 && i2 == -1) {
            this.f27582D = true;
            ((hgk) this.f27587c.get()).mo10205n();
        }
    }

    @Override // p000.fbl
    /* JADX INFO: renamed from: bF */
    public final void mo3523bF() {
        this.f27588d.m10248c();
        if (this.f27582D) {
            this.f27582D = false;
            this.f27580B.post(new hfr(this, 2));
        }
    }

    @Override // p000.fbn
    /* JADX INFO: renamed from: bG */
    public final void mo3524bG() {
        m10216k(hgn.NOT_STARTED);
    }

    @Override // p000.fbo
    /* JADX INFO: renamed from: e */
    public final void mo3525e() {
        m10215j(hgn.NOT_STARTED);
        this.f27584F.m11348p();
        this.f27604u.f27642e.clear();
    }

    @Override // p000.hgo
    /* JADX INFO: renamed from: f */
    public final void mo10211f(ViewStub viewStub, ViewStub viewStub2) {
        this.f27607x.mo10269f();
        hgm hgmVar = this.f27588d;
        hgmVar.f27695f = viewStub.inflate();
        ((ViewGroup) hgmVar.f27695f.getParent()).setWillNotDraw(false);
        hgmVar.f27693d.mo10187d(hgmVar.f27695f);
        hgmVar.f27696g = hgmVar.f27695f.findViewById(C0100R.id.social_processing_layout);
        hgmVar.f27692c.mo10301d(hgmVar.f27695f, viewStub2.inflate());
        hgmVar.f27695f.post(new hfr(hgmVar, 7));
        hgmVar.m10250e();
        this.f27588d.f27691b.mo2282d(new hfr(this, 1), this.f27596l);
    }

    /* JADX INFO: renamed from: g */
    public final void m10212g(boolean z) {
        m10209l(z, this.f27591g.mo3729b());
    }

    @Override // p000.hgo
    /* JADX INFO: renamed from: h */
    public final void mo10213h(Parcelable parcelable, Serializable serializable) {
        chp dkhVar;
        chr chrVar = (chr) serializable;
        chq chqVar = (chq) parcelable;
        if (chr.PHOTO.equals(chrVar)) {
            dkg dkgVar = this.f27579A;
            dkhVar = new dkf(dkgVar.f11885c, dkgVar.f11886d, chqVar, dkgVar.f11890h, gyx.MEDIA_STORE);
        } else {
            if (!chr.VIDEO.equals(chrVar)) {
                ((nbe) ((nbe) f27578t.m17252c()).mo17276G(3534)).mo17271B("%sopen: invalid item type=%s data=%s", this.f27602r, chrVar, chqVar);
                return;
            }
            cvy cvyVar = this.f27583E;
            gyx gyxVar = gyx.MEDIA_STORE;
            dkhVar = new dkh((Context) cvyVar.f9845b, (djy) cvyVar.f9846c, chqVar, gyxVar);
        }
        m10209l(false, this.f27591g.mo3762f(dkhVar));
    }

    @Override // p000.hgo
    /* JADX INFO: renamed from: i */
    public final void mo10214i(hgp hgpVar) {
        synchronized (this.f27599o) {
            this.f27599o.remove(hgpVar);
        }
    }

    /* JADX INFO: renamed from: j */
    public final synchronized void m10215j(hgn hgnVar) {
        this.f27581C.add(hgnVar);
        ((hgk) this.f27587c.get()).mo10196a();
    }

    /* JADX INFO: renamed from: k */
    public final synchronized void m10216k(hgn hgnVar) {
        this.f27581C.remove(hgnVar);
        if (this.f27581C.isEmpty()) {
            ((hgk) this.f27587c.get()).mo10200i();
        }
    }

    @Override // p000.hze
    public final void onLayoutUpdated(hzj hzjVar, ilk ilkVar) {
        hgm hgmVar = this.f27588d;
        if (hgmVar.f27698i != hzjVar) {
            hgmVar.f27698i = hzjVar;
            hgmVar.m10250e();
        }
        hgmVar.f27697h = ilkVar;
        this.f27606w.mo10302e(ilkVar);
        this.f27588d.m10248c();
    }

    @Override // p000.hze
    public final /* synthetic */ void onLayoutUpdated(ilk ilkVar) {
    }
}
