package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import com.linguist.R;
import p024b3.C1304k;
import p024b3.InterfaceC1295b;

/* JADX INFO: renamed from: androidx.appcompat.widget.e */
/* JADX INFO: loaded from: classes.dex */
public class C0307e extends Button implements InterfaceC1295b {

    /* JADX INFO: renamed from: a */
    public final C0304d f1167a;

    /* JADX INFO: renamed from: b */
    public final C0350x f1168b;

    /* JADX INFO: renamed from: c */
    public C0324k f1169c;

    public C0307e(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.buttonStyle);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0307e(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        C0353y0.m1309a(context);
        C0349w0.m1279a(getContext(), this);
        C0304d c0304d = new C0304d(this);
        this.f1167a = c0304d;
        c0304d.m1128d(attributeSet, i10);
        C0350x c0350x = new C0350x(this);
        this.f1168b = c0350x;
        c0350x.m1288f(attributeSet, i10);
        c0350x.m1285b();
        getEmojiTextViewHelper().m1233b(attributeSet, i10);
    }

    private C0324k getEmojiTextViewHelper() {
        if (this.f1169c == null) {
            this.f1169c = new C0324k(this);
        }
        return this.f1169c;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0304d c0304d = this.f1167a;
        if (c0304d != null) {
            c0304d.m1125a();
        }
        C0350x c0350x = this.f1168b;
        if (c0350x != null) {
            c0350x.m1285b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (C0318h1.f1216b) {
            return super.getAutoSizeMaxTextSize();
        }
        C0350x c0350x = this.f1168b;
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
        C0350x c0350x = this.f1168b;
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
        C0350x c0350x = this.f1168b;
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
        C0350x c0350x = this.f1168b;
        return c0350x != null ? c0350x.f1381i.f1401f : new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (C0318h1.f1216b) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        C0350x c0350x = this.f1168b;
        if (c0350x != null) {
            return c0350x.f1381i.f1396a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return C1304k.m4831f(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0304d c0304d = this.f1167a;
        if (c0304d != null) {
            return c0304d.m1126b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0304d c0304d = this.f1167a;
        if (c0304d != null) {
            return c0304d.m1127c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f1168b.m1286d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f1168b.m1287e();
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
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        C0350x c0350x = this.f1168b;
        if (c0350x == null || C0318h1.f1216b) {
            return;
        }
        c0350x.f1381i.m1313a();
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        boolean z10 = false;
        C0350x c0350x = this.f1168b;
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
        C0350x c0350x = this.f1168b;
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
        C0350x c0350x = this.f1168b;
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
        C0350x c0350x = this.f1168b;
        if (c0350x != null) {
            c0350x.m1292j(i10);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0304d c0304d = this.f1167a;
        if (c0304d != null) {
            c0304d.m1129e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        C0304d c0304d = this.f1167a;
        if (c0304d != null) {
            c0304d.m1130f(i10);
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

    public void setSupportAllCaps(boolean z10) {
        C0350x c0350x = this.f1168b;
        if (c0350x != null) {
            c0350x.f1373a.setAllCaps(z10);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0304d c0304d = this.f1167a;
        if (c0304d != null) {
            c0304d.m1132h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0304d c0304d = this.f1167a;
        if (c0304d != null) {
            c0304d.m1133i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C0350x c0350x = this.f1168b;
        c0350x.m1293k(colorStateList);
        c0350x.m1285b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C0350x c0350x = this.f1168b;
        c0350x.m1294l(mode);
        c0350x.m1285b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        C0350x c0350x = this.f1168b;
        if (c0350x != null) {
            c0350x.m1289g(i10, context);
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i10, float f3) {
        boolean z10 = C0318h1.f1216b;
        if (z10) {
            super.setTextSize(i10, f3);
            return;
        }
        C0350x c0350x = this.f1168b;
        if (c0350x != null && !z10) {
            C0354z c0354z = c0350x.f1381i;
            if (!(c0354z.m1318i() && c0354z.f1396a != 0)) {
                c0354z.m1315f(i10, f3);
            }
        }
    }
}
