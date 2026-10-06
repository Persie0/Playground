package p000;

import android.R;
import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import androidx.work.impl.diagnostics.p003tK.KMNlNMe;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: js */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class C0752js extends TextView {

    /* JADX INFO: renamed from: a */
    private final C0266ij f34701a;

    /* JADX INFO: renamed from: b */
    private final C0749jp f34702b;

    /* JADX INFO: renamed from: c */
    private boolean f34703c;

    /* JADX INFO: renamed from: d */
    private C0750jq f34704d;

    /* JADX INFO: renamed from: e */
    private aie f34705e;

    public C0752js(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: a */
    private final aie m13493a() {
        if (this.f34705e == null) {
            this.f34705e = new aie(this);
        }
        return this.f34705e;
    }

    @Override // android.widget.TextView, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        C0266ij c0266ij = this.f34701a;
        if (c0266ij != null) {
            c0266ij.m11392c();
        }
        C0749jp c0749jp = this.f34702b;
        if (c0749jp != null) {
            c0749jp.m13416a();
        }
    }

    /* JADX INFO: renamed from: g */
    final C0750jq m13494g() {
        if (this.f34704d == null) {
            this.f34704d = new C0751jr(this);
        }
        return this.f34704d;
    }

    @Override // android.widget.TextView
    public final int getAutoSizeMaxTextSize() {
        Method method = C0864nw.f44818a;
        return super.getAutoSizeMaxTextSize();
    }

    @Override // android.widget.TextView
    public final int getAutoSizeMinTextSize() {
        Method method = C0864nw.f44818a;
        return super.getAutoSizeMinTextSize();
    }

    @Override // android.widget.TextView
    public final int getAutoSizeStepGranularity() {
        Method method = C0864nw.f44818a;
        return super.getAutoSizeStepGranularity();
    }

    @Override // android.widget.TextView
    public final int[] getAutoSizeTextAvailableSizes() {
        Method method = C0864nw.f44818a;
        return super.getAutoSizeTextAvailableSizes();
    }

    @Override // android.widget.TextView
    public final int getAutoSizeTextType() {
        Method method = C0864nw.f44818a;
        return super.getAutoSizeTextType() == 1 ? 1 : 0;
    }

    @Override // android.widget.TextView
    public final ActionMode.Callback getCustomSelectionActionModeCallback() {
        ActionMode.Callback customSelectionActionModeCallback = super.getCustomSelectionActionModeCallback();
        abm.m140g(customSelectionActionModeCallback);
        return customSelectionActionModeCallback;
    }

    @Override // android.widget.TextView
    public final int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public final int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    @Override // android.widget.TextView
    public final TextClassifier getTextClassifier() {
        return super.getTextClassifier();
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        C0139dr.m6613b(inputConnectionOnCreateInputConnection, editorInfo, this);
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.widget.TextView, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.f34702b != null) {
            Method method = C0864nw.f44818a;
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    @Override // android.widget.TextView
    protected final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        if (this.f34702b != null) {
            Method method = C0864nw.f44818a;
        }
    }

    @Override // android.widget.TextView
    public final void setAllCaps(boolean z) {
        super.setAllCaps(z);
        m13493a();
        ajf.m803d();
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        Method method = C0864nw.f44818a;
        super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        Method method = C0864nw.f44818a;
        super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeWithDefaults(int i) {
        Method method = C0864nw.f44818a;
        super.setAutoSizeTextTypeWithDefaults(i);
    }

    @Override // android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0266ij c0266ij = this.f34701a;
        if (c0266ij != null) {
            c0266ij.m11398i();
        }
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0266ij c0266ij = this.f34701a;
        if (c0266ij != null) {
            c0266ij.m11394e(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0749jp c0749jp = this.f34702b;
        if (c0749jp != null) {
            c0749jp.m13416a();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0749jp c0749jp = this.f34702b;
        if (c0749jp != null) {
            c0749jp.m13416a();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i != 0 ? C0194fs.m8752a(context, i) : null, i2 != 0 ? C0194fs.m8752a(context, i2) : null, i3 != 0 ? C0194fs.m8752a(context, i3) : null, i4 != 0 ? C0194fs.m8752a(context, i4) : null);
        C0749jp c0749jp = this.f34702b;
        if (c0749jp != null) {
            c0749jp.m13416a();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i != 0 ? C0194fs.m8752a(context, i) : null, i2 != 0 ? C0194fs.m8752a(context, i2) : null, i3 != 0 ? C0194fs.m8752a(context, i3) : null, i4 != 0 ? C0194fs.m8752a(context, i4) : null);
        C0749jp c0749jp = this.f34702b;
        if (c0749jp != null) {
            c0749jp.m13416a();
        }
    }

    @Override // android.widget.TextView
    public final void setFilters(InputFilter[] inputFilterArr) {
        m13493a();
        ajf.m803d();
        super.setFilters(inputFilterArr);
    }

    @Override // android.widget.TextView
    public final void setFirstBaselineToTopHeight(int i) {
        super.setFirstBaselineToTopHeight(i);
    }

    @Override // android.widget.TextView
    public final void setLastBaselineToBottomHeight(int i) {
        super.setLastBaselineToBottomHeight(i);
    }

    @Override // android.widget.TextView
    public final void setLineHeight(int i) {
        abm.m138e(this, i);
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0749jp c0749jp = this.f34702b;
        if (c0749jp != null) {
            c0749jp.m13418c(context, i);
        }
    }

    @Override // android.widget.TextView
    public final void setTextClassifier(TextClassifier textClassifier) {
        super.setTextClassifier(textClassifier);
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f) {
        Method method = C0864nw.f44818a;
        super.setTextSize(i, f);
    }

    @Override // android.widget.TextView
    public final void setTypeface(Typeface typeface, int i) {
        if (this.f34703c) {
            return;
        }
        Typeface typefaceCreate = null;
        if (typeface != null && i > 0) {
            if (getContext() == null) {
                throw new IllegalArgumentException(KMNlNMe.luLAfixh);
            }
            typefaceCreate = Typeface.create(typeface, i);
        }
        this.f34703c = true;
        if (typefaceCreate != null) {
            typeface = typefaceCreate;
        }
        try {
            super.setTypeface(typeface, i);
        } finally {
            this.f34703c = false;
        }
    }

    public C0752js(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0752js(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C0849nh.m17473a(context);
        this.f34703c = false;
        this.f34704d = null;
        C0847nf.m17435d(this, getContext());
        C0266ij c0266ij = new C0266ij(this);
        this.f34701a = c0266ij;
        c0266ij.m11393d(attributeSet, i);
        C0749jp c0749jp = new C0749jp(this);
        this.f34702b = c0749jp;
        c0749jp.m13417b(attributeSet, i);
        c0749jp.m13416a();
        m13493a().m769n(attributeSet, i);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C0749jp c0749jp = this.f34702b;
        if (c0749jp != null) {
            c0749jp.m13416a();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C0749jp c0749jp = this.f34702b;
        if (c0749jp != null) {
            c0749jp.m13416a();
        }
    }
}
