package com.google.android.apps.camera.p014ui.views;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.camera.bottombar.C0100R;
import com.google.android.apps.camera.evcomp.AZCp.HRLmc;
import com.google.android.apps.camera.p014ui.layout.GcaLayout;
import java.util.concurrent.Callable;
import p000.afx;
import p000.cdp;
import p000.dch;
import p000.dhv;
import p000.dib;
import p000.dik;
import p000.hde;
import p000.hzj;
import p000.hzp;
import p000.hzs;
import p000.ibw;
import p000.iby;
import p000.ibz;
import p000.icb;
import p000.icc;
import p000.ihy;
import p000.ije;
import p000.ijf;
import p000.ijg;
import p000.iku;
import p000.ikw;
import p000.ilk;
import p000.kan;
import p000.kmq;
import p000.lku;
import p000.lmv;
import p000.mqu;
import p000.mrm;
import p000.nbe;
import p000.nbh;
import p000.nps;
import p000.nqf;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class ViewfinderCover extends GcaLayout implements icb, dch {

    /* JADX INFO: renamed from: i */
    private static final nbh f7287i = nbh.m17259h("com/google/android/apps/camera/ui/views/ViewfinderCover");

    /* JADX INFO: renamed from: c */
    public ImageView f7288c;

    /* JADX INFO: renamed from: d */
    public AnimatedVectorDrawable f7289d;

    /* JADX INFO: renamed from: e */
    public boolean f7290e;

    /* JADX INFO: renamed from: f */
    public Callable f7291f;

    /* JADX INFO: renamed from: g */
    public final icc f7292g;

    /* JADX INFO: renamed from: h */
    public boolean f7293h;

    /* JADX INFO: renamed from: j */
    private TextView f7294j;

    /* JADX INFO: renamed from: k */
    private final dhv f7295k;

    /* JADX WARN: Multi-variable type inference failed */
    public ViewfinderCover(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7290e = true;
        this.f7293h = false;
        this.f7292g = new icc(this);
        this.f7295k = ((cdp) context).mo3499a();
    }

    /* JADX INFO: renamed from: n */
    private final int m4487n(Rect rect) {
        Object objMo6051a = this.f7046a.mo6051a();
        if (objMo6051a != null && this.f7295k.mo6184l(dib.f11336bq)) {
            if ((((hzp) objMo6051a).f30074a.f30071g == ilk.PORTRAIT ? kan.m13874k(rect.height(), rect.width()) : kan.m13874k(rect.width(), rect.height())).equals(kan.f35487b)) {
                return getResources().getDimensionPixelSize(C0100R.dimen.viewfinder_rounded_corner_radius);
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: o */
    private static final Rect m4488o(hzp hzpVar) {
        hzj hzjVar = hzpVar.f30074a.f30073i;
        if (hzjVar.equals(hzj.SIMPLIFIED_LAYOUT) || hzjVar.equals(hzj.PHONE_LAYOUT)) {
            return hzpVar.f30075b.f30041e;
        }
        hzs hzsVar = hzpVar.f30077d;
        lku.m15662p(hzsVar);
        return hzsVar.mo10909r(hzsVar.f30087h, hzsVar.f30086g);
    }

    @Override // p000.dch
    /* JADX INFO: renamed from: a */
    public final nps mo4489a(kmq kmqVar) {
        this.f7289d = (AnimatedVectorDrawable) getResources().getDrawable(kmqVar == kmq.BACK ? C0100R.drawable.camera_front_back_animation : C0100R.drawable.camera_back_front_animation, null);
        final nqf nqfVarM17621g = nqf.m17621g();
        this.f7292g.m11059p(ikw.UNINITIALIZED, hde.f27309k, new ijf(this), new iby() { // from class: ijd
            @Override // p000.iby
            /* JADX INFO: renamed from: a */
            public final void mo11033a(ikw ikwVar) {
                nqfVarM17621g.mo14894e(null);
            }
        });
        return nqfVarM17621g;
    }

    @Override // p000.icb
    /* JADX INFO: renamed from: b */
    public final mrm mo4490b() {
        Object objMo6051a = this.f7046a.mo6051a();
        if (objMo6051a == null) {
            return mqu.f41450a;
        }
        Rect rectM4488o = m4488o((hzp) objMo6051a);
        lmv lmvVarM11034a = ibz.m11034a();
        lmvVarM11034a.m15740e(rectM4488o);
        lmvVarM11034a.m15739d(m4487n(rectM4488o));
        return mrm.m16829i(lmvVarM11034a.m15738c());
    }

    @Override // p000.icb
    /* JADX INFO: renamed from: c */
    public final mrm mo4491c() {
        try {
            return (mrm) this.f7291f.call();
        } catch (Exception e) {
            ((nbe) ((nbe) ((nbe) f7287i.m17251b()).mo17283h(e)).mo17276G((char) 4286)).mo17290o(HRLmc.BUTHmOqPkoMuoOh);
            return mqu.f41450a;
        }
    }

    @Override // p000.icb
    /* JADX INFO: renamed from: d */
    public final void mo4492d() {
        this.f7292g.m11049f();
    }

    @Override // p000.icb
    /* JADX INFO: renamed from: e */
    public final void mo4493e() {
        this.f7292g.m11050g();
    }

    @Override // p000.icb
    /* JADX INFO: renamed from: g */
    public final boolean mo4495g() {
        return this.f7290e;
    }

    @Override // p000.icb
    /* JADX INFO: renamed from: h */
    public final boolean mo4496h() {
        return true;
    }

    @Override // p000.icb
    /* JADX INFO: renamed from: i */
    public final void mo4497i() {
        icc iccVar = this.f7292g;
        iccVar.f30327w.setAlpha(0.0f);
        iccVar.m11056m();
        iccVar.f30327w.animate().alpha(1.0f).setDuration(250L).start();
    }

    /* JADX INFO: renamed from: j */
    public final void m4498j() {
        icc iccVar = this.f7292g;
        ikw ikwVar = ikw.UNINITIALIZED;
        int i = iccVar.f30303F;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        switch (i2) {
            case 0:
            case 2:
            case 3:
                iccVar.m11047d();
                return;
            case 1:
            default:
                return;
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m4499k() {
        this.f7292g.m11055l();
    }

    /* JADX INFO: renamed from: l */
    public final void m4500l(ikw ikwVar, ijg ijgVar, Runnable runnable) {
        icc iccVar = this.f7292g;
        ijgVar.getClass();
        iccVar.m11059p(ikwVar, runnable, this, new ije(ijgVar, 0));
    }

    /* JADX INFO: renamed from: m */
    public final void m4501m(ikw ikwVar, Runnable runnable) {
        this.f7292g.m11059p(ikwVar, hde.f27308j, this, new ije(runnable, 1));
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        icc iccVar = this.f7292g;
        if (!iccVar.f30315k.mo16813g()) {
            canvas.drawColor(0);
            return;
        }
        if (iccVar.f30330z > 0) {
            canvas.saveLayer(null, null, 31);
            icc.m11045c(canvas, iccVar.f30317m.f30280a, iccVar.f30330z, iccVar.f30313i);
        }
        canvas.drawBitmap(((ihy) iccVar.f30315k.mo16809c()).f31023a, iccVar.f30316l, iccVar.f30317m.f30280a, iccVar.f30311g);
        if (iccVar.f30330z > 0) {
            canvas.restore();
        }
        int i = iccVar.f30318n;
        if (i > 0) {
            iccVar.f30312h.setAlpha(i);
            icc.m11045c(canvas, iccVar.f30317m.f30280a, iccVar.f30330z, iccVar.f30312h);
        }
        if (iccVar.f30319o.mo16813g()) {
            iccVar.f30314j.post((Runnable) iccVar.f30319o.mo16809c());
            iccVar.f30319o = mqu.f41450a;
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f7288c = (ImageView) findViewById(C0100R.id.viewfinder_cover_icon);
        this.f7294j = (TextView) findViewById(C0100R.id.viewfinder_cover_title);
        icc iccVar = this.f7292g;
        iccVar.f30327w = this.f7288c;
        iccVar.f30328x = this.f7294j;
        iccVar.m11049f();
        this.f7292g.m11050g();
    }

    @Override // com.google.android.apps.camera.p014ui.layout.GcaLayout, androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        float f;
        float fHeight;
        int iRound;
        int iRound2;
        super.onLayout(z, i, i2, i3, i4);
        Object objMo6051a = this.f7046a.mo6051a();
        if (!this.f7293h || objMo6051a == null) {
            return;
        }
        hzp hzpVar = (hzp) objMo6051a;
        if (hzpVar.f30075b.f30054r) {
            return;
        }
        this.f7293h = false;
        Rect rectM4488o = m4488o(hzpVar);
        lmv lmvVarM11034a = ibz.m11034a();
        lmvVarM11034a.m15740e(rectM4488o);
        lmvVarM11034a.m15739d(m4487n(rectM4488o));
        ibz ibzVarM15738c = lmvVarM11034a.m15738c();
        icc iccVar = this.f7292g;
        if (iccVar.f30303F != 3) {
            return;
        }
        if (!mo4495g()) {
            iccVar.f30303F = 4;
            return;
        }
        iccVar.f30303F = 4;
        if (iccVar.f30315k.mo16813g()) {
            if (iccVar.f30301D != iccVar.f30300C.mo5895d()) {
                iccVar.f30301D = iccVar.f30300C.mo5895d();
                return;
            }
            float fFloatValue = ((Float) iccVar.f30321q.mo3831be()).floatValue();
            if (iccVar.f30320p <= fFloatValue) {
                iccVar.f30321q.mo3831be();
                if (ibzVarM15738c.f30280a.equals(iccVar.f30317m.f30280a)) {
                    Rect rect = iccVar.f30317m.f30280a;
                    if (iccVar.f30329y) {
                        if (iccVar.f30320p < fFloatValue || iccVar.m11058o()) {
                            Rect rect2 = iccVar.f30316l;
                            float f2 = iccVar.f30320p;
                            if (iccVar.m11058o()) {
                                fFloatValue /= 0.8f;
                            }
                            float f3 = f2 / fFloatValue;
                            int iRound3 = Math.round(rect2.width() * f3);
                            int iRound4 = Math.round(rect2.height() * f3);
                            int iCenterX = rect2.centerX();
                            int iCenterY = rect2.centerY();
                            int i5 = iRound3 / 2;
                            int i6 = iRound4 / 2;
                            Rect rect3 = new Rect(iCenterX - i5, iCenterY - i6, iCenterX + i5, iCenterY + i6);
                            if (rect3.left < 0 || rect3.top < 0) {
                                return;
                            }
                            iccVar.f30310f.cancel();
                            iccVar.f30310f = new AnimatorSet();
                            iccVar.f30310f.playTogether(icc.m11044b(iccVar.f30316l, rect3, iccVar.f30309e, new ibw(iccVar, 1)));
                            iccVar.f30310f.setDuration(300L);
                            iccVar.f30310f.start();
                            return;
                        }
                        return;
                    }
                    return;
                }
                Rect rectM11372a = ((ihy) iccVar.f30315k.mo16809c()).m11372a();
                Rect rect4 = iccVar.f30316l;
                if (!rect4.equals(rectM11372a)) {
                    if (rect4.height() > rect4.width()) {
                        iRound = rectM11372a.height();
                        iRound2 = Math.round(iRound * icc.m11043a(rect4));
                    } else {
                        int iWidth = rectM11372a.width();
                        iRound = Math.round(iWidth / icc.m11043a(rect4));
                        iRound2 = iWidth;
                    }
                    int iCenterX2 = rectM11372a.centerX();
                    int iCenterY2 = rectM11372a.centerY();
                    int i7 = iRound2 / 2;
                    int i8 = iRound / 2;
                    rect4 = new Rect(iCenterX2 - i7, iCenterY2 - i8, iCenterX2 + i7, iCenterY2 + i8);
                }
                ihy ihyVar = (ihy) iccVar.f30315k.mo16809c();
                Rect rect5 = ibzVarM15738c.f30280a;
                int iWidth2 = rect5.width();
                int i9 = ihyVar.f31024b;
                int i10 = iWidth2 / (i9 + i9);
                int iHeight = rect5.height();
                int i11 = ihyVar.f31024b;
                int i12 = iHeight / (i11 + i11);
                int iCenterX3 = rect5.centerX() / ihyVar.f31024b;
                int iCenterY3 = rect5.centerY() / ihyVar.f31024b;
                Rect rect6 = new Rect(iCenterX3 - i10, iCenterY3 - i12, iCenterX3 + i10, iCenterY3 + i12);
                float f4 = true != iccVar.m11058o() ? 1.0f : 0.8f;
                float fM11043a = icc.m11043a(rect4);
                float fM11043a2 = icc.m11043a(rect6);
                if (fM11043a2 == 0.0f) {
                    ((nbe) ((nbe) icc.f30296a.m17252c()).mo17276G((char) 4092)).mo17293r("Invalid aspect ratio in fitToRect: %s", rect6);
                } else {
                    if (fM11043a2 < fM11043a) {
                        fHeight = rect4.height();
                        f = fM11043a2 * fHeight;
                    } else {
                        float fWidth = rect4.width();
                        float f5 = fWidth / fM11043a2;
                        f = fWidth;
                        fHeight = f5;
                    }
                    int iCenterX4 = rect4.centerX();
                    int iCenterY4 = rect4.centerY();
                    float f6 = (fHeight / 2.0f) * f4;
                    int iRound5 = Math.round((f / 2.0f) * f4);
                    int iRound6 = Math.round(f6);
                    rect4 = new Rect(iCenterX4 - iRound5, iCenterY4 - iRound6, iCenterX4 + iRound5, iCenterY4 + iRound6);
                }
                iccVar.f30310f.cancel();
                iccVar.f30310f = new AnimatorSet();
                AnimatorSet animatorSet = iccVar.f30310f;
                int i13 = iccVar.f30317m.f30281b;
                int i14 = ibzVarM15738c.f30281b;
                DecelerateInterpolator decelerateInterpolator = new DecelerateInterpolator();
                afx afxVar = new afx(iccVar, 19);
                ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i13, i14);
                valueAnimatorOfInt.setInterpolator(decelerateInterpolator);
                valueAnimatorOfInt.addUpdateListener(afxVar);
                animatorSet.playTogether(icc.m11044b(iccVar.f30317m.f30280a, ibzVarM15738c.f30280a, iccVar.f30309e, new ibw(iccVar, 0)), icc.m11044b(iccVar.f30316l, rect4, iccVar.f30309e, new ibw(iccVar, 2)), valueAnimatorOfInt);
                iccVar.f30310f.setDuration(300L);
                iccVar.f30310f.start();
            }
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // p000.icb
    /* JADX INFO: renamed from: f */
    public final void mo4494f(ikw ikwVar) {
        ImageView imageView = this.f7288c;
        String string = null;
        Drawable drawableM11412a = (ikwVar == null || ikwVar == ikw.UNINITIALIZED) ? null : iku.m11410b(ikwVar).m11412a(getResources());
        imageView.setImageDrawable(drawableM11412a);
        if (ikwVar != null && ikwVar != ikw.UNINITIALIZED) {
            string = iku.m11410b(ikwVar).m11414d(getResources());
        }
        if (ikwVar == ikw.MOTION_BLUR) {
            Resources resources = getContext().getResources();
            if (!this.f7295k.mo6184l(dik.f11608f) && ((Integer) this.f7295k.mo6173a(dik.f11606d).get()).intValue() == 1) {
                string = resources.getString(C0100R.string.mode_motion_blur_long_exposure);
            }
        }
        this.f7294j.setText(string);
    }
}
