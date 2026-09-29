package p000;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
public final class uga extends xga {
    @Override // p000.xga
    /* JADX INFO: renamed from: c */
    public final boolean mo19134c(Object obj, long j) {
        return this.f68189a.getBoolean(obj, j);
    }

    @Override // p000.xga
    /* JADX INFO: renamed from: d */
    public final byte mo19135d(Object obj, long j) {
        return this.f68189a.getByte(obj, j);
    }

    @Override // p000.xga
    /* JADX INFO: renamed from: e */
    public final double mo19136e(Object obj, long j) {
        return this.f68189a.getDouble(obj, j);
    }

    @Override // p000.xga
    /* JADX INFO: renamed from: f */
    public final float mo19137f(Object obj, long j) {
        return this.f68189a.getFloat(obj, j);
    }

    @Override // p000.xga
    /* JADX INFO: renamed from: k */
    public final void mo19138k(Object obj, long j, boolean z) {
        this.f68189a.putBoolean(obj, j, z);
    }

    @Override // p000.xga
    /* JADX INFO: renamed from: l */
    public final void mo19139l(Object obj, long j, byte b) {
        this.f68189a.putByte(obj, j, b);
    }

    @Override // p000.xga
    /* JADX INFO: renamed from: m */
    public final void mo19140m(Object obj, long j, double d) {
        this.f68189a.putDouble(obj, j, d);
    }

    @Override // p000.xga
    /* JADX INFO: renamed from: n */
    public final void mo19141n(Object obj, long j, float f) {
        this.f68189a.putFloat(obj, j, f);
    }

    @Override // p000.xga
    /* JADX INFO: renamed from: r */
    public final boolean mo22734r() {
        if (!super.mo22734r()) {
            return false;
        }
        try {
            Class<?> cls = this.f68189a.getClass();
            Class cls2 = Long.TYPE;
            cls.getMethod("getByte", Object.class, cls2);
            cls.getMethod("putByte", Object.class, cls2, Byte.TYPE);
            cls.getMethod("getBoolean", Object.class, cls2);
            cls.getMethod("putBoolean", Object.class, cls2, Boolean.TYPE);
            cls.getMethod("getFloat", Object.class, cls2);
            cls.getMethod("putFloat", Object.class, cls2, Float.TYPE);
            cls.getMethod("getDouble", Object.class, cls2);
            cls.getMethod("putDouble", Object.class, cls2, Double.TYPE);
            return true;
        } catch (Throwable th) {
            aha.m405a(th);
            return false;
        }
    }

    @Override // p000.xga
    /* JADX INFO: renamed from: s */
    public final boolean mo19142s() {
        Unsafe unsafe = this.f68189a;
        if (unsafe != null) {
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                Class cls2 = Long.TYPE;
                cls.getMethod("getLong", Object.class, cls2);
                if (aha.m409e() != null) {
                    try {
                        Class<?> cls3 = this.f68189a.getClass();
                        cls3.getMethod("getByte", cls2);
                        cls3.getMethod("putByte", cls2, Byte.TYPE);
                        cls3.getMethod("getInt", cls2);
                        cls3.getMethod("putInt", cls2, Integer.TYPE);
                        cls3.getMethod("getLong", cls2);
                        cls3.getMethod("putLong", cls2, cls2);
                        cls3.getMethod("copyMemory", cls2, cls2, cls2);
                        cls3.getMethod("copyMemory", Object.class, cls2, Object.class, cls2, cls2);
                        return true;
                    } catch (Throwable th) {
                        aha.m405a(th);
                        return false;
                    }
                }
            } catch (Throwable th2) {
                aha.m405a(th2);
            }
        }
        return false;
    }
}
