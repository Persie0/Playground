package com.lingq.core.domain.model;

import kotlin.enums.AbstractC3201a;
import p000.y52;
import p000.ys2;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'Portuguese' uses external variables
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
public final class LanguageLearn {
    private static final /* synthetic */ ys2 $ENTRIES;
    private static final /* synthetic */ LanguageLearn[] $VALUES;
    public static final LanguageLearn Arabic;
    public static final LanguageLearn Farsi;
    public static final LanguageLearn Portuguese;
    private final String code;
    private final boolean isSupported;
    public static final LanguageLearn English = new LanguageLearn("English", 0, "en", false, 2, null);
    public static final LanguageLearn French = new LanguageLearn("French", 1, "fr", false, 2, null);
    public static final LanguageLearn German = new LanguageLearn("German", 2, "de", false, 2, null);
    public static final LanguageLearn Italian = new LanguageLearn("Italian", 3, "it", false, 2, null);
    public static final LanguageLearn Japanese = new LanguageLearn("Japanese", 4, "ja", false, 2, null);
    public static final LanguageLearn Korean = new LanguageLearn("Korean", 5, "ko", false, 2, null);
    public static final LanguageLearn Mandarin = new LanguageLearn("Mandarin", 6, "zh", false, 2, null);
    public static final LanguageLearn Swedish = new LanguageLearn("Swedish", 8, "sv", false, 2, null);
    public static final LanguageLearn Spanish = new LanguageLearn("Spanish", 9, "es", false, 2, null);
    public static final LanguageLearn Russian = new LanguageLearn("Russian", 10, "ru", false, 2, null);
    public static final LanguageLearn Polish = new LanguageLearn("Polish", 11, "pl", false, 2, null);
    public static final LanguageLearn Dutch = new LanguageLearn("Dutch", 12, "nl", false, 2, null);
    public static final LanguageLearn Greek = new LanguageLearn("Greek", 13, "el", false, 2, null);
    public static final LanguageLearn Ukrainian = new LanguageLearn("Ukrainian", 14, "uk", false, 2, null);
    public static final LanguageLearn Latin = new LanguageLearn("Latin", 16, "la", false, 2, null);
    public static final LanguageLearn Cantonese = new LanguageLearn("Cantonese", 17, "hk", false, 2, null);
    public static final LanguageLearn Finnish = new LanguageLearn("Finnish", 18, "fi", false, 2, null);
    public static final LanguageLearn Hebrew = new LanguageLearn("Hebrew", 19, "he", false, 2, null);
    public static final LanguageLearn Turkish = new LanguageLearn("Turkish", 20, "tr", false, 2, null);
    public static final LanguageLearn Norwegian = new LanguageLearn("Norwegian", 21, "no", false, 2, null);
    public static final LanguageLearn Czech = new LanguageLearn("Czech", 22, "cs", false, 2, null);
    public static final LanguageLearn Danish = new LanguageLearn("Danish", 24, "da", false, 2, null);
    public static final LanguageLearn ChineseTraditional = new LanguageLearn("ChineseTraditional", 25, "zh-t", false, 2, null);
    public static final LanguageLearn Catalan = new LanguageLearn("Catalan", 26, "ca", false, 2, null);
    public static final LanguageLearn Serbian = new LanguageLearn("Serbian", 27, "srp", false, 2, null);
    public static final LanguageLearn Romanian = new LanguageLearn("Romanian", 28, "ro", false, 2, null);
    public static final LanguageLearn Indonesian = new LanguageLearn("Indonesian", 29, "id", false, 2, null);
    public static final LanguageLearn Malay = new LanguageLearn("Malay", 30, "ms", false);
    public static final LanguageLearn Bulgarian = new LanguageLearn("Bulgarian", 31, "bg", false);
    public static final LanguageLearn Slovak = new LanguageLearn("Slovak", 32, "sk", false);
    public static final LanguageLearn Croatian = new LanguageLearn("Croatian", 33, "hrv", false);
    public static final LanguageLearn Gujarati = new LanguageLearn("Gujarati", 34, "gu", false);
    public static final LanguageLearn Hungarian = new LanguageLearn("Hungarian", 35, "hu", false);
    public static final LanguageLearn Icelandic = new LanguageLearn("Icelandic", 36, "is", false);
    public static final LanguageLearn Armenian = new LanguageLearn("Armenian", 37, "hy", false);
    public static final LanguageLearn Tagalog = new LanguageLearn("Tagalog", 38, "tl", false);
    public static final LanguageLearn Georgian = new LanguageLearn("Georgian", 39, "ka", false);
    public static final LanguageLearn Afrikaans = new LanguageLearn("Afrikaans", 40, "af", false);
    public static final LanguageLearn Slovenian = new LanguageLearn("Slovenian", 41, "sl", false);
    public static final LanguageLearn Macedonian = new LanguageLearn("Macedonian", 42, "mk", false);
    public static final LanguageLearn Hindi = new LanguageLearn("Hindi", 43, "hi", false);
    public static final LanguageLearn Belarusian = new LanguageLearn("Belarusian", 44, "be", false);
    public static final LanguageLearn Esperanto = new LanguageLearn("Esperanto", 45, "eo", false);
    public static final LanguageLearn Swahili = new LanguageLearn("Swahili", 46, "sw", false);
    public static final LanguageLearn Vietnamese = new LanguageLearn("Vietnamese", 47, "vi", false);
    public static final LanguageLearn Khmer = new LanguageLearn("Khmer", 48, "km", false);
    public static final LanguageLearn Punjabi = new LanguageLearn("Punjabi", 49, "pa", false);
    public static final LanguageLearn Irish = new LanguageLearn("Irish", 50, "ga", false);
    public static final LanguageLearn Thai = new LanguageLearn("Thai", 51, "th", false);
    public static final LanguageLearn Urdu = new LanguageLearn("Urdu", 52, "ur", false);

