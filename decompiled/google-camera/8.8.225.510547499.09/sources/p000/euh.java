package p000;

import android.content.res.Resources;
import android.os.Looper;
import androidx.wear.ambient.AmbientModeSupport;
import com.google.android.apps.camera.bottombar.C0100R;
import com.google.android.apps.camera.p014ui.zoomlock.ZoomLockView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class euh implements fmh {

    /* JADX INFO: renamed from: a */
    public final ohb f20103a;

    /* JADX INFO: renamed from: d */
    private final ffr f20106d;

    /* JADX INFO: renamed from: e */
    private final ohb f20107e;

    /* JADX INFO: renamed from: f */
    private final htf f20108f;

    /* JADX INFO: renamed from: g */
    private final String f20109g;

    /* JADX INFO: renamed from: h */
    private final jwf f20110h;

    /* JADX INFO: renamed from: c */
    public boolean f20105c = true;

    /* JADX INFO: renamed from: b */
    public final jws f20104b = new jws(new dfg(this, 2));

    public euh(ffr ffrVar, ohb ohbVar, ohb ohbVar2, htf htfVar, Resources resources, jwf jwfVar) {
        this.f20106d = ffrVar;
        this.f20103a = ohbVar;
        this.f20107e = ohbVar2;
        this.f20108f = htfVar;
        this.f20110h = jwfVar;
        this.f20109g = resources.getString(C0100R.string.longshot_accessibility_peek);
    }

    /* JADX WARN: Type inference failed for: r4v6, types: [elw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v3, types: [elx, java.lang.Object] */
    @Override // p000.eos
    /* JADX INFO: renamed from: a */
    public final synchronized nps mo7604a(int i) {
        this.f20105c = false;
        this.f20104b.m13643c();
        this.f20110h.mo3415bf(true);
        ffl fflVar = (ffl) this.f20107e.get();
        jvb jvbVar = fflVar.f21667m;
        ljf ljfVar = fflVar.f21677w;
        jvbVar.m13537d(!((jwl) ljfVar.f38374f).m13630f() ? ljfVar.f38375g.mo7482d(ljfVar.f38369a) : cgw.f5704q);
        fflVar.f21670p = true;
        fflVar.f21671q = false;
        if (fflVar.f21672r) {
            ikt iktVar = fflVar.f21676v;
            ZoomLockView zoomLockView = iktVar.f31374a;
            AmbientModeSupport.AmbientController ambientController = new AmbientModeSupport.AmbientController(iktVar);
            if (zoomLockView.f7311i == null) {
                zoomLockView.f7311i = ambientController;
            }
            if (zoomLockView.getVisibility() == 8) {
                zoomLockView.f7306d.start();
            }
        }
        this.f20106d.mo8359c();
        euf eufVar = (euf) this.f20103a.get();
        eufVar.f19966aa.mo3415bf(true);
        iuj iujVar = eufVar.f20004k;
        if (iujVar != null) {
            iujVar.mo11766q(true);
            eufVar.f20004k.mo11763n();
        }
        dox doxVar = eufVar.f20005l;
        if (doxVar != null) {
            doxVar.mo6469e();
        }
        if (eufVar.f20018y.mo16813g()) {
            ((cld) eufVar.f20018y.mo16809c()).mo3907k();
        }
        if (eufVar.f20017x.mo16813g()) {
            ((hnn) eufVar.f20017x.mo16809c()).mo10503l();
            ((hnn) eufVar.f20017x.mo16809c()).mo10497f();
        }
        eufVar.f19915B.mo3693g().mo3715e();
        eufVar.f19967ab.mo9122h();
        eufVar.f20013t.mo11013l(false);
        eufVar.f20006m.m10837d(false);
        eufVar.f19917D.m8581b();
        eufVar.f19973ah.mo7487i(ely.FIRST_RUN_TOAST);
        eufVar.f19977al.m9146d();
        euf eufVar2 = (euf) this.f20103a.get();
        if (eufVar2.f19923J != null) {
            eufVar2.f19925L.m10431f();
            eufVar2.m7896F(true);
        }
        ((euf) this.f20103a.get()).f19918E.m6560b();
        return kxk.m14965K(true);
    }

    @Override // p000.eos
    /* JADX INFO: renamed from: b */
    public final synchronized nps mo7605b(int i) {
        this.f20110h.mo3415bf(false);
        this.f20106d.mo8358b();
        ((ffl) this.f20107e.get()).m8352a();
        this.f20108f.mo10741i(this.f20109g);
        jvh.m13557e(Looper.getMainLooper()).post(new esc(this, 20));
        ((euf) this.f20103a.get()).f19918E.m6561c();
        return kxk.m14965K(true);
    }

    @Override // p000.fmh
    /* JADX INFO: renamed from: c */
    public final synchronized void mo7902c() {
        this.f20110h.mo3415bf(false);
        if (!this.f20105c) {
            mo7605b(4);
        }
    }
}
