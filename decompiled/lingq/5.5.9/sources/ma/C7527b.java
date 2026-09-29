package ma;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import com.kochava.tracker.BuildConfig;
import p357r6.C8739a;
import p479xa.C10134c0;

/* JADX INFO: renamed from: ma.b */
/* JADX INFO: loaded from: classes.dex */
public final class C7527b {

    /* JADX INFO: renamed from: h */
    public static final byte[] f41549h = {0, 7, 8, 15};

    /* JADX INFO: renamed from: i */
    public static final byte[] f41550i = {0, 119, -120, -1};

    /* JADX INFO: renamed from: j */
    public static final byte[] f41551j = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};

    /* JADX INFO: renamed from: a */
    public final Paint f41552a;

    /* JADX INFO: renamed from: b */
    public final Paint f41553b;

    /* JADX INFO: renamed from: c */
    public final Canvas f41554c;

    /* JADX INFO: renamed from: d */
    public final b f41555d;

    /* JADX INFO: renamed from: e */
    public final a f41556e;

    /* JADX INFO: renamed from: f */
    public final h f41557f;

    /* JADX INFO: renamed from: g */
    public Bitmap f41558g;

    /* JADX INFO: renamed from: ma.b$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final int f41559a;

        /* JADX INFO: renamed from: b */
        public final int[] f41560b;

        /* JADX INFO: renamed from: c */
        public final int[] f41561c;

        /* JADX INFO: renamed from: d */
        public final int[] f41562d;

        public a(int i10, int[] iArr, int[] iArr2, int[] iArr3) {
            this.f41559a = i10;
            this.f41560b = iArr;
            this.f41561c = iArr2;
            this.f41562d = iArr3;
        }
    }

    /* JADX INFO: renamed from: ma.b$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public final int f41563a;

        /* JADX INFO: renamed from: b */
        public final int f41564b;

        /* JADX INFO: renamed from: c */
        public final int f41565c;

        /* JADX INFO: renamed from: d */
        public final int f41566d;

        /* JADX INFO: renamed from: e */
        public final int f41567e;

        /* JADX INFO: renamed from: f */
        public final int f41568f;

        public b(int i10, int i11, int i12, int i13, int i14, int i15) {
            this.f41563a = i10;
            this.f41564b = i11;
            this.f41565c = i12;
            this.f41566d = i13;
            this.f41567e = i14;
            this.f41568f = i15;
        }
    }

    /* JADX INFO: renamed from: ma.b$c */
    public static final class c {

        /* JADX INFO: renamed from: a */
        public final int f41569a;

        /* JADX INFO: renamed from: b */
        public final boolean f41570b;

        /* JADX INFO: renamed from: c */
        public final byte[] f41571c;

        /* JADX INFO: renamed from: d */
        public final byte[] f41572d;

        public c(int i10, boolean z10, byte[] bArr, byte[] bArr2) {
            this.f41569a = i10;
            this.f41570b = z10;
            this.f41571c = bArr;
            this.f41572d = bArr2;
        }
    }

    /* JADX INFO: renamed from: ma.b$d */
    public static final class d {

        /* JADX INFO: renamed from: a */
        public final int f41573a;

        /* JADX INFO: renamed from: b */
        public final int f41574b;

        /* JADX INFO: renamed from: c */
        public final SparseArray<e> f41575c;

        public d(int i10, int i11, SparseArray sparseArray) {
            this.f41573a = i10;
            this.f41574b = i11;
            this.f41575c = sparseArray;
        }
    }

    /* JADX INFO: renamed from: ma.b$e */
    public static final class e {

        /* JADX INFO: renamed from: a */
        public final int f41576a;

        /* JADX INFO: renamed from: b */
        public final int f41577b;

        public e(int i10, int i11) {
            this.f41576a = i10;
            this.f41577b = i11;
        }
    }

    /* JADX INFO: renamed from: ma.b$f */
    public static final class f {

        /* JADX INFO: renamed from: a */
        public final int f41578a;

        /* JADX INFO: renamed from: b */
        public final boolean f41579b;

        /* JADX INFO: renamed from: c */
        public final int f41580c;

        /* JADX INFO: renamed from: d */
        public final int f41581d;

        /* JADX INFO: renamed from: e */
        public final int f41582e;

        /* JADX INFO: renamed from: f */
        public final int f41583f;

        /* JADX INFO: renamed from: g */
        public final int f41584g;

        /* JADX INFO: renamed from: h */
        public final int f41585h;

        /* JADX INFO: renamed from: i */
        public final int f41586i;

        /* JADX INFO: renamed from: j */
        public final SparseArray<g> f41587j;

        public f(int i10, boolean z10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, SparseArray sparseArray) {
            this.f41578a = i10;
            this.f41579b = z10;
            this.f41580c = i11;
            this.f41581d = i12;
            this.f41582e = i13;
            this.f41583f = i14;
            this.f41584g = i15;
            this.f41585h = i16;
            this.f41586i = i17;
            this.f41587j = sparseArray;
        }
    }

    /* JADX INFO: renamed from: ma.b$g */
    public static final class g {

        /* JADX INFO: renamed from: a */
        public final int f41588a;

        /* JADX INFO: renamed from: b */
        public final int f41589b;

        public g(int i10, int i11) {
            this.f41588a = i10;
            this.f41589b = i11;
        }
    }

    /* JADX INFO: renamed from: ma.b$h */
    public static final class h {

        /* JADX INFO: renamed from: a */
        public final int f41590a;

        /* JADX INFO: renamed from: b */
        public final int f41591b;

        /* JADX INFO: renamed from: c */
        public final SparseArray<f> f41592c = new SparseArray<>();

        /* JADX INFO: renamed from: d */
        public final SparseArray<a> f41593d = new SparseArray<>();

        /* JADX INFO: renamed from: e */
        public final SparseArray<c> f41594e = new SparseArray<>();

        /* JADX INFO: renamed from: f */
        public final SparseArray<a> f41595f = new SparseArray<>();

        /* JADX INFO: renamed from: g */
        public final SparseArray<c> f41596g = new SparseArray<>();

        /* JADX INFO: renamed from: h */
        public b f41597h;

        /* JADX INFO: renamed from: i */
        public d f41598i;

        public h(int i10, int i11) {
            this.f41590a = i10;
            this.f41591b = i11;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public C7527b(int i10, int i11) {
        Paint paint = new Paint();
        this.f41552a = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.f41553b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.f41554c = new Canvas();
        this.f41555d = new b(719, 575, 0, 719, 0, 575);
        this.f41556e = new a(0, new int[]{0, -1, -16777216, -8421505}, m15034a(), m15035b());
        this.f41557f = new h(i10, i11);
    }

    /* JADX INFO: renamed from: a */
    public static int[] m15034a() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i10 = 1; i10 < 16; i10++) {
            if (i10 < 8) {
                iArr[i10] = m15036c(255, (i10 & 1) != 0 ? 255 : 0, (i10 & 2) != 0 ? 255 : 0, (i10 & 4) != 0 ? 255 : 0);
            } else {
                iArr[i10] = m15036c(255, (i10 & 1) != 0 ? 127 : 0, (i10 & 2) != 0 ? 127 : 0, (i10 & 4) == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    /* JADX INFO: renamed from: b */
    public static int[] m15035b() {
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i10 = 0; i10 < 256; i10++) {
            int i11 = 255;
            if (i10 < 8) {
                int i12 = (i10 & 1) != 0 ? 255 : 0;
                int i13 = (i10 & 2) != 0 ? 255 : 0;
                if ((i10 & 4) == 0) {
                    i11 = 0;
                }
                iArr[i10] = m15036c(63, i12, i13, i11);
            } else {
                int i14 = i10 & 136;
                int i15 = 170;
                if (i14 == 0) {
                    int i16 = ((i10 & 1) != 0 ? 85 : 0) + ((i10 & 16) != 0 ? 170 : 0);
                    int i17 = ((i10 & 2) != 0 ? 85 : 0) + ((i10 & 32) != 0 ? 170 : 0);
                    int i18 = (i10 & 4) == 0 ? 0 : 85;
                    if ((i10 & 64) == 0) {
                        i15 = 0;
                    }
                    iArr[i10] = m15036c(255, i16, i17, i18 + i15);
                } else if (i14 != 8) {
                    int i19 = 43;
                    if (i14 == 128) {
                        iArr[i10] = m15036c(255, ((i10 & 1) != 0 ? 43 : 0) + 127 + ((i10 & 16) != 0 ? 85 : 0), ((i10 & 2) != 0 ? 43 : 0) + 127 + ((i10 & 32) != 0 ? 85 : 0), ((i10 & 4) == 0 ? 0 : 43) + 127 + ((i10 & 64) == 0 ? 0 : 85));
                    } else if (i14 == 136) {
                        int i20 = ((i10 & 1) != 0 ? 43 : 0) + ((i10 & 16) != 0 ? 85 : 0);
                        int i21 = ((i10 & 2) != 0 ? 43 : 0) + ((i10 & 32) != 0 ? 85 : 0);
                        if ((i10 & 4) == 0) {
                            i19 = 0;
                        }
                        iArr[i10] = m15036c(255, i20, i21, i19 + ((i10 & 64) == 0 ? 0 : 85));
                    }
                } else {
                    iArr[i10] = m15036c(127, ((i10 & 1) != 0 ? 85 : 0) + ((i10 & 16) != 0 ? 170 : 0), ((i10 & 2) != 0 ? 85 : 0) + ((i10 & 32) != 0 ? 170 : 0), ((i10 & 4) == 0 ? 0 : 85) + ((i10 & 64) == 0 ? 0 : 170));
                }
            }
        }
        return iArr;
    }

    /* JADX INFO: renamed from: c */
    public static int m15036c(int i10, int i11, int i12, int i13) {
        return (i10 << 24) | (i11 << 16) | (i12 << 8) | i13;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x019d  */
    /* JADX WARN: Code duplicated, block: B:102:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:104:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:106:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:109:0x01c9 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:113:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:117:0x01f2 A[LOOP:3: B:85:0x0168->B:117:0x01f2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:149:0x013a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:150:0x01ec A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x0132  */
    /* JADX WARN: Code duplicated, block: B:72:0x0140 A[LOOP:2: B:38:0x00a3->B:72:0x0140, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:87:0x016e  */
    /* JADX WARN: Code duplicated, block: B:89:0x0173  */
    /* JADX WARN: Code duplicated, block: B:91:0x0179  */
    /* JADX WARN: Code duplicated, block: B:92:0x0188  */
    /* JADX WARN: Code duplicated, block: B:94:0x018e  */
    /* JADX WARN: Code duplicated, block: B:95:0x0190  */
    /* JADX WARN: Code duplicated, block: B:97:0x0196 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:98:0x0198 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:99:0x019a A[DONT_INVERT] */
    /* JADX INFO: renamed from: d */
    public static void m15037d(byte[] bArr, int[] iArr, int i10, int i11, int i12, Paint paint, Canvas canvas) {
        byte[] bArr2;
        byte[] bArr3;
        int i13;
        boolean z10;
        int iM16970g;
        int iM16970g2;
        boolean z11;
        int i14;
        int i15;
        int iM16970g3;
        int i16;
        int iM16970g4;
        int iM16970g5;
        int i17;
        boolean z12;
        int i18;
        int i19;
        int i20;
        int iM16970g6;
        C8739a c8739a = new C8739a(bArr, bArr.length);
        int i21 = i11;
        int i22 = i12;
        byte[] bArr4 = null;
        byte[] bArr5 = null;
        byte[] bArr6 = null;
        while (c8739a.m16965b() != 0) {
            int i23 = 8;
            int iM16970g7 = c8739a.m16970g(8);
            if (iM16970g7 != 240) {
                int i24 = 4;
                int i25 = 2;
                int i26 = 1;
                int i27 = 3;
                switch (iM16970g7) {
                    case 16:
                        if (i10 == 3) {
                            bArr3 = bArr4 == null ? f41550i : bArr4;
                        } else {
                            if (i10 == 2) {
                                bArr3 = bArr6 == null ? f41549h : bArr6;
                            } else {
                                bArr2 = null;
                            }
                            i13 = i21;
                            z10 = false;
                            while (true) {
                                iM16970g = c8739a.m16970g(2);
                                if (iM16970g != 0) {
                                    i14 = 1;
                                } else {
                                    if (c8739a.m16969f()) {
                                        iM16970g3 = c8739a.m16970g(3) + 3;
                                        iM16970g = c8739a.m16970g(2);
                                    } else {
                                        if (c8739a.m16969f()) {
                                            i15 = 1;
                                        } else {
                                            iM16970g2 = c8739a.m16970g(2);
                                            if (iM16970g2 != 0) {
                                                z10 = true;
                                            } else if (iM16970g2 != 1) {
                                                i15 = 2;
                                            } else if (iM16970g2 != 2) {
                                                if (iM16970g2 != 3) {
                                                    iM16970g3 = c8739a.m16970g(8) + 29;
                                                    iM16970g = c8739a.m16970g(2);
                                                }
                                                if (i14 == 0 && paint != null) {
                                                    if (bArr2 != 0) {
                                                        iM16970g = bArr2[iM16970g];
                                                    }
                                                    paint.setColor(iArr[iM16970g]);
                                                    canvas.drawRect(i13, i22, i13 + i14, i22 + 1, paint);
                                                }
                                                i13 += i14;
                                                if (z11) {
                                                    c8739a.m16966c();
                                                    i21 = i13;
                                                } else {
                                                    z10 = z11;
                                                }
                                            } else {
                                                iM16970g3 = c8739a.m16970g(4) + 12;
                                                iM16970g = c8739a.m16970g(2);
                                            }
                                            z11 = z10;
                                            iM16970g = 0;
                                            i14 = 0;
                                            if (i14 == 0) {
                                            }
                                            i13 += i14;
                                            if (z11) {
                                                c8739a.m16966c();
                                                i21 = i13;
                                            } else {
                                                z10 = z11;
                                            }
                                        }
                                        i14 = i15;
                                        z11 = z10;
                                        iM16970g = 0;
                                        if (i14 == 0) {
                                        }
                                        i13 += i14;
                                        if (z11) {
                                            c8739a.m16966c();
                                            i21 = i13;
                                        } else {
                                            z10 = z11;
                                        }
                                    }
                                    i14 = iM16970g3;
                                }
                                z11 = z10;
                                if (i14 == 0) {
                                }
                                i13 += i14;
                                if (z11) {
                                    c8739a.m16966c();
                                    i21 = i13;
                                } else {
                                    z10 = z11;
                                }
                            }
                        }
                        bArr2 = bArr3;
                        i13 = i21;
                        z10 = false;
                        while (true) {
                            iM16970g = c8739a.m16970g(2);
                            if (iM16970g != 0) {
                                i14 = 1;
                            } else {
                                if (c8739a.m16969f()) {
                                    iM16970g3 = c8739a.m16970g(3) + 3;
                                    iM16970g = c8739a.m16970g(2);
                                } else {
                                    if (c8739a.m16969f()) {
                                        i15 = 1;
                                    } else {
                                        iM16970g2 = c8739a.m16970g(2);
                                        if (iM16970g2 != 0) {
                                            z10 = true;
                                        } else if (iM16970g2 != 1) {
                                            i15 = 2;
                                        } else if (iM16970g2 != 2) {
                                            if (iM16970g2 != 3) {
                                                iM16970g3 = c8739a.m16970g(8) + 29;
                                                iM16970g = c8739a.m16970g(2);
                                            }
                                            if (i14 == 0) {
                                            }
                                            i13 += i14;
                                            if (z11) {
                                                c8739a.m16966c();
                                                i21 = i13;
                                            } else {
                                                z10 = z11;
                                            }
                                        } else {
                                            iM16970g3 = c8739a.m16970g(4) + 12;
                                            iM16970g = c8739a.m16970g(2);
                                        }
                                        z11 = z10;
                                        iM16970g = 0;
                                        i14 = 0;
                                        if (i14 == 0) {
                                        }
                                        i13 += i14;
                                        if (z11) {
                                            c8739a.m16966c();
                                            i21 = i13;
                                        } else {
                                            z10 = z11;
                                        }
                                    }
                                    i14 = i15;
                                    z11 = z10;
                                    iM16970g = 0;
                                    if (i14 == 0) {
                                    }
                                    i13 += i14;
                                    if (z11) {
                                        c8739a.m16966c();
                                        i21 = i13;
                                    } else {
                                        z10 = z11;
                                    }
                                }
                                i14 = iM16970g3;
                            }
                            z11 = z10;
                            if (i14 == 0) {
                            }
                            i13 += i14;
                            if (z11) {
                                c8739a.m16966c();
                                i21 = i13;
                            } else {
                                z10 = z11;
                            }
                            break;
                        }
                        break;
                    case 17:
                        byte[] bArr7 = i10 == 3 ? bArr5 == null ? f41551j : bArr5 : null;
                        int i28 = i21;
                        boolean z13 = false;
                        while (true) {
                            int iM16970g8 = c8739a.m16970g(i24);
                            if (iM16970g8 != 0) {
                                i17 = 1;
                            } else {
                                if (c8739a.m16969f()) {
                                    if (c8739a.m16969f()) {
                                        int iM16970g9 = c8739a.m16970g(i25);
                                        if (iM16970g9 == 0) {
                                            i16 = 1;
                                        } else if (iM16970g9 == 1) {
                                            i16 = i25;
                                        } else if (iM16970g9 == i25) {
                                            iM16970g4 = c8739a.m16970g(i24) + 9;
                                            iM16970g5 = c8739a.m16970g(i24);
                                        } else if (iM16970g9 != i27) {
                                            z12 = z13;
                                            iM16970g8 = 0;
                                            i18 = 0;
                                        } else {
                                            iM16970g4 = c8739a.m16970g(i23) + 25;
                                            iM16970g5 = c8739a.m16970g(i24);
                                        }
                                        z12 = z13;
                                        i18 = i16;
                                        iM16970g8 = 0;
                                    } else {
                                        iM16970g4 = c8739a.m16970g(i25) + i24;
                                        iM16970g5 = c8739a.m16970g(i24);
                                    }
                                    int i29 = iM16970g5;
                                    i17 = iM16970g4;
                                    iM16970g8 = i29;
                                } else {
                                    int iM16970g10 = c8739a.m16970g(i27);
                                    if (iM16970g10 != 0) {
                                        i16 = iM16970g10 + 2;
                                        z12 = z13;
                                        i18 = i16;
                                        iM16970g8 = 0;
                                    } else {
                                        z13 = true;
                                        z12 = z13;
                                        iM16970g8 = 0;
                                        i18 = 0;
                                    }
                                }
                                if (i18 != 0 || paint == null) {
                                    i19 = i27;
                                } else {
                                    if (bArr7 != 0) {
                                        iM16970g8 = bArr7[iM16970g8];
                                    }
                                    paint.setColor(iArr[iM16970g8]);
                                    i19 = 3;
                                    canvas.drawRect(i28, i22, i28 + i18, i22 + 1, paint);
                                }
                                i28 += i18;
                                if (z12) {
                                    c8739a.m16966c();
                                    i21 = i28;
                                } else {
                                    i25 = i25;
                                    i27 = i19;
                                    z13 = z12;
                                    i23 = 8;
                                    i24 = 4;
                                }
                            }
                            z12 = z13;
                            i18 = i17;
                            if (i18 != 0) {
                                i19 = i27;
                            } else {
                                i19 = i27;
                            }
                            i28 += i18;
                            if (z12) {
                                c8739a.m16966c();
                                i21 = i28;
                            } else {
                                i25 = i25;
                                i27 = i19;
                                z13 = z12;
                                i23 = 8;
                                i24 = 4;
                            }
                            break;
                        }
                        break;
                    case 18:
                        int i30 = i21;
                        int i31 = 0;
                        while (true) {
                            int iM16970g11 = c8739a.m16970g(8);
                            if (iM16970g11 != 0) {
                                i20 = i31;
                                iM16970g6 = i26;
                            } else if (c8739a.m16969f()) {
                                i20 = i31;
                                iM16970g6 = c8739a.m16970g(7);
                                iM16970g11 = c8739a.m16970g(8);
                            } else {
                                int iM16970g12 = c8739a.m16970g(7);
                                if (iM16970g12 != 0) {
                                    i20 = i31;
                                    iM16970g6 = iM16970g12;
                                    iM16970g11 = 0;
                                } else {
                                    i20 = i26;
                                    iM16970g11 = 0;
                                    iM16970g6 = 0;
                                }
                            }
                            if (iM16970g6 != 0 && paint != null) {
                                paint.setColor(iArr[iM16970g11]);
                                canvas.drawRect(i30, i22, i30 + iM16970g6, i22 + 1, paint);
                            }
                            i30 += iM16970g6;
                            if (i20 != 0) {
                                i21 = i30;
                            } else {
                                i26 = i26;
                                i31 = i20;
                            }
                            break;
                        }
                        break;
                    default:
                        switch (iM16970g7) {
                            case 32:
                                bArr6 = new byte[4];
                                for (int i32 = 0; i32 < 4; i32++) {
                                    bArr6[i32] = (byte) c8739a.m16970g(4);
                                }
                                break;
                            case 33:
                                bArr4 = new byte[4];
                                for (int i33 = 0; i33 < 4; i33++) {
                                    bArr4[i33] = (byte) c8739a.m16970g(8);
                                }
                                break;
                            case 34:
                                bArr5 = new byte[16];
                                for (int i34 = 0; i34 < 16; i34++) {
                                    bArr5[i34] = (byte) c8739a.m16970g(8);
                                }
                                break;
                        }
                        break;
                }
            } else {
                i22 += 2;
                i21 = i11;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public static a m15038e(C8739a c8739a, int i10) {
        int[] iArr;
        int iM16970g;
        int iM16970g2;
        int iM16970g3;
        int iM16970g4;
        int i11 = 8;
        int iM16970g5 = c8739a.m16970g(8);
        c8739a.m16976m(8);
        int i12 = i10 - 2;
        int i13 = 4;
        int[] iArr2 = {0, -1, -16777216, -8421505};
        int[] iArrM15034a = m15034a();
        int[] iArrM15035b = m15035b();
        while (i12 > 0) {
            int iM16970g6 = c8739a.m16970g(i11);
            int iM16970g7 = c8739a.m16970g(i11);
            int i14 = i12 - 2;
            if ((iM16970g7 & BuildConfig.SDK_TRUNCATE_LENGTH) != 0) {
                iArr = iArr2;
            } else {
                iArr = (iM16970g7 & 64) != 0 ? iArrM15034a : iArrM15035b;
            }
            if ((iM16970g7 & 1) != 0) {
                iM16970g3 = c8739a.m16970g(i11);
                iM16970g4 = c8739a.m16970g(i11);
                iM16970g = c8739a.m16970g(i11);
                iM16970g2 = c8739a.m16970g(i11);
                i12 = i14 - 4;
            } else {
                int iM16970g8 = c8739a.m16970g(6) << 2;
                int iM16970g9 = c8739a.m16970g(i13) << i13;
                i12 = i14 - 2;
                iM16970g = c8739a.m16970g(i13) << i13;
                iM16970g2 = c8739a.m16970g(2) << 6;
                iM16970g3 = iM16970g8;
                iM16970g4 = iM16970g9;
            }
            if (iM16970g3 == 0) {
                iM16970g2 = 255;
                iM16970g4 = 0;
                iM16970g = 0;
            }
            double d10 = iM16970g3;
            double d11 = iM16970g4 - 128;
            double d12 = iM16970g - 128;
            iArr[iM16970g6] = m15036c((byte) (255 - (iM16970g2 & 255)), C10134c0.m19041h((int) ((1.402d * d11) + d10), 0, 255), C10134c0.m19041h((int) ((d10 - (0.34414d * d12)) - (d11 * 0.71414d)), 0, 255), C10134c0.m19041h((int) ((d12 * 1.772d) + d10), 0, 255));
            iArr2 = iArr2;
            iM16970g5 = iM16970g5;
            i11 = 8;
            i13 = 4;
        }
        return new a(iM16970g5, iArr2, iArrM15034a, iArrM15035b);
    }

    /* JADX INFO: renamed from: f */
    public static c m15039f(C8739a c8739a) {
        byte[] bArr;
        int iM16970g = c8739a.m16970g(16);
        c8739a.m16976m(4);
        int iM16970g2 = c8739a.m16970g(2);
        boolean zM16969f = c8739a.m16969f();
        c8739a.m16976m(1);
        byte[] bArr2 = C10134c0.f51359f;
        if (iM16970g2 == 1) {
            c8739a.m16976m(c8739a.m16970g(8) * 16);
        } else if (iM16970g2 == 0) {
            int iM16970g3 = c8739a.m16970g(16);
            int iM16970g4 = c8739a.m16970g(16);
            if (iM16970g3 > 0) {
                bArr2 = new byte[iM16970g3];
                c8739a.m16972i(bArr2, iM16970g3);
            }
            if (iM16970g4 > 0) {
                bArr = new byte[iM16970g4];
                c8739a.m16972i(bArr, iM16970g4);
            }
            return new c(iM16970g, zM16969f, bArr2, bArr);
        }
        bArr = bArr2;
        return new c(iM16970g, zM16969f, bArr2, bArr);
    }
}
