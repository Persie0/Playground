package p000;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class lak implements lab {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ lav f37820a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ lhz f37821b;

    public lak(lav lavVar, lhz lhzVar, byte[] bArr) {
        this.f37820a = lavVar;
        this.f37821b = lhzVar;
    }

    @Override // p000.lab
    /* JADX INFO: renamed from: a */
    public final kzx mo15098a(Object obj, Executor executor) {
        return this.f37821b.m15365f().mo15102a(executor, lqi.m15873r(obj));
    }

    public final String toString() {
        return this.f37820a.toString() + "thenAlways[" + this.f37821b.toString() + "]";
    }
}
