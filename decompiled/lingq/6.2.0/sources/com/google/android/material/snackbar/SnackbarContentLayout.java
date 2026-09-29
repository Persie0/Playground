package com.google.android.material.snackbar;

import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.R$attr;
import com.google.android.material.R$dimen;
import com.google.android.material.R$id;
import p000.AbstractC0853cn;
import p000.r46;

/* JADX INFO: loaded from: classes2.dex */
public class SnackbarContentLayout extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public TextView f13230a;

    /* JADX INFO: renamed from: b */
    public Button f13231b;

    /* JADX INFO: renamed from: c */
    public Button f13232c;

    /* JADX INFO: renamed from: d */
    public int f13233d;

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        r46.m20365H(context, R$attr.motionEasingEmphasizedInterpolator, AbstractC0853cn.f10297b);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m6216a(int i, int i2, int i3) {
        boolean z;
        if (i != getOrientation()) {
            setOrientation(i);
            z = true;
        } else {
            z = false;
        }
        if (this.f13230a.getPaddingTop() == i2 && this.f13230a.getPaddingBottom() == i3) {
            return z;
        }
        TextView textView = this.f13230a;
        if (textView.isPaddingRelative()) {
            textView.setPaddingRelative(textView.getPaddingStart(), i2, textView.getPaddingEnd(), i3);
            return true;
        }
        textView.setPadding(textView.getPaddingLeft(), i2, textView.getPaddingRight(), i3);
        return true;
    }

    public Button getActionView() {
        return this.f13231b;
    }

    public Button getCloseView() {
        return this.f13232c;
    }

    public TextView getMessageView() {
        return this.f13230a;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f13230a = (TextView) findViewById(R$id.snackbar_text);
        this.f13231b = (Button) findViewById(R$id.snackbar_action);
        this.f13232c = (Button) findViewById(R$id.mtrl_snackbar_close);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (getOrientation() == 1) {
            return;
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(R$dimen.design_snackbar_padding_vertical_2lines);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R$dimen.design_snackbar_padding_vertical);
        Layout layout = this.f13230a.getLayout();
        boolean z = layout != null && layout.getLineCount() > 1;
        if (!z || this.f13233d <= 0 || this.f13231b.getMeasuredWidth() <= this.f13233d) {
            if (!z) {
                dimensionPixelSize = dimensionPixelSize2;
            }
            if (!m6216a(0, dimensionPixelSize, dimensionPixelSize)) {
                return;
            }
        } else if (!m6216a(1, dimensionPixelSize, dimensionPixelSize - dimensionPixelSize2)) {
            return;
        }
        super.onMeasure(i, i2);
    }

    public void setMaxInlineActionWidth(int i) {
        this.f13233d = i;
    }

    public SnackbarContentLayout(Context context) {
        this(context, null);
    }
}
