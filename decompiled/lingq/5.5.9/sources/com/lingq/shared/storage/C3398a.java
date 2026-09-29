package com.lingq.shared.storage;

import dm.C5207g;
import kotlin.NoWhenBranchMatchedException;
import p260m8.C7499b;

/* JADX INFO: renamed from: com.lingq.shared.storage.a */
/* JADX INFO: loaded from: classes.dex */
public final class C3398a {
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    public static final String m9698a(LessonFont lessonFont) {
        C5207g.m11111f(lessonFont, "<this>");
        if (!C5207g.m11106a(lessonFont, LessonFont.Rubik.INSTANCE) && !C5207g.m11106a(lessonFont, LessonFont.RubikBold.INSTANCE) && !C5207g.m11106a(lessonFont, LessonFont.System.INSTANCE)) {
            if (C5207g.m11106a(lessonFont, LessonFont.Adys.INSTANCE)) {
                return "adys_regular.ttf";
            }
            if (C5207g.m11106a(lessonFont, LessonFont.NewYork.INSTANCE)) {
                return "newyork_regular.otf";
            }
            if (C5207g.m11106a(lessonFont, LessonFont.Spectral.INSTANCE)) {
                return "spectral_regular.ttf";
            }
            if (C5207g.m11106a(lessonFont, LessonFont.Lora.INSTANCE)) {
                return "lora_variable.ttf";
            }
            if (C5207g.m11106a(lessonFont, LessonFont.Poppins.INSTANCE)) {
                return "poppins_regular.ttf";
            }
            if (C5207g.m11106a(lessonFont, LessonFont.Inter.INSTANCE)) {
                return "inter_variable.ttf";
            }
            if (C5207g.m11106a(lessonFont, LessonFont.Bodoni.INSTANCE)) {
                return "bodoni_variable.ttf";
            }
            if (C5207g.m11106a(lessonFont, LessonFont.OpenSans.INSTANCE)) {
                return "opensans_variable.ttf";
            }
            if (C5207g.m11106a(lessonFont, LessonFont.NotoSansJapanese.INSTANCE)) {
                return "noto_sans_jp_regular.otf";
            }
            if (C5207g.m11106a(lessonFont, LessonFont.NotoSansJapaneseBold.INSTANCE)) {
                return "noto_sans_jp_bold.otf";
            }
            if (C5207g.m11106a(lessonFont, LessonFont.NotoSerifJapanese.INSTANCE)) {
                return "noto_serif_jp_regular.otf";
            }
            if (C5207g.m11106a(lessonFont, LessonFont.NotoSerifJapaneseBold.INSTANCE)) {
                return "noto_serif_jp_bold.otf";
            }
            if (C5207g.m11106a(lessonFont, LessonFont.NotoSansArabic.INSTANCE)) {
                return "noto_sans_arabic.ttf";
            }
            if (C5207g.m11106a(lessonFont, LessonFont.NotoNaskhArabic.INSTANCE)) {
                return "noto_naskh_arabic.ttf";
            }
            if (C5207g.m11106a(lessonFont, LessonFont.NotoKufiArabic.INSTANCE)) {
                return "noto_kufi_arabic.ttf";
            }
            if (C5207g.m11106a(lessonFont, LessonFont.NotoSansSimplifiedChinese.INSTANCE)) {
                return "noto_sans_zh.otf";
            }
            if (C5207g.m11106a(lessonFont, LessonFont.NotoSansSimplifiedChineseBold.INSTANCE)) {
                return "noto_sans_zh_bold.otf";
            }
            if (C5207g.m11106a(lessonFont, LessonFont.NotoSerifSimplifiedChinese.INSTANCE)) {
                return "noto_serif_zh.otf";
            }
            if (C5207g.m11106a(lessonFont, LessonFont.NotoSerifSimplifiedChineseBold.INSTANCE)) {
                return "noto_serif_zh_bold.otf";
            }
            if (C5207g.m11106a(lessonFont, LessonFont.NotoSansCantonese.INSTANCE)) {
                return "noto_sans_hk.otf";
            }
            if (C5207g.m11106a(lessonFont, LessonFont.NotoSansCantoneseBold.INSTANCE)) {
                return "noto_sans_hk_bold.otf";
            }
            if (C5207g.m11106a(lessonFont, LessonFont.NotoSerifCantonese.INSTANCE) || C5207g.m11106a(lessonFont, LessonFont.NotoSerifCantoneseBold.INSTANCE)) {
                return "noto_serif_hk.ttf";
            }
            if (C5207g.m11106a(lessonFont, LessonFont.Sunflower.INSTANCE)) {
                return "sunflower_light.ttf";
            }
            if (C5207g.m11106a(lessonFont, LessonFont.SunflowerBold.INSTANCE)) {
                return "sunflower_bold.ttf";
            }
            if (C5207g.m11106a(lessonFont, LessonFont.NotoSansChineseTraditional.INSTANCE)) {
                return "noto_sans_zht.otf";
            }
            if (C5207g.m11106a(lessonFont, LessonFont.NotoSansChineseTraditionalBold.INSTANCE)) {
                return "noto_sans_zht_bold.otf";
            }
            if (C5207g.m11106a(lessonFont, LessonFont.NotoSerifChineseTraditional.INSTANCE)) {
                return "noto_serif_zht.otf";
            }
            if (C5207g.m11106a(lessonFont, LessonFont.NotoSerifChineseTraditionalBold.INSTANCE)) {
                return "noto_serif_zht_bold.otf";
            }
            if (C5207g.m11106a(lessonFont, LessonFont.NotoSansKorea.INSTANCE)) {
                return "noto_sans_kr_regular.otf";
            }
            if (C5207g.m11106a(lessonFont, LessonFont.NotoSansKoreaBold.INSTANCE)) {
                return "noto_sans_kr_bold.otf";
            }
            if (C5207g.m11106a(lessonFont, LessonFont.NotoSerifKorea.INSTANCE)) {
                return "noto_serif_kr_regular.otf";
            }
            if (C5207g.m11106a(lessonFont, LessonFont.NotoSerifKoreaBold.INSTANCE)) {
                return "noto_serif_kr_bold.otf";
            }
            if (C5207g.m11106a(lessonFont, LessonFont.NanumGothicCoding.INSTANCE)) {
                return "nanum_gothic_regular_ko.ttf";
            }
            if (C5207g.m11106a(lessonFont, LessonFont.NanumGothicCodingBold.INSTANCE)) {
                return "nanum_gothic_bold_ko.ttf";
            }
            throw new NoWhenBranchMatchedException();
        }
        return "rubik.ttf";
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m9699b(LessonFont lessonFont) {
        C5207g.m11111f(lessonFont, "<this>");
        return C7499b.m14973x0(LessonFont.Rubik.INSTANCE, LessonFont.RubikBold.INSTANCE, LessonFont.System.INSTANCE, LessonFont.Adys.INSTANCE, LessonFont.NewYork.INSTANCE, LessonFont.Spectral.INSTANCE, LessonFont.Lora.INSTANCE, LessonFont.Poppins.INSTANCE, LessonFont.Inter.INSTANCE, LessonFont.Bodoni.INSTANCE, LessonFont.OpenSans.INSTANCE, LessonFont.NotoSansJapanese.INSTANCE, LessonFont.NotoSansArabic.INSTANCE, LessonFont.NotoSansSimplifiedChinese.INSTANCE, LessonFont.NotoSansCantonese.INSTANCE, LessonFont.NotoSansChineseTraditional.INSTANCE, LessonFont.NotoSansKorea.INSTANCE).contains(lessonFont);
    }

    /* JADX INFO: renamed from: c */
    public static final String m9700c(LessonFont lessonFont) {
        C5207g.m11111f(lessonFont, "<this>");
        return lessonFont.getClass().getSimpleName();
    }
}
