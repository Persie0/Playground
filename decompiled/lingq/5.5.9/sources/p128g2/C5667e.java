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
import p143h2.C5881d;

/* JADX INFO: renamed from: g2.e */
/* JADX INFO: loaded from: classes.dex */
public final class C5667e extends AbstractC5666d {

    /* JADX INFO: renamed from: e */
    public int f34501e = -1;

    /* JADX INFO: renamed from: f */
    public float f34502f = Float.NaN;

    /* JADX INFO: renamed from: g */
    public float f34503g = Float.NaN;

    /* JADX INFO: renamed from: h */
    public float f34504h = Float.NaN;

    /* JADX INFO: renamed from: i */
    public float f34505i = Float.NaN;

    /* JADX INFO: renamed from: j */
    public float f34506j = Float.NaN;

    /* JADX INFO: renamed from: k */
    public float f34507k = Float.NaN;

    /* JADX INFO: renamed from: l */
    public float f34508l = Float.NaN;

    /* JADX INFO: renamed from: m */
    public float f34509m = Float.NaN;

    /* JADX INFO: renamed from: n */
    public float f34510n = Float.NaN;

    /* JADX INFO: renamed from: o */
    public float f34511o = Float.NaN;

    /* JADX INFO: renamed from: p */
    public float f34512p = Float.NaN;

    /* JADX INFO: renamed from: q */
    public float f34513q = Float.NaN;

    /* JADX INFO: renamed from: r */
    public float f34514r = Float.NaN;

    /* JADX INFO: renamed from: s */
    public float f34515s = Float.NaN;

