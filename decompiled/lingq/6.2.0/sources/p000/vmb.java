package p000;

import com.google.android.gms.internal.mlkit_vision_document_scanner.zzao;
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
public final class vmb implements gp6 {

    /* JADX INFO: renamed from: f */
    public static final Charset f65615f = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: g */
    public static final c33 f65616g;

    /* JADX INFO: renamed from: h */
    public static final c33 f65617h;

    /* JADX INFO: renamed from: i */
    public static final rlb f65618i;

    /* JADX INFO: renamed from: a */
    public OutputStream f65619a;

    /* JADX INFO: renamed from: b */
    public final HashMap f65620b;

    /* JADX INFO: renamed from: c */
    public final HashMap f65621c;

    /* JADX INFO: renamed from: d */
    public final fp6 f65622d;

    /* JADX INFO: renamed from: e */
    public final lmb f65623e = new lmb(this, 1);

    static {
        zzao zzaoVar = zzao.DEFAULT;
        f65616g = new c33("key", AbstractC3393o1.m17744s(e65.m10876h(omb.class, new zlb(1, zzaoVar))));
        f65617h = new c33("value", AbstractC3393o1.m17744s(e65.m10876h(omb.class, new zlb(2, zzaoVar))));
        f65618i = rlb.f59513f;
    }

    public vmb(ByteArrayOutputStream byteArrayOutputStream, HashMap map, HashMap map2, fp6 fp6Var) {
        this.f65619a = byteArrayOutputStream;
        this.f65620b = map;
        this.f65621c = map2;
        this.f65622d = fp6Var;
    }

    /* JADX INFO: renamed from: k */
    public static int m23427k(c33 c33Var) {
        omb ombVar = (omb) c33Var.m4297b(omb.class);
        if (ombVar != null) {
            return ombVar.zza();
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    @Override // p000.gp6
    /* JADX INFO: renamed from: a */
    public final gp6 mo12789a(c33 c33Var, Object obj) {
        m23428b(c33Var, obj, true);
        return this;
    }

    /* JADX INFO: renamed from: b */
    public final void m23428b(c33 c33Var, Object obj, boolean z) {
        if (obj == null) {
            return;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z && charSequence.length() == 0) {
                return;
            }
            m23433l((m23427k(c33Var) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f65615f);
            m23433l(bytes.length);
            this.f65619a.write(bytes);
            return;
        }
        if (obj instanceof Collection) {
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                m23428b(c33Var, it.next(), false);
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                m23432j(f65618i, c33Var, (Map.Entry) it2.next(), false);
            }
            return;
        }
        if (obj instanceof Double) {
            m23429c(c33Var, ((Double) obj).doubleValue(), z);
            return;
        }
        if (obj instanceof Float) {
            float fFloatValue = ((Float) obj).floatValue();
            if (z && fFloatValue == 0.0f) {
                return;
            }
            m23433l((m23427k(c33Var) << 3) | 5);
            this.f65619a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(fFloatValue).array());
            return;
        }
        if (obj instanceof Number) {
            m23431i(c33Var, ((Number) obj).longValue(), z);
            return;
        }
        if (obj instanceof Boolean) {
            m23430h(c33Var, ((Boolean) obj).booleanValue() ? 1 : 0, z);
            return;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z && bArr.length == 0) {
                return;
            }
            m23433l((m23427k(c33Var) << 3) | 2);
            m23433l(bArr.length);
            this.f65619a.write(bArr);
            return;
        }
        fp6 fp6Var = (fp6) this.f65620b.get(obj.getClass());
        if (fp6Var != null) {
            m23432j(fp6Var, c33Var, obj, z);
            return;
        }
        yna ynaVar = (yna) this.f65621c.get(obj.getClass());
        if (ynaVar != null) {
            lmb lmbVar = this.f65623e;
            lmbVar.f49843b = false;
            lmbVar.f49845d = c33Var;
            lmbVar.f49844c = z;
            ynaVar.mo24a(obj, lmbVar);
            return;
        }
        if (obj instanceof hmb) {
            m23430h(c33Var, ((hmb) obj).zza(), true);
        } else if (obj instanceof Enum) {
            m23430h(c33Var, ((Enum) obj).ordinal(), true);
        } else {
            m23432j(this.f65622d, c33Var, obj, z);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m23429c(c33 c33Var, double d, boolean z) throws IOException {
        if (z && d == 0.0d) {
            return;
        }
        m23433l((m23427k(c33Var) << 3) | 1);
        this.f65619a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(d).array());
    }

