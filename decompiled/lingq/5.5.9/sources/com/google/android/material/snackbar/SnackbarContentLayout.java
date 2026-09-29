package com.google.android.material.snackbar;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.linguist.R;
import java.util.WeakHashMap;
import p177ic.C6308a;
import p199jd.InterfaceC6463h;
import p471x2.C10029b0;
import p471x2.C10049l0;
import p531zc.C10477a;

/* JADX INFO: loaded from: classes.dex */
public class SnackbarContentLayout extends LinearLayout implements InterfaceC6463h {

    /* JADX INFO: renamed from: a */
    public TextView f15584a;

    /* JADX INFO: renamed from: b */
    public Button f15585b;

    /* JADX INFO: renamed from: c */
    public final TimeInterpolator f15586c;

    /* JADX INFO: renamed from: d */
    public int f15587d;

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f15586c = C10477a.m19429d(context, R.attr.motionEasingEmphasizedInterpolator, C6308a.f36524b);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m8845a(int i10, int i11, int i12) {
        boolean z10;
        if (i10 != getOrientation()) {
            setOrientation(i10);
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f15584a.getPaddingTop() == i11 && this.f15584a.getPaddingBottom() == i12) {
            return z10;
        }
        TextView textView = this.f15584a;
        WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
        if (C10029b0.e.m18689g(textView)) {
            C10029b0.e.m18693k(textView, C10029b0.e.m18688f(textView), i11, C10029b0.e.m18687e(textView), i12);
            return true;
        }
        textView.setPadding(textView.getPaddingLeft(), i11, textView.getPaddingRight(), i12);
        return true;
    }

    public Button getActionView() {
        return this.f15585b;
    }

    public TextView getMessageView() {
        return this.f15584a;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f15584a = (TextView) findViewById(R.id.snackbar_text);
        this.f15585b = (Button) findViewById(R.id.snackbar_action);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x006d  */
    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        boolean z10 = true;
        if (getOrientation() == 1) {
            return;
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical_2lines);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical);
        Layout layout = this.f15584a.getLayout();
        boolean z11 = layout != null && layout.getLineCount() > 1;
        if (!z11 || this.f15587d <= 0 || this.f15585b.getMeasuredWidth() <= this.f15587d) {
            if (!z11) {
                dimensionPixelSize = dimensionPixelSize2;
            }
            if (!m8845a(0, dimensionPixelSize, dimensionPixelSize)) {
                z10 = false;
            }
        } else if (!m8845a(1, dimensionPixelSize, dimensionPixelSize - dimensionPixelSize2)) {
            z10 = false;
        }
        if (z10) {
            super.onMeasure(i10, i11);
        }
    }

    public void setMaxInlineActionWidth(int i10) {
        this.f15587d = i10;
    }
}
