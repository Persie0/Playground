package p000;

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
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes2.dex */
public final class oca {

    /* JADX INFO: renamed from: a */
    public final String f54179a;

    /* JADX INFO: renamed from: b */
    public final String f54180b;

    /* JADX INFO: renamed from: c */
    public final boolean f54181c;

    /* JADX INFO: renamed from: d */
    public final long f54182d;

    /* JADX INFO: renamed from: e */
    public final long f54183e;

    /* JADX INFO: renamed from: f */
    public final rca f54184f;

    /* JADX INFO: renamed from: g */
    public final String[] f54185g;

    /* JADX INFO: renamed from: h */
    public final String f54186h;

    /* JADX INFO: renamed from: i */
    public final String f54187i;

    /* JADX INFO: renamed from: j */
    public final oca f54188j;

    /* JADX INFO: renamed from: k */
    public final HashMap f54189k;

    /* JADX INFO: renamed from: l */
    public final HashMap f54190l;

    /* JADX INFO: renamed from: m */
    public ArrayList f54191m;

    public oca(String str, String str2, long j, long j2, rca rcaVar, String[] strArr, String str3, String str4, oca ocaVar) {
        this.f54179a = str;
        this.f54180b = str2;
        this.f54187i = str4;
        this.f54184f = rcaVar;
        this.f54185g = strArr;
        this.f54181c = str2 != null;
        this.f54182d = j;
        this.f54183e = j2;
        str3.getClass();
        this.f54186h = str3;
        this.f54188j = ocaVar;
        this.f54189k = new HashMap();
        this.f54190l = new HashMap();
    }

