package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.widget.TextView;
import dm.C5212l;
import gd.C5762a;
import gd.C5768g;
import gd.C5772k;
import java.util.WeakHashMap;
import p072dd.C5150c;
import p153hc.C6031a;
import p471x2.C10029b0;
import p471x2.C10049l0;

/* JADX INFO: renamed from: com.google.android.material.datepicker.a */
/* JADX INFO: loaded from: classes.dex */
public final class C2997a {

    /* JADX INFO: renamed from: a */
    public final Rect f15137a;

    /* JADX INFO: renamed from: b */
    public final ColorStateList f15138b;

    /* JADX INFO: renamed from: c */
    public final ColorStateList f15139c;

    /* JADX INFO: renamed from: d */
    public final ColorStateList f15140d;

    /* JADX INFO: renamed from: e */
    public final int f15141e;

    /* JADX INFO: renamed from: f */
    public final C5772k f15142f;

    public C2997a(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i10, C5772k c5772k, Rect rect) {
        C5212l.m11131B(rect.left);
        C5212l.m11131B(rect.top);
        C5212l.m11131B(rect.right);
        C5212l.m11131B(rect.bottom);
        this.f15137a = rect;
        this.f15138b = colorStateList2;
        this.f15139c = colorStateList;
        this.f15140d = colorStateList3;
        this.f15141e = i10;
        this.f15142f = c5772k;
    }

    /* JADX INFO: renamed from: a */
    public static C2997a m8738a(int i10, Context context) {
        C5212l.m11130A("Cannot create a CalendarItemStyle with a styleResId of 0", i10 != 0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i10, C6031a.f35671u);
        Rect rect = new Rect(typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(2, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(3, 0));
        ColorStateList colorStateListM10925a = C5150c.m10925a(context, typedArrayObtainStyledAttributes, 4);
        ColorStateList colorStateListM10925a2 = C5150c.m10925a(context, typedArrayObtainStyledAttributes, 9);
        ColorStateList colorStateListM10925a3 = C5150c.m10925a(context, typedArrayObtainStyledAttributes, 7);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(8, 0);
        C5772k c5772k = new C5772k(C5772k.m12149a(context, typedArrayObtainStyledAttributes.getResourceId(5, 0), typedArrayObtainStyledAttributes.getResourceId(6, 0), new C5762a(0)));
        typedArrayObtainStyledAttributes.recycle();
        return new C2997a(colorStateListM10925a, colorStateListM10925a2, colorStateListM10925a3, dimensionPixelSize, c5772k, rect);
    }

    /* JADX INFO: renamed from: b */
    public final void m8739b(TextView textView) {
        C5768g c5768g = new C5768g();
        C5768g c5768g2 = new C5768g();
        C5772k c5772k = this.f15142f;
        c5768g.setShapeAppearanceModel(c5772k);
        c5768g2.setShapeAppearanceModel(c5772k);
        c5768g.m12141m(this.f15139c);
        c5768g.f34857a.f34880k = this.f15141e;
        c5768g.invalidateSelf();
        c5768g.m12145q(this.f15140d);
        ColorStateList colorStateList = this.f15138b;
        textView.setTextColor(colorStateList);
        RippleDrawable rippleDrawable = new RippleDrawable(colorStateList.withAlpha(30), c5768g, c5768g2);
        Rect rect = this.f15137a;
        InsetDrawable insetDrawable = new InsetDrawable((Drawable) rippleDrawable, rect.left, rect.top, rect.right, rect.bottom);
        WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
        C10029b0.d.m18680q(textView, insetDrawable);
    }
}
