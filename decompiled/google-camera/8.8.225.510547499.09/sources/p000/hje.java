package p000;

import android.content.Context;
import android.view.View;
import com.google.android.apps.camera.app.silentfeedback.p004ip.TVkaNXnfP;
import com.google.android.apps.camera.bottombar.C0100R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hje implements hjg, gfg {

    /* JADX INFO: renamed from: h */
    private static final nbh f28019h = nbh.m17259h(TVkaNXnfP.sssmTAPtbmUbMJu);

    /* JADX INFO: renamed from: a */
    public final Context f28020a;

    /* JADX INFO: renamed from: b */
    public final gfa f28021b;

    /* JADX INFO: renamed from: c */
    public final jvd f28022c;

    /* JADX INFO: renamed from: d */
    public final elx f28023d;

    /* JADX INFO: renamed from: e */
    public boolean f28024e = false;

    /* JADX INFO: renamed from: f */
    public boolean f28025f = false;

    /* JADX INFO: renamed from: g */
    public kba f28026g;

    /* JADX INFO: renamed from: i */
    private final hah f28027i;

    /* JADX INFO: renamed from: j */
    private final hai f28028j;

    /* JADX INFO: renamed from: k */
    private final jwn f28029k;

    /* JADX INFO: renamed from: l */
    private kba f28030l;

    /* JADX INFO: renamed from: m */
    private kba f28031m;

    public hje(Context context, gfa gfaVar, jvd jvdVar, elx elxVar, hah hahVar, hai haiVar, jwn jwnVar) {
        this.f28020a = context;
        this.f28021b = gfaVar;
        this.f28022c = jvdVar;
        this.f28023d = elxVar;
        this.f28027i = hahVar;
        this.f28028j = haiVar;
        this.f28029k = jwnVar;
    }

    /* JADX INFO: renamed from: l */
    private final boolean m10373l() {
        return ((Boolean) this.f28027i.mo10031c(gzy.f26997I)).booleanValue() || this.f28024e;
    }

    @Override // p000.gfg
    /* JADX INFO: renamed from: a */
    public final void mo5759a() {
        kba kbaVar = this.f28031m;
        if (kbaVar != null) {
            kbaVar.close();
            this.f28031m = null;
        }
    }

    @Override // p000.gfg
    /* JADX INFO: renamed from: b */
    public final /* synthetic */ void mo5760b() {
    }

    @Override // p000.gfg
    /* JADX INFO: renamed from: c */
    public final void mo5761c() {
        if (kmq.f36557a.equals(((jwf) this.f28029k).f34942d) && this.f28021b.mo9102A(gev.COCKTAIL_PARTY_FRONT) && this.f28021b.mo9108G() && !((Boolean) this.f28027i.mo10031c(gzy.f26997I)).booleanValue() && !this.f28025f) {
            mrm mrmVarMo9118d = this.f28021b.mo9118d(gev.COCKTAIL_PARTY_FRONT, gfc.COCKTAIL_PARTY_ON);
            if (!mrmVarMo9118d.mo16813g()) {
                ((nbe) ((nbe) f28019h.m17252c()).mo17276G((char) 3672)).mo17290o("Anchor view is absent!");
                return;
            }
            igt igtVar = new igt(this.f28020a.getString(C0100R.string.reduce_noise_when_talk_tooltip));
            igtVar.m11313q((View) mrmVarMo9118d.mo16809c());
            igtVar.mo11305i();
            igtVar.mo11307k();
            igtVar.mo11303g(new hfr(this, 18), this.f28022c);
            igtVar.f30869d = 300;
            igtVar.mo11308l();
            igtVar.f30870e = 5000;
            igtVar.f30871f = false;
            igtVar.f30873h = false;
            igtVar.f30874i = this.f28023d;
            igtVar.f30878m = 4;
            this.f28031m = igtVar.mo11297a();
        }
    }

    @Override // p000.gfg
    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void mo5762d() {
    }

    @Override // p000.hjg
    /* JADX INFO: renamed from: e */
    public final void mo10365e() {
        this.f28028j.mo10033e(gzy.f26997I, true);
    }

    @Override // p000.hjg
    /* JADX INFO: renamed from: f */
    public final void mo10366f() {
    }

    @Override // p000.hjg
    /* JADX INFO: renamed from: g */
    public final void mo10367g() {
        this.f28021b.mo9121g(this);
        if (m10373l()) {
            return;
        }
        this.f28030l = this.f28029k.mo3830a(new hmv(this, 1), this.f28022c);
    }

    @Override // p000.hjg
    /* JADX INFO: renamed from: h */
    public final void mo10368h() {
        this.f28021b.mo9128n(this);
        kba kbaVar = this.f28030l;
        if (kbaVar != null) {
            kbaVar.close();
            this.f28030l = null;
        }
        kba kbaVar2 = this.f28026g;
        if (kbaVar2 != null) {
            kbaVar2.close();
            this.f28026g = null;
        }
    }

    @Override // p000.hjg
    /* JADX INFO: renamed from: i */
    public final boolean mo10369i() {
        return false;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m10374j() {
        return (!kmq.f36557a.equals(((jwf) this.f28029k).f34942d) || this.f28021b.mo9108G() || m10373l()) ? false : true;
    }

    @Override // p000.hjg
    /* JADX INFO: renamed from: k */
    public final int mo10371k() {
        return 1;
    }
}
