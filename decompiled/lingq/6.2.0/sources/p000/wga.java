package p000;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public abstract class wga {

    /* JADX INFO: renamed from: a */
    public final Unsafe f66801a;

    public wga(Unsafe unsafe) {
        this.f66801a = unsafe;
    }

    /* JADX INFO: renamed from: a */
    public final int m23934a(Class cls) {
        return this.f66801a.arrayBaseOffset(cls);
    }

    /* JADX INFO: renamed from: b */
    public final int m23935b(Class cls) {
        return this.f66801a.arrayIndexScale(cls);
    }

    /* JADX INFO: renamed from: c */
    public abstract boolean mo17982c(Object obj, long j);

    /* JADX INFO: renamed from: d */
    public abstract byte mo17983d(Object obj, long j);

    /* JADX INFO: renamed from: e */
    public abstract double mo17984e(Object obj, long j);

    /* JADX INFO: renamed from: f */
    public abstract float mo17985f(Object obj, long j);

    /* JADX INFO: renamed from: g */
    public final int m23936g(Object obj, long j) {
        return this.f66801a.getInt(obj, j);
    }

    /* JADX INFO: renamed from: h */
    public final long m23937h(Object obj, long j) {
        return this.f66801a.getLong(obj, j);
    }

    /* JADX INFO: renamed from: i */
    public final Object m23938i(Object obj, long j) {
        return this.f66801a.getObject(obj, j);
    }

    /* JADX INFO: renamed from: j */
    public final long m23939j(Field field) {
        return this.f66801a.objectFieldOffset(field);
    }

    /* JADX INFO: renamed from: k */
    public abstract void mo17986k(Object obj, long j, boolean z);

    /* JADX INFO: renamed from: l */
    public abstract void mo17987l(Object obj, long j, byte b);

    /* JADX INFO: renamed from: m */
    public abstract void mo17988m(Object obj, long j, double d);

    /* JADX INFO: renamed from: n */
    public abstract void mo17989n(Object obj, long j, float f);

    /* JADX INFO: renamed from: o */
    public final void m23940o(Object obj, long j, int i) {
        this.f66801a.putInt(obj, j, i);
    }

    /* JADX INFO: renamed from: p */
    public final void m23941p(Object obj, long j, long j2) {
        this.f66801a.putLong(obj, j, j2);
    }

    /* JADX INFO: renamed from: q */
    public final void m23942q(Object obj, long j, Object obj2) {
        this.f66801a.putObject(obj, j, obj2);
    }

    /* JADX INFO: renamed from: r */
    public boolean mo22028r() {
        Unsafe unsafe = this.f66801a;
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
            zga.m25601a(th);
            return false;
        }
    }

    /* JADX INFO: renamed from: s */
    public abstract boolean mo17990s();
}
