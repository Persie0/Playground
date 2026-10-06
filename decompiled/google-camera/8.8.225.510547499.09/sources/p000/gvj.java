package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class gvj extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ gvm f26494a;

    public gvj(gvm gvmVar) {
        this.f26494a = gvmVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.f26494a.f26499c = false;
    }
}
