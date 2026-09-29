package cc;

import java.util.concurrent.Callable;

/* JADX INFO: renamed from: cc.s4 */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC1933s4 implements Callable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f10181a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f10182b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f10183c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ BinderC1987y4 f10184d;

    public CallableC1933s4(BinderC1987y4 binderC1987y4, String str, String str2, String str3) {
        this.f10184d = binderC1987y4;
        this.f10181a = str;
        this.f10182b = str2;
        this.f10183c = str3;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws Exception {
        BinderC1987y4 binderC1987y4 = this.f10184d;
        binderC1987y4.f10411a.m5647a();
        C1847j c1847j = binderC1987y4.f10411a.f9893c;
        C1846i7.m5629H(c1847j);
        return c1847j.m5676J(this.f10181a, this.f10182b, this.f10183c);
    }
}
