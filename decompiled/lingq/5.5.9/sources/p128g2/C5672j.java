package p128g2;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import androidx.activity.result.C0204c;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.datastore.preferences.PreferencesProto$Value;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import p107f2.AbstractC5465d;
import p143h2.C5881d;

/* JADX INFO: renamed from: g2.j */
/* JADX INFO: loaded from: classes.dex */
public final class C5672j extends AbstractC5666d {

    /* JADX INFO: renamed from: e */
    public int f34551e = -1;

    /* JADX INFO: renamed from: f */
    public float f34552f = Float.NaN;

    /* JADX INFO: renamed from: g */
    public float f34553g = Float.NaN;

    /* JADX INFO: renamed from: h */
    public float f34554h = Float.NaN;

    /* JADX INFO: renamed from: i */
    public float f34555i = Float.NaN;

    /* JADX INFO: renamed from: j */
    public float f34556j = Float.NaN;

    /* JADX INFO: renamed from: k */
    public float f34557k = Float.NaN;

    /* JADX INFO: renamed from: l */
    public float f34558l = Float.NaN;

    /* JADX INFO: renamed from: m */
    public float f34559m = Float.NaN;

    /* JADX INFO: renamed from: n */
    public float f34560n = Float.NaN;

    /* JADX INFO: renamed from: o */
    public float f34561o = Float.NaN;

    /* JADX INFO: renamed from: p */
    public float f34562p = Float.NaN;

    /* JADX INFO: renamed from: q */
    public float f34563q = Float.NaN;

    /* JADX INFO: renamed from: r */
    public int f34564r = 0;

    /* JADX INFO: renamed from: s */
    public float f34565s = Float.NaN;

    /* JADX INFO: renamed from: t */
    public float f34566t = 0.0f;

    /* JADX INFO: renamed from: g2.j$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public static final SparseIntArray f34567a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f34567a = sparseIntArray;
            sparseIntArray.append(0, 1);
            sparseIntArray.append(9, 2);
            sparseIntArray.append(5, 4);
            sparseIntArray.append(6, 5);
            sparseIntArray.append(7, 6);
            sparseIntArray.append(3, 7);
            sparseIntArray.append(15, 8);
            sparseIntArray.append(14, 9);
            sparseIntArray.append(13, 10);
            sparseIntArray.append(11, 12);
            sparseIntArray.append(10, 13);
            sparseIntArray.append(4, 14);
            sparseIntArray.append(1, 15);
            sparseIntArray.append(2, 16);
            sparseIntArray.append(8, 17);
            sparseIntArray.append(12, 18);
            sparseIntArray.append(18, 20);
            sparseIntArray.append(17, 21);
            sparseIntArray.append(20, 19);
        }
    }

    public C5672j() {
        this.f34500d = new HashMap<>();
    }

    @Override // p128g2.AbstractC5666d
    /* JADX INFO: renamed from: a */
    public final void mo12024a(HashMap<String, AbstractC5465d> map) {
        throw new IllegalArgumentException(" KeyTimeCycles do not support SplineSet");
    }

    @Override // p128g2.AbstractC5666d
    /* JADX INFO: renamed from: b */
    public final AbstractC5666d clone() {
        C5672j c5672j = new C5672j();
        super.m12026c(this);
        c5672j.f34551e = this.f34551e;
        c5672j.f34564r = this.f34564r;
        c5672j.f34565s = this.f34565s;
        c5672j.f34566t = this.f34566t;
        c5672j.f34563q = this.f34563q;
        c5672j.f34552f = this.f34552f;
        c5672j.f34553g = this.f34553g;
        c5672j.f34554h = this.f34554h;
        c5672j.f34557k = this.f34557k;
        c5672j.f34555i = this.f34555i;
        c5672j.f34556j = this.f34556j;
        c5672j.f34558l = this.f34558l;
        c5672j.f34559m = this.f34559m;
        c5672j.f34560n = this.f34560n;
        c5672j.f34561o = this.f34561o;
        c5672j.f34562p = this.f34562p;
        return c5672j;
    }

