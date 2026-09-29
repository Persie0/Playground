package p000;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
public abstract class xga {

    /* JADX INFO: renamed from: a */
    public final Unsafe f68189a;

    public xga(Unsafe unsafe) {
        this.f68189a = unsafe;
    }

    /* JADX INFO: renamed from: a */
    public final int m24503a(Class cls) {
        return this.f68189a.arrayBaseOffset(cls);
    }

    /* JADX INFO: renamed from: b */
    public final int m24504b(Class cls) {
        return this.f68189a.arrayIndexScale(cls);
    }

    /* JADX INFO: renamed from: c */
    public abstract boolean mo19134c(Object obj, long j);

    /* JADX INFO: renamed from: d */
    public abstract byte mo19135d(Object obj, long j);

    /* JADX INFO: renamed from: e */
    public abstract double mo19136e(Object obj, long j);

    /* JADX INFO: renamed from: f */
    public abstract float mo19137f(Object obj, long j);

    /* JADX INFO: renamed from: g */
    public final int m24505g(Object obj, long j) {
        return this.f68189a.getInt(obj, j);
    }

    /* JADX INFO: renamed from: h */
    public final long m24506h(Object obj, long j) {
        return this.f68189a.getLong(obj, j);
    }

    /* JADX INFO: renamed from: i */
    public final Object m24507i(Object obj, long j) {
        return this.f68189a.getObject(obj, j);
    }

    /* JADX INFO: renamed from: j */
    public final long m24508j(Field field) {
        return this.f68189a.objectFieldOffset(field);
    }

    /* JADX INFO: renamed from: k */
    public abstract void mo19138k(Object obj, long j, boolean z);

    /* JADX INFO: renamed from: l */
    public abstract void mo19139l(Object obj, long j, byte b);

    /* JADX INFO: renamed from: m */
    public abstract void mo19140m(Object obj, long j, double d);

    /* JADX INFO: renamed from: n */
    public abstract void mo19141n(Object obj, long j, float f);

    /* JADX INFO: renamed from: o */
    public final void m24509o(Object obj, long j, int i) {
        this.f68189a.putInt(obj, j, i);
    }

    /* JADX INFO: renamed from: p */
    public final void m24510p(Object obj, long j, long j2) {
        this.f68189a.putLong(obj, j, j2);
    }

    /* JADX INFO: renamed from: q */
    public final void m24511q(Object obj, long j, Object obj2) {
        this.f68189a.putObject(obj, j, obj2);
    }

    /* JADX INFO: renamed from: r */
    public boolean mo22734r() {
        Unsafe unsafe = this.f68189a;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            cls.getMethod("arrayBaseOffset", Class.class);
            cls.getMethod("arrayIndexScale", Class.class);
            Class cls2 = Long.TYPE;
            cls.getMethod("getInt", Object.class, cls2);
            cls.getMethod("putInt", Object.class, cls2, Integer.TYPE);
            cls.getMethod("getLong", Object.class, cls2);
            cls.getMethod("putLong", Object.class, cls2, cls2);
            cls.getMethod("getObject", Object.class, cls2);
            cls.getMethod("putObject", Object.class, cls2, Object.class);
            return true;
        } catch (Throwable th) {
            aha.m405a(th);
            return false;
        }
    }

    /* JADX INFO: renamed from: s */
    public abstract boolean mo19142s();
}
