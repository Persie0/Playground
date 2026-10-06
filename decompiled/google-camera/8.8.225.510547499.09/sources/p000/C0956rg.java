package p000;

import android.os.HandlerThread;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: rg */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class C0956rg {

    /* JADX INFO: renamed from: a */
    private final Executor f47543a;

    /* JADX INFO: renamed from: b */
    private final Executor f47544b;

    /* JADX INFO: renamed from: c */
    private final Executor f47545c;

    /* JADX INFO: renamed from: d */
    private final Executor f47546d;

    /* JADX INFO: renamed from: e */
    private final HandlerThread f47547e;

    /* JADX INFO: renamed from: f */
    private final oqo f47548f;

    /* JADX INFO: renamed from: g */
    private final oqs f47549g;

    public C0956rg() {
        this(null);
    }

    public /* synthetic */ C0956rg(byte[] bArr) {
        this.f47543a = null;
        this.f47544b = null;
        this.f47545c = null;
        this.f47546d = null;
        this.f47547e = null;
        this.f47548f = null;
        this.f47549g = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0956rg)) {
            return false;
        }
        C0956rg c0956rg = (C0956rg) obj;
        Executor executor = c0956rg.f47543a;
        if (!ooc.m18737c(null, null)) {
            return false;
        }
        Executor executor2 = c0956rg.f47544b;
        if (!ooc.m18737c(null, null)) {
            return false;
        }
        Executor executor3 = c0956rg.f47545c;
        if (!ooc.m18737c(null, null)) {
            return false;
        }
        Executor executor4 = c0956rg.f47546d;
        if (!ooc.m18737c(null, null)) {
            return false;
        }
        HandlerThread handlerThread = c0956rg.f47547e;
        if (!ooc.m18737c(null, null)) {
            return false;
        }
        oqo oqoVar = c0956rg.f47548f;
        if (!ooc.m18737c(null, null)) {
            return false;
        }
        oqs oqsVar = c0956rg.f47549g;
        return ooc.m18737c(null, null);
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        return "ThreadConfig(defaultLightweightExecutor=" + ((Object) null) + ", defaultBackgroundExecutor=" + ((Object) null) + ", defaultBlockingExecutor=" + ((Object) null) + ", defaultCameraExecutor=" + ((Object) null) + ", defaultCameraHandler=" + ((Object) null) + ", testOnlyDispatcher=" + ((Object) null) + ", testOnlyScope=" + ((Object) null) + ')';
    }
}
