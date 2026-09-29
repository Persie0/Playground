package com.google.crypto.tink.shaded.protobuf;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p000.C3386nv;
import p000.eo7;
import p000.ij6;
import p000.m80;
import p000.ox2;
import p000.tk3;
import p000.uk9;
import p000.ux5;
import p000.wm8;
import p000.yga;

/* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.i */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1134i extends AbstractC1126a {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, AbstractC1134i> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize;
    protected C1141p unknownFields;

    public AbstractC1134i() {
        this.memoizedHashCode = 0;
        this.memoizedSerializedSize = -1;
        this.unknownFields = C1141p.f13620f;
    }

    /* JADX INFO: renamed from: f */
    public static void m6538f(AbstractC1134i abstractC1134i) throws InvalidProtocolBufferException {
        if (!m6541l(abstractC1134i, true)) {
            throw new InvalidProtocolBufferException(new UninitializedMessageException().getMessage());
        }
    }

    /* JADX INFO: renamed from: i */
    public static AbstractC1134i m6539i(Class cls) {
        AbstractC1134i abstractC1134i = defaultInstanceMap.get(cls);
        if (abstractC1134i == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC1134i = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (abstractC1134i != null) {
            return abstractC1134i;
        }
        AbstractC1134i defaultInstanceForType = ((AbstractC1134i) yga.m25126b(cls)).getDefaultInstanceForType();
        if (defaultInstanceForType != null) {
            defaultInstanceMap.put(cls, defaultInstanceForType);
            return defaultInstanceForType;
        }
        uk9.m22770c();
        return null;
    }

    /* JADX INFO: renamed from: k */
    public static Object m6540k(Method method, AbstractC1134i abstractC1134i, Object... objArr) {
        try {
            return method.invoke(abstractC1134i, objArr);
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

    /* JADX INFO: renamed from: l */
    public static final boolean m6541l(AbstractC1134i abstractC1134i, boolean z) {
        byte bByteValue = ((Byte) abstractC1134i.mo441h(GeneratedMessageLite$MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        eo7 eo7Var = eo7.f37616c;
        eo7Var.getClass();
        boolean zIsInitialized = eo7Var.m11280a(abstractC1134i.getClass()).isInitialized(abstractC1134i);
        if (z) {
            abstractC1134i.mo441h(GeneratedMessageLite$MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED);
        }
        return zIsInitialized;
    }

    /* JADX INFO: renamed from: q */
    public static AbstractC1134i m6542q(AbstractC1134i abstractC1134i, ByteString byteString, ox2 ox2Var) throws InvalidProtocolBufferException {
        ByteString.LiteralByteString literalByteString = (ByteString.LiteralByteString) byteString;
        C1128c c1128cM16674f = m80.m16674f(literalByteString.f13560d, literalByteString.mo6413k(), literalByteString.size(), true);
        AbstractC1134i abstractC1134iM6543r = m6543r(abstractC1134i, c1128cM16674f, ox2Var);
        c1128cM16674f.mo6446a(0);
        m6538f(abstractC1134iM6543r);
        return abstractC1134iM6543r;
    }

    /* JADX INFO: renamed from: r */
    public static AbstractC1134i m6543r(AbstractC1134i abstractC1134i, m80 m80Var, ox2 ox2Var) throws InvalidProtocolBufferException {
        AbstractC1134i abstractC1134iM6550p = abstractC1134i.m6550p();
        try {
            eo7 eo7Var = eo7.f37616c;
            eo7Var.getClass();
            wm8 wm8VarM11280a = eo7Var.m11280a(abstractC1134iM6550p.getClass());
            C1130e c1130e = (C1130e) m80Var.f50744b;
            if (c1130e == null) {
                c1130e = new C1130e(m80Var);
            }
            wm8VarM11280a.mo6586a(abstractC1134iM6550p, c1130e, ox2Var);
            wm8VarM11280a.makeImmutable(abstractC1134iM6550p);
            return abstractC1134iM6550p;
        } catch (InvalidProtocolBufferException e) {
            if (e.f13562a) {
                throw new InvalidProtocolBufferException(e.getMessage(), e);
            }
            throw e;
        } catch (UninitializedMessageException e2) {
            throw new InvalidProtocolBufferException(e2.getMessage());
        } catch (IOException e3) {
            if (e3.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e3.getCause());
            }
            throw new InvalidProtocolBufferException(e3.getMessage(), e3);
        } catch (RuntimeException e4) {
            if (e4.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e4.getCause());
            }
            throw e4;
        }
    }

    /* JADX INFO: renamed from: s */
    public static void m6544s(Class cls, AbstractC1134i abstractC1134i) {
        abstractC1134i.m6548n();
        defaultInstanceMap.put(cls, abstractC1134i);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1126a
    /* JADX INFO: renamed from: a */
    public final int mo6429a(wm8 wm8Var) {
        int iMo6590e;
        int iMo6590e2;
        if (m6547m()) {
            if (wm8Var == null) {
                eo7 eo7Var = eo7.f37616c;
                eo7Var.getClass();
                iMo6590e2 = eo7Var.m11280a(getClass()).mo6590e(this);
            } else {
                iMo6590e2 = wm8Var.mo6590e(this);
            }
            if (iMo6590e2 >= 0) {
                return iMo6590e2;
            }
            C3386nv.m17633t(ux5.m22988k(iMo6590e2, "serialized size must be non-negative, was "));
            return 0;
        }
        int i = this.memoizedSerializedSize;
        if ((i & Integer.MAX_VALUE) != Integer.MAX_VALUE) {
            return i & Integer.MAX_VALUE;
        }
        if (wm8Var == null) {
            eo7 eo7Var2 = eo7.f37616c;
            eo7Var2.getClass();
            iMo6590e = eo7Var2.m11280a(getClass()).mo6590e(this);
        } else {
            iMo6590e = wm8Var.mo6590e(this);
        }
        m6551t(iMo6590e);
        return iMo6590e;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1126a
    /* JADX INFO: renamed from: e */
    public final void mo6433e(C1131f c1131f) {
        eo7 eo7Var = eo7.f37616c;
        eo7Var.getClass();
        wm8 wm8VarM11280a = eo7Var.m11280a(getClass());
        C1132g c1132g = c1131f.f13588a;
        if (c1132g == null) {
            c1132g = new C1132g(c1131f);
        }
        wm8VarM11280a.mo6588c(this, c1132g);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        eo7 eo7Var = eo7.f37616c;
        eo7Var.getClass();
        return eo7Var.m11280a(getClass()).mo6587b(this, (AbstractC1134i) obj);
    }

    /* JADX INFO: renamed from: g */
    public final tk3 m6545g() {
        return (tk3) mo441h(GeneratedMessageLite$MethodToInvoke.NEW_BUILDER);
    }

    /* JADX INFO: renamed from: h */
    public abstract Object mo441h(GeneratedMessageLite$MethodToInvoke generatedMessageLite$MethodToInvoke);

    public final int hashCode() {
        if (m6547m()) {
            eo7 eo7Var = eo7.f37616c;
            eo7Var.getClass();
            return eo7Var.m11280a(getClass()).mo6589d(this);
        }
        if (this.memoizedHashCode == 0) {
            eo7 eo7Var2 = eo7.f37616c;
            eo7Var2.getClass();
            this.memoizedHashCode = eo7Var2.m11280a(getClass()).mo6589d(this);
        }
        return this.memoizedHashCode;
    }

    @Override // p000.sx5
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public final AbstractC1134i getDefaultInstanceForType() {
        return (AbstractC1134i) mo441h(GeneratedMessageLite$MethodToInvoke.GET_DEFAULT_INSTANCE);
    }

    /* JADX INFO: renamed from: m */
    public final boolean m6547m() {
        return (this.memoizedSerializedSize & MUTABLE_FLAG_MASK) != 0;
    }

    /* JADX INFO: renamed from: n */
    public final void m6548n() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1126a
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public final tk3 mo6431c() {
        return (tk3) mo441h(GeneratedMessageLite$MethodToInvoke.NEW_BUILDER);
    }

    /* JADX INFO: renamed from: p */
    public final AbstractC1134i m6550p() {
        return (AbstractC1134i) mo441h(GeneratedMessageLite$MethodToInvoke.NEW_MUTABLE_INSTANCE);
    }

    /* JADX INFO: renamed from: t */
    public final void m6551t(int i) {
        if (i < 0) {
            C3386nv.m17633t(ux5.m22988k(i, "serialized size must be non-negative, was "));
        } else {
            this.memoizedSerializedSize = (i & Integer.MAX_VALUE) | (this.memoizedSerializedSize & MUTABLE_FLAG_MASK);
        }
    }

    public final String toString() {
        return AbstractC1136k.m6557d(this, super.toString());
    }

    /* JADX INFO: renamed from: u */
    public final tk3 m6552u() {
        tk3 tk3Var = (tk3) mo441h(GeneratedMessageLite$MethodToInvoke.NEW_BUILDER);
        if (!tk3Var.f62439a.equals(this)) {
            tk3Var.m22174d();
            tk3.m22170e(tk3Var.f62440b, this);
        }
        return tk3Var;
    }
}
