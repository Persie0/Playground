package p407u5;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import p258m6.C7492l;

/* JADX INFO: renamed from: u5.i */
/* JADX INFO: loaded from: classes.dex */
public final class C9458i implements InterfaceC9452c {

    /* JADX INFO: renamed from: j */
    public static final Bitmap.Config f48462j = Bitmap.Config.ARGB_8888;

    /* JADX INFO: renamed from: a */
    public final InterfaceC9459j f48463a;

    /* JADX INFO: renamed from: b */
    public final Set<Bitmap.Config> f48464b;

    /* JADX INFO: renamed from: c */
    public final a f48465c;

    /* JADX INFO: renamed from: d */
    public final long f48466d;

    /* JADX INFO: renamed from: e */
    public long f48467e;

    /* JADX INFO: renamed from: f */
    public int f48468f;

    /* JADX INFO: renamed from: g */
    public int f48469g;

    /* JADX INFO: renamed from: h */
    public int f48470h;

    /* JADX INFO: renamed from: i */
    public int f48471i;

    /* JADX INFO: renamed from: u5.i$a */
    public static final class a {
    }

    public C9458i(long j10) {
        C9461l c9461l = new C9461l();
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        hashSet.add(null);
        hashSet.remove(Bitmap.Config.HARDWARE);
        Set<Bitmap.Config> setUnmodifiableSet = Collections.unmodifiableSet(hashSet);
        this.f48466d = j10;
        this.f48463a = c9461l;
        this.f48464b = setUnmodifiableSet;
        this.f48465c = new a();
    }

