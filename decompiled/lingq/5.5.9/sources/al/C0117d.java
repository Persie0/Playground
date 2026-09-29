package al;

import com.tonyodev.fetch2.Status;

/* JADX INFO: renamed from: al.d */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C0117d {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f293a;

    static {
        int[] iArr = new int[Status.values().length];
        f293a = iArr;
        Status status = Status.ADDED;
        iArr[status.ordinal()] = 1;
        Status status2 = Status.QUEUED;
        iArr[status2.ordinal()] = 2;
        Status status3 = Status.COMPLETED;
        iArr[status3.ordinal()] = 3;
        int[] iArr2 = new int[Status.values().length];
        iArr2[status3.ordinal()] = 1;
        iArr2[Status.FAILED.ordinal()] = 2;
        iArr2[Status.CANCELLED.ordinal()] = 3;
        iArr2[Status.DELETED.ordinal()] = 4;
        iArr2[Status.PAUSED.ordinal()] = 5;
        iArr2[status2.ordinal()] = 6;
        iArr2[Status.REMOVED.ordinal()] = 7;
        iArr2[Status.DOWNLOADING.ordinal()] = 8;
        iArr2[status.ordinal()] = 9;
        iArr2[Status.NONE.ordinal()] = 10;
    }
}
