package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.Xml;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: renamed from: zq */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class C1182zq {

    /* JADX INFO: renamed from: a */
    float f48454a;

    /* JADX INFO: renamed from: b */
    float f48455b;

    /* JADX INFO: renamed from: c */
    float f48456c;

    /* JADX INFO: renamed from: d */
    float f48457d;

    /* JADX INFO: renamed from: e */
    public int f48458e;

    /* JADX INFO: renamed from: f */
    public C1190zy f48459f;

    public C1182zq(Context context, XmlPullParser xmlPullParser) {
        this.f48454a = Float.NaN;
        this.f48455b = Float.NaN;
        this.f48456c = Float.NaN;
        this.f48457d = Float.NaN;
        this.f48458e = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), aad.f10j);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == 0) {
                this.f48458e = typedArrayObtainStyledAttributes.getResourceId(0, this.f48458e);
                String resourceTypeName = context.getResources().getResourceTypeName(this.f48458e);
                context.getResources().getResourceName(this.f48458e);
                if ("layout".equals(resourceTypeName)) {
                    C1190zy c1190zy = new C1190zy();
                    this.f48459f = c1190zy;
                    c1190zy.m19821f(context, this.f48458e);
                }
            } else if (index == 1) {
                this.f48457d = typedArrayObtainStyledAttributes.getDimension(1, this.f48457d);
            } else if (index == 2) {
                this.f48455b = typedArrayObtainStyledAttributes.getDimension(2, this.f48455b);
            } else if (index == 3) {
                this.f48456c = typedArrayObtainStyledAttributes.getDimension(3, this.f48456c);
            } else if (index == 4) {
                this.f48454a = typedArrayObtainStyledAttributes.getDimension(4, this.f48454a);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: a */
    public final boolean m19803a(float f, float f2) {
        if (!Float.isNaN(this.f48454a) && f < this.f48454a) {
            return false;
        }
        if (!Float.isNaN(this.f48455b) && f2 < this.f48455b) {
            return false;
        }
        if (Float.isNaN(this.f48456c) || f <= this.f48456c) {
            return Float.isNaN(this.f48457d) || f2 <= this.f48457d;
        }
        return false;
    }
}
