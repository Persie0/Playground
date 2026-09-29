package com.google.android.material.badge;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.linguist.R;
import gd.C5762a;
import gd.C5768g;
import gd.C5772k;
import java.lang.ref.WeakReference;
import java.text.NumberFormat;
import java.util.WeakHashMap;
import p072dd.C5151d;
import p471x2.C10029b0;
import p471x2.C10049l0;
import p507yc.C10341h;
import p507yc.C10344k;

/* JADX INFO: renamed from: com.google.android.material.badge.a */
/* JADX INFO: loaded from: classes.dex */
public final class C2947a extends Drawable implements C10341h.b {

    /* JADX INFO: renamed from: H */
    public WeakReference<FrameLayout> f14755H;

    /* JADX INFO: renamed from: a */
    public final WeakReference<Context> f14756a;

    /* JADX INFO: renamed from: b */
    public final C5768g f14757b;

    /* JADX INFO: renamed from: c */
    public final C10341h f14758c;

    /* JADX INFO: renamed from: d */
    public final Rect f14759d;

    /* JADX INFO: renamed from: e */
    public final BadgeState f14760e;

    /* JADX INFO: renamed from: f */
    public float f14761f;

    /* JADX INFO: renamed from: g */
    public float f14762g;

    /* JADX INFO: renamed from: h */
    public int f14763h;

    /* JADX INFO: renamed from: i */
    public float f14764i;

    /* JADX INFO: renamed from: j */
    public float f14765j;

    /* JADX INFO: renamed from: k */
    public float f14766k;

    /* JADX INFO: renamed from: l */
    public WeakReference<View> f14767l;

    public C2947a(Context context, BadgeState.State state) {
        C5151d c5151d;
        WeakReference<Context> weakReference = new WeakReference<>(context);
        this.f14756a = weakReference;
        C10344k.m19356c(context, C10344k.f52048b, "Theme.MaterialComponents");
        this.f14759d = new Rect();
        C10341h c10341h = new C10341h(this);
        this.f14758c = c10341h;
        TextPaint textPaint = c10341h.f52039a;
        textPaint.setTextAlign(Paint.Align.CENTER);
        BadgeState badgeState = new BadgeState(context, state);
        this.f14760e = badgeState;
        boolean zM8571a = badgeState.m8571a();
        BadgeState.State state2 = badgeState.f14721b;
        C5768g c5768g = new C5768g(new C5772k(C5772k.m12149a(context, zM8571a ? state2.f14749g.intValue() : state2.f14747e.intValue(), badgeState.m8571a() ? state2.f14750h.intValue() : state2.f14748f.intValue(), new C5762a(0))));
        this.f14757b = c5768g;
        m8578g();
        Context context2 = weakReference.get();
        if (context2 != null && c10341h.f52044f != (c5151d = new C5151d(context2, state2.f14746d.intValue()))) {
            c10341h.m19353b(c5151d, context2);
            textPaint.setColor(state2.f14745c.intValue());
            invalidateSelf();
            m8580i();
            invalidateSelf();
        }
        this.f14763h = ((int) Math.pow(10.0d, ((double) state2.f14753k) - 1.0d)) - 1;
        c10341h.f52042d = true;
        m8580i();
        invalidateSelf();
        c10341h.f52042d = true;
        m8578g();
        m8580i();
        invalidateSelf();
        textPaint.setAlpha(getAlpha());
        invalidateSelf();
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(state2.f14744b.intValue());
        if (c5768g.f34857a.f34872c != colorStateListValueOf) {
            c5768g.m12141m(colorStateListValueOf);
            invalidateSelf();
        }
        textPaint.setColor(state2.f14745c.intValue());
        invalidateSelf();
        WeakReference<View> weakReference2 = this.f14767l;
        if (weakReference2 != null && weakReference2.get() != null) {
            View view = this.f14767l.get();
            WeakReference<FrameLayout> weakReference3 = this.f14755H;
            m8579h(view, weakReference3 != null ? weakReference3.get() : null);
        }
        m8580i();
        setVisible(state2.f14736L.booleanValue(), false);
    }

    @Override // p507yc.C10341h.b
    /* JADX INFO: renamed from: a */
    public final void mo8572a() {
        invalidateSelf();
    }

    /* JADX INFO: renamed from: b */
    public final String m8573b() {
        int iM8576e = m8576e();
        int i10 = this.f14763h;
        BadgeState badgeState = this.f14760e;
        if (iM8576e <= i10) {
            return NumberFormat.getInstance(badgeState.f14721b.f14754l).format(m8576e());
        }
        Context context = this.f14756a.get();
        return context == null ? "" : String.format(badgeState.f14721b.f14754l, context.getString(R.string.mtrl_exceed_max_badge_number_suffix), Integer.valueOf(this.f14763h), "+");
    }

