package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class hpt extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ hpu f28994a;

    public hpt(hpu hpuVar) {
        this.f28994a = hpuVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (this.f28994a.f29008n == null) {
            return;
        }
        int intExtra = intent.getIntExtra("level", 0);
        if (intExtra <= 5) {
            ((nbe) ((nbe) hpu.f28995a.m17252c()).mo17276G(3872)).mo17291p("Low battery level: %d", intExtra);
            jfo jfoVar = this.f28994a.f29008n;
            if (((hpm) jfoVar.f33911b).m10590h()) {
                ((hqk) jfoVar.f33910a).m10601g(true);
            } else {
                ((hqk) jfoVar.f33910a).m10601g(false);
            }
        }
    }
}
