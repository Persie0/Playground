package p000;

import com.google.android.gms.common.annotation.HJo.JrxsYuVZZqnFC;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class lam implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ kyz f37824a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ lav f37825b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ kyz f37826c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ lav f37827d;

    public lam(lav lavVar, kyz kyzVar, lav lavVar2, kyz kyzVar2) {
        this.f37827d = lavVar;
        this.f37824a = kyzVar;
        this.f37825b = lavVar2;
        this.f37826c = kyzVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj = this.f37827d.f37856a;
        if (obj != null) {
            lav.m15122k(obj, this.f37824a, this.f37825b);
            return;
        }
        kzy kzyVar = this.f37827d.f37857b;
        kyz kyzVar = this.f37826c;
        lav lavVar = this.f37825b;
        try {
            lavVar.m15130l(kyzVar.mo8768a(kzyVar));
        } catch (kzy e) {
            lavVar.m15131m(e);
        } catch (Throwable th) {
            lavVar.m15131m(kzy.m15111a(th));
        }
    }

    public final String toString() {
        return this.f37827d.toString() + "then[" + String.valueOf(this.f37824a) + JrxsYuVZZqnFC.wWG + String.valueOf(this.f37826c) + "]";
    }
}
