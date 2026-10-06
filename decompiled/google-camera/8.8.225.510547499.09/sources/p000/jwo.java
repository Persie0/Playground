package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class jwo extends jxc {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ mrf f34959a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ jwn f34960b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jwo(jwn jwnVar, mrf mrfVar, jwn jwnVar2) {
        super(jwnVar);
        this.f34959a = mrfVar;
        this.f34960b = jwnVar2;
    }

    @Override // p000.jxc
    /* JADX INFO: renamed from: d */
    protected final Object mo3833d(Object obj) {
        return this.f34959a.apply(obj);
    }

    public final String toString() {
        mrl mrlVarM16766e = mpw.m16766e("TransformedObs");
        mrlVarM16766e.m16823b("input", this.f34960b);
        mrlVarM16766e.m16823b("func", this.f34959a);
        return mrlVarM16766e.toString();
    }
}
