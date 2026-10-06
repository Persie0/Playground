package p000;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class jwg implements kbg {

    /* JADX INFO: renamed from: a */
    private final kbg f34943a;

    /* JADX INFO: renamed from: b */
    private final Executor f34944b;

    /* JADX INFO: renamed from: c */
    private final jvb f34945c;

    /* JADX INFO: renamed from: d */
    private jvb f34946d;

    public jwg(kbg kbgVar, Executor executor, jvb jvbVar) {
        this.f34943a = kbgVar;
        this.f34944b = executor;
        this.f34945c = jvbVar;
        this.f34946d = jvbVar.m13536c();
    }

    @Override // p000.kbg
    /* JADX INFO: renamed from: bf */
    public final /* bridge */ /* synthetic */ void mo3415bf(Object obj) {
        jvb jvbVar = this.f34946d;
        jvb jvbVarM13536c = this.f34945c.m13536c();
        this.f34946d = jvbVarM13536c;
        jvbVarM13536c.m13537d(((jwn) obj).mo3830a(this.f34943a, this.f34944b));
        jvbVar.close();
    }
}
