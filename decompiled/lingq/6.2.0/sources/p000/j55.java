package p000;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import com.lingq.core.domain.model.LanguageLearn;
import com.lingq.core.domain.model.theme.ReaderFont;
import com.lingq.feature.reader.pagination.domain.LessonPagesBuilder$Companion$translationHeightCache$1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.AbstractC3194a;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.MapBuilder;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes3.dex */
public final class j55 {
    public static final d55 Companion = new d55();

    /* JADX INFO: renamed from: r */
    public static final LessonPagesBuilder$Companion$translationHeightCache$1 f45073r = new LessonPagesBuilder$Companion$translationHeightCache$1(600, 0.75f, true);

    /* JADX INFO: renamed from: a */
    public final Context f45074a;

    /* JADX INFO: renamed from: b */
    public StaticLayout f45075b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f45076c;

    /* JADX INFO: renamed from: d */
    public final LinkedHashMap f45077d;

    /* JADX INFO: renamed from: e */
    public int f45078e;

    /* JADX INFO: renamed from: f */
    public int f45079f;

    /* JADX INFO: renamed from: g */
    public t45 f45080g;

    /* JADX INFO: renamed from: h */
    public ox9 f45081h;

    /* JADX INFO: renamed from: i */
    public jn8 f45082i;

    /* JADX INFO: renamed from: j */
    public String f45083j;

    /* JADX INFO: renamed from: k */
    public String f45084k;

    /* JADX INFO: renamed from: l */
    public String f45085l;

    /* JADX INFO: renamed from: m */
    public int f45086m;

    /* JADX INFO: renamed from: n */
    public Map f45087n;

    /* JADX INFO: renamed from: o */
    public float f45088o;

    /* JADX INFO: renamed from: p */
    public Map f45089p;

    /* JADX INFO: renamed from: q */
    public final Regex f45090q;

    public j55(Context context) {
        context.getClass();
        this.f45074a = context;
        this.f45076c = new ArrayList();
        this.f45077d = new LinkedHashMap();
        this.f45083j = "";
        this.f45084k = "";
        this.f45085l = "";
        this.f45087n = AbstractC3194a.m15360M();
        this.f45089p = AbstractC3194a.m15360M();
        this.f45090q = new Regex("IMG_\\d+_READ");
    }

