package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.RectF;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import p143h2.C5881d;

/* JADX INFO: renamed from: androidx.constraintlayout.motion.widget.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0754b {

    /* JADX INFO: renamed from: E */
    public static final float[][] f5186E = {new float[]{0.5f, 0.0f}, new float[]{0.0f, 0.5f}, new float[]{1.0f, 0.5f}, new float[]{0.5f, 1.0f}, new float[]{0.5f, 0.5f}, new float[]{0.0f, 0.5f}, new float[]{1.0f, 0.5f}};

    /* JADX INFO: renamed from: F */
    public static final float[][] f5187F = {new float[]{0.0f, -1.0f}, new float[]{0.0f, 1.0f}, new float[]{-1.0f, 0.0f}, new float[]{1.0f, 0.0f}, new float[]{-1.0f, 0.0f}, new float[]{1.0f, 0.0f}};

    /* JADX INFO: renamed from: A */
    public float f5188A;

    /* JADX INFO: renamed from: B */
    public float f5189B;

    /* JADX INFO: renamed from: C */
    public int f5190C;

    /* JADX INFO: renamed from: D */
    public int f5191D;

    /* JADX INFO: renamed from: a */
    public int f5192a;

    /* JADX INFO: renamed from: b */
    public int f5193b;

    /* JADX INFO: renamed from: c */
    public int f5194c;

    /* JADX INFO: renamed from: d */
    public int f5195d;

    /* JADX INFO: renamed from: e */
    public int f5196e;

    /* JADX INFO: renamed from: f */
    public int f5197f;

    /* JADX INFO: renamed from: g */
    public float f5198g;

    /* JADX INFO: renamed from: h */
    public float f5199h;

    /* JADX INFO: renamed from: i */
    public int f5200i;

    /* JADX INFO: renamed from: j */
    public boolean f5201j;

    /* JADX INFO: renamed from: k */
    public float f5202k;

    /* JADX INFO: renamed from: l */
    public float f5203l;

    /* JADX INFO: renamed from: m */
    public boolean f5204m = false;

    /* JADX INFO: renamed from: n */
    public final float[] f5205n = new float[2];

    /* JADX INFO: renamed from: o */
    public final int[] f5206o = new int[2];

    /* JADX INFO: renamed from: p */
    public float f5207p;

    /* JADX INFO: renamed from: q */
    public float f5208q;

    /* JADX INFO: renamed from: r */
    public final MotionLayout f5209r;

    /* JADX INFO: renamed from: s */
    public float f5210s;

    /* JADX INFO: renamed from: t */
    public float f5211t;

    /* JADX INFO: renamed from: u */
    public boolean f5212u;

    /* JADX INFO: renamed from: v */
    public float f5213v;

    /* JADX INFO: renamed from: w */
    public int f5214w;

    /* JADX INFO: renamed from: x */
    public float f5215x;

    /* JADX INFO: renamed from: y */
    public float f5216y;

    /* JADX INFO: renamed from: z */
    public float f5217z;

    public C0754b(Context context, MotionLayout motionLayout, XmlResourceParser xmlResourceParser) {
        this.f5192a = 0;
        this.f5193b = 0;
        this.f5194c = 0;
        this.f5195d = -1;
        this.f5196e = -1;
        this.f5197f = -1;
        this.f5198g = 0.5f;
        this.f5199h = 0.5f;
        this.f5200i = -1;
        this.f5201j = false;
        this.f5202k = 0.0f;
        this.f5203l = 1.0f;
        this.f5210s = 4.0f;
        this.f5211t = 1.2f;
        this.f5212u = true;
        this.f5213v = 1.0f;
        this.f5214w = 0;
        this.f5215x = 10.0f;
        this.f5216y = 10.0f;
        this.f5217z = 1.0f;
        this.f5188A = Float.NaN;
        this.f5189B = Float.NaN;
        this.f5190C = 0;
        this.f5191D = 0;
        this.f5209r = motionLayout;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), C5881d.f35183q);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i10);
            if (index == 16) {
                this.f5195d = typedArrayObtainStyledAttributes.getResourceId(index, this.f5195d);
            } else if (index == 17) {
                int i11 = typedArrayObtainStyledAttributes.getInt(index, this.f5192a);
                this.f5192a = i11;
                float[] fArr = f5186E[i11];
                this.f5199h = fArr[0];
                this.f5198g = fArr[1];
            } else if (index == 1) {
                int i12 = typedArrayObtainStyledAttributes.getInt(index, this.f5193b);
                this.f5193b = i12;
                if (i12 < 6) {
                    float[] fArr2 = f5187F[i12];
                    this.f5202k = fArr2[0];
                    this.f5203l = fArr2[1];
                } else {
                    this.f5203l = Float.NaN;
                    this.f5202k = Float.NaN;
                    this.f5201j = true;
                }
            } else if (index == 6) {
                this.f5210s = typedArrayObtainStyledAttributes.getFloat(index, this.f5210s);
            } else if (index == 5) {
                this.f5211t = typedArrayObtainStyledAttributes.getFloat(index, this.f5211t);
            } else if (index == 7) {
                this.f5212u = typedArrayObtainStyledAttributes.getBoolean(index, this.f5212u);
            } else if (index == 2) {
                this.f5213v = typedArrayObtainStyledAttributes.getFloat(index, this.f5213v);
            } else if (index == 3) {
                this.f5215x = typedArrayObtainStyledAttributes.getFloat(index, this.f5215x);
            } else if (index == 18) {
                this.f5196e = typedArrayObtainStyledAttributes.getResourceId(index, this.f5196e);
            } else if (index == 9) {
                this.f5194c = typedArrayObtainStyledAttributes.getInt(index, this.f5194c);
            } else if (index == 8) {
                this.f5214w = typedArrayObtainStyledAttributes.getInteger(index, 0);
            } else if (index == 4) {
                this.f5197f = typedArrayObtainStyledAttributes.getResourceId(index, 0);
            } else if (index == 10) {
                this.f5200i = typedArrayObtainStyledAttributes.getResourceId(index, this.f5200i);
            } else if (index == 12) {
                this.f5216y = typedArrayObtainStyledAttributes.getFloat(index, this.f5216y);
            } else if (index == 13) {
                this.f5217z = typedArrayObtainStyledAttributes.getFloat(index, this.f5217z);
            } else if (index == 14) {
                this.f5188A = typedArrayObtainStyledAttributes.getFloat(index, this.f5188A);
            } else if (index == 15) {
                this.f5189B = typedArrayObtainStyledAttributes.getFloat(index, this.f5189B);
            } else if (index == 11) {
                this.f5190C = typedArrayObtainStyledAttributes.getInt(index, this.f5190C);
            } else if (index == 0) {
                this.f5191D = typedArrayObtainStyledAttributes.getInt(index, this.f5191D);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: a */
    public final RectF m2845a(MotionLayout motionLayout, RectF rectF) {
        View viewFindViewById;
        int i10 = this.f5197f;
        if (i10 != -1 && (viewFindViewById = motionLayout.findViewById(i10)) != null) {
            rectF.set(viewFindViewById.getLeft(), viewFindViewById.getTop(), viewFindViewById.getRight(), viewFindViewById.getBottom());
            return rectF;
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final RectF m2846b(ViewGroup viewGroup, RectF rectF) {
        View viewFindViewById;
        int i10 = this.f5196e;
        if (i10 != -1 && (viewFindViewById = viewGroup.findViewById(i10)) != null) {
            rectF.set(viewFindViewById.getLeft(), viewFindViewById.getTop(), viewFindViewById.getRight(), viewFindViewById.getBottom());
            return rectF;
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final void m2847c(boolean z10) {
        float[][] fArr = f5186E;
        float[][] fArr2 = f5187F;
        if (z10) {
            fArr2[4] = fArr2[3];
            fArr2[5] = fArr2[2];
            fArr[5] = fArr[2];
            fArr[6] = fArr[1];
        } else {
            fArr2[4] = fArr2[2];
            fArr2[5] = fArr2[3];
            fArr[5] = fArr[1];
            fArr[6] = fArr[2];
        }
        float[] fArr3 = fArr[this.f5192a];
        this.f5199h = fArr3[0];
        this.f5198g = fArr3[1];
        int i10 = this.f5193b;
        if (i10 >= 6) {
            return;
        }
        float[] fArr4 = fArr2[i10];
        this.f5202k = fArr4[0];
        this.f5203l = fArr4[1];
    }

    public final String toString() {
        if (Float.isNaN(this.f5202k)) {
            return "rotation";
        }
        return this.f5202k + " , " + this.f5203l;
    }
}
