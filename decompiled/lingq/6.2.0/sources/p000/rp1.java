package p000;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rp1 implements Callable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ tp1 f59674a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ long f59675b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f59676c;

    public /* synthetic */ rp1(tp1 tp1Var, long j, String str) {
        this.f59674a = tp1Var;
        this.f59675b = j;
        this.f59676c = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        tp1 tp1Var = this.f59674a;
        return tp1Var.f62668o.f13669b.m9855a(new sp1(tp1Var, this.f59675b, this.f59676c));
    }
}
