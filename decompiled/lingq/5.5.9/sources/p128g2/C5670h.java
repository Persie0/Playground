package p128g2;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.datastore.preferences.PreferencesProto$Value;
import java.util.HashMap;
import p038c2.C1660c;
import p107f2.AbstractC5465d;
import p143h2.C5881d;

/* JADX INFO: renamed from: g2.h */
/* JADX INFO: loaded from: classes.dex */
public final class C5670h extends AbstractC5671i {

    /* JADX INFO: renamed from: f */
    public String f34539f = null;

    /* JADX INFO: renamed from: g */
    public int f34540g = -1;

    /* JADX INFO: renamed from: h */
    public int f34541h = 0;

    /* JADX INFO: renamed from: i */
    public float f34542i = Float.NaN;

    /* JADX INFO: renamed from: j */
    public float f34543j = Float.NaN;

    /* JADX INFO: renamed from: k */
    public float f34544k = Float.NaN;

    /* JADX INFO: renamed from: l */
    public float f34545l = Float.NaN;

    /* JADX INFO: renamed from: m */
    public float f34546m = Float.NaN;

    /* JADX INFO: renamed from: n */
    public float f34547n = Float.NaN;

    /* JADX INFO: renamed from: o */
    public int f34548o = 0;

    /* JADX INFO: renamed from: g2.h$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public static final SparseIntArray f34549a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f34549a = sparseIntArray;
            sparseIntArray.append(4, 1);
            sparseIntArray.append(2, 2);
            sparseIntArray.append(11, 3);
            sparseIntArray.append(0, 4);
            sparseIntArray.append(1, 5);
            sparseIntArray.append(8, 6);
            sparseIntArray.append(9, 7);
            sparseIntArray.append(3, 9);
            sparseIntArray.append(10, 8);
            sparseIntArray.append(7, 11);
            sparseIntArray.append(6, 12);
            sparseIntArray.append(5, 10);
        }
    }

    @Override // p128g2.AbstractC5666d
    /* JADX INFO: renamed from: a */
    public final void mo12024a(HashMap<String, AbstractC5465d> map) {
    }

    @Override // p128g2.AbstractC5666d
    /* JADX INFO: renamed from: b */
    public final AbstractC5666d clone() {
        C5670h c5670h = new C5670h();
        super.m12026c(this);
        c5670h.f34539f = this.f34539f;
        c5670h.f34540g = this.f34540g;
        c5670h.f34541h = this.f34541h;
        c5670h.f34542i = this.f34542i;
        c5670h.f34543j = Float.NaN;
        c5670h.f34544k = this.f34544k;
        c5670h.f34545l = this.f34545l;
        c5670h.f34546m = this.f34546m;
        c5670h.f34547n = this.f34547n;
        return c5670h;
    }

    @Override // p128g2.AbstractC5666d
    /* JADX INFO: renamed from: e */
    public final void mo12028e(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C5881d.f35174h);
        SparseIntArray sparseIntArray = a.f34549a;
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i10);
            SparseIntArray sparseIntArray2 = a.f34549a;
            switch (sparseIntArray2.get(index)) {
                case 1:
                    if (MotionLayout.f5046Z0) {
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f34498b);
                        this.f34498b = resourceId;
                        if (resourceId == -1) {
                            this.f34499c = typedArrayObtainStyledAttributes.getString(index);
                        }
                    } else if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                        this.f34499c = typedArrayObtainStyledAttributes.getString(index);
                    } else {
                        this.f34498b = typedArrayObtainStyledAttributes.getResourceId(index, this.f34498b);
                    }
                    break;
                case 2:
                    this.f34497a = typedArrayObtainStyledAttributes.getInt(index, this.f34497a);
                    break;
                case 3:
                    if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                        this.f34539f = typedArrayObtainStyledAttributes.getString(index);
                    } else {
                        this.f34539f = C1660c.f9303c[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                    }
                    break;
                case 4:
                    this.f34550e = typedArrayObtainStyledAttributes.getInteger(index, this.f34550e);
                    break;
                case 5:
                    this.f34541h = typedArrayObtainStyledAttributes.getInt(index, this.f34541h);
                    break;
                case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                    this.f34544k = typedArrayObtainStyledAttributes.getFloat(index, this.f34544k);
                    break;
                case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                    this.f34545l = typedArrayObtainStyledAttributes.getFloat(index, this.f34545l);
                    break;
                case 8:
                    float f3 = typedArrayObtainStyledAttributes.getFloat(index, this.f34543j);
                    this.f34542i = f3;
                    this.f34543j = f3;
                    break;
                case 9:
                    this.f34548o = typedArrayObtainStyledAttributes.getInt(index, this.f34548o);
                    break;
                case 10:
                    this.f34540g = typedArrayObtainStyledAttributes.getInt(index, this.f34540g);
                    break;
                case 11:
                    this.f34542i = typedArrayObtainStyledAttributes.getFloat(index, this.f34542i);
                    break;
                case 12:
                    this.f34543j = typedArrayObtainStyledAttributes.getFloat(index, this.f34543j);
                    break;
                default:
                    Log.e("KeyPosition", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray2.get(index));
                    break;
            }
        }
        if (this.f34497a == -1) {
            Log.e("KeyPosition", "no frame position");
        }
    }
}
