package p000;

import android.media.metrics.LogSessionId;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class xb7 {

    /* JADX INFO: renamed from: c */
    public static final xb7 f68028c;

    /* JADX INFO: renamed from: a */
    public final String f68029a;

    /* JADX INFO: renamed from: b */
    public final web f68030b;

    static {
        new xb7("");
        f68028c = new xb7("preload");
    }

    public xb7(String str) {
        web webVar;
        this.f68029a = str;
        if (Build.VERSION.SDK_INT >= 31) {
            webVar = new web();
            webVar.f66742a = LogSessionId.LOG_SESSION_ID_NONE;
        } else {
            webVar = null;
        }
        this.f68030b = webVar;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized LogSessionId m24439a() {
        web webVar;
        webVar = this.f68030b;
        webVar.getClass();
        return (LogSessionId) webVar.f66742a;
    }
}
