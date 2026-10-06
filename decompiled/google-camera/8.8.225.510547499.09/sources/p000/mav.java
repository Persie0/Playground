package p000;

import android.content.Context;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import com.google.googlex.gcam.ShotMetadata;
import com.google.googlex.gcam.hdrplus.ManagedImageCallback;
import java.io.File;
import java.util.HashMap;
import java.util.IllegalFormatException;
import java.util.Locale;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mav {

    /* JADX INFO: renamed from: a */
    public final Object f39742a;

    public mav() {
        this.f39742a = ovr.m19106c(0, 0, 6);
    }

    public mav(Context context) {
        this.f39742a = context;
    }

    public mav(Object obj) {
        this.f39742a = obj;
    }

    public mav(String str) {
        this.f39742a = ("UID: [" + Process.myUid() + "]  PID: [" + Process.myPid() + "] ").concat(str);
    }

    public mav(nsx nsxVar) {
        this.f39742a = nsxVar;
    }

    public mav(byte[] bArr) {
        this.f39742a = new HashMap();
    }

    public mav(char[] cArr) {
        this.f39742a = new HashMap();
    }

    /* JADX INFO: renamed from: c */
    public static String m16282c(String str, String str2, Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException e) {
                Log.e("PlayCore", "Unable to format ".concat(str2), e);
                str2 = str2 + " [" + TextUtils.join(", ", objArr) + "]";
            }
        }
        return str + " : " + str2;
    }

    /* JADX INFO: renamed from: f */
    public static long m16283f(File file) {
        if (!file.isDirectory()) {
            return file.length();
        }
        File[] fileArrListFiles = file.listFiles();
        long jM16283f = 0;
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                jM16283f += m16283f(file2);
            }
        }
        return jM16283f;
    }

    /* JADX INFO: renamed from: g */
    public static ManagedImageCallback m16284g(final ntj ntjVar) {
        return new ManagedImageCallback() { // from class: nti
            @Override // com.google.googlex.gcam.hdrplus.ManagedImageCallback
            public final void accept(int i, long j, long j2, int i2) {
                ntjVar.mo7216a(i, j, new ShotMetadata(j2), nrx.m17636a(i2));
            }
        };
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, ovl] */
    /* JADX INFO: renamed from: a */
    public final Object m16285a(lvo lvoVar, ols olsVar) {
        Object objMo16103a = this.f39742a.mo16103a(lvoVar, olsVar);
        return objMo16103a == oma.COROUTINE_SUSPENDED ? objMo16103a : oki.f46196a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    /* JADX INFO: renamed from: b */
    public final synchronized void m16286b(long j) {
        this.f39742a.remove(Long.valueOf(j));
    }

    /* JADX INFO: renamed from: d */
    public final void m16287d(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            Log.e("PlayCore", m16282c((String) this.f39742a, str, objArr));
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m16288e(Throwable th, String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            Log.e("PlayCore", m16282c((String) this.f39742a, str, objArr), th);
        }
    }
}
