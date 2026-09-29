package p000;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import androidx.media3.common.C0713b;
import androidx.media3.decoder.DecoderInputBuffer$InsufficientCapacityException;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.mediacodec.MediaCodecDecoderException;
import androidx.media3.exoplayer.mediacodec.MediaCodecRenderer$DecoderInitializationException;
import androidx.media3.exoplayer.mediacodec.MediaCodecUtil$DecoderQueryException;
import com.google.common.collect.ImmutableSet;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public abstract class xt5 extends y90 {

    /* JADX INFO: renamed from: b1 */
    public static final byte[] f68705b1 = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};

    /* JADX INFO: renamed from: A0 */
    public boolean f68706A0;

    /* JADX INFO: renamed from: B0 */
    public boolean f68707B0;

    /* JADX INFO: renamed from: C0 */
    public boolean f68708C0;

    /* JADX INFO: renamed from: D0 */
    public boolean f68709D0;

    /* JADX INFO: renamed from: E0 */
    public boolean f68710E0;

    /* JADX INFO: renamed from: F0 */
    public int f68711F0;

    /* JADX INFO: renamed from: G0 */
    public int f68712G0;

    /* JADX INFO: renamed from: H0 */
    public int f68713H0;

    /* JADX INFO: renamed from: I0 */
    public boolean f68714I0;

    /* JADX INFO: renamed from: J0 */
    public boolean f68715J0;

    /* JADX INFO: renamed from: K0 */
    public boolean f68716K0;

    /* JADX INFO: renamed from: L0 */
    public long f68717L0;

    /* JADX INFO: renamed from: M0 */
    public boolean f68718M0;

    /* JADX INFO: renamed from: N */
    public final Context f68719N;

    /* JADX INFO: renamed from: N0 */
    public boolean f68720N0;

    /* JADX INFO: renamed from: O */
    public final rt5 f68721O;

    /* JADX INFO: renamed from: O0 */
    public boolean f68722O0;

    /* JADX INFO: renamed from: P */
    public final gm5 f68723P;

    /* JADX INFO: renamed from: P0 */
    public boolean f68724P0;

    /* JADX INFO: renamed from: Q */
    public final float f68725Q;

    /* JADX INFO: renamed from: Q0 */
    public ExoPlaybackException f68726Q0;

    /* JADX INFO: renamed from: R */
    public final m32 f68727R;

    /* JADX INFO: renamed from: R0 */
    public l32 f68728R0;

    /* JADX INFO: renamed from: S */
    public final m32 f68729S;

    /* JADX INFO: renamed from: S0 */
    public wt5 f68730S0;

    /* JADX INFO: renamed from: T */
    public final m32 f68731T;

    /* JADX INFO: renamed from: T0 */
    public long f68732T0;

    /* JADX INFO: renamed from: U */
    public final ub0 f68733U;

    /* JADX INFO: renamed from: U0 */
    public boolean f68734U0;

    /* JADX INFO: renamed from: V */
    public final MediaCodec.BufferInfo f68735V;

    /* JADX INFO: renamed from: V0 */
    public boolean f68736V0;

    /* JADX INFO: renamed from: W */
    public final ArrayDeque f68737W;

    /* JADX INFO: renamed from: W0 */
    public boolean f68738W0;

    /* JADX INFO: renamed from: X */
    public final sq6 f68739X;

    /* JADX INFO: renamed from: X0 */
    public long f68740X0;

    /* JADX INFO: renamed from: Y */
    public final AtomicInteger f68741Y;

    /* JADX INFO: renamed from: Y0 */
    public l41 f68742Y0;

    /* JADX INFO: renamed from: Z */
    public C0713b f68743Z;

    /* JADX INFO: renamed from: Z0 */
    public l41 f68744Z0;

    /* JADX INFO: renamed from: a0 */
    public C0713b f68745a0;

    /* JADX INFO: renamed from: a1 */
    public ImmutableSet f68746a1;

    /* JADX INFO: renamed from: b0 */
    public web f68747b0;

    /* JADX INFO: renamed from: c0 */
    public web f68748c0;

    /* JADX INFO: renamed from: d0 */
    public mw2 f68749d0;

    /* JADX INFO: renamed from: e0 */
    public MediaCrypto f68750e0;

    /* JADX INFO: renamed from: f0 */
    public final long f68751f0;

    /* JADX INFO: renamed from: g0 */
    public float f68752g0;

    /* JADX INFO: renamed from: h0 */
    public float f68753h0;

    /* JADX INFO: renamed from: i0 */
    public st5 f68754i0;

    /* JADX INFO: renamed from: j0 */
    public C0713b f68755j0;

    /* JADX INFO: renamed from: k0 */
    public MediaFormat f68756k0;

    /* JADX INFO: renamed from: l0 */
    public boolean f68757l0;

    /* JADX INFO: renamed from: m0 */
    public float f68758m0;

    /* JADX INFO: renamed from: n0 */
    public ArrayDeque f68759n0;

    /* JADX INFO: renamed from: o0 */
    public MediaCodecRenderer$DecoderInitializationException f68760o0;

    /* JADX INFO: renamed from: p0 */
    public vt5 f68761p0;

    /* JADX INFO: renamed from: q0 */
    public boolean f68762q0;

    /* JADX INFO: renamed from: r0 */
    public boolean f68763r0;

    /* JADX INFO: renamed from: s0 */
    public boolean f68764s0;

    /* JADX INFO: renamed from: t0 */
    public boolean f68765t0;

    /* JADX INFO: renamed from: u0 */
    public long f68766u0;

    /* JADX INFO: renamed from: v0 */
    public boolean f68767v0;

    /* JADX INFO: renamed from: w0 */
    public long f68768w0;

    /* JADX INFO: renamed from: x0 */
    public int f68769x0;

    /* JADX INFO: renamed from: y0 */
    public int f68770y0;

    /* JADX INFO: renamed from: z0 */
    public ByteBuffer f68771z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xt5(Context context, int i, rt5 rt5Var, float f) {
        super(i);
        gm5 gm5Var = gm5.f41009c;
        this.f68719N = context.getApplicationContext();
        this.f68721O = rt5Var;
        this.f68723P = gm5Var;
        this.f68725Q = f;
        this.f68741Y = new AtomicInteger();
        this.f68727R = new m32(0);
        this.f68729S = new m32(0);
        this.f68731T = new m32(2);
        ub0 ub0Var = new ub0(2);
        ub0Var.f63663l = 32;
        this.f68733U = ub0Var;
        this.f68735V = new MediaCodec.BufferInfo();
        this.f68752g0 = 1.0f;
        this.f68753h0 = 1.0f;
        this.f68751f0 = -9223372036854775807L;
        this.f68737W = new ArrayDeque();
        this.f68730S0 = wt5.f67276f;
        ub0Var.m16609n(0);
        ub0Var.f50500e.order(ByteOrder.nativeOrder());
        sq6 sq6Var = new sq6();
        sq6Var.f61255c = InterfaceC0828bz.f9188a;
        sq6Var.f61254b = 0;
        sq6Var.f61253a = 2;
        this.f68739X = sq6Var;
        this.f68758m0 = -1.0f;
        this.f68711F0 = 0;
        this.f68769x0 = -1;
        this.f68770y0 = -1;
        this.f68768w0 = -9223372036854775807L;
        this.f68717L0 = -9223372036854775807L;
        this.f68732T0 = -9223372036854775807L;
        this.f68766u0 = -9223372036854775807L;
        this.f68712G0 = 0;
        this.f68713H0 = 0;
        this.f68728R0 = new l32();
        this.f68738W0 = false;
        this.f68740X0 = 0L;
        this.f68746a1 = ImmutableSet.m6310s();
        l41 l41Var = l41.f49011b;
        this.f68742Y0 = l41Var;
        this.f68744Z0 = l41Var;
    }

    /* JADX INFO: renamed from: A0 */
    public abstract int mo12156A0(gm5 gm5Var, C0713b c0713b);

    /* JADX INFO: renamed from: B0 */
    public final boolean m24676B0(C0713b c0713b) {
        if (this.f68754i0 != null && this.f68713H0 != 3 && this.f69502h != 0) {
            float f = this.f68753h0;
            c0713b.getClass();
            C0713b[] c0713bArr = this.f69504j;
            c0713bArr.getClass();
            float fMo12170Q = mo12170Q(f, c0713b, c0713bArr);
            float f2 = this.f68758m0;
            if (f2 != fMo12170Q) {
                if (fMo12170Q == -1.0f) {
                    if (this.f68714I0) {
                        this.f68712G0 = 1;
                        this.f68713H0 = 3;
                        return false;
                    }
                    m24695o0();
                    m24690Y();
                    return false;
                }
                if (f2 != -1.0f || fMo12170Q > this.f68725Q) {
                    Bundle bundle = new Bundle();
                    bundle.putFloat("operating-rate", fMo12170Q);
                    st5 st5Var = this.f68754i0;
                    st5Var.getClass();
                    st5Var.mo10717d(bundle);
                    this.f68758m0 = fMo12170Q;
                }
            }
        }
        return true;
    }

    @Override // p000.y90
    /* JADX INFO: renamed from: C */
    public void mo12157C(float f, float f2) {
        this.f68752g0 = f;
        this.f68753h0 = f2;
        m24676B0(this.f68755j0);
    }

    /* JADX INFO: renamed from: C0 */
    public final void m24677C0() {
        web webVar = this.f68748c0;
        webVar.getClass();
        webVar.m23881q();
        m24698t0(this.f68748c0);
        this.f68712G0 = 0;
        this.f68713H0 = 0;
    }

    @Override // p000.y90
    /* JADX INFO: renamed from: D */
    public final int mo4251D(C0713b c0713b) throws ExoPlaybackException {
        try {
            return mo12156A0(this.f68723P, c0713b);
        } catch (MediaCodecUtil$DecoderQueryException e) {
            throw m24992g(e, c0713b, false, 4002);
        }
    }

    /* JADX INFO: renamed from: D0 */
    public final void m24678D0(long j) {
        C0713b c0713b = (C0713b) this.f68730S0.f67280d.m12637p(j);
        if (c0713b == null && this.f68734U0 && this.f68756k0 != null) {
            c0713b = (C0713b) this.f68730S0.f67280d.m12636o();
        }
        if (c0713b != null) {
            this.f68745a0 = c0713b;
        } else if (!this.f68757l0 || this.f68745a0 == null) {
            return;
        }
        C0713b c0713b2 = this.f68745a0;
        c0713b2.getClass();
        mo12185g0(c0713b2, this.f68756k0);
        this.f68757l0 = false;
        this.f68734U0 = false;
    }

    @Override // p000.y90
    /* JADX INFO: renamed from: E */
    public final int mo24679E() {
        return 8;
    }

    /* JADX INFO: renamed from: G */
    public final void m24680G(MediaFormat mediaFormat) {
        for (Map.Entry entry : this.f68742Y0.f49012a.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (value == null) {
                mediaFormat.setString(str, null);
            } else if (value instanceof Integer) {
                mediaFormat.setInteger(str, ((Integer) value).intValue());
            } else if (value instanceof Long) {
                mediaFormat.setLong(str, ((Long) value).longValue());
            } else if (value instanceof Float) {
                mediaFormat.setFloat(str, ((Float) value).floatValue());
            } else if (value instanceof String) {
                mediaFormat.setString(str, (String) value);
            } else if (value instanceof ByteBuffer) {
                mediaFormat.setByteBuffer(str, (ByteBuffer) value);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x02cc  */
    /* JADX INFO: renamed from: H */
    public final boolean m24681H(long j, long j2) {
        ub0 ub0Var;
        int length;
        ByteBuffer byteBuffer;
        bna.m3987z(!this.f68720N0);
        ub0 ub0Var2 = this.f68733U;
        if (ub0Var2.m22666q()) {
            ByteBuffer byteBuffer2 = ub0Var2.f50500e;
            int i = this.f68770y0;
            int i2 = ub0Var2.f63662k;
            long j3 = ub0Var2.f50502g;
            boolean zM24689X = m24689X(this.f69506l, ub0Var2.f63661j);
            boolean zM3751d = ub0Var2.m3751d(4);
            C0713b c0713b = this.f68745a0;
            c0713b.getClass();
            ub0Var = ub0Var2;
            if (!mo12190m0(j, j2, null, byteBuffer2, i, 0, i2, j3, zM24689X, zM3751d, c0713b)) {
                return false;
            }
            mo12187i0(ub0Var.f63661j);
            ub0Var.mo16607k();
        } else {
            ub0Var = ub0Var2;
        }
        if (this.f68718M0) {
            this.f68720N0 = true;
            return false;
        }
        boolean z = this.f68708C0;
        m32 m32Var = this.f68731T;
        if (z) {
            bna.m3987z(ub0Var.m22665p(m32Var));
            this.f68708C0 = false;
        }
        if (this.f68709D0) {
            if (ub0Var.m22666q()) {
                return true;
            }
            this.f68707B0 = false;
            m24696q0();
            this.f68709D0 = false;
            m24690Y();
            if (!this.f68707B0) {
                return false;
            }
        }
        bna.m3987z(!this.f68718M0);
        p33 p33Var = this.f69497c;
        p33Var.m18865G();
        m32Var.mo16607k();
        while (true) {
            m32Var.mo16607k();
            int iM24994y = m24994y(p33Var, m32Var, 0);
            if (iM24994y == -5) {
                mo12184f0(p33Var);
                break;
            }
            if (iM24994y != -4) {
                if (iM24994y != -3) {
                    uk9.m22770c();
                    return false;
                }
                if (!m24993l()) {
                    break;
                }
                m24687T().f67281e = this.f68717L0;
                break;
            }
            if (m32Var.m3751d(4)) {
                this.f68718M0 = true;
                m24687T().f67281e = this.f68717L0;
                break;
            }
            this.f68717L0 = Math.max(this.f68717L0, m32Var.f50502g);
            if (m24993l() || this.f68729S.m3751d(536870912)) {
                m24687T().f67281e = this.f68717L0;
            }
            byte[] bArr = null;
            if (this.f68722O0) {
                C0713b c0713b2 = this.f68743Z;
                c0713b2.getClass();
                this.f68745a0 = c0713b2;
                if (Objects.equals(c0713b2.f6406o, "audio/opus") && !this.f68745a0.f6409r.isEmpty()) {
                    int iM21778c = syb.m21778c((byte[]) this.f68745a0.f6409r.get(0));
                    lc3 lc3VarM2520a = this.f68745a0.m2520a();
                    lc3VarM2520a.m16071d(iM21778c);
                    this.f68745a0 = lc3VarM2520a.m16068a();
                }
                mo12185g0(this.f68745a0, null);
                this.f68722O0 = false;
            }
            m32Var.m16610o();
            C0713b c0713b3 = this.f68745a0;
            if (c0713b3 == null || !Objects.equals(c0713b3.f6406o, "audio/opus")) {
                ub0Var = ub0Var;
            } else {
                if (m32Var.m3751d(268435456)) {
                    m32Var.f50498c = this.f68745a0;
                    mo12178V(m32Var);
                }
                if (syb.m21779d(this.f69506l, m32Var.f50502g)) {
                    List list = this.f68745a0.f6409r;
                    sq6 sq6Var = this.f68739X;
                    sq6Var.getClass();
                    m32Var.f50500e.getClass();
                    if (m32Var.f50500e.limit() - m32Var.f50500e.position() == 0) {
                        ub0Var = ub0Var;
                    } else {
                        if (sq6Var.f61253a == 2 && (list.size() == 1 || list.size() == 3)) {
                            bArr = (byte[]) list.get(0);
                        }
                        ByteBuffer byteBuffer3 = m32Var.f50500e;
                        int iPosition = byteBuffer3.position();
                        int iLimit = byteBuffer3.limit();
                        int i3 = iLimit - iPosition;
                        int i4 = (i3 + 255) / 255;
                        int i5 = i4 + 27 + i3;
                        if (sq6Var.f61253a == 2) {
                            length = bArr != null ? bArr.length + 28 : 47;
                            i5 = length + 44 + i5;
                        } else {
                            length = 0;
                        }
                        if (((ByteBuffer) sq6Var.f61255c).capacity() < i5) {
                            sq6Var.f61255c = ByteBuffer.allocate(i5).order(ByteOrder.LITTLE_ENDIAN);
                        } else {
                            ((ByteBuffer) sq6Var.f61255c).clear();
                        }
                        ByteBuffer byteBuffer4 = (ByteBuffer) sq6Var.f61255c;
                        if (sq6Var.f61253a == 2) {
                            if (bArr != null) {
                                sq6.m21584v(byteBuffer4, 0L, 0, 1, true);
                                byteBuffer = byteBuffer4;
                                byteBuffer.put(k9d.m15027a(bArr.length));
                                byteBuffer.put(bArr);
                                byteBuffer.putInt(22, uma.m22815j(byteBuffer.arrayOffset(), byteBuffer.array(), bArr.length + 28, 0));
                                byteBuffer.position(bArr.length + 28);
                            } else {
                                byteBuffer = byteBuffer4;
                                byteBuffer.put(sq6.f61251d);
                            }
                            byteBuffer.put(sq6.f61252e);
                        } else {
                            ub0Var = ub0Var;
                            byteBuffer = byteBuffer4;
                        }
                        int iM21781f = sq6Var.f61254b + syb.m21781f(byteBuffer3);
                        sq6Var.f61254b = iM21781f;
                        sq6.m21584v(byteBuffer, iM21781f, sq6Var.f61253a, i4, false);
                        for (int i6 = 0; i6 < i4; i6++) {
                            if (i3 >= 255) {
                                byteBuffer.put((byte) -1);
                                i3 -= 255;
                            } else {
                                byteBuffer.put((byte) i3);
                                i3 = 0;
                            }
                        }
                        while (iPosition < iLimit) {
                            byteBuffer.put(byteBuffer3.get(iPosition));
                            iPosition++;
                        }
                        byteBuffer3.position(byteBuffer3.limit());
                        byteBuffer.flip();
                        if (sq6Var.f61253a == 2) {
                            byteBuffer.putInt(length + 66, uma.m22815j(byteBuffer.arrayOffset() + length + 44, byteBuffer.array(), byteBuffer.limit() - byteBuffer.position(), 0));
                        } else {
                            byteBuffer.putInt(22, uma.m22815j(byteBuffer.arrayOffset(), byteBuffer.array(), byteBuffer.limit() - byteBuffer.position(), 0));
                        }
                        sq6Var.f61253a++;
                        sq6Var.f61255c = byteBuffer;
                        m32Var.mo16607k();
                        m32Var.m16609n(((ByteBuffer) sq6Var.f61255c).remaining());
                        m32Var.f50500e.put((ByteBuffer) sq6Var.f61255c);
                        m32Var.m16610o();
                    }
                } else {
                    ub0Var = ub0Var;
                }
            }
            if (ub0Var.m22666q()) {
                long j4 = this.f69506l;
                ub0Var = ub0Var;
                if (m24689X(j4, ub0Var.f63661j) == m24689X(j4, m32Var.f50502g)) {
                }
                this.f68708C0 = true;
                break;
            }
            ub0Var = ub0Var;
            if (!ub0Var.m22665p(m32Var)) {
                this.f68708C0 = true;
                break;
            }
        }
        if (ub0Var.m22666q()) {
            ub0Var.m16610o();
        }
        return ub0Var.m22666q() || this.f68718M0 || this.f68709D0;
    }

    /* JADX INFO: renamed from: I */
    public abstract o32 mo12159I(vt5 vt5Var, C0713b c0713b, C0713b c0713b2);

    /* JADX INFO: renamed from: J */
    public MediaCodecDecoderException mo12161J(IllegalStateException illegalStateException, vt5 vt5Var) {
        return new MediaCodecDecoderException(illegalStateException, vt5Var);
    }

    /* JADX INFO: renamed from: K */
    public final boolean m24682K() {
        if (!this.f68714I0) {
            m24677C0();
            return true;
        }
        this.f68712G0 = 1;
        this.f68713H0 = 2;
        return true;
    }

    /* JADX INFO: renamed from: L */
    public final boolean m24683L(long j, long j2) {
        st5 st5Var = this.f68754i0;
        st5Var.getClass();
        int i = this.f68770y0;
        MediaCodec.BufferInfo bufferInfo = this.f68735V;
        if (i < 0) {
            int iMo10729t = st5Var.mo10729t(bufferInfo);
            if (iMo10729t < 0) {
                if (iMo10729t != -2) {
                    if (this.f68765t0 && (this.f68718M0 || this.f68712G0 == 2)) {
                        m24693l0();
                    }
                    long j3 = this.f68766u0;
                    if (j3 != -9223372036854775807L) {
                        long j4 = j3 + 100;
                        this.f69501g.getClass();
                        if (j4 < System.currentTimeMillis()) {
                            m24693l0();
                            return false;
                        }
                    }
                    return false;
                }
                this.f68716K0 = true;
                st5 st5Var2 = this.f68754i0;
                st5Var2.getClass();
                MediaFormat mediaFormatMo10722j = st5Var2.mo10722j();
                if (!this.f68746a1.isEmpty()) {
                    ImmutableSet<String> immutableSet = this.f68746a1;
                    l41 l41Var = l41.f49011b;
                    HashMap map = new HashMap();
                    for (String str : immutableSet) {
                        if (mediaFormatMo10722j.containsKey(str)) {
                            int valueTypeForKey = mediaFormatMo10722j.getValueTypeForKey(str);
                            if (valueTypeForKey == 1) {
                                map.put(str, Integer.valueOf(mediaFormatMo10722j.getInteger(str)));
                            } else if (valueTypeForKey == 2) {
                                map.put(str, Long.valueOf(mediaFormatMo10722j.getLong(str)));
                            } else if (valueTypeForKey == 3) {
                                map.put(str, Float.valueOf(mediaFormatMo10722j.getFloat(str)));
                            } else if (valueTypeForKey == 4) {
                                map.put(str, mediaFormatMo10722j.getString(str));
                            } else if (valueTypeForKey == 5) {
                                ByteBuffer byteBuffer = mediaFormatMo10722j.getByteBuffer(str);
                                if (byteBuffer == null) {
                                    map.put(str, null);
                                } else {
                                    ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBuffer.remaining());
                                    byteBufferAllocate.put(byteBuffer.duplicate());
                                    byteBufferAllocate.flip();
                                    map.put(str, byteBufferAllocate);
                                }
                            }
                        }
                    }
                    l41 l41Var2 = new l41(map);
                    if (!l41Var2.equals(this.f68744Z0)) {
                        this.f68744Z0 = l41Var2;
                        mo12182d0(l41Var2);
                    }
                }
                this.f68756k0 = mediaFormatMo10722j;
                this.f68757l0 = true;
                return true;
            }
            bufferInfo.presentationTimeUs -= this.f68740X0;
            if (this.f68764s0) {
                this.f68764s0 = false;
                st5Var.mo10720h(iMo10729t);
                return true;
            }
            if (bufferInfo.size == 0 && (bufferInfo.flags & 4) != 0) {
                m24693l0();
                return false;
            }
            this.f68770y0 = iMo10729t;
            ByteBuffer byteBufferMo10711A = st5Var.mo10711A(iMo10729t);
            this.f68771z0 = byteBufferMo10711A;
            if (byteBufferMo10711A != null) {
                byteBufferMo10711A.position(bufferInfo.offset);
                this.f68771z0.limit(bufferInfo.offset + bufferInfo.size);
            }
            m24678D0(bufferInfo.presentationTimeUs);
        }
        boolean z = this.f68738W0 || bufferInfo.presentationTimeUs < this.f69506l;
        long j5 = this.f68730S0.f67281e;
        boolean z2 = j5 != -9223372036854775807L && j5 <= bufferInfo.presentationTimeUs;
        this.f68706A0 = z2;
        ByteBuffer byteBuffer2 = this.f68771z0;
        int i2 = this.f68770y0;
        int i3 = bufferInfo.flags;
        long j6 = bufferInfo.presentationTimeUs;
        C0713b c0713b = this.f68745a0;
        c0713b.getClass();
        if (!mo12190m0(j, j2, st5Var, byteBuffer2, i2, i3, 1, j6, z, z2, c0713b)) {
            return false;
        }
        mo12187i0(bufferInfo.presentationTimeUs);
        boolean z3 = (bufferInfo.flags & 4) != 0;
        if (!z3 && this.f68715J0 && this.f68706A0) {
            this.f69501g.getClass();
            this.f68766u0 = System.currentTimeMillis();
        }
        this.f68770y0 = -1;
        this.f68771z0 = null;
        if (!z3) {
            return true;
        }
        m24693l0();
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:103:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:112:0x0091 A[EDGE_INSN: B:112:0x0091->B:33:0x0091 BREAK  A[LOOP:0: B:30:0x006f->B:32:0x007c], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:17:0x0032  */
    /* JADX WARN: Code duplicated, block: B:20:0x0037  */
    /* JADX WARN: Code duplicated, block: B:23:0x0049  */
    /* JADX WARN: Code duplicated, block: B:25:0x004d  */
    /* JADX WARN: Code duplicated, block: B:27:0x006a  */
    /* JADX WARN: Code duplicated, block: B:29:0x006e  */
    /* JADX WARN: Code duplicated, block: B:32:0x007c A[LOOP:0: B:30:0x006f->B:32:0x007c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:38:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:44:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:49:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:51:0x00da  */
    /* JADX WARN: Code duplicated, block: B:53:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:56:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:58:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:61:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:63:0x010b  */
    /* JADX WARN: Code duplicated, block: B:71:0x011f  */
    /* JADX WARN: Code duplicated, block: B:74:0x0128  */
    /* JADX WARN: Code duplicated, block: B:76:0x0130  */
    /* JADX WARN: Code duplicated, block: B:78:0x0134  */
    /* JADX WARN: Code duplicated, block: B:79:0x0138  */
    /* JADX WARN: Code duplicated, block: B:81:0x013c  */
    /* JADX WARN: Code duplicated, block: B:85:0x014f  */
    /* JADX WARN: Code duplicated, block: B:88:0x016d  */
    /* JADX WARN: Code duplicated, block: B:90:0x0175  */
    /* JADX WARN: Code duplicated, block: B:93:0x0188  */
    /* JADX WARN: Code duplicated, block: B:96:0x018f  */
    /* JADX WARN: Code duplicated, block: B:98:0x0195  */
    /* JADX INFO: renamed from: M */
    public final boolean m24684M() {
        int iPosition;
        p33 p33Var;
        int i;
        long j;
        boolean zM3751d;
        int iMo12168P;
        long j2;
        int i2;
        long j3;
        xr1 xr1Var;
        int i3;
        C0713b c0713b;
        st5 st5Var = this.f68754i0;
        if (st5Var != null && this.f68712G0 != 2 && !this.f68718M0) {
            int i4 = this.f68769x0;
            m32 m32Var = this.f68729S;
            if (i4 < 0) {
                int iMo10728q = st5Var.mo10728q();
                this.f68769x0 = iMo10728q;
                if (iMo10728q >= 0) {
                    m32Var.f50500e = st5Var.mo10731w(iMo10728q);
                    m32Var.mo16607k();
                    if (this.f68712G0 == 1) {
                        if (!this.f68765t0) {
                            this.f68715J0 = true;
                            st5Var.mo10719f(this.f68769x0, 0, 4, 0L);
                            this.f68769x0 = -1;
                            m32Var.f50500e = null;
                        }
                        this.f68712G0 = 2;
                        return false;
                    }
                    if (this.f68763r0) {
                        this.f68763r0 = false;
                        ByteBuffer byteBuffer = m32Var.f50500e;
                        byteBuffer.getClass();
                        byteBuffer.put(f68705b1);
                        st5Var.mo10719f(this.f68769x0, 38, 0, 0L);
                        this.f68769x0 = -1;
                        m32Var.f50500e = null;
                        this.f68714I0 = true;
                        return true;
                    }
                    if (this.f68711F0 == 1) {
                        i3 = 0;
                        while (true) {
                            c0713b = this.f68755j0;
                            c0713b.getClass();
                            if (i3 < c0713b.f6409r.size()) {
                                break;
                            }
                            byte[] bArr = (byte[]) this.f68755j0.f6409r.get(i3);
                            ByteBuffer byteBuffer2 = m32Var.f50500e;
                            byteBuffer2.getClass();
                            byteBuffer2.put(bArr);
                            i3++;
                        }
                        this.f68711F0 = 2;
                    }
                    ByteBuffer byteBuffer3 = m32Var.f50500e;
                    byteBuffer3.getClass();
                    iPosition = byteBuffer3.position();
                    p33Var = this.f69497c;
                    p33Var.m18865G();
                    try {
                        st5Var.mo10725m(new RunnableC0806bd(27, this, p33Var));
                        i = this.f68741Y.get();
                        if (i == -3) {
                            if (m24993l()) {
                                m24687T().f67281e = this.f68717L0;
                                return false;
                            }
                        } else {
                            if (i == -5) {
                                if (this.f68711F0 == 2) {
                                    m32Var.mo16607k();
                                    this.f68711F0 = 1;
                                }
                                mo12184f0(p33Var);
                                return true;
                            }
                            if (m32Var.m3751d(4)) {
                                if (!this.f68714I0 || m32Var.m3751d(1)) {
                                    j = m32Var.f50502g;
                                    if (!mo12195v0(m32Var)) {
                                        zM3751d = m32Var.m3751d(1073741824);
                                        if (zM3751d) {
                                            xr1Var = m32Var.f50499d;
                                            if (iPosition == 0) {
                                                xr1Var.getClass();
                                            } else {
                                                if (xr1Var.f68563d == null) {
                                                    int[] iArr = new int[1];
                                                    xr1Var.f68563d = iArr;
                                                    xr1Var.f68568i.numBytesOfClearData = iArr;
                                                }
                                                int[] iArr2 = xr1Var.f68563d;
                                                iArr2[0] = iArr2[0] + iPosition;
                                            }
                                        }
                                        if (this.f68722O0) {
                                            gh1 gh1Var = m24687T().f67280d;
                                            C0713b c0713b2 = this.f68743Z;
                                            c0713b2.getClass();
                                            gh1Var.m12622a(c0713b2, j);
                                            this.f68722O0 = false;
                                        }
                                        this.f68717L0 = Math.max(this.f68717L0, j);
                                        if (m24993l() || m32Var.m3751d(536870912)) {
                                            m24687T().f67281e = this.f68717L0;
                                        }
                                        m32Var.m16610o();
                                        if (m32Var.m3751d(268435456)) {
                                            mo12178V(m32Var);
                                        }
                                        if (this.f68738W0) {
                                            j3 = this.f68717L0;
                                            if (j <= j3) {
                                                this.f68740X0 = (j3 - j) + 1 + this.f68740X0;
                                            }
                                            this.f68717L0 = j;
                                            this.f68738W0 = false;
                                        }
                                        mo12189k0(m32Var);
                                        iMo12168P = mo12168P(m32Var);
                                        j2 = j + this.f68740X0;
                                        i2 = this.f68769x0;
                                        if (zM3751d) {
                                            st5Var.mo10718e(i2, m32Var.f50499d, j2, iMo12168P);
                                        } else {
                                            ByteBuffer byteBuffer4 = m32Var.f50500e;
                                            byteBuffer4.getClass();
                                            st5Var.mo10719f(i2, byteBuffer4.limit(), iMo12168P, j2);
                                        }
                                        this.f68769x0 = -1;
                                        m32Var.f50500e = null;
                                        this.f68714I0 = true;
                                        this.f68711F0 = 0;
                                        this.f68728R0.f48970c++;
                                        return true;
                                    }
                                } else {
                                    m32Var.mo16607k();
                                    if (this.f68711F0 == 2) {
                                        this.f68711F0 = 1;
                                        return true;
                                    }
                                }
                                return true;
                            }
                            m24687T().f67281e = this.f68717L0;
                            if (this.f68711F0 == 2) {
                                m32Var.mo16607k();
                                this.f68711F0 = 1;
                            }
                            this.f68718M0 = true;
                            if (!this.f68714I0) {
                                m24693l0();
                                return false;
                            }
                            if (!this.f68765t0) {
                                this.f68715J0 = true;
                                st5Var.mo10719f(this.f68769x0, 0, 4, 0L);
                                this.f68769x0 = -1;
                                m32Var.f50500e = null;
                                return false;
                            }
                        }
                    } catch (DecoderInputBuffer$InsufficientCapacityException e) {
                        mo12180b0(e);
                        m24694n0(0);
                        m24685N();
                        return true;
                    }
                }
            } else {
                if (this.f68712G0 == 1) {
                    if (!this.f68765t0) {
                        this.f68715J0 = true;
                        st5Var.mo10719f(this.f68769x0, 0, 4, 0L);
                        this.f68769x0 = -1;
                        m32Var.f50500e = null;
                    }
                    this.f68712G0 = 2;
                    return false;
                }
                if (this.f68763r0) {
                    this.f68763r0 = false;
                    ByteBuffer byteBuffer5 = m32Var.f50500e;
                    byteBuffer5.getClass();
                    byteBuffer5.put(f68705b1);
                    st5Var.mo10719f(this.f68769x0, 38, 0, 0L);
                    this.f68769x0 = -1;
                    m32Var.f50500e = null;
                    this.f68714I0 = true;
                    return true;
                }
                if (this.f68711F0 == 1) {
                    i3 = 0;
                    while (true) {
                        c0713b = this.f68755j0;
                        c0713b.getClass();
                        if (i3 < c0713b.f6409r.size()) {
                            break;
                            break;
                        }
                        byte[] bArr2 = (byte[]) this.f68755j0.f6409r.get(i3);
                        ByteBuffer byteBuffer6 = m32Var.f50500e;
                        byteBuffer6.getClass();
                        byteBuffer6.put(bArr2);
                        i3++;
                    }
                    this.f68711F0 = 2;
                }
                ByteBuffer byteBuffer7 = m32Var.f50500e;
                byteBuffer7.getClass();
                iPosition = byteBuffer7.position();
                p33Var = this.f69497c;
                p33Var.m18865G();
                st5Var.mo10725m(new RunnableC0806bd(27, this, p33Var));
                i = this.f68741Y.get();
                if (i == -3) {
                    if (m24993l()) {
                        m24687T().f67281e = this.f68717L0;
                        return false;
                    }
                } else {
                    if (i == -5) {
                        if (this.f68711F0 == 2) {
                            m32Var.mo16607k();
                            this.f68711F0 = 1;
                        }
                        mo12184f0(p33Var);
                        return true;
                    }
                    if (m32Var.m3751d(4)) {
                        if (this.f68714I0) {
                            j = m32Var.f50502g;
                            if (!mo12195v0(m32Var)) {
                                zM3751d = m32Var.m3751d(1073741824);
                                if (zM3751d) {
                                    xr1Var = m32Var.f50499d;
                                    if (iPosition == 0) {
                                        xr1Var.getClass();
                                    } else {
                                        if (xr1Var.f68563d == null) {
                                            int[] iArr3 = new int[1];
                                            xr1Var.f68563d = iArr3;
                                            xr1Var.f68568i.numBytesOfClearData = iArr3;
                                        }
                                        int[] iArr4 = xr1Var.f68563d;
                                        iArr4[0] = iArr4[0] + iPosition;
                                    }
                                }
                                if (this.f68722O0) {
                                    gh1 gh1Var2 = m24687T().f67280d;
                                    C0713b c0713b3 = this.f68743Z;
                                    c0713b3.getClass();
                                    gh1Var2.m12622a(c0713b3, j);
                                    this.f68722O0 = false;
                                }
                                this.f68717L0 = Math.max(this.f68717L0, j);
                                if (m24993l()) {
                                    m24687T().f67281e = this.f68717L0;
                                } else {
                                    m24687T().f67281e = this.f68717L0;
                                }
                                m32Var.m16610o();
                                if (m32Var.m3751d(268435456)) {
                                    mo12178V(m32Var);
                                }
                                if (this.f68738W0) {
                                    j3 = this.f68717L0;
                                    if (j <= j3) {
                                        this.f68740X0 = (j3 - j) + 1 + this.f68740X0;
                                    }
                                    this.f68717L0 = j;
                                    this.f68738W0 = false;
                                }
                                mo12189k0(m32Var);
                                iMo12168P = mo12168P(m32Var);
                                j2 = j + this.f68740X0;
                                i2 = this.f68769x0;
                                if (zM3751d) {
                                    st5Var.mo10718e(i2, m32Var.f50499d, j2, iMo12168P);
                                } else {
                                    ByteBuffer byteBuffer8 = m32Var.f50500e;
                                    byteBuffer8.getClass();
                                    st5Var.mo10719f(i2, byteBuffer8.limit(), iMo12168P, j2);
                                }
                                this.f68769x0 = -1;
                                m32Var.f50500e = null;
                                this.f68714I0 = true;
                                this.f68711F0 = 0;
                                this.f68728R0.f48970c++;
                                return true;
                            }
                        } else {
                            j = m32Var.f50502g;
                            if (!mo12195v0(m32Var)) {
                                zM3751d = m32Var.m3751d(1073741824);
                                if (zM3751d) {
                                    xr1Var = m32Var.f50499d;
                                    if (iPosition == 0) {
                                        xr1Var.getClass();
                                    } else {
                                        if (xr1Var.f68563d == null) {
                                            int[] iArr5 = new int[1];
                                            xr1Var.f68563d = iArr5;
                                            xr1Var.f68568i.numBytesOfClearData = iArr5;
                                        }
                                        int[] iArr6 = xr1Var.f68563d;
                                        iArr6[0] = iArr6[0] + iPosition;
                                    }
                                }
                                if (this.f68722O0) {
                                    gh1 gh1Var3 = m24687T().f67280d;
                                    C0713b c0713b4 = this.f68743Z;
                                    c0713b4.getClass();
                                    gh1Var3.m12622a(c0713b4, j);
                                    this.f68722O0 = false;
                                }
                                this.f68717L0 = Math.max(this.f68717L0, j);
                                if (m24993l()) {
                                    m24687T().f67281e = this.f68717L0;
                                } else {
                                    m24687T().f67281e = this.f68717L0;
                                }
                                m32Var.m16610o();
                                if (m32Var.m3751d(268435456)) {
                                    mo12178V(m32Var);
                                }
                                if (this.f68738W0) {
                                    j3 = this.f68717L0;
                                    if (j <= j3) {
                                        this.f68740X0 = (j3 - j) + 1 + this.f68740X0;
                                    }
                                    this.f68717L0 = j;
                                    this.f68738W0 = false;
                                }
                                mo12189k0(m32Var);
                                iMo12168P = mo12168P(m32Var);
                                j2 = j + this.f68740X0;
                                i2 = this.f68769x0;
                                if (zM3751d) {
                                    st5Var.mo10718e(i2, m32Var.f50499d, j2, iMo12168P);
                                } else {
                                    ByteBuffer byteBuffer9 = m32Var.f50500e;
                                    byteBuffer9.getClass();
                                    st5Var.mo10719f(i2, byteBuffer9.limit(), iMo12168P, j2);
                                }
                                this.f68769x0 = -1;
                                m32Var.f50500e = null;
                                this.f68714I0 = true;
                                this.f68711F0 = 0;
                                this.f68728R0.f48970c++;
                                return true;
                            }
                        }
                        return true;
                    }
                    m24687T().f67281e = this.f68717L0;
                    if (this.f68711F0 == 2) {
                        m32Var.mo16607k();
                        this.f68711F0 = 1;
                    }
                    this.f68718M0 = true;
                    if (!this.f68714I0) {
                        m24693l0();
                        return false;
                    }
                    if (!this.f68765t0) {
                        this.f68715J0 = true;
                        st5Var.mo10719f(this.f68769x0, 0, 4, 0L);
                        this.f68769x0 = -1;
                        m32Var.f50500e = null;
                        return false;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: N */
    public final void m24685N() {
        try {
            st5 st5Var = this.f68754i0;
            st5Var.getClass();
            st5Var.flush();
        } finally {
            mo12192r0();
        }
    }

    /* JADX INFO: renamed from: O */
    public final List m24686O(boolean z) {
        C0713b c0713b = this.f68743Z;
        c0713b.getClass();
        gm5 gm5Var = this.f68723P;
        ArrayList arrayListMo12172R = mo12172R(gm5Var, c0713b, z);
        if (!arrayListMo12172R.isEmpty() || !z) {
            return arrayListMo12172R;
        }
        ArrayList arrayListMo12172R2 = mo12172R(gm5Var, c0713b, false);
        if (!arrayListMo12172R2.isEmpty()) {
            ss5.m21707d0("MediaCodecRenderer", "Drm session requires secure decoder for " + c0713b.f6406o + ", but no secure decoder available. Trying to proceed with " + arrayListMo12172R2 + ".");
        }
        return arrayListMo12172R2;
    }

    /* JADX INFO: renamed from: P */
    public int mo12168P(m32 m32Var) {
        return 0;
    }

    /* JADX INFO: renamed from: Q */
    public abstract float mo12170Q(float f, C0713b c0713b, C0713b[] c0713bArr);

    /* JADX INFO: renamed from: R */
    public abstract ArrayList mo12172R(gm5 gm5Var, C0713b c0713b, boolean z);

    /* JADX INFO: renamed from: S */
    public long mo22302S(long j, long j2, boolean z) {
        return super.mo24692i(j, j2);
    }

    /* JADX INFO: renamed from: T */
    public final wt5 m24687T() {
        ArrayDeque arrayDeque = this.f68737W;
        return !arrayDeque.isEmpty() ? (wt5) arrayDeque.getLast() : this.f68730S0;
    }

    /* JADX INFO: renamed from: U */
    public abstract a34 mo12176U(vt5 vt5Var, C0713b c0713b, MediaCrypto mediaCrypto, float f);

    /* JADX INFO: renamed from: V */
    public abstract void mo12178V(m32 m32Var);

    /* JADX INFO: renamed from: W */
    public final void m24688W(vt5 vt5Var, MediaCrypto mediaCrypto) {
        this.f68761p0 = vt5Var;
        C0713b c0713b = this.f68743Z;
        c0713b.getClass();
        String str = vt5Var.f65881a;
        float f = this.f68753h0;
        C0713b[] c0713bArr = this.f69504j;
        c0713bArr.getClass();
        float fMo12170Q = mo12170Q(f, c0713b, c0713bArr);
        if (fMo12170Q <= this.f68725Q) {
            fMo12170Q = -1.0f;
        }
        this.f69501g.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        a34 a34VarMo12176U = mo12176U(vt5Var, c0713b, mediaCrypto, fMo12170Q);
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            xb7 xb7Var = this.f69500f;
            xb7Var.getClass();
            bpb.m4037a(a34VarMo12176U, xb7Var);
        }
        try {
            g8d.m12416a("createCodec:" + str);
            st5 st5VarMo11840b = this.f68721O.mo11840b(a34VarMo12176U);
            this.f68754i0 = st5VarMo11840b;
            this.f68767v0 = st5VarMo11840b.mo10723k(new hi8(this, 22));
            g8d.m12417b();
            this.f69501g.getClass();
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            if (!vt5Var.m23539g(this.f68719N, c0713b)) {
                String strM2519c = C0713b.m2519c(c0713b);
                Locale locale = Locale.US;
                ss5.m21707d0("MediaCodecRenderer", ux5.m22991n("Format exceeds selected codec's capabilities [", strM2519c, ", ", str, "]"));
            }
            this.f68758m0 = fMo12170Q;
            this.f68755j0 = c0713b;
            boolean z = false;
            this.f68762q0 = i == 29 && "c2.android.aac.decoder".equals(str);
            String str2 = vt5Var.f65881a;
            if ((i <= 29 && ("OMX.broadcom.video_decoder.tunnel".equals(str2) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str2) || "OMX.bcm.vdec.avc.tunnel".equals(str2) || "OMX.bcm.vdec.avc.tunnel.secure".equals(str2) || "OMX.bcm.vdec.hevc.tunnel".equals(str2) || "OMX.bcm.vdec.hevc.tunnel.secure".equals(str2))) || ("Amazon".equals(Build.MANUFACTURER) && "AFTS".equals(Build.MODEL) && vt5Var.f65886f)) {
                z = true;
            }
            this.f68765t0 = z;
            this.f68754i0.getClass();
            if (this.f69502h == 2) {
                this.f69501g.getClass();
                this.f68768w0 = SystemClock.elapsedRealtime() + 1000;
            }
            this.f68728R0.f48968a++;
            long j = jElapsedRealtime2 - jElapsedRealtime;
            if (i >= 31 && !this.f68746a1.isEmpty()) {
                st5 st5Var = this.f68754i0;
                st5Var.getClass();
                st5Var.mo10712B(new ArrayList(this.f68746a1));
            }
            mo12181c0(jElapsedRealtime2, j, str);
        } catch (Throwable th) {
            g8d.m12417b();
            throw th;
        }
    }

    /* JADX INFO: renamed from: X */
    public final boolean m24689X(long j, long j2) {
        if (j2 >= j) {
            return false;
        }
        C0713b c0713b = this.f68745a0;
        return (c0713b != null && Objects.equals(c0713b.f6406o, "audio/opus") && syb.m21779d(j, j2)) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x008e  */
    /* JADX WARN: Code duplicated, block: B:54:0x006b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: Y */
    public final void m24690Y() {
        C0713b c0713b;
        web webVar;
        if (this.f68754i0 != null || this.f68707B0 || (c0713b = this.f68743Z) == null) {
            return;
        }
        String str = c0713b.f6406o;
        boolean z = true;
        if (this.f68748c0 == null && mo22305z0(c0713b)) {
            this.f68707B0 = false;
            m24696q0();
            boolean zEquals = "audio/mp4a-latm".equals(str);
            ub0 ub0Var = this.f68733U;
            if (zEquals || "audio/mpeg".equals(str) || "audio/opus".equals(str)) {
                ub0Var.getClass();
                ub0Var.f63663l = 32;
            } else {
                ub0Var.getClass();
                ub0Var.f63663l = 1;
            }
            this.f68707B0 = true;
            return;
        }
        m24698t0(this.f68748c0);
        if (this.f68747b0 == null) {
            try {
                webVar = this.f68747b0;
                if (webVar == null && (webVar.m23867D() == 3 || this.f68747b0.m23867D() == 4)) {
                    web webVar2 = this.f68747b0;
                    str.getClass();
                    if (!webVar2.m23875N(str)) {
                        z = false;
                    }
                } else {
                    z = false;
                }
                m24691Z(this.f68750e0, z);
            } catch (MediaCodecRenderer$DecoderInitializationException e) {
                throw m24992g(e, c0713b, false, 4001);
            }
        } else {
            bna.m3987z(this.f68750e0 == null);
            web webVar3 = this.f68747b0;
            webVar3.getClass();
            boolean z2 = vg3.f65344a;
            if (webVar3.m23882r() != null) {
                webVar = this.f68747b0;
                if (webVar == null) {
                    z = false;
                } else {
                    z = false;
                }
                m24691Z(this.f68750e0, z);
            }
        }
        MediaCrypto mediaCrypto = this.f68750e0;
        if (mediaCrypto == null || this.f68754i0 != null) {
            return;
        }
        mediaCrypto.release();
        this.f68750e0 = null;
    }

    /* JADX INFO: renamed from: Z */
    public final void m24691Z(MediaCrypto mediaCrypto, boolean z) throws MediaCodecRenderer$DecoderInitializationException {
        C0713b c0713b = this.f68743Z;
        c0713b.getClass();
        if (this.f68759n0 == null) {
            try {
                List listM24686O = m24686O(z);
                this.f68759n0 = new ArrayDeque();
                ArrayList arrayList = (ArrayList) listM24686O;
                if (!arrayList.isEmpty()) {
                    this.f68759n0.add((vt5) arrayList.get(0));
                }
                this.f68760o0 = null;
            } catch (MediaCodecUtil$DecoderQueryException e) {
                throw new MediaCodecRenderer$DecoderInitializationException(c0713b, e, z, -49998);
            }
        }
        if (this.f68759n0.isEmpty()) {
            throw new MediaCodecRenderer$DecoderInitializationException(c0713b, (MediaCodecUtil$DecoderQueryException) null, z, -49999);
        }
        ArrayDeque arrayDeque = this.f68759n0;
        arrayDeque.getClass();
        while (this.f68754i0 == null) {
            vt5 vt5Var = (vt5) arrayDeque.peekFirst();
            vt5Var.getClass();
            if (!mo12179a0(c0713b) || !mo12198x0(vt5Var)) {
                return;
            }
            try {
                m24688W(vt5Var, mediaCrypto);
            } catch (Exception e2) {
                ss5.m21709e0("MediaCodecRenderer", "Failed to initialize decoder: " + vt5Var, e2);
                arrayDeque.removeFirst();
                MediaCodecRenderer$DecoderInitializationException mediaCodecRenderer$DecoderInitializationException = new MediaCodecRenderer$DecoderInitializationException(c0713b, e2, z, vt5Var);
                mo12180b0(mediaCodecRenderer$DecoderInitializationException);
                if (this.f68760o0 == null) {
                    this.f68760o0 = mediaCodecRenderer$DecoderInitializationException;
                } else {
                    this.f68760o0 = MediaCodecRenderer$DecoderInitializationException.m2530a(this.f68760o0);
                }
                if (arrayDeque.isEmpty()) {
                    throw this.f68760o0;
                }
            }
        }
        this.f68759n0 = null;
    }

    /* JADX INFO: renamed from: a0 */
    public boolean mo12179a0(C0713b c0713b) {
        return true;
    }

    /* JADX INFO: renamed from: b0 */
    public abstract void mo12180b0(Exception exc);

    /* JADX INFO: renamed from: c0 */
    public abstract void mo12181c0(long j, long j2, String str);

    @Override // p000.y90, p000.yb7
    /* JADX INFO: renamed from: d */
    public void mo4256d(int i, Object obj) {
        if (i == 11) {
            mw2 mw2Var = (mw2) obj;
            mw2Var.getClass();
            this.f68749d0 = mw2Var;
            return;
        }
        if (i != 21) {
            if (i != 22) {
                return;
            }
            obj.getClass();
            ImmutableSet immutableSet = (ImmutableSet) obj;
            if (this.f68746a1.equals(immutableSet)) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 31) {
                HashSet hashSet = new HashSet(immutableSet);
                HashSet hashSet2 = new HashSet();
                bga it = this.f68746a1.iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    if (!hashSet.remove(str)) {
                        hashSet2.add(str);
                    }
                }
                st5 st5Var = this.f68754i0;
                if (st5Var != null) {
                    if (!hashSet2.isEmpty()) {
                        st5Var.mo10714F(new ArrayList(hashSet2));
                    }
                    if (!hashSet.isEmpty()) {
                        st5Var.mo10712B(new ArrayList(hashSet));
                    }
                }
            }
            this.f68746a1 = immutableSet;
            return;
        }
        obj.getClass();
        l41 l41Var = (l41) obj;
        this.f68742Y0 = l41Var;
        st5 st5Var2 = this.f68754i0;
        if (st5Var2 != null) {
            Bundle bundle = new Bundle();
            for (Map.Entry entry : l41Var.f49012a.entrySet()) {
                String str2 = (String) entry.getKey();
                Object value = entry.getValue();
                if (value != null) {
                    if (value instanceof Integer) {
                        bundle.putInt(str2, ((Integer) value).intValue());
                    } else if (value instanceof Long) {
                        bundle.putLong(str2, ((Long) value).longValue());
                    } else if (value instanceof Float) {
                        bundle.putFloat(str2, ((Float) value).floatValue());
                    } else if (value instanceof String) {
                        bundle.putString(str2, (String) value);
                    } else if (value instanceof ByteBuffer) {
                        ByteBuffer byteBuffer = (ByteBuffer) value;
                        byte[] bArr = new byte[byteBuffer.remaining()];
                        byteBuffer.duplicate().get(bArr);
                        bundle.putByteArray(str2, bArr);
                    }
                }
            }
            st5Var2.mo10717d(bundle);
        }
    }

    /* JADX INFO: renamed from: d0 */
    public abstract void mo12182d0(l41 l41Var);

    /* JADX INFO: renamed from: e0 */
    public abstract void mo12183e0(String str);

    /* JADX WARN: Code duplicated, block: B:38:0x0095  */
    /* JADX INFO: renamed from: f0 */
    public o32 mo12184f0(p33 p33Var) {
        this.f68722O0 = true;
        C0713b c0713bM16068a = (C0713b) p33Var.f55514c;
        c0713bM16068a.getClass();
        String str = c0713bM16068a.f6406o;
        int i = 0;
        if (str == null) {
            throw m24992g(new IllegalArgumentException("Sample MIME type is null."), c0713bM16068a, false, 4005);
        }
        if ((str.equals("video/av01") || str.equals("video/x-vnd.on2.vp9") || (str.equals("video/dolby-vision") && Objects.equals(au5.m3052c(c0713bM16068a), "video/av01"))) && !c0713bM16068a.f6409r.isEmpty()) {
            lc3 lc3VarM2520a = c0713bM16068a.m2520a();
            lc3VarM2520a.m16075h();
            c0713bM16068a = lc3VarM2520a.m16068a();
        }
        C0713b c0713b = c0713bM16068a;
        web webVar = (web) p33Var.f55513b;
        web.m23861M(this.f68748c0, webVar);
        this.f68748c0 = webVar;
        this.f68743Z = c0713b;
        if (this.f68707B0) {
            this.f68709D0 = true;
            return null;
        }
        st5 st5Var = this.f68754i0;
        if (st5Var == null) {
            this.f68759n0 = null;
            m24690Y();
            return null;
        }
        vt5 vt5Var = this.f68761p0;
        vt5Var.getClass();
        C0713b c0713b2 = this.f68755j0;
        c0713b2.getClass();
        if (this.f68747b0 != this.f68748c0) {
            if (this.f68714I0) {
                this.f68712G0 = 1;
                this.f68713H0 = 3;
            } else {
                m24695o0();
                m24690Y();
            }
            return new o32(vt5Var.f65881a, c0713b2, c0713b, 0, 128);
        }
        boolean z = this.f68748c0 != this.f68747b0;
        o32 o32VarMo12159I = mo12159I(vt5Var, c0713b2, c0713b);
        int i2 = o32VarMo12159I.f53763d;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        uk9.m22770c();
                        return null;
                    }
                    if (m24676B0(c0713b)) {
                        this.f68755j0 = c0713b;
                        if (z) {
                            m24682K();
                        }
                    } else {
                        i = 16;
                    }
                } else if (m24676B0(c0713b)) {
                    this.f68710E0 = true;
                    this.f68711F0 = 1;
                    this.f68763r0 = false;
                    this.f68755j0 = c0713b;
                    if (z) {
                        m24682K();
                    }
                } else {
                    i = 16;
                }
            } else if (m24676B0(c0713b)) {
                this.f68755j0 = c0713b;
                if (z) {
                    m24682K();
                } else if (this.f68714I0) {
                    this.f68712G0 = 1;
                    this.f68713H0 = 1;
                }
            } else {
                i = 16;
            }
        } else if (this.f68714I0) {
            this.f68712G0 = 1;
            this.f68713H0 = 3;
        } else {
            m24695o0();
            m24690Y();
        }
        return (i2 == 0 || (this.f68754i0 == st5Var && this.f68713H0 != 3)) ? o32VarMo12159I : new o32(vt5Var.f65881a, c0713b2, c0713b, 0, i);
    }

    /* JADX INFO: renamed from: g0 */
    public abstract void mo12185g0(C0713b c0713b, MediaFormat mediaFormat);

    /* JADX INFO: renamed from: h0 */
    public void mo22303h0() {
    }

    @Override // p000.y90
    /* JADX INFO: renamed from: i */
    public final long mo24692i(long j, long j2) {
        return mo22302S(j, j2, this.f68767v0);
    }

    /* JADX INFO: renamed from: i0 */
    public void mo12187i0(long j) {
        this.f68732T0 = j;
        while (true) {
            ArrayDeque arrayDeque = this.f68737W;
            if (arrayDeque.isEmpty() || j < ((wt5) arrayDeque.peek()).f67277a) {
                return;
            }
            wt5 wt5Var = (wt5) arrayDeque.poll();
            wt5Var.getClass();
            m24699u0(wt5Var);
            mo12188j0();
        }
    }

    /* JADX INFO: renamed from: j0 */
    public abstract void mo12188j0();

    /* JADX INFO: renamed from: k0 */
    public void mo12189k0(m32 m32Var) {
    }

    /* JADX INFO: renamed from: l0 */
    public final void m24693l0() {
        int i = this.f68713H0;
        if (i == 1) {
            m24685N();
            return;
        }
        if (i == 2) {
            m24685N();
            m24677C0();
        } else if (i != 3) {
            this.f68720N0 = true;
            mo12191p0();
        } else {
            m24695o0();
            m24690Y();
        }
    }

    /* JADX INFO: renamed from: m0 */
    public abstract boolean mo12190m0(long j, long j2, st5 st5Var, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, C0713b c0713b);

    /* JADX INFO: renamed from: n0 */
    public final boolean m24694n0(int i) {
        p33 p33Var = this.f69497c;
        p33Var.m18865G();
        m32 m32Var = this.f68727R;
        m32Var.mo16607k();
        int iM24994y = m24994y(p33Var, m32Var, i | 4);
        if (iM24994y == -5) {
            mo12184f0(p33Var);
            return true;
        }
        if (iM24994y != -4 || !m32Var.m3751d(4)) {
            return false;
        }
        this.f68718M0 = true;
        m24693l0();
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: o0 */
    public final void m24695o0() {
        try {
            st5 st5Var = this.f68754i0;
            if (st5Var != null) {
                st5Var.mo10715a();
                this.f68728R0.f48969b++;
                vt5 vt5Var = this.f68761p0;
                vt5Var.getClass();
                mo12183e0(vt5Var.f65881a);
            }
            this.f68754i0 = null;
            try {
                MediaCrypto mediaCrypto = this.f68750e0;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
                this.f68750e0 = null;
                m24698t0(null);
                m24697s0();
            }
        } catch (Throwable th) {
            this.f68754i0 = null;
            try {
                MediaCrypto mediaCrypto2 = this.f68750e0;
                if (mediaCrypto2 != null) {
                    mediaCrypto2.release();
                }
                throw th;
            } finally {
                this.f68750e0 = null;
                m24698t0(null);
                m24697s0();
            }
        }
    }

    @Override // p000.y90
    /* JADX INFO: renamed from: p */
    public void mo4260p() {
        this.f68743Z = null;
        m24699u0(wt5.f67276f);
        this.f68737W.clear();
        if (this.f68707B0) {
            this.f68707B0 = false;
            m24696q0();
        } else {
            if (this.f68754i0 == null) {
                return;
            }
            if (mo12199y0()) {
                m24695o0();
            } else if (mo12196w0()) {
                m24685N();
            } else {
                this.f68738W0 = true;
            }
        }
    }

    /* JADX INFO: renamed from: p0 */
    public abstract void mo12191p0();

    /* JADX INFO: renamed from: q0 */
    public final void m24696q0() {
        this.f68717L0 = -9223372036854775807L;
        m24687T().f67281e = -9223372036854775807L;
        this.f68732T0 = -9223372036854775807L;
        this.f68709D0 = false;
        this.f68733U.mo16607k();
        this.f68731T.mo16607k();
        this.f68708C0 = false;
        sq6 sq6Var = this.f68739X;
        sq6Var.getClass();
        sq6Var.f61255c = InterfaceC0828bz.f9188a;
        sq6Var.f61254b = 0;
        sq6Var.f61253a = 2;
    }

    @Override // p000.y90
    /* JADX INFO: renamed from: r */
    public void mo4262r(long j, boolean z, boolean z2) {
        ArrayDeque arrayDeque = this.f68737W;
        if (!arrayDeque.isEmpty()) {
            this.f68730S0 = (wt5) arrayDeque.getLast();
        }
        arrayDeque.clear();
        if (z2) {
            this.f68718M0 = false;
            this.f68720N0 = false;
            this.f68724P0 = false;
            if (this.f68707B0) {
                m24696q0();
            } else if (this.f68754i0 != null) {
                if (mo12199y0()) {
                    m24695o0();
                    m24690Y();
                } else if (mo12196w0()) {
                    m24685N();
                } else {
                    this.f68738W0 = true;
                }
            }
            if (this.f68730S0.f67280d.m12641t() > 0) {
                this.f68722O0 = true;
            }
            this.f68730S0.f67280d.m12624c();
        }
    }

    /* JADX INFO: renamed from: r0 */
    public void mo12192r0() {
        this.f68769x0 = -1;
        this.f68729S.f50500e = null;
        this.f68770y0 = -1;
        this.f68771z0 = null;
        this.f68717L0 = -9223372036854775807L;
        m24687T().f67281e = -9223372036854775807L;
        this.f68732T0 = -9223372036854775807L;
        this.f68768w0 = -9223372036854775807L;
        this.f68715J0 = false;
        this.f68766u0 = -9223372036854775807L;
        this.f68714I0 = false;
        this.f68763r0 = false;
        this.f68764s0 = false;
        this.f68706A0 = false;
        this.f68712G0 = 0;
        this.f68713H0 = 0;
        this.f68711F0 = this.f68710E0 ? 1 : 0;
        this.f68738W0 = false;
        this.f68740X0 = 0L;
    }

    /* JADX INFO: renamed from: s0 */
    public final void m24697s0() {
        mo12192r0();
        this.f68726Q0 = null;
        this.f68759n0 = null;
        this.f68761p0 = null;
        this.f68755j0 = null;
        this.f68756k0 = null;
        this.f68757l0 = false;
        this.f68716K0 = false;
        this.f68758m0 = -1.0f;
        this.f68762q0 = false;
        this.f68765t0 = false;
        this.f68767v0 = false;
        this.f68710E0 = false;
        this.f68711F0 = 0;
    }

    /* JADX INFO: renamed from: t0 */
    public final void m24698t0(web webVar) {
        web.m23861M(this.f68747b0, webVar);
        this.f68747b0 = webVar;
    }

    /* JADX INFO: renamed from: u0 */
    public final void m24699u0(wt5 wt5Var) {
        this.f68730S0 = wt5Var;
        if (wt5Var.f67279c != -9223372036854775807L) {
            this.f68734U0 = true;
            mo22303h0();
        }
    }

    /* JADX INFO: renamed from: v0 */
    public boolean mo12195v0(m32 m32Var) {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
    
        if (r4 >= r0) goto L16;
     */
    @Override // p000.y90
    /* JADX INFO: renamed from: w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo4265w(C0713b[] c0713bArr, long j, long j2, jv5 jv5Var) {
        if (this.f68730S0.f67279c == -9223372036854775807L) {
            m24699u0(new wt5(-9223372036854775807L, j, j2));
            if (this.f68736V0) {
                mo12188j0();
                return;
            }
            return;
        }
        ArrayDeque arrayDeque = this.f68737W;
        if (arrayDeque.isEmpty()) {
            long j3 = this.f68717L0;
            if (j3 != -9223372036854775807L) {
                long j4 = this.f68732T0;
                if (j4 != -9223372036854775807L) {
                }
            }
            m24699u0(new wt5(-9223372036854775807L, j, j2));
            if (this.f68730S0.f67279c != -9223372036854775807L) {
                mo12188j0();
                return;
            }
            return;
        }
        arrayDeque.add(new wt5(this.f68717L0, j, j2));
    }

    /* JADX INFO: renamed from: w0 */
    public boolean mo12196w0() {
        return true;
    }

    /* JADX INFO: renamed from: x0 */
    public boolean mo12198x0(vt5 vt5Var) {
        return true;
    }

    /* JADX INFO: renamed from: y0 */
    public boolean mo12199y0() {
        int i = this.f68713H0;
        if (i == 3 || (this.f68762q0 && !this.f68716K0)) {
            return true;
        }
        if (i != 2) {
            return false;
        }
        try {
            m24677C0();
            return false;
        } catch (ExoPlaybackException e) {
            ss5.m21709e0("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e);
            return true;
        }
    }

    @Override // p000.y90
    /* JADX INFO: renamed from: z */
    public void mo4266z(long j, long j2) {
        boolean z;
        boolean z2;
        boolean z3 = false;
        if (this.f68724P0) {
            this.f68724P0 = false;
            m24693l0();
        }
        ExoPlaybackException exoPlaybackException = this.f68726Q0;
        if (exoPlaybackException != null) {
            this.f68726Q0 = null;
            throw exoPlaybackException;
        }
        try {
            if (this.f68720N0) {
                mo12191p0();
                return;
            }
            if (this.f68743Z != null || m24694n0(2)) {
                m24690Y();
                if (this.f68707B0) {
                    g8d.m12416a("bypassRender");
                    while (m24681H(j, j2)) {
                    }
                    g8d.m12417b();
                } else if (this.f68754i0 != null) {
                    this.f69501g.getClass();
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    g8d.m12416a("drainAndFeed");
                    while (m24683L(j, j2)) {
                        long j3 = this.f68751f0;
                        if (j3 != -9223372036854775807L) {
                            this.f69501g.getClass();
                            z2 = SystemClock.elapsedRealtime() - jElapsedRealtime < j3;
                        }
                        if (!z2) {
                            break;
                        }
                    }
                    while (m24684M()) {
                        long j4 = this.f68751f0;
                        if (j4 != -9223372036854775807L) {
                            this.f69501g.getClass();
                            z = SystemClock.elapsedRealtime() - jElapsedRealtime < j4;
                        }
                        if (!z) {
                            break;
                        }
                    }
                    g8d.m12417b();
                } else {
                    l32 l32Var = this.f68728R0;
                    int i = l32Var.f48971d;
                    zk8 zk8Var = this.f69503i;
                    zk8Var.getClass();
                    l32Var.f48971d = i + zk8Var.mo4201d(j - this.f69505k);
                    m24694n0(1);
                }
                synchronized (this.f68728R0) {
                }
            }
        } catch (MediaCodec.CryptoException e) {
            throw m24992g(e, this.f68743Z, false, uma.m22821p(e.getErrorCode()));
        } catch (IllegalStateException e2) {
            boolean z4 = e2 instanceof MediaCodec.CodecException;
            if (!z4) {
                StackTraceElement[] stackTrace = e2.getStackTrace();
                if (stackTrace.length <= 0 || !stackTrace[0].getClassName().equals("android.media.MediaCodec")) {
                    throw e2;
                }
            }
            mo12180b0(e2);
            if (z4 && ((MediaCodec.CodecException) e2).isRecoverable()) {
                z3 = true;
            }
            if (z3) {
                m24695o0();
            }
            MediaCodecDecoderException mediaCodecDecoderExceptionMo12161J = mo12161J(e2, this.f68761p0);
            throw m24992g(mediaCodecDecoderExceptionMo12161J, this.f68743Z, z3, mediaCodecDecoderExceptionMo12161J.f6455a == 1101 ? 4006 : 4003);
        }
    }

    /* JADX INFO: renamed from: z0 */
    public boolean mo22305z0(C0713b c0713b) {
        return false;
    }
}
