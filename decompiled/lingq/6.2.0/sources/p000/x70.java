package p000;

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
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.google.android.material.R$attr;
import com.google.android.material.R$string;
import com.google.android.material.R$style;
import com.google.android.material.badge.BadgeState$State;
import java.lang.ref.WeakReference;
import java.text.NumberFormat;

/* JADX INFO: loaded from: classes.dex */
public final class x70 extends Drawable implements zt9 {

    /* JADX INFO: renamed from: I */
    public static final int f67850I = R$style.Widget_MaterialComponents_Badge;

    /* JADX INFO: renamed from: J */
    public static final int f67851J = R$attr.badgeStyle;

    /* JADX INFO: renamed from: H */
    public WeakReference f67852H;

    /* JADX INFO: renamed from: a */
    public final WeakReference f67853a;

    /* JADX INFO: renamed from: b */
    public final fs5 f67854b;

    /* JADX INFO: renamed from: c */
    public final au9 f67855c;

    /* JADX INFO: renamed from: d */
    public final Rect f67856d;

    /* JADX INFO: renamed from: e */
    public final c80 f67857e;

    /* JADX INFO: renamed from: f */
    public float f67858f;

    /* JADX INFO: renamed from: g */
    public float f67859g;

    /* JADX INFO: renamed from: h */
    public final int f67860h;

    /* JADX INFO: renamed from: i */
    public float f67861i;

    /* JADX INFO: renamed from: j */
    public float f67862j;

    /* JADX INFO: renamed from: k */
    public float f67863k;

    /* JADX INFO: renamed from: l */
    public WeakReference f67864l;

    public x70(Context context, BadgeState$State badgeState$State) {
        us9 us9Var;
        WeakReference weakReference = new WeakReference(context);
        this.f67853a = weakReference;
        dy9.m10750c(context, dy9.f36427b, "Theme.MaterialComponents");
        this.f67856d = new Rect();
        au9 au9Var = new au9(this);
        this.f67855c = au9Var;
        Paint.Align align = Paint.Align.CENTER;
        TextPaint textPaint = au9Var.f7523a;
        textPaint.setTextAlign(align);
        c80 c80Var = new c80(context, badgeState$State);
        this.f67857e = c80Var;
        boolean zM24329f = m24329f();
        BadgeState$State badgeState$State2 = c80Var.f9687b;
        fs5 fs5Var = new fs5(r39.m20280g(context, zM24329f ? badgeState$State2.f12638g.intValue() : badgeState$State2.f12636e.intValue(), m24329f() ? badgeState$State2.f12639h.intValue() : badgeState$State2.f12637f.intValue()).m19627a());
        this.f67854b = fs5Var;
        m24331h();
        Context context2 = (Context) weakReference.get();
        if (context2 != null && au9Var.f7529g != (us9Var = new us9(context2, badgeState$State2.f12635d.intValue()))) {
            au9Var.m3068c(us9Var, context2);
            textPaint.setColor(badgeState$State2.f12634c.intValue());
            invalidateSelf();
            m24333j();
            invalidateSelf();
        }
        int i = badgeState$State2.f12643l;
        if (i != -2) {
            this.f67860h = ((int) Math.pow(10.0d, ((double) i) - 1.0d)) - 1;
        } else {
            this.f67860h = badgeState$State2.f12613H;
        }
        au9Var.f7527e = true;
        m24333j();
        invalidateSelf();
        au9Var.f7527e = true;
        m24331h();
        m24333j();
        invalidateSelf();
        textPaint.setAlpha(getAlpha());
        invalidateSelf();
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(badgeState$State2.f12633b.intValue());
        if (fs5Var.f39578b.f36162c != colorStateListValueOf) {
            fs5Var.m12076t(colorStateListValueOf);
            invalidateSelf();
        }
        textPaint.setColor(badgeState$State2.f12634c.intValue());
        invalidateSelf();
        WeakReference weakReference2 = this.f67864l;
        if (weakReference2 != null && weakReference2.get() != null) {
            View view = (View) this.f67864l.get();
            WeakReference weakReference3 = this.f67852H;
            m24332i(view, weakReference3 != null ? (FrameLayout) weakReference3.get() : null);
        }
        m24333j();
        setVisible(badgeState$State2.f12620O.booleanValue(), false);
    }

