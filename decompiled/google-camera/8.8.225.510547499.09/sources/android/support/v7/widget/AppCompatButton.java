package android.support.v7.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import com.google.android.apps.camera.bottombar.C0100R;
import java.lang.reflect.Method;
import p000.C0266ij;
import p000.C0749jp;
import p000.C0847nf;
import p000.C0849nh;
import p000.C0864nw;
import p000.abm;
import p000.aie;
import p000.ajf;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class AppCompatButton extends Button {

    /* JADX INFO: renamed from: a */
    public final C0266ij f1000a;

    /* JADX INFO: renamed from: b */
    private final C0749jp f1001b;

    /* JADX INFO: renamed from: c */
    private aie f1002c;

    public AppCompatButton(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: a */
    private final aie m1082a() {
        if (this.f1002c == null) {
            this.f1002c = new aie(this);
        }
        return this.f1002c;
    }

    @Override // android.widget.TextView, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        C0266ij c0266ij = this.f1000a;
        if (c0266ij != null) {
            c0266ij.m11392c();
        }
        C0749jp c0749jp = this.f1001b;
        if (c0749jp != null) {
            c0749jp.m13416a();
        }
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

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.f1001b != null) {
            Method method = C0864nw.f44818a;
        }
    }

    @Override // android.widget.TextView
    protected void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        if (this.f1001b != null) {
            Method method = C0864nw.f44818a;
        }
    }

    @Override // android.widget.TextView
    public final void setAllCaps(boolean z) {
        super.setAllCaps(z);
        m1082a();
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
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0266ij c0266ij = this.f1000a;
        if (c0266ij != null) {
            c0266ij.m11398i();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0266ij c0266ij = this.f1000a;
        if (c0266ij != null) {
            c0266ij.m11394e(i);
        }
    }

    @Override // android.widget.TextView
    public final void setFilters(InputFilter[] inputFilterArr) {
        m1082a();
        ajf.m803d();
        super.setFilters(inputFilterArr);
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0749jp c0749jp = this.f1001b;
        if (c0749jp != null) {
            c0749jp.m13418c(context, i);
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f) {
        Method method = C0864nw.f44818a;
        super.setTextSize(i, f);
    }

    public AppCompatButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0100R.attr.buttonStyle);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C0849nh.m17473a(context);
        C0847nf.m17435d(this, getContext());
        C0266ij c0266ij = new C0266ij(this);
        this.f1000a = c0266ij;
        c0266ij.m11393d(attributeSet, i);
        C0749jp c0749jp = new C0749jp(this);
        this.f1001b = c0749jp;
        c0749jp.m13417b(attributeSet, i);
        c0749jp.m13416a();
        m1082a().m769n(attributeSet, i);
    }
}
