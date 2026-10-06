package p000;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class esq {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f15502a = 0;

    /* JADX INFO: renamed from: b */
    private static final Executor f15503b = cje.f5921a;

    /* JADX INFO: renamed from: c */
    private final nqf f15504c = nqf.m17621g();

    /* JADX INFO: renamed from: d */
    private boolean f15505d = false;

    /* JADX INFO: renamed from: a */
    public final synchronized nps m7788a() {
        return this.f15504c;
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m7789b(Context context) {
        if (!this.f15505d) {
            this.f15505d = true;
            esp espVar = new esp(context);
            nqf nqfVar = this.f15504c;
            cik cikVar = cik.f5808p;
            Executor executor = f15503b;
            nqfVar.mo16665f(nod.m17553i(kxk.m14961G(mws.m17101p(kxk.m14968N(cikVar, executor), kxk.m14968N(new esc(espVar, 5), executor), kxk.m14968N(new esc(espVar, 6), executor), kxk.m14968N(new esc(espVar, 7), executor), kxk.m14968N(cik.f5809q, executor))), ddu.f10599p, not.INSTANCE));
        }
    }
}
