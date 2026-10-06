package com.google.android.clockwork.common.wearable.wearmaterial.button;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.apps.camera.bottombar.C0100R;
import p000.C1178zm;
import p000.iwf;
import p000.iwi;
import p000.iwq;
import p000.jbx;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class WearCircularButton extends iwi {

    /* JADX INFO: renamed from: j */
    private iwq f7454j;

    public WearCircularButton(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: g */
    private static final int m4599g(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        switch (mode) {
            case Integer.MIN_VALUE:
                return Math.min(size, i);
            case 1073741824:
                return size;
            default:
                return i;
        }
    }

    @Override // p000.iwi
    /* JADX INFO: renamed from: f */
    public final void mo4592f(int i) {
        if (i != 0) {
            this.f32475f.setImageResource(i);
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        int dimensionPixelSize = getResources().getDimensionPixelSize(this.f7454j.f32502e);
        int iMin = Math.min(m4599g(dimensionPixelSize, i), m4599g(dimensionPixelSize, i2));
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), View.MeasureSpec.makeMeasureSpec(iMin, 1073741824));
    }

    public WearCircularButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0100R.attr.wearCircularButtonStyle);
    }

    public WearCircularButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f7454j = iwq.STANDARD;
        this.f32473d = m11822a(jbx.m12862g(context, C0100R.attr.colorPrimary), jbx.m12862g(context, C0100R.attr.colorOnPrimary));
        LayoutInflater.from(getContext()).inflate(C0100R.layout.wear_circular_button_layout, (ViewGroup) this, true);
        this.f32475f = (ImageView) findViewById(C0100R.id.icon);
        super.m11826d(attributeSet, i);
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(attributeSet, iwf.f32466c, i, C0100R.style.WearCircularButtonDefault);
        try {
            this.f7454j = iwq.values()[jbx.m12865j(typedArrayObtainStyledAttributes.getInt(0, iwq.STANDARD.ordinal()), 0, iwq.values().length - 1)];
            int dimensionPixelSize = getResources().getDimensionPixelSize(this.f7454j.f32503f);
            C1178zm c1178zm = (C1178zm) this.f32475f.getLayoutParams();
            c1178zm.width = dimensionPixelSize;
            c1178zm.height = dimensionPixelSize;
            this.f32475f.setLayoutParams(c1178zm);
            requestLayout();
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }
}
