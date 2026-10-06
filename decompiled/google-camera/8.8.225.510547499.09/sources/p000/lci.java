package p000;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lci extends lcc {

    /* JADX INFO: renamed from: d */
    final /* synthetic */ kzq f37921d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lci(Executor executor, kzq kzqVar) {
        super(executor);
        this.f37921d = kzqVar;
    }

    @Override // p000.lcc
    /* JADX INFO: renamed from: k */
    public final laa mo15161k() {
        this.f37921d.shutdown();
        return laa.m15114j(laa.m15114j(this.f37921d.f37781a.mo15102a(not.INSTANCE, lqi.m15875t())).mo15102a(not.INSTANCE, new lch(this)));
    }
}
