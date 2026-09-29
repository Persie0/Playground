package p000;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Looper;
import android.util.Pair;
import androidx.media3.common.C0713b;
import androidx.media3.exoplayer.audio.AudioOutputProvider$InitializationException;
import com.google.common.primitives.AbstractC1110a;
import java.math.RoundingMode;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class b00 {

    /* JADX INFO: renamed from: a */
    public final Context f7706a;

    /* JADX INFO: renamed from: b */
    public final o52 f7707b;

    /* JADX INFO: renamed from: c */
    public final b64 f7708c;

    /* JADX INFO: renamed from: d */
    public final qn3 f7709d;

    /* JADX INFO: renamed from: e */
    public final float f7710e;

    /* JADX INFO: renamed from: f */
    public vg5 f7711f;

    /* JADX INFO: renamed from: g */
    public mp9 f7712g;

    /* JADX INFO: renamed from: h */
    public C3627tx f7713h;

    /* JADX INFO: renamed from: i */
    public C3738wx f7714i;

    /* JADX INFO: renamed from: j */
    public Looper f7715j;

    /* JADX INFO: renamed from: k */
    public Context f7716k;

    public b00(a00 a00Var) {
        Context context = (Context) a00Var.f5b;
        this.f7706a = context;
        b64 b64Var = (b64) a00Var.f6c;
        b64Var.getClass();
        this.f7708c = b64Var;
        this.f7707b = (o52) a00Var.f7d;
        this.f7713h = (C3627tx) a00Var.f8e;
        this.f7709d = context == null ? null : new qn3(this);
        this.f7710e = a00Var.f4a;
        this.f7712g = mp9.f51705a;
    }

    /* JADX INFO: renamed from: a */
    public final C3851zz m3138a(C3776xy c3776xy) throws AudioOutputProvider$InitializationException {
        Context context;
        Context context2;
        try {
            int i = c3776xy.f68943h;
            int i2 = c3776xy.f68944i;
            if (i2 == -1 || (context2 = this.f7706a) == null || Build.VERSION.SDK_INT < 34) {
                context = null;
            } else {
                Context context3 = this.f7716k;
                if (context3 == null || context3.getDeviceId() != i2) {
                    this.f7716k = context2.createDeviceContext(i2);
                }
                context = this.f7716k;
                i = 0;
            }
            AudioTrack.Builder sessionId = new AudioTrack.Builder().setAudioAttributes(c3776xy.f68939d ? new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build() : c3776xy.f68942g.m19557a()).setAudioFormat(new AudioFormat.Builder().setSampleRate(c3776xy.f68937b).setChannelMask(c3776xy.f68938c).setEncoding(c3776xy.f68936a).build()).setTransferMode(1).setBufferSizeInBytes(c3776xy.f68941f).setSessionId(i);
            sessionId.setOffloadedPlayback(c3776xy.f68940e);
            if (Build.VERSION.SDK_INT >= 34 && context != null) {
                sessionId.setContext(context);
            }
            AudioTrack audioTrackBuild = sessionId.build();
            if (audioTrackBuild.getState() == 1) {
                return new C3851zz(audioTrackBuild, c3776xy, this.f7709d, this.f7710e, this.f7712g);
            }
            try {
                audioTrackBuild.release();
            } catch (Exception unused) {
            }
            throw new AudioOutputProvider$InitializationException();
        } catch (IllegalArgumentException | UnsupportedOperationException e) {
            throw new AudioOutputProvider$InitializationException(e);
        }
    }

    /* JADX INFO: renamed from: b */
    public final C3702vy m3139b(C3628ty c3628ty) {
        m3142e(c3628ty);
        C0713b c0713b = c3628ty.f63075a;
        C3476px c3476px = c3628ty.f63076b;
        C3591sy c3591syM3359l = this.f7708c.m3359l(c0713b, c3476px);
        C3665uy c3665uy = new C3665uy();
        String str = c0713b.f6406o;
        int i = c0713b.f6383I;
        int i2 = 0;
        if (!Objects.equals(str, "audio/raw") ? this.f7713h.m22333c(c0713b, c3476px) != null : i == 2) {
            i2 = 2;
        }
        c3665uy.m23005b(i2);
        c3665uy.m23006c(c3591syM3359l.f61574a);
        c3665uy.m23007d(c3591syM3359l.f61575b);
        c3665uy.m23008e(c3591syM3359l.f61576c);
        return c3665uy.m23004a();
    }

    /* JADX WARN: Code duplicated, block: B:22:0x008a  */
    /* JADX WARN: Code duplicated, block: B:23:0x008e  */
    /* JADX WARN: Code duplicated, block: B:25:0x0095  */
    /* JADX WARN: Code duplicated, block: B:26:0x0097  */
    /* JADX WARN: Code duplicated, block: B:30:0x009e  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:33:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:36:0x00b3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:37:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:39:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:41:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:44:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:47:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:48:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:50:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:51:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:54:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:56:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:58:0x0105  */
    /* JADX WARN: Code duplicated, block: B:59:0x0108  */
    /* JADX WARN: Code duplicated, block: B:61:0x0118  */
    /* JADX WARN: Code duplicated, block: B:65:0x0168  */
    /* JADX WARN: Code duplicated, block: B:66:0x016a  */
    /* JADX INFO: renamed from: c */
    public final C3776xy m3140c(C3628ty c3628ty) throws Exception {
        int iIntValue;
        int iM22819n;
        boolean z;
        char c;
        boolean z2;
        int i;
        int iMax;
        int minBufferSize;
        boolean z3;
        double d;
        boolean z4;
        int iM22812g;
        int iM22678b;
        boolean z5;
        int i2;
        int iM22678b2;
        boolean z6;
        boolean z7;
        boolean z8;
        C0713b c0713b = c3628ty.f63075a;
        boolean z9 = c3628ty.f63078d;
        C3476px c3476px = c3628ty.f63076b;
        m3142e(c3628ty);
        String str = c0713b.f6406o;
        int i3 = c0713b.f6382H;
        int iIntValue2 = c0713b.f6383I;
        int i4 = c0713b.f6381G;
        if (!Objects.equals(str, "audio/raw")) {
            C3591sy c3591syM3359l = z9 ? this.f7708c.m3359l(c0713b, c3476px) : C3591sy.f61573d;
            if (z9 && c3591syM3359l.f61574a) {
                str.getClass();
                int iM11392b = ez5.m11392b(str, c0713b.f6402k);
                int iM22818m = uma.m22818m(i4);
                boolean z10 = c3591syM3359l.f61575b;
                iIntValue2 = iM11392b;
                iIntValue = iM22818m;
                z = z10;
                iM22819n = -1;
                c = 1;
                z2 = true;
            } else {
                Pair pairM22333c = this.f7713h.m22333c(c0713b, c3476px);
                if (pairM22333c == null) {
                    final String str2 = "Unable to configure passthrough for: " + c0713b;
                    throw new Exception(str2) { // from class: androidx.media3.exoplayer.audio.AudioOutputProvider$ConfigurationException
                    };
                }
                iIntValue2 = ((Integer) pairM22333c.first).intValue();
                iIntValue = ((Integer) pairM22333c.second).intValue();
                iM22819n = -1;
                z = false;
                c = 2;
            }
            i = c0713b.f6401j;
            if (Objects.equals(str, "audio/vnd.dts.hd;profile=lbr") && i == -1) {
                i = 768000;
            }
            iMax = c3628ty.f63082h;
            if (iMax != -1) {
                z4 = true;
            } else {
                minBufferSize = AudioTrack.getMinBufferSize(i3, iIntValue, iIntValue2);
                if (minBufferSize != -2) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                bna.m3987z(z3);
                if (iM22819n == -1) {
                    iM22819n = 1;
                }
                if (z2) {
                    d = this.f7710e;
                } else {
                    d = 1.0d;
                }
                ((j13) this.f7707b).getClass();
                if (c != 0) {
                    z4 = true;
                    long j = i3;
                    long j2 = 250000 * j;
                    long j3 = iM22819n;
                    iM22812g = uma.m22812g(minBufferSize * 4, AbstractC1110a.m6362b((j2 * j3) / 1000000), AbstractC1110a.m6362b(((750000 * j) * j3) / 1000000));
                } else if (c != 1) {
                    z4 = true;
                    iM22678b = ucd.m22678b(iIntValue2);
                    if (iM22678b != -2147483647) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    bna.m3987z(z5);
                    iM22812g = AbstractC1110a.m6362b((50000000 * ((long) iM22678b)) / 1000000);
                } else {
                    if (c == 2) {
                        ij6.m13959q();
                        return null;
                    }
                    z4 = true;
                    if (iIntValue2 == 5) {
                        i2 = 500000;
                    } else if (iIntValue2 == 8) {
                        i2 = 1000000;
                    } else {
                        i2 = 250000;
                    }
                    if (i != -1) {
                        RoundingMode roundingMode = RoundingMode.CEILING;
                        iM22678b2 = ggd.m12592b(i, 8);
                    } else {
                        iM22678b2 = ucd.m22678b(iIntValue2);
                        if (iM22678b2 != -2147483647) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        bna.m3987z(z6);
                    }
                    iM22812g = AbstractC1110a.m6362b((((long) i2) * ((long) iM22678b2)) / 1000000);
                }
                iMax = (((Math.max(minBufferSize, (int) (((double) iM22812g) * d)) + iM22819n) - 1) / iM22819n) * iM22819n;
            }
            C3739wy c3739wy = new C3739wy();
            c3739wy.m24211i(i3);
            c3739wy.m24207e(iIntValue);
            c3739wy.m24208f(iIntValue2);
            c3739wy.m24206d(iMax);
            c3739wy.m24205c(c3628ty.f63079e);
            c3739wy.m24204b(c3476px);
            z7 = z4;
            if (c == z7) {
                z8 = z7;
            } else {
                z8 = false;
            }
            c3739wy.m24209g(z8);
            c3739wy.m24210h(c3628ty.f63081g);
            c3739wy.m24213k(z2);
            c3739wy.m24212j(z);
            c3739wy.m24214l(c3628ty.f63080f);
            return c3739wy.m24203a();
        }
        bna.m3969q(uma.m22830y(iIntValue2));
        iIntValue = uma.m22818m(i4);
        iM22819n = uma.m22819n(iIntValue2) * i4;
        z = false;
        c = 0;
        z2 = false;
        i = c0713b.f6401j;
        if (Objects.equals(str, "audio/vnd.dts.hd;profile=lbr")) {
            i = 768000;
        }
        iMax = c3628ty.f63082h;
        if (iMax != -1) {
            z4 = true;
        } else {
            minBufferSize = AudioTrack.getMinBufferSize(i3, iIntValue, iIntValue2);
            if (minBufferSize != -2) {
                z3 = true;
            } else {
                z3 = false;
            }
            bna.m3987z(z3);
            if (iM22819n == -1) {
                iM22819n = 1;
            }
            if (z2) {
                d = this.f7710e;
            } else {
                d = 1.0d;
            }
            ((j13) this.f7707b).getClass();
            if (c != 0) {
                z4 = true;
                long j4 = i3;
                long j5 = 250000 * j4;
                long j6 = iM22819n;
                iM22812g = uma.m22812g(minBufferSize * 4, AbstractC1110a.m6362b((j5 * j6) / 1000000), AbstractC1110a.m6362b(((750000 * j4) * j6) / 1000000));
            } else if (c != 1) {
                z4 = true;
                iM22678b = ucd.m22678b(iIntValue2);
                if (iM22678b != -2147483647) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                bna.m3987z(z5);
                iM22812g = AbstractC1110a.m6362b((50000000 * ((long) iM22678b)) / 1000000);
            } else {
                if (c == 2) {
                    ij6.m13959q();
                    return null;
                }
                z4 = true;
                if (iIntValue2 == 5) {
                    i2 = 500000;
                } else if (iIntValue2 == 8) {
                    i2 = 1000000;
                } else {
                    i2 = 250000;
                }
                if (i != -1) {
                    RoundingMode roundingMode2 = RoundingMode.CEILING;
                    iM22678b2 = ggd.m12592b(i, 8);
                } else {
                    iM22678b2 = ucd.m22678b(iIntValue2);
                    if (iM22678b2 != -2147483647) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    bna.m3987z(z6);
                }
                iM22812g = AbstractC1110a.m6362b((((long) i2) * ((long) iM22678b2)) / 1000000);
            }
            iMax = (((Math.max(minBufferSize, (int) (((double) iM22812g) * d)) + iM22819n) - 1) / iM22819n) * iM22819n;
        }
        C3739wy c3739wy2 = new C3739wy();
        c3739wy2.m24211i(i3);
        c3739wy2.m24207e(iIntValue);
        c3739wy2.m24208f(iIntValue2);
        c3739wy2.m24206d(iMax);
        c3739wy2.m24205c(c3628ty.f63079e);
        c3739wy2.m24204b(c3476px);
        z7 = z4;
        if (c == z7) {
            z8 = z7;
        } else {
            z8 = false;
        }
        c3739wy2.m24209g(z8);
        c3739wy2.m24210h(c3628ty.f63081g);
        c3739wy2.m24213k(z2);
        c3739wy2.m24212j(z);
        c3739wy2.m24214l(c3628ty.f63080f);
        return c3739wy2.m24203a();
    }

    /* JADX INFO: renamed from: d */
    public final void m3141d() {
        vg5 vg5Var = this.f7711f;
        if (vg5Var != null) {
            if (vg5Var.f65353i) {
                bna.m3987z(Thread.currentThread() == vg5Var.f65345a);
            }
            synchronized (vg5Var.f65351g) {
                vg5Var.f65352h = true;
            }
            for (ug5 ug5Var : vg5Var.f65348d) {
                tg5 tg5Var = vg5Var.f65347c;
                ug5Var.f63889d = true;
                if (tg5Var != null && ug5Var.f63888c) {
                    ug5Var.f63888c = false;
                    tg5Var.mo13388b(ug5Var.f63886a, ug5Var.f63887b.m24469b());
                }
            }
            vg5Var.f65348d.clear();
        }
        C3738wx c3738wx = this.f7714i;
        if (c3738wx != null) {
            c3738wx.m24190f();
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m3142e(C3628ty c3628ty) {
        Context context;
        AudioDeviceInfo audioDeviceInfo = c3628ty.f63077c;
        C3476px c3476px = c3628ty.f63076b;
        m3143f();
        C3738wx c3738wx = this.f7714i;
        if (c3738wx == null && (context = this.f7706a) != null) {
            C3738wx c3738wx2 = new C3738wx(context, new C3440oy(this, 1), c3476px, audioDeviceInfo);
            this.f7714i = c3738wx2;
            this.f7713h = c3738wx2.m24187c();
        } else if (c3738wx != null) {
            if (audioDeviceInfo != null) {
                c3738wx.m24189e(audioDeviceInfo);
            }
            this.f7714i.m24188d(c3476px);
        }
        this.f7713h.getClass();
    }

    /* JADX INFO: renamed from: f */
    public final void m3143f() {
        if (this.f7706a == null) {
            return;
        }
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = this.f7715j;
        boolean z = looper == null || looper == looperMyLooper;
        String name = looper == null ? "null" : looper.getThread().getName();
        String name2 = looperMyLooper != null ? looperMyLooper.getThread().getName() : "null";
        if (z) {
            this.f7715j = looperMyLooper;
        } else {
            C3386nv.m17633t(b34.m3207B("AudioTrackAudioOutputProvider accessed on multiple threads: %s and %s", name, name2));
        }
    }
}
