package p339qe;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: qe.b */
/* JADX INFO: loaded from: classes.dex */
public final class C8597b {

    /* JADX INFO: renamed from: a */
    public final File f46075a;

    /* JADX INFO: renamed from: b */
    public final File f46076b;

    /* JADX INFO: renamed from: c */
    public final File f46077c;

    /* JADX INFO: renamed from: d */
    public final File f46078d;

    /* JADX INFO: renamed from: e */
    public final File f46079e;

    /* JADX INFO: renamed from: f */
    public final File f46080f;

    public C8597b(Context context) {
        String str;
        File filesDir = context.getFilesDir();
        this.f46075a = filesDir;
        if (Build.VERSION.SDK_INT >= 28) {
            str = ".com.google.firebase.crashlytics.files.v2" + File.pathSeparator + Application.getProcessName().replaceAll("[^a-zA-Z0-9.]", "_");
        } else {
            str = ".com.google.firebase.crashlytics.files.v1";
        }
        File file = new File(filesDir, str);
        m16816c(file);
        this.f46076b = file;
        File file2 = new File(file, "open-sessions");
        m16816c(file2);
        this.f46077c = file2;
        File file3 = new File(file, "reports");
        m16816c(file3);
        this.f46078d = file3;
        File file4 = new File(file, "priority-reports");
        m16816c(file4);
        this.f46079e = file4;
        File file5 = new File(file, "native-reports");
        m16816c(file5);
        this.f46080f = file5;
    }

    /* JADX INFO: renamed from: a */
    public static void m16815a(File file) {
        if (file.exists() && m16817d(file)) {
            String str = "Deleted previous Crashlytics file system: " + file.getPath();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str, null);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static synchronized void m16816c(File file) {
        try {
            if (file.exists()) {
                if (file.isDirectory()) {
                    return;
                }
                String str = "Unexpected non-directory file: " + file + "; deleting file and creating new directory.";
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", str, null);
                }
                file.delete();
            }
            if (!file.mkdirs()) {
                Log.e("FirebaseCrashlytics", "Could not create Crashlytics-specific directory: " + file, null);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: d */
    public static boolean m16817d(File file) {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                m16817d(file2);
            }
        }
        return file.delete();
    }

    /* JADX INFO: renamed from: e */
    public static <T> List<T> m16818e(T[] tArr) {
        return tArr == null ? Collections.emptyList() : Arrays.asList(tArr);
    }

    /* JADX INFO: renamed from: b */
    public final File m16819b(String str, String str2) {
        File file = new File(this.f46077c, str);
        file.mkdirs();
        return new File(file, str2);
    }
}
