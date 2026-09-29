package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import com.linguist.R;
import p072dd.C5149b;
import p072dd.C5150c;
import p153hc.C6031a;

/* JADX INFO: renamed from: com.google.android.material.datepicker.b */
/* JADX INFO: loaded from: classes.dex */
public final class C2999b {

    /* JADX INFO: renamed from: a */
    public final C2997a f15145a;

    /* JADX INFO: renamed from: b */
    public final C2997a f15146b;

    /* JADX INFO: renamed from: c */
    public final C2997a f15147c;

    /* JADX INFO: renamed from: d */
    public final C2997a f15148d;

    /* JADX INFO: renamed from: e */
    public final C2997a f15149e;

    /* JADX INFO: renamed from: f */
    public final C2997a f15150f;

    /* JADX INFO: renamed from: g */
    public final C2997a f15151g;

    /* JADX INFO: renamed from: h */
    public final Paint f15152h;

    public C2999b(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(C5149b.m10924c(context, R.attr.materialCalendarStyle, MaterialCalendar.class.getCanonicalName()).data, C6031a.f35670t);
        this.f15145a = C2997a.m8738a(typedArrayObtainStyledAttributes.getResourceId(3, 0), context);
        this.f15151g = C2997a.m8738a(typedArrayObtainStyledAttributes.getResourceId(1, 0), context);
        this.f15146b = C2997a.m8738a(typedArrayObtainStyledAttributes.getResourceId(2, 0), context);
        this.f15147c = C2997a.m8738a(typedArrayObtainStyledAttributes.getResourceId(4, 0), context);
        ColorStateList colorStateListM10925a = C5150c.m10925a(context, typedArrayObtainStyledAttributes, 6);
        this.f15148d = C2997a.m8738a(typedArrayObtainStyledAttributes.getResourceId(8, 0), context);
        this.f15149e = C2997a.m8738a(typedArrayObtainStyledAttributes.getResourceId(7, 0), context);
        this.f15150f = C2997a.m8738a(typedArrayObtainStyledAttributes.getResourceId(9, 0), context);
        Paint paint = new Paint();
        this.f15152h = paint;
        paint.setColor(colorStateListM10925a.getDefaultColor());
        typedArrayObtainStyledAttributes.recycle();
    }
}
