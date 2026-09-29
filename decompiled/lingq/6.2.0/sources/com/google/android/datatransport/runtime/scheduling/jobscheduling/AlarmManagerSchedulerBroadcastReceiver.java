package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import java.util.concurrent.Executor;
import p000.C3309ls;
import p000.RunnableC3094i;
import p000.fja;
import p000.mk7;
import p000.n16;
import p000.nba;
import p000.q50;

/* JADX INFO: loaded from: classes2.dex */
public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f11538a = 0;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter("extras");
        int iIntValue = Integer.valueOf(intent.getData().getQueryParameter("priority")).intValue();
        int i = intent.getExtras().getInt("attemptNumber");
        nba.m17319b(context);
        C3309ls c3309lsM19658a = q50.m19658a();
        c3309lsM19658a.m16496P(queryParameter);
        c3309lsM19658a.f50066d = mk7.m16870b(iIntValue);
        if (queryParameter2 != null) {
            c3309lsM19658a.f50065c = Base64.decode(queryParameter2, 0);
        }
        n16 n16Var = nba.m17318a().f52578d;
        ((Executor) n16Var.f52177e).execute(new fja(n16Var, c3309lsM19658a.m16506f(), i, new RunnableC3094i(1)));
    }
}
