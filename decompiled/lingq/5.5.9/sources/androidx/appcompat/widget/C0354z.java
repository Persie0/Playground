package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: androidx.appcompat.widget.z */
/* JADX INFO: loaded from: classes.dex */
public final class C0354z {

    /* JADX INFO: renamed from: l */
    public static final RectF f1394l = new RectF();

    /* JADX INFO: renamed from: m */
    @SuppressLint({"BanConcurrentHashMap"})
    public static final ConcurrentHashMap<String, Method> f1395m = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: a */
    public int f1396a = 0;

    /* JADX INFO: renamed from: b */
    public boolean f1397b = false;

    /* JADX INFO: renamed from: c */
    public float f1398c = -1.0f;

    /* JADX INFO: renamed from: d */
    public float f1399d = -1.0f;

    /* JADX INFO: renamed from: e */
    public float f1400e = -1.0f;

    /* JADX INFO: renamed from: f */
    public int[] f1401f = new int[0];

    /* JADX INFO: renamed from: g */
    public boolean f1402g = false;

    /* JADX INFO: renamed from: h */
    public TextPaint f1403h;

    /* JADX INFO: renamed from: i */
    public final TextView f1404i;

    /* JADX INFO: renamed from: j */
    public final Context f1405j;

    /* JADX INFO: renamed from: k */
    public final d f1406k;

    /* JADX INFO: renamed from: androidx.appcompat.widget.z$a */
    public static final class a {
        /* JADX INFO: renamed from: a */
        public static StaticLayout m1320a(CharSequence charSequence, Layout.Alignment alignment, int i10, TextView textView, TextPaint textPaint) {
            return new StaticLayout(charSequence, textPaint, i10, alignment, textView.getLineSpacingMultiplier(), textView.getLineSpacingExtra(), textView.getIncludeFontPadding());
        }

