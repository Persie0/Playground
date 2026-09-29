package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import androidx.appcompat.R$attr;
import p000.C2936dq;
import p000.C2937dr;
import p000.C3488q8;
import p000.b64;
import p000.bl1;
import p000.by9;
import p000.ck6;
import p000.dta;
import p000.gs6;
import p000.k1a;
import p000.oz9;
import p000.rw4;
import p000.w2d;
import p000.ybd;
import p000.yfd;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatEditText extends EditText implements gs6 {

    /* JADX INFO: renamed from: a */
    public final C3488q8 f1120a;

    /* JADX INFO: renamed from: b */
    public final C2937dr f1121b;

    /* JADX INFO: renamed from: c */
    public final by9 f1122c;

    /* JADX INFO: renamed from: d */
    public final b64 f1123d;

    /* JADX INFO: renamed from: e */
    public C2936dq f1124e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        k1a.m14773a(context);
        oz9.m18842a(this, getContext());
        C3488q8 c3488q8 = new C3488q8(this);
        this.f1120a = c3488q8;
        c3488q8.m19756y(attributeSet, i);
        C2937dr c2937dr = new C2937dr(this);
        this.f1121b = c2937dr;
        c2937dr.m10598f(attributeSet, i);
        c2937dr.m10595b();
        this.f1122c = new by9();
        b64 b64Var = new b64((EditText) this);
        this.f1123d = b64Var;
        b64Var.m3364q(attributeSet, i);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean zIsFocusable = super.isFocusable();
        boolean zIsClickable = super.isClickable();
        boolean zIsLongClickable = super.isLongClickable();
        int inputType = super.getInputType();
        KeyListener keyListenerM3363p = b64Var.m3363p(keyListener);
        if (keyListenerM3363p == keyListener) {
            return;
        }
        super.setKeyListener(keyListenerM3363p);
        super.setRawInputType(inputType);
        super.setFocusable(zIsFocusable);
        super.setClickable(zIsClickable);
        super.setLongClickable(zIsLongClickable);
    }

    private C2936dq getSuperCaller() {
        if (this.f1124e == null) {
            this.f1124e = new C2936dq(this);
        }
        return this.f1124e;
    }

    @Override // p000.gs6
    /* JADX INFO: renamed from: a */
    public final bl1 mo678a(bl1 bl1Var) {
        this.f1122c.getClass();
        return by9.m4225a(this, bl1Var);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C3488q8 c3488q8 = this.f1120a;
        if (c3488q8 != null) {
            c3488q8.m19734b();
        }
        C2937dr c2937dr = this.f1121b;
        if (c2937dr != null) {
            c2937dr.m10595b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return super.getCustomSelectionActionModeCallback();
    }

    public ColorStateList getSupportBackgroundTintList() {
        C3488q8 c3488q8 = this.f1120a;
        if (c3488q8 != null) {
            return c3488q8.m19753v();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C3488q8 c3488q8 = this.f1120a;
        if (c3488q8 != null) {
            return c3488q8.m19754w();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f1121b.m10596d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f1121b.m10597e();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        return getSuperCaller().m10578a();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        String[] strArrM10634e;
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f1121b.getClass();
        int i = Build.VERSION.SDK_INT;
        if (i < 30 && inputConnectionOnCreateInputConnection != null) {
            ybd.m25060c(editorInfo, getText());
        }
        w2d.m23691a(editorInfo, inputConnectionOnCreateInputConnection, this);
        if (inputConnectionOnCreateInputConnection != null && i <= 30 && (strArrM10634e = dta.m10634e(this)) != null) {
            ybd.m25059b(editorInfo, strArrM10634e);
            inputConnectionOnCreateInputConnection = yfd.m25121a(this, inputConnectionOnCreateInputConnection, editorInfo);
        }
        return ((ck6) this.f1123d.f8007b).m4815y(inputConnectionOnCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = Build.VERSION.SDK_INT;
        if (i < 30 || i >= 33) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onDragEvent(DragEvent dragEvent) {
        if (rw4.m20947e(this, dragEvent)) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i) {
        if (rw4.m20948f(this, i)) {
            return true;
        }
        return super.onTextContextMenuItem(i);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C3488q8 c3488q8 = this.f1120a;
        if (c3488q8 != null) {
            c3488q8.m19715A();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C3488q8 c3488q8 = this.f1120a;
        if (c3488q8 != null) {
            c3488q8.m19716B(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C2937dr c2937dr = this.f1121b;
        if (c2937dr != null) {
            c2937dr.m10595b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C2937dr c2937dr = this.f1121b;
        if (c2937dr != null) {
            c2937dr.m10595b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(callback);
    }

    public void setEmojiCompatEnabled(boolean z) {
        ((ck6) this.f1123d.f8007b).m4795F(z);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f1123d.m3363p(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C3488q8 c3488q8 = this.f1120a;
        if (c3488q8 != null) {
            c3488q8.m19726L(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C3488q8 c3488q8 = this.f1120a;
        if (c3488q8 != null) {
            c3488q8.m19727M(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C2937dr c2937dr = this.f1121b;
        c2937dr.m10600h(colorStateList);
        c2937dr.m10595b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C2937dr c2937dr = this.f1121b;
        c2937dr.m10601i(mode);
        c2937dr.m10595b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C2937dr c2937dr = this.f1121b;
        if (c2937dr != null) {
            c2937dr.m10599g(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        getSuperCaller().m10579b(textClassifier);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return super.getText();
    }

    public AppCompatEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.editTextStyle);
    }

    public AppCompatEditText(Context context) {
        this(context, null);
    }
}
