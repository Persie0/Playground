package p000;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* JADX INFO: renamed from: gr */
/* JADX INFO: loaded from: classes.dex */
public class C3048gr extends TextView {

    /* JADX INFO: renamed from: a */
    public final C3488q8 f41205a;

    /* JADX INFO: renamed from: b */
    public final C2937dr f41206b;

    /* JADX INFO: renamed from: c */
    public C2973eq f41207c;

    /* JADX INFO: renamed from: d */
    public boolean f41208d;

    /* JADX INFO: renamed from: e */
    public b64 f41209e;

    /* JADX INFO: renamed from: f */
    public Future f41210f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3048gr(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        k1a.m14773a(context);
        this.f41208d = false;
        this.f41209e = null;
        oz9.m18842a(this, getContext());
        C3488q8 c3488q8 = new C3488q8(this);
        this.f41205a = c3488q8;
        c3488q8.m19756y(attributeSet, i);
        C2937dr c2937dr = new C2937dr(this);
        this.f41206b = c2937dr;
        c2937dr.m10598f(attributeSet, i);
        c2937dr.m10595b();
        getEmojiTextViewHelper().m11316b(attributeSet, i);
    }

    private C2973eq getEmojiTextViewHelper() {
        if (this.f41207c == null) {
            this.f41207c = new C2973eq(this);
        }
        return this.f41207c;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C3488q8 c3488q8 = this.f41205a;
        if (c3488q8 != null) {
            c3488q8.m19734b();
        }
        C2937dr c2937dr = this.f41206b;
        if (c2937dr != null) {
            c2937dr.m10595b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        return super.getAutoSizeMaxTextSize();
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        return super.getAutoSizeMinTextSize();
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        return super.getAutoSizeStepGranularity();
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        return super.getAutoSizeTextAvailableSizes();
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        return super.getAutoSizeTextType() == 1 ? 1 : 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return super.getCustomSelectionActionModeCallback();
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public InterfaceC2974er getSuperCaller() {
        if (this.f41209e == null) {
            if (Build.VERSION.SDK_INT >= 34) {
                this.f41209e = new C3011fr(this);
            } else {
                this.f41209e = new b64(this);
            }
        }
        return this.f41209e;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C3488q8 c3488q8 = this.f41205a;
        if (c3488q8 != null) {
            return c3488q8.m19753v();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C3488q8 c3488q8 = this.f41205a;
        if (c3488q8 != null) {
            return c3488q8.m19754w();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f41206b.m10596d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f41206b.m10597e();
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        Future future = this.f41210f;
        if (future != null) {
            try {
                this.f41210f = null;
                if (future.get() == null) {
                    throw null;
                }
                throw new ClassCastException();
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        return super.getTextClassifier();
    }

    public fi7 getTextMetricsParamsCompat() {
        return new fi7(d7d.m10144b(this));
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f41206b.getClass();
        if (Build.VERSION.SDK_INT < 30 && inputConnectionOnCreateInputConnection != null) {
            ybd.m25060c(editorInfo, getText());
        }
        w2d.m23691a(editorInfo, inputConnectionOnCreateInputConnection, this);
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = Build.VERSION.SDK_INT;
        if (i < 30 || i >= 33 || !onCheckIsTextEditor()) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C2937dr c2937dr = this.f41206b;
        if (c2937dr != null) {
            c2937dr.getClass();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        Future future = this.f41210f;
        if (future != null) {
            try {
                this.f41210f = null;
                if (future.get() != null) {
                    throw new ClassCastException();
                }
                throw null;
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        super.onMeasure(i, i2);
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().m11317c(z);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        super.setAutoSizeTextTypeWithDefaults(i);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C3488q8 c3488q8 = this.f41205a;
        if (c3488q8 != null) {
            c3488q8.m19715A();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C3488q8 c3488q8 = this.f41205a;
        if (c3488q8 != null) {
            c3488q8.m19716B(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C2937dr c2937dr = this.f41206b;
        if (c2937dr != null) {
            c2937dr.m10595b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C2937dr c2937dr = this.f41206b;
        if (c2937dr != null) {
            c2937dr.m10595b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i != 0 ? bna.m3932U(context, i) : null, i2 != 0 ? bna.m3932U(context, i2) : null, i3 != 0 ? bna.m3932U(context, i3) : null, i4 != 0 ? bna.m3932U(context, i4) : null);
        C2937dr c2937dr = this.f41206b;
        if (c2937dr != null) {
            c2937dr.m10595b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i != 0 ? bna.m3932U(context, i) : null, i2 != 0 ? bna.m3932U(context, i2) : null, i3 != 0 ? bna.m3932U(context, i3) : null, i4 != 0 ? bna.m3932U(context, i4) : null);
        C2937dr c2937dr = this.f41206b;
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

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().m11315a(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i) {
        super.setFirstBaselineToTopHeight(i);
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i) {
        super.setLastBaselineToBottomHeight(i);
    }

    @Override // android.widget.TextView
    public final void setLineHeight(int i, float f) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 34) {
            getSuperCaller().mo3349a(i, f);
        } else if (i2 >= 34) {
            AbstractC3521r3.m20275g(this, i, f);
        } else {
            x74.m24340G(this, Math.round(TypedValue.applyDimension(i, f, getResources().getDisplayMetrics())));
        }
    }

    public void setPrecomputedText(gi7 gi7Var) {
        throw null;
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C3488q8 c3488q8 = this.f41205a;
        if (c3488q8 != null) {
            c3488q8.m19726L(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C3488q8 c3488q8 = this.f41205a;
        if (c3488q8 != null) {
            c3488q8.m19727M(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C2937dr c2937dr = this.f41206b;
        c2937dr.m10600h(colorStateList);
        c2937dr.m10595b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C2937dr c2937dr = this.f41206b;
        c2937dr.m10601i(mode);
        c2937dr.m10595b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C2937dr c2937dr = this.f41206b;
        if (c2937dr != null) {
            c2937dr.m10599g(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        super.setTextClassifier(textClassifier);
    }

    public void setTextFuture(Future<gi7> future) {
        this.f41210f = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(fi7 fi7Var) {
        TextDirectionHeuristic textDirectionHeuristic;
        TextDirectionHeuristic textDirectionHeuristicM11858c = fi7Var.m11858c();
        TextDirectionHeuristic textDirectionHeuristic2 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        int i = 1;
        if (textDirectionHeuristicM11858c != textDirectionHeuristic2 && textDirectionHeuristicM11858c != (textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            if (textDirectionHeuristicM11858c == TextDirectionHeuristics.ANYRTL_LTR) {
                i = 2;
            } else if (textDirectionHeuristicM11858c == TextDirectionHeuristics.LTR) {
                i = 3;
            } else if (textDirectionHeuristicM11858c == TextDirectionHeuristics.RTL) {
                i = 4;
            } else if (textDirectionHeuristicM11858c == TextDirectionHeuristics.LOCALE) {
                i = 5;
            } else if (textDirectionHeuristicM11858c == textDirectionHeuristic) {
                i = 6;
            } else if (textDirectionHeuristicM11858c == textDirectionHeuristic2) {
                i = 7;
            }
        }
        setTextDirection(i);
        getPaint().set(fi7Var.m11859d());
        setBreakStrategy(fi7Var.m11856a());
        setHyphenationFrequency(fi7Var.m11857b());
    }

    @Override // android.widget.TextView
    public final void setTypeface(Typeface typeface, int i) {
        Typeface typefaceCreate;
        if (this.f41208d) {
            return;
        }
        if (typeface == null || i <= 0) {
            typefaceCreate = null;
        } else {
            Context context = getContext();
            e41 e41Var = oda.f54230a;
            if (context == null) {
                C3386nv.m17626m("Context cannot be null");
                return;
            }
            typefaceCreate = Typeface.create(typeface, i);
        }
        this.f41208d = true;
        if (typefaceCreate != null) {
            typeface = typefaceCreate;
        }
        try {
            super.setTypeface(typeface, i);
        } finally {
            this.f41208d = false;
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i) {
        x74.m24340G(this, i);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C2937dr c2937dr = this.f41206b;
        if (c2937dr != null) {
            c2937dr.m10595b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C2937dr c2937dr = this.f41206b;
        if (c2937dr != null) {
            c2937dr.m10595b();
        }
    }

    public C3048gr(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }
}
