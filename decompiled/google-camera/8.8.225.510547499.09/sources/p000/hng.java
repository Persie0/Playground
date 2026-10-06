package p000;

import android.R;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.google.android.apps.camera.bottombar.C0100R;
import com.google.android.apps.camera.focusindicator.FocusIndicatorAccessoryView;
import com.google.android.apps.camera.focusindicator.FocusIndicatorView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hng implements hnn, hrv {

    /* JADX INFO: renamed from: C */
    private final jww f28421C;

    /* JADX INFO: renamed from: D */
    private final elx f28422D;

    /* JADX INFO: renamed from: E */
    private final gfa f28423E;

    /* JADX INFO: renamed from: F */
    private final jvd f28424F;

    /* JADX INFO: renamed from: G */
    private final dbr f28425G;

    /* JADX INFO: renamed from: I */
    private Context f28427I;

    /* JADX INFO: renamed from: J */
    private FocusIndicatorAccessoryView f28428J;

    /* JADX INFO: renamed from: K */
    private idb f28429K;

    /* JADX INFO: renamed from: L */
    private idb f28430L;

    /* JADX INFO: renamed from: N */
    private idb f28432N;

    /* JADX INFO: renamed from: a */
    public final jww f28434a;

    /* JADX INFO: renamed from: b */
    public final jww f28435b;

    /* JADX INFO: renamed from: c */
    public final jwn f28436c;

    /* JADX INFO: renamed from: d */
    public final jww f28437d;

    /* JADX INFO: renamed from: e */
    public final cgb f28438e;

    /* JADX INFO: renamed from: f */
    public final hnj f28439f;

    /* JADX INFO: renamed from: g */
    public final hnv f28440g;

    /* JADX INFO: renamed from: h */
    public final hnw f28441h;

    /* JADX INFO: renamed from: i */
    public final fcp f28442i;

    /* JADX INFO: renamed from: j */
    public final dhv f28443j;

    /* JADX INFO: renamed from: k */
    public final mrm f28444k;

    /* JADX INFO: renamed from: l */
    public final hai f28445l;

    /* JADX INFO: renamed from: m */
    public final hah f28446m;

    /* JADX INFO: renamed from: n */
    public FocusIndicatorView f28447n;

    /* JADX INFO: renamed from: o */
    public idb f28448o;

    /* JADX INFO: renamed from: z */
    public hnp f28459z;

    /* JADX INFO: renamed from: p */
    public hnp f28449p = null;

    /* JADX INFO: renamed from: q */
    public mrm f28450q = null;

    /* JADX INFO: renamed from: r */
    public boolean f28451r = false;

    /* JADX INFO: renamed from: s */
    public boolean f28452s = false;

    /* JADX INFO: renamed from: t */
    public int f28453t = 0;

    /* JADX INFO: renamed from: u */
    public int f28454u = 0;

    /* JADX INFO: renamed from: v */
    public boolean f28455v = false;

    /* JADX INFO: renamed from: w */
    public boolean f28456w = false;

    /* JADX INFO: renamed from: x */
    public boolean f28457x = false;

    /* JADX INFO: renamed from: y */
    public boolean f28458y = false;

    /* JADX INFO: renamed from: A */
    public int f28419A = 0;

    /* JADX INFO: renamed from: M */
    private int f28431M = 0;

    /* JADX INFO: renamed from: O */
    private final Object f28433O = new Object();

    /* JADX INFO: renamed from: B */
    public final mwn f28420B = mws.m17090e();

    /* JADX INFO: renamed from: H */
    private final Handler f28426H = jvh.m13557e(Looper.getMainLooper());

    public hng(jww jwwVar, jww jwwVar2, jww jwwVar3, jwn jwnVar, jww jwwVar4, cgb cgbVar, elx elxVar, hnj hnjVar, dbr dbrVar, hnw hnwVar, hnv hnvVar, fcp fcpVar, dhv dhvVar, mrm mrmVar, gfa gfaVar, hai haiVar, hah hahVar, jvd jvdVar) {
        this.f28434a = jwwVar;
        this.f28435b = jwwVar2;
        this.f28421C = jwwVar3;
        this.f28436c = jwnVar;
        this.f28437d = jwwVar4;
        this.f28438e = cgbVar;
        this.f28422D = elxVar;
        this.f28439f = hnjVar;
        this.f28440g = hnvVar;
        this.f28441h = hnwVar;
        this.f28442i = fcpVar;
        this.f28443j = dhvVar;
        this.f28444k = mrmVar;
        this.f28423E = gfaVar;
        this.f28445l = haiVar;
        this.f28446m = hahVar;
        this.f28424F = jvdVar;
        this.f28425G = dbrVar;
        this.f28459z = (hnp) jwwVar.mo3831be();
    }

    /* JADX INFO: renamed from: w */
    private final idb m10491w(int i, boolean z) {
        return jpd.m13426g(z, 3000, null, null, this.f28427I.getString(i), this.f28427I, false, 2, 12);
    }

    /* JADX INFO: renamed from: x */
    private final void m10492x(Runnable runnable) {
        if (jvd.m13540d()) {
            runnable.run();
        } else {
            this.f28426H.post(runnable);
        }
    }

    /* JADX INFO: renamed from: y */
    private final void m10493y(final mrm mrmVar, final hno hnoVar, final boolean z, final boolean z2) {
        m10492x(new Runnable() { // from class: hnf
            @Override // java.lang.Runnable
            public final void run() {
                hng hngVar = this.f28414a;
                boolean z3 = z;
                boolean z4 = z2;
                hno hnoVar2 = hnoVar;
                mrm mrmVar2 = mrmVar;
                if (hngVar.f28452s || hngVar.f28456w || hngVar.f28457x || hngVar.f28458y) {
                    return;
                }
                if (!((Boolean) ((jwf) hngVar.f28447n.f6694d).f34942d).booleanValue() || z3) {
                    hngVar.mo10500i();
                    if (!z4) {
                        hngVar.m10499h();
                    }
                    hno hnoVar3 = hno.INACTIVE;
                    hnp hnpVar = hnp.OFF;
                    switch (hnoVar2) {
                        case INACTIVE:
                            hngVar.m10496e();
                            return;
                        case ACTIVE:
                            if (((hnp) hngVar.f28434a.mo3831be()).equals(hnp.AUTO)) {
                                hngVar.f28454u++;
                            }
                            hnj hnjVar = hngVar.f28439f;
                            if (!hnjVar.f28485d) {
                                hnjVar.f28485d = true;
                                jfs jfsVar = hnjVar.f28487f;
                                jfsVar.getClass();
                                int iM13089Y = jfsVar.m13089Y("taxi_entered_smarts_chip");
                                if (iM13089Y < 9) {
                                    jfs jfsVar2 = hnjVar.f28487f;
                                    jfsVar2.getClass();
                                    jfsVar2.m13092ab("taxi_entered_smarts_chip", iM13089Y + 1);
                                    if (iM13089Y % 3 == 0 && ((Boolean) hnjVar.f28483b.mo3831be()).booleanValue()) {
                                        hnjVar.m10153d(hnjVar.f28484c);
                                    }
                                }
                            }
                            hngVar.m10507p((hnp) hngVar.f28434a.mo3831be());
                            hngVar.m10509r((hnp) hngVar.f28434a.mo3831be());
                            break;
                        case TRANSITION_TO_ACTIVE:
                            if (((hnp) hngVar.f28434a.mo3831be()).equals(hnp.AUTO) && hngVar.f28441h.mo10518e().m10520a(hngVar.f28440g)) {
                                hngVar.m10508q(hngVar.f28448o);
                                return;
                            } else {
                                if (((hnp) hngVar.f28434a.mo3831be()).equals(hnp.OFF)) {
                                    hngVar.m10511t();
                                    hngVar.m10495d(mrmVar2);
                                    hngVar.m10507p((hnp) hngVar.f28434a.mo3831be());
                                    return;
                                }
                                return;
                            }
                        case TELE_TAXI_INACTIVE:
                            hngVar.m10511t();
                            hngVar.m10495d(mrmVar2);
                            return;
                        case TELE_TAXI_ACTIVE:
                            break;
                        default:
                            return;
                    }
                    hngVar.m10511t();
                    hngVar.m10495d(mrmVar2);
                }
            }
        });
    }

    @Override // p000.hnn
    /* JADX INFO: renamed from: a */
    public final kba mo10494a(ikw ikwVar) {
        if (!this.f28425G.m5900i()) {
            return gog.f25851d;
        }
        jvb jvbVar = new jvb();
        this.f28429K = m10491w(C0100R.string.taxi_turned_on, true);
        this.f28430L = m10491w(C0100R.string.taxi_turned_off, true);
        this.f28448o = m10491w(C0100R.string.taxi_thermal_throttle_hint, false);
        this.f28438e.f5556a = true;
        mrm mrmVar = this.f28444k;
        if (mrmVar.mo16813g()) {
            ((hrx) mrmVar.mo16809c()).mo10670b(hrw.TAXI, this);
        }
        this.f28428J.setOnClickListener(new ggf(this, ikwVar, 5));
        jvbVar.m13537d(this.f28435b.mo3830a(new hmv(this, 3), this.f28424F));
        if (this.f28443j.mo6184l(dib.f11353cg)) {
            jvbVar.m13537d(this.f28434a.mo3830a(new hmv(this, 4), this.f28424F));
        }
        this.f28443j.mo6177e();
        jvbVar.m13537d(this.f28421C.mo3830a(new hmv(this, 5), this.f28424F));
        if (this.f28443j.mo6184l(dib.f11356cj)) {
            jvbVar.m13537d(this.f28437d.mo3830a(new hmv(this, 6), this.f28424F));
        }
        return new gto(this, jvbVar, 12);
    }

    @Override // p000.hrv
    /* JADX INFO: renamed from: b */
    public final void mo3448b() {
        if (this.f28456w) {
            this.f28456w = false;
            mo10504m(mqu.f41450a);
        }
    }

    @Override // p000.hrv
    /* JADX INFO: renamed from: c */
    public final void mo3449c(hrw hrwVar) {
        if (hrwVar.equals(hrw.QR_GLEAMING)) {
            this.f28456w = true;
            mo10497f();
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m10495d(mrm mrmVar) {
        if (this.f28447n != null) {
            mrm mrmVar2 = this.f28444k;
            if (mrmVar2.mo16813g() && !this.f28455v) {
                ((hrx) mrmVar2.mo16809c()).mo10674k(hrw.TAXI);
                ((hrx) this.f28444k.mo16809c()).mo10673j(hrw.TAXI);
                this.f28455v = true;
            }
            mrm mrmVarM16829i = mqu.f41450a;
            mrm mrmVar3 = this.f28450q;
            if (mrmVar3 == null || !mrmVar.equals(mrmVar3) || this.f28447n.f6698h.getVisibility() != 0) {
                mrmVarM16829i = mrm.m16829i(this.f28447n.mo4150h(mrmVar));
            }
            if (!this.f28443j.mo6184l(dib.f11356cj)) {
                if (mrmVarM16829i.mo16813g()) {
                    ((ilv) mrmVarM16829i.mo16809c()).mo11449a().mo2282d(new hmm(this, 6), this.f28424F);
                } else {
                    this.f28447n.m4142A();
                }
            }
            this.f28450q = mrmVar;
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m10496e() {
        FocusIndicatorView focusIndicatorView = this.f28447n;
        if (focusIndicatorView != null) {
            this.f28450q = null;
            focusIndicatorView.mo4151i().mo11449a().mo2282d(new hmm(this, 7), this.f28424F);
        }
    }

    @Override // p000.hnn
    /* JADX INFO: renamed from: f */
    public final void mo10497f() {
        m10492x(new hmm(this, 5));
        mo10500i();
    }

    /* JADX INFO: renamed from: g */
    public final void m10498g() {
        synchronized (this.f28433O) {
            idb idbVar = this.f28432N;
            if (idbVar != null) {
                this.f28422D.mo7485g(idbVar);
                this.f28432N = null;
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m10499h() {
        int i;
        int i2;
        if (!this.f28443j.mo6184l(dib.f11355ci) || (i = this.f28419A) == 0 || (i2 = this.f28431M) == 0) {
            return;
        }
        this.f28423E.mo9135v(false, i, i2, hng.class.getName());
        this.f28419A = 0;
    }

    @Override // p000.hnn
    /* JADX INFO: renamed from: i */
    public final void mo10500i() {
        this.f28439f.m10152c();
        m10498g();
    }

    @Override // p000.hnn
    /* JADX INFO: renamed from: j */
    public final void mo10501j() {
        this.f28453t++;
    }

    @Override // p000.hnn
    /* JADX INFO: renamed from: k */
    public final void mo10502k(View view, Context context) {
        this.f28427I = context;
        if (this.f28447n == null) {
            FocusIndicatorView focusIndicatorView = (FocusIndicatorView) view;
            this.f28447n = focusIndicatorView;
            this.f28428J = focusIndicatorView.f6698h;
        }
    }

    @Override // p000.hnn
    /* JADX INFO: renamed from: l */
    public final void mo10503l() {
        if (this.f28457x) {
            return;
        }
        this.f28457x = true;
        if (((hnp) this.f28434a.mo3831be()).equals(hnp.AUTO)) {
            this.f28449p = hnp.AUTO;
            this.f28434a.mo3415bf(((hno) this.f28435b.mo3831be()).equals(hno.ACTIVE) ? hnp.ON : hnp.OFF);
        }
    }

    @Override // p000.hnn
    /* JADX INFO: renamed from: m */
    public final void mo10504m(mrm mrmVar) {
        m10493y(mrmVar, (hno) this.f28435b.mo3831be(), ((Boolean) this.f28436c.mo3831be()).booleanValue(), ((Boolean) this.f28436c.mo3831be()).booleanValue());
    }

    @Override // p000.hnn
    /* JADX INFO: renamed from: n */
    public final void mo10505n(boolean z, mrm mrmVar) {
        boolean z2 = this.f28452s;
        this.f28452s = z;
        if (!z2 || z) {
            return;
        }
        m10512u(mrmVar, (hno) this.f28435b.mo3831be(), ((Boolean) this.f28436c.mo3831be()).booleanValue());
    }

    @Override // p000.hnn
    /* JADX INFO: renamed from: o */
    public final void mo10506o(boolean z) {
        this.f28458y = z;
    }

    /* JADX INFO: renamed from: p */
    public final void m10507p(hnp hnpVar) {
        if (hnpVar == hnp.ON) {
            m10508q(this.f28429K);
        } else if (hnpVar == hnp.OFF) {
            m10508q(this.f28430L);
        } else {
            m10498g();
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m10508q(idb idbVar) {
        synchronized (this.f28433O) {
            if (idbVar.equals(this.f28432N)) {
                return;
            }
            m10498g();
            this.f28432N = idbVar;
            this.f28422D.mo7482d(idbVar);
        }
    }

    /* JADX INFO: renamed from: r */
    public final synchronized void m10509r(hnp hnpVar) {
        int i;
        if (this.f28443j.mo6184l(dib.f11355ci)) {
            if (hnpVar.equals(hnp.ON)) {
                i = C0100R.drawable.ic_macro_focus_on;
            } else {
                i = hnpVar.equals(hnp.AUTO) ? C0100R.drawable.ic_macro_focus_auto : 0;
            }
            if (i != this.f28419A && i != 0) {
                m10499h();
                this.f28423E.mo9135v(true, i, C0100R.string.taxi_name, hng.class.getName());
                this.f28419A = i;
                this.f28431M = C0100R.string.taxi_name;
            }
        }
    }

    @Override // p000.hnn
    /* JADX INFO: renamed from: s */
    public final void mo10510s() {
        if (!this.f28457x || this.f28458y) {
            return;
        }
        hnp hnpVar = this.f28449p;
        if (hnpVar != null) {
            if (!hnpVar.equals(this.f28434a.mo3831be())) {
                this.f28434a.mo3415bf(this.f28449p);
            }
            this.f28449p = null;
        }
        this.f28457x = false;
    }

    /* JADX INFO: renamed from: t */
    public final void m10511t() {
        FocusIndicatorView focusIndicatorView = this.f28447n;
        boolean z = true;
        if (!((Boolean) this.f28436c.mo3831be()).booleanValue() && !((hno) this.f28435b.mo3831be()).equals(hno.TELE_TAXI_ACTIVE)) {
            z = false;
        }
        focusIndicatorView.m4163u(1.0f);
        if (z) {
            focusIndicatorView.f6699i.mo6818j(focusIndicatorView.getContext().getColor(C0100R.color.square_focus_ring_color));
            focusIndicatorView.f6695e.invalidate();
            FocusIndicatorAccessoryView focusIndicatorAccessoryView = focusIndicatorView.f6698h;
            focusIndicatorAccessoryView.setContentDescription(focusIndicatorAccessoryView.getResources().getString(C0100R.string.taxi_toggle_on_desc));
            focusIndicatorView.f6698h.setImageDrawable(focusIndicatorView.f6698h.getResources().getDrawable(C0100R.drawable.ic_macro_focus_on_new, null));
            return;
        }
        focusIndicatorView.f6699i.mo6818j(focusIndicatorView.getContext().getColor(R.color.white));
        focusIndicatorView.f6695e.invalidate();
        FocusIndicatorAccessoryView focusIndicatorAccessoryView2 = focusIndicatorView.f6698h;
        focusIndicatorAccessoryView2.setContentDescription(focusIndicatorAccessoryView2.getResources().getString(C0100R.string.taxi_toggle_off_desc));
        focusIndicatorView.f6698h.setImageDrawable(focusIndicatorView.f6698h.getResources().getDrawable(C0100R.drawable.ic_macro_focus_off_new, null));
    }

    /* JADX INFO: renamed from: u */
    public final void m10512u(mrm mrmVar, hno hnoVar, boolean z) {
        m10493y(mrmVar, hnoVar, z, false);
    }

    @Override // p000.hnn
    /* JADX INFO: renamed from: v */
    public final boolean mo10513v() {
        return this.f28458y;
    }
}
