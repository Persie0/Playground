package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import androidx.datastore.preferences.protobuf.GeneratedMessageLite.AbstractC0811a;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class GeneratedMessageLite<MessageType extends GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends AbstractC0811a<MessageType, BuilderType>> extends AbstractC0824a<MessageType, BuilderType> {
    private static Map<Object, GeneratedMessageLite<?, ?>> defaultInstanceMap = new ConcurrentHashMap();
    protected C0832c1 unknownFields = C0832c1.f5830f;
    protected int memoizedSerializedSize = -1;

    public enum MethodToInvoke {
        GET_MEMOIZED_IS_INITIALIZED,
        SET_MEMOIZED_IS_INITIALIZED,
        BUILD_MESSAGE_INFO,
        NEW_MUTABLE_INSTANCE,
        NEW_BUILDER,
        GET_DEFAULT_INSTANCE,
        GET_PARSER
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.GeneratedMessageLite$a */
    public static abstract class AbstractC0811a<MessageType extends GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends AbstractC0811a<MessageType, BuilderType>> extends AbstractC0824a.a<MessageType, BuilderType> {

        /* JADX INFO: renamed from: a */
        public final MessageType f5810a;

        /* JADX INFO: renamed from: b */
        public MessageType f5811b;

        /* JADX INFO: renamed from: c */
        public boolean f5812c = false;

        public AbstractC0811a(MessageType messagetype) {
            this.f5810a = messagetype;
            this.f5811b = (MessageType) messagetype.mo3038k(MethodToInvoke.NEW_MUTABLE_INSTANCE);
        }

        /* JADX INFO: renamed from: m */
        public static void m3135m(GeneratedMessageLite generatedMessageLite, GeneratedMessageLite generatedMessageLite2) {
            C0868s0 c0868s0 = C0868s0.f5927c;
            c0868s0.getClass();
            c0868s0.m3436a(generatedMessageLite.getClass()).mo3385a(generatedMessageLite, generatedMessageLite2);
        }

        public final Object clone() throws CloneNotSupportedException {
            MessageType messagetype = this.f5810a;
            messagetype.getClass();
            AbstractC0811a abstractC0811a = (AbstractC0811a) messagetype.mo3038k(MethodToInvoke.NEW_BUILDER);
            GeneratedMessageLite generatedMessageLiteM3137j = m3137j();
            abstractC0811a.m3138k();
            m3135m(abstractC0811a.f5811b, generatedMessageLiteM3137j);
            return abstractC0811a;
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC0850j0
        /* JADX INFO: renamed from: f */
        public final GeneratedMessageLite mo3132f() {
            return this.f5810a;
        }

        /* JADX INFO: renamed from: i */
        public final MessageType m3136i() {
            MessageType messagetype = (MessageType) m3137j();
            if (messagetype.mo3128b()) {
                return messagetype;
            }
            throw new UninitializedMessageException();
        }

        /* JADX INFO: renamed from: j */
        public final MessageType m3137j() {
            if (this.f5812c) {
                return this.f5811b;
            }
            MessageType messagetype = this.f5811b;
            messagetype.getClass();
            C0868s0 c0868s0 = C0868s0.f5927c;
            c0868s0.getClass();
            c0868s0.m3436a(messagetype.getClass()).mo3387c(messagetype);
            this.f5812c = true;
            return this.f5811b;
        }

        /* JADX INFO: renamed from: k */
        public final void m3138k() {
            if (this.f5812c) {
                MessageType messagetype = (MessageType) this.f5811b.mo3038k(MethodToInvoke.NEW_MUTABLE_INSTANCE);
                m3135m(messagetype, this.f5811b);
                this.f5811b = messagetype;
                this.f5812c = false;
            }
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.GeneratedMessageLite$b */
    public static class C0812b<T extends GeneratedMessageLite<T, ?>> extends AbstractC0827b<T> {
        public C0812b(T t10) {
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.GeneratedMessageLite$c */
    public static abstract class AbstractC0813c<MessageType extends AbstractC0813c<MessageType, BuilderType>, BuilderType> extends GeneratedMessageLite<MessageType, BuilderType> implements InterfaceC0850j0 {
        protected C0863q<C0814d> extensions = C0863q.f5918d;

        @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite, androidx.datastore.preferences.protobuf.InterfaceC0848i0
        /* JADX INFO: renamed from: c */
        public final AbstractC0811a mo3129c() {
            AbstractC0811a abstractC0811a = (AbstractC0811a) mo3038k(MethodToInvoke.NEW_BUILDER);
            abstractC0811a.m3138k();
            AbstractC0811a.m3135m(abstractC0811a.f5811b, this);
            return abstractC0811a;
        }

        @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite, androidx.datastore.preferences.protobuf.InterfaceC0848i0
        /* JADX INFO: renamed from: e */
        public final AbstractC0811a mo3131e() {
            return (AbstractC0811a) mo3038k(MethodToInvoke.NEW_BUILDER);
        }

        @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite, androidx.datastore.preferences.protobuf.InterfaceC0850j0
        /* JADX INFO: renamed from: f */
        public final GeneratedMessageLite mo3132f() {
            return (GeneratedMessageLite) mo3038k(MethodToInvoke.GET_DEFAULT_INSTANCE);
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.GeneratedMessageLite$d */
    public static final class C0814d implements C0863q.b<C0814d> {
        @Override // java.lang.Comparable
        public final int compareTo(Object obj) {
            ((C0814d) obj).getClass();
            return 0;
        }

        @Override // androidx.datastore.preferences.protobuf.C0863q.b
        /* JADX INFO: renamed from: e */
        public final void mo3139e() {
        }

        @Override // androidx.datastore.preferences.protobuf.C0863q.b
        public final void getNumber() {
        }

        @Override // androidx.datastore.preferences.protobuf.C0863q.b
        /* JADX INFO: renamed from: h */
        public final void mo3140h() {
        }

        @Override // androidx.datastore.preferences.protobuf.C0863q.b
        public final void isPacked() {
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // androidx.datastore.preferences.protobuf.C0863q.b
        /* JADX INFO: renamed from: j */
        public final WireFormat$JavaType mo3141j() {
            throw null;
        }

        @Override // androidx.datastore.preferences.protobuf.C0863q.b
        /* JADX INFO: renamed from: r */
        public final AbstractC0811a mo3142r(InterfaceC0848i0.a aVar, InterfaceC0848i0 interfaceC0848i0) {
            AbstractC0811a abstractC0811a = (AbstractC0811a) aVar;
            abstractC0811a.m3138k();
            AbstractC0811a.m3135m(abstractC0811a.f5811b, (GeneratedMessageLite) interfaceC0848i0);
            return abstractC0811a;
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.GeneratedMessageLite$e */
    public static class C0815e<ContainingType extends InterfaceC0848i0, Type> extends AbstractC0839f {
    }

    /* JADX INFO: renamed from: l */
    public static <T extends GeneratedMessageLite<?, ?>> T m3123l(Class<T> cls) {
        GeneratedMessageLite<?, ?> generatedMessageLite = defaultInstanceMap.get(cls);
        if (generatedMessageLite == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                generatedMessageLite = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (generatedMessageLite == null) {
            GeneratedMessageLite generatedMessageLite2 = (GeneratedMessageLite) C0841f1.m3215a(cls);
            generatedMessageLite2.getClass();
            generatedMessageLite = (T) generatedMessageLite2.mo3038k(MethodToInvoke.GET_DEFAULT_INSTANCE);
            if (generatedMessageLite == null) {
                throw new IllegalStateException();
            }
            defaultInstanceMap.put(cls, generatedMessageLite);
        }
        return (T) generatedMessageLite;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: m */
    static Object m3124m(Object obj, Method method, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e10);
        } catch (InvocationTargetException e11) {
            Throwable cause = e11.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    /* JADX WARN: Unreachable blocks removed: 3, instructions: 3 */
    /* JADX INFO: renamed from: n */
    public static <T extends GeneratedMessageLite<T, ?>> T m3125n(T t10, AbstractC0845h abstractC0845h, C0855m c0855m) throws InvalidProtocolBufferException {
        T t11 = (T) t10.mo3038k(MethodToInvoke.NEW_MUTABLE_INSTANCE);
        try {
            C0868s0 c0868s0 = C0868s0.f5927c;
            c0868s0.getClass();
            InterfaceC0876w0 interfaceC0876w0M3436a = c0868s0.m3436a(t11.getClass());
            C0847i c0847i = abstractC0845h.f5860d;
            if (c0847i == null) {
                c0847i = new C0847i(abstractC0845h);
            }
            interfaceC0876w0M3436a.mo3386b(t11, c0847i, c0855m);
            interfaceC0876w0M3436a.mo3387c(t11);
            return t11;
        } catch (IOException e10) {
            if (e10.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e10.getCause());
            }
            throw new InvalidProtocolBufferException(e10.getMessage());
        } catch (RuntimeException e11) {
            if (e11.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e11.getCause());
            }
            throw e11;
        }
    }

    /* JADX INFO: renamed from: o */
    public static <T extends GeneratedMessageLite<?, ?>> void m3126o(Class<T> cls, T t10) {
        defaultInstanceMap.put(cls, t10);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0824a
    /* JADX INFO: renamed from: a */
    public final int mo3127a() {
        return this.memoizedSerializedSize;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0850j0
    /* JADX INFO: renamed from: b */
    public final boolean mo3128b() {
        byte bByteValue = ((Byte) mo3038k(MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        C0868s0 c0868s0 = C0868s0.f5927c;
        c0868s0.getClass();
        boolean zMo3388d = c0868s0.m3436a(getClass()).mo3388d(this);
        mo3038k(MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED);
        return zMo3388d;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0848i0
    /* JADX INFO: renamed from: c */
    public AbstractC0811a mo3129c() {
        AbstractC0811a abstractC0811a = (AbstractC0811a) mo3038k(MethodToInvoke.NEW_BUILDER);
        abstractC0811a.m3138k();
        AbstractC0811a.m3135m(abstractC0811a.f5811b, this);
        return abstractC0811a;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0848i0
    /* JADX INFO: renamed from: d */
    public final int mo3130d() {
        if (this.memoizedSerializedSize == -1) {
            C0868s0 c0868s0 = C0868s0.f5927c;
            c0868s0.getClass();
            this.memoizedSerializedSize = c0868s0.m3436a(getClass()).mo3391g(this);
        }
        return this.memoizedSerializedSize;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0848i0
    /* JADX INFO: renamed from: e */
    public AbstractC0811a mo3131e() {
        return (AbstractC0811a) mo3038k(MethodToInvoke.NEW_BUILDER);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!((GeneratedMessageLite) mo3038k(MethodToInvoke.GET_DEFAULT_INSTANCE)).getClass().isInstance(obj)) {
            return false;
        }
        C0868s0 c0868s0 = C0868s0.f5927c;
        c0868s0.getClass();
        return c0868s0.m3436a(getClass()).mo3390f(this, (GeneratedMessageLite) obj);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0850j0
    /* JADX INFO: renamed from: f */
    public GeneratedMessageLite mo3132f() {
        return (GeneratedMessageLite) mo3038k(MethodToInvoke.GET_DEFAULT_INSTANCE);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0848i0
    /* JADX INFO: renamed from: h */
    public final void mo3133h(CodedOutputStream codedOutputStream) throws IOException {
        C0868s0 c0868s0 = C0868s0.f5927c;
        c0868s0.getClass();
        InterfaceC0876w0 interfaceC0876w0M3436a = c0868s0.m3436a(getClass());
        C0849j c0849j = codedOutputStream.f5799a;
        if (c0849j == null) {
            c0849j = new C0849j(codedOutputStream);
        }
        interfaceC0876w0M3436a.mo3389e(this, c0849j);
    }

    public final int hashCode() {
        int i10 = this.memoizedHashCode;
        if (i10 != 0) {
            return i10;
        }
        C0868s0 c0868s0 = C0868s0.f5927c;
        c0868s0.getClass();
        int iMo3393i = c0868s0.m3436a(getClass()).mo3393i(this);
        this.memoizedHashCode = iMo3393i;
        return iMo3393i;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0824a
    /* JADX INFO: renamed from: j */
    public final void mo3134j(int i10) {
        this.memoizedSerializedSize = i10;
    }

    /* JADX INFO: renamed from: k */
    public abstract Object mo3038k(MethodToInvoke methodToInvoke);

    public final String toString() {
        String string = super.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("# ");
        sb2.append(string);
        C0852k0.m3366c(this, sb2, 0);
        return sb2.toString();
    }
}
