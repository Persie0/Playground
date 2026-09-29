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
public final class zi4 extends qh4 {

    /* JADX INFO: renamed from: e */
    public int f71593e = -1;

    /* JADX INFO: renamed from: f */
    public float f71594f = Float.NaN;

    /* JADX INFO: renamed from: g */
    public float f71595g = Float.NaN;

    /* JADX INFO: renamed from: h */
    public float f71596h = Float.NaN;

    /* JADX INFO: renamed from: i */
    public float f71597i = Float.NaN;

    /* JADX INFO: renamed from: j */
    public float f71598j = Float.NaN;

    /* JADX INFO: renamed from: k */
    public float f71599k = Float.NaN;

    /* JADX INFO: renamed from: l */
    public float f71600l = Float.NaN;

    /* JADX INFO: renamed from: m */
    public float f71601m = Float.NaN;

    /* JADX INFO: renamed from: n */
    public float f71602n = Float.NaN;

    /* JADX INFO: renamed from: o */
    public float f71603o = Float.NaN;

    /* JADX INFO: renamed from: p */
    public float f71604p = Float.NaN;

    /* JADX INFO: renamed from: q */
    public float f71605q = Float.NaN;

    /* JADX INFO: renamed from: r */
    public int f71606r = 0;

    /* JADX INFO: renamed from: s */
    public float f71607s = Float.NaN;

    /* JADX INFO: renamed from: t */
    public float f71608t = 0.0f;

    public zi4() {
        this.f57782d = new HashMap();
    }

    @Override // p000.qh4
    /* JADX INFO: renamed from: a */
    public final void mo3770a(HashMap map) {
        throw null;
    }

    @Override // p000.qh4
    /* JADX INFO: renamed from: b */
    public final qh4 clone() {
        zi4 zi4Var = new zi4();
        super.m19971c(this);
        zi4Var.f71593e = this.f71593e;
        zi4Var.f71606r = this.f71606r;
        zi4Var.f71607s = this.f71607s;
        zi4Var.f71608t = this.f71608t;
        zi4Var.f71605q = this.f71605q;
        zi4Var.f71594f = this.f71594f;
        zi4Var.f71595g = this.f71595g;
        zi4Var.f71596h = this.f71596h;
        zi4Var.f71599k = this.f71599k;
        zi4Var.f71597i = this.f71597i;
        zi4Var.f71598j = this.f71598j;
        zi4Var.f71600l = this.f71600l;
        zi4Var.f71601m = this.f71601m;
        zi4Var.f71602n = this.f71602n;
        zi4Var.f71603o = this.f71603o;
        zi4Var.f71604p = this.f71604p;
        return zi4Var;
    }

