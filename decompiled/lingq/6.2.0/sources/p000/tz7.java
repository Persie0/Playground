package p000;

import com.lingq.core.domain.store.AudioUnderlineMode;
import com.lingq.core.settings.ViewKeys;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class tz7 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f63147a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int[] f63148b;

    static {
        int[] iArr = new int[ViewKeys.values().length];
        try {
            iArr[ViewKeys.TTSVoice.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ViewKeys.AddDictionaryLanguage.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ViewKeys.AudioUnderline.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ViewKeys.ChineseType.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[ViewKeys.ChineseTraditionType.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[ViewKeys.JapaneseType.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[ViewKeys.CantoneseType.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[ViewKeys.LatinType.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[ViewKeys.TokenChineseType.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[ViewKeys.TokenChineseTraditionType.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr[ViewKeys.TokenJapaneseType.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr[ViewKeys.TokenCantoneseType.ordinal()] = 12;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr[ViewKeys.TokenLatinType.ordinal()] = 13;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr[ViewKeys.TextHighlightStyle.ordinal()] = 14;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr[ViewKeys.LessonFont.ordinal()] = 15;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr[ViewKeys.UseWebVoices.ordinal()] = 16;
        } catch (NoSuchFieldError unused16) {
        }
        f63147a = iArr;
        int[] iArr2 = new int[AudioUnderlineMode.values().length];
        try {
            iArr2[AudioUnderlineMode.Off.ordinal()] = 1;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr2[AudioUnderlineMode.Static.ordinal()] = 2;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr2[AudioUnderlineMode.Wave.ordinal()] = 3;
        } catch (NoSuchFieldError unused19) {
        }
        f63148b = iArr2;
    }
}
