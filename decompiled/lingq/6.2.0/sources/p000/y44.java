package p000;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class y44 {

    /* JADX INFO: renamed from: a */
    public final double f69272a;

    /* JADX INFO: renamed from: b */
    public final double f69273b;

    /* JADX INFO: renamed from: c */
    public final z44 f69274c;

    /* JADX INFO: renamed from: d */
    public final ff4 f69275d;

    public y44() {
        this.f69272a = 10.0d;
        this.f69273b = 0.0d;
        this.f69274c = new z44();
        this.f69275d = ef4.m11088d();
    }

    /* JADX INFO: renamed from: a */
    public final long[] m24936a() {
        double[] dArr;
        Double dM3210E;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < ((ef4) this.f69275d).m11093f(); i++) {
            ef4 ef4Var = (ef4) this.f69275d;
            synchronized (ef4Var) {
                dM3210E = b34.m3210E(ef4Var.m11089a(i), null);
            }
            if (dM3210E != null) {
                arrayList.add(dM3210E);
            }
        }
        if (arrayList.isEmpty()) {
            dArr = new double[]{7.0d, 30.0d, 300.0d, 1800.0d};
        } else {
            int size = arrayList.size();
            double[] dArr2 = new double[size];
            for (int i2 = 0; i2 < size; i2++) {
                Double d = (Double) arrayList.get(i2);
                dArr2[i2] = d != null ? d.doubleValue() : 0.0d;
            }
            dArr = dArr2;
        }
        int length = dArr.length;
        long[] jArr = new long[length];
        for (int i3 = 0; i3 < length; i3++) {
            jArr[i3] = Math.round(dArr[i3] * 1000.0d);
        }
        return jArr;
    }

    public y44(double d, double d2, z44 z44Var, ff4 ff4Var) {
        this.f69272a = d;
        this.f69273b = d2;
        this.f69274c = z44Var;
        this.f69275d = ff4Var;
    }
}
