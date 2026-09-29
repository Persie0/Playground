package com.google.android.gms.vision.clearcut;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.internal.vision.C1030o;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p000.RunnableC3842zq;
import p000.cob;

/* JADX INFO: loaded from: classes2.dex */
public class DynamiteClearcutLogger {
    private static final ExecutorService zza;
    private cob zzb = new cob();
    private VisionClearcutLogger zzc;

    static {
        ThreadFactory threadFactoryDefaultThreadFactory = Executors.defaultThreadFactory();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 2, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactoryDefaultThreadFactory);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        zza = Executors.unconfigurableExecutorService(threadPoolExecutor);
    }

    public DynamiteClearcutLogger(Context context) {
        this.zzc = new VisionClearcutLogger(context);
    }

    public final void zza(int i, C1030o c1030o) {
        if (i == 3) {
            cob cobVar = this.zzb;
            synchronized (cobVar.f10374b) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (cobVar.f10375c + cobVar.f10373a > jCurrentTimeMillis) {
                    if (Log.isLoggable("Vision", 2)) {
                        Log.v("Vision", "Skipping image analysis log due to rate limiting");
                        return;
                    }
                    return;
                }
                cobVar.f10375c = jCurrentTimeMillis;
            }
        }
        zza.execute(new RunnableC3842zq(this, i, c1030o));
    }
}
