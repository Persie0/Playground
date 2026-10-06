package p000;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.ImageButton;
import android.widget.SeekBar;
import com.google.android.apps.camera.bottombar.C0100R;
import com.google.android.apps.camera.whitebalance.ManualWhiteBalanceKnob;
import com.google.android.apps.camera.whitebalance.ManualWhiteBalanceUi;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class irs implements isb, kba {

    /* JADX INFO: renamed from: a */
    public static final nbh f31934a = nbh.m17259h("com/google/android/apps/camera/whitebalance/ManualWhiteBalanceControllerImpl");

    /* JADX INFO: renamed from: b */
    public final mrm f31935b;

    /* JADX INFO: renamed from: d */
    public boolean f31937d;

    /* JADX INFO: renamed from: e */
    public ImageButton f31938e;

    /* JADX INFO: renamed from: f */
    public ManualWhiteBalanceUi f31939f;

    /* JADX INFO: renamed from: g */
    public isa f31940g;

    /* JADX INFO: renamed from: h */
    private final dbr f31941h;

    /* JADX INFO: renamed from: i */
    private final jvd f31942i;

    /* JADX INFO: renamed from: j */
    private final oju f31943j;

    /* JADX INFO: renamed from: k */
    private final hxn f31944k;

    /* JADX INFO: renamed from: l */
    private final jww f31945l;

    /* JADX INFO: renamed from: m */
    private final jww f31946m;

    /* JADX INFO: renamed from: o */
    private AnimatorSet f31948o;

    /* JADX INFO: renamed from: r */
    private final cdu f31951r;

    /* JADX INFO: renamed from: s */
    private final ihk f31952s;

    /* JADX INFO: renamed from: c */
    public final jww f31936c = new jwf(false);

    /* JADX INFO: renamed from: n */
    private final jww f31947n = new jwf(false);

    /* JADX INFO: renamed from: p */
    private ilk f31949p = ilk.PORTRAIT;

    /* JADX INFO: renamed from: q */
    private boolean f31950q = false;

    public irs(cdu cduVar, dbr dbrVar, jvd jvdVar, mrm mrmVar, oju ojuVar, hxn hxnVar, jww jwwVar, jww jwwVar2, ihk ihkVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.f31951r = cduVar;
        this.f31945l = jwwVar;
        this.f31941h = dbrVar;
        this.f31942i = jvdVar;
        this.f31935b = mrmVar;
        this.f31943j = ojuVar;
        this.f31944k = hxnVar;
        this.f31952s = ihkVar;
        this.f31946m = jwwVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public final void m11658m(boolean z) {
        if (z) {
            this.f31938e.animate().setStartDelay(0L).alpha(1.0f).withStartAction(new ipa(this, 14));
        } else {
            this.f31938e.animate().setStartDelay(0L).alpha(0.0f).withEndAction(new ipa(this, 15));
        }
    }

    @Override // p000.isb
    /* JADX INFO: renamed from: a */
    public final jwn mo11659a() {
        return this.f31947n;
    }

    @Override // p000.isb
    /* JADX INFO: renamed from: b */
    public final jwn mo11660b() {
        return this.f31940g.f31970k;
    }

    @Override // p000.isb
    /* JADX INFO: renamed from: c */
    public final jwn mo11661c() {
        return this.f31936c;
    }

    @Override // p000.kba, java.lang.AutoCloseable
    public final void close() {
        this.f31947n.mo3415bf(false);
    }

    @Override // p000.isb
    /* JADX INFO: renamed from: d */
    public final void mo11662d(boolean z, boolean z2) {
        if (((Boolean) this.f31946m.mo3831be()).booleanValue()) {
            this.f31942i.m13541c(new irp(this, z2, z, 0));
        }
    }

    @Override // p000.isb
    /* JADX INFO: renamed from: e */
    public final void mo11663e(View view) {
        ManualWhiteBalanceUi manualWhiteBalanceUi = (ManualWhiteBalanceUi) view;
        this.f31939f = manualWhiteBalanceUi;
        this.f31938e = manualWhiteBalanceUi.m4520a();
        SeekBar seekBarM4521b = this.f31939f.m4521b();
        seekBarM4521b.setMax(200);
        seekBarM4521b.setOnSeekBarChangeListener(new irq(this));
        irn irnVar = new irn(this.f31939f, this.f31942i, this.f31944k, this.f31952s, null, null, null, null, null);
        this.f31940g = irnVar;
        irnVar.mo5711f();
        int i = 9;
        this.f31938e.setOnClickListener(new iec(this, i));
        if (((mrm) this.f31943j.get()).mo16813g()) {
            ((hgo) ((mrm) this.f31943j.get()).mo16809c()).mo10210a(new irr(this));
        }
        mrm mrmVar = this.f31935b;
        if (mrmVar.mo16813g()) {
            gmh gmhVar = (gmh) mrmVar.mo16809c();
            gmhVar.mo9510h(this.f31951r);
            this.f31951r.m3529i().m13537d(gmhVar.mo9503a().mo3830a(new ijp(this, 8), not.INSTANCE));
        }
        this.f31951r.m3529i().m13537d(this.f31945l.mo3830a(new ijp(this, i), not.INSTANCE));
        this.f31951r.m3529i().m13537d(this.f31941h.mo3830a(new ijp(this, 10), not.INSTANCE));
        this.f31947n.mo3415bf(true);
    }

    /* JADX INFO: renamed from: f */
    public final void m11664f() {
        ((nbe) ((nbe) f31934a.m17252c()).mo17276G((char) 4421)).mo17290o("reset()");
        m11658m(false);
        this.f31936c.mo3415bf(false);
        mrm mrmVar = this.f31935b;
        if (mrmVar.mo16813g()) {
            ((gmh) mrmVar.mo16809c()).mo9507e(false);
        }
        this.f31939f.m4521b().setProgress(100);
        this.f31940g.mo11655j();
    }

    @Override // p000.isb
    /* JADX INFO: renamed from: g */
    public final void mo11665g(ilk ilkVar, hzj hzjVar) {
        this.f31949p = ilkVar;
        ((hzb) this.f31939f.getLayoutParams()).setMargins(0, hzj.f30014d.equals(hzjVar) ? this.f31939f.getResources().getDimensionPixelSize(C0100R.dimen.manual_wb_top_margin_jarvis) : 0, 0, 0);
        this.f31939f.m4523d(ilkVar, hzjVar, (ikw) this.f31945l.mo3831be());
    }

    @Override // p000.isb
    /* JADX INFO: renamed from: h */
    public final void mo11666h(boolean z) {
        if (ilk.m11427e(this.f31949p)) {
            return;
        }
        if (this.f31948o == null) {
            float dimensionPixelSize = this.f31939f.getResources().getDimensionPixelSize(C0100R.dimen.manual_wb_slider_margin_between_timer);
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f31939f.m4521b(), (Property<SeekBar, Float>) View.TRANSLATION_X, dimensionPixelSize);
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.f31939f.m4522c(), (Property<ManualWhiteBalanceKnob, Float>) View.TRANSLATION_X, dimensionPixelSize);
            ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.f31939f.m4520a(), (Property<ImageButton, Float>) View.TRANSLATION_X, dimensionPixelSize);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setInterpolator(new LinearInterpolator());
            animatorSet.setDuration(300L);
            animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat3);
            this.f31948o = animatorSet;
        }
        if (z) {
            this.f31948o.start();
        } else {
            this.f31948o.reverse();
        }
        if (this.f31939f.getVisibility() != 0) {
            this.f31948o.end();
        }
    }

    @Override // p000.isb
    /* JADX INFO: renamed from: i */
    public final void mo11667i(boolean z, boolean z2) {
        if (((Boolean) this.f31946m.mo3831be()).booleanValue()) {
            this.f31942i.m13541c(new irp(this, z2, z, 2));
        }
    }

    @Override // p000.isb
    /* JADX INFO: renamed from: j */
    public final void mo11668j(int i) {
        isa isaVar = this.f31940g;
        if (isaVar.f31966g.getVisibility() != 0) {
            return;
        }
        isaVar.m11670k();
        isaVar.f31966g.postDelayed(isaVar.f31972m, i);
    }

    @Override // p000.isb
    /* JADX INFO: renamed from: k */
    public final void mo11669k(hzj hzjVar, ikw ikwVar) {
        boolean z = false;
        if (hzj.f30014d.equals(hzjVar) && ikwVar.f31414w) {
            z = true;
        }
        this.f31950q = z;
        boolean z2 = !hzj.f30014d.equals(hzjVar);
        isa isaVar = this.f31940g;
        boolean z3 = this.f31950q;
        if (z3 || isaVar.f31971l) {
            isaVar.f31971l = z3;
            if (z3) {
                isaVar.mo11650b(z2);
            } else {
                isaVar.mo11653ch(z2);
            }
        }
    }
}
