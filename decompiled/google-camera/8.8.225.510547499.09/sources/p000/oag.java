package p000;

import com.google.android.apps.camera.jni.microvideotonemap.yUpa.qQLA;
import com.google.android.apps.camera.p014ui.captureframe.Tjcw.xRFdVyfdeve;
import com.google.android.gms.common.annotation.HJo.JrxsYuVZZqnFC;
import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import libcore.io.Memory;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class oag {

    /* JADX INFO: renamed from: a */
    public static final boolean f45121a;

    /* JADX INFO: renamed from: b */
    public static final boolean f45122b;

    /* JADX INFO: renamed from: c */
    static final long f45123c;

    /* JADX INFO: renamed from: d */
    static final boolean f45124d;

    /* JADX INFO: renamed from: e */
    private static final Unsafe f45125e;

    /* JADX INFO: renamed from: f */
    private static final Class f45126f;

    /* JADX INFO: renamed from: g */
    private static final boolean f45127g;

    /* JADX INFO: renamed from: h */
    private static final oaf f45128h;

    /* JADX INFO: renamed from: i */
    private static final long f45129i;

    static {
        boolean z;
        boolean z2;
        oaf oafVar;
        Unsafe unsafeM18362j = m18362j();
        f45125e = unsafeM18362j;
        f45126f = Memory.class;
        boolean zM18374v = m18374v(Long.TYPE);
        f45127g = zM18374v;
        boolean zM18374v2 = m18374v(Integer.TYPE);
        oaf oadVar = null;
        if (unsafeM18362j != null) {
            if (zM18374v) {
                oadVar = new oae(unsafeM18362j);
            } else if (zM18374v2) {
                oadVar = new oad(unsafeM18362j);
            }
        }
        f45128h = oadVar;
        String str = xRFdVyfdeve.pxQoiL;
        if (oadVar == null) {
            z = false;
        } else {
            try {
                Class<?> cls = oadVar.f45120a.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                cls.getMethod(str, Object.class, Long.TYPE);
                z = m18361i() != null;
            } catch (Throwable th) {
                m18364l(th);
                z = false;
            }
        }
        f45121a = z;
        oaf oafVar2 = f45128h;
        if (oafVar2 == null) {
            z2 = false;
        } else {
            try {
                Class<?> cls2 = oafVar2.f45120a.getClass();
                cls2.getMethod("objectFieldOffset", Field.class);
                cls2.getMethod("arrayBaseOffset", Class.class);
                cls2.getMethod("arrayIndexScale", Class.class);
                cls2.getMethod("getInt", Object.class, Long.TYPE);
                cls2.getMethod("putInt", Object.class, Long.TYPE, Integer.TYPE);
                cls2.getMethod(str, Object.class, Long.TYPE);
                cls2.getMethod("putLong", Object.class, Long.TYPE, Long.TYPE);
                cls2.getMethod("getObject", Object.class, Long.TYPE);
                cls2.getMethod("putObject", Object.class, Long.TYPE, Object.class);
                z2 = true;
            } catch (Throwable th2) {
                m18364l(th2);
                z2 = false;
            }
        }
        f45122b = z2;
        f45123c = m18378z(byte[].class);
        m18378z(boolean[].class);
        m18352B(boolean[].class);
        m18378z(int[].class);
        m18352B(int[].class);
        m18378z(long[].class);
        m18352B(long[].class);
        m18378z(float[].class);
        m18352B(float[].class);
        m18378z(double[].class);
        m18352B(double[].class);
        m18378z(Object[].class);
        m18352B(Object[].class);
        Field fieldM18361i = m18361i();
        long jObjectFieldOffset = -1;
        if (fieldM18361i != null && (oafVar = f45128h) != null) {
            jObjectFieldOffset = oafVar.f45120a.objectFieldOffset(fieldM18361i);
        }
        f45129i = jObjectFieldOffset;
        f45124d = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    private oag() {
    }

    /* JADX INFO: renamed from: A */
    private static Field m18351A(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable th) {
            return null;
        }
    }

    /* JADX INFO: renamed from: B */
    private static void m18352B(Class cls) {
        if (f45122b) {
            f45128h.f45120a.arrayIndexScale(cls);
        }
    }

    /* JADX INFO: renamed from: a */
    static byte m18353a(long j) {
        return f45128h.mo18338a(j);
    }

    /* JADX INFO: renamed from: b */
    static double m18354b(Object obj, long j) {
        return f45128h.mo18339b(obj, j);
    }

    /* JADX INFO: renamed from: c */
    static float m18355c(Object obj, long j) {
        return f45128h.mo18340c(obj, j);
    }

    /* JADX INFO: renamed from: d */
    static int m18356d(Object obj, long j) {
        return f45128h.m18347j(obj, j);
    }

    /* JADX INFO: renamed from: e */
    static long m18357e(ByteBuffer byteBuffer) {
        return f45128h.m18348k(byteBuffer, f45129i);
    }

    /* JADX INFO: renamed from: f */
    static long m18358f(Object obj, long j) {
        return f45128h.m18348k(obj, j);
    }

    /* JADX INFO: renamed from: g */
    static Object m18359g(Class cls) {
        try {
            return f45125e.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    /* JADX INFO: renamed from: h */
    static Object m18360h(Object obj, long j) {
        return f45128h.f45120a.getObject(obj, j);
    }

    /* JADX INFO: renamed from: i */
    public static Field m18361i() {
        Field fieldM18351A = m18351A(Buffer.class, "effectiveDirectAddress");
        if (fieldM18351A != null) {
            return fieldM18351A;
        }
        Field fieldM18351A2 = m18351A(Buffer.class, "address");
        if (fieldM18351A2 == null || fieldM18351A2.getType() != Long.TYPE) {
            return null;
        }
        return fieldM18351A2;
    }

    /* JADX INFO: renamed from: j */
    static Unsafe m18362j() {
        try {
            return (Unsafe) AccessController.doPrivileged(new oac());
        } catch (Throwable th) {
            return null;
        }
    }

    /* JADX INFO: renamed from: k */
    static void m18363k(long j, byte[] bArr, long j2, long j3) {
        f45128h.mo18341d(j, bArr, j2, j3);
    }

    /* JADX INFO: renamed from: l */
    public static void m18364l(Throwable th) {
        Logger.getLogger(oag.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
    }

    /* JADX INFO: renamed from: m */
    static void m18365m(Object obj, long j, boolean z) {
        f45128h.mo18342e(obj, j, z);
    }

    /* JADX INFO: renamed from: n */
    static void m18366n(byte[] bArr, long j, byte b) {
        f45128h.mo18343f(bArr, f45123c + j, b);
    }

    /* JADX INFO: renamed from: o */
    public static void m18367o(Object obj, long j, byte b) {
        int i = ((((int) j) ^ (-1)) & 3) << 3;
        long j2 = j & (-4);
        int i2 = (b & 255) << i;
        m18371s(obj, j2, i2 | (((255 << i) ^ (-1)) & m18356d(obj, j2)));
    }

    /* JADX INFO: renamed from: p */
    public static void m18368p(Object obj, long j, byte b) {
        int i = (((int) j) & 3) << 3;
        long j2 = j & (-4);
        int i2 = (b & 255) << i;
        m18371s(obj, j2, i2 | (((255 << i) ^ (-1)) & m18356d(obj, j2)));
    }

    /* JADX INFO: renamed from: q */
    static void m18369q(Object obj, long j, double d) {
        f45128h.mo18344g(obj, j, d);
    }

    /* JADX INFO: renamed from: r */
    static void m18370r(Object obj, long j, float f) {
        f45128h.mo18345h(obj, j, f);
    }

    /* JADX INFO: renamed from: s */
    static void m18371s(Object obj, long j, int i) {
        f45128h.m18349l(obj, j, i);
    }

    /* JADX INFO: renamed from: t */
    static void m18372t(Object obj, long j, long j2) {
        f45128h.m18350m(obj, j, j2);
    }

    /* JADX INFO: renamed from: u */
    static void m18373u(Object obj, long j, Object obj2) {
        f45128h.f45120a.putObject(obj, j, obj2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: v */
    static boolean m18374v(Class cls) {
        try {
            Class cls2 = f45126f;
            cls2.getMethod(qQLA.dkpOWpX, cls, Boolean.TYPE);
            cls2.getMethod("pokeLong", cls, Long.TYPE, Boolean.TYPE);
            cls2.getMethod(JrxsYuVZZqnFC.RFu, cls, Integer.TYPE, Boolean.TYPE);
            cls2.getMethod("peekInt", cls, Boolean.TYPE);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, Integer.TYPE, Integer.TYPE);
            cls2.getMethod("peekByteArray", cls, byte[].class, Integer.TYPE, Integer.TYPE);
            return true;
        } catch (Throwable th) {
            return false;
        }
    }

    /* JADX INFO: renamed from: w */
    static boolean m18375w(Object obj, long j) {
        return f45128h.mo18346i(obj, j);
    }

    /* JADX INFO: renamed from: x */
    public static boolean m18376x(Object obj, long j) {
        return ((byte) ((m18356d(obj, j & (-4)) >>> ((int) ((((-1) ^ j) & 3) << 3))) & 255)) != 0;
    }

    /* JADX INFO: renamed from: y */
    public static boolean m18377y(Object obj, long j) {
        return ((byte) ((m18356d(obj, j & (-4)) >>> ((int) ((3 & j) << 3))) & 255)) != 0;
    }

    /* JADX INFO: renamed from: z */
    private static int m18378z(Class cls) {
        if (f45122b) {
            return f45128h.f45120a.arrayBaseOffset(cls);
        }
        return -1;
    }
}
