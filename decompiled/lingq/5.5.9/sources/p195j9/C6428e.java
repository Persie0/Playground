package p195j9;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.util.Pair;
import com.google.android.exoplayer2.C2416m;
import com.google.common.collect.AbstractC3187f0;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.primitives.Ints;
import java.util.Arrays;
import p479xa.C10134c0;
import p479xa.C10147p;

/* JADX INFO: renamed from: j9.e */
/* JADX INFO: loaded from: classes.dex */
public final class C6428e {

    /* JADX INFO: renamed from: c */
    public static final C6428e f36916c = new C6428e(new int[]{2}, 8);

    /* JADX INFO: renamed from: d */
    public static final C6428e f36917d = new C6428e(new int[]{2, 5, 6}, 8);

    /* JADX INFO: renamed from: e */
    public static final ImmutableMap<Integer, Integer> f36918e;

    /* JADX INFO: renamed from: a */
    public final int[] f36919a;

    /* JADX INFO: renamed from: b */
    public final int f36920b;

    /* JADX INFO: renamed from: j9.e$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public static final AudioAttributes f36921a = new AudioAttributes.Builder().setUsage(1).setContentType(3).setFlags(0).build();

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: a */
        public static int[] m13054a() {
            ImmutableList.C3147b c3147b = ImmutableList.f16043b;
            ImmutableList.C3146a c3146a = new ImmutableList.C3146a();
            ImmutableMap<Integer, Integer> immutableMap = C6428e.f36918e;
            ImmutableSet immutableSet = immutableMap.f16050b;
            ImmutableSet immutableSet2 = immutableSet;
            if (immutableSet == null) {
                ImmutableSet immutableSetMo9072c = immutableMap.mo9072c();
                immutableMap.f16050b = immutableSetMo9072c;
                immutableSet2 = immutableSetMo9072c;
            }
            AbstractC3187f0 it = immutableSet2.iterator();
            while (true) {
                while (true) {
                    if (!it.hasNext()) {
                        c3146a.m9055b(2);
                        return Ints.m9145o0(c3146a.m9068e());
                    }
                    int iIntValue = ((Integer) it.next()).intValue();
                    if (AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(iIntValue).setSampleRate(48000).build(), f36921a)) {
                        c3146a.m9055b(Integer.valueOf(iIntValue));
                    }
                }
            }
        }

        /* JADX INFO: renamed from: b */
        public static int m13055b(int i10, int i11) {
            for (int i12 = 8; i12 > 0; i12--) {
                if (AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i10).setSampleRate(i11).setChannelMask(C10134c0.m19046m(i12)).build(), f36921a)) {
                    return i12;
                }
            }
            return 0;
        }
    }

    static {
        ImmutableMap.C3148a c3148a = new ImmutableMap.C3148a(4);
        c3148a.m9076b(5, 6);
        c3148a.m9076b(17, 6);
        c3148a.m9076b(7, 6);
        c3148a.m9076b(18, 6);
        c3148a.m9076b(6, 8);
        c3148a.m9076b(8, 8);
        c3148a.m9076b(14, 8);
        f36918e = c3148a.m9075a();
    }

    public C6428e(int[] iArr, int i10) {
        if (iArr != null) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
            this.f36919a = iArrCopyOf;
            Arrays.sort(iArrCopyOf);
        } else {
            this.f36919a = new int[0];
        }
        this.f36920b = i10;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x003d  */
    /* JADX WARN: Code duplicated, block: B:16:0x0040  */
    /* JADX WARN: Code duplicated, block: B:18:0x0048  */
    /* JADX WARN: Code duplicated, block: B:19:0x004a  */
    /* JADX WARN: Code duplicated, block: B:21:0x004d  */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00b8, code lost:
    
        if (r10 == 5) goto L60;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Pair<Integer, Integer> m13053a(C2416m c2416m) {
        boolean z10;
        int iIntValue;
        String str = c2416m.f12484l;
        str.getClass();
        int iM19103c = C10147p.m19103c(str, c2416m.f12481i);
        ImmutableMap<Integer, Integer> immutableMap = f36918e;
        if (!immutableMap.containsKey(Integer.valueOf(iM19103c))) {
            return null;
        }
        int[] iArr = this.f36919a;
        int i10 = 6;
        if (iM19103c == 18) {
            if (!(Arrays.binarySearch(iArr, 18) >= 0)) {
                iM19103c = 6;
            } else if (iM19103c == 8) {
                if (Arrays.binarySearch(iArr, 8) >= 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    iM19103c = 7;
                }
            }
        } else if (iM19103c == 8) {
            if (Arrays.binarySearch(iArr, 8) >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                iM19103c = 7;
            }
        }
        if (!(Arrays.binarySearch(iArr, iM19103c) >= 0)) {
            return null;
        }
        int i11 = c2416m.f12463T;
        if (i11 == -1 || iM19103c == 18) {
            int i12 = c2416m.f12464U;
            if (i12 == -1) {
                i12 = 48000;
            }
            if (C10134c0.f51354a >= 29) {
                iIntValue = a.m13055b(iM19103c, i12);
            } else {
                Integer orDefault = immutableMap.getOrDefault(Integer.valueOf(iM19103c), 0);
                orDefault.getClass();
                iIntValue = orDefault.intValue();
            }
            i11 = iIntValue;
        } else if (i11 > this.f36920b) {
            return null;
        }
        int i13 = C10134c0.f51354a;
        if (i13 > 28) {
            i10 = i11;
        } else if (i11 == 7) {
            i10 = 8;
        } else if (i11 == 3 || i11 == 4) {
        }
        if (i13 <= 26 && "fugu".equals(C10134c0.f51355b) && i10 == 1) {
            i10 = 2;
        }
        int iM19046m = C10134c0.m19046m(i10);
        if (iM19046m == 0) {
            return null;
        }
        return Pair.create(Integer.valueOf(iM19103c), Integer.valueOf(iM19046m));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6428e)) {
            return false;
        }
        C6428e c6428e = (C6428e) obj;
        return Arrays.equals(this.f36919a, c6428e.f36919a) && this.f36920b == c6428e.f36920b;
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.f36919a) * 31) + this.f36920b;
    }

    public final String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.f36920b + ", supportedEncodings=" + Arrays.toString(this.f36919a) + "]";
    }
}
