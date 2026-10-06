package p000;

import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import com.google.android.apps.camera.bottombar.C0100R;
import com.google.android.apps.camera.focusindicator.FocusIndicatorView;
import com.google.googlex.gcam.Gcam;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dqd implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f12290a;

    /* JADX INFO: renamed from: b */
    private final oju f12291b;

    /* JADX INFO: renamed from: c */
    private final oju f12292c;

    /* JADX INFO: renamed from: d */
    private final oju f12293d;

    /* JADX INFO: renamed from: e */
    private final oju f12294e;

    /* JADX INFO: renamed from: f */
    private final /* synthetic */ int f12295f;

    public dqd(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, int i) {
        this.f12295f = i;
        this.f12290a = ojuVar;
        this.f12291b = ojuVar2;
        this.f12292c = ojuVar3;
        this.f12293d = ojuVar4;
        this.f12294e = ojuVar5;
    }

    public dqd(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, int i, byte[] bArr) {
        this.f12295f = i;
        this.f12294e = ojuVar;
        this.f12293d = ojuVar2;
        this.f12290a = ojuVar3;
        this.f12292c = ojuVar4;
        this.f12291b = ojuVar5;
    }

    public dqd(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, int i, byte[] bArr, byte[] bArr2) {
        this.f12295f = i;
        this.f12293d = ojuVar;
        this.f12290a = ojuVar2;
        this.f12294e = ojuVar3;
        this.f12291b = ojuVar4;
        this.f12292c = ojuVar5;
    }

    public dqd(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, int i, char[] cArr) {
        this.f12295f = i;
        this.f12294e = ojuVar;
        this.f12291b = ojuVar2;
        this.f12290a = ojuVar3;
        this.f12292c = ojuVar4;
        this.f12293d = ojuVar5;
    }

    public dqd(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, int i, char[] cArr, byte[] bArr) {
        this.f12295f = i;
        this.f12292c = ojuVar;
        this.f12294e = ojuVar2;
        this.f12293d = ojuVar3;
        this.f12291b = ojuVar4;
        this.f12290a = ojuVar5;
    }

    public dqd(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, int i, float[] fArr) {
        this.f12295f = i;
        this.f12291b = ojuVar;
        this.f12292c = ojuVar2;
        this.f12294e = ojuVar3;
        this.f12290a = ojuVar4;
        this.f12293d = ojuVar5;
    }

    public dqd(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, int i, int[] iArr) {
        this.f12295f = i;
        this.f12293d = ojuVar;
        this.f12294e = ojuVar2;
        this.f12292c = ojuVar3;
        this.f12291b = ojuVar4;
        this.f12290a = ojuVar5;
    }

    public dqd(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, int i, short[] sArr) {
        this.f12295f = i;
        this.f12290a = ojuVar;
        this.f12294e = ojuVar2;
        this.f12293d = ojuVar3;
        this.f12292c = ojuVar4;
        this.f12291b = ojuVar5;
    }

    public dqd(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, int i, boolean[] zArr) {
        this.f12295f = i;
        this.f12291b = ojuVar;
        this.f12292c = ojuVar2;
        this.f12294e = ojuVar3;
        this.f12290a = ojuVar4;
        this.f12293d = ojuVar5;
    }

    public dqd(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, int i, byte[][] bArr) {
        this.f12295f = i;
        this.f12291b = ojuVar;
        this.f12293d = ojuVar2;
        this.f12292c = ojuVar3;
        this.f12294e = ojuVar4;
        this.f12290a = ojuVar5;
    }

    public dqd(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, int i, char[][] cArr) {
        this.f12295f = i;
        this.f12291b = ojuVar;
        this.f12293d = ojuVar2;
        this.f12290a = ojuVar3;
        this.f12292c = ojuVar4;
        this.f12294e = ojuVar5;
    }

    public dqd(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, int i, float[][] fArr) {
        this.f12295f = i;
        this.f12293d = ojuVar;
        this.f12291b = ojuVar2;
        this.f12290a = ojuVar3;
        this.f12292c = ojuVar4;
        this.f12294e = ojuVar5;
    }

    public dqd(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, int i, int[][] iArr) {
        this.f12295f = i;
        this.f12293d = ojuVar;
        this.f12291b = ojuVar2;
        this.f12290a = ojuVar3;
        this.f12292c = ojuVar4;
        this.f12294e = ojuVar5;
    }

    public dqd(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, int i, short[][] sArr) {
        this.f12295f = i;
        this.f12293d = ojuVar;
        this.f12291b = ojuVar2;
        this.f12290a = ojuVar3;
        this.f12292c = ojuVar4;
        this.f12294e = ojuVar5;
    }

    public dqd(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, int i, boolean[][] zArr) {
        this.f12295f = i;
        this.f12293d = ojuVar;
        this.f12291b = ojuVar2;
        this.f12290a = ojuVar3;
        this.f12292c = ojuVar4;
        this.f12294e = ojuVar5;
    }

    public dqd(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, int i, byte[][][] bArr) {
        this.f12295f = i;
        this.f12292c = ojuVar;
        this.f12294e = ojuVar2;
        this.f12291b = ojuVar3;
        this.f12290a = ojuVar4;
        this.f12293d = ojuVar5;
    }

    public dqd(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, int i, char[][][] cArr) {
        this.f12295f = i;
        this.f12290a = ojuVar;
        this.f12292c = ojuVar2;
        this.f12291b = ojuVar3;
        this.f12294e = ojuVar4;
        this.f12293d = ojuVar5;
    }

    public dqd(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, int i, float[][][] fArr) {
        this.f12295f = i;
        this.f12291b = ojuVar;
        this.f12294e = ojuVar2;
        this.f12293d = ojuVar3;
        this.f12290a = ojuVar4;
        this.f12292c = ojuVar5;
    }

    public dqd(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, int i, int[][][] iArr) {
        this.f12295f = i;
        this.f12291b = ojuVar;
        this.f12294e = ojuVar2;
        this.f12292c = ojuVar3;
        this.f12290a = ojuVar4;
        this.f12293d = ojuVar5;
    }

    public dqd(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, int i, short[][][] sArr) {
        this.f12295f = i;
        this.f12294e = ojuVar;
        this.f12290a = ojuVar2;
        this.f12293d = ojuVar3;
        this.f12292c = ojuVar4;
        this.f12291b = ojuVar5;
    }

    public dqd(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, int i, boolean[][][] zArr) {
        this.f12295f = i;
        this.f12292c = ojuVar;
        this.f12294e = ojuVar2;
        this.f12290a = ojuVar3;
        this.f12293d = ojuVar4;
        this.f12291b = ojuVar5;
    }

    /* JADX INFO: renamed from: a */
    public static dqd m6581a(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5) {
        return new dqd(ojuVar, ojuVar2, ojuVar3, ojuVar4, ojuVar5, 3, (short[]) null);
    }

    /* JADX INFO: renamed from: b */
    public static dqd m6582b(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5) {
        return new dqd(ojuVar, ojuVar2, ojuVar3, ojuVar4, ojuVar5, 4, (int[]) null);
    }

    /* JADX INFO: renamed from: c */
    public static dqd m6583c(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5) {
        return new dqd(ojuVar, ojuVar2, ojuVar3, ojuVar4, ojuVar5, 5, (boolean[]) null);
    }

    /* JADX INFO: renamed from: d */
    public static dqd m6584d(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5) {
        return new dqd(ojuVar, ojuVar2, ojuVar3, ojuVar4, ojuVar5, 6, (float[]) null);
    }

    /* JADX INFO: renamed from: e */
    public static dqd m6585e(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5) {
        return new dqd(ojuVar, ojuVar2, ojuVar3, ojuVar4, ojuVar5, 13, (byte[][][]) null);
    }

    /* JADX INFO: renamed from: f */
    public static dqd m6586f(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5) {
        return new dqd(ojuVar, ojuVar2, ojuVar3, ojuVar4, ojuVar5, 14, (char[][][]) null);
    }

    /* JADX INFO: renamed from: g */
    public static dqd m6587g(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5) {
        return new dqd(ojuVar, ojuVar2, ojuVar3, ojuVar4, ojuVar5, 15, (short[][][]) null);
    }

    /* JADX INFO: renamed from: h */
    public static dqd m6588h(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5) {
        return new dqd(ojuVar, ojuVar2, ojuVar3, ojuVar4, ojuVar5, 16, (int[][][]) null);
    }

    @Override // p000.oju
    public final /* synthetic */ Object get() {
        Object objM17136H;
        Object objM17137I;
        switch (this.f12295f) {
            case 0:
                jww jwwVar = (jww) this.f12290a.get();
                boolean zBooleanValue = ((Boolean) this.f12291b.get()).booleanValue();
                int iIntValue = ((ftj) this.f12292c).m8789b().intValue();
                dqk dqkVar = (dqk) this.f12293d.get();
                dhv dhvVar = (dhv) this.f12294e.get();
                if (zBooleanValue) {
                    geu geuVar = new geu(jwwVar, Integer.valueOf(iIntValue), Integer.valueOf(gzl.ON_STRONG.f26939f), gfc.f24484L, Integer.valueOf(gzl.ON_LIGHT.f26939f), gfc.BEAUTIFICATION_ON_LIGHT, Integer.valueOf(gzl.OFF.f26939f), gfc.BEAUTIFICATION_OFF);
                    cdy cdyVar = cdy.f5385n;
                    gfj gfjVarM9181o = gfk.m9181o();
                    if (dhvVar.mo6184l(dhp.f11149f)) {
                        gfjVarM9181o.f24546b = new dqc(dqkVar, 0);
                    }
                    gfjVarM9181o.m9178r(gev.BEAUTIFICATION);
                    gfjVarM9181o.m9174n(gfc.BEAUTIFICATION_OFF, gfc.BEAUTIFICATION_ON_LIGHT, gfc.f24484L);
                    gfjVarM9181o.m9168h(C0100R.string.faceretouch);
                    gfjVarM9181o.m9163c(C0100R.string.faceretouch_desc);
                    gfjVarM9181o.m9170j(Integer.valueOf(C0100R.string.faceretouch_off_option_desc), Integer.valueOf(C0100R.string.faceretouch_on_light_option_desc), Integer.valueOf(C0100R.string.faceretouch_on_strong_option_desc));
                    gfjVarM9181o.m9165e(Integer.valueOf(C0100R.string.faceretouch_off_acc_desc), Integer.valueOf(C0100R.string.faceretouch_on_light_acc_desc), Integer.valueOf(C0100R.string.faceretouch_on_strong_acc_desc));
                    gfjVarM9181o.m9167g(Integer.valueOf(C0100R.drawable.ic_faceretouch_off), Integer.valueOf(C0100R.drawable.ic_faceretouch_on_light), Integer.valueOf(C0100R.drawable.ic_faceretouch_on_strong));
                    gfjVarM9181o.f24545a = geuVar;
                    gfjVarM9181o.m9179s(cdyVar);
                    objM17136H = mxk.m17136H(gfjVarM9181o.m9161a());
                } else {
                    objM17136H = mzx.f41874a;
                }
                objM17136H.getClass();
                return objM17136H;
            case 1:
                return new dnu((dny) this.f12294e.get(), ((err) this.f12293d).get(), ((erq) this.f12290a).get(), ((dnx) this.f12292c).get(), (jvd) this.f12291b.get(), 0);
            case 2:
                boolean zBooleanValue2 = ((Boolean) this.f12294e.get()).booleanValue();
                oju ojuVar = this.f12291b;
                oju ojuVar2 = this.f12290a;
                jvd jvdVar = (jvd) this.f12292c.get();
                ((dws) this.f12293d).m6830a();
                Object objM17136H2 = !zBooleanValue2 ? mzx.f41874a : mxk.m17136H(new dft(ojuVar, jvdVar, ojuVar2, 3));
                objM17136H2.getClass();
                return objM17136H2;
            case 3:
                boolean zBooleanValue3 = ((Boolean) this.f12290a.get()).booleanValue();
                boolean zBooleanValue4 = ((Boolean) this.f12294e.get()).booleanValue();
                mrm mrmVarM6617a = ((dra) this.f12293d).m6617a();
                bko bkoVar = (bko) this.f12292c.get();
                jvb jvbVar = (jvb) this.f12291b.get();
                if (!zBooleanValue3 || !zBooleanValue4 || !mrmVarM6617a.mo16813g()) {
                    return mqu.f41450a;
                }
                lby lbyVarM2626t = bkoVar.m2626t("vesper_ad_postprocess");
                gpy gpyVarM6618a = ((drd) mrmVarM6617a.mo16809c()).m6618a();
                jvbVar.m13537d(gpyVarM6618a);
                jvbVar.m13537d(new dev(lbyVarM2626t, 13));
                return mrm.m16829i(gpyVarM6618a);
            case 4:
                return new drl(dnr.m6445d(), (Executor) this.f12293d.get(), (jvb) this.f12294e.get(), (dhv) this.f12292c.get(), (kbz) this.f12291b.get(), ((dws) this.f12290a).m6830a());
            case 5:
                return !((Boolean) this.f12291b.get()).booleanValue() ? new dsg() : new dsf("gca_postprocessing_with_camera_detections.binarypb", mrm.m16829i("detection_list"), 3000L, dyv.m6943f(), (bko) this.f12292c.get(), (Executor) this.f12294e.get(), ((dws) this.f12290a).m6830a(), (dsr) this.f12293d.get(), null, null, null);
            case 6:
                return !((Boolean) this.f12291b.get()).booleanValue() ? new dsg() : new dsf("gca_thumbnail_postprocessing.binarypb", mqu.f41450a, 2000L, dyv.m6943f(), (bko) this.f12292c.get(), (Executor) this.f12294e.get(), ((dws) this.f12290a).m6830a(), (dsr) this.f12293d.get(), null, null, null);
            case 7:
                final dvg dvgVar = (dvg) this.f12291b.get();
                final dtk dtkVar = (dtk) this.f12293d.get();
                final dtk dtkVar2 = (dtk) this.f12292c.get();
                final dtk dtkVar3 = (dtk) this.f12294e.get();
                dth dthVarM6758a = ((dun) this.f12290a).m6758a();
                duc ducVarM6756b = duh.m6756b(dvgVar);
                ducVarM6756b.f12580c = dthVarM6758a;
                ducVarM6756b.m6752d(new duf() { // from class: dui
                    @Override // p000.duf
                    /* JADX INFO: renamed from: a */
                    public final void mo6754a(long j, kpp kppVar) {
                        dtk dtkVar4 = dtkVar;
                        dtk dtkVar5 = dtkVar2;
                        dtk dtkVar6 = dtkVar3;
                        dvgVar.m6774g(j, (dtkVar4.mo6734a(j) * 0.15f) + (dtkVar5.mo6734a(j) * 0.25f) + (dtkVar6.mo6734a(j) * 0.6f));
                    }
                });
                return ducVarM6756b.m6749a();
            case 8:
                ((dww) this.f12291b).m6836a();
                return new glk(((dwt) this.f12293d).get(), ((dwx) this.f12290a).get(), ((dwy) this.f12292c).get(), ((dwu) this.f12294e).get());
            case 9:
                Context contextM6830a = ((dws) this.f12293d).m6830a();
                Resources resourcesM6836a = ((dww) this.f12291b).m6836a();
                glk glkVar = (glk) this.f12290a.get();
                dwl dwlVar = ((dwx) this.f12292c).get();
                FocusIndicatorView focusIndicatorView = ((dwv) this.f12294e).get();
                ValueAnimator valueAnimator = (ValueAnimator) AnimatorInflater.loadAnimator(contextM6830a, C0100R.animator.active_focus_scan_inner_splash_diameter_scale_up);
                valueAnimator.addUpdateListener(glkVar.m9426c());
                ValueAnimator valueAnimator2 = (ValueAnimator) AnimatorInflater.loadAnimator(contextM6830a, C0100R.animator.active_focus_scan_inner_splash_opacity_fade_in);
                valueAnimator2.addUpdateListener(glkVar.m9427d());
                ValueAnimator valueAnimator3 = (ValueAnimator) AnimatorInflater.loadAnimator(contextM6830a, C0100R.animator.active_focus_scan_inner_splash_opacity_fade_out);
                valueAnimator3.addUpdateListener(glkVar.m9427d());
                ValueAnimator valueAnimator4 = (ValueAnimator) AnimatorInflater.loadAnimator(contextM6830a, C0100R.animator.active_focus_scan_outer_ring_diameter_scale_down);
                valueAnimator4.addUpdateListener(glkVar.m9428e());
                ValueAnimator valueAnimator5 = (ValueAnimator) AnimatorInflater.loadAnimator(contextM6830a, C0100R.animator.active_focus_scan_outer_ring_opacity_fade_in);
                valueAnimator5.addUpdateListener(glkVar.m9429f());
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(valueAnimator, valueAnimator2, valueAnimator3, valueAnimator4, valueAnimator5);
                animatorSet.addListener(new dxa(dwlVar, resourcesM6836a, focusIndicatorView));
                animatorSet.addListener(new ilq());
                return inr.m11538j(animatorSet);
            case 10:
                Context contextM6830a2 = ((dws) this.f12293d).m6830a();
                Resources resourcesM6836a2 = ((dww) this.f12291b).m6836a();
                glk glkVar2 = (glk) this.f12290a.get();
                dwl dwlVar2 = ((dwx) this.f12292c).get();
                FocusIndicatorView focusIndicatorView2 = ((dwv) this.f12294e).get();
                ValueAnimator valueAnimator6 = (ValueAnimator) AnimatorInflater.loadAnimator(contextM6830a2, C0100R.animator.focus_lock_hold_inner_splash_diameter_scale_up);
                valueAnimator6.addUpdateListener(glkVar2.m9426c());
                ValueAnimator valueAnimator7 = (ValueAnimator) AnimatorInflater.loadAnimator(contextM6830a2, C0100R.animator.focus_lock_hold_inner_splash_opacity_fade_in);
                valueAnimator7.addUpdateListener(glkVar2.m9427d());
                ValueAnimator valueAnimator8 = (ValueAnimator) AnimatorInflater.loadAnimator(contextM6830a2, C0100R.animator.focus_lock_hold_outer_ring_opacity_fade_in);
                valueAnimator8.addUpdateListener(glkVar2.m9429f());
                ValueAnimator valueAnimator9 = (ValueAnimator) AnimatorInflater.loadAnimator(contextM6830a2, C0100R.animator.focus_lock_hold_outer_ring_thickness_scale_up);
                valueAnimator9.addUpdateListener(new afx(glkVar2, 11, null, null, null, null, null));
                AnimatorSet animatorSet2 = new AnimatorSet();
                animatorSet2.play(valueAnimator6).with(valueAnimator7).with(valueAnimator8).with(valueAnimator9);
                animatorSet2.addListener(new dxd(dwlVar2, resourcesM6836a2, focusIndicatorView2));
                animatorSet2.addListener(new ilq());
                return inr.m11538j(animatorSet2);
            case 11:
                Context contextM6830a3 = ((dws) this.f12293d).m6830a();
                Resources resourcesM6836a3 = ((dww) this.f12291b).m6836a();
                glk glkVar3 = (glk) this.f12290a.get();
                dwl dwlVar3 = ((dwx) this.f12292c).get();
                FocusIndicatorView focusIndicatorView3 = ((dwv) this.f12294e).get();
                ValueAnimator valueAnimator10 = (ValueAnimator) AnimatorInflater.loadAnimator(contextM6830a3, C0100R.animator.active_focus_scan_inner_splash_diameter_scale_up);
                valueAnimator10.addUpdateListener(glkVar3.m9426c());
                ValueAnimator valueAnimator11 = (ValueAnimator) AnimatorInflater.loadAnimator(contextM6830a3, C0100R.animator.active_focus_scan_inner_splash_opacity_fade_in);
                valueAnimator11.addUpdateListener(glkVar3.m9427d());
                ValueAnimator valueAnimator12 = (ValueAnimator) AnimatorInflater.loadAnimator(contextM6830a3, C0100R.animator.active_focus_scan_inner_splash_opacity_fade_out);
                valueAnimator12.addUpdateListener(glkVar3.m9427d());
                ValueAnimator valueAnimator13 = (ValueAnimator) AnimatorInflater.loadAnimator(contextM6830a3, C0100R.animator.active_focus_scan_outer_ring_diameter_scale_down);
                valueAnimator13.addUpdateListener(glkVar3.m9428e());
                ValueAnimator valueAnimator14 = (ValueAnimator) AnimatorInflater.loadAnimator(contextM6830a3, C0100R.animator.active_focus_scan_outer_ring_opacity_fade_in);
                valueAnimator14.addUpdateListener(glkVar3.m9429f());
                AnimatorSet animatorSet3 = new AnimatorSet();
                animatorSet3.playTogether(valueAnimator10, valueAnimator11, valueAnimator12, valueAnimator13, valueAnimator14);
                animatorSet3.addListener(new dxb(dwlVar3, resourcesM6836a3, focusIndicatorView3));
                animatorSet3.addListener(new ilq());
                return inr.m11538j(animatorSet3);
            case 12:
                Context contextM6830a4 = ((dws) this.f12293d).m6830a();
                Resources resourcesM6836a4 = ((dww) this.f12291b).m6836a();
                glk glkVar4 = (glk) this.f12290a.get();
                dwl dwlVar4 = ((dwx) this.f12292c).get();
                FocusIndicatorView focusIndicatorView4 = ((dwv) this.f12294e).get();
                ValueAnimator valueAnimator15 = (ValueAnimator) AnimatorInflater.loadAnimator(contextM6830a4, C0100R.animator.passive_focus_scan_outer_ring_diameter_scale_down);
                valueAnimator15.addUpdateListener(glkVar4.m9428e());
                ValueAnimator valueAnimator16 = (ValueAnimator) AnimatorInflater.loadAnimator(contextM6830a4, C0100R.animator.passive_focus_scan_outer_ring_opacity_fade_in);
                valueAnimator16.addUpdateListener(glkVar4.m9429f());
                AnimatorSet animatorSet4 = new AnimatorSet();
                animatorSet4.playTogether(valueAnimator15, valueAnimator16);
                animatorSet4.addListener(new dxc(dwlVar4, resourcesM6836a4, focusIndicatorView4));
                animatorSet4.addListener(new ilq());
                return inr.m11538j(animatorSet4);
            case 13:
                return mxk.m17136H(dez.m6036f(new cgg((dxx) this.f12294e.get(), (dyb) this.f12291b.get(), this.f12293d, (dxr) this.f12292c.get(), (jvb) this.f12290a.get(), 4), "metadataFrameStore"));
            case 14:
                return mxk.m17136H(dez.m6036f(new cgg((jvb) this.f12294e.get(), (jwn) this.f12291b.get(), (eax) this.f12290a.get(), (jww) this.f12292c.get(), (Executor) this.f12293d.get(), 7), "lowlightscene"));
            case 15:
                return new efp((jwf) this.f12294e.get(), (jwf) this.f12290a.get(), (dhv) this.f12293d.get(), (jvb) this.f12292c.get(), (fcp) this.f12291b.get());
            case 16:
                oju ojuVar3 = this.f12291b;
                oju ojuVar4 = this.f12294e;
                oju ojuVar5 = this.f12292c;
                oju ojuVar6 = this.f12290a;
                if (((egx) this.f12293d).m7318b().booleanValue()) {
                    kgg kggVar = (kgg) ((Map) ojuVar3.get()).get(gnf.RAW_TELE);
                    kgg kggVar2 = (kgg) ((Map) ojuVar3.get()).get(gnf.f25701c);
                    if (kggVar != null && kggVar2 != null) {
                        float fM9594g = goy.m9594g(kggVar2.mo14193c(), (ecq) ojuVar4.get(), (Gcam) ojuVar5.get());
                        float fM9594g2 = goy.m9594g(kggVar.mo14193c(), (ecq) ojuVar4.get(), (Gcam) ojuVar5.get());
                        if (fM9594g < 0.0f || fM9594g2 < 0.0f) {
                            kak kakVar = (kak) ojuVar6;
                            fM9594g = goy.m9595h(kakVar.get().mo13854a(kggVar2.mo14193c())).floatValue();
                            fM9594g2 = goy.m9595h(kakVar.get().mo13854a(kggVar.mo14193c())).floatValue();
                        }
                        if (fM9594g > 0.0f && fM9594g2 > 0.0f) {
                            return mrm.m16829i(Float.valueOf(fM9594g / fM9594g2));
                        }
                    }
                }
                return mqu.f41450a;
            case 17:
                return new ekc((cwd) this.f12292c.get(), ((est) this.f12294e).get(), ((ema) this.f12290a).get(), ((iig) this.f12293d).get(), (imy) this.f12291b.get(), null, null, null, null);
            case 18:
                elv elvVar = new elv((jvd) this.f12291b.get(), gtd.m9735q(), ((eru) this.f12294e).get(), (kov) this.f12293d.get());
                oju ojuVar7 = this.f12290a;
                msi msiVar = ((hzr) this.f12292c).get();
                elvVar.f14676e = new das(elvVar, 2);
                elvVar.f14684m.m14648b(elvVar.f14676e);
                elvVar.f14673b.execute(new efd(elvVar, 20));
                elvVar.f14677f = msiVar;
                elvVar.f14673b.execute(new ekr(elvVar, ojuVar7, 2));
                return elvVar;
            case 19:
                return new gjj(((dws) this.f12293d).m6830a(), (hst) this.f12290a.get(), (hah) this.f12294e.get(), (hai) this.f12291b.get(), (jwn) this.f12292c.get());
            default:
                fan fanVar = ((erq) this.f12292c).get();
                jvd jvdVar2 = (jvd) this.f12294e.get();
                ohb ohbVarM18485a = ohh.m18485a(this.f12293d);
                ohb ohbVarM18485a2 = ohh.m18485a(this.f12291b);
                if (((gtd) this.f12290a.get()).m9750p()) {
                    gtd gtdVar = (gtd) ohbVarM18485a.get();
                    gtdVar.getClass();
                    objM17137I = mxk.m17137I(new dlr(gtdVar, 3, null, null, null), new dft(jvdVar2, fanVar, ohbVarM18485a2, 6));
                } else {
                    objM17137I = mzx.f41874a;
                }
                objM17137I.getClass();
                return objM17137I;
        }
    }
}
