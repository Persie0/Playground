package p000;

import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.IBinder;
import androidx.wear.ambient.AmbientMode;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class adh {
    /* JADX INFO: renamed from: a */
    public static final void m285a(Bundle bundle, String str, IBinder iBinder) {
        bundle.getClass();
        str.getClass();
        bundle.putBinder(str, iBinder);
    }

    /* JADX INFO: renamed from: b */
    public static void m286b(PackageInfo packageInfo, File file) {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            try {
                dataOutputStream.writeLong(packageInfo.lastUpdateTime);
                dataOutputStream.close();
            } catch (Throwable th) {
                try {
                    dataOutputStream.close();
                } catch (Throwable th2) {
                    try {
                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                    } catch (Exception e) {
                    }
                }
                throw th;
            }
        } catch (IOException e2) {
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m287c(Executor executor, AmbientMode.AmbientController ambientController, int i, Object obj) {
        executor.execute(new RunnableC0904pi(ambientController, i, obj, 4, null));
    }
}
