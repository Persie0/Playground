package cc;

import java.util.concurrent.Callable;

/* JADX INFO: renamed from: cc.q4 */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC1915q4 implements Callable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f10144a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f10145b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f10146c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ BinderC1987y4 f10147d;

    public CallableC1915q4(BinderC1987y4 binderC1987y4, String str, String str2, String str3) {
        this.f10147d = binderC1987y4;
        this.f10144a = str;
        this.f10145b = str2;
        this.f10146c = str3;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws Exception {
        BinderC1987y4 binderC1987y4 = this.f10147d;
        binderC1987y4.f10411a.m5647a();
        C1847j c1847j = binderC1987y4.f10411a.f9893c;
        C1846i7.m5629H(c1847j);
        return c1847j.m5679M(this.f10144a, this.f10145b, this.f10146c);
    }
}
