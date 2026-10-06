package p000;

import android.os.Handler;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fqb implements fth {

    /* JADX INFO: renamed from: a */
    public final fth f23183a;

    /* JADX INFO: renamed from: b */
    public final gva f23184b;

    /* JADX INFO: renamed from: c */
    private final Handler f23185c;

    public fqb(fth fthVar, Handler handler, gva gvaVar, byte[] bArr) {
        this.f23183a = fthVar;
        this.f23185c = handler;
        this.f23184b = gvaVar;
    }

    @Override // p000.fth
    /* JADX INFO: renamed from: a */
    public final int mo8694a() {
        return Integer.MAX_VALUE;
    }

    @Override // p000.fth
    /* JADX INFO: renamed from: b */
    public final boolean mo8695b(key keyVar, gva gvaVar) {
        return this.f23183a.mo8695b(keyVar, gvaVar);
    }

    @Override // p000.fth
    /* JADX INFO: renamed from: c */
    public final synchronized void mo8696c(key keyVar, fua fuaVar, npk npkVar, ftg ftgVar) {
        this.f23185c.postDelayed(new fro(ftgVar, new fqa(this, keyVar, fuaVar, npkVar, null, null), 1), 100L);
    }
}
