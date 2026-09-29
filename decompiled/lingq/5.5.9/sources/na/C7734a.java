package na;

import android.graphics.Bitmap;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import com.kochava.tracker.BuildConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.zip.Inflater;
import p219ka.AbstractC6645f;
import p219ka.C6640a;
import p219ka.InterfaceC6646g;
import p479xa.C10134c0;
import p479xa.C10151t;

/* JADX INFO: renamed from: na.a */
/* JADX INFO: loaded from: classes.dex */
public final class C7734a extends AbstractC6645f {

    /* JADX INFO: renamed from: m */
    public final C10151t f42320m = new C10151t();

    /* JADX INFO: renamed from: n */
    public final C10151t f42321n = new C10151t();

    /* JADX INFO: renamed from: o */
    public final a f42322o = new a();

    /* JADX INFO: renamed from: p */
    public Inflater f42323p;

    /* JADX INFO: renamed from: na.a$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final C10151t f42324a = new C10151t();

        /* JADX INFO: renamed from: b */
        public final int[] f42325b = new int[256];

        /* JADX INFO: renamed from: c */
        public boolean f42326c;

        /* JADX INFO: renamed from: d */
        public int f42327d;

        /* JADX INFO: renamed from: e */
        public int f42328e;

        /* JADX INFO: renamed from: f */
        public int f42329f;

        /* JADX INFO: renamed from: g */
        public int f42330g;

        /* JADX INFO: renamed from: h */
        public int f42331h;

