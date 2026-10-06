package p000;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ggk implements jwn {

    /* JADX INFO: renamed from: a */
    public final kov f24675a;

    /* JADX INFO: renamed from: b */
    private final jvd f24676b = new jvd();

    public ggk(kov kovVar) {
        this.f24675a = kovVar;
    }

    @Override // p000.jwn
    /* JADX INFO: renamed from: a */
    public final kba mo3830a(kbg kbgVar, Executor executor) {
        ggj ggjVar = new ggj(executor, kbgVar);
        this.f24675a.m14648b(ggjVar);
        this.f24676b.execute(new epm(this, executor, kbgVar, 19));
        return new eip(this, ggjVar, 19);
    }

    @Override // p000.jwn
    /* JADX INFO: renamed from: be */
    public final /* bridge */ /* synthetic */ Object mo3831be() {
        return this.f24675a.m14647a();
    }
}
