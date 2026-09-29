package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.RadioButton;
import com.linguist.R;
import p024b3.InterfaceC1306m;
import p104f.C5452a;

/* JADX INFO: renamed from: androidx.appcompat.widget.q */
/* JADX INFO: loaded from: classes.dex */
public class C0336q extends RadioButton implements InterfaceC1306m {

    /* JADX INFO: renamed from: a */
    public final C0316h f1312a;

    /* JADX INFO: renamed from: b */
    public final C0304d f1313b;

    /* JADX INFO: renamed from: c */
    public final C0350x f1314c;

    /* JADX INFO: renamed from: d */
    public C0324k f1315d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0336q(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.radioButtonStyle);
        C0353y0.m1309a(context);
        C0349w0.m1279a(getContext(), this);
        C0316h c0316h = new C0316h(this);
        this.f1312a = c0316h;
        c0316h.m1199b(attributeSet, R.attr.radioButtonStyle);
        C0304d c0304d = new C0304d(this);
        this.f1313b = c0304d;
        c0304d.m1128d(attributeSet, R.attr.radioButtonStyle);
        C0350x c0350x = new C0350x(this);
        this.f1314c = c0350x;
        c0350x.m1288f(attributeSet, R.attr.radioButtonStyle);
        getEmojiTextViewHelper().m1233b(attributeSet, R.attr.radioButtonStyle);
    }

    private C0324k getEmojiTextViewHelper() {
        if (this.f1315d == null) {
            this.f1315d = new C0324k(this);
        }
        return this.f1315d;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0304d c0304d = this.f1313b;
        if (c0304d != null) {
            c0304d.m1125a();
        }
        C0350x c0350x = this.f1314c;
        if (c0350x != null) {
            c0350x.m1285b();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        C0316h c0316h = this.f1312a;
        if (c0316h != null) {
            c0316h.getClass();
        }
        return compoundPaddingLeft;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0304d c0304d = this.f1313b;
        if (c0304d != null) {
            return c0304d.m1126b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0304d c0304d = this.f1313b;
        if (c0304d != null) {
            return c0304d.m1127c();
        }
        return null;
    }

    @Override // p024b3.InterfaceC1306m
    public ColorStateList getSupportButtonTintList() {
        C0316h c0316h = this.f1312a;
        if (c0316h != null) {
            return c0316h.f1210b;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        C0316h c0316h = this.f1312a;
        if (c0316h != null) {
            return c0316h.f1211c;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f1314c.m1286d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f1314c.m1287e();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().m1234c(z10);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0304d c0304d = this.f1313b;
        if (c0304d != null) {
            c0304d.m1129e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        C0304d c0304d = this.f1313b;
        if (c0304d != null) {
            c0304d.m1130f(i10);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i10) {
        setButtonDrawable(C5452a.m11672a(getContext(), i10));
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        C0316h c0316h = this.f1312a;
        if (c0316h != null) {
            if (c0316h.f1214f) {
                c0316h.f1214f = false;
            } else {
                c0316h.f1214f = true;
                c0316h.m1198a();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0350x c0350x = this.f1314c;
        if (c0350x != null) {
            c0350x.m1285b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0350x c0350x = this.f1314c;
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
        C0304d c0304d = this.f1313b;
        if (c0304d != null) {
            c0304d.m1132h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0304d c0304d = this.f1313b;
        if (c0304d != null) {
            c0304d.m1133i(mode);
        }
    }

    @Override // p024b3.InterfaceC1306m
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        C0316h c0316h = this.f1312a;
        if (c0316h != null) {
            c0316h.f1210b = colorStateList;
            c0316h.f1212d = true;
            c0316h.m1198a();
        }
    }

    @Override // p024b3.InterfaceC1306m
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        C0316h c0316h = this.f1312a;
        if (c0316h != null) {
            c0316h.f1211c = mode;
            c0316h.f1213e = true;
            c0316h.m1198a();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C0350x c0350x = this.f1314c;
        c0350x.m1293k(colorStateList);
        c0350x.m1285b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C0350x c0350x = this.f1314c;
        c0350x.m1294l(mode);
        c0350x.m1285b();
    }
}
