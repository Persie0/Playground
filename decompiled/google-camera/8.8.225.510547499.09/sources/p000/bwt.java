package p000;

import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bwt implements bqh {

    /* JADX INFO: renamed from: a */
    static final byte[] f4666a = "Exif\u0000\u0000".getBytes(Charset.forName("UTF-8"));

    /* JADX INFO: renamed from: b */
    private static final int[] f4667b = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    /* JADX INFO: renamed from: e */
    private static final int m3137e(bwr bwrVar, btg btgVar) {
        int iMo3133a;
        short sM3264d;
        ByteOrder byteOrder;
        short sM3264d2;
        int iM3263c;
        int i;
        int i2;
        try {
            int iMo3133a2 = bwrVar.mo3133a();
            if ((iMo3133a2 & 65496) != 65496 && iMo3133a2 != 19789 && iMo3133a2 != 18761) {
                return -1;
            }
            while (true) {
                if (bwrVar.mo3136d() != 255) {
                    iMo3133a = -1;
                    break;
                }
                short sMo3136d = bwrVar.mo3136d();
                if (sMo3136d != 218 && sMo3136d != 217) {
                    iMo3133a = bwrVar.mo3133a() - 2;
                    if (sMo3136d == 225) {
                        break;
                    }
                    long j = iMo3133a;
                    if (bwrVar.mo3135c(j) != j) {
                        iMo3133a = -1;
                        break;
                    }
                } else {
                    iMo3133a = -1;
                    break;
                }
            }
            if (iMo3133a == -1) {
                return -1;
            }
            byte[] bArr = (byte[]) btgVar.mo3034a(iMo3133a, byte[].class);
            try {
                if (bwrVar.mo3134b(bArr, iMo3133a) == iMo3133a && iMo3133a > f4666a.length) {
                    int i3 = 0;
                    while (true) {
                        byte[] bArr2 = f4666a;
                        if (i3 >= bArr2.length) {
                            ByteBuffer byteBuffer = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(iMo3133a);
                            switch (bzq.m3264d(6, byteBuffer)) {
                                case 18761:
                                    byteOrder = ByteOrder.LITTLE_ENDIAN;
                                    break;
                                case 19789:
                                    byteOrder = ByteOrder.BIG_ENDIAN;
                                    break;
                                default:
                                    byteOrder = ByteOrder.BIG_ENDIAN;
                                    break;
                            }
                            byteBuffer.order(byteOrder);
                            int iM3263c2 = bzq.m3263c(10, byteBuffer) + 6;
                            short sM3264d3 = bzq.m3264d(iM3263c2, byteBuffer);
                            for (int i4 = 0; i4 < sM3264d3; i4++) {
                                int i5 = iM3263c2 + 2 + (i4 * 12);
                                if (bzq.m3264d(i5, byteBuffer) == 274 && (sM3264d2 = bzq.m3264d(i5 + 2, byteBuffer)) > 0 && sM3264d2 <= 12 && (iM3263c = bzq.m3263c(i5 + 4, byteBuffer)) >= 0 && (i = iM3263c + f4667b[sM3264d2]) <= 4 && (i2 = i5 + 8) >= 0 && i2 <= byteBuffer.remaining() && i >= 0 && i + i2 <= byteBuffer.remaining()) {
                                    sM3264d = bzq.m3264d(i2, byteBuffer);
                                }
                            }
                            sM3264d = -1;
                        } else {
                            if (bArr[i3] != bArr2[i3]) {
                                sM3264d = -1;
                                break;
                            }
                            i3++;
                        }
                    }
                } else {
                    sM3264d = -1;
                }
                return sM3264d;
            } finally {
                btgVar.mo3036c(bArr);
            }
        } catch (bwq e) {
            return -1;
        }
    }

    /* JADX INFO: renamed from: f */
    private static final ImageHeaderParser$ImageType m3138f(bwr bwrVar) {
        try {
            int iMo3133a = bwrVar.mo3133a();
            if (iMo3133a == 65496) {
                return ImageHeaderParser$ImageType.JPEG;
            }
            int iMo3136d = (iMo3133a << 8) | bwrVar.mo3136d();
            if (iMo3136d == 4671814) {
                return ImageHeaderParser$ImageType.GIF;
            }
            int iMo3136d2 = (iMo3136d << 8) | bwrVar.mo3136d();
            if (iMo3136d2 == -1991225785) {
                bwrVar.mo3135c(21L);
                try {
                    return bwrVar.mo3136d() >= 3 ? ImageHeaderParser$ImageType.PNG_A : ImageHeaderParser$ImageType.PNG;
                } catch (bwq e) {
                    return ImageHeaderParser$ImageType.PNG;
                }
            }
            if (iMo3136d2 == 1380533830) {
                bwrVar.mo3135c(4L);
                if (((bwrVar.mo3133a() << 16) | bwrVar.mo3133a()) != 1464156752) {
                    return ImageHeaderParser$ImageType.UNKNOWN;
                }
                int iMo3133a2 = (bwrVar.mo3133a() << 16) | bwrVar.mo3133a();
                if ((iMo3133a2 & (-256)) != 1448097792) {
                    return ImageHeaderParser$ImageType.UNKNOWN;
                }
                int i = iMo3133a2 & 255;
                if (i != 88) {
                    if (i != 76) {
                        return ImageHeaderParser$ImageType.WEBP;
                    }
                    bwrVar.mo3135c(4L);
                    return (bwrVar.mo3136d() & 8) != 0 ? ImageHeaderParser$ImageType.WEBP_A : ImageHeaderParser$ImageType.WEBP;
                }
                bwrVar.mo3135c(4L);
                short sMo3136d = bwrVar.mo3136d();
                if ((sMo3136d & 2) != 0) {
                    return ImageHeaderParser$ImageType.ANIMATED_WEBP;
                }
                return (sMo3136d & 16) != 0 ? ImageHeaderParser$ImageType.WEBP_A : ImageHeaderParser$ImageType.WEBP;
            }
            if (((bwrVar.mo3133a() << 16) | bwrVar.mo3133a()) == 1718909296) {
                int iMo3133a3 = (bwrVar.mo3133a() << 16) | bwrVar.mo3133a();
                if (iMo3133a3 != 1635150182 && iMo3133a3 != 1635150195) {
                    bwrVar.mo3135c(4L);
                    int i2 = iMo3136d2 - 16;
                    if (i2 % 4 == 0) {
                        for (int i3 = 0; i3 < 5 && i2 > 0; i3++) {
                            int iMo3133a4 = (bwrVar.mo3133a() << 16) | bwrVar.mo3133a();
                            if (iMo3133a4 != 1635150182 && iMo3133a4 != 1635150195) {
                                i2 -= 4;
                            }
                        }
                    }
                }
                return ImageHeaderParser$ImageType.AVIF;
            }
            return ImageHeaderParser$ImageType.UNKNOWN;
        } catch (bwq e2) {
            return ImageHeaderParser$ImageType.UNKNOWN;
        }
    }

    @Override // p000.bqh
    /* JADX INFO: renamed from: a */
    public final int mo2916a(InputStream inputStream, btg btgVar) {
        bzq.m3278r(inputStream);
        bws bwsVar = new bws(inputStream, 0);
        bzq.m3278r(btgVar);
        return m3137e(bwsVar, btgVar);
    }

    @Override // p000.bqh
    /* JADX INFO: renamed from: b */
    public final int mo2917b(ByteBuffer byteBuffer, btg btgVar) {
        bzq.m3278r(byteBuffer);
        bws bwsVar = new bws(byteBuffer, 1);
        bzq.m3278r(btgVar);
        return m3137e(bwsVar, btgVar);
    }

    @Override // p000.bqh
    /* JADX INFO: renamed from: c */
    public final ImageHeaderParser$ImageType mo2918c(InputStream inputStream) {
        bzq.m3278r(inputStream);
        return m3138f(new bws(inputStream, 0));
    }

    @Override // p000.bqh
    /* JADX INFO: renamed from: d */
    public final ImageHeaderParser$ImageType mo2919d(ByteBuffer byteBuffer) {
        bzq.m3278r(byteBuffer);
        return m3138f(new bws(byteBuffer, 1));
    }
}
