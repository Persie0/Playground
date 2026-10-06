package p000;

import android.graphics.Rect;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class grs extends grv {

    /* JADX INFO: renamed from: a */
    protected final kbc f26176a;

    /* JADX INFO: renamed from: b */
    protected final int f26177b;

    /* JADX INFO: renamed from: i */
    private final kbz f26178i;

    public grs(grm grmVar, Executor executor, grk grkVar, int i, gyh gyhVar, kbc kbcVar, int i2, kbz kbzVar) {
        super(grmVar, executor, grkVar, i, gyhVar);
        this.f26176a = kbcVar;
        this.f26177b = i2;
        this.f26178i = kbzVar;
    }

    /* JADX INFO: renamed from: a */
    protected static int m9679a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        return (i8 * (i5 / i3)) + (i7 * (i6 / i3)) + ((i2 / i4) * i5) + ((i / i4) * i6);
    }

    /* JADX INFO: renamed from: d */
    protected static final int m9680d(int i, int i2) {
        return (Math.min(i2, i) / 2) + 1;
    }

    /* JADX INFO: renamed from: f */
    protected static final void m9681f(grm grmVar) {
        grmVar.f26152a.mo7247c();
        grmVar.f26152a.mo7246b();
    }

    /* JADX INFO: renamed from: g */
    protected static final int[] m9682g(kpw kpwVar, Rect rect, int i, boolean z) {
        int i2;
        int i3;
        int iM9683k;
        int i4;
        int i5;
        int i6;
        int iM9683k2;
        int i7;
        int i8;
        int i9;
        Rect rectI = m9688i(kpwVar, rect);
        List listMo7251g = kpwVar.mo7251g();
        if (listMo7251g.size() != 3) {
            throw new IllegalArgumentException("Incorrect number planes (" + listMo7251g.size() + ") in YUV Image Object");
        }
        int iWidth = rectI.width() / i;
        int iHeight = rectI.height() / i;
        ByteBuffer buffer = ((kpv) listMo7251g.get(0)).getBuffer();
        ByteBuffer buffer2 = ((kpv) listMo7251g.get(1)).getBuffer();
        ByteBuffer buffer3 = ((kpv) listMo7251g.get(2)).getBuffer();
        int rowStride = ((kpv) listMo7251g.get(0)).getRowStride() * i;
        int rowStride2 = ((kpv) listMo7251g.get(1)).getRowStride() * i;
        int rowStride3 = ((kpv) listMo7251g.get(2)).getRowStride() * i;
        int pixelStride = ((kpv) listMo7251g.get(0)).getPixelStride() * i;
        int pixelStride2 = ((kpv) listMo7251g.get(1)).getPixelStride() * i;
        int pixelStride3 = ((kpv) listMo7251g.get(2)).getPixelStride() * i;
        int iM9683k3 = m9683k(rectI.top);
        int iM9683k4 = m9683k(rectI.left);
        if (z) {
            int iM9680d = m9680d(iWidth, iHeight);
            int i10 = iM9680d * iM9680d;
            int i11 = iM9680d + iM9680d;
            if (iWidth > iHeight) {
                int i12 = iWidth / 2;
                int i13 = i12 - iM9680d;
                int iM9683k5 = m9683k(i12 + iM9680d);
                int iM9683k6 = m9683k(i13);
                i7 = iHeight;
                i8 = iM9683k5;
                i9 = iM9683k6;
                iM9683k2 = 0;
            } else {
                int i14 = iHeight / 2;
                int i15 = i14 - iM9680d;
                int iM9683k7 = m9683k(i14 + iM9680d);
                iM9683k2 = m9683k(i15);
                i7 = iM9683k7;
                i8 = iWidth;
                i9 = 0;
            }
            i2 = i10 * 4;
            i4 = iM9683k2;
            i5 = i9;
            i3 = i11;
            iM9683k = i7;
            i6 = i8;
        } else {
            i2 = iWidth * iHeight;
            int iM9683k8 = m9683k(iWidth);
            i3 = iWidth;
            iM9683k = m9683k(iHeight);
            i4 = 0;
            i5 = 0;
            i6 = iM9683k8;
        }
        int[] iArr = new int[i2];
        ((kpv) listMo7251g.get(1)).getRowStride();
        ((kpv) listMo7251g.get(1)).getPixelStride();
        ((kpv) listMo7251g.get(2)).getRowStride();
        ((kpv) listMo7251g.get(2)).getPixelStride();
        int i16 = i4;
        while (i16 < iM9683k) {
            int i17 = (i16 - i4) * i3;
            int i18 = i5;
            int i19 = i16;
            int[] iArr2 = iArr;
            int i20 = iM9683k;
            int i21 = i6;
            int iM9679a = m9679a(i18, i16, i, 1, rowStride, pixelStride, iM9683k4, iM9683k3);
            int i22 = iM9683k4 / 2;
            int i23 = iM9683k3 / 2;
            int iM9679a2 = m9679a(i18, i19, i, 2, rowStride2, pixelStride2, i22, i23);
            int iM9679a3 = m9679a(i18, i19, i, 2, rowStride3, pixelStride3, i22, i23);
            int i24 = i5;
            int i25 = iM9679a;
            int i26 = iM9679a2;
            while (i24 < i21) {
                int i27 = 255;
                int i28 = buffer2.get(i26) & 255;
                int i29 = buffer3.get(iM9679a3) & 255;
                int i30 = buffer.get(i25) & 255;
                int i31 = i28 - 128;
                int i32 = i29 - 128;
                int i33 = ((i31 * (-88)) + (i32 * (-182))) >> 8;
                int i34 = i30 + i33;
                int i35 = i21;
                int i36 = i34 < 0 ? 0 : i34;
                int i37 = (i32 * 358) >> 8;
                int i38 = i30 + i37;
                int i39 = i38 < 0 ? 0 : i38;
                int i40 = (i31 * 453) >> 8;
                int i41 = i30 + i40;
                if (i41 < 0) {
                    i41 = 0;
                }
                if (i36 > 255) {
                    i36 = 255;
                }
                ByteBuffer byteBuffer = buffer2;
                int i42 = i39;
                int i43 = i42 > 255 ? 255 : i42;
                if (i41 > 255) {
                    i41 = 255;
                }
                iArr2[i17] = i41 | (i36 << 8) | (i43 << 16) | (-16777216);
                int i44 = buffer.get(i25 + pixelStride) & 255;
                int i45 = i44 + i33;
                if (i45 < 0) {
                    i45 = 0;
                }
                int i46 = i44 + i37;
                int i47 = i46 < 0 ? 0 : i46;
                int i48 = i44 + i40;
                if (i48 < 0) {
                    i48 = 0;
                }
                if (i45 > 255) {
                    i45 = 255;
                }
                if (i47 > 255) {
                    i47 = 255;
                }
                if (i48 > 255) {
                    i48 = 255;
                }
                iArr2[i17 + 1] = i48 | (i47 << 16) | (i45 << 8) | (-16777216);
                int i49 = i25 + rowStride;
                int i50 = buffer.get(i49) & 255;
                int i51 = i50 + i33;
                if (i51 < 0) {
                    i51 = 0;
                }
                int i52 = i50 + i37;
                int i53 = i52 < 0 ? 0 : i52;
                int i54 = i50 + i40;
                if (i54 < 0) {
                    i54 = 0;
                }
                if (i51 > 255) {
                    i51 = 255;
                }
                ByteBuffer byteBuffer2 = buffer3;
                int i55 = i53;
                int i56 = i55 > 255 ? 255 : i55;
                if (i54 > 255) {
                    i54 = 255;
                }
                int i57 = i17 + i3;
                iArr2[i57] = i54 | (i56 << 16) | (i51 << 8) | (-16777216);
                int i58 = buffer.get(i49 + pixelStride) & 255;
                int i59 = i33 + i58;
                if (i59 < 0) {
                    i59 = 0;
                }
                int i60 = i37 + i58;
                if (i60 < 0) {
                    i60 = 0;
                }
                int i61 = i58 + i40;
                if (i61 < 0) {
                    i61 = 0;
                }
                if (i59 > 255) {
                    i59 = 255;
                }
                if (i60 > 255) {
                    i60 = 255;
                }
                if (i61 <= 255) {
                    i27 = i61;
                }
                iArr2[i57 + 1] = (i60 << 16) | (i59 << 8) | i27 | (-16777216);
                i25 += pixelStride + pixelStride;
                i17 += 2;
                i26 += pixelStride2;
                iM9679a3 += pixelStride3;
                i24 += 2;
                buffer2 = byteBuffer;
                i21 = i35;
                buffer3 = byteBuffer2;
            }
            i16 = i19 + 2;
            iArr = iArr2;
            iM9683k = i20;
            i6 = i21;
        }
        return iArr;
    }

    /* JADX INFO: renamed from: k */
    private static int m9683k(int i) {
        int i2 = i / 2;
        return i2 + i2;
    }

    /* JADX INFO: renamed from: b */
    protected final grt m9684b(grm grmVar, int i) {
        int iWidth;
        int iHeight;
        Rect rectI = m9688i(grmVar.f26152a, grmVar.f26156e);
        if (this.f26177b == 5) {
            iWidth = rectI.width() / i;
            iHeight = rectI.height() / i;
        } else {
            int iM9680d = m9680d(rectI.width() / i, rectI.height() / i);
            iWidth = iM9680d + iM9680d;
            iHeight = iWidth;
        }
        return new grt(grmVar.f26153b, iWidth, iHeight);
    }

    /* JADX INFO: renamed from: c */
    protected final int[] m9685c(kpw kpwVar, Rect rect, int i) {
        int iM9683k;
        int iM9683k2;
        int iM9683k3;
        int iM9683k4;
        int i2;
        int i3;
        int i4;
        ByteBuffer byteBuffer;
        int i5 = 0;
        switch (this.f26177b - 1) {
            case 2:
                Rect rectI = m9688i(kpwVar, rect);
                List listMo7251g = kpwVar.mo7251g();
                if (listMo7251g.size() != 3) {
                    throw new IllegalArgumentException("Incorrect number planes (" + listMo7251g.size() + ") in YUV Image Object");
                }
                int iWidth = rectI.width() / i;
                int iHeight = rectI.height() / i;
                int iM9680d = m9680d(iWidth, iHeight);
                int iM9683k5 = m9683k(rectI.top);
                int iM9683k6 = m9683k(rectI.left);
                if (iWidth > iHeight) {
                    int i6 = iWidth / 2;
                    iM9683k2 = m9683k(i6 + iM9680d);
                    iM9683k = iHeight;
                    iM9683k4 = m9683k(i6 - iM9680d);
                    iM9683k3 = 0;
                } else {
                    int i7 = iHeight / 2;
                    iM9683k = m9683k(i7 + iM9680d);
                    iM9683k2 = iWidth;
                    iM9683k3 = m9683k(i7 - iM9680d);
                    iM9683k4 = 0;
                }
                ByteBuffer buffer = ((kpv) listMo7251g.get(0)).getBuffer();
                ByteBuffer buffer2 = ((kpv) listMo7251g.get(1)).getBuffer();
                ByteBuffer buffer3 = ((kpv) listMo7251g.get(2)).getBuffer();
                int rowStride = ((kpv) listMo7251g.get(0)).getRowStride() * i;
                int rowStride2 = ((kpv) listMo7251g.get(1)).getRowStride() * i;
                int rowStride3 = ((kpv) listMo7251g.get(2)).getRowStride() * i;
                int pixelStride = ((kpv) listMo7251g.get(0)).getPixelStride() * i;
                int pixelStride2 = ((kpv) listMo7251g.get(1)).getPixelStride() * i;
                int pixelStride3 = ((kpv) listMo7251g.get(2)).getPixelStride() * i;
                int i8 = iM9680d + iM9680d;
                int i9 = iHeight / 2;
                int i10 = iWidth / 2;
                int i11 = iM9680d * iM9680d;
                int[] iArr = new int[i11 * 4];
                ((kpv) listMo7251g.get(1)).getRowStride();
                ((kpv) listMo7251g.get(1)).getPixelStride();
                ((kpv) listMo7251g.get(2)).getRowStride();
                ((kpv) listMo7251g.get(2)).getPixelStride();
                int i12 = iM9683k3;
                while (i12 < iM9683k) {
                    int i13 = (i12 - iM9683k3) * i8;
                    int i14 = iM9683k4;
                    ByteBuffer byteBuffer2 = buffer3;
                    int i15 = i12;
                    int[] iArr2 = iArr;
                    ByteBuffer byteBuffer3 = buffer2;
                    ByteBuffer byteBuffer4 = buffer;
                    int iM9679a = m9679a(i14, i12, i, 1, rowStride, pixelStride, iM9683k6, iM9683k5);
                    int i16 = iM9683k6 / 2;
                    int i17 = iM9683k5 / 2;
                    int iM9679a2 = m9679a(i14, i15, i, 2, rowStride2, pixelStride2, i16, i17);
                    int iM9679a3 = m9679a(i14, i15, i, 2, rowStride3, pixelStride3, i16, i17);
                    int i18 = i15 - i9;
                    int iSqrt = (int) (Math.sqrt(i11 - (i18 * i18)) + 0.5d);
                    int i19 = i10 - iSqrt;
                    int i20 = i10 + iSqrt;
                    int i21 = (i15 + 1) - i9;
                    int iSqrt2 = (int) (Math.sqrt(i11 - (i21 * i21)) + 0.5d);
                    int i22 = i10 - iSqrt2;
                    int i23 = i10 + iSqrt2;
                    int i24 = iM9683k4;
                    int i25 = iM9679a;
                    int i26 = iM9679a2;
                    while (i24 < iM9683k2) {
                        if ((i24 <= i20 || i24 <= i23) && ((i2 = i24 + 1) >= i19 || i24 >= i22)) {
                            i3 = iM9683k5;
                            i4 = iM9683k6;
                            ByteBuffer byteBuffer5 = byteBuffer2;
                            int i27 = (byteBuffer3.get(i26) & 255) - 128;
                            int i28 = (byteBuffer5.get(iM9679a3) & 255) - 128;
                            int i29 = (i27 * 453) >> 8;
                            byteBuffer = byteBuffer5;
                            int i30 = ((i27 * (-88)) + (i28 * (-182))) >> 8;
                            int i31 = (i28 * 358) >> 8;
                            int i32 = Integer.MIN_VALUE;
                            if (i24 > i20 || i24 < i19) {
                                iArr2[i13] = 0;
                            } else {
                                int i33 = (i24 == i20 || i24 == i19) ? Integer.MIN_VALUE : -16777216;
                                byteBuffer4 = byteBuffer4;
                                iM9683k = iM9683k;
                                iM9683k2 = iM9683k2;
                                int i34 = byteBuffer4.get(i25) & 255;
                                int i35 = i34 + i30;
                                int i36 = i34 + i29;
                                int i37 = i34 + i31;
                                if (i35 < 0) {
                                    i35 = 0;
                                }
                                if (i37 < 0) {
                                    i37 = 0;
                                }
                                int i38 = i36 < 0 ? 0 : i36;
                                iM9679a3 = iM9679a3;
                                if (i35 > 255) {
                                    i35 = 255;
                                }
                                if (i37 > 255) {
                                    i37 = 255;
                                }
                                if (i38 > 255) {
                                    i38 = 255;
                                }
                                iArr2[i13] = (i37 << 16) | (i35 << 8) | i38 | i33;
                            }
                            if (i2 > i20 || i2 < i19) {
                                iArr2[i13 + 1] = 0;
                            } else {
                                int i39 = (i2 == i20 || i2 == i19) ? Integer.MIN_VALUE : -16777216;
                                int i40 = byteBuffer4.get(i25 + pixelStride) & 255;
                                int i41 = i40 + i30;
                                int i42 = i40 + i29;
                                int i43 = i40 + i31;
                                if (i41 < 0) {
                                    i41 = 0;
                                }
                                if (i43 < 0) {
                                    i43 = 0;
                                }
                                if (i42 < 0) {
                                    i42 = 0;
                                }
                                i20 = i20;
                                if (i41 > 255) {
                                    i41 = 255;
                                }
                                if (i43 > 255) {
                                    i43 = 255;
                                }
                                if (i42 > 255) {
                                    i42 = 255;
                                }
                                iArr2[i13 + 1] = i39 | (i43 << 16) | (i41 << 8) | i42;
                            }
                            if (i24 > i23 || i24 < i22) {
                                iArr2[i13 + i8] = 0;
                            } else {
                                int i44 = (i24 == i23 || i24 == i22) ? Integer.MIN_VALUE : -16777216;
                                int i45 = byteBuffer4.get(i25 + rowStride) & 255;
                                int i46 = i45 + i30;
                                int i47 = i45 + i29;
                                int i48 = i45 + i31;
                                if (i46 < 0) {
                                    i46 = 0;
                                }
                                if (i48 < 0) {
                                    i48 = 0;
                                }
                                if (i47 < 0) {
                                    i47 = 0;
                                }
                                if (i46 > 255) {
                                    i46 = 255;
                                }
                                if (i48 > 255) {
                                    i48 = 255;
                                }
                                if (i47 > 255) {
                                    i47 = 255;
                                }
                                iArr2[i13 + i8] = i44 | (i48 << 16) | (i46 << 8) | i47;
                            }
                            if (i2 > i23 || i2 < i22) {
                                iArr2[i13 + i8 + 1] = 0;
                            } else {
                                if (i2 != i23 && i2 != i22) {
                                    i32 = -16777216;
                                }
                                int i49 = byteBuffer4.get(i25 + rowStride + pixelStride) & 255;
                                int i50 = i49 + i30;
                                int i51 = i49 + i29;
                                int i52 = i49 + i31;
                                if (i50 < 0) {
                                    i50 = 0;
                                }
                                if (i52 < 0) {
                                    i52 = 0;
                                }
                                if (i51 < 0) {
                                    i51 = 0;
                                }
                                if (i50 > 255) {
                                    i50 = 255;
                                }
                                if (i52 > 255) {
                                    i52 = 255;
                                }
                                iArr2[i13 + i8 + 1] = (i52 << 16) | (i50 << 8) | (i51 > 255 ? 255 : i51) | i32;
                            }
                        } else {
                            iArr2[i13] = i5;
                            iArr2[i13 + 1] = i5;
                            int i53 = i13 + i8;
                            iArr2[i53] = i5;
                            iArr2[i53 + 1] = i5;
                            iM9679a3 = iM9679a3;
                            i20 = i20;
                            i3 = iM9683k5;
                            i4 = iM9683k6;
                            iM9683k2 = iM9683k2;
                            byteBuffer = byteBuffer2;
                            byteBuffer4 = byteBuffer4;
                            iM9683k = iM9683k;
                        }
                        i25 += pixelStride + pixelStride;
                        i13 += 2;
                        i26 += pixelStride2;
                        iM9679a3 += pixelStride3;
                        i24 += 2;
                        iM9683k5 = i3;
                        iM9683k = iM9683k;
                        byteBuffer2 = byteBuffer;
                        i20 = i20;
                        iM9683k2 = iM9683k2;
                        i5 = 0;
                        byteBuffer4 = byteBuffer4;
                        iM9683k6 = i4;
                    }
                    i12 = i15 + 2;
                    buffer = byteBuffer4;
                    iArr = iArr2;
                    buffer2 = byteBuffer3;
                    buffer3 = byteBuffer2;
                    i5 = 0;
                    iM9683k6 = iM9683k6;
                }
                return iArr;
            case 3:
                return m9682g(kpwVar, rect, i, true);
            default:
                return m9682g(kpwVar, rect, i, false);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m9686e(grt grtVar, int[] iArr, int i) {
        ((grc) this.f26185c).f26118k.mo8959d(new gru(this.f26187e, grtVar, i), new bkn(iArr, (byte[]) null));
    }

    @Override // java.lang.Runnable
    public void run() {
        int iM9724a;
        this.f26178i.mo13961e("CAM_TaskRGBPreview");
        grm grmVar = this.f26188f;
        Rect rectI = m9688i(grmVar.f26152a, grmVar.f26156e);
        m9681f(grmVar);
        kbc kbcVar = new kbc(rectI.width(), rectI.height());
        int i = this.f26177b;
        if (i == 3 || i == 4) {
            kbc kbcVar2 = this.f26176a;
            int iMin = Math.min(kbcVar.f35517a / kbcVar2.f35517a, kbcVar.f35518b / kbcVar2.f35518b);
            if (iMin > 0) {
                int iMin2 = Math.min(kbcVar.f35517a, kbcVar.f35518b);
                while (true) {
                    if (iMin < 2) {
                        iM9724a = 2;
                        break;
                    } else {
                        if (gsz.m9725b(iMin2, iMin)) {
                            iM9724a = iMin;
                            break;
                        }
                        iMin--;
                    }
                }
            } else {
                iM9724a = 1;
            }
        } else {
            iM9724a = gsz.m9724a(kbcVar, this.f26176a);
        }
        grt grtVarM9684b = m9684b(grmVar, iM9724a);
        try {
            m9689j(this.f26187e, grtVarM9684b, 1);
            grmVar.f26152a.mo7247c();
            grmVar.f26152a.mo7246b();
            int[] iArrM9685c = m9685c(grmVar.f26152a, rectI, iM9724a);
            this.f26185c.mo9662b(grmVar.f26152a, this.f26186d);
            m9686e(grtVarM9684b, iArrM9685c, 1);
            this.f26178i.mo13962f();
        } catch (Throwable th) {
            this.f26185c.mo9662b(grmVar.f26152a, this.f26186d);
            throw th;
        }
    }
}
