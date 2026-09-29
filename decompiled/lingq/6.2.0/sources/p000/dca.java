package p000;

import androidx.room.ObservedTableStates$ObserveOp;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class dca {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f35409a;

    static {
        int[] iArr = new int[ObservedTableStates$ObserveOp.values().length];
        try {
            iArr[ObservedTableStates$ObserveOp.NO_OP.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ObservedTableStates$ObserveOp.ADD.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ObservedTableStates$ObserveOp.REMOVE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f35409a = iArr;
    }
}
