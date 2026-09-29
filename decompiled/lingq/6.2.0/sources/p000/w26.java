package p000;

import android.graphics.Rect;
import android.util.Log;
import java.util.HashMap;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class w26 implements Comparable {

    /* JADX INFO: renamed from: c */
    public int f66296c;

    /* JADX INFO: renamed from: a */
    public float f66294a = 0.0f;

    /* JADX INFO: renamed from: b */
    public int f66295b = 0;

    /* JADX INFO: renamed from: d */
    public final LinkedHashMap f66297d = new LinkedHashMap();

    /* JADX INFO: renamed from: e */
    public float f66298e = 1.0f;

    /* JADX INFO: renamed from: f */
    public float f66299f = 0.0f;

    /* JADX INFO: renamed from: g */
    public float f66300g = 0.0f;

    /* JADX INFO: renamed from: h */
    public float f66301h = 0.0f;

    /* JADX INFO: renamed from: i */
    public float f66302i = 1.0f;

    /* JADX INFO: renamed from: j */
    public float f66303j = 1.0f;

    /* JADX INFO: renamed from: k */
    public float f66304k = Float.NaN;

    /* JADX INFO: renamed from: l */
    public float f66305l = Float.NaN;

    /* JADX INFO: renamed from: H */
    public float f66289H = 0.0f;

    /* JADX INFO: renamed from: I */
    public float f66290I = 0.0f;

    /* JADX INFO: renamed from: J */
    public float f66291J = 0.0f;

    /* JADX INFO: renamed from: K */
    public float f66292K = Float.NaN;

    /* JADX INFO: renamed from: L */
    public float f66293L = Float.NaN;

    /* JADX INFO: renamed from: b */
    public static boolean m23688b(float f, float f2) {
        if (Float.isNaN(f) || Float.isNaN(f2)) {
            return Float.isNaN(f) != Float.isNaN(f2);
        }
        return Math.abs(f - f2) > 1.0E-6f;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: a */
    public final void m23689a(HashMap map, int i) {
        for (String str : map.keySet()) {
            gva gvaVar = (gva) map.get(str);
            if (gvaVar != null) {
                str.getClass();
                byte b = -1;
                switch (str.hashCode()) {
                    case -1249320806:
                        if (str.equals("rotationX")) {
                            b = 0;
                        }
                        break;
                    case -1249320805:
                        if (str.equals("rotationY")) {
                            b = 1;
                        }
                        break;
                    case -1225497657:
                        if (str.equals("translationX")) {
                            b = 2;
                        }
                        break;
                    case -1225497656:
                        if (str.equals("translationY")) {
                            b = 3;
                        }
                        break;
                    case -1225497655:
                        if (str.equals("translationZ")) {
                            b = 4;
                        }
                        break;
                    case -1001078227:
                        if (str.equals("progress")) {
                            b = 5;
                        }
                        break;
                    case -908189618:
                        if (str.equals("scaleX")) {
                            b = 6;
                        }
                        break;
                    case -908189617:
                        if (str.equals("scaleY")) {
                            b = 7;
                        }
                        break;
                    case -760884510:
                        if (str.equals("transformPivotX")) {
                            b = 8;
                        }
                        break;
                    case -760884509:
                        if (str.equals("transformPivotY")) {
                            b = 9;
                        }
                        break;
                    case -40300674:
                        if (str.equals("rotation")) {
                            b = 10;
                        }
                        break;
                    case -4379043:
                        if (str.equals("elevation")) {
                            b = 11;
                        }
                        break;
                    case 37232917:
                        if (str.equals("transitionPathRotate")) {
                            b = 12;
                        }
                        break;
                    case 92909918:
                        if (str.equals("alpha")) {
                            b = 13;
                        }
                        break;
                }
                switch (b) {
                    case 0:
                        gvaVar.mo10687b(i, Float.isNaN(this.f66301h) ? 0.0f : this.f66301h);
                        break;
                    case 1:
                        gvaVar.mo10687b(i, Float.isNaN(this.f66294a) ? 0.0f : this.f66294a);
                        break;
                    case 2:
                        gvaVar.mo10687b(i, Float.isNaN(this.f66289H) ? 0.0f : this.f66289H);
                        break;
                    case 3:
                        gvaVar.mo10687b(i, Float.isNaN(this.f66290I) ? 0.0f : this.f66290I);
                        break;
                    case 4:
                        gvaVar.mo10687b(i, Float.isNaN(this.f66291J) ? 0.0f : this.f66291J);
                        break;
                    case 5:
                        gvaVar.mo10687b(i, Float.isNaN(this.f66293L) ? 0.0f : this.f66293L);
                        break;
                    case 6:
                        gvaVar.mo10687b(i, Float.isNaN(this.f66302i) ? 1.0f : this.f66302i);
                        break;
                    case 7:
                        gvaVar.mo10687b(i, Float.isNaN(this.f66303j) ? 1.0f : this.f66303j);
                        break;
                    case 8:
                        gvaVar.mo10687b(i, Float.isNaN(this.f66304k) ? 0.0f : this.f66304k);
                        break;
                    case 9:
                        gvaVar.mo10687b(i, Float.isNaN(this.f66305l) ? 0.0f : this.f66305l);
                        break;
                    case 10:
                        gvaVar.mo10687b(i, Float.isNaN(this.f66300g) ? 0.0f : this.f66300g);
                        break;
                    case 11:
                        gvaVar.mo10687b(i, Float.isNaN(this.f66299f) ? 0.0f : this.f66299f);
                        break;
                    case 12:
                        gvaVar.mo10687b(i, Float.isNaN(this.f66292K) ? 0.0f : this.f66292K);
                        break;
                    case 13:
                        gvaVar.mo10687b(i, Float.isNaN(this.f66298e) ? 1.0f : this.f66298e);
                        break;
                    default:
                        if (str.startsWith("CUSTOM")) {
                            String str2 = str.split(",")[1];
                            LinkedHashMap linkedHashMap = this.f66297d;
                            if (linkedHashMap.containsKey(str2)) {
                                cj1 cj1Var = (cj1) linkedHashMap.get(str2);
                                if (gvaVar instanceof dva) {
                                    ((dva) gvaVar).f36276f.append(i, cj1Var);
                                } else {
                                    Log.e("MotionPaths", str + " ViewSpline not a CustomSet frame = " + i + ", value" + cj1Var.m4765b() + gvaVar);
                                }
                            }
                        } else {
                            Log.e("MotionPaths", "UNKNOWN spline ".concat(str));
                        }
                        break;
                }
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m23690c(Rect rect, sj1 sj1Var, int i, int i2) {
        rect.width();
        rect.height();
        nj1 nj1VarM21411h = sj1Var.m21411h(i2);
        qj1 qj1Var = nj1VarM21411h.f52821c;
        pj1 pj1Var = nj1VarM21411h.f52822d;
        int i3 = qj1Var.f57845c;
        this.f66295b = i3;
        int i4 = qj1Var.f57844b;
        this.f66296c = i4;
        this.f66298e = (i4 == 0 || i3 != 0) ? qj1Var.f57846d : 0.0f;
        rj1 rj1Var = nj1VarM21411h.f52824f;
        boolean z = rj1Var.f59399m;
        this.f66299f = rj1Var.f59400n;
        this.f66300g = rj1Var.f59388b;
        this.f66301h = rj1Var.f59389c;
        this.f66294a = rj1Var.f59390d;
        this.f66302i = rj1Var.f59391e;
        this.f66303j = rj1Var.f59392f;
        this.f66304k = rj1Var.f59393g;
        this.f66305l = rj1Var.f59394h;
        this.f66289H = rj1Var.f59396j;
        this.f66290I = rj1Var.f59397k;
        this.f66291J = rj1Var.f59398l;
        fo2.m11964d(pj1Var.f56300d);
        this.f66292K = pj1Var.f56304h;
        this.f66293L = nj1VarM21411h.f52821c.f57847e;
        for (String str : nj1VarM21411h.f52825g.keySet()) {
            cj1 cj1Var = (cj1) nj1VarM21411h.f52825g.get(str);
            int iOrdinal = cj1Var.f10161c.ordinal();
            if (iOrdinal != 4 && iOrdinal != 5 && iOrdinal != 7) {
                this.f66297d.put(str, cj1Var);
            }
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return;
                    }
                }
            }
            float f = this.f66300g + 90.0f;
            this.f66300g = f;
            if (f > 180.0f) {
                this.f66300g = f - 360.0f;
                return;
            }
            return;
        }
        this.f66300g -= 90.0f;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        ((w26) obj).getClass();
        return Float.compare(0.0f, 0.0f);
    }
}