    @Override // p000.gp6
    /* JADX INFO: renamed from: d */
    public final /* synthetic */ gp6 mo12790d(c33 c33Var, boolean z) {
        m23430h(c33Var, z ? 1 : 0, true);
        return this;
    }

    @Override // p000.gp6
    /* JADX INFO: renamed from: e */
    public final /* synthetic */ gp6 mo12791e(c33 c33Var, int i) {
        m23430h(c33Var, i, true);
        return this;
    }

    @Override // p000.gp6
    /* JADX INFO: renamed from: f */
    public final gp6 mo12792f(c33 c33Var, double d) throws IOException {
        m23429c(c33Var, d, true);
        return this;
    }

    @Override // p000.gp6
    /* JADX INFO: renamed from: g */
    public final /* synthetic */ gp6 mo12793g(c33 c33Var, long j) throws IOException {
        m23431i(c33Var, j, true);
        return this;
    }

    /* JADX INFO: renamed from: h */
    public final void m23430h(c33 c33Var, int i, boolean z) {
        if (z && i == 0) {
            return;
        }
        omb ombVar = (omb) c33Var.m4297b(omb.class);
        if (ombVar == null) {
            throw new EncodingException("Field has no @Protobuf config");
        }
        int iOrdinal = ombVar.zzb().ordinal();
        if (iOrdinal == 0) {
            m23433l(ombVar.zza() << 3);
            m23433l(i);
        } else if (iOrdinal == 1) {
            m23433l(ombVar.zza() << 3);
            m23433l((i + i) ^ (i >> 31));
        } else {
            if (iOrdinal != 2) {
                return;
            }
            m23433l((ombVar.zza() << 3) | 5);
            this.f65619a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putInt(i).array());
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m23431i(c33 c33Var, long j, boolean z) throws IOException {
        if (z && j == 0) {
            return;
        }
        omb ombVar = (omb) c33Var.m4297b(omb.class);
        if (ombVar == null) {
            throw new EncodingException("Field has no @Protobuf config");
        }
        int iOrdinal = ombVar.zzb().ordinal();
        if (iOrdinal == 0) {
            m23433l(ombVar.zza() << 3);
            m23434m(j);
        } else if (iOrdinal == 1) {
            m23433l(ombVar.zza() << 3);
            m23434m((j >> 63) ^ (j + j));
        } else {
            if (iOrdinal != 2) {
                return;
            }
            m23433l((ombVar.zza() << 3) | 1);
            this.f65619a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(j).array());
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m23432j(fp6 fp6Var, c33 c33Var, Object obj, boolean z) throws IOException {
        tib tibVar = new tib(1);
        tibVar.f62352b = 0L;
        try {
            OutputStream outputStream = this.f65619a;
            this.f65619a = tibVar;
            try {
                fp6Var.mo24a(obj, this);
                this.f65619a = outputStream;
                long j = tibVar.f62352b;
                tibVar.close();
                if (z && j == 0) {
                    return;
                }
                m23433l((m23427k(c33Var) << 3) | 2);
                m23434m(j);
                fp6Var.mo24a(obj, this);
            } catch (Throwable th) {
                this.f65619a = outputStream;
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
    public final void m23433l(int i) throws IOException {
        while (true) {
            long j = i & (-128);
            int i2 = i & 127;
            OutputStream outputStream = this.f65619a;
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
    public final void m23434m(long j) throws IOException {
        while (true) {
            long j2 = (-128) & j;
            int i = ((int) j) & 127;
            OutputStream outputStream = this.f65619a;
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
