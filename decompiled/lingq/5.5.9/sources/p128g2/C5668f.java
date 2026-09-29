package p128g2;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v4.media.session.C0166e;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.datastore.preferences.PreferencesProto$Value;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import p107f2.AbstractC5465d;
import p143h2.C5881d;

/* JADX INFO: renamed from: g2.f */
/* JADX INFO: loaded from: classes.dex */
public final class C5668f extends AbstractC5666d {

    /* JADX INFO: renamed from: e */
    public int f34517e = 0;

    /* JADX INFO: renamed from: f */
    public int f34518f = -1;

    /* JADX INFO: renamed from: g */
    public String f34519g = null;

    /* JADX INFO: renamed from: h */
    public float f34520h = Float.NaN;

    /* JADX INFO: renamed from: i */
    public float f34521i = 0.0f;

    /* JADX INFO: renamed from: j */
    public float f34522j = 0.0f;

    /* JADX INFO: renamed from: k */
    public float f34523k = Float.NaN;

    /* JADX INFO: renamed from: l */
    public int f34524l = -1;

    /* JADX INFO: renamed from: m */
    public float f34525m = Float.NaN;

    /* JADX INFO: renamed from: n */
    public float f34526n = Float.NaN;

    /* JADX INFO: renamed from: o */
    public float f34527o = Float.NaN;

    /* JADX INFO: renamed from: p */
    public float f34528p = Float.NaN;

    /* JADX INFO: renamed from: q */
    public float f34529q = Float.NaN;

    /* JADX INFO: renamed from: r */
    public float f34530r = Float.NaN;

    /* JADX INFO: renamed from: s */
    public float f34531s = Float.NaN;

    /* JADX INFO: renamed from: t */
    public float f34532t = Float.NaN;

    /* JADX INFO: renamed from: u */
    public float f34533u = Float.NaN;

    /* JADX INFO: renamed from: v */
    public float f34534v = Float.NaN;

    /* JADX INFO: renamed from: w */
    public float f34535w = Float.NaN;

    /* JADX INFO: renamed from: g2.f$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public static final SparseIntArray f34536a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f34536a = sparseIntArray;
            sparseIntArray.append(13, 1);
            sparseIntArray.append(11, 2);
            sparseIntArray.append(14, 3);
            sparseIntArray.append(10, 4);
            sparseIntArray.append(19, 5);
            sparseIntArray.append(17, 6);
            sparseIntArray.append(16, 7);
            sparseIntArray.append(20, 8);
            sparseIntArray.append(0, 9);
            sparseIntArray.append(9, 10);
            sparseIntArray.append(5, 11);
            sparseIntArray.append(6, 12);
            sparseIntArray.append(7, 13);
            sparseIntArray.append(15, 14);
            sparseIntArray.append(3, 15);
            sparseIntArray.append(4, 16);
            sparseIntArray.append(1, 17);
            sparseIntArray.append(2, 18);
            sparseIntArray.append(8, 19);
            sparseIntArray.append(12, 20);
            sparseIntArray.append(18, 21);
        }
    }

    public C5668f() {
        this.f34500d = new HashMap<>();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p128g2.AbstractC5666d
    /* JADX INFO: renamed from: a */
    public final void mo12024a(HashMap<String, AbstractC5465d> map) {
        String str = "add " + map.size() + " values";
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        int iMin = Math.min(2, stackTrace.length - 1);
        String strM765k = " ";
        for (int i10 = 1; i10 <= iMin; i10++) {
            StackTraceElement stackTraceElement = stackTrace[i10];
            String str2 = ".(" + stackTrace[i10].getFileName() + ":" + stackTrace[i10].getLineNumber() + ") " + stackTrace[i10].getMethodName();
            strM765k = C0166e.m765k(strM765k, " ");
            Log.v("KeyCycle", str + strM765k + str2 + strM765k);
        }
        while (true) {
            for (String str3 : map.keySet()) {
                AbstractC5465d abstractC5465d = map.get(str3);
                if (abstractC5465d != null) {
                    str3.getClass();
                    str3.hashCode();
                    switch (str3) {
                        case "rotationX":
                            abstractC5465d.mo5397b(this.f34497a, this.f34529q);
                            break;
                        case "rotationY":
                            abstractC5465d.mo5397b(this.f34497a, this.f34530r);
                            break;
                        case "translationX":
                            abstractC5465d.mo5397b(this.f34497a, this.f34533u);
                            break;
                        case "translationY":
                            abstractC5465d.mo5397b(this.f34497a, this.f34534v);
                            break;
                        case "translationZ":
                            abstractC5465d.mo5397b(this.f34497a, this.f34535w);
                            break;
                        case "progress":
                            abstractC5465d.mo5397b(this.f34497a, this.f34523k);
                            break;
                        case "scaleX":
                            abstractC5465d.mo5397b(this.f34497a, this.f34531s);
                            break;
                        case "scaleY":
                            abstractC5465d.mo5397b(this.f34497a, this.f34532t);
                            break;
                        case "rotation":
                            abstractC5465d.mo5397b(this.f34497a, this.f34527o);
                            break;
                        case "elevation":
                            abstractC5465d.mo5397b(this.f34497a, this.f34526n);
                            break;
                        case "transitionPathRotate":
                            abstractC5465d.mo5397b(this.f34497a, this.f34528p);
                            break;
                        case "alpha":
                            abstractC5465d.mo5397b(this.f34497a, this.f34525m);
                            break;
                        case "waveOffset":
                            abstractC5465d.mo5397b(this.f34497a, this.f34521i);
                            break;
                        case "wavePhase":
                            abstractC5465d.mo5397b(this.f34497a, this.f34522j);
                            break;
                        default:
                            if (str3.startsWith("CUSTOM")) {
                                break;
                            } else {
                                Log.v("WARNING KeyCycle", "  UNKNOWN  ".concat(str3));
                                break;
                            }
                            break;
                    }
                }
            }
            return;
        }
    }

