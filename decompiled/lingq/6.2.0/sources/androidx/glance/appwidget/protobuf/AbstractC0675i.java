package androidx.glance.appwidget.protobuf;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p000.C3386nv;
import p000.aha;
import p000.ho7;
import p000.ij6;
import p000.uk9;
import p000.ux5;
import p000.vj6;
import p000.vk3;
import p000.ym8;

/* JADX INFO: renamed from: androidx.glance.appwidget.protobuf.i */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0675i extends AbstractC0667a {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, AbstractC0675i> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize;
    protected C0681o unknownFields;

    public AbstractC0675i() {
        this.memoizedHashCode = 0;
        this.memoizedSerializedSize = -1;
        this.unknownFields = C0681o.f6100f;
    }

    /* JADX INFO: renamed from: e */
    public static AbstractC0675i m2378e(Class cls) {
        AbstractC0675i abstractC0675i = defaultInstanceMap.get(cls);
        if (abstractC0675i == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC0675i = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (abstractC0675i != null) {
            return abstractC0675i;
        }
        AbstractC0675i abstractC0675i2 = (AbstractC0675i) aha.m406b(cls);
        abstractC0675i2.getClass();
        AbstractC0675i abstractC0675i3 = (AbstractC0675i) abstractC0675i2.mo2383d(GeneratedMessageLite$MethodToInvoke.GET_DEFAULT_INSTANCE);
        if (abstractC0675i3 != null) {
            defaultInstanceMap.put(cls, abstractC0675i3);
            return abstractC0675i3;
        }
        uk9.m22770c();
        return null;
    }

    /* JADX INFO: renamed from: f */
    public static Object m2379f(Method method, AbstractC0675i abstractC0675i, Object... objArr) {
        try {
            return method.invoke(abstractC0675i, objArr);
        } catch (IllegalAccessException e) {
            ij6.m13958p("Couldn't use Java reflection to implement protocol message reflection.", e);
            return null;
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            ij6.m13958p("Unexpected exception thrown by generated accessor method.", cause);
            return null;
        }
    }

    /* JADX INFO: renamed from: g */
    public static final boolean m2380g(AbstractC0675i abstractC0675i, boolean z) {
        byte bByteValue = ((Byte) abstractC0675i.mo2383d(GeneratedMessageLite$MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        ho7 ho7Var = ho7.f42713c;
        ho7Var.getClass();
        boolean zIsInitialized = ho7Var.m13412a(abstractC0675i.getClass()).isInitialized(abstractC0675i);
        if (z) {
            abstractC0675i.mo2383d(GeneratedMessageLite$MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED);
        }
        return zIsInitialized;
    }

    /* JADX INFO: renamed from: k */
    public static void m2381k(Class cls, AbstractC0675i abstractC0675i) {
        abstractC0675i.m2385i();
        defaultInstanceMap.put(cls, abstractC0675i);
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC0667a
    /* JADX INFO: renamed from: b */
    public final int mo2278b(ym8 ym8Var) {
        int iMo2415a;
        int iMo2415a2;
        if (m2384h()) {
            if (ym8Var == null) {
                ho7 ho7Var = ho7.f42713c;
                ho7Var.getClass();
                iMo2415a2 = ho7Var.m13412a(getClass()).mo2415a(this);
            } else {
                iMo2415a2 = ym8Var.mo2415a(this);
            }
            if (iMo2415a2 >= 0) {
                return iMo2415a2;
            }
            C3386nv.m17633t(ux5.m22988k(iMo2415a2, "serialized size must be non-negative, was "));
            return 0;
        }
        int i = this.memoizedSerializedSize;
        if ((i & Integer.MAX_VALUE) != Integer.MAX_VALUE) {
            return i & Integer.MAX_VALUE;
        }
        if (ym8Var == null) {
            ho7 ho7Var2 = ho7.f42713c;
            ho7Var2.getClass();
            iMo2415a = ho7Var2.m13412a(getClass()).mo2415a(this);
        } else {
            iMo2415a = ym8Var.mo2415a(this);
        }
        m2387l(iMo2415a);
        return iMo2415a;
    }

    /* JADX INFO: renamed from: c */
    public final vk3 m2382c() {
        return (vk3) mo2383d(GeneratedMessageLite$MethodToInvoke.NEW_BUILDER);
    }

    /* JADX INFO: renamed from: d */
    public abstract Object mo2383d(GeneratedMessageLite$MethodToInvoke generatedMessageLite$MethodToInvoke);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ho7 ho7Var = ho7.f42713c;
        ho7Var.getClass();
        return ho7Var.m13412a(getClass()).mo2420f(this, (AbstractC0675i) obj);
    }

    /* JADX INFO: renamed from: h */
    public final boolean m2384h() {
        return (this.memoizedSerializedSize & MUTABLE_FLAG_MASK) != 0;
    }

    public final int hashCode() {
        if (m2384h()) {
            ho7 ho7Var = ho7.f42713c;
            ho7Var.getClass();
            return ho7Var.m13412a(getClass()).mo2416b(this);
        }
        if (this.memoizedHashCode == 0) {
            ho7 ho7Var2 = ho7.f42713c;
            ho7Var2.getClass();
            this.memoizedHashCode = ho7Var2.m13412a(getClass()).mo2416b(this);
        }
        return this.memoizedHashCode;
    }

    /* JADX INFO: renamed from: i */
    public final void m2385i() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    /* JADX INFO: renamed from: j */
    public final AbstractC0675i m2386j() {
        return (AbstractC0675i) mo2383d(GeneratedMessageLite$MethodToInvoke.NEW_MUTABLE_INSTANCE);
    }

    /* JADX INFO: renamed from: l */
    public final void m2387l(int i) {
        if (i < 0) {
            C3386nv.m17633t(ux5.m22988k(i, "serialized size must be non-negative, was "));
        } else {
            this.memoizedSerializedSize = (i & Integer.MAX_VALUE) | (this.memoizedSerializedSize & MUTABLE_FLAG_MASK);
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m2388m(AbstractC0673g abstractC0673g) {
        ho7 ho7Var = ho7.f42713c;
        ho7Var.getClass();
        ym8 ym8VarM13412a = ho7Var.m13412a(getClass());
        vj6 vj6Var = abstractC0673g.f6075a;
        if (vj6Var == null) {
            vj6Var = new vj6(abstractC0673g);
        }
        ym8VarM13412a.mo2418d(this, vj6Var);
    }

    public final String toString() {
        String string = super.toString();
        char[] cArr = AbstractC0676j.f6078a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(string);
        AbstractC0676j.m2391c(this, sb, 0);
        return sb.toString();
    }
}
