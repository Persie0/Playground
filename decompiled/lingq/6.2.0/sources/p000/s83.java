package p000;

import kotlinx.coroutines.flow.SharingCommand;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class s83 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f60507a;

    static {
        int[] iArr = new int[SharingCommand.values().length];
        try {
            iArr[SharingCommand.START.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SharingCommand.STOP.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[SharingCommand.STOP_AND_RESET_REPLAY_CACHE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f60507a = iArr;
    }
}
