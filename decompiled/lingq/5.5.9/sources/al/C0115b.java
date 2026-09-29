package al;

import com.tonyodev.fetch2.EnqueueAction;
import com.tonyodev.fetch2.Status;

/* JADX INFO: renamed from: al.b */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C0115b {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f278a;

    static {
        int[] iArr = new int[EnqueueAction.values().length];
        f278a = iArr;
        iArr[EnqueueAction.UPDATE_ACCORDINGLY.ordinal()] = 1;
        iArr[EnqueueAction.DO_NOT_ENQUEUE_IF_EXISTING.ordinal()] = 2;
        iArr[EnqueueAction.REPLACE_EXISTING.ordinal()] = 3;
        iArr[EnqueueAction.INCREMENT_FILE_NAME.ordinal()] = 4;
        int[] iArr2 = new int[Status.values().length];
        iArr2[Status.COMPLETED.ordinal()] = 1;
        iArr2[Status.FAILED.ordinal()] = 2;
        iArr2[Status.CANCELLED.ordinal()] = 3;
        iArr2[Status.DELETED.ordinal()] = 4;
        iArr2[Status.PAUSED.ordinal()] = 5;
        iArr2[Status.QUEUED.ordinal()] = 6;
        iArr2[Status.REMOVED.ordinal()] = 7;
        iArr2[Status.DOWNLOADING.ordinal()] = 8;
        iArr2[Status.ADDED.ordinal()] = 9;
        iArr2[Status.NONE.ordinal()] = 10;
    }
}
