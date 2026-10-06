package p000;

import android.content.Context;
import android.content.IntentFilter;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ljm implements ljh {

    /* JADX INFO: renamed from: a */
    public final npv f38403a;

    /* JADX INFO: renamed from: b */
    public final ohb f38404b;

    public ljm(ljf ljfVar, Context context, npv npvVar, ohb ohbVar, oju ojuVar, oju ojuVar2) {
        new AtomicBoolean(false);
        new IntentFilter("android.intent.action.BATTERY_CHANGED");
        ljfVar.m15526b(npvVar, ohbVar, ojuVar);
        this.f38403a = npvVar;
        this.f38404b = ohbVar;
        lku.m15663q(new dks(this, context, 5));
        lku.m15663q(new dfg(ojuVar2, 16));
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m15541a() {
    }

    @Override // p000.ljh
    /* JADX INFO: renamed from: ao */
    public final void mo15463ao() {
        kxk.m14968N(new kxw(this, 18), this.f38403a);
    }
}
