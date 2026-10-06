package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class iew extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ iex f30571a;

    public iew(iex iexVar) {
        this.f30571a = iexVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if (action == null) {
        }
        switch (action) {
            case "android.intent.action.BATTERY_CHANGED":
                this.f30571a.m11158a(intent);
                break;
        }
    }
}
