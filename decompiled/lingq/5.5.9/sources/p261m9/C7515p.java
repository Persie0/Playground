package p261m9;

import com.google.android.exoplayer2.C2416m;
import com.google.android.exoplayer2.metadata.Metadata;
import java.util.Arrays;
import java.util.Collections;
import p357r6.C8739a;
import p479xa.C10134c0;

/* JADX INFO: renamed from: m9.p */
/* JADX INFO: loaded from: classes.dex */
public final class C7515p {

    /* JADX INFO: renamed from: a */
    public final int f41494a;

    /* JADX INFO: renamed from: b */
    public final int f41495b;

    /* JADX INFO: renamed from: c */
    public final int f41496c;

    /* JADX INFO: renamed from: d */
    public final int f41497d;

    /* JADX INFO: renamed from: e */
    public final int f41498e;

    /* JADX INFO: renamed from: f */
    public final int f41499f;

    /* JADX INFO: renamed from: g */
    public final int f41500g;

    /* JADX INFO: renamed from: h */
    public final int f41501h;

    /* JADX INFO: renamed from: i */
    public final int f41502i;

    /* JADX INFO: renamed from: j */
    public final long f41503j;

    /* JADX INFO: renamed from: k */
    public final a f41504k;

    /* JADX INFO: renamed from: l */
    public final Metadata f41505l;

    /* JADX INFO: renamed from: m9.p$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public final long[] f41506a;

        /* JADX INFO: renamed from: b */
        public final long[] f41507b;

        public a(long[] jArr, long[] jArr2) {
            this.f41506a = jArr;
            this.f41507b = jArr2;
        }
    }

    public C7515p(int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j10, a aVar, Metadata metadata) {
        this.f41494a = i10;
        this.f41495b = i11;
        this.f41496c = i12;
        this.f41497d = i13;
        this.f41498e = i14;
        this.f41499f = m15015d(i14);
        this.f41500g = i15;
        this.f41501h = i16;
        this.f41502i = m15014a(i16);
        this.f41503j = j10;
        this.f41504k = aVar;
        this.f41505l = metadata;
    }

    public C7515p(byte[] bArr, int i10) {
        C8739a c8739a = new C8739a(bArr, bArr.length);
        c8739a.m16974k(i10 * 8);
        this.f41494a = c8739a.m16970g(16);
        this.f41495b = c8739a.m16970g(16);
        this.f41496c = c8739a.m16970g(24);
        this.f41497d = c8739a.m16970g(24);
        int iM16970g = c8739a.m16970g(20);
        this.f41498e = iM16970g;
        this.f41499f = m15015d(iM16970g);
        this.f41500g = c8739a.m16970g(3) + 1;
        int iM16970g2 = c8739a.m16970g(5) + 1;
        this.f41501h = iM16970g2;
        this.f41502i = m15014a(iM16970g2);
        int iM16970g3 = c8739a.m16970g(4);
        int iM16970g4 = c8739a.m16970g(32);
        int i11 = C10134c0.f51354a;
        this.f41503j = ((((long) iM16970g3) & 4294967295L) << 32) | (((long) iM16970g4) & 4294967295L);
        this.f41504k = null;
        this.f41505l = null;
    }

    /* JADX INFO: renamed from: a */
    public static int m15014a(int i10) {
        if (i10 == 8) {
            return 1;
        }
        if (i10 == 12) {
            return 2;
        }
        if (i10 == 16) {
            return 4;
        }
        if (i10 != 20) {
            return i10 != 24 ? -1 : 6;
        }
        return 5;
    }

    /* JADX INFO: renamed from: d */
    public static int m15015d(int i10) {
        switch (i10) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    /* JADX INFO: renamed from: b */
    public final long m15016b() {
        long j10 = this.f41503j;
        if (j10 == 0) {
            return -9223372036854775807L;
        }
        return (j10 * 1000000) / ((long) this.f41498e);
    }

    /* JADX INFO: renamed from: c */
    public final C2416m m15017c(byte[] bArr, Metadata metadata) {
        bArr[4] = -128;
        int i10 = this.f41497d;
        if (i10 <= 0) {
            i10 = -1;
        }
        Metadata metadata2 = this.f41505l;
        if (metadata2 != null) {
            if (metadata != null) {
                Metadata.Entry[] entryArr = metadata.f12627a;
                if (entryArr.length != 0) {
                    int i11 = C10134c0.f51354a;
                    Metadata.Entry[] entryArr2 = metadata2.f12627a;
                    Object[] objArrCopyOf = Arrays.copyOf(entryArr2, entryArr2.length + entryArr.length);
                    System.arraycopy(entryArr, 0, objArrCopyOf, entryArr2.length, entryArr.length);
                    metadata = new Metadata(metadata2.f12628b, (Metadata.Entry[]) objArrCopyOf);
                }
            }
            metadata = metadata2;
        }
        C2416m.a aVar = new C2416m.a();
        aVar.f12501k = "audio/flac";
        aVar.f12502l = i10;
        aVar.f12514x = this.f41500g;
        aVar.f12515y = this.f41498e;
        aVar.f12503m = Collections.singletonList(bArr);
        aVar.f12499i = metadata;
        return new C2416m(aVar);
    }
}
