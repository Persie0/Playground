package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.CheckBox;
import androidx.appcompat.R$attr;

/* JADX INFO: renamed from: hp */
/* JADX INFO: loaded from: classes2.dex */
public class C3083hp extends CheckBox implements n1a {

    /* JADX INFO: renamed from: a */
    public final C3155jp f42719a;

    /* JADX INFO: renamed from: b */
    public final C3488q8 f42720b;

    /* JADX INFO: renamed from: c */
    public final C2937dr f42721c;

    /* JADX INFO: renamed from: d */
    public C2973eq f42722d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3083hp(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        k1a.m14773a(context);
        oz9.m18842a(this, getContext());
        C3155jp c3155jp = new C3155jp(this);
        this.f42719a = c3155jp;
        c3155jp.m14576c(attributeSet, i);
        C3488q8 c3488q8 = new C3488q8(this);
        this.f42720b = c3488q8;
        c3488q8.m19756y(attributeSet, i);
        C2937dr c2937dr = new C2937dr(this);
        this.f42721c = c2937dr;
        c2937dr.m10598f(attributeSet, i);
        getEmojiTextViewHelper().m11316b(attributeSet, i);
    }

    private C2973eq getEmojiTextViewHelper() {
        if (this.f42722d == null) {
            this.f42722d = new C2973eq(this);
        }
        return this.f42722d;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C3488q8 c3488q8 = this.f42720b;
        if (c3488q8 != null) {
            c3488q8.m19734b();
        }
        C2937dr c2937dr = this.f42721c;
        if (c2937dr != null) {
            c2937dr.m10595b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C3488q8 c3488q8 = this.f42720b;
        if (c3488q8 != null) {
            return c3488q8.m19753v();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C3488q8 c3488q8 = this.f42720b;
        if (c3488q8 != null) {
            return c3488q8.m19754w();
        }
        return null;
    }

    @Override // p000.n1a
    public ColorStateList getSupportButtonTintList() {
        C3155jp c3155jp = this.f42719a;
        if (c3155jp != null) {
            return c3155jp.f45940a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        C3155jp c3155jp = this.f42719a;
        if (c3155jp != null) {
            return c3155jp.f45941b;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f42721c.m10596d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f42721c.m10597e();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().m11317c(z);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C3488q8 c3488q8 = this.f42720b;
        if (c3488q8 != null) {
            c3488q8.m19715A();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C3488q8 c3488q8 = this.f42720b;
        if (c3488q8 != null) {
            c3488q8.m19716B(i);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        C3155jp c3155jp = this.f42719a;
        if (c3155jp != null) {
            if (c3155jp.f45944e) {
                c3155jp.f45944e = false;
            } else {
                c3155jp.f45944e = true;
                c3155jp.m14574a();
            }
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C2937dr c2937dr = this.f42721c;
        if (c2937dr != null) {
            c2937dr.m10595b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C2937dr c2937dr = this.f42721c;
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
        C3488q8 c3488q8 = this.f42720b;
        if (c3488q8 != null) {
            c3488q8.m19726L(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C3488q8 c3488q8 = this.f42720b;
        if (c3488q8 != null) {
            c3488q8.m19727M(mode);
        }
    }

    @Override // p000.n1a
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        C3155jp c3155jp = this.f42719a;
        if (c3155jp != null) {
            c3155jp.f45940a = colorStateList;
            c3155jp.f45942c = true;
            c3155jp.m14574a();
        }
    }

    @Override // p000.n1a
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        C3155jp c3155jp = this.f42719a;
        if (c3155jp != null) {
            c3155jp.f45941b = mode;
            c3155jp.f45943d = true;
            c3155jp.m14574a();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C2937dr c2937dr = this.f42721c;
        c2937dr.m10600h(colorStateList);
        c2937dr.m10595b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C2937dr c2937dr = this.f42721c;
        c2937dr.m10601i(mode);
        c2937dr.m10595b();
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(bna.m3932U(getContext(), i));
    }

    public C3083hp(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.checkboxStyle);
    }
}
