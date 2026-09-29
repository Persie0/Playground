package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import androidx.constraintlayout.motion.widget.AbstractC0475b;
import androidx.constraintlayout.widget.R$styleable;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: loaded from: classes2.dex */
public final class qi4 extends qh4 {

    /* JADX INFO: renamed from: e */
    public int f57809e = -1;

    /* JADX INFO: renamed from: f */
    public String f57810f = null;

    /* JADX INFO: renamed from: g */
    public int f57811g = -1;

    /* JADX INFO: renamed from: h */
    public int f57812h = 0;

    /* JADX INFO: renamed from: i */
    public float f57813i = Float.NaN;

    /* JADX INFO: renamed from: j */
    public float f57814j = Float.NaN;

    /* JADX INFO: renamed from: k */
    public float f57815k = Float.NaN;

    /* JADX INFO: renamed from: l */
    public float f57816l = Float.NaN;

    /* JADX INFO: renamed from: m */
    public int f57817m = 0;

    @Override // p000.qh4
    /* JADX INFO: renamed from: a */
    public final void mo3770a(HashMap map) {
        throw null;
    }

    @Override // p000.qh4
    /* JADX INFO: renamed from: b */
    public final qh4 clone() {
        qi4 qi4Var = new qi4();
        super.m19971c(this);
        qi4Var.f57810f = this.f57810f;
        qi4Var.f57811g = this.f57811g;
        qi4Var.f57812h = this.f57812h;
        qi4Var.f57813i = this.f57813i;
        qi4Var.f57814j = Float.NaN;
        qi4Var.f57815k = this.f57815k;
        qi4Var.f57816l = this.f57816l;
        return qi4Var;
    }

    @Override // p000.qh4
    /* JADX INFO: renamed from: d */
    public final void mo3772d(HashSet hashSet) {
    }

    @Override // p000.qh4
    /* JADX INFO: renamed from: e */
    public final void mo3773e(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.KeyPosition);
        SparseIntArray sparseIntArray = pi4.f56248a;
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            SparseIntArray sparseIntArray2 = pi4.f56248a;
            switch (sparseIntArray2.get(index)) {
                case 1:
                    if (AbstractC0475b.f5366S0) {
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f57780b);
                        this.f57780b = resourceId;
                        if (resourceId == -1) {
                            this.f57781c = typedArrayObtainStyledAttributes.getString(index);
                        }
                    } else if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                        this.f57781c = typedArrayObtainStyledAttributes.getString(index);
                    } else {
                        this.f57780b = typedArrayObtainStyledAttributes.getResourceId(index, this.f57780b);
                    }
                    break;
                case 2:
                    this.f57779a = typedArrayObtainStyledAttributes.getInt(index, this.f57779a);
                    break;
                case 3:
                    if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                        this.f57810f = typedArrayObtainStyledAttributes.getString(index);
                    } else {
                        this.f57810f = fo2.f39362d[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                    }
                    break;
                case 4:
                    this.f57809e = typedArrayObtainStyledAttributes.getInteger(index, this.f57809e);
                    break;
                case 5:
                    this.f57812h = typedArrayObtainStyledAttributes.getInt(index, this.f57812h);
                    break;
                case 6:
                    this.f57815k = typedArrayObtainStyledAttributes.getFloat(index, this.f57815k);
                    break;
                case 7:
                    this.f57816l = typedArrayObtainStyledAttributes.getFloat(index, this.f57816l);
                    break;
                case 8:
                    float f = typedArrayObtainStyledAttributes.getFloat(index, this.f57814j);
                    this.f57813i = f;
                    this.f57814j = f;
                    break;
                case 9:
                    this.f57817m = typedArrayObtainStyledAttributes.getInt(index, this.f57817m);
                    break;
                case 10:
                    this.f57811g = typedArrayObtainStyledAttributes.getInt(index, this.f57811g);
                    break;
                case 11:
                    this.f57813i = typedArrayObtainStyledAttributes.getFloat(index, this.f57813i);
                    break;
                case 12:
                    this.f57814j = typedArrayObtainStyledAttributes.getFloat(index, this.f57814j);
                    break;
                default:
                    Log.e("KeyPosition", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray2.get(index));
                    break;
            }
        }
        if (this.f57779a == -1) {
            Log.e("KeyPosition", "no frame position");
        }
    }
}
