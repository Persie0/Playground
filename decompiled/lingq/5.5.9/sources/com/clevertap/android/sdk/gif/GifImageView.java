package com.clevertap.android.sdk.gif;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import p332q5.C8496c;
import p393t6.C9211a;
import p393t6.C9212b;

/* JADX INFO: loaded from: classes.dex */
public class GifImageView extends AppCompatImageView implements Runnable {

    /* JADX INFO: renamed from: H */
    public final RunnableC2190b f11066H;

    /* JADX INFO: renamed from: d */
    public boolean f11067d;

    /* JADX INFO: renamed from: e */
    public Thread f11068e;

    /* JADX INFO: renamed from: f */
    public long f11069f;

    /* JADX INFO: renamed from: g */
    public C9211a f11070g;

    /* JADX INFO: renamed from: h */
    public final Handler f11071h;

    /* JADX INFO: renamed from: i */
    public boolean f11072i;

    /* JADX INFO: renamed from: j */
    public boolean f11073j;

    /* JADX INFO: renamed from: k */
    public Bitmap f11074k;

    /* JADX INFO: renamed from: l */
    public final RunnableC2189a f11075l;

    /* JADX INFO: renamed from: com.clevertap.android.sdk.gif.GifImageView$a */
    public class RunnableC2189a implements Runnable {
        public RunnableC2189a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            GifImageView gifImageView = GifImageView.this;
            gifImageView.f11074k = null;
            gifImageView.f11070g = null;
            gifImageView.f11068e = null;
            gifImageView.f11073j = false;
        }
    }

    /* JADX INFO: renamed from: com.clevertap.android.sdk.gif.GifImageView$b */
    public class RunnableC2190b implements Runnable {
        public RunnableC2190b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            GifImageView gifImageView = GifImageView.this;
            Bitmap bitmap = gifImageView.f11074k;
            if (bitmap == null || bitmap.isRecycled()) {
                return;
            }
            gifImageView.setImageBitmap(gifImageView.f11074k);
            gifImageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        }
    }

    /* JADX INFO: renamed from: com.clevertap.android.sdk.gif.GifImageView$c */
    public interface InterfaceC2191c {
    }

    /* JADX INFO: renamed from: com.clevertap.android.sdk.gif.GifImageView$d */
    public interface InterfaceC2192d {
    }

    /* JADX INFO: renamed from: com.clevertap.android.sdk.gif.GifImageView$e */
    public interface InterfaceC2193e {
    }

    public GifImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f11069f = -1L;
        this.f11071h = new Handler(Looper.getMainLooper());
        this.f11075l = new RunnableC2189a();
        this.f11066H = new RunnableC2190b();
    }

    /* JADX INFO: renamed from: c */
    public final void m6485c() {
        this.f11072i = false;
        this.f11073j = true;
        this.f11067d = false;
        Thread thread = this.f11068e;
        if (thread != null) {
            thread.interrupt();
            this.f11068e = null;
        }
        this.f11071h.post(this.f11075l);
    }

    /* JADX INFO: renamed from: d */
    public final void m6486d() {
        if ((this.f11067d || this.f11072i) && this.f11070g != null && this.f11068e == null) {
            Thread thread = new Thread(this);
            this.f11068e = thread;
            thread.start();
        }
    }

    public int getFrameCount() {
        return this.f11070g.f47788g.f45706c;
    }

    public long getFramesDisplayDuration() {
        return this.f11069f;
    }

    public int getGifHeight() {
        return this.f11070g.f47788g.f45711h;
    }

    public int getGifWidth() {
        return this.f11070g.f47788g.f45714k;
    }

    public InterfaceC2192d getOnAnimationStop() {
        return null;
    }

    public InterfaceC2193e getOnFrameAvailable() {
        return null;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m6485c();
    }

    @Override // java.lang.Runnable
    public final void run() {
        Handler handler;
        boolean z10;
        long jNanoTime;
        int i10;
        do {
            boolean z11 = this.f11067d;
            handler = this.f11071h;
            if (!z11 && !this.f11072i) {
                break;
            }
            C9211a c9211a = this.f11070g;
            C8496c c8496c = c9211a.f47788g;
            int i11 = c8496c.f45706c;
            int i12 = -1;
            int i13 = 0;
            try {
                try {
                    if (i11 > 0) {
                        int i14 = c9211a.f47787f;
                        z10 = true;
                        if (i14 == i11 - 1) {
                            c9211a.f47790i++;
                        }
                        int i15 = c8496c.f45712i;
                        if (i15 == -1 || c9211a.f47790i <= i15) {
                            c9211a.f47787f = (i14 + 1) % i11;
                        }
                        long jNanoTime2 = System.nanoTime();
                        this.f11074k = this.f11070g.m17550c();
                        jNanoTime = (System.nanoTime() - jNanoTime2) / 1000000;
                        handler.post(this.f11066H);
                        this.f11072i = false;
                        if (this.f11067d || !z10) {
                            this.f11067d = false;
                            break;
                        }
                        try {
                            C9211a c9211a2 = this.f11070g;
                            C8496c c8496c2 = c9211a2.f47788g;
                            int i16 = c8496c2.f45706c;
                            if (i16 > 0 && (i10 = c9211a2.f47787f) >= 0) {
                                if (i10 >= 0 && i10 < i16) {
                                    i12 = ((C9212b) c8496c2.f45707d.get(i10)).f47807b;
                                }
                                i13 = i12;
                            }
                            int i17 = (int) (((long) i13) - jNanoTime);
                            if (i17 > 0) {
                                long j10 = this.f11069f;
                                if (j10 <= 0) {
                                    j10 = i17;
                                }
                                Thread.sleep(j10);
                            }
                        } catch (InterruptedException unused) {
                        }
                    }
                    handler.post(this.f11066H);
                } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException unused2) {
                }
                long jNanoTime3 = System.nanoTime();
                this.f11074k = this.f11070g.m17550c();
                jNanoTime = (System.nanoTime() - jNanoTime3) / 1000000;
            } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException unused3) {
                jNanoTime = 0;
            }
            z10 = false;
            this.f11072i = false;
            if (this.f11067d) {
            }
            this.f11067d = false;
            break;
        } while (this.f11067d);
        if (this.f11073j) {
            handler.post(this.f11075l);
        }
        this.f11068e = null;
    }

    public void setBytes(byte[] bArr) {
        boolean z10;
        C9211a c9211a = new C9211a();
        this.f11070g = c9211a;
        try {
            c9211a.m17551d(bArr);
            boolean z11 = this.f11067d;
            if (z11) {
                m6486d();
                return;
            }
            C9211a c9211a2 = this.f11070g;
            if (c9211a2.f47787f == 0) {
                return;
            }
            if (-1 >= c9211a2.f47788g.f45706c) {
                z10 = false;
            } else {
                c9211a2.f47787f = -1;
                z10 = true;
            }
            if (!z10 || z11) {
                return;
            }
            this.f11072i = true;
            m6486d();
        } catch (Exception unused) {
            this.f11070g = null;
        }
    }

    public void setFramesDisplayDuration(long j10) {
        this.f11069f = j10;
    }

    public void setOnAnimationStart(InterfaceC2191c interfaceC2191c) {
    }

    public void setOnAnimationStop(InterfaceC2192d interfaceC2192d) {
    }

    public void setOnFrameAvailable(InterfaceC2193e interfaceC2193e) {
    }
}
