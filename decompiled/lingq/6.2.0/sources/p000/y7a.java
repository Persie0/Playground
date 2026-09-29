package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.RectF;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.motion.widget.AbstractC0475b;
import androidx.constraintlayout.widget.R$styleable;

/* JADX INFO: loaded from: classes2.dex */
public final class y7a {

    /* JADX INFO: renamed from: E */
    public static final float[][] f69420E = {new float[]{0.5f, 0.0f}, new float[]{0.0f, 0.5f}, new float[]{1.0f, 0.5f}, new float[]{0.5f, 1.0f}, new float[]{0.5f, 0.5f}, new float[]{0.0f, 0.5f}, new float[]{1.0f, 0.5f}};

    /* JADX INFO: renamed from: F */
    public static final float[][] f69421F = {new float[]{0.0f, -1.0f}, new float[]{0.0f, 1.0f}, new float[]{-1.0f, 0.0f}, new float[]{1.0f, 0.0f}, new float[]{-1.0f, 0.0f}, new float[]{1.0f, 0.0f}};

    /* JADX INFO: renamed from: A */
    public final float f69422A;

    /* JADX INFO: renamed from: B */
    public final float f69423B;

    /* JADX INFO: renamed from: C */
    public final int f69424C;

    /* JADX INFO: renamed from: D */
    public final int f69425D;

    /* JADX INFO: renamed from: a */
    public final int f69426a;

    /* JADX INFO: renamed from: b */
    public final int f69427b;

    /* JADX INFO: renamed from: c */
    public final int f69428c;

    /* JADX INFO: renamed from: d */
    public final int f69429d;

    /* JADX INFO: renamed from: e */
    public final int f69430e;

    /* JADX INFO: renamed from: f */
    public final int f69431f;

    /* JADX INFO: renamed from: g */
    public float f69432g;

    /* JADX INFO: renamed from: h */
    public float f69433h;

    /* JADX INFO: renamed from: i */
    public final int f69434i;

    /* JADX INFO: renamed from: j */
    public final boolean f69435j;

    /* JADX INFO: renamed from: k */
    public float f69436k;

    /* JADX INFO: renamed from: l */
    public float f69437l;

    /* JADX INFO: renamed from: m */
    public boolean f69438m = false;

    /* JADX INFO: renamed from: n */
    public final float[] f69439n = new float[2];

    /* JADX INFO: renamed from: o */
    public final int[] f69440o = new int[2];

    /* JADX INFO: renamed from: p */
    public float f69441p;

    /* JADX INFO: renamed from: q */
    public float f69442q;

    /* JADX INFO: renamed from: r */
    public final AbstractC0475b f69443r;

    /* JADX INFO: renamed from: s */
    public final float f69444s;

    /* JADX INFO: renamed from: t */
    public final float f69445t;

    /* JADX INFO: renamed from: u */
    public final boolean f69446u;

    /* JADX INFO: renamed from: v */
    public final float f69447v;

    /* JADX INFO: renamed from: w */
    public final int f69448w;

    /* JADX INFO: renamed from: x */
    public final float f69449x;

    /* JADX INFO: renamed from: y */
    public final float f69450y;

    /* JADX INFO: renamed from: z */
    public final float f69451z;

