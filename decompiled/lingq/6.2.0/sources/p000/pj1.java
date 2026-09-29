package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import androidx.constraintlayout.widget.R$styleable;

/* JADX INFO: loaded from: classes2.dex */
public final class pj1 {

    /* JADX INFO: renamed from: n */
    public static final SparseIntArray f56296n;

    /* JADX INFO: renamed from: a */
    public boolean f56297a;

    /* JADX INFO: renamed from: b */
    public int f56298b;

    /* JADX INFO: renamed from: c */
    public int f56299c;

    /* JADX INFO: renamed from: d */
    public String f56300d;

    /* JADX INFO: renamed from: e */
    public int f56301e;

    /* JADX INFO: renamed from: f */
    public int f56302f;

    /* JADX INFO: renamed from: g */
    public float f56303g;

    /* JADX INFO: renamed from: h */
    public float f56304h;

    /* JADX INFO: renamed from: i */
    public float f56305i;

    /* JADX INFO: renamed from: j */
    public int f56306j;

    /* JADX INFO: renamed from: k */
    public String f56307k;

    /* JADX INFO: renamed from: l */
    public int f56308l;

    /* JADX INFO: renamed from: m */
    public int f56309m;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f56296n = sparseIntArray;
        sparseIntArray.append(R$styleable.Motion_motionPathRotate, 1);
        sparseIntArray.append(R$styleable.Motion_pathMotionArc, 2);
        sparseIntArray.append(R$styleable.Motion_transitionEasing, 3);
        sparseIntArray.append(R$styleable.Motion_drawPath, 4);
        sparseIntArray.append(R$styleable.Motion_animateRelativeTo, 5);
        sparseIntArray.append(R$styleable.Motion_animateCircleAngleTo, 6);
        sparseIntArray.append(R$styleable.Motion_motionStagger, 7);
        sparseIntArray.append(R$styleable.Motion_quantizeMotionSteps, 8);
        sparseIntArray.append(R$styleable.Motion_quantizeMotionPhase, 9);
        sparseIntArray.append(R$styleable.Motion_quantizeMotionInterpolator, 10);
    }

    /* JADX INFO: renamed from: a */
    public final void m19193a(pj1 pj1Var) {
        this.f56297a = pj1Var.f56297a;
        this.f56298b = pj1Var.f56298b;
        this.f56300d = pj1Var.f56300d;
        this.f56301e = pj1Var.f56301e;
        this.f56302f = pj1Var.f56302f;
        this.f56304h = pj1Var.f56304h;
        this.f56303g = pj1Var.f56303g;
    }

    /* JADX INFO: renamed from: b */
    public final void m19194b(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.Motion);
        this.f56297a = true;
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            switch (f56296n.get(index)) {
                case 1:
                    this.f56304h = typedArrayObtainStyledAttributes.getFloat(index, this.f56304h);
                    break;
                case 2:
                    this.f56301e = typedArrayObtainStyledAttributes.getInt(index, this.f56301e);
                    break;
                case 3:
                    if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                        this.f56300d = typedArrayObtainStyledAttributes.getString(index);
                    } else {
                        this.f56300d = fo2.f39362d[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                    }
                    break;
                case 4:
                    this.f56302f = typedArrayObtainStyledAttributes.getInt(index, 0);
                    break;
                case 5:
                    this.f56298b = sj1.m21403l(typedArrayObtainStyledAttributes, index, this.f56298b);
                    break;
                case 6:
                    this.f56299c = typedArrayObtainStyledAttributes.getInteger(index, this.f56299c);
                    break;
                case 7:
                    this.f56303g = typedArrayObtainStyledAttributes.getFloat(index, this.f56303g);
                    break;
                case 8:
                    this.f56306j = typedArrayObtainStyledAttributes.getInteger(index, this.f56306j);
                    break;
                case 9:
                    this.f56305i = typedArrayObtainStyledAttributes.getFloat(index, this.f56305i);
                    break;
                case 10:
                    int i2 = typedArrayObtainStyledAttributes.peekValue(index).type;
                    if (i2 == 1) {
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                        this.f56309m = resourceId;
                        if (resourceId != -1) {
                            this.f56308l = -2;
                        }
                    } else if (i2 == 3) {
                        String string = typedArrayObtainStyledAttributes.getString(index);
                        this.f56307k = string;
                        if (string.indexOf("/") > 0) {
                            this.f56309m = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                            this.f56308l = -2;
                        } else {
                            this.f56308l = -1;
                        }
                    } else {
                        this.f56308l = typedArrayObtainStyledAttributes.getInteger(index, this.f56309m);
                    }
                    break;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
