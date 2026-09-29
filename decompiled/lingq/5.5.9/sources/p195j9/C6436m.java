package p195j9;

import android.support.v4.media.session.C0166e;

/* JADX INFO: renamed from: j9.m */
/* JADX INFO: loaded from: classes.dex */
public final class C6436m {

    /* JADX INFO: renamed from: a */
    public static final String[] f36951a = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};

    /* JADX INFO: renamed from: b */
    public static final int[] f36952b = {44100, 48000, 32000};

    /* JADX INFO: renamed from: c */
    public static final int[] f36953c = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};

    /* JADX INFO: renamed from: d */
    public static final int[] f36954d = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};

    /* JADX INFO: renamed from: e */
    public static final int[] f36955e = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};

    /* JADX INFO: renamed from: f */
    public static final int[] f36956f = {32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};

    /* JADX INFO: renamed from: g */
    public static final int[] f36957g = {8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};

    /* JADX INFO: renamed from: j9.m$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public int f36958a;

        /* JADX INFO: renamed from: b */
        public String f36959b;

        /* JADX INFO: renamed from: c */
        public int f36960c;

        /* JADX INFO: renamed from: d */
        public int f36961d;

        /* JADX INFO: renamed from: e */
        public int f36962e;

        /* JADX INFO: renamed from: f */
        public int f36963f;

        /* JADX INFO: renamed from: g */
        public int f36964g;

        /* JADX INFO: renamed from: a */
        public final boolean m13060a(int i10) {
            int i11;
            int i12;
            int i13;
            int i14;
            if (!((i10 & (-2097152)) == -2097152) || (i11 = (i10 >>> 19) & 3) == 1 || (i12 = (i10 >>> 17) & 3) == 0 || (i13 = (i10 >>> 12) & 15) == 0 || i13 == 15 || (i14 = (i10 >>> 10) & 3) == 3) {
                return false;
            }
            this.f36958a = i11;
            this.f36959b = C6436m.f36951a[3 - i12];
            int i15 = C6436m.f36952b[i14];
            this.f36961d = i15;
            int i16 = 2;
            if (i11 == 2) {
                this.f36961d = i15 / 2;
            } else if (i11 == 0) {
                this.f36961d = i15 / 4;
            }
            int i17 = (i10 >>> 9) & 1;
            int i18 = 1152;
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 != 3) {
                        throw new IllegalArgumentException();
                    }
                    i18 = 384;
                }
            } else if (i11 != 3) {
                i18 = 576;
            }
            this.f36964g = i18;
            if (i12 == 3) {
                int i19 = i11 == 3 ? C6436m.f36953c[i13 - 1] : C6436m.f36954d[i13 - 1];
                this.f36963f = i19;
                this.f36960c = (((i19 * 12) / this.f36961d) + i17) * 4;
            } else {
                int i20 = 144;
                if (i11 == 3) {
                    int i21 = i12 == 2 ? C6436m.f36955e[i13 - 1] : C6436m.f36956f[i13 - 1];
                    this.f36963f = i21;
                    this.f36960c = ((i21 * 144) / this.f36961d) + i17;
                } else {
                    int i22 = C6436m.f36957g[i13 - 1];
                    this.f36963f = i22;
                    if (i12 == 1) {
                        i20 = 72;
                    }
                    this.f36960c = ((i20 * i22) / this.f36961d) + i17;
                }
            }
            if (((i10 >> 6) & 3) == 3) {
                i16 = 1;
            }
            this.f36962e = i16;
            return true;
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m13058a(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        if (!((i10 & (-2097152)) == -2097152) || (i11 = (i10 >>> 19) & 3) == 1 || (i12 = (i10 >>> 17) & 3) == 0 || (i13 = (i10 >>> 12) & 15) == 0 || i13 == 15 || (i14 = (i10 >>> 10) & 3) == 3) {
            return -1;
        }
        int i16 = f36952b[i14];
        if (i11 == 2) {
            i16 /= 2;
        } else if (i11 == 0) {
            i16 /= 4;
        }
        int i17 = (i10 >>> 9) & 1;
        if (i12 == 3) {
            return ((((i11 == 3 ? f36953c[i13 - 1] : f36954d[i13 - 1]) * 12) / i16) + i17) * 4;
        }
        if (i11 == 3) {
            i15 = i12 == 2 ? f36955e[i13 - 1] : f36956f[i13 - 1];
        } else {
            i15 = f36957g[i13 - 1];
        }
        int i18 = 144;
        if (i11 == 3) {
            return C0166e.m757a(i15, 144, i16, i17);
        }
        if (i12 == 1) {
            i18 = 72;
        }
        return C0166e.m757a(i18, i15, i16, i17);
    }

    /* JADX INFO: renamed from: b */
    public static int m13059b(int i10) {
        int i11;
        int i12;
        if (!((i10 & (-2097152)) == -2097152) || (i11 = (i10 >>> 19) & 3) == 1 || (i12 = (i10 >>> 17) & 3) == 0) {
            return -1;
        }
        int i13 = (i10 >>> 12) & 15;
        int i14 = (i10 >>> 10) & 3;
        if (i13 != 0 && i13 != 15 && i14 != 3) {
            if (i12 == 1) {
                return i11 == 3 ? 1152 : 576;
            }
            if (i12 == 2) {
                return 1152;
            }
            if (i12 == 3) {
                return 384;
            }
            throw new IllegalArgumentException();
        }
        return -1;
    }
}
