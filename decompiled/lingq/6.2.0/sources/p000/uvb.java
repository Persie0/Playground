package p000;

import com.google.android.gms.internal.mlkit_vision_text_common.zzcw;
import com.google.firebase.encoders.EncodingException;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class uvb implements gp6 {

    /* JADX INFO: renamed from: f */
    public static final Charset f64436f = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: g */
    public static final c33 f64437g;

    /* JADX INFO: renamed from: h */
    public static final c33 f64438h;

    /* JADX INFO: renamed from: i */
    public static final rlb f64439i;

    /* JADX INFO: renamed from: a */
    public OutputStream f64440a;

    /* JADX INFO: renamed from: b */
    public final HashMap f64441b;

    /* JADX INFO: renamed from: c */
    public final HashMap f64442c;

    /* JADX INFO: renamed from: d */
    public final fp6 f64443d;

    /* JADX INFO: renamed from: e */
    public final lmb f64444e = new lmb(this, 2);

    static {
        zzcw zzcwVar = zzcw.DEFAULT;
        f64437g = new c33("key", AbstractC3393o1.m17744s(dnb.m10506g(kvb.class, new rub(1, zzcwVar))));
        f64438h = new c33("value", AbstractC3393o1.m17744s(dnb.m10506g(kvb.class, new rub(2, zzcwVar))));
        f64439i = new rlb(6);
    }

    public uvb(ByteArrayOutputStream byteArrayOutputStream, HashMap map, HashMap map2, fp6 fp6Var) {
        this.f64440a = byteArrayOutputStream;
        this.f64441b = map;
        this.f64442c = map2;
        this.f64443d = fp6Var;
    }

    /* JADX INFO: renamed from: j */
    public static int m22951j(c33 c33Var) {
        kvb kvbVar = (kvb) c33Var.m4297b(kvb.class);
        if (kvbVar != null) {
            return kvbVar.zza();
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    @Override // p000.gp6
    /* JADX INFO: renamed from: a */
    public final gp6 mo12789a(c33 c33Var, Object obj) {
        m22953c(c33Var, obj, true);
        return this;
    }

    /* JADX INFO: renamed from: b */
    public final void m22952b(c33 c33Var, double d, boolean z) throws IOException {
        if (z && d == 0.0d) {
            return;
        }
        m22957l((m22951j(c33Var) << 3) | 1);
        this.f64440a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(d).array());
    }

    /* JADX INFO: renamed from: c */
    public final void m22953c(c33 c33Var, Object obj, boolean z) {
        if (obj == null) {
            return;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z && charSequence.length() == 0) {
                return;
            }
            m22957l((m22951j(c33Var) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f64436f);
            m22957l(bytes.length);
            this.f64440a.write(bytes);
            return;
        }
        if (obj instanceof Collection) {
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                m22953c(c33Var, it.next(), false);
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                m22956k(f64439i, c33Var, (Map.Entry) it2.next(), false);
            }
            return;
        }
        if (obj instanceof Double) {
            m22952b(c33Var, ((Double) obj).doubleValue(), z);
            return;
        }
        if (obj instanceof Float) {
            float fFloatValue = ((Float) obj).floatValue();
            if (z && fFloatValue == 0.0f) {
                return;
            }
            m22957l((m22951j(c33Var) << 3) | 5);
            this.f64440a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(fFloatValue).array());
            return;
        }
        if (obj instanceof Number) {
            m22955i(c33Var, ((Number) obj).longValue(), z);
            return;
        }
        if (obj instanceof Boolean) {
            m22954h(c33Var, ((Boolean) obj).booleanValue() ? 1 : 0, z);
            return;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z && bArr.length == 0) {
                return;
            }
            m22957l((m22951j(c33Var) << 3) | 2);
            m22957l(bArr.length);
            this.f64440a.write(bArr);
            return;
        }
        fp6 fp6Var = (fp6) this.f64441b.get(obj.getClass());
        if (fp6Var != null) {
            m22956k(fp6Var, c33Var, obj, z);
            return;
        }
        yna ynaVar = (yna) this.f64442c.get(obj.getClass());
        if (ynaVar != null) {
            lmb lmbVar = this.f64444e;
            lmbVar.f49843b = false;
            lmbVar.f49845d = c33Var;
            lmbVar.f49844c = z;
            ynaVar.mo24a(obj, lmbVar);
            return;
        }
        if (obj instanceof bvb) {
            m22954h(c33Var, ((bvb) obj).zza(), true);
        } else if (obj instanceof Enum) {
            m22954h(c33Var, ((Enum) obj).ordinal(), true);
        } else {
            m22956k(this.f64443d, c33Var, obj, z);
        }
    }

    @Override // p000.gp6
    /* JADX INFO: renamed from: d */
    public final /* synthetic */ gp6 mo12790d(c33 c33Var, boolean z) {
        m22954h(c33Var, z ? 1 : 0, true);
        return this;
    }

    @Override // p000.gp6
    /* JADX INFO: renamed from: e */
    public final /* synthetic */ gp6 mo12791e(c33 c33Var, int i) {
        m22954h(c33Var, i, true);
        return this;
    }

    @Override // p000.gp6
    /* JADX INFO: renamed from: f */
    public final gp6 mo12792f(c33 c33Var, double d) throws IOException {
        m22952b(c33Var, d, true);
        return this;
    }

    @Override // p000.gp6
    /* JADX INFO: renamed from: g */
    public final /* synthetic */ gp6 mo12793g(c33 c33Var, long j) throws IOException {
        m22955i(c33Var, j, true);
        return this;
    }

    /* JADX INFO: renamed from: h */
    public final void m22954h(c33 c33Var, int i, boolean z) {
        if (z && i == 0) {
            return;
        }
        kvb kvbVar = (kvb) c33Var.m4297b(kvb.class);
        if (kvbVar == null) {
            throw new EncodingException("Field has no @Protobuf config");
        }
        int iOrdinal = kvbVar.zzb().ordinal();
        if (iOrdinal == 0) {
            m22957l(kvbVar.zza() << 3);
            m22957l(i);
        } else if (iOrdinal == 1) {
            m22957l(kvbVar.zza() << 3);
            m22957l((i + i) ^ (i >> 31));
        } else {
            if (iOrdinal != 2) {
                return;
            }
            m22957l((kvbVar.zza() << 3) | 5);
            this.f64440a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putInt(i).array());
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m22955i(c33 c33Var, long j, boolean z) throws IOException {
        if (z && j == 0) {
            return;
        }
        kvb kvbVar = (kvb) c33Var.m4297b(kvb.class);
        if (kvbVar == null) {
            throw new EncodingException("Field has no @Protobuf config");
        }
        int iOrdinal = kvbVar.zzb().ordinal();
        if (iOrdinal == 0) {
            m22957l(kvbVar.zza() << 3);
            m22958m(j);
        } else if (iOrdinal == 1) {
            m22957l(kvbVar.zza() << 3);
            m22958m((j >> 63) ^ (j + j));
        } else {
            if (iOrdinal != 2) {
                return;
            }
            m22957l((kvbVar.zza() << 3) | 1);
            this.f64440a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(j).array());
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m22956k(fp6 fp6Var, c33 c33Var, Object obj, boolean z) throws IOException {
        tib tibVar = new tib(2);
        tibVar.f62352b = 0L;
        try {
            OutputStream outputStream = this.f64440a;
            this.f64440a = tibVar;
            try {
                fp6Var.mo24a(obj, this);
                this.f64440a = outputStream;
                long j = tibVar.f62352b;
                tibVar.close();
                if (z && j == 0) {
                    return;
                }
                m22957l((m22951j(c33Var) << 3) | 2);
                m22958m(j);
                fp6Var.mo24a(obj, this);
            } catch (Throwable th) {
                this.f64440a = outputStream;
                throw th;
            }
        } catch (Throwable th2) {
            try {
                tibVar.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m22957l(int i) throws IOException {
        while (true) {
            long j = i & (-128);
            int i2 = i & 127;
            OutputStream outputStream = this.f64440a;
            if (j == 0) {
                outputStream.write(i2);
                return;
            } else {
                outputStream.write(i2 | 128);
                i >>>= 7;
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m22958m(long j) throws IOException {
        while (true) {
            long j2 = (-128) & j;
            int i = ((int) j) & 127;
            OutputStream outputStream = this.f64440a;
            if (j2 == 0) {
                outputStream.write(i);
                return;
            } else {
                outputStream.write(i | 128);
                j >>>= 7;
            }
        }
    }
}
