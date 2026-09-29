package com.google.android.gms.internal.play_billing;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import p000.ktb;
import p000.ltb;
import p000.pxb;
import p000.vwb;
import p000.ytb;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.d */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC0991d implements Runnable {

    /* JADX INFO: renamed from: a */
    public pxb f12179a;

    @Override // java.lang.Runnable
    public final void run() {
        vwb vwbVar;
        C0987b c0987b;
        pxb pxbVar = this.f12179a;
        if (pxbVar == null || (vwbVar = pxbVar.f56962h) == null) {
            return;
        }
        this.f12179a = null;
        if (vwbVar.isDone()) {
            Object obj = pxbVar.f70458a;
            if (obj == null) {
                if (vwbVar.isDone()) {
                    if (ytb.f70457g.mo11793f(pxbVar, null, pxb.m19560h(vwbVar))) {
                        pxb.m19561j(pxbVar);
                        return;
                    }
                    return;
                }
                ltb ltbVar = new ltb(pxbVar, vwbVar);
                if (ytb.f70457g.mo11793f(pxbVar, null, ltbVar)) {
                    try {
                        vwbVar.mo16661b(ltbVar, zzcs.INSTANCE);
                        return;
                    } catch (Throwable th) {
                        try {
                            c0987b = new C0987b(th);
                        } catch (Error | Exception unused) {
                            c0987b = C0987b.f12177b;
                        }
                        ytb.f70457g.mo11793f(pxbVar, ltbVar, c0987b);
                        return;
                    }
                }
                obj = pxbVar.f70458a;
            }
            if (obj instanceof ktb) {
                vwbVar.cancel(((ktb) obj).f48420a);
                return;
            }
            return;
        }
        try {
            ScheduledFuture scheduledFuture = pxbVar.f56963i;
            pxbVar.f56963i = null;
            String str = "Timed out";
            if (scheduledFuture != null) {
                try {
                    long jAbs = Math.abs(scheduledFuture.getDelay(TimeUnit.MILLISECONDS));
                    if (jAbs > 10) {
                        str = "Timed out (timeout delayed by " + jAbs + " ms after scheduled time)";
                    }
                } catch (Throwable th2) {
                    if (ytb.f70457g.mo11793f(pxbVar, null, new C0987b(new zzdf(str)))) {
                        pxb.m19561j(pxbVar);
                    }
                    throw th2;
                }
            }
            if (ytb.f70457g.mo11793f(pxbVar, null, new C0987b(new zzdf(str + ": " + vwbVar.toString())))) {
                pxb.m19561j(pxbVar);
            }
            vwbVar.cancel(true);
        } catch (Throwable th3) {
            vwbVar.cancel(true);
            throw th3;
        }
    }
}
