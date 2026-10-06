package p000;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class lal implements lab {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ lav f37822a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ lhz f37823b;

    public lal(lav lavVar, lhz lhzVar, byte[] bArr) {
        this.f37822a = lavVar;
        this.f37823b = lhzVar;
    }

    @Override // p000.lab
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ kzx mo15098a(Object obj, Executor executor) {
        kzy kzyVar = (kzy) obj;
        return this.f37823b.m15365f().mo15104c(executor, lqi.m15874s(kzyVar), lqi.m15872q(kzyVar));
    }

    public final String toString() {
        return this.f37822a.toString() + "thenAlways[" + this.f37823b.toString() + "]";
    }
}
