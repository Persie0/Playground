package com.google.android.material.snackbar;

import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.camera.bottombar.C0100R;
import p000.afc;
import p000.lij;
import p000.mfs;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class SnackbarContentLayout extends LinearLayout {

    /* JADX INFO: renamed from: a */
    private TextView f8176a;

    public SnackbarContentLayout(Context context) {
        this(context, null);
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.f8176a = (TextView) findViewById(C0100R.id.snackbar_text);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        boolean z = true;
        if (getOrientation() == 1) {
            return;
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(C0100R.dimen.design_snackbar_padding_vertical_2lines);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(C0100R.dimen.design_snackbar_padding_vertical);
        Layout layout = this.f8176a.getLayout();
        if (layout == null || layout.getLineCount() <= 1) {
            dimensionPixelSize = dimensionPixelSize2;
        }
        if (getOrientation() != 0) {
            setOrientation(0);
        } else {
            z = false;
        }
        if (this.f8176a.getPaddingTop() != dimensionPixelSize || this.f8176a.getPaddingBottom() != dimensionPixelSize) {
            TextView textView = this.f8176a;
            if (afc.m450k(textView)) {
                afc.m449j(textView, afc.m444e(textView), dimensionPixelSize, afc.m443d(textView), dimensionPixelSize);
            } else {
                textView.setPadding(textView.getPaddingLeft(), dimensionPixelSize, textView.getPaddingRight(), dimensionPixelSize);
            }
        } else if (!z) {
            return;
        }
        super.onMeasure(i, i2);
    }

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        lij.m15398F(context, C0100R.attr.motionEasingEmphasizedInterpolator, mfs.f40384b);
    }
}
