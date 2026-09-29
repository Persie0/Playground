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
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class th4 extends qh4 {

    /* JADX INFO: renamed from: e */
    public int f62275e = -1;

    /* JADX INFO: renamed from: f */
    public float f62276f = Float.NaN;

    /* JADX INFO: renamed from: g */
    public float f62277g = Float.NaN;

    /* JADX INFO: renamed from: h */
    public float f62278h = Float.NaN;

    /* JADX INFO: renamed from: i */
    public float f62279i = Float.NaN;

    /* JADX INFO: renamed from: j */
    public float f62280j = Float.NaN;

    /* JADX INFO: renamed from: k */
    public float f62281k = Float.NaN;

    /* JADX INFO: renamed from: l */
    public float f62282l = Float.NaN;

    /* JADX INFO: renamed from: m */
    public float f62283m = Float.NaN;

    /* JADX INFO: renamed from: n */
    public float f62284n = Float.NaN;

    /* JADX INFO: renamed from: o */
    public float f62285o = Float.NaN;

    /* JADX INFO: renamed from: p */
    public float f62286p = Float.NaN;

    /* JADX INFO: renamed from: q */
    public float f62287q = Float.NaN;

    /* JADX INFO: renamed from: r */
    public float f62288r = Float.NaN;

    /* JADX INFO: renamed from: s */
    public float f62289s = Float.NaN;

    public th4() {
        this.f57782d = new HashMap();
    }

    @Override // p000.qh4
    /* JADX INFO: renamed from: a */
    public final void mo3770a(HashMap map) {
        for (String str : map.keySet()) {
            gva gvaVar = (gva) map.get(str);
            if (gvaVar != null) {
                if (!str.startsWith("CUSTOM")) {
                    switch (str) {
                        case "rotationX":
                            if (Float.isNaN(this.f62279i)) {
                                break;
                            } else {
                                gvaVar.mo10687b(this.f57779a, this.f62279i);
                                break;
                            }
                            break;
                        case "rotationY":
                            if (Float.isNaN(this.f62280j)) {
                                break;
                            } else {
                                gvaVar.mo10687b(this.f57779a, this.f62280j);
                                break;
                            }
                            break;
                        case "translationX":
                            if (Float.isNaN(this.f62286p)) {
                                break;
                            } else {
                                gvaVar.mo10687b(this.f57779a, this.f62286p);
                                break;
                            }
                            break;
                        case "translationY":
                            if (Float.isNaN(this.f62287q)) {
                                break;
                            } else {
                                gvaVar.mo10687b(this.f57779a, this.f62287q);
                                break;
                            }
                            break;
                        case "translationZ":
                            if (Float.isNaN(this.f62288r)) {
                                break;
                            } else {
                                gvaVar.mo10687b(this.f57779a, this.f62288r);
                                break;
                            }
                            break;
                        case "progress":
                            if (Float.isNaN(this.f62289s)) {
                                break;
                            } else {
                                gvaVar.mo10687b(this.f57779a, this.f62289s);
                                break;
                            }
                            break;
                        case "scaleX":
                            if (Float.isNaN(this.f62284n)) {
                                break;
                            } else {
                                gvaVar.mo10687b(this.f57779a, this.f62284n);
                                break;
                            }
                            break;
                        case "scaleY":
                            if (Float.isNaN(this.f62285o)) {
                                break;
                            } else {
                                gvaVar.mo10687b(this.f57779a, this.f62285o);
                                break;
                            }
                            break;
                        case "transformPivotX":
                            if (Float.isNaN(this.f62279i)) {
                                break;
                            } else {
                                gvaVar.mo10687b(this.f57779a, this.f62281k);
                                break;
                            }
                            break;
                        case "transformPivotY":
                            if (Float.isNaN(this.f62280j)) {
                                break;
                            } else {
                                gvaVar.mo10687b(this.f57779a, this.f62282l);
                                break;
                            }
                            break;
                        case "rotation":
                            if (Float.isNaN(this.f62278h)) {
                                break;
                            } else {
                                gvaVar.mo10687b(this.f57779a, this.f62278h);
                                break;
                            }
                            break;
                        case "elevation":
                            if (Float.isNaN(this.f62277g)) {
                                break;
                            } else {
                                gvaVar.mo10687b(this.f57779a, this.f62277g);
                                break;
                            }
                            break;
                        case "transitionPathRotate":
                            if (Float.isNaN(this.f62283m)) {
                                break;
                            } else {
                                gvaVar.mo10687b(this.f57779a, this.f62283m);
                                break;
                            }
                            break;
                        case "alpha":
                            if (Float.isNaN(this.f62276f)) {
                                break;
                            } else {
                                gvaVar.mo10687b(this.f57779a, this.f62276f);
                                break;
                            }
                            break;
                    }
                } else {
                    cj1 cj1Var = (cj1) this.f57782d.get(str.substring(7));
                    if (cj1Var != null) {
                        ((dva) gvaVar).f36276f.append(this.f57779a, cj1Var);
                    }
                }
            }
        }
    }

    @Override // p000.qh4
    /* JADX INFO: renamed from: b */
    public final qh4 clone() {
        th4 th4Var = new th4();
        super.m19971c(this);
        th4Var.f62275e = this.f62275e;
        th4Var.f62276f = this.f62276f;
        th4Var.f62277g = this.f62277g;
        th4Var.f62278h = this.f62278h;
        th4Var.f62279i = this.f62279i;
        th4Var.f62280j = this.f62280j;
        th4Var.f62281k = this.f62281k;
        th4Var.f62282l = this.f62282l;
        th4Var.f62283m = this.f62283m;
        th4Var.f62284n = this.f62284n;
        th4Var.f62285o = this.f62285o;
        th4Var.f62286p = this.f62286p;
        th4Var.f62287q = this.f62287q;
        th4Var.f62288r = this.f62288r;
        th4Var.f62289s = this.f62289s;
        return th4Var;
    }

    @Override // p000.qh4
    /* JADX INFO: renamed from: d */
    public final void mo3772d(HashSet hashSet) {
        if (!Float.isNaN(this.f62276f)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.f62277g)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.f62278h)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.f62279i)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.f62280j)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.f62281k)) {
            hashSet.add("transformPivotX");
        }
        if (!Float.isNaN(this.f62282l)) {
            hashSet.add("transformPivotY");
        }
        if (!Float.isNaN(this.f62286p)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.f62287q)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.f62288r)) {
            hashSet.add("translationZ");
        }
        if (!Float.isNaN(this.f62283m)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.f62284n)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.f62285o)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.f62289s)) {
            hashSet.add("progress");
        }
        if (this.f57782d.size() > 0) {
            Iterator it = this.f57782d.keySet().iterator();
            while (it.hasNext()) {
                hashSet.add("CUSTOM," + ((String) it.next()));
            }
        }
    }

    @Override // p000.qh4
    /* JADX INFO: renamed from: e */
    public final void mo3773e(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.KeyAttribute);
        SparseIntArray sparseIntArray = sh4.f60863a;
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            SparseIntArray sparseIntArray2 = sh4.f60863a;
            switch (sparseIntArray2.get(index)) {
                case 1:
                    this.f62276f = typedArrayObtainStyledAttributes.getFloat(index, this.f62276f);
                    break;
                case 2:
                    this.f62277g = typedArrayObtainStyledAttributes.getDimension(index, this.f62277g);
                    break;
                case 3:
                case 11:
                default:
                    Log.e("KeyAttribute", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray2.get(index));
                    break;
                case 4:
                    this.f62278h = typedArrayObtainStyledAttributes.getFloat(index, this.f62278h);
                    break;
                case 5:
                    this.f62279i = typedArrayObtainStyledAttributes.getFloat(index, this.f62279i);
                    break;
                case 6:
                    this.f62280j = typedArrayObtainStyledAttributes.getFloat(index, this.f62280j);
                    break;
                case 7:
                    this.f62284n = typedArrayObtainStyledAttributes.getFloat(index, this.f62284n);
                    break;
                case 8:
                    this.f62283m = typedArrayObtainStyledAttributes.getFloat(index, this.f62283m);
                    break;
                case 9:
                    typedArrayObtainStyledAttributes.getString(index);
                    break;
                case 10:
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
                case 12:
                    this.f57779a = typedArrayObtainStyledAttributes.getInt(index, this.f57779a);
                    break;
                case 13:
                    this.f62275e = typedArrayObtainStyledAttributes.getInteger(index, this.f62275e);
                    break;
                case 14:
                    this.f62285o = typedArrayObtainStyledAttributes.getFloat(index, this.f62285o);
                    break;
                case 15:
                    this.f62286p = typedArrayObtainStyledAttributes.getDimension(index, this.f62286p);
                    break;
                case 16:
                    this.f62287q = typedArrayObtainStyledAttributes.getDimension(index, this.f62287q);
                    break;
                case 17:
                    this.f62288r = typedArrayObtainStyledAttributes.getDimension(index, this.f62288r);
                    break;
                case 18:
                    this.f62289s = typedArrayObtainStyledAttributes.getFloat(index, this.f62289s);
                    break;
                case 19:
                    this.f62281k = typedArrayObtainStyledAttributes.getDimension(index, this.f62281k);
                    break;
                case 20:
                    this.f62282l = typedArrayObtainStyledAttributes.getDimension(index, this.f62282l);
                    break;
            }
        }
    }

    @Override // p000.qh4
    /* JADX INFO: renamed from: f */
    public final void mo19972f(HashMap map) {
        if (this.f62275e == -1) {
            return;
        }
        if (!Float.isNaN(this.f62276f)) {
            map.put("alpha", Integer.valueOf(this.f62275e));
        }
        if (!Float.isNaN(this.f62277g)) {
            map.put("elevation", Integer.valueOf(this.f62275e));
        }
        if (!Float.isNaN(this.f62278h)) {
            map.put("rotation", Integer.valueOf(this.f62275e));
        }
        if (!Float.isNaN(this.f62279i)) {
            map.put("rotationX", Integer.valueOf(this.f62275e));
        }
        if (!Float.isNaN(this.f62280j)) {
            map.put("rotationY", Integer.valueOf(this.f62275e));
        }
        if (!Float.isNaN(this.f62281k)) {
            map.put("transformPivotX", Integer.valueOf(this.f62275e));
        }
        if (!Float.isNaN(this.f62282l)) {
            map.put("transformPivotY", Integer.valueOf(this.f62275e));
        }
        if (!Float.isNaN(this.f62286p)) {
            map.put("translationX", Integer.valueOf(this.f62275e));
        }
        if (!Float.isNaN(this.f62287q)) {
            map.put("translationY", Integer.valueOf(this.f62275e));
        }
        if (!Float.isNaN(this.f62288r)) {
            map.put("translationZ", Integer.valueOf(this.f62275e));
        }
        if (!Float.isNaN(this.f62283m)) {
            map.put("transitionPathRotate", Integer.valueOf(this.f62275e));
        }
        if (!Float.isNaN(this.f62284n)) {
            map.put("scaleX", Integer.valueOf(this.f62275e));
        }
        if (!Float.isNaN(this.f62285o)) {
            map.put("scaleY", Integer.valueOf(this.f62275e));
        }
        if (!Float.isNaN(this.f62289s)) {
            map.put("progress", Integer.valueOf(this.f62275e));
        }
        if (this.f57782d.size() > 0) {
            Iterator it = this.f57782d.keySet().iterator();
            while (it.hasNext()) {
                map.put(AbstractC3393o1.m17734i("CUSTOM,", (String) it.next()), Integer.valueOf(this.f62275e));
            }
        }
    }
}
