package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import p104f.C5452a;
import p254m2.C7472a;
import p286o2.C7906f;

/* JADX INFO: renamed from: androidx.appcompat.widget.b1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0300b1 {

    /* JADX INFO: renamed from: a */
    public final Context f1133a;

    /* JADX INFO: renamed from: b */
    public final TypedArray f1134b;

    /* JADX INFO: renamed from: c */
    public TypedValue f1135c;

    public C0300b1(Context context, TypedArray typedArray) {
        this.f1133a = context;
        this.f1134b = typedArray;
    }

    /* JADX INFO: renamed from: m */
    public static C0300b1 m1111m(Context context, AttributeSet attributeSet, int[] iArr, int i10) {
        return new C0300b1(context, context.obtainStyledAttributes(attributeSet, iArr, i10, 0));
    }

    /* JADX INFO: renamed from: a */
    public final boolean m1112a(int i10, boolean z10) {
        return this.f1134b.getBoolean(i10, z10);
    }

    /* JADX INFO: renamed from: b */
    public final ColorStateList m1113b(int i10) {
        int resourceId;
        ColorStateList colorStateListM14842b;
        TypedArray typedArray = this.f1134b;
        return (!typedArray.hasValue(i10) || (resourceId = typedArray.getResourceId(i10, 0)) == 0 || (colorStateListM14842b = C7472a.m14842b(resourceId, this.f1133a)) == null) ? typedArray.getColorStateList(i10) : colorStateListM14842b;
    }

    /* JADX INFO: renamed from: c */
    public final int m1114c(int i10, int i11) {
        return this.f1134b.getDimensionPixelOffset(i10, i11);
    }

    /* JADX INFO: renamed from: d */
    public final int m1115d(int i10, int i11) {
        return this.f1134b.getDimensionPixelSize(i10, i11);
    }

    /* JADX INFO: renamed from: e */
    public final Drawable m1116e(int i10) {
        int resourceId;
        TypedArray typedArray = this.f1134b;
        return (!typedArray.hasValue(i10) || (resourceId = typedArray.getResourceId(i10, 0)) == 0) ? typedArray.getDrawable(i10) : C5452a.m11672a(this.f1133a, resourceId);
    }

    /* JADX INFO: renamed from: f */
    public final Drawable m1117f(int i10) {
        int resourceId;
        Drawable drawableM1262f;
        if (!this.f1134b.hasValue(i10) || (resourceId = this.f1134b.getResourceId(i10, 0)) == 0) {
            return null;
        }
        C0319i c0319iM1201a = C0319i.m1201a();
        Context context = this.f1133a;
        synchronized (c0319iM1201a) {
            drawableM1262f = c0319iM1201a.f1219a.m1262f(context, resourceId, true);
        }
        return drawableM1262f;
    }

    /* JADX INFO: renamed from: g */
    public final Typeface m1118g(int i10, int i11, C0350x.a aVar) {
        int resourceId = this.f1134b.getResourceId(i10, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f1135c == null) {
            this.f1135c = new TypedValue();
        }
        TypedValue typedValue = this.f1135c;
        ThreadLocal<TypedValue> threadLocal = C7906f.f43056a;
        Context context = this.f1133a;
        if (context.isRestricted()) {
            return null;
        }
        return C7906f.m15675b(context, resourceId, typedValue, i11, aVar, true, false);
    }

    /* JADX INFO: renamed from: h */
    public final int m1119h(int i10, int i11) {
        return this.f1134b.getInt(i10, i11);
    }

    /* JADX INFO: renamed from: i */
    public final int m1120i(int i10, int i11) {
        return this.f1134b.getResourceId(i10, i11);
    }

    /* JADX INFO: renamed from: j */
    public final String m1121j(int i10) {
        return this.f1134b.getString(i10);
    }

    /* JADX INFO: renamed from: k */
    public final CharSequence m1122k(int i10) {
        return this.f1134b.getText(i10);
    }

    /* JADX INFO: renamed from: l */
    public final boolean m1123l(int i10) {
        return this.f1134b.hasValue(i10);
    }

    /* JADX INFO: renamed from: n */
    public final void m1124n() {
        this.f1134b.recycle();
    }
}
