package com.bumptech.glide.load.resource.bitmap;

import ae.C0062b;
import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.os.Build;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.util.Log;
import androidx.datastore.preferences.PreferencesProto$Value;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.PreferredColorSpace;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import p003a2.C0009a;
import p007a6.C0028g;
import p007a6.C0039r;
import p007a6.C0043v;
import p258m6.C7488h;
import p258m6.C7492l;
import p356r5.C8734d;
import p356r5.C8735e;
import p407u5.InterfaceC9451b;
import p407u5.InterfaceC9452c;

/* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.a */
/* JADX INFO: loaded from: classes.dex */
public final class C2140a {

    /* JADX INFO: renamed from: f */
    public static final C8734d<DecodeFormat> f10824f = C8734d.m16962a(DecodeFormat.DEFAULT, "com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat");

    /* JADX INFO: renamed from: g */
    public static final C8734d<PreferredColorSpace> f10825g = new C8734d<>("com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace", null, C8734d.f46326e);

    /* JADX INFO: renamed from: h */
    public static final C8734d<Boolean> f10826h;

    /* JADX INFO: renamed from: i */
    public static final C8734d<Boolean> f10827i;

    /* JADX INFO: renamed from: j */
    public static final Set<String> f10828j;

    /* JADX INFO: renamed from: k */
    public static final a f10829k;

    /* JADX INFO: renamed from: l */
    public static final Set<ImageHeaderParser.ImageType> f10830l;

    /* JADX INFO: renamed from: m */
    public static final ArrayDeque f10831m;

    /* JADX INFO: renamed from: a */
    public final InterfaceC9452c f10832a;

    /* JADX INFO: renamed from: b */
    public final DisplayMetrics f10833b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC9451b f10834c;

    /* JADX INFO: renamed from: d */
    public final List<ImageHeaderParser> f10835d;

    /* JADX INFO: renamed from: e */
    public final C0039r f10836e;

