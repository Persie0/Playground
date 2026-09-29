package com.google.android.material.textview;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import md.C7542a;
import p072dd.C5149b;
import p072dd.C5150c;
import p153hc.C6031a;

/* JADX INFO: loaded from: classes.dex */
public class MaterialTextView extends AppCompatTextView {
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public MaterialTextView(Context context, AttributeSet attributeSet) {
        super(C7542a.m15048a(context, attributeSet, R.attr.textViewStyle, 0), attributeSet, R.attr.textViewStyle);
        Context context2 = getContext();
        boolean z10 = true;
        if (C5149b.m10923b(context2, com.linguist.R.attr.textAppearanceLineHeightEnabled, true)) {
            Resources.Theme theme = context2.getTheme();
            int[] iArr = C6031a.f35632A;
            TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, R.attr.textViewStyle, 0);
            int[] iArr2 = {1, 2};
            int iM10927c = -1;
            for (int i10 = 0; i10 < 2 && iM10927c < 0; i10++) {
                iM10927c = C5150c.m10927c(context2, typedArrayObtainStyledAttributes, iArr2[i10], -1);
            }
            typedArrayObtainStyledAttributes.recycle();
            if (iM10927c == -1) {
                z10 = false;
            }
            if (z10) {
                return;
            }
            TypedArray typedArrayObtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, iArr, R.attr.textViewStyle, 0);
            int resourceId = typedArrayObtainStyledAttributes2.getResourceId(0, -1);
            typedArrayObtainStyledAttributes2.recycle();
            if (resourceId != -1) {
                m8920l(resourceId, theme);
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m8920l(int i10, Resources.Theme theme) {
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(i10, C6031a.f35676z);
        Context context = getContext();
        int[] iArr = {1, 2};
        int iM10927c = -1;
        for (int i11 = 0; i11 < 2 && iM10927c < 0; i11++) {
            iM10927c = C5150c.m10927c(context, typedArrayObtainStyledAttributes, iArr[i11], -1);
        }
        typedArrayObtainStyledAttributes.recycle();
        if (iM10927c >= 0) {
            setLineHeight(iM10927c);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public final void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        if (C5149b.m10923b(context, com.linguist.R.attr.textAppearanceLineHeightEnabled, true)) {
            m8920l(i10, context.getTheme());
        }
    }
}