    /* JADX INFO: renamed from: g2.e$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public static final SparseIntArray f34516a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f34516a = sparseIntArray;
            sparseIntArray.append(0, 1);
            sparseIntArray.append(11, 2);
            sparseIntArray.append(7, 4);
            sparseIntArray.append(8, 5);
            sparseIntArray.append(9, 6);
            sparseIntArray.append(1, 19);
            sparseIntArray.append(2, 20);
            sparseIntArray.append(5, 7);
            sparseIntArray.append(18, 8);
            sparseIntArray.append(17, 9);
            sparseIntArray.append(15, 10);
            sparseIntArray.append(13, 12);
            sparseIntArray.append(12, 13);
            sparseIntArray.append(6, 14);
            sparseIntArray.append(3, 15);
            sparseIntArray.append(4, 16);
            sparseIntArray.append(10, 17);
            sparseIntArray.append(14, 18);
        }
    }

    public C5667e() {
        this.f34500d = new HashMap<>();
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:105:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:108:0x0201  */
    /* JADX WARN: Code duplicated, block: B:111:0x0218  */
    /* JADX WARN: Code duplicated, block: B:114:0x022e  */
    /* JADX WARN: Code duplicated, block: B:117:0x0244  */
    /* JADX WARN: Code duplicated, block: B:122:0x0008 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:123:0x0008 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:124:0x0008 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:125:0x0008 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:126:0x0008 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:127:0x0008 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:128:0x0008 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:129:0x0008 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:130:0x0008 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:131:0x0008 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:132:0x0008 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:133:0x0008 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:134:0x0008 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:135:0x0008 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:136:0x0008 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:137:0x0021 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:138:0x004a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:139:0x002c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:13:0x003e  */
    /* JADX WARN: Code duplicated, block: B:140:0x0132 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:141:0x0146 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:142:0x0158 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:143:0x016c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:144:0x017e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:145:0x0195 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:146:0x01a9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:147:0x01be A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:148:0x01d3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:149:0x01e7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:150:0x01f8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:151:0x020e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:152:0x0224 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:153:0x023b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:155:0x0009 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:156:0x0009 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:16:0x0054  */
    /* JADX WARN: Code duplicated, block: B:17:0x0055  */
    /* JADX WARN: Code duplicated, block: B:18:0x0058  */
    /* JADX WARN: Code duplicated, block: B:21:0x0062  */
    /* JADX WARN: Code duplicated, block: B:22:0x0068  */
    /* JADX WARN: Code duplicated, block: B:24:0x0072  */
    /* JADX WARN: Code duplicated, block: B:25:0x0074  */
    /* JADX WARN: Code duplicated, block: B:26:0x007a  */
    /* JADX WARN: Code duplicated, block: B:29:0x0084  */
    /* JADX WARN: Code duplicated, block: B:30:0x008a  */
    /* JADX WARN: Code duplicated, block: B:32:0x0094  */
    /* JADX WARN: Code duplicated, block: B:33:0x0096  */
    /* JADX WARN: Code duplicated, block: B:34:0x009c  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:38:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:41:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:42:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:44:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:45:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:47:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:48:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:49:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:52:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:53:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:56:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:57:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:60:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:61:0x0101  */
    /* JADX WARN: Code duplicated, block: B:64:0x010b  */
    /* JADX WARN: Code duplicated, block: B:65:0x010e  */
    /* JADX WARN: Code duplicated, block: B:68:0x011a  */
    /* JADX WARN: Code duplicated, block: B:69:0x011d  */
    /* JADX WARN: Code duplicated, block: B:6:0x000f  */
    /* JADX WARN: Code duplicated, block: B:72:0x012a  */
    /* JADX WARN: Code duplicated, block: B:73:0x012c A[PHI: r4
      0x012c: PHI (r4v8 byte) = (r4v1 byte), (r4v0 byte) binds: [B:72:0x012a, B:43:0x00c3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:78:0x013b  */
    /* JADX WARN: Code duplicated, block: B:81:0x014e  */
    /* JADX WARN: Code duplicated, block: B:84:0x0162  */
    /* JADX WARN: Code duplicated, block: B:87:0x0175  */
    /* JADX WARN: Code duplicated, block: B:90:0x0189  */
    /* JADX WARN: Code duplicated, block: B:93:0x019f  */
    /* JADX WARN: Code duplicated, block: B:96:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:99:0x01c7  */
    /* JADX WARN: Failed to find 'out' block for switch in B:74:0x012d. Please report as an issue. */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // p128g2.AbstractC5666d
    /* JADX INFO: renamed from: a */
    public final void mo12024a(java.util.HashMap<java.lang.String, p107f2.AbstractC5465d> r10) {
        /*
            Method dump skipped, instruction units count: 684
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p128g2.C5667e.mo12024a(java.util.HashMap):void");
    }

    @Override // p128g2.AbstractC5666d
    /* JADX INFO: renamed from: b */
    public final AbstractC5666d clone() {
        C5667e c5667e = new C5667e();
        super.m12026c(this);
        c5667e.f34501e = this.f34501e;
        c5667e.f34502f = this.f34502f;
        c5667e.f34503g = this.f34503g;
        c5667e.f34504h = this.f34504h;
        c5667e.f34505i = this.f34505i;
        c5667e.f34506j = this.f34506j;
        c5667e.f34507k = this.f34507k;
        c5667e.f34508l = this.f34508l;
        c5667e.f34509m = this.f34509m;
        c5667e.f34510n = this.f34510n;
        c5667e.f34511o = this.f34511o;
        c5667e.f34512p = this.f34512p;
        c5667e.f34513q = this.f34513q;
        c5667e.f34514r = this.f34514r;
        c5667e.f34515s = this.f34515s;
        return c5667e;
    }

    @Override // p128g2.AbstractC5666d
    /* JADX INFO: renamed from: d */
    public final void mo12027d(HashSet<String> hashSet) {
        if (!Float.isNaN(this.f34502f)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.f34503g)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.f34504h)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.f34505i)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.f34506j)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.f34507k)) {
            hashSet.add("transformPivotX");
        }
        if (!Float.isNaN(this.f34508l)) {
            hashSet.add("transformPivotY");
        }
        if (!Float.isNaN(this.f34512p)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.f34513q)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.f34514r)) {
            hashSet.add("translationZ");
        }
        if (!Float.isNaN(this.f34509m)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.f34510n)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.f34511o)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.f34515s)) {
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
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C5881d.f35172f);
        SparseIntArray sparseIntArray = a.f34516a;
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i10);
            SparseIntArray sparseIntArray2 = a.f34516a;
            switch (sparseIntArray2.get(index)) {
                case 1:
                    this.f34502f = typedArrayObtainStyledAttributes.getFloat(index, this.f34502f);
                    continue;
                    break;
                case 2:
                    this.f34503g = typedArrayObtainStyledAttributes.getDimension(index, this.f34503g);
                    continue;
                    break;
                case 4:
                    this.f34504h = typedArrayObtainStyledAttributes.getFloat(index, this.f34504h);
                    continue;
                    break;
                case 5:
                    this.f34505i = typedArrayObtainStyledAttributes.getFloat(index, this.f34505i);
                    continue;
                    break;
                case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                    this.f34506j = typedArrayObtainStyledAttributes.getFloat(index, this.f34506j);
                    continue;
                    break;
                case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                    this.f34510n = typedArrayObtainStyledAttributes.getFloat(index, this.f34510n);
                    continue;
                    break;
                case 8:
                    this.f34509m = typedArrayObtainStyledAttributes.getFloat(index, this.f34509m);
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
                        } else {
                            continue;
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
                    this.f34501e = typedArrayObtainStyledAttributes.getInteger(index, this.f34501e);
                    continue;
                    break;
                case 14:
                    this.f34511o = typedArrayObtainStyledAttributes.getFloat(index, this.f34511o);
                    continue;
                    break;
                case 15:
                    this.f34512p = typedArrayObtainStyledAttributes.getDimension(index, this.f34512p);
                    continue;
                    break;
                case 16:
                    this.f34513q = typedArrayObtainStyledAttributes.getDimension(index, this.f34513q);
                    continue;
                    break;
                case 17:
                    this.f34514r = typedArrayObtainStyledAttributes.getDimension(index, this.f34514r);
                    continue;
                    break;
                case 18:
                    this.f34515s = typedArrayObtainStyledAttributes.getFloat(index, this.f34515s);
                    continue;
                    break;
                case 19:
                    this.f34507k = typedArrayObtainStyledAttributes.getDimension(index, this.f34507k);
                    continue;
                    break;
                case 20:
                    this.f34508l = typedArrayObtainStyledAttributes.getDimension(index, this.f34508l);
                    continue;
                    break;
            }
            Log.e("KeyAttribute", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray2.get(index));
        }
    }

    @Override // p128g2.AbstractC5666d
    /* JADX INFO: renamed from: f */
    public final void mo12029f(HashMap<String, Integer> map) {
        if (this.f34501e == -1) {
            return;
        }
        if (!Float.isNaN(this.f34502f)) {
            map.put("alpha", Integer.valueOf(this.f34501e));
        }
        if (!Float.isNaN(this.f34503g)) {
            map.put("elevation", Integer.valueOf(this.f34501e));
        }
        if (!Float.isNaN(this.f34504h)) {
            map.put("rotation", Integer.valueOf(this.f34501e));
        }
        if (!Float.isNaN(this.f34505i)) {
            map.put("rotationX", Integer.valueOf(this.f34501e));
        }
        if (!Float.isNaN(this.f34506j)) {
            map.put("rotationY", Integer.valueOf(this.f34501e));
        }
        if (!Float.isNaN(this.f34507k)) {
            map.put("transformPivotX", Integer.valueOf(this.f34501e));
        }
        if (!Float.isNaN(this.f34508l)) {
            map.put("transformPivotY", Integer.valueOf(this.f34501e));
        }
        if (!Float.isNaN(this.f34512p)) {
            map.put("translationX", Integer.valueOf(this.f34501e));
        }
        if (!Float.isNaN(this.f34513q)) {
            map.put("translationY", Integer.valueOf(this.f34501e));
        }
        if (!Float.isNaN(this.f34514r)) {
            map.put("translationZ", Integer.valueOf(this.f34501e));
        }
        if (!Float.isNaN(this.f34509m)) {
            map.put("transitionPathRotate", Integer.valueOf(this.f34501e));
        }
        if (!Float.isNaN(this.f34510n)) {
            map.put("scaleX", Integer.valueOf(this.f34501e));
        }
        if (!Float.isNaN(this.f34511o)) {
            map.put("scaleY", Integer.valueOf(this.f34501e));
        }
        if (!Float.isNaN(this.f34515s)) {
            map.put("progress", Integer.valueOf(this.f34501e));
        }
        if (this.f34500d.size() > 0) {
            Iterator<String> it = this.f34500d.keySet().iterator();
            while (it.hasNext()) {
                map.put(C0204c.m852k("CUSTOM,", it.next()), Integer.valueOf(this.f34501e));
            }
        }
    }
}
