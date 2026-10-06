package p000;

import android.graphics.PointF;
import android.hardware.camera2.CameraCharacteristics;
import com.google.android.apps.camera.p014ui.captureframe.Tjcw.gBCSQzBeB;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kot {
    public kot(kmd kmdVar) {
        ((Integer) kmdVar.mo14560m(CameraCharacteristics.SENSOR_INFO_TIMESTAMP_SOURCE, 0)).intValue();
    }

    /* JADX INFO: renamed from: a */
    public static PointF m14636a(PointF pointF, int i) {
        boolean z = false;
        if (pointF.x >= 0.0f && pointF.x <= 1.0f && pointF.y >= 0.0f && pointF.y <= 1.0f) {
            z = true;
        }
        lku.m15670x(z, "Input coordinates should be in [0, 1].");
        return lme.m15726l(pointF, i);
    }

    /* JADX INFO: renamed from: b */
    public static String m14637b(kor korVar) {
        if (korVar == null) {
            return "-";
        }
        if (korVar instanceof kop) {
            return Long.toString(((kop) korVar).f36706a);
        }
        if (!(korVar instanceof koq)) {
            return "-";
        }
        koq koqVar = (koq) korVar;
        return String.format(Locale.ROOT, "n: %6.6s, min: %12.12s, max: %12.12s, mean: %12.12s, last: %12.12s", Long.toString((long) koqVar.f36707a), m14645k(koqVar.f36708b), m14645k(koqVar.f36709c), m14645k(koqVar.f36710d), m14645k(koqVar.f36711e));
    }

    /* JADX INFO: renamed from: c */
    public static void m14638c(String str, koc[] kocVarArr, koc[] kocVarArr2) {
        if (Arrays.equals(kocVarArr, kocVarArr2)) {
            return;
        }
        throw new IllegalArgumentException(str + gBCSQzBeB.fCx + Arrays.toString(kocVarArr) + " which is different from: " + Arrays.toString(kocVarArr2));
    }

    /* JADX INFO: renamed from: d */
    public static float m14639d(byte[] bArr, int i) {
        return Float.intBitsToFloat(m14640e(bArr, i));
    }

    /* JADX INFO: renamed from: e */
    public static int m14640e(byte[] bArr, int i) {
        int i2 = bArr[i] & 255;
        int i3 = bArr[i + 1] & 255;
        int i4 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (i3 << 8) | i2 | (i4 << 16);
    }

    /* JADX INFO: renamed from: f */
    public static long m14641f(byte[] bArr, int i) {
        return ((long) m14640e(bArr, i + 12)) & 4294967295L;
    }

    /* JADX INFO: renamed from: g */
    public static long m14642g(byte[] bArr, int i) {
        int i2 = i + 16;
        int i3 = bArr[i2] & 255;
        int i4 = bArr[i2 + 1] & 255;
        int i5 = bArr[i2 + 2] & 255;
        int i6 = bArr[i2 + 3] & 255;
        int i7 = bArr[i2 + 4] & 255;
        int i8 = bArr[i2 + 5] & 255;
        return ((long) i3) + (((long) i4) << 8) + (((long) i5) << 16) + (((long) i6) << 24) + (((long) i7) << 32) + (((long) i8) << 40) + (((long) (bArr[i2 + 6] & 255)) << 48) + (((long) (bArr[i2 + 7] & 255)) << 56);
    }

    /* JADX INFO: renamed from: i */
    public static boolean m14643i(kho khoVar, kho khoVar2, kbo kboVar) {
        if (khoVar2 == khoVar || khoVar.f36068d.isEmpty() || khoVar2.f36068d.isEmpty()) {
            return true;
        }
        boolean z = true;
        loop0: for (kfy kfyVar : khoVar2.f36068d) {
            for (kfy kfyVar2 : khoVar.f36068d) {
                if (kfyVar.f35858a.equals(kfyVar2.f35858a) && !kfyVar.f35859b.equals(kfyVar2.f35859b)) {
                    z = false;
                    if (kboVar == null) {
                        break loop0;
                    }
                    kboVar.mo13942d(kfv.m14168E("%s on %s (%s) conflicts with %s (%s)", kfyVar2.m14177a(), khoVar, kfyVar2.f35859b, khoVar2, kfyVar.f35859b));
                }
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: k */
    private static String m14645k(double d) {
        return (d > 9.999999999E9d || d < -9.99999999E8d) ? String.format(Locale.ROOT, "%.6e", Double.valueOf(d)) : String.format(Locale.ROOT, "%.4f", Double.valueOf(d));
    }

    /* JADX INFO: renamed from: h */
    public final synchronized void m14646h() {
    }

    public kot(kfl kflVar) {
        kflVar.mo14139d().mo14555h();
    }
}
