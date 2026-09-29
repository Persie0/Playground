package p219ka;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.exoplayer2.AbstractC2406e;
import com.google.android.exoplayer2.C2413j;
import com.google.android.exoplayer2.C2416m;
import com.google.android.exoplayer2.decoder.DecoderException;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import com.google.common.collect.ImmutableList;
import org.checkerframework.dataflow.qual.SideEffectFree;
import p150h9.InterfaceC5924l0;
import p290o6.C7968m;
import p479xa.C10129a;
import p479xa.C10134c0;
import p479xa.C10145n;
import p479xa.C10147p;

/* JADX INFO: renamed from: ka.m */
/* JADX INFO: loaded from: classes.dex */
public final class C6652m extends AbstractC2406e implements Handler.Callback {

    /* JADX INFO: renamed from: H */
    public final Handler f37703H;

    /* JADX INFO: renamed from: I */
    public final InterfaceC6651l f37704I;

    /* JADX INFO: renamed from: J */
    public final InterfaceC6648i f37705J;

    /* JADX INFO: renamed from: K */
    public final C7968m f37706K;

    /* JADX INFO: renamed from: L */
    public boolean f37707L;

    /* JADX INFO: renamed from: M */
    public boolean f37708M;

    /* JADX INFO: renamed from: N */
    public boolean f37709N;

    /* JADX INFO: renamed from: O */
    public int f37710O;

    /* JADX INFO: renamed from: P */
    public C2416m f37711P;

    /* JADX INFO: renamed from: Q */
    public InterfaceC6647h f37712Q;

    /* JADX INFO: renamed from: R */
    public C6649j f37713R;

    /* JADX INFO: renamed from: S */
    public AbstractC6650k f37714S;

    /* JADX INFO: renamed from: T */
    public AbstractC6650k f37715T;

    /* JADX INFO: renamed from: U */
    public int f37716U;

    /* JADX INFO: renamed from: V */
    public long f37717V;

    /* JADX INFO: renamed from: W */
    public long f37718W;

    /* JADX INFO: renamed from: X */
    public long f37719X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6652m(C2413j.b bVar, Looper looper) {
        Handler handler;
        super(3);
        InterfaceC6648i.a aVar = InterfaceC6648i.f37699a;
        this.f37704I = bVar;
        if (looper == null) {
            handler = null;
        } else {
            int i10 = C10134c0.f51354a;
            handler = new Handler(looper, this);
        }
        this.f37703H = handler;
        this.f37705J = aVar;
        this.f37706K = new C7968m();
        this.f37717V = -9223372036854775807L;
        this.f37718W = -9223372036854775807L;
        this.f37719X = -9223372036854775807L;
    }

    @Override // com.google.android.exoplayer2.AbstractC2406e
    /* JADX INFO: renamed from: B */
    public final void mo6864B() {
        this.f37711P = null;
        this.f37717V = -9223372036854775807L;
        m13283J();
        this.f37718W = -9223372036854775807L;
        this.f37719X = -9223372036854775807L;
        m13286M();
        InterfaceC6647h interfaceC6647h = this.f37712Q;
        interfaceC6647h.getClass();
        interfaceC6647h.release();
        this.f37712Q = null;
        this.f37710O = 0;
    }

    @Override // com.google.android.exoplayer2.AbstractC2406e
    /* JADX INFO: renamed from: D */
    public final void mo6867D(boolean z10, long j10) {
        this.f37719X = j10;
        m13283J();
        this.f37707L = false;
        this.f37708M = false;
        this.f37717V = -9223372036854775807L;
        if (this.f37710O == 0) {
            m13286M();
            InterfaceC6647h interfaceC6647h = this.f37712Q;
            interfaceC6647h.getClass();
            interfaceC6647h.flush();
            return;
        }
        m13286M();
        InterfaceC6647h interfaceC6647h2 = this.f37712Q;
        interfaceC6647h2.getClass();
        interfaceC6647h2.release();
        this.f37712Q = null;
        this.f37710O = 0;
        this.f37709N = true;
        C2416m c2416m = this.f37711P;
        c2416m.getClass();
        this.f37712Q = ((InterfaceC6648i.a) this.f37705J).m13280a(c2416m);
    }

    @Override // com.google.android.exoplayer2.AbstractC2406e
    /* JADX INFO: renamed from: H */
    public final void mo6992H(C2416m[] c2416mArr, long j10, long j11) {
        this.f37718W = j11;
        C2416m c2416m = c2416mArr[0];
        this.f37711P = c2416m;
        if (this.f37712Q != null) {
            this.f37710O = 1;
            return;
        }
        this.f37709N = true;
        c2416m.getClass();
        this.f37712Q = ((InterfaceC6648i.a) this.f37705J).m13280a(c2416m);
    }

