package p000;

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

/* JADX INFO: loaded from: classes.dex */
public final class mo7 implements gp6 {

    /* JADX INFO: renamed from: f */
    public static final Charset f51638f = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: g */
    public static final c33 f51639g;

    /* JADX INFO: renamed from: h */
    public static final c33 f51640h;

    /* JADX INFO: renamed from: i */
    public static final lf4 f51641i;

    /* JADX INFO: renamed from: a */
    public OutputStream f51642a;

    /* JADX INFO: renamed from: b */
    public final HashMap f51643b;

    /* JADX INFO: renamed from: c */
    public final HashMap f51644c;

    /* JADX INFO: renamed from: d */
    public final fp6 f51645d;

    /* JADX INFO: renamed from: e */
    public final no7 f51646e = new no7(this);

    static {
        C3126ix c3126ixM14165c = C3126ix.m14165c();
        c3126ixM14165c.f44720b = 1;
        f51639g = new c33("key", AbstractC3393o1.m17744s(AbstractC3393o1.m17743r(fo7.class, c3126ixM14165c.m14168b())));
        C3126ix c3126ixM14165c2 = C3126ix.m14165c();
        c3126ixM14165c2.f44720b = 2;
        f51640h = new c33("value", AbstractC3393o1.m17744s(AbstractC3393o1.m17743r(fo7.class, c3126ixM14165c2.m14168b())));
        f51641i = new lf4(1);
    }

    public mo7(ByteArrayOutputStream byteArrayOutputStream, HashMap map, HashMap map2, fp6 fp6Var) {
        this.f51642a = byteArrayOutputStream;
        this.f51643b = map;
        this.f51644c = map2;
        this.f51645d = fp6Var;
    }

    /* JADX INFO: renamed from: k */
    public static int m16949k(c33 c33Var) {
        fo7 fo7Var = (fo7) c33Var.m4297b(fo7.class);
        if (fo7Var != null) {
            return fo7Var.tag();
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    @Override // p000.gp6
    /* JADX INFO: renamed from: a */
    public final gp6 mo12789a(c33 c33Var, Object obj) {
        m16953i(c33Var, obj, true);
        return this;
    }

    /* JADX INFO: renamed from: b */
    public final void m16950b(c33 c33Var, double d, boolean z) throws IOException {
        if (z && d == 0.0d) {
            return;
        }
        m16955l((m16949k(c33Var) << 3) | 1);
        this.f51642a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(d).array());
    }

    /* JADX INFO: renamed from: c */
    public final void m16951c(c33 c33Var, int i, boolean z) {
        if (z && i == 0) {
            return;
        }
        fo7 fo7Var = (fo7) c33Var.m4297b(fo7.class);
        if (fo7Var == null) {
            throw new EncodingException("Field has no @Protobuf config");
        }
        int i2 = lo7.f49939a[fo7Var.intEncoding().ordinal()];
        if (i2 == 1) {
            m16955l(fo7Var.tag() << 3);
            m16955l(i);
        } else if (i2 == 2) {
            m16955l(fo7Var.tag() << 3);
            m16955l((i << 1) ^ (i >> 31));
        } else {
            if (i2 != 3) {
                return;
            }
            m16955l((fo7Var.tag() << 3) | 5);
            this.f51642a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putInt(i).array());
        }
    }

    @Override // p000.gp6
    /* JADX INFO: renamed from: d */
    public final gp6 mo12790d(c33 c33Var, boolean z) {
        m16951c(c33Var, z ? 1 : 0, true);
        return this;
    }

    @Override // p000.gp6
    /* JADX INFO: renamed from: e */
    public final gp6 mo12791e(c33 c33Var, int i) {
        m16951c(c33Var, i, true);
        return this;
    }

    @Override // p000.gp6
    /* JADX INFO: renamed from: f */
    public final gp6 mo12792f(c33 c33Var, double d) throws IOException {
        m16950b(c33Var, d, true);
        return this;
    }

    @Override // p000.gp6
    /* JADX INFO: renamed from: g */
    public final gp6 mo12793g(c33 c33Var, long j) throws IOException {
        m16952h(c33Var, j, true);
        return this;
    }

