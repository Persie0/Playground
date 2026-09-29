package p000;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.ClassDiscriminatorMode;
import kotlinx.serialization.json.JsonEncodingException;
import kotlinx.serialization.json.internal.WriteMode;

/* JADX INFO: loaded from: classes.dex */
public final class mk9 implements Encoder {

    /* JADX INFO: renamed from: a */
    public final xe1 f51445a;

    /* JADX INFO: renamed from: b */
    public final df4 f51446b;

    /* JADX INFO: renamed from: c */
    public final WriteMode f51447c;

    /* JADX INFO: renamed from: d */
    public final mk9[] f51448d;

    /* JADX INFO: renamed from: e */
    public final w41 f51449e;

    /* JADX INFO: renamed from: f */
    public final kf4 f51450f;

    /* JADX INFO: renamed from: g */
    public boolean f51451g;

    /* JADX INFO: renamed from: h */
    public String f51452h;

    /* JADX INFO: renamed from: i */
    public String f51453i;

    public mk9(xe1 xe1Var, df4 df4Var, WriteMode writeMode, mk9[] mk9VarArr) {
        xe1Var.getClass();
        this.f51445a = xe1Var;
        this.f51446b = df4Var;
        this.f51447c = writeMode;
        this.f51448d = mk9VarArr;
        this.f51449e = df4Var.f35561b;
        this.f51450f = df4Var.f35560a;
        int iOrdinal = writeMode.ordinal();
        if (mk9VarArr != null) {
            mk9 mk9Var = mk9VarArr[iOrdinal];
            if (mk9Var == null && mk9Var == this) {
                return;
            }
            mk9VarArr[iOrdinal] = this;
        }
    }

    /* JADX INFO: renamed from: A */
    public final void m16871A(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        WriteMode writeMode = this.f51447c;
        if (writeMode.end != 0) {
            xe1 xe1Var = this.f51445a;
            xe1Var.getClass();
            xe1Var.f68116a = false;
            xe1Var.m24471e(writeMode.end);
        }
    }

    /* JADX INFO: renamed from: B */
    public final boolean m16872B(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        return this.f51450f.f47125a;
    }

    @Override // kotlinx.serialization.encoding.Encoder
    /* JADX INFO: renamed from: a */
    public final w41 mo15605a() {
        return this.f51449e;
    }

    @Override // kotlinx.serialization.encoding.Encoder
    /* JADX INFO: renamed from: b */
    public final mk9 mo15606b(SerialDescriptor serialDescriptor) {
        mk9 mk9Var;
        serialDescriptor.getClass();
        df4 df4Var = this.f51446b;
        WriteMode writeModeM19113c = pfa.m19113c(df4Var, serialDescriptor);
        char c = writeModeM19113c.begin;
        xe1 xe1Var = this.f51445a;
        if (c != 0) {
            xe1Var.m24471e(c);
            xe1Var.f68116a = true;
        }
        String str = this.f51452h;
        if (str != null) {
            String strMo3694a = this.f51453i;
            if (strMo3694a == null) {
                strMo3694a = serialDescriptor.mo3694a();
            }
            xe1Var.m24470c();
            xe1Var.mo339j(str);
            xe1Var.m24471e(':');
            mo15620p(strMo3694a);
            this.f51452h = null;
            this.f51453i = null;
        }
        if (this.f51447c == writeModeM19113c) {
            return this;
        }
        mk9[] mk9VarArr = this.f51448d;
        return (mk9VarArr == null || (mk9Var = mk9VarArr[writeModeM19113c.ordinal()]) == null) ? new mk9(xe1Var, df4Var, writeModeM19113c, mk9VarArr) : mk9Var;
    }

    @Override // kotlinx.serialization.encoding.Encoder
    /* JADX INFO: renamed from: c */
    public final void mo15607c() {
        this.f51445a.m24472h("null");
    }