    /* JADX INFO: renamed from: J */
    public final void m13283J() {
        C6642c c6642c = new C6642c(ImmutableList.m9062Y(), m13285L(this.f37719X));
        Handler handler = this.f37703H;
        if (handler != null) {
            handler.obtainMessage(0, c6642c).sendToTarget();
            return;
        }
        ImmutableList<C6640a> immutableList = c6642c.f37689a;
        InterfaceC6651l interfaceC6651l = this.f37704I;
        interfaceC6651l.mo7056y(immutableList);
        interfaceC6651l.mo7048j(c6642c);
    }

    /* JADX INFO: renamed from: K */
    public final long m13284K() {
        if (this.f37716U == -1) {
            return Long.MAX_VALUE;
        }
        this.f37714S.getClass();
        if (this.f37716U >= this.f37714S.mo11457i()) {
            return Long.MAX_VALUE;
        }
        return this.f37714S.mo11455f(this.f37716U);
    }

    @SideEffectFree
    /* JADX INFO: renamed from: L */
    public final long m13285L(long j10) {
        boolean z10 = true;
        C10129a.m18992d(j10 != -9223372036854775807L);
        if (this.f37718W == -9223372036854775807L) {
            z10 = false;
        }
        C10129a.m18992d(z10);
        return j10 - this.f37718W;
    }

    /* JADX INFO: renamed from: M */
    public final void m13286M() {
        this.f37713R = null;
        this.f37716U = -1;
        AbstractC6650k abstractC6650k = this.f37714S;
        if (abstractC6650k != null) {
            abstractC6650k.mo13274p();
            this.f37714S = null;
        }
        AbstractC6650k abstractC6650k2 = this.f37715T;
        if (abstractC6650k2 != null) {
            abstractC6650k2.mo13274p();
            this.f37715T = null;
        }
    }

    @Override // com.google.android.exoplayer2.InterfaceC2536y, p150h9.InterfaceC5924l0
    /* JADX INFO: renamed from: a */
    public final String mo6875a() {
        return "TextRenderer";
    }

    @Override // p150h9.InterfaceC5924l0
    /* JADX INFO: renamed from: b */
    public final int mo7144b(C2416m c2416m) {
        if (((InterfaceC6648i.a) this.f37705J).m13281b(c2416m)) {
            return InterfaceC5924l0.m12343j(c2416m.f12473b0 == 0 ? 4 : 2, 0, 0);
        }
        return C10147p.m19110j(c2416m.f12484l) ? InterfaceC5924l0.m12343j(1, 0, 0) : InterfaceC5924l0.m12343j(0, 0, 0);
    }

    @Override // com.google.android.exoplayer2.AbstractC2406e, com.google.android.exoplayer2.InterfaceC2536y
    /* JADX INFO: renamed from: d */
    public final boolean mo6877d() {
        return this.f37708M;
    }

