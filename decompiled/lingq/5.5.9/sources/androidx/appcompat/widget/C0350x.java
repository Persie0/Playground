package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.LocaleList;
import android.support.v4.media.session.C0166e;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
import dm.C5212l;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Locale;
import java.util.WeakHashMap;
import p024b3.C1304k;
import p058d.C4999a;
import p286o2.C7906f;
import p471x2.C10029b0;
import p471x2.C10049l0;

/* JADX INFO: renamed from: androidx.appcompat.widget.x */
/* JADX INFO: loaded from: classes.dex */
public final class C0350x {

    /* JADX INFO: renamed from: a */
    public final TextView f1373a;

    /* JADX INFO: renamed from: b */
    public C0355z0 f1374b;

    /* JADX INFO: renamed from: c */
    public C0355z0 f1375c;

    /* JADX INFO: renamed from: d */
    public C0355z0 f1376d;

    /* JADX INFO: renamed from: e */
    public C0355z0 f1377e;

    /* JADX INFO: renamed from: f */
    public C0355z0 f1378f;

    /* JADX INFO: renamed from: g */
    public C0355z0 f1379g;

    /* JADX INFO: renamed from: h */
    public C0355z0 f1380h;

    /* JADX INFO: renamed from: i */
    public final C0354z f1381i;

    /* JADX INFO: renamed from: j */
    public int f1382j = 0;

    /* JADX INFO: renamed from: k */
    public int f1383k = -1;

    /* JADX INFO: renamed from: l */
    public Typeface f1384l;

    /* JADX INFO: renamed from: m */
    public boolean f1385m;

    /* JADX INFO: renamed from: androidx.appcompat.widget.x$a */
    public class a extends C7906f.e {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f1386a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f1387b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ WeakReference f1388c;

        public a(int i10, int i11, WeakReference weakReference) {
            this.f1386a = i10;
            this.f1387b = i11;
            this.f1388c = weakReference;
        }

        @Override // p286o2.C7906f.e
        /* JADX INFO: renamed from: c */
        public final void mo1296c(int i10) {
        }

