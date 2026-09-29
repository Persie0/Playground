package p000;

import com.lingq.core.domain.model.ExportType;
import com.lingq.core.domain.model.FeedTopic;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class ri2 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f59348a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int[] f59349b;

    static {
        int[] iArr = new int[FeedTopic.values().length];
        try {
            iArr[FeedTopic.Books.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[FeedTopic.Food.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[FeedTopic.Podcasts.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[FeedTopic.News.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[FeedTopic.Business.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[FeedTopic.Entertainment.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[FeedTopic.Sports.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[FeedTopic.Technology.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[FeedTopic.Pronunciation.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[FeedTopic.Grammar.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr[FeedTopic.Health.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr[FeedTopic.Science.ordinal()] = 12;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr[FeedTopic.SelfHelp.ordinal()] = 13;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr[FeedTopic.Culture.ordinal()] = 14;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr[FeedTopic.Travel.ordinal()] = 15;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr[FeedTopic.Politics.ordinal()] = 16;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr[FeedTopic.Language.ordinal()] = 17;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr[FeedTopic.Kids.ordinal()] = 18;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr[FeedTopic.History.ordinal()] = 19;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            iArr[FeedTopic.Songs.ordinal()] = 20;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            iArr[FeedTopic.Youtubers.ordinal()] = 21;
        } catch (NoSuchFieldError unused21) {
        }
        f59348a = iArr;
        int[] iArr2 = new int[ExportType.values().length];
        try {
            iArr2[ExportType.CSV.ordinal()] = 1;
        } catch (NoSuchFieldError unused22) {
        }
        try {
            iArr2[ExportType.Anki.ordinal()] = 2;
        } catch (NoSuchFieldError unused23) {
        }
        f59349b = iArr2;
    }
}
