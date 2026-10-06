package p000;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class lan implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ lab f37828a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ Executor f37829b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ lav f37830c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ lav f37831d;

    /* JADX INFO: renamed from: e */
    final /* synthetic */ lzd f37832e;

    public lan(lav lavVar, lab labVar, Executor executor, lav lavVar2, lzd lzdVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f37831d = lavVar;
        this.f37828a = labVar;
        this.f37829b = executor;
        this.f37830c = lavVar2;
        this.f37832e = lzdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj = this.f37831d.f37856a;
        if (obj != null) {
            lav.m15123o(obj, this.f37828a, this.f37829b, this.f37830c);
        } else {
            this.f37830c.m15131m(this.f37831d.f37857b);
        }
    }

    public final String toString() {
        return this.f37831d.toString() + "then[" + String.valueOf(this.f37828a) + "]";
    }
}
