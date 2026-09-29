package com.lingq.core.domain.model.theme;

import com.lingq.core.domain.model.LanguageLearn;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.enums.AbstractC3201a;
import p000.vz1;
import p000.xv7;
import p000.y52;
import p000.ys2;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'NotoSansJapanese' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:399)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:364)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:349)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:315)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:288)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:160)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes.dex */
public final class ReaderFont {
    private static final /* synthetic */ ys2 $ENTRIES;
    private static final /* synthetic */ ReaderFont[] $VALUES;
    public static final xv7 Companion;
    public static final ReaderFont NanumGothicCoding;
    public static final ReaderFont NanumGothicCodingBold;
    public static final ReaderFont NotoKufiArabic;
    public static final ReaderFont NotoNaskhArabic;
    public static final ReaderFont NotoSansArabic;
    public static final ReaderFont NotoSansCantonese;
    public static final ReaderFont NotoSansCantoneseBold;
    public static final ReaderFont NotoSansChineseTraditional;
    public static final ReaderFont NotoSansChineseTraditionalBold;
    public static final ReaderFont NotoSansJapanese;
    public static final ReaderFont NotoSansJapaneseBold;
    public static final ReaderFont NotoSansKorea;
    public static final ReaderFont NotoSansKoreaBold;
    public static final ReaderFont NotoSansSimplifiedChinese;
    public static final ReaderFont NotoSansSimplifiedChineseBold;
    public static final ReaderFont NotoSerifCantonese;
    public static final ReaderFont NotoSerifCantoneseBold;
    public static final ReaderFont NotoSerifChineseTraditional;
    public static final ReaderFont NotoSerifChineseTraditionalBold;
    public static final ReaderFont NotoSerifJapanese;
    public static final ReaderFont NotoSerifJapaneseBold;
    public static final ReaderFont NotoSerifKorea;
    public static final ReaderFont NotoSerifKoreaBold;
    public static final ReaderFont NotoSerifSimplifiedChinese;
    public static final ReaderFont NotoSerifSimplifiedChineseBold;
    public static final ReaderFont Sunflower;
    public static final ReaderFont SunflowerBold;
    private final List<String> languages;
    private final String title;
    public static final ReaderFont DmSans = new ReaderFont("DmSans", 0, null, "DmSans", 1, null);
    public static final ReaderFont DmSansBold = new ReaderFont("DmSansBold", 1, null, "DmSans Bold", 1, null);
    public static final ReaderFont Rubik = new ReaderFont("Rubik", 2, null, "Rubik", 1, null);
    public static final ReaderFont RubikBold = new ReaderFont("RubikBold", 3, null, "Rubik Bold", 1, null);
    public static final ReaderFont System = new ReaderFont("System", 4, null, "System", 1, null);
    public static final ReaderFont SystemBold = new ReaderFont("SystemBold", 5, null, "System Bold", 1, null);
    public static final ReaderFont OpenSans = new ReaderFont("OpenSans", 6, null, "Open Sans", 1, null);
    public static final ReaderFont NewYork = new ReaderFont("NewYork", 7, null, "New York", 1, null);
    public static final ReaderFont Spectral = new ReaderFont("Spectral", 8, null, "Spectral", 1, null);
    public static final ReaderFont Lora = new ReaderFont("Lora", 9, null, "Lora", 1, null);
    public static final ReaderFont Poppins = new ReaderFont("Poppins", 10, null, "Poppins", 1, null);
    public static final ReaderFont Inter = new ReaderFont("Inter", 11, null, "Inter", 1, null);
    public static final ReaderFont Bodoni = new ReaderFont("Bodoni", 12, null, "Bodoni", 1, 0 == true ? 1 : 0);
    public static final ReaderFont Adys = new ReaderFont("Adys", 13, null, "Adys", 1, null);

