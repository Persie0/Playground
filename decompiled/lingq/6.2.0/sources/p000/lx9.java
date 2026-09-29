package p000;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Parcel;
import androidx.media3.common.C0713b;
import androidx.media3.extractor.text.SubtitleDecoderException;
import com.google.common.collect.ImmutableList;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class lx9 extends y90 implements Handler.Callback {

    /* JADX INFO: renamed from: N */
    public final nid f50259N;

    /* JADX INFO: renamed from: O */
    public final m32 f50260O;

    /* JADX INFO: renamed from: P */
    public fs1 f50261P;

    /* JADX INFO: renamed from: Q */
    public final ym9 f50262Q;

    /* JADX INFO: renamed from: R */
    public boolean f50263R;

    /* JADX INFO: renamed from: S */
    public int f50264S;

    /* JADX INFO: renamed from: T */
    public xm9 f50265T;

    /* JADX INFO: renamed from: U */
    public zm9 f50266U;

    /* JADX INFO: renamed from: V */
    public vo0 f50267V;

    /* JADX INFO: renamed from: W */
    public vo0 f50268W;

    /* JADX INFO: renamed from: X */
    public int f50269X;

    /* JADX INFO: renamed from: Y */
    public final Handler f50270Y;

    /* JADX INFO: renamed from: Z */
    public final ew2 f50271Z;

    /* JADX INFO: renamed from: a0 */
    public final p33 f50272a0;

    /* JADX INFO: renamed from: b0 */
    public boolean f50273b0;

    /* JADX INFO: renamed from: c0 */
    public boolean f50274c0;

    /* JADX INFO: renamed from: d0 */
    public C0713b f50275d0;

    /* JADX INFO: renamed from: e0 */
    public long f50276e0;

    /* JADX INFO: renamed from: f0 */
    public long f50277f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lx9(ew2 ew2Var, Looper looper) {
        super(3);
        or3 or3Var = ym9.f70076v;
        this.f50271Z = ew2Var;
        this.f50270Y = looper == null ? null : new Handler(looper, this);
        this.f50262Q = or3Var;
        this.f50259N = new nid();
        this.f50260O = new m32(1);
        this.f50272a0 = new p33(2, false);
        this.f50277f0 = -9223372036854775807L;
        this.f50276e0 = -9223372036854775807L;
    }

    @Override // p000.y90
    /* JADX INFO: renamed from: D */
    public final int mo4251D(C0713b c0713b) {
        boolean zEquals = Objects.equals(c0713b.f6406o, "application/x-media3-cues");
        String str = c0713b.f6406o;
        if (!zEquals) {
            or3 or3Var = (or3) this.f50262Q;
            or3Var.getClass();
            if (!((a3d) or3Var.f54782a).mo89i(c0713b) && !Objects.equals(str, "application/cea-608") && !Objects.equals(str, "application/x-mp4-cea-608") && !Objects.equals(str, "application/cea-708")) {
                return ez5.m11400j(str) ? y90.m24988f(1, 0, 0, 0) : y90.m24988f(0, 0, 0, 0);
            }
        }
        return y90.m24988f(c0713b.f6390P == 0 ? 4 : 2, 0, 0, 0);
    }

    /* JADX INFO: renamed from: G */
    public final void m16562G() {
        boolean z = Objects.equals(this.f50275d0.f6406o, "application/cea-608") || Objects.equals(this.f50275d0.f6406o, "application/x-mp4-cea-608") || Objects.equals(this.f50275d0.f6406o, "application/cea-708");
        String str = this.f50275d0.f6406o;
        if (z) {
            return;
        }
        C3386nv.m17633t(b34.m3207B("Legacy decoding is disabled, can't handle %s samples (expected %s).", str, "application/x-media3-cues"));
    }

    /* JADX INFO: renamed from: H */
    public final void m16563H() {
        ImmutableList immutableListM6289v = ImmutableList.m6289v();
        m16565J(this.f50276e0);
        es1 es1Var = new es1(immutableListM6289v);
        Handler handler = this.f50270Y;
        if (handler != null) {
            handler.obtainMessage(1, es1Var).sendToTarget();
        } else {
            m16567L(es1Var);
        }
    }

    /* JADX INFO: renamed from: I */
    public final long m16564I() {
        if (this.f50269X == -1) {
            return Long.MAX_VALUE;
        }
        this.f50267V.getClass();
        if (this.f50269X >= this.f50267V.mo4454l()) {
            return Long.MAX_VALUE;
        }
        return this.f50267V.mo4447c(this.f50269X);
    }

    /* JADX INFO: renamed from: J */
    public final long m16565J(long j) {
        bna.m3987z(j != -9223372036854775807L);
        return j - this.f69505k;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0050  */
    /* JADX WARN: Code duplicated, block: B:24:0x0056  */
    /* JADX WARN: Code duplicated, block: B:27:0x0075  */
    /* JADX INFO: renamed from: K */
    public final void m16566K() {
        xm9 qa2Var;
        byte b = 1;
        this.f50263R = true;
        C0713b c0713b = this.f50275d0;
        c0713b.getClass();
        a3d a3dVar = (a3d) ((or3) this.f50262Q).f54782a;
        String str = c0713b.f6406o;
        int i = c0713b.f6386L;
        if (str != null) {
            switch (str.hashCode()) {
                case 930165504:
                    b = !str.equals("application/x-mp4-cea-608") ? (byte) -1 : (byte) 0;
                    break;
                case 1566015601:
                    if (!str.equals("application/cea-608")) {
                        b = -1;
                    }
                    break;
                case 1566016562:
                    b = !str.equals("application/cea-708") ? (byte) -1 : (byte) 2;
                    break;
                default:
                    b = -1;
                    break;
            }
            switch (b) {
                case 0:
                case 1:
                    qa2Var = new po0(str, i);
                    break;
                case 2:
                    qa2Var = new to0(i, c0713b.f6409r);
                    break;
                default:
                    if (a3dVar.mo89i(c0713b)) {
                        C3386nv.m17626m(AbstractC3393o1.m17734i("Attempted to create decoder for unsupported MIME type: ", str));
                        return;
                    }
                    cn9 cn9VarMo85e = a3dVar.mo85e(c0713b);
                    cn9VarMo85e.getClass().getSimpleName().concat("Decoder");
                    qa2Var = new qa2(cn9VarMo85e);
                    break;
                    break;
            }
        } else if (a3dVar.mo89i(c0713b)) {
            C3386nv.m17626m(AbstractC3393o1.m17734i("Attempted to create decoder for unsupported MIME type: ", str));
            return;
        } else {
            cn9 cn9VarMo85e2 = a3dVar.mo85e(c0713b);
            cn9VarMo85e2.getClass().getSimpleName().concat("Decoder");
            qa2Var = new qa2(cn9VarMo85e2);
        }
        this.f50265T = qa2Var;
        qa2Var.mo14783b(this.f69506l);
    }

    /* JADX INFO: renamed from: L */
    public final void m16567L(es1 es1Var) {
        ImmutableList immutableList = es1Var.f37771a;
        ew2 ew2Var = this.f50271Z;
        ew2Var.f37985a.f46295m.m23271d(27, new c52(immutableList));
        ew2Var.f37985a.f46295m.m23271d(27, new C3440oy(es1Var, 10));
    }

    /* JADX INFO: renamed from: M */
    public final void m16568M() {
        this.f50266U = null;
        this.f50269X = -1;
        vo0 vo0Var = this.f50267V;
        if (vo0Var != null) {
            vo0Var.mo10292m();
            this.f50267V = null;
        }
        vo0 vo0Var2 = this.f50268W;
        if (vo0Var2 != null) {
            vo0Var2.mo10292m();
            this.f50268W = null;
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what == 1) {
            m16567L((es1) message.obj);
            return true;
        }
        uk9.m22770c();
        return false;
    }

    @Override // p000.y90
    /* JADX INFO: renamed from: k */
    public final String mo4257k() {
        return "TextRenderer";
    }

    @Override // p000.y90
    /* JADX INFO: renamed from: m */
    public final boolean mo4258m() {
        return this.f50274c0;
    }

    @Override // p000.y90
    /* JADX INFO: renamed from: o */
    public final boolean mo4259o() {
        C0713b c0713b = this.f50275d0;
        if (c0713b != null) {
            if (Objects.equals(c0713b.f6406o, "application/x-media3-cues")) {
                fs1 fs1Var = this.f50261P;
                fs1Var.getClass();
                if (fs1Var.mo12042a(this.f50276e0) == Long.MIN_VALUE) {
                    try {
                        zk8 zk8Var = this.f69503i;
                        zk8Var.getClass();
                        zk8Var.mo4200c();
                        return true;
                    } catch (IOException unused) {
                        return false;
                    }
                }
            } else {
                if (this.f50274c0) {
                    return false;
                }
                if (this.f50273b0) {
                    vo0 vo0Var = this.f50267V;
                    long j = this.f50276e0;
                    if (vo0Var == null || vo0Var.mo4454l() <= 0 || vo0Var.mo4447c(vo0Var.mo4454l() - 1) <= j) {
                        vo0 vo0Var2 = this.f50268W;
                        long j2 = this.f50276e0;
                        if ((vo0Var2 == null || vo0Var2.mo4454l() <= 0 || vo0Var2.mo4447c(vo0Var2.mo4454l() - 1) <= j2) && this.f50266U != null) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    @Override // p000.y90
    /* JADX INFO: renamed from: p */
    public final void mo4260p() {
        this.f50275d0 = null;
        this.f50277f0 = -9223372036854775807L;
        m16563H();
        this.f50276e0 = -9223372036854775807L;
        if (this.f50265T != null) {
            m16568M();
            xm9 xm9Var = this.f50265T;
            xm9Var.getClass();
            xm9Var.mo14782a();
            this.f50265T = null;
            this.f50264S = 0;
        }
    }

    @Override // p000.y90
    /* JADX INFO: renamed from: r */
    public final void mo4262r(long j, boolean z, boolean z2) {
        this.f50276e0 = j;
        fs1 fs1Var = this.f50261P;
        if (fs1Var != null) {
            fs1Var.clear();
        }
        m16563H();
        this.f50273b0 = false;
        this.f50274c0 = false;
        this.f50277f0 = -9223372036854775807L;
        C0713b c0713b = this.f50275d0;
        if (c0713b == null || Objects.equals(c0713b.f6406o, "application/x-media3-cues")) {
            return;
        }
        if (this.f50264S == 0) {
            m16568M();
            xm9 xm9Var = this.f50265T;
            xm9Var.getClass();
            xm9Var.flush();
            xm9Var.mo14783b(this.f69506l);
            return;
        }
        m16568M();
        xm9 xm9Var2 = this.f50265T;
        xm9Var2.getClass();
        xm9Var2.mo14782a();
        this.f50265T = null;
        this.f50264S = 0;
        m16566K();
    }

    @Override // p000.y90
    /* JADX INFO: renamed from: w */
    public final void mo4265w(C0713b[] c0713bArr, long j, long j2, jv5 jv5Var) {
        C0713b c0713b = c0713bArr[0];
        this.f50275d0 = c0713b;
        if (Objects.equals(c0713b.f6406o, "application/x-media3-cues")) {
            this.f50261P = this.f50275d0.f6387M == 1 ? new ox5() : new web(23);
            return;
        }
        m16562G();
        if (this.f50265T != null) {
            this.f50264S = 1;
        } else {
            m16566K();
        }
    }

    @Override // p000.y90
    /* JADX INFO: renamed from: z */
    public final void mo4266z(long j, long j2) {
        boolean z;
        p33 p33Var;
        long jMo4447c;
        int i = 1;
        if (this.f69490I) {
            long j3 = this.f50277f0;
            if (j3 != -9223372036854775807L && j >= j3) {
                m16568M();
                this.f50274c0 = true;
            }
        }
        if (this.f50274c0) {
            return;
        }
        C0713b c0713b = this.f50275d0;
        c0713b.getClass();
        boolean zEquals = Objects.equals(c0713b.f6406o, "application/x-media3-cues");
        Handler handler = this.f50270Y;
        p33 p33Var2 = this.f50272a0;
        boolean zMo12043c = false;
        if (zEquals) {
            this.f50261P.getClass();
            if (!this.f50273b0) {
                m32 m32Var = this.f50260O;
                if (m24994y(p33Var2, m32Var, 0) == -4) {
                    if (m32Var.m3751d(4)) {
                        this.f50273b0 = true;
                    } else {
                        m32Var.m16610o();
                        ByteBuffer byteBuffer = m32Var.f50500e;
                        byteBuffer.getClass();
                        long j4 = m32Var.f50502g;
                        byte[] bArrArray = byteBuffer.array();
                        int iArrayOffset = byteBuffer.arrayOffset();
                        int iLimit = byteBuffer.limit();
                        this.f50259N.getClass();
                        Parcel parcelObtain = Parcel.obtain();
                        parcelObtain.unmarshall(bArrArray, iArrayOffset, iLimit);
                        parcelObtain.setDataPosition(0);
                        Bundle bundle = parcelObtain.readBundle(Bundle.class.getClassLoader());
                        parcelObtain.recycle();
                        ArrayList parcelableArrayList = bundle.getParcelableArrayList("c");
                        parcelableArrayList.getClass();
                        gs1 gs1Var = new gs1(j4, bundle.getLong("d"), a5d.m127b(new tj0(i), parcelableArrayList));
                        m32Var.mo16607k();
                        zMo12043c = this.f50261P.mo12043c(gs1Var, j);
                    }
                }
            }
            long jMo12042a = this.f50261P.mo12042a(this.f50276e0);
            if (jMo12042a == Long.MIN_VALUE && this.f50273b0 && !zMo12043c) {
                this.f50274c0 = true;
            }
            if (jMo12042a != Long.MIN_VALUE && jMo12042a <= j) {
                zMo12043c = true;
            }
            if (zMo12043c) {
                ImmutableList immutableListMo12044d = this.f50261P.mo12044d(j);
                long jMo12045i = this.f50261P.mo12045i(j);
                m16565J(jMo12045i);
                es1 es1Var = new es1(immutableListMo12044d);
                if (handler != null) {
                    handler.obtainMessage(1, es1Var).sendToTarget();
                } else {
                    m16567L(es1Var);
                }
                this.f50261P.mo12046k(jMo12045i);
            }
            this.f50276e0 = j;
            return;
        }
        m16562G();
        this.f50276e0 = j;
        if (this.f50268W == null) {
            xm9 xm9Var = this.f50265T;
            xm9Var.getClass();
            xm9Var.mo19837c(j);
            try {
                xm9 xm9Var2 = this.f50265T;
                xm9Var2.getClass();
                this.f50268W = (vo0) xm9Var2.mo14784d();
            } catch (SubtitleDecoderException e) {
                ss5.m21724v("TextRenderer", "Subtitle decoding failed. streamFormat=" + this.f50275d0, e);
                m16563H();
                m16568M();
                xm9 xm9Var3 = this.f50265T;
                xm9Var3.getClass();
                xm9Var3.mo14782a();
                this.f50265T = null;
                this.f50264S = 0;
                m16566K();
                return;
            }
        }
        if (this.f69502h != 2) {
            return;
        }
        if (this.f50267V != null) {
            long jM16564I = m16564I();
            z = false;
            while (jM16564I <= j) {
                this.f50269X++;
                jM16564I = m16564I();
                z = true;
            }
        } else {
            z = false;
        }
        vo0 vo0Var = this.f50268W;
        if (vo0Var == null) {
            p33Var = p33Var2;
        } else if (vo0Var.m3751d(4)) {
            if (!z && m16564I() == Long.MAX_VALUE) {
                if (this.f50264S == 2) {
                    m16568M();
                    xm9 xm9Var4 = this.f50265T;
                    xm9Var4.getClass();
                    xm9Var4.mo14782a();
                    this.f50265T = null;
                    this.f50264S = 0;
                    m16566K();
                } else {
                    m16568M();
                    this.f50274c0 = true;
                }
            }
            p33Var = p33Var2;
        } else {
            p33Var = p33Var2;
            if (vo0Var.f52260c <= j) {
                vo0 vo0Var2 = this.f50267V;
                if (vo0Var2 != null) {
                    vo0Var2.mo10292m();
                }
                this.f50269X = vo0Var.mo4446b(j);
                this.f50267V = vo0Var;
                this.f50268W = null;
                z = true;
            }
        }
        if (z) {
            this.f50267V.getClass();
            int iMo4446b = this.f50267V.mo4446b(j);
            if (iMo4446b == 0 || this.f50267V.mo4454l() == 0) {
                jMo4447c = this.f50267V.f52260c;
            } else {
                vo0 vo0Var3 = this.f50267V;
                jMo4447c = iMo4446b == -1 ? vo0Var3.mo4447c(vo0Var3.mo4454l() - 1) : vo0Var3.mo4447c(iMo4446b - 1);
            }
            m16565J(jMo4447c);
            es1 es1Var2 = new es1(this.f50267V.mo4453i(j));
            if (handler != null) {
                handler.obtainMessage(1, es1Var2).sendToTarget();
            } else {
                m16567L(es1Var2);
            }
        }
        if (this.f50264S == 2) {
            return;
        }
        while (!this.f50273b0) {
            try {
                zm9 zm9Var = this.f50266U;
                if (zm9Var == null) {
                    xm9 xm9Var5 = this.f50265T;
                    xm9Var5.getClass();
                    zm9Var = (zm9) xm9Var5.mo14785e();
                    if (zm9Var == null) {
                        return;
                    } else {
                        this.f50266U = zm9Var;
                    }
                }
                if (this.f50264S == 1) {
                    zm9Var.f8576b = 4;
                    xm9 xm9Var6 = this.f50265T;
                    xm9Var6.getClass();
                    xm9Var6.mo14786f(zm9Var);
                    this.f50266U = null;
                    this.f50264S = 2;
                    return;
                }
                int iM24994y = m24994y(p33Var, zm9Var, 0);
                if (iM24994y == -4) {
                    if (zm9Var.m3751d(4)) {
                        this.f50273b0 = true;
                        this.f50263R = false;
                    } else {
                        C0713b c0713b2 = (C0713b) p33Var.f55514c;
                        if (c0713b2 == null) {
                            return;
                        }
                        zm9Var.f71783j = c0713b2.f6411t;
                        zm9Var.m16610o();
                        this.f50263R &= !zm9Var.m3751d(1);
                    }
                    if (!this.f50263R) {
                        xm9 xm9Var7 = this.f50265T;
                        xm9Var7.getClass();
                        xm9Var7.mo14786f(zm9Var);
                        this.f50266U = null;
                    }
                } else if (iM24994y == -3) {
                    return;
                }
            } catch (SubtitleDecoderException e2) {
                ss5.m21724v("TextRenderer", "Subtitle decoding failed. streamFormat=" + this.f50275d0, e2);
                m16563H();
                m16568M();
                xm9 xm9Var8 = this.f50265T;
                xm9Var8.getClass();
                xm9Var8.mo14782a();
                this.f50265T = null;
                this.f50264S = 0;
                m16566K();
                return;
            }
        }
    }
}
