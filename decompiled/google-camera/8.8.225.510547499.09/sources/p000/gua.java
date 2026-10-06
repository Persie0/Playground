package p000;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gua implements hnu {

    /* JADX INFO: renamed from: a */
    private final hnu f26422a;

    public gua(Executor executor, jww jwwVar, jww jwwVar2, hnv hnvVar) {
        hny hnyVarM10529a = hnz.m10529a();
        hnyVarM10529a.m10528g(hnvVar);
        hnyVarM10529a.m10525d("liveRectiface");
        hnyVarM10529a.m10527f(new gqn(jwwVar, jwwVar2, 4));
        hnyVarM10529a.m10526e(new gqn(jwwVar, jwwVar2, 5));
        hnyVarM10529a.m10524c(executor);
        this.f26422a = hnyVarM10529a.m10522a();
    }

    @Override // p000.hnu
    /* JADX INFO: renamed from: by */
    public final void mo5538by(hnv hnvVar) {
        this.f26422a.mo5538by(hnvVar);
    }
}
