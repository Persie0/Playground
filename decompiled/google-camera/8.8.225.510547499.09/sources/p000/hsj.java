package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class hsj {

    /* JADX INFO: renamed from: a */
    private static final nbh f29409a = nbh.m17259h("com/google/android/apps/camera/tracking/api/TrackingStatus");

    /* JADX INFO: renamed from: a */
    public static int m10695a(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            default:
                ((nbe) ((nbe) f29409a.m17252c()).mo17276G(3939)).mo17291p("Invalid tracking status: %d", i);
                return 1;
        }
    }
}