    @Override // p000.zt9
    /* JADX INFO: renamed from: a */
    public final void mo11471a() {
        invalidateSelf();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public final void m24325b(View view, View view2) {
        float y;
        float x;
        ViewParent parent;
        boolean z;
        FrameLayout frameLayoutM24327d = m24327d();
        if (frameLayoutM24327d == null) {
            float y2 = view.getY();
            x = view.getX();
            parent = view.getParent();
            y = y2;
        } else {
            y = 0.0f;
            x = 0.0f;
            parent = frameLayoutM24327d;
        }
        while (true) {
            z = parent instanceof View;
            if (!z || parent == view2) {
                break;
            }
            ViewParent parent2 = parent.getParent();
            if (!(parent2 instanceof ViewGroup) || ((ViewGroup) parent2).getClipChildren()) {
                break;
            }
            View view3 = (View) parent;
            y += view3.getY();
            x += view3.getX();
            parent = parent.getParent();
        }
        if (z) {
            float f = (this.f67859g - this.f67863k) + y;
            float f2 = (this.f67858f - this.f67862j) + x;
            View view4 = (View) parent;
            float height = ((this.f67859g + this.f67863k) - view4.getHeight()) + y;
            float width = ((this.f67858f + this.f67862j) - view4.getWidth()) + x;
            if (f < 0.0f) {
                this.f67859g = Math.abs(f) + this.f67859g;
            }
            if (f2 < 0.0f) {
                this.f67858f = Math.abs(f2) + this.f67858f;
            }
            if (height > 0.0f) {
                this.f67859g -= Math.abs(height);
            }
            if (width > 0.0f) {
                this.f67858f -= Math.abs(width);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final String m24326c() {
        c80 c80Var = this.f67857e;
        boolean zM4399a = c80Var.m4399a();
        BadgeState$State badgeState$State = c80Var.f9687b;
        WeakReference weakReference = this.f67853a;
        if (!zM4399a) {
            if (!m24330g()) {
                return null;
            }
            int i = this.f67860h;
            if (i == -2 || m24328e() <= i) {
                return NumberFormat.getInstance(badgeState$State.f12614I).format(m24328e());
            }
            Context context = (Context) weakReference.get();
            return context == null ? "" : String.format(badgeState$State.f12614I, context.getString(R$string.mtrl_exceed_max_badge_number_suffix), Integer.valueOf(i), "+");
        }
        BadgeState$State badgeState$State2 = c80Var.f9687b;
        String str = badgeState$State2.f12641j;
        int i2 = badgeState$State2.f12643l;
        if (i2 == -2 || str == null || str.length() <= i2) {
            return str;
        }
        Context context2 = (Context) weakReference.get();
        if (context2 == null) {
            return "";
        }
        return String.format(context2.getString(R$string.m3_exceed_max_badge_text_suffix), str.substring(0, i2 - 1), "…");
    }

    /* JADX INFO: renamed from: d */
    public final FrameLayout m24327d() {
        WeakReference weakReference = this.f67852H;
        if (weakReference != null) {
            return (FrameLayout) weakReference.get();
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        String strM24326c;
        if (getBounds().isEmpty() || getAlpha() == 0 || !isVisible()) {
            return;
        }
        this.f67854b.draw(canvas);
        if (!m24329f() || (strM24326c = m24326c()) == null) {
            return;
        }
        Rect rect = new Rect();
        au9 au9Var = this.f67855c;
        au9Var.f7523a.getTextBounds(strM24326c, 0, strM24326c.length(), rect);
        float fExactCenterY = this.f67859g - rect.exactCenterY();
        canvas.drawText(strM24326c, this.f67858f, rect.bottom <= 0 ? (int) fExactCenterY : Math.round(fExactCenterY), au9Var.f7523a);
    }

    /* JADX INFO: renamed from: e */
    public final int m24328e() {
        int i = this.f67857e.f9687b.f12642k;
        if (i != -1) {
            return i;
        }
        return 0;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m24329f() {
        return this.f67857e.m4399a() || m24330g();
    }

    /* JADX INFO: renamed from: g */
    public final boolean m24330g() {
        c80 c80Var = this.f67857e;
        return (c80Var.m4399a() || c80Var.f9687b.f12642k == -1) ? false : true;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f67857e.f9687b.f12640i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f67856d.height();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f67856d.width();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    /* JADX INFO: renamed from: h */
    public final void m24331h() {
        Context context = (Context) this.f67853a.get();
        if (context == null) {
            return;
        }
        boolean zM24329f = m24329f();
        c80 c80Var = this.f67857e;
        this.f67854b.setShapeAppearanceModel(r39.m20280g(context, zM24329f ? c80Var.f9687b.f12638g.intValue() : c80Var.f9687b.f12636e.intValue(), m24329f() ? c80Var.f9687b.f12639h.intValue() : c80Var.f9687b.f12637f.intValue()).m19627a());
        invalidateSelf();
    }

    /* JADX INFO: renamed from: i */
    public final void m24332i(View view, FrameLayout frameLayout) {
        this.f67864l = new WeakReference(view);
        this.f67852H = new WeakReference(frameLayout);
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
        m24333j();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x0110 A[PHI: r13
      0x0110: PHI (r13v2 int) = (r13v1 int), (r13v8 int) binds: [B:41:0x00dc, B:43:0x00ea] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: j */
    public final void m24333j() {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        WeakReference weakReference = this.f67853a;
        Context context = (Context) weakReference.get();
        WeakReference weakReference2 = this.f67864l;
        View view = weakReference2 != null ? (View) weakReference2.get() : null;
        if (context == null || view == null) {
            return;
        }
        Rect rect = new Rect();
        Rect rect2 = this.f67856d;
        rect.set(rect2);
        Rect rect3 = new Rect();
        view.getDrawingRect(rect3);
        WeakReference weakReference3 = this.f67852H;
        ViewGroup viewGroup = weakReference3 != null ? (ViewGroup) weakReference3.get() : null;
        if (viewGroup != null) {
            viewGroup.offsetDescendantRectToMyCoords(view, rect3);
        }
        boolean zM24329f = m24329f();
        c80 c80Var = this.f67857e;
        float f7 = zM24329f ? c80Var.f9689d : c80Var.f9688c;
        this.f67861i = f7;
        if (f7 != -1.0f) {
            this.f67862j = f7;
            this.f67863k = f7;
        } else {
            this.f67862j = Math.round((m24329f() ? c80Var.f9692g : c80Var.f9690e) / 2.0f);
            this.f67863k = Math.round((m24329f() ? c80Var.f9693h : c80Var.f9691f) / 2.0f);
        }
        if (m24329f()) {
            String strM24326c = m24326c();
            float f8 = this.f67862j;
            au9 au9Var = this.f67855c;
            this.f67862j = Math.max(f8, (au9Var.m3066a(strM24326c) / 2.0f) + c80Var.f9687b.f12621P.intValue());
            float f9 = this.f67863k;
            if (au9Var.f7527e) {
                au9Var.m3067b(strM24326c);
            }
            float fMax = Math.max(f9, (au9Var.f7526d / 2.0f) + c80Var.f9687b.f12622Q.intValue());
            this.f67863k = fMax;
            this.f67862j = Math.max(this.f67862j, fMax);
        }
        BadgeState$State badgeState$State = c80Var.f9687b;
        BadgeState$State badgeState$State2 = c80Var.f9687b;
        int i = c80Var.f9696k;
        int iIntValue = badgeState$State.f12624S.intValue();
        if (m24329f()) {
            iIntValue = badgeState$State.f12626U.intValue();
            Context context2 = (Context) weakReference.get();
            if (context2 != null) {
                iIntValue = AbstractC0853cn.m4880c(iIntValue, AbstractC0853cn.m4879b(0.0f, 1.0f, 0.3f, 1.0f, context2.getResources().getConfiguration().fontScale - 1.0f), iIntValue - badgeState$State.f12629X.intValue());
            }
        }
        if (i == 0) {
            iIntValue -= Math.round(this.f67863k);
        }
        int iIntValue2 = badgeState$State.f12628W.intValue() + iIntValue;
        int iIntValue3 = badgeState$State2.f12619N.intValue();
        if (iIntValue3 == 8388691 || iIntValue3 == 8388693) {
            this.f67859g = rect3.bottom - iIntValue2;
        } else {
            this.f67859g = rect3.top + iIntValue2;
        }
        int iIntValue4 = m24329f() ? badgeState$State.f12625T.intValue() : badgeState$State2.f12623R.intValue();
        if (i == 1) {
            iIntValue4 += m24329f() ? c80Var.f9695j : c80Var.f9694i;
        }
        int iIntValue5 = badgeState$State.f12627V.intValue() + iIntValue4;
        int iIntValue6 = badgeState$State2.f12619N.intValue();
        if (iIntValue6 == 8388659 || iIntValue6 == 8388691) {
            if (c80Var.f9697l == 0) {
                if (view.getLayoutDirection() == 0) {
                    f = rect3.left + this.f67862j;
                    f2 = (this.f67863k * 2.0f) - iIntValue5;
                    f3 = f - f2;
                } else {
                    f3 = (rect3.right - this.f67862j) + ((this.f67863k * 2.0f) - iIntValue5);
                }
            } else if (view.getLayoutDirection() == 0) {
                f3 = (rect3.left - this.f67862j) + iIntValue5;
            } else {
                f = rect3.right + this.f67862j;
                f2 = iIntValue5;
                f3 = f - f2;
            }
            this.f67858f = f3;
        } else {
            if (c80Var.f9697l == 0) {
                if (view.getLayoutDirection() == 0) {
                    f4 = rect3.right + this.f67862j;
                    f5 = iIntValue5;
                    f6 = f4 - f5;
                } else {
                    f6 = (rect3.left - this.f67862j) + iIntValue5;
                }
            } else if (view.getLayoutDirection() == 0) {
                f6 = (rect3.right - this.f67862j) + ((this.f67863k * 2.0f) - iIntValue5);
            } else {
                f4 = rect3.left + this.f67862j;
                f5 = (this.f67863k * 2.0f) - iIntValue5;
                f6 = f4 - f5;
            }
            this.f67858f = f6;
        }
        if (badgeState$State.f12630Y.booleanValue()) {
            ViewParent viewParentM24327d = m24327d();
            if (viewParentM24327d == null) {
                viewParentM24327d = view.getParent();
            }
            if ((viewParentM24327d instanceof View) && (viewParentM24327d.getParent() instanceof View)) {
                m24325b(view, (View) viewParentM24327d.getParent());
            }
        } else {
            m24325b(view, null);
        }
        float f10 = this.f67858f;
        float f11 = this.f67859g;
        float f12 = this.f67862j;
        float f13 = this.f67863k;
        rect2.set((int) (f10 - f12), (int) (f11 - f13), (int) (f10 + f12), (int) (f11 + f13));
        float f14 = this.f67861i;
        fs5 fs5Var = this.f67854b;
        if (f14 != -1082130432) {
            fs5Var.setShapeAppearanceModel(fs5Var.f39578b.f36160a.mo13917a(f14));
        }
        if (rect.equals(rect2)) {
            return;
        }
        fs5Var.setBounds(rect2);
    }

    @Override // android.graphics.drawable.Drawable, p000.zt9
    public final boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        c80 c80Var = this.f67857e;
        c80Var.f9686a.f12640i = i;
        c80Var.f9687b.f12640i = i;
        this.f67855c.f7523a.setAlpha(getAlpha());
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
