package p000;

import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class itq extends itg {

    /* JADX INFO: renamed from: a */
    private final AnimatorListenerAdapter f32154a = new itp(this);

    /* JADX INFO: renamed from: b */
    final /* synthetic */ itx f32155b;

    public itq(itx itxVar) {
        this.f32155b = itxVar;
    }

    @Override // p000.itg
    /* JADX INFO: renamed from: a */
    public void mo11674a() {
        mo11688r();
    }

    @Override // p000.itg
    /* JADX INFO: renamed from: b */
    public void mo11675b() {
    }

    @Override // p000.itg
    /* JADX INFO: renamed from: c */
    public void mo11676c() {
    }

    @Override // p000.itg
    /* JADX INFO: renamed from: d */
    public void mo11677d(float f, int i) {
        itx itxVar = this.f32155b;
        itxVar.m11787J(itx.m11776I(i), ((Float) itxVar.f32198j.mo3831be()).floatValue(), f);
        itx itxVar2 = this.f32155b;
        itxVar2.f32204p.setFloatValues(((Float) itxVar2.f32198j.mo3831be()).floatValue(), f);
        this.f32155b.f32204p.start();
    }

    @Override // p000.itg, p000.hjn, p000.hjo
    /* JADX INFO: renamed from: f */
    public final void mo5711f() {
        this.f32155b.f32207s.m4556d().animate().cancel();
        this.f32155b.f32207s.m4559g().animate().cancel();
        itx itxVar = this.f32155b;
        if (!itxVar.f32167C) {
            itxVar.f32207s.m4566n().animate().cancel();
        }
        itx itxVar2 = this.f32155b;
        if (!itxVar2.f32173I) {
            itxVar2.f32207s.setVisibility(8);
        }
        if (this.f32155b.f32208t.getVisibility() == 0) {
            itx itxVar3 = this.f32155b;
            itxVar3.m11795z();
            if (itxVar3.f32212x.mo6184l(dib.f11279am)) {
                itxVar3.f32207s.m4547A(itxVar3.m11788K(((Float) itxVar3.f32198j.mo3831be()).floatValue(), itxVar3.f32177M), false);
            } else {
                itxVar3.f32207s.m4548B(itxVar3.m11788K(((Float) itxVar3.f32198j.mo3831be()).floatValue(), itxVar3.f32177M));
            }
            isp ispVar = itxVar3.f32209u;
            ispVar.m11706e(itxVar3.f32207s, ispVar.m11705d(((Float) itxVar3.f32198j.mo3831be()).floatValue()));
            itxVar3.f32209u.m11708g(itxVar3.f32207s, ((Float) itxVar3.f32198j.mo3831be()).floatValue());
            itxVar3.f32198j.mo3831be();
            AnimatorSet animatorSetM11793x = itxVar3.m11793x();
            itxVar3.f32207s.m4560h().setAlpha(0.0f);
            itxVar3.f32207s.m4556d().setVisibility(4);
            itxVar3.f32207s.m4559g().setAlpha(0.0f);
            animatorSetM11793x.end();
        }
        itx itxVar4 = this.f32155b;
        if (!itxVar4.f32167C) {
            itxVar4.m11794y().end();
        }
        this.f32155b.f32207s.m4566n().setVisibility(0);
        this.f32155b.f32207s.m4566n().setEnabled(true);
        this.f32155b.f32207s.m4560h().setVisibility(4);
        this.f32155b.f32207s.m4563k().setEnabled(false);
        this.f32155b.f32208t.setVisibility(8);
        ViewPropertyAnimator viewPropertyAnimatorAlpha = this.f32155b.f32207s.m4556d().animate().alpha(0.0f);
        itx itxVar5 = this.f32155b;
        viewPropertyAnimatorAlpha.translationX((itxVar5.f32165A + (itxVar5.f32207s.m4555c().getWidth() / 2.0f)) - (this.f32155b.f32207s.getWidth() / 2.0f)).setDuration(this.f32155b.f32214z).setInterpolator(this.f32155b.f32213y).start();
        ViewPropertyAnimator viewPropertyAnimatorAlpha2 = this.f32155b.f32207s.m4559g().animate().alpha(0.0f);
        itx itxVar6 = this.f32155b;
        viewPropertyAnimatorAlpha2.translationX((itxVar6.f32165A + (itxVar6.f32207s.m4555c().getWidth() / 2.0f)) - (this.f32155b.f32207s.getWidth() / 2.0f)).setDuration(this.f32155b.f32214z).setInterpolator(this.f32155b.f32213y).start();
        itx itxVar7 = this.f32155b;
        if (itxVar7.f32167C) {
            TextView textViewM4566n = itxVar7.f32207s.m4566n();
            textViewM4566n.setTranslationX(itxVar7.m11791v() + itxVar7.m11792w());
            textViewM4566n.setTranslationY(0.0f);
            textViewM4566n.setAlpha(1.0f);
            textViewM4566n.setVisibility(0);
            textViewM4566n.animate().translationX(0.0f).setDuration(itxVar7.f32214z).setInterpolator(itxVar7.f32213y).start();
        } else {
            int iM11792w = itxVar7.m11792w();
            ViewPropertyAnimator viewPropertyAnimatorAnimate = this.f32155b.f32207s.m4566n().animate();
            itx itxVar8 = this.f32155b;
            viewPropertyAnimatorAnimate.translationX(((itxVar8.f32165A + (itxVar8.f32166B / 2.0f)) - (itxVar8.f32207s.getWidth() / 2.0f)) - iM11792w).setDuration(this.f32155b.f32214z).setInterpolator(this.f32155b.f32213y).start();
        }
        this.f32155b.m11780B(true);
        this.f32155b.m11789L(7);
    }

    @Override // p000.itg, p000.hjn, p000.hjo
    /* JADX INFO: renamed from: g */
    public final void mo5712g() {
        itx itxVar = this.f32155b;
        if (itxVar.f32167C) {
            TextView textViewM4566n = itxVar.f32207s.m4566n();
            textViewM4566n.setTranslationX(0.0f);
            textViewM4566n.setTranslationY(0.0f);
            textViewM4566n.setAlpha(1.0f);
            textViewM4566n.setVisibility(0);
            textViewM4566n.animate().translationX(itxVar.m11791v() + itxVar.m11792w()).setDuration(itxVar.f32214z).setInterpolator(itxVar.f32213y).start();
        } else {
            itxVar.f32207s.m4566n().animate().translationX(0.0f).setDuration(this.f32155b.f32214z).setInterpolator(this.f32155b.f32213y).start();
        }
        this.f32155b.f32207s.m4556d().animate().alpha(1.0f).translationX(0.0f).setDuration(this.f32155b.f32214z).setListener(this.f32154a).setInterpolator(this.f32155b.f32213y).start();
        this.f32155b.f32207s.m4559g().animate().alpha(1.0f).translationX(0.0f).setDuration(this.f32155b.f32214z).setInterpolator(this.f32155b.f32213y).start();
        this.f32155b.m11780B(false);
    }

    @Override // p000.itg
    /* JADX INFO: renamed from: k */
    public final void mo11681k() {
        mo11691u();
    }

    @Override // p000.itg
    /* JADX INFO: renamed from: r */
    public final void mo11688r() {
        this.f32155b.f32207s.m4566n().setVisibility(8);
    }

    @Override // p000.itg
    /* JADX INFO: renamed from: u */
    public final void mo11691u() {
        this.f32155b.f32207s.setVisibility(0);
        this.f32155b.f32207s.m4566n().setVisibility(0);
    }
}