        /* JADX INFO: renamed from: b */
        public static int m1321b(TextView textView) {
            return textView.getMaxLines();
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.z$b */
    public static final class b {
        /* JADX INFO: renamed from: a */
        public static boolean m1322a(View view) {
            return view.isInLayout();
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.z$c */
    public static final class c {
        /* JADX INFO: renamed from: a */
        public static StaticLayout m1323a(CharSequence charSequence, Layout.Alignment alignment, int i10, int i11, TextView textView, TextPaint textPaint, f fVar) {
            StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i10);
            StaticLayout.Builder hyphenationFrequency = builderObtain.setAlignment(alignment).setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier()).setIncludePad(textView.getIncludeFontPadding()).setBreakStrategy(textView.getBreakStrategy()).setHyphenationFrequency(textView.getHyphenationFrequency());
            if (i11 == -1) {
                i11 = Integer.MAX_VALUE;
            }
            hyphenationFrequency.setMaxLines(i11);
            try {
                fVar.mo1324a(builderObtain, textView);
            } catch (ClassCastException unused) {
                Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
            }
            return builderObtain.build();
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.z$d */
    public static class d extends f {
        @Override // androidx.appcompat.widget.C0354z.f
        /* JADX INFO: renamed from: a */
        public void mo1324a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection((TextDirectionHeuristic) C0354z.m1312e(textView, TextDirectionHeuristics.FIRSTSTRONG_LTR, "getTextDirectionHeuristic"));
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.z$e */
    public static class e extends d {
        @Override // androidx.appcompat.widget.C0354z.d, androidx.appcompat.widget.C0354z.f
        /* JADX INFO: renamed from: a */
        public void mo1324a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection(textView.getTextDirectionHeuristic());
        }

        @Override // androidx.appcompat.widget.C0354z.f
        /* JADX INFO: renamed from: b */
        public boolean mo1325b(TextView textView) {
            return textView.isHorizontallyScrollable();
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.z$f */
    public static class f {
        /* JADX INFO: renamed from: a */
        public void mo1324a(StaticLayout.Builder builder, TextView textView) {
            throw null;
        }

        /* JADX INFO: renamed from: b */
        public boolean mo1325b(TextView textView) {
            return ((Boolean) C0354z.m1312e(textView, Boolean.FALSE, "getHorizontallyScrolling")).booleanValue();
        }
    }

    static {
        new ConcurrentHashMap();
    }

    public C0354z(TextView textView) {
        this.f1404i = textView;
        this.f1405j = textView.getContext();
        if (Build.VERSION.SDK_INT >= 29) {
            this.f1406k = new e();
        } else {
            this.f1406k = new d();
        }
    }

    /* JADX INFO: renamed from: b */
    public static int[] m1310b(int[] iArr) {
        int length = iArr.length;
        if (length == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i10 : iArr) {
            if (i10 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i10)) < 0) {
                arrayList.add(Integer.valueOf(i10));
            }
        }
        if (length == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i11 = 0; i11 < size; i11++) {
            iArr2[i11] = ((Integer) arrayList.get(i11)).intValue();
        }
        return iArr2;
    }

    /* JADX INFO: renamed from: d */
    public static Method m1311d(String str) {
        try {
            ConcurrentHashMap<String, Method> concurrentHashMap = f1395m;
            Method declaredMethod = concurrentHashMap.get(str);
            if (declaredMethod == null && (declaredMethod = TextView.class.getDeclaredMethod(str, new Class[0])) != null) {
                declaredMethod.setAccessible(true);
                concurrentHashMap.put(str, declaredMethod);
            }
            return declaredMethod;
        } catch (Exception e10) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e10);
            return null;
        }
    }

    /* JADX INFO: renamed from: e */
    public static Object m1312e(Object obj, Object obj2, String str) {
        try {
            return m1311d(str).invoke(obj, new Object[0]);
        } catch (Exception e10) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e10);
            return obj2;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m1313a() {
        if (m1318i() && this.f1396a != 0) {
            if (this.f1397b) {
                if (this.f1404i.getMeasuredHeight() > 0 && this.f1404i.getMeasuredWidth() > 0) {
                    int measuredWidth = this.f1406k.mo1325b(this.f1404i) ? 1048576 : (this.f1404i.getMeasuredWidth() - this.f1404i.getTotalPaddingLeft()) - this.f1404i.getTotalPaddingRight();
                    int height = (this.f1404i.getHeight() - this.f1404i.getCompoundPaddingBottom()) - this.f1404i.getCompoundPaddingTop();
                    if (measuredWidth > 0 && height > 0) {
                        RectF rectF = f1394l;
                        synchronized (rectF) {
                            rectF.setEmpty();
                            rectF.right = measuredWidth;
                            rectF.bottom = height;
                            float fM1314c = m1314c(rectF);
                            if (fM1314c != this.f1404i.getTextSize()) {
                                m1315f(0, fM1314c);
                            }
                        }
                    }
                    return;
                }
                return;
            }
            this.f1397b = true;
        }
    }

    /* JADX INFO: renamed from: c */
    public final int m1314c(RectF rectF) {
        CharSequence transformation;
        int length = this.f1401f.length;
        if (length == 0) {
            throw new IllegalStateException("No available text sizes to choose from.");
        }
        int i10 = length - 1;
        int i11 = 1;
        int i12 = 0;
        while (i11 <= i10) {
            int i13 = (i11 + i10) / 2;
            int i14 = this.f1401f[i13];
            TextView textView = this.f1404i;
            CharSequence text = textView.getText();
            TransformationMethod transformationMethod = textView.getTransformationMethod();
            if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, textView)) != null) {
                text = transformation;
            }
            int iM1321b = a.m1321b(textView);
            TextPaint textPaint = this.f1403h;
            if (textPaint == null) {
                this.f1403h = new TextPaint();
            } else {
                textPaint.reset();
            }
            this.f1403h.set(textView.getPaint());
            this.f1403h.setTextSize(i14);
            StaticLayout staticLayoutM1323a = c.m1323a(text, (Layout.Alignment) m1312e(textView, Layout.Alignment.ALIGN_NORMAL, "getLayoutAlignment"), Math.round(rectF.right), iM1321b, this.f1404i, this.f1403h, this.f1406k);
            if ((iM1321b == -1 || (staticLayoutM1323a.getLineCount() <= iM1321b && staticLayoutM1323a.getLineEnd(staticLayoutM1323a.getLineCount() - 1) == text.length())) && ((float) staticLayoutM1323a.getHeight()) <= rectF.bottom) {
                int i15 = i13 + 1;
                i12 = i11;
                i11 = i15;
            } else {
                i12 = i13 - 1;
                i10 = i12;
            }
        }
        return this.f1401f[i12];
    }

    /* JADX INFO: renamed from: f */
    public final void m1315f(int i10, float f3) {
        Context context = this.f1405j;
        float fApplyDimension = TypedValue.applyDimension(i10, f3, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics());
        TextView textView = this.f1404i;
        if (fApplyDimension != textView.getPaint().getTextSize()) {
            textView.getPaint().setTextSize(fApplyDimension);
            boolean zM1322a = b.m1322a(textView);
            if (textView.getLayout() != null) {
                this.f1397b = false;
                try {
                    Method methodM1311d = m1311d("nullLayouts");
                    if (methodM1311d != null) {
                        methodM1311d.invoke(textView, new Object[0]);
                    }
                } catch (Exception e10) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e10);
                }
                if (zM1322a) {
                    textView.forceLayout();
                } else {
                    textView.requestLayout();
                }
                textView.invalidate();
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final boolean m1316g() {
        if (m1318i() && this.f1396a == 1) {
            if (!this.f1402g || this.f1401f.length == 0) {
                int iFloor = ((int) Math.floor((this.f1400e - this.f1399d) / this.f1398c)) + 1;
                int[] iArr = new int[iFloor];
                for (int i10 = 0; i10 < iFloor; i10++) {
                    iArr[i10] = Math.round((i10 * this.f1398c) + this.f1399d);
                }
                this.f1401f = m1310b(iArr);
            }
            this.f1397b = true;
        } else {
            this.f1397b = false;
        }
        return this.f1397b;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m1317h() {
        int[] iArr = this.f1401f;
        int length = iArr.length;
        boolean z10 = length > 0;
        this.f1402g = z10;
        if (z10) {
            this.f1396a = 1;
            this.f1399d = iArr[0];
            this.f1400e = iArr[length - 1];
            this.f1398c = -1.0f;
        }
        return z10;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m1318i() {
        return !(this.f1404i instanceof AppCompatEditText);
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: j */
    public final void m1319j(float f3, float f10, float f11) throws IllegalArgumentException {
        if (f3 <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f3 + "px) is less or equal to (0px)");
        }
        if (f10 <= f3) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f10 + "px) is less or equal to minimum auto-size text size (" + f3 + "px)");
        }
        if (f11 <= 0.0f) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f11 + "px) is less or equal to (0px)");
        }
        this.f1396a = 1;
        this.f1399d = f3;
        this.f1400e = f10;
        this.f1398c = f11;
        this.f1402g = false;
    }
}
