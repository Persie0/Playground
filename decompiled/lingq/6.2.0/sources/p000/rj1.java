package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import androidx.constraintlayout.widget.R$styleable;

/* JADX INFO: loaded from: classes2.dex */
public final class rj1 {

    /* JADX INFO: renamed from: o */
    public static final SparseIntArray f59386o;

    /* JADX INFO: renamed from: a */
    public boolean f59387a;

    /* JADX INFO: renamed from: b */
    public float f59388b;

    /* JADX INFO: renamed from: c */
    public float f59389c;

    /* JADX INFO: renamed from: d */
    public float f59390d;

    /* JADX INFO: renamed from: e */
    public float f59391e;

    /* JADX INFO: renamed from: f */
    public float f59392f;

    /* JADX INFO: renamed from: g */
    public float f59393g;

    /* JADX INFO: renamed from: h */
    public float f59394h;

    /* JADX INFO: renamed from: i */
    public int f59395i;

    /* JADX INFO: renamed from: j */
    public float f59396j;

    /* JADX INFO: renamed from: k */
    public float f59397k;

    /* JADX INFO: renamed from: l */
    public float f59398l;

    /* JADX INFO: renamed from: m */
    public boolean f59399m;

    /* JADX INFO: renamed from: n */
    public float f59400n;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f59386o = sparseIntArray;
        sparseIntArray.append(R$styleable.Transform_android_rotation, 1);
        sparseIntArray.append(R$styleable.Transform_android_rotationX, 2);
        sparseIntArray.append(R$styleable.Transform_android_rotationY, 3);
        sparseIntArray.append(R$styleable.Transform_android_scaleX, 4);
        sparseIntArray.append(R$styleable.Transform_android_scaleY, 5);
        sparseIntArray.append(R$styleable.Transform_android_transformPivotX, 6);
        sparseIntArray.append(R$styleable.Transform_android_transformPivotY, 7);
        sparseIntArray.append(R$styleable.Transform_android_translationX, 8);
        sparseIntArray.append(R$styleable.Transform_android_translationY, 9);
        sparseIntArray.append(R$styleable.Transform_android_translationZ, 10);
        sparseIntArray.append(R$styleable.Transform_android_elevation, 11);
        sparseIntArray.append(R$styleable.Transform_transformPivotTarget, 12);
    }

    /* JADX INFO: renamed from: a */
    public final void m20673a(rj1 rj1Var) {
        this.f59387a = rj1Var.f59387a;
        this.f59388b = rj1Var.f59388b;
        this.f59389c = rj1Var.f59389c;
        this.f59390d = rj1Var.f59390d;
        this.f59391e = rj1Var.f59391e;
        this.f59392f = rj1Var.f59392f;
        this.f59393g = rj1Var.f59393g;
        this.f59394h = rj1Var.f59394h;
        this.f59395i = rj1Var.f59395i;
        this.f59396j = rj1Var.f59396j;
        this.f59397k = rj1Var.f59397k;
        this.f59398l = rj1Var.f59398l;
        this.f59399m = rj1Var.f59399m;
        this.f59400n = rj1Var.f59400n;
    }

    /* JADX INFO: renamed from: b */
    public final void m20674b(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.Transform);
        this.f59387a = true;
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            switch (f59386o.get(index)) {
                case 1:
                    this.f59388b = typedArrayObtainStyledAttributes.getFloat(index, this.f59388b);
                    break;
                case 2:
                    this.f59389c = typedArrayObtainStyledAttributes.getFloat(index, this.f59389c);
                    break;
                case 3:
                    this.f59390d = typedArrayObtainStyledAttributes.getFloat(index, this.f59390d);
                    break;
                case 4:
                    this.f59391e = typedArrayObtainStyledAttributes.getFloat(index, this.f59391e);
                    break;
                case 5:
                    this.f59392f = typedArrayObtainStyledAttributes.getFloat(index, this.f59392f);
                    break;
                case 6:
                    this.f59393g = typedArrayObtainStyledAttributes.getDimension(index, this.f59393g);
                    break;
                case 7:
                    this.f59394h = typedArrayObtainStyledAttributes.getDimension(index, this.f59394h);
                    break;
                case 8:
                    this.f59396j = typedArrayObtainStyledAttributes.getDimension(index, this.f59396j);
                    break;
                case 9:
                    this.f59397k = typedArrayObtainStyledAttributes.getDimension(index, this.f59397k);
                    break;
                case 10:
                    this.f59398l = typedArrayObtainStyledAttributes.getDimension(index, this.f59398l);
                    break;
                case 11:
                    this.f59399m = true;
                    this.f59400n = typedArrayObtainStyledAttributes.getDimension(index, this.f59400n);
                    break;
                case 12:
                    this.f59395i = sj1.m21403l(typedArrayObtainStyledAttributes, index, this.f59395i);
                    break;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
