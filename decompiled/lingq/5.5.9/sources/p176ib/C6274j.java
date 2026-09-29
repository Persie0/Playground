package p176ib;

import com.google.android.gms.common.internal.RootTelemetryConfiguration;

/* JADX INFO: renamed from: ib.j */
/* JADX INFO: loaded from: classes.dex */
public final class C6274j {

    /* JADX INFO: renamed from: b */
    public static C6274j f36468b;

    /* JADX INFO: renamed from: c */
    public static final RootTelemetryConfiguration f36469c = new RootTelemetryConfiguration(0, 0, 0, false, false);

    /* JADX INFO: renamed from: a */
    public RootTelemetryConfiguration f36470a;

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    public static synchronized C6274j m12918a() {
        try {
            if (f36468b == null) {
                f36468b = new C6274j();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f36468b;
    }
}
