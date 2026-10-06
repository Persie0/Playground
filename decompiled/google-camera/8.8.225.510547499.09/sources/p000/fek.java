package p000;

import com.google.android.apps.camera.bottombar.BottomBarController;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class fek extends fed {

    /* JADX INFO: renamed from: a */
    private final gfa f21520a;

    /* JADX INFO: renamed from: b */
    private final icf f21521b;

    /* JADX INFO: renamed from: c */
    private final BottomBarController f21522c;

    /* JADX INFO: renamed from: d */
    private final iuj f21523d;

    /* JADX INFO: renamed from: e */
    private final mrm f21524e;

    /* JADX INFO: renamed from: f */
    private boolean f21525f;

    /* JADX INFO: renamed from: h */
    public final igb f21526h;

    /* JADX INFO: renamed from: i */
    public final iey f21527i;

    /* JADX INFO: renamed from: j */
    public final ggm f21528j;

    /* JADX INFO: renamed from: k */
    public final eby f21529k;

    /* JADX INFO: renamed from: l */
    public final jwn f21530l;

    /* JADX INFO: renamed from: m */
    public final fds f21531m;

    public fek(igb igbVar, iey ieyVar, gfa gfaVar, icf icfVar, BottomBarController bottomBarController, ggm ggmVar, eby ebyVar, iuj iujVar, jwn jwnVar, fds fdsVar, mrm mrmVar) {
        this.f21526h = igbVar;
        this.f21527i = ieyVar;
        this.f21520a = gfaVar;
        this.f21521b = icfVar;
        this.f21522c = bottomBarController;
        this.f21528j = ggmVar;
        this.f21529k = ebyVar;
        this.f21523d = iujVar;
        this.f21530l = jwnVar;
        this.f21531m = fdsVar;
        this.f21524e = mrmVar;
    }

    /* JADX INFO: renamed from: k */
    public final void m8295k() {
        if (this.f21524e.mo16813g()) {
            ((hnn) this.f21524e.mo16809c()).mo10503l();
            ((hnn) this.f21524e.mo16809c()).mo10497f();
        }
        this.f21520a.mo9127m();
        this.f21521b.mo11013l(false);
        this.f21522c.setClickable(false);
        this.f21523d.mo11728I(false);
        if (this.f21525f) {
            return;
        }
        this.f21531m.m8283d();
        if (((Boolean) this.f21529k.f13316b.mo3831be()).booleanValue() || (((ikw) this.f21530l.mo3831be()).equals(ikw.LONG_EXPOSURE) && !this.f21529k.m7101l())) {
            this.f21531m.m8284e(178);
        }
        this.f21525f = true;
    }

    /* JADX INFO: renamed from: l */
    public final void m8296l() {
        this.f21520a.mo9126l();
        this.f21521b.mo11013l(true);
        this.f21522c.setClickable(true);
        this.f21523d.mo11728I(true);
        this.f21523d.mo11765p();
        this.f21525f = false;
    }

    /* JADX INFO: renamed from: m */
    public final void m8297m() {
        if (this.f21524e.mo16813g()) {
            ((hnn) this.f21524e.mo16809c()).mo10510s();
            ((hnn) this.f21524e.mo16809c()).mo10504m(mqu.f41450a);
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m8298n() {
        ikw ikwVar = ikw.UNINITIALIZED;
        switch (((ikw) this.f21530l.mo3831be()).ordinal()) {
            case 1:
                this.f21526h.mo11243o();
                break;
            case 6:
                this.f21526h.mo11244p();
                break;
            default:
                this.f21526h.mo11240l();
                break;
        }
    }
}
