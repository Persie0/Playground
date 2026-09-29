package p000;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.ToggleButton;

/* JADX INFO: renamed from: lr */
/* JADX INFO: loaded from: classes2.dex */
public final class C3308lr extends ToggleButton {

    /* JADX INFO: renamed from: a */
    public final C3488q8 f50022a;

    /* JADX INFO: renamed from: b */
    public final C2937dr f50023b;

    /* JADX INFO: renamed from: c */
    public C2973eq f50024c;

    public C3308lr(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.buttonStyleToggle);
        oz9.m18842a(this, getContext());
        C3488q8 c3488q8 = new C3488q8(this);
        this.f50022a = c3488q8;
        c3488q8.m19756y(attributeSet, R.attr.buttonStyleToggle);
        C2937dr c2937dr = new C2937dr(this);
        this.f50023b = c2937dr;
        c2937dr.m10598f(attributeSet, R.attr.buttonStyleToggle);
        getEmojiTextViewHelper().m11316b(attributeSet, R.attr.buttonStyleToggle);
    }

    private C2973eq getEmojiTextViewHelper() {
        if (this.f50024c == null) {
            this.f50024c = new C2973eq(this);
        }
        return this.f50024c;
    }

    @Override // android.widget.ToggleButton, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C3488q8 c3488q8 = this.f50022a;
        if (c3488q8 != null) {
            c3488q8.m19734b();
        }
        C2937dr c2937dr = this.f50023b;
        if (c2937dr != null) {
            c2937dr.m10595b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C3488q8 c3488q8 = this.f50022a;
        if (c3488q8 != null) {
            return c3488q8.m19753v();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C3488q8 c3488q8 = this.f50022a;
        if (c3488q8 != null) {
            return c3488q8.m19754w();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f50023b.m10596d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f50023b.m10597e();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().m11317c(z);
    }

    @Override // android.widget.ToggleButton, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C3488q8 c3488q8 = this.f50022a;
        if (c3488q8 != null) {
            c3488q8.m19715A();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C3488q8 c3488q8 = this.f50022a;
        if (c3488q8 != null) {
            c3488q8.m19716B(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C2937dr c2937dr = this.f50023b;
        if (c2937dr != null) {
            c2937dr.m10595b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C2937dr c2937dr = this.f50023b;
        if (c2937dr != null) {
            c2937dr.m10595b();
        }
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().m11318d(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().m11315a(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C3488q8 c3488q8 = this.f50022a;
        if (c3488q8 != null) {
            c3488q8.m19726L(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C3488q8 c3488q8 = this.f50022a;
        if (c3488q8 != null) {
            c3488q8.m19727M(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C2937dr c2937dr = this.f50023b;
        c2937dr.m10600h(colorStateList);
        c2937dr.m10595b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C2937dr c2937dr = this.f50023b;
        c2937dr.m10601i(mode);
        c2937dr.m10595b();
    }
}
