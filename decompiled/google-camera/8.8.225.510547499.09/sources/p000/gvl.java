package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.material.behavior.iWN.zuAgeeF;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class gvl extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ gvm f26496a;

    public gvl(gvm gvmVar) {
        this.f26496a = gvmVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.f26496a.m9792c(zuAgeeF.KWP.concat(String.valueOf(String.valueOf(intent))));
    }
}
