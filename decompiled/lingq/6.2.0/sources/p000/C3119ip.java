package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import androidx.appcompat.R$attr;
import androidx.appcompat.R$styleable;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: ip */
/* JADX INFO: loaded from: classes2.dex */
public final class C3119ip extends CheckedTextView {

    /* JADX INFO: renamed from: a */
    public final C3155jp f44386a;

    /* JADX INFO: renamed from: b */
    public final C3488q8 f44387b;

    /* JADX INFO: renamed from: c */
    public final C2937dr f44388c;

    /* JADX INFO: renamed from: d */
    public C2973eq f44389d;

    /* JADX WARN: Illegal instructions before constructor call */
    public C3119ip(Context context, AttributeSet attributeSet) {
        int resourceId;
        int resourceId2;
        int i = R$attr.checkedTextViewStyle;
        k1a.m14773a(context);
        super(context, attributeSet, i);
        oz9.m18842a(this, getContext());
        C2937dr c2937dr = new C2937dr(this);
        this.f44388c = c2937dr;
        c2937dr.m10598f(attributeSet, i);
        c2937dr.m10595b();
        C3488q8 c3488q8 = new C3488q8(this);
        this.f44387b = c3488q8;
        c3488q8.m19756y(attributeSet, i);
        this.f44386a = new C3155jp(this);
        sq5 sq5VarM21551w = sq5.m21551w(i, 0, getContext(), attributeSet, R$styleable.CheckedTextView);
        TypedArray typedArray = (TypedArray) sq5VarM21551w.f61249c;
        Context context2 = getContext();
        int[] iArr = R$styleable.CheckedTextView;
        TypedArray typedArray2 = (TypedArray) sq5VarM21551w.f61249c;
        WeakHashMap weakHashMap = dta.f36217a;
        ata.m3035b(this, context2, iArr, attributeSet, typedArray2, i, 0);
        try {
            if (typedArray.hasValue(R$styleable.CheckedTextView_checkMarkCompat) && (resourceId2 = typedArray.getResourceId(R$styleable.CheckedTextView_checkMarkCompat, 0)) != 0) {
                try {
                    setCheckMarkDrawable(bna.m3932U(getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                    if (typedArray.hasValue(R$styleable.CheckedTextView_android_checkMark)) {
                        setCheckMarkDrawable(bna.m3932U(getContext(), resourceId));
                    }
                }
            } else if (typedArray.hasValue(R$styleable.CheckedTextView_android_checkMark) && (resourceId = typedArray.getResourceId(R$styleable.CheckedTextView_android_checkMark, 0)) != 0) {
                setCheckMarkDrawable(bna.m3932U(getContext(), resourceId));
            }
            if (typedArray.hasValue(R$styleable.CheckedTextView_checkMarkTint)) {
                setCheckMarkTintList(sq5VarM21551w.m21567i(R$styleable.CheckedTextView_checkMarkTint));
            }
            if (typedArray.hasValue(R$styleable.CheckedTextView_checkMarkTintMode)) {
                setCheckMarkTintMode(wl2.m24048c(typedArray.getInt(R$styleable.CheckedTextView_checkMarkTintMode, -1), null));
            }
            sq5VarM21551w.m21582y();
            getEmojiTextViewHelper().m11316b(attributeSet, i);
        } catch (Throwable th) {
            sq5VarM21551w.m21582y();
            throw th;
        }
    }

    private C2973eq getEmojiTextViewHelper() {
        if (this.f44389d == null) {
            this.f44389d = new C2973eq(this);
        }
        return this.f44389d;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C2937dr c2937dr = this.f44388c;
        if (c2937dr != null) {
            c2937dr.m10595b();
        }
        C3488q8 c3488q8 = this.f44387b;
        if (c3488q8 != null) {
            c3488q8.m19734b();
        }
        C3155jp c3155jp = this.f44386a;
        if (c3155jp != null) {
            c3155jp.m14575b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return super.getCustomSelectionActionModeCallback();
    }

    public ColorStateList getSupportBackgroundTintList() {
        C3488q8 c3488q8 = this.f44387b;
        if (c3488q8 != null) {
            return c3488q8.m19753v();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C3488q8 c3488q8 = this.f44387b;
        if (c3488q8 != null) {
            return c3488q8.m19754w();
        }
        return null;
    }

    public ColorStateList getSupportCheckMarkTintList() {
        C3155jp c3155jp = this.f44386a;
        if (c3155jp != null) {
            return c3155jp.f45940a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        C3155jp c3155jp = this.f44386a;
        if (c3155jp != null) {
            return c3155jp.f45941b;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f44388c.m10596d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f44388c.m10597e();
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        w2d.m23691a(editorInfo, inputConnectionOnCreateInputConnection, this);
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().m11317c(z);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C3488q8 c3488q8 = this.f44387b;
        if (c3488q8 != null) {
            c3488q8.m19715A();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C3488q8 c3488q8 = this.f44387b;
        if (c3488q8 != null) {
            c3488q8.m19716B(i);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        C3155jp c3155jp = this.f44386a;
        if (c3155jp != null) {
            if (c3155jp.f45944e) {
                c3155jp.f45944e = false;
            } else {
                c3155jp.f45944e = true;
                c3155jp.m14575b();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C2937dr c2937dr = this.f44388c;
        if (c2937dr != null) {
            c2937dr.m10595b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C2937dr c2937dr = this.f44388c;
        if (c2937dr != null) {
            c2937dr.m10595b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(callback);
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().m11318d(z);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C3488q8 c3488q8 = this.f44387b;
        if (c3488q8 != null) {
            c3488q8.m19726L(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C3488q8 c3488q8 = this.f44387b;
        if (c3488q8 != null) {
            c3488q8.m19727M(mode);
        }
    }

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        C3155jp c3155jp = this.f44386a;
        if (c3155jp != null) {
            c3155jp.f45940a = colorStateList;
            c3155jp.f45942c = true;
            c3155jp.m14575b();
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        C3155jp c3155jp = this.f44386a;
        if (c3155jp != null) {
            c3155jp.f45941b = mode;
            c3155jp.f45943d = true;
            c3155jp.m14575b();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C2937dr c2937dr = this.f44388c;
        c2937dr.m10600h(colorStateList);
        c2937dr.m10595b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C2937dr c2937dr = this.f44388c;
        c2937dr.m10601i(mode);
        c2937dr.m10595b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C2937dr c2937dr = this.f44388c;
        if (c2937dr != null) {
            c2937dr.m10599g(context, i);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(bna.m3932U(getContext(), i));
    }
}
