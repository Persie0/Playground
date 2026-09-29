package p000;

import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import androidx.compose.runtime.internal.C0282a;

/* JADX INFO: loaded from: classes2.dex */
public abstract class bpb {

    /* JADX INFO: renamed from: a */
    public static final C0282a f8842a = new C0282a(234714054, false, new kd1(24));

    /* JADX INFO: renamed from: b */
    public static final C0282a f8843b = new C0282a(1262969958, false, new kd1(25));

    /* JADX INFO: renamed from: a */
    public static void m4037a(a34 a34Var, xb7 xb7Var) {
        LogSessionId logSessionIdM24439a = xb7Var.m24439a();
        LogSessionId unused = LogSessionId.LOG_SESSION_ID_NONE;
        if (logSessionIdM24439a.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
            return;
        }
        ((MediaFormat) a34Var.f174b).setString("log-session-id", logSessionIdM24439a.getStringId());
    }
}
