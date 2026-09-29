package p000;

import com.lingq.core.analytics.data.modules.ChatEngagedDataType;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class xv0 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f68838a;

    static {
        int[] iArr = new int[ChatEngagedDataType.values().length];
        try {
            iArr[ChatEngagedDataType.BlueWordsClicked.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ChatEngagedDataType.CoinsEarned.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ChatEngagedDataType.KnownWordsAdded.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ChatEngagedDataType.KnownWordsClicked.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[ChatEngagedDataType.LingqsCreated.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[ChatEngagedDataType.NthLingqsCreated.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[ChatEngagedDataType.WordsRead.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[ChatEngagedDataType.WordsWritten.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[ChatEngagedDataType.TimeSpentListening.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[ChatEngagedDataType.UserResponses.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        f68838a = iArr;
    }
}
