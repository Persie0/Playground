package p000;

import android.graphics.Bitmap;
import androidx.media3.common.C0713b;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.image.ImageDecoderException;
import androidx.media3.exoplayer.image.ImageOutput;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes.dex */
public final class c04 extends y90 {

    /* JADX INFO: renamed from: N */
    public final C3002fi f9249N;

    /* JADX INFO: renamed from: O */
    public final m32 f9250O;

    /* JADX INFO: renamed from: P */
    public final ArrayDeque f9251P;

    /* JADX INFO: renamed from: Q */
    public boolean f9252Q;

    /* JADX INFO: renamed from: R */
    public boolean f9253R;

    /* JADX INFO: renamed from: S */
    public a04 f9254S;

    /* JADX INFO: renamed from: T */
    public long f9255T;

    /* JADX INFO: renamed from: U */
    public long f9256U;

    /* JADX INFO: renamed from: V */
    public int f9257V;

    /* JADX INFO: renamed from: W */
    public int f9258W;

    /* JADX INFO: renamed from: X */
    public C0713b f9259X;

    /* JADX INFO: renamed from: Y */
    public ed0 f9260Y;

    /* JADX INFO: renamed from: Z */
    public m32 f9261Z;

    /* JADX INFO: renamed from: a0 */
    public ImageOutput f9262a0;

    /* JADX INFO: renamed from: b0 */
    public Bitmap f9263b0;

    /* JADX INFO: renamed from: c0 */
    public boolean f9264c0;

    /* JADX INFO: renamed from: d0 */
    public b04 f9265d0;

    /* JADX INFO: renamed from: e0 */
    public b04 f9266e0;

    /* JADX INFO: renamed from: f0 */
    public int f9267f0;

    /* JADX INFO: renamed from: g0 */
    public boolean f9268g0;

    public c04(C3002fi c3002fi) {
        super(4);
        this.f9249N = c3002fi;
        this.f9262a0 = ImageOutput.f6454a;
        this.f9250O = new m32(0);
        this.f9254S = a04.f19c;
        this.f9251P = new ArrayDeque();
        this.f9256U = -9223372036854775807L;
        this.f9255T = -9223372036854775807L;
        this.f9257V = 0;
        this.f9258W = 1;
    }

