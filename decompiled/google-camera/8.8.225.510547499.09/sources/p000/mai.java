package p000;

import java.util.concurrent.Callable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class mai implements Callable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ double f39703a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ long f39704b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ maj f39705c;

    public mai(maj majVar, double d, long j) {
        this.f39705c = majVar;
        this.f39703a = d;
        this.f39704b = j;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        arf arfVarM1853e = this.f39705c.f39709d.m1853e();
        arfVarM1853e.mo1844d(1, this.f39703a);
        arfVarM1853e.mo1845e(2, this.f39704b);
        this.f39705c.f39706a.m1825m();
        try {
            Integer numValueOf = Integer.valueOf(arfVarM1853e.m1883a());
            this.f39705c.f39706a.m1829q();
            return numValueOf;
        } finally {
            this.f39705c.f39706a.m1827o();
            this.f39705c.f39709d.m1855g(arfVarM1853e);
        }
    }
}
