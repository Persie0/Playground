package p000;

import java.util.concurrent.Callable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class maa implements Callable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ long f39695a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ Object f39696b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ Object f39697c;

    /* JADX INFO: renamed from: d */
    private final /* synthetic */ int f39698d;

    public maa(lzo lzoVar, lwh lwhVar, long j, int i) {
        this.f39698d = i;
        this.f39697c = lzoVar;
        this.f39696b = lwhVar;
        this.f39695a = j;
    }

    public maa(maj majVar, String str, long j, int i) {
        this.f39698d = i;
        this.f39696b = majVar;
        this.f39697c = str;
        this.f39695a = j;
    }

    public maa(maj majVar, lwh lwhVar, long j, int i) {
        this.f39698d = i;
        this.f39697c = majVar;
        this.f39696b = lwhVar;
        this.f39695a = j;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        switch (this.f39698d) {
            case 0:
                arf arfVarM1853e = ((maj) this.f39697c).f39712g.m1853e();
                arfVarM1853e.mo1845e(1, lyy.m16206w((lwh) this.f39696b));
                arfVarM1853e.mo1845e(2, this.f39695a);
                ((maj) this.f39697c).f39706a.m1825m();
                try {
                    Integer numValueOf = Integer.valueOf(arfVarM1853e.m1883a());
                    ((maj) this.f39697c).f39706a.m1829q();
                    return numValueOf;
                } finally {
                    ((maj) this.f39697c).f39706a.m1827o();
                    ((maj) this.f39697c).f39712g.m1855g(arfVarM1853e);
                }
            case 1:
                arf arfVarM1853e2 = ((lzo) this.f39697c).f39639b.m1853e();
                arfVarM1853e2.mo1845e(1, lyy.m16206w((lwh) this.f39696b));
                arfVarM1853e2.mo1845e(2, this.f39695a);
                ((lzo) this.f39697c).f39638a.m1825m();
                try {
                    Integer numValueOf2 = Integer.valueOf(arfVarM1853e2.m1883a());
                    ((lzo) this.f39697c).f39638a.m1829q();
                    return numValueOf2;
                } finally {
                    ((lzo) this.f39697c).f39638a.m1827o();
                    ((lzo) this.f39697c).f39639b.m1855g(arfVarM1853e2);
                }
            default:
                arf arfVarM1853e3 = ((maj) this.f39696b).f39708c.m1853e();
                Object obj = this.f39697c;
                if (obj == null) {
                    arfVarM1853e3.mo1846f(1);
                } else {
                    arfVarM1853e3.mo1847g(1, (String) obj);
                }
                arfVarM1853e3.mo1845e(2, this.f39695a);
                ((maj) this.f39696b).f39706a.m1825m();
                try {
                    Integer numValueOf3 = Integer.valueOf(arfVarM1853e3.m1883a());
                    ((maj) this.f39696b).f39706a.m1829q();
                    return numValueOf3;
                } finally {
                    ((maj) this.f39696b).f39706a.m1827o();
                    ((maj) this.f39696b).f39708c.m1855g(arfVarM1853e3);
                }
        }
    }
}