    private static final /* synthetic */ LanguageLearn[] $values() {
        return new LanguageLearn[]{English, French, German, Italian, Japanese, Korean, Mandarin, Portuguese, Swedish, Spanish, Russian, Polish, Dutch, Greek, Ukrainian, Arabic, Latin, Cantonese, Finnish, Hebrew, Turkish, Norwegian, Czech, Farsi, Danish, ChineseTraditional, Catalan, Serbian, Romanian, Indonesian, Malay, Bulgarian, Slovak, Croatian, Gujarati, Hungarian, Icelandic, Armenian, Tagalog, Georgian, Afrikaans, Slovenian, Macedonian, Hindi, Belarusian, Esperanto, Swahili, Vietnamese, Khmer, Punjabi, Irish, Thai, Urdu};
    }

    static {
        y52 y52Var = null;
        Portuguese = new LanguageLearn("Portuguese", 7, "pt", false, 2, y52Var);
        Arabic = new LanguageLearn("Arabic", 15, "ar", false, 2, y52Var);
        Farsi = new LanguageLearn("Farsi", 23, "fa", false, 2, y52Var);
        LanguageLearn[] languageLearnArr$values = $values();
        $VALUES = languageLearnArr$values;
        $ENTRIES = AbstractC3201a.m15404a(languageLearnArr$values);
    }

    public /* synthetic */ LanguageLearn(String str, int i, String str2, boolean z, int i2, y52 y52Var) {
        this(str, i, str2, (i2 & 2) != 0 ? true : z);
    }

    public static ys2 getEntries() {
        return $ENTRIES;
    }

    public static LanguageLearn valueOf(String str) {
        return (LanguageLearn) Enum.valueOf(LanguageLearn.class, str);
    }

    public static LanguageLearn[] values() {
        return (LanguageLearn[]) $VALUES.clone();
    }

    public final String getCode() {
        return this.code;
    }

    public final boolean isSupported() {
        return this.isSupported;
    }

    private LanguageLearn(String str, int i, String str2, boolean z) {
        super(str, i);
        this.code = str2;
        this.isSupported = z;
    }
}
