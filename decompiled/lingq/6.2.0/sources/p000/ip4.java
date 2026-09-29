package p000;

import com.lingq.core.domain.model.language.LanguageProgressPeriod;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class ip4 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f44394a;

    static {
        int[] iArr = new int[LanguageProgressPeriod.values().length];
        try {
            iArr[LanguageProgressPeriod.Today.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[LanguageProgressPeriod.AllTime.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f44394a = iArr;
    }
}
