package com.google.firebase.encoders.proto;

import com.google.firebase.encoders.EncodingException;
import com.kochava.tracker.BuildConfig;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import p003a2.C0009a;
import p483xe.C10178a;
import ve.C9712b;
import ve.InterfaceC9713c;
import ve.InterfaceC9714d;
import ve.InterfaceC9715e;
import ye.C10352a;
import ye.C10356e;
import ye.InterfaceC10353b;

/* JADX INFO: renamed from: com.google.firebase.encoders.proto.b */
/* JADX INFO: loaded from: classes.dex */
public final class C3217b implements InterfaceC9714d {

    /* JADX INFO: renamed from: f */
    public static final Charset f16237f = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: g */
    public static final C9712b f16238g;

    /* JADX INFO: renamed from: h */
    public static final C9712b f16239h;

    /* JADX INFO: renamed from: i */
    public static final C10178a f16240i;

    /* JADX INFO: renamed from: a */
    public OutputStream f16241a;

    /* JADX INFO: renamed from: b */
    public final Map<Class<?>, InterfaceC9713c<?>> f16242b;

    /* JADX INFO: renamed from: c */
    public final Map<Class<?>, InterfaceC9715e<?>> f16243c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC9713c<Object> f16244d;

    /* JADX INFO: renamed from: e */
    public final C10356e f16245e = new C10356e(this);

    /* JADX INFO: renamed from: com.google.firebase.encoders.proto.b$a */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f16246a;

