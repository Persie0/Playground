package p000;

import android.content.Context;
import android.graphics.Typeface;
import androidx.compose.runtime.internal.C0282a;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import com.lingq.core.domain.model.theme.ReaderFont;
import com.lingq.core.font.R$font;
import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
public abstract class mjc {

    /* JADX INFO: renamed from: a */
    public static final C0282a f51414a = new C0282a(994774327, false, new ce1(2));

    /* JADX INFO: renamed from: b */
    public static final C0282a f51415b = new C0282a(1868975575, false, new ce1(6));

    /* JADX INFO: renamed from: c */
    public static final C0282a f51416c = new C0282a(996950217, false, new ce1(7));

    /* JADX INFO: renamed from: d */
    public static final C0282a f51417d = new C0282a(-740716419, false, new ce1(8));

    /* JADX INFO: renamed from: e */
    public static final C0282a f51418e = new C0282a(-1427181860, false, new be1(2));

    /* JADX INFO: renamed from: f */
    public static final C0282a f51419f = new C0282a(-219314323, false, new be1(3));

    /* JADX INFO: renamed from: g */
    public static final C0282a f51420g = new C0282a(455845803, false, new be1(4));

    /* JADX INFO: renamed from: h */
    public static final C0282a f51421h = new C0282a(-1750787130, false, new ce1(9));

    /* JADX INFO: renamed from: i */
    public static final C0282a f51422i = new C0282a(734276581, false, new ce1(3));

    /* JADX INFO: renamed from: j */
    public static final C0282a f51423j = new C0282a(439879638, false, new be1(1));

    /* JADX INFO: renamed from: k */
    public static final C0282a f51424k = new C0282a(1868294639, false, new ce1(4));

    /* JADX INFO: renamed from: l */
    public static final C0282a f51425l = new C0282a(2012704334, false, new ce1(5));

    /* JADX INFO: renamed from: a */
    public static final File m16859a(ReaderFont readerFont, Context context) {
        readerFont.getClass();
        context.getClass();
        ob1.Companion.getClass();
        String str = mb1.m16741a(context) + "/" + m16860b(readerFont);
        if (new File(mb1.m16741a(context) + "/" + m16860b(readerFont)).exists()) {
            return new File(str);
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static final String m16860b(ReaderFont readerFont) {
        readerFont.getClass();
        switch (yv7.f70558a[readerFont.ordinal()]) {
            case 1:
                return "dm_sans_regular.ttf";
            case 2:
                return "dm_sans_bold.ttf";
            case 3:
                return "rubik_regular.ttf";
            case 4:
                return "rubik_medium.ttf";
            case 5:
                return "dm_sans_regular.ttf";
            case 6:
                return "dm_sans_medium.ttf";
            case 7:
                return "adys_regular.ttf";
            case 8:
                return "newyork_regular.otf";
            case 9:
                return "spectral_regular.ttf";
            case 10:
                return "lora_variable.ttf";
            case 11:
                return "poppins_regular.ttf";
            case 12:
                return "inter_variable.ttf";
            case 13:
                return "bodoni_variable.ttf";
            case 14:
                return "opensans_variable.ttf";
            case 15:
                return "noto_sans_jp_regular.otf";
            case 16:
                return "noto_sans_jp_bold.otf";
            case 17:
                return "noto_serif_jp_regular.otf";
            case 18:
                return "noto_serif_jp_bold.otf";
            case 19:
                return "noto_sans_arabic.ttf";
            case 20:
                return "noto_naskh_arabic.ttf";
            case 21:
                return "noto_kufi_arabic.ttf";
            case 22:
                return "noto_sans_zh.otf";
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                return "noto_sans_zh_bold.otf";
            case 24:
                return "noto_serif_zh.otf";
            case 25:
                return "noto_serif_zh_bold.otf";
            case 26:
                return "noto_sans_hk.otf";
            case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                return "noto_sans_hk_bold.otf";
            case 28:
            case 29:
                return "noto_serif_hk.ttf";
            case 30:
                return "sunflower_light.ttf";
            case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                return "sunflower_bold.ttf";
            case 32:
                return "noto_sans_zht.otf";
            case 33:
                return "noto_sans_zht_bold.otf";
            case 34:
                return "noto_serif_zht.otf";
            case DescriptorProtos.MethodOptions.FEATURES_FIELD_NUMBER /* 35 */:
                return "noto_serif_zht_bold.otf";
            case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                return "noto_sans_kr_regular.otf";
            case DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                return "noto_sans_kr_bold.otf";
            case 38:
                return "noto_serif_kr_regular.otf";
            case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                return "noto_serif_kr_bold.otf";
            case DescriptorProtos.FileOptions.PHP_CLASS_PREFIX_FIELD_NUMBER /* 40 */:
                return "nanum_gothic_regular_ko.ttf";
            case DescriptorProtos.FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                return "nanum_gothic_bold_ko.ttf";
            default:
                gm5.m12750e();
                return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public static final int m16861c(ReaderFont readerFont) {
        readerFont.getClass();
        int i = yv7.f70558a[readerFont.ordinal()];
        if (i == 19) {
            return R$font.font_noto_sans_arabic;
        }
        if (i == 22) {
            return R$font.font_noto_sans_zh;
        }
        if (i == 26) {
            return R$font.font_noto_sans_hk;
        }
        if (i == 32) {
            return R$font.font_noto_sans_zht;
        }
        if (i == 36) {
            return R$font.font_noto_sans_kr;
        }
        switch (i) {
            case 1:
                return R$font.font_dm_sans;
            case 2:
                return R$font.font_dm_sans;
            case 3:
                return R$font.font_rubik;
            case 4:
                return R$font.font_rubik;
            case 5:
                return R$font.font_dm_sans;
            case 6:
                return R$font.font_dm_sans;
            case 7:
                return R$font.font_adys;
            case 8:
                return R$font.font_newyork;
            case 9:
                return R$font.font_spectral;
            case 10:
                return R$font.font_lora;
            case 11:
                return R$font.font_poppins;
            case 12:
                return R$font.font_inter;
            case 13:
                return R$font.font_bodoni;
            case 14:
                return R$font.font_open_sans;
            case 15:
                return R$font.font_noto_sans_jp;
            default:
                return R$font.font_dm_sans;
        }
    }

    /* JADX INFO: renamed from: d */
    public static final Typeface m16862d(ReaderFont readerFont, Context context) {
        readerFont.getClass();
        context.getClass();
        File fileM16859a = m16859a(readerFont, context);
        try {
            if (!bq1.m4058i0(readerFont) && fileM16859a != null) {
                return readerFont == ReaderFont.NotoSerifCantoneseBold ? new Typeface.Builder(fileM16859a).setFontVariationSettings("'wght' 700").build() : Typeface.createFromFile(fileM16859a);
            }
            Typeface typefaceM11597a = f88.m11597a(context, m16861c(readerFont));
            int i = yv7.f70558a[readerFont.ordinal()];
            if (i != 2 && i != 4) {
                if (i != 5) {
                    return i != 6 ? typefaceM11597a : Typeface.create(Typeface.DEFAULT, 1);
                }
                return Typeface.DEFAULT;
            }
            return Typeface.create(typefaceM11597a, 1);
        } catch (Exception unused) {
            return f88.m11597a(context, m16861c(ReaderFont.DmSans));
        }
    }
}
