package p361ra;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.util.Pair;
import androidx.fragment.app.C0987y;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import p219ka.C6640a;
import p260m8.C7499b;
import p294oa.C8027a;
import p294oa.C8029c;
import p294oa.C8030d;
import p479xa.C10134c0;
import p479xa.C10145n;

/* JADX INFO: renamed from: ra.d */
/* JADX INFO: loaded from: classes.dex */
public final class C8756d {

    /* JADX INFO: renamed from: a */
    public final String f46430a;

    /* JADX INFO: renamed from: b */
    public final String f46431b;

    /* JADX INFO: renamed from: c */
    public final boolean f46432c;

    /* JADX INFO: renamed from: d */
    public final long f46433d;

    /* JADX INFO: renamed from: e */
    public final long f46434e;

    /* JADX INFO: renamed from: f */
    public final C8758f f46435f;

    /* JADX INFO: renamed from: g */
    public final String[] f46436g;

    /* JADX INFO: renamed from: h */
    public final String f46437h;

    /* JADX INFO: renamed from: i */
    public final String f46438i;

    /* JADX INFO: renamed from: j */
    public final C8756d f46439j;

    /* JADX INFO: renamed from: k */
    public final HashMap<String, Integer> f46440k;

    /* JADX INFO: renamed from: l */
    public final HashMap<String, Integer> f46441l;

    /* JADX INFO: renamed from: m */
    public ArrayList f46442m;

    public C8756d(String str, String str2, long j10, long j11, C8758f c8758f, String[] strArr, String str3, String str4, C8756d c8756d) {
        this.f46430a = str;
        this.f46431b = str2;
        this.f46438i = str4;
        this.f46435f = c8758f;
        this.f46436g = strArr;
        this.f46432c = str2 != null;
        this.f46433d = j10;
        this.f46434e = j11;
        str3.getClass();
        this.f46437h = str3;
        this.f46439j = c8756d;
        this.f46440k = new HashMap<>();
        this.f46441l = new HashMap<>();
    }

