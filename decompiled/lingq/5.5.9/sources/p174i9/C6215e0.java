package p174i9;

import android.media.metrics.LogSessionId;
import p479xa.C10129a;
import p479xa.C10134c0;

/* JADX INFO: renamed from: i9.e0 */
/* JADX INFO: loaded from: classes.dex */
public final class C6215e0 {

    /* JADX INFO: renamed from: b */
    public static final C6215e0 f36163b;

    /* JADX INFO: renamed from: a */
    public final a f36164a;

    /* JADX INFO: renamed from: i9.e0$a */
    public static final class a {

        /* JADX INFO: renamed from: b */
        public static final a f36165b = new a(LogSessionId.LOG_SESSION_ID_NONE);

        /* JADX INFO: renamed from: a */
        public final LogSessionId f36166a;

        public a(LogSessionId logSessionId) {
            this.f36166a = logSessionId;
        }
    }

    static {
        f36163b = C10134c0.f51354a < 31 ? new C6215e0() : new C6215e0(a.f36165b);
    }

    public C6215e0() {
        this((a) null);
        C10129a.m18992d(C10134c0.f51354a < 31);
    }

    public C6215e0(LogSessionId logSessionId) {
        this(new a(logSessionId));
    }

    public C6215e0(a aVar) {
        this.f36164a = aVar;
    }
}
