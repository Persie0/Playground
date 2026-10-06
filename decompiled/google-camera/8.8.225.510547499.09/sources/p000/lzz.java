package p000;

import java.util.concurrent.Callable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class lzz implements Callable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ double f39686a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ lwh f39687b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ long f39688c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ maj f39689d;

    public lzz(maj majVar, double d, lwh lwhVar, long j) {
        this.f39689d = majVar;
        this.f39686a = d;
        this.f39687b = lwhVar;
        this.f39688c = j;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        arf arfVarM1853e = this.f39689d.f39711f.m1853e();
        arfVarM1853e.mo1844d(1, this.f39686a);
        arfVarM1853e.mo1845e(2, lyy.m16206w(this.f39687b));
        arfVarM1853e.mo1845e(3, this.f39688c);
        this.f39689d.f39706a.m1825m();
        try {
            Integer numValueOf = Integer.valueOf(arfVarM1853e.m1883a());
            this.f39689d.f39706a.m1829q();
            return numValueOf;
        } finally {
            this.f39689d.f39706a.m1827o();
            this.f39689d.f39711f.m1855g(arfVarM1853e);
        }
    }
}
