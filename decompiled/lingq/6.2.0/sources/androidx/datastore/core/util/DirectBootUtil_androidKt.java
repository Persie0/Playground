package androidx.datastore.core.util;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class DirectBootUtil_androidKt {
    public static final Context requireDeviceProtectedStorageContext(Context context) {
        context.getClass();
        if (context.isDeviceProtectedStorage()) {
            return context;
        }
        Context contextCreateDeviceProtectedStorageContext = context.createDeviceProtectedStorageContext();
        contextCreateDeviceProtectedStorageContext.getClass();
        return contextCreateDeviceProtectedStorageContext;
    }
}