    /* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.a$a */
    public class a implements b {
        @Override // com.bumptech.glide.load.resource.bitmap.C2140a.b
        /* JADX INFO: renamed from: a */
        public final void mo6355a(Bitmap bitmap, InterfaceC9452c interfaceC9452c) {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.C2140a.b
        /* JADX INFO: renamed from: b */
        public final void mo6356b() {
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.a$b */
    public interface b {
        /* JADX INFO: renamed from: a */
        void mo6355a(Bitmap bitmap, InterfaceC9452c interfaceC9452c) throws IOException;

        /* JADX INFO: renamed from: b */
        void mo6356b();
    }

    static {
        DownsampleStrategy.C2131e c2131e = DownsampleStrategy.f10802a;
        Boolean bool = Boolean.FALSE;
        f10826h = C8734d.m16962a(bool, "com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize");
        f10827i = C8734d.m16962a(bool, "com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode");
        f10828j = Collections.unmodifiableSet(new HashSet(Arrays.asList("image/vnd.wap.wbmp", "image/x-ico")));
        f10829k = new a();
        f10830l = Collections.unmodifiableSet(EnumSet.of(ImageHeaderParser.ImageType.JPEG, ImageHeaderParser.ImageType.PNG_A, ImageHeaderParser.ImageType.PNG));
        char[] cArr = C7492l.f41383a;
        f10831m = new ArrayDeque(0);
    }

    public C2140a(List<ImageHeaderParser> list, DisplayMetrics displayMetrics, InterfaceC9452c interfaceC9452c, InterfaceC9451b interfaceC9451b) {
        if (C0039r.f38j == null) {
            synchronized (C0039r.class) {
                if (C0039r.f38j == null) {
                    C0039r.f38j = new C0039r();
                }
            }
        }
        this.f10836e = C0039r.f38j;
        this.f10835d = list;
        C0062b.m345f0(displayMetrics);
        this.f10833b = displayMetrics;
        C0062b.m345f0(interfaceC9452c);
        this.f10832a = interfaceC9452c;
        C0062b.m345f0(interfaceC9451b);
        this.f10834c = interfaceC9451b;
    }

    /* JADX INFO: renamed from: c */
    public static Bitmap m6349c(InterfaceC2141b interfaceC2141b, BitmapFactory.Options options, b bVar, InterfaceC9452c interfaceC9452c) throws IOException {
        if (!options.inJustDecodeBounds) {
            bVar.mo6356b();
            interfaceC2141b.mo6359c();
        }
        int i10 = options.outWidth;
        int i11 = options.outHeight;
        String str = options.outMimeType;
        Lock lock = C0043v.f54d;
        lock.lock();
        try {
            try {
                Bitmap bitmapMo6358b = interfaceC2141b.mo6358b(options);
                lock.unlock();
                return bitmapMo6358b;
            } catch (IllegalArgumentException e10) {
                IOException iOExceptionM6351e = m6351e(e10, i10, i11, str, options);
                if (Log.isLoggable("Downsampler", 3)) {
                    Log.d("Downsampler", "Failed to decode with inBitmap, trying again without Bitmap re-use", iOExceptionM6351e);
                }
                Bitmap bitmap = options.inBitmap;
                if (bitmap == null) {
                    throw iOExceptionM6351e;
                }
                try {
                    interfaceC9452c.mo164d(bitmap);
                    options.inBitmap = null;
                    Bitmap bitmapM6349c = m6349c(interfaceC2141b, options, bVar, interfaceC9452c);
                    C0043v.f54d.unlock();
                    return bitmapM6349c;
                } catch (IOException unused) {
                    throw iOExceptionM6351e;
                }
            }
        } catch (Throwable th2) {
            C0043v.f54d.unlock();
            throw th2;
        }
    }

    @TargetApi(19)
    /* JADX INFO: renamed from: d */
    public static String m6350d(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig() + (" (" + bitmap.getAllocationByteCount() + ")");
    }

    /* JADX INFO: renamed from: e */
    public static IOException m6351e(IllegalArgumentException illegalArgumentException, int i10, int i11, String str, BitmapFactory.Options options) {
        StringBuilder sbM25n = C0009a.m25n("Exception decoding bitmap, outWidth: ", i10, ", outHeight: ", i11, ", outMimeType: ");
        sbM25n.append(str);
        sbM25n.append(", inBitmap: ");
        sbM25n.append(m6350d(options.inBitmap));
        return new IOException(sbM25n.toString(), illegalArgumentException);
    }

    /* JADX INFO: renamed from: f */
    public static void m6352f(BitmapFactory.Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.inDensity = 0;
        options.inTargetDensity = 0;
        options.inPreferredColorSpace = null;
        options.outColorSpace = null;
        options.outConfig = null;
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = true;
    }

    /* JADX INFO: renamed from: a */
    public final C0028g m6353a(InterfaceC2141b interfaceC2141b, int i10, int i11, C8735e c8735e, b bVar) throws IOException {
        ArrayDeque arrayDeque;
        BitmapFactory.Options options;
        BitmapFactory.Options options2;
        byte[] bArr = (byte[]) this.f10834c.mo17852d(65536, byte[].class);
        synchronized (C2140a.class) {
            arrayDeque = f10831m;
            synchronized (arrayDeque) {
                options = (BitmapFactory.Options) arrayDeque.poll();
            }
            if (options == null) {
                options = new BitmapFactory.Options();
                m6352f(options);
            }
            options2 = options;
        }
        options2.inTempStorage = bArr;
        DecodeFormat decodeFormat = (DecodeFormat) c8735e.m16963c(f10824f);
        PreferredColorSpace preferredColorSpace = (PreferredColorSpace) c8735e.m16963c(f10825g);
        DownsampleStrategy downsampleStrategy = (DownsampleStrategy) c8735e.m16963c(DownsampleStrategy.f10807f);
        boolean zBooleanValue = ((Boolean) c8735e.m16963c(f10826h)).booleanValue();
        C8734d<Boolean> c8734d = f10827i;
        try {
            C0028g c0028gM155e = C0028g.m155e(m6354b(interfaceC2141b, options2, downsampleStrategy, decodeFormat, preferredColorSpace, c8735e.m16963c(c8734d) != null && ((Boolean) c8735e.m16963c(c8734d)).booleanValue(), i10, i11, zBooleanValue, bVar), this.f10832a);
            m6352f(options2);
            synchronized (arrayDeque) {
                arrayDeque.offer(options2);
            }
            return c0028gM155e;
        } finally {
            m6352f(options2);
            ArrayDeque arrayDeque2 = f10831m;
            synchronized (arrayDeque2) {
                arrayDeque2.offer(options2);
                this.f10834c.mo17851c(bArr);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:125:0x02f0  */
    /* JADX WARN: Code duplicated, block: B:126:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:128:0x02fb  */
    /* JADX WARN: Code duplicated, block: B:129:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:139:0x0329  */
    /* JADX WARN: Code duplicated, block: B:140:0x032c  */
    /* JADX WARN: Code duplicated, block: B:143:0x0334  */
    /* JADX WARN: Code duplicated, block: B:145:0x033b  */
    /* JADX WARN: Code duplicated, block: B:148:0x0347 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:151:0x034d  */
    /* JADX WARN: Code duplicated, block: B:153:0x0351  */
    /* JADX WARN: Code duplicated, block: B:158:0x035a  */
    /* JADX WARN: Code duplicated, block: B:159:0x0360  */
    /* JADX WARN: Code duplicated, block: B:162:0x0387  */
    /* JADX WARN: Code duplicated, block: B:164:0x03c3 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:171:0x03d1  */
    /* JADX WARN: Code duplicated, block: B:175:0x03dd  */
    /* JADX WARN: Code duplicated, block: B:177:0x03e1  */
    /* JADX WARN: Code duplicated, block: B:179:0x03e5  */
    /* JADX WARN: Code duplicated, block: B:184:0x03f2  */
    /* JADX WARN: Code duplicated, block: B:186:0x03f6  */
    /* JADX WARN: Code duplicated, block: B:187:0x03f9  */
    /* JADX WARN: Code duplicated, block: B:189:0x0402  */
    /* JADX WARN: Code duplicated, block: B:192:0x041e  */
    /* JADX WARN: Code duplicated, block: B:194:0x04a3  */
    /* JADX WARN: Code duplicated, block: B:196:0x04ad  */
    /* JADX WARN: Code duplicated, block: B:197:0x04b0  */
    /* JADX WARN: Code duplicated, block: B:199:0x04b3  */
    /* JADX WARN: Code duplicated, block: B:200:0x04b6  */
    /* JADX WARN: Code duplicated, block: B:203:0x04c7  */
    /* JADX WARN: Code duplicated, block: B:204:0x04cb  */
    /* JADX WARN: Code duplicated, block: B:205:0x04d4  */
    /* JADX WARN: Code duplicated, block: B:206:0x04d8  */
    /* JADX WARN: Code duplicated, block: B:207:0x04e1  */
    /* JADX WARN: Code duplicated, block: B:208:0x04ea  */
    /* JADX WARN: Code duplicated, block: B:209:0x04ee  */
    /* JADX WARN: Code duplicated, block: B:212:0x051d  */
    /* JADX WARN: Code duplicated, block: B:213:0x0522  */
    /* JADX WARN: Code duplicated, block: B:217:0x0541  */
    /* JADX WARN: Code duplicated, block: B:218:0x0545 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:220:0x0304 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:222:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:192:0x041e, please report this as an issue */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: b */
    public final Bitmap m6354b(InterfaceC2141b interfaceC2141b, BitmapFactory.Options options, DownsampleStrategy downsampleStrategy, DecodeFormat decodeFormat, PreferredColorSpace preferredColorSpace, boolean z10, int i10, int i11, boolean z11, b bVar) throws IOException {
        int i12;
        boolean z12;
        int i13;
        String str;
        int i14;
        boolean zM169a;
        boolean z13;
        String str2;
        boolean zHasAlpha;
        Bitmap.Config config;
        boolean z14;
        int i15;
        int i16;
        int i17;
        float f3;
        int iRound;
        int i18;
        String str3;
        String str4;
        Bitmap bitmapM6349c;
        boolean z15;
        Matrix matrix;
        Bitmap.Config config2;
        Bitmap bitmap;
        boolean z16;
        ColorSpace.Named named;
        ColorSpace colorSpace;
        Bitmap.Config config3;
        Bitmap.Config config4;
        int i19;
        int i20;
        int iFloor;
        int iFloor2;
        int i21;
        int i22;
        int iRound2 = i10;
        int i23 = C7488h.f41373b;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        options.inJustDecodeBounds = true;
        InterfaceC9452c interfaceC9452c = this.f10832a;
        m6349c(interfaceC2141b, options, bVar, interfaceC9452c);
        options.inJustDecodeBounds = false;
        int i24 = options.outWidth;
        int i25 = options.outHeight;
        String str5 = options.outMimeType;
        boolean z17 = (i24 == -1 || i25 == -1) ? false : z10;
        int iMo6357a = interfaceC2141b.mo6357a();
        switch (iMo6357a) {
            case 3:
            case 4:
                i12 = 180;
                break;
            case 5:
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                i12 = 90;
                break;
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
            case 8:
                i12 = 270;
                break;
            default:
                i12 = 0;
                break;
        }
        int i26 = i12;
        switch (iMo6357a) {
            case 2:
            case 3:
            case 4:
            case 5:
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
            case 8:
                z12 = true;
                break;
            default:
                z12 = false;
                break;
        }
        int i27 = Integer.MIN_VALUE;
        if (iRound2 == Integer.MIN_VALUE) {
            iRound2 = i26 == 90 || i26 == 270 ? i25 : i24;
            i27 = Integer.MIN_VALUE;
        }
        if (i11 == i27) {
            i13 = i26 == 90 || i26 == 270 ? i24 : i25;
        } else {
            i13 = i11;
        }
        ImageHeaderParser.ImageType imageTypeMo6360d = interfaceC2141b.mo6360d();
        String str6 = ", density: ";
        boolean z18 = z12;
        String str7 = "x";
        boolean z19 = z17;
        String str8 = "Downsampler";
        if (i24 > 0) {
            if (i25 <= 0) {
                i14 = 3;
                str = ", target density: ";
            } else {
                if (i26 == 90 || i26 == 270) {
                    i20 = i24;
                    i19 = i25;
                } else {
                    i19 = i24;
                    i20 = i25;
                }
                float fMo6341b = downsampleStrategy.mo6341b(i19, i20, iRound2, i13);
                if (fMo6341b <= 0.0f) {
                    throw new IllegalArgumentException("Cannot scale with factor: " + fMo6341b + " from: " + downsampleStrategy + ", source: [" + i24 + "x" + i25 + "], target: [" + iRound2 + "x" + i13 + "]");
                }
                DownsampleStrategy.SampleSizeRounding sampleSizeRoundingMo6340a = downsampleStrategy.mo6340a(i19, i20, iRound2, i13);
                if (sampleSizeRoundingMo6340a == null) {
                    throw new IllegalArgumentException("Cannot round with null rounding");
                }
                float f10 = i19;
                float f11 = i20;
                int i28 = i13;
                int i29 = i19 / ((int) (((double) (fMo6341b * f10)) + 0.5d));
                int i30 = i20 / ((int) (((double) (fMo6341b * f11)) + 0.5d));
                DownsampleStrategy.SampleSizeRounding sampleSizeRounding = DownsampleStrategy.SampleSizeRounding.MEMORY;
                int iMax = Math.max(1, Integer.highestOneBit(sampleSizeRoundingMo6340a == sampleSizeRounding ? Math.max(i29, i30) : Math.min(i29, i30)));
                if (sampleSizeRoundingMo6340a == sampleSizeRounding && iMax < 1.0f / fMo6341b) {
                    iMax <<= 1;
                }
                options.inSampleSize = iMax;
                if (imageTypeMo6360d == ImageHeaderParser.ImageType.JPEG) {
                    float fMin = Math.min(iMax, 8);
                    iFloor = (int) Math.ceil(f10 / fMin);
                    iFloor2 = (int) Math.ceil(f11 / fMin);
                    int i31 = iMax / 8;
                    if (i31 > 0) {
                        iFloor /= i31;
                        iFloor2 /= i31;
                    }
                } else if (imageTypeMo6360d == ImageHeaderParser.ImageType.PNG || imageTypeMo6360d == ImageHeaderParser.ImageType.PNG_A) {
                    float f12 = iMax;
                    iFloor = (int) Math.floor(f10 / f12);
                    iFloor2 = (int) Math.floor(f11 / f12);
                } else if (imageTypeMo6360d.isWebp()) {
                    float f13 = iMax;
                    iFloor = Math.round(f10 / f13);
                    iFloor2 = Math.round(f11 / f13);
                } else {
                    if (i19 % iMax == 0 && i20 % iMax == 0) {
                        i21 = i19 / iMax;
                        i22 = i20 / iMax;
                    } else {
                        options.inJustDecodeBounds = true;
                        m6349c(interfaceC2141b, options, bVar, interfaceC9452c);
                        options.inJustDecodeBounds = false;
                        i21 = options.outWidth;
                        i22 = options.outHeight;
                    }
                    int i32 = i22;
                    iFloor = i21;
                    iFloor2 = i32;
                }
                i13 = i28;
                double dMo6341b = downsampleStrategy.mo6341b(iFloor, iFloor2, iRound2, i13);
                int iRound3 = (int) Math.round((dMo6341b <= 1.0d ? dMo6341b : 1.0d / dMo6341b) * 2.147483647E9d);
                int i33 = (int) ((((double) iRound3) * dMo6341b) + 0.5d);
                options.inTargetDensity = (int) (((dMo6341b / ((double) (i33 / iRound3))) * ((double) i33)) + 0.5d);
                int iRound4 = (int) Math.round((dMo6341b <= 1.0d ? dMo6341b : 1.0d / dMo6341b) * 2.147483647E9d);
                options.inDensity = iRound4;
                int i34 = options.inTargetDensity;
                if (i34 > 0 && iRound4 > 0 && i34 != iRound4) {
                    options.inScaled = true;
                } else {
                    options.inTargetDensity = 0;
                    options.inDensity = 0;
                }
                str8 = "Downsampler";
                if (Log.isLoggable(str8, 2)) {
                    str7 = "x";
                    i24 = i24;
                    i25 = i25;
                    StringBuilder sbM25n = C0009a.m25n("Calculate scaling, source: [", i24, str7, i25, "], degreesToRotate: ");
                    sbM25n.append(i26);
                    sbM25n.append(", target: [");
                    sbM25n.append(iRound2);
                    sbM25n.append(str7);
                    sbM25n.append(i13);
                    sbM25n.append("], power of two scaled: [");
                    sbM25n.append(iFloor);
                    sbM25n.append(str7);
                    sbM25n.append(iFloor2);
                    sbM25n.append("], exact scale factor: ");
                    sbM25n.append(fMo6341b);
                    sbM25n.append(", power of 2 sample size: ");
                    sbM25n.append(iMax);
                    sbM25n.append(", adjusted scale factor: ");
                    sbM25n.append(dMo6341b);
                    str = ", target density: ";
                    sbM25n.append(str);
                    sbM25n.append(options.inTargetDensity);
                    str6 = ", density: ";
                    sbM25n.append(str6);
                    sbM25n.append(options.inDensity);
                    Log.v(str8, sbM25n.toString());
                } else {
                    str6 = ", density: ";
                    str = ", target density: ";
                    str7 = "x";
                    i24 = i24;
                    i25 = i25;
                }
            }
            zM169a = this.f10836e.m169a(iRound2, i13, z19, z18);
            if (zM169a) {
                options.inPreferredConfig = Bitmap.Config.HARDWARE;
                z13 = false;
                options.inMutable = false;
            } else {
                z13 = false;
            }
            if (zM169a) {
                str2 = str6;
                if (decodeFormat != DecodeFormat.PREFER_ARGB_8888) {
                    try {
                        zHasAlpha = interfaceC2141b.mo6360d().hasAlpha();
                    } catch (IOException e10) {
                        if (Log.isLoggable(str8, 3)) {
                            Log.d(str8, "Cannot determine whether the image has alpha or not from header, format " + decodeFormat, e10);
                        }
                        zHasAlpha = z13;
                    }
                    if (zHasAlpha) {
                        config = Bitmap.Config.ARGB_8888;
                    } else {
                        config = Bitmap.Config.RGB_565;
                    }
                    options.inPreferredConfig = config;
                    if (config == Bitmap.Config.RGB_565) {
                        z14 = true;
                        options.inDither = true;
                    }
                } else {
                    z14 = true;
                    options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                }
                i15 = Build.VERSION.SDK_INT;
                i16 = options.inSampleSize;
                if (i24 >= 0 || i25 < 0 || !z11) {
                    i17 = options.inTargetDensity;
                    if (i17 > 0 && (i18 = options.inDensity) > 0 && i17 != i18) {
                        z13 = z14;
                    }
                    if (z13) {
                        f3 = i17 / options.inDensity;
                    } else {
                        f3 = 1.0f;
                    }
                    float f14 = i16;
                    int iCeil = (int) Math.ceil(i24 / f14);
                    int iCeil2 = (int) Math.ceil(i25 / f14);
                    iRound2 = Math.round(iCeil * f3);
                    iRound = Math.round(iCeil2 * f3);
                    if (Log.isLoggable(str8, 2)) {
                        StringBuilder sbM25n2 = C0009a.m25n("Calculated target [", iRound2, str7, iRound, "] for source [");
                        sbM25n2.append(i24);
                        sbM25n2.append(str7);
                        sbM25n2.append(i25);
                        sbM25n2.append("], sampleSize: ");
                        sbM25n2.append(i16);
                        sbM25n2.append(", targetDensity: ");
                        sbM25n2.append(options.inTargetDensity);
                        sbM25n2.append(str2);
                        sbM25n2.append(options.inDensity);
                        sbM25n2.append(", density multiplier: ");
                        sbM25n2.append(f3);
                        Log.v(str8, sbM25n2.toString());
                    }
                } else {
                    iRound = i13;
                }
                if (iRound2 > 0 && iRound > 0 && (config3 = options.inPreferredConfig) != Bitmap.Config.HARDWARE) {
                    config4 = options.outConfig;
                    if (config4 != null) {
                        config3 = config4;
                    }
                    options.inBitmap = interfaceC9452c.mo17856c(iRound2, iRound, config3);
                }
                str3 = str;
                if (preferredColorSpace != null) {
                    if (i15 >= 28) {
                        if (preferredColorSpace == PreferredColorSpace.DISPLAY_P3 || (colorSpace = options.outColorSpace) == null || !colorSpace.isWideGamut()) {
                            z16 = false;
                        } else {
                            z16 = true;
                        }
                        if (z16) {
                            named = ColorSpace.Named.DISPLAY_P3;
                        } else {
                            named = ColorSpace.Named.SRGB;
                        }
                        options.inPreferredColorSpace = ColorSpace.get(named);
                    } else {
                        options.inPreferredColorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
                    }
                }
                str4 = str7;
                bitmapM6349c = m6349c(interfaceC2141b, options, bVar, interfaceC9452c);
                bVar.mo6355a(bitmapM6349c, interfaceC9452c);
                if (Log.isLoggable(str8, 2)) {
                    Log.v(str8, "Decoded " + m6350d(bitmapM6349c) + " from [" + i24 + str4 + i25 + "] " + str5 + " with inBitmap " + m6350d(options.inBitmap) + " for [" + i10 + str4 + i11 + "], sample size: " + options.inSampleSize + str2 + options.inDensity + str3 + options.inTargetDensity + ", thread: " + Thread.currentThread().getName() + ", duration: " + C7488h.m14872a(jElapsedRealtimeNanos));
                }
                if (bitmapM6349c != null) {
                    return null;
                }
                bitmapM6349c.setDensity(this.f10833b.densityDpi);
                switch (iMo6357a) {
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                    case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                    case 8:
                        z15 = true;
                        break;
                    default:
                        z15 = false;
                        break;
                }
                if (z15) {
                    matrix = new Matrix();
                    switch (iMo6357a) {
                        case 2:
                            matrix.setScale(-1.0f, 1.0f);
                            break;
                        case 3:
                            matrix.setRotate(180.0f);
                            break;
                        case 4:
                            matrix.setRotate(180.0f);
                            matrix.postScale(-1.0f, 1.0f);
                            break;
                        case 5:
                            matrix.setRotate(90.0f);
                            matrix.postScale(-1.0f, 1.0f);
                            break;
                        case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                            matrix.setRotate(90.0f);
                            break;
                        case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                            matrix.setRotate(-90.0f);
                            matrix.postScale(-1.0f, 1.0f);
                            break;
                        case 8:
                            matrix.setRotate(-90.0f);
                            break;
                    }
                    RectF rectF = new RectF(0.0f, 0.0f, bitmapM6349c.getWidth(), bitmapM6349c.getHeight());
                    matrix.mapRect(rectF);
                    int iRound5 = Math.round(rectF.width());
                    int iRound6 = Math.round(rectF.height());
                    if (bitmapM6349c.getConfig() != null) {
                        config2 = bitmapM6349c.getConfig();
                    } else {
                        config2 = Bitmap.Config.ARGB_8888;
                    }
                    Bitmap bitmapMo17857e = interfaceC9452c.mo17857e(iRound5, iRound6, config2);
                    matrix.postTranslate(-rectF.left, -rectF.top);
                    bitmapMo17857e.setHasAlpha(bitmapM6349c.hasAlpha());
                    C0043v.m170a(bitmapM6349c, bitmapMo17857e, matrix);
                    bitmap = bitmapMo17857e;
                } else {
                    bitmap = bitmapM6349c;
                }
                if (!bitmapM6349c.equals(bitmap)) {
                    return bitmap;
                }
                interfaceC9452c.mo164d(bitmapM6349c);
                return bitmap;
            }
            str2 = str6;
            z14 = true;
            i15 = Build.VERSION.SDK_INT;
            i16 = options.inSampleSize;
            if (i24 >= 0) {
                i17 = options.inTargetDensity;
                if (i17 > 0) {
                    z13 = z14;
                }
                if (z13) {
                    f3 = i17 / options.inDensity;
                } else {
                    f3 = 1.0f;
                }
                float f15 = i16;
                int iCeil3 = (int) Math.ceil(i24 / f15);
                int iCeil4 = (int) Math.ceil(i25 / f15);
                iRound2 = Math.round(iCeil3 * f3);
                iRound = Math.round(iCeil4 * f3);
                if (Log.isLoggable(str8, 2)) {
                    StringBuilder sbM25n3 = C0009a.m25n("Calculated target [", iRound2, str7, iRound, "] for source [");
                    sbM25n3.append(i24);
                    sbM25n3.append(str7);
                    sbM25n3.append(i25);
                    sbM25n3.append("], sampleSize: ");
                    sbM25n3.append(i16);
                    sbM25n3.append(", targetDensity: ");
                    sbM25n3.append(options.inTargetDensity);
                    sbM25n3.append(str2);
                    sbM25n3.append(options.inDensity);
                    sbM25n3.append(", density multiplier: ");
                    sbM25n3.append(f3);
                    Log.v(str8, sbM25n3.toString());
                }
            } else {
                i17 = options.inTargetDensity;
                if (i17 > 0) {
                    z13 = z14;
                }
                if (z13) {
                    f3 = i17 / options.inDensity;
                } else {
                    f3 = 1.0f;
                }
                float f16 = i16;
                int iCeil5 = (int) Math.ceil(i24 / f16);
                int iCeil6 = (int) Math.ceil(i25 / f16);
                iRound2 = Math.round(iCeil5 * f3);
                iRound = Math.round(iCeil6 * f3);
                if (Log.isLoggable(str8, 2)) {
                    StringBuilder sbM25n4 = C0009a.m25n("Calculated target [", iRound2, str7, iRound, "] for source [");
                    sbM25n4.append(i24);
                    sbM25n4.append(str7);
                    sbM25n4.append(i25);
                    sbM25n4.append("], sampleSize: ");
                    sbM25n4.append(i16);
                    sbM25n4.append(", targetDensity: ");
                    sbM25n4.append(options.inTargetDensity);
                    sbM25n4.append(str2);
                    sbM25n4.append(options.inDensity);
                    sbM25n4.append(", density multiplier: ");
                    sbM25n4.append(f3);
                    Log.v(str8, sbM25n4.toString());
                }
            }
            if (iRound2 > 0) {
                config4 = options.outConfig;
                if (config4 != null) {
                    config3 = config4;
                }
                options.inBitmap = interfaceC9452c.mo17856c(iRound2, iRound, config3);
            }
            str3 = str;
            if (preferredColorSpace != null) {
                if (i15 >= 28) {
                    if (preferredColorSpace == PreferredColorSpace.DISPLAY_P3) {
                        z16 = false;
                    } else {
                        z16 = false;
                    }
                    if (z16) {
                        named = ColorSpace.Named.DISPLAY_P3;
                    } else {
                        named = ColorSpace.Named.SRGB;
                    }
                    options.inPreferredColorSpace = ColorSpace.get(named);
                } else {
                    options.inPreferredColorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
                }
            }
            str4 = str7;
            bitmapM6349c = m6349c(interfaceC2141b, options, bVar, interfaceC9452c);
            bVar.mo6355a(bitmapM6349c, interfaceC9452c);
            if (Log.isLoggable(str8, 2)) {
                Log.v(str8, "Decoded " + m6350d(bitmapM6349c) + " from [" + i24 + str4 + i25 + "] " + str5 + " with inBitmap " + m6350d(options.inBitmap) + " for [" + i10 + str4 + i11 + "], sample size: " + options.inSampleSize + str2 + options.inDensity + str3 + options.inTargetDensity + ", thread: " + Thread.currentThread().getName() + ", duration: " + C7488h.m14872a(jElapsedRealtimeNanos));
            }
            if (bitmapM6349c != null) {
                return null;
            }
            bitmapM6349c.setDensity(this.f10833b.densityDpi);
            switch (iMo6357a) {
                case 2:
                case 3:
                case 4:
                case 5:
                case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                case 8:
                    z15 = true;
                    break;
                default:
                    z15 = false;
                    break;
            }
            if (z15) {
                bitmap = bitmapM6349c;
            } else {
                matrix = new Matrix();
                switch (iMo6357a) {
                    case 2:
                        matrix.setScale(-1.0f, 1.0f);
                        break;
                    case 3:
                        matrix.setRotate(180.0f);
                        break;
                    case 4:
                        matrix.setRotate(180.0f);
                        matrix.postScale(-1.0f, 1.0f);
                        break;
                    case 5:
                        matrix.setRotate(90.0f);
                        matrix.postScale(-1.0f, 1.0f);
                        break;
                    case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                        matrix.setRotate(90.0f);
                        break;
                    case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                        matrix.setRotate(-90.0f);
                        matrix.postScale(-1.0f, 1.0f);
                        break;
                    case 8:
                        matrix.setRotate(-90.0f);
                        break;
                }
                RectF rectF2 = new RectF(0.0f, 0.0f, bitmapM6349c.getWidth(), bitmapM6349c.getHeight());
                matrix.mapRect(rectF2);
                int iRound7 = Math.round(rectF2.width());
                int iRound8 = Math.round(rectF2.height());
                if (bitmapM6349c.getConfig() != null) {
                    config2 = bitmapM6349c.getConfig();
                } else {
                    config2 = Bitmap.Config.ARGB_8888;
                }
                Bitmap bitmapMo17857e2 = interfaceC9452c.mo17857e(iRound7, iRound8, config2);
                matrix.postTranslate(-rectF2.left, -rectF2.top);
                bitmapMo17857e2.setHasAlpha(bitmapM6349c.hasAlpha());
                C0043v.m170a(bitmapM6349c, bitmapMo17857e2, matrix);
                bitmap = bitmapMo17857e2;
            }
            if (!bitmapM6349c.equals(bitmap)) {
                return bitmap;
            }
            interfaceC9452c.mo164d(bitmapM6349c);
            return bitmap;
        }
        str = ", target density: ";
        i14 = 3;
        if (Log.isLoggable(str8, i14)) {
            Log.d(str8, "Unable to determine dimensions for: " + imageTypeMo6360d + " with target [" + iRound2 + str7 + i13 + "]");
        }
        zM169a = this.f10836e.m169a(iRound2, i13, z19, z18);
        if (zM169a) {
            options.inPreferredConfig = Bitmap.Config.HARDWARE;
            z13 = false;
            options.inMutable = false;
        } else {
            z13 = false;
        }
        if (zM169a) {
            str2 = str6;
            if (decodeFormat != DecodeFormat.PREFER_ARGB_8888) {
                zHasAlpha = interfaceC2141b.mo6360d().hasAlpha();
                if (zHasAlpha) {
                    config = Bitmap.Config.ARGB_8888;
                } else {
                    config = Bitmap.Config.RGB_565;
                }
                options.inPreferredConfig = config;
                if (config == Bitmap.Config.RGB_565) {
                    z14 = true;
                    options.inDither = true;
                }
            } else {
                z14 = true;
                options.inPreferredConfig = Bitmap.Config.ARGB_8888;
            }
            i15 = Build.VERSION.SDK_INT;
            i16 = options.inSampleSize;
            if (i24 >= 0) {
                i17 = options.inTargetDensity;
                if (i17 > 0) {
                    z13 = z14;
                }
                if (z13) {
                    f3 = i17 / options.inDensity;
                } else {
                    f3 = 1.0f;
                }
                float f17 = i16;
                int iCeil7 = (int) Math.ceil(i24 / f17);
                int iCeil8 = (int) Math.ceil(i25 / f17);
                iRound2 = Math.round(iCeil7 * f3);
                iRound = Math.round(iCeil8 * f3);
                if (Log.isLoggable(str8, 2)) {
                    StringBuilder sbM25n5 = C0009a.m25n("Calculated target [", iRound2, str7, iRound, "] for source [");
                    sbM25n5.append(i24);
                    sbM25n5.append(str7);
                    sbM25n5.append(i25);
                    sbM25n5.append("], sampleSize: ");
                    sbM25n5.append(i16);
                    sbM25n5.append(", targetDensity: ");
                    sbM25n5.append(options.inTargetDensity);
                    sbM25n5.append(str2);
                    sbM25n5.append(options.inDensity);
                    sbM25n5.append(", density multiplier: ");
                    sbM25n5.append(f3);
                    Log.v(str8, sbM25n5.toString());
                }
            } else {
                i17 = options.inTargetDensity;
                if (i17 > 0) {
                    z13 = z14;
                }
                if (z13) {
                    f3 = i17 / options.inDensity;
                } else {
                    f3 = 1.0f;
                }
                float f18 = i16;
                int iCeil9 = (int) Math.ceil(i24 / f18);
                int iCeil10 = (int) Math.ceil(i25 / f18);
                iRound2 = Math.round(iCeil9 * f3);
                iRound = Math.round(iCeil10 * f3);
                if (Log.isLoggable(str8, 2)) {
                    StringBuilder sbM25n6 = C0009a.m25n("Calculated target [", iRound2, str7, iRound, "] for source [");
                    sbM25n6.append(i24);
                    sbM25n6.append(str7);
                    sbM25n6.append(i25);
                    sbM25n6.append("], sampleSize: ");
                    sbM25n6.append(i16);
                    sbM25n6.append(", targetDensity: ");
                    sbM25n6.append(options.inTargetDensity);
                    sbM25n6.append(str2);
                    sbM25n6.append(options.inDensity);
                    sbM25n6.append(", density multiplier: ");
                    sbM25n6.append(f3);
                    Log.v(str8, sbM25n6.toString());
                }
            }
            if (iRound2 > 0) {
                config4 = options.outConfig;
                if (config4 != null) {
                    config3 = config4;
                }
                options.inBitmap = interfaceC9452c.mo17856c(iRound2, iRound, config3);
            }
            str3 = str;
            if (preferredColorSpace != null) {
                if (i15 >= 28) {
                    if (preferredColorSpace == PreferredColorSpace.DISPLAY_P3) {
                        z16 = false;
                    } else {
                        z16 = false;
                    }
                    if (z16) {
                        named = ColorSpace.Named.DISPLAY_P3;
                    } else {
                        named = ColorSpace.Named.SRGB;
                    }
                    options.inPreferredColorSpace = ColorSpace.get(named);
                } else {
                    options.inPreferredColorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
                }
            }
            str4 = str7;
            bitmapM6349c = m6349c(interfaceC2141b, options, bVar, interfaceC9452c);
            bVar.mo6355a(bitmapM6349c, interfaceC9452c);
            if (Log.isLoggable(str8, 2)) {
                Log.v(str8, "Decoded " + m6350d(bitmapM6349c) + " from [" + i24 + str4 + i25 + "] " + str5 + " with inBitmap " + m6350d(options.inBitmap) + " for [" + i10 + str4 + i11 + "], sample size: " + options.inSampleSize + str2 + options.inDensity + str3 + options.inTargetDensity + ", thread: " + Thread.currentThread().getName() + ", duration: " + C7488h.m14872a(jElapsedRealtimeNanos));
            }
            if (bitmapM6349c != null) {
                return null;
            }
            bitmapM6349c.setDensity(this.f10833b.densityDpi);
            switch (iMo6357a) {
                case 2:
                case 3:
                case 4:
                case 5:
                case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                case 8:
                    z15 = true;
                    break;
                default:
                    z15 = false;
                    break;
            }
            if (z15) {
                bitmap = bitmapM6349c;
            } else {
                matrix = new Matrix();
                switch (iMo6357a) {
                    case 2:
                        matrix.setScale(-1.0f, 1.0f);
                        break;
                    case 3:
                        matrix.setRotate(180.0f);
                        break;
                    case 4:
                        matrix.setRotate(180.0f);
                        matrix.postScale(-1.0f, 1.0f);
                        break;
                    case 5:
                        matrix.setRotate(90.0f);
                        matrix.postScale(-1.0f, 1.0f);
                        break;
                    case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                        matrix.setRotate(90.0f);
                        break;
                    case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                        matrix.setRotate(-90.0f);
                        matrix.postScale(-1.0f, 1.0f);
                        break;
                    case 8:
                        matrix.setRotate(-90.0f);
                        break;
                }
                RectF rectF3 = new RectF(0.0f, 0.0f, bitmapM6349c.getWidth(), bitmapM6349c.getHeight());
                matrix.mapRect(rectF3);
                int iRound9 = Math.round(rectF3.width());
                int iRound10 = Math.round(rectF3.height());
                if (bitmapM6349c.getConfig() != null) {
                    config2 = bitmapM6349c.getConfig();
                } else {
                    config2 = Bitmap.Config.ARGB_8888;
                }
                Bitmap bitmapMo17857e3 = interfaceC9452c.mo17857e(iRound9, iRound10, config2);
                matrix.postTranslate(-rectF3.left, -rectF3.top);
                bitmapMo17857e3.setHasAlpha(bitmapM6349c.hasAlpha());
                C0043v.m170a(bitmapM6349c, bitmapMo17857e3, matrix);
                bitmap = bitmapMo17857e3;
            }
            if (!bitmapM6349c.equals(bitmap)) {
                return bitmap;
            }
            interfaceC9452c.mo164d(bitmapM6349c);
            return bitmap;
        }
        str2 = str6;
        z14 = true;
        i15 = Build.VERSION.SDK_INT;
        i16 = options.inSampleSize;
        if (i24 >= 0) {
            i17 = options.inTargetDensity;
            if (i17 > 0) {
                z13 = z14;
            }
            if (z13) {
                f3 = i17 / options.inDensity;
            } else {
                f3 = 1.0f;
            }
            float f19 = i16;
            int iCeil11 = (int) Math.ceil(i24 / f19);
            int iCeil12 = (int) Math.ceil(i25 / f19);
            iRound2 = Math.round(iCeil11 * f3);
            iRound = Math.round(iCeil12 * f3);
            if (Log.isLoggable(str8, 2)) {
                StringBuilder sbM25n7 = C0009a.m25n("Calculated target [", iRound2, str7, iRound, "] for source [");
                sbM25n7.append(i24);
                sbM25n7.append(str7);
                sbM25n7.append(i25);
                sbM25n7.append("], sampleSize: ");
                sbM25n7.append(i16);
                sbM25n7.append(", targetDensity: ");
                sbM25n7.append(options.inTargetDensity);
                sbM25n7.append(str2);
                sbM25n7.append(options.inDensity);
                sbM25n7.append(", density multiplier: ");
                sbM25n7.append(f3);
                Log.v(str8, sbM25n7.toString());
            }
        } else {
            i17 = options.inTargetDensity;
            if (i17 > 0) {
                z13 = z14;
            }
            if (z13) {
                f3 = i17 / options.inDensity;
            } else {
                f3 = 1.0f;
            }
            float f110 = i16;
            int iCeil13 = (int) Math.ceil(i24 / f110);
            int iCeil14 = (int) Math.ceil(i25 / f110);
            iRound2 = Math.round(iCeil13 * f3);
            iRound = Math.round(iCeil14 * f3);
            if (Log.isLoggable(str8, 2)) {
                StringBuilder sbM25n8 = C0009a.m25n("Calculated target [", iRound2, str7, iRound, "] for source [");
                sbM25n8.append(i24);
                sbM25n8.append(str7);
                sbM25n8.append(i25);
                sbM25n8.append("], sampleSize: ");
                sbM25n8.append(i16);
                sbM25n8.append(", targetDensity: ");
                sbM25n8.append(options.inTargetDensity);
                sbM25n8.append(str2);
                sbM25n8.append(options.inDensity);
                sbM25n8.append(", density multiplier: ");
                sbM25n8.append(f3);
                Log.v(str8, sbM25n8.toString());
            }
        }
        if (iRound2 > 0) {
            config4 = options.outConfig;
            if (config4 != null) {
                config3 = config4;
            }
            options.inBitmap = interfaceC9452c.mo17856c(iRound2, iRound, config3);
        }
        str3 = str;
        if (preferredColorSpace != null) {
            if (i15 >= 28) {
                if (preferredColorSpace == PreferredColorSpace.DISPLAY_P3) {
                    z16 = false;
                } else {
                    z16 = false;
                }
                if (z16) {
                    named = ColorSpace.Named.DISPLAY_P3;
                } else {
                    named = ColorSpace.Named.SRGB;
                }
                options.inPreferredColorSpace = ColorSpace.get(named);
            } else {
                options.inPreferredColorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
            }
        }
        str4 = str7;
        bitmapM6349c = m6349c(interfaceC2141b, options, bVar, interfaceC9452c);
        bVar.mo6355a(bitmapM6349c, interfaceC9452c);
        if (Log.isLoggable(str8, 2)) {
            Log.v(str8, "Decoded " + m6350d(bitmapM6349c) + " from [" + i24 + str4 + i25 + "] " + str5 + " with inBitmap " + m6350d(options.inBitmap) + " for [" + i10 + str4 + i11 + "], sample size: " + options.inSampleSize + str2 + options.inDensity + str3 + options.inTargetDensity + ", thread: " + Thread.currentThread().getName() + ", duration: " + C7488h.m14872a(jElapsedRealtimeNanos));
        }
        if (bitmapM6349c != null) {
            return null;
        }
        bitmapM6349c.setDensity(this.f10833b.densityDpi);
        switch (iMo6357a) {
            case 2:
            case 3:
            case 4:
            case 5:
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
            case 8:
                z15 = true;
                break;
            default:
                z15 = false;
                break;
        }
        if (z15) {
            bitmap = bitmapM6349c;
        } else {
            matrix = new Matrix();
            switch (iMo6357a) {
                case 2:
                    matrix.setScale(-1.0f, 1.0f);
                    break;
                case 3:
                    matrix.setRotate(180.0f);
                    break;
                case 4:
                    matrix.setRotate(180.0f);
                    matrix.postScale(-1.0f, 1.0f);
                    break;
                case 5:
                    matrix.setRotate(90.0f);
                    matrix.postScale(-1.0f, 1.0f);
                    break;
                case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                    matrix.setRotate(90.0f);
                    break;
                case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                    matrix.setRotate(-90.0f);
                    matrix.postScale(-1.0f, 1.0f);
                    break;
                case 8:
                    matrix.setRotate(-90.0f);
                    break;
            }
            RectF rectF4 = new RectF(0.0f, 0.0f, bitmapM6349c.getWidth(), bitmapM6349c.getHeight());
            matrix.mapRect(rectF4);
            int iRound11 = Math.round(rectF4.width());
            int iRound12 = Math.round(rectF4.height());
            if (bitmapM6349c.getConfig() != null) {
                config2 = bitmapM6349c.getConfig();
            } else {
                config2 = Bitmap.Config.ARGB_8888;
            }
            Bitmap bitmapMo17857e4 = interfaceC9452c.mo17857e(iRound11, iRound12, config2);
            matrix.postTranslate(-rectF4.left, -rectF4.top);
            bitmapMo17857e4.setHasAlpha(bitmapM6349c.hasAlpha());
            C0043v.m170a(bitmapM6349c, bitmapMo17857e4, matrix);
            bitmap = bitmapMo17857e4;
        }
        if (!bitmapM6349c.equals(bitmap)) {
            return bitmap;
        }
        interfaceC9452c.mo164d(bitmapM6349c);
        return bitmap;
    }
}
