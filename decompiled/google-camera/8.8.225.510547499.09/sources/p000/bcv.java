package p000;

import androidx.work.OverwritingInputMerger;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bcv {

    /* JADX INFO: renamed from: a */
    public final String f2964a;

    /* JADX INFO: renamed from: b */
    public String f2965b;

    /* JADX INFO: renamed from: c */
    public String f2966c;

    /* JADX INFO: renamed from: d */
    public axt f2967d;

    /* JADX INFO: renamed from: e */
    public axt f2968e;

    /* JADX INFO: renamed from: f */
    public long f2969f;

    /* JADX INFO: renamed from: g */
    public long f2970g;

    /* JADX INFO: renamed from: h */
    public long f2971h;

    /* JADX INFO: renamed from: i */
    public axr f2972i;

    /* JADX INFO: renamed from: j */
    public int f2973j;

    /* JADX INFO: renamed from: k */
    public long f2974k;

    /* JADX INFO: renamed from: l */
    public long f2975l;

    /* JADX INFO: renamed from: m */
    public long f2976m;

    /* JADX INFO: renamed from: n */
    public long f2977n;

    /* JADX INFO: renamed from: o */
    public boolean f2978o;

    /* JADX INFO: renamed from: p */
    public int f2979p;

    /* JADX INFO: renamed from: q */
    public final int f2980q;

    /* JADX INFO: renamed from: r */
    public int f2981r;

    /* JADX INFO: renamed from: s */
    public int f2982s;

    /* JADX INFO: renamed from: t */
    public int f2983t;

    static {
        ayc.m2100b("WorkSpec");
    }

    public bcv(String str, int i, String str2, String str3, axt axtVar, axt axtVar2, long j, long j2, long j3, axr axrVar, int i2, int i3, long j4, long j5, long j6, long j7, boolean z, int i4, int i5, int i6) {
        str.getClass();
        if (i == 0) {
            throw null;
        }
        str2.getClass();
        str3.getClass();
        axtVar.getClass();
        axtVar2.getClass();
        axrVar.getClass();
        if (i3 == 0 || i4 == 0) {
            throw null;
        }
        this.f2964a = str;
        this.f2981r = i;
        this.f2965b = str2;
        this.f2966c = str3;
        this.f2967d = axtVar;
        this.f2968e = axtVar2;
        this.f2969f = j;
        this.f2970g = j2;
        this.f2971h = j3;
        this.f2972i = axrVar;
        this.f2973j = i2;
        this.f2982s = i3;
        this.f2974k = j4;
        this.f2975l = j5;
        this.f2976m = j6;
        this.f2977n = j7;
        this.f2978o = z;
        this.f2983t = i4;
        this.f2979p = i5;
        this.f2980q = i6;
    }

    /* JADX INFO: renamed from: b */
    public static final List m2227b(List list) {
        ArrayList arrayList = new ArrayList(omn.m18678R(list));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            bcu bcuVar = (bcu) it.next();
            axt axtVar = !bcuVar.f2962f.isEmpty() ? (axt) bcuVar.f2962f.get(0) : axt.f2689a;
            UUID uuidFromString = UUID.fromString(bcuVar.f2957a);
            uuidFromString.getClass();
            int i = bcuVar.f2963g;
            HashSet hashSet = new HashSet(bcuVar.f2961e);
            axt axtVar2 = bcuVar.f2958b;
            axtVar.getClass();
            arrayList.add(new ayh(uuidFromString, i, hashSet, axtVar2, axtVar, bcuVar.f2959c, bcuVar.f2960d));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    public final long m2228a() {
        if (m2230d()) {
            return this.f2975l + ook.m18792f(this.f2982s == 2 ? this.f2974k * ((long) this.f2973j) : (long) Math.scalb(this.f2974k, this.f2973j - 1), 18000000L);
        }
        long j = 0;
        if (!m2231e()) {
            long jCurrentTimeMillis = this.f2975l;
            if (jCurrentTimeMillis == 0) {
                jCurrentTimeMillis = System.currentTimeMillis();
            }
            return this.f2969f + jCurrentTimeMillis;
        }
        int i = this.f2979p;
        long j2 = this.f2975l;
        if (i == 0) {
            j2 += this.f2969f;
        }
        long j3 = this.f2971h;
        long j4 = this.f2970g;
        if (j3 != j4) {
            j = i == 0 ? -j3 : 0L;
            j2 += j4;
        } else if (i != 0) {
            j = j4;
        }
        return j + j2;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m2229c() {
        return !ooc.m18737c(axr.f2678a, this.f2972i);
    }

    /* JADX INFO: renamed from: d */
    public final boolean m2230d() {
        return this.f2981r == 1 && this.f2973j > 0;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m2231e() {
        return this.f2970g != 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bcv)) {
            return false;
        }
        bcv bcvVar = (bcv) obj;
        return ooc.m18737c(this.f2964a, bcvVar.f2964a) && this.f2981r == bcvVar.f2981r && ooc.m18737c(this.f2965b, bcvVar.f2965b) && ooc.m18737c(this.f2966c, bcvVar.f2966c) && ooc.m18737c(this.f2967d, bcvVar.f2967d) && ooc.m18737c(this.f2968e, bcvVar.f2968e) && this.f2969f == bcvVar.f2969f && this.f2970g == bcvVar.f2970g && this.f2971h == bcvVar.f2971h && ooc.m18737c(this.f2972i, bcvVar.f2972i) && this.f2973j == bcvVar.f2973j && this.f2982s == bcvVar.f2982s && this.f2974k == bcvVar.f2974k && this.f2975l == bcvVar.f2975l && this.f2976m == bcvVar.f2976m && this.f2977n == bcvVar.f2977n && this.f2978o == bcvVar.f2978o && this.f2983t == bcvVar.f2983t && this.f2979p == bcvVar.f2979p && this.f2980q == bcvVar.f2980q;
    }

    public final int hashCode() {
        int iHashCode = this.f2964a.hashCode() * 31;
        int i = this.f2981r;
        C0158ej.m7380g(i);
        int iHashCode2 = ((((((((iHashCode + i) * 31) + this.f2965b.hashCode()) * 31) + this.f2966c.hashCode()) * 31) + this.f2967d.hashCode()) * 31) + this.f2968e.hashCode();
        int iM2164b = bak.m2164b(this.f2969f);
        int iM2164b2 = bak.m2164b(this.f2970g);
        int iM2164b3 = (((((((((iHashCode2 * 31) + iM2164b) * 31) + iM2164b2) * 31) + bak.m2164b(this.f2971h)) * 31) + this.f2972i.hashCode()) * 31) + this.f2973j;
        int i2 = this.f2982s;
        if (i2 == 0) {
            throw null;
        }
        int iM2164b4 = ((((((((((((iM2164b3 * 31) + i2) * 31) + bak.m2164b(this.f2974k)) * 31) + bak.m2164b(this.f2975l)) * 31) + bak.m2164b(this.f2976m)) * 31) + bak.m2164b(this.f2977n)) * 31) + (this.f2978o ? 1 : 0)) * 31;
        int i3 = this.f2983t;
        if (i3 != 0) {
            return ((((iM2164b4 + i3) * 31) + this.f2979p) * 31) + this.f2980q;
        }
        throw null;
    }

    public final String toString() {
        return "{WorkSpec: " + this.f2964a + '}';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ bcv(String str, int i, String str2, String str3, axt axtVar, axt axtVar2, long j, long j2, long j3, axr axrVar, int i2, int i3, long j4, long j5, long j6, long j7, boolean z, int i4, int i5, int i6, byte[] bArr) {
        String str4;
        axt axtVar3;
        axt axtVar4;
        if ((i6 & 8) != 0) {
            String name = OverwritingInputMerger.class.getName();
            name.getClass();
            str4 = name;
        } else {
            str4 = str3;
        }
        if ((i6 & 16) != 0) {
            axt axtVar5 = axt.f2689a;
            axtVar5.getClass();
            axtVar3 = axtVar5;
        } else {
            axtVar3 = axtVar;
        }
        if ((i6 & 32) != 0) {
            axt axtVar6 = axt.f2689a;
            axtVar6.getClass();
            axtVar4 = axtVar6;
        } else {
            axtVar4 = axtVar2;
        }
        this(str, (i6 & 2) != 0 ? 1 : i, str2, str4, axtVar3, axtVar4, (i6 & 64) != 0 ? 0L : j, (i6 & 128) != 0 ? 0L : j2, (i6 & 256) != 0 ? 0L : j3, (i6 & 512) != 0 ? axr.f2678a : axrVar, (i6 & 1024) != 0 ? 0 : i2, (i6 & 2048) != 0 ? 1 : i3, (i6 & 4096) != 0 ? 30000L : j4, (i6 & 8192) != 0 ? 0L : j5, (i6 & 16384) != 0 ? 0L : j6, (32768 & i6) != 0 ? -1L : j7, ((65536 & i6) == 0) & z, (131072 & i6) != 0 ? 1 : i4, (i6 & 262144) != 0 ? 0 : i5, 0);
    }
}
