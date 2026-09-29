package kotlinx.coroutines.internal;

import java.lang.reflect.Method;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* JADX INFO: renamed from: kotlinx.coroutines.internal.d */
/* JADX INFO: loaded from: classes2.dex */
public final class C7154d {

    /* JADX INFO: renamed from: a */
    public static final Method f40417a;

    static {
        Method method;
        try {
            method = ScheduledThreadPoolExecutor.class.getMethod("setRemoveOnCancelPolicy", Boolean.TYPE);
        } catch (Throwable unused) {
            method = null;
        }
        f40417a = method;
    }
}
