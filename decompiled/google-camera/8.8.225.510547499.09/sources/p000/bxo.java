package p000;

import android.net.Uri;
import java.io.InputStream;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bxo implements bqt {

    /* JADX INFO: renamed from: a */
    private final /* synthetic */ int f4712a;

    /* JADX INFO: renamed from: b */
    private final Object f4713b;

    /* JADX INFO: renamed from: c */
    private final Object f4714c;

    public bxo(bxb bxbVar, btg btgVar, int i) {
        this.f4712a = i;
        this.f4713b = bxbVar;
        this.f4714c = btgVar;
    }

    public bxo(byd bydVar, bti btiVar, int i) {
        this.f4712a = i;
        this.f4713b = bydVar;
        this.f4714c = btiVar;
    }

    @Override // p000.bqt
    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean mo2931b(Object obj, bqr bqrVar) {
        switch (this.f4712a) {
            case 0:
                return true;
            default:
                return "android.resource".equals(((Uri) obj).getScheme());
        }
    }

    /* JADX WARN: Type inference failed for: r14v1, types: [bti, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [btg, java.lang.Object] */
    @Override // p000.bqt
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ bsz mo2930a(Object obj, int i, int i2, bqr bqrVar) {
        bxm bxmVar;
        boolean z;
        cay cayVar;
        switch (this.f4712a) {
            case 0:
                InputStream inputStream = (InputStream) obj;
                if (inputStream instanceof bxm) {
                    bxmVar = (bxm) inputStream;
                    z = false;
                } else {
                    bxmVar = new bxm(inputStream, this.f4714c);
                    z = true;
                }
                synchronized (cay.f4937a) {
                    cayVar = (cay) cay.f4937a.poll();
                    break;
                }
                if (cayVar == null) {
                    cayVar = new cay();
                }
                cayVar.f4938b = bxmVar;
                cbf cbfVar = new cbf(cayVar);
                bxn bxnVar = new bxn(bxmVar, cayVar);
                try {
                    Object obj2 = this.f4713b;
                    bsz bszVarM3152a = ((bxb) obj2).m3152a(new bxi(cbfVar, ((bxb) obj2).f4684g, ((bxb) obj2).f4683f, 0), i, i2, bqrVar, bxnVar);
                    cayVar.m3370a();
                    if (z) {
                    }
                    return bszVarM3152a;
                } finally {
                    cayVar.m3370a();
                    if (z) {
                        bxmVar.m3166b();
                    }
                }
            default:
                bsz bszVarM3183c = ((byd) this.f4713b).m3183c((Uri) obj, bqrVar);
                if (bszVarM3183c == null) {
                    return null;
                }
                return bxd.m3153a(this.f4714c, ((byb) bszVarM3183c).mo3016c(), i, i2);
        }
    }
}
