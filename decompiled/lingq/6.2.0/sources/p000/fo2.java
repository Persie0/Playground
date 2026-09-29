package p000;

import android.os.Parcel;
import java.lang.reflect.Array;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class fo2 implements a58 {

    /* JADX INFO: renamed from: c */
    public static final fo2 f39361c = new fo2(0);

    /* JADX INFO: renamed from: d */
    public static final String[] f39362d = {"standard", "accelerate", "decelerate", "linear"};

    /* JADX INFO: renamed from: e */
    public static final fo2 f39363e;

    /* JADX INFO: renamed from: f */
    public static final fo2 f39364f;

    /* JADX INFO: renamed from: g */
    public static final fo2 f39365g;

    /* JADX INFO: renamed from: h */
    public static final fo2 f39366h;

    /* JADX INFO: renamed from: i */
    public static final fo2 f39367i;

    /* JADX INFO: renamed from: j */
    public static final fo2 f39368j;

    /* JADX INFO: renamed from: k */
    public static final fo2 f39369k;

    /* JADX INFO: renamed from: l */
    public static final fo2 f39370l;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f39371a;

    /* JADX INFO: renamed from: b */
    public String f39372b;

    static {
        int i = 1;
        f39363e = new fo2("SHA1", i);
        f39364f = new fo2("SHA224", i);
        f39365g = new fo2("SHA256", i);
        f39366h = new fo2("SHA384", i);
        f39367i = new fo2("SHA512", i);
        int i2 = 2;
        f39368j = new fo2("TINK", i2);
        f39369k = new fo2("CRUNCHY", i2);
        f39370l = new fo2("NO_PREFIX", i2);
    }

    public fo2(int i) {
        this.f39371a = i;
        switch (i) {
            case 3:
                break;
            default:
                this.f39372b = "identity";
                break;
        }
    }

    /* JADX INFO: renamed from: d */
    public static fo2 m11964d(String str) {
        if (str == null) {
            return null;
        }
        if (str.startsWith("cubic")) {
            return new eo2(str);
        }
        if (str.startsWith("spline")) {
            si9 si9Var = new si9(0);
            si9Var.f39372b = str;
            double[] dArr = new double[str.length() / 2];
            int iIndexOf = str.indexOf(40) + 1;
            int iIndexOf2 = str.indexOf(44, iIndexOf);
            int i = 0;
            while (iIndexOf2 != -1) {
                dArr[i] = Double.parseDouble(str.substring(iIndexOf, iIndexOf2).trim());
                iIndexOf = iIndexOf2 + 1;
                iIndexOf2 = str.indexOf(44, iIndexOf);
                i++;
            }
            dArr[i] = Double.parseDouble(str.substring(iIndexOf, str.indexOf(41, iIndexOf)).trim());
            double[] dArrCopyOf = Arrays.copyOf(dArr, i + 1);
            int length = (dArrCopyOf.length * 3) - 2;
            int length2 = dArrCopyOf.length - 1;
            double d = 1.0d / ((double) length2);
            double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, length, 1);
            double[] dArr3 = new double[length];
            for (int i2 = 0; i2 < dArrCopyOf.length; i2++) {
                double d2 = dArrCopyOf[i2];
                int i3 = i2 + length2;
                dArr2[i3][0] = d2;
                double d3 = ((double) i2) * d;
                dArr3[i3] = d3;
                if (i2 > 0) {
                    int i4 = (length2 * 2) + i2;
                    dArr2[i4][0] = d2 + 1.0d;
                    dArr3[i4] = d3 + 1.0d;
                    int i5 = i2 - 1;
                    dArr2[i5][0] = (d2 - 1.0d) - d;
                    dArr3[i5] = (d3 - 1.0d) - d;
                }
            }
            s16 s16Var = new s16(dArr3, dArr2);
            System.out.println(" 0 " + s16Var.mo9884b(0.0d));
            System.out.println(" 1 " + s16Var.mo9884b(1.0d));
            si9Var.f60905H = s16Var;
            return si9Var;
        }
        if (str.startsWith("Schlick")) {
            bn8 bn8Var = new bn8(0);
            bn8Var.f39372b = str;
            int iIndexOf3 = str.indexOf(40);
            int iIndexOf4 = str.indexOf(44, iIndexOf3);
            bn8Var.f8725H = Double.parseDouble(str.substring(iIndexOf3 + 1, iIndexOf4).trim());
            int i6 = iIndexOf4 + 1;
            bn8Var.f8726I = Double.parseDouble(str.substring(i6, str.indexOf(44, i6)).trim());
            return bn8Var;
        }
        switch (str) {
            case "accelerate":
                return new eo2("cubic(0.4, 0.05, 0.8, 0.7)");
            case "decelerate":
                return new eo2("cubic(0.0, 0.0, 0.2, 0.95)");
            case "anticipate":
                return new eo2("cubic(0.36, 0, 0.66, -0.56)");
            case "linear":
                return new eo2("cubic(1, 1, 0, 0)");
            case "overshoot":
                return new eo2("cubic(0.34, 1.56, 0.64, 1)");
            case "standard":
                return new eo2("cubic(0.4, 0.0, 0.2, 1)");
            default:
                System.err.println("transitionEasing syntax error syntax:transitionEasing=\"cubic(1.0,0.5,0.0,0.6)\" or " + Arrays.toString(f39362d));
                return f39361c;
        }
    }

    /* JADX INFO: renamed from: a */
    public h40 m11965a() {
        String str = this.f39372b;
        if (str != null) {
            return new h40(str);
        }
        C3386nv.m17633t("Missing required properties: identifier");
        return null;
    }

    @Override // p000.a58
    public void accept(Object obj, Object obj2) {
        int i = ltc.f50124l;
        lrc lrcVar = new lrc((wr9) obj2);
        suc sucVar = (suc) ((yuc) obj).m11611l();
        String str = this.f39372b;
        Parcel parcelM16773J = sucVar.m16773J();
        bqb.m4107d(parcelM16773J, lrcVar);
        parcelM16773J.writeString(str);
        sucVar.m16776M(parcelM16773J, 5);
    }

    /* JADX INFO: renamed from: b */
    public double mo3907b(double d) {
        return d;
    }

    /* JADX INFO: renamed from: c */
    public double mo3908c(double d) {
        return 1.0d;
    }

    /* JADX INFO: renamed from: e */
    public void m11966e(String str) {
        if (str != null) {
            this.f39372b = str;
        } else {
            C3386nv.m17635v("Null identifier");
        }
    }

    public String toString() {
        switch (this.f39371a) {
            case 0:
                return this.f39372b;
            case 1:
                return this.f39372b;
            case 2:
                return this.f39372b;
            default:
                return super.toString();
        }
    }

    public /* synthetic */ fo2(String str, int i) {
        this.f39371a = i;
        this.f39372b = str;
    }
}
