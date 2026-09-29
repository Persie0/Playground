package p000;

import kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class rn1 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f59571a;

    static {
        int[] iArr = new int[CoroutineScheduler$WorkerState.values().length];
        try {
            iArr[CoroutineScheduler$WorkerState.PARKING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[CoroutineScheduler$WorkerState.BLOCKING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[CoroutineScheduler$WorkerState.CPU_ACQUIRED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[CoroutineScheduler$WorkerState.DORMANT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[CoroutineScheduler$WorkerState.TERMINATED.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f59571a = iArr;
    }
}
