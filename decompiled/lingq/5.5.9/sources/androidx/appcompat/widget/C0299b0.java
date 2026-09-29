package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.ToggleButton;

/* JADX INFO: renamed from: androidx.appcompat.widget.b0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0299b0 extends ToggleButton {

    /* JADX INFO: renamed from: a */
    public final C0304d f1130a;

    /* JADX INFO: renamed from: b */
    public final C0350x f1131b;

    /* JADX INFO: renamed from: c */
    public C0324k f1132c;

    public C0299b0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.buttonStyleToggle);
        C0349w0.m1279a(getContext(), this);
        C0304d c0304d = new C0304d(this);
        this.f1130a = c0304d;
        c0304d.m1128d(attributeSet, R.attr.buttonStyleToggle);
        C0350x c0350x = new C0350x(this);
        this.f1131b = c0350x;
        c0350x.m1288f(attributeSet, R.attr.buttonStyleToggle);
        getEmojiTextViewHelper().m1233b(attributeSet, R.attr.buttonStyleToggle);
    }

    private C0324k getEmojiTextViewHelper() {
        if (this.f1132c == null) {
            this.f1132c = new C0324k(this);
        }
        return this.f1132c;
    }

    @Override // android.widget.ToggleButton, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0304d c0304d = this.f1130a;
        if (c0304d != null) {
            c0304d.m1125a();
        }
        C0350x c0350x = this.f1131b;
        if (c0350x != null) {
            c0350x.m1285b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0304d c0304d = this.f1130a;
        if (c0304d != null) {
            return c0304d.m1126b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0304d c0304d = this.f1130a;
        if (c0304d != null) {
            return c0304d.m1127c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f1131b.m1286d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f1131b.m1287e();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().m1234c(z10);
    }

    @Override // android.widget.ToggleButton, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0304d c0304d = this.f1130a;
        if (c0304d != null) {
            c0304d.m1129e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        C0304d c0304d = this.f1130a;
        if (c0304d != null) {
            c0304d.m1130f(i10);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0350x c0350x = this.f1131b;
        if (c0350x != null) {
            c0350x.m1285b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0350x c0350x = this.f1131b;
        if (c0350x != null) {
            c0350x.m1285b();
        }
    }

    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().m1235d(z10);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().m1232a(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0304d c0304d = this.f1130a;
        if (c0304d != null) {
            c0304d.m1132h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0304d c0304d = this.f1130a;
        if (c0304d != null) {
            c0304d.m1133i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C0350x c0350x = this.f1131b;
        c0350x.m1293k(colorStateList);
        c0350x.m1285b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C0350x c0350x = this.f1131b;
        c0350x.m1294l(mode);
        c0350x.m1285b();
    }
}
