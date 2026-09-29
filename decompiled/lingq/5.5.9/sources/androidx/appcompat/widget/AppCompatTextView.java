package androidx.appcompat.widget;

import ae.C0062b;
import android.R;
import android.annotation.SuppressLint;
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
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import dm.C5212l;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import p004a3.C0012b;
import p024b3.C1304k;
import p024b3.InterfaceC1295b;
import p104f.C5452a;
import p312p2.C8173e;
import p312p2.C8181m;
import p426v2.C9630d;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatTextView extends TextView implements InterfaceC1295b {

    /* JADX INFO: renamed from: a */
    public final C0304d f926a;

    /* JADX INFO: renamed from: b */
    public final C0350x f927b;

    /* JADX INFO: renamed from: c */
    public final C0348w f928c;

    /* JADX INFO: renamed from: d */
    public C0324k f929d;

    /* JADX INFO: renamed from: e */
    public boolean f930e;

    /* JADX INFO: renamed from: f */
    public C0261b f931f;

    /* JADX INFO: renamed from: g */
    public Future<C9630d> f932g;

    /* JADX INFO: renamed from: androidx.appcompat.widget.AppCompatTextView$a */
    public interface InterfaceC0260a {
        /* JADX INFO: renamed from: a */
        void mo1019a(int i10);

        /* JADX INFO: renamed from: b */
        void mo1020b(int i10);
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.AppCompatTextView$b */
    public class C0261b implements InterfaceC0260a {
        public C0261b() {
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.InterfaceC0260a
        /* JADX INFO: renamed from: a */
        public void mo1019a(int i10) {
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.InterfaceC0260a
        /* JADX INFO: renamed from: b */
        public void mo1020b(int i10) {
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.AppCompatTextView$c */
    public class C0262c extends C0261b {
        public C0262c() {
            super();
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.C0261b, androidx.appcompat.widget.AppCompatTextView.InterfaceC0260a
        /* JADX INFO: renamed from: a */
        public final void mo1019a(int i10) {
            AppCompatTextView.super.setLastBaselineToBottomHeight(i10);
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.C0261b, androidx.appcompat.widget.AppCompatTextView.InterfaceC0260a
        /* JADX INFO: renamed from: b */
        public final void mo1020b(int i10) {
            AppCompatTextView.super.setFirstBaselineToTopHeight(i10);
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public AppCompatTextView() {
        throw null;
    }

    public AppCompatTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatTextView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        C0353y0.m1309a(context);
        this.f930e = false;
        this.f931f = null;
        C0349w0.m1279a(getContext(), this);
        C0304d c0304d = new C0304d(this);
        this.f926a = c0304d;
        c0304d.m1128d(attributeSet, i10);
        C0350x c0350x = new C0350x(this);
        this.f927b = c0350x;
        c0350x.m1288f(attributeSet, i10);
        c0350x.m1285b();
        this.f928c = new C0348w(this);
        getEmojiTextViewHelper().m1233b(attributeSet, i10);
    }

    private C0324k getEmojiTextViewHelper() {
        if (this.f929d == null) {
            this.f929d = new C0324k(this);
        }
        return this.f929d;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0304d c0304d = this.f926a;
        if (c0304d != null) {
            c0304d.m1125a();
        }
        C0350x c0350x = this.f927b;
        if (c0350x != null) {
            c0350x.m1285b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (C0318h1.f1216b) {
            return super.getAutoSizeMaxTextSize();
        }
        C0350x c0350x = this.f927b;
        if (c0350x != null) {
            return Math.round(c0350x.f1381i.f1400e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (C0318h1.f1216b) {
            return super.getAutoSizeMinTextSize();
        }
        C0350x c0350x = this.f927b;
        if (c0350x != null) {
            return Math.round(c0350x.f1381i.f1399d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (C0318h1.f1216b) {
            return super.getAutoSizeStepGranularity();
        }
        C0350x c0350x = this.f927b;
        if (c0350x != null) {
            return Math.round(c0350x.f1381i.f1398c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (C0318h1.f1216b) {
            return super.getAutoSizeTextAvailableSizes();
        }
        C0350x c0350x = this.f927b;
        return c0350x != null ? c0350x.f1381i.f1401f : new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        int i10 = 0;
        if (C0318h1.f1216b) {
            if (super.getAutoSizeTextType() == 1) {
                i10 = 1;
            }
            return i10;
        }
        C0350x c0350x = this.f927b;
        if (c0350x != null) {
            return c0350x.f1381i.f1396a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return C1304k.m4831f(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public InterfaceC0260a getSuperCaller() {
        if (this.f931f == null) {
            if (Build.VERSION.SDK_INT >= 28) {
                this.f931f = new C0262c();
            } else {
                this.f931f = new C0261b();
            }
        }
        return this.f931f;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0304d c0304d = this.f926a;
        if (c0304d != null) {
            return c0304d.m1126b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0304d c0304d = this.f926a;
        if (c0304d != null) {
            return c0304d.m1127c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f927b.m1286d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f927b.m1287e();
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        Future<C9630d> future = this.f932g;
        if (future != null) {
            try {
                this.f932g = null;
                C1304k.m4830e(this, future.get());
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        C0348w c0348w;
        if (Build.VERSION.SDK_INT >= 28 || (c0348w = this.f928c) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifierM1278a = c0348w.f1365b;
        if (textClassifierM1278a == null) {
            textClassifierM1278a = C0348w.a.m1278a(c0348w.f1364a);
        }
        return textClassifierM1278a;
    }

    public C9630d.a getTextMetricsParamsCompat() {
        return C1304k.m4826a(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f927b.getClass();
        if (Build.VERSION.SDK_INT < 30 && inputConnectionOnCreateInputConnection != null) {
            C0012b.m51a(editorInfo, getText());
        }
        C0062b.m274H1(this, editorInfo, inputConnectionOnCreateInputConnection);
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        C0350x c0350x = this.f927b;
        if (c0350x != null && !C0318h1.f1216b) {
            c0350x.f1381i.m1313a();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i10, int i11) {
        Future<C9630d> future = this.f932g;
        if (future != null) {
            try {
                this.f932g = null;
                C1304k.m4830e(this, future.get());
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        super.onMeasure(i10, i11);
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        boolean z10 = false;
        C0350x c0350x = this.f927b;
        if (c0350x != null && !C0318h1.f1216b) {
            C0354z c0354z = c0350x.f1381i;
            if (c0354z.m1318i() && c0354z.f1396a != 0) {
                z10 = true;
            }
        }
        if (z10) {
            c0350x.f1381i.m1313a();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().m1234c(z10);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i10, int i11, int i12, int i13) throws IllegalArgumentException {
        if (C0318h1.f1216b) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i10, i11, i12, i13);
            return;
        }
        C0350x c0350x = this.f927b;
        if (c0350x != null) {
            c0350x.m1290h(i10, i11, i12, i13);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i10) throws IllegalArgumentException {
        if (C0318h1.f1216b) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i10);
            return;
        }
        C0350x c0350x = this.f927b;
        if (c0350x != null) {
            c0350x.m1291i(iArr, i10);
        }
    }

    @Override // android.widget.TextView, p024b3.InterfaceC1295b
    public void setAutoSizeTextTypeWithDefaults(int i10) {
        if (C0318h1.f1216b) {
            super.setAutoSizeTextTypeWithDefaults(i10);
            return;
        }
        C0350x c0350x = this.f927b;
        if (c0350x != null) {
            c0350x.m1292j(i10);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0304d c0304d = this.f926a;
        if (c0304d != null) {
            c0304d.m1129e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        C0304d c0304d = this.f926a;
        if (c0304d != null) {
            c0304d.m1130f(i10);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0350x c0350x = this.f927b;
        if (c0350x != null) {
            c0350x.m1285b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0350x c0350x = this.f927b;
        if (c0350x != null) {
            c0350x.m1285b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        Context context = getContext();
        Drawable drawableM11672a = null;
        Drawable drawableM11672a2 = i10 != 0 ? C5452a.m11672a(context, i10) : null;
        Drawable drawableM11672a3 = i11 != 0 ? C5452a.m11672a(context, i11) : null;
        Drawable drawableM11672a4 = i12 != 0 ? C5452a.m11672a(context, i12) : null;
        if (i13 != 0) {
            drawableM11672a = C5452a.m11672a(context, i13);
        }
        setCompoundDrawablesRelativeWithIntrinsicBounds(drawableM11672a2, drawableM11672a3, drawableM11672a4, drawableM11672a);
        C0350x c0350x = this.f927b;
        if (c0350x != null) {
            c0350x.m1285b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C0350x c0350x = this.f927b;
        if (c0350x != null) {
            c0350x.m1285b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i10 != 0 ? C5452a.m11672a(context, i10) : null, i11 != 0 ? C5452a.m11672a(context, i11) : null, i12 != 0 ? C5452a.m11672a(context, i12) : null, i13 != 0 ? C5452a.m11672a(context, i13) : null);
        C0350x c0350x = this.f927b;
        if (c0350x != null) {
            c0350x.m1285b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C0350x c0350x = this.f927b;
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

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().m1232a(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().mo1020b(i10);
        } else {
            C1304k.m4828c(this, i10);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().mo1019a(i10);
        } else {
            C1304k.m4829d(this, i10);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i10) {
        C5212l.m11131B(i10);
        int fontMetricsInt = getPaint().getFontMetricsInt(null);
        if (i10 != fontMetricsInt) {
            setLineSpacing(i10 - fontMetricsInt, 1.0f);
        }
    }

    public void setPrecomputedText(C9630d c9630d) {
        C1304k.m4830e(this, c9630d);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0304d c0304d = this.f926a;
        if (c0304d != null) {
            c0304d.m1132h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0304d c0304d = this.f926a;
        if (c0304d != null) {
            c0304d.m1133i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C0350x c0350x = this.f927b;
        c0350x.m1293k(colorStateList);
        c0350x.m1285b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C0350x c0350x = this.f927b;
        c0350x.m1294l(mode);
        c0350x.m1285b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        C0350x c0350x = this.f927b;
        if (c0350x != null) {
            c0350x.m1289g(i10, context);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        C0348w c0348w;
        if (Build.VERSION.SDK_INT < 28 && (c0348w = this.f928c) != null) {
            c0348w.f1365b = textClassifier;
            return;
        }
        super.setTextClassifier(textClassifier);
    }

    public void setTextFuture(Future<C9630d> future) {
        this.f932g = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(C9630d.a aVar) {
        int i10;
        TextDirectionHeuristic textDirectionHeuristic = aVar.f49318b;
        if (textDirectionHeuristic != TextDirectionHeuristics.FIRSTSTRONG_RTL && textDirectionHeuristic != TextDirectionHeuristics.FIRSTSTRONG_LTR) {
            if (textDirectionHeuristic == TextDirectionHeuristics.ANYRTL_LTR) {
                i10 = 2;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.LTR) {
                i10 = 3;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.RTL) {
                i10 = 4;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.LOCALE) {
                i10 = 5;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR) {
                i10 = 6;
            } else {
                i10 = textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL ? 7 : 1;
            }
        }
        C1304k.b.m4843h(this, i10);
        getPaint().set(aVar.f49317a);
        C1304k.c.m4848e(this, aVar.f49319c);
        C1304k.c.m4851h(this, aVar.f49320d);
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i10, float f3) {
        boolean z10 = C0318h1.f1216b;
        if (z10) {
            super.setTextSize(i10, f3);
            return;
        }
        C0350x c0350x = this.f927b;
        if (c0350x != null && !z10) {
            C0354z c0354z = c0350x.f1381i;
            if (!(c0354z.m1318i() && c0354z.f1396a != 0)) {
                c0354z.m1315f(i10, f3);
            }
        }
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // android.widget.TextView
    public final void setTypeface(Typeface typeface, int i10) {
        Typeface typefaceCreate;
        if (this.f930e) {
            return;
        }
        if (typeface == null || i10 <= 0) {
            typefaceCreate = null;
        } else {
            Context context = getContext();
            C8181m c8181m = C8173e.f44309a;
            if (context == null) {
                throw new IllegalArgumentException("Context cannot be null");
            }
            typefaceCreate = Typeface.create(typeface, i10);
        }
        this.f930e = true;
        if (typefaceCreate != null) {
            typeface = typefaceCreate;
        }
        try {
            super.setTypeface(typeface, i10);
            this.f930e = false;
        } catch (Throwable th2) {
            this.f930e = false;
            throw th2;
        }
    }
}
