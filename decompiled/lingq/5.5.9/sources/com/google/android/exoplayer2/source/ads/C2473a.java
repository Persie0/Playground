package com.google.android.exoplayer2.source.ads;

import android.net.Uri;
import com.google.android.exoplayer2.InterfaceC2409f;
import java.util.Arrays;
import p150h9.C5931p;
import p402u0.C9362e;
import p479xa.C10129a;
import p479xa.C10134c0;

/* JADX INFO: renamed from: com.google.android.exoplayer2.source.ads.a */
/* JADX INFO: loaded from: classes.dex */
public final class C2473a implements InterfaceC2409f {

    /* JADX INFO: renamed from: H */
    public static final C9362e f13033H;

    /* JADX INFO: renamed from: g */
    public static final C2473a f13034g = new C2473a(null, new a[0], 0, -9223372036854775807L, 0);

    /* JADX INFO: renamed from: h */
    public static final a f13035h;

    /* JADX INFO: renamed from: i */
    public static final String f13036i;

    /* JADX INFO: renamed from: j */
    public static final String f13037j;

    /* JADX INFO: renamed from: k */
    public static final String f13038k;

    /* JADX INFO: renamed from: l */
    public static final String f13039l;

    /* JADX INFO: renamed from: a */
    public final Object f13040a;

    /* JADX INFO: renamed from: b */
    public final int f13041b;

    /* JADX INFO: renamed from: c */
    public final long f13042c;

    /* JADX INFO: renamed from: d */
    public final long f13043d;

    /* JADX INFO: renamed from: e */
    public final int f13044e;

    /* JADX INFO: renamed from: f */
    public final a[] f13045f;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.ads.a$a */
    public static final class a implements InterfaceC2409f {

        /* JADX INFO: renamed from: a */
        public final long f13055a;

        /* JADX INFO: renamed from: b */
        public final int f13056b;

        /* JADX INFO: renamed from: c */
        public final int f13057c;

        /* JADX INFO: renamed from: d */
        public final Uri[] f13058d;

        /* JADX INFO: renamed from: e */
        public final int[] f13059e;

        /* JADX INFO: renamed from: f */
        public final long[] f13060f;

        /* JADX INFO: renamed from: g */
        public final long f13061g;

        /* JADX INFO: renamed from: h */
        public final boolean f13062h;

        /* JADX INFO: renamed from: i */
        public static final String f13051i = C10134c0.m19021F(0);

        /* JADX INFO: renamed from: j */
        public static final String f13052j = C10134c0.m19021F(1);

        /* JADX INFO: renamed from: k */
        public static final String f13053k = C10134c0.m19021F(2);

        /* JADX INFO: renamed from: l */
        public static final String f13054l = C10134c0.m19021F(3);

        /* JADX INFO: renamed from: H */
        public static final String f13046H = C10134c0.m19021F(4);

        /* JADX INFO: renamed from: I */
        public static final String f13047I = C10134c0.m19021F(5);

        /* JADX INFO: renamed from: J */
        public static final String f13048J = C10134c0.m19021F(6);

        /* JADX INFO: renamed from: K */
        public static final String f13049K = C10134c0.m19021F(7);

        /* JADX INFO: renamed from: L */
        public static final C5931p f13050L = new C5931p(16);

        public a(long j10, int i10, int i11, int[] iArr, Uri[] uriArr, long[] jArr, long j11, boolean z10) {
            C10129a.m18990b(iArr.length == uriArr.length);
            this.f13055a = j10;
            this.f13056b = i10;
            this.f13057c = i11;
            this.f13059e = iArr;
            this.f13058d = uriArr;
            this.f13060f = jArr;
            this.f13061g = j11;
            this.f13062h = z10;
        }

        /* JADX INFO: renamed from: a */
        public final int m7249a(int i10) {
            int i11;
            int i12 = i10 + 1;
            while (true) {
                int[] iArr = this.f13059e;
                if (i12 >= iArr.length || this.f13062h || (i11 = iArr[i12]) == 0) {
                    break;
                }
                if (i11 != 1) {
                    i12++;
                }
                return i12;
            }
            return i12;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                return this.f13055a == aVar.f13055a && this.f13056b == aVar.f13056b && this.f13057c == aVar.f13057c && Arrays.equals(this.f13058d, aVar.f13058d) && Arrays.equals(this.f13059e, aVar.f13059e) && Arrays.equals(this.f13060f, aVar.f13060f) && this.f13061g == aVar.f13061g && this.f13062h == aVar.f13062h;
            }
            return false;
        }

