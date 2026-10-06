package p000;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.google.android.apps.camera.p014ui.captureframe.Tjcw.xRFdVyfdeve;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.locks.Lock;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bxb {

    /* JADX INFO: renamed from: a */
    public static final bqq f4677a = bqq.m2926c("com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat", bqe.f4183c);

    /* JADX INFO: renamed from: b */
    public static final bqq f4678b = bqq.m2925b("com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace");

    /* JADX INFO: renamed from: c */
    public static final bqq f4679c;

    /* JADX INFO: renamed from: d */
    public static final bqq f4680d;

    /* JADX INFO: renamed from: e */
    public static final bxa f4681e;

    /* JADX INFO: renamed from: h */
    private static final Queue f4682h;

    /* JADX INFO: renamed from: f */
    public final btg f4683f;

    /* JADX INFO: renamed from: g */
    public final List f4684g;

    /* JADX INFO: renamed from: i */
    private final bti f4685i;

    /* JADX INFO: renamed from: j */
    private final DisplayMetrics f4686j;

    /* JADX INFO: renamed from: k */
    private final bxh f4687k = bxh.m3154a();

    static {
        bwy bwyVar = bwy.f4668a;
        f4679c = bqq.m2926c("com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize", false);
        f4680d = bqq.m2926c("com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode", false);
        Collections.unmodifiableSet(new HashSet(Arrays.asList("image/vnd.wap.wbmp", "image/x-ico")));
        f4681e = new bwz();
        Collections.unmodifiableSet(EnumSet.of(ImageHeaderParser$ImageType.JPEG, ImageHeaderParser$ImageType.PNG_A, ImageHeaderParser$ImageType.PNG));
        f4682h = cbi.m3386g(0);
    }

    public bxb(List list, DisplayMetrics displayMetrics, bti btiVar, btg btgVar) {
        this.f4684g = list;
        bzq.m3278r(displayMetrics);
        this.f4686j = displayMetrics;
        bzq.m3278r(btiVar);
        this.f4685i = btiVar;
        bzq.m3278r(btgVar);
        this.f4683f = btgVar;
    }

    /* JADX INFO: renamed from: b */
    private static int m3143b(double d) {
        if (d > 1.0d) {
            d = 1.0d / d;
        }
        return (int) Math.round(d * 2.147483647E9d);
    }

    /* JADX INFO: renamed from: c */
    private static int m3144c(double d) {
        return (int) (d + 0.5d);
    }

    /* JADX INFO: renamed from: d */
    private static Bitmap m3145d(bxj bxjVar, BitmapFactory.Options options, bxa bxaVar, bti btiVar) {
        String str;
        Bitmap bitmapM3145d;
        Lock lock;
        if (!options.inJustDecodeBounds) {
            bxaVar.mo3142b();
            bxjVar.mo3160d();
        }
        int i = options.outWidth;
        int i2 = options.outHeight;
        String str2 = options.outMimeType;
        bxq.f4717c.lock();
        try {
            try {
                bitmapM3145d = bxjVar.mo3158b(options);
                lock = bxq.f4717c;
            } catch (IllegalArgumentException e) {
                Bitmap bitmap = options.inBitmap;
                if (bitmap == null) {
                    str = null;
                } else {
                    String str3 = " (" + bitmap.getAllocationByteCount() + ")";
                    str = "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + String.valueOf(bitmap.getConfig()) + str3;
                }
                IOException iOException = new IOException("Exception decoding bitmap, outWidth: " + i + ", outHeight: " + i2 + xRFdVyfdeve.oFbeeZ + str2 + ", inBitmap: " + str, e);
                if (options.inBitmap == null) {
                    throw iOException;
                }
                try {
                    btiVar.mo3045d(options.inBitmap);
                    options.inBitmap = null;
                    bitmapM3145d = m3145d(bxjVar, options, bxaVar, btiVar);
                    lock = bxq.f4717c;
                } catch (IOException e2) {
                    throw iOException;
                }
            }
            lock.unlock();
            return bitmapM3145d;
        } catch (Throwable th) {
            bxq.f4717c.unlock();
            throw th;
        }
    }

    /* JADX INFO: renamed from: e */
    private static synchronized BitmapFactory.Options m3146e() {
        BitmapFactory.Options options;
        Queue queue = f4682h;
        synchronized (queue) {
            options = (BitmapFactory.Options) queue.poll();
        }
        if (options != null) {
            return options;
        }
        BitmapFactory.Options options2 = new BitmapFactory.Options();
        m3148g(options2);
        return options2;
    }

    /* JADX INFO: renamed from: f */
    private static void m3147f(BitmapFactory.Options options) {
        m3148g(options);
        Queue queue = f4682h;
        synchronized (queue) {
            queue.offer(options);
        }
    }

    /* JADX INFO: renamed from: g */
    private static void m3148g(BitmapFactory.Options options) {
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

    /* JADX INFO: renamed from: h */
    private static boolean m3149h(int i) {
        return i == 90 || i == 270;
    }

    /* JADX INFO: renamed from: i */
    private static boolean m3150i(BitmapFactory.Options options) {
        return options.inTargetDensity > 0 && options.inDensity > 0 && options.inTargetDensity != options.inDensity;
    }

    /* JADX INFO: renamed from: j */
    private static int[] m3151j(bxj bxjVar, BitmapFactory.Options options, bxa bxaVar, bti btiVar) {
        options.inJustDecodeBounds = true;
        m3145d(bxjVar, options, bxaVar, btiVar);
        options.inJustDecodeBounds = false;
        return new int[]{options.outWidth, options.outHeight};
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: a */
    public final bsz m3152a(bxj bxjVar, int i, int i2, bqr bqrVar, bxa bxaVar) throws Throwable {
        bxb bxbVar;
        int i3;
        bqe bqeVar;
        int i4;
        boolean z;
        bxa bxaVar2;
        Bitmap.Config config;
        Bitmap bitmap;
        Bitmap bitmap2;
        int iFloor;
        int iFloor2;
        bxa bxaVar3;
        bxjVar = bxjVar;
        bxa bxaVar4 = bxaVar;
        byte[] bArr = (byte[]) this.f4683f.mo3034a(65536, byte[].class);
        BitmapFactory.Options optionsM3146e = m3146e();
        optionsM3146e.inTempStorage = bArr;
        bqe bqeVar2 = (bqe) bqrVar.m2927b(f4677a);
        bqs bqsVar = (bqs) bqrVar.m2927b(f4678b);
        bwy bwyVar = (bwy) bqrVar.m2927b(bwy.f4673f);
        boolean zBooleanValue = ((Boolean) bqrVar.m2927b(f4679c)).booleanValue();
        bqq bqqVar = f4680d;
        boolean z2 = bqrVar.m2927b(bqqVar) != null && ((Boolean) bqrVar.m2927b(bqqVar)).booleanValue();
        try {
            SystemClock.elapsedRealtimeNanos();
            int[] iArrM3151j = m3151j(bxjVar, optionsM3146e, bxaVar4, this.f4685i);
            int i5 = iArrM3151j[0];
            int i6 = iArrM3151j[1];
            String str = optionsM3146e.outMimeType;
            if (i5 == -1) {
                z2 = false;
            } else if (i6 == -1) {
                z2 = false;
                i6 = -1;
            }
            int iMo3157a = bxjVar.mo3157a();
            Paint paint = bxq.f4715a;
            switch (iMo3157a) {
                case 3:
                case 4:
                    i3 = 180;
                    break;
                case 5:
                case 6:
                    i3 = 90;
                    break;
                case 7:
                case 8:
                    i3 = 270;
                    break;
                default:
                    i3 = 0;
                    break;
            }
            boolean zM3173g = bxq.m3173g(iMo3157a);
            int i7 = i;
            if (i7 == Integer.MIN_VALUE) {
                try {
                    i7 = m3149h(i3) ? i6 : i5;
                } catch (Throwable th) {
                    th = th;
                    bxbVar = this;
                    bArr = bArr;
                    m3147f(optionsM3146e);
                    bxbVar.f4683f.mo3036c(bArr);
                    throw th;
                }
            }
            int iRound = i2;
            if (iRound == Integer.MIN_VALUE) {
                iRound = m3149h(i3) ? i5 : i6;
            }
            ImageHeaderParser$ImageType imageHeaderParser$ImageTypeMo3159c = bxjVar.mo3159c();
            bti btiVar = this.f4685i;
            if (i5 <= 0 || i6 <= 0) {
                z2 = z2;
                bqeVar = bqeVar2;
                i4 = i5;
                z = zM3173g;
                bxaVar2 = bxaVar4;
            } else {
                try {
                    boolean zM3149h = m3149h(i3);
                    bqeVar = bqeVar2;
                    int i8 = true != zM3149h ? i6 : i5;
                    int i9 = true != zM3149h ? i5 : i6;
                    float fMo3139a = bwyVar.mo3139a(i9, i8, i7, iRound);
                    if (fMo3139a <= 0.0f) {
                        throw new IllegalArgumentException("Cannot scale with factor: " + fMo3139a + " from: " + String.valueOf(bwyVar) + ", source: [" + i5 + "x" + i6 + "], target: [" + i7 + "x" + iRound + "]");
                    }
                    int iMo3140b = bwyVar.mo3140b(i9, i8, i7, iRound);
                    z = zM3173g;
                    float f = i9;
                    int i10 = i6;
                    float f2 = i8;
                    int iM3144c = i9 / m3144c(fMo3139a * f);
                    int iM3144c2 = i8 / m3144c(fMo3139a * f2);
                    int iMax = Math.max(1, Integer.highestOneBit(iMo3140b == 1 ? Math.max(iM3144c, iM3144c2) : Math.min(iM3144c, iM3144c2)));
                    if (iMo3140b == 1 && iMax < 1.0f / fMo3139a) {
                        iMax += iMax;
                    }
                    optionsM3146e.inSampleSize = iMax;
                    if (imageHeaderParser$ImageTypeMo3159c == ImageHeaderParser$ImageType.JPEG) {
                        float fMin = Math.min(iMax, 8);
                        int iCeil = (int) Math.ceil(f / fMin);
                        int iCeil2 = (int) Math.ceil(f2 / fMin);
                        int i11 = iMax / 8;
                        if (i11 > 0) {
                            iFloor2 = iCeil2 / i11;
                            iFloor = iCeil / i11;
                            bxjVar = bxjVar;
                            bxaVar3 = bxaVar;
                        } else {
                            iFloor2 = iCeil2;
                            iFloor = iCeil;
                            bxjVar = bxjVar;
                            bxaVar3 = bxaVar;
                        }
                    } else if (imageHeaderParser$ImageTypeMo3159c == ImageHeaderParser$ImageType.PNG || imageHeaderParser$ImageTypeMo3159c == ImageHeaderParser$ImageType.PNG_A) {
                        float f3 = iMax;
                        iFloor = (int) Math.floor(f / f3);
                        iFloor2 = (int) Math.floor(f2 / f3);
                        bxaVar3 = bxaVar;
                    } else if (imageHeaderParser$ImageTypeMo3159c.isWebp()) {
                        float f4 = iMax;
                        int iRound2 = Math.round(f / f4);
                        iFloor2 = Math.round(f2 / f4);
                        iFloor = iRound2;
                        bxjVar = bxjVar;
                        bxaVar3 = bxaVar;
                    } else if (i9 % iMax == 0 && i8 % iMax == 0) {
                        iFloor2 = i8 / iMax;
                        iFloor = i9 / iMax;
                        bxjVar = bxjVar;
                        bxaVar3 = bxaVar;
                    } else {
                        bxjVar = bxjVar;
                        bxa bxaVar5 = bxaVar;
                        int[] iArrM3151j2 = m3151j(bxjVar, optionsM3146e, bxaVar5, btiVar);
                        int i12 = iArrM3151j2[0];
                        iFloor2 = iArrM3151j2[1];
                        iFloor = i12;
                        bxaVar3 = bxaVar5;
                    }
                    double dMo3139a = bwyVar.mo3139a(iFloor, iFloor2, i7, iRound);
                    int iM3143b = m3143b(dMo3139a);
                    double d = iM3143b;
                    Double.isNaN(d);
                    Double.isNaN(dMo3139a);
                    int iM3144c3 = m3144c(d * dMo3139a);
                    double d2 = iM3144c3 / iM3143b;
                    Double.isNaN(dMo3139a);
                    Double.isNaN(d2);
                    double d3 = iM3144c3;
                    Double.isNaN(d3);
                    optionsM3146e.inTargetDensity = m3144c((dMo3139a / d2) * d3);
                    optionsM3146e.inDensity = m3143b(dMo3139a);
                    if (m3150i(optionsM3146e)) {
                        optionsM3146e.inScaled = true;
                        i4 = i5;
                        i6 = i10;
                        bxaVar2 = bxaVar3;
                    } else {
                        optionsM3146e.inTargetDensity = 0;
                        optionsM3146e.inDensity = 0;
                        i4 = i5;
                        i6 = i10;
                        bxaVar2 = bxaVar3;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    bxbVar = this;
                    bArr = bArr;
                    m3147f(optionsM3146e);
                    bxbVar.f4683f.mo3036c(bArr);
                    throw th;
                }
            }
            bxbVar = this;
            try {
                if (bxbVar.f4687k.m3156b(i7, iRound, z2, z)) {
                    optionsM3146e.inPreferredConfig = Bitmap.Config.HARDWARE;
                    optionsM3146e.inMutable = false;
                } else if (bqeVar != bqe.PREFER_ARGB_8888) {
                    try {
                        config = bxjVar.mo3159c().hasAlpha() ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565;
                    } catch (IOException e) {
                    }
                    optionsM3146e.inPreferredConfig = config;
                    if (optionsM3146e.inPreferredConfig == Bitmap.Config.RGB_565) {
                        optionsM3146e.inDither = true;
                    }
                } else {
                    optionsM3146e.inPreferredConfig = Bitmap.Config.ARGB_8888;
                }
                int i13 = optionsM3146e.inSampleSize;
                if (i4 < 0 || i6 < 0 || !zBooleanValue) {
                    float f5 = m3150i(optionsM3146e) ? optionsM3146e.inTargetDensity / optionsM3146e.inDensity : 1.0f;
                    float f6 = optionsM3146e.inSampleSize;
                    int iCeil3 = (int) Math.ceil(i4 / f6);
                    int iCeil4 = (int) Math.ceil(i6 / f6);
                    int iRound3 = Math.round(iCeil3 * f5);
                    iRound = Math.round(iCeil4 * f5);
                    i7 = iRound3;
                }
                if (i7 > 0 && iRound > 0) {
                    bti btiVar2 = bxbVar.f4685i;
                    if (optionsM3146e.inPreferredConfig != Bitmap.Config.HARDWARE) {
                        Bitmap.Config config2 = optionsM3146e.outConfig;
                        if (config2 == null) {
                            config2 = optionsM3146e.inPreferredConfig;
                        }
                        optionsM3146e.inBitmap = btiVar2.mo3043b(i7, iRound, config2);
                    }
                }
                if (bqsVar != null) {
                    optionsM3146e.inPreferredColorSpace = ColorSpace.get((bqsVar == bqs.DISPLAY_P3 && optionsM3146e.outColorSpace != null && optionsM3146e.outColorSpace.isWideGamut()) ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB);
                }
                Bitmap bitmapM3145d = m3145d(bxjVar, optionsM3146e, bxaVar2, bxbVar.f4685i);
                bxaVar2.mo3141a(bxbVar.f4685i, bitmapM3145d);
                if (bitmapM3145d != null) {
                    bitmapM3145d.setDensity(bxbVar.f4686j.densityDpi);
                    bti btiVar3 = bxbVar.f4685i;
                    if (bxq.m3173g(iMo3157a)) {
                        Matrix matrix = new Matrix();
                        switch (iMo3157a) {
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
                            case 6:
                                matrix.setRotate(90.0f);
                                break;
                            case 7:
                                matrix.setRotate(-90.0f);
                                matrix.postScale(-1.0f, 1.0f);
                                break;
                            case 8:
                                matrix.setRotate(-90.0f);
                                break;
                        }
                        RectF rectF = new RectF(0.0f, 0.0f, bitmapM3145d.getWidth(), bitmapM3145d.getHeight());
                        matrix.mapRect(rectF);
                        Bitmap bitmapMo3042a = btiVar3.mo3042a(Math.round(rectF.width()), Math.round(rectF.height()), bxq.m3168b(bitmapM3145d));
                        matrix.postTranslate(-rectF.left, -rectF.top);
                        bitmapMo3042a.setHasAlpha(bitmapM3145d.hasAlpha());
                        bxq.m3170d(bitmapM3145d, bitmapMo3042a, matrix);
                        bitmap2 = bitmapMo3042a;
                    } else {
                        bitmap2 = bitmapM3145d;
                    }
                    boolean zEquals = bitmapM3145d.equals(bitmap2);
                    bitmap = bitmap2;
                    if (!zEquals) {
                        bxbVar.f4685i.mo3045d(bitmapM3145d);
                        bitmap = bitmap2;
                    }
                } else {
                    bitmap = null;
                }
                bxk bxkVarM3162g = bxk.m3162g(bitmap, bxbVar.f4685i);
                m3147f(optionsM3146e);
                bxbVar.f4683f.mo3036c(bArr);
                return bxkVarM3162g;
            } catch (Throwable th3) {
                th = th3;
                bArr = bArr;
                m3147f(optionsM3146e);
                bxbVar.f4683f.mo3036c(bArr);
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            bxbVar = this;
        }
    }
}
