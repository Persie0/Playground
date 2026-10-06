package p000;

import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dvl {

    /* JADX INFO: renamed from: d */
    private final dtj f12661d;

    /* JADX INFO: renamed from: e */
    private int f12662e = 9000;

    /* JADX INFO: renamed from: a */
    public int f12658a = 1;

    /* JADX INFO: renamed from: f */
    private dvf f12663f = dvk.f12655a;

    /* JADX INFO: renamed from: c */
    public int f12660c = 4;

    /* JADX INFO: renamed from: b */
    public int f12659b = 30;

    /* JADX INFO: renamed from: g */
    private long f12664g = 0;

    /* JADX INFO: renamed from: h */
    private TimeUnit f12665h = null;

    public dvl(dtj dtjVar) {
        this.f12661d = dtjVar;
    }

    /* JADX INFO: renamed from: a */
    public final dvg m6777a() {
        int i;
        dve dvjVar;
        if (this.f12665h != null) {
            this.f12662e = (int) (((long) this.f12659b) * TimeUnit.SECONDS.convert(this.f12664g, this.f12665h));
        }
        int i2 = this.f12658a;
        dvh dvhVar = new dvh(i2);
        if (i2 == 1) {
            dvjVar = new dvi();
            i = 1;
        } else {
            i = i2;
            dvjVar = new dvj(i2);
        }
        return new dvg(this.f12661d, this.f12662e, i, i, this.f12660c, this.f12663f, dvhVar, dvjVar);
    }

    /* JADX INFO: renamed from: b */
    public final void m6778b() {
        this.f12663f = dvk.f12656b;
    }

    /* JADX INFO: renamed from: c */
    public final void m6779c(long j, TimeUnit timeUnit) {
        this.f12664g = j;
        this.f12665h = timeUnit;
    }
}
