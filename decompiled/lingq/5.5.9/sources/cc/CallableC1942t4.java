package cc;

import java.util.concurrent.Callable;

/* JADX INFO: renamed from: cc.t4 */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC1942t4 implements Callable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f10209a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f10210b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f10211c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ BinderC1987y4 f10212d;

    public CallableC1942t4(BinderC1987y4 binderC1987y4, String str, String str2, String str3) {
        this.f10212d = binderC1987y4;
        this.f10209a = str;
        this.f10210b = str2;
        this.f10211c = str3;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws Exception {
        BinderC1987y4 binderC1987y4 = this.f10212d;
        binderC1987y4.f10411a.m5647a();
        C1847j c1847j = binderC1987y4.f10411a.f9893c;
        C1846i7.m5629H(c1847j);
        return c1847j.m5676J(this.f10209a, this.f10210b, this.f10211c);
    }
}