        static {
            int[] iArr = new int[Protobuf.IntEncoding.values().length];
            f16246a = iArr;
            try {
                iArr[Protobuf.IntEncoding.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16246a[Protobuf.IntEncoding.SIGNED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16246a[Protobuf.IntEncoding.FIXED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static {
        Protobuf.IntEncoding intEncoding = Protobuf.IntEncoding.DEFAULT;
        C3216a c3216a = new C3216a(1, intEncoding);
        HashMap map = new HashMap();
        map.put(Protobuf.class, c3216a);
        f16238g = new C9712b("key", C0009a.m28q(map));
        C3216a c3216a2 = new C3216a(2, intEncoding);
        HashMap map2 = new HashMap();
        map2.put(Protobuf.class, c3216a2);
        f16239h = new C9712b("value", C0009a.m28q(map2));
        f16240i = new C10178a(1);
    }

    public C3217b(ByteArrayOutputStream byteArrayOutputStream, Map map, Map map2, InterfaceC9713c interfaceC9713c) {
        this.f16241a = byteArrayOutputStream;
        this.f16242b = map;
        this.f16243c = map2;
        this.f16244d = interfaceC9713c;
    }

    /* JADX INFO: renamed from: i */
    public static int m9174i(C9712b c9712b) {
        Protobuf protobuf = (Protobuf) ((Annotation) c9712b.f49722b.get(Protobuf.class));
        if (protobuf != null) {
            return ((C3216a) protobuf).f16235a;
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    @Override // ve.InterfaceC9714d
    /* JADX INFO: renamed from: a */
    public final InterfaceC9714d mo9175a(C9712b c9712b, long j10) throws IOException {
        m9181g(c9712b, j10, true);
        return this;
    }

    @Override // ve.InterfaceC9714d
    /* JADX INFO: renamed from: b */
    public final InterfaceC9714d mo9176b(C9712b c9712b, int i10) throws IOException {
        m9180f(c9712b, i10, true);
        return this;
    }

    @Override // ve.InterfaceC9714d
    /* JADX INFO: renamed from: c */
    public final InterfaceC9714d mo9177c(C9712b c9712b, boolean z10) throws IOException {
        m9180f(c9712b, z10 ? 1 : 0, true);
        return this;
    }

    @Override // ve.InterfaceC9714d
    /* JADX INFO: renamed from: d */
    public final InterfaceC9714d mo9178d(C9712b c9712b, Object obj) throws IOException {
        m9179e(c9712b, obj, true);
        return this;
    }

    /* JADX INFO: renamed from: e */
    public final C3217b m9179e(C9712b c9712b, Object obj, boolean z10) throws IOException {
        if (obj == null) {
            return this;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z10 && charSequence.length() == 0) {
                return this;
            }
            m9183j((m9174i(c9712b) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f16237f);
            m9183j(bytes.length);
            this.f16241a.write(bytes);
            return this;
        }
        if (obj instanceof Collection) {
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                m9179e(c9712b, it.next(), false);
            }
            return this;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                m9182h(f16240i, c9712b, (Map.Entry) it2.next(), false);
            }
            return this;
        }
        if (obj instanceof Double) {
            double dDoubleValue = ((Double) obj).doubleValue();
            if (!z10 || dDoubleValue != 0.0d) {
                m9183j((m9174i(c9712b) << 3) | 1);
                this.f16241a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(dDoubleValue).array());
            }
            return this;
        }
        if (obj instanceof Float) {
            float fFloatValue = ((Float) obj).floatValue();
            if (!z10 || fFloatValue != 0.0f) {
                m9183j((m9174i(c9712b) << 3) | 5);
                this.f16241a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(fFloatValue).array());
            }
            return this;
        }
        if (obj instanceof Number) {
            m9181g(c9712b, ((Number) obj).longValue(), z10);
            return this;
        }
        if (obj instanceof Boolean) {
            m9180f(c9712b, ((Boolean) obj).booleanValue() ? 1 : 0, z10);
            return this;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z10 && bArr.length == 0) {
                return this;
            }
            m9183j((m9174i(c9712b) << 3) | 2);
            m9183j(bArr.length);
            this.f16241a.write(bArr);
            return this;
        }
        InterfaceC9713c<?> interfaceC9713c = this.f16242b.get(obj.getClass());
        if (interfaceC9713c != null) {
            m9182h(interfaceC9713c, c9712b, obj, z10);
            return this;
        }
        InterfaceC9715e<?> interfaceC9715e = this.f16243c.get(obj.getClass());
        if (interfaceC9715e != null) {
            C10356e c10356e = this.f16245e;
            c10356e.f52065a = false;
            c10356e.f52067c = c9712b;
            c10356e.f52066b = z10;
            interfaceC9715e.mo6757a(obj, c10356e);
            return this;
        }
        if (obj instanceof InterfaceC10353b) {
            m9180f(c9712b, ((InterfaceC10353b) obj).getNumber(), true);
            return this;
        }
        if (obj instanceof Enum) {
            m9180f(c9712b, ((Enum) obj).ordinal(), true);
            return this;
        }
        m9182h(this.f16244d, c9712b, obj, z10);
        return this;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: f */
    public final void m9180f(C9712b c9712b, int i10, boolean z10) throws IOException {
        if (z10 && i10 == 0) {
            return;
        }
        Protobuf protobuf = (Protobuf) ((Annotation) c9712b.f49722b.get(Protobuf.class));
        if (protobuf == null) {
            throw new EncodingException("Field has no @Protobuf config");
        }
        C3216a c3216a = (C3216a) protobuf;
        int i11 = a.f16246a[c3216a.f16236b.ordinal()];
        int i12 = c3216a.f16235a;
        if (i11 == 1) {
            m9183j(i12 << 3);
            m9183j(i10);
        } else if (i11 == 2) {
            m9183j(i12 << 3);
            m9183j((i10 << 1) ^ (i10 >> 31));
        } else {
            if (i11 != 3) {
                return;
            }
            m9183j((i12 << 3) | 5);
            this.f16241a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putInt(i10).array());
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: g */
    public final void m9181g(C9712b c9712b, long j10, boolean z10) throws IOException {
        if (z10 && j10 == 0) {
            return;
        }
        Protobuf protobuf = (Protobuf) ((Annotation) c9712b.f49722b.get(Protobuf.class));
        if (protobuf == null) {
            throw new EncodingException("Field has no @Protobuf config");
        }
        C3216a c3216a = (C3216a) protobuf;
        int i10 = a.f16246a[c3216a.f16236b.ordinal()];
        int i11 = c3216a.f16235a;
        if (i10 == 1) {
            m9183j(i11 << 3);
            m9184k(j10);
        } else if (i10 == 2) {
            m9183j(i11 << 3);
            m9184k((j10 >> 63) ^ (j10 << 1));
        } else {
            if (i10 != 3) {
                return;
            }
            m9183j((i11 << 3) | 1);
            this.f16241a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(j10).array());
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: h */
    public final void m9182h(InterfaceC9713c interfaceC9713c, C9712b c9712b, Object obj, boolean z10) throws IOException {
        C10352a c10352a = new C10352a();
        try {
            OutputStream outputStream = this.f16241a;
            this.f16241a = c10352a;
            try {
                interfaceC9713c.mo6757a(obj, this);
                this.f16241a = outputStream;
                long j10 = c10352a.f52060a;
                c10352a.close();
                if (z10 && j10 == 0) {
                    return;
                }
                m9183j((m9174i(c9712b) << 3) | 2);
                m9184k(j10);
                interfaceC9713c.mo6757a(obj, this);
            } catch (Throwable th2) {
                this.f16241a = outputStream;
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                c10352a.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m9183j(int i10) throws IOException {
        while ((i10 & (-128)) != 0) {
            this.f16241a.write((i10 & 127) | BuildConfig.SDK_TRUNCATE_LENGTH);
            i10 >>>= 7;
        }
        this.f16241a.write(i10 & 127);
    }

    /* JADX INFO: renamed from: k */
    public final void m9184k(long j10) throws IOException {
        while (((-128) & j10) != 0) {
            this.f16241a.write((((int) j10) & 127) | BuildConfig.SDK_TRUNCATE_LENGTH);
            j10 >>>= 7;
        }
        this.f16241a.write(((int) j10) & 127);
    }
}
