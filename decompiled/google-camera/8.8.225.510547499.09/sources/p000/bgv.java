package p000;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import com.google.android.apps.camera.smarts.ScBZ.IuyLAqNmW;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bgv extends Drawable implements Drawable.Callback, Animatable {

    /* JADX INFO: renamed from: a */
    public bgm f3205a;

    /* JADX INFO: renamed from: b */
    public final bly f3206b;

    /* JADX INFO: renamed from: c */
    public float f3207c;

    /* JADX INFO: renamed from: d */
    public boolean f3208d;

    /* JADX INFO: renamed from: e */
    public boolean f3209e;

    /* JADX INFO: renamed from: f */
    public bit f3210f;

    /* JADX INFO: renamed from: g */
    public String f3211g;

    /* JADX INFO: renamed from: h */
    public boolean f3212h;

    /* JADX INFO: renamed from: i */
    public bkd f3213i;

    /* JADX INFO: renamed from: j */
    public drj f3214j;

    /* JADX INFO: renamed from: k */
    private final Matrix f3215k = new Matrix();

    /* JADX INFO: renamed from: l */
    private final ArrayList f3216l;

    /* JADX INFO: renamed from: m */
    private final ValueAnimator.AnimatorUpdateListener f3217m;

    /* JADX INFO: renamed from: n */
    private int f3218n;

    /* JADX INFO: renamed from: o */
    private final boolean f3219o;

    /* JADX INFO: renamed from: p */
    private boolean f3220p;

    public bgv() {
        bly blyVar = new bly();
        this.f3206b = blyVar;
        this.f3207c = 1.0f;
        this.f3208d = true;
        this.f3209e = false;
        this.f3216l = new ArrayList();
        afx afxVar = new afx(this, 2);
        this.f3217m = afxVar;
        this.f3218n = 255;
        this.f3219o = true;
        this.f3220p = false;
        blyVar.addUpdateListener(afxVar);
    }

    /* JADX INFO: renamed from: t */
    private final boolean m2432t() {
        return this.f3208d || this.f3209e;
    }

    /* JADX INFO: renamed from: u */
    private static final float m2433u(Rect rect) {
        return rect.width() / rect.height();
    }

    /* JADX INFO: renamed from: a */
    public final float m2434a() {
        return this.f3206b.m2683d();
    }

    /* JADX INFO: renamed from: b */
    public final float m2435b() {
        return this.f3206b.m2684e();
    }

    /* JADX INFO: renamed from: c */
    public final float m2436c() {
        return this.f3206b.m2682c();
    }

    /* JADX INFO: renamed from: d */
    public final float m2437d() {
        return this.f3206b.f3728b;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float f;
        float f2;
        this.f3220p = false;
        bgm bgmVar = this.f3205a;
        int iSave = -1;
        if (bgmVar == null || getBounds().isEmpty() || m2433u(getBounds()) == m2433u(bgmVar.f3178g)) {
            if (this.f3213i != null) {
                float f3 = this.f3207c;
                float fMin = Math.min(canvas.getWidth() / this.f3205a.f3178g.width(), canvas.getHeight() / this.f3205a.f3178g.height());
                if (f3 > fMin) {
                    f = this.f3207c / fMin;
                } else {
                    fMin = f3;
                    f = 1.0f;
                }
                if (f > 1.0f) {
                    iSave = canvas.save();
                    float fWidth = this.f3205a.f3178g.width() / 2.0f;
                    float f4 = fWidth * fMin;
                    float fHeight = this.f3205a.f3178g.height() / 2.0f;
                    float f5 = fHeight * fMin;
                    float f6 = this.f3207c;
                    canvas.translate((fWidth * f6) - f4, (f6 * fHeight) - f5);
                    canvas.scale(f, f, f4, f5);
                }
                this.f3215k.reset();
                this.f3215k.preScale(fMin, fMin);
                this.f3213i.mo2463a(canvas, this.f3215k, this.f3218n);
                if (iSave > 0) {
                    canvas.restoreToCount(iSave);
                }
            }
        } else if (this.f3213i != null) {
            Rect bounds = getBounds();
            float fWidth2 = bounds.width() / this.f3205a.f3178g.width();
            float fHeight2 = bounds.height() / this.f3205a.f3178g.height();
            if (this.f3219o) {
                float fMin2 = Math.min(fWidth2, fHeight2);
                if (fMin2 < 1.0f) {
                    f2 = 1.0f / fMin2;
                    fWidth2 /= f2;
                    fHeight2 /= f2;
                } else {
                    f2 = 1.0f;
                }
                if (f2 > 1.0f) {
                    iSave = canvas.save();
                    float fWidth3 = bounds.width() / 2.0f;
                    float f7 = fWidth3 * fMin2;
                    float fHeight3 = bounds.height() / 2.0f;
                    float f8 = fMin2 * fHeight3;
                    canvas.translate(fWidth3 - f7, fHeight3 - f8);
                    canvas.scale(f2, f2, f7, f8);
                }
            }
            this.f3215k.reset();
            this.f3215k.preScale(fWidth2, fHeight2);
            this.f3213i.mo2463a(canvas, this.f3215k, this.f3218n);
            if (iSave > 0) {
                canvas.restoreToCount(iSave);
            }
        }
        bgh.m2413a();
    }

    /* JADX INFO: renamed from: e */
    public final int m2438e() {
        return this.f3206b.getRepeatCount();
    }

    /* JADX INFO: renamed from: f */
    public final void m2439f() {
        bgm bgmVar = this.f3205a;
        int i = ble.f3686a;
        Rect rect = bgmVar.f3178g;
        bkf bkfVar = new bkf(Collections.emptyList(), bgmVar, "__container", -1L, 1, -1L, null, Collections.emptyList(), new bjk(null, null, null, null, null, null, null, null, null), 0, 0, 0, 0.0f, 0.0f, rect.width(), rect.height(), null, null, Collections.emptyList(), 1, null, false, null, null);
        bgm bgmVar2 = this.f3205a;
        this.f3213i = new bkd(this, bkfVar, bgmVar2.f3177f, bgmVar2);
    }

    /* JADX INFO: renamed from: g */
    public final void m2440g() {
        this.f3216l.clear();
        this.f3206b.cancel();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f3218n;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        bgm bgmVar = this.f3205a;
        if (bgmVar == null) {
            return -1;
        }
        return (int) (bgmVar.f3178g.height() * this.f3207c);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        bgm bgmVar = this.f3205a;
        if (bgmVar == null) {
            return -1;
        }
        return (int) (bgmVar.f3178g.width() * this.f3207c);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    /* JADX INFO: renamed from: h */
    public final void m2441h() {
        bly blyVar = this.f3206b;
        if (blyVar.f3735i) {
            blyVar.cancel();
        }
        this.f3205a = null;
        this.f3213i = null;
        this.f3210f = null;
        bly blyVar2 = this.f3206b;
        blyVar2.f3734h = null;
        blyVar2.f3732f = -2.1474836E9f;
        blyVar2.f3733g = 2.1474836E9f;
        invalidateSelf();
    }

    /* JADX INFO: renamed from: i */
    public final void m2442i() {
        this.f3216l.clear();
        this.f3206b.m2685f();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        if (this.f3220p) {
            return;
        }
        this.f3220p = true;
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return m2449p();
    }

    /* JADX INFO: renamed from: j */
    public final void m2443j() {
        this.f3216l.clear();
        this.f3206b.m2687h();
    }

    /* JADX INFO: renamed from: k */
    public final void m2444k() {
        if (this.f3213i == null) {
            this.f3216l.add(new bgt(this, 1));
            return;
        }
        if (m2432t() || m2438e() == 0) {
            bly blyVar = this.f3206b;
            blyVar.f3735i = true;
            boolean zM2692m = blyVar.m2692m();
            Iterator it = blyVar.f3723a.iterator();
            while (it.hasNext()) {
                ((Animator.AnimatorListener) it.next()).onAnimationStart(blyVar, zM2692m);
            }
            blyVar.m2690k((int) (blyVar.m2692m() ? blyVar.m2683d() : blyVar.m2684e()));
            blyVar.f3729c = 0L;
            blyVar.f3731e = 0;
            blyVar.m2686g();
        }
        if (m2432t()) {
            return;
        }
        m2446m((int) (m2437d() < 0.0f ? m2435b() : m2434a()));
        this.f3206b.m2685f();
    }

    /* JADX INFO: renamed from: l */
    public final void m2445l() {
        float fM2684e;
        if (this.f3213i == null) {
            this.f3216l.add(new bgt(this, 0));
            return;
        }
        if (m2432t() || m2438e() == 0) {
            bly blyVar = this.f3206b;
            blyVar.f3735i = true;
            blyVar.m2686g();
            blyVar.f3729c = 0L;
            if (blyVar.m2692m() && blyVar.f3730d == blyVar.m2684e()) {
                fM2684e = blyVar.m2683d();
            } else if (!blyVar.m2692m() && blyVar.f3730d == blyVar.m2683d()) {
                fM2684e = blyVar.m2684e();
            }
            blyVar.f3730d = fM2684e;
        }
        if (m2432t()) {
            return;
        }
        m2446m((int) (m2437d() < 0.0f ? m2435b() : m2434a()));
        this.f3206b.m2685f();
    }

    /* JADX INFO: renamed from: m */
    public final void m2446m(int i) {
        if (this.f3205a == null) {
            this.f3216l.add(new bgq(this, i));
        } else {
            this.f3206b.m2690k(i);
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m2447n(float f) {
        bgm bgmVar = this.f3205a;
        if (bgmVar == null) {
            this.f3216l.add(new bgr(this, f));
            return;
        }
        bly blyVar = this.f3206b;
        float f2 = bgmVar.f3179h;
        float f3 = bgmVar.f3180i;
        PointF pointF = blz.f3737a;
        blyVar.m2690k(f2 + (f * (f3 - f2)));
        bgh.m2413a();
    }

    /* JADX INFO: renamed from: o */
    public final void m2448o(int i) {
        this.f3206b.setRepeatCount(i);
    }

    /* JADX INFO: renamed from: p */
    public final boolean m2449p() {
        bly blyVar = this.f3206b;
        if (blyVar == null) {
            return false;
        }
        return blyVar.f3735i;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m2450q(bgm bgmVar) {
        float fMax;
        float fMin;
        if (this.f3205a == bgmVar) {
            return false;
        }
        this.f3220p = false;
        m2441h();
        this.f3205a = bgmVar;
        m2439f();
        bly blyVar = this.f3206b;
        bgm bgmVar2 = blyVar.f3734h;
        blyVar.f3734h = bgmVar;
        if (bgmVar2 == null) {
            fMax = (int) Math.max(blyVar.f3732f, bgmVar.f3179h);
            fMin = (int) Math.min(blyVar.f3733g, bgmVar.f3180i);
        } else {
            fMax = (int) bgmVar.f3179h;
            fMin = (int) bgmVar.f3180i;
        }
        blyVar.m2691l(fMax, fMin);
        float f = blyVar.f3730d;
        blyVar.f3730d = 0.0f;
        blyVar.m2690k((int) f);
        blyVar.m2679b();
        m2447n(this.f3206b.getAnimatedFraction());
        Iterator it = new ArrayList(this.f3216l).iterator();
        while (it.hasNext()) {
            bgu bguVar = (bgu) it.next();
            if (bguVar != null) {
                bguVar.mo2431a();
            }
            it.remove();
        }
        this.f3216l.clear();
        bzq bzqVar = bgmVar.f3183l;
        Drawable.Callback callback = getCallback();
        if (!(callback instanceof ImageView)) {
            return true;
        }
        ImageView imageView = (ImageView) callback;
        imageView.setImageDrawable(null);
        imageView.setImageDrawable(this);
        return true;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m2451r() {
        return this.f3205a.f3175d.m19563b() > 0;
    }

    /* JADX INFO: renamed from: s */
    public final void m2452s(biw biwVar, Object obj, bko bkoVar) {
        bkd bkdVar = this.f3213i;
        if (bkdVar == null) {
            this.f3216l.add(new bgs(this, biwVar, obj, bkoVar, null));
            return;
        }
        if (biwVar == biw.f3464a) {
            bkdVar.mo2468f(obj, bkoVar);
        } else {
            bix bixVar = biwVar.f3465b;
            if (bixVar != null) {
                bixVar.mo2468f(obj, bkoVar);
            } else {
                ArrayList arrayList = new ArrayList();
                this.f3213i.mo2466d(biwVar, 0, arrayList, new biw(new String[0]));
                for (int i = 0; i < arrayList.size(); i++) {
                    ((biw) arrayList.get(i)).f3465b.mo2468f(obj, bkoVar);
                }
                if (arrayList.isEmpty()) {
                    return;
                }
            }
        }
        invalidateSelf();
        if (obj == bha.f3231C) {
            m2447n(m2436c());
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.scheduleDrawable(this, runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f3218n = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        blx.m2680a(IuyLAqNmW.uDXhteaxpyDb);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable.Callback callback = getCallback();
        if (!(callback instanceof View) || ((View) callback).isInEditMode()) {
            return;
        }
        m2444k();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        m2442i();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.unscheduleDrawable(this, runnable);
    }
}
