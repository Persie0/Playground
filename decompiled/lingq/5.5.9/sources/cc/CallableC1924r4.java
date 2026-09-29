package cc;

import java.util.concurrent.Callable;

/* JADX INFO: renamed from: cc.r4 */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC1924r4 implements Callable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f10168a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f10169b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f10170c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ BinderC1987y4 f10171d;

    public CallableC1924r4(BinderC1987y4 binderC1987y4, String str, String str2, String str3) {
        this.f10171d = binderC1987y4;
        this.f10168a = str;
        this.f10169b = str2;
        this.f10170c = str3;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws Exception {
        BinderC1987y4 binderC1987y4 = this.f10171d;
        binderC1987y4.f10411a.m5647a();
        C1847j c1847j = binderC1987y4.f10411a.f9893c;
        C1846i7.m5629H(c1847j);
        return c1847j.m5679M(this.f10168a, this.f10169b, this.f10170c);
    }
}
