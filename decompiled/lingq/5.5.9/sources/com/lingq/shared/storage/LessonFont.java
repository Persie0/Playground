package com.lingq.shared.storage;

import androidx.annotation.Keep;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.uimodel.LanguageLearn;
import com.lingq.shared.uimodel.LanguageLearnBeta;
import dm.C5207g;
import dm.C5209i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import km.InterfaceC6719b;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p096ei.C5408a;
import p385sf.C9000b;
import tl.C9325m;

/* JADX INFO: loaded from: classes.dex */
@Keep
@Metadata(m13364d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b2\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u000e2\u00020\u0001:'\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-./012345B!\b\u0004\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\f\u0010\rR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\u0082\u0001&6789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[¨\u0006\\"}, m13365d2 = {"Lcom/lingq/shared/storage/LessonFont;", "", "", "", "languages", "Ljava/util/List;", "getLanguages", "()Ljava/util/List;", "title", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "Companion", "Adys", "Bodoni", "a", "Inter", "Lora", "NanumGothicCoding", "NanumGothicCodingBold", "NewYork", "NotoKufiArabic", "NotoNaskhArabic", "NotoSansArabic", "NotoSansCantonese", "NotoSansCantoneseBold", "NotoSansChineseTraditional", "NotoSansChineseTraditionalBold", "NotoSansJapanese", "NotoSansJapaneseBold", "NotoSansKorea", "NotoSansKoreaBold", "NotoSansSimplifiedChinese", "NotoSansSimplifiedChineseBold", "NotoSerifCantonese", "NotoSerifCantoneseBold", "NotoSerifChineseTraditional", "NotoSerifChineseTraditionalBold", "NotoSerifJapanese", "NotoSerifJapaneseBold", "NotoSerifKorea", "NotoSerifKoreaBold", "NotoSerifSimplifiedChinese", "NotoSerifSimplifiedChineseBold", "OpenSans", "Poppins", "Rubik", "RubikBold", "Spectral", "Sunflower", "SunflowerBold", "System", "Lcom/lingq/shared/storage/LessonFont$Adys;", "Lcom/lingq/shared/storage/LessonFont$Bodoni;", "Lcom/lingq/shared/storage/LessonFont$Inter;", "Lcom/lingq/shared/storage/LessonFont$Lora;", "Lcom/lingq/shared/storage/LessonFont$NanumGothicCoding;", "Lcom/lingq/shared/storage/LessonFont$NanumGothicCodingBold;", "Lcom/lingq/shared/storage/LessonFont$NewYork;", "Lcom/lingq/shared/storage/LessonFont$NotoKufiArabic;", "Lcom/lingq/shared/storage/LessonFont$NotoNaskhArabic;", "Lcom/lingq/shared/storage/LessonFont$NotoSansArabic;", "Lcom/lingq/shared/storage/LessonFont$NotoSansCantonese;", "Lcom/lingq/shared/storage/LessonFont$NotoSansCantoneseBold;", "Lcom/lingq/shared/storage/LessonFont$NotoSansChineseTraditional;", "Lcom/lingq/shared/storage/LessonFont$NotoSansChineseTraditionalBold;", "Lcom/lingq/shared/storage/LessonFont$NotoSansJapanese;", "Lcom/lingq/shared/storage/LessonFont$NotoSansJapaneseBold;", "Lcom/lingq/shared/storage/LessonFont$NotoSansKorea;", "Lcom/lingq/shared/storage/LessonFont$NotoSansKoreaBold;", "Lcom/lingq/shared/storage/LessonFont$NotoSansSimplifiedChinese;", "Lcom/lingq/shared/storage/LessonFont$NotoSansSimplifiedChineseBold;", "Lcom/lingq/shared/storage/LessonFont$NotoSerifCantonese;", "Lcom/lingq/shared/storage/LessonFont$NotoSerifCantoneseBold;", "Lcom/lingq/shared/storage/LessonFont$NotoSerifChineseTraditional;", "Lcom/lingq/shared/storage/LessonFont$NotoSerifChineseTraditionalBold;", "Lcom/lingq/shared/storage/LessonFont$NotoSerifJapanese;", "Lcom/lingq/shared/storage/LessonFont$NotoSerifJapaneseBold;", "Lcom/lingq/shared/storage/LessonFont$NotoSerifKorea;", "Lcom/lingq/shared/storage/LessonFont$NotoSerifKoreaBold;", "Lcom/lingq/shared/storage/LessonFont$NotoSerifSimplifiedChinese;", "Lcom/lingq/shared/storage/LessonFont$NotoSerifSimplifiedChineseBold;", "Lcom/lingq/shared/storage/LessonFont$OpenSans;", "Lcom/lingq/shared/storage/LessonFont$Poppins;", "Lcom/lingq/shared/storage/LessonFont$Rubik;", "Lcom/lingq/shared/storage/LessonFont$RubikBold;", "Lcom/lingq/shared/storage/LessonFont$Spectral;", "Lcom/lingq/shared/storage/LessonFont$Sunflower;", "Lcom/lingq/shared/storage/LessonFont$SunflowerBold;", "Lcom/lingq/shared/storage/LessonFont$System;", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public abstract class LessonFont {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    private final List<String> languages;
    private final String title;

    @Keep
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m13365d2 = {"Lcom/lingq/shared/storage/LessonFont$Adys;", "Lcom/lingq/shared/storage/LessonFont;", "()V", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
    public static final class Adys extends LessonFont {
        public static final Adys INSTANCE = new Adys();

        private Adys() {
            super(null, "Adys", 1, null);
        }
    }

    @Keep
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m13365d2 = {"Lcom/lingq/shared/storage/LessonFont$Bodoni;", "Lcom/lingq/shared/storage/LessonFont;", "()V", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
    public static final class Bodoni extends LessonFont {
        public static final Bodoni INSTANCE = new Bodoni();

        private Bodoni() {
            super(null, "Bodoni", 1, null);
        }
    }

    @Keep
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m13365d2 = {"Lcom/lingq/shared/storage/LessonFont$Inter;", "Lcom/lingq/shared/storage/LessonFont;", "()V", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
    public static final class Inter extends LessonFont {
        public static final Inter INSTANCE = new Inter();

        private Inter() {
            super(null, "Inter", 1, null);
        }
    }

    @Keep
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m13365d2 = {"Lcom/lingq/shared/storage/LessonFont$Lora;", "Lcom/lingq/shared/storage/LessonFont;", "()V", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
    public static final class Lora extends LessonFont {
        public static final Lora INSTANCE = new Lora();

        private Lora() {
            super(null, "Lora", 1, null);
        }
    }

    @Keep
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m13365d2 = {"Lcom/lingq/shared/storage/LessonFont$NanumGothicCoding;", "Lcom/lingq/shared/storage/LessonFont;", "()V", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
    public static final class NanumGothicCoding extends LessonFont {
        public static final NanumGothicCoding INSTANCE = new NanumGothicCoding();

        private NanumGothicCoding() {
            super(C9000b.m17251q(C5408a.m11569b(LanguageLearn.Korean)), "Nanum Gothic", null);
        }
    }

    @Keep
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m13365d2 = {"Lcom/lingq/shared/storage/LessonFont$NanumGothicCodingBold;", "Lcom/lingq/shared/storage/LessonFont;", "()V", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
    public static final class NanumGothicCodingBold extends LessonFont {
        public static final NanumGothicCodingBold INSTANCE = new NanumGothicCodingBold();

        private NanumGothicCodingBold() {
            super(C9000b.m17251q(C5408a.m11569b(LanguageLearn.Korean)), "Nanum Gothic Bold", null);
        }
    }

    @Keep
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m13365d2 = {"Lcom/lingq/shared/storage/LessonFont$NewYork;", "Lcom/lingq/shared/storage/LessonFont;", "()V", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
    public static final class NewYork extends LessonFont {
        public static final NewYork INSTANCE = new NewYork();

        private NewYork() {
            super(null, "New York", 1, null);
        }
    }

    @Keep
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m13365d2 = {"Lcom/lingq/shared/storage/LessonFont$NotoKufiArabic;", "Lcom/lingq/shared/storage/LessonFont;", "()V", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
    public static final class NotoKufiArabic extends LessonFont {
        public static final NotoKufiArabic INSTANCE = new NotoKufiArabic();

        private NotoKufiArabic() {
            super(C9000b.m17252r(C5408a.m11569b(LanguageLearn.Arabic), C5408a.m11570c(LanguageLearnBeta.Farsi)), "Noto Kufi", null);
        }
    }

    @Keep
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m13365d2 = {"Lcom/lingq/shared/storage/LessonFont$NotoNaskhArabic;", "Lcom/lingq/shared/storage/LessonFont;", "()V", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
    public static final class NotoNaskhArabic extends LessonFont {
        public static final NotoNaskhArabic INSTANCE = new NotoNaskhArabic();

        private NotoNaskhArabic() {
            super(C9000b.m17252r(C5408a.m11569b(LanguageLearn.Arabic), C5408a.m11570c(LanguageLearnBeta.Farsi)), "Noto Naskh", null);
        }
    }

    @Keep
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m13365d2 = {"Lcom/lingq/shared/storage/LessonFont$NotoSansArabic;", "Lcom/lingq/shared/storage/LessonFont;", "()V", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
    public static final class NotoSansArabic extends LessonFont {
        public static final NotoSansArabic INSTANCE = new NotoSansArabic();

        private NotoSansArabic() {
            super(C9000b.m17252r(C5408a.m11569b(LanguageLearn.Arabic), C5408a.m11570c(LanguageLearnBeta.Farsi)), "Noto Sans", null);
        }
    }

    @Keep
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m13365d2 = {"Lcom/lingq/shared/storage/LessonFont$NotoSansCantonese;", "Lcom/lingq/shared/storage/LessonFont;", "()V", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
    public static final class NotoSansCantonese extends LessonFont {
        public static final NotoSansCantonese INSTANCE = new NotoSansCantonese();

        private NotoSansCantonese() {
            super(C9000b.m17251q(C5408a.m11570c(LanguageLearnBeta.Cantonese)), "Noto Sans", null);
        }
    }

    @Keep
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m13365d2 = {"Lcom/lingq/shared/storage/LessonFont$NotoSansCantoneseBold;", "Lcom/lingq/shared/storage/LessonFont;", "()V", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
    public static final class NotoSansCantoneseBold extends LessonFont {
        public static final NotoSansCantoneseBold INSTANCE = new NotoSansCantoneseBold();

        private NotoSansCantoneseBold() {
            super(C9000b.m17251q(C5408a.m11570c(LanguageLearnBeta.Cantonese)), "Noto Sans Bold", null);
        }
    }

    @Keep
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m13365d2 = {"Lcom/lingq/shared/storage/LessonFont$NotoSansChineseTraditional;", "Lcom/lingq/shared/storage/LessonFont;", "()V", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
    public static final class NotoSansChineseTraditional extends LessonFont {
        public static final NotoSansChineseTraditional INSTANCE = new NotoSansChineseTraditional();

        private NotoSansChineseTraditional() {
            super(C9000b.m17251q(C5408a.m11570c(LanguageLearnBeta.ChineseTraditional)), "Noto Sans", null);
        }
    }

    @Keep
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m13365d2 = {"Lcom/lingq/shared/storage/LessonFont$NotoSansChineseTraditionalBold;", "Lcom/lingq/shared/storage/LessonFont;", "()V", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
    public static final class NotoSansChineseTraditionalBold extends LessonFont {
        public static final NotoSansChineseTraditionalBold INSTANCE = new NotoSansChineseTraditionalBold();

        private NotoSansChineseTraditionalBold() {
            super(C9000b.m17251q(C5408a.m11570c(LanguageLearnBeta.ChineseTraditional)), "Noto Sans Bold", null);
        }
    }

    @Keep
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m13365d2 = {"Lcom/lingq/shared/storage/LessonFont$NotoSansJapanese;", "Lcom/lingq/shared/storage/LessonFont;", "()V", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
    public static final class NotoSansJapanese extends LessonFont {
        public static final NotoSansJapanese INSTANCE = new NotoSansJapanese();

        private NotoSansJapanese() {
            super(C9000b.m17251q(C5408a.m11569b(LanguageLearn.Japanese)), "Noto Sans", null);
        }
    }

    @Keep
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m13365d2 = {"Lcom/lingq/shared/storage/LessonFont$NotoSansJapaneseBold;", "Lcom/lingq/shared/storage/LessonFont;", "()V", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
    public static final class NotoSansJapaneseBold extends LessonFont {
        public static final NotoSansJapaneseBold INSTANCE = new NotoSansJapaneseBold();

        private NotoSansJapaneseBold() {
            super(C9000b.m17251q(C5408a.m11569b(LanguageLearn.Japanese)), "Noto Sans Bold", null);
        }
    }

    @Keep
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m13365d2 = {"Lcom/lingq/shared/storage/LessonFont$NotoSansKorea;", "Lcom/lingq/shared/storage/LessonFont;", "()V", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
    public static final class NotoSansKorea extends LessonFont {
        public static final NotoSansKorea INSTANCE = new NotoSansKorea();

        private NotoSansKorea() {
            super(C9000b.m17251q(C5408a.m11569b(LanguageLearn.Korean)), "Noto Sans", null);
        }
    }

    @Keep
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m13365d2 = {"Lcom/lingq/shared/storage/LessonFont$NotoSansKoreaBold;", "Lcom/lingq/shared/storage/LessonFont;", "()V", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
    public static final class NotoSansKoreaBold extends LessonFont {
        public static final NotoSansKoreaBold INSTANCE = new NotoSansKoreaBold();

        private NotoSansKoreaBold() {
            super(C9000b.m17251q(C5408a.m11569b(LanguageLearn.Korean)), "Noto Sans Bold", null);
        }
    }

    @Keep
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m13365d2 = {"Lcom/lingq/shared/storage/LessonFont$NotoSansSimplifiedChinese;", "Lcom/lingq/shared/storage/LessonFont;", "()V", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
    public static final class NotoSansSimplifiedChinese extends LessonFont {
        public static final NotoSansSimplifiedChinese INSTANCE = new NotoSansSimplifiedChinese();

        private NotoSansSimplifiedChinese() {
            super(C9000b.m17251q(C5408a.m11569b(LanguageLearn.Mandarin)), "Noto Sans", null);
        }
    }

    @Keep
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m13365d2 = {"Lcom/lingq/shared/storage/LessonFont$NotoSansSimplifiedChineseBold;", "Lcom/lingq/shared/storage/LessonFont;", "()V", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
    public static final class NotoSansSimplifiedChineseBold extends LessonFont {
        public static final NotoSansSimplifiedChineseBold INSTANCE = new NotoSansSimplifiedChineseBold();

        private NotoSansSimplifiedChineseBold() {
            super(C9000b.m17251q(C5408a.m11569b(LanguageLearn.Mandarin)), "Noto Sans Bold", null);
        }
    }

    @Keep
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m13365d2 = {"Lcom/lingq/shared/storage/LessonFont$NotoSerifCantonese;", "Lcom/lingq/shared/storage/LessonFont;", "()V", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
    public static final class NotoSerifCantonese extends LessonFont {
        public static final NotoSerifCantonese INSTANCE = new NotoSerifCantonese();

        private NotoSerifCantonese() {
            super(C9000b.m17251q(C5408a.m11570c(LanguageLearnBeta.Cantonese)), "Noto Serif", null);
        }
    }

    @Keep
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m13365d2 = {"Lcom/lingq/shared/storage/LessonFont$NotoSerifCantoneseBold;", "Lcom/lingq/shared/storage/LessonFont;", "()V", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
    public static final class NotoSerifCantoneseBold extends LessonFont {
        public static final NotoSerifCantoneseBold INSTANCE = new NotoSerifCantoneseBold();

        private NotoSerifCantoneseBold() {
            super(C9000b.m17251q(C5408a.m11570c(LanguageLearnBeta.Cantonese)), "Noto Serif Bold", null);
        }
    }

    @Keep
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m13365d2 = {"Lcom/lingq/shared/storage/LessonFont$NotoSerifChineseTraditional;", "Lcom/lingq/shared/storage/LessonFont;", "()V", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
    public static final class NotoSerifChineseTraditional extends LessonFont {
        public static final NotoSerifChineseTraditional INSTANCE = new NotoSerifChineseTraditional();

        private NotoSerifChineseTraditional() {
            super(C9000b.m17251q(C5408a.m11570c(LanguageLearnBeta.ChineseTraditional)), "Noto Serif", null);
        }
    }

    @Keep
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m13365d2 = {"Lcom/lingq/shared/storage/LessonFont$NotoSerifChineseTraditionalBold;", "Lcom/lingq/shared/storage/LessonFont;", "()V", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
    public static final class NotoSerifChineseTraditionalBold extends LessonFont {
        public static final NotoSerifChineseTraditionalBold INSTANCE = new NotoSerifChineseTraditionalBold();

        private NotoSerifChineseTraditionalBold() {
            super(C9000b.m17251q(C5408a.m11570c(LanguageLearnBeta.ChineseTraditional)), "Noto Serif Bold", null);
        }
    }

    @Keep
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m13365d2 = {"Lcom/lingq/shared/storage/LessonFont$NotoSerifJapanese;", "Lcom/lingq/shared/storage/LessonFont;", "()V", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
    public static final class NotoSerifJapanese extends LessonFont {
        public static final NotoSerifJapanese INSTANCE = new NotoSerifJapanese();

        private NotoSerifJapanese() {
            super(C9000b.m17251q(C5408a.m11569b(LanguageLearn.Japanese)), "Noto Serif", null);
        }
    }

    @Keep
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m13365d2 = {"Lcom/lingq/shared/storage/LessonFont$NotoSerifJapaneseBold;", "Lcom/lingq/shared/storage/LessonFont;", "()V", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
    public static final class NotoSerifJapaneseBold extends LessonFont {
        public static final NotoSerifJapaneseBold INSTANCE = new NotoSerifJapaneseBold();

        private NotoSerifJapaneseBold() {
            super(C9000b.m17251q(C5408a.m11569b(LanguageLearn.Japanese)), "Noto Serif Bold", null);
        }
    }

    @Keep
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m13365d2 = {"Lcom/lingq/shared/storage/LessonFont$NotoSerifKorea;", "Lcom/lingq/shared/storage/LessonFont;", "()V", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
    public static final class NotoSerifKorea extends LessonFont {
        public static final NotoSerifKorea INSTANCE = new NotoSerifKorea();

        private NotoSerifKorea() {
            super(C9000b.m17251q(C5408a.m11569b(LanguageLearn.Korean)), "Noto Serif", null);
        }
    }

    @Keep
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m13365d2 = {"Lcom/lingq/shared/storage/LessonFont$NotoSerifKoreaBold;", "Lcom/lingq/shared/storage/LessonFont;", "()V", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
    public static final class NotoSerifKoreaBold extends LessonFont {
        public static final NotoSerifKoreaBold INSTANCE = new NotoSerifKoreaBold();

        private NotoSerifKoreaBold() {
            super(C9000b.m17251q(C5408a.m11569b(LanguageLearn.Korean)), "Noto Serif Bold", null);
        }
    }

    @Keep
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m13365d2 = {"Lcom/lingq/shared/storage/LessonFont$NotoSerifSimplifiedChinese;", "Lcom/lingq/shared/storage/LessonFont;", "()V", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
    public static final class NotoSerifSimplifiedChinese extends LessonFont {
        public static final NotoSerifSimplifiedChinese INSTANCE = new NotoSerifSimplifiedChinese();

        private NotoSerifSimplifiedChinese() {
            super(C9000b.m17251q(C5408a.m11569b(LanguageLearn.Mandarin)), "Noto Serif", null);
        }
    }

    @Keep
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m13365d2 = {"Lcom/lingq/shared/storage/LessonFont$NotoSerifSimplifiedChineseBold;", "Lcom/lingq/shared/storage/LessonFont;", "()V", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
    public static final class NotoSerifSimplifiedChineseBold extends LessonFont {
        public static final NotoSerifSimplifiedChineseBold INSTANCE = new NotoSerifSimplifiedChineseBold();

        private NotoSerifSimplifiedChineseBold() {
            super(C9000b.m17251q(C5408a.m11569b(LanguageLearn.Mandarin)), "Noto Serif Bold", null);
        }
    }

    @Keep
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m13365d2 = {"Lcom/lingq/shared/storage/LessonFont$OpenSans;", "Lcom/lingq/shared/storage/LessonFont;", "()V", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
    public static final class OpenSans extends LessonFont {
        public static final OpenSans INSTANCE = new OpenSans();

        private OpenSans() {
            super(null, "Open Sans", 1, null);
        }
    }

    @Keep
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m13365d2 = {"Lcom/lingq/shared/storage/LessonFont$Poppins;", "Lcom/lingq/shared/storage/LessonFont;", "()V", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
    public static final class Poppins extends LessonFont {
        public static final Poppins INSTANCE = new Poppins();

        private Poppins() {
            super(null, "Poppins", 1, null);
        }
    }

    @Keep
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m13365d2 = {"Lcom/lingq/shared/storage/LessonFont$Rubik;", "Lcom/lingq/shared/storage/LessonFont;", "()V", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
    public static final class Rubik extends LessonFont {
        public static final Rubik INSTANCE = new Rubik();

        private Rubik() {
            super(null, "Rubik", 1, null);
        }
    }

    @Keep
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m13365d2 = {"Lcom/lingq/shared/storage/LessonFont$RubikBold;", "Lcom/lingq/shared/storage/LessonFont;", "()V", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
    public static final class RubikBold extends LessonFont {
        public static final RubikBold INSTANCE = new RubikBold();

        private RubikBold() {
            super(null, "Rubik Bold", 1, null);
        }
    }

    @Keep
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m13365d2 = {"Lcom/lingq/shared/storage/LessonFont$Spectral;", "Lcom/lingq/shared/storage/LessonFont;", "()V", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
    public static final class Spectral extends LessonFont {
        public static final Spectral INSTANCE = new Spectral();

        private Spectral() {
            super(null, "Spectral", 1, null);
        }
    }

    @Keep
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m13365d2 = {"Lcom/lingq/shared/storage/LessonFont$Sunflower;", "Lcom/lingq/shared/storage/LessonFont;", "()V", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
    public static final class Sunflower extends LessonFont {
        public static final Sunflower INSTANCE = new Sunflower();

        private Sunflower() {
            super(C9000b.m17251q(C5408a.m11570c(LanguageLearnBeta.Cantonese)), "Sunflower", null);
        }
    }

    @Keep
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m13365d2 = {"Lcom/lingq/shared/storage/LessonFont$SunflowerBold;", "Lcom/lingq/shared/storage/LessonFont;", "()V", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
    public static final class SunflowerBold extends LessonFont {
        public static final SunflowerBold INSTANCE = new SunflowerBold();

        private SunflowerBold() {
            super(C9000b.m17251q(C5408a.m11570c(LanguageLearnBeta.Cantonese)), "Sunflower Bold", null);
        }
    }

    @Keep
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m13365d2 = {"Lcom/lingq/shared/storage/LessonFont$System;", "Lcom/lingq/shared/storage/LessonFont;", "()V", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
    public static final class System extends LessonFont {
        public static final System INSTANCE = new System();

        private System() {
            super(null, "System", 1, null);
        }
    }

    /* JADX INFO: renamed from: com.lingq.shared.storage.LessonFont$a, reason: from kotlin metadata */
    public static final class Companion {
        /* JADX INFO: renamed from: a */
        public static LessonFont m9551a(String str) {
            Object next;
            LessonFont lessonFont;
            C5207g.m11111f(str, "language");
            List listMo10974m = C5209i.m11118a(LessonFont.class).mo10974m();
            ArrayList arrayList = new ArrayList(C9325m.m17681z(listMo10974m, 10));
            Iterator it = listMo10974m.iterator();
            while (it.hasNext()) {
                Object objMo10977q = ((InterfaceC6719b) it.next()).mo10977q();
                C5207g.m11109d(objMo10977q, "null cannot be cast to non-null type com.lingq.shared.storage.LessonFont");
                arrayList.add((LessonFont) objMo10977q);
            }
            Iterator it2 = arrayList.iterator();
            do {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                lessonFont = (LessonFont) next;
            } while (!(lessonFont.getLanguages().contains(str) && C3398a.m9699b(lessonFont)));
            LessonFont lessonFont2 = (LessonFont) next;
            if (lessonFont2 == null) {
                lessonFont2 = Rubik.INSTANCE;
            }
            return lessonFont2;
        }

        /* JADX INFO: renamed from: b */
        public static LessonFont m9552b(String str) {
            Object next;
            C5207g.m11111f(str, "name");
            List listMo10974m = C5209i.m11118a(LessonFont.class).mo10974m();
            ArrayList arrayList = new ArrayList(C9325m.m17681z(listMo10974m, 10));
            Iterator it = listMo10974m.iterator();
            while (it.hasNext()) {
                Object objMo10977q = ((InterfaceC6719b) it.next()).mo10977q();
                C5207g.m11109d(objMo10977q, "null cannot be cast to non-null type com.lingq.shared.storage.LessonFont");
                arrayList.add((LessonFont) objMo10977q);
            }
            Iterator it2 = arrayList.iterator();
            do {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
            } while (!C5207g.m11106a(C3398a.m9700c((LessonFont) next), str));
            LessonFont lessonFont = (LessonFont) next;
            if (lessonFont == null) {
                lessonFont = Rubik.INSTANCE;
            }
            return lessonFont;
        }

        /* JADX INFO: renamed from: c */
        public static ArrayList m9553c(String str) {
            C5207g.m11111f(str, "language");
            List listMo10974m = C5209i.m11118a(LessonFont.class).mo10974m();
            ArrayList arrayList = new ArrayList(C9325m.m17681z(listMo10974m, 10));
            Iterator it = listMo10974m.iterator();
            while (it.hasNext()) {
                Object objMo10977q = ((InterfaceC6719b) it.next()).mo10977q();
                C5207g.m11109d(objMo10977q, "null cannot be cast to non-null type com.lingq.shared.storage.LessonFont");
                arrayList.add((LessonFont) objMo10977q);
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                LessonFont lessonFont = (LessonFont) obj;
                if (C5207g.m11106a(str, C5408a.m11569b(LanguageLearn.Japanese)) ? true : C5207g.m11106a(str, C5408a.m11569b(LanguageLearn.Arabic)) ? true : C5207g.m11106a(str, C5408a.m11570c(LanguageLearnBeta.Farsi)) ? true : C5207g.m11106a(str, C5408a.m11569b(LanguageLearn.Mandarin)) ? true : C5207g.m11106a(str, C5408a.m11570c(LanguageLearnBeta.Cantonese)) ? true : C5207g.m11106a(str, C5408a.m11570c(LanguageLearnBeta.ChineseTraditional)) ? true : C5207g.m11106a(str, C5408a.m11569b(LanguageLearn.Korean)) ? lessonFont.getLanguages().contains(str) : lessonFont.getLanguages().isEmpty()) {
                    arrayList2.add(obj);
                }
            }
            return arrayList2;
        }
    }

    private LessonFont(List<String> list, String str) {
        this.languages = list;
        this.title = str;
    }

    public LessonFont(List list, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? EmptyList.f38032a : list, str, null);
    }

    public /* synthetic */ LessonFont(List list, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, str);
    }

    public final List<String> getLanguages() {
        return this.languages;
    }

    public final String getTitle() {
        return this.title;
    }
}
