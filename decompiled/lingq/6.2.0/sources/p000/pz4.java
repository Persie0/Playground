package p000;

import com.lingq.feature.reader.stats.domain.LessonCoachChatResult;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class pz4 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f57030a;

    static {
        int[] iArr = new int[LessonCoachChatResult.values().length];
        try {
            iArr[LessonCoachChatResult.OutOfCredits.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[LessonCoachChatResult.Failed.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[LessonCoachChatResult.Created.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f57030a = iArr;
    }
}
