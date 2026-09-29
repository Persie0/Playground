package p489xk;

import com.tonyodev.fetch2.Status;

/* JADX INFO: renamed from: xk.h */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C10220h {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f51637a;

    static {
        int[] iArr = new int[Status.values().length];
        f51637a = iArr;
        iArr[Status.COMPLETED.ordinal()] = 1;
        iArr[Status.DOWNLOADING.ordinal()] = 2;
        iArr[Status.QUEUED.ordinal()] = 3;
        iArr[Status.PAUSED.ordinal()] = 4;
        iArr[Status.CANCELLED.ordinal()] = 5;
        iArr[Status.FAILED.ordinal()] = 6;
        iArr[Status.ADDED.ordinal()] = 7;
        iArr[Status.NONE.ordinal()] = 8;
        iArr[Status.DELETED.ordinal()] = 9;
        iArr[Status.REMOVED.ordinal()] = 10;
    }
}
