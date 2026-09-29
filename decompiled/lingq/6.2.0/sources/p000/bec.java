package p000;

import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.Feature;
import com.google.android.gms.tasks.Tasks;
import com.google.mlkit.common.sdkinternal.C1172a;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class bec {

    /* JADX INFO: renamed from: b */
    public static final Executor f8446b = C1172a.m6772c();

    /* JADX INFO: renamed from: a */
    public final Context f8447a;

    public bec(Context context) {
        this.f8447a = context;
    }

    /* JADX INFO: renamed from: a */
    public final void m3673a(String str) {
        if (str == null) {
            return;
        }
        try {
            xdb xdbVar = new xdb(this.f8447a, xdb.f68110n, InterfaceC3691vn.f65627m, mo3.f51630c);
            i44 i44VarM13651b = i44.m13651b();
            i44VarM13651b.f43483d = new Feature[]{pz6.f57048h};
            i44VarM13651b.f43482c = new C2920da(str, 5);
            i44VarM13651b.f43481b = 24337;
            Tasks.await(xdbVar.m17569c(0, i44VarM13651b.m13652a()));
        } catch (InterruptedException | ExecutionException e) {
            if (Log.isLoggable("ResultHelper", 6)) {
                Log.e("ResultHelper", "Failed to cleanup GMS Core cache", e);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:54:0x0090 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    public final Uri m3674b(Uri uri, String str) {
        String scheme;
        if (uri == null || (scheme = uri.getScheme()) == null) {
            return null;
        }
        Context context = this.f8447a;
        File file = new File(context.getCacheDir(), "mlkit_docscan_ui_client");
        if (!file.exists()) {
            file.mkdir();
        }
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        File file2 = new File(file, wq1.m24113i(jElapsedRealtimeNanos, str, new StringBuilder(String.valueOf(jElapsedRealtimeNanos).length() + 4)));
        try {
            InputStream inputStreamM22878a = urc.m22878a(context, uri, (Objects.equals(context.getPackageName(), "com.google.android.gms") || !scheme.equals("content")) ? hnc.f42673e : hnc.f42672d);
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int i = inputStreamM22878a.read(bArr);
                        if (i == -1) {
                            fileOutputStream.flush();
                            Uri uriFromFile = Uri.fromFile(file2);
                            fileOutputStream.close();
                            inputStreamM22878a.close();
                            return uriFromFile;
                        }
                        fileOutputStream.write(bArr, 0, i);
                        if (inputStreamM22878a != null) {
                            try {
                                inputStreamM22878a.close();
                            } catch (Throwable th) {
                                th.addSuppressed(th);
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    try {
                        fileOutputStream.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } catch (Throwable th4) {
                if (inputStreamM22878a != null) {
                    inputStreamM22878a.close();
                }
                throw th4;
            }
        } catch (IOException e) {
            String strConcat = "Failed to save file to local: ".concat(uri.toString());
            if (!Log.isLoggable("ResultHelper", 6)) {
                return null;
            }
            Log.e("ResultHelper", strConcat, e);
            return null;
        }
    }
}
