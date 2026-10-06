package p000;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.wear.ambient.AmbientModeSupport;
import com.google.android.apps.camera.bottombar.C0100R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hox extends chw {

    /* JADX INFO: renamed from: b */
    private static final nbh f28692b = nbh.m17259h("com/google/android/apps/camera/timelapse/TimelapseController");

    /* JADX INFO: renamed from: c */
    private final dbr f28693c;

    /* JADX INFO: renamed from: d */
    private final jww f28694d;

    /* JADX INFO: renamed from: e */
    private final kbz f28695e;

    /* JADX INFO: renamed from: f */
    private final cvt f28696f;

    /* JADX INFO: renamed from: g */
    private final fna f28697g;

    /* JADX INFO: renamed from: h */
    private how f28698h;

    /* JADX INFO: renamed from: i */
    private final etn f28699i;

    public hox(dbr dbrVar, jww jwwVar, etn etnVar, kbz kbzVar, cvt cvtVar, fna fnaVar) {
        this.f28693c = dbrVar;
        this.f28694d = jwwVar;
        this.f28695e = kbzVar;
        this.f28699i = etnVar;
        this.f28696f = cvtVar;
        this.f28697g = fnaVar;
    }

    /* JADX INFO: renamed from: w */
    private final how m10555w() {
        how howVar = this.f28698h;
        lku.m15662p(howVar);
        return howVar;
    }

    @Override // p000.chw
    /* JADX INFO: renamed from: bU */
    public final void mo3769bU() {
    }

    @Override // p000.chw
    /* JADX INFO: renamed from: bV */
    public final void mo3770bV() {
        if (this.f28698h == null) {
            ((nbe) ((nbe) f28692b.m17252c()).mo17276G((char) 3803)).mo17290o("Cheetah component is not initialized, aborting pause");
            return;
        }
        hpm hpmVarMo7869a = m10555w().mo7869a();
        hpmVarMo7869a.m10589g(false);
        hpg hpgVar = hpmVarMo7869a.f28883B;
        hpmVarMo7869a.f28931p.m13541c(new hpi(hpmVarMo7869a, 8));
        if (hpmVarMo7869a.f28889H != null) {
            hpmVarMo7869a.f28937v.execute(new hpi(hpmVarMo7869a, 9));
        }
    }

    @Override // p000.kba, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // p000.chw
    /* JADX INFO: renamed from: k */
    public final void mo3777k() {
        if (this.f5764a) {
            m10555w().mo7869a().m10591i(false);
        }
    }

    @Override // p000.chw
    /* JADX INFO: renamed from: l */
    public final void mo3778l() {
        if (this.f28698h == null) {
            ((nbe) ((nbe) f28692b.m17252c()).mo17276G((char) 3804)).mo17290o("Cheetah component is not initialized, aborting resume");
            return;
        }
        hpm hpmVarMo7869a = m10555w().mo7869a();
        int i = ((hor) hpmVarMo7869a.f28925j.f34942d).f28650k;
        hor horVar = hor.STATE_PREPARING_ON_RESUME;
        int i2 = i | horVar.f28650k;
        hor horVar2 = hor.STATE_IDLE;
        if (i2 == horVar2.f28650k) {
            hpmVarMo7869a.f28925j.mo3415bf(horVar2);
        } else {
            hpmVarMo7869a.f28925j.mo3415bf(horVar);
        }
        hpmVarMo7869a.f28883B.m10580g();
        if (hpmVarMo7869a.f28889H != null) {
            hpmVarMo7869a.f28937v.execute(new hpi(hpmVarMo7869a, 4));
        }
        hqk hqkVar = hpmVarMo7869a.f28886E;
        hqkVar.f29065M = hpmVarMo7869a.f28899R;
        hqkVar.f29068P = (ViewGroup) ((ConstraintLayout) hqkVar.f29082e.f31080q.m13100f(C0100R.id.activity_root_view)).getRootView();
        hqkVar.f29069Q = (ViewGroup) hqkVar.f29082e.f31080q.m13100f(C0100R.id.uncovered_preview_layout);
        hqkVar.f29070R = (ViewGroup) hqkVar.f29082e.f31080q.m13100f(C0100R.id.capture_overlay_layout);
        hqkVar.f29053A.m11596f(new hqi(hqkVar));
        Resources resources = hqkVar.f29083f.getResources();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        hqkVar.f29066N = new View(hqkVar.f29083f);
        hqkVar.f29066N.setLayoutParams(layoutParams);
        hqkVar.f29066N.setAlpha(0.0f);
        hqkVar.f29066N.setBackgroundColor(-16777216);
        hqkVar.f29066N.setVisibility(8);
        hqkVar.f29058F = new FrameLayout(hqkVar.f29083f);
        hqkVar.f29058F.setLayoutParams(layoutParams);
        hqkVar.f29058F.setAlpha(0.0f);
        hqkVar.f29058F.setBackgroundColor(-16777216);
        hqkVar.f29058F.setVisibility(8);
        hqkVar.f29058F.setOnTouchListener(new cln(hqkVar, 13));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        hqkVar.f29067O = new View(hqkVar.f29083f);
        hqkVar.f29067O.setLayoutParams(layoutParams2);
        hqkVar.f29067O.setAlpha(0.0f);
        hqkVar.f29067O.setBackgroundColor(-16777216);
        hqkVar.f29067O.setOnTouchListener(new cln(hqkVar, 14));
        hqkVar.f29064L = new TextView(hqkVar.f29083f);
        hqkVar.f29064L.setText(resources.getString(C0100R.string.notification_enter_power_saving_mode_stage_2));
        hqkVar.f29064L.setTextColor(resources.getColor(C0100R.color.frame_based_timer_text_color, null));
        hqkVar.f29064L.setTextSize(resources.getDimensionPixelSize(C0100R.dimen.frame_based_timer_text_size) / resources.getDisplayMetrics().scaledDensity);
        acn.m206a(hqkVar.f29083f, C0100R.font.google_sans_medium_compat, new hqj(hqkVar));
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2, 49);
        layoutParams3.topMargin = resources.getDimensionPixelSize(C0100R.dimen.power_saving_mode_indicator_top_margin);
        hqkVar.f29059G = jpd.m13426g(true, 3000, null, null, resources.getString(C0100R.string.notification_enter_power_saving_mode), hqkVar.f29083f, false, -1, 8);
        hqkVar.f29058F.addView(hqkVar.f29064L, layoutParams3);
        hqkVar.f29069Q.addView(hqkVar.f29067O);
        hqkVar.f29070R.addView(hqkVar.f29066N);
        hqkVar.f29068P.addView(hqkVar.f29058F);
        hqkVar.f29071S = ((FrameLayout.LayoutParams) hqkVar.f29064L.getLayoutParams()).topMargin;
        hqkVar.f29084g.m10837d(true);
        hqkVar.f29091n.mo5810a(hqkVar.f29061I);
        if (hpmVarMo7869a.f28929n.mo6184l(diy.f11747d)) {
            hpa hpaVar = hpmVarMo7869a.f28930o;
            hqk hqkVar2 = hpmVarMo7869a.f28886E;
            hqkVar2.getClass();
            AmbientModeSupport.AmbientController ambientController = new AmbientModeSupport.AmbientController(hqkVar2);
            synchronized (hpaVar.f28750t) {
                hpaVar.f28731E = ambientController;
            }
            hpa hpaVar2 = hpmVarMo7869a.f28930o;
            hqk hqkVar3 = hpmVarMo7869a.f28886E;
            hqkVar3.getClass();
            AmbientModeSupport.AmbientController ambientController2 = new AmbientModeSupport.AmbientController(hqkVar3);
            synchronized (hpaVar2.f28750t) {
                hpaVar2.f28730D = ambientController2;
            }
        } else {
            hoj hojVar = hpmVarMo7869a.f28928m;
            hqk hqkVar4 = hpmVarMo7869a.f28886E;
            hqkVar4.getClass();
            hojVar.f28590N = new AmbientModeSupport.AmbientController(hqkVar4);
        }
        if (((hor) hpmVarMo7869a.f28925j.f34942d).equals(hor.STATE_IDLE) || ((hor) hpmVarMo7869a.f28925j.f34942d).equals(hor.STATE_PROCESSING)) {
            jvd jvdVar = hpmVarMo7869a.f28931p;
            hqb hqbVar = hpmVarMo7869a.f28884C;
            hqbVar.getClass();
            jvdVar.m13541c(new hpi(hqbVar, 5));
        }
    }

    @Override // p000.chw
    /* JADX INFO: renamed from: n */
    public final void mo3780n() {
        this.f28696f.f9833a = ikw.TIME_LAPSE;
        this.f28695e.mo13961e("Cheetah-ModuleStart");
        this.f28694d.mo3415bf(true);
        etn etnVar = this.f28699i;
        etnVar.f19839d = new jib();
        if (etnVar.f19839d == null) {
            etnVar.f19839d = new jib();
        }
        Object obj = etnVar.f19836a;
        esz eszVar = (esz) obj;
        this.f28698h = new eto(eszVar, (esr) etnVar.f19837b, (esw) etnVar.f19838c);
        m10555w().mo7869a().m10584b(this.f28693c.mo5895d());
        hpm hpmVarMo7869a = m10555w().mo7869a();
        hpmVarMo7869a.f28925j.mo3415bf(hor.STATE_PREPARING_ON_START);
        hqk hqkVar = hpmVarMo7869a.f28886E;
        hqkVar.f29080c.addListener(hqkVar.f29103z);
        hqkVar.f29094q.m7597a(hqkVar.f29055C);
        hqkVar.f29087j.m13537d(hqkVar.f29093p.mo11233e(hqkVar.f29054B));
        hqkVar.f29087j.m13537d(new hcu(hqkVar, 3));
        hqkVar.f29087j.m13537d(new hcu(hqkVar, 4));
        if (hqkVar.f29101x.mo16813g()) {
            hqkVar.f29087j.m13537d(((hnn) hqkVar.f29101x.mo16809c()).mo10494a(ikw.TIME_LAPSE));
        }
        hpu hpuVar = hpmVarMo7869a.f28885D;
        jvh.m13562j(hpuVar.f29007m.m10468a(), new gjd(hpuVar, 10), hpuVar.f28998d);
        final hpu hpuVar2 = hpmVarMo7869a.f28885D;
        hny hnyVarM10529a = hnz.m10529a();
        hnyVarM10529a.m10525d("TimeLapsePoorVideoQualityWarning");
        hnyVarM10529a.m10524c(hpuVar2.f29000f);
        hnyVarM10529a.m10528g(hnv.HEAT_CRITICAL);
        hnyVarM10529a.m10527f(new hpi(hpuVar2, 19));
        hnyVarM10529a.m10526e(new hpi(hpuVar2, 20));
        hnz hnzVarM10522a = hnyVarM10529a.m10522a();
        hny hnyVarM10529a2 = hnz.m10529a();
        hnyVarM10529a2.m10525d("TimeLapseHeatEmergency");
        hnyVarM10529a2.m10524c(hpuVar2.f29000f);
        hnyVarM10529a2.m10528g(hnv.HEAT_EMERGENCY);
        hnyVarM10529a2.m10527f(new hps(hpuVar2, 1));
        hnyVarM10529a2.m10526e(new hps(hpuVar2, 0));
        hpuVar2.f29006l = mws.m17098m(hnzVarM10522a, hnyVarM10529a2.m10522a());
        hpuVar2.f28999e.m13537d(hpuVar2.f29003i.mo10519f(new hnu() { // from class: hpq
            @Override // p000.hnu
            /* JADX INFO: renamed from: by */
            public final void mo5538by(hnv hnvVar) {
                mws mwsVar = hpuVar2.f29006l;
                int i = ((mzr) mwsVar).f41859c;
                for (int i2 = 0; i2 < i; i2++) {
                    ((hnu) mwsVar.get(i2)).mo5538by(hnvVar);
                }
            }
        }));
        hpmVarMo7869a.m10585c();
        this.f28697g.m8602b(this, ikw.TIME_LAPSE, m10555w().mo7870b());
        this.f28695e.mo13962f();
    }

    @Override // p000.chw
    /* JADX INFO: renamed from: p */
    public final void mo3781p() {
        if (this.f28698h == null) {
            ((nbe) ((nbe) f28692b.m17252c()).mo17276G((char) 3805)).mo17290o("Cheetah component is not initialized, aborting stop");
            return;
        }
        this.f28695e.mo13961e("Cheetah-StopModule");
        hpm hpmVarMo7869a = m10555w().mo7869a();
        if (!((hor) hpmVarMo7869a.f28925j.f34942d).equals(hor.STATE_RECORDING_ERROR)) {
            if (((hor) hpmVarMo7869a.f28925j.f34942d).equals(hor.STATE_PROCESSING)) {
                hpmVarMo7869a.f28893L.mo2282d(new hpi(hpmVarMo7869a, 1), hpmVarMo7869a.f28931p);
            }
            m10555w().mo7870b().close();
            this.f28698h = null;
            this.f28695e.mo13962f();
        }
        ((nbe) ((nbe) hpm.f28881a.m17251b()).mo17276G((char) 3856)).mo17290o("onStop(): STATE_RECORDING_ERROR");
        hpmVarMo7869a.m10589g(true);
        jvd jvdVar = hpmVarMo7869a.f28931p;
        hqb hqbVar = hpmVarMo7869a.f28884C;
        hqbVar.getClass();
        jvdVar.m13541c(new hpi(hqbVar, 0));
        hpmVarMo7869a.f28883B.m10581h();
        hpmVarMo7869a.f28925j.mo3415bf(hor.STATE_UNINITIALIZED);
        m10555w().mo7870b().close();
        this.f28698h = null;
        this.f28695e.mo13962f();
    }

    @Override // p000.chw
    /* JADX INFO: renamed from: t */
    public final boolean mo3785t() {
        if (this.f28698h == null) {
            ((nbe) ((nbe) f28692b.m17252c()).mo17276G((char) 3806)).mo17290o("Cheetah component is not initialized, aborting onBackPressed");
            return false;
        }
        hpm hpmVarMo7869a = m10555w().mo7869a();
        boolean zM10549a = hor.m10549a((hor) hpmVarMo7869a.f28925j.f34942d);
        hpmVarMo7869a.m10589g(false);
        if (zM10549a) {
            return true;
        }
        hpmVarMo7869a.f28886E.f29091n.mo5814e();
        return true;
    }
}