        public final int hashCode() {
            int i10 = ((this.f13056b * 31) + this.f13057c) * 31;
            long j10 = this.f13055a;
            int iHashCode = (Arrays.hashCode(this.f13060f) + ((Arrays.hashCode(this.f13059e) + ((((i10 + ((int) (j10 ^ (j10 >>> 32)))) * 31) + Arrays.hashCode(this.f13058d)) * 31)) * 31)) * 31;
            long j11 = this.f13061g;
            return ((iHashCode + ((int) (j11 ^ (j11 >>> 32)))) * 31) + (this.f13062h ? 1 : 0);
        }
    }

    static {
        a aVar = new a(0L, -1, -1, new int[0], new Uri[0], new long[0], 0L, false);
        int[] iArr = aVar.f13059e;
        int length = iArr.length;
        int iMax = Math.max(0, length);
        int[] iArrCopyOf = Arrays.copyOf(iArr, iMax);
        Arrays.fill(iArrCopyOf, length, iMax, 0);
        long[] jArr = aVar.f13060f;
        int length2 = jArr.length;
        int iMax2 = Math.max(0, length2);
        long[] jArrCopyOf = Arrays.copyOf(jArr, iMax2);
        Arrays.fill(jArrCopyOf, length2, iMax2, -9223372036854775807L);
        f13035h = new a(aVar.f13055a, 0, aVar.f13057c, iArrCopyOf, (Uri[]) Arrays.copyOf(aVar.f13058d, 0), jArrCopyOf, aVar.f13061g, aVar.f13062h);
        f13036i = C10134c0.m19021F(1);
        f13037j = C10134c0.m19021F(2);
        f13038k = C10134c0.m19021F(3);
        f13039l = C10134c0.m19021F(4);
        f13033H = new C9362e(22);
    }

    public C2473a(Object obj, a[] aVarArr, long j10, long j11, int i10) {
        this.f13040a = obj;
        this.f13042c = j10;
        this.f13043d = j11;
        this.f13041b = aVarArr.length + i10;
        this.f13045f = aVarArr;
        this.f13044e = i10;
    }

    /* JADX INFO: renamed from: a */
    public final a m7248a(int i10) {
        int i11 = this.f13044e;
        return i10 < i11 ? f13035h : this.f13045f[i10 - i11];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C2473a.class == obj.getClass()) {
            C2473a c2473a = (C2473a) obj;
            return C10134c0.m19034a(this.f13040a, c2473a.f13040a) && this.f13041b == c2473a.f13041b && this.f13042c == c2473a.f13042c && this.f13043d == c2473a.f13043d && this.f13044e == c2473a.f13044e && Arrays.equals(this.f13045f, c2473a.f13045f);
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.f13041b * 31;
        Object obj = this.f13040a;
        return ((((((((i10 + (obj == null ? 0 : obj.hashCode())) * 31) + ((int) this.f13042c)) * 31) + ((int) this.f13043d)) * 31) + this.f13044e) * 31) + Arrays.hashCode(this.f13045f);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdPlaybackState(adsId=");
        sb2.append(this.f13040a);
        sb2.append(", adResumePositionUs=");
        sb2.append(this.f13042c);
        sb2.append(", adGroups=[");
        int i10 = 0;
        while (true) {
            a[] aVarArr = this.f13045f;
            if (i10 >= aVarArr.length) {
                sb2.append("])");
                return sb2.toString();
            }
            sb2.append("adGroup(timeUs=");
            sb2.append(aVarArr[i10].f13055a);
            sb2.append(", ads=[");
            for (int i11 = 0; i11 < aVarArr[i10].f13059e.length; i11++) {
                sb2.append("ad(state=");
                int i12 = aVarArr[i10].f13059e[i11];
                if (i12 == 0) {
                    sb2.append('_');
                } else if (i12 == 1) {
                    sb2.append('R');
                } else if (i12 == 2) {
                    sb2.append('S');
                } else if (i12 == 3) {
                    sb2.append('P');
                } else if (i12 != 4) {
                    sb2.append('?');
                } else {
                    sb2.append('!');
                }
                sb2.append(", durationUs=");
                sb2.append(aVarArr[i10].f13060f[i11]);
                sb2.append(')');
                if (i11 < aVarArr[i10].f13059e.length - 1) {
                    sb2.append(", ");
                }
            }
            sb2.append("])");
            if (i10 < aVarArr.length - 1) {
                sb2.append(", ");
            }
            i10++;
        }
    }
}
