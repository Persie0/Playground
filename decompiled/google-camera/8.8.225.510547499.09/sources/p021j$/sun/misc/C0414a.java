package p021j$.sun.misc;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import p021j$.com.android.tools.p022r8.AbstractC0286a;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: j$.sun.misc.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C0414a {

    /* JADX INFO: renamed from: b */
    private static final C0414a f32901b;

    /* JADX INFO: renamed from: a */
    private final Unsafe f32902a;

    static {
        Field fieldM12222i = m12222i();
        fieldM12222i.setAccessible(true);
        try {
            f32901b = new C0414a((Unsafe) fieldM12222i.get(null));
        } catch (IllegalAccessException e) {
            throw new AssertionError("Couldn't get the Unsafe", e);
        }
    }

    C0414a(Unsafe unsafe) {
        this.f32902a = unsafe;
    }

    /* JADX INFO: renamed from: h */
    public static C0414a m12221h() {
        return f32901b;
    }

    /* JADX INFO: renamed from: i */
    private static Field m12222i() {
        try {
            return Unsafe.class.getDeclaredField("theUnsafe");
        } catch (NoSuchFieldException e) {
            for (Field field : Unsafe.class.getDeclaredFields()) {
                if (Modifier.isStatic(field.getModifiers()) && Unsafe.class.isAssignableFrom(field.getType())) {
                    return field;
                }
            }
            throw new AssertionError("Couldn't find the Unsafe", e);
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m12223a(Class cls) {
        return this.f32902a.arrayBaseOffset(cls);
    }

    /* JADX INFO: renamed from: b */
    public final int m12224b(Class cls) {
        return this.f32902a.arrayIndexScale(cls);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m12225c(Object obj, long j, int i, int i2) {
        return this.f32902a.compareAndSwapInt(obj, j, i, i2);
    }

    /* JADX INFO: renamed from: d */
    public final boolean m12226d(Object obj, long j, long j2, long j3) {
        return this.f32902a.compareAndSwapLong(obj, j, j2, j3);
    }

    /* JADX INFO: renamed from: e */
    public final boolean m12227e(Object obj, long j, Object obj2) {
        return AbstractC0286a.m11969a(this.f32902a, obj, j, obj2);
    }

    /* JADX INFO: renamed from: f */
    public final int m12228f(Object obj, long j) {
        int intVolatile;
        do {
            intVolatile = this.f32902a.getIntVolatile(obj, j);
        } while (!this.f32902a.compareAndSwapInt(obj, j, intVolatile, intVolatile - 4));
        return intVolatile;
    }

    /* JADX INFO: renamed from: g */
    public final Object m12229g(Object obj, long j) {
        return this.f32902a.getObjectVolatile(obj, j);
    }

    /* JADX INFO: renamed from: j */
    public final long m12230j(Class cls, String str) {
        try {
            return m12231k(cls.getDeclaredField(str));
        } catch (NoSuchFieldException e) {
            throw new AssertionError("Cannot find field:", e);
        }
    }

    /* JADX INFO: renamed from: k */
    public final long m12231k(Field field) {
        return this.f32902a.objectFieldOffset(field);
    }

    /* JADX INFO: renamed from: l */
    public final void m12232l(Object obj, long j, Object obj2) {
        this.f32902a.putObjectVolatile(obj, j, obj2);
    }
}
