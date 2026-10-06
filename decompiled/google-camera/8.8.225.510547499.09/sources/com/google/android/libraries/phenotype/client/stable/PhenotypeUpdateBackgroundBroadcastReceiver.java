package com.google.android.libraries.phenotype.client.stable;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import p000.kha;
import p000.kxk;
import p000.lpj;
import p000.lqm;
import p000.lqo;
import p000.lqp;
import p000.lqs;
import p000.nod;
import p000.npm;
import p000.nyb;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class PhenotypeUpdateBackgroundBroadcastReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) throws nyb {
        lqm lqmVar;
        String stringExtra = intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME");
        if (stringExtra != null) {
            if (stringExtra.contains("../") || stringExtra.contains("/..")) {
                Log.w("PhenotypeBackgroundRecv", "Got an invalid config package for P/H that includes '..': " + stringExtra + ". Exiting.");
                return;
            }
            lpj lpjVarM15824a = lpj.m15824a(context);
            Map mapM15885a = lqm.m15885a(context);
            if (mapM15885a.isEmpty() || (lqmVar = (lqm) mapM15885a.get(stringExtra)) == null || lqmVar.f38984e != 7) {
                return;
            }
            BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
            npm npmVar = (npm) kxk.m14972R(nod.m17554j(npm.m17611q(nod.m17553i(npm.m17611q(lqp.m15887b(lpjVarM15824a).m15977a()), new lqo(stringExtra, 0), lpjVarM15824a.m15826b())), new lqs(lqmVar, stringExtra, lpjVarM15824a, 0), lpjVarM15824a.m15826b()), 25L, TimeUnit.SECONDS, lpjVarM15824a.m15826b());
            npmVar.mo2282d(new kha(npmVar, stringExtra, pendingResultGoAsync, 9), lpjVarM15824a.m15826b());
        }
    }
}
