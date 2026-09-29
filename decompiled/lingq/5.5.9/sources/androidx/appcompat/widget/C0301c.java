package androidx.appcompat.widget;

import ae.C0062b;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;
import p024b3.C1304k;
import p104f.C5452a;

/* JADX INFO: renamed from: androidx.appcompat.widget.c */
/* JADX INFO: loaded from: classes.dex */
public class C0301c extends AutoCompleteTextView {

    /* JADX INFO: renamed from: d */
    public static final int[] f1136d = {R.attr.popupBackground};

    /* JADX INFO: renamed from: a */
    public final C0304d f1137a;

    /* JADX INFO: renamed from: b */
    public final C0350x f1138b;

    /* JADX INFO: renamed from: c */
    public final C0322j f1139c;

    public C0301c(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0301c(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, com.linguist.R.attr.autoCompleteTextViewStyle);
        C0353y0.m1309a(context);
        C0349w0.m1279a(getContext(), this);
        C0300b1 c0300b1M1111m = C0300b1.m1111m(getContext(), attributeSet, f1136d, com.linguist.R.attr.autoCompleteTextViewStyle);
        if (c0300b1M1111m.m1123l(0)) {
            setDropDownBackgroundDrawable(c0300b1M1111m.m1116e(0));
        }
        c0300b1M1111m.m1124n();
        C0304d c0304d = new C0304d(this);
        this.f1137a = c0304d;
        c0304d.m1128d(attributeSet, com.linguist.R.attr.autoCompleteTextViewStyle);
        C0350x c0350x = new C0350x(this);
        this.f1138b = c0350x;
        c0350x.m1288f(attributeSet, com.linguist.R.attr.autoCompleteTextViewStyle);
        c0350x.m1285b();
        C0322j c0322j = new C0322j(this);
        this.f1139c = c0322j;
        c0322j.m1219g(attributeSet, com.linguist.R.attr.autoCompleteTextViewStyle);
        KeyListener keyListener = getKeyListener();
        if (!(keyListener instanceof NumberKeyListener)) {
            boolean zIsFocusable = super.isFocusable();
            boolean zIsClickable = super.isClickable();
            boolean zIsLongClickable = super.isLongClickable();
            int inputType = super.getInputType();
            KeyListener keyListenerM1218f = c0322j.m1218f(keyListener);
            if (keyListenerM1218f == keyListener) {
                return;
            }
            super.setKeyListener(keyListenerM1218f);
            super.setRawInputType(inputType);
            super.setFocusable(zIsFocusable);
            super.setClickable(zIsClickable);
            super.setLongClickable(zIsLongClickable);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0304d c0304d = this.f1137a;
        if (c0304d != null) {
            c0304d.m1125a();
        }
        C0350x c0350x = this.f1138b;
        if (c0350x != null) {
            c0350x.m1285b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return C1304k.m4831f(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0304d c0304d = this.f1137a;
        if (c0304d != null) {
            return c0304d.m1126b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0304d c0304d = this.f1137a;
        if (c0304d != null) {
            return c0304d.m1127c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f1138b.m1286d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f1138b.m1287e();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        C0062b.m274H1(this, editorInfo, inputConnectionOnCreateInputConnection);
        return this.f1139c.m1220h(inputConnectionOnCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0304d c0304d = this.f1137a;
        if (c0304d != null) {
            c0304d.m1129e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        C0304d c0304d = this.f1137a;
        if (c0304d != null) {
            c0304d.m1130f(i10);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0350x c0350x = this.f1138b;
        if (c0350x != null) {
            c0350x.m1285b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0350x c0350x = this.f1138b;
        if (c0350x != null) {
            c0350x.m1285b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C1304k.m4832g(callback, this));
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i10) {
        setDropDownBackgroundDrawable(C5452a.m11672a(getContext(), i10));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        this.f1139c.m1223k(z10);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f1139c.m1218f(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0304d c0304d = this.f1137a;
        if (c0304d != null) {
            c0304d.m1132h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0304d c0304d = this.f1137a;
        if (c0304d != null) {
            c0304d.m1133i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C0350x c0350x = this.f1138b;
        c0350x.m1293k(colorStateList);
        c0350x.m1285b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C0350x c0350x = this.f1138b;
        c0350x.m1294l(mode);
        c0350x.m1285b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        C0350x c0350x = this.f1138b;
        if (c0350x != null) {
            c0350x.m1289g(i10, context);
        }
    }
}