        /* JADX INFO: renamed from: i */
        public int f42332i;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:21:0x007f  */
    @Override // p219ka.AbstractC6645f
    /* JADX INFO: renamed from: g */
    public final InterfaceC6646g mo13279g(byte[] bArr, int i10, boolean z10) throws SubtitleDecoderException {
        char c10;
        C6640a c6640aM13277a;
        int i11;
        int iM19145t;
        int i12;
        int i13;
        int iM19147v;
        C10151t c10151t = this.f42320m;
        c10151t.m19122C(bArr, i10);
        int i14 = c10151t.f51440c;
        int i15 = c10151t.f51439b;
        char c11 = 255;
        if (i14 - i15 > 0 && (c10151t.f51438a[i15] & 255) == 120) {
            if (this.f42323p == null) {
                this.f42323p = new Inflater();
            }
            Inflater inflater = this.f42323p;
            C10151t c10151t2 = this.f42321n;
            if (C10134c0.m19020E(c10151t, c10151t2, inflater)) {
                c10151t.m19122C(c10151t2.f51438a, c10151t2.f51440c);
            }
        }
        a aVar = this.f42322o;
        int i16 = 0;
        aVar.f42327d = 0;
        aVar.f42328e = 0;
        aVar.f42329f = 0;
        aVar.f42330g = 0;
        aVar.f42331h = 0;
        aVar.f42332i = 0;
        aVar.f42324a.m19121B(0);
        aVar.f42326c = false;
        ArrayList arrayList = new ArrayList();
        while (true) {
            int i17 = c10151t.f51440c;
            if (i17 - c10151t.f51439b < 3) {
                return new C7735b(Collections.unmodifiableList(arrayList));
            }
            int iM19145t2 = c10151t.m19145t();
            int iM19150y = c10151t.m19150y();
            int i18 = c10151t.f51439b + iM19150y;
            if (i18 > i17) {
                c10151t.m19124E(i17);
                c10 = c11;
                c6640aM13277a = null;
            } else {
                int[] iArr = aVar.f42325b;
                C10151t c10151t3 = aVar.f42324a;
                if (iM19145t2 != 128) {
                    switch (iM19145t2) {
                        case 20:
                            if (iM19150y % 5 == 2) {
                                c10151t.m19125F(2);
                                Arrays.fill(iArr, i16);
                                int i19 = iM19150y / 5;
                                int i20 = i16;
                                while (i20 < i19) {
                                    int iM19145t3 = c10151t.m19145t();
                                    int[] iArr2 = iArr;
                                    double dM19145t = c10151t.m19145t();
                                    double dM19145t2 = c10151t.m19145t() - 128;
                                    double dM19145t3 = c10151t.m19145t() - 128;
                                    iArr2[iM19145t3] = (C10134c0.m19041h((int) ((dM19145t - (0.34414d * dM19145t3)) - (dM19145t2 * 0.71414d)), 0, 255) << 8) | (C10134c0.m19041h((int) ((1.402d * dM19145t2) + dM19145t), 0, 255) << 16) | (c10151t.m19145t() << 24) | C10134c0.m19041h((int) ((dM19145t3 * 1.772d) + dM19145t), 0, 255);
                                    i20++;
                                    c11 = 255;
                                    i19 = i19;
                                    iArr = iArr2;
                                }
                                c10 = c11;
                                aVar.f42326c = true;
                            } else {
                                c10 = c11;
                            }
                            break;
                        case 21:
                            if (iM19150y >= 4) {
                                c10151t.m19125F(3);
                                int i21 = iM19150y - 4;
                                if (((128 & c10151t.m19145t()) != 0 ? 1 : i16) == 0) {
                                    i12 = c10151t3.f51439b;
                                    i13 = c10151t3.f51440c;
                                    if (i12 < i13 && i21 > 0) {
                                        int iMin = Math.min(i21, i13 - i12);
                                        c10151t.m19127b(c10151t3.f51438a, i12, iMin);
                                        c10151t3.m19124E(i12 + iMin);
                                    }
                                } else if (i21 >= 7 && (iM19147v = c10151t.m19147v()) >= 4) {
                                    aVar.f42331h = c10151t.m19150y();
                                    aVar.f42332i = c10151t.m19150y();
                                    c10151t3.m19121B(iM19147v - 4);
                                    i21 -= 7;
                                    i12 = c10151t3.f51439b;
                                    i13 = c10151t3.f51440c;
                                    if (i12 < i13) {
                                        int iMin2 = Math.min(i21, i13 - i12);
                                        c10151t.m19127b(c10151t3.f51438a, i12, iMin2);
                                        c10151t3.m19124E(i12 + iMin2);
                                    }
                                }
                            }
                            c10 = c11;
                            break;
                        case 22:
                            if (iM19150y >= 19) {
                                aVar.f42327d = c10151t.m19150y();
                                aVar.f42328e = c10151t.m19150y();
                                c10151t.m19125F(11);
                                aVar.f42329f = c10151t.m19150y();
                                aVar.f42330g = c10151t.m19150y();
                            }
                            c10 = c11;
                            break;
                        default:
                            c10 = c11;
                            break;
                    }
                    i16 = 0;
                    c6640aM13277a = null;
                } else {
                    c10 = c11;
                    if (aVar.f42327d == 0 || aVar.f42328e == 0 || aVar.f42331h == 0 || aVar.f42332i == 0 || (i11 = c10151t3.f51440c) == 0 || c10151t3.f51439b != i11 || !aVar.f42326c) {
                        c6640aM13277a = null;
                    } else {
                        c10151t3.m19124E(0);
                        int i22 = aVar.f42331h * aVar.f42332i;
                        int[] iArr3 = new int[i22];
                        int i23 = 0;
                        while (i23 < i22) {
                            int iM19145t4 = c10151t3.m19145t();
                            if (iM19145t4 != 0) {
                                iM19145t = i23 + 1;
                                iArr3[i23] = iArr[iM19145t4];
                            } else {
                                int iM19145t5 = c10151t3.m19145t();
                                if (iM19145t5 != 0) {
                                    iM19145t = ((iM19145t5 & 64) == 0 ? iM19145t5 & 63 : ((iM19145t5 & 63) << 8) | c10151t3.m19145t()) + i23;
                                    Arrays.fill(iArr3, i23, iM19145t, (iM19145t5 & BuildConfig.SDK_TRUNCATE_LENGTH) == 0 ? 0 : iArr[c10151t3.m19145t()]);
                                }
                            }
                            i23 = iM19145t;
                        }
                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iArr3, aVar.f42331h, aVar.f42332i, Bitmap.Config.ARGB_8888);
                        C6640a.a aVar2 = new C6640a.a();
                        aVar2.f37672b = bitmapCreateBitmap;
                        float f3 = aVar.f42329f;
                        float f10 = aVar.f42327d;
                        aVar2.f37678h = f3 / f10;
                        aVar2.f37679i = 0;
                        float f11 = aVar.f42330g;
                        float f12 = aVar.f42328e;
                        aVar2.f37675e = f11 / f12;
                        aVar2.f37676f = 0;
                        aVar2.f37677g = 0;
                        aVar2.f37682l = aVar.f42331h / f10;
                        aVar2.f37683m = aVar.f42332i / f12;
                        c6640aM13277a = aVar2.m13277a();
                    }
                    i16 = 0;
                    aVar.f42327d = 0;
                    aVar.f42328e = 0;
                    aVar.f42329f = 0;
                    aVar.f42330g = 0;
                    aVar.f42331h = 0;
                    aVar.f42332i = 0;
                    c10151t3.m19121B(0);
                    aVar.f42326c = false;
                }
                c10151t.m19124E(i18);
            }
            if (c6640aM13277a != null) {
                arrayList.add(c6640aM13277a);
            }
            c11 = c10;
        }
    }
}
