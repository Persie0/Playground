package p099el;

import com.tonyodev.fetch2.Status;

/* JADX INFO: renamed from: el.c */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5428c {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f33973a;

    static {
        int[] iArr = new int[Status.values().length];
        iArr[Status.DOWNLOADING.ordinal()] = 1;
        Status status = Status.QUEUED;
        iArr[status.ordinal()] = 2;
        int[] iArr2 = new int[Status.values().length];
        Status status2 = Status.ADDED;
        iArr2[status2.ordinal()] = 1;
        iArr2[status.ordinal()] = 2;
        iArr2[Status.PAUSED.ordinal()] = 3;
        int[] iArr3 = new int[Status.values().length];
        iArr3[status2.ordinal()] = 1;
        Status status3 = Status.FAILED;
        iArr3[status3.ordinal()] = 2;
        iArr3[Status.CANCELLED.ordinal()] = 3;
        int[] iArr4 = new int[Status.values().length];
        f33973a = iArr4;
        iArr4[Status.COMPLETED.ordinal()] = 1;
        iArr4[Status.NONE.ordinal()] = 2;
        iArr4[status3.ordinal()] = 3;
    }
}
