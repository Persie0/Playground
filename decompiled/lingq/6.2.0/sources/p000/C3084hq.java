package p000;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import android.widget.MultiAutoCompleteTextView;
import androidx.appcompat.R$attr;

/* JADX INFO: renamed from: hq */
/* JADX INFO: loaded from: classes2.dex */
public final class C3084hq extends MultiAutoCompleteTextView {

    /* JADX INFO: renamed from: d */
    public static final int[] f42762d = {R.attr.popupBackground};

    /* JADX INFO: renamed from: a */
    public final C3488q8 f42763a;

    /* JADX INFO: renamed from: b */
    public final C2937dr f42764b;

    /* JADX INFO: renamed from: c */
    public final b64 f42765c;

    /* JADX WARN: Illegal instructions before constructor call */
    public C3084hq(Context context, AttributeSet attributeSet) {
        int i = R$attr.autoCompleteTextViewStyle;
        k1a.m14773a(context);
        super(context, attributeSet, i);
        oz9.m18842a(this, getContext());
        sq5 sq5VarM21551w = sq5.m21551w(i, 0, getContext(), attributeSet, f42762d);
        if (((TypedArray) sq5VarM21551w.f61249c).hasValue(0)) {
            setDropDownBackgroundDrawable(sq5VarM21551w.m21568j(0));
        }
        sq5VarM21551w.m21582y();
        C3488q8 c3488q8 = new C3488q8(this);
        this.f42763a = c3488q8;
        c3488q8.m19756y(attributeSet, i);
        C2937dr c2937dr = new C2937dr(this);
        this.f42764b = c2937dr;
        c2937dr.m10598f(attributeSet, i);
        c2937dr.m10595b();
        b64 b64Var = new b64((EditText) this);
        this.f42765c = b64Var;
        b64Var.m3364q(attributeSet, i);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean zIsFocusable = isFocusable();
        boolean zIsClickable = isClickable();
        boolean zIsLongClickable = isLongClickable();
        int inputType = getInputType();
        KeyListener keyListenerM3363p = b64Var.m3363p(keyListener);
        if (keyListenerM3363p == keyListener) {
            return;
        }
        super.setKeyListener(keyListenerM3363p);
        setRawInputType(inputType);
        setFocusable(zIsFocusable);
        setClickable(zIsClickable);
        setLongClickable(zIsLongClickable);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C3488q8 c3488q8 = this.f42763a;
        if (c3488q8 != null) {
            c3488q8.m19734b();
        }
        C2937dr c2937dr = this.f42764b;
        if (c2937dr != null) {
            c2937dr.m10595b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C3488q8 c3488q8 = this.f42763a;
        if (c3488q8 != null) {
            return c3488q8.m19753v();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C3488q8 c3488q8 = this.f42763a;
        if (c3488q8 != null) {
            return c3488q8.m19754w();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f42764b.m10596d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f42764b.m10597e();
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        w2d.m23691a(editorInfo, inputConnectionOnCreateInputConnection, this);
        return ((ck6) this.f42765c.f8007b).m4815y(inputConnectionOnCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C3488q8 c3488q8 = this.f42763a;
        if (c3488q8 != null) {
            c3488q8.m19715A();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C3488q8 c3488q8 = this.f42763a;
        if (c3488q8 != null) {
            c3488q8.m19716B(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C2937dr c2937dr = this.f42764b;
        if (c2937dr != null) {
            c2937dr.m10595b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C2937dr c2937dr = this.f42764b;
        if (c2937dr != null) {
            c2937dr.m10595b();
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(bna.m3932U(getContext(), i));
    }

    public void setEmojiCompatEnabled(boolean z) {
        ((ck6) this.f42765c.f8007b).m4795F(z);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f42765c.m3363p(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C3488q8 c3488q8 = this.f42763a;
        if (c3488q8 != null) {
            c3488q8.m19726L(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C3488q8 c3488q8 = this.f42763a;
        if (c3488q8 != null) {
            c3488q8.m19727M(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C2937dr c2937dr = this.f42764b;
        c2937dr.m10600h(colorStateList);
        c2937dr.m10595b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C2937dr c2937dr = this.f42764b;
        c2937dr.m10601i(mode);
        c2937dr.m10595b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C2937dr c2937dr = this.f42764b;
        if (c2937dr != null) {
            c2937dr.m10599g(context, i);
        }
    }
}
