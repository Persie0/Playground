package p000;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
public abstract class aha {

    /* JADX INFO: renamed from: a */
    public static final Unsafe f675a;

    /* JADX INFO: renamed from: b */
    public static final Class f676b;

    /* JADX INFO: renamed from: c */
    public static final xga f677c;

    /* JADX INFO: renamed from: d */
    public static final boolean f678d;

    /* JADX INFO: renamed from: e */
    public static final boolean f679e;

    /* JADX INFO: renamed from: f */
    public static final long f680f;

    /* JADX INFO: renamed from: g */
    public static final boolean f681g;

    static {
        Unsafe unsafeM414j = m414j();
        f675a = unsafeM414j;
        f676b = AbstractC3074hg.f42313a;
        boolean zM410f = m410f(Long.TYPE);
        boolean zM410f2 = m410f(Integer.TYPE);
        char c = 1;
        int i = 0;
        xga ugaVar = null;
        if (unsafeM414j != null) {
            if (!AbstractC3074hg.m13220a()) {
                ugaVar = new uga(unsafeM414j);
            } else if (zM410f) {
                ugaVar = new pga(unsafeM414j, c == true ? 1 : 0);
            } else if (zM410f2) {
                ugaVar = new pga(unsafeM414j, i);
            }
        }
        f677c = ugaVar;
        f678d = ugaVar == null ? false : ugaVar.mo19142s();
        f679e = ugaVar == null ? false : ugaVar.mo22734r();
        f680f = m407c(byte[].class);
        m407c(boolean[].class);
        m408d(boolean[].class);
        m407c(int[].class);
        m408d(int[].class);
        m407c(long[].class);
        m408d(long[].class);
        m407c(float[].class);
        m408d(float[].class);
        m407c(double[].class);
        m408d(double[].class);
        m407c(Object[].class);
        m408d(Object[].class);
        Field fieldM409e = m409e();
        if (fieldM409e != null && ugaVar != null) {
            ugaVar.m24508j(fieldM409e);
        }
        f681g = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    /* JADX INFO: renamed from: a */
    public static void m405a(Throwable th) {
        Logger.getLogger(aha.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
    }

    /* JADX INFO: renamed from: b */
    public static Object m406b(Class cls) {
        try {
            return f675a.allocateInstance(cls);
        } catch (InstantiationException e) {
            uk9.m22779n(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public static int m407c(Class cls) {
        if (f679e) {
            return f677c.m24503a(cls);
        }
        return -1;
    }

    /* JADX INFO: renamed from: d */
    public static void m408d(Class cls) {
        if (f679e) {
            f677c.m24504b(cls);
        }
    }

    /* JADX INFO: renamed from: e */
    public static Field m409e() {
        Field declaredField;
        Field declaredField2;
        if (AbstractC3074hg.m13220a()) {
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
    public static boolean m410f(Class cls) {
        if (!AbstractC3074hg.m13220a()) {
            return false;
        }
        try {
            Class cls2 = f676b;
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
    public static byte m411g(byte[] bArr, long j) {
        return f677c.mo19135d(bArr, f680f + j);
    }

    /* JADX INFO: renamed from: h */
    public static byte m412h(Object obj, long j) {
        return (byte) ((f677c.m24505g(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3))) & 255);
    }

    /* JADX INFO: renamed from: i */
    public static byte m413i(Object obj, long j) {
        return (byte) ((f677c.m24505g(obj, (-4) & j) >>> ((int) ((j & 3) << 3))) & 255);
    }

    /* JADX INFO: renamed from: j */
    public static Unsafe m414j() {
        try {
            return (Unsafe) AccessController.doPrivileged(new mga());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: k */
    public static void m415k(byte[] bArr, long j, byte b) {
        f677c.mo19139l(bArr, f680f + j, b);
    }

    /* JADX INFO: renamed from: l */
    public static void m416l(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int iM24505g = f677c.m24505g(obj, j2);
        int i = ((~((int) j)) & 3) << 3;
        m418n(obj, j2, ((255 & b) << i) | (iM24505g & (~(255 << i))));
    }

    /* JADX INFO: renamed from: m */
    public static void m417m(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        m418n(obj, j2, ((255 & b) << i) | (f677c.m24505g(obj, j2) & (~(255 << i))));
    }

    /* JADX INFO: renamed from: n */
    public static void m418n(Object obj, long j, int i) {
        f677c.m24509o(obj, j, i);
    }

    /* JADX INFO: renamed from: o */
    public static void m419o(Object obj, long j, long j2) {
        f677c.m24510p(obj, j, j2);
    }

    /* JADX INFO: renamed from: p */
    public static void m420p(Object obj, long j, Object obj2) {
        f677c.m24511q(obj, j, obj2);
    }
}
