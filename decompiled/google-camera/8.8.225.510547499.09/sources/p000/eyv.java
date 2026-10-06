package p000;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class eyv implements hnu {

    /* JADX INFO: renamed from: a */
    private final hnu f21011a;

    public eyv(Executor executor, jww jwwVar, hnv hnvVar, boolean z) {
        if (!z) {
            this.f21011a = hnq.f28522a;
            return;
        }
        hny hnyVarM10529a = hnz.m10529a();
        hnyVarM10529a.m10524c(executor);
        hnyVarM10529a.m10525d("LensLite");
        hnyVarM10529a.m10526e(new evu(jwwVar, 7));
        hnyVarM10529a.m10527f(new evu(jwwVar, 8));
        hnyVarM10529a.m10528g(hnvVar);
        this.f21011a = hnyVarM10529a.m10522a();
    }

    @Override // p000.hnu
    /* JADX INFO: renamed from: by */
    public final synchronized void mo5538by(hnv hnvVar) {
        this.f21011a.mo5538by(hnvVar);
    }
}
