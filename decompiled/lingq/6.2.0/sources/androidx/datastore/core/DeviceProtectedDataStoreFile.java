package androidx.datastore.core;

import android.content.Context;
import androidx.datastore.core.util.DirectBootUtil_androidKt;
import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
public final class DeviceProtectedDataStoreFile {
    public static final File deviceProtectedDataStoreFile(Context context, String str) {
        context.getClass();
        str.getClass();
        return new File(DirectBootUtil_androidKt.requireDeviceProtectedStorageContext(context).getFilesDir(), "datastore/".concat(str));
    }
}