        @Override // p286o2.C7906f.e
        /* JADX INFO: renamed from: d */
        public final void mo1297d(Typeface typeface) {
            int i10;
            if (Build.VERSION.SDK_INT >= 28 && (i10 = this.f1386a) != -1) {
                typeface = e.m1307a(typeface, i10, (this.f1387b & 2) != 0);
            }
            C0350x c0350x = C0350x.this;
            if (c0350x.f1385m) {
                c0350x.f1384l = typeface;
                TextView textView = (TextView) this.f1388c.get();
                if (textView != null) {
                    WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
                    if (C10029b0.g.m18698b(textView)) {
                        textView.post(new RunnableC0352y(textView, typeface, c0350x.f1382j));
                        return;
                    }
                    textView.setTypeface(typeface, c0350x.f1382j);
                }
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.x$b */
    public static class b {
        /* JADX INFO: renamed from: a */
        public static Drawable[] m1298a(TextView textView) {
            return textView.getCompoundDrawablesRelative();
        }

        /* JADX INFO: renamed from: b */
        public static void m1299b(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        }

        /* JADX INFO: renamed from: c */
        public static void m1300c(TextView textView, Locale locale) {
            textView.setTextLocale(locale);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.x$c */
    public static class c {
        /* JADX INFO: renamed from: a */
        public static LocaleList m1301a(String str) {
            return LocaleList.forLanguageTags(str);
        }

        /* JADX INFO: renamed from: b */
        public static void m1302b(TextView textView, LocaleList localeList) {
            textView.setTextLocales(localeList);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.x$d */
    public static class d {
        /* JADX INFO: renamed from: a */
        public static int m1303a(TextView textView) {
            return textView.getAutoSizeStepGranularity();
        }

        /* JADX INFO: renamed from: b */
        public static void m1304b(TextView textView, int i10, int i11, int i12, int i13) {
            textView.setAutoSizeTextTypeUniformWithConfiguration(i10, i11, i12, i13);
        }

        /* JADX INFO: renamed from: c */
        public static void m1305c(TextView textView, int[] iArr, int i10) {
            textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i10);
        }

        /* JADX INFO: renamed from: d */
        public static boolean m1306d(TextView textView, String str) {
            return textView.setFontVariationSettings(str);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.x$e */
    public static class e {
        /* JADX INFO: renamed from: a */
        public static Typeface m1307a(Typeface typeface, int i10, boolean z10) {
            return Typeface.create(typeface, i10, z10);
        }
    }

    public C0350x(TextView textView) {
        this.f1373a = textView;
        this.f1381i = new C0354z(textView);
    }

    /* JADX INFO: renamed from: c */
    public static C0355z0 m1283c(Context context, C0319i c0319i, int i10) {
        ColorStateList colorStateListM1263h;
        synchronized (c0319i) {
            colorStateListM1263h = c0319i.f1219a.m1263h(i10, context);
        }
        if (colorStateListM1263h == null) {
            return null;
        }
        C0355z0 c0355z0 = new C0355z0();
        c0355z0.f1410d = true;
        c0355z0.f1407a = colorStateListM1263h;
        return c0355z0;
    }

    /* JADX INFO: renamed from: a */
    public final void m1284a(Drawable drawable, C0355z0 c0355z0) {
        if (drawable != null && c0355z0 != null) {
            C0319i.m1204e(drawable, c0355z0, this.f1373a.getDrawableState());
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m1285b() {
        C0355z0 c0355z0 = this.f1374b;
        TextView textView = this.f1373a;
        if (c0355z0 != null || this.f1375c != null || this.f1376d != null || this.f1377e != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            m1284a(compoundDrawables[0], this.f1374b);
            m1284a(compoundDrawables[1], this.f1375c);
            m1284a(compoundDrawables[2], this.f1376d);
            m1284a(compoundDrawables[3], this.f1377e);
        }
        if (this.f1378f == null && this.f1379g == null) {
            return;
        }
        Drawable[] drawableArrM1298a = b.m1298a(textView);
        m1284a(drawableArrM1298a[0], this.f1378f);
        m1284a(drawableArrM1298a[2], this.f1379g);
    }

    /* JADX INFO: renamed from: d */
    public final ColorStateList m1286d() {
        C0355z0 c0355z0 = this.f1380h;
        if (c0355z0 != null) {
            return c0355z0.f1407a;
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public final PorterDuff.Mode m1287e() {
        C0355z0 c0355z0 = this.f1380h;
        if (c0355z0 != null) {
            return c0355z0.f1408b;
        }
        return null;
    }

    @SuppressLint({"NewApi"})
    /* JADX INFO: renamed from: f */
    public final void m1288f(AttributeSet attributeSet, int i10) {
        boolean zM1112a;
        boolean z10;
        String strM1121j;
        String strM1121j2;
        int i11;
        int i12;
        int i13;
        int resourceId;
        int i14;
        TextView textView = this.f1373a;
        Context context = textView.getContext();
        C0319i c0319iM1201a = C0319i.m1201a();
        int[] iArr = C4999a.f32594h;
        C0300b1 c0300b1M1111m = C0300b1.m1111m(context, attributeSet, iArr, i10);
        C10029b0.m18657m(textView, textView.getContext(), iArr, attributeSet, c0300b1M1111m.f1134b, i10);
        int iM1120i = c0300b1M1111m.m1120i(0, -1);
        if (c0300b1M1111m.m1123l(3)) {
            this.f1374b = m1283c(context, c0319iM1201a, c0300b1M1111m.m1120i(3, 0));
        }
        if (c0300b1M1111m.m1123l(1)) {
            this.f1375c = m1283c(context, c0319iM1201a, c0300b1M1111m.m1120i(1, 0));
        }
        if (c0300b1M1111m.m1123l(4)) {
            this.f1376d = m1283c(context, c0319iM1201a, c0300b1M1111m.m1120i(4, 0));
        }
        if (c0300b1M1111m.m1123l(2)) {
            this.f1377e = m1283c(context, c0319iM1201a, c0300b1M1111m.m1120i(2, 0));
        }
        int i15 = Build.VERSION.SDK_INT;
        if (c0300b1M1111m.m1123l(5)) {
            this.f1378f = m1283c(context, c0319iM1201a, c0300b1M1111m.m1120i(5, 0));
        }
        if (c0300b1M1111m.m1123l(6)) {
            this.f1379g = m1283c(context, c0319iM1201a, c0300b1M1111m.m1120i(6, 0));
        }
        c0300b1M1111m.m1124n();
        boolean z11 = textView.getTransformationMethod() instanceof PasswordTransformationMethod;
        int[] iArr2 = C4999a.f32610x;
        if (iM1120i != -1) {
            C0300b1 c0300b1 = new C0300b1(context, context.obtainStyledAttributes(iM1120i, iArr2));
            if (z11 || !c0300b1.m1123l(14)) {
                zM1112a = false;
                z10 = false;
            } else {
                zM1112a = c0300b1.m1112a(14, false);
                z10 = true;
            }
            m1295m(context, c0300b1);
            if (c0300b1.m1123l(15)) {
                strM1121j = c0300b1.m1121j(15);
                i14 = 13;
            } else {
                i14 = 13;
                strM1121j = null;
            }
            strM1121j2 = c0300b1.m1123l(i14) ? c0300b1.m1121j(i14) : null;
            c0300b1.m1124n();
        } else {
            zM1112a = false;
            z10 = false;
            strM1121j = null;
            strM1121j2 = null;
        }
        C0300b1 c0300b2 = new C0300b1(context, context.obtainStyledAttributes(attributeSet, iArr2, i10, 0));
        if (z11 || !c0300b2.m1123l(14)) {
            i11 = 15;
        } else {
            zM1112a = c0300b2.m1112a(14, false);
            i11 = 15;
            z10 = true;
        }
        if (c0300b2.m1123l(i11)) {
            strM1121j = c0300b2.m1121j(i11);
        }
        if (c0300b2.m1123l(13)) {
            strM1121j2 = c0300b2.m1121j(13);
        }
        String str = strM1121j2;
        if (i15 >= 28 && c0300b2.m1123l(0) && c0300b2.m1115d(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        m1295m(context, c0300b2);
        c0300b2.m1124n();
        if (!z11 && z10) {
            textView.setAllCaps(zM1112a);
        }
        Typeface typeface = this.f1384l;
        if (typeface != null) {
            if (this.f1383k == -1) {
                textView.setTypeface(typeface, this.f1382j);
            } else {
                textView.setTypeface(typeface);
            }
        }
        if (str != null) {
            d.m1306d(textView, str);
        }
        if (strM1121j != null) {
            c.m1302b(textView, c.m1301a(strM1121j));
        }
        int[] iArr3 = C4999a.f32595i;
        C0354z c0354z = this.f1381i;
        Context context2 = c0354z.f1405j;
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr3, i10, 0);
        TextView textView2 = c0354z.f1404i;
        C10029b0.m18657m(textView2, textView2.getContext(), iArr3, attributeSet, typedArrayObtainStyledAttributes, i10);
        if (typedArrayObtainStyledAttributes.hasValue(5)) {
            c0354z.f1396a = typedArrayObtainStyledAttributes.getInt(5, 0);
        }
        float dimension = typedArrayObtainStyledAttributes.hasValue(4) ? typedArrayObtainStyledAttributes.getDimension(4, -1.0f) : -1.0f;
        float dimension2 = typedArrayObtainStyledAttributes.hasValue(2) ? typedArrayObtainStyledAttributes.getDimension(2, -1.0f) : -1.0f;
        float dimension3 = typedArrayObtainStyledAttributes.hasValue(1) ? typedArrayObtainStyledAttributes.getDimension(1, -1.0f) : -1.0f;
        if (typedArrayObtainStyledAttributes.hasValue(3) && (resourceId = typedArrayObtainStyledAttributes.getResourceId(3, 0)) > 0) {
            TypedArray typedArrayObtainTypedArray = typedArrayObtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            int length = typedArrayObtainTypedArray.length();
            int[] iArr4 = new int[length];
            if (length > 0) {
                for (int i16 = 0; i16 < length; i16++) {
                    iArr4[i16] = typedArrayObtainTypedArray.getDimensionPixelSize(i16, -1);
                }
                c0354z.f1401f = C0354z.m1310b(iArr4);
                c0354z.m1317h();
            }
            typedArrayObtainTypedArray.recycle();
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!c0354z.m1318i()) {
            c0354z.f1396a = 0;
        } else if (c0354z.f1396a == 1) {
            if (!c0354z.f1402g) {
                DisplayMetrics displayMetrics = context2.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    i13 = 2;
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                } else {
                    i13 = 2;
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(i13, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                c0354z.m1319j(dimension2, dimension3, dimension);
            }
            c0354z.m1316g();
        }
        if (C0318h1.f1216b && c0354z.f1396a != 0) {
            int[] iArr5 = c0354z.f1401f;
            if (iArr5.length > 0) {
                if (d.m1303a(textView) != -1.0f) {
                    d.m1304b(textView, Math.round(c0354z.f1399d), Math.round(c0354z.f1400e), Math.round(c0354z.f1398c), 0);
                } else {
                    d.m1305c(textView, iArr5, 0);
                }
            }
        }
        C0300b1 c0300b3 = new C0300b1(context, context.obtainStyledAttributes(attributeSet, iArr3));
        int iM1120i2 = c0300b3.m1120i(8, -1);
        Drawable drawableM1205b = iM1120i2 != -1 ? c0319iM1201a.m1205b(context, iM1120i2) : null;
        int iM1120i3 = c0300b3.m1120i(13, -1);
        Drawable drawableM1205b2 = iM1120i3 != -1 ? c0319iM1201a.m1205b(context, iM1120i3) : null;
        int iM1120i4 = c0300b3.m1120i(9, -1);
        Drawable drawableM1205b3 = iM1120i4 != -1 ? c0319iM1201a.m1205b(context, iM1120i4) : null;
        int iM1120i5 = c0300b3.m1120i(6, -1);
        Drawable drawableM1205b4 = iM1120i5 != -1 ? c0319iM1201a.m1205b(context, iM1120i5) : null;
        int iM1120i6 = c0300b3.m1120i(10, -1);
        Drawable drawableM1205b5 = iM1120i6 != -1 ? c0319iM1201a.m1205b(context, iM1120i6) : null;
        int iM1120i7 = c0300b3.m1120i(7, -1);
        Drawable drawableM1205b6 = iM1120i7 != -1 ? c0319iM1201a.m1205b(context, iM1120i7) : null;
        if (drawableM1205b5 != null || drawableM1205b6 != null) {
            Drawable[] drawableArrM1298a = b.m1298a(textView);
            if (drawableM1205b5 == null) {
                drawableM1205b5 = drawableArrM1298a[0];
            }
            if (drawableM1205b2 == null) {
                drawableM1205b2 = drawableArrM1298a[1];
            }
            if (drawableM1205b6 == null) {
                drawableM1205b6 = drawableArrM1298a[2];
            }
            if (drawableM1205b4 == null) {
                drawableM1205b4 = drawableArrM1298a[3];
            }
            b.m1299b(textView, drawableM1205b5, drawableM1205b2, drawableM1205b6, drawableM1205b4);
        } else if (drawableM1205b != null || drawableM1205b2 != null || drawableM1205b3 != null || drawableM1205b4 != null) {
            Drawable[] drawableArrM1298a2 = b.m1298a(textView);
            Drawable drawable = drawableArrM1298a2[0];
            if (drawable == null && drawableArrM1298a2[2] == null) {
                Drawable[] compoundDrawables = textView.getCompoundDrawables();
                if (drawableM1205b == null) {
                    drawableM1205b = compoundDrawables[0];
                }
                if (drawableM1205b2 == null) {
                    drawableM1205b2 = compoundDrawables[1];
                }
                if (drawableM1205b3 == null) {
                    drawableM1205b3 = compoundDrawables[2];
                }
                if (drawableM1205b4 == null) {
                    drawableM1205b4 = compoundDrawables[3];
                }
                textView.setCompoundDrawablesWithIntrinsicBounds(drawableM1205b, drawableM1205b2, drawableM1205b3, drawableM1205b4);
            } else {
                if (drawableM1205b2 == null) {
                    drawableM1205b2 = drawableArrM1298a2[1];
                }
                Drawable drawable2 = drawableArrM1298a2[2];
                if (drawableM1205b4 == null) {
                    drawableM1205b4 = drawableArrM1298a2[3];
                }
                b.m1299b(textView, drawable, drawableM1205b2, drawable2, drawableM1205b4);
            }
        }
        if (c0300b3.m1123l(11)) {
            C1304k.c.m4849f(textView, c0300b3.m1113b(11));
        }
        if (c0300b3.m1123l(12)) {
            i12 = -1;
            C1304k.c.m4850g(textView, C0311f0.m1188c(c0300b3.m1119h(12, -1), null));
        } else {
            i12 = -1;
        }
        int iM1115d = c0300b3.m1115d(15, i12);
        int iM1115d2 = c0300b3.m1115d(18, i12);
        int iM1115d3 = c0300b3.m1115d(19, i12);
        c0300b3.m1124n();
        if (iM1115d != i12) {
            C1304k.m4828c(textView, iM1115d);
        }
        if (iM1115d2 != i12) {
            C1304k.m4829d(textView, iM1115d2);
        }
        if (iM1115d3 != i12) {
            C5212l.m11131B(iM1115d3);
            int fontMetricsInt = textView.getPaint().getFontMetricsInt(null);
            if (iM1115d3 != fontMetricsInt) {
                textView.setLineSpacing(iM1115d3 - fontMetricsInt, 1.0f);
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m1289g(int i10, Context context) {
        String strM1121j;
        C0300b1 c0300b1 = new C0300b1(context, context.obtainStyledAttributes(i10, C4999a.f32610x));
        boolean zM1123l = c0300b1.m1123l(14);
        TextView textView = this.f1373a;
        if (zM1123l) {
            textView.setAllCaps(c0300b1.m1112a(14, false));
        }
        if (c0300b1.m1123l(0) && c0300b1.m1115d(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        m1295m(context, c0300b1);
        if (c0300b1.m1123l(13) && (strM1121j = c0300b1.m1121j(13)) != null) {
            d.m1306d(textView, strM1121j);
        }
        c0300b1.m1124n();
        Typeface typeface = this.f1384l;
        if (typeface != null) {
            textView.setTypeface(typeface, this.f1382j);
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m1290h(int i10, int i11, int i12, int i13) throws IllegalArgumentException {
        C0354z c0354z = this.f1381i;
        if (c0354z.m1318i()) {
            DisplayMetrics displayMetrics = c0354z.f1405j.getResources().getDisplayMetrics();
            c0354z.m1319j(TypedValue.applyDimension(i13, i10, displayMetrics), TypedValue.applyDimension(i13, i11, displayMetrics), TypedValue.applyDimension(i13, i12, displayMetrics));
            if (c0354z.m1316g()) {
                c0354z.m1313a();
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m1291i(int[] iArr, int i10) throws IllegalArgumentException {
        C0354z c0354z = this.f1381i;
        if (c0354z.m1318i()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArrCopyOf = new int[length];
                if (i10 == 0) {
                    iArrCopyOf = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = c0354z.f1405j.getResources().getDisplayMetrics();
                    for (int i11 = 0; i11 < length; i11++) {
                        iArrCopyOf[i11] = Math.round(TypedValue.applyDimension(i10, iArr[i11], displayMetrics));
                    }
                }
                c0354z.f1401f = C0354z.m1310b(iArrCopyOf);
                if (!c0354z.m1317h()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                c0354z.f1402g = false;
            }
            if (c0354z.m1316g()) {
                c0354z.m1313a();
            }
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: j */
    public final void m1292j(int i10) {
        C0354z c0354z = this.f1381i;
        if (c0354z.m1318i()) {
            if (i10 == 0) {
                c0354z.f1396a = 0;
                c0354z.f1399d = -1.0f;
                c0354z.f1400e = -1.0f;
                c0354z.f1398c = -1.0f;
                c0354z.f1401f = new int[0];
                c0354z.f1397b = false;
                return;
            }
            if (i10 != 1) {
                throw new IllegalArgumentException(C0166e.m761g("Unknown auto-size text type: ", i10));
            }
            DisplayMetrics displayMetrics = c0354z.f1405j.getResources().getDisplayMetrics();
            c0354z.m1319j(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (c0354z.m1316g()) {
                c0354z.m1313a();
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m1293k(ColorStateList colorStateList) {
        if (this.f1380h == null) {
            this.f1380h = new C0355z0();
        }
        C0355z0 c0355z0 = this.f1380h;
        c0355z0.f1407a = colorStateList;
        c0355z0.f1410d = colorStateList != null;
        this.f1374b = c0355z0;
        this.f1375c = c0355z0;
        this.f1376d = c0355z0;
        this.f1377e = c0355z0;
        this.f1378f = c0355z0;
        this.f1379g = c0355z0;
    }

    /* JADX INFO: renamed from: l */
    public final void m1294l(PorterDuff.Mode mode) {
        if (this.f1380h == null) {
            this.f1380h = new C0355z0();
        }
        C0355z0 c0355z0 = this.f1380h;
        c0355z0.f1408b = mode;
        c0355z0.f1409c = mode != null;
        this.f1374b = c0355z0;
        this.f1375c = c0355z0;
        this.f1376d = c0355z0;
        this.f1377e = c0355z0;
        this.f1378f = c0355z0;
        this.f1379g = c0355z0;
    }

    /* JADX INFO: renamed from: m */
    public final void m1295m(Context context, C0300b1 c0300b1) {
        String strM1121j;
        this.f1382j = c0300b1.m1119h(2, this.f1382j);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            int iM1119h = c0300b1.m1119h(11, -1);
            this.f1383k = iM1119h;
            if (iM1119h != -1) {
                this.f1382j = (this.f1382j & 2) | 0;
            }
        }
        int i11 = 10;
        if (!c0300b1.m1123l(10) && !c0300b1.m1123l(12)) {
            if (c0300b1.m1123l(1)) {
                this.f1385m = false;
                int iM1119h2 = c0300b1.m1119h(1, 1);
                if (iM1119h2 != 1) {
                    if (iM1119h2 == 2) {
                        this.f1384l = Typeface.SERIF;
                        return;
                    } else {
                        if (iM1119h2 != 3) {
                            return;
                        }
                        this.f1384l = Typeface.MONOSPACE;
                        return;
                    }
                }
                this.f1384l = Typeface.SANS_SERIF;
            }
            return;
        }
        this.f1384l = null;
        if (c0300b1.m1123l(12)) {
            i11 = 12;
        }
        int i12 = this.f1383k;
        int i13 = this.f1382j;
        if (!context.isRestricted()) {
            try {
                Typeface typefaceM1118g = c0300b1.m1118g(i11, this.f1382j, new a(i12, i13, new WeakReference(this.f1373a)));
                if (typefaceM1118g != null) {
                    if (i10 < 28 || this.f1383k == -1) {
                        this.f1384l = typefaceM1118g;
                    } else {
                        this.f1384l = e.m1307a(Typeface.create(typefaceM1118g, 0), this.f1383k, (this.f1382j & 2) != 0);
                    }
                }
                this.f1385m = this.f1384l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f1384l == null && (strM1121j = c0300b1.m1121j(i11)) != null) {
            if (Build.VERSION.SDK_INT >= 28 && this.f1383k != -1) {
                this.f1384l = e.m1307a(Typeface.create(strM1121j, 0), this.f1383k, (this.f1382j & 2) != 0);
                return;
            }
            this.f1384l = Typeface.create(strM1121j, this.f1382j);
        }
    }
}
