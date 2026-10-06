package p000;

import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import com.google.android.apps.camera.bottombar.C0100R;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dsv implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f12517a;

    /* JADX INFO: renamed from: b */
    private final oju f12518b;

    /* JADX INFO: renamed from: c */
    private final /* synthetic */ int f12519c;

    public dsv(oju ojuVar, oju ojuVar2, int i) {
        this.f12519c = i;
        this.f12517a = ojuVar;
        this.f12518b = ojuVar2;
    }

    public dsv(oju ojuVar, oju ojuVar2, int i, byte[] bArr) {
        this.f12519c = i;
        this.f12518b = ojuVar;
        this.f12517a = ojuVar2;
    }

    public dsv(oju ojuVar, oju ojuVar2, int i, char[] cArr) {
        this.f12519c = i;
        this.f12518b = ojuVar;
        this.f12517a = ojuVar2;
    }

    public dsv(oju ojuVar, oju ojuVar2, int i, short[] sArr) {
        this.f12519c = i;
        this.f12518b = ojuVar;
        this.f12517a = ojuVar2;
    }

    /* JADX INFO: renamed from: a */
    public static Set m6667a(dhv dhvVar, oju ojuVar) {
        Set setM17136H = !dhvVar.mo6184l(dhr.f11161a) ? mzx.f41874a : mxk.m17136H(dez.m6036f(new drs(ojuVar, 8), "sensorconsumer"));
        setM17136H.getClass();
        return setM17136H;
    }

    /* JADX INFO: renamed from: b */
    public static dsv m6668b(oju ojuVar, oju ojuVar2) {
        return new dsv(ojuVar, ojuVar2, 2);
    }

    /* JADX INFO: renamed from: c */
    public static dsv m6669c(oju ojuVar, oju ojuVar2) {
        return new dsv(ojuVar, ojuVar2, 3, (char[]) null);
    }

    /* JADX INFO: renamed from: d */
    public static dsv m6670d(oju ojuVar, oju ojuVar2) {
        return new dsv(ojuVar, ojuVar2, 13);
    }

    /* JADX INFO: renamed from: e */
    public static dsv m6671e(oju ojuVar, oju ojuVar2) {
        return new dsv(ojuVar, ojuVar2, 14, (short[]) null);
    }

    /* JADX INFO: renamed from: f */
    public static dsv m6672f(oju ojuVar, oju ojuVar2) {
        return new dsv(ojuVar, ojuVar2, 15);
    }

    @Override // p000.oju
    public final /* synthetic */ Object get() {
        Object objM17136H;
        final int i = 2;
        final int i2 = 0;
        final int i3 = 1;
        switch (this.f12519c) {
            case 0:
                dhv dhvVar = (dhv) this.f12517a.get();
                oju ojuVar = this.f12518b;
                if (dhvVar.mo6184l(dib.f11263aW)) {
                    objM17136H = mxk.m17136H(ipn.m11594a(new dta((cvy) ojuVar.get(), 0, null), new jws(ffw.f21756b), ipl.ZEBRAS));
                } else {
                    objM17136H = mzx.f41874a;
                }
                objM17136H.getClass();
                return objM17136H;
            case 1:
                return jbx.m12870o(this.f12518b, (kbz) this.f12517a.get(), "fastzoom");
            case 2:
                kfk kfkVar = (kfk) this.f12517a.get();
                mrm mrmVar = (mrm) this.f12518b.get();
                return mrmVar.mo16813g() ? mrm.m16829i(kfkVar.mo14132s((kgg) mrmVar.mo16809c())) : mqu.f41450a;
            case 3:
                return mrm.m16828h(((kfk) this.f12518b.get()).mo14116c().mo14138c((kgi) this.f12517a.get()));
            case 4:
                return dxu.m6867c(new gvg(1), (dvg) this.f12517a.get(), ((dun) this.f12518b).m6758a());
            case 5:
                return dxu.m6867c(new gvg(0), (dvg) this.f12517a.get(), ((dun) this.f12518b).m6758a());
            case 6:
                return dxu.m6867c(new gvg(2), (dvg) this.f12517a.get(), ((dun) this.f12518b).m6758a());
            case 7:
                return dxu.m6867c(new gvg(3), (dvg) this.f12517a.get(), ((dun) this.f12518b).m6758a());
            case 8:
                return dxu.m6867c(new gvg(4), (dvg) this.f12517a.get(), ((dun) this.f12518b).m6758a());
            case 9:
                dtj dtjVar = (dtj) this.f12517a.get();
                final gti gtiVar = (gti) this.f12518b.get();
                dvt dvtVarM6793a = dvu.m6793a(dtjVar);
                dvtVarM6793a.m6792b(new dvr() { // from class: duv
                    @Override // p000.dvr
                    /* JADX INFO: renamed from: a */
                    public final float mo6760a(long j) {
                        switch (i2) {
                            case 0:
                                gth gthVarMo9758c = gtiVar.mo9758c(j);
                                if (gthVarMo9758c != null) {
                                    return gthVarMo9758c.f26351m;
                                }
                                return Float.NaN;
                            case 1:
                                gth gthVarMo9758c2 = gtiVar.mo9758c(j);
                                gtt gttVar = null;
                                if (gthVarMo9758c2 != null) {
                                    mrm mrmVar2 = gthVarMo9758c2.f26354p;
                                    if (mrmVar2.mo16813g()) {
                                        gttVar = (gtt) mrmVar2.mo16809c();
                                    }
                                }
                                if (gttVar != null) {
                                    return gttVar.f26394b;
                                }
                                return Float.NaN;
                            default:
                                gth gthVarMo9758c3 = gtiVar.mo9758c(j);
                                if (gthVarMo9758c3 != null) {
                                    return gthVarMo9758c3.f26340b;
                                }
                                return Float.NaN;
                        }
                    }
                });
                dvtVarM6793a.f12683c = gtiVar.mo9757b();
                dvt.m6790c(gtiVar.mo9756a());
                return dvtVarM6793a.m6791a();
            case 10:
                dtj dtjVar2 = (dtj) this.f12517a.get();
                oju ojuVar2 = this.f12518b;
                dvt dvtVarM6793a2 = dvu.m6793a(dtjVar2);
                dvtVarM6793a2.f12682b = new dvs(ojuVar2, 1);
                dvtVarM6793a2.f12683c = ((dyq) ojuVar2.get()).f12925a;
                dvt.m6790c(((dyq) ojuVar2.get()).f12926b.length);
                dvtVarM6793a2.f12681a = -1;
                dvtVarM6793a2.f12684d = 3;
                return dvtVarM6793a2.m6791a();
            case 11:
                dtj dtjVar3 = (dtj) this.f12517a.get();
                final gti gtiVar2 = (gti) this.f12518b.get();
                dvt dvtVarM6793a3 = dvu.m6793a(dtjVar3);
                dvtVarM6793a3.m6792b(new dvr() { // from class: duv
                    @Override // p000.dvr
                    /* JADX INFO: renamed from: a */
                    public final float mo6760a(long j) {
                        switch (i3) {
                            case 0:
                                gth gthVarMo9758c = gtiVar2.mo9758c(j);
                                if (gthVarMo9758c != null) {
                                    return gthVarMo9758c.f26351m;
                                }
                                return Float.NaN;
                            case 1:
                                gth gthVarMo9758c2 = gtiVar2.mo9758c(j);
                                gtt gttVar = null;
                                if (gthVarMo9758c2 != null) {
                                    mrm mrmVar2 = gthVarMo9758c2.f26354p;
                                    if (mrmVar2.mo16813g()) {
                                        gttVar = (gtt) mrmVar2.mo16809c();
                                    }
                                }
                                if (gttVar != null) {
                                    return gttVar.f26394b;
                                }
                                return Float.NaN;
                            default:
                                gth gthVarMo9758c3 = gtiVar2.mo9758c(j);
                                if (gthVarMo9758c3 != null) {
                                    return gthVarMo9758c3.f26340b;
                                }
                                return Float.NaN;
                        }
                    }
                });
                dvtVarM6793a3.f12683c = gtiVar2.mo9757b();
                dvt.m6790c(gtiVar2.mo9756a());
                return dvtVarM6793a3.m6791a();
            case 12:
                dtj dtjVar4 = (dtj) this.f12517a.get();
                final gti gtiVar3 = (gti) this.f12518b.get();
                dvt dvtVarM6793a4 = dvu.m6793a(dtjVar4);
                dvtVarM6793a4.m6792b(new dvr() { // from class: duv
                    @Override // p000.dvr
                    /* JADX INFO: renamed from: a */
                    public final float mo6760a(long j) {
                        switch (i) {
                            case 0:
                                gth gthVarMo9758c = gtiVar3.mo9758c(j);
                                if (gthVarMo9758c != null) {
                                    return gthVarMo9758c.f26351m;
                                }
                                return Float.NaN;
                            case 1:
                                gth gthVarMo9758c2 = gtiVar3.mo9758c(j);
                                gtt gttVar = null;
                                if (gthVarMo9758c2 != null) {
                                    mrm mrmVar2 = gthVarMo9758c2.f26354p;
                                    if (mrmVar2.mo16813g()) {
                                        gttVar = (gtt) mrmVar2.mo16809c();
                                    }
                                }
                                if (gttVar != null) {
                                    return gttVar.f26394b;
                                }
                                return Float.NaN;
                            default:
                                gth gthVarMo9758c3 = gtiVar3.mo9758c(j);
                                if (gthVarMo9758c3 != null) {
                                    return gthVarMo9758c3.f26340b;
                                }
                                return Float.NaN;
                        }
                    }
                });
                dvtVarM6793a4.f12683c = gtiVar3.mo9757b();
                dvt.m6790c(gtiVar3.mo9756a());
                return dvtVarM6793a4.m6791a();
            case 13:
                return new djm(((emt) this.f12517a).get(), ((ohm) this.f12518b).get());
            case 14:
                return m6667a((dhv) this.f12518b.get(), this.f12517a);
            case 15:
                Object objM17136H2 = !((dhv) this.f12517a.get()).mo6184l(dhr.f11161a) ? mzx.f41874a : mxk.m17136H(new eam(this.f12518b, 1));
                objM17136H2.getClass();
                return objM17136H2;
            case 16:
                Context contextM6830a = ((dws) this.f12517a).m6830a();
                glk glkVar = (glk) this.f12518b.get();
                ValueAnimator valueAnimator = (ValueAnimator) AnimatorInflater.loadAnimator(contextM6830a, C0100R.animator.active_focus_converge_outer_ring_opacity_fade_out);
                valueAnimator.addUpdateListener(glkVar.m9429f());
                valueAnimator.addListener(new ilq());
                return inr.m11538j(valueAnimator);
            case 17:
                Context contextM6830a2 = ((dws) this.f12517a).m6830a();
                glk glkVar2 = (glk) this.f12518b.get();
                ValueAnimator valueAnimator2 = (ValueAnimator) AnimatorInflater.loadAnimator(contextM6830a2, C0100R.animator.focus_lock_release_inner_splash_diameter_scale_down);
                valueAnimator2.addUpdateListener(glkVar2.m9426c());
                ValueAnimator valueAnimator3 = (ValueAnimator) AnimatorInflater.loadAnimator(contextM6830a2, C0100R.animator.focus_lock_release_inner_splash_opacity_fade_out);
                valueAnimator3.addUpdateListener(glkVar2.m9427d());
                ValueAnimator valueAnimator4 = (ValueAnimator) AnimatorInflater.loadAnimator(contextM6830a2, C0100R.animator.focus_lock_release_outer_ring_diameter_scale_down);
                valueAnimator4.addUpdateListener(glkVar2.m9428e());
                ValueAnimator valueAnimator5 = (ValueAnimator) AnimatorInflater.loadAnimator(contextM6830a2, C0100R.animator.focus_lock_release_outer_ring_opacity_fade_out);
                valueAnimator5.addUpdateListener(glkVar2.m9429f());
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(valueAnimator2, valueAnimator3, valueAnimator4, valueAnimator5);
                animatorSet.addListener(new ilq());
                return inr.m11538j(animatorSet);
            case 18:
                Context contextM6830a3 = ((dws) this.f12517a).m6830a();
                glk glkVar3 = (glk) this.f12518b.get();
                ValueAnimator valueAnimator6 = (ValueAnimator) AnimatorInflater.loadAnimator(contextM6830a3, C0100R.animator.tracking_end_outer_ring_diameter_scale_up);
                valueAnimator6.addUpdateListener(glkVar3.m9428e());
                ValueAnimator valueAnimator7 = (ValueAnimator) AnimatorInflater.loadAnimator(contextM6830a3, C0100R.animator.tracking_end_outer_ring_opacity_fade_out);
                valueAnimator7.addUpdateListener(glkVar3.m9429f());
                AnimatorSet animatorSet2 = new AnimatorSet();
                animatorSet2.setInterpolator(new akf());
                animatorSet2.playTogether(valueAnimator6, valueAnimator7);
                animatorSet2.addListener(new ilq());
                return inr.m11538j(animatorSet2);
            case 19:
                Context contextM6830a4 = ((dws) this.f12517a).m6830a();
                glk glkVar4 = (glk) this.f12518b.get();
                ValueAnimator valueAnimator8 = (ValueAnimator) AnimatorInflater.loadAnimator(contextM6830a4, C0100R.animator.long_press_focus_lock_opacity_fade_out);
                valueAnimator8.addUpdateListener(glkVar4.m9429f());
                AnimatorSet animatorSet3 = new AnimatorSet();
                animatorSet3.play(valueAnimator8);
                animatorSet3.addListener(new ilq());
                return inr.m11538j(animatorSet3);
            default:
                Context contextM6830a5 = ((dws) this.f12517a).m6830a();
                glk glkVar5 = (glk) this.f12518b.get();
                ValueAnimator valueAnimator9 = (ValueAnimator) AnimatorInflater.loadAnimator(contextM6830a5, C0100R.animator.macro_focus_hold_opacity_fade_out);
                valueAnimator9.addUpdateListener(new afx(glkVar5, 12, null, null, null, null, null));
                AnimatorSet animatorSet4 = new AnimatorSet();
                animatorSet4.play(valueAnimator9);
                animatorSet4.addListener(new ilq());
                return inr.m11538j(animatorSet4);
        }
    }
}
