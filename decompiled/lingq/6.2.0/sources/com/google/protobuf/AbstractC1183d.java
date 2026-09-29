package com.google.protobuf;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p000.C3386nv;
import p000.go7;
import p000.ij6;
import p000.m58;
import p000.m94;
import p000.uk3;
import p000.uk9;
import p000.ux5;
import p000.xm8;
import p000.zga;

/* JADX INFO: renamed from: com.google.protobuf.d */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1183d extends AbstractC1180a {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, AbstractC1183d> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize;
    protected C1190k unknownFields;

    public AbstractC1183d() {
        this.memoizedHashCode = 0;
        this.memoizedSerializedSize = -1;
        this.unknownFields = C1190k.f13956f;
    }

    /* JADX INFO: renamed from: l */
    public static AbstractC1183d m6810l(Class cls) {
        AbstractC1183d abstractC1183d = defaultInstanceMap.get(cls);
        if (abstractC1183d == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC1183d = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (abstractC1183d != null) {
            return abstractC1183d;
        }
        AbstractC1183d abstractC1183d2 = (AbstractC1183d) zga.m25602b(cls);
        abstractC1183d2.getClass();
        AbstractC1183d abstractC1183d3 = (AbstractC1183d) abstractC1183d2.mo454k(GeneratedMessageLite$MethodToInvoke.GET_DEFAULT_INSTANCE);
        if (abstractC1183d3 != null) {
            defaultInstanceMap.put(cls, abstractC1183d3);
            return abstractC1183d3;
        }
        uk9.m22770c();
        return null;
    }

    /* JADX INFO: renamed from: m */
    public static Object m6811m(Method method, AbstractC1183d abstractC1183d, Object... objArr) {
        try {
            return method.invoke(abstractC1183d, objArr);
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

    /* JADX INFO: renamed from: p */
    public static m94 m6812p(m94 m94Var) {
        int size = m94Var.size();
        return m94Var.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
    }

    /* JADX INFO: renamed from: q */
    public static void m6813q(Class cls, AbstractC1183d abstractC1183d) {
        abstractC1183d.m6816o();
        defaultInstanceMap.put(cls, abstractC1183d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        go7 go7Var = go7.f41083c;
        go7Var.getClass();
        return go7Var.m12783a(getClass()).mo6833c(this, (AbstractC1183d) obj);
    }

    @Override // com.google.protobuf.AbstractC1180a
    /* JADX INFO: renamed from: h */
    public final int mo6790h(xm8 xm8Var) {
        int iMo6832b;
        int iMo6832b2;
        if (m6815n()) {
            if (xm8Var == null) {
                go7 go7Var = go7.f41083c;
                go7Var.getClass();
                iMo6832b2 = go7Var.m12783a(getClass()).mo6832b(this);
            } else {
                iMo6832b2 = xm8Var.mo6832b(this);
            }
            if (iMo6832b2 >= 0) {
                return iMo6832b2;
            }
            C3386nv.m17633t(ux5.m22988k(iMo6832b2, "serialized size must be non-negative, was "));
            return 0;
        }
        int i = this.memoizedSerializedSize;
        if ((i & Integer.MAX_VALUE) != Integer.MAX_VALUE) {
            return i & Integer.MAX_VALUE;
        }
        if (xm8Var == null) {
            go7 go7Var2 = go7.f41083c;
            go7Var2.getClass();
            iMo6832b = go7Var2.m12783a(getClass()).mo6832b(this);
        } else {
            iMo6832b = xm8Var.mo6832b(this);
        }
        m6817r(iMo6832b);
        return iMo6832b;
    }

    public final int hashCode() {
        if (m6815n()) {
            go7 go7Var = go7.f41083c;
            go7Var.getClass();
            return go7Var.m12783a(getClass()).mo6831a(this);
        }
        if (this.memoizedHashCode == 0) {
            go7 go7Var2 = go7.f41083c;
            go7Var2.getClass();
            this.memoizedHashCode = go7Var2.m12783a(getClass()).mo6831a(this);
        }
        return this.memoizedHashCode;
    }

    @Override // com.google.protobuf.AbstractC1180a
    /* JADX INFO: renamed from: i */
    public final void mo6791i(C1181b c1181b) {
        go7 go7Var = go7.f41083c;
        go7Var.getClass();
        xm8 xm8VarM12783a = go7Var.m12783a(getClass());
        m58 m58Var = c1181b.f13931a;
        if (m58Var == null) {
            m58Var = new m58(c1181b);
        }
        xm8VarM12783a.mo6834d(this, m58Var);
    }

    /* JADX INFO: renamed from: j */
    public final uk3 m6814j() {
        return (uk3) mo454k(GeneratedMessageLite$MethodToInvoke.NEW_BUILDER);
    }

    /* JADX INFO: renamed from: k */
    public abstract Object mo454k(GeneratedMessageLite$MethodToInvoke generatedMessageLite$MethodToInvoke);

    /* JADX INFO: renamed from: n */
    public final boolean m6815n() {
        return (this.memoizedSerializedSize & MUTABLE_FLAG_MASK) != 0;
    }

    /* JADX INFO: renamed from: o */
    public final void m6816o() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    /* JADX INFO: renamed from: r */
    public final void m6817r(int i) {
        if (i < 0) {
            C3386nv.m17633t(ux5.m22988k(i, "serialized size must be non-negative, was "));
        } else {
            this.memoizedSerializedSize = (i & Integer.MAX_VALUE) | (this.memoizedSerializedSize & MUTABLE_FLAG_MASK);
        }
    }

    public final String toString() {
        return AbstractC1185f.m6822d(this, super.toString());
    }
}
