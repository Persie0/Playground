package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jmv {
    /* JADX INFO: renamed from: a */
    public static final ExecutorService m13374a(int i, ThreadFactory threadFactory) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i, i, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactory);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return Executors.unconfigurableExecutorService(threadPoolExecutor);
    }

    /* JADX INFO: renamed from: b */
    public static PendingIntent m13375b(Context context, Intent intent, int i) {
        return PendingIntent.getActivity(context, 0, intent, i);
    }

    /* JADX INFO: renamed from: c */
    public static final String[] m13376c(ArrayList arrayList) {
        return (String[]) arrayList.toArray(new String[0]);
    }

    /* JADX INFO: renamed from: e */
    public static void m13378e(jjx jjxVar) {
        if (((Boolean) jke.f34232c.mo13520a()).booleanValue()) {
            Parcel parcelObtain = Parcel.obtain();
            jjy.m13322a(jjxVar, parcelObtain, 0);
            int iDataSize = parcelObtain.dataSize();
            parcelObtain.recycle();
            if (iDataSize <= ((Integer) jke.f34231b.mo13520a()).intValue()) {
                return;
            }
            throw new IllegalStateException("Max allowed feedback options size of " + jke.f34231b.mo13520a().toString() + " exceeded, you are passing in feedback options of " + iDataSize + " size.");
        }
    }

    /* JADX INFO: renamed from: f */
    public static final jjx m13379f(jjw jjwVar) {
        jib.m13205j(jjwVar.f34193d.crashInfo.exceptionClassName);
        jib.m13205j(jjwVar.f34193d.crashInfo.throwClassName);
        jib.m13205j(jjwVar.f34193d.crashInfo.throwMethodName);
        jib.m13205j(jjwVar.f34193d.crashInfo.stackTrace);
        if (TextUtils.isEmpty(jjwVar.f34193d.crashInfo.throwFileName)) {
            jjwVar.f34193d.crashInfo.throwFileName = "unknown";
        }
        jjx jjxVarM13321a = jjwVar.m13321a();
        jjxVarM13321a.f34200d.crashInfo = jjwVar.f34193d.crashInfo;
        jjxVarM13321a.f34203g = null;
        return jjxVarM13321a;
    }
}
