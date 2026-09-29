package p000;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public abstract class vga {

    /* JADX INFO: renamed from: a */
    public final Unsafe f65361a;

    public vga(Unsafe unsafe) {
        this.f65361a = unsafe;
    }

    /* JADX INFO: renamed from: a */
    public final int m23272a(Class cls) {
        return this.f65361a.arrayBaseOffset(cls);
    }

    /* JADX INFO: renamed from: b */
    public final int m23273b(Class cls) {
        return this.f65361a.arrayIndexScale(cls);
    }

    /* JADX INFO: renamed from: c */
    public abstract boolean mo17420c(Object obj, long j);

    /* JADX INFO: renamed from: d */
    public abstract byte mo17421d(Object obj, long j);

    /* JADX INFO: renamed from: e */
    public abstract double mo17422e(Object obj, long j);

    /* JADX INFO: renamed from: f */
    public abstract float mo17423f(Object obj, long j);

    /* JADX INFO: renamed from: g */
    public final int m23274g(Object obj, long j) {
        return this.f65361a.getInt(obj, j);
    }

    /* JADX INFO: renamed from: h */
    public final long m23275h(Object obj, long j) {
        return this.f65361a.getLong(obj, j);
    }

    /* JADX INFO: renamed from: i */
    public final Object m23276i(Object obj, long j) {
        return this.f65361a.getObject(obj, j);
    }

    /* JADX INFO: renamed from: j */
    public final long m23277j(Field field) {
        return this.f65361a.objectFieldOffset(field);
    }

    /* JADX INFO: renamed from: k */
    public abstract void mo17424k(Object obj, long j, boolean z);

    /* JADX INFO: renamed from: l */
    public abstract void mo17425l(Object obj, long j, byte b);

    /* JADX INFO: renamed from: m */
    public abstract void mo17426m(Object obj, long j, double d);

    /* JADX INFO: renamed from: n */
    public abstract void mo17427n(Object obj, long j, float f);

    /* JADX INFO: renamed from: o */
    public final void m23278o(Object obj, long j, int i) {
        this.f65361a.putInt(obj, j, i);
    }

    /* JADX INFO: renamed from: p */
    public final void m23279p(Object obj, long j, long j2) {
        this.f65361a.putLong(obj, j, j2);
    }

    /* JADX INFO: renamed from: q */
    public final void m23280q(Object obj, long j, Object obj2) {
        this.f65361a.putObject(obj, j, obj2);
    }

    /* JADX INFO: renamed from: r */
    public boolean mo21365r() {
        Unsafe unsafe = this.f65361a;
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
            yga.m25125a(th);
            return false;
        }
    }

    /* JADX INFO: renamed from: s */
    public abstract boolean mo17428s();
}
