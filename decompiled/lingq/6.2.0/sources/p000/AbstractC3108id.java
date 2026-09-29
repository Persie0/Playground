package p000;

import com.lingq.core.premium.upgrade.AiVoiceSampleState;

/* JADX INFO: renamed from: id */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC3108id {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f43949a;

    static {
        int[] iArr = new int[AiVoiceSampleState.values().length];
        try {
            iArr[AiVoiceSampleState.Loading.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[AiVoiceSampleState.Playing.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[AiVoiceSampleState.Idle.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f43949a = iArr;
    }
}
