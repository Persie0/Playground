package p000;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class eqo implements kng {

    /* JADX INFO: renamed from: a */
    private double f15195a = 0.0d;

    /* JADX INFO: renamed from: b */
    private double f15196b = 0.0d;

    /* JADX INFO: renamed from: c */
    private double f15197c = 0.0d;

    /* JADX INFO: renamed from: d */
    private int f15198d = 0;

    /* JADX INFO: renamed from: c */
    private final synchronized void m7700c(knj knjVar) {
        double d = this.f15195a;
        double d2 = knjVar.f36608f;
        Double.isNaN(d2);
        this.f15195a = d + d2;
        double d3 = this.f15196b;
        double d4 = knjVar.f36609g;
        Double.isNaN(d4);
        this.f15196b = d3 + d4;
        double d5 = this.f15197c;
        double d6 = knjVar.f36610h;
        Double.isNaN(d6);
        this.f15197c = d5 + d6;
        this.f15198d++;
    }

    @Override // p000.kng
    /* JADX INFO: renamed from: a */
    public final void mo6759a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            m7700c((knj) it.next());
        }
    }

    /* JADX INFO: renamed from: b */
    final synchronized mrm m7701b() {
        mrm mrmVarM16829i;
        int i = this.f15198d;
        if (i == 0) {
            mrmVarM16829i = mqu.f41450a;
        } else {
            double d = this.f15195a;
            double d2 = i;
            Double.isNaN(d2);
            double d3 = d / d2;
            double d4 = this.f15196b;
            Double.isNaN(d2);
            double d5 = d4 / d2;
            double d6 = this.f15197c;
            Double.isNaN(d2);
            double d7 = d6 / d2;
            mrmVarM16829i = mrm.m16829i(Float.valueOf((float) Math.sqrt((d3 * d3) + (d5 * d5) + (d7 * d7))));
        }
        return mrmVarM16829i;
    }
}
