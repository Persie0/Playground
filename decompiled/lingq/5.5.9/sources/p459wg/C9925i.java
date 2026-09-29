package p459wg;

import java.util.ArrayList;
import p534zf.C10483a;
import p534zf.InterfaceC10484b;

/* JADX INFO: renamed from: wg.i */
/* JADX INFO: loaded from: classes.dex */
public final class C9925i {

    /* JADX INFO: renamed from: a */
    public final double f50593a;

    /* JADX INFO: renamed from: b */
    public final double f50594b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC9927k f50595c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC10484b f50596d;

    public C9925i() {
        this.f50593a = 10.0d;
        this.f50594b = 0.0d;
        this.f50595c = new C9926j();
        this.f50596d = C10483a.m19430i();
    }

    public C9925i(double d10, double d11, C9926j c9926j, InterfaceC10484b interfaceC10484b) {
        this.f50593a = d10;
        this.f50594b = d11;
        this.f50595c = c9926j;
        this.f50596d = interfaceC10484b;
    }

    /* JADX INFO: renamed from: a */
    public final long[] m18414a() {
        double[] dArr;
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (true) {
            InterfaceC10484b interfaceC10484b = this.f50596d;
            if (i10 >= interfaceC10484b.length()) {
                break;
            }
            Double dMo19433c = interfaceC10484b.mo19433c(i10);
            if (dMo19433c != null) {
                arrayList.add(dMo19433c);
            }
            i10++;
        }
        if (arrayList.isEmpty()) {
            dArr = new double[]{7.0d, 30.0d, 300.0d, 1800.0d};
        } else {
            int size = arrayList.size();
            double[] dArr2 = new double[size];
            for (int i11 = 0; i11 < size; i11++) {
                Double d10 = (Double) arrayList.get(i11);
                dArr2[i11] = d10 != null ? d10.doubleValue() : 0.0d;
            }
            dArr = dArr2;
        }
        int length = dArr.length;
        long[] jArr = new long[length];
        for (int i12 = 0; i12 < length; i12++) {
            jArr[i12] = Math.round(dArr[i12] * 1000.0d);
        }
        return jArr;
    }
}