    /* JADX INFO: renamed from: c */
    public final CharSequence m8574c() {
        Context context;
        if (!isVisible()) {
            return null;
        }
        boolean zM8577f = m8577f();
        BadgeState badgeState = this.f14760e;
        if (!zM8577f) {
            return badgeState.f14721b.f14732H;
        }
        if (badgeState.f14721b.f14733I != 0 && (context = this.f14756a.get()) != null) {
            int iM8576e = m8576e();
            int i10 = this.f14763h;
            BadgeState.State state = badgeState.f14721b;
            return iM8576e <= i10 ? context.getResources().getQuantityString(state.f14733I, m8576e(), Integer.valueOf(m8576e())) : context.getString(state.f14734J, Integer.valueOf(i10));
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public final FrameLayout m8575d() {
        WeakReference<FrameLayout> weakReference = this.f14755H;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (!getBounds().isEmpty() && getAlpha() != 0) {
            if (!isVisible()) {
                return;
            }
            this.f14757b.draw(canvas);
            if (m8577f()) {
                Rect rect = new Rect();
                String strM8573b = m8573b();
                C10341h c10341h = this.f14758c;
                c10341h.f52039a.getTextBounds(strM8573b, 0, strM8573b.length(), rect);
                canvas.drawText(strM8573b, this.f14761f, this.f14762g + (rect.height() / 2), c10341h.f52039a);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final int m8576e() {
        if (m8577f()) {
            return this.f14760e.f14721b.f14752j;
        }
        return 0;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m8577f() {
        return this.f14760e.m8571a();
    }

    /* JADX INFO: renamed from: g */
    public final void m8578g() {
        Context context = this.f14756a.get();
        if (context == null) {
            return;
        }
        BadgeState badgeState = this.f14760e;
        boolean zM8571a = badgeState.m8571a();
        BadgeState.State state = badgeState.f14721b;
        this.f14757b.setShapeAppearanceModel(new C5772k(C5772k.m12149a(context, zM8571a ? state.f14749g.intValue() : state.f14747e.intValue(), badgeState.m8571a() ? state.f14750h.intValue() : state.f14748f.intValue(), new C5762a(0))));
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f14760e.f14721b.f14751i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f14759d.height();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f14759d.width();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    /* JADX INFO: renamed from: h */
    public final void m8579h(View view, FrameLayout frameLayout) {
        this.f14767l = new WeakReference<>(view);
        this.f14755H = new WeakReference<>(frameLayout);
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
        m8580i();
        invalidateSelf();
    }

    /* JADX INFO: renamed from: i */
    public final void m8580i() {
        Context context = this.f14756a.get();
        WeakReference<View> weakReference = this.f14767l;
        FrameLayout frameLayout = null;
        View view = weakReference != null ? weakReference.get() : null;
        if (context != null) {
            if (view == null) {
                return;
            }
            Rect rect = new Rect();
            Rect rect2 = this.f14759d;
            rect.set(rect2);
            Rect rect3 = new Rect();
            view.getDrawingRect(rect3);
            WeakReference<FrameLayout> weakReference2 = this.f14755H;
            if (weakReference2 != null) {
                frameLayout = weakReference2.get();
            }
            if (frameLayout != null) {
                frameLayout.offsetDescendantRectToMyCoords(view, rect3);
            }
            boolean zM8577f = m8577f();
            BadgeState badgeState = this.f14760e;
            float f3 = !zM8577f ? badgeState.f14722c : badgeState.f14723d;
            this.f14764i = f3;
            if (f3 != -1.0f) {
                this.f14766k = f3;
                this.f14765j = f3;
            } else {
                this.f14766k = Math.round((!m8577f() ? badgeState.f14725f : badgeState.f14727h) / 2.0f);
                this.f14765j = Math.round((!m8577f() ? badgeState.f14724e : badgeState.f14726g) / 2.0f);
            }
            if (m8576e() > 9) {
                this.f14765j = Math.max(this.f14765j, (this.f14758c.m19352a(m8573b()) / 2.0f) + badgeState.f14728i);
            }
            int iIntValue = m8577f() ? badgeState.f14721b.f14740P.intValue() : badgeState.f14721b.f14738N.intValue();
            if (badgeState.f14731l == 0) {
                iIntValue -= Math.round(this.f14766k);
            }
            BadgeState.State state = badgeState.f14721b;
            int iIntValue2 = state.f14742R.intValue() + iIntValue;
            int iIntValue3 = state.f14735K.intValue();
            if (iIntValue3 == 8388691 || iIntValue3 == 8388693) {
                this.f14762g = rect3.bottom - iIntValue2;
            } else {
                this.f14762g = rect3.top + iIntValue2;
            }
            int iIntValue4 = m8577f() ? state.f14739O.intValue() : state.f14737M.intValue();
            if (badgeState.f14731l == 1) {
                iIntValue4 += m8577f() ? badgeState.f14730k : badgeState.f14729j;
            }
            int iIntValue5 = state.f14741Q.intValue() + iIntValue4;
            int iIntValue6 = state.f14735K.intValue();
            if (iIntValue6 == 8388659 || iIntValue6 == 8388691) {
                WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
                this.f14761f = C10029b0.e.m18686d(view) == 0 ? (rect3.left - this.f14765j) + iIntValue5 : (rect3.right + this.f14765j) - iIntValue5;
            } else {
                WeakHashMap<View, C10049l0> weakHashMap2 = C10029b0.f50993a;
                this.f14761f = C10029b0.e.m18686d(view) == 0 ? (rect3.right + this.f14765j) - iIntValue5 : (rect3.left - this.f14765j) + iIntValue5;
            }
            float f10 = this.f14761f;
            float f11 = this.f14762g;
            float f12 = this.f14765j;
            float f13 = this.f14766k;
            rect2.set((int) (f10 - f12), (int) (f11 - f13), (int) (f10 + f12), (int) (f11 + f13));
            float f14 = this.f14764i;
            C5768g c5768g = this.f14757b;
            if (f14 != -1.0f) {
                c5768g.setShapeAppearanceModel(c5768g.f34857a.f34870a.m12153e(f14));
            }
            if (!rect.equals(rect2)) {
                c5768g.setBounds(rect2);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return false;
    }

    @Override // android.graphics.drawable.Drawable, p507yc.C10341h.b
    public final boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        BadgeState badgeState = this.f14760e;
        badgeState.f14720a.f14751i = i10;
        badgeState.f14721b.f14751i = i10;
        this.f14758c.f52039a.setAlpha(getAlpha());
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