    @Override // p128g2.AbstractC5666d
    /* JADX INFO: renamed from: b */
    public final AbstractC5666d clone() {
        C5668f c5668f = new C5668f();
        super.m12026c(this);
        c5668f.f34517e = this.f34517e;
        c5668f.f34518f = this.f34518f;
        c5668f.f34519g = this.f34519g;
        c5668f.f34520h = this.f34520h;
        c5668f.f34521i = this.f34521i;
        c5668f.f34522j = this.f34522j;
        c5668f.f34523k = this.f34523k;
        c5668f.f34524l = this.f34524l;
        c5668f.f34525m = this.f34525m;
        c5668f.f34526n = this.f34526n;
        c5668f.f34527o = this.f34527o;
        c5668f.f34528p = this.f34528p;
        c5668f.f34529q = this.f34529q;
        c5668f.f34530r = this.f34530r;
        c5668f.f34531s = this.f34531s;
        c5668f.f34532t = this.f34532t;
        c5668f.f34533u = this.f34533u;
        c5668f.f34534v = this.f34534v;
        c5668f.f34535w = this.f34535w;
        return c5668f;
    }

    @Override // p128g2.AbstractC5666d
    /* JADX INFO: renamed from: d */
    public final void mo12027d(HashSet<String> hashSet) {
        if (!Float.isNaN(this.f34525m)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.f34526n)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.f34527o)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.f34529q)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.f34530r)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.f34531s)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.f34532t)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.f34528p)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.f34533u)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.f34534v)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.f34535w)) {
            hashSet.add("translationZ");
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
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C5881d.f35173g);
        SparseIntArray sparseIntArray = a.f34536a;
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i10);
            SparseIntArray sparseIntArray2 = a.f34536a;
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
                    typedArrayObtainStyledAttributes.getString(index);
                    break;
                case 4:
                    this.f34517e = typedArrayObtainStyledAttributes.getInteger(index, this.f34517e);
                    break;
                case 5:
                    if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                        this.f34519g = typedArrayObtainStyledAttributes.getString(index);
                        this.f34518f = 7;
                    } else {
                        this.f34518f = typedArrayObtainStyledAttributes.getInt(index, this.f34518f);
                    }
                    break;
                case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                    this.f34520h = typedArrayObtainStyledAttributes.getFloat(index, this.f34520h);
                    break;
                case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                    if (typedArrayObtainStyledAttributes.peekValue(index).type == 5) {
                        this.f34521i = typedArrayObtainStyledAttributes.getDimension(index, this.f34521i);
                    } else {
                        this.f34521i = typedArrayObtainStyledAttributes.getFloat(index, this.f34521i);
                    }
                    break;
                case 8:
                    this.f34524l = typedArrayObtainStyledAttributes.getInt(index, this.f34524l);
                    break;
                case 9:
                    this.f34525m = typedArrayObtainStyledAttributes.getFloat(index, this.f34525m);
                    break;
                case 10:
                    this.f34526n = typedArrayObtainStyledAttributes.getDimension(index, this.f34526n);
                    break;
                case 11:
                    this.f34527o = typedArrayObtainStyledAttributes.getFloat(index, this.f34527o);
                    break;
                case 12:
                    this.f34529q = typedArrayObtainStyledAttributes.getFloat(index, this.f34529q);
                    break;
                case 13:
                    this.f34530r = typedArrayObtainStyledAttributes.getFloat(index, this.f34530r);
                    break;
                case 14:
                    this.f34528p = typedArrayObtainStyledAttributes.getFloat(index, this.f34528p);
                    break;
                case 15:
                    this.f34531s = typedArrayObtainStyledAttributes.getFloat(index, this.f34531s);
                    break;
                case 16:
                    this.f34532t = typedArrayObtainStyledAttributes.getFloat(index, this.f34532t);
                    break;
                case 17:
                    this.f34533u = typedArrayObtainStyledAttributes.getDimension(index, this.f34533u);
                    break;
                case 18:
                    this.f34534v = typedArrayObtainStyledAttributes.getDimension(index, this.f34534v);
                    break;
                case 19:
                    this.f34535w = typedArrayObtainStyledAttributes.getDimension(index, this.f34535w);
                    break;
                case 20:
                    this.f34523k = typedArrayObtainStyledAttributes.getFloat(index, this.f34523k);
                    break;
                case 21:
                    this.f34522j = typedArrayObtainStyledAttributes.getFloat(index, this.f34522j) / 360.0f;
                    break;
                default:
                    Log.e("KeyCycle", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray2.get(index));
                    break;
            }
        }
    }
}
