package p433v9;

import com.google.android.exoplayer2.C2416m;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.common.collect.ImmutableList;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import p261m9.C7524y;
import p261m9.C7525z;
import p479xa.C10129a;
import p479xa.C10145n;
import p479xa.C10151t;

/* JADX INFO: renamed from: v9.i */
/* JADX INFO: loaded from: classes.dex */
public final class C9686i extends AbstractC9685h {

    /* JADX INFO: renamed from: n */
    public a f49594n;

    /* JADX INFO: renamed from: o */
    public int f49595o;

    /* JADX INFO: renamed from: p */
    public boolean f49596p;

    /* JADX INFO: renamed from: q */
    public C7525z.c f49597q;

    /* JADX INFO: renamed from: r */
    public C7525z.a f49598r;

    /* JADX INFO: renamed from: v9.i$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final C7525z.c f49599a;

        /* JADX INFO: renamed from: b */
        public final C7525z.a f49600b;

        /* JADX INFO: renamed from: c */
        public final byte[] f49601c;

        /* JADX INFO: renamed from: d */
        public final C7525z.b[] f49602d;

        /* JADX INFO: renamed from: e */
        public final int f49603e;

        public a(C7525z.c cVar, C7525z.a aVar, byte[] bArr, C7525z.b[] bVarArr, int i10) {
            this.f49599a = cVar;
            this.f49600b = aVar;
            this.f49601c = bArr;
            this.f49602d = bVarArr;
            this.f49603e = i10;
        }
    }

    @Override // p433v9.AbstractC9685h
    /* JADX INFO: renamed from: a */
    public final void mo18196a(long j10) {
        this.f49585g = j10;
        this.f49596p = j10 != 0;
        C7525z.c cVar = this.f49597q;
        this.f49595o = cVar != null ? cVar.f41545e : 0;
    }

    @Override // p433v9.AbstractC9685h
    /* JADX INFO: renamed from: b */
    public final long mo18188b(C10151t c10151t) {
        byte b10 = c10151t.f51438a[0];
        if ((b10 & 1) == 1) {
            return -1L;
        }
        a aVar = this.f49594n;
        C10129a.m18993e(aVar);
        boolean z10 = aVar.f49602d[(b10 >> 1) & (255 >>> (8 - aVar.f49603e))].f41540a;
        C7525z.c cVar = aVar.f49599a;
        int i10 = !z10 ? cVar.f41545e : cVar.f41546f;
        long j10 = this.f49596p ? (this.f49595o + i10) / 4 : 0;
        byte[] bArr = c10151t.f51438a;
        int length = bArr.length;
        int i11 = c10151t.f51440c + 4;
        if (length < i11) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, i11);
            c10151t.m19122C(bArrCopyOf, bArrCopyOf.length);
        } else {
            c10151t.m19123D(i11);
        }
        byte[] bArr2 = c10151t.f51438a;
        int i12 = c10151t.f51440c;
        bArr2[i12 - 4] = (byte) (j10 & 255);
        bArr2[i12 - 3] = (byte) ((j10 >>> 8) & 255);
        bArr2[i12 - 2] = (byte) ((j10 >>> 16) & 255);
        bArr2[i12 - 1] = (byte) ((j10 >>> 24) & 255);
        this.f49596p = true;
        this.f49595o = i10;
        return j10;
    }

    /* JADX WARN: Code duplicated, block: B:173:0x0420 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:175:0x0422  */
    @Override // p433v9.AbstractC9685h
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    /* JADX INFO: renamed from: c */
    public final boolean mo18189c(C10151t c10151t, long j10, AbstractC9685h.a aVar) throws IOException {
        a aVar2;
        int i10;
        int iM15029d;
        C7525z.c cVar;
        C7525z.c cVar2;
        byte[] bArr;
        if (this.f49594n != null) {
            aVar.f49592a.getClass();
            return false;
        }
        C7525z.c cVar3 = this.f49597q;
        int i11 = 4;
        if (cVar3 != null) {
            C7525z.a aVar3 = this.f49598r;
            if (aVar3 == null) {
                this.f49598r = C7525z.m15032b(c10151t, true, true);
            } else {
                int i12 = c10151t.f51440c;
                byte[] bArr2 = new byte[i12];
                System.arraycopy(c10151t.f51438a, 0, bArr2, 0, i12);
                int i13 = 5;
                C7525z.m15033c(5, c10151t, false);
                int iM19145t = c10151t.m19145t() + 1;
                C7524y c7524y = new C7524y(c10151t.f51438a);
                c7524y.m15030e(c10151t.f51439b * 8);
                int i14 = 0;
                while (i14 < iM19145t) {
                    if (c7524y.m15029d(24) != 5653314) {
                        throw ParserException.m6770a("expected code book to start with [0x56, 0x43, 0x42] at " + ((c7524y.f41536b * 8) + c7524y.f41537c), null);
                    }
                    int iM15029d2 = c7524y.m15029d(16);
                    int iM15029d3 = c7524y.m15029d(24);
                    long[] jArr = new long[iM15029d3];
                    long jFloor = 0;
                    if (c7524y.m15028c()) {
                        cVar2 = cVar3;
                        int iM15029d4 = c7524y.m15029d(i13) + 1;
                        int i15 = 0;
                        while (i15 < iM15029d3) {
                            int i16 = 0;
                            for (int i17 = iM15029d3 - i15; i17 > 0; i17 >>>= 1) {
                                i16++;
                            }
                            int iM15029d5 = c7524y.m15029d(i16);
                            int i18 = 0;
                            while (i18 < iM15029d5 && i15 < iM15029d3) {
                                jArr[i15] = iM15029d4;
                                i15++;
                                i18++;
                                bArr2 = bArr2;
                            }
                            iM15029d4++;
                            bArr2 = bArr2;
                        }
                        bArr = bArr2;
                        i11 = 4;
                    } else {
                        boolean zM15028c = c7524y.m15028c();
                        int i19 = 0;
                        while (i19 < iM15029d3) {
                            if (!zM15028c) {
                                jArr[i19] = c7524y.m15029d(i13) + 1;
                            } else if (c7524y.m15028c()) {
                                jArr[i19] = c7524y.m15029d(i13) + 1;
                            } else {
                                jArr[i19] = 0;
                            }
                            i19++;
                            cVar3 = cVar3;
                            i11 = 4;
                        }
                        cVar2 = cVar3;
                        bArr = bArr2;
                    }
                    int iM15029d6 = c7524y.m15029d(i11);
                    if (iM15029d6 > 2) {
                        throw ParserException.m6770a("lookup type greater than 2 not decodable: " + iM15029d6, null);
                    }
                    if (iM15029d6 == 1 || iM15029d6 == 2) {
                        c7524y.m15030e(32);
                        c7524y.m15030e(32);
                        int iM15029d7 = c7524y.m15029d(i11) + 1;
                        c7524y.m15030e(1);
                        if (iM15029d6 != 1) {
                            jFloor = ((long) iM15029d3) * ((long) iM15029d2);
                        } else if (iM15029d2 != 0) {
                            jFloor = (long) Math.floor(Math.pow(iM15029d3, 1.0d / ((double) iM15029d2)));
                        }
                        c7524y.m15030e((int) (((long) iM15029d7) * jFloor));
                    }
                    i14++;
                    bArr2 = bArr;
                    cVar3 = cVar2;
                    i11 = 4;
                    i13 = 5;
                }
                C7525z.c cVar4 = cVar3;
                byte[] bArr3 = bArr2;
                int i20 = 6;
                int iM15029d8 = c7524y.m15029d(6) + 1;
                for (int i21 = 0; i21 < iM15029d8; i21++) {
                    if (c7524y.m15029d(16) != 0) {
                        throw ParserException.m6770a("placeholder of time domain transforms not zeroed out", null);
                    }
                }
                int i22 = 1;
                int iM15029d9 = c7524y.m15029d(6) + 1;
                int i23 = 0;
                while (true) {
                    int i24 = 3;
                    if (i23 >= iM15029d9) {
                        int i25 = 1;
                        int iM15029d10 = c7524y.m15029d(i20) + 1;
                        int i26 = 0;
                        while (i26 < iM15029d10) {
                            if (c7524y.m15029d(16) > 2) {
                                throw ParserException.m6770a("residueType greater than 2 is not decodable", null);
                            }
                            c7524y.m15030e(24);
                            c7524y.m15030e(24);
                            c7524y.m15030e(24);
                            int iM15029d11 = c7524y.m15029d(i20) + i25;
                            int i27 = 8;
                            c7524y.m15030e(8);
                            int[] iArr = new int[iM15029d11];
                            for (int i28 = 0; i28 < iM15029d11; i28++) {
                                iArr[i28] = ((c7524y.m15028c() ? c7524y.m15029d(5) : 0) * 8) + c7524y.m15029d(3);
                            }
                            int i29 = 0;
                            while (i29 < iM15029d11) {
                                int i30 = 0;
                                while (i30 < i27) {
                                    if ((iArr[i29] & (1 << i30)) != 0) {
                                        c7524y.m15030e(i27);
                                    }
                                    i30++;
                                    i27 = 8;
                                }
                                i29++;
                                i27 = 8;
                            }
                            i26++;
                            i20 = 6;
                            i25 = 1;
                        }
                        int iM15029d12 = c7524y.m15029d(i20) + 1;
                        int i31 = 0;
                        while (i31 < iM15029d12) {
                            int iM15029d13 = c7524y.m15029d(16);
                            if (iM15029d13 != 0) {
                                C10145n.m19095c("VorbisUtil", "mapping type other than 0 not supported: " + iM15029d13);
                                cVar = cVar4;
                            } else {
                                if (c7524y.m15028c()) {
                                    i10 = 1;
                                    iM15029d = c7524y.m15029d(4) + 1;
                                } else {
                                    i10 = 1;
                                    iM15029d = 1;
                                }
                                boolean zM15028c2 = c7524y.m15028c();
                                cVar = cVar4;
                                int i32 = cVar.f41541a;
                                if (zM15028c2) {
                                    int iM15029d14 = c7524y.m15029d(8) + i10;
                                    for (int i33 = 0; i33 < iM15029d14; i33++) {
                                        int i34 = i32 - 1;
                                        int i35 = 0;
                                        for (int i36 = i34; i36 > 0; i36 >>>= 1) {
                                            i35++;
                                        }
                                        c7524y.m15030e(i35);
                                        int i37 = 0;
                                        while (i34 > 0) {
                                            i37++;
                                            i34 >>>= 1;
                                        }
                                        c7524y.m15030e(i37);
                                    }
                                }
                                if (c7524y.m15029d(2) != 0) {
                                    throw ParserException.m6770a("to reserved bits must be zero after mapping coupling steps", null);
                                }
                                if (iM15029d > 1) {
                                    for (int i38 = 0; i38 < i32; i38++) {
                                        c7524y.m15030e(4);
                                    }
                                }
                                for (int i39 = 0; i39 < iM15029d; i39++) {
                                    c7524y.m15030e(8);
                                    c7524y.m15030e(8);
                                    c7524y.m15030e(8);
                                }
                            }
                            i31++;
                            cVar4 = cVar;
                        }
                        C7525z.c cVar5 = cVar4;
                        int iM15029d15 = c7524y.m15029d(6) + 1;
                        C7525z.b[] bVarArr = new C7525z.b[iM15029d15];
                        for (int i40 = 0; i40 < iM15029d15; i40++) {
                            boolean zM15028c3 = c7524y.m15028c();
                            c7524y.m15029d(16);
                            c7524y.m15029d(16);
                            c7524y.m15029d(8);
                            bVarArr[i40] = new C7525z.b(zM15028c3);
                        }
                        if (!c7524y.m15028c()) {
                            throw ParserException.m6770a("framing bit after modes not set as expected", null);
                        }
                        int i41 = 0;
                        for (int i42 = iM15029d15 - 1; i42 > 0; i42 >>>= 1) {
                            i41++;
                        }
                        aVar2 = new a(cVar5, aVar3, bArr3, bVarArr, i41);
                        break;
                    }
                    int iM15029d16 = c7524y.m15029d(16);
                    if (iM15029d16 == 0) {
                        int i43 = 8;
                        c7524y.m15030e(8);
                        c7524y.m15030e(16);
                        c7524y.m15030e(16);
                        c7524y.m15030e(6);
                        c7524y.m15030e(8);
                        int iM15029d17 = c7524y.m15029d(4) + 1;
                        int i44 = 0;
                        while (i44 < iM15029d17) {
                            c7524y.m15030e(i43);
                            i44++;
                            i43 = 8;
                        }
                    } else {
                        if (iM15029d16 != i22) {
                            throw ParserException.m6770a("floor type greater than 1 not decodable: " + iM15029d16, null);
                        }
                        int iM15029d18 = c7524y.m15029d(5);
                        int[] iArr2 = new int[iM15029d18];
                        int i45 = -1;
                        for (int i46 = 0; i46 < iM15029d18; i46++) {
                            int iM15029d19 = c7524y.m15029d(4);
                            iArr2[i46] = iM15029d19;
                            if (iM15029d19 > i45) {
                                i45 = iM15029d19;
                            }
                        }
                        int i47 = i45 + 1;
                        int[] iArr3 = new int[i47];
                        int i48 = 0;
                        while (i48 < i47) {
                            iArr3[i48] = c7524y.m15029d(i24) + 1;
                            int iM15029d20 = c7524y.m15029d(2);
                            int i49 = 8;
                            if (iM15029d20 > 0) {
                                c7524y.m15030e(8);
                            }
                            int i50 = 0;
                            for (int i51 = 1; i50 < (i51 << iM15029d20); i51 = 1) {
                                c7524y.m15030e(i49);
                                i50++;
                                i49 = 8;
                            }
                            i48++;
                            i24 = 3;
                        }
                        c7524y.m15030e(2);
                        int iM15029d21 = c7524y.m15029d(4);
                        int i52 = 0;
                        int i53 = 0;
                        for (int i54 = 0; i54 < iM15029d18; i54++) {
                            i52 += iArr3[iArr2[i54]];
                            while (i53 < i52) {
                                c7524y.m15030e(iM15029d21);
                                i53++;
                            }
                        }
                    }
                    i23++;
                    i20 = 6;
                    i22 = 1;
                }
            }
            this.f49594n = aVar2;
            if (aVar2 == null) {
                return true;
            }
            ArrayList arrayList = new ArrayList();
            C7525z.c cVar6 = aVar2.f49599a;
            arrayList.add(cVar6.f41547g);
            arrayList.add(aVar2.f49601c);
            Metadata metadataM15031a = C7525z.m15031a(ImmutableList.m9061U(aVar2.f49600b.f41539a));
            C2416m.a aVar4 = new C2416m.a();
            aVar4.f12501k = "audio/vorbis";
            aVar4.f12496f = cVar6.f41544d;
            aVar4.f12497g = cVar6.f41543c;
            aVar4.f12514x = cVar6.f41541a;
            aVar4.f12515y = cVar6.f41542b;
            aVar4.f12503m = arrayList;
            aVar4.f12499i = metadataM15031a;
            aVar.f49592a = new C2416m(aVar4);
            return true;
        }
        C7525z.m15033c(1, c10151t, false);
        c10151t.m19136k();
        int iM19145t2 = c10151t.m19145t();
        int iM19136k = c10151t.m19136k();
        int iM19132g = c10151t.m19132g();
        int i55 = iM19132g <= 0 ? -1 : iM19132g;
        int iM19132g2 = c10151t.m19132g();
        int i56 = iM19132g2 <= 0 ? -1 : iM19132g2;
        c10151t.m19132g();
        int iM19145t3 = c10151t.m19145t();
        int iPow = (int) Math.pow(2.0d, iM19145t3 & 15);
        int iPow2 = (int) Math.pow(2.0d, (iM19145t3 & 240) >> 4);
        c10151t.m19145t();
        this.f49597q = new C7525z.c(iM19145t2, iM19136k, i55, i56, iPow, iPow2, Arrays.copyOf(c10151t.f51438a, c10151t.f51440c));
        aVar2 = null;
        this.f49594n = aVar2;
        if (aVar2 == null) {
            return true;
        }
        ArrayList arrayList2 = new ArrayList();
        C7525z.c cVar7 = aVar2.f49599a;
        arrayList2.add(cVar7.f41547g);
        arrayList2.add(aVar2.f49601c);
        Metadata metadataM15031a2 = C7525z.m15031a(ImmutableList.m9061U(aVar2.f49600b.f41539a));
        C2416m.a aVar5 = new C2416m.a();
        aVar5.f12501k = "audio/vorbis";
        aVar5.f12496f = cVar7.f41544d;
        aVar5.f12497g = cVar7.f41543c;
        aVar5.f12514x = cVar7.f41541a;
        aVar5.f12515y = cVar7.f41542b;
        aVar5.f12503m = arrayList2;
        aVar5.f12499i = metadataM15031a2;
        aVar.f49592a = new C2416m(aVar5);
        return true;
    }

    @Override // p433v9.AbstractC9685h
    /* JADX INFO: renamed from: d */
    public final void mo18190d(boolean z10) {
        super.mo18190d(z10);
        if (z10) {
            this.f49594n = null;
            this.f49597q = null;
            this.f49598r = null;
        }
        this.f49595o = 0;
        this.f49596p = false;
    }
}
