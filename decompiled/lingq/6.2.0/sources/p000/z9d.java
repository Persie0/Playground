package p000;

import com.lingq.feature.imports.R$string;
import com.lingq.feature.imports.data.UserImportSourceType;

/* JADX INFO: loaded from: classes2.dex */
public abstract class z9d {
    /* JADX INFO: renamed from: a */
    public static z9d m25517a(int i, double[] dArr, double[][] dArr2) {
        if (dArr.length == 1) {
            i = 2;
        }
        if (i == 0) {
            return new s16(dArr, dArr2);
        }
        if (i == 2) {
            double d = dArr[0];
            double[] dArr3 = dArr2[0];
            ex1 ex1Var = new ex1();
            ex1Var.f38020a = d;
            ex1Var.f38021b = dArr3;
            return ex1Var;
        }
        uc5 uc5Var = new uc5();
        int length = dArr2[0].length;
        uc5Var.f63716c = new double[length];
        uc5Var.f63714a = dArr;
        uc5Var.f63715b = dArr2;
        if (length > 2) {
            double d2 = 0.0d;
            int i2 = 0;
            while (true) {
                double d3 = d2;
                if (i2 >= dArr.length) {
                    break;
                }
                double d4 = dArr2[i2][0];
                if (i2 > 0) {
                    Math.hypot(d4 - d2, d4 - d3);
                }
                i2++;
                d2 = d4;
            }
        }
        return uc5Var;
    }

    /* JADX INFO: renamed from: g */
    public static final int m25518g(UserImportSourceType userImportSourceType) {
        userImportSourceType.getClass();
        int i = lka.f49781a[userImportSourceType.ordinal()];
        if (i == 1) {
            return R$string.import_by_url;
        }
        if (i == 2) {
            return R$string.import_scan;
        }
        if (i == 3) {
            return R$string.import_text;
        }
        if (i == 4) {
            return R$string.import_file;
        }
        gm5.m12750e();
        return 0;
    }

    /* JADX INFO: renamed from: b */
    public abstract double mo9884b(double d);

    /* JADX INFO: renamed from: c */
    public abstract void mo9885c(double d, double[] dArr);

    /* JADX INFO: renamed from: d */
    public abstract void mo9886d(double d, float[] fArr);

    /* JADX INFO: renamed from: e */
    public abstract void mo9887e(double d, double[] dArr);

    /* JADX INFO: renamed from: f */
    public abstract double[] mo9888f();
}
