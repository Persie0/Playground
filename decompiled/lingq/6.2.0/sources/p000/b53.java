package p000;

/* JADX INFO: loaded from: classes.dex */
public final class b53 extends z67 {

    /* JADX INFO: renamed from: c */
    public static final C3723wi f7957c = C3723wi.m23970d();

    /* JADX INFO: renamed from: b */
    public final C3435ot f7958b;

    public b53(C3435ot c3435ot) {
        this.f7958b = c3435ot;
    }

    @Override // p000.z67
    /* JADX INFO: renamed from: a */
    public final boolean mo3300a() {
        C3723wi c3723wi = f7957c;
        C3435ot c3435ot = this.f7958b;
        if (c3435ot == null) {
            c3723wi.m23975f("ApplicationInfo is null");
        } else if (!c3435ot.m18473C()) {
            c3723wi.m23975f("GoogleAppId is null");
        } else if (!c3435ot.m18471A()) {
            c3723wi.m23975f("AppInstanceId is null");
        } else if (!c3435ot.m18472B()) {
            c3723wi.m23975f("ApplicationProcessState is null");
        } else {
            if (!c3435ot.m18475z()) {
                return true;
            }
            if (!c3435ot.m18474x().m16817w()) {
                c3723wi.m23975f("AndroidAppInfo.packageName is null");
            } else {
                if (c3435ot.m18474x().m16818x()) {
                    return true;
                }
                c3723wi.m23975f("AndroidAppInfo.sdkVersion is null");
            }
        }
        c3723wi.m23975f("ApplicationInfo is invalid");
        return false;
    }
}
