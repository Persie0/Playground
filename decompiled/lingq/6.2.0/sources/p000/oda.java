package p000;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.text.PositionedGlyphs;
import android.graphics.text.TextRunShaper;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class oda {

    /* JADX INFO: renamed from: a */
    public static final e41 f54230a;

    /* JADX INFO: renamed from: b */
    public static final ab9 f54231b;

    /* JADX INFO: renamed from: c */
    public static Paint f54232c;

    static {
        pvc.m19517m("TypefaceCompat static init");
        if (Build.VERSION.SDK_INT >= 31) {
            f54230a = new qda();
        } else {
            f54230a = new e41();
        }
        f54231b = new ab9(16);
        f54232c = null;
        Trace.endSection();
    }

    /* JADX INFO: renamed from: a */
    public static Typeface m17935a(Context context, dc3[] dc3VarArr, int i) {
        pvc.m19517m("TypefaceCompat.createFromFontInfo");
        try {
            e41 e41Var = f54230a;
            e41Var.getClass();
            Typeface typefaceBuild = null;
            try {
                FontFamily fontFamilyM10841h = e41Var.m10841h(dc3VarArr, context.getContentResolver());
                if (fontFamilyM10841h != null) {
                    typefaceBuild = new Typeface.CustomFallbackBuilder(fontFamilyM10841h).setStyle(e41.m10835g(fontFamilyM10841h, i).getStyle()).build();
                }
            } catch (Exception e) {
                Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            }
            Trace.endSection();
            return typefaceBuild;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:85:0x01b7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:86:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:87:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:90:0x01d2  */
    /* JADX INFO: renamed from: b */
    public static Typeface m17936b(Context context, ob3 ob3Var, Resources resources, int i, String str, int i2, int i3, AbstractC3584sr abstractC3584sr, boolean z) {
        Exception exc;
        Typeface typefaceM23239a;
        FontFamily fontFamilyBuild;
        Typeface typefaceM17939e;
        boolean z2 = ob3Var instanceof rb3;
        ab9 ab9Var = f54231b;
        Typeface typefaceBuild = null;
        int i4 = 1;
        if (z2) {
            rb3 rb3Var = (rb3) ob3Var;
            ArrayList arrayList = rb3Var.f59018a;
            String str2 = rb3Var.f59021d;
            if (!TextUtils.isEmpty(str2) && (typefaceM17939e = m17939e(str2)) != null) {
                typefaceBuild = typefaceM17939e;
            } else if (arrayList.size() == 1) {
                typefaceBuild = m17939e(((hb3) arrayList.get(0)).m13182a());
            } else if (Build.VERSION.SDK_INT >= 31) {
                int i5 = 0;
                while (true) {
                    if (i5 >= arrayList.size()) {
                        Typeface.CustomFallbackBuilder customFallbackBuilder = null;
                        int i6 = 0;
                        while (true) {
                            if (i6 < arrayList.size()) {
                                hb3 hb3Var = (hb3) arrayList.get(i6);
                                if (i6 == arrayList.size() - 1 && TextUtils.isEmpty(hb3Var.m13183b())) {
                                    customFallbackBuilder.setSystemFallback(hb3Var.m13182a());
                                } else {
                                    Font fontM17940f = m17940f(m17939e(hb3Var.m13182a()));
                                    if (fontM17940f == null) {
                                        Log.w("TypefaceCompat", "Unable identify the primary font for " + hb3Var.m13182a() + ". Falling back to provider font.");
                                        break;
                                    }
                                    if (!TextUtils.isEmpty(hb3Var.m13183b())) {
                                        try {
                                            e65.m10878j();
                                            fontFamilyBuild = new FontFamily.Builder(if9.m13864c(fontM17940f).setFontVariationSettings(hb3Var.m13183b()).build()).build();
                                        } catch (IOException unused) {
                                            Log.e("TypefaceCompat", "Failed to clone Font instance. Fall back to provider font.");
                                            break;
                                        }
                                    } else {
                                        fontFamilyBuild = new FontFamily.Builder(fontM17940f).build();
                                    }
                                    if (customFallbackBuilder == null) {
                                        customFallbackBuilder = new Typeface.CustomFallbackBuilder(fontFamilyBuild);
                                    } else {
                                        customFallbackBuilder.addCustomFallback(fontFamilyBuild);
                                    }
                                    i6++;
                                }
                            }
                            typefaceBuild = customFallbackBuilder.build();
                            break;
                        }
                    }
                    if (m17939e(((hb3) arrayList.get(i5)).m13182a()) == null) {
                        break;
                    }
                    i5++;
                }
            }
            if (typefaceBuild != null) {
                if (abstractC3584sr != null) {
                    new Handler(Looper.getMainLooper()).post(new ks6(i4, abstractC3584sr, typefaceBuild));
                }
                ab9Var.m240f(m17938d(resources, i, str, i2, i3), typefaceBuild);
                return typefaceBuild;
            }
            typefaceM23239a = vdd.m23239a(context, arrayList, i3, !z ? abstractC3584sr != null : rb3Var.f59020c != 0, z ? rb3Var.f59019b : -1, new Handler(Looper.getMainLooper()), new hi8(abstractC3584sr, 29));
        } else {
            pb3 pb3Var = (pb3) ob3Var;
            f54230a.getClass();
            try {
                FontFamily.Builder builder = null;
                for (qb3 qb3Var : pb3Var.f55927a) {
                    try {
                        try {
                            Font fontBuild = new Font.Builder(resources, qb3Var.f57536e).setWeight(qb3Var.f57532a).setSlant(qb3Var.f57533b ? 1 : 0).setTtcIndex(qb3Var.f57535d).setFontVariationSettings(qb3Var.f57534c).build();
                            if (builder == null) {
                                builder = new FontFamily.Builder(fontBuild);
                            } else {
                                builder.addFont(fontBuild);
                            }
                        } catch (IOException unused2) {
                        }
                    } catch (Exception e) {
                        exc = e;
                        Log.w("TypefaceCompatApi29Impl", "Font load failed", exc);
                        if (abstractC3584sr != null) {
                            if (typefaceBuild != null) {
                                new Handler(Looper.getMainLooper()).post(new ks6(i4, abstractC3584sr, typefaceBuild));
                            } else {
                                abstractC3584sr.m21650v(-3);
                            }
                        }
                        typefaceM23239a = typefaceBuild;
                        if (typefaceM23239a != null) {
                            ab9Var.m240f(m17938d(resources, i, str, i2, i3), typefaceM23239a);
                        }
                        return typefaceM23239a;
                    }
                }
                if (builder != null) {
                    FontFamily fontFamilyBuild2 = builder.build();
                    try {
                        typefaceBuild = new Typeface.CustomFallbackBuilder(fontFamilyBuild2).setStyle(e41.m10835g(fontFamilyBuild2, i3).getStyle()).build();
                    } catch (Exception e2) {
                        e = e2;
                        exc = e;
                        Log.w("TypefaceCompatApi29Impl", "Font load failed", exc);
                    }
                }
            } catch (Exception e3) {
                e = e3;
            }
            if (abstractC3584sr != null) {
                if (typefaceBuild != null) {
                    new Handler(Looper.getMainLooper()).post(new ks6(i4, abstractC3584sr, typefaceBuild));
                } else {
                    abstractC3584sr.m21650v(-3);
                }
            }
            typefaceM23239a = typefaceBuild;
        }
        if (typefaceM23239a != null) {
            ab9Var.m240f(m17938d(resources, i, str, i2, i3), typefaceM23239a);
        }
        return typefaceM23239a;
    }

    /* JADX INFO: renamed from: c */
    public static Typeface m17937c(Resources resources, int i, String str, int i2, int i3) {
        Typeface typefaceBuild;
        f54230a.getClass();
        try {
            Font fontBuild = new Font.Builder(resources, i).build();
            typefaceBuild = new Typeface.CustomFallbackBuilder(new FontFamily.Builder(fontBuild).build()).setStyle(fontBuild.getStyle()).build();
        } catch (Exception e) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            typefaceBuild = null;
        }
        if (typefaceBuild != null) {
            f54231b.m240f(m17938d(resources, i, str, i2, i3), typefaceBuild);
        }
        return typefaceBuild;
    }

    /* JADX INFO: renamed from: d */
    public static String m17938d(Resources resources, int i, String str, int i2, int i3) {
        return resources.getResourcePackageName(i) + '-' + str + '-' + i2 + '-' + i + '-' + i3;
    }

    /* JADX INFO: renamed from: e */
    public static Typeface m17939e(String str) {
        if (str != null && !str.isEmpty()) {
            Typeface typefaceCreate = Typeface.create(str, 0);
            Typeface typefaceCreate2 = Typeface.create(Typeface.DEFAULT, 0);
            if (typefaceCreate != null && !typefaceCreate.equals(typefaceCreate2)) {
                return typefaceCreate;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public static Font m17940f(Typeface typeface) {
        if (f54232c == null) {
            f54232c = new Paint();
        }
        f54232c.setTextSize(10.0f);
        f54232c.setTypeface(typeface);
        PositionedGlyphs positionedGlyphsShapeTextRun = TextRunShaper.shapeTextRun((CharSequence) " ", 0, 1, 0, 1, 0.0f, 0.0f, false, f54232c);
        if (positionedGlyphsShapeTextRun.glyphCount() == 0) {
            return null;
        }
        return positionedGlyphsShapeTextRun.getFont(0);
    }
}