    /* JADX INFO: renamed from: h */
    public final void m16952h(c33 c33Var, long j, boolean z) throws IOException {
        if (z && j == 0) {
            return;
        }
        fo7 fo7Var = (fo7) c33Var.m4297b(fo7.class);
        if (fo7Var == null) {
            throw new EncodingException("Field has no @Protobuf config");
        }
        int i = lo7.f49939a[fo7Var.intEncoding().ordinal()];
        if (i == 1) {
            m16955l(fo7Var.tag() << 3);
            m16956m(j);
        } else if (i == 2) {
            m16955l(fo7Var.tag() << 3);
            m16956m((j >> 63) ^ (j << 1));
        } else {
            if (i != 3) {
                return;
            }
            m16955l((fo7Var.tag() << 3) | 1);
            this.f51642a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(j).array());
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m16953i(c33 c33Var, Object obj, boolean z) {
        if (obj == null) {
            return;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z && charSequence.length() == 0) {
                return;
            }
            m16955l((m16949k(c33Var) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f51638f);
            m16955l(bytes.length);
            this.f51642a.write(bytes);
            return;
        }
        if (obj instanceof Collection) {
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                m16953i(c33Var, it.next(), false);
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                m16954j(f51641i, c33Var, (Map.Entry) it2.next(), false);
            }
            return;
        }
        if (obj instanceof Double) {
            m16950b(c33Var, ((Double) obj).doubleValue(), z);
            return;
        }
        if (obj instanceof Float) {
            float fFloatValue = ((Float) obj).floatValue();
            if (z && fFloatValue == 0.0f) {
                return;
            }
            m16955l((m16949k(c33Var) << 3) | 5);
            this.f51642a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(fFloatValue).array());
            return;
        }
        if (obj instanceof Number) {
            m16952h(c33Var, ((Number) obj).longValue(), z);
            return;
        }
        if (obj instanceof Boolean) {
            m16951c(c33Var, ((Boolean) obj).booleanValue() ? 1 : 0, z);
            return;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z && bArr.length == 0) {
                return;
            }
            m16955l((m16949k(c33Var) << 3) | 2);
            m16955l(bArr.length);
            this.f51642a.write(bArr);
            return;
        }
        fp6 fp6Var = (fp6) this.f51643b.get(obj.getClass());
        if (fp6Var != null) {
            m16954j(fp6Var, c33Var, obj, z);
            return;
        }
        yna ynaVar = (yna) this.f51644c.get(obj.getClass());
        if (ynaVar != null) {
            no7 no7Var = this.f51646e;
            no7Var.f53061a = false;
            no7Var.f53063c = c33Var;
            no7Var.f53062b = z;
            ynaVar.mo24a(obj, no7Var);
            return;
        }
        if (obj instanceof bo7) {
            m16951c(c33Var, ((bo7) obj).getNumber(), true);
        } else if (obj instanceof Enum) {
            m16951c(c33Var, ((Enum) obj).ordinal(), true);
        } else {
            m16954j(this.f51645d, c33Var, obj, z);
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m16954j(fp6 fp6Var, c33 c33Var, Object obj, boolean z) throws IOException {
        fx4 fx4Var = new fx4();
        fx4Var.f39851a = 0L;
        try {
            OutputStream outputStream = this.f51642a;
            this.f51642a = fx4Var;
            try {
                fp6Var.mo24a(obj, this);
                this.f51642a = outputStream;
                long j = fx4Var.f39851a;
                fx4Var.close();
                if (z && j == 0) {
                    return;
                }
                m16955l((m16949k(c33Var) << 3) | 2);
                m16956m(j);
                fp6Var.mo24a(obj, this);
            } catch (Throwable th) {
                this.f51642a = outputStream;
                throw th;
            }
        } catch (Throwable th2) {
            try {
                fx4Var.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m16955l(int i) throws IOException {
        while (true) {
            long j = i & (-128);
            OutputStream outputStream = this.f51642a;
            if (j == 0) {
                outputStream.write(i & 127);
                return;
            } else {
                outputStream.write((i & 127) | 128);
                i >>>= 7;
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m16956m(long j) throws IOException {
        while (true) {
            long j2 = (-128) & j;
            OutputStream outputStream = this.f51642a;
            if (j2 == 0) {
                outputStream.write(((int) j) & 127);
                return;
            } else {
                outputStream.write((((int) j) & 127) | 128);
                j >>>= 7;
            }
        }
    }
}
