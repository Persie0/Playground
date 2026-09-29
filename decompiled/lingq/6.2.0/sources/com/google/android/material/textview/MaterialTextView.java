package com.google.android.material.textview;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.material.R$attr;
import com.google.android.material.R$styleable;
import p000.C3048gr;
import p000.pb1;
import p000.qs5;
import p000.xwc;

/* JADX INFO: loaded from: classes.dex */
public class MaterialTextView extends C3048gr {
    public MaterialTextView(Context context, AttributeSet attributeSet, int i) {
        super(qs5.m20141b(context, attributeSet, i, 0), attributeSet, i);
        m6243e(attributeSet, i, 0);
    }

    /* JADX INFO: renamed from: e */
    public final void m6243e(AttributeSet attributeSet, int i, int i2) {
        Context context = getContext();
        if (xwc.m24749V(context.getTheme(), R$attr.textAppearanceLineHeightEnabled, true)) {
            Resources.Theme theme = context.getTheme();
            TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, R$styleable.MaterialTextView, i, i2);
            int[] iArr = {R$styleable.MaterialTextView_android_lineHeight, R$styleable.MaterialTextView_lineHeight};
            int iM19056z = -1;
            for (int i3 = 0; i3 < 2 && iM19056z < 0; i3++) {
                iM19056z = pb1.m19056z(context, typedArrayObtainStyledAttributes, iArr[i3], -1);
            }
            typedArrayObtainStyledAttributes.recycle();
            if (iM19056z != -1) {
                return;
            }
            TypedArray typedArrayObtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, R$styleable.MaterialTextView, i, i2);
            int resourceId = typedArrayObtainStyledAttributes2.getResourceId(R$styleable.MaterialTextView_android_textAppearance, -1);
            typedArrayObtainStyledAttributes2.recycle();
            if (resourceId != -1) {
                TypedArray typedArrayObtainStyledAttributes3 = theme.obtainStyledAttributes(resourceId, R$styleable.MaterialTextAppearance);
                Context context2 = getContext();
                int[] iArr2 = {R$styleable.MaterialTextAppearance_android_lineHeight, R$styleable.MaterialTextAppearance_lineHeight};
                int iM19056z2 = -1;
                for (int i4 = 0; i4 < 2 && iM19056z2 < 0; i4++) {
                    iM19056z2 = pb1.m19056z(context2, typedArrayObtainStyledAttributes3, iArr2[i4], -1);
                }
                typedArrayObtainStyledAttributes3.recycle();
                if (iM19056z2 >= 0) {
                    setLineHeight(iM19056z2);
                }
            }
        }
    }

    @Override // p000.C3048gr, android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (xwc.m24749V(context.getTheme(), R$attr.textAppearanceLineHeightEnabled, true)) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(i, R$styleable.MaterialTextAppearance);
            Context context2 = getContext();
            int[] iArr = {R$styleable.MaterialTextAppearance_android_lineHeight, R$styleable.MaterialTextAppearance_lineHeight};
            int iM19056z = -1;
            for (int i2 = 0; i2 < 2 && iM19056z < 0; i2++) {
                iM19056z = pb1.m19056z(context2, typedArrayObtainStyledAttributes, iArr[i2], -1);
            }
            typedArrayObtainStyledAttributes.recycle();
            if (iM19056z >= 0) {
                setLineHeight(iM19056z);
            }
        }
    }

    public MaterialTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    public MaterialTextView(Context context) {
        this(context, null);
    }

    public MaterialTextView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(qs5.m20141b(context, attributeSet, i, i2), attributeSet, i);
        m6243e(attributeSet, i, i2);
    }
}
