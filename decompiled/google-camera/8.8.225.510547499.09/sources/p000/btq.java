package p000;

import android.graphics.Bitmap;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.NavigableMap;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class btq implements bti {

    /* JADX INFO: renamed from: a */
    private static final Bitmap.Config f4444a = Bitmap.Config.ARGB_8888;

    /* JADX INFO: renamed from: b */
    private final btr f4445b;

    /* JADX INFO: renamed from: c */
    private final Set f4446c;

    /* JADX INFO: renamed from: d */
    private final long f4447d;

    /* JADX INFO: renamed from: e */
    private long f4448e;

    /* JADX INFO: renamed from: f */
    private int f4449f;

    /* JADX INFO: renamed from: g */
    private int f4450g;

    /* JADX INFO: renamed from: h */
    private int f4451h;

    /* JADX INFO: renamed from: i */
    private int f4452i;

    public btq(long j) {
        btw btwVar = new btw();
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        hashSet.add(null);
        hashSet.remove(Bitmap.Config.HARDWARE);
        Set setUnmodifiableSet = Collections.unmodifiableSet(hashSet);
        this.f4447d = j;
        this.f4445b = btwVar;
        this.f4446c = setUnmodifiableSet;
    }

    /* JADX INFO: renamed from: f */
    private static Bitmap m3061f(int i, int i2, Bitmap.Config config) {
        if (config == null) {
            config = f4444a;
        }
        return Bitmap.createBitmap(i, i2, config);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0078 A[Catch: all -> 0x00ec, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0005, B:7:0x0009, B:8:0x000b, B:10:0x0026, B:19:0x0045, B:21:0x0048, B:23:0x005d, B:25:0x0065, B:31:0x0071, B:34:0x0078, B:35:0x008e, B:37:0x0092, B:39:0x009f, B:41:0x00af, B:42:0x00b5, B:11:0x0029, B:12:0x0031, B:13:0x0034, B:18:0x0043, B:14:0x0037, B:15:0x003a, B:16:0x003d, B:17:0x0040, B:45:0x00cc, B:46:0x00eb), top: B:52:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x009f A[Catch: all -> 0x00ec, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0005, B:7:0x0009, B:8:0x000b, B:10:0x0026, B:19:0x0045, B:21:0x0048, B:23:0x005d, B:25:0x0065, B:31:0x0071, B:34:0x0078, B:35:0x008e, B:37:0x0092, B:39:0x009f, B:41:0x00af, B:42:0x00b5, B:11:0x0029, B:12:0x0031, B:13:0x0034, B:18:0x0043, B:14:0x0037, B:15:0x003a, B:16:0x003d, B:17:0x0040, B:45:0x00cc, B:46:0x00eb), top: B:52:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00af A[Catch: all -> 0x00ec, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0005, B:7:0x0009, B:8:0x000b, B:10:0x0026, B:19:0x0045, B:21:0x0048, B:23:0x005d, B:25:0x0065, B:31:0x0071, B:34:0x0078, B:35:0x008e, B:37:0x0092, B:39:0x009f, B:41:0x00af, B:42:0x00b5, B:11:0x0029, B:12:0x0031, B:13:0x0034, B:18:0x0043, B:14:0x0037, B:15:0x003a, B:16:0x003d, B:17:0x0040, B:45:0x00cc, B:46:0x00eb), top: B:52:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00b5 A[Catch: all -> 0x00ec, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0005, B:7:0x0009, B:8:0x000b, B:10:0x0026, B:19:0x0045, B:21:0x0048, B:23:0x005d, B:25:0x0065, B:31:0x0071, B:34:0x0078, B:35:0x008e, B:37:0x0092, B:39:0x009f, B:41:0x00af, B:42:0x00b5, B:11:0x0029, B:12:0x0031, B:13:0x0034, B:18:0x0043, B:14:0x0037, B:15:0x003a, B:16:0x003d, B:17:0x0040, B:45:0x00cc, B:46:0x00eb), top: B:52:0x0001 }] */
    /* JADX INFO: renamed from: g */
    private final synchronized Bitmap m3062g(int i, int i2, Bitmap.Config config) {
        Bitmap.Config[] configArr;
        Bitmap bitmap;
        if (config == Bitmap.Config.HARDWARE) {
            throw new IllegalArgumentException("Cannot create a mutable Bitmap with config: " + String.valueOf(config) + ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
        }
        btr btrVar = this.f4445b;
        if (config == null) {
            config = f4444a;
        }
        int iM3381b = i * i2 * cbi.m3381b(config);
        btu btuVarM3064d = ((btw) btrVar).f4462f.m3064d(iM3381b, config);
        if (!Bitmap.Config.RGBA_F16.equals(config)) {
            switch (btt.f4453a[config.ordinal()]) {
                case 1:
                    configArr = btw.f4457a;
                    break;
                case 2:
                    configArr = btw.f4459c;
                    break;
                case 3:
                    configArr = btw.f4460d;
                    break;
                case 4:
                    configArr = btw.f4461e;
                    break;
                default:
                    configArr = new Bitmap.Config[1];
                    configArr[0] = config;
                    break;
            }
        } else {
            configArr = btw.f4458b;
        }
        for (Bitmap.Config config2 : configArr) {
            Integer num = (Integer) ((btw) btrVar).m3066b(config2).ceilingKey(Integer.valueOf(iM3381b));
            if (num != null) {
                if (num.intValue() <= iM3381b * 8) {
                    if (num.intValue() != iM3381b) {
                        ((btw) btrVar).f4462f.m3041c(btuVarM3064d);
                        btuVarM3064d = ((btw) btrVar).f4462f.m3064d(num.intValue(), config2);
                    } else if (config2 == null) {
                        if (config != null) {
                            ((btw) btrVar).f4462f.m3041c(btuVarM3064d);
                            btuVarM3064d = ((btw) btrVar).f4462f.m3064d(num.intValue(), config2);
                        }
                    } else if (!config2.equals(config)) {
                        ((btw) btrVar).f4462f.m3041c(btuVarM3064d);
                        btuVarM3064d = ((btw) btrVar).f4462f.m3064d(num.intValue(), config2);
                    }
                    bitmap = (Bitmap) ((btw) btrVar).f4463g.m3051a(btuVarM3064d);
                    if (bitmap != null) {
                        ((btw) btrVar).m3067c(Integer.valueOf(btuVarM3064d.f4454a), bitmap);
                        bitmap.reconfigure(i, i2, config);
                    }
                    if (bitmap == null) {
                        this.f4450g++;
                    } else {
                        this.f4449f++;
                        this.f4448e -= (long) cbi.m3380a(bitmap);
                        bitmap.setHasAlpha(true);
                        bitmap.setPremultiplied(true);
                    }
                }
            }
        }
        bitmap = (Bitmap) ((btw) btrVar).f4463g.m3051a(btuVarM3064d);
        if (bitmap != null) {
            ((btw) btrVar).m3067c(Integer.valueOf(btuVarM3064d.f4454a), bitmap);
            bitmap.reconfigure(i, i2, config);
        }
        if (bitmap == null) {
            this.f4450g++;
        } else {
            this.f4449f++;
            this.f4448e -= (long) cbi.m3380a(bitmap);
            bitmap.setHasAlpha(true);
            bitmap.setPremultiplied(true);
        }
        return bitmap;
    }

    /* JADX INFO: renamed from: h */
    private final synchronized void m3063h(long j) {
        while (this.f4448e > j) {
            btr btrVar = this.f4445b;
            Bitmap bitmap = (Bitmap) ((btw) btrVar).f4463g.m3052b();
            if (bitmap != null) {
                ((btw) btrVar).m3067c(Integer.valueOf(cbi.m3380a(bitmap)), bitmap);
            }
            if (bitmap == null) {
                if (Log.isLoggable("LruBitmapPool", 5)) {
                    Log.w("LruBitmapPool", "Size mismatch, resetting");
                    this.f4445b.toString();
                }
                this.f4448e = 0L;
                return;
            }
            this.f4448e -= (long) cbi.m3380a(bitmap);
            this.f4452i++;
            bitmap.recycle();
        }
    }

    @Override // p000.bti
    /* JADX INFO: renamed from: a */
    public final Bitmap mo3042a(int i, int i2, Bitmap.Config config) {
        Bitmap bitmapM3062g = m3062g(i, i2, config);
        if (bitmapM3062g == null) {
            return m3061f(i, i2, config);
        }
        bitmapM3062g.eraseColor(0);
        return bitmapM3062g;
    }

    @Override // p000.bti
    /* JADX INFO: renamed from: b */
    public final Bitmap mo3043b(int i, int i2, Bitmap.Config config) {
        Bitmap bitmapM3062g = m3062g(i, i2, config);
        return bitmapM3062g == null ? m3061f(i, i2, config) : bitmapM3062g;
    }

    @Override // p000.bti
    /* JADX INFO: renamed from: c */
    public final void mo3044c() {
        m3063h(0L);
    }

    @Override // p000.bti
    /* JADX INFO: renamed from: d */
    public final synchronized void mo3045d(Bitmap bitmap) {
        try {
            if (bitmap == null) {
                throw new NullPointerException("Bitmap must not be null");
            }
            if (bitmap.isRecycled()) {
                throw new IllegalStateException("Cannot pool recycled bitmap");
            }
            if (bitmap.isMutable() && cbi.m3380a(bitmap) <= this.f4447d && this.f4446c.contains(bitmap.getConfig())) {
                int iM3380a = cbi.m3380a(bitmap);
                btr btrVar = this.f4445b;
                btu btuVarM3064d = ((btw) btrVar).f4462f.m3064d(cbi.m3380a(bitmap), bitmap.getConfig());
                ((btw) btrVar).f4463g.m3053c(btuVarM3064d, bitmap);
                NavigableMap navigableMapM3066b = ((btw) btrVar).m3066b(bitmap.getConfig());
                Integer num = (Integer) navigableMapM3066b.get(Integer.valueOf(btuVarM3064d.f4454a));
                navigableMapM3066b.put(Integer.valueOf(btuVarM3064d.f4454a), Integer.valueOf(num == null ? 1 : num.intValue() + 1));
                this.f4451h++;
                this.f4448e += (long) iM3380a;
                m3063h(this.f4447d);
                return;
            }
            bitmap.recycle();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p000.bti
    /* JADX INFO: renamed from: e */
    public final void mo3046e(int i) {
        if (i >= 40 || i >= 20) {
            mo3044c();
        } else if (i == 15) {
            m3063h(this.f4447d >> 1);
        }
    }
}
