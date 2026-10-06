package p000;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.ScaleAnimation;
import android.widget.FrameLayout;
import androidx.wear.ambient.AmbientMode;
import com.google.android.apps.camera.bottombar.C0100R;
import com.google.android.clockwork.common.wearable.wearmaterial.time.HuCi.yTyWiTtGtnBhy;
import com.google.android.gms.dynamite.p017ho.DNTdN;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cgm implements cgu {

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ int f5622f = 0;

    /* JADX INFO: renamed from: g */
    private static final nbh f5623g = nbh.m17259h("com/google/android/apps/camera/aizoom/AiZoomPreviewManagerImpl");

    /* JADX INFO: renamed from: h */
    private static final Object f5624h = new Object();

    /* JADX INFO: renamed from: i */
    private static cgt f5625i = cgt.HIDDEN;

    /* JADX INFO: renamed from: a */
    public final jwn f5626a;

    /* JADX INFO: renamed from: b */
    public final boolean f5627b;

    /* JADX INFO: renamed from: c */
    public FrameLayout f5628c;

    /* JADX INFO: renamed from: d */
    public cgz f5629d;

    /* JADX INFO: renamed from: e */
    public final AmbientMode.AmbientController f5630e = new AmbientMode.AmbientController(this);

    /* JADX INFO: renamed from: j */
    private final Resources f5631j;

    /* JADX INFO: renamed from: k */
    private final Executor f5632k;

    /* JADX INFO: renamed from: l */
    private final oju f5633l;

    /* JADX INFO: renamed from: m */
    private final mrm f5634m;

    /* JADX INFO: renamed from: n */
    private final ggm f5635n;

    /* JADX INFO: renamed from: o */
    private final jwn f5636o;

    /* JADX INFO: renamed from: p */
    private final jwn f5637p;

    /* JADX INFO: renamed from: q */
    private cgo f5638q;

    /* JADX INFO: renamed from: r */
    private kan f5639r;

    /* JADX INFO: renamed from: s */
    private cgn f5640s;

    /* JADX INFO: renamed from: t */
    private final djm f5641t;

    public cgm(Context context, jwn jwnVar, oju ojuVar, cgk cgkVar, ggm ggmVar, jwn jwnVar2, djm djmVar, jwn jwnVar3, dhv dhvVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f5631j = context.getResources();
        this.f5632k = context.getMainExecutor();
        this.f5626a = jwnVar;
        this.f5633l = ojuVar;
        this.f5635n = ggmVar;
        this.f5636o = jwnVar2;
        this.f5641t = djmVar;
        this.f5637p = jwnVar3;
        this.f5627b = dhvVar.mo6183k(dib.f11347ca);
        this.f5634m = dhvVar.mo6183k(dib.f11348cb) ? mrm.m16829i(cgkVar) : mqu.f41450a;
    }

    /* JADX INFO: renamed from: k */
    private final int m3633k(int i) {
        try {
            return (int) this.f5631j.getDimension(i);
        } catch (Resources.NotFoundException e) {
            ((nbe) ((nbe) ((nbe) f5623g.m17252c().mo17282g(nch.f41987a, "BobaPreviewMgr")).mo17283h(e)).mo17276G(94)).mo17291p("Dimension not found: %d", i);
            return 0;
        }
    }

    /* JADX INFO: renamed from: l */
    private final synchronized void m3634l() {
        if (this.f5634m.mo16813g()) {
            ((cgk) this.f5634m.mo16809c()).m3629d();
            return;
        }
        cgn cgnVar = this.f5640s;
        if (cgnVar != null && this.f5629d != null) {
            cei ceiVar = new cei(this, 8);
            nbz nbzVar = nch.f41987a;
            cgnVar.f5644c.execute(new cgl(cgnVar, new cgl(cgnVar, ceiVar, 3), 4));
        }
    }

    /* JADX INFO: renamed from: m */
    private final void m3635m(Runnable runnable) {
        this.f5632k.execute(runnable);
    }

    /* JADX INFO: renamed from: n */
    private final synchronized void m3636n() {
        int i;
        int i2;
        cgz cgzVar = new cgz(this.f5628c.getContext());
        if (this.f5639r.equals(kan.f35487b)) {
            i = C0100R.dimen.preview_panel_width_16_9;
        } else {
            i = this.f5639r.equals(kan.f35486a) ? C0100R.dimen.preview_panel_width_4_3 : C0100R.dimen.preview_panel_width_imm;
        }
        if (this.f5639r.equals(kan.f35487b)) {
            i2 = C0100R.dimen.preview_panel_height_16_9;
        } else {
            i2 = this.f5639r.equals(kan.f35486a) ? C0100R.dimen.preview_panel_height_4_3 : C0100R.dimen.preview_panel_height_imm;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(m3633k(i), m3633k(i2));
        layoutParams.gravity = 53;
        int iM3633k = m3633k(C0100R.dimen.preview_panel_margin);
        layoutParams.topMargin = iM3633k;
        layoutParams.rightMargin = iM3633k;
        cgzVar.setLayoutParams(layoutParams);
        cgzVar.setVisibility(4);
        cgzVar.f5711b.f6487a.setStrokeWidth(m3633k(C0100R.dimen.preview_panel_roi_stroke));
        cgzVar.f5711b.f6487a.setStyle(Paint.Style.STROKE);
        this.f5629d = cgzVar;
        m3635m(new cgl(this, cgzVar, 2));
        this.f5640s = new cgn(cgzVar, this.f5632k);
    }

    /* JADX INFO: renamed from: o */
    private final void m3637o() {
        if (this.f5634m.mo16813g()) {
            cgq cgqVar = new cgq();
            cgqVar.f5657a = this.f5639r;
            if (this.f5639r.equals(kan.f35487b)) {
                cgqVar.f5658b = m3633k(C0100R.dimen.preview_panel_width_16_9);
                cgqVar.f5659c = m3633k(C0100R.dimen.preview_panel_height_16_9);
                cgqVar.f5665i = m3633k(C0100R.dimen.preview_panel_collapsed_width_16_9);
                cgqVar.f5666j = m3633k(C0100R.dimen.preview_panel_collapsed_height_16_9);
                m3633k(C0100R.dimen.preview_panel_roi_bracket_width_16_9);
                m3633k(C0100R.dimen.preview_panel_roi_bracket_height_16_9);
            } else if (this.f5639r.equals(kan.f35486a)) {
                cgqVar.f5658b = m3633k(C0100R.dimen.preview_panel_width_4_3);
                cgqVar.f5659c = m3633k(C0100R.dimen.preview_panel_height_4_3);
                cgqVar.f5665i = m3633k(C0100R.dimen.preview_panel_collapsed_width_4_3);
                cgqVar.f5666j = m3633k(C0100R.dimen.preview_panel_collapsed_height_4_3);
                m3633k(C0100R.dimen.preview_panel_roi_bracket_width_4_3);
                m3633k(C0100R.dimen.preview_panel_roi_bracket_height_4_3);
            } else {
                cgqVar.f5658b = m3633k(C0100R.dimen.preview_panel_width_imm);
                cgqVar.f5659c = m3633k(C0100R.dimen.preview_panel_height_imm);
                cgqVar.f5665i = m3633k(C0100R.dimen.preview_panel_collapsed_width_imm);
                cgqVar.f5666j = m3633k(C0100R.dimen.preview_panel_collapsed_height_imm);
                m3633k(C0100R.dimen.preview_panel_roi_bracket_width_imm);
                m3633k(C0100R.dimen.preview_panel_roi_bracket_height_imm);
            }
            cgqVar.f5660d = m3633k(C0100R.dimen.preview_panel_margin);
            cgqVar.f5661e = m3633k(C0100R.dimen.preview_panel_inside_stroke);
            cgqVar.f5662f = m3633k(C0100R.dimen.preview_panel_outside_stroke);
            cgqVar.f5663g = m3633k(C0100R.dimen.preview_panel_inside_radius);
            cgqVar.f5664h = m3633k(C0100R.dimen.preview_panel_outside_radius);
            cgqVar.f5667k = m3633k(C0100R.dimen.preview_panel_inside_collapsed_radius);
            cgqVar.f5668l = m3633k(C0100R.dimen.preview_panel_outside_collapsed_radius);
            ((cgk) this.f5634m.mo16809c()).m3631f(cgqVar);
        }
    }

    /* JADX INFO: renamed from: a */
    public final cgo m3638a() {
        cgo cgoVar;
        synchronized (this.f5633l) {
            if (this.f5638q == null) {
                this.f5638q = (cgo) this.f5633l.get();
            }
            cgoVar = this.f5638q;
        }
        return cgoVar;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, jwn] */
    @Override // p000.cgu
    /* JADX INFO: renamed from: b */
    public final synchronized kba mo3639b(FrameLayout frameLayout, iuj iujVar) {
        jvb jvbVar;
        this.f5628c = frameLayout;
        ((ite) iujVar).f32064O.f7407c.add(this.f5630e);
        jvbVar = new jvb();
        jvbVar.m13537d(jwj.m13624c(this.f5641t.f11787a).mo3830a(new cbx(this, 10), this.f5632k));
        jvbVar.m13537d(this.f5637p.mo3830a(new cbx(this, 11), this.f5632k));
        jvbVar.m13537d(new cic(this, iujVar, 1));
        return jvbVar;
    }

    @Override // p000.cgu
    /* JADX INFO: renamed from: c */
    public final synchronized kba mo3640c(kan kanVar) {
        nbz nbzVar = nch.f41987a;
        this.f5639r = kanVar;
        if (this.f5634m.mo16813g()) {
            m3637o();
        } else {
            m3636n();
        }
        synchronized (f5624h) {
            if (f5625i != cgt.HIDDEN) {
                if (this.f5634m.mo16813g()) {
                    ((cgk) this.f5634m.mo16809c()).m3632g(f5625i);
                } else {
                    m3635m(new cei(this, 10));
                }
            }
        }
        return new cft(this, 3);
    }

    /* JADX INFO: renamed from: d */
    public final synchronized void m3641d(boolean z) {
        synchronized (f5624h) {
            if (f5625i != cgt.HIDDEN) {
                nbz nbzVar = nch.f41987a;
                if (z && f5625i == cgt.EXPANDED) {
                    f5625i = cgt.COLLAPSED;
                    if (this.f5634m.mo16813g()) {
                        ((cgk) this.f5634m.mo16809c()).m3627b();
                    } else {
                        cgn cgnVar = this.f5640s;
                        if (cgnVar != null) {
                            cgnVar.m3648a(0.45f);
                        }
                    }
                } else if (z || f5625i != cgt.COLLAPSED) {
                    ((nbe) ((nbe) f5623g.m17252c().mo17282g(nch.f41987a, "BobaPreviewMgr")).mo17276G(99)).mo17301z("Invalid request to %s in state %s.", z ? "collapse" : DNTdN.yhnxnnRgMFG, f5625i);
                } else {
                    f5625i = cgt.EXPANDED;
                    if (this.f5634m.mo16813g()) {
                        ((cgk) this.f5634m.mo16809c()).m3628c();
                    } else {
                        cgn cgnVar2 = this.f5640s;
                        if (cgnVar2 != null) {
                            cgnVar2.m3648a(1.0f);
                        }
                    }
                }
            } else {
                ((nbe) ((nbe) f5623g.m17252c().mo17282g(nch.f41987a, "BobaPreviewMgr")).mo17276G(97)).mo17290o(yTyWiTtGtnBhy.GhyBHhcKrI);
            }
        }
    }

    @Override // p000.cgu
    /* JADX INFO: renamed from: e */
    public final synchronized void mo3642e() {
        m3641d(true);
    }

    @Override // p000.cgu
    /* JADX INFO: renamed from: f */
    public final synchronized void mo3643f() {
        synchronized (f5624h) {
            if (f5625i != cgt.HIDDEN) {
                nbz nbzVar = nch.f41987a;
                f5625i = cgt.COLLAPSED;
            }
        }
        nbz nbzVar2 = nch.f41987a;
        m3634l();
    }

    @Override // p000.cgu
    /* JADX INFO: renamed from: g */
    public final synchronized void mo3644g() {
        synchronized (f5624h) {
            if (f5625i == cgt.HIDDEN) {
                nbz nbzVar = nch.f41987a;
                return;
            }
            f5625i = cgt.HIDDEN;
            nbz nbzVar2 = nch.f41987a;
            m3634l();
        }
    }

    @Override // p000.cgu
    /* JADX INFO: renamed from: h */
    public final void mo3645h(kpw kpwVar, RectF rectF, boolean z) {
        int iIntValue;
        int i = 0;
        if (rectF != null) {
            if (this.f5634m.mo16813g()) {
                iIntValue = this.f5639r.equals(kan.f35488c) ? 0 : ((Integer) this.f5636o.mo3831be()).intValue();
            } else {
                iIntValue = ((Integer) this.f5636o.mo3831be()).intValue() + this.f5635n.mo9216f().f35503e;
            }
            Matrix matrix = new Matrix();
            matrix.setRotate(iIntValue % 360, 0.5f, 0.5f);
            matrix.mapRect(rectF);
        }
        if (this.f5634m.mo16813g()) {
            synchronized (f5624h) {
                ((cgk) this.f5634m.mo16809c()).m3632g(f5625i);
                ((cgk) this.f5634m.mo16809c()).m3630e(kpwVar, rectF, z);
            }
        } else {
            cgz cgzVar = this.f5629d;
            if (cgzVar != null) {
                m3638a().m3650b(kpwVar, cgzVar.f5710a);
                m3635m(new cgl(this, rectF, i));
            }
        }
    }

    @Override // p000.cgu
    /* JADX INFO: renamed from: i */
    public final synchronized void mo3646i() {
        cgn cgnVar;
        synchronized (f5624h) {
            if (f5625i != cgt.HIDDEN) {
                nbz nbzVar = nch.f41987a;
                return;
            }
            f5625i = cgt.EXPANDED;
            nbz nbzVar2 = nch.f41987a;
            if (this.f5634m.mo16813g()) {
                m3637o();
                ((cgk) this.f5634m.mo16809c()).m3632g(((Boolean) ((jwf) this.f5641t.f11787a).f34942d).booleanValue() ? cgt.COLLAPSED : cgt.EXPANDED);
                return;
            }
            if (this.f5629d == null || (cgnVar = this.f5640s) == null) {
                ((nbe) ((nbe) f5623g.m17252c().mo17282g(nch.f41987a, "BobaPreviewMgr")).mo17276G('n')).mo17290o("Manager not initialized, must call start() first.");
                return;
            }
            cgt cgtVar = cgt.EXPANDED;
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setDuration(167L);
            cgt cgtVar2 = cgt.EXPANDED;
            float width = cgnVar.f5643b.getWidth();
            float f = cgtVar == cgtVar2 ? 1.0f : 0.45f;
            ScaleAnimation scaleAnimation = new ScaleAnimation(0.45f, f, 0.45f, f, width, 0.0f);
            scaleAnimation.setDuration(500L);
            AnimationSet animationSet = new AnimationSet(true);
            animationSet.addAnimation(alphaAnimation);
            animationSet.addAnimation(scaleAnimation);
            cgnVar.f5644c.execute(new cgl(cgnVar, animationSet, 5));
        }
    }

    /* JADX INFO: renamed from: j */
    public final synchronized void m3647j() {
        cgo cgoVar;
        nbz nbzVar = nch.f41987a;
        synchronized (this.f5633l) {
            cgoVar = this.f5638q;
            this.f5638q = null;
        }
        if (cgoVar != null) {
            cgoVar.close();
        }
        if (this.f5634m.mo16813g()) {
            ((cgk) this.f5634m.mo16809c()).m3629d();
        }
        if (this.f5629d != null) {
            m3635m(new cei(this, 9));
        }
    }
}