    /* JADX INFO: renamed from: a */
    public static C8756d m17001a(String str) {
        return new C8756d(null, str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " "), -9223372036854775807L, -9223372036854775807L, null, null, "", null, null);
    }

    /* JADX INFO: renamed from: e */
    public static SpannableStringBuilder m17002e(String str, TreeMap treeMap) {
        if (!treeMap.containsKey(str)) {
            C6640a.a aVar = new C6640a.a();
            aVar.f37671a = new SpannableStringBuilder();
            treeMap.put(str, aVar);
        }
        CharSequence charSequence = ((C6640a.a) treeMap.get(str)).f37671a;
        charSequence.getClass();
        return (SpannableStringBuilder) charSequence;
    }

    /* JADX INFO: renamed from: b */
    public final C8756d m17003b(int i10) {
        ArrayList arrayList = this.f46442m;
        if (arrayList != null) {
            return (C8756d) arrayList.get(i10);
        }
        throw new IndexOutOfBoundsException();
    }

    /* JADX INFO: renamed from: c */
    public final int m17004c() {
        ArrayList arrayList = this.f46442m;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    /* JADX INFO: renamed from: d */
    public final void m17005d(TreeSet<Long> treeSet, boolean z10) {
        String str = this.f46430a;
        boolean zEquals = "p".equals(str);
        boolean zEquals2 = "div".equals(str);
        if (z10 || zEquals || (zEquals2 && this.f46438i != null)) {
            long j10 = this.f46433d;
            if (j10 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j10));
            }
            long j11 = this.f46434e;
            if (j11 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j11));
            }
        }
        if (this.f46442m == null) {
            return;
        }
        for (int i10 = 0; i10 < this.f46442m.size(); i10++) {
            ((C8756d) this.f46442m.get(i10)).m17005d(treeSet, z10 || zEquals);
        }
    }

    /* JADX INFO: renamed from: f */
    public final boolean m17006f(long j10) {
        long j11 = this.f46433d;
        long j12 = this.f46434e;
        if (j11 != -9223372036854775807L || j12 != -9223372036854775807L) {
            if (j11 > j10 || j12 != -9223372036854775807L) {
                if (j11 != -9223372036854775807L || j10 >= j12) {
                    if (j11 > j10 || j10 >= j12) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: g */
    public final void m17007g(long j10, String str, ArrayList arrayList) {
        String str2;
        String str3 = this.f46437h;
        if (!"".equals(str3)) {
            str = str3;
        }
        if (m17006f(j10) && "div".equals(this.f46430a) && (str2 = this.f46438i) != null) {
            arrayList.add(new Pair(str, str2));
            return;
        }
        for (int i10 = 0; i10 < m17004c(); i10++) {
            m17003b(i10).m17007g(j10, str, arrayList);
        }
    }

    /* JADX WARN: Code duplicated, block: B:148:0x022b  */
    /* JADX WARN: Code duplicated, block: B:149:0x022d  */
    /* JADX WARN: Code duplicated, block: B:151:0x0230  */
    /* JADX WARN: Code duplicated, block: B:154:0x023e  */
    /* JADX WARN: Code duplicated, block: B:156:0x0242  */
    /* JADX WARN: Code duplicated, block: B:159:0x0247  */
    /* JADX WARN: Code duplicated, block: B:160:0x0253  */
    /* JADX WARN: Code duplicated, block: B:161:0x025e  */
    /* JADX WARN: Code duplicated, block: B:166:0x027d  */
    /* JADX WARN: Code duplicated, block: B:169:0x0287  */
    /* JADX WARN: Code duplicated, block: B:184:0x0274 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:185:0x028d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:190:0x0023 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:191:0x0023 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:47:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:48:0x00b8  */
    /* JADX INFO: renamed from: h */
    public final void m17008h(long j10, Map map, Map map2, String str, TreeMap treeMap) {
        int i10;
        C8756d c8756d;
        boolean z10;
        int i11;
        int i12;
        C8758f c8758fM14970v0;
        boolean z11;
        int i13;
        float f3;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        int i14;
        int i15;
        int i16;
        if (m17006f(j10)) {
            String str2 = this.f46437h;
            String str3 = "".equals(str2) ? str : str2;
            for (Map.Entry<String, Integer> entry : this.f46441l.entrySet()) {
                String key = entry.getKey();
                HashMap<String, Integer> map3 = this.f46440k;
                int iIntValue = map3.containsKey(key) ? map3.get(key).intValue() : 0;
                int iIntValue2 = entry.getValue().intValue();
                if (iIntValue != iIntValue2) {
                    C6640a.a aVar = (C6640a.a) treeMap.get(key);
                    aVar.getClass();
                    C8757e c8757e = (C8757e) map2.get(str3);
                    c8757e.getClass();
                    C8758f c8758fM14970v1 = C7499b.m14970v0(this.f46435f, this.f46436g, map);
                    SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) aVar.f37671a;
                    if (spannableStringBuilder == null) {
                        spannableStringBuilder = new SpannableStringBuilder();
                        aVar.f37671a = spannableStringBuilder;
                    }
                    if (c8758fM14970v1 != null) {
                        int i17 = c8758fM14970v1.f46460h;
                        int i18 = -1;
                        int i19 = 1;
                        if (((i17 == -1 && c8758fM14970v1.f46461i == -1) ? -1 : (i17 == 1 ? (char) 1 : (char) 0) | (c8758fM14970v1.f46461i == 1 ? (char) 2 : (char) 0)) != -1) {
                            int i20 = c8758fM14970v1.f46460h;
                            if (i20 != -1) {
                                if (i20 == i19) {
                                    i15 = i19;
                                } else {
                                    i15 = 0;
                                }
                                if (c8758fM14970v1.f46461i == i19) {
                                    i16 = 2;
                                } else {
                                    i16 = 0;
                                }
                                i18 = i16 | i15;
                            } else if (c8758fM14970v1.f46461i != -1) {
                                i19 = 1;
                                if (i20 == i19) {
                                    i15 = i19;
                                } else {
                                    i15 = 0;
                                }
                                if (c8758fM14970v1.f46461i == i19) {
                                    i16 = 2;
                                } else {
                                    i16 = 0;
                                }
                                i18 = i16 | i15;
                            }
                            i10 = 33;
                            spannableStringBuilder.setSpan(new StyleSpan(i18), iIntValue, iIntValue2, 33);
                        } else {
                            i10 = 33;
                        }
                        if (c8758fM14970v1.f46458f == 1) {
                            spannableStringBuilder.setSpan(new StrikethroughSpan(), iIntValue, iIntValue2, i10);
                        }
                        if (c8758fM14970v1.f46459g == 1) {
                            spannableStringBuilder.setSpan(new UnderlineSpan(), iIntValue, iIntValue2, i10);
                        }
                        if (c8758fM14970v1.f46455c) {
                            if (!c8758fM14970v1.f46455c) {
                                throw new IllegalStateException("Font color has not been defined.");
                            }
                            C0987y.m3819a(spannableStringBuilder, new ForegroundColorSpan(c8758fM14970v1.f46454b), iIntValue, iIntValue2);
                        }
                        if (c8758fM14970v1.f46457e) {
                            if (!c8758fM14970v1.f46457e) {
                                throw new IllegalStateException("Background color has not been defined.");
                            }
                            C0987y.m3819a(spannableStringBuilder, new BackgroundColorSpan(c8758fM14970v1.f46456d), iIntValue, iIntValue2);
                        }
                        if (c8758fM14970v1.f46453a != null) {
                            C0987y.m3819a(spannableStringBuilder, new TypefaceSpan(c8758fM14970v1.f46453a), iIntValue, iIntValue2);
                        }
                        C8754b c8754b = c8758fM14970v1.f46470r;
                        if (c8754b != null) {
                            int i21 = c8754b.f46411a;
                            if (i21 == -1) {
                                int i22 = c8757e.f46452j;
                                i21 = (i22 == 2 || i22 == 1) ? 3 : 1;
                                i14 = 1;
                            } else {
                                i14 = c8754b.f46412b;
                            }
                            int i23 = c8754b.f46413c;
                            if (i23 == -2) {
                                i23 = 1;
                            }
                            C0987y.m3819a(spannableStringBuilder, new C8030d(i21, i14, i23), iIntValue, iIntValue2);
                        }
                        int i24 = c8758fM14970v1.f46465m;
                        if (i24 == 2) {
                            C8756d c8756d2 = this.f46439j;
                            while (true) {
                                if (c8756d2 == null) {
                                    c8756d2 = null;
                                    break;
                                }
                                C8758f c8758fM14970v2 = C7499b.m14970v0(c8756d2.f46435f, c8756d2.f46436g, map);
                                if (c8758fM14970v2 != null && c8758fM14970v2.f46465m == 1) {
                                    break;
                                } else {
                                    c8756d2 = c8756d2.f46439j;
                                }
                            }
                            if (c8756d2 != null) {
                                ArrayDeque arrayDeque = new ArrayDeque();
                                arrayDeque.push(c8756d2);
                                while (true) {
                                    if (arrayDeque.isEmpty()) {
                                        c8756d = null;
                                        break;
                                    }
                                    C8756d c8756d3 = (C8756d) arrayDeque.pop();
                                    C8758f c8758fM14970v3 = C7499b.m14970v0(c8756d3.f46435f, c8756d3.f46436g, map);
                                    if (c8758fM14970v3 != null && c8758fM14970v3.f46465m == 3) {
                                        c8756d = c8756d3;
                                        break;
                                    }
                                    for (int iM17004c = c8756d3.m17004c() - 1; iM17004c >= 0; iM17004c--) {
                                        arrayDeque.push(c8756d3.m17003b(iM17004c));
                                    }
                                }
                                if (c8756d != null) {
                                    if (c8756d.m17004c() == 1) {
                                        z10 = false;
                                        if (c8756d.m17003b(0).f46431b != null) {
                                            String str4 = c8756d.m17003b(0).f46431b;
                                            int i25 = C10134c0.f51354a;
                                            C8758f c8758fM14970v4 = C7499b.m14970v0(c8756d.f46435f, c8756d.f46436g, map);
                                            if (c8758fM14970v4 != null) {
                                                i12 = c8758fM14970v4.f46466n;
                                                i11 = -1;
                                            } else {
                                                i11 = -1;
                                                i12 = -1;
                                            }
                                            if (i12 == i11 && (c8758fM14970v0 = C7499b.m14970v0(c8756d2.f46435f, c8756d2.f46436g, map)) != null) {
                                                i12 = c8758fM14970v0.f46466n;
                                            }
                                            spannableStringBuilder.setSpan(new C8029c(str4, i12), iIntValue, iIntValue2, 33);
                                        }
                                    } else {
                                        z10 = false;
                                    }
                                    C10145n.m19098f("TtmlRenderUtil", "Skipping rubyText node without exactly one text child.");
                                }
                            }
                            if (c8758fM14970v1.f46469q == 1) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if (z11) {
                                C0987y.m3819a(spannableStringBuilder, new C8027a(), iIntValue, iIntValue2);
                            }
                            i13 = c8758fM14970v1.f46462j;
                            if (i13 != 1) {
                                C0987y.m3819a(spannableStringBuilder, new AbsoluteSizeSpan((int) c8758fM14970v1.f46463k, true), iIntValue, iIntValue2);
                            } else if (i13 != 2) {
                                C0987y.m3819a(spannableStringBuilder, new RelativeSizeSpan(c8758fM14970v1.f46463k), iIntValue, iIntValue2);
                            } else if (i13 == 3) {
                                C0987y.m3819a(spannableStringBuilder, new RelativeSizeSpan(c8758fM14970v1.f46463k / 100.0f), iIntValue, iIntValue2);
                            }
                            if ("p".equals(this.f46430a)) {
                                f3 = c8758fM14970v1.f46471s;
                                if (f3 != Float.MAX_VALUE) {
                                    aVar.f37687q = (f3 * (-90.0f)) / 100.0f;
                                }
                                alignment = c8758fM14970v1.f46467o;
                                if (alignment != null) {
                                    aVar.f37673c = alignment;
                                }
                                alignment2 = c8758fM14970v1.f46468p;
                                if (alignment2 != null) {
                                    aVar.f37674d = alignment2;
                                }
                            }
                        } else if (i24 == 3 || i24 == 4) {
                            spannableStringBuilder.setSpan(new C8753a(), iIntValue, iIntValue2, 33);
                        }
                        z10 = false;
                        if (c8758fM14970v1.f46469q == 1) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (z11) {
                            C0987y.m3819a(spannableStringBuilder, new C8027a(), iIntValue, iIntValue2);
                        }
                        i13 = c8758fM14970v1.f46462j;
                        if (i13 != 1) {
                            C0987y.m3819a(spannableStringBuilder, new AbsoluteSizeSpan((int) c8758fM14970v1.f46463k, true), iIntValue, iIntValue2);
                        } else if (i13 != 2) {
                            C0987y.m3819a(spannableStringBuilder, new RelativeSizeSpan(c8758fM14970v1.f46463k), iIntValue, iIntValue2);
                        } else if (i13 == 3) {
                            C0987y.m3819a(spannableStringBuilder, new RelativeSizeSpan(c8758fM14970v1.f46463k / 100.0f), iIntValue, iIntValue2);
                        }
                        if ("p".equals(this.f46430a)) {
                            f3 = c8758fM14970v1.f46471s;
                            if (f3 != Float.MAX_VALUE) {
                                aVar.f37687q = (f3 * (-90.0f)) / 100.0f;
                            }
                            alignment = c8758fM14970v1.f46467o;
                            if (alignment != null) {
                                aVar.f37673c = alignment;
                            }
                            alignment2 = c8758fM14970v1.f46468p;
                            if (alignment2 != null) {
                                aVar.f37674d = alignment2;
                            }
                        }
                    } else {
                        continue;
                    }
                }
            }
            for (int i26 = 0; i26 < m17004c(); i26++) {
                m17003b(i26).m17008h(j10, map, map2, str3, treeMap);
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m17009i(long j10, boolean z10, String str, TreeMap treeMap) {
        HashMap<String, Integer> map = this.f46440k;
        map.clear();
        HashMap<String, Integer> map2 = this.f46441l;
        map2.clear();
        String str2 = this.f46430a;
        if ("metadata".equals(str2)) {
            return;
        }
        String str3 = this.f46437h;
        String str4 = "".equals(str3) ? str : str3;
        if (this.f46432c && z10) {
            SpannableStringBuilder spannableStringBuilderM17002e = m17002e(str4, treeMap);
            String str5 = this.f46431b;
            str5.getClass();
            spannableStringBuilderM17002e.append((CharSequence) str5);
            return;
        }
        if ("br".equals(str2) && z10) {
            m17002e(str4, treeMap).append('\n');
            return;
        }
        if (m17006f(j10)) {
            for (Map.Entry entry : treeMap.entrySet()) {
                String str6 = (String) entry.getKey();
                CharSequence charSequence = ((C6640a.a) entry.getValue()).f37671a;
                charSequence.getClass();
                map.put(str6, Integer.valueOf(charSequence.length()));
            }
            boolean zEquals = "p".equals(str2);
            for (int i10 = 0; i10 < m17004c(); i10++) {
                m17003b(i10).m17009i(j10, z10 || zEquals, str4, treeMap);
            }
            if (zEquals) {
                SpannableStringBuilder spannableStringBuilderM17002e2 = m17002e(str4, treeMap);
                int length = spannableStringBuilderM17002e2.length();
                do {
                    length--;
                    if (length < 0) {
                        break;
                    }
                } while (spannableStringBuilderM17002e2.charAt(length) == ' ');
                if (length >= 0 && spannableStringBuilderM17002e2.charAt(length) != '\n') {
                    spannableStringBuilderM17002e2.append('\n');
                }
            }
            for (Map.Entry entry2 : treeMap.entrySet()) {
                String str7 = (String) entry2.getKey();
                CharSequence charSequence2 = ((C6640a.a) entry2.getValue()).f37671a;
                charSequence2.getClass();
                map2.put(str7, Integer.valueOf(charSequence2.length()));
            }
        }
    }
}
