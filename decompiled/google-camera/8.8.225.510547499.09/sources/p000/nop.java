package p000;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class nop extends nor {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ nos f43986a;

    /* JADX INFO: renamed from: c */
    private final nol f43987c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nop(nos nosVar, nol nolVar, Executor executor) {
        super(nosVar, executor);
        this.f43986a = nosVar;
        nolVar.getClass();
        this.f43987c = nolVar;
    }

    @Override // p000.npr
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo17569a() {
        nps npsVarMo3988a = this.f43987c.mo3988a();
        npsVarMo3988a.getClass();
        return npsVarMo3988a;
    }

    @Override // p000.npr
    /* JADX INFO: renamed from: b */
    public final String mo17570b() {
        return this.f43987c.toString();
    }

    @Override // p000.nor
    /* JADX INFO: renamed from: c */
    public final /* bridge */ /* synthetic */ void mo17571c(Object obj) {
        this.f43986a.mo16665f((nps) obj);
    }
}
