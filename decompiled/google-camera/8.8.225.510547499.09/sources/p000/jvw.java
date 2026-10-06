package p000;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class jvw implements Executor {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Runnable f34921a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Executor f34922b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ jvx f34923c;

    /* JADX INFO: renamed from: d */
    private final /* synthetic */ int f34924d;

    public /* synthetic */ jvw(jvx jvxVar, Runnable runnable, Executor executor, int i) {
        this.f34924d = i;
        this.f34923c = jvxVar;
        this.f34921a = runnable;
        this.f34922b = executor;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f34924d) {
            case 0:
                jvx jvxVar = this.f34923c;
                jvxVar.m13594a(runnable).mo2282d(this.f34921a, this.f34922b);
                break;
            default:
                jvx jvxVar2 = this.f34923c;
                Runnable runnable2 = this.f34921a;
                Executor executor = this.f34922b;
                nps npsVarM13594a = jvxVar2.m13594a(runnable);
                npsVarM13594a.mo2282d(new jpm(npsVarM13594a, runnable2, 6), executor);
                break;
        }
    }
}