    public y7a(Context context, AbstractC0475b abstractC0475b, XmlResourceParser xmlResourceParser) {
        this.f69426a = 0;
        this.f69427b = 0;
        this.f69428c = 0;
        this.f69429d = -1;
        this.f69430e = -1;
        this.f69431f = -1;
        this.f69432g = 0.5f;
        this.f69433h = 0.5f;
        this.f69434i = -1;
        this.f69435j = false;
        this.f69436k = 0.0f;
        this.f69437l = 1.0f;
        this.f69444s = 4.0f;
        this.f69445t = 1.2f;
        this.f69446u = true;
        this.f69447v = 1.0f;
        this.f69448w = 0;
        this.f69449x = 10.0f;
        this.f69450y = 10.0f;
        this.f69451z = 1.0f;
        this.f69422A = Float.NaN;
        this.f69423B = Float.NaN;
        this.f69424C = 0;
        this.f69425D = 0;
        this.f69443r = abstractC0475b;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), R$styleable.OnSwipe);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == R$styleable.OnSwipe_touchAnchorId) {
                this.f69429d = typedArrayObtainStyledAttributes.getResourceId(index, this.f69429d);
            } else if (index == R$styleable.OnSwipe_touchAnchorSide) {
                int i2 = typedArrayObtainStyledAttributes.getInt(index, this.f69426a);
                this.f69426a = i2;
                float[] fArr = f69420E[i2];
                this.f69433h = fArr[0];
                this.f69432g = fArr[1];
            } else if (index == R$styleable.OnSwipe_dragDirection) {
                int i3 = typedArrayObtainStyledAttributes.getInt(index, this.f69427b);
                this.f69427b = i3;
                if (i3 < 6) {
                    float[] fArr2 = f69421F[i3];
                    this.f69436k = fArr2[0];
                    this.f69437l = fArr2[1];
                } else {
                    this.f69437l = Float.NaN;
                    this.f69436k = Float.NaN;
                    this.f69435j = true;
                }
            } else if (index == R$styleable.OnSwipe_maxVelocity) {
                this.f69444s = typedArrayObtainStyledAttributes.getFloat(index, this.f69444s);
            } else if (index == R$styleable.OnSwipe_maxAcceleration) {
                this.f69445t = typedArrayObtainStyledAttributes.getFloat(index, this.f69445t);
            } else if (index == R$styleable.OnSwipe_moveWhenScrollAtTop) {
                this.f69446u = typedArrayObtainStyledAttributes.getBoolean(index, this.f69446u);
            } else if (index == R$styleable.OnSwipe_dragScale) {
                this.f69447v = typedArrayObtainStyledAttributes.getFloat(index, this.f69447v);
            } else if (index == R$styleable.OnSwipe_dragThreshold) {
                this.f69449x = typedArrayObtainStyledAttributes.getFloat(index, this.f69449x);
            } else if (index == R$styleable.OnSwipe_touchRegionId) {
                this.f69430e = typedArrayObtainStyledAttributes.getResourceId(index, this.f69430e);
            } else if (index == R$styleable.OnSwipe_onTouchUp) {
                this.f69428c = typedArrayObtainStyledAttributes.getInt(index, this.f69428c);
            } else if (index == R$styleable.OnSwipe_nestedScrollFlags) {
                this.f69448w = typedArrayObtainStyledAttributes.getInteger(index, 0);
            } else if (index == R$styleable.OnSwipe_limitBoundsTo) {
                this.f69431f = typedArrayObtainStyledAttributes.getResourceId(index, 0);
            } else if (index == R$styleable.OnSwipe_rotationCenterId) {
                this.f69434i = typedArrayObtainStyledAttributes.getResourceId(index, this.f69434i);
            } else if (index == R$styleable.OnSwipe_springDamping) {
                this.f69450y = typedArrayObtainStyledAttributes.getFloat(index, this.f69450y);
            } else if (index == R$styleable.OnSwipe_springMass) {
                this.f69451z = typedArrayObtainStyledAttributes.getFloat(index, this.f69451z);
            } else if (index == R$styleable.OnSwipe_springStiffness) {
                this.f69422A = typedArrayObtainStyledAttributes.getFloat(index, this.f69422A);
            } else if (index == R$styleable.OnSwipe_springStopThreshold) {
                this.f69423B = typedArrayObtainStyledAttributes.getFloat(index, this.f69423B);
            } else if (index == R$styleable.OnSwipe_springBoundary) {
                this.f69424C = typedArrayObtainStyledAttributes.getInt(index, this.f69424C);
            } else if (index == R$styleable.OnSwipe_autoCompleteMode) {
                this.f69425D = typedArrayObtainStyledAttributes.getInt(index, this.f69425D);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: a */
    public final RectF m24979a(ViewGroup viewGroup, RectF rectF) {
        View viewFindViewById;
        int i = this.f69431f;
        if (i == -1 || (viewFindViewById = viewGroup.findViewById(i)) == null) {
            return null;
        }
        rectF.set(viewFindViewById.getLeft(), viewFindViewById.getTop(), viewFindViewById.getRight(), viewFindViewById.getBottom());
        return rectF;
    }

    /* JADX INFO: renamed from: b */
    public final RectF m24980b(ViewGroup viewGroup, RectF rectF) {
        View viewFindViewById;
        int i = this.f69430e;
        if (i == -1 || (viewFindViewById = viewGroup.findViewById(i)) == null) {
            return null;
        }
        rectF.set(viewFindViewById.getLeft(), viewFindViewById.getTop(), viewFindViewById.getRight(), viewFindViewById.getBottom());
        return rectF;
    }

    /* JADX INFO: renamed from: c */
    public final void m24981c(boolean z) {
        float[][] fArr = f69420E;
        float[][] fArr2 = f69421F;
        if (z) {
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
        float[] fArr3 = fArr[this.f69426a];
        this.f69433h = fArr3[0];
        this.f69432g = fArr3[1];
        int i = this.f69427b;
        if (i >= 6) {
            return;
        }
        float[] fArr4 = fArr2[i];
        this.f69436k = fArr4[0];
        this.f69437l = fArr4[1];
    }

    public final String toString() {
        if (Float.isNaN(this.f69436k)) {
            return "rotation";
        }
        return this.f69436k + " , " + this.f69437l;
    }
}
