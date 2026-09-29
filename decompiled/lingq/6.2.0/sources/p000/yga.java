package p000;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public abstract class yga {

    /* JADX INFO: renamed from: a */
    public static final Unsafe f69824a;

    /* JADX INFO: renamed from: b */
    public static final Class f69825b;

    /* JADX INFO: renamed from: c */
    public static final vga f69826c;

    /* JADX INFO: renamed from: d */
    public static final boolean f69827d;

    /* JADX INFO: renamed from: e */
    public static final boolean f69828e;

    /* JADX INFO: renamed from: f */
    public static final long f69829f;

    /* JADX INFO: renamed from: g */
    public static final boolean f69830g;

    static {
        Unsafe unsafeM25134j = m25134j();
        f69824a = unsafeM25134j;
        f69825b = AbstractC3000fg.f39030a;
        boolean zM25130f = m25130f(Long.TYPE);
        boolean zM25130f2 = m25130f(Integer.TYPE);
        vga sgaVar = null;
        if (unsafeM25134j != null) {
            if (!AbstractC3000fg.m11816a()) {
                sgaVar = new sga(unsafeM25134j);
            } else if (zM25130f) {
                sgaVar = new qga(unsafeM25134j);
            } else if (zM25130f2) {
                sgaVar = new nga(unsafeM25134j);
            }
        }
        f69826c = sgaVar;
        f69827d = sgaVar == null ? false : sgaVar.mo17428s();
        f69828e = sgaVar == null ? false : sgaVar.mo21365r();
        f69829f = m25127c(byte[].class);
        m25127c(boolean[].class);
        m25128d(boolean[].class);
        m25127c(int[].class);
        m25128d(int[].class);
        m25127c(long[].class);
        m25128d(long[].class);
        m25127c(float[].class);
        m25128d(float[].class);
        m25127c(double[].class);
        m25128d(double[].class);
        m25127c(Object[].class);
        m25128d(Object[].class);
        Field fieldM25129e = m25129e();
        if (fieldM25129e != null && sgaVar != null) {
            sgaVar.m23277j(fieldM25129e);
        }
        f69830g = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    /* JADX INFO: renamed from: a */
    public static void m25125a(Throwable th) {
        Logger.getLogger(yga.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
    }

    /* JADX INFO: renamed from: b */
    public static Object m25126b(Class cls) {
        try {
            return f69824a.allocateInstance(cls);
        } catch (InstantiationException e) {
            uk9.m22779n(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public static int m25127c(Class cls) {
        if (f69828e) {
            return f69826c.m23272a(cls);
        }
        return -1;
    }

    /* JADX INFO: renamed from: d */
    public static void m25128d(Class cls) {
        if (f69828e) {
            f69826c.m23273b(cls);
        }
    }

    /* JADX INFO: renamed from: e */
    public static Field m25129e() {
        Field declaredField;
        Field declaredField2;
        if (AbstractC3000fg.m11816a()) {
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

    /* JADX INFO: renamed from: f */
    public static boolean m25130f(Class cls) {
        if (!AbstractC3000fg.m11816a()) {
            return false;
        }
        try {
            Class cls2 = f69825b;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
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

    /* JADX INFO: renamed from: g */
    public static byte m25131g(byte[] bArr, long j) {
        return f69826c.mo17421d(bArr, f69829f + j);
    }

    /* JADX INFO: renamed from: h */
    public static byte m25132h(Object obj, long j) {
        return (byte) ((f69826c.m23274g(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3))) & 255);
    }

    /* JADX INFO: renamed from: i */
    public static byte m25133i(Object obj, long j) {
        return (byte) ((f69826c.m23274g(obj, (-4) & j) >>> ((int) ((j & 3) << 3))) & 255);
    }

    /* JADX INFO: renamed from: j */
    public static Unsafe m25134j() {
        try {
            return (Unsafe) AccessController.doPrivileged(new kga());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: k */
    public static void m25135k(byte[] bArr, long j, byte b) {
        f69826c.mo17425l(bArr, f69829f + j, b);
    }

    /* JADX INFO: renamed from: l */
    public static void m25136l(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int iM23274g = f69826c.m23274g(obj, j2);
        int i = ((~((int) j)) & 3) << 3;
        m25138n(obj, j2, ((255 & b) << i) | (iM23274g & (~(255 << i))));
    }

    /* JADX INFO: renamed from: m */
    public static void m25137m(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        m25138n(obj, j2, ((255 & b) << i) | (f69826c.m23274g(obj, j2) & (~(255 << i))));
    }

    /* JADX INFO: renamed from: n */
    public static void m25138n(Object obj, long j, int i) {
        f69826c.m23278o(obj, j, i);
    }

    /* JADX INFO: renamed from: o */
    public static void m25139o(Object obj, long j, long j2) {
        f69826c.m23279p(obj, j, j2);
    }

    /* JADX INFO: renamed from: p */
    public static void m25140p(Object obj, long j, Object obj2) {
        f69826c.m23280q(obj, j, obj2);
    }
}
