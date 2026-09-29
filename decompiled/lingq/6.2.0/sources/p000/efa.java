package p000;

import com.lingq.core.domain.model.FeedTopic;
import com.lingq.core.domain.model.theme.LqTheme;
import com.lingq.core.p012ui.ImageSize;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class efa {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f37195a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int[] f37196b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ int[] f37197c;

    static {
        int[] iArr = new int[ImageSize.values().length];
        try {
            iArr[ImageSize.Medium.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ImageSize.Large.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ImageSize.Original.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f37195a = iArr;
        int[] iArr2 = new int[LqTheme.values().length];
        try {
            iArr2[LqTheme.Light.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[LqTheme.Dark.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[LqTheme.System.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        f37196b = iArr2;
        int[] iArr3 = new int[FeedTopic.values().length];
        try {
            iArr3[FeedTopic.Books.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr3[FeedTopic.Food.ordinal()] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr3[FeedTopic.Podcasts.ordinal()] = 3;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr3[FeedTopic.News.ordinal()] = 4;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr3[FeedTopic.Business.ordinal()] = 5;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr3[FeedTopic.Entertainment.ordinal()] = 6;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr3[FeedTopic.Sports.ordinal()] = 7;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr3[FeedTopic.Technology.ordinal()] = 8;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr3[FeedTopic.Pronunciation.ordinal()] = 9;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr3[FeedTopic.Grammar.ordinal()] = 10;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr3[FeedTopic.Health.ordinal()] = 11;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr3[FeedTopic.Science.ordinal()] = 12;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr3[FeedTopic.SelfHelp.ordinal()] = 13;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            iArr3[FeedTopic.Culture.ordinal()] = 14;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            iArr3[FeedTopic.Travel.ordinal()] = 15;
        } catch (NoSuchFieldError unused21) {
        }
        try {
            iArr3[FeedTopic.Politics.ordinal()] = 16;
        } catch (NoSuchFieldError unused22) {
        }
        try {
            iArr3[FeedTopic.Language.ordinal()] = 17;
        } catch (NoSuchFieldError unused23) {
        }
        try {
            iArr3[FeedTopic.Kids.ordinal()] = 18;
        } catch (NoSuchFieldError unused24) {
        }
        try {
            iArr3[FeedTopic.History.ordinal()] = 19;
        } catch (NoSuchFieldError unused25) {
        }
        try {
            iArr3[FeedTopic.Songs.ordinal()] = 20;
        } catch (NoSuchFieldError unused26) {
        }
        try {
            iArr3[FeedTopic.Youtubers.ordinal()] = 21;
        } catch (NoSuchFieldError unused27) {
        }
        f37197c = iArr3;
    }
}
