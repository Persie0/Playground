package p128g2;

import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import androidx.constraintlayout.widget.C0762b;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.datastore.preferences.PreferencesProto$Value;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import p038c2.C1660c;
import p107f2.AbstractC5465d;

/* JADX INFO: renamed from: g2.l */
/* JADX INFO: loaded from: classes.dex */
public final class C5674l implements Comparable<C5674l> {

    /* JADX INFO: renamed from: c */
    public int f34596c;

    /* JADX INFO: renamed from: a */
    public float f34594a = 1.0f;

    /* JADX INFO: renamed from: b */
    public int f34595b = 0;

    /* JADX INFO: renamed from: d */
    public float f34597d = 0.0f;

    /* JADX INFO: renamed from: e */
    public float f34598e = 0.0f;

    /* JADX INFO: renamed from: f */
    public float f34599f = 0.0f;

    /* JADX INFO: renamed from: g */
    public float f34600g = 0.0f;

    /* JADX INFO: renamed from: h */
    public float f34601h = 1.0f;

    /* JADX INFO: renamed from: i */
    public float f34602i = 1.0f;

    /* JADX INFO: renamed from: j */
    public float f34603j = Float.NaN;

    /* JADX INFO: renamed from: k */
    public float f34604k = Float.NaN;

    /* JADX INFO: renamed from: l */
    public float f34605l = 0.0f;

    /* JADX INFO: renamed from: H */
    public float f34589H = 0.0f;

    /* JADX INFO: renamed from: I */
    public float f34590I = 0.0f;

    /* JADX INFO: renamed from: J */
    public float f34591J = Float.NaN;

    /* JADX INFO: renamed from: K */
    public float f34592K = Float.NaN;

    /* JADX INFO: renamed from: L */
    public final LinkedHashMap<String, ConstraintAttribute> f34593L = new LinkedHashMap<>();

