package p000;

import com.lingq.core.domain.model.audio.AudioFetchErrorType;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class bz7 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f9200a;

    static {
        int[] iArr = new int[AudioFetchErrorType.values().length];
        try {
            iArr[AudioFetchErrorType.NetworkError.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[AudioFetchErrorType.WrongVoice.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[AudioFetchErrorType.NoVoiceAvailable.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[AudioFetchErrorType.TtsApiFailed.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[AudioFetchErrorType.TtsTimeout.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[AudioFetchErrorType.DownloadFailed.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        f9200a = iArr;
    }
}
