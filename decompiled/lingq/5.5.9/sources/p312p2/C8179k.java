package p312p2;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.ParcelFileDescriptor;
import android.support.v4.media.session.C0165d;
import androidx.appcompat.widget.C0296a0;
import androidx.appcompat.widget.C0308e0;
import java.io.IOException;
import p007a6.C0045x;
import p286o2.C7904d;
import p404u2.C9393m;

/* JADX INFO: renamed from: p2.k */
/* JADX INFO: loaded from: classes.dex */
public final class C8179k extends C8181m {
    /* JADX INFO: renamed from: f */
    public static Font m16284f(FontFamily fontFamily, int i10) {
        C0165d.m756z();
        FontStyle fontStyleM1169k = C0308e0.m1169k((i10 & 1) != 0 ? 700 : 400, (i10 & 2) != 0 ? 1 : 0);
        Font font = fontFamily.getFont(0);
        int iM16285g = m16285g(fontStyleM1169k, font.getStyle());
        for (int i11 = 1; i11 < fontFamily.getSize(); i11++) {
            Font font2 = fontFamily.getFont(i11);
            int iM16285g2 = m16285g(fontStyleM1169k, font2.getStyle());
            if (iM16285g2 < iM16285g) {
                font = font2;
                iM16285g = iM16285g2;
            }
        }
        return font;
    }

    /* JADX INFO: renamed from: g */
    public static int m16285g(FontStyle fontStyle, FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    @Override // p312p2.C8181m
    /* JADX INFO: renamed from: a */
    public final Typeface mo16234a(Context context, C7904d.c cVar, Resources resources, int i10) {
        try {
            FontFamily.Builder builderM187j = null;
            for (C7904d.d dVar : cVar.f43043a) {
                try {
                    C0165d.m739i();
                    Font fontBuild = C0296a0.m1090f(resources, dVar.f43049f).setWeight(dVar.f43045b).setSlant(dVar.f43046c ? 1 : 0).setTtcIndex(dVar.f43048e).setFontVariationSettings(dVar.f43047d).build();
                    if (builderM187j == null) {
                        C0296a0.m1095k();
                        builderM187j = C0045x.m187j(fontBuild);
                    } else {
                        builderM187j.addFont(fontBuild);
                    }
                } catch (IOException unused) {
                }
            }
            if (builderM187j == null) {
                return null;
            }
            FontFamily fontFamilyBuild = builderM187j.build();
            C0045x.m191n();
            return C0308e0.m1165g(fontFamilyBuild).setStyle(m16284f(fontFamilyBuild, i10).getStyle()).build();
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override // p312p2.C8181m
    /* JADX INFO: renamed from: b */
    public final Typeface mo16237b(Context context, C9393m[] c9393mArr, int i10) {
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily.Builder builderM187j = null;
            for (C9393m c9393m : c9393mArr) {
                try {
                    ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor(c9393m.f48202a, "r", null);
                    if (parcelFileDescriptorOpenFileDescriptor == null) {
                        if (parcelFileDescriptorOpenFileDescriptor != null) {
                        }
                    } else {
                        try {
                            C0165d.m739i();
                            Font fontBuild = C0296a0.m1091g(parcelFileDescriptorOpenFileDescriptor).setWeight(c9393m.f48204c).setSlant(c9393m.f48205d ? 1 : 0).setTtcIndex(c9393m.f48203b).build();
                            if (builderM187j == null) {
                                C0296a0.m1095k();
                                builderM187j = C0045x.m187j(fontBuild);
                            } else {
                                builderM187j.addFont(fontBuild);
                            }
                        } catch (Throwable th2) {
                            try {
                                parcelFileDescriptorOpenFileDescriptor.close();
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                            }
                            throw th2;
                        }
                    }
                    parcelFileDescriptorOpenFileDescriptor.close();
                } catch (IOException unused) {
                }
            }
            if (builderM187j == null) {
                return null;
            }
            FontFamily fontFamilyBuild = builderM187j.build();
            C0045x.m191n();
            return C0308e0.m1165g(fontFamilyBuild).setStyle(m16284f(fontFamilyBuild, i10).getStyle()).build();
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override // p312p2.C8181m
    /* JADX INFO: renamed from: c */
    public final Typeface mo16238c(Context context, Resources resources, int i10, String str, int i11) {
        try {
            C0165d.m739i();
            Font fontBuild = C0296a0.m1090f(resources, i10).build();
            C0296a0.m1095k();
            FontFamily fontFamilyBuild = C0045x.m187j(fontBuild).build();
            C0045x.m191n();
            return C0308e0.m1165g(fontFamilyBuild).setStyle(fontBuild.getStyle()).build();
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p312p2.C8181m
    /* JADX INFO: renamed from: e */
    public final C9393m mo16286e(int i10, C9393m[] c9393mArr) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }
}