    /* JADX INFO: renamed from: a */
    public static oca m17913a(String str) {
        return new oca(null, str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " "), -9223372036854775807L, -9223372036854775807L, null, null, "", null, null);
    }

    /* JADX INFO: renamed from: e */
    public static SpannableStringBuilder m17914e(String str, TreeMap treeMap) {
        if (!treeMap.containsKey(str)) {
            bs1 bs1Var = new bs1();
            bs1Var.f8913a = new SpannableStringBuilder();
            bs1Var.f8914b = null;
            treeMap.put(str, bs1Var);
        }
        CharSequence charSequence = ((bs1) treeMap.get(str)).f8913a;
        charSequence.getClass();
        return (SpannableStringBuilder) charSequence;
    }

    /* JADX INFO: renamed from: b */
    public final oca m17915b(int i) {
        ArrayList arrayList = this.f54191m;
        if (arrayList != null) {
            return (oca) arrayList.get(i);
        }
        v63.m23128b();
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final int m17916c() {
        ArrayList arrayList = this.f54191m;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    /* JADX INFO: renamed from: d */
    public final void m17917d(TreeSet treeSet, boolean z) {
        String str = this.f54179a;
        boolean zEquals = "p".equals(str);
        boolean zEquals2 = "div".equals(str);
        if (z || zEquals || (zEquals2 && this.f54187i != null)) {
            long j = this.f54182d;
            if (j != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j));
            }
            long j2 = this.f54183e;
            if (j2 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j2));
            }
        }
        if (this.f54191m == null) {
            return;
        }
        for (int i = 0; i < this.f54191m.size(); i++) {
            ((oca) this.f54191m.get(i)).m17917d(treeSet, z || zEquals);
        }
    }

    /* JADX INFO: renamed from: f */
    public final boolean m17918f(long j) {
        long j2 = this.f54182d;
        long j3 = this.f54183e;
        if (j2 == -9223372036854775807L && j3 == -9223372036854775807L) {
            return true;
        }
        if (j2 <= j && j3 == -9223372036854775807L) {
            return true;
        }
        if (j2 != -9223372036854775807L || j >= j3) {
            return j2 <= j && j < j3;
        }
        return true;
    }

    /* JADX INFO: renamed from: g */
    public final void m17919g(long j, String str, ArrayList arrayList) {
        String str2;
        String str3 = this.f54186h;
        if (!"".equals(str3)) {
            str = str3;
        }
        if (m17918f(j) && "div".equals(this.f54179a) && (str2 = this.f54187i) != null) {
            arrayList.add(new Pair(str, str2));
            return;
        }
        for (int i = 0; i < m17916c(); i++) {
            m17915b(i).m17919g(j, str, arrayList);
        }
    }

    /* JADX WARN: Code duplicated, block: B:143:0x020a  */
    /* JADX WARN: Code duplicated, block: B:146:0x0218  */
    /* JADX WARN: Code duplicated, block: B:148:0x021b  */
    /* JADX WARN: Code duplicated, block: B:150:0x021e  */
    /* JADX WARN: Code duplicated, block: B:151:0x0224  */
    /* JADX WARN: Code duplicated, block: B:153:0x0237  */
    /* JADX WARN: Code duplicated, block: B:165:0x0269  */
    /* JADX WARN: Code duplicated, block: B:168:0x0281  */
    /* JADX WARN: Code duplicated, block: B:169:0x0290  */
    /* JADX WARN: Code duplicated, block: B:172:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:174:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:177:0x02be  */
    /* JADX WARN: Code duplicated, block: B:180:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:193:0x02cd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:194:0x02cd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:47:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:48:0x00be  */
    /* JADX INFO: renamed from: h */
    public final void m17920h(long j, Map map, HashMap map2, String str, TreeMap treeMap) {
        Iterator it;
        int i;
        oca ocaVar;
        int i2;
        rca rcaVarM10171b;
        int i3;
        float f;
        float f2;
        float f3;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        RelativeSizeSpan[] relativeSizeSpanArr;
        int length;
        float sizeChange;
        int i4;
        RelativeSizeSpan relativeSizeSpan;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        Map map3 = map;
        if (m17918f(j)) {
            String str2 = this.f54186h;
            String str3 = "".equals(str2) ? str : str2;
            Iterator it2 = this.f54190l.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                String str4 = (String) entry.getKey();
                HashMap map4 = this.f54189k;
                int iIntValue = map4.containsKey(str4) ? ((Integer) map4.get(str4)).intValue() : 0;
                int iIntValue2 = ((Integer) entry.getValue()).intValue();
                if (iIntValue != iIntValue2) {
                    bs1 bs1Var = (bs1) treeMap.get(str4);
                    bs1Var.getClass();
                    qca qcaVar = (qca) map2.get(str3);
                    qcaVar.getClass();
                    int i10 = qcaVar.f57595j;
                    rca rcaVarM10171b2 = d9d.m10171b(this.f54184f, this.f54185g, map3);
                    SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) bs1Var.f8913a;
                    if (spannableStringBuilder == null) {
                        spannableStringBuilder = new SpannableStringBuilder();
                        bs1Var.f8913a = spannableStringBuilder;
                        bs1Var.f8914b = null;
                    }
                    if (rcaVarM10171b2 != null) {
                        int i11 = rcaVarM10171b2.f59082h;
                        int i12 = 1;
                        if (((i11 == -1 && rcaVarM10171b2.f59083i == -1) ? -1 : (i11 == 1 ? (char) 1 : (char) 0) | (rcaVarM10171b2.f59083i == 1 ? (char) 2 : (char) 0)) != -1) {
                            int i13 = rcaVarM10171b2.f59082h;
                            if (i13 != -1) {
                                if (i13 == i12) {
                                    i7 = i12;
                                } else {
                                    i7 = 0;
                                }
                                if (rcaVarM10171b2.f59083i == i12) {
                                    i8 = 2;
                                } else {
                                    i8 = 0;
                                }
                                i9 = i7 | i8;
                            } else if (rcaVarM10171b2.f59083i == -1) {
                                i9 = -1;
                                i12 = 1;
                            } else {
                                i12 = 1;
                                if (i13 == i12) {
                                    i7 = i12;
                                } else {
                                    i7 = 0;
                                }
                                if (rcaVarM10171b2.f59083i == i12) {
                                    i8 = 2;
                                } else {
                                    i8 = 0;
                                }
                                i9 = i7 | i8;
                            }
                            StyleSpan styleSpan = new StyleSpan(i9);
                            i = 33;
                            spannableStringBuilder.setSpan(styleSpan, iIntValue, iIntValue2, 33);
                        } else {
                            i = 33;
                        }
                        if (rcaVarM10171b2.f59080f == i12) {
                            spannableStringBuilder.setSpan(new StrikethroughSpan(), iIntValue, iIntValue2, i);
                        }
                        if (rcaVarM10171b2.f59081g == i12) {
                            spannableStringBuilder.setSpan(new UnderlineSpan(), iIntValue, iIntValue2, i);
                        }
                        if (rcaVarM10171b2.f59077c) {
                            if (!rcaVarM10171b2.f59077c) {
                                C3386nv.m17633t("Font color has not been defined.");
                                return;
                            }
                            a4d.m121a(spannableStringBuilder, new ForegroundColorSpan(rcaVarM10171b2.f59076b), iIntValue, iIntValue2);
                        }
                        if (rcaVarM10171b2.f59079e) {
                            if (!rcaVarM10171b2.f59079e) {
                                C3386nv.m17633t("Background color has not been defined.");
                                return;
                            }
                            a4d.m121a(spannableStringBuilder, new BackgroundColorSpan(rcaVarM10171b2.f59078d), iIntValue, iIntValue2);
                        }
                        if (rcaVarM10171b2.f59075a != null) {
                            a4d.m121a(spannableStringBuilder, new TypefaceSpan(rcaVarM10171b2.f59075a), iIntValue, iIntValue2);
                        }
                        bu9 bu9Var = rcaVarM10171b2.f59092r;
                        if (bu9Var != null) {
                            int i14 = bu9Var.f9032a;
                            if (i14 == -1) {
                                i14 = (i10 == 2 || i10 == 1) ? 3 : 1;
                                i6 = 1;
                            } else {
                                i6 = bu9Var.f9033b;
                            }
                            int i15 = bu9Var.f9034c;
                            if (i15 == -2) {
                                i15 = 1;
                            }
                            a4d.m121a(spannableStringBuilder, new cu9(i14, i6, i15), iIntValue, iIntValue2);
                        }
                        int i16 = rcaVarM10171b2.f59087m;
                        if (i16 == 2) {
                            oca ocaVar2 = this.f54188j;
                            while (true) {
                                if (ocaVar2 == null) {
                                    ocaVar2 = null;
                                    break;
                                }
                                rca rcaVarM10171b3 = d9d.m10171b(ocaVar2.f54184f, ocaVar2.f54185g, map3);
                                if (rcaVarM10171b3 != null && rcaVarM10171b3.f59087m == 1) {
                                    break;
                                } else {
                                    ocaVar2 = ocaVar2.f54188j;
                                }
                            }
                            if (ocaVar2 != null) {
                                ArrayDeque arrayDeque = new ArrayDeque();
                                arrayDeque.push(ocaVar2);
                                while (true) {
                                    if (arrayDeque.isEmpty()) {
                                        ocaVar = null;
                                        break;
                                    }
                                    oca ocaVar3 = (oca) arrayDeque.pop();
                                    rca rcaVarM10171b4 = d9d.m10171b(ocaVar3.f54184f, ocaVar3.f54185g, map3);
                                    if (rcaVarM10171b4 != null && rcaVarM10171b4.f59087m == 3) {
                                        ocaVar = ocaVar3;
                                        break;
                                    }
                                    for (int iM17916c = ocaVar3.m17916c() - 1; iM17916c >= 0; iM17916c--) {
                                        arrayDeque.push(ocaVar3.m17915b(iM17916c));
                                    }
                                }
                                if (ocaVar != null) {
                                    if (ocaVar.m17916c() == 1) {
                                        i2 = 0;
                                        if (ocaVar.m17915b(0).f54180b != null) {
                                            String str5 = ocaVar.m17915b(0).f54180b;
                                            String str6 = uma.f64080a;
                                            rca rcaVarM10171b5 = d9d.m10171b(ocaVar.f54184f, ocaVar.f54185g, map3);
                                            int i17 = rcaVarM10171b5 != null ? rcaVarM10171b5.f59088n : -1;
                                            if (i17 == -1 && (rcaVarM10171b = d9d.m10171b(ocaVar2.f54184f, ocaVar2.f54185g, map3)) != null) {
                                                i17 = rcaVarM10171b.f59088n;
                                            }
                                            spannableStringBuilder.setSpan(new yj8(str5, i17), iIntValue, iIntValue2, 33);
                                        }
                                    } else {
                                        i2 = 0;
                                    }
                                    ss5.m21686M("TtmlRenderUtil", "Skipping rubyText node without exactly one text child.");
                                }
                            }
                            if (rcaVarM10171b2.f59091q == 1) {
                                a4d.m121a(spannableStringBuilder, new ov3(), iIntValue, iIntValue2);
                            }
                            i3 = rcaVarM10171b2.f59084j;
                            f = 100.0f;
                            if (i3 != 1) {
                                it = it2;
                                f2 = 100.0f;
                                a4d.m121a(spannableStringBuilder, new AbsoluteSizeSpan((int) rcaVarM10171b2.f59085k, true), iIntValue, iIntValue2);
                            } else if (i3 != 2) {
                                it = it2;
                                f2 = 100.0f;
                                a4d.m121a(spannableStringBuilder, new RelativeSizeSpan(rcaVarM10171b2.f59085k), iIntValue, iIntValue2);
                            } else if (i3 != 3) {
                                it = it2;
                                f2 = 100.0f;
                            } else {
                                float f4 = rcaVarM10171b2.f59085k / 100.0f;
                                relativeSizeSpanArr = (RelativeSizeSpan[]) spannableStringBuilder.getSpans(iIntValue, iIntValue2, RelativeSizeSpan.class);
                                length = relativeSizeSpanArr.length;
                                int i18 = i2;
                                sizeChange = f4;
                                i4 = i18;
                                while (i4 < length) {
                                    float f5 = f;
                                    relativeSizeSpan = relativeSizeSpanArr[i4];
                                    Iterator it3 = it2;
                                    if (spannableStringBuilder.getSpanStart(relativeSizeSpan) <= iIntValue && spannableStringBuilder.getSpanEnd(relativeSizeSpan) >= iIntValue2) {
                                        sizeChange = relativeSizeSpan.getSizeChange() * sizeChange;
                                    }
                                    if (spannableStringBuilder.getSpanStart(relativeSizeSpan) == iIntValue || spannableStringBuilder.getSpanEnd(relativeSizeSpan) != iIntValue2) {
                                        i5 = i4;
                                    } else {
                                        i5 = i4;
                                        if (spannableStringBuilder.getSpanFlags(relativeSizeSpan) == 33) {
                                            spannableStringBuilder.removeSpan(relativeSizeSpan);
                                        }
                                    }
                                    i4 = i5 + 1;
                                    f = f5;
                                    it2 = it3;
                                }
                                it = it2;
                                f2 = f;
                                spannableStringBuilder.setSpan(new RelativeSizeSpan(sizeChange), iIntValue, iIntValue2, 33);
                            }
                            if ("p".equals(this.f54179a)) {
                                f3 = rcaVarM10171b2.f59093s;
                                if (f3 != Float.MAX_VALUE) {
                                    bs1Var.f8929q = (f3 * (-90.0f)) / f2;
                                }
                                alignment = rcaVarM10171b2.f59089o;
                                if (alignment != null) {
                                    bs1Var.f8915c = alignment;
                                }
                                alignment2 = rcaVarM10171b2.f59090p;
                                if (alignment2 != null) {
                                    bs1Var.f8916d = alignment2;
                                }
                            }
                        } else if (i16 == 3 || i16 == 4) {
                            spannableStringBuilder.setSpan(new ab2(), iIntValue, iIntValue2, 33);
                        }
                        i2 = 0;
                        if (rcaVarM10171b2.f59091q == 1) {
                            a4d.m121a(spannableStringBuilder, new ov3(), iIntValue, iIntValue2);
                        }
                        i3 = rcaVarM10171b2.f59084j;
                        f = 100.0f;
                        if (i3 != 1) {
                            it = it2;
                            f2 = 100.0f;
                            a4d.m121a(spannableStringBuilder, new AbsoluteSizeSpan((int) rcaVarM10171b2.f59085k, true), iIntValue, iIntValue2);
                        } else if (i3 != 2) {
                            it = it2;
                            f2 = 100.0f;
                            a4d.m121a(spannableStringBuilder, new RelativeSizeSpan(rcaVarM10171b2.f59085k), iIntValue, iIntValue2);
                        } else if (i3 != 3) {
                            it = it2;
                            f2 = 100.0f;
                        } else {
                            float f6 = rcaVarM10171b2.f59085k / 100.0f;
                            relativeSizeSpanArr = (RelativeSizeSpan[]) spannableStringBuilder.getSpans(iIntValue, iIntValue2, RelativeSizeSpan.class);
                            length = relativeSizeSpanArr.length;
                            int i19 = i2;
                            sizeChange = f6;
                            i4 = i19;
                            while (i4 < length) {
                                float f7 = f;
                                relativeSizeSpan = relativeSizeSpanArr[i4];
                                Iterator it4 = it2;
                                if (spannableStringBuilder.getSpanStart(relativeSizeSpan) <= iIntValue) {
                                    sizeChange = relativeSizeSpan.getSizeChange() * sizeChange;
                                }
                                if (spannableStringBuilder.getSpanStart(relativeSizeSpan) == iIntValue) {
                                    i5 = i4;
                                } else {
                                    i5 = i4;
                                }
                                i4 = i5 + 1;
                                f = f7;
                                it2 = it4;
                            }
                            it = it2;
                            f2 = f;
                            spannableStringBuilder.setSpan(new RelativeSizeSpan(sizeChange), iIntValue, iIntValue2, 33);
                        }
                        if ("p".equals(this.f54179a)) {
                            f3 = rcaVarM10171b2.f59093s;
                            if (f3 != Float.MAX_VALUE) {
                                bs1Var.f8929q = (f3 * (-90.0f)) / f2;
                            }
                            alignment = rcaVarM10171b2.f59089o;
                            if (alignment != null) {
                                bs1Var.f8915c = alignment;
                            }
                            alignment2 = rcaVarM10171b2.f59090p;
                            if (alignment2 != null) {
                                bs1Var.f8916d = alignment2;
                            }
                        }
                    }
                    it2 = it;
                }
                it = it2;
                it2 = it;
            }
            int i20 = 0;
            while (i20 < m17916c()) {
                m17915b(i20).m17920h(j, map3, map2, str3, treeMap);
                i20++;
                map3 = map;
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m17921i(long j, boolean z, String str, TreeMap treeMap) {
        HashMap map = this.f54189k;
        map.clear();
        HashMap map2 = this.f54190l;
        map2.clear();
        String str2 = this.f54179a;
        if ("metadata".equals(str2)) {
            return;
        }
        String str3 = this.f54186h;
        String str4 = "".equals(str3) ? str : str3;
        if (this.f54181c && z) {
            SpannableStringBuilder spannableStringBuilderM17914e = m17914e(str4, treeMap);
            String str5 = this.f54180b;
            str5.getClass();
            spannableStringBuilderM17914e.append((CharSequence) str5);
            return;
        }
        if ("br".equals(str2) && z) {
            m17914e(str4, treeMap).append('\n');
            return;
        }
        if (m17918f(j)) {
            for (Map.Entry entry : treeMap.entrySet()) {
                String str6 = (String) entry.getKey();
                CharSequence charSequence = ((bs1) entry.getValue()).f8913a;
                charSequence.getClass();
                map.put(str6, Integer.valueOf(charSequence.length()));
            }
            boolean zEquals = "p".equals(str2);
            for (int i = 0; i < m17916c(); i++) {
                m17915b(i).m17921i(j, z || zEquals, str4, treeMap);
            }
            if (zEquals) {
                SpannableStringBuilder spannableStringBuilderM17914e2 = m17914e(str4, treeMap);
                int length = spannableStringBuilderM17914e2.length() - 1;
                while (length >= 0 && spannableStringBuilderM17914e2.charAt(length) == ' ') {
                    length--;
                }
                if (length >= 0 && spannableStringBuilderM17914e2.charAt(length) != '\n') {
                    spannableStringBuilderM17914e2.append('\n');
                }
            }
            for (Map.Entry entry2 : treeMap.entrySet()) {
                String str7 = (String) entry2.getKey();
                CharSequence charSequence2 = ((bs1) entry2.getValue()).f8913a;
                charSequence2.getClass();
                map2.put(str7, Integer.valueOf(charSequence2.length()));
            }
        }
    }
}