    @Override // p128g2.AbstractC5666d
    /* JADX INFO: renamed from: d */
    public final void mo12027d(HashSet<String> hashSet) {
        if (!Float.isNaN(this.f34552f)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.f34553g)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.f34554h)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.f34555i)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.f34556j)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.f34560n)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.f34561o)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.f34562p)) {
            hashSet.add("translationZ");
        }
        if (!Float.isNaN(this.f34557k)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.f34558l)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.f34559m)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.f34563q)) {
            hashSet.add("progress");
        }
        if (this.f34500d.size() > 0) {
            Iterator<String> it = this.f34500d.keySet().iterator();
            while (it.hasNext()) {
                hashSet.add("CUSTOM," + it.next());
            }
        }
    }

    @Override // p128g2.AbstractC5666d
    /* JADX INFO: renamed from: e */
    public final void mo12028e(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C5881d.f35175i);
        SparseIntArray sparseIntArray = a.f34567a;
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i10);
            SparseIntArray sparseIntArray2 = a.f34567a;
            switch (sparseIntArray2.get(index)) {
                case 1:
                    this.f34552f = typedArrayObtainStyledAttributes.getFloat(index, this.f34552f);
                    break;
                case 2:
                    this.f34553g = typedArrayObtainStyledAttributes.getDimension(index, this.f34553g);
                    continue;
                    break;
                case 3:
                case 11:
                default:
                    Log.e("KeyTimeCycle", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray2.get(index));
                    continue;
                    break;
                case 4:
                    this.f34554h = typedArrayObtainStyledAttributes.getFloat(index, this.f34554h);
                    continue;
                    break;
                case 5:
                    this.f34555i = typedArrayObtainStyledAttributes.getFloat(index, this.f34555i);
                    continue;
                    break;
                case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                    this.f34556j = typedArrayObtainStyledAttributes.getFloat(index, this.f34556j);
                    continue;
                    break;
                case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                    this.f34558l = typedArrayObtainStyledAttributes.getFloat(index, this.f34558l);
                    continue;
                    break;
                case 8:
                    this.f34557k = typedArrayObtainStyledAttributes.getFloat(index, this.f34557k);
                    continue;
                    break;
                case 9:
                    typedArrayObtainStyledAttributes.getString(index);
                    continue;
                    break;
                case 10:
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
                case 12:
                    this.f34497a = typedArrayObtainStyledAttributes.getInt(index, this.f34497a);
                    continue;
                    break;
                case 13:
                    this.f34551e = typedArrayObtainStyledAttributes.getInteger(index, this.f34551e);
                    continue;
                    break;
                case 14:
                    this.f34559m = typedArrayObtainStyledAttributes.getFloat(index, this.f34559m);
                    continue;
                    break;
                case 15:
                    this.f34560n = typedArrayObtainStyledAttributes.getDimension(index, this.f34560n);
                    continue;
                    break;
                case 16:
                    this.f34561o = typedArrayObtainStyledAttributes.getDimension(index, this.f34561o);
                    continue;
                    break;
                case 17:
                    this.f34562p = typedArrayObtainStyledAttributes.getDimension(index, this.f34562p);
                    continue;
                    break;
                case 18:
                    this.f34563q = typedArrayObtainStyledAttributes.getFloat(index, this.f34563q);
                    continue;
                    break;
                case 19:
                    if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                        typedArrayObtainStyledAttributes.getString(index);
                        this.f34564r = 7;
                        continue;
                    } else {
                        this.f34564r = typedArrayObtainStyledAttributes.getInt(index, this.f34564r);
                    }
                    break;
                case 20:
                    this.f34565s = typedArrayObtainStyledAttributes.getFloat(index, this.f34565s);
                    continue;
                    break;
                case 21:
                    if (typedArrayObtainStyledAttributes.peekValue(index).type == 5) {
                        this.f34566t = typedArrayObtainStyledAttributes.getDimension(index, this.f34566t);
                        continue;
                    } else {
                        this.f34566t = typedArrayObtainStyledAttributes.getFloat(index, this.f34566t);
                    }
                    break;
            }
        }
    }

    @Override // p128g2.AbstractC5666d
    /* JADX INFO: renamed from: f */
    public final void mo12029f(HashMap<String, Integer> map) {
        if (this.f34551e == -1) {
            return;
        }
        if (!Float.isNaN(this.f34552f)) {
            map.put("alpha", Integer.valueOf(this.f34551e));
        }
        if (!Float.isNaN(this.f34553g)) {
            map.put("elevation", Integer.valueOf(this.f34551e));
        }
        if (!Float.isNaN(this.f34554h)) {
            map.put("rotation", Integer.valueOf(this.f34551e));
        }
        if (!Float.isNaN(this.f34555i)) {
            map.put("rotationX", Integer.valueOf(this.f34551e));
        }
        if (!Float.isNaN(this.f34556j)) {
            map.put("rotationY", Integer.valueOf(this.f34551e));
        }
        if (!Float.isNaN(this.f34560n)) {
            map.put("translationX", Integer.valueOf(this.f34551e));
        }
        if (!Float.isNaN(this.f34561o)) {
            map.put("translationY", Integer.valueOf(this.f34551e));
        }
        if (!Float.isNaN(this.f34562p)) {
            map.put("translationZ", Integer.valueOf(this.f34551e));
        }
        if (!Float.isNaN(this.f34557k)) {
            map.put("transitionPathRotate", Integer.valueOf(this.f34551e));
        }
        if (!Float.isNaN(this.f34558l)) {
            map.put("scaleX", Integer.valueOf(this.f34551e));
        }
        if (!Float.isNaN(this.f34558l)) {
            map.put("scaleY", Integer.valueOf(this.f34551e));
        }
        if (!Float.isNaN(this.f34563q)) {
            map.put("progress", Integer.valueOf(this.f34551e));
        }
        if (this.f34500d.size() > 0) {
            Iterator<String> it = this.f34500d.keySet().iterator();
            while (it.hasNext()) {
                map.put(C0204c.m852k("CUSTOM,", it.next()), Integer.valueOf(this.f34551e));
            }
        }
    }
}