    /* JADX INFO: renamed from: d */
    public static List m14292d(List list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            xz7 xz7Var = (xz7) it.next();
            int i = xz7Var.f69004a;
            int i2 = xz7Var.f69010g;
            int i3 = i - xz7Var.f69006c;
            if (i3 < 0) {
                i3 = 0;
            }
            Integer num = (Integer) linkedHashMap.get(Integer.valueOf(i2));
            if (num == null || i3 < num.intValue()) {
                linkedHashMap.put(Integer.valueOf(i2), Integer.valueOf(i3));
            }
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            arrayList.add(new h55(((Number) entry.getKey()).intValue(), ((Number) entry.getValue()).intValue()));
        }
        return u91.m22614f1(arrayList, new ma3(23));
    }

    /* JADX WARN: Code restructure failed: missing block: B:181:0x0459, code lost:
    
        if (r2 == null) goto L182;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List m14293a(ArrayList arrayList) throws Throwable {
        float f;
        ArrayList arrayList2;
        String str;
        boolean z;
        Throwable th;
        ArrayList arrayList3;
        StaticLayout staticLayoutM12361b;
        float f2;
        int i;
        float f3;
        Object g55Var;
        f55 f55Var;
        int i2;
        int i3;
        int i4;
        int i5;
        int iM14297f;
        j55 j55Var = this;
        t45 t45Var = j55Var.f45080g;
        String str2 = "layout";
        if (t45Var == null) {
            fa4.m11636J("layout");
            throw null;
        }
        if (t45Var.f61851a > 0.0f) {
            j55Var.f45078e = 0;
            j55Var.f45079f = 0;
            j55Var.f45077d.clear();
            j55Var.f45088o = 0.0f;
            ArrayList arrayList4 = new ArrayList();
            ox9 ox9Var = j55Var.f45081h;
            String str3 = "textSettings";
            if (ox9Var == null) {
                fa4.m11636J("textSettings");
                throw null;
            }
            boolean z2 = true;
            if (ox9Var.f55148e) {
                ArrayList arrayList5 = j55Var.f45076c;
                int size = arrayList5.size();
                for (int i6 = 0; i6 < size; i6++) {
                    String strSubstring = (String) arrayList5.get(i6);
                    if (cl9.m4842Y(strSubstring, "\n\n", false)) {
                        strSubstring = strSubstring.substring(1);
                    }
                    arrayList4.add(j55Var.m14296e(i6, strSubstring, j55Var.m14295c(j55Var.f45078e, strSubstring.length() + j55Var.f45078e, arrayList4.size(), arrayList), false, false));
                    j55Var.f45078e = strSubstring.length() + j55Var.f45078e;
                }
                return arrayList4;
            }
            boolean z3 = ox9Var.f55149f;
            String str4 = j55Var.f45084k;
            Regex regex = j55Var.f45090q;
            Context context = j55Var.f45074a;
            if (z3) {
                System.nanoTime();
                if (str4.length() == 0 || arrayList.isEmpty()) {
                    f55Var = new f55(str4, arrayList);
                } else {
                    List listM14292d = m14292d(arrayList);
                    if (listM14292d.isEmpty()) {
                        f55Var = new f55(str4, arrayList);
                    } else {
                        TextPaint textPaint = new TextPaint();
                        th = null;
                        ox9 ox9Var2 = j55Var.f45081h;
                        if (ox9Var2 == null) {
                            fa4.m11636J("textSettings");
                            throw null;
                        }
                        textPaint.setTextSize(jfa.m14430m(context, ox9Var2.f55145b));
                        textPaint.setAntiAlias(true);
                        ox9 ox9Var3 = j55Var.f45081h;
                        if (ox9Var3 == null) {
                            fa4.m11636J("textSettings");
                            throw null;
                        }
                        textPaint.setTypeface(mjc.m16862d(ox9Var3.f55144a, context));
                        int i7 = j55Var.f45086m;
                        int i8 = i7 < 1 ? 1 : i7;
                        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                        ox9 ox9Var4 = j55Var.f45081h;
                        if (ox9Var4 == null) {
                            fa4.m11636J("textSettings");
                            throw null;
                        }
                        StaticLayout staticLayoutM12361b2 = g4d.m12361b("A\nA\nA", textPaint, i8, (float) ox9Var4.f55146c, true, false);
                        float lineBottom = staticLayoutM12361b2.getLineCount() < 3 ? 0.0f : staticLayoutM12361b2.getLineBottom(1) - staticLayoutM12361b2.getLineBottom(0);
                        if (lineBottom <= 0.0f) {
                            f55Var = new f55(str4, arrayList);
                            f = 0.0f;
                        } else {
                            j55Var.f45088o = lineBottom;
                            TextPaint textPaint2 = new TextPaint();
                            f = 0.0f;
                            ox9 ox9Var5 = j55Var.f45081h;
                            if (ox9Var5 == null) {
                                fa4.m11636J("textSettings");
                                throw null;
                            }
                            textPaint2.setTextSize(jfa.m14430m(context, ox9Var5.f55145b) * 0.72f);
                            textPaint2.setAntiAlias(true);
                            ox9 ox9Var6 = j55Var.f45081h;
                            if (ox9Var6 == null) {
                                fa4.m11636J("textSettings");
                                throw null;
                            }
                            textPaint2.setTypeface(Typeface.create(mjc.m16862d(ox9Var6.f55144a, context), 2));
                            int i9 = j55Var.f45086m;
                            StaticLayout staticLayoutM12361b3 = g4d.m12361b("A\nA\nA", textPaint2, i9 < 1 ? 1 : i9, 1.0f, false, false);
                            float lineBottom2 = staticLayoutM12361b3.getLineCount() < 3 ? 0.0f : staticLayoutM12361b3.getLineBottom(1) - staticLayoutM12361b3.getLineBottom(0);
                            if (lineBottom2 <= 0.0f) {
                                f55Var = new f55(str4, arrayList);
                            } else {
                                HashMap map = new HashMap(listM14292d.size());
                                int i10 = 0;
                                for (Object obj : listM14292d) {
                                    boolean z4 = z2;
                                    int i11 = i10 + 1;
                                    if (i10 < 0) {
                                        vz1.m23628e0();
                                        throw null;
                                    }
                                    boolean z5 = z3;
                                    h55 h55Var = (h55) obj;
                                    String str5 = str2;
                                    Map map2 = j55Var.f45087n;
                                    ArrayList arrayList6 = arrayList4;
                                    int i12 = h55Var.f41802a;
                                    int i13 = h55Var.f41803b;
                                    String str6 = str3;
                                    String str7 = (String) map2.get(Integer.valueOf(i12));
                                    String string = str7 != null ? vk9.m23376L0(str7).toString() : null;
                                    if (string == null) {
                                        string = "";
                                    }
                                    if (vk9.m23391n0(string)) {
                                        h55 h55Var2 = (h55) u91.m22592J0(i11, listM14292d);
                                        i5 = i11;
                                        String string2 = vk9.m23376L0(str4.substring(l70.m15945h(i13, 0, str4.length()), l70.m15945h(h55Var2 != null ? h55Var2.f41803b : str4.length(), i13, str4.length()))).toString();
                                        iM14297f = vk9.m23391n0(string2) ? 0 : j55Var.m14297f(string2, lineBottom, lineBottom2, textPaint2);
                                    } else {
                                        iM14297f = j55Var.m14297f(string, lineBottom, lineBottom2, textPaint2);
                                        i5 = i11;
                                    }
                                    if (iM14297f > 0) {
                                        map.put(Integer.valueOf(h55Var.f41802a), Integer.valueOf(iM14297f));
                                    }
                                    z3 = z5;
                                    str2 = str5;
                                    z2 = z4;
                                    arrayList4 = arrayList6;
                                    i10 = i5;
                                    str3 = str6;
                                }
                                z3 = z3;
                                str2 = str2;
                                arrayList2 = arrayList4;
                                str = str3;
                                z = z2;
                                StringBuilder sb = new StringBuilder(str4);
                                ArrayList arrayList7 = new ArrayList();
                                int size2 = listM14292d.size() - 1;
                                int i14 = 0;
                                int i15 = 0;
                                while (i14 < size2) {
                                    h55 h55Var3 = (h55) listM14292d.get(i14);
                                    int i16 = i14 + 1;
                                    h55 h55Var4 = (h55) listM14292d.get(i16);
                                    Integer num = (Integer) map.get(Integer.valueOf(h55Var3.f41802a));
                                    int iIntValue = num != null ? num.intValue() : 0;
                                    if (iIntValue > 0) {
                                        i2 = size2;
                                        int iM15945h = l70.m15945h(h55Var3.f41803b + i15, 0, sb.length());
                                        i3 = i16;
                                        int iM15945h2 = l70.m15945h(h55Var4.f41803b + i15, 0, sb.length());
                                        if (iM15945h2 > iM15945h) {
                                            String strSubstring2 = sb.substring(iM15945h, iM15945h2);
                                            strSubstring2.getClass();
                                            dr5 dr5VarM15424b = regex.m15424b(strSubstring2);
                                            if (dr5VarM15424b != null) {
                                                iM15945h2 = iM15945h + dr5VarM15424b.m10611b().f40379a;
                                            }
                                            int i17 = iM15945h2;
                                            while (i17 > iM15945h && ci8.m4697J(sb.charAt(i17 - 1))) {
                                                i17--;
                                            }
                                            if (i17 >= iM15945h2) {
                                                i4 = 0;
                                            } else {
                                                i4 = 0;
                                                while (i17 < iM15945h2) {
                                                    int i18 = i17;
                                                    if (sb.charAt(i17) == '\n') {
                                                        i4++;
                                                    }
                                                    i17 = i18 + 1;
                                                }
                                            }
                                            int i19 = iIntValue - i4;
                                            if (i19 < 0) {
                                                i19 = 0;
                                            }
                                            if (i19 > 0) {
                                                sb.insert(iM15945h2, cl9.m4837T(i19, "\n"));
                                                i15 += i19;
                                                arrayList7.add(new e55(h55Var4.f41803b, i19));
                                            }
                                        }
                                    } else {
                                        i2 = size2;
                                        i3 = i16;
                                    }
                                    size2 = i2;
                                    i14 = i3;
                                }
                                h55 h55Var5 = (h55) u91.m22598P0(listM14292d);
                                if (h55Var5 != null) {
                                    Integer num2 = (Integer) map.get(Integer.valueOf(h55Var5.f41802a));
                                    int iIntValue2 = num2 != null ? num2.intValue() : 0;
                                    if (iIntValue2 > 0) {
                                        int i20 = 0;
                                        for (int length = sb.length() - 1; length >= 0 && sb.charAt(length) == '\n'; length--) {
                                            i20++;
                                        }
                                        int i21 = iIntValue2 - i20;
                                        if (i21 < 0) {
                                            i21 = 0;
                                        }
                                        if (i21 > 0) {
                                            sb.append(cl9.m4837T(i21, "\n"));
                                        }
                                    }
                                }
                                if (arrayList7.isEmpty()) {
                                    f55Var = new f55(sb.toString(), arrayList);
                                } else {
                                    List listM22614f1 = u91.m22614f1(arrayList7, new ma3(24));
                                    ArrayList arrayList8 = new ArrayList(v91.m23189q0(arrayList, 10));
                                    Iterator it = arrayList.iterator();
                                    int i22 = 0;
                                    int i23 = 0;
                                    while (it.hasNext()) {
                                        xz7 xz7VarM24797a = (xz7) it.next();
                                        while (i22 < listM22614f1.size() && xz7VarM24797a.f69004a >= ((e55) listM22614f1.get(i22)).f36725a) {
                                            i23 += ((e55) listM22614f1.get(i22)).f36726b;
                                            i22++;
                                        }
                                        if (i23 != 0) {
                                            xz7VarM24797a = xz7.m24797a(xz7VarM24797a, xz7VarM24797a.f69004a + i23, xz7VarM24797a.f69005b + i23, 0, 0, 0, null, null, 262140);
                                        }
                                        arrayList8.add(xz7VarM24797a);
                                    }
                                    f55Var = new f55(sb.toString(), arrayList8);
                                }
                            }
                        }
                        arrayList2 = arrayList4;
                        str = "textSettings";
                        z = true;
                    }
                    str4 = f55Var.f38433a;
                    j55Var.f45084k = str4;
                    arrayList3 = f55Var.f38434b;
                }
                z3 = z3;
                str2 = "layout";
                f = 0.0f;
                arrayList2 = arrayList4;
                str = "textSettings";
                z = true;
                th = null;
                str4 = f55Var.f38433a;
                j55Var.f45084k = str4;
                arrayList3 = f55Var.f38434b;
            } else {
                z3 = z3;
                str2 = "layout";
                f = 0.0f;
                arrayList2 = arrayList4;
                str = "textSettings";
                z = true;
                th = null;
                arrayList3 = arrayList;
            }
            String str8 = str4;
            if (z3) {
                context.getClass();
                ox9 ox9Var7 = j55Var.f45081h;
                if (ox9Var7 == null) {
                    fa4.m11636J(str);
                    throw th;
                }
                int i24 = ox9Var7.f55145b;
                ReaderFont readerFont = ox9Var7.f55144a;
                t45 t45Var2 = j55Var.f45080g;
                if (t45Var2 == null) {
                    fa4.m11636J(str2);
                    throw th;
                }
                float f4 = t45Var2.f61851a - (t45Var2.f61855e * 2);
                float f5 = (float) ox9Var7.f55146c;
                boolean zM15194A = AbstractC3184kh.m15194A(j55Var.f45083j);
                str8.getClass();
                readerFont.getClass();
                float fM14430m = jfa.m14430m(context, i24);
                Typeface typefaceM16862d = mjc.m16862d(readerFont, context);
                TextPaint textPaint3 = new TextPaint();
                textPaint3.setTextSize(fM14430m);
                textPaint3.setAntiAlias(z);
                textPaint3.setTypeface(typefaceM16862d);
                Layout.Alignment alignment2 = Layout.Alignment.ALIGN_NORMAL;
                staticLayoutM12361b = g4d.m12361b(str8, textPaint3, (int) f4, f5, true, zM15194A);
            } else {
                staticLayoutM12361b = j55Var.f45075b;
            }
            int lineCount = staticLayoutM12361b.getLineCount();
            float f6 = AbstractC3184kh.m15229x(j55Var.f45083j) ? staticLayoutM12361b.getPaint().getFontMetrics().descent : f;
            t45 t45Var3 = j55Var.f45080g;
            if (t45Var3 == null) {
                fa4.m11636J(str2);
                throw th;
            }
            float f7 = (t45Var3.f61856f * 2) + f6;
            float f8 = (t45Var3.f61852b - t45Var3.f61853c) - f7;
            float fM14419b = jfa.m14419b(context, 200);
            if (!z3) {
                ArrayList arrayList9 = arrayList3;
                StaticLayout staticLayout = staticLayoutM12361b;
                ArrayList arrayList10 = arrayList2;
                j55Var.m14294b(staticLayout, arrayList10, arrayList9, lineCount, f7, f8, fM14419b);
                return arrayList10;
            }
            List listM14292d2 = m14292d(arrayList3);
            if (listM14292d2.isEmpty()) {
                int lineCount2 = staticLayoutM12361b.getLineCount();
                ArrayList arrayList11 = arrayList3;
                StaticLayout staticLayout2 = staticLayoutM12361b;
                ArrayList arrayList12 = arrayList2;
                j55Var.m14294b(staticLayout2, arrayList12, arrayList11, lineCount2, f7, f8, fM14419b);
                return arrayList12;
            }
            ArrayList arrayList13 = arrayList3;
            StaticLayout staticLayout3 = staticLayoutM12361b;
            float f9 = fM14419b;
            ArrayList arrayList14 = arrayList2;
            ArrayList arrayList15 = new ArrayList();
            int i25 = 0;
            for (Object obj2 : listM14292d2) {
                int i26 = i25 + 1;
                if (i25 < 0) {
                    vz1.m23628e0();
                    throw th;
                }
                h55 h55Var6 = (h55) obj2;
                h55 h55Var7 = (h55) u91.m22592J0(i26, listM14292d2);
                int length2 = h55Var7 != null ? h55Var7.f41803b : j55Var.f45084k.length();
                int i27 = h55Var6.f41803b;
                if (length2 <= i27) {
                    f3 = f9;
                    g55Var = th;
                } else {
                    int length3 = j55Var.f45084k.length() - 1;
                    if (length3 < 0) {
                        length3 = 0;
                    }
                    f3 = f9;
                    int iM15945h3 = l70.m15945h(i27, 0, length3);
                    int i28 = length2 - 1;
                    int length4 = j55Var.f45084k.length() - 1;
                    if (length4 < 0) {
                        length4 = 0;
                    }
                    float lineBottom3 = staticLayout3.getLineBottom(staticLayout3.getLineForOffset(l70.m15945h(i28, iM15945h3, length4))) - staticLayout3.getLineTop(staticLayout3.getLineForOffset(iM15945h3));
                    if (f3 > f) {
                        String str9 = j55Var.f45084k;
                        int length5 = str9.length();
                        if (length2 <= length5) {
                            length5 = length2;
                        }
                        al3 al3Var = new al3(Regex.m15422c(regex, str9.substring(iM15945h3, length5)));
                        lineBottom3 = lineBottom3;
                        while (al3Var.hasNext()) {
                            float f10 = lineBottom3;
                            int lineForOffset = staticLayout3.getLineForOffset(((dr5) al3Var.next()).m10611b().f40379a + iM15945h3);
                            lineBottom3 = (f3 - (staticLayout3.getLineBottom(lineForOffset) - staticLayout3.getLineTop(lineForOffset))) + f10;
                        }
                    }
                    g55Var = new g55(lineBottom3, h55Var6.f41802a, h55Var6.f41803b, length2);
                }
                if (g55Var != null) {
                    arrayList15.add(g55Var);
                }
                f9 = f3;
                i25 = i26;
            }
            if (arrayList15.isEmpty()) {
                return arrayList14;
            }
            t45 t45Var4 = j55Var.f45080g;
            if (t45Var4 == null) {
                fa4.m11636J(str2);
                throw th;
            }
            float f11 = t45Var4.f61852b - f7;
            float f12 = j55Var.f45088o;
            int i29 = 0;
            int i30 = 0;
            while (i30 < arrayList15.size()) {
                float f13 = arrayList14.isEmpty() ? f8 : f11;
                int i31 = i29 - 1;
                float f14 = f;
                while (i30 < arrayList15.size()) {
                    g55 g55Var2 = (g55) arrayList15.get(i30);
                    if (i30 == arrayList15.size() - 1) {
                        t45 t45Var5 = j55Var.f45080g;
                        if (t45Var5 == null) {
                            fa4.m11636J(str2);
                            throw th;
                        }
                        f2 = t45Var5.f61854d;
                    } else {
                        f2 = f;
                    }
                    float f15 = f13 - f2;
                    float f16 = g55Var2.f40232d;
                    float f17 = f14 + f16;
                    boolean z6 = f17 > f15;
                    float f18 = f13;
                    ox9 ox9Var8 = j55Var.f45081h;
                    if (ox9Var8 == null) {
                        fa4.m11636J(str);
                        throw th;
                    }
                    boolean z7 = ox9Var8.f55149f;
                    if (z7 && f12 > f) {
                        f16 -= f12;
                        if (f16 < f) {
                            f16 = f;
                        }
                    }
                    boolean z8 = f14 + f16 <= f15;
                    if (z6 && i30 > i29) {
                        if (!z7 || !z8) {
                            break;
                            break;
                        }
                        i = i30 + 1;
                    } else {
                        i = i30 + 1;
                        if (!z6) {
                            f14 = f17;
                            i31 = i30;
                            i30 = i;
                            f13 = f18;
                        }
                    }
                    i31 = i30;
                    i30 = i;
                    break;
                }
                if (i31 < i29) {
                    i31 = i29;
                    i30 = i29 + 1;
                }
                int iM15945h4 = l70.m15945h(((g55) arrayList15.get(i29)).f40230b, 0, j55Var.f45084k.length());
                int iM15945h5 = l70.m15945h(((g55) arrayList15.get(i31)).f40231c, iM15945h4, j55Var.f45084k.length());
                arrayList14.add(j55Var.m14296e(arrayList14.size(), j55Var.f45084k.substring(iM15945h4, iM15945h5), j55Var.m14295c(iM15945h4, iM15945h5, arrayList14.size(), arrayList13), arrayList14.isEmpty(), i31 == arrayList15.size() + (-1)));
                j55Var = this;
                i29 = i30;
            }
            return arrayList14;
        }
        return EmptyList.f47638a;
    }

    /* JADX INFO: renamed from: b */
    public final void m14294b(StaticLayout staticLayout, ArrayList arrayList, List list, int i, float f, float f2, float f3) throws Throwable {
        Throwable th;
        float f4;
        Object next;
        float f5;
        int i2;
        j55 j55Var = this;
        staticLayout = staticLayout;
        int i3 = i;
        ArrayList arrayList2 = new ArrayList();
        CharSequence text = staticLayout.getText();
        text.getClass();
        al3 al3Var = new al3(Regex.m15422c(j55Var.f45090q, text));
        while (al3Var.hasNext()) {
            dr5 dr5Var = (dr5) al3Var.next();
            arrayList2.add(new i84(staticLayout.getLineForOffset(dr5Var.m10611b().f40379a), staticLayout.getLineForOffset(dr5Var.m10611b().f40380b), 1));
        }
        float f6 = f2;
        int iM14298g = 0;
        int i4 = 0;
        float f7 = 0.0f;
        float f8 = 0.0f;
        while (i4 < i3) {
            Rect rect = new Rect();
            staticLayout.getLineBounds(i4, rect);
            float f9 = f8;
            int i5 = i3 - 1;
            Throwable th2 = null;
            if (i4 == i5) {
                t45 t45Var = j55Var.f45080g;
                if (t45Var == null) {
                    fa4.m11636J("layout");
                    throw null;
                }
                f7 = t45Var.f61854d;
            }
            float f10 = f7;
            Iterator it = arrayList2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    th = th2;
                    f4 = 0.0f;
                    next = th;
                    break;
                }
                next = it.next();
                f4 = 0.0f;
                i84 i84Var = (i84) next;
                th = th2;
                int i6 = i84Var.f40379a;
                if (i4 <= i84Var.f40380b && i6 <= i4) {
                    break;
                } else {
                    th2 = th;
                }
            }
            i84 i84Var2 = (i84) next;
            if (i84Var2 == null || i4 != (i2 = i84Var2.f40379a)) {
                f5 = f9;
            } else {
                float lineBottom = f3 - (staticLayout.getLineBottom(i84Var2.f40380b) - staticLayout.getLineTop(i2));
                if (lineBottom < f4) {
                    lineBottom = f4;
                }
                f5 = lineBottom + f9;
            }
            if (rect.bottom > ((f6 - f) - f10) - f5) {
                iM14298g = j55Var.m14298g(staticLayout, list, i4 - 1, j55Var.f45084k, iM14298g, arrayList, i3);
                float f11 = rect.top;
                t45 t45Var2 = j55Var.f45080g;
                if (t45Var2 == null) {
                    fa4.m11636J("layout");
                    throw th;
                }
                f6 = (((f11 + t45Var2.f61852b) - f) - f4) - f4;
                f7 = f4;
                f8 = f7;
            } else {
                if (f5 <= f4 || i84Var2 == null || i4 != i84Var2.f40379a) {
                    if (i4 == i5) {
                        j55Var.m14298g(staticLayout, list, i5, j55Var.f45084k, iM14298g, arrayList, i);
                    }
                    i4++;
                    j55Var = this;
                } else {
                    i4 = i84Var2.f40380b + 1;
                    if (i4 >= i3) {
                        j55Var.m14298g(staticLayout, list, i5, j55Var.f45084k, iM14298g, arrayList, i3);
                    }
                }
                i3 = i;
                f8 = f5;
                f7 = f10;
            }
        }
        if (arrayList.size() <= 1 || !vk9.m23391n0(((ox7) u91.m22597O0(arrayList)).f55131d)) {
            return;
        }
        arrayList.remove(arrayList.size() - 1);
        ox7 ox7Var = (ox7) u91.m22597O0(arrayList);
        int size = arrayList.size() - 1;
        int i7 = ox7Var.f55128a;
        boolean z = ox7Var.f55129b;
        String str = ox7Var.f55131d;
        List list2 = ox7Var.f55132e;
        ReaderFont readerFont = ox7Var.f55133f;
        double d = ox7Var.f55134g;
        int i8 = ox7Var.f55135h;
        int i9 = ox7Var.f55136i;
        boolean z2 = ox7Var.f55137j;
        String str2 = ox7Var.f55138k;
        boolean z3 = ox7Var.f55139l;
        Map map = ox7Var.f55140m;
        readerFont.getClass();
        str2.getClass();
        arrayList.set(size, new ox7(i7, z, true, str, list2, readerFont, d, i8, i9, z2, str2, z3, map));
    }

    /* JADX INFO: renamed from: c */
    public final ArrayList m14295c(int i, int i2, int i3, List list) {
        int i4;
        ArrayList arrayList = new ArrayList();
        while (this.f45079f < list.size()) {
            xz7 xz7Var = (xz7) list.get(this.f45079f);
            int i5 = xz7Var.f69004a;
            LinkedHashMap linkedHashMap = this.f45077d;
            if (i5 >= i && (i4 = xz7Var.f69005b) <= i2) {
                xz7 xz7VarM24797a = xz7.m24797a(xz7Var, i5 - i, i4 - i, 0, 0, i3, null, null, 258044);
                arrayList.add(xz7VarM24797a);
                linkedHashMap.put(Integer.valueOf(this.f45079f), xz7VarM24797a);
                this.f45079f++;
            } else {
                if (i <= i5 && i5 < i2 && xz7Var.f69005b > i2) {
                    xz7 xz7VarM24797a2 = xz7.m24797a(xz7Var, i5 - i, i2 - i, 0, 0, i3, null, null, 258044);
                    arrayList.add(xz7VarM24797a2);
                    linkedHashMap.put(Integer.valueOf(this.f45079f), xz7VarM24797a2);
                    return arrayList;
                }
                if (i5 >= i) {
                    break;
                }
                xz7 xz7VarM24797a3 = xz7.m24797a(xz7Var, 0, xz7Var.f69008e.length() - (i - xz7Var.f69004a), 0, 0, i3, null, null, 258044);
                arrayList.add(xz7VarM24797a3);
                linkedHashMap.put(Integer.valueOf(this.f45079f), xz7VarM24797a3);
                this.f45079f++;
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: e */
    public final ox7 m14296e(int i, String str, ArrayList arrayList, boolean z, boolean z2) {
        String str2;
        MapBuilder mapBuilder = new MapBuilder();
        al3 al3Var = new al3(Regex.m15422c(this.f45090q, str));
        while (al3Var.hasNext()) {
            dr5 dr5Var = (dr5) al3Var.next();
            String strM10612c = dr5Var.m10612c();
            Integer numM4844a0 = cl9.m4844a0(vk9.m23371G0(vk9.m23368D0(strM10612c, "IMG_", strM10612c), "_READ"));
            if (numM4844a0 != null && (str2 = (String) this.f45089p.get(numM4844a0)) != null) {
                mapBuilder.put(dr5Var.m10612c(), str2);
            }
        }
        MapBuilder mapBuilderM15392b = mapBuilder.m15392b();
        ox9 ox9Var = this.f45081h;
        if (ox9Var == null) {
            fa4.m11636J("textSettings");
            throw null;
        }
        ReaderFont readerFont = ox9Var.f55144a;
        int i2 = ox9Var.f55145b;
        double d = ox9Var.f55146c;
        int i3 = this.f45086m;
        boolean z3 = ox9Var.f55147d;
        String str3 = this.f45085l;
        jn8 jn8Var = this.f45082i;
        if (jn8Var != null) {
            return new ox7(i, z, z2, str, arrayList, readerFont, d, i2, i3, z3, str3, jn8Var.f45877f, mapBuilderM15392b);
        }
        fa4.m11636J("scriptPreferences");
        throw null;
    }

    /* JADX INFO: renamed from: f */
    public final int m14297f(String str, float f, float f2, TextPaint textPaint) {
        Integer num;
        int lineCount;
        if (vk9.m23391n0(str)) {
            return 0;
        }
        int i = this.f45086m;
        if (i < 1) {
            i = 1;
        }
        ox9 ox9Var = this.f45081h;
        if (ox9Var == null) {
            fa4.m11636J("textSettings");
            throw null;
        }
        i55 i55Var = new i55(str, i, ox9Var.f55144a, ox9Var.f55145b);
        LessonPagesBuilder$Companion$translationHeightCache$1 lessonPagesBuilder$Companion$translationHeightCache$1 = f45073r;
        synchronized (lessonPagesBuilder$Companion$translationHeightCache$1) {
            num = (Integer) lessonPagesBuilder$Companion$translationHeightCache$1.get(i55Var);
        }
        if (num != null) {
            lineCount = num.intValue();
        } else {
            int i2 = this.f45086m;
            int i3 = i2 < 1 ? 1 : i2;
            Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
            lineCount = g4d.m12361b(str, textPaint, i3, 1.0f, false, false).getLineCount();
            synchronized (lessonPagesBuilder$Companion$translationHeightCache$1) {
                lessonPagesBuilder$Companion$translationHeightCache$1.put(i55Var, Integer.valueOf(lineCount));
            }
        }
        Context context = this.f45074a;
        ox9 ox9Var2 = this.f45081h;
        if (ox9Var2 == null) {
            fa4.m11636J("textSettings");
            throw null;
        }
        int iCeil = (int) Math.ceil(((0.5f * f) + ((jfa.m14430m(context, ox9Var2.f55145b) * 1.3f) + (lineCount * f2))) / f);
        if (iCeil < 1) {
            return 1;
        }
        return iCeil;
    }

    /* JADX INFO: renamed from: g */
    public final int m14298g(StaticLayout staticLayout, List list, int i, String str, int i2, ArrayList arrayList, int i3) {
        int length;
        try {
            length = staticLayout.getLineVisibleEnd(i);
        } catch (ArrayIndexOutOfBoundsException e) {
            r43.m20289a().m20290b(e);
            length = str.length();
        }
        if (length > str.length()) {
            length = str.length();
        }
        int iM15945h = l70.m15945h(i2, 0, str.length());
        String strSubstring = str.substring(iM15945h, l70.m15945h(length, iM15945h, str.length()));
        if (cl9.m4842Y(strSubstring, "\n\n", false)) {
            this.f45078e += 2;
            strSubstring = strSubstring.substring(2);
        } else if (cl9.m4842Y(strSubstring, "\n", false) || cl9.m4842Y(strSubstring, " ", false)) {
            this.f45078e++;
            strSubstring = strSubstring.substring(1);
        }
        String str2 = strSubstring;
        arrayList.add(m14296e(arrayList.size(), str2, m14295c(this.f45078e, str2.length() + this.f45078e, arrayList.size(), list), arrayList.isEmpty(), i == i3 - 1));
        int length2 = str2.length() + this.f45078e;
        this.f45078e = length2;
        return length2;
    }

    /* JADX INFO: renamed from: h */
    public final void m14299h(String str) {
        String str2;
        t45 t45Var = this.f45080g;
        if (t45Var == null) {
            fa4.m11636J("layout");
            throw null;
        }
        if (t45Var.f61851a <= 0.0f) {
            return;
        }
        String str3 = this.f45083j;
        if (fa4.m11650l(str3, LanguageLearn.Japanese.getCode())) {
            jn8 jn8Var = this.f45082i;
            if (jn8Var == null) {
                fa4.m11636J("scriptPreferences");
                throw null;
            }
            str2 = jn8Var.f45874c;
        } else if (fa4.m11650l(str3, LanguageLearn.Mandarin.getCode())) {
            jn8 jn8Var2 = this.f45082i;
            if (jn8Var2 == null) {
                fa4.m11636J("scriptPreferences");
                throw null;
            }
            str2 = jn8Var2.f45872a;
        } else if (fa4.m11650l(str3, LanguageLearn.ChineseTraditional.getCode())) {
            jn8 jn8Var3 = this.f45082i;
            if (jn8Var3 == null) {
                fa4.m11636J("scriptPreferences");
                throw null;
            }
            str2 = jn8Var3.f45873b;
        } else if (fa4.m11650l(str3, LanguageLearn.Cantonese.getCode())) {
            jn8 jn8Var4 = this.f45082i;
            if (jn8Var4 == null) {
                fa4.m11636J("scriptPreferences");
                throw null;
            }
            str2 = jn8Var4.f45875d;
        } else if (AbstractC3184kh.m15230y(this.f45083j)) {
            jn8 jn8Var5 = this.f45082i;
            if (jn8Var5 == null) {
                fa4.m11636J("scriptPreferences");
                throw null;
            }
            str2 = jn8Var5.f45876e;
        } else {
            str2 = "Off";
        }
        this.f45085l = str2;
        ox9 ox9Var = this.f45081h;
        if (ox9Var == null) {
            fa4.m11636J("textSettings");
            throw null;
        }
        if (ox9Var.f55148e) {
            this.f45076c.addAll(vk9.m23365A0(str, new String[]{"***--ENDOFSENTENCE--***"}, 0, 6));
        } else {
            this.f45084k = str;
        }
        t45 t45Var2 = this.f45080g;
        if (t45Var2 == null) {
            fa4.m11636J("layout");
            throw null;
        }
        int i = (int) (t45Var2.f61851a - (t45Var2.f61855e * 2));
        this.f45086m = i;
        Context context = this.f45074a;
        context.getClass();
        String str4 = this.f45084k;
        ox9 ox9Var2 = this.f45081h;
        if (ox9Var2 == null) {
            fa4.m11636J("textSettings");
            throw null;
        }
        int i2 = ox9Var2.f55145b;
        ReaderFont readerFont = ox9Var2.f55144a;
        float f = (float) ox9Var2.f55146c;
        boolean zM15194A = AbstractC3184kh.m15194A(this.f45083j);
        str4.getClass();
        readerFont.getClass();
        float fM14430m = jfa.m14430m(context, i2);
        Typeface typefaceM16862d = mjc.m16862d(readerFont, context);
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(fM14430m);
        textPaint.setAntiAlias(true);
        textPaint.setTypeface(typefaceM16862d);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        this.f45075b = g4d.m12361b(str4, textPaint, i, f, true, zM15194A);
    }
}