    /* JADX INFO: renamed from: g */
    public static boolean m12035g(float f3, float f10) {
        if (!Float.isNaN(f3) && !Float.isNaN(f10)) {
            return Math.abs(f3 - f10) > 1.0E-6f;
        }
        return Float.isNaN(f3) != Float.isNaN(f10);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:64:0x0104  */
    /* JADX INFO: renamed from: a */
    public final void m12036a(HashMap<String, AbstractC5465d> map, int i10) {
        byte b10;
        for (String str : map.keySet()) {
            AbstractC5465d abstractC5465d = map.get(str);
            str.getClass();
            switch (str) {
                case "rotationX":
                    b10 = 0;
                    break;
                case "rotationY":
                    b10 = 1;
                    break;
                case "translationX":
                    b10 = 2;
                    break;
                case "translationY":
                    b10 = 3;
                    break;
                case "translationZ":
                    b10 = 4;
                    break;
                case "progress":
                    b10 = 5;
                    break;
                case "scaleX":
                    b10 = 6;
                    break;
                case "scaleY":
                    b10 = 7;
                    break;
                case "transformPivotX":
                    b10 = 8;
                    break;
                case "transformPivotY":
                    b10 = 9;
                    break;
                case "rotation":
                    b10 = 10;
                    break;
                case "elevation":
                    b10 = 11;
                    break;
                case "transitionPathRotate":
                    b10 = 12;
                    break;
                case "alpha":
                    b10 = 13;
                    break;
                default:
                    b10 = -1;
                    break;
            }
            float f3 = 0.0f;
            switch (b10) {
                case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                    abstractC5465d.mo5397b(i10, Float.isNaN(this.f34599f) ? 0.0f : this.f34599f);
                    break;
                case 1:
                    abstractC5465d.mo5397b(i10, Float.isNaN(this.f34600g) ? 0.0f : this.f34600g);
                    break;
                case 2:
                    abstractC5465d.mo5397b(i10, Float.isNaN(this.f34605l) ? 0.0f : this.f34605l);
                    break;
                case 3:
                    if (!Float.isNaN(this.f34589H)) {
                        f3 = this.f34589H;
                    }
                    abstractC5465d.mo5397b(i10, f3);
                    break;
                case 4:
                    if (!Float.isNaN(this.f34590I)) {
                        f3 = this.f34590I;
                    }
                    abstractC5465d.mo5397b(i10, f3);
                    break;
                case 5:
                    if (!Float.isNaN(this.f34592K)) {
                        f3 = this.f34592K;
                    }
                    abstractC5465d.mo5397b(i10, f3);
                    break;
                case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                    abstractC5465d.mo5397b(i10, Float.isNaN(this.f34601h) ? 1.0f : this.f34601h);
                    break;
                case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                    abstractC5465d.mo5397b(i10, Float.isNaN(this.f34602i) ? 1.0f : this.f34602i);
                    break;
                case 8:
                    if (!Float.isNaN(this.f34603j)) {
                        f3 = this.f34603j;
                    }
                    abstractC5465d.mo5397b(i10, f3);
                    break;
                case 9:
                    if (!Float.isNaN(this.f34604k)) {
                        f3 = this.f34604k;
                    }
                    abstractC5465d.mo5397b(i10, f3);
                    break;
                case 10:
                    abstractC5465d.mo5397b(i10, Float.isNaN(this.f34598e) ? 0.0f : this.f34598e);
                    break;
                case 11:
                    abstractC5465d.mo5397b(i10, Float.isNaN(this.f34597d) ? 0.0f : this.f34597d);
                    break;
                case 12:
                    abstractC5465d.mo5397b(i10, Float.isNaN(this.f34591J) ? 0.0f : this.f34591J);
                    break;
                case 13:
                    abstractC5465d.mo5397b(i10, Float.isNaN(this.f34594a) ? 1.0f : this.f34594a);
                    break;
                default:
                    if (str.startsWith("CUSTOM")) {
                        String str2 = str.split(",")[1];
                        LinkedHashMap<String, ConstraintAttribute> linkedHashMap = this.f34593L;
                        if (linkedHashMap.containsKey(str2)) {
                            ConstraintAttribute constraintAttribute = linkedHashMap.get(str2);
                            if (abstractC5465d instanceof AbstractC5465d.b) {
                                ((AbstractC5465d.b) abstractC5465d).f34038f.append(i10, constraintAttribute);
                            } else {
                                Log.e("MotionPaths", str + " ViewSpline not a CustomSet frame = " + i10 + ", value" + constraintAttribute.m2858a() + abstractC5465d);
                            }
                        }
                    } else {
                        Log.e("MotionPaths", "UNKNOWN spline ".concat(str));
                    }
                    break;
            }
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(C5674l c5674l) {
        c5674l.getClass();
        return Float.compare(0.0f, 0.0f);
    }

    /* JADX INFO: renamed from: f */
    public final void m12037f(View view) {
        this.f34596c = view.getVisibility();
        this.f34594a = view.getVisibility() != 0 ? 0.0f : view.getAlpha();
        this.f34597d = view.getElevation();
        this.f34598e = view.getRotation();
        this.f34599f = view.getRotationX();
        this.f34600g = view.getRotationY();
        this.f34601h = view.getScaleX();
        this.f34602i = view.getScaleY();
        this.f34603j = view.getPivotX();
        this.f34604k = view.getPivotY();
        this.f34605l = view.getTranslationX();
        this.f34589H = view.getTranslationY();
        this.f34590I = view.getTranslationZ();
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00de  */
    /* JADX INFO: renamed from: i */
    public final void m12038i(Rect rect, C0762b c0762b, int i10, int i11) {
        rect.width();
        rect.height();
        C0762b.a aVarM2895i = c0762b.m2895i(i11);
        C0762b.d dVar = aVarM2895i.f5385c;
        int i12 = dVar.f5488c;
        this.f34595b = i12;
        int i13 = dVar.f5487b;
        this.f34596c = i13;
        this.f34594a = (i13 == 0 || i12 != 0) ? dVar.f5489d : 0.0f;
        C0762b.e eVar = aVarM2895i.f5388f;
        boolean z10 = eVar.f5504m;
        this.f34597d = eVar.f5505n;
        this.f34598e = eVar.f5493b;
        this.f34599f = eVar.f5494c;
        this.f34600g = eVar.f5495d;
        this.f34601h = eVar.f5496e;
        this.f34602i = eVar.f5497f;
        this.f34603j = eVar.f5498g;
        this.f34604k = eVar.f5499h;
        this.f34605l = eVar.f5501j;
        this.f34589H = eVar.f5502k;
        this.f34590I = eVar.f5503l;
        C0762b.c cVar = aVarM2895i.f5386d;
        C1660c.m5383c(cVar.f5476d);
        this.f34591J = cVar.f5480h;
        this.f34592K = aVarM2895i.f5385c.f5490e;
        Iterator<String> it = aVarM2895i.f5389g.keySet().iterator();
        while (true) {
            boolean z11 = true;
            if (!it.hasNext()) {
                break;
            }
            String next = it.next();
            ConstraintAttribute constraintAttribute = aVarM2895i.f5389g.get(next);
            constraintAttribute.getClass();
            int i14 = ConstraintAttribute.C0757a.f5269a[constraintAttribute.f5263c.ordinal()];
            if (i14 == 1 || i14 == 2 || i14 == 3) {
                z11 = false;
            }
            if (z11) {
                this.f34593L.put(next, constraintAttribute);
            }
        }
        if (i10 == 1) {
            this.f34598e -= 90.0f;
        } else {
            if (i10 != 2) {
                if (i10 == 3) {
                    this.f34598e -= 90.0f;
                } else if (i10 != 4) {
                    return;
                }
            }
            float f3 = this.f34598e + 90.0f;
            this.f34598e = f3;
            if (f3 > 180.0f) {
                this.f34598e = f3 - 360.0f;
            }
        }
    }
}
