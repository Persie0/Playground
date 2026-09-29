package com.kochava.tracker.events;

import android.content.Context;
import com.kochava.core.job.job.internal.JobType;
import com.kochava.core.task.internal.TaskQueue;
import com.kochava.tracker.modules.internal.Module;
import java.util.Arrays;
import p000.ee4;
import p000.lu2;
import p000.r46;
import p000.se4;
import p000.sj5;
import p000.sq5;
import p000.ux5;

/* JADX INFO: loaded from: classes.dex */
public final class Events extends Module<Object> implements lu2 {

    /* JADX INFO: renamed from: g */
    public static final sq5 f14115g;

    /* JADX INFO: renamed from: h */
    public static final Object f14116h;

    /* JADX INFO: renamed from: i */
    public static Events f14117i;

    static {
        sj5 sj5VarM20396w = r46.m20396w();
        f14115g = ux5.m22983f(sj5VarM20396w, sj5VarM20396w, BuildConfig.SDK_MODULE_NAME, BuildConfig.SDK_MODULE_NAME);
        f14116h = new Object();
        f14117i = null;
    }

    public static lu2 getInstance() {
        if (f14117i == null) {
            synchronized (f14116h) {
                try {
                    if (f14117i == null) {
                        f14117i = new Events(f14115g);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f14117i;
    }

    @Override // com.kochava.tracker.modules.internal.Module
    /* JADX INFO: renamed from: d */
    public final void mo6975d() {
    }

    @Override // com.kochava.tracker.modules.internal.Module
    /* JADX INFO: renamed from: e */
    public final void mo6976e(Context context) {
        ee4 ee4Var = new ee4(ee4.f37105r, Arrays.asList(se4.f60760y, se4.f60761z, "JobPayloadQueueClicks", se4.f60741f), JobType.Persistent, TaskQueue.IO, ee4.f37106s);
        ee4Var.f37107q = 1;
        m6984c(ee4Var);
    }
}
