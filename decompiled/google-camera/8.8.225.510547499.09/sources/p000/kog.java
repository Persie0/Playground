package p000;

import java.util.Arrays;
import java.util.TreeMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class kog implements koi {

    /* JADX INFO: renamed from: b */
    private int f36695b = 0;

    /* JADX INFO: renamed from: a */
    private double[] f36694a = new double[5];

    @Override // p000.koi
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ void mo14614a(Object obj) {
        Double d = (Double) obj;
        int i = this.f36695b + 1;
        double[] dArr = this.f36694a;
        int length = dArr.length;
        if (i - length > 0) {
            int i2 = length + (length >> 1);
            if (i2 - i < 0) {
                i2 = i;
            }
            if ((-2147483639) + i2 > 0) {
                if (i < 0) {
                    throw new OutOfMemoryError();
                }
                i2 = 2147483639;
                if (i > 2147483639) {
                    i2 = Integer.MAX_VALUE;
                }
            }
            this.f36694a = Arrays.copyOf(dArr, i2);
        }
        this.f36694a[this.f36695b] = d.doubleValue();
        this.f36695b++;
    }

    @Override // p000.koi
    /* JADX INFO: renamed from: b */
    public final void mo14615b(kon konVar, Object[] objArr) {
        for (int i = 0; i < this.f36695b; i++) {
            double d = this.f36694a[i];
            Object obj = konVar.f36702b;
            obj.getClass();
            kod kodVarM14618a = kod.m14618a(objArr);
            lpe lpeVar = (lpe) obj;
            kor korVar = (kor) ((TreeMap) lpeVar.f38883b).get(kodVarM14618a);
            if (korVar == null) {
                ((TreeMap) lpeVar.f38883b).put(kodVarM14618a, new koq(d));
            } else {
                koq koqVar = (koq) korVar;
                double d2 = koqVar.f36707a + 1.0d;
                koqVar.f36707a = d2;
                koqVar.f36711e = d;
                if (d < koqVar.f36708b) {
                    koqVar.f36708b = d;
                } else if (d > koqVar.f36709c) {
                    koqVar.f36709c = d;
                }
                koqVar.f36710d = (koqVar.f36710d * (((-1.0d) + d2) / d2)) + (d / d2);
            }
        }
    }

    public final String toString() {
        return Arrays.toString(this.f36694a);
    }
}