    @Override // p000.qh4
    /* JADX INFO: renamed from: d */
    public final void mo3772d(HashSet hashSet) {
        if (!Float.isNaN(this.f71594f)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.f71595g)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.f71596h)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.f71597i)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.f71598j)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.f71602n)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.f71603o)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.f71604p)) {
            hashSet.add("translationZ");
        }
        if (!Float.isNaN(this.f71599k)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.f71600l)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.f71601m)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.f71605q)) {
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
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.KeyTimeCycle);
        SparseIntArray sparseIntArray = yi4.f69866a;
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            SparseIntArray sparseIntArray2 = yi4.f69866a;
            switch (sparseIntArray2.get(index)) {
                case 1:
                    this.f71594f = typedArrayObtainStyledAttributes.getFloat(index, this.f71594f);
                    break;
                case 2:
                    this.f71595g = typedArrayObtainStyledAttributes.getDimension(index, this.f71595g);
                    break;
                case 3:
                case 11:
                default:
                    Log.e("KeyTimeCycle", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray2.get(index));
                    break;
                case 4:
                    this.f71596h = typedArrayObtainStyledAttributes.getFloat(index, this.f71596h);
                    break;
                case 5:
                    this.f71597i = typedArrayObtainStyledAttributes.getFloat(index, this.f71597i);
                    break;
                case 6:
                    this.f71598j = typedArrayObtainStyledAttributes.getFloat(index, this.f71598j);
                    break;
                case 7:
                    this.f71600l = typedArrayObtainStyledAttributes.getFloat(index, this.f71600l);
                    break;
                case 8:
                    this.f71599k = typedArrayObtainStyledAttributes.getFloat(index, this.f71599k);
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
                    this.f71593e = typedArrayObtainStyledAttributes.getInteger(index, this.f71593e);
                    break;
                case 14:
                    this.f71601m = typedArrayObtainStyledAttributes.getFloat(index, this.f71601m);
                    break;
                case 15:
                    this.f71602n = typedArrayObtainStyledAttributes.getDimension(index, this.f71602n);
                    break;
                case 16:
                    this.f71603o = typedArrayObtainStyledAttributes.getDimension(index, this.f71603o);
                    break;
                case 17:
                    this.f71604p = typedArrayObtainStyledAttributes.getDimension(index, this.f71604p);
                    break;
                case 18:
                    this.f71605q = typedArrayObtainStyledAttributes.getFloat(index, this.f71605q);
                    break;
                case 19:
                    if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                        typedArrayObtainStyledAttributes.getString(index);
                        this.f71606r = 7;
                    } else {
                        this.f71606r = typedArrayObtainStyledAttributes.getInt(index, this.f71606r);
                    }
                    break;
                case 20:
                    this.f71607s = typedArrayObtainStyledAttributes.getFloat(index, this.f71607s);
                    break;
                case 21:
                    int i2 = typedArrayObtainStyledAttributes.peekValue(index).type;
                    float f = this.f71608t;
                    if (i2 == 5) {
                        this.f71608t = typedArrayObtainStyledAttributes.getDimension(index, f);
                    } else {
                        this.f71608t = typedArrayObtainStyledAttributes.getFloat(index, f);
                    }
                    break;
            }
        }
    }

    @Override // p000.qh4
    /* JADX INFO: renamed from: f */
    public final void mo19972f(HashMap map) {
        if (this.f71593e == -1) {
            return;
        }
        if (!Float.isNaN(this.f71594f)) {
            map.put("alpha", Integer.valueOf(this.f71593e));
        }
        if (!Float.isNaN(this.f71595g)) {
            map.put("elevation", Integer.valueOf(this.f71593e));
        }
        if (!Float.isNaN(this.f71596h)) {
            map.put("rotation", Integer.valueOf(this.f71593e));
        }
        if (!Float.isNaN(this.f71597i)) {
            map.put("rotationX", Integer.valueOf(this.f71593e));
        }
        if (!Float.isNaN(this.f71598j)) {
            map.put("rotationY", Integer.valueOf(this.f71593e));
        }
        if (!Float.isNaN(this.f71602n)) {
            map.put("translationX", Integer.valueOf(this.f71593e));
        }
        if (!Float.isNaN(this.f71603o)) {
            map.put("translationY", Integer.valueOf(this.f71593e));
        }
        if (!Float.isNaN(this.f71604p)) {
            map.put("translationZ", Integer.valueOf(this.f71593e));
        }
        if (!Float.isNaN(this.f71599k)) {
            map.put("transitionPathRotate", Integer.valueOf(this.f71593e));
        }
        if (!Float.isNaN(this.f71600l)) {
            map.put("scaleX", Integer.valueOf(this.f71593e));
        }
        if (!Float.isNaN(this.f71600l)) {
            map.put("scaleY", Integer.valueOf(this.f71593e));
        }
        if (!Float.isNaN(this.f71605q)) {
            map.put("progress", Integer.valueOf(this.f71593e));
        }
        if (this.f57782d.size() > 0) {
            Iterator it = this.f57782d.keySet().iterator();
            while (it.hasNext()) {
                map.put(AbstractC3393o1.m17734i("CUSTOM,", (String) it.next()), Integer.valueOf(this.f71593e));
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m25668g(HashMap map) {
        for (String str : map.keySet()) {
            rva rvaVar = (rva) map.get(str);
            if (rvaVar != null) {
                if (!str.startsWith("CUSTOM")) {
                    switch (str) {
                        case "rotationX":
                            if (Float.isNaN(this.f71597i)) {
                                break;
                            } else {
                                rvaVar.mo18524c(this.f71597i, this.f71607s, this.f71608t, this.f57779a, this.f71606r);
                                break;
                            }
                            break;
                        case "rotationY":
                            if (Float.isNaN(this.f71598j)) {
                                break;
                            } else {
                                rvaVar.mo18524c(this.f71598j, this.f71607s, this.f71608t, this.f57779a, this.f71606r);
                                break;
                            }
                            break;
                        case "translationX":
                            if (Float.isNaN(this.f71602n)) {
                                break;
                            } else {
                                rvaVar.mo18524c(this.f71602n, this.f71607s, this.f71608t, this.f57779a, this.f71606r);
                                break;
                            }
                            break;
                        case "translationY":
                            if (Float.isNaN(this.f71603o)) {
                                break;
                            } else {
                                rvaVar.mo18524c(this.f71603o, this.f71607s, this.f71608t, this.f57779a, this.f71606r);
                                break;
                            }
                            break;
                        case "translationZ":
                            if (Float.isNaN(this.f71604p)) {
                                break;
                            } else {
                                rvaVar.mo18524c(this.f71604p, this.f71607s, this.f71608t, this.f57779a, this.f71606r);
                                break;
                            }
                            break;
                        case "progress":
                            if (Float.isNaN(this.f71605q)) {
                                break;
                            } else {
                                rvaVar.mo18524c(this.f71605q, this.f71607s, this.f71608t, this.f57779a, this.f71606r);
                                break;
                            }
                            break;
                        case "scaleX":
                            if (Float.isNaN(this.f71600l)) {
                                break;
                            } else {
                                rvaVar.mo18524c(this.f71600l, this.f71607s, this.f71608t, this.f57779a, this.f71606r);
                                break;
                            }
                            break;
                        case "scaleY":
                            if (Float.isNaN(this.f71601m)) {
                                break;
                            } else {
                                rvaVar.mo18524c(this.f71601m, this.f71607s, this.f71608t, this.f57779a, this.f71606r);
                                break;
                            }
                            break;
                        case "rotation":
                            if (Float.isNaN(this.f71596h)) {
                                break;
                            } else {
                                rvaVar.mo18524c(this.f71596h, this.f71607s, this.f71608t, this.f57779a, this.f71606r);
                                break;
                            }
                            break;
                        case "elevation":
                            if (Float.isNaN(this.f71595g)) {
                                break;
                            } else {
                                rvaVar.mo18524c(this.f71595g, this.f71607s, this.f71608t, this.f57779a, this.f71606r);
                                break;
                            }
                            break;
                        case "transitionPathRotate":
                            if (Float.isNaN(this.f71599k)) {
                                break;
                            } else {
                                rvaVar.mo18524c(this.f71599k, this.f71607s, this.f71608t, this.f57779a, this.f71606r);
                                break;
                            }
                            break;
                        case "alpha":
                            if (Float.isNaN(this.f71594f)) {
                                break;
                            } else {
                                rvaVar.mo18524c(this.f71594f, this.f71607s, this.f71608t, this.f57779a, this.f71606r);
                                break;
                            }
                            break;
                        default:
                            Log.e("KeyTimeCycles", "UNKNOWN addValues \"" + str + "\"");
                            break;
                    }
                } else {
                    cj1 cj1Var = (cj1) this.f57782d.get(str.substring(7));
                    if (cj1Var != null) {
                        ova ovaVar = (ova) rvaVar;
                        int i = this.f57779a;
                        float f = this.f71607s;
                        int i2 = this.f71606r;
                        float f2 = this.f71608t;
                        ovaVar.f55042l.append(i, cj1Var);
                        ovaVar.f55043m.append(i, new float[]{f, f2});
                        ovaVar.f59885b = Math.max(ovaVar.f59885b, i2);
                    }
                }
            }
        }
    }
}
