package p000;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.PathInterpolator;
import com.airbnb.lottie.AsyncUpdates;
import com.airbnb.lottie.parser.moshi.AbstractC0875a;
import com.airbnb.lottie.parser.moshi.JsonReader$Token;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public abstract class mj4 {

    /* JADX INFO: renamed from: b */
    public static pe9 f51394b;

    /* JADX INFO: renamed from: a */
    public static final LinearInterpolator f51393a = new LinearInterpolator();

    /* JADX INFO: renamed from: c */
    public static final p33 f51395c = p33.m18864S("t", "s", "e", "o", "i", "h", "to", "ti");

    /* JADX INFO: renamed from: d */
    public static final p33 f51396d = p33.m18864S("x", "y");

    /* JADX INFO: renamed from: a */
    public static Interpolator m16855a(PointF pointF, PointF pointF2) {
        WeakReference weakReference;
        Interpolator pathInterpolator;
        pointF.x = f06.m11421b(pointF.x, -1.0f, 1.0f);
        pointF.y = f06.m11421b(pointF.y, -100.0f, 100.0f);
        pointF2.x = f06.m11421b(pointF2.x, -1.0f, 1.0f);
        float fM11421b = f06.m11421b(pointF2.y, -100.0f, 100.0f);
        pointF2.y = fM11421b;
        float f = pointF.x;
        float f2 = pointF.y;
        float f3 = pointF2.x;
        Matrix matrix = fna.f39347a;
        int i = f != 0.0f ? (int) (527.0f * f) : 17;
        if (f2 != 0.0f) {
            i = (int) (i * 31 * f2);
        }
        if (f3 != 0.0f) {
            i = (int) (i * 31 * f3);
        }
        if (fM11421b != 0.0f) {
            i = (int) (i * 31 * fM11421b);
        }
        AsyncUpdates asyncUpdates = wk4.f66962a;
        synchronized (mj4.class) {
            if (f51394b == null) {
                f51394b = new pe9(0);
            }
            weakReference = (WeakReference) f51394b.m19078b(i);
        }
        Interpolator interpolator = weakReference != null ? (Interpolator) weakReference.get() : null;
        if (weakReference != null && interpolator != null) {
            return interpolator;
        }
        try {
            pathInterpolator = new PathInterpolator(pointF.x, pointF.y, pointF2.x, pointF2.y);
        } catch (IllegalArgumentException e) {
            pathInterpolator = "The Path cannot loop back on itself.".equals(e.getMessage()) ? new PathInterpolator(Math.min(pointF.x, 1.0f), pointF.y, Math.max(pointF2.x, 0.0f), pointF2.y) : new LinearInterpolator();
        }
        AsyncUpdates asyncUpdates2 = wk4.f66962a;
        try {
            WeakReference weakReference2 = new WeakReference(pathInterpolator);
            synchronized (mj4.class) {
                f51394b.m19080d(i, weakReference2);
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
        }
        return pathInterpolator;
    }

    /* JADX WARN: Code duplicated, block: B:96:0x0227  */
    /* JADX INFO: renamed from: b */
    public static kj4 m16856b(AbstractC0875a abstractC0875a, gl5 gl5Var, float f, coa coaVar, boolean z, boolean z2) {
        Object obj;
        Interpolator interpolatorM16855a;
        Interpolator interpolatorM16855a2;
        Interpolator interpolatorM16855a3;
        Object obj2;
        kj4 kj4Var;
        p33 p33Var;
        LinearInterpolator linearInterpolator;
        p33 p33Var2;
        PointF pointF;
        float f2;
        p33 p33Var3 = f51395c;
        LinearInterpolator linearInterpolator2 = f51393a;
        if (!z || !z2) {
            p33 p33Var4 = p33Var3;
            if (!z) {
                return new kj4(coaVar.mo87g(abstractC0875a, f));
            }
            abstractC0875a.mo5038b();
            PointF pointFM17978b = null;
            PointF pointFM17978b2 = null;
            PointF pointFM17978b3 = null;
            PointF pointFM17978b4 = null;
            boolean z3 = false;
            Object objMo87g = null;
            float fMo5044r = 0.0f;
            Object objMo87g2 = null;
            while (abstractC0875a.mo5042p()) {
                p33Var4 = p33Var4;
                switch (abstractC0875a.mo5033J(p33Var4)) {
                    case 0:
                        fMo5044r = (float) abstractC0875a.mo5044r();
                        continue;
                    case 1:
                        objMo87g = coaVar.mo87g(abstractC0875a, f);
                        break;
                    case 2:
                        objMo87g2 = coaVar.mo87g(abstractC0875a, f);
                        break;
                    case 3:
                        pointFM17978b4 = og4.m17978b(abstractC0875a, 1.0f);
                        break;
                    case 4:
                        pointFM17978b = og4.m17978b(abstractC0875a, 1.0f);
                        break;
                    case 5:
                        z3 = abstractC0875a.mo5045u() == 1;
                        break;
                    case 6:
                        pointFM17978b2 = og4.m17978b(abstractC0875a, f);
                        break;
                    case 7:
                        pointFM17978b3 = og4.m17978b(abstractC0875a, f);
                        break;
                    default:
                        abstractC0875a.mo5035R();
                        break;
                }
            }
            abstractC0875a.mo5040e();
            if (!z3) {
                if (pointFM17978b4 == null || pointFM17978b == null) {
                    obj = objMo87g2;
                } else {
                    interpolatorM16855a = m16855a(pointFM17978b4, pointFM17978b);
                    obj = objMo87g2;
                }
                kj4 kj4Var2 = new kj4(gl5Var, objMo87g, obj, interpolatorM16855a, fMo5044r, (Float) null);
                kj4Var2.f47391o = pointFM17978b2;
                kj4Var2.f47392p = pointFM17978b3;
                return kj4Var2;
            }
            obj = objMo87g;
            interpolatorM16855a = linearInterpolator2;
            kj4 kj4Var3 = new kj4(gl5Var, objMo87g, obj, interpolatorM16855a, fMo5044r, (Float) null);
            kj4Var3.f47391o = pointFM17978b2;
            kj4Var3.f47392p = pointFM17978b3;
            return kj4Var3;
        }
        abstractC0875a.mo5038b();
        PointF pointF2 = null;
        PointF pointFM17978b5 = null;
        PointF pointFM17978b6 = null;
        boolean z4 = false;
        PointF pointFM17978b7 = null;
        PointF pointFM17978b8 = null;
        PointF pointF3 = null;
        Object objMo87g3 = null;
        PointF pointF4 = null;
        PointF pointF5 = null;
        float fMo5044r2 = 0.0f;
        Object objMo87g4 = null;
        while (abstractC0875a.mo5042p()) {
            int iMo5033J = abstractC0875a.mo5033J(p33Var3);
            p33 p33Var5 = f51396d;
            switch (iMo5033J) {
                case 0:
                    p33Var = p33Var3;
                    linearInterpolator = linearInterpolator2;
                    fMo5044r2 = (float) abstractC0875a.mo5044r();
                    break;
                case 1:
                    objMo87g3 = coaVar.mo87g(abstractC0875a, f);
                    continue;
                case 2:
                    objMo87g4 = coaVar.mo87g(abstractC0875a, f);
                    continue;
                case 3:
                    p33 p33Var6 = p33Var3;
                    PointF pointF6 = pointFM17978b5;
                    LinearInterpolator linearInterpolator3 = linearInterpolator2;
                    boolean z5 = z4;
                    Object obj3 = objMo87g3;
                    if (abstractC0875a.mo5047z() == JsonReader$Token.BEGIN_OBJECT) {
                        abstractC0875a.mo5038b();
                        float fMo5044r3 = 0.0f;
                        float fMo5044r4 = 0.0f;
                        float fMo5044r5 = 0.0f;
                        float fMo5044r6 = 0.0f;
                        while (abstractC0875a.mo5042p()) {
                            int iMo5033J2 = abstractC0875a.mo5033J(p33Var5);
                            if (iMo5033J2 == 0) {
                                JsonReader$Token jsonReader$TokenMo5047z = abstractC0875a.mo5047z();
                                JsonReader$Token jsonReader$Token = JsonReader$Token.NUMBER;
                                if (jsonReader$TokenMo5047z == jsonReader$Token) {
                                    fMo5044r5 = (float) abstractC0875a.mo5044r();
                                    fMo5044r3 = fMo5044r5;
                                } else {
                                    abstractC0875a.mo5037a();
                                    fMo5044r3 = (float) abstractC0875a.mo5044r();
                                    fMo5044r5 = abstractC0875a.mo5047z() == jsonReader$Token ? (float) abstractC0875a.mo5044r() : fMo5044r3;
                                    abstractC0875a.mo5039c();
                                }
                            } else if (iMo5033J2 != 1) {
                                abstractC0875a.mo5035R();
                            } else {
                                JsonReader$Token jsonReader$TokenMo5047z2 = abstractC0875a.mo5047z();
                                JsonReader$Token jsonReader$Token2 = JsonReader$Token.NUMBER;
                                if (jsonReader$TokenMo5047z2 == jsonReader$Token2) {
                                    fMo5044r6 = (float) abstractC0875a.mo5044r();
                                    fMo5044r4 = fMo5044r6;
                                } else {
                                    abstractC0875a.mo5037a();
                                    fMo5044r4 = (float) abstractC0875a.mo5044r();
                                    fMo5044r6 = abstractC0875a.mo5047z() == jsonReader$Token2 ? (float) abstractC0875a.mo5044r() : fMo5044r4;
                                    abstractC0875a.mo5039c();
                                }
                            }
                        }
                        pointF3 = new PointF(fMo5044r3, fMo5044r4);
                        pointF4 = new PointF(fMo5044r5, fMo5044r6);
                        abstractC0875a.mo5040e();
                    } else {
                        pointFM17978b7 = og4.m17978b(abstractC0875a, f);
                    }
                    z4 = z5;
                    objMo87g3 = obj3;
                    linearInterpolator2 = linearInterpolator3;
                    p33Var3 = p33Var6;
                    pointFM17978b5 = pointF6;
                    continue;
                case 4:
                    linearInterpolator = linearInterpolator2;
                    boolean z6 = z4;
                    if (abstractC0875a.mo5047z() == JsonReader$Token.BEGIN_OBJECT) {
                        abstractC0875a.mo5038b();
                        float f3 = 0.0f;
                        float f4 = 0.0f;
                        float fMo5044r7 = 0.0f;
                        float fMo5044r8 = 0.0f;
                        while (abstractC0875a.mo5042p()) {
                            objMo87g3 = objMo87g3;
                            int iMo5033J3 = abstractC0875a.mo5033J(p33Var5);
                            if (iMo5033J3 != 0) {
                                p33Var2 = p33Var3;
                                if (iMo5033J3 != 1) {
                                    abstractC0875a.mo5035R();
                                    objMo87g3 = objMo87g3;
                                    p33Var3 = p33Var2;
                                } else {
                                    JsonReader$Token jsonReader$TokenMo5047z3 = abstractC0875a.mo5047z();
                                    JsonReader$Token jsonReader$Token3 = JsonReader$Token.NUMBER;
                                    if (jsonReader$TokenMo5047z3 == jsonReader$Token3) {
                                        pointF = pointFM17978b5;
                                        fMo5044r8 = (float) abstractC0875a.mo5044r();
                                        pointFM17978b6 = pointFM17978b6;
                                        f4 = fMo5044r8;
                                    } else {
                                        pointF = pointFM17978b5;
                                        PointF pointF7 = pointFM17978b6;
                                        abstractC0875a.mo5037a();
                                        float fMo5044r9 = (float) abstractC0875a.mo5044r();
                                        if (abstractC0875a.mo5047z() == jsonReader$Token3) {
                                            f4 = fMo5044r9;
                                            fMo5044r8 = (float) abstractC0875a.mo5044r();
                                        } else {
                                            f4 = fMo5044r9;
                                            fMo5044r8 = f4;
                                        }
                                        abstractC0875a.mo5039c();
                                        pointFM17978b6 = pointF7;
                                    }
                                }
                            } else {
                                p33Var2 = p33Var3;
                                pointF = pointFM17978b5;
                                PointF pointF8 = pointFM17978b6;
                                JsonReader$Token jsonReader$TokenMo5047z4 = abstractC0875a.mo5047z();
                                JsonReader$Token jsonReader$Token4 = JsonReader$Token.NUMBER;
                                if (jsonReader$TokenMo5047z4 == jsonReader$Token4) {
                                    fMo5044r7 = (float) abstractC0875a.mo5044r();
                                    pointFM17978b6 = pointF8;
                                    f3 = fMo5044r7;
                                } else {
                                    abstractC0875a.mo5037a();
                                    pointFM17978b6 = pointF8;
                                    float fMo5044r10 = (float) abstractC0875a.mo5044r();
                                    if (abstractC0875a.mo5047z() == jsonReader$Token4) {
                                        f2 = fMo5044r10;
                                        fMo5044r7 = (float) abstractC0875a.mo5044r();
                                    } else {
                                        f2 = fMo5044r10;
                                        fMo5044r7 = f2;
                                    }
                                    abstractC0875a.mo5039c();
                                    f3 = f2;
                                }
                            }
                            p33Var3 = p33Var2;
                            pointFM17978b5 = pointF;
                        }
                        p33Var = p33Var3;
                        PointF pointF9 = new PointF(f3, f4);
                        pointF2 = new PointF(fMo5044r7, fMo5044r8);
                        abstractC0875a.mo5040e();
                        z4 = z6;
                        pointF5 = pointF9;
                    } else {
                        pointFM17978b8 = og4.m17978b(abstractC0875a, f);
                        z4 = z6;
                        linearInterpolator2 = linearInterpolator;
                    }
                    break;
                case 5:
                    if (abstractC0875a.mo5045u() == 1) {
                        z4 = true;
                    } else {
                        z4 = false;
                        continue;
                    }
                    break;
                case 6:
                    pointFM17978b5 = og4.m17978b(abstractC0875a, f);
                    continue;
                case 7:
                    pointFM17978b6 = og4.m17978b(abstractC0875a, f);
                    continue;
                default:
                    abstractC0875a.mo5035R();
                    continue;
            }
            linearInterpolator2 = linearInterpolator;
            p33Var3 = p33Var;
        }
        PointF pointF10 = pointFM17978b5;
        Interpolator interpolatorM16855a4 = linearInterpolator2;
        boolean z7 = z4;
        Object obj4 = objMo87g3;
        abstractC0875a.mo5040e();
        if (z7) {
            obj2 = obj4;
        } else {
            if (pointFM17978b7 == null || pointFM17978b8 == null) {
                if (pointF3 != null && pointF4 != null && pointF5 != null && pointF2 != null) {
                    interpolatorM16855a2 = m16855a(pointF3, pointF5);
                    interpolatorM16855a3 = m16855a(pointF4, pointF2);
                    obj2 = objMo87g4;
                    interpolatorM16855a4 = null;
                }
                if (interpolatorM16855a2 != null || interpolatorM16855a3 == null) {
                    kj4Var = new kj4(gl5Var, obj4, obj2, interpolatorM16855a4, fMo5044r2, (Float) null);
                } else {
                    kj4Var = new kj4(gl5Var, obj4, obj2, interpolatorM16855a2, interpolatorM16855a3, fMo5044r2);
                }
                kj4Var.f47391o = pointF10;
                kj4Var.f47392p = pointFM17978b6;
                return kj4Var;
            }
            interpolatorM16855a4 = m16855a(pointFM17978b7, pointFM17978b8);
            obj2 = objMo87g4;
        }
        interpolatorM16855a2 = null;
        interpolatorM16855a3 = null;
        if (interpolatorM16855a2 != null) {
            kj4Var = new kj4(gl5Var, obj4, obj2, interpolatorM16855a4, fMo5044r2, (Float) null);
        } else {
            kj4Var = new kj4(gl5Var, obj4, obj2, interpolatorM16855a4, fMo5044r2, (Float) null);
        }
        kj4Var.f47391o = pointF10;
        kj4Var.f47392p = pointFM17978b6;
        return kj4Var;
    }
}
