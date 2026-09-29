package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.R$styleable;

/* JADX INFO: loaded from: classes2.dex */
public final class kj1 {

    /* JADX INFO: renamed from: a */
    public final float f47364a;

    /* JADX INFO: renamed from: b */
    public final float f47365b;

    /* JADX INFO: renamed from: c */
    public final float f47366c;

    /* JADX INFO: renamed from: d */
    public final float f47367d;

    /* JADX INFO: renamed from: e */
    public final int f47368e;

    /* JADX INFO: renamed from: f */
    public final sj1 f47369f;

    public kj1(Context context, XmlResourceParser xmlResourceParser) {
        this.f47364a = Float.NaN;
        this.f47365b = Float.NaN;
        this.f47366c = Float.NaN;
        this.f47367d = Float.NaN;
        this.f47368e = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), R$styleable.Variant);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == R$styleable.Variant_constraints) {
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f47368e);
                this.f47368e = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    sj1 sj1Var = new sj1();
                    this.f47369f = sj1Var;
                    sj1Var.m21410e((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                }
            } else if (index == R$styleable.Variant_region_heightLessThan) {
                this.f47367d = typedArrayObtainStyledAttributes.getDimension(index, this.f47367d);
            } else if (index == R$styleable.Variant_region_heightMoreThan) {
                this.f47365b = typedArrayObtainStyledAttributes.getDimension(index, this.f47365b);
            } else if (index == R$styleable.Variant_region_widthLessThan) {
                this.f47366c = typedArrayObtainStyledAttributes.getDimension(index, this.f47366c);
            } else if (index == R$styleable.Variant_region_widthMoreThan) {
                this.f47364a = typedArrayObtainStyledAttributes.getDimension(index, this.f47364a);
            } else {
                Log.v("ConstraintLayoutStates", "Unknown tag");
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: a */
    public final boolean m15267a(float f, float f2) {
        float f3 = this.f47364a;
        if (!Float.isNaN(f3) && f < f3) {
            return false;
        }
        float f4 = this.f47365b;
        if (!Float.isNaN(f4) && f2 < f4) {
            return false;
        }
        float f5 = this.f47366c;
        if (!Float.isNaN(f5) && f > f5) {
            return false;
        }
        float f6 = this.f47367d;
        return Float.isNaN(f6) || f2 <= f6;
    }
}
