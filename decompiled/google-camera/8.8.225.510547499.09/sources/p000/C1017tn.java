package p000;

/* JADX INFO: renamed from: tn */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class C1017tn extends C0748jo {

    /* JADX INFO: renamed from: a */
    public final C0947qy f47676a;

    /* JADX INFO: renamed from: b */
    private final String f47677b;

    /* JADX INFO: renamed from: c */
    private final Integer f47678c;

    /* JADX INFO: renamed from: d */
    private final C1068vk f47679d;

    /* JADX INFO: renamed from: e */
    private final Throwable f47680e;

    /* JADX INFO: renamed from: f */
    private final C1068vk f47681f;

    /* JADX INFO: renamed from: g */
    private final C1068vk f47682g;

    /* JADX INFO: renamed from: h */
    private final C1068vk f47683h;

    /* JADX INFO: renamed from: i */
    private final int f47684i;

    public C1017tn(String str, int i, Integer num, C1068vk c1068vk, Throwable th, C1068vk c1068vk2, C1068vk c1068vk3, C1068vk c1068vk4, C0947qy c0947qy) {
        this.f47677b = str;
        this.f47684i = i;
        this.f47678c = num;
        this.f47679d = c1068vk;
        this.f47680e = th;
        this.f47681f = c1068vk2;
        this.f47682g = c1068vk3;
        this.f47683h = c1068vk4;
        this.f47676a = c0947qy;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1017tn)) {
            return false;
        }
        C1017tn c1017tn = (C1017tn) obj;
        return ooc.m18737c(this.f47677b, c1017tn.f47677b) && this.f47684i == c1017tn.f47684i && ooc.m18737c(this.f47678c, c1017tn.f47678c) && ooc.m18737c(this.f47679d, c1017tn.f47679d) && ooc.m18737c(this.f47680e, c1017tn.f47680e) && ooc.m18737c(this.f47681f, c1017tn.f47681f) && ooc.m18737c(this.f47682g, c1017tn.f47682g) && ooc.m18737c(this.f47683h, c1017tn.f47683h) && ooc.m18737c(this.f47676a, c1017tn.f47676a);
    }

    public final int hashCode() {
        int iHashCode = (this.f47677b.hashCode() * 31) + this.f47684i;
        Integer num = this.f47678c;
        int iHashCode2 = ((iHashCode * 31) + (num == null ? 0 : num.hashCode())) * 31;
        C1068vk c1068vk = this.f47679d;
        int iM15550b = (iHashCode2 + (c1068vk == null ? 0 : C0798lk.m15550b(c1068vk.f47849a))) * 31;
        Throwable th = this.f47680e;
        int iHashCode3 = (iM15550b + (th == null ? 0 : th.hashCode())) * 31;
        C1068vk c1068vk2 = this.f47681f;
        int iM15550b2 = (iHashCode3 + (c1068vk2 == null ? 0 : C0798lk.m15550b(c1068vk2.f47849a))) * 31;
        C1068vk c1068vk3 = this.f47682g;
        int iM15550b3 = (iM15550b2 + (c1068vk3 == null ? 0 : C0798lk.m15550b(c1068vk3.f47849a))) * 31;
        C1068vk c1068vk4 = this.f47683h;
        int iM15550b4 = (iM15550b3 + (c1068vk4 == null ? 0 : C0798lk.m15550b(c1068vk4.f47849a))) * 31;
        C0947qy c0947qy = this.f47676a;
        return iM15550b4 + (c0947qy != null ? c0947qy.f47513a : 0);
    }

    public final String toString() {
        return "CameraStateClosed(cameraId=" + ((Object) C0952rc.m19373b(this.f47677b)) + ", cameraClosedReason=" + ((Object) C0771kk.m14404c(this.f47684i)) + ", cameraRetryCount=" + this.f47678c + ", cameraRetryDurationNs=" + this.f47679d + ", cameraException=" + this.f47680e + ", cameraOpenDurationNs=" + this.f47681f + ", cameraActiveDurationNs=" + this.f47682g + ", cameraClosingDurationNs=" + this.f47683h + ", cameraErrorCode=" + this.f47676a + ')';
    }
}
