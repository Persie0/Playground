package p000;

import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.ViewStub;
import android.widget.ImageButton;
import androidx.wear.ambient.AmbientMode;
import com.google.android.apps.camera.bottombar.C0100R;
import com.google.android.apps.camera.evcomp.AZCp.HRLmc;
import com.google.android.apps.camera.p014ui.views.ToggleUi;
import p021j$.time.Duration;
import p021j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ckw implements clc {

    /* JADX INFO: renamed from: a */
    static final Duration f6018a = Duration.ofSeconds(2);

    /* JADX INFO: renamed from: z */
    private static final nbh f6019z = nbh.m17259h("com/google/android/apps/camera/autonightsight/AutoNightSightToggleControllerImpl");

    /* JADX INFO: renamed from: A */
    private final jvd f6020A;

    /* JADX INFO: renamed from: B */
    private final elx f6021B;

    /* JADX INFO: renamed from: C */
    private final jww f6022C;

    /* JADX INFO: renamed from: D */
    private final jww f6023D;

    /* JADX INFO: renamed from: E */
    private final dhv f6024E;

    /* JADX INFO: renamed from: F */
    private final mrm f6025F;

    /* JADX INFO: renamed from: G */
    private final gfa f6026G;

    /* JADX INFO: renamed from: H */
    private final boolean f6027H;

    /* JADX INFO: renamed from: I */
    private final hsk f6028I;

    /* JADX INFO: renamed from: K */
    private Context f6030K;

    /* JADX INFO: renamed from: L */
    private ImageButton f6031L;

    /* JADX INFO: renamed from: M */
    private idb f6032M;

    /* JADX INFO: renamed from: N */
    private idb f6033N;

    /* JADX INFO: renamed from: O */
    private idb f6034O;

    /* JADX INFO: renamed from: P */
    private idb f6035P;

    /* JADX INFO: renamed from: Q */
    private idb f6036Q;

    /* JADX INFO: renamed from: R */
    private kba f6037R;

    /* JADX INFO: renamed from: S */
    private String f6038S;

    /* JADX INFO: renamed from: T */
    private String f6039T;

    /* JADX INFO: renamed from: b */
    public final eby f6043b;

    /* JADX INFO: renamed from: c */
    public final jww f6044c;

    /* JADX INFO: renamed from: f */
    public final fcp f6047f;

    /* JADX INFO: renamed from: g */
    public final jwn f6048g;

    /* JADX INFO: renamed from: h */
    public final jww f6049h;

    /* JADX INFO: renamed from: i */
    public final jww f6050i;

    /* JADX INFO: renamed from: j */
    public final hmw f6051j;

    /* JADX INFO: renamed from: k */
    public final ebv f6052k;

    /* JADX INFO: renamed from: m */
    public final jww f6054m;

    /* JADX INFO: renamed from: n */
    public final hxn f6055n;

    /* JADX INFO: renamed from: o */
    public final iuj f6056o;

    /* JADX INFO: renamed from: p */
    public ToggleUi f6057p;

    /* JADX INFO: renamed from: x */
    public AmbientMode.AmbientController f6065x;

    /* JADX INFO: renamed from: y */
    public final jfs f6066y;

    /* JADX INFO: renamed from: d */
    public final jww f6045d = new jwf(false);

    /* JADX INFO: renamed from: e */
    public final jww f6046e = new jwf(false);

    /* JADX INFO: renamed from: l */
    public final jwf f6053l = new jwf(Duration.ofSeconds(1));

    /* JADX INFO: renamed from: J */
    private final Runnable f6029J = new cei(this, 17);

    /* JADX INFO: renamed from: q */
    public boolean f6058q = false;

    /* JADX INFO: renamed from: r */
    public boolean f6059r = false;

    /* JADX INFO: renamed from: s */
    public ikw f6060s = ikw.UNINITIALIZED;

    /* JADX INFO: renamed from: U */
    private boolean f6040U = false;

    /* JADX INFO: renamed from: t */
    public jvb f6061t = new jvb();

    /* JADX INFO: renamed from: w */
    public int f6064w = 0;

    /* JADX INFO: renamed from: u */
    public boolean f6062u = false;

    /* JADX INFO: renamed from: V */
    private hzj f6041V = hzj.PHONE_LAYOUT;

    /* JADX INFO: renamed from: W */
    private ilk f6042W = ilk.PORTRAIT;

    /* JADX INFO: renamed from: v */
    public boolean f6063v = false;

    public ckw(jww jwwVar, eby ebyVar, jvd jvdVar, elx elxVar, jfs jfsVar, fcp fcpVar, jww jwwVar2, hai haiVar, jwn jwnVar, jww jwwVar3, dhv dhvVar, hmw hmwVar, mrm mrmVar, gfa gfaVar, ebv ebvVar, jww jwwVar4, hxn hxnVar, iuj iujVar, jfs jfsVar2, hsk hskVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f6043b = ebyVar;
        this.f6020A = jvdVar;
        this.f6044c = jwwVar;
        this.f6021B = elxVar;
        this.f6066y = jfsVar;
        this.f6047f = fcpVar;
        this.f6048g = jwnVar;
        this.f6049h = jwwVar2;
        this.f6050i = jwwVar3;
        this.f6022C = haiVar.mo10030b(gzy.f27060s);
        this.f6023D = haiVar.mo10030b(gzy.f27061t);
        this.f6024E = dhvVar;
        this.f6051j = hmwVar;
        this.f6025F = mrmVar;
        this.f6026G = gfaVar;
        this.f6052k = ebvVar;
        this.f6054m = jwwVar4;
        this.f6055n = hxnVar;
        this.f6056o = iujVar;
        this.f6027H = jfsVar2.m13077L();
        this.f6028I = hskVar;
    }

    /* JADX INFO: renamed from: C */
    public static boolean m3851C(gcy gcyVar, gzp gzpVar, boolean z) {
        return (gcyVar.f24252e == 3 || gzpVar != gzp.OFF || z) ? false : true;
    }

    /* JADX INFO: renamed from: H */
    public static final int m3852H(boolean z, cle cleVar, ikw ikwVar) {
        if (ikwVar != ikw.LONG_EXPOSURE && !z) {
            return 1;
        }
        cle cleVar2 = cle.AUTO;
        switch (cleVar.ordinal()) {
            case 1:
                return 3;
            default:
                return 2;
        }
    }

    /* JADX INFO: renamed from: I */
    private final void m3853I(boolean z, boolean z2) {
        if (this.f6055n.mo10825n()) {
            this.f6055n.mo10829r(m3852H(((Boolean) this.f6044c.mo3831be()).booleanValue(), (cle) this.f6054m.mo3831be(), this.f6060s), z, z2);
        } else {
            this.f6055n.mo10820i(true);
        }
    }

    /* JADX INFO: renamed from: J */
    private final void m3854J(boolean z, boolean z2) {
        m3872c();
        this.f6055n.mo10815d(z);
        if (z2) {
            ((ite) this.f6056o).f32054E.mo11675b();
        }
    }

    /* JADX INFO: renamed from: K */
    private final void m3855K() {
        itd itdVar = new itd(this, 1);
        ((ite) this.f6056o).f32104i.add(itdVar);
        this.f6061t.m13537d(new cic(this, itdVar, 2));
    }

    /* JADX INFO: renamed from: L */
    private final void m3856L(jwn jwnVar) {
        this.f6061t.m13537d(jwj.m13624c(jwnVar).mo3830a(new cbx(this, 19), this.f6020A));
    }

    /* JADX INFO: renamed from: M */
    private final void m3857M(ikw ikwVar) {
        if (ikwVar.equals(ikw.LONG_EXPOSURE)) {
            this.f6055n.mo10833w();
        } else {
            this.f6055n.mo10834x();
        }
        AmbientMode.AmbientController ambientController = new AmbientMode.AmbientController(this);
        this.f6065x = ambientController;
        this.f6055n.mo10835y(ambientController);
        this.f6061t.m13537d(new cft(this, 7));
    }

    /* JADX INFO: renamed from: N */
    private final void m3858N(ikw ikwVar) {
        this.f6061t.m13537d(jwr.m13632b(this.f6044c, this.f6054m).mo3830a(new cdb(this, ikwVar, 3), this.f6020A));
    }

    /* JADX INFO: renamed from: O */
    private final void m3859O() {
        this.f6031L.setOnClickListener(new ViewOnClickListenerC0250hu(this, 6));
    }

    /* JADX INFO: renamed from: P */
    private final synchronized void m3860P(boolean z) {
        this.f6026G.mo9135v(z, C0100R.drawable.gs_night_sight_auto_vd_theme_24, C0100R.string.flash_ns_desc, "AutoNightSightToggleControllerImpl");
    }

    /* JADX INFO: renamed from: R */
    private final void m3862R(boolean z, boolean z2) {
        Drawable drawableFindDrawableByLayerId;
        ToggleUi toggleUi = this.f6057p;
        float f = true != z2 ? 0.3f : 1.0f;
        toggleUi.f7283g = f;
        AnimatorSet animatorSet = toggleUi.f7282f;
        if (animatorSet != null && !animatorSet.isRunning() && toggleUi.getVisibility() == 0) {
            toggleUi.setAlpha(f);
        }
        if (z) {
            this.f6057p.m4486g(C0100R.string.catshark_toggle_on_desc);
            this.f6057p.m4484e(C0100R.drawable.toggle_on_background);
            Drawable drawable = this.f6057p.getResources().getDrawable(C0100R.drawable.gs_night_sight_auto_vd_theme_24, null);
            if (drawable != null) {
                drawable.mutate().setTint(jzn.m13837y(this.f6057p));
            }
            this.f6057p.m4485f(drawable);
        } else {
            this.f6057p.m4486g(C0100R.string.catshark_toggle_off_desc);
            LayerDrawable layerDrawable = (LayerDrawable) this.f6057p.getContext().getDrawable(C0100R.drawable.toggle_off_background);
            if (layerDrawable != null && (drawableFindDrawableByLayerId = layerDrawable.findDrawableByLayerId(C0100R.id.toggle_off_inner_circle)) != null) {
                drawableFindDrawableByLayerId.setTint(jzn.m13802E(this.f6057p));
            }
            this.f6057p.m4484e(C0100R.drawable.toggle_off_background);
            Drawable drawable2 = this.f6057p.getResources().getDrawable(C0100R.drawable.gs_night_sight_auto_off_vd_theme_24, null);
            if (drawable2 != null) {
                drawable2.mutate().setTint(jzn.m13801D(this.f6057p));
            }
            this.f6057p.m4485f(drawable2);
        }
        if (this.f6052k.f13306h) {
            this.f6057p.m4486g(C0100R.string.catshark_agency_button);
        }
    }

    /* JADX INFO: renamed from: S */
    private final boolean m3863S() {
        if (this.f6060s.equals(ikw.LONG_EXPOSURE)) {
            return !this.f6043b.m7100k();
        }
        return ((Boolean) this.f6043b.m7093d().mo3831be()).booleanValue();
    }

    /* JADX INFO: renamed from: A */
    public final synchronized void m3864A() {
        String str = (String) (this.f6040U ? ((jwf) this.f6023D).f34942d : ((jwf) this.f6022C).f34942d);
        boolean zBooleanValue = ((Boolean) ((jwf) this.f6045d).f34942d).booleanValue();
        if (str.equals("ns")) {
            zBooleanValue = true;
        } else if (str.equals("off")) {
            zBooleanValue = false;
        }
        if (((Boolean) ((jwf) this.f6045d).f34942d).booleanValue() != zBooleanValue) {
            this.f6045d.mo3415bf(Boolean.valueOf(zBooleanValue));
            m3869G(zBooleanValue, 3);
        }
    }

    /* JADX INFO: renamed from: B */
    public final boolean m3865B() {
        return this.f6040U ? ((String) ((jwf) this.f6023D).f34942d).equals("ns") : ((String) ((jwf) this.f6022C).f34942d).equals("ns");
    }

    @Override // p000.clc
    /* JADX INFO: renamed from: D */
    public final boolean mo3866D(Duration duration) {
        m3853I(false, false);
        boolean zMo10826o = this.f6055n.mo10826o();
        if (zMo10826o || duration.compareTo(f6018a) > 0) {
            m3877h(false, zMo10826o);
            this.f6055n.mo10820i(false);
            return true;
        }
        dhv dhvVar = this.f6024E;
        dhx dhxVar = dih.f11513a;
        dhvVar.mo6177e();
        mo3879j();
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001d  */
    /* JADX WARN: Code duplicated, block: B:13:0x0022 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:14:0x0024  */
    /* JADX WARN: Code duplicated, block: B:9:0x0019  */
    /* JADX INFO: renamed from: E */
    public final void m3867E(gzp gzpVar, boolean z, int i) {
        idb idbVar;
        ilk ilkVar = ilk.PORTRAIT;
        ikw ikwVar = ikw.UNINITIALIZED;
        switch (i - 1) {
            case 0:
                if (gzpVar == gzp.OFF) {
                    if (gzpVar != gzp.OFF) {
                        idbVar = this.f6032M;
                    } else if (z) {
                        idbVar = this.f6033N;
                    }
                    this.f6034O = idbVar;
                } else {
                    this.f6034O = this.f6032M;
                }
                break;
            default:
                if (!z) {
                    if (gzpVar != gzp.OFF) {
                        idbVar = this.f6032M;
                    } else if (z) {
                        idbVar = this.f6033N;
                    }
                    this.f6034O = idbVar;
                } else {
                    this.f6034O = this.f6033N;
                }
                break;
        }
        boolean z2 = false;
        if (this.f6058q && ((Boolean) this.f6043b.m7093d().mo3831be()).booleanValue()) {
            z2 = true;
        }
        m3886q(z2);
    }

    @Override // p000.clc
    /* JADX INFO: renamed from: F */
    public final void mo3868F(fvu fvuVar) {
        this.f6040U = fvuVar.mo14558k() == kmq.f36557a;
        m3864A();
    }

    /* JADX INFO: renamed from: G */
    public final void m3869G(boolean z, int i) {
        fcp fcpVar = this.f6047f;
        if (fcpVar != null) {
            fcpVar.mo8159ad(z, ((Float) this.f6048g.mo3831be()).floatValue(), this.f6060s, i);
        }
    }

    @Override // p000.clc
    /* JADX INFO: renamed from: a */
    public final kba mo3870a(ikw ikwVar, gcx gcxVar, jwn jwnVar) {
        if (!this.f6061t.mo8995b()) {
            this.f6061t.close();
        }
        this.f6061t = new jvb();
        this.f6060s = ikwVar;
        ilk ilkVar = ilk.PORTRAIT;
        ikw ikwVar2 = ikw.UNINITIALIZED;
        int i = 1;
        switch (ikwVar.ordinal()) {
            case 1:
            case 6:
                m3859O();
                this.f6061t.m13537d(gcxVar.mo3830a(new cbx(this, 20), this.f6020A));
                int i2 = 2;
                this.f6061t.m13537d(this.f6049h.mo3830a(new cdb(this, gcxVar, i2), this.f6020A));
                this.f6061t.m13537d(this.f6051j.m10476a().mo3830a(new cdb(this, gcxVar, 4), this.f6020A));
                this.f6061t.m13537d(jwr.m13632b(this.f6023D, this.f6022C).mo3830a(new cbx(this, 17), this.f6020A));
                this.f6061t.m13537d(jwr.m13632b(this.f6046e, this.f6045d).mo3830a(new cbx(this, 16), this.f6020A));
                this.f6061t.m13537d(this.f6043b.m7093d().mo3830a(new ckv(this, i2), this.f6020A));
                this.f6061t.m13537d(this.f6043b.f13316b.mo3830a(new cbx(this, 18), this.f6020A));
                this.f6061t.m13537d(this.f6050i.mo3830a(new ckv(this, 0), this.f6020A));
                this.f6061t.m13537d(this.f6045d.mo3830a(new ckv(this, i), this.f6020A));
                if (this.f6052k.f13306h) {
                    m3856L(jwnVar);
                    m3858N(ikwVar);
                    m3857M(ikwVar);
                    m3855K();
                }
                break;
            case 12:
                if (this.f6052k.f13306h) {
                    this.f6045d.mo3415bf(true);
                    this.f6046e.mo3415bf(true);
                    m3856L(jwnVar);
                    m3859O();
                    m3858N(ikwVar);
                    m3857M(ikwVar);
                    m3855K();
                    m3884o(true, true);
                    m3895z(((Boolean) ((jwf) this.f6046e).f34942d).booleanValue(), ((Boolean) ((jwf) this.f6045d).f34942d).booleanValue());
                }
                break;
            default:
                throw new IllegalStateException("Not supported for mode ".concat(String.valueOf(String.valueOf(ikwVar))));
        }
        this.f6061t.m13537d(new cft(this, 5));
        return new cft(this, 6);
    }

    @Override // p000.clc
    /* JADX INFO: renamed from: b */
    public final void mo3871b(boolean z) {
        m3853I(z, false);
    }

    /* JADX INFO: renamed from: c */
    public final void m3872c() {
        if (!this.f6052k.f13307i.isPresent() || this.f6027H) {
            return;
        }
        this.f6057p.removeCallbacks(this.f6029J);
    }

    /* JADX INFO: renamed from: e */
    public final void m3874e() {
        m3854J(true, true);
        if (m3863S()) {
            m3884o(true, true);
        } else {
            m3884o(false, true);
        }
    }

    @Override // p000.clc
    /* JADX INFO: renamed from: f */
    public final void mo3875f() {
        this.f6031L.setEnabled(false);
    }

    @Override // p000.clc
    /* JADX INFO: renamed from: g */
    public final void mo3876g() {
        if (this.f6052k.f13306h) {
            this.f6062u = false;
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m3877h(boolean z, boolean z2) {
        m3884o(false, true);
        m3872c();
        this.f6055n.mo10832v(z2);
        ((ite) this.f6056o).f32054E.mo11683m();
        if (this.f6028I != null && this.f6041V == hzj.STARFISH_LAYOUT && this.f6042W != ilk.PORTRAIT) {
            this.f6028I.m10697b(true);
        }
        if (z) {
            m3888s();
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m3878i(boolean z, boolean z2) {
        m3884o(false, z);
        m3854J(z, z2);
    }

    @Override // p000.clc
    /* JADX INFO: renamed from: j */
    public final void mo3879j() {
        m3878i(true, true);
    }

    /* JADX INFO: renamed from: k */
    public final void m3880k() {
        kba kbaVar = this.f6037R;
        if (kbaVar != null) {
            kbaVar.close();
        }
    }

    @Override // p000.clc
    /* JADX INFO: renamed from: l */
    public final void mo3881l(ViewStub viewStub, Context context) {
        this.f6030K = context;
        if (this.f6057p == null) {
            this.f6057p = (ToggleUi) viewStub.inflate();
        }
        this.f6031L = this.f6057p.f7279c;
        this.f6032M = jpd.m13426g(false, 3000, null, null, context.getResources().getString(C0100R.string.catshark_timer_disabled_chip), context, false, -1, 8);
        if (this.f6025F.mo16813g()) {
            this.f6033N = jpd.m13426g(false, 3000, null, null, context.getResources().getString(((hmt) this.f6025F.mo16809c()).m10471a()), context, false, -1, 8);
        }
        this.f6036Q = jpd.m13426g(true, 3000, null, null, context.getResources().getString(C0100R.string.catshark_on_chip), context, false, -1, 2);
        Resources resources = context.getResources();
        boolean z = this.f6052k.f13306h;
        int i = C0100R.string.catshark_toggle_education_agency;
        this.f6038S = resources.getString(true != z ? C0100R.string.catshark_toggle_education_1 : C0100R.string.catshark_toggle_education_agency);
        Resources resources2 = context.getResources();
        if (true != this.f6052k.f13306h) {
            i = C0100R.string.catshark_toggle_education_3;
        }
        this.f6039T = resources2.getString(i);
        m3884o(false, false);
    }

    @Override // p000.clc
    /* JADX INFO: renamed from: m */
    public final void mo3882m() {
        m3895z(((Boolean) ((jwf) this.f6046e).f34942d).booleanValue(), ((Boolean) ((jwf) this.f6045d).f34942d).booleanValue());
    }

    @Override // p000.clc
    /* JADX INFO: renamed from: n */
    public final void mo3883n() {
        m3874e();
    }

    /* JADX INFO: renamed from: o */
    public final void m3884o(boolean z, boolean z2) {
        ToggleUi toggleUi = this.f6057p;
        if (toggleUi == null) {
            return;
        }
        if (!z2) {
            toggleUi.m4481b();
            toggleUi.setAlpha(z ? toggleUi.f7283g : 0.0f);
            toggleUi.setVisibility(true != z ? 4 : 0);
            return;
        }
        if (z) {
            if (toggleUi.getVisibility() == 0) {
                return;
            }
            toggleUi.m4481b();
            toggleUi.m4483d();
            toggleUi.f7279c.f7286a = true;
            AnimatorSet animatorSet = toggleUi.f7282f;
            animatorSet.getClass();
            animatorSet.start();
            return;
        }
        if (toggleUi.getVisibility() != 8) {
            toggleUi.m4481b();
            toggleUi.m4483d();
            toggleUi.f7279c.f7286a = true;
            AnimatorSet animatorSet2 = toggleUi.f7282f;
            animatorSet2.getClass();
            animatorSet2.reverse();
        }
    }

    @Override // p000.hze
    public final void onLayoutUpdated(hzj hzjVar, ilk ilkVar) {
        this.f6041V = hzjVar;
        this.f6042W = ilkVar;
        ToggleUi toggleUi = this.f6057p;
        if (toggleUi != null) {
            toggleUi.m4480a(ilkVar);
        }
    }

    @Override // p000.hze
    public final /* synthetic */ void onLayoutUpdated(ilk ilkVar) {
    }

    /* JADX INFO: renamed from: p */
    public final synchronized void m3885p(boolean z) {
        if (this.f6024E.mo6184l(did.f11432ak)) {
            m3860P(z);
        } else {
            m3861Q(z);
        }
    }

    /* JADX INFO: renamed from: q */
    public final synchronized void m3886q(boolean z) {
        if (this.f6034O == null) {
            return;
        }
        idb idbVar = this.f6035P;
        if (idbVar != null) {
            this.f6021B.mo7485g(idbVar);
        }
        if (z && !this.f6063v) {
            this.f6058q = false;
            idb idbVar2 = this.f6034O;
            this.f6035P = idbVar2;
            this.f6021B.mo7482d(idbVar2);
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m3887r() {
        boolean z = this.f6052k.f13306h;
        int iM13088X = this.f6066y.m13088X(true != z ? "catshark_toggle_tooltip" : "catshark_agency_tooltip");
        if (this.f6059r) {
            return;
        }
        int i = 3;
        if (iM13088X > 3) {
            return;
        }
        m3880k();
        String str = this.f6038S;
        if (iM13088X > 0 && ((Boolean) ((jwf) this.f6046e).f34942d).booleanValue() && !((Boolean) ((jwf) this.f6045d).f34942d).booleanValue()) {
            str = this.f6039T;
        }
        igt igtVar = new igt(str);
        ilk ilkVar = ilk.PORTRAIT;
        ikw ikwVar = ikw.UNINITIALIZED;
        ilk ilkVar2 = this.f6057p.f7278b;
        if (ilkVar2 == null) {
            ilkVar2 = ilk.PORTRAIT;
        }
        switch (ilkVar2.ordinal()) {
            case 1:
                igtVar.m11314r(this.f6057p.f7281e);
                igtVar.f30867b = 3;
                break;
            case 2:
                igtVar.m11313q(this.f6057p.f7281e);
                igtVar.f30867b = 1;
                break;
            default:
                igtVar.m11313q(this.f6057p.f7281e);
                igtVar.mo11305i();
                break;
        }
        igtVar.mo11307k();
        igtVar.f30869d = 300;
        igtVar.f30870e = 6000;
        igtVar.f30868c = false;
        igtVar.mo11300d(new fff(this, 1));
        igtVar.mo11303g(new bnp(this, z, i), this.f6020A);
        igtVar.mo11308l();
        igtVar.f30872g = true;
        igtVar.f30874i = this.f6021B;
        igtVar.f30878m = 4;
        igtVar.f30875j = Optional.m12505of(Integer.valueOf(this.f6030K.getResources().getDimensionPixelSize(C0100R.dimen.ans_tooltip_margin)));
        igtVar.f30871f = false;
        this.f6037R = igtVar.mo11297a();
    }

    /* JADX INFO: renamed from: s */
    public final void m3888s() {
        if (!this.f6052k.f13307i.isPresent() || this.f6027H) {
            return;
        }
        this.f6057p.postDelayed(this.f6029J, ((Integer) this.f6052k.f13307i.get()).intValue());
    }

    @Override // p000.clc
    /* JADX INFO: renamed from: t */
    public final synchronized void mo3889t() {
        this.f6063v = true;
        mo3879j();
        m3885p(false);
        m3880k();
    }

    @Override // p000.clc
    /* JADX INFO: renamed from: u */
    public final void mo3890u() {
        if (this.f6052k.f13306h) {
            this.f6062u = true;
        }
        m3878i(true, false);
    }

    @Override // p000.clc
    /* JADX INFO: renamed from: v */
    public final synchronized void mo3891v() {
        this.f6063v = false;
        if (((Boolean) this.f6043b.m7093d().mo3831be()).booleanValue()) {
            m3874e();
            m3885p(((Boolean) this.f6043b.f13316b.mo3831be()).booleanValue());
            m3887r();
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m3892w(Duration duration) {
        float millis;
        if (this.f6057p != null) {
            if (this.f6060s.equals(ikw.LONG_EXPOSURE) || ((Boolean) this.f6044c.mo3831be()).booleanValue()) {
                if (duration.isNegative() || duration.isZero()) {
                    ((nbe) ((nbe) f6019z.m17252c()).mo17276G(226)).mo17292q(HRLmc.NHiem, duration.toMillis());
                    millis = 1.0f;
                } else {
                    millis = duration.toMillis() / 1000.0f;
                }
                String string = this.f6057p.getResources().getString(C0100R.string.time_remaining, Integer.valueOf((int) Math.ceil(millis)));
                ToggleUi toggleUi = this.f6057p;
                if (!toggleUi.f7280d.getText().toString().equals(string)) {
                    toggleUi.f7280d.setText(string);
                }
                this.f6055n.mo10823l(duration, string);
            }
        }
    }

    @Override // p000.clc
    /* JADX INFO: renamed from: x */
    public final void mo3893x(Duration duration, int i) {
        if (this.f6055n.mo10826o()) {
            if (i == 0) {
                this.f6055n.mo10814c(duration);
                return;
            }
            if (i != 100) {
                if (!this.f6055n.mo10825n()) {
                    this.f6055n.mo10821j();
                    return;
                } else if (i != 100) {
                    return;
                }
            }
            if (this.f6055n.mo10825n()) {
                m3853I(true, true);
            }
        }
    }

    /* JADX INFO: renamed from: y */
    public final synchronized void m3894y() {
        if (this.f6040U ? ((String) ((jwf) this.f6023D).f34942d).equals("on") : ((String) ((jwf) this.f6022C).f34942d).equals("on")) {
            return;
        }
        boolean zBooleanValue = ((Boolean) ((jwf) this.f6045d).f34942d).booleanValue();
        if (m3865B() == zBooleanValue) {
            return;
        }
        if (zBooleanValue) {
            if (this.f6040U) {
                this.f6023D.mo3415bf("ns");
                return;
            } else {
                this.f6022C.mo3415bf("ns");
                return;
            }
        }
        if (this.f6040U) {
            this.f6023D.mo3415bf("off");
        } else {
            this.f6022C.mo3415bf("off");
        }
    }

    /* JADX INFO: renamed from: Q */
    private final synchronized void m3861Q(boolean z) {
        if (z) {
            if (!this.f6063v) {
                this.f6021B.mo7482d(this.f6036Q);
                return;
            }
        }
        this.f6021B.mo7485g(this.f6036Q);
    }

    @Override // p000.clc
    /* JADX INFO: renamed from: d */
    public final void mo3873d() {
        if (!this.f6052k.f13306h) {
            if (m3863S()) {
                m3884o(true, true);
                return;
            } else {
                m3884o(false, true);
                return;
            }
        }
        this.f6062u = false;
        int i = this.f6064w;
        if (i == 0 || !(i == 7 || i == 1)) {
            m3874e();
        } else if (m3863S()) {
            m3877h(true, true);
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m3895z(boolean z, boolean z2) {
        if (!z) {
            this.f6031L.setEnabled(false);
            m3862R(false, false);
            this.f6057p.m4482c();
            this.f6055n.mo10822k(Duration.ZERO);
            m3874e();
            return;
        }
        this.f6031L.setEnabled(true);
        m3862R(z2, true);
        if (!this.f6052k.f13306h) {
            this.f6057p.m4482c();
            return;
        }
        if (!z2) {
            this.f6055n.mo10822k(Duration.ZERO);
            this.f6057p.m4482c();
        } else {
            m3892w((Duration) this.f6053l.f34942d);
            ToggleUi toggleUi = this.f6057p;
            toggleUi.f7280d.setVisibility(0);
            toggleUi.f7279c.setAlpha(0.0f);
        }
    }
}
