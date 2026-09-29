package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.R$styleable;

/* JADX INFO: loaded from: classes2.dex */
public final class qj1 {

    /* JADX INFO: renamed from: a */
    public boolean f57843a;

    /* JADX INFO: renamed from: b */
    public int f57844b;

    /* JADX INFO: renamed from: c */
    public int f57845c;

    /* JADX INFO: renamed from: d */
    public float f57846d;

    /* JADX INFO: renamed from: e */
    public float f57847e;

    /* JADX INFO: renamed from: a */
    public final void m19999a(qj1 qj1Var) {
        this.f57843a = qj1Var.f57843a;
        this.f57844b = qj1Var.f57844b;
        this.f57846d = qj1Var.f57846d;
        this.f57847e = qj1Var.f57847e;
        this.f57845c = qj1Var.f57845c;
    }

    /* JADX INFO: renamed from: b */
    public final void m20000b(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.PropertySet);
        this.f57843a = true;
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == R$styleable.PropertySet_android_alpha) {
                this.f57846d = typedArrayObtainStyledAttributes.getFloat(index, this.f57846d);
            } else if (index == R$styleable.PropertySet_android_visibility) {
                int i2 = typedArrayObtainStyledAttributes.getInt(index, this.f57844b);
                this.f57844b = i2;
                this.f57844b = sj1.f60913h[i2];
            } else if (index == R$styleable.PropertySet_visibilityMode) {
                this.f57845c = typedArrayObtainStyledAttributes.getInt(index, this.f57845c);
            } else if (index == R$styleable.PropertySet_motionProgress) {
                this.f57847e = typedArrayObtainStyledAttributes.getFloat(index, this.f57847e);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
