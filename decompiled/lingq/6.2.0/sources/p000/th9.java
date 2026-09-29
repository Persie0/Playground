package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.Xml;
import androidx.constraintlayout.widget.R$styleable;

/* JADX INFO: loaded from: classes2.dex */
public final class th9 {

    /* JADX INFO: renamed from: a */
    public final float f62295a;

    /* JADX INFO: renamed from: b */
    public final float f62296b;

    /* JADX INFO: renamed from: c */
    public final float f62297c;

    /* JADX INFO: renamed from: d */
    public final float f62298d;

    /* JADX INFO: renamed from: e */
    public final int f62299e;

    public th9(Context context, XmlResourceParser xmlResourceParser) {
        this.f62295a = Float.NaN;
        this.f62296b = Float.NaN;
        this.f62297c = Float.NaN;
        this.f62298d = Float.NaN;
        this.f62299e = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), R$styleable.Variant);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == R$styleable.Variant_constraints) {
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f62299e);
                this.f62299e = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                "layout".equals(resourceTypeName);
            } else if (index == R$styleable.Variant_region_heightLessThan) {
                this.f62298d = typedArrayObtainStyledAttributes.getDimension(index, this.f62298d);
            } else if (index == R$styleable.Variant_region_heightMoreThan) {
                this.f62296b = typedArrayObtainStyledAttributes.getDimension(index, this.f62296b);
            } else if (index == R$styleable.Variant_region_widthLessThan) {
                this.f62297c = typedArrayObtainStyledAttributes.getDimension(index, this.f62297c);
            } else if (index == R$styleable.Variant_region_widthMoreThan) {
                this.f62295a = typedArrayObtainStyledAttributes.getDimension(index, this.f62295a);
            } else {
                Log.v("ConstraintLayoutStates", "Unknown tag");
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
