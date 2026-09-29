package p000;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
public final class tga extends wga {
    public tga(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // p000.wga
    /* JADX INFO: renamed from: c */
    public final boolean mo17982c(Object obj, long j) {
        return this.f66801a.getBoolean(obj, j);
    }

    @Override // p000.wga
    /* JADX INFO: renamed from: d */
    public final byte mo17983d(Object obj, long j) {
        return this.f66801a.getByte(obj, j);
    }

    @Override // p000.wga
    /* JADX INFO: renamed from: e */
    public final double mo17984e(Object obj, long j) {
        return this.f66801a.getDouble(obj, j);
    }

    @Override // p000.wga
    /* JADX INFO: renamed from: f */
    public final float mo17985f(Object obj, long j) {
        return this.f66801a.getFloat(obj, j);
    }

    @Override // p000.wga
    /* JADX INFO: renamed from: k */
    public final void mo17986k(Object obj, long j, boolean z) {
        this.f66801a.putBoolean(obj, j, z);
    }

    @Override // p000.wga
    /* JADX INFO: renamed from: l */
    public final void mo17987l(Object obj, long j, byte b) {
        this.f66801a.putByte(obj, j, b);
    }

    @Override // p000.wga
    /* JADX INFO: renamed from: m */
    public final void mo17988m(Object obj, long j, double d) {
        this.f66801a.putDouble(obj, j, d);
    }

    @Override // p000.wga
    /* JADX INFO: renamed from: n */
    public final void mo17989n(Object obj, long j, float f) {
        this.f66801a.putFloat(obj, j, f);
    }

    @Override // p000.wga
    /* JADX INFO: renamed from: r */
    public final boolean mo22028r() {
        if (!super.mo22028r()) {
            return false;
        }
        try {
            Class<?> cls = this.f66801a.getClass();
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
            zga.m25601a(th);
            return false;
        }
    }

    @Override // p000.wga
    /* JADX INFO: renamed from: s */
    public final boolean mo17990s() {
        Unsafe unsafe = this.f66801a;
        if (unsafe != null) {
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                Class cls2 = Long.TYPE;
                cls.getMethod("getLong", Object.class, cls2);
                if (zga.m25605e() != null) {
                    try {
                        Class<?> cls3 = this.f66801a.getClass();
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
                        zga.m25601a(th);
                        return false;
                    }
                }
            } catch (Throwable th2) {
                zga.m25601a(th2);
            }
        }
        return false;
    }
}