    private static final /* synthetic */ ReaderFont[] $values() {
        return new ReaderFont[]{DmSans, DmSansBold, Rubik, RubikBold, System, SystemBold, OpenSans, NewYork, Spectral, Lora, Poppins, Inter, Bodoni, Adys, NotoSansJapanese, NotoSansJapaneseBold, NotoSerifJapanese, NotoSerifJapaneseBold, NotoSansArabic, NotoNaskhArabic, NotoKufiArabic, NotoSansSimplifiedChinese, NotoSansSimplifiedChineseBold, NotoSerifSimplifiedChinese, NotoSerifSimplifiedChineseBold, NotoSansCantonese, NotoSansCantoneseBold, NotoSerifCantonese, NotoSerifCantoneseBold, Sunflower, SunflowerBold, NotoSansChineseTraditional, NotoSansChineseTraditionalBold, NotoSerifChineseTraditional, NotoSerifChineseTraditionalBold, NotoSansKorea, NotoSansKoreaBold, NotoSerifKorea, NotoSerifKoreaBold, NanumGothicCoding, NanumGothicCodingBold};
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        LanguageLearn languageLearn = LanguageLearn.Japanese;
        NotoSansJapanese = new ReaderFont("NotoSansJapanese", 14, vz1.m23604J(languageLearn.getCode()), "Noto Sans");
        NotoSansJapaneseBold = new ReaderFont("NotoSansJapaneseBold", 15, vz1.m23604J(languageLearn.getCode()), "Noto Sans Bold");
        NotoSerifJapanese = new ReaderFont("NotoSerifJapanese", 16, vz1.m23604J(languageLearn.getCode()), "Noto Serif");
        NotoSerifJapaneseBold = new ReaderFont("NotoSerifJapaneseBold", 17, vz1.m23604J(languageLearn.getCode()), "Noto Serif Bold");
        LanguageLearn languageLearn2 = LanguageLearn.Arabic;
        String code = languageLearn2.getCode();
        LanguageLearn languageLearn3 = LanguageLearn.Farsi;
        NotoSansArabic = new ReaderFont("NotoSansArabic", 18, vz1.m23605K(code, languageLearn3.getCode()), "Noto Sans");
        NotoNaskhArabic = new ReaderFont("NotoNaskhArabic", 19, vz1.m23605K(languageLearn2.getCode(), languageLearn3.getCode()), "Noto Naskh");
        NotoKufiArabic = new ReaderFont("NotoKufiArabic", 20, vz1.m23605K(languageLearn2.getCode(), languageLearn3.getCode()), "Noto Kufi");
        LanguageLearn languageLearn4 = LanguageLearn.Mandarin;
        NotoSansSimplifiedChinese = new ReaderFont("NotoSansSimplifiedChinese", 21, vz1.m23604J(languageLearn4.getCode()), "Noto Sans");
        NotoSansSimplifiedChineseBold = new ReaderFont("NotoSansSimplifiedChineseBold", 22, vz1.m23604J(languageLearn4.getCode()), "Noto Sans Bold");
        NotoSerifSimplifiedChinese = new ReaderFont("NotoSerifSimplifiedChinese", 23, vz1.m23604J(languageLearn4.getCode()), "Noto Serif");
        NotoSerifSimplifiedChineseBold = new ReaderFont("NotoSerifSimplifiedChineseBold", 24, vz1.m23604J(languageLearn4.getCode()), "Noto Serif Bold");
        LanguageLearn languageLearn5 = LanguageLearn.Cantonese;
        NotoSansCantonese = new ReaderFont("NotoSansCantonese", 25, vz1.m23604J(languageLearn5.getCode()), "Noto Sans");
        NotoSansCantoneseBold = new ReaderFont("NotoSansCantoneseBold", 26, vz1.m23604J(languageLearn5.getCode()), "Noto Sans Bold");
        NotoSerifCantonese = new ReaderFont("NotoSerifCantonese", 27, vz1.m23604J(languageLearn5.getCode()), "Noto Serif");
        NotoSerifCantoneseBold = new ReaderFont("NotoSerifCantoneseBold", 28, vz1.m23604J(languageLearn5.getCode()), "Noto Serif Bold");
        Sunflower = new ReaderFont("Sunflower", 29, vz1.m23604J(languageLearn5.getCode()), "Sunflower");
        SunflowerBold = new ReaderFont("SunflowerBold", 30, vz1.m23604J(languageLearn5.getCode()), "Sunflower Bold");
        LanguageLearn languageLearn6 = LanguageLearn.ChineseTraditional;
        NotoSansChineseTraditional = new ReaderFont("NotoSansChineseTraditional", 31, vz1.m23604J(languageLearn6.getCode()), "Noto Sans");
        NotoSansChineseTraditionalBold = new ReaderFont("NotoSansChineseTraditionalBold", 32, vz1.m23604J(languageLearn6.getCode()), "Noto Sans Bold");
        NotoSerifChineseTraditional = new ReaderFont("NotoSerifChineseTraditional", 33, vz1.m23604J(languageLearn6.getCode()), "Noto Serif");
        NotoSerifChineseTraditionalBold = new ReaderFont("NotoSerifChineseTraditionalBold", 34, vz1.m23604J(languageLearn6.getCode()), "Noto Serif Bold");
        LanguageLearn languageLearn7 = LanguageLearn.Korean;
        NotoSansKorea = new ReaderFont("NotoSansKorea", 35, vz1.m23604J(languageLearn7.getCode()), "Noto Sans");
        NotoSansKoreaBold = new ReaderFont("NotoSansKoreaBold", 36, vz1.m23604J(languageLearn7.getCode()), "Noto Sans Bold");
        NotoSerifKorea = new ReaderFont("NotoSerifKorea", 37, vz1.m23604J(languageLearn7.getCode()), "Noto Serif");
        NotoSerifKoreaBold = new ReaderFont("NotoSerifKoreaBold", 38, vz1.m23604J(languageLearn7.getCode()), "Noto Serif Bold");
        NanumGothicCoding = new ReaderFont("NanumGothicCoding", 39, vz1.m23604J(languageLearn7.getCode()), "Nanum Gothic");
        NanumGothicCodingBold = new ReaderFont("NanumGothicCodingBold", 40, vz1.m23604J(languageLearn7.getCode()), "Nanum Gothic Bold");
        ReaderFont[] readerFontArr$values = $values();
        $VALUES = readerFontArr$values;
        $ENTRIES = AbstractC3201a.m15404a(readerFontArr$values);
        Companion = new xv7();
    }

    public /* synthetic */ ReaderFont(String str, int i, List list, String str2, int i2, y52 y52Var) {
        this(str, i, (i2 & 1) != 0 ? EmptyList.f47638a : list, str2);
    }

    public static ys2 getEntries() {
        return $ENTRIES;
    }

    public static ReaderFont valueOf(String str) {
        return (ReaderFont) Enum.valueOf(ReaderFont.class, str);
    }

    public static ReaderFont[] values() {
        return (ReaderFont[]) $VALUES.clone();
    }

    public final List<String> getLanguages() {
        return this.languages;
    }

    public final String getTitle() {
        return this.title;
    }

    private ReaderFont(String str, int i, List list, String str2) {
        super(str, i);
        this.languages = list;
        this.title = str2;
    }
}
