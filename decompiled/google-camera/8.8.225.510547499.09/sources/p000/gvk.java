package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class gvk extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ gvm f26495a;

    public gvk(gvm gvmVar) {
        this.f26495a = gvmVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        gvm gvmVar = this.f26495a;
        gvmVar.f26499c = true;
        if (gvmVar.f26498b) {
            gvmVar.f26497a.mo13944f("Ignoring ScreenOff shutdown behavior, the activity is still started.");
        } else {
            gvmVar.m9792c("Received ScreenOff broadcast after onStop: ".concat(String.valueOf(String.valueOf(intent))));
        }
    }
}
