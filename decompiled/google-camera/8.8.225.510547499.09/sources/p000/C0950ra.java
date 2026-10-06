package p000;

/* JADX INFO: renamed from: ra */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class C0950ra {

    /* JADX INFO: renamed from: a */
    private final boolean f47532a;

    /* JADX INFO: renamed from: b */
    private final boolean f47533b;

    /* JADX INFO: renamed from: c */
    private final boolean f47534c;

    public C0950ra() {
        this(null);
    }

    public /* synthetic */ C0950ra(byte[] bArr) {
        this.f47532a = false;
        this.f47533b = false;
        this.f47534c = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0950ra)) {
            return false;
        }
        C0950ra c0950ra = (C0950ra) obj;
        boolean z = c0950ra.f47532a;
        boolean z2 = c0950ra.f47533b;
        boolean z3 = c0950ra.f47534c;
        return true;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        return "Flags(configureBlankSessionOnStop=false, abortCapturesOnStop=false, allowMultipleActiveCameras=false)";
    }
}
