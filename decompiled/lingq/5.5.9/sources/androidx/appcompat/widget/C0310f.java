package androidx.appcompat.widget;

import ae.C0062b;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import com.linguist.R;
import p024b3.C1304k;
import p058d.C4999a;
import p104f.C5452a;
import p471x2.C10029b0;

/* JADX INFO: renamed from: androidx.appcompat.widget.f */
/* JADX INFO: loaded from: classes.dex */
public final class C0310f extends CheckedTextView {

    /* JADX INFO: renamed from: a */
    public final C0313g f1170a;

    /* JADX INFO: renamed from: b */
    public final C0304d f1171b;

    /* JADX INFO: renamed from: c */
    public final C0350x f1172c;

    /* JADX INFO: renamed from: d */
    public C0324k f1173d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0310f(Context context, AttributeSet attributeSet) {
        int iM1120i;
        int iM1120i2;
        super(context, attributeSet, R.attr.checkedTextViewStyle);
        C0353y0.m1309a(context);
        C0349w0.m1279a(getContext(), this);
        C0350x c0350x = new C0350x(this);
        this.f1172c = c0350x;
        c0350x.m1288f(attributeSet, R.attr.checkedTextViewStyle);
        c0350x.m1285b();
        C0304d c0304d = new C0304d(this);
        this.f1171b = c0304d;
        c0304d.m1128d(attributeSet, R.attr.checkedTextViewStyle);
        this.f1170a = new C0313g(this);
        Context context2 = getContext();
        int[] iArr = C4999a.f32598l;
        C0300b1 c0300b1M1111m = C0300b1.m1111m(context2, attributeSet, iArr, R.attr.checkedTextViewStyle);
        C10029b0.m18657m(this, getContext(), iArr, attributeSet, c0300b1M1111m.f1134b, R.attr.checkedTextViewStyle);
        boolean z10 = true;
        try {
            if (!c0300b1M1111m.m1123l(1) || (iM1120i2 = c0300b1M1111m.m1120i(1, 0)) == 0) {
                z10 = false;
            } else {
                try {
                    setCheckMarkDrawable(C5452a.m11672a(getContext(), iM1120i2));
                } catch (Resources.NotFoundException unused) {
                    z10 = false;
                }
            }
            if (!z10 && c0300b1M1111m.m1123l(0) && (iM1120i = c0300b1M1111m.m1120i(0, 0)) != 0) {
                setCheckMarkDrawable(C5452a.m11672a(getContext(), iM1120i));
            }
            if (c0300b1M1111m.m1123l(2)) {
                setCheckMarkTintList(c0300b1M1111m.m1113b(2));
            }
            if (c0300b1M1111m.m1123l(3)) {
                setCheckMarkTintMode(C0311f0.m1188c(c0300b1M1111m.m1119h(3, -1), null));
            }
            c0300b1M1111m.m1124n();
            getEmojiTextViewHelper().m1233b(attributeSet, R.attr.checkedTextViewStyle);
        } finally {
            c0300b1M1111m.m1124n();
        }
    }

    private C0324k getEmojiTextViewHelper() {
        if (this.f1173d == null) {
            this.f1173d = new C0324k(this);
        }
        return this.f1173d;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0350x c0350x = this.f1172c;
        if (c0350x != null) {
            c0350x.m1285b();
        }
        C0304d c0304d = this.f1171b;
        if (c0304d != null) {
            c0304d.m1125a();
        }
        C0313g c0313g = this.f1170a;
        if (c0313g != null) {
            c0313g.m1192a();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return C1304k.m4831f(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0304d c0304d = this.f1171b;
        if (c0304d != null) {
            return c0304d.m1126b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0304d c0304d = this.f1171b;
        if (c0304d != null) {
            return c0304d.m1127c();
        }
        return null;
    }

    public ColorStateList getSupportCheckMarkTintList() {
        C0313g c0313g = this.f1170a;
        if (c0313g != null) {
            return c0313g.f1184b;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        C0313g c0313g = this.f1170a;
        if (c0313g != null) {
            return c0313g.f1185c;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f1172c.m1286d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f1172c.m1287e();
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        C0062b.m274H1(this, editorInfo, inputConnectionOnCreateInputConnection);
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().m1234c(z10);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0304d c0304d = this.f1171b;
        if (c0304d != null) {
            c0304d.m1129e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        C0304d c0304d = this.f1171b;
        if (c0304d != null) {
            c0304d.m1130f(i10);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i10) {
        setCheckMarkDrawable(C5452a.m11672a(getContext(), i10));
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        C0313g c0313g = this.f1170a;
        if (c0313g != null) {
            if (c0313g.f1188f) {
                c0313g.f1188f = false;
            } else {
                c0313g.f1188f = true;
                c0313g.m1192a();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0350x c0350x = this.f1172c;
        if (c0350x != null) {
            c0350x.m1285b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0350x c0350x = this.f1172c;
        if (c0350x != null) {
            c0350x.m1285b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C1304k.m4832g(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().m1235d(z10);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0304d c0304d = this.f1171b;
        if (c0304d != null) {
            c0304d.m1132h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0304d c0304d = this.f1171b;
        if (c0304d != null) {
            c0304d.m1133i(mode);
        }
    }

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        C0313g c0313g = this.f1170a;
        if (c0313g != null) {
            c0313g.f1184b = colorStateList;
            c0313g.f1186d = true;
            c0313g.m1192a();
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        C0313g c0313g = this.f1170a;
        if (c0313g != null) {
            c0313g.f1185c = mode;
            c0313g.f1187e = true;
            c0313g.m1192a();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C0350x c0350x = this.f1172c;
        c0350x.m1293k(colorStateList);
        c0350x.m1285b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C0350x c0350x = this.f1172c;
        c0350x.m1294l(mode);
        c0350x.m1285b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        C0350x c0350x = this.f1172c;
        if (c0350x != null) {
            c0350x.m1289g(i10, context);
        }
    }
}
