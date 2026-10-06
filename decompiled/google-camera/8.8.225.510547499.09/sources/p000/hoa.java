package p000;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hoa implements hnu {

    /* JADX INFO: renamed from: a */
    public final jwn f28562a;

    /* JADX INFO: renamed from: b */
    private final hnu f28563b;

    public hoa(Executor executor, jww jwwVar, hnv hnvVar) {
        this.f28562a = jwj.m13624c(jwwVar);
        hny hnyVarM10529a = hnz.m10529a();
        hnyVarM10529a.m10524c(executor);
        hnyVarM10529a.m10525d("PortraitTeleStream");
        hnyVarM10529a.m10526e(new hmm(jwwVar, 12));
        hnyVarM10529a.m10527f(new hmm(jwwVar, 13));
        hnyVarM10529a.m10528g(hnvVar);
        this.f28563b = hnyVarM10529a.m10522a();
    }

    @Override // p000.hnu
    /* JADX INFO: renamed from: by */
    public final synchronized void mo5538by(hnv hnvVar) {
        this.f28563b.mo5538by(hnvVar);
    }
}
