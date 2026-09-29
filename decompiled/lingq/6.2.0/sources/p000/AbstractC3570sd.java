package p000;

import com.lingq.core.premium.upgrade.AiVoiceSampleState;

/* JADX INFO: renamed from: sd */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC3570sd {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f60702a;

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
        f60702a = iArr;
    }
}
