package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import p045c9.C1753g;
import p045c9.RunnableC1748b;
import p135g9.C5717a;
import p317p7.RunnableC8194a;
import p452w8.AbstractC9838s;
import p452w8.C9829j;
import p452w8.C9842w;

/* JADX INFO: loaded from: classes.dex */
public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f11780a = 0;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter("extras");
        int iIntValue = Integer.valueOf(intent.getData().getQueryParameter("priority")).intValue();
        int i10 = intent.getExtras().getInt("attemptNumber");
        C9842w.m18334b(context);
        C9829j.a aVarM18330a = AbstractC9838s.m18330a();
        aVarM18330a.m18323b(queryParameter);
        aVarM18330a.m18324c(C5717a.m12076b(iIntValue));
        if (queryParameter2 != null) {
            aVarM18330a.f50029b = Base64.decode(queryParameter2, 0);
        }
        C1753g c1753g = C9842w.m18333a().f50056d;
        C9829j c9829jM18322a = aVarM18330a.m18322a();
        RunnableC8194a runnableC8194a = new RunnableC8194a(5);
        c1753g.getClass();
        c1753g.f9634e.execute(new RunnableC1748b(c1753g, c9829jM18322a, i10, runnableC8194a));
    }
}
