package androidx.datastore.core;

import android.os.Parcel;
import android.os.Process;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import p000.lda;

/* JADX INFO: loaded from: classes2.dex */
public final class DirectBootExceptionUtilKt {
    private static final String TAG = "DirectBootExceptionUtil";

    public static final boolean isDeviceUnlocked(Throwable th) {
        th.getClass();
        try {
            Method method = Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class);
            method.getClass();
            Object objInvoke = method.invoke(null, "sys.user." + primaryUserId() + ".ce_available", "false");
            objInvoke.getClass();
            return ((String) objInvoke).equals("true");
        } catch (Throwable th2) {
            lda.m16117c(th, th2);
            return false;
        }
    }

    private static final int primaryUserId() {
        try {
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.getClass();
            Process.myUserHandle().writeToParcel(parcelObtain, 0);
            parcelObtain.setDataPosition(0);
            return parcelObtain.readInt();
        } catch (Throwable unused) {
            Log.d(TAG, "Error when reading current user id. Selected default user id `0`.");
            return 0;
        }
    }

    public static final Exception wrapExceptionIfDueToDirectBoot(String str, Exception exc) {
        exc.getClass();
        if (isDeviceUnlocked(exc) || str == null) {
            return exc;
        }
        File file = new File(str, "siblingTestFile.txt");
        if (file.exists()) {
            file.delete();
        }
        try {
            file.createNewFile();
            return exc;
        } catch (IOException unused) {
            return new DirectBootUsageException(exc);
        } finally {
            file.delete();
        }
    }
}
