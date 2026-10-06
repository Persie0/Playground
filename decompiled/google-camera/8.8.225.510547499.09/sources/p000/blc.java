package p000;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.google.android.apps.camera.brella.mediastore.p007hP.wUzNh;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class blc {

    /* JADX INFO: renamed from: d */
    private static C1118xg f3684d;

    /* JADX INFO: renamed from: c */
    private static final Interpolator f3683c = new LinearInterpolator();

    /* JADX INFO: renamed from: a */
    static final dsx f3681a = dsx.m6674J("t", "s", "e", "o", "i", "h", wUzNh.BltKodjO, "ti");

    /* JADX INFO: renamed from: b */
    static final dsx f3682b = dsx.m6674J("x", "y");

    blc() {
    }

    /* JADX INFO: renamed from: b */
    private static Interpolator m2645b(PointF pointF, PointF pointF2) {
        WeakReference weakReference;
        pointF.x = blz.m2693a(pointF.x, -1.0f, 1.0f);
        pointF.y = blz.m2693a(pointF.y, -100.0f, 100.0f);
        pointF2.x = blz.m2693a(pointF2.x, -1.0f, 1.0f);
        pointF2.y = blz.m2693a(pointF2.y, -100.0f, 100.0f);
        float f = pointF.x;
        float f2 = pointF.y;
        float f3 = pointF2.x;
        float f4 = pointF2.y;
        ThreadLocal threadLocal = bme.f3752a;
        int i = f != 0.0f ? (int) (f * 527.0f) : 17;
        if (f2 != 0.0f) {
            i = (int) (i * 31 * f2);
        }
        if (f3 != 0.0f) {
            i = (int) (i * 31 * f3);
        }
        if (f4 != 0.0f) {
            i = (int) (i * 31 * f4);
        }
        synchronized (blc.class) {
            if (f3684d == null) {
                f3684d = new C1118xg();
            }
            weakReference = (WeakReference) C1119xh.m19566a(f3684d, i);
        }
        Interpolator interpolatorM657c = weakReference != null ? (Interpolator) weakReference.get() : null;
        if (weakReference == null || interpolatorM657c == null) {
            try {
                interpolatorM657c = ahd.m657c(pointF.x, pointF.y, pointF2.x, pointF2.y);
            } catch (IllegalArgumentException e) {
                interpolatorM657c = "The Path cannot loop back on itself.".equals(e.getMessage()) ? ahd.m657c(Math.min(pointF.x, 1.0f), pointF.y, Math.max(pointF2.x, 0.0f), pointF2.y) : new LinearInterpolator();
            }
            try {
                WeakReference weakReference2 = new WeakReference(interpolatorM657c);
                synchronized (blc.class) {
                    f3684d.m19565d(i, weakReference2);
                }
            } catch (ArrayIndexOutOfBoundsException e2) {
            }
        }
        return interpolatorM657c;
    }

    /* JADX INFO: renamed from: a */
    static bmf m2644a(blt bltVar, bgm bgmVar, float f, blq blqVar, boolean z, boolean z2) {
        Interpolator interpolatorM2645b;
        Object obj;
        Interpolator interpolatorM2645b2;
        Object obj2;
        Interpolator interpolatorM2645b3;
        Interpolator interpolatorM2645b4;
        float f2;
        float fMo2650a;
        if (!z) {
            return new bmf(blqVar.mo2637a(bltVar, f));
        }
        if (!z2) {
            bltVar.mo2657i();
            PointF pointFM2642c = null;
            PointF pointFM2642c2 = null;
            PointF pointFM2642c3 = null;
            boolean z3 = false;
            Object objMo2637a = null;
            float fMo2650a2 = 0.0f;
            PointF pointFM2642c4 = null;
            Object objMo2637a2 = null;
            while (bltVar.mo2663o()) {
                switch (bltVar.mo2666r(f3681a)) {
                    case 0:
                        fMo2650a2 = (float) bltVar.mo2650a();
                        break;
                    case 1:
                        objMo2637a = blqVar.mo2637a(bltVar, f);
                        break;
                    case 2:
                        objMo2637a2 = blqVar.mo2637a(bltVar, f);
                        break;
                    case 3:
                        pointFM2642c = blb.m2642c(bltVar, 1.0f);
                        break;
                    case 4:
                        pointFM2642c2 = blb.m2642c(bltVar, 1.0f);
                        break;
                    case 5:
                        z3 = bltVar.mo2651b() == 1;
                        break;
                    case 6:
                        pointFM2642c3 = blb.m2642c(bltVar, f);
                        break;
                    case 7:
                        pointFM2642c4 = blb.m2642c(bltVar, f);
                        break;
                    default:
                        bltVar.mo2662n();
                        break;
                }
            }
            bltVar.mo2659k();
            if (z3) {
                interpolatorM2645b = f3683c;
                obj = objMo2637a;
            } else {
                interpolatorM2645b = (pointFM2642c == null || pointFM2642c2 == null) ? f3683c : m2645b(pointFM2642c, pointFM2642c2);
                obj = objMo2637a2;
            }
            bmf bmfVar = new bmf(bgmVar, objMo2637a, obj, interpolatorM2645b, fMo2650a2, (Float) null);
            bmfVar.f3770m = pointFM2642c3;
            bmfVar.f3771n = pointFM2642c4;
            return bmfVar;
        }
        bltVar.mo2657i();
        PointF pointFM2642c5 = null;
        PointF pointFM2642c6 = null;
        boolean z4 = false;
        PointF pointFM2642c7 = null;
        PointF pointFM2642c8 = null;
        PointF pointF = null;
        Object objMo2637a3 = null;
        PointF pointF2 = null;
        PointF pointF3 = null;
        PointF pointF4 = null;
        float fMo2650a3 = 0.0f;
        Object objMo2637a4 = null;
        while (bltVar.mo2663o()) {
            switch (bltVar.mo2666r(f3681a)) {
                case 0:
                    fMo2650a3 = (float) bltVar.mo2650a();
                    pointFM2642c5 = pointFM2642c5;
                    break;
                case 1:
                    objMo2637a3 = blqVar.mo2637a(bltVar, f);
                    break;
                case 2:
                    objMo2637a4 = blqVar.mo2637a(bltVar, f);
                    break;
                case 3:
                    PointF pointF5 = pointFM2642c6;
                    PointF pointF6 = pointFM2642c5;
                    if (bltVar.mo2665q() != 3) {
                        pointFM2642c7 = blb.m2642c(bltVar, f);
                        pointFM2642c5 = pointF6;
                        pointFM2642c6 = pointF5;
                    } else {
                        bltVar.mo2657i();
                        float fMo2650a4 = 0.0f;
                        float f3 = 0.0f;
                        float fMo2650a5 = 0.0f;
                        float fMo2650a6 = 0.0f;
                        while (bltVar.mo2663o()) {
                            switch (bltVar.mo2666r(f3682b)) {
                                case 0:
                                    PointF pointF7 = pointF6;
                                    if (bltVar.mo2665q() != 7) {
                                        bltVar.mo2656h();
                                        fMo2650a4 = (float) bltVar.mo2650a();
                                        fMo2650a5 = bltVar.mo2665q() == 7 ? (float) bltVar.mo2650a() : fMo2650a4;
                                        bltVar.mo2658j();
                                        pointF6 = pointF7;
                                    } else {
                                        fMo2650a5 = (float) bltVar.mo2650a();
                                        pointF6 = pointF7;
                                        fMo2650a4 = fMo2650a5;
                                    }
                                    break;
                                case 1:
                                    if (bltVar.mo2665q() != 7) {
                                        PointF pointF8 = pointF6;
                                        bltVar.mo2656h();
                                        float fMo2650a7 = (float) bltVar.mo2650a();
                                        if (bltVar.mo2665q() == 7) {
                                            fMo2650a7 = (float) bltVar.mo2650a();
                                        }
                                        bltVar.mo2658j();
                                        pointF6 = pointF8;
                                        fMo2650a6 = fMo2650a7;
                                        f3 = fMo2650a7;
                                    } else {
                                        fMo2650a6 = (float) bltVar.mo2650a();
                                        pointF6 = pointF6;
                                        f3 = fMo2650a6;
                                    }
                                    break;
                                default:
                                    bltVar.mo2662n();
                                    break;
                            }
                        }
                        PointF pointF9 = pointF6;
                        PointF pointF10 = new PointF(fMo2650a4, f3);
                        pointF2 = new PointF(fMo2650a5, fMo2650a6);
                        bltVar.mo2659k();
                        pointFM2642c5 = pointF9;
                        pointF = pointF10;
                        pointFM2642c6 = pointF5;
                    }
                    break;
                case 4:
                    if (bltVar.mo2665q() != 3) {
                        pointFM2642c8 = blb.m2642c(bltVar, f);
                        pointFM2642c6 = pointFM2642c6;
                    } else {
                        bltVar.mo2657i();
                        float f4 = 0.0f;
                        float f5 = 0.0f;
                        float fMo2650a8 = 0.0f;
                        float fMo2650a9 = 0.0f;
                        while (bltVar.mo2663o()) {
                            pointFM2642c6 = pointFM2642c6;
                            switch (bltVar.mo2666r(f3682b)) {
                                case 0:
                                    if (bltVar.mo2665q() != 7) {
                                        PointF pointF11 = pointFM2642c5;
                                        bltVar.mo2656h();
                                        float fMo2650a10 = (float) bltVar.mo2650a();
                                        if (bltVar.mo2665q() == 7) {
                                            fMo2650a10 = (float) bltVar.mo2650a();
                                        }
                                        bltVar.mo2658j();
                                        pointFM2642c5 = pointF11;
                                        fMo2650a8 = fMo2650a10;
                                        f4 = fMo2650a10;
                                    } else {
                                        fMo2650a8 = (float) bltVar.mo2650a();
                                        pointFM2642c5 = pointFM2642c5;
                                        f4 = fMo2650a8;
                                    }
                                    break;
                                case 1:
                                    if (bltVar.mo2665q() != 7) {
                                        bltVar.mo2656h();
                                        float fMo2650a11 = (float) bltVar.mo2650a();
                                        if (bltVar.mo2665q() == 7) {
                                            f2 = fMo2650a11;
                                            fMo2650a = (float) bltVar.mo2650a();
                                        } else {
                                            f2 = fMo2650a11;
                                            fMo2650a = f2;
                                        }
                                        bltVar.mo2658j();
                                        f5 = f2;
                                        fMo2650a9 = fMo2650a;
                                    } else {
                                        fMo2650a9 = (float) bltVar.mo2650a();
                                        f5 = fMo2650a9;
                                    }
                                    break;
                                default:
                                    bltVar.mo2662n();
                                    break;
                            }
                        }
                        PointF pointF12 = pointFM2642c6;
                        PointF pointF13 = pointFM2642c5;
                        PointF pointF14 = new PointF(f4, f5);
                        PointF pointF15 = new PointF(fMo2650a8, fMo2650a9);
                        bltVar.mo2659k();
                        pointF4 = pointF15;
                        pointF3 = pointF14;
                        pointFM2642c5 = pointF13;
                        pointFM2642c6 = pointF12;
                    }
                    break;
                case 5:
                    z4 = bltVar.mo2651b() == 1;
                    break;
                case 6:
                    pointFM2642c5 = blb.m2642c(bltVar, f);
                    break;
                case 7:
                    pointFM2642c6 = blb.m2642c(bltVar, f);
                    break;
                default:
                    bltVar.mo2662n();
                    break;
            }
        }
        PointF pointF16 = pointFM2642c5;
        PointF pointF17 = pointFM2642c6;
        bltVar.mo2659k();
        if (z4) {
            interpolatorM2645b2 = f3683c;
            obj2 = objMo2637a3;
            interpolatorM2645b3 = null;
            interpolatorM2645b4 = null;
        } else if (pointFM2642c7 != null && pointFM2642c8 != null) {
            interpolatorM2645b2 = m2645b(pointFM2642c7, pointFM2642c8);
            obj2 = objMo2637a4;
            interpolatorM2645b3 = null;
            interpolatorM2645b4 = null;
        } else if (pointF == null || pointF2 == null || pointF3 == null || pointF4 == null) {
            interpolatorM2645b2 = f3683c;
            obj2 = objMo2637a4;
            interpolatorM2645b3 = null;
            interpolatorM2645b4 = null;
        } else {
            interpolatorM2645b3 = m2645b(pointF, pointF3);
            interpolatorM2645b4 = m2645b(pointF2, pointF4);
            obj2 = objMo2637a4;
            interpolatorM2645b2 = null;
        }
        bmf bmfVar2 = interpolatorM2645b3 != null ? new bmf(bgmVar, objMo2637a3, obj2, interpolatorM2645b3, interpolatorM2645b4, fMo2650a3) : new bmf(bgmVar, objMo2637a3, obj2, interpolatorM2645b2, fMo2650a3, (Float) null);
        bmfVar2.f3770m = pointF16;
        bmfVar2.f3771n = pointF17;
        return bmfVar2;
    }
}
