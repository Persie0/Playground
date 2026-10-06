package p000;

import android.content.Context;
import android.view.View;
import com.google.android.apps.camera.bottombar.C0100R;
import com.google.p020vr.vrcore.controller.api.DJK.rmwTRjObXLGH;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hjb implements hjg, gfg {

    /* JADX INFO: renamed from: h */
    private static final nbh f27983h = nbh.m17259h("com/google/android/apps/camera/speechenhancer/ui/SpeechEnhancerFaceDrivenTooltipController");

    /* JADX INFO: renamed from: a */
    public final Context f27984a;

    /* JADX INFO: renamed from: b */
    public final jvd f27985b;

    /* JADX INFO: renamed from: c */
    public final elx f27986c;

    /* JADX INFO: renamed from: d */
    public final gfa f27987d;

    /* JADX INFO: renamed from: e */
    public boolean f27988e = false;

    /* JADX INFO: renamed from: f */
    public boolean f27989f = false;

    /* JADX INFO: renamed from: g */
    public kba f27990g;

    /* JADX INFO: renamed from: i */
    private final jwn f27991i;

    /* JADX INFO: renamed from: j */
    private final jww f27992j;

    /* JADX INFO: renamed from: k */
    private final hah f27993k;

    /* JADX INFO: renamed from: l */
    private final hai f27994l;

    /* JADX INFO: renamed from: m */
    private final cry f27995m;

    /* JADX INFO: renamed from: n */
    private final hjd f27996n;

    /* JADX INFO: renamed from: o */
    private kba f27997o;

    public hjb(Context context, jvd jvdVar, elx elxVar, gfa gfaVar, hah hahVar, hai haiVar, jwn jwnVar, jww jwwVar, cry cryVar, hjd hjdVar) {
        this.f27984a = context;
        this.f27985b = jvdVar;
        this.f27986c = elxVar;
        this.f27987d = gfaVar;
        this.f27993k = hahVar;
        this.f27994l = haiVar;
        this.f27991i = jwnVar;
        this.f27992j = jwwVar;
        this.f27995m = cryVar;
        this.f27996n = hjdVar;
    }

    @Override // p000.gfg
    /* JADX INFO: renamed from: a */
    public final void mo5759a() {
        kba kbaVar = this.f27997o;
        if (kbaVar != null) {
            kbaVar.close();
            this.f27997o = null;
        }
    }

    @Override // p000.gfg
    /* JADX INFO: renamed from: b */
    public final /* synthetic */ void mo5760b() {
    }

    @Override // p000.gfg
    /* JADX INFO: renamed from: c */
    public final void mo5761c() {
        if (kmq.BACK.equals(((jwf) this.f27991i).f34942d) && this.f27987d.mo9102A(gev.COCKTAIL_PARTY_BACK) && this.f27987d.mo9108G() && !((Boolean) this.f27993k.mo10031c(gzy.f26998J)).booleanValue() && !this.f27989f && ((Boolean) this.f27992j.mo3831be()).booleanValue() && this.f27996n.mo5777m(this.f27987d) && ((gzo) this.f27995m.mo3831be()).equals(gzo.OFF)) {
            mrm mrmVarMo9118d = this.f27987d.mo9118d(gev.COCKTAIL_PARTY_BACK, gfc.COCKTAIL_PARTY_ON);
            if (!mrmVarMo9118d.mo16813g()) {
                ((nbe) ((nbe) f27983h.m17252c()).mo17276G((char) 3667)).mo17290o(rmwTRjObXLGH.STiGFoyC);
                return;
            }
            igt igtVar = new igt(this.f27984a.getString(C0100R.string.reduce_noise_when_talk_tooltip));
            igtVar.m11313q((View) mrmVarMo9118d.mo16809c());
            igtVar.mo11305i();
            igtVar.mo11307k();
            igtVar.mo11303g(new hfr(this, 17), this.f27985b);
            igtVar.f30869d = 300;
            igtVar.mo11308l();
            igtVar.f30870e = 5000;
            igtVar.f30871f = false;
            igtVar.f30873h = false;
            igtVar.mo11312p();
            igtVar.f30874i = this.f27986c;
            igtVar.f30878m = 4;
            this.f27997o = igtVar.mo11297a();
        }
    }

    @Override // p000.gfg
    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void mo5762d() {
    }

    @Override // p000.hjg
    /* JADX INFO: renamed from: e */
    public final void mo10365e() {
        this.f27994l.mo10033e(gzy.f26998J, true);
    }

    @Override // p000.hjg
    /* JADX INFO: renamed from: f */
    public final void mo10366f() {
        this.f27985b.execute(new hfr(this, 16));
    }

    @Override // p000.hjg
    /* JADX INFO: renamed from: g */
    public final void mo10367g() {
        this.f27987d.mo9121g(this);
    }

    @Override // p000.hjg
    /* JADX INFO: renamed from: h */
    public final void mo10368h() {
        this.f27987d.mo9128n(this);
        kba kbaVar = this.f27990g;
        if (kbaVar != null) {
            kbaVar.close();
            this.f27990g = null;
        }
    }

    @Override // p000.hjg
    /* JADX INFO: renamed from: i */
    public final boolean mo10369i() {
        return m10370j();
    }

    /* JADX INFO: renamed from: j */
    public final boolean m10370j() {
        return kmq.BACK.equals(((jwf) this.f27991i).f34942d) && !this.f27987d.mo9108G() && !((Boolean) this.f27993k.mo10031c(gzy.f26998J)).booleanValue() && !this.f27988e && ((Boolean) this.f27992j.mo3831be()).booleanValue() && ((gzo) this.f27995m.mo3831be()).equals(gzo.OFF);
    }

    @Override // p000.hjg
    /* JADX INFO: renamed from: k */
    public final int mo10371k() {
        return 2;
    }
}
