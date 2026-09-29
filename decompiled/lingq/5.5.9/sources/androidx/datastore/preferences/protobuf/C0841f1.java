package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.f1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0841f1 {

    /* JADX INFO: renamed from: a */
    public static final Logger f5845a = Logger.getLogger(C0841f1.class.getName());

    /* JADX INFO: renamed from: b */
    public static final Unsafe f5846b;

    /* JADX INFO: renamed from: c */
    public static final Class<?> f5847c;

    /* JADX INFO: renamed from: d */
    public static final e f5848d;

    /* JADX INFO: renamed from: e */
    public static final boolean f5849e;

    /* JADX INFO: renamed from: f */
    public static final boolean f5850f;

    /* JADX INFO: renamed from: g */
    public static final long f5851g;

    /* JADX INFO: renamed from: h */
    public static final boolean f5852h;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.f1$a */
    public static class a implements PrivilegedExceptionAction<Unsafe> {
        /* JADX INFO: renamed from: a */
        public static Unsafe m3236a() throws Exception {
            for (Field field : Unsafe.class.getDeclaredFields()) {
                field.setAccessible(true);
                Object obj = field.get(null);
                if (Unsafe.class.isInstance(obj)) {
                    return (Unsafe) Unsafe.class.cast(obj);
                }
            }
            return null;
        }

        @Override // java.security.PrivilegedExceptionAction
        public final /* bridge */ /* synthetic */ Unsafe run() throws Exception {
            return m3236a();
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.f1$b */
    public static final class b extends e {
        public b(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // androidx.datastore.preferences.protobuf.C0841f1.e
        /* JADX INFO: renamed from: c */
        public final boolean mo3237c(long j10, Object obj) {
            if (C0841f1.f5852h) {
                return C0841f1.m3222h(j10, obj) != 0;
            }
            return C0841f1.m3223i(j10, obj) != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.C0841f1.e
        /* JADX INFO: renamed from: d */
        public final byte mo3238d(long j10, Object obj) {
            return C0841f1.f5852h ? C0841f1.m3222h(j10, obj) : C0841f1.m3223i(j10, obj);
        }

        @Override // androidx.datastore.preferences.protobuf.C0841f1.e
        /* JADX INFO: renamed from: e */
        public final double mo3239e(long j10, Object obj) {
            return Double.longBitsToDouble(m3248h(j10, obj));
        }

        @Override // androidx.datastore.preferences.protobuf.C0841f1.e
        /* JADX INFO: renamed from: f */
        public final float mo3240f(long j10, Object obj) {
            return Float.intBitsToFloat(m3247g(j10, obj));
        }

        @Override // androidx.datastore.preferences.protobuf.C0841f1.e
        /* JADX INFO: renamed from: k */
        public final void mo3241k(Object obj, long j10, boolean z10) {
            if (C0841f1.f5852h) {
                C0841f1.m3231q(obj, j10, z10 ? (byte) 1 : (byte) 0);
            } else {
                C0841f1.m3232r(obj, j10, z10 ? (byte) 1 : (byte) 0);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.C0841f1.e
        /* JADX INFO: renamed from: l */
        public final void mo3242l(Object obj, long j10, byte b10) {
            if (C0841f1.f5852h) {
                C0841f1.m3231q(obj, j10, b10);
            } else {
                C0841f1.m3232r(obj, j10, b10);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.C0841f1.e
        /* JADX INFO: renamed from: m */
        public final void mo3243m(Object obj, long j10, double d10) {
            m3252p(obj, j10, Double.doubleToLongBits(d10));
        }

        @Override // androidx.datastore.preferences.protobuf.C0841f1.e
        /* JADX INFO: renamed from: n */
        public final void mo3244n(Object obj, long j10, float f3) {
            m3251o(Float.floatToIntBits(f3), j10, obj);
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.f1$c */
    public static final class c extends e {
        public c(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // androidx.datastore.preferences.protobuf.C0841f1.e
        /* JADX INFO: renamed from: c */
        public final boolean mo3237c(long j10, Object obj) {
            if (C0841f1.f5852h) {
                return C0841f1.m3222h(j10, obj) != 0;
            }
            return C0841f1.m3223i(j10, obj) != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.C0841f1.e
        /* JADX INFO: renamed from: d */
        public final byte mo3238d(long j10, Object obj) {
            return C0841f1.f5852h ? C0841f1.m3222h(j10, obj) : C0841f1.m3223i(j10, obj);
        }

        @Override // androidx.datastore.preferences.protobuf.C0841f1.e
        /* JADX INFO: renamed from: e */
        public final double mo3239e(long j10, Object obj) {
            return Double.longBitsToDouble(m3248h(j10, obj));
        }

        @Override // androidx.datastore.preferences.protobuf.C0841f1.e
        /* JADX INFO: renamed from: f */
        public final float mo3240f(long j10, Object obj) {
            return Float.intBitsToFloat(m3247g(j10, obj));
        }

        @Override // androidx.datastore.preferences.protobuf.C0841f1.e
        /* JADX INFO: renamed from: k */
        public final void mo3241k(Object obj, long j10, boolean z10) {
            if (C0841f1.f5852h) {
                C0841f1.m3231q(obj, j10, z10 ? (byte) 1 : (byte) 0);
            } else {
                C0841f1.m3232r(obj, j10, z10 ? (byte) 1 : (byte) 0);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.C0841f1.e
        /* JADX INFO: renamed from: l */
        public final void mo3242l(Object obj, long j10, byte b10) {
            if (C0841f1.f5852h) {
                C0841f1.m3231q(obj, j10, b10);
            } else {
                C0841f1.m3232r(obj, j10, b10);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.C0841f1.e
        /* JADX INFO: renamed from: m */
        public final void mo3243m(Object obj, long j10, double d10) {
            m3252p(obj, j10, Double.doubleToLongBits(d10));
        }

        @Override // androidx.datastore.preferences.protobuf.C0841f1.e
        /* JADX INFO: renamed from: n */
        public final void mo3244n(Object obj, long j10, float f3) {
            m3251o(Float.floatToIntBits(f3), j10, obj);
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.f1$d */
    public static final class d extends e {
        public d(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // androidx.datastore.preferences.protobuf.C0841f1.e
        /* JADX INFO: renamed from: c */
        public final boolean mo3237c(long j10, Object obj) {
            return this.f5853a.getBoolean(obj, j10);
        }

        @Override // androidx.datastore.preferences.protobuf.C0841f1.e
        /* JADX INFO: renamed from: d */
        public final byte mo3238d(long j10, Object obj) {
            return this.f5853a.getByte(obj, j10);
        }

        @Override // androidx.datastore.preferences.protobuf.C0841f1.e
        /* JADX INFO: renamed from: e */
        public final double mo3239e(long j10, Object obj) {
            return this.f5853a.getDouble(obj, j10);
        }

        @Override // androidx.datastore.preferences.protobuf.C0841f1.e
        /* JADX INFO: renamed from: f */
        public final float mo3240f(long j10, Object obj) {
            return this.f5853a.getFloat(obj, j10);
        }

        @Override // androidx.datastore.preferences.protobuf.C0841f1.e
        /* JADX INFO: renamed from: k */
        public final void mo3241k(Object obj, long j10, boolean z10) {
            this.f5853a.putBoolean(obj, j10, z10);
        }

        @Override // androidx.datastore.preferences.protobuf.C0841f1.e
        /* JADX INFO: renamed from: l */
        public final void mo3242l(Object obj, long j10, byte b10) {
            this.f5853a.putByte(obj, j10, b10);
        }

        @Override // androidx.datastore.preferences.protobuf.C0841f1.e
        /* JADX INFO: renamed from: m */
        public final void mo3243m(Object obj, long j10, double d10) {
            this.f5853a.putDouble(obj, j10, d10);
        }

        @Override // androidx.datastore.preferences.protobuf.C0841f1.e
        /* JADX INFO: renamed from: n */
        public final void mo3244n(Object obj, long j10, float f3) {
            this.f5853a.putFloat(obj, j10, f3);
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.f1$e */
    public static abstract class e {

        /* JADX INFO: renamed from: a */
        public final Unsafe f5853a;

        public e(Unsafe unsafe) {
            this.f5853a = unsafe;
        }

        /* JADX INFO: renamed from: a */
        public final int m3245a(Class<?> cls) {
            return this.f5853a.arrayBaseOffset(cls);
        }

        /* JADX INFO: renamed from: b */
        public final int m3246b(Class<?> cls) {
            return this.f5853a.arrayIndexScale(cls);
        }

        /* JADX INFO: renamed from: c */
        public abstract boolean mo3237c(long j10, Object obj);

        /* JADX INFO: renamed from: d */
        public abstract byte mo3238d(long j10, Object obj);

        /* JADX INFO: renamed from: e */
        public abstract double mo3239e(long j10, Object obj);

        /* JADX INFO: renamed from: f */
        public abstract float mo3240f(long j10, Object obj);

        /* JADX INFO: renamed from: g */
        public final int m3247g(long j10, Object obj) {
            return this.f5853a.getInt(obj, j10);
        }

        /* JADX INFO: renamed from: h */
        public final long m3248h(long j10, Object obj) {
            return this.f5853a.getLong(obj, j10);
        }

        /* JADX INFO: renamed from: i */
        public final Object m3249i(long j10, Object obj) {
            return this.f5853a.getObject(obj, j10);
        }

        /* JADX INFO: renamed from: j */
        public final long m3250j(Field field) {
            return this.f5853a.objectFieldOffset(field);
        }

        /* JADX INFO: renamed from: k */
        public abstract void mo3241k(Object obj, long j10, boolean z10);

        /* JADX INFO: renamed from: l */
        public abstract void mo3242l(Object obj, long j10, byte b10);

        /* JADX INFO: renamed from: m */
        public abstract void mo3243m(Object obj, long j10, double d10);

        /* JADX INFO: renamed from: n */
        public abstract void mo3244n(Object obj, long j10, float f3);

        /* JADX INFO: renamed from: o */
        public final void m3251o(int i10, long j10, Object obj) {
            this.f5853a.putInt(obj, j10, i10);
        }

        /* JADX INFO: renamed from: p */
        public final void m3252p(Object obj, long j10, long j11) {
            this.f5853a.putLong(obj, j10, j11);
        }

        /* JADX INFO: renamed from: q */
        public final void m3253q(long j10, Object obj, Object obj2) {
            this.f5853a.putObject(obj, j10, obj2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x003b  */
    /* JADX WARN: Code duplicated, block: B:18:0x007f  */
    static {
        e dVar;
        String str;
        boolean z10;
        boolean z11;
        boolean z12;
        e eVar;
        Unsafe unsafeM3229o = m3229o();
        f5846b = unsafeM3229o;
        f5847c = C0833d.f5836a;
        Class<?> cls = Long.TYPE;
        boolean zM3219e = m3219e(cls);
        Class<?> cls2 = Integer.TYPE;
        boolean zM3219e2 = m3219e(cls2);
        if (unsafeM3229o == null) {
            dVar = null;
        } else if (!C0833d.m3200a()) {
            dVar = new d(unsafeM3229o);
        } else if (zM3219e) {
            dVar = new c(unsafeM3229o);
        } else if (zM3219e2) {
            dVar = new b(unsafeM3229o);
        } else {
            dVar = null;
        }
        f5848d = dVar;
        if (unsafeM3229o == null) {
            str = "getByte";
            z10 = false;
        } else {
            try {
                Class<?> cls3 = unsafeM3229o.getClass();
                cls3.getMethod("objectFieldOffset", Field.class);
                cls3.getMethod("getLong", Object.class, cls);
                if (m3218d() == null) {
                    str = "getByte";
                    z10 = false;
                } else {
                    if (C0833d.m3200a()) {
                        str = "getByte";
                    } else {
                        cls3.getMethod("getByte", cls);
                        Class<?>[] clsArr = new Class[2];
                        clsArr[0] = cls;
                        str = "getByte";
                        try {
                            clsArr[1] = Byte.TYPE;
                            cls3.getMethod("putByte", clsArr);
                            cls3.getMethod("getInt", cls);
                            cls3.getMethod("putInt", cls, cls2);
                            cls3.getMethod("getLong", cls);
                            cls3.getMethod("putLong", cls, cls);
                            cls3.getMethod("copyMemory", cls, cls, cls);
                            cls3.getMethod("copyMemory", Object.class, cls, Object.class, cls, cls);
                        } catch (Throwable th2) {
                            th = th2;
                            f5845a.log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
                            z10 = false;
                        }
                    }
                    z10 = true;
                }
            } catch (Throwable th3) {
                th = th3;
                str = "getByte";
            }
        }
        f5849e = z10;
        Unsafe unsafe = f5846b;
        if (unsafe == null) {
            z12 = false;
            z11 = true;
        } else {
            try {
                Class<?> cls4 = unsafe.getClass();
                try {
                    cls4.getMethod("objectFieldOffset", Field.class);
                    cls4.getMethod("arrayBaseOffset", Class.class);
                    Class<?>[] clsArr2 = new Class[1];
                    clsArr2[0] = Class.class;
                    cls4.getMethod("arrayIndexScale", clsArr2);
                    Class<?>[] clsArr3 = new Class[2];
                    clsArr3[0] = Object.class;
                    Class<?> cls5 = Long.TYPE;
                    boolean z13 = true;
                    try {
                        clsArr3[1] = cls5;
                        cls4.getMethod("getInt", clsArr3);
                        Class<?>[] clsArr4 = new Class[3];
                        clsArr4[0] = Object.class;
                        clsArr4[1] = cls5;
                        clsArr4[2] = Integer.TYPE;
                        cls4.getMethod("putInt", clsArr4);
                        Class<?>[] clsArr5 = new Class[2];
                        clsArr5[0] = Object.class;
                        clsArr5[1] = cls5;
                        cls4.getMethod("getLong", clsArr5);
                        Class<?>[] clsArr6 = new Class[3];
                        clsArr6[0] = Object.class;
                        clsArr6[1] = cls5;
                        clsArr6[2] = cls5;
                        cls4.getMethod("putLong", clsArr6);
                        Class<?>[] clsArr7 = new Class[2];
                        clsArr7[0] = Object.class;
                        clsArr7[1] = cls5;
                        cls4.getMethod("getObject", clsArr7);
                        Class<?>[] clsArr8 = new Class[3];
                        clsArr8[0] = Object.class;
                        clsArr8[1] = cls5;
                        clsArr8[2] = Object.class;
                        cls4.getMethod("putObject", clsArr8);
                        if (C0833d.m3200a()) {
                            z11 = true;
                            z12 = true;
                        } else {
                            Class<?>[] clsArr9 = new Class[2];
                            clsArr9[0] = Object.class;
                            z13 = true;
                            clsArr9[1] = cls5;
                            cls4.getMethod(str, clsArr9);
                            Class<?>[] clsArr10 = new Class[3];
                            clsArr10[0] = Object.class;
                            clsArr10[1] = cls5;
                            clsArr10[2] = Byte.TYPE;
                            cls4.getMethod("putByte", clsArr10);
                            Class<?>[] clsArr11 = new Class[2];
                            clsArr11[0] = Object.class;
                            boolean z14 = true;
                            try {
                                clsArr11[1] = cls5;
                                cls4.getMethod("getBoolean", clsArr11);
                                Class<?>[] clsArr12 = new Class[3];
                                clsArr12[0] = Object.class;
                                clsArr12[1] = cls5;
                                clsArr12[2] = Boolean.TYPE;
                                cls4.getMethod("putBoolean", clsArr12);
                                Class<?>[] clsArr13 = new Class[2];
                                clsArr13[0] = Object.class;
                                z14 = true;
                                clsArr13[1] = cls5;
                                cls4.getMethod("getFloat", clsArr13);
                                Class<?>[] clsArr14 = new Class[3];
                                clsArr14[0] = Object.class;
                                clsArr14[1] = cls5;
                                clsArr14[2] = Float.TYPE;
                                cls4.getMethod("putFloat", clsArr14);
                                Class<?>[] clsArr15 = new Class[2];
                                clsArr15[0] = Object.class;
                                z11 = true;
                                try {
                                    clsArr15[1] = cls5;
                                    cls4.getMethod("getDouble", clsArr15);
                                    cls4.getMethod("putDouble", Object.class, cls5, Double.TYPE);
                                    z12 = true;
                                } catch (Throwable th4) {
                                    th = th4;
                                    f5845a.log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
                                    z12 = false;
                                }
                            } catch (Throwable th5) {
                                th = th5;
                                z11 = z14;
                            }
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        z11 = z13;
                    }
                } catch (Throwable th7) {
                    th = th7;
                    z11 = true;
                }
            } catch (Throwable th8) {
                th = th8;
                z11 = true;
            }
        }
        f5850f = z12;
        f5851g = m3216b(byte[].class);
        m3216b(boolean[].class);
        m3217c(boolean[].class);
        m3216b(int[].class);
        m3217c(int[].class);
        m3216b(long[].class);
        m3217c(long[].class);
        m3216b(float[].class);
        m3217c(float[].class);
        m3216b(double[].class);
        m3217c(double[].class);
        m3216b(Object[].class);
        m3217c(Object[].class);
        Field fieldM3218d = m3218d();
        if (fieldM3218d != null && (eVar = f5848d) != null) {
            eVar.m3250j(fieldM3218d);
        }
        f5852h = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN ? z11 : false;
    }

    /* JADX INFO: renamed from: a */
    public static <T> T m3215a(Class<T> cls) {
        try {
            return (T) f5846b.allocateInstance(cls);
        } catch (InstantiationException e10) {
            throw new IllegalStateException(e10);
        }
    }

    /* JADX INFO: renamed from: b */
    public static int m3216b(Class<?> cls) {
        if (f5850f) {
            return f5848d.m3245a(cls);
        }
        return -1;
    }

    /* JADX INFO: renamed from: c */
    public static void m3217c(Class cls) {
        if (f5850f) {
            f5848d.m3246b(cls);
        }
    }

    /* JADX INFO: renamed from: d */
    public static Field m3218d() {
        Field declaredField;
        Field declaredField2;
        if (C0833d.m3200a()) {
            try {
                declaredField2 = Buffer.class.getDeclaredField("effectiveDirectAddress");
            } catch (Throwable unused) {
                declaredField2 = null;
            }
            if (declaredField2 != null) {
                return declaredField2;
            }
        }
        try {
            declaredField = Buffer.class.getDeclaredField("address");
        } catch (Throwable unused2) {
            declaredField = null;
        }
        if (declaredField == null || declaredField.getType() != Long.TYPE) {
            return null;
        }
        return declaredField;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m3219e(Class<?> cls) {
        if (!C0833d.m3200a()) {
            return false;
        }
        try {
            Class<?> cls2 = f5847c;
            Class<?> cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class<?> cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: f */
    public static boolean m3220f(long j10, Object obj) {
        return f5848d.mo3237c(j10, obj);
    }

    /* JADX INFO: renamed from: g */
    public static byte m3221g(byte[] bArr, long j10) {
        return f5848d.mo3238d(f5851g + j10, bArr);
    }

    /* JADX INFO: renamed from: h */
    public static byte m3222h(long j10, Object obj) {
        return (byte) ((m3226l((-4) & j10, obj) >>> ((int) (((~j10) & 3) << 3))) & 255);
    }

    /* JADX INFO: renamed from: i */
    public static byte m3223i(long j10, Object obj) {
        return (byte) ((m3226l((-4) & j10, obj) >>> ((int) ((j10 & 3) << 3))) & 255);
    }

    /* JADX INFO: renamed from: j */
    public static double m3224j(long j10, Object obj) {
        return f5848d.mo3239e(j10, obj);
    }

    /* JADX INFO: renamed from: k */
    public static float m3225k(long j10, Object obj) {
        return f5848d.mo3240f(j10, obj);
    }

    /* JADX INFO: renamed from: l */
    public static int m3226l(long j10, Object obj) {
        return f5848d.m3247g(j10, obj);
    }

    /* JADX INFO: renamed from: m */
    public static long m3227m(long j10, Object obj) {
        return f5848d.m3248h(j10, obj);
    }

    /* JADX INFO: renamed from: n */
    public static Object m3228n(long j10, Object obj) {
        return f5848d.m3249i(j10, obj);
    }

    /* JADX INFO: renamed from: o */
    public static Unsafe m3229o() {
        try {
            return (Unsafe) AccessController.doPrivileged(new a());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: p */
    public static void m3230p(byte[] bArr, long j10, byte b10) {
        f5848d.mo3242l(bArr, f5851g + j10, b10);
    }

    /* JADX INFO: renamed from: q */
    public static void m3231q(Object obj, long j10, byte b10) {
        long j11 = (-4) & j10;
        int iM3226l = m3226l(j11, obj);
        int i10 = ((~((int) j10)) & 3) << 3;
        m3233s(((255 & b10) << i10) | (iM3226l & (~(255 << i10))), j11, obj);
    }

    /* JADX INFO: renamed from: r */
    public static void m3232r(Object obj, long j10, byte b10) {
        long j11 = (-4) & j10;
        int i10 = (((int) j10) & 3) << 3;
        m3233s(((255 & b10) << i10) | (m3226l(j11, obj) & (~(255 << i10))), j11, obj);
    }

    /* JADX INFO: renamed from: s */
    public static void m3233s(int i10, long j10, Object obj) {
        f5848d.m3251o(i10, j10, obj);
    }

    /* JADX INFO: renamed from: t */
    public static void m3234t(Object obj, long j10, long j11) {
        f5848d.m3252p(obj, j10, j11);
    }

    /* JADX INFO: renamed from: u */
    public static void m3235u(long j10, Object obj, Object obj2) {
        f5848d.m3253q(j10, obj, obj2);
    }
}