    @Override // p407u5.InterfaceC9452c
    @SuppressLint({"InlinedApi"})
    /* JADX INFO: renamed from: a */
    public final void mo17854a(int i10) {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "trimMemory, level=" + i10);
        }
        if (i10 < 40 && i10 < 20) {
            if (i10 >= 20 || i10 == 15) {
                m17869h(this.f48466d / 2);
                return;
            }
            return;
        }
        mo17855b();
    }

    @Override // p407u5.InterfaceC9452c
    /* JADX INFO: renamed from: b */
    public final void mo17855b() {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "clearMemory");
        }
        m17869h(0L);
    }

    @Override // p407u5.InterfaceC9452c
    /* JADX INFO: renamed from: c */
    public final Bitmap mo17856c(int i10, int i11, Bitmap.Config config) {
        Bitmap bitmapM17868g = m17868g(i10, i11, config);
        if (bitmapM17868g != null) {
            return bitmapM17868g;
        }
        if (config == null) {
            config = f48462j;
        }
        return Bitmap.createBitmap(i10, i11, config);
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // p407u5.InterfaceC9452c
    /* JADX INFO: renamed from: d */
    public final synchronized void mo164d(Bitmap bitmap) {
        try {
            if (bitmap == null) {
                throw new NullPointerException("Bitmap must not be null");
            }
            if (bitmap.isRecycled()) {
                throw new IllegalStateException("Cannot pool recycled bitmap");
            }
            if (bitmap.isMutable()) {
                ((C9461l) this.f48463a).getClass();
                if (C7492l.m14882c(bitmap) <= this.f48466d && this.f48464b.contains(bitmap.getConfig())) {
                    ((C9461l) this.f48463a).getClass();
                    int iM14882c = C7492l.m14882c(bitmap);
                    ((C9461l) this.f48463a).m17875f(bitmap);
                    this.f48465c.getClass();
                    this.f48470h++;
                    this.f48467e += (long) iM14882c;
                    if (Log.isLoggable("LruBitmapPool", 2)) {
                        Log.v("LruBitmapPool", "Put bitmap in pool=" + ((C9461l) this.f48463a).m17874e(bitmap));
                    }
                    if (Log.isLoggable("LruBitmapPool", 2)) {
                        m17867f();
                    }
                    m17869h(this.f48466d);
                    return;
                }
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                Log.v("LruBitmapPool", "Reject bitmap from pool, bitmap: " + ((C9461l) this.f48463a).m17874e(bitmap) + ", is mutable: " + bitmap.isMutable() + ", is allowed config: " + this.f48464b.contains(bitmap.getConfig()));
            }
            bitmap.recycle();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // p407u5.InterfaceC9452c
    /* JADX INFO: renamed from: e */
    public final Bitmap mo17857e(int i10, int i11, Bitmap.Config config) {
        Bitmap bitmapM17868g = m17868g(i10, i11, config);
        if (bitmapM17868g != null) {
            bitmapM17868g.eraseColor(0);
            return bitmapM17868g;
        }
        if (config == null) {
            config = f48462j;
        }
        return Bitmap.createBitmap(i10, i11, config);
    }

    /* JADX INFO: renamed from: f */
    public final void m17867f() {
        Log.v("LruBitmapPool", "Hits=" + this.f48468f + ", misses=" + this.f48469g + ", puts=" + this.f48470h + ", evictions=" + this.f48471i + ", currentSize=" + this.f48467e + ", maxSize=" + this.f48466d + "\nStrategy=" + this.f48463a);
    }

    /* JADX INFO: renamed from: g */
    public final synchronized Bitmap m17868g(int i10, int i11, Bitmap.Config config) {
        Bitmap bitmapM17872b;
        int i12;
        try {
            if (config == Bitmap.Config.HARDWARE) {
                throw new IllegalArgumentException("Cannot create a mutable Bitmap with config: " + config + ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
            }
            bitmapM17872b = ((C9461l) this.f48463a).m17872b(i10, i11, config != null ? config : f48462j);
            int i13 = 8;
            if (bitmapM17872b == null) {
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    StringBuilder sb2 = new StringBuilder("Missing bitmap=");
                    ((C9461l) this.f48463a).getClass();
                    char[] cArr = C7492l.f41383a;
                    int i14 = i10 * i11;
                    int i15 = C7492l.a.f41386a[(config == null ? Bitmap.Config.ARGB_8888 : config).ordinal()];
                    if (i15 == 1) {
                        i12 = 1;
                    } else if (i15 == 2 || i15 == 3) {
                        i12 = 2;
                    } else {
                        i12 = i15 != 4 ? 4 : 8;
                    }
                    sb2.append(C9461l.m17870c(i12 * i14, config));
                    Log.d("LruBitmapPool", sb2.toString());
                }
                this.f48469g++;
            } else {
                this.f48468f++;
                long j10 = this.f48467e;
                ((C9461l) this.f48463a).getClass();
                this.f48467e = j10 - ((long) C7492l.m14882c(bitmapM17872b));
                this.f48465c.getClass();
                bitmapM17872b.setHasAlpha(true);
                bitmapM17872b.setPremultiplied(true);
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                StringBuilder sb3 = new StringBuilder("Get bitmap=");
                ((C9461l) this.f48463a).getClass();
                char[] cArr2 = C7492l.f41383a;
                int i16 = i10 * i11;
                int i17 = C7492l.a.f41386a[(config == null ? Bitmap.Config.ARGB_8888 : config).ordinal()];
                if (i17 == 1) {
                    i13 = 1;
                } else if (i17 == 2 || i17 == 3) {
                    i13 = 2;
                } else if (i17 != 4) {
                    i13 = 4;
                }
                sb3.append(C9461l.m17870c(i13 * i16, config));
                Log.v("LruBitmapPool", sb3.toString());
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                m17867f();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return bitmapM17872b;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: h */
    public final synchronized void m17869h(long j10) {
        while (this.f48467e > j10) {
            try {
                C9461l c9461l = (C9461l) this.f48463a;
                Bitmap bitmapM17860c = c9461l.f48478b.m17860c();
                if (bitmapM17860c != null) {
                    c9461l.m17871a(Integer.valueOf(C7492l.m14882c(bitmapM17860c)), bitmapM17860c);
                }
                if (bitmapM17860c == null) {
                    if (Log.isLoggable("LruBitmapPool", 5)) {
                        Log.w("LruBitmapPool", "Size mismatch, resetting");
                        m17867f();
                    }
                    this.f48467e = 0L;
                    return;
                }
                this.f48465c.getClass();
                long j11 = this.f48467e;
                ((C9461l) this.f48463a).getClass();
                this.f48467e = j11 - ((long) C7492l.m14882c(bitmapM17860c));
                this.f48471i++;
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    Log.d("LruBitmapPool", "Evicting bitmap=" + ((C9461l) this.f48463a).m17874e(bitmapM17860c));
                }
                if (Log.isLoggable("LruBitmapPool", 2)) {
                    m17867f();
                }
                bitmapM17860c.recycle();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
