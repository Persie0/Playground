package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import androidx.constraintlayout.motion.widget.AbstractC0475b;
import androidx.constraintlayout.widget.ConstraintAttribute$AttributeType;
import androidx.constraintlayout.widget.R$styleable;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class vh4 extends qh4 {

    /* JADX INFO: renamed from: e */
    public int f65375e = 0;

    /* JADX INFO: renamed from: f */
    public int f65376f = -1;

    /* JADX INFO: renamed from: g */
    public String f65377g = null;

    /* JADX INFO: renamed from: h */
    public float f65378h = Float.NaN;

    /* JADX INFO: renamed from: i */
    public float f65379i = 0.0f;

    /* JADX INFO: renamed from: j */
    public float f65380j = 0.0f;

    /* JADX INFO: renamed from: k */
    public float f65381k = Float.NaN;

    /* JADX INFO: renamed from: l */
    public int f65382l = -1;

    /* JADX INFO: renamed from: m */
    public float f65383m = Float.NaN;

    /* JADX INFO: renamed from: n */
    public float f65384n = Float.NaN;

    /* JADX INFO: renamed from: o */
    public float f65385o = Float.NaN;

    /* JADX INFO: renamed from: p */
    public float f65386p = Float.NaN;

    /* JADX INFO: renamed from: q */
    public float f65387q = Float.NaN;

    /* JADX INFO: renamed from: r */
    public float f65388r = Float.NaN;

    /* JADX INFO: renamed from: s */
    public float f65389s = Float.NaN;

    /* JADX INFO: renamed from: t */
    public float f65390t = Float.NaN;

    /* JADX INFO: renamed from: u */
    public float f65391u = Float.NaN;

    /* JADX INFO: renamed from: v */
    public float f65392v = Float.NaN;

    /* JADX INFO: renamed from: w */
    public float f65393w = Float.NaN;

    public vh4() {
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
        vh4 vh4Var = new vh4();
        super.m19971c(this);
        vh4Var.f65375e = this.f65375e;
        vh4Var.f65376f = this.f65376f;
        vh4Var.f65377g = this.f65377g;
        vh4Var.f65378h = this.f65378h;
        vh4Var.f65379i = this.f65379i;
        vh4Var.f65380j = this.f65380j;
        vh4Var.f65381k = this.f65381k;
        vh4Var.f65382l = this.f65382l;
        vh4Var.f65383m = this.f65383m;
        vh4Var.f65384n = this.f65384n;
        vh4Var.f65385o = this.f65385o;
        vh4Var.f65386p = this.f65386p;
        vh4Var.f65387q = this.f65387q;
        vh4Var.f65388r = this.f65388r;
        vh4Var.f65389s = this.f65389s;
        vh4Var.f65390t = this.f65390t;
        vh4Var.f65391u = this.f65391u;
        vh4Var.f65392v = this.f65392v;
        vh4Var.f65393w = this.f65393w;
        return vh4Var;
    }

    @Override // p000.qh4
    /* JADX INFO: renamed from: d */
    public final void mo3772d(HashSet hashSet) {
        if (!Float.isNaN(this.f65383m)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.f65384n)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.f65385o)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.f65387q)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.f65388r)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.f65389s)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.f65390t)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.f65386p)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.f65391u)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.f65392v)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.f65393w)) {
            hashSet.add("translationZ");
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
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.KeyCycle);
        SparseIntArray sparseIntArray = uh4.f63926a;
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            SparseIntArray sparseIntArray2 = uh4.f63926a;
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
                    typedArrayObtainStyledAttributes.getString(index);
                    break;
                case 4:
                    this.f65375e = typedArrayObtainStyledAttributes.getInteger(index, this.f65375e);
                    break;
                case 5:
                    if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                        this.f65377g = typedArrayObtainStyledAttributes.getString(index);
                        this.f65376f = 7;
                    } else {
                        this.f65376f = typedArrayObtainStyledAttributes.getInt(index, this.f65376f);
                    }
                    break;
                case 6:
                    this.f65378h = typedArrayObtainStyledAttributes.getFloat(index, this.f65378h);
                    break;
                case 7:
                    int i2 = typedArrayObtainStyledAttributes.peekValue(index).type;
                    float f = this.f65379i;
                    if (i2 == 5) {
                        this.f65379i = typedArrayObtainStyledAttributes.getDimension(index, f);
                    } else {
                        this.f65379i = typedArrayObtainStyledAttributes.getFloat(index, f);
                    }
                    break;
                case 8:
                    this.f65382l = typedArrayObtainStyledAttributes.getInt(index, this.f65382l);
                    break;
                case 9:
                    this.f65383m = typedArrayObtainStyledAttributes.getFloat(index, this.f65383m);
                    break;
                case 10:
                    this.f65384n = typedArrayObtainStyledAttributes.getDimension(index, this.f65384n);
                    break;
                case 11:
                    this.f65385o = typedArrayObtainStyledAttributes.getFloat(index, this.f65385o);
                    break;
                case 12:
                    this.f65387q = typedArrayObtainStyledAttributes.getFloat(index, this.f65387q);
                    break;
                case 13:
                    this.f65388r = typedArrayObtainStyledAttributes.getFloat(index, this.f65388r);
                    break;
                case 14:
                    this.f65386p = typedArrayObtainStyledAttributes.getFloat(index, this.f65386p);
                    break;
                case 15:
                    this.f65389s = typedArrayObtainStyledAttributes.getFloat(index, this.f65389s);
                    break;
                case 16:
                    this.f65390t = typedArrayObtainStyledAttributes.getFloat(index, this.f65390t);
                    break;
                case 17:
                    this.f65391u = typedArrayObtainStyledAttributes.getDimension(index, this.f65391u);
                    break;
                case 18:
                    this.f65392v = typedArrayObtainStyledAttributes.getDimension(index, this.f65392v);
                    break;
                case 19:
                    this.f65393w = typedArrayObtainStyledAttributes.getDimension(index, this.f65393w);
                    break;
                case 20:
                    this.f65381k = typedArrayObtainStyledAttributes.getFloat(index, this.f65381k);
                    break;
                case 21:
                    this.f65380j = typedArrayObtainStyledAttributes.getFloat(index, this.f65380j) / 360.0f;
                    break;
                default:
                    Log.e("KeyCycle", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray2.get(index));
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m23286g(HashMap map) {
        lua luaVar;
        float f;
        lua luaVar2;
        for (String str : map.keySet()) {
            if (str.startsWith("CUSTOM")) {
                cj1 cj1Var = (cj1) this.f57782d.get(str.substring(7));
                if (cj1Var != null && cj1Var.f10161c == ConstraintAttribute$AttributeType.FLOAT_TYPE && (luaVar = (lua) map.get(str)) != null) {
                    int i = this.f57779a;
                    int i2 = this.f65376f;
                    String str2 = this.f65377g;
                    int i3 = this.f65382l;
                    luaVar.f50164f.add(new xh4(this.f65378h, this.f65379i, this.f65380j, cj1Var.m4765b(), i));
                    if (i3 != -1) {
                        luaVar.f50163e = i3;
                    }
                    luaVar.f50161c = i2;
                    luaVar.mo14154c(cj1Var);
                    luaVar.f50162d = str2;
                }
            } else {
                switch (str) {
                    case "rotationX":
                        f = this.f65387q;
                        break;
                    case "rotationY":
                        f = this.f65388r;
                        break;
                    case "translationX":
                        f = this.f65391u;
                        break;
                    case "translationY":
                        f = this.f65392v;
                        break;
                    case "translationZ":
                        f = this.f65393w;
                        break;
                    case "progress":
                        f = this.f65381k;
                        break;
                    case "scaleX":
                        f = this.f65389s;
                        break;
                    case "scaleY":
                        f = this.f65390t;
                        break;
                    case "rotation":
                        f = this.f65385o;
                        break;
                    case "elevation":
                        f = this.f65384n;
                        break;
                    case "transitionPathRotate":
                        f = this.f65386p;
                        break;
                    case "alpha":
                        f = this.f65383m;
                        break;
                    case "waveOffset":
                        f = this.f65379i;
                        break;
                    case "wavePhase":
                        f = this.f65380j;
                        break;
                    default:
                        if (!str.startsWith("CUSTOM")) {
                            Log.v("WARNING! KeyCycle", "  UNKNOWN  ".concat(str));
                        }
                        f = Float.NaN;
                        break;
                }
                float f2 = f;
                if (!Float.isNaN(f2) && (luaVar2 = (lua) map.get(str)) != null) {
                    int i4 = this.f57779a;
                    int i5 = this.f65376f;
                    String str3 = this.f65377g;
                    int i6 = this.f65382l;
                    luaVar2.f50164f.add(new xh4(this.f65378h, this.f65379i, this.f65380j, f2, i4));
                    if (i6 != -1) {
                        luaVar2.f50163e = i6;
                    }
                    luaVar2.f50161c = i5;
                    luaVar2.f50162d = str3;
                }
            }
        }
    }
}
