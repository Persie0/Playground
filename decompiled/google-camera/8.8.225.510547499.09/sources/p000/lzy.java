package p000;

import java.util.concurrent.Callable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class lzy implements Callable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ nzw f39681a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ lwh f39682b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ long f39683c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ maj f39684d;

    /* JADX INFO: renamed from: e */
    final /* synthetic */ lvn f39685e;

    public lzy(maj majVar, lvn lvnVar, nzw nzwVar, lwh lwhVar, long j) {
        this.f39684d = majVar;
        this.f39685e = lvnVar;
        this.f39681a = nzwVar;
        this.f39682b = lwhVar;
        this.f39683c = j;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        arf arfVarM1853e = this.f39684d.f39710e.m1853e();
        String strM16208y = lyy.m16208y(this.f39685e);
        if (strM16208y == null) {
            arfVarM1853e.mo1846f(1);
        } else {
            arfVarM1853e.mo1847g(1, strM16208y);
        }
        Long lM16204u = lyy.m16204u(this.f39681a);
        if (lM16204u == null) {
            arfVarM1853e.mo1846f(2);
        } else {
            arfVarM1853e.mo1845e(2, lM16204u.longValue());
        }
        arfVarM1853e.mo1845e(3, lyy.m16206w(this.f39682b));
        arfVarM1853e.mo1845e(4, this.f39683c);
        this.f39684d.f39706a.m1825m();
        try {
            Integer numValueOf = Integer.valueOf(arfVarM1853e.m1883a());
            this.f39684d.f39706a.m1829q();
            return numValueOf;
        } finally {
            this.f39684d.f39706a.m1827o();
            this.f39684d.f39710e.m1855g(arfVarM1853e);
        }
    }
}