    @Override // com.google.android.exoplayer2.InterfaceC2536y
    /* JADX INFO: renamed from: e */
    public final boolean mo6879e() {
        return true;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            throw new IllegalStateException();
        }
        C6642c c6642c = (C6642c) message.obj;
        ImmutableList<C6640a> immutableList = c6642c.f37689a;
        InterfaceC6651l interfaceC6651l = this.f37704I;
        interfaceC6651l.mo7056y(immutableList);
        interfaceC6651l.mo7048j(c6642c);
        return true;
    }

    @Override // com.google.android.exoplayer2.InterfaceC2536y
    /* JADX INFO: renamed from: p */
    public final void mo7151p(long j10, long j11) throws DecoderException {
        boolean z10;
        long jMo11455f;
        C7968m c7968m = this.f37706K;
        this.f37719X = j10;
        if (this.f12230k) {
            long j12 = this.f37717V;
            if (j12 != -9223372036854775807L && j10 >= j12) {
                m13286M();
                this.f37708M = true;
            }
        }
        if (this.f37708M) {
            return;
        }
        AbstractC6650k abstractC6650k = this.f37715T;
        InterfaceC6648i interfaceC6648i = this.f37705J;
        if (abstractC6650k == null) {
            InterfaceC6647h interfaceC6647h = this.f37712Q;
            interfaceC6647h.getClass();
            interfaceC6647h.mo13278b(j10);
            try {
                InterfaceC6647h interfaceC6647h2 = this.f37712Q;
                interfaceC6647h2.getClass();
                this.f37715T = interfaceC6647h2.mo13272c();
            } catch (SubtitleDecoderException e10) {
                C10145n.m19096d("TextRenderer", "Subtitle decoding failed. streamFormat=" + this.f37711P, e10);
                m13283J();
                m13286M();
                InterfaceC6647h interfaceC6647h3 = this.f37712Q;
                interfaceC6647h3.getClass();
                interfaceC6647h3.release();
                this.f37712Q = null;
                this.f37710O = 0;
                this.f37709N = true;
                C2416m c2416m = this.f37711P;
                c2416m.getClass();
                this.f37712Q = ((InterfaceC6648i.a) interfaceC6648i).m13280a(c2416m);
                return;
            }
        }
        if (this.f12225f != 2) {
            return;
        }
        if (this.f37714S != null) {
            long jM13284K = m13284K();
            z10 = false;
            while (jM13284K <= j10) {
                this.f37716U++;
                jM13284K = m13284K();
                z10 = true;
            }
        } else {
            z10 = false;
        }
        AbstractC6650k abstractC6650k2 = this.f37715T;
        if (abstractC6650k2 != null) {
            if (abstractC6650k2.m13269m(4)) {
                if (!z10 && m13284K() == Long.MAX_VALUE) {
                    if (this.f37710O == 2) {
                        m13286M();
                        InterfaceC6647h interfaceC6647h4 = this.f37712Q;
                        interfaceC6647h4.getClass();
                        interfaceC6647h4.release();
                        this.f37712Q = null;
                        this.f37710O = 0;
                        this.f37709N = true;
                        C2416m c2416m2 = this.f37711P;
                        c2416m2.getClass();
                        this.f37712Q = ((InterfaceC6648i.a) interfaceC6648i).m13280a(c2416m2);
                    } else {
                        m13286M();
                        this.f37708M = true;
                    }
                }
            } else if (abstractC6650k2.f37616b <= j10) {
                AbstractC6650k abstractC6650k3 = this.f37714S;
                if (abstractC6650k3 != null) {
                    abstractC6650k3.mo13274p();
                }
                this.f37716U = abstractC6650k2.mo11452a(j10);
                this.f37714S = abstractC6650k2;
                this.f37715T = null;
                z10 = true;
            }
        }
        if (z10) {
            this.f37714S.getClass();
            int iMo11452a = this.f37714S.mo11452a(j10);
            if (iMo11452a == 0 || this.f37714S.mo11457i() == 0) {
                jMo11455f = this.f37714S.f37616b;
            } else if (iMo11452a == -1) {
                AbstractC6650k abstractC6650k4 = this.f37714S;
                jMo11455f = abstractC6650k4.mo11455f(abstractC6650k4.mo11457i() - 1);
            } else {
                jMo11455f = this.f37714S.mo11455f(iMo11452a - 1);
            }
            C6642c c6642c = new C6642c(this.f37714S.mo11456g(j10), m13285L(jMo11455f));
            Handler handler = this.f37703H;
            if (handler != null) {
                handler.obtainMessage(0, c6642c).sendToTarget();
            } else {
                ImmutableList<C6640a> immutableList = c6642c.f37689a;
                InterfaceC6651l interfaceC6651l = this.f37704I;
                interfaceC6651l.mo7056y(immutableList);
                interfaceC6651l.mo7048j(c6642c);
            }
        }
        if (this.f37710O == 2) {
            return;
        }
        while (!this.f37707L) {
            try {
                C6649j c6649jMo13273d = this.f37713R;
                if (c6649jMo13273d == null) {
                    InterfaceC6647h interfaceC6647h5 = this.f37712Q;
                    interfaceC6647h5.getClass();
                    c6649jMo13273d = interfaceC6647h5.mo13273d();
                    if (c6649jMo13273d == null) {
                        return;
                    } else {
                        this.f37713R = c6649jMo13273d;
                    }
                }
                if (this.f37710O == 1) {
                    c6649jMo13273d.f37591a = 4;
                    InterfaceC6647h interfaceC6647h6 = this.f37712Q;
                    interfaceC6647h6.getClass();
                    interfaceC6647h6.mo13271a(c6649jMo13273d);
                    this.f37713R = null;
                    this.f37710O = 2;
                    return;
                }
                int iM6993I = m6993I(c7968m, c6649jMo13273d, 0);
                if (iM6993I == -4) {
                    if (c6649jMo13273d.m13269m(4)) {
                        this.f37707L = true;
                        this.f37709N = false;
                    } else {
                        C2416m c2416m3 = (C2416m) c7968m.f43384b;
                        if (c2416m3 == null) {
                            return;
                        }
                        c6649jMo13273d.f37700i = c2416m3.f12454K;
                        c6649jMo13273d.m6930t();
                        this.f37709N &= !c6649jMo13273d.m13269m(1);
                    }
                    if (!this.f37709N) {
                        InterfaceC6647h interfaceC6647h7 = this.f37712Q;
                        interfaceC6647h7.getClass();
                        interfaceC6647h7.mo13271a(c6649jMo13273d);
                        this.f37713R = null;
                    }
                } else if (iM6993I == -3) {
                    return;
                }
            } catch (SubtitleDecoderException e11) {
                C10145n.m19096d("TextRenderer", "Subtitle decoding failed. streamFormat=" + this.f37711P, e11);
                m13283J();
                m13286M();
                InterfaceC6647h interfaceC6647h8 = this.f37712Q;
                interfaceC6647h8.getClass();
                interfaceC6647h8.release();
                this.f37712Q = null;
                this.f37710O = 0;
                this.f37709N = true;
                C2416m c2416m4 = this.f37711P;
                c2416m4.getClass();
                this.f37712Q = ((InterfaceC6648i.a) interfaceC6648i).m13280a(c2416m4);
                return;
            }
        }
    }
}