    @Override // p000.y90
    /* JADX INFO: renamed from: D */
    public final int mo4251D(C0713b c0713b) {
        this.f9249N.getClass();
        return C3002fi.m11838d(c0713b);
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0087  */
    /* JADX WARN: Code duplicated, block: B:46:0x008b  */
    /* JADX WARN: Code duplicated, block: B:47:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:51:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:52:0x00df  */
    /* JADX WARN: Code duplicated, block: B:55:0x00e4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:56:0x00e6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:57:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:72:0x012c  */
    /* JADX WARN: Code duplicated, block: B:74:0x0147  */
    /* JADX INFO: renamed from: G */
    public final boolean m4252G(long j) throws ExoPlaybackException {
        boolean z;
        boolean z2;
        int i;
        int iM3146c;
        int i2;
        C0713b c0713b;
        b04 b04Var;
        Bitmap bitmapCreateBitmap;
        Bitmap bitmap = this.f9263b0;
        if ((bitmap == null || this.f9265d0 != null) && (this.f9258W != 0 || this.f69502h == 2)) {
            ArrayDeque arrayDeque = this.f9251P;
            if (bitmap == null) {
                this.f9260Y.getClass();
                dd0 dd0VarL = this.f9260Y.m17832l();
                if (dd0VarL != null) {
                    if (!dd0VarL.m3751d(4)) {
                        bna.m3979v(dd0VarL.f35416e, "Non-EOS buffer came back from the decoder without bitmap.");
                        this.f9263b0 = dd0VarL.f35416e;
                        dd0VarL.mo10292m();
                        if (this.f9264c0 && this.f9263b0 != null && this.f9265d0 != null) {
                            this.f9259X.getClass();
                            C0713b c0713b2 = this.f9259X;
                            int i3 = c0713b2.f6388N;
                            int i4 = c0713b2.f6389O;
                            z = ((i3 != 1 && i4 == 1) || i3 == -1 || i4 == -1) ? false : true;
                            if (!this.f9265d0.m3147d()) {
                                b04Var = this.f9265d0;
                                if (z) {
                                    int iM3146c2 = b04Var.m3146c();
                                    this.f9263b0.getClass();
                                    int width = this.f9263b0.getWidth();
                                    C0713b c0713b3 = this.f9259X;
                                    c0713b3.getClass();
                                    int i5 = width / c0713b3.f6388N;
                                    int height = this.f9263b0.getHeight();
                                    C0713b c0713b4 = this.f9259X;
                                    c0713b4.getClass();
                                    int i6 = height / c0713b4.f6389O;
                                    int i7 = this.f9259X.f6388N;
                                    bitmapCreateBitmap = Bitmap.createBitmap(this.f9263b0, (iM3146c2 % i7) * i5, (iM3146c2 / i7) * i6, i5, i6);
                                } else {
                                    bitmapCreateBitmap = this.f9263b0;
                                    bitmapCreateBitmap.getClass();
                                }
                                b04Var.m3148e(bitmapCreateBitmap);
                            }
                            Bitmap bitmapM3145b = this.f9265d0.m3145b();
                            bitmapM3145b.getClass();
                            long jM3144a = this.f9265d0.m3144a();
                            long j2 = jM3144a - j;
                            if (this.f69502h == 2) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            i = this.f9258W;
                            if (i != 0) {
                                if (i != 1) {
                                    z2 = true;
                                } else {
                                    if (i == 3) {
                                        uk9.m22770c();
                                        return false;
                                    }
                                    z2 = false;
                                }
                            }
                            if (!z2 || j2 < 30000) {
                                this.f9262a0.onImageAvailable(jM3144a - this.f9254S.f21b, bitmapM3145b);
                                b04 b04Var2 = this.f9265d0;
                                b04Var2.getClass();
                                long jM3144a2 = b04Var2.m3144a();
                                this.f9255T = jM3144a2;
                                while (!arrayDeque.isEmpty() && jM3144a2 >= ((a04) arrayDeque.peek()).f20a) {
                                    this.f9254S = (a04) arrayDeque.removeFirst();
                                }
                                this.f9258W = 3;
                                if (z) {
                                    b04 b04Var3 = this.f9265d0;
                                    b04Var3.getClass();
                                    iM3146c = b04Var3.m3146c();
                                    C0713b c0713b5 = this.f9259X;
                                    c0713b5.getClass();
                                    i2 = c0713b5.f6389O;
                                    c0713b = this.f9259X;
                                    c0713b.getClass();
                                    if (iM3146c == (i2 * c0713b.f6388N) - 1) {
                                        this.f9263b0 = null;
                                    }
                                } else {
                                    this.f9263b0 = null;
                                }
                                this.f9265d0 = this.f9266e0;
                                this.f9266e0 = null;
                                return true;
                            }
                        }
                    } else {
                        if (this.f9257V == 3) {
                            m4255J();
                            this.f9259X.getClass();
                            m4254I();
                            return false;
                        }
                        dd0VarL.mo10292m();
                        if (arrayDeque.isEmpty()) {
                            this.f9253R = true;
                            return false;
                        }
                    }
                }
            } else if (this.f9264c0) {
                this.f9259X.getClass();
                C0713b c0713b6 = this.f9259X;
                int i8 = c0713b6.f6388N;
                int i9 = c0713b6.f6389O;
                if (i8 != 1) {
                }
                if (!this.f9265d0.m3147d()) {
                    b04Var = this.f9265d0;
                    if (z) {
                        int iM3146c3 = b04Var.m3146c();
                        this.f9263b0.getClass();
                        int width2 = this.f9263b0.getWidth();
                        C0713b c0713b7 = this.f9259X;
                        c0713b7.getClass();
                        int i10 = width2 / c0713b7.f6388N;
                        int height2 = this.f9263b0.getHeight();
                        C0713b c0713b8 = this.f9259X;
                        c0713b8.getClass();
                        int i11 = height2 / c0713b8.f6389O;
                        int i12 = this.f9259X.f6388N;
                        bitmapCreateBitmap = Bitmap.createBitmap(this.f9263b0, (iM3146c3 % i12) * i10, (iM3146c3 / i12) * i11, i10, i11);
                    } else {
                        bitmapCreateBitmap = this.f9263b0;
                        bitmapCreateBitmap.getClass();
                    }
                    b04Var.m3148e(bitmapCreateBitmap);
                }
                Bitmap bitmapM3145b2 = this.f9265d0.m3145b();
                bitmapM3145b2.getClass();
                long jM3144a3 = this.f9265d0.m3144a();
                long j3 = jM3144a3 - j;
                if (this.f69502h == 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                i = this.f9258W;
                if (i != 0) {
                    if (i != 1) {
                        z2 = true;
                    } else {
                        if (i == 3) {
                            uk9.m22770c();
                            return false;
                        }
                        z2 = false;
                    }
                }
                if (!z2) {
                }
                this.f9262a0.onImageAvailable(jM3144a3 - this.f9254S.f21b, bitmapM3145b2);
                b04 b04Var4 = this.f9265d0;
                b04Var4.getClass();
                long jM3144a4 = b04Var4.m3144a();
                this.f9255T = jM3144a4;
                while (!arrayDeque.isEmpty()) {
                    this.f9254S = (a04) arrayDeque.removeFirst();
                }
                this.f9258W = 3;
                if (z) {
                    b04 b04Var5 = this.f9265d0;
                    b04Var5.getClass();
                    iM3146c = b04Var5.m3146c();
                    C0713b c0713b9 = this.f9259X;
                    c0713b9.getClass();
                    i2 = c0713b9.f6389O;
                    c0713b = this.f9259X;
                    c0713b.getClass();
                    if (iM3146c == (i2 * c0713b.f6388N) - 1) {
                        this.f9263b0 = null;
                    }
                } else {
                    this.f9263b0 = null;
                }
                this.f9265d0 = this.f9266e0;
                this.f9266e0 = null;
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x002f  */
    /* JADX WARN: Code duplicated, block: B:21:0x0038  */
    /* JADX WARN: Code duplicated, block: B:23:0x004e  */
    /* JADX WARN: Code duplicated, block: B:25:0x0056  */
    /* JADX WARN: Code duplicated, block: B:27:0x0059  */
    /* JADX WARN: Code duplicated, block: B:30:0x005e  */
    /* JADX WARN: Code duplicated, block: B:32:0x0062  */
    /* JADX WARN: Code duplicated, block: B:36:0x0073  */
    /* JADX WARN: Code duplicated, block: B:38:0x007e  */
    /* JADX WARN: Code duplicated, block: B:39:0x0080  */
    /* JADX WARN: Code duplicated, block: B:41:0x0083  */
    /* JADX WARN: Code duplicated, block: B:44:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:45:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:47:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:52:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:60:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:69:0x010e  */
    /* JADX WARN: Code duplicated, block: B:75:0x0118  */
    /* JADX WARN: Code duplicated, block: B:80:0x0120  */
    /* JADX WARN: Code duplicated, block: B:83:0x0131  */
    /* JADX WARN: Code duplicated, block: B:85:0x0136  */
    /* JADX WARN: Code duplicated, block: B:87:0x0147  */
    /* JADX WARN: Code duplicated, block: B:88:0x014a  */
    /* JADX WARN: Code duplicated, block: B:91:0x0156  */
    /* JADX INFO: renamed from: H */
    public final boolean m4253H(long j) {
        int i;
        m32 m32Var;
        int iM24994y;
        ByteBuffer byteBuffer;
        m32 m32Var2;
        boolean z;
        m32 m32Var3;
        b04 b04Var;
        long jM3144a;
        boolean z2;
        b04 b04Var2;
        boolean z3;
        C0713b c0713b;
        boolean z4;
        boolean z5;
        m32 m32Var4;
        if (!this.f9264c0 || this.f9265d0 == null) {
            p33 p33Var = this.f69497c;
            p33Var.m18865G();
            ed0 ed0Var = this.f9260Y;
            if (ed0Var != null && this.f9257V != 3 && !this.f9252Q) {
                if (this.f9261Z == null) {
                    m32 m32Var5 = (m32) ed0Var.mo14785e();
                    this.f9261Z = m32Var5;
                    if (m32Var5 != null) {
                        i = this.f9257V;
                        m32Var = this.f9261Z;
                        if (i == 2) {
                            m32Var.getClass();
                            this.f9261Z.f8576b = 4;
                            ed0 ed0Var2 = this.f9260Y;
                            ed0Var2.getClass();
                            ed0Var2.mo14786f(this.f9261Z);
                            this.f9261Z = null;
                            this.f9257V = 3;
                            return false;
                        }
                        iM24994y = m24994y(p33Var, m32Var, 0);
                        if (iM24994y != -5) {
                            C0713b c0713b2 = (C0713b) p33Var.f55514c;
                            c0713b2.getClass();
                            this.f9259X = c0713b2;
                            this.f9268g0 = true;
                            this.f9257V = 2;
                            return true;
                        }
                        if (iM24994y != -4) {
                            this.f9261Z.m16610o();
                            byteBuffer = this.f9261Z.f50500e;
                            if (byteBuffer != null || byteBuffer.remaining() <= 0) {
                                m32Var2 = this.f9261Z;
                                m32Var2.getClass();
                                if (m32Var2.m3751d(4)) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                            } else {
                                z = true;
                            }
                            if (z) {
                                m32 m32Var6 = this.f9261Z;
                                m32Var6.getClass();
                                m32Var6.f50498c = this.f9259X;
                                ed0 ed0Var3 = this.f9260Y;
                                ed0Var3.getClass();
                                m32 m32Var7 = this.f9261Z;
                                m32Var7.getClass();
                                ed0Var3.mo14786f(m32Var7);
                                this.f9267f0 = 0;
                            }
                            m32Var3 = this.f9261Z;
                            m32Var3.getClass();
                            if (m32Var3.m3751d(4)) {
                                this.f9264c0 = true;
                            } else {
                                int i2 = this.f9267f0;
                                b04Var = new b04(i2, m32Var3.f50502g);
                                this.f9266e0 = b04Var;
                                this.f9267f0 = i2 + 1;
                                if (this.f9264c0) {
                                    this.f9265d0 = this.f9266e0;
                                    this.f9266e0 = null;
                                } else {
                                    jM3144a = b04Var.m3144a();
                                    if (jM3144a - 30000 <= j || j > 30000 + jM3144a) {
                                        z2 = false;
                                    } else {
                                        z2 = true;
                                    }
                                    b04Var2 = this.f9265d0;
                                    if (b04Var2 != null || b04Var2.m3144a() > j || j >= jM3144a) {
                                        z3 = false;
                                    } else {
                                        z3 = true;
                                    }
                                    b04 b04Var3 = this.f9266e0;
                                    b04Var3.getClass();
                                    c0713b = this.f9259X;
                                    c0713b.getClass();
                                    if (c0713b.f6388N != -1 || this.f9259X.f6389O == -1) {
                                        z4 = true;
                                    } else {
                                        int iM3146c = b04Var3.m3146c();
                                        C0713b c0713b3 = this.f9259X;
                                        c0713b3.getClass();
                                        if (iM3146c == (c0713b3.f6389O * this.f9259X.f6388N) - 1) {
                                            z4 = true;
                                        } else {
                                            z4 = false;
                                        }
                                    }
                                    if (!z2 || z3 || z4) {
                                        z5 = true;
                                    } else {
                                        z5 = false;
                                    }
                                    this.f9264c0 = z5;
                                    if (z3 || z2) {
                                        this.f9265d0 = this.f9266e0;
                                        this.f9266e0 = null;
                                    }
                                }
                            }
                            m32Var4 = this.f9261Z;
                            m32Var4.getClass();
                            if (m32Var4.m3751d(4)) {
                                this.f9252Q = true;
                                this.f9261Z = null;
                                return false;
                            }
                            long j2 = this.f9256U;
                            m32 m32Var8 = this.f9261Z;
                            m32Var8.getClass();
                            this.f9256U = Math.max(j2, m32Var8.f50502g);
                            if (z) {
                                this.f9261Z = null;
                            } else {
                                m32 m32Var9 = this.f9261Z;
                                m32Var9.getClass();
                                m32Var9.mo16607k();
                            }
                            return !this.f9264c0;
                        }
                        if (iM24994y != -3) {
                            uk9.m22770c();
                            return false;
                        }
                    }
                } else {
                    i = this.f9257V;
                    m32Var = this.f9261Z;
                    if (i == 2) {
                        m32Var.getClass();
                        this.f9261Z.f8576b = 4;
                        ed0 ed0Var4 = this.f9260Y;
                        ed0Var4.getClass();
                        ed0Var4.mo14786f(this.f9261Z);
                        this.f9261Z = null;
                        this.f9257V = 3;
                        return false;
                    }
                    iM24994y = m24994y(p33Var, m32Var, 0);
                    if (iM24994y != -5) {
                        C0713b c0713b4 = (C0713b) p33Var.f55514c;
                        c0713b4.getClass();
                        this.f9259X = c0713b4;
                        this.f9268g0 = true;
                        this.f9257V = 2;
                        return true;
                    }
                    if (iM24994y != -4) {
                        this.f9261Z.m16610o();
                        byteBuffer = this.f9261Z.f50500e;
                        if (byteBuffer != null) {
                            m32Var2 = this.f9261Z;
                            m32Var2.getClass();
                            if (m32Var2.m3751d(4)) {
                                z = true;
                            } else {
                                z = false;
                            }
                        } else {
                            m32Var2 = this.f9261Z;
                            m32Var2.getClass();
                            if (m32Var2.m3751d(4)) {
                                z = true;
                            } else {
                                z = false;
                            }
                        }
                        if (z) {
                            m32 m32Var10 = this.f9261Z;
                            m32Var10.getClass();
                            m32Var10.f50498c = this.f9259X;
                            ed0 ed0Var5 = this.f9260Y;
                            ed0Var5.getClass();
                            m32 m32Var11 = this.f9261Z;
                            m32Var11.getClass();
                            ed0Var5.mo14786f(m32Var11);
                            this.f9267f0 = 0;
                        }
                        m32Var3 = this.f9261Z;
                        m32Var3.getClass();
                        if (m32Var3.m3751d(4)) {
                            this.f9264c0 = true;
                        } else {
                            int i3 = this.f9267f0;
                            b04Var = new b04(i3, m32Var3.f50502g);
                            this.f9266e0 = b04Var;
                            this.f9267f0 = i3 + 1;
                            if (this.f9264c0) {
                                jM3144a = b04Var.m3144a();
                                if (jM3144a - 30000 <= j) {
                                    z2 = false;
                                } else {
                                    z2 = false;
                                }
                                b04Var2 = this.f9265d0;
                                if (b04Var2 != null) {
                                    z3 = false;
                                } else {
                                    z3 = false;
                                }
                                b04 b04Var4 = this.f9266e0;
                                b04Var4.getClass();
                                c0713b = this.f9259X;
                                c0713b.getClass();
                                if (c0713b.f6388N != -1) {
                                    z4 = true;
                                } else {
                                    z4 = true;
                                }
                                if (z2) {
                                    z5 = true;
                                } else {
                                    z5 = true;
                                }
                                this.f9264c0 = z5;
                                if (z3) {
                                    this.f9265d0 = this.f9266e0;
                                    this.f9266e0 = null;
                                } else {
                                    this.f9265d0 = this.f9266e0;
                                    this.f9266e0 = null;
                                }
                            } else {
                                this.f9265d0 = this.f9266e0;
                                this.f9266e0 = null;
                            }
                        }
                        m32Var4 = this.f9261Z;
                        m32Var4.getClass();
                        if (m32Var4.m3751d(4)) {
                            this.f9252Q = true;
                            this.f9261Z = null;
                            return false;
                        }
                        long j3 = this.f9256U;
                        m32 m32Var12 = this.f9261Z;
                        m32Var12.getClass();
                        this.f9256U = Math.max(j3, m32Var12.f50502g);
                        if (z) {
                            this.f9261Z = null;
                        } else {
                            m32 m32Var13 = this.f9261Z;
                            m32Var13.getClass();
                            m32Var13.mo16607k();
                        }
                        return !this.f9264c0;
                    }
                    if (iM24994y != -3) {
                        uk9.m22770c();
                        return false;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: I */
    public final void m4254I() throws ExoPlaybackException {
        if (this.f9268g0) {
            C0713b c0713b = this.f9259X;
            c0713b.getClass();
            C3002fi c3002fi = this.f9249N;
            c3002fi.getClass();
            int iM11838d = C3002fi.m11838d(c0713b);
            if (iM11838d != y90.m24988f(4, 0, 0, 0) && iM11838d != y90.m24988f(3, 0, 0, 0)) {
                throw m24992g(new ImageDecoderException(), this.f9259X, false, 4005);
            }
            ed0 ed0Var = this.f9260Y;
            if (ed0Var != null) {
                ed0Var.mo14782a();
            }
            this.f9260Y = new ed0(c3002fi.f39115a);
            this.f9268g0 = false;
        }
    }

    /* JADX INFO: renamed from: J */
    public final void m4255J() {
        this.f9261Z = null;
        this.f9257V = 0;
        this.f9256U = -9223372036854775807L;
        ed0 ed0Var = this.f9260Y;
        if (ed0Var != null) {
            ed0Var.mo14782a();
            this.f9260Y = null;
        }
    }

    @Override // p000.y90, p000.yb7
    /* JADX INFO: renamed from: d */
    public final void mo4256d(int i, Object obj) {
        if (i != 15) {
            return;
        }
        ImageOutput imageOutput = obj instanceof ImageOutput ? (ImageOutput) obj : null;
        if (imageOutput == null) {
            imageOutput = ImageOutput.f6454a;
        }
        this.f9262a0 = imageOutput;
    }

    @Override // p000.y90
    /* JADX INFO: renamed from: k */
    public final String mo4257k() {
        return "ImageRenderer";
    }

    @Override // p000.y90
    /* JADX INFO: renamed from: m */
    public final boolean mo4258m() {
        return this.f9253R;
    }

    @Override // p000.y90
    /* JADX INFO: renamed from: o */
    public final boolean mo4259o() {
        int i = this.f9258W;
        if (i != 3) {
            return i == 0 && this.f9264c0;
        }
        return true;
    }

    @Override // p000.y90
    /* JADX INFO: renamed from: p */
    public final void mo4260p() {
        this.f9259X = null;
        this.f9254S = a04.f19c;
        this.f9251P.clear();
        m4255J();
        this.f9262a0.getClass();
    }

    @Override // p000.y90
    /* JADX INFO: renamed from: q */
    public final void mo4261q(boolean z, boolean z2) {
        this.f9258W = z2 ? 1 : 0;
    }

    @Override // p000.y90
    /* JADX INFO: renamed from: r */
    public final void mo4262r(long j, boolean z, boolean z2) {
        this.f9258W = Math.min(this.f9258W, 1);
        this.f9253R = false;
        this.f9252Q = false;
        this.f9263b0 = null;
        this.f9265d0 = null;
        this.f9266e0 = null;
        this.f9264c0 = false;
        this.f9261Z = null;
        ed0 ed0Var = this.f9260Y;
        if (ed0Var != null) {
            ed0Var.flush();
        }
        this.f9251P.clear();
    }

    @Override // p000.y90
    /* JADX INFO: renamed from: s */
    public final void mo4263s() {
        m4255J();
    }

    @Override // p000.y90
    /* JADX INFO: renamed from: t */
    public final void mo4264t() {
        m4255J();
        this.f9258W = Math.min(this.f9258W, 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0023, code lost:
    
        if (r2 >= r6) goto L15;
     */
    @Override // p000.y90
    /* JADX INFO: renamed from: w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo4265w(C0713b[] c0713bArr, long j, long j2, jv5 jv5Var) {
        if (this.f9254S.f21b != -9223372036854775807L) {
            ArrayDeque arrayDeque = this.f9251P;
            if (arrayDeque.isEmpty()) {
                long j3 = this.f9256U;
                if (j3 != -9223372036854775807L) {
                    long j4 = this.f9255T;
                    if (j4 != -9223372036854775807L) {
                    }
                }
            }
            arrayDeque.add(new a04(this.f9256U, j2));
            return;
        }
        this.f9254S = new a04(-9223372036854775807L, j2);
    }

    @Override // p000.y90
    /* JADX INFO: renamed from: z */
    public final void mo4266z(long j, long j2) throws ExoPlaybackException {
        if (this.f9253R) {
            return;
        }
        if (this.f9259X == null) {
            p33 p33Var = this.f69497c;
            p33Var.m18865G();
            m32 m32Var = this.f9250O;
            m32Var.mo16607k();
            int iM24994y = m24994y(p33Var, m32Var, 2);
            if (iM24994y != -5) {
                if (iM24994y == -4) {
                    bna.m3987z(m32Var.m3751d(4));
                    this.f9252Q = true;
                    this.f9253R = true;
                    return;
                }
                return;
            }
            C0713b c0713b = (C0713b) p33Var.f55514c;
            c0713b.getClass();
            this.f9259X = c0713b;
            this.f9268g0 = true;
        }
        if (this.f9260Y == null) {
            m4254I();
        }
        try {
            g8d.m12416a("drainAndFeedDecoder");
            while (m4252G(j)) {
            }
            while (m4253H(j)) {
            }
            g8d.m12417b();
        } catch (ImageDecoderException e) {
            throw m24992g(e, null, false, 4003);
        }
    }
}