    @Override // kotlinx.serialization.encoding.Encoder
    /* JADX INFO: renamed from: d */
    public final void mo15608d(double d) {
        if (this.f51451g) {
            mo15620p(String.valueOf(d));
        } else {
            ((C3126ix) this.f51445a.f68117b).m14178n(String.valueOf(d));
        }
        if (Math.abs(d) <= Double.MAX_VALUE) {
            return;
        }
        throw new JsonEncodingException(fa4.m11628B(Double.valueOf(d), null), 2, null);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    /* JADX INFO: renamed from: e */
    public final void mo15609e(short s) {
        if (this.f51451g) {
            mo15620p(String.valueOf((int) s));
        } else {
            this.f51445a.mo3681i(s);
        }
    }

    @Override // kotlinx.serialization.encoding.Encoder
    /* JADX INFO: renamed from: f */
    public final void mo15610f(byte b) {
        if (this.f51451g) {
            mo15620p(String.valueOf((int) b));
        } else {
            this.f51445a.mo3678d(b);
        }
    }

    @Override // kotlinx.serialization.encoding.Encoder
    /* JADX INFO: renamed from: g */
    public final void mo15611g(boolean z) {
        if (this.f51451g) {
            mo15620p(String.valueOf(z));
        } else {
            ((C3126ix) this.f51445a.f68117b).m14178n(String.valueOf(z));
        }
    }

    @Override // kotlinx.serialization.encoding.Encoder
    /* JADX INFO: renamed from: h */
    public final void mo15612h(float f) {
        if (this.f51451g) {
            mo15620p(String.valueOf(f));
        } else {
            ((C3126ix) this.f51445a.f68117b).m14178n(String.valueOf(f));
        }
        if (Math.abs(f) <= Float.MAX_VALUE) {
            return;
        }
        throw new JsonEncodingException(fa4.m11628B(Float.valueOf(f), null), 2, null);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    /* JADX INFO: renamed from: i */
    public final void mo15613i(char c) {
        mo15620p(String.valueOf(c));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    /* JADX INFO: renamed from: j */
    public final void mo15614j(SerialDescriptor serialDescriptor, int i) {
        serialDescriptor.getClass();
        mo15620p(serialDescriptor.mo3698f(i));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    /* JADX INFO: renamed from: k */
    public final void mo15615k(int i) {
        if (this.f51451g) {
            mo15620p(String.valueOf(i));
        } else {
            this.f51445a.mo3679f(i);
        }
    }

    @Override // kotlinx.serialization.encoding.Encoder
    /* JADX INFO: renamed from: l */
    public final Encoder mo15616l(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        boolean zM17482b = nk9.m17482b(serialDescriptor);
        WriteMode writeMode = this.f51447c;
        df4 df4Var = this.f51446b;
        xe1 af1Var = this.f51445a;
        if (zM17482b) {
            if (!(af1Var instanceof bf1)) {
                af1Var = new bf1((C3126ix) af1Var.f68117b, this.f51451g);
            }
            return new mk9(af1Var, df4Var, writeMode, null);
        }
        if (nk9.m17481a(serialDescriptor)) {
            if (!(af1Var instanceof af1)) {
                af1Var = new af1((C3126ix) af1Var.f68117b, this.f51451g);
            }
            return new mk9(af1Var, df4Var, writeMode, null);
        }
        if (this.f51452h != null) {
            this.f51453i = serialDescriptor.mo3694a();
        }
        return this;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003b  */
    @Override // kotlinx.serialization.encoding.Encoder
    /* JADX INFO: renamed from: m */
    public final void mo15617m(KSerializer kSerializer, Object obj) {
        String strM16808c;
        KSerializer kSerializerM21343b;
        kSerializer.getClass();
        df4 df4Var = this.f51446b;
        boolean z = kSerializer instanceof AbstractC3168k1;
        ClassDiscriminatorMode classDiscriminatorMode = df4Var.f35560a.f47132h;
        if (!z) {
            int i = wg7.f66796a[classDiscriminatorMode.ordinal()];
            if (i != 1 && i != 2) {
                if (i != 3) {
                    gm5.m12750e();
                    return;
                } else {
                    AbstractC3184kh kind = kSerializer.getDescriptor().getKind();
                    strM16808c = (fa4.m11650l(kind, hl9.f42585y) || fa4.m11650l(kind, hl9.f42584B)) ? mfc.m16808c(df4Var, kSerializer.getDescriptor()) : null;
                }
            }
        } else if (classDiscriminatorMode != ClassDiscriminatorMode.NONE) {
        }
        if (z) {
            AbstractC3168k1 abstractC3168k1 = (AbstractC3168k1) kSerializer;
            if (obj == null) {
                v63.m23135m("Value for serializer ", abstractC3168k1.getDescriptor(), " should always be non-null. Please report issue to the kotlinx.serialization tracker.");
                return;
            }
            kSerializerM21343b = sfc.m21343b(abstractC3168k1, this, obj);
        } else {
            kSerializerM21343b = kSerializer;
        }
        if (strM16808c != null) {
            mfc.m16806a(df4Var, kSerializer, kSerializerM21343b, strM16808c);
            mfc.m16807b(kSerializerM21343b.getDescriptor().getKind());
            String strMo3694a = kSerializerM21343b.getDescriptor().mo3694a();
            this.f51452h = strM16808c;
            this.f51453i = strMo3694a;
        }
        kSerializerM21343b.serialize(this, obj);
    }

    @Override // kotlinx.serialization.encoding.Encoder
    /* JADX INFO: renamed from: o */
    public final void mo15619o(long j) {
        if (this.f51451g) {
            mo15620p(String.valueOf(j));
        } else {
            this.f51445a.mo3680g(j);
        }
    }

    @Override // kotlinx.serialization.encoding.Encoder
    /* JADX INFO: renamed from: p */
    public final void mo15620p(String str) {
        str.getClass();
        this.f51445a.mo339j(str);
    }

    /* JADX INFO: renamed from: q */
    public final void m16873q(SerialDescriptor serialDescriptor, int i, boolean z) {
        serialDescriptor.getClass();
        m16875s(serialDescriptor, i);
        mo15611g(z);
    }

    /* JADX INFO: renamed from: r */
    public final void m16874r(SerialDescriptor serialDescriptor, int i, double d) {
        serialDescriptor.getClass();
        m16875s(serialDescriptor, i);
        mo15608d(d);
    }

    /* JADX INFO: renamed from: s */
    public final void m16875s(SerialDescriptor serialDescriptor, int i) {
        serialDescriptor.getClass();
        int i2 = lk9.f49780a[this.f51447c.ordinal()];
        xe1 xe1Var = this.f51445a;
        boolean z = true;
        if (i2 == 1) {
            if (!xe1Var.f68116a) {
                xe1Var.m24471e(',');
            }
            xe1Var.m24470c();
            return;
        }
        if (i2 == 2) {
            if (xe1Var.f68116a) {
                this.f51451g = true;
                xe1Var.m24470c();
                return;
            }
            if (i % 2 == 0) {
                xe1Var.m24471e(',');
                xe1Var.m24470c();
            } else {
                xe1Var.m24471e(':');
                xe1Var.m24473k();
                z = false;
            }
            this.f51451g = z;
            return;
        }
        if (i2 != 3) {
            if (!xe1Var.f68116a) {
                xe1Var.m24471e(',');
            }
            xe1Var.m24470c();
            AbstractC3695vr.m23483A(this.f51446b, serialDescriptor);
            mo15620p(serialDescriptor.mo3698f(i));
            xe1Var.m24471e(':');
            xe1Var.m24473k();
            return;
        }
        if (i == 0) {
            this.f51451g = true;
        }
        if (i == 1) {
            xe1Var.m24471e(',');
            xe1Var.m24473k();
            this.f51451g = false;
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m16876t(SerialDescriptor serialDescriptor, int i, float f) {
        serialDescriptor.getClass();
        m16875s(serialDescriptor, i);
        mo15612h(f);
    }

    /* JADX INFO: renamed from: u */
    public final Encoder m16877u(vj7 vj7Var, int i) {
        vj7Var.getClass();
        m16875s(vj7Var, i);
        return mo15616l(vj7Var.mo3700i(i));
    }

    /* JADX INFO: renamed from: v */
    public final void m16878v(int i, int i2, SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        m16875s(serialDescriptor, i);
        mo15615k(i2);
    }

    /* JADX INFO: renamed from: w */
    public final void m16879w(SerialDescriptor serialDescriptor, int i, long j) {
        serialDescriptor.getClass();
        m16875s(serialDescriptor, i);
        mo15619o(j);
    }

    /* JADX INFO: renamed from: x */
    public final void m16880x(SerialDescriptor serialDescriptor, int i, KSerializer kSerializer, Object obj) {
        serialDescriptor.getClass();
        kSerializer.getClass();
        if (obj != null || this.f51450f.f47128d) {
            serialDescriptor.getClass();
            kSerializer.getClass();
            m16875s(serialDescriptor, i);
            if (kSerializer.getDescriptor().mo11826c()) {
                mo15617m(kSerializer, obj);
            } else if (obj == null) {
                mo15607c();
            } else {
                mo15617m(kSerializer, obj);
            }
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m16881y(SerialDescriptor serialDescriptor, int i, KSerializer kSerializer, Object obj) {
        serialDescriptor.getClass();
        kSerializer.getClass();
        m16875s(serialDescriptor, i);
        mo15617m(kSerializer, obj);
    }

    /* JADX INFO: renamed from: z */
    public final void m16882z(SerialDescriptor serialDescriptor, int i, String str) {
        serialDescriptor.getClass();
        str.getClass();
        m16875s(serialDescriptor, i);
        mo15620p(str);
    }
}
