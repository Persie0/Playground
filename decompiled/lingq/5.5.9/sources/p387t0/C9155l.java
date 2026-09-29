package p387t0;

import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.util.DisplayMetrics;
import dm.C5207g;
import p402u0.AbstractC9360c;
import p402u0.C9363f;

/* JADX INFO: renamed from: t0.l */
/* JADX INFO: loaded from: classes.dex */
public final class C9155l {
    /* JADX INFO: renamed from: a */
    public static final AbstractC9360c m17473a(Bitmap bitmap) {
        AbstractC9360c abstractC9360cM17474b;
        C5207g.m11111f(bitmap, "<this>");
        ColorSpace colorSpace = bitmap.getColorSpace();
        if (colorSpace != null && (abstractC9360cM17474b = m17474b(colorSpace)) != null) {
            return abstractC9360cM17474b;
        }
        float[] fArr = C9363f.f48105a;
        return C9363f.f48107c;
    }

    /* JADX INFO: renamed from: b */
    public static final AbstractC9360c m17474b(ColorSpace colorSpace) {
        C5207g.m11111f(colorSpace, "<this>");
        if (C5207g.m11106a(colorSpace, ColorSpace.get(ColorSpace.Named.SRGB))) {
            return C9363f.f48107c;
        }
        if (C5207g.m11106a(colorSpace, ColorSpace.get(ColorSpace.Named.ACES))) {
            return C9363f.f48119o;
        }
        if (C5207g.m11106a(colorSpace, ColorSpace.get(ColorSpace.Named.ACESCG))) {
            return C9363f.f48120p;
        }
        if (C5207g.m11106a(colorSpace, ColorSpace.get(ColorSpace.Named.ADOBE_RGB))) {
            return C9363f.f48117m;
        }
        if (C5207g.m11106a(colorSpace, ColorSpace.get(ColorSpace.Named.BT2020))) {
            return C9363f.f48112h;
        }
        if (C5207g.m11106a(colorSpace, ColorSpace.get(ColorSpace.Named.BT709))) {
            return C9363f.f48111g;
        }
        if (C5207g.m11106a(colorSpace, ColorSpace.get(ColorSpace.Named.CIE_LAB))) {
            return C9363f.f48122r;
        }
        if (C5207g.m11106a(colorSpace, ColorSpace.get(ColorSpace.Named.CIE_XYZ))) {
            return C9363f.f48121q;
        }
        if (C5207g.m11106a(colorSpace, ColorSpace.get(ColorSpace.Named.DCI_P3))) {
            return C9363f.f48113i;
        }
        if (C5207g.m11106a(colorSpace, ColorSpace.get(ColorSpace.Named.DISPLAY_P3))) {
            return C9363f.f48114j;
        }
        if (C5207g.m11106a(colorSpace, ColorSpace.get(ColorSpace.Named.EXTENDED_SRGB))) {
            return C9363f.f48109e;
        }
        if (C5207g.m11106a(colorSpace, ColorSpace.get(ColorSpace.Named.LINEAR_EXTENDED_SRGB))) {
            return C9363f.f48110f;
        }
        if (C5207g.m11106a(colorSpace, ColorSpace.get(ColorSpace.Named.LINEAR_SRGB))) {
            return C9363f.f48108d;
        }
        if (C5207g.m11106a(colorSpace, ColorSpace.get(ColorSpace.Named.NTSC_1953))) {
            return C9363f.f48115k;
        }
        if (C5207g.m11106a(colorSpace, ColorSpace.get(ColorSpace.Named.PRO_PHOTO_RGB))) {
            return C9363f.f48118n;
        }
        return C5207g.m11106a(colorSpace, ColorSpace.get(ColorSpace.Named.SMPTE_C)) ? C9363f.f48116l : C9363f.f48107c;
    }

    /* JADX INFO: renamed from: c */
    public static final Bitmap m17475c(int i10, int i11, int i12, boolean z10, AbstractC9360c abstractC9360c) {
        C5207g.m11111f(abstractC9360c, "colorSpace");
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap((DisplayMetrics) null, i10, i11, C9145g.m17439a(i12), z10, m17476d(abstractC9360c));
        C5207g.m11110e(bitmapCreateBitmap, "createBitmap(\n          …orkColorSpace()\n        )");
        return bitmapCreateBitmap;
    }

    /* JADX INFO: renamed from: d */
    public static final ColorSpace m17476d(AbstractC9360c abstractC9360c) {
        ColorSpace.Named named;
        C5207g.m11111f(abstractC9360c, "<this>");
        if (C5207g.m11106a(abstractC9360c, C9363f.f48107c)) {
            named = ColorSpace.Named.SRGB;
        } else if (C5207g.m11106a(abstractC9360c, C9363f.f48119o)) {
            named = ColorSpace.Named.ACES;
        } else if (C5207g.m11106a(abstractC9360c, C9363f.f48120p)) {
            named = ColorSpace.Named.ACESCG;
        } else if (C5207g.m11106a(abstractC9360c, C9363f.f48117m)) {
            named = ColorSpace.Named.ADOBE_RGB;
        } else if (C5207g.m11106a(abstractC9360c, C9363f.f48112h)) {
            named = ColorSpace.Named.BT2020;
        } else if (C5207g.m11106a(abstractC9360c, C9363f.f48111g)) {
            named = ColorSpace.Named.BT709;
        } else if (C5207g.m11106a(abstractC9360c, C9363f.f48122r)) {
            named = ColorSpace.Named.CIE_LAB;
        } else if (C5207g.m11106a(abstractC9360c, C9363f.f48121q)) {
            named = ColorSpace.Named.CIE_XYZ;
        } else if (C5207g.m11106a(abstractC9360c, C9363f.f48113i)) {
            named = ColorSpace.Named.DCI_P3;
        } else if (C5207g.m11106a(abstractC9360c, C9363f.f48114j)) {
            named = ColorSpace.Named.DISPLAY_P3;
        } else if (C5207g.m11106a(abstractC9360c, C9363f.f48109e)) {
            named = ColorSpace.Named.EXTENDED_SRGB;
        } else if (C5207g.m11106a(abstractC9360c, C9363f.f48110f)) {
            named = ColorSpace.Named.LINEAR_EXTENDED_SRGB;
        } else if (C5207g.m11106a(abstractC9360c, C9363f.f48108d)) {
            named = ColorSpace.Named.LINEAR_SRGB;
        } else if (C5207g.m11106a(abstractC9360c, C9363f.f48115k)) {
            named = ColorSpace.Named.NTSC_1953;
        } else if (C5207g.m11106a(abstractC9360c, C9363f.f48118n)) {
            named = ColorSpace.Named.PRO_PHOTO_RGB;
        } else {
            named = C5207g.m11106a(abstractC9360c, C9363f.f48116l) ? ColorSpace.Named.SMPTE_C : ColorSpace.Named.SRGB;
        }
        ColorSpace colorSpace = ColorSpace.get(named);
        C5207g.m11110e(colorSpace, "get(frameworkNamedSpace)");
        return colorSpace;
    }
}
