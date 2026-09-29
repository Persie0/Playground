package com.google.android.gms.internal.play_billing;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import p000.nwb;
import p000.pxb;
import p000.vwb;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.c */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0989c {
    /* JADX INFO: renamed from: a */
    public static nwb m5516a(Object obj) {
        return new nwb(obj);
    }

    /* JADX INFO: renamed from: b */
    public static vwb m5517b(vwb vwbVar, ScheduledExecutorService scheduledExecutorService) {
        if (vwbVar.isDone()) {
            return vwbVar;
        }
        pxb pxbVar = new pxb();
        pxbVar.f56962h = vwbVar;
        RunnableC0991d runnableC0991d = new RunnableC0991d();
        runnableC0991d.f12179a = pxbVar;
        pxbVar.f56963i = scheduledExecutorService.schedule(runnableC0991d, 28500L, TimeUnit.MILLISECONDS);
        vwbVar.mo16661b(runnableC0991d, zzcs.INSTANCE);
        return pxbVar;
    }
}
