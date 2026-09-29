package p000;

import android.view.View;
import java.time.DateTimeException;
import kotlinx.datetime.DateTimeArithmeticException;
import kotlinx.datetime.LocalDate;

/* JADX INFO: loaded from: classes2.dex */
public abstract class dq7 {

    /* JADX INFO: renamed from: a */
    public static final float[][] f36030a = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};

    /* JADX INFO: renamed from: b */
    public static final float[][] f36031b = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};

    /* JADX INFO: renamed from: c */
    public static final float[] f36032c = {95.047f, 100.0f, 108.883f};

    /* JADX INFO: renamed from: d */
    public static final float[][] f36033d = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};

    /* JADX INFO: renamed from: a */
    public static final cq7 m10584a(nt2 nt2Var, View view, View view2) {
        if (lp1.f49971a.contains(dq7.class)) {
            return null;
        }
        try {
            return new cq7(nt2Var, view, view2);
        } catch (Throwable th) {
            lp1.m16420a(dq7.class, th);
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static int m10585b(float f) {
        if (f < 1.0f) {
            return -16777216;
        }
        if (f > 99.0f) {
            return -1;
        }
        float f2 = (f + 16.0f) / 116.0f;
        float f3 = f > 8.0f ? f2 * f2 * f2 : f / 903.2963f;
        float f4 = f2 * f2 * f2;
        boolean z = f4 > 0.008856452f;
        float f5 = z ? f4 : ((f2 * 116.0f) - 16.0f) / 903.2963f;
        if (!z) {
            f4 = ((f2 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = f36032c;
        return ya1.m25009b(f5 * fArr[0], f3 * fArr[1], f4 * fArr[2]);
    }

    /* JADX INFO: renamed from: c */
    public static float m10586c(int i) {
        float f = i / 255.0f;
        return (f <= 0.04045f ? f / 12.92f : (float) Math.pow((f + 0.055f) / 1.055f, 2.4000000953674316d)) * 100.0f;
    }

    /* JADX INFO: renamed from: d */
    public static final LocalDate m10587d(LocalDate localDate, c12 c12Var) throws Exception {
        int i = c12Var.f9306b;
        if (i == Integer.MIN_VALUE || ((int) (c12Var.mo4278f() % 12)) == Integer.MIN_VALUE) {
            int iMo4278f = (int) (c12Var.mo4278f() / 12);
            r22.Companion.getClass();
            o22 o22Var = r22.f58516c;
            o22Var.getClass();
            LocalDate localDateM24517a = xh5.m24517a(localDate, -iMo4278f, o22Var);
            int iMo4278f2 = (int) (c12Var.mo4278f() % 12);
            o22 o22Var2 = r22.f58515b;
            o22Var2.getClass();
            LocalDate localDateM24517a2 = xh5.m24517a(localDateM24517a, -iMo4278f2, o22Var2);
            m22 m22Var = r22.f58514a;
            m22Var.getClass();
            return xh5.m24517a(localDateM24517a2, -i, m22Var);
        }
        int i2 = -i;
        c12 c12Var2 = new c12(-((int) (c12Var.mo4278f() / 12)), -((int) (c12Var.mo4278f() % 12)), i2);
        int i3 = xh5.f68208c;
        java.time.LocalDate localDate2 = localDate.f48188a;
        try {
            long j = c12Var2.f9305a;
            java.time.LocalDate localDatePlusMonths = j != 0 ? localDate2.plusMonths(j) : localDate2;
            if (i2 != 0) {
                localDatePlusMonths = localDatePlusMonths.plusDays(i2);
            }
            return new LocalDate(localDatePlusMonths);
        } catch (DateTimeException unused) {
            throw new DateTimeArithmeticException("The result of adding " + localDate2 + " to " + localDate + " is out of LocalDate range.");
        }
    }

    /* JADX INFO: renamed from: e */
    public static float m10588e() {
        return ((float) Math.pow(0.5689655172413793d, 3.0d)) * 100.0f;
    }
}
