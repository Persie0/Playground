package p000;

import android.content.Context;
import android.util.Log;
import com.google.firebase.crashlytics.internal.concurrency.C1149a;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class t33 {

    /* JADX INFO: renamed from: a */
    public String f61786a;

    /* JADX INFO: renamed from: b */
    public final Object f61787b;

    /* JADX INFO: renamed from: c */
    public final Object f61788c;

    /* JADX INFO: renamed from: d */
    public final Object f61789d;

    /* JADX INFO: renamed from: e */
    public final Object f61790e;

    /* JADX INFO: renamed from: f */
    public final Object f61791f;

    /* JADX INFO: renamed from: g */
    public final Object f61792g;

    public t33(Context context) {
        String string;
        String str = ((w30) jj5.f45614e.m14503n(context)).f66313a;
        this.f61786a = str;
        File filesDir = context.getFilesDir();
        this.f61787b = filesDir;
        if (str.isEmpty()) {
            string = ".com.google.firebase.crashlytics.files.v1";
        } else {
            StringBuilder sb = new StringBuilder(".crashlytics.v3");
            sb.append(File.separator);
            sb.append(str.length() > 40 ? pb1.m19028P(str) : str.replaceAll("[^a-zA-Z0-9.]", "_"));
            string = sb.toString();
        }
        File file = new File(filesDir, string);
        m21827c(file);
        this.f61788c = file;
        File file2 = new File(file, "open-sessions");
        m21827c(file2);
        this.f61789d = file2;
        File file3 = new File(file, "reports");
        m21827c(file3);
        this.f61790e = file3;
        File file4 = new File(file, "priority-reports");
        m21827c(file4);
        this.f61791f = file4;
        File file5 = new File(file, "native-reports");
        m21827c(file5);
        this.f61792g = file5;
    }

    /* JADX INFO: renamed from: c */
    public static synchronized void m21827c(File file) {
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
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: d */
    public static boolean m21828d(File file) {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                m21828d(file2);
            }
        }
        return file.delete();
    }

    /* JADX INFO: renamed from: e */
    public static List m21829e(Object[] objArr) {
        return objArr == null ? Collections.EMPTY_LIST : Arrays.asList(objArr);
    }

    /* JADX INFO: renamed from: a */
    public void m21830a(String str) {
        File file = new File((File) this.f61787b, str);
        if (file.exists() && m21828d(file)) {
            String str2 = "Deleted previous Crashlytics file system: " + file.getPath();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str2, null);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public File m21831b(String str, String str2) {
        File file = new File((File) this.f61789d, str);
        file.mkdirs();
        return new File(file, str2);
    }

    /* JADX INFO: renamed from: f */
    public void m21832f(String str) {
        C3552rx c3552rx = (C3552rx) this.f61790e;
        synchronized (c3552rx) {
            try {
                if (((sj4) ((AtomicMarkableReference) c3552rx.f59987b).getReference()).m21418b(str)) {
                    AtomicMarkableReference atomicMarkableReference = (AtomicMarkableReference) c3552rx.f59987b;
                    atomicMarkableReference.set((sj4) atomicMarkableReference.getReference(), true);
                    RunnableC0002a0 runnableC0002a0 = new RunnableC0002a0(c3552rx, 19);
                    AtomicReference atomicReference = (AtomicReference) c3552rx.f59988c;
                    while (!atomicReference.compareAndSet(null, runnableC0002a0)) {
                        if (atomicReference.get() != null) {
                            return;
                        }
                    }
                    ((C1149a) ((t33) c3552rx.f59989d).f61788c).f13669b.m9855a(runnableC0002a0);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public t33(String str, t33 t33Var, C1149a c1149a) {
        this.f61789d = new C3552rx(this, false);
        this.f61790e = new C3552rx(this, true);
        this.f61791f = new xh8();
        this.f61792g = new AtomicMarkableReference(null, false);
        this.f61786a = str;
        this.f61787b = new zx5(t33Var);
        this.f61788c = c1149a;
    }

    public t33(String str, String str2, String str3, String str4, mp2 mp2Var, ArrayList arrayList, ArrayList arrayList2) {
        this.f61786a = str;
        this.f61787b = str2;
        this.f61788c = str3;
        this.f61789d = str4;
        this.f61790e = mp2Var;
        this.f61791f = arrayList;
        this.f61792g = arrayList2;
    }
}
