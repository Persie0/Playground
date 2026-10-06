package com.google.android.libraries.phenotype.client.stable;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import java.io.IOException;
import p000.cqc;
import p000.hnk;
import p000.kij;
import p000.kxk;
import p000.lll;
import p000.lpj;
import p000.lqo;
import p000.lqp;
import p000.nnj;
import p000.nod;
import p000.not;
import p000.npm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class AccountRemovedBroadcastReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.accounts.action.ACCOUNT_REMOVED".equals(intent.getAction())) {
            String stringExtra = intent.getStringExtra("accountType");
            if ("com.google".equals(stringExtra) || "com.google.work".equals(stringExtra) || "cn.google".equals(stringExtra) || "__logged_out_type".equals(stringExtra)) {
                String string = intent.getExtras().getString("authAccount");
                if (!string.contains("../") && !string.contains("/..")) {
                    lpj.m15825c();
                    lpj lpjVarM15824a = lpj.m15824a(context);
                    kxk.m14959E(nnj.m17523i(nod.m17554j(npm.m17611q(lqp.m15887b(lpjVarM15824a).m15978b(new lqo(string, 3), lpjVarM15824a.m15826b())), new cqc(lpjVarM15824a, string, 5), lpjVarM15824a.m15826b()), IOException.class, hnk.f28507t, not.INSTANCE), lpjVarM15824a.m15826b().submit(new lll(context, string, 4))).m17605a(new kij(goAsync(), 8), not.INSTANCE);
                    return;
                }
                Log.w("AccountRemovedRecv", "Got an invalid account name for P/H that includes '..':" + string + ". Exiting.");
            }
        }
    }
}
