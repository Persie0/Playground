package p361ra;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import p219ka.C6640a;
import p219ka.InterfaceC6646g;
import p479xa.C10134c0;

/* JADX INFO: renamed from: ra.g */
/* JADX INFO: loaded from: classes.dex */
public final class C8759g implements InterfaceC6646g {

    /* JADX INFO: renamed from: a */
    public final C8756d f46472a;

    /* JADX INFO: renamed from: b */
    public final long[] f46473b;

    /* JADX INFO: renamed from: c */
    public final Map<String, C8758f> f46474c;

    /* JADX INFO: renamed from: d */
    public final Map<String, C8757e> f46475d;

    /* JADX INFO: renamed from: e */
    public final Map<String, String> f46476e;

    public C8759g(C8756d c8756d, HashMap map, HashMap map2, HashMap map3) {
        this.f46472a = c8756d;
        this.f46475d = map2;
        this.f46476e = map3;
        this.f46474c = Collections.unmodifiableMap(map);
        TreeSet<Long> treeSet = new TreeSet<>();
        int i10 = 0;
        c8756d.m17005d(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator<Long> it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i10] = it.next().longValue();
            i10++;
        }
        this.f46473b = jArr;
    }

    @Override // p219ka.InterfaceC6646g
    /* JADX INFO: renamed from: a */
    public final int mo11452a(long j10) {
        long[] jArr = this.f46473b;
        int iM19035b = C10134c0.m19035b(jArr, j10, false);
        if (iM19035b < jArr.length) {
            return iM19035b;
        }
        return -1;
    }

    @Override // p219ka.InterfaceC6646g
    /* JADX INFO: renamed from: f */
    public final long mo11455f(int i10) {
        return this.f46473b[i10];
    }

    @Override // p219ka.InterfaceC6646g
    /* JADX INFO: renamed from: g */
    public final List<C6640a> mo11456g(long j10) {
        Map<String, C8758f> map = this.f46474c;
        Map<String, C8757e> map2 = this.f46475d;
        C8756d c8756d = this.f46472a;
        c8756d.getClass();
        ArrayList<Pair> arrayList = new ArrayList();
        c8756d.m17007g(j10, c8756d.f46437h, arrayList);
        TreeMap treeMap = new TreeMap();
        c8756d.m17009i(j10, false, c8756d.f46437h, treeMap);
        c8756d.m17008h(j10, map, map2, c8756d.f46437h, treeMap);
        ArrayList arrayList2 = new ArrayList();
        for (Pair pair : arrayList) {
            String str = this.f46476e.get(pair.second);
            if (str != null) {
                byte[] bArrDecode = Base64.decode(str, 0);
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                C8757e c8757e = map2.get(pair.first);
                c8757e.getClass();
                C6640a.a aVar = new C6640a.a();
                aVar.f37672b = bitmapDecodeByteArray;
                aVar.f37678h = c8757e.f46444b;
                aVar.f37679i = 0;
                aVar.f37675e = c8757e.f46445c;
                aVar.f37676f = 0;
                aVar.f37677g = c8757e.f46447e;
                aVar.f37682l = c8757e.f46448f;
                aVar.f37683m = c8757e.f46449g;
                aVar.f37686p = c8757e.f46452j;
                arrayList2.add(aVar.m13277a());
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            C8757e c8757e2 = map2.get(entry.getKey());
            c8757e2.getClass();
            C6640a.a aVar2 = (C6640a.a) entry.getValue();
            CharSequence charSequence = aVar2.f37671a;
            charSequence.getClass();
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequence;
            for (C8753a c8753a : (C8753a[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), C8753a.class)) {
                spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(c8753a), spannableStringBuilder.getSpanEnd(c8753a), (CharSequence) "");
            }
            for (int i10 = 0; i10 < spannableStringBuilder.length(); i10++) {
                if (spannableStringBuilder.charAt(i10) == ' ') {
                    int i11 = i10 + 1;
                    int i12 = i11;
                    while (i12 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i12) == ' ') {
                        i12++;
                    }
                    int i13 = i12 - i11;
                    if (i13 > 0) {
                        spannableStringBuilder.delete(i10, i13 + i10);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
                spannableStringBuilder.delete(0, 1);
            }
            for (int i14 = 0; i14 < spannableStringBuilder.length() - 1; i14++) {
                if (spannableStringBuilder.charAt(i14) == '\n') {
                    int i15 = i14 + 1;
                    if (spannableStringBuilder.charAt(i15) == ' ') {
                        spannableStringBuilder.delete(i15, i14 + 2);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            for (int i16 = 0; i16 < spannableStringBuilder.length() - 1; i16++) {
                if (spannableStringBuilder.charAt(i16) == ' ') {
                    int i17 = i16 + 1;
                    if (spannableStringBuilder.charAt(i17) == '\n') {
                        spannableStringBuilder.delete(i16, i17);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == '\n') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            aVar2.f37675e = c8757e2.f46445c;
            aVar2.f37676f = c8757e2.f46446d;
            aVar2.f37677g = c8757e2.f46447e;
            aVar2.f37678h = c8757e2.f46444b;
            aVar2.f37682l = c8757e2.f46448f;
            aVar2.f37681k = c8757e2.f46451i;
            aVar2.f37680j = c8757e2.f46450h;
            aVar2.f37686p = c8757e2.f46452j;
            arrayList2.add(aVar2.m13277a());
        }
        return arrayList2;
    }

    @Override // p219ka.InterfaceC6646g
    /* JADX INFO: renamed from: i */
    public final int mo11457i() {
        return this.f46473b.length;
    }
}
