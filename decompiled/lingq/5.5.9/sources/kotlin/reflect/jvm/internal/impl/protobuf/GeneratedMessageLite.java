package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p282nn.AbstractC7803a;
import p282nn.InterfaceC7808f;

/* JADX INFO: loaded from: classes2.dex */
public abstract class GeneratedMessageLite extends AbstractC6990a implements Serializable {

    public static abstract class ExtendableMessage<MessageType extends ExtendableMessage<MessageType>> extends GeneratedMessageLite implements InterfaceC7808f {

        /* JADX INFO: renamed from: a */
        public final C6994e<C6984d> f39488a;

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$ExtendableMessage$a */
        public class C6980a {

            /* JADX INFO: renamed from: a */
            public final Iterator<Map.Entry<C6984d, Object>> f39489a;

            /* JADX INFO: renamed from: b */
            public Map.Entry<C6984d, Object> f39490b;

            /* JADX INFO: renamed from: c */
            public final boolean f39491c;

            public C6980a(ExtendableMessage extendableMessage) {
                C6994e<C6984d> c6994e = extendableMessage.f39488a;
                boolean z10 = c6994e.f39524c;
                C6998i c6998i = c6994e.f39522a;
                Iterator<Map.Entry<C6984d, Object>> bVar = z10 ? new C6996g.b<>(((C6999j.d) c6998i.entrySet()).iterator()) : ((C6999j.d) c6998i.entrySet()).iterator();
                this.f39489a = bVar;
                if (bVar.hasNext()) {
                    this.f39490b = bVar.next();
                }
                this.f39491c = false;
            }

            /* JADX INFO: renamed from: a */
            public final void m13927a(int i10, CodedOutputStream codedOutputStream) throws IOException {
                while (true) {
                    Map.Entry<C6984d, Object> entry = this.f39490b;
                    if (entry == null || entry.getKey().f39497b >= i10) {
                        break;
                    }
                    C6984d key = this.f39490b.getKey();
                    int iM13959c = 0;
                    if (this.f39491c && key.mo13932j() == WireFormat$JavaType.MESSAGE && !key.f39499d) {
                        InterfaceC6997h interfaceC6997h = (InterfaceC6997h) this.f39490b.getValue();
                        codedOutputStream.m13916x(1, 3);
                        codedOutputStream.m13916x(2, 0);
                        codedOutputStream.m13914v(key.f39497b);
                        codedOutputStream.m13907o(3, interfaceC6997h);
                        codedOutputStream.m13916x(1, 4);
                    } else {
                        Object value = this.f39490b.getValue();
                        C6994e c6994e = C6994e.f39521d;
                        WireFormat$FieldType wireFormat$FieldTypeMo13931h = key.mo13931h();
                        int number = key.getNumber();
                        if (key.mo13930e()) {
                            List list = (List) value;
                            if (key.isPacked()) {
                                codedOutputStream.m13916x(number, 2);
                                Iterator it = list.iterator();
                                while (it.hasNext()) {
                                    iM13959c += C6994e.m13959c(wireFormat$FieldTypeMo13931h, it.next());
                                }
                                codedOutputStream.m13914v(iM13959c);
                                Iterator it2 = list.iterator();
                                while (it2.hasNext()) {
                                    C6994e.m13965m(codedOutputStream, wireFormat$FieldTypeMo13931h, it2.next());
                                }
                            } else {
                                Iterator it3 = list.iterator();
                                while (it3.hasNext()) {
                                    C6994e.m13964l(codedOutputStream, wireFormat$FieldTypeMo13931h, number, it3.next());
                                }
                            }
                        } else if (value instanceof C6996g) {
                            C6994e.m13964l(codedOutputStream, wireFormat$FieldTypeMo13931h, number, ((C6996g) value).m13972a());
                        } else {
                            C6994e.m13964l(codedOutputStream, wireFormat$FieldTypeMo13931h, number, value);
                        }
                    }
                    Iterator<Map.Entry<C6984d, Object>> it4 = this.f39489a;
                    if (it4.hasNext()) {
                        this.f39490b = it4.next();
                    } else {
                        this.f39490b = null;
                    }
                }
            }
        }

        public ExtendableMessage() {
            this.f39488a = new C6994e<>();
        }

        public ExtendableMessage(AbstractC6983c<MessageType, ?> abstractC6983c) {
            abstractC6983c.f39494b.m13969g();
            abstractC6983c.f39495c = false;
            this.f39488a = abstractC6983c.f39494b;
        }

        /* JADX INFO: renamed from: n */
        public final boolean m13919n() {
            int i10 = 0;
            while (true) {
                C6998i c6998i = this.f39488a.f39522a;
                if (i10 >= c6998i.f39532b.size()) {
                    Iterator<Map.Entry<Object, Object>> it = c6998i.m13975c().iterator();
                    while (it.hasNext()) {
                        if (!C6994e.m13961f(it.next())) {
                            return false;
                        }
                    }
                    return true;
                }
                if (!C6994e.m13961f(c6998i.f39532b.get(i10))) {
                    return false;
                }
                i10++;
            }
        }

        /* JADX INFO: renamed from: q */
        public final int m13920q() {
            C6998i c6998i;
            int i10 = 0;
            int iM13960d = 0;
            while (true) {
                c6998i = this.f39488a.f39522a;
                if (i10 >= c6998i.f39532b.size()) {
                    break;
                }
                C6999j<K, V>.b bVar = c6998i.f39532b.get(i10);
                iM13960d += C6994e.m13960d((C6994e.b) bVar.getKey(), bVar.getValue());
                i10++;
            }
            for (Map.Entry<Object, Object> entry : c6998i.m13975c()) {
                iM13960d += C6994e.m13960d((C6994e.b) entry.getKey(), entry.getValue());
            }
            return iM13960d;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v2, types: [Type, java.util.ArrayList] */
        /* JADX INFO: renamed from: r */
        public final <Type> Type m13921r(C6985e<MessageType, Type> c6985e) {
            m13926y(c6985e);
            C6994e<C6984d> c6994e = this.f39488a;
            C6984d c6984d = c6985e.f39504d;
            Type type = (Type) c6994e.m13968e(c6984d);
            if (type == null) {
                return c6985e.f39502b;
            }
            if (!c6984d.f39499d) {
                return (Type) c6985e.m13933a(type);
            }
            if (c6984d.mo13932j() != WireFormat$JavaType.ENUM) {
                return type;
            }
            ?? r10 = (Type) new ArrayList();
            Iterator it = ((List) type).iterator();
            while (it.hasNext()) {
                r10.add(c6985e.m13933a(it.next()));
            }
            return r10;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* JADX INFO: renamed from: s */
        public final <Type> boolean m13922s(C6985e<MessageType, Type> c6985e) {
            m13926y(c6985e);
            C6994e<C6984d> c6994e = this.f39488a;
            c6994e.getClass();
            C6984d c6984d = c6985e.f39504d;
            if (c6984d.f39499d) {
                throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
            }
            return c6994e.f39522a.get(c6984d) != null;
        }

        /* JADX INFO: renamed from: t */
        public final void m13923t() {
            this.f39488a.m13969g();
        }

        /* JADX INFO: renamed from: w */
        public final ExtendableMessage<MessageType>.C6980a m13924w() {
            return new C6980a(this);
        }

        /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
        /* JADX INFO: renamed from: x */
        public final boolean m13925x(C6992c c6992c, CodedOutputStream codedOutputStream, C6993d c6993d, int i10) throws IOException {
            boolean z10;
            boolean z11;
            Object objMo13789a;
            InterfaceC6997h interfaceC6997h;
            InterfaceC6997h interfaceC6997hMo13802h = mo13802h();
            int i11 = i10 & 7;
            c6993d.getClass();
            C6985e<?, ?> c6985e = c6993d.f39518a.get(new C6993d.a(i10 >>> 3, interfaceC6997hMo13802h));
            if (c6985e == null) {
                z10 = false;
                z11 = true;
            } else {
                C6984d c6984d = c6985e.f39504d;
                WireFormat$FieldType wireFormat$FieldType = c6984d.f39498c;
                C6994e c6994e = C6994e.f39521d;
                if (i11 == wireFormat$FieldType.getWireType()) {
                    z11 = false;
                    z10 = false;
                } else if (c6984d.f39499d && c6984d.f39498c.isPackable() && i11 == 2) {
                    z11 = false;
                    z10 = true;
                } else {
                    z10 = false;
                    z11 = true;
                }
            }
            if (z11) {
                return c6992c.m13955q(i10, codedOutputStream);
            }
            C6994e<C6984d> c6994e2 = this.f39488a;
            if (z10) {
                int iM13942d = c6992c.m13942d(c6992c.m13949k());
                C6984d c6984d2 = c6985e.f39504d;
                if (c6984d2.f39498c == WireFormat$FieldType.ENUM) {
                    while (c6992c.m13940b() > 0) {
                        C6995f.a aVarMo13786a = c6984d2.f39496a.mo13786a(c6992c.m13949k());
                        if (aVarMo13786a == null) {
                            return true;
                        }
                        c6994e2.m13966a(c6984d2, c6985e.m13934b(aVarMo13786a));
                    }
                } else {
                    while (c6992c.m13940b() > 0) {
                        c6994e2.m13966a(c6984d2, C6994e.m13962i(c6992c, c6984d2.f39498c));
                    }
                }
                c6992c.m13941c(iM13942d);
                return true;
            }
            int i12 = C6981a.f39492a[c6985e.f39504d.mo13932j().ordinal()];
            C6984d c6984d3 = c6985e.f39504d;
            if (i12 == 1) {
                InterfaceC6997h.a aVarMo13781c = (c6984d3.f39499d || (interfaceC6997h = (InterfaceC6997h) c6994e2.m13968e(c6984d3)) == null) ? null : interfaceC6997h.mo13781c();
                if (aVarMo13781c == null) {
                    aVarMo13781c = c6985e.f39503c.mo13783e();
                }
                if (c6984d3.f39498c == WireFormat$FieldType.GROUP) {
                    int i13 = c6992c.f39516i;
                    if (i13 >= 64) {
                        throw new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
                    }
                    c6992c.f39516i = i13 + 1;
                    aVarMo13781c.mo13788Q(c6992c, c6993d);
                    c6992c.m13939a((c6984d3.f39497b << 3) | 4);
                    c6992c.f39516i--;
                } else {
                    int iM13949k = c6992c.m13949k();
                    if (c6992c.f39516i >= 64) {
                        throw new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
                    }
                    int iM13942d2 = c6992c.m13942d(iM13949k);
                    c6992c.f39516i++;
                    aVarMo13781c.mo13788Q(c6992c, c6993d);
                    c6992c.m13939a(0);
                    c6992c.f39516i--;
                    c6992c.m13941c(iM13942d2);
                }
                objMo13789a = aVarMo13781c.mo13789a();
            } else if (i12 != 2) {
                objMo13789a = C6994e.m13962i(c6992c, c6984d3.f39498c);
            } else {
                int iM13949k2 = c6992c.m13949k();
                C6995f.a aVarMo13786a2 = c6984d3.f39496a.mo13786a(iM13949k2);
                if (aVarMo13786a2 == null) {
                    codedOutputStream.m13914v(i10);
                    codedOutputStream.m13914v(iM13949k2);
                    return true;
                }
                objMo13789a = aVarMo13786a2;
            }
            if (c6984d3.f39499d) {
                c6994e2.m13966a(c6984d3, c6985e.m13934b(objMo13789a));
                return true;
            }
            c6994e2.m13971j(c6984d3, c6985e.m13934b(objMo13789a));
            return true;
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* JADX INFO: renamed from: y */
        public final void m13926y(C6985e<MessageType, ?> c6985e) {
            if (c6985e.f39501a != mo13802h()) {
                throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
            }
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$a */
    public static /* synthetic */ class C6981a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f39492a;

        static {
            int[] iArr = new int[WireFormat$JavaType.values().length];
            f39492a = iArr;
            try {
                iArr[WireFormat$JavaType.MESSAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f39492a[WireFormat$JavaType.ENUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$b */
    public static abstract class AbstractC6982b<MessageType extends GeneratedMessageLite, BuilderType extends AbstractC6982b> extends AbstractC6990a.a<BuilderType> {

        /* JADX INFO: renamed from: a */
        public AbstractC7803a f39493a = AbstractC7803a.f42882a;

        @Override // 
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public BuilderType clone() {
            throw new UnsupportedOperationException("This is supposed to be overridden by subclasses.");
        }

        /* JADX INFO: renamed from: i */
        public abstract BuilderType mo13792i(MessageType messagetype);
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$c */
    public static abstract class AbstractC6983c<MessageType extends ExtendableMessage<MessageType>, BuilderType extends AbstractC6983c<MessageType, BuilderType>> extends AbstractC6982b<MessageType, BuilderType> implements InterfaceC7808f {

        /* JADX INFO: renamed from: b */
        public C6994e<C6984d> f39494b = C6994e.f39521d;

        /* JADX INFO: renamed from: c */
        public boolean f39495c;

        /* JADX INFO: renamed from: k */
        public final void m13928k(MessageType messagetype) {
            C6998i c6998i;
            if (!this.f39495c) {
                this.f39494b = this.f39494b.clone();
                this.f39495c = true;
            }
            C6994e<C6984d> c6994e = this.f39494b;
            C6994e<C6984d> c6994e2 = messagetype.f39488a;
            c6994e.getClass();
            int i10 = 0;
            while (true) {
                int size = c6994e2.f39522a.f39532b.size();
                c6998i = c6994e2.f39522a;
                if (i10 >= size) {
                    break;
                }
                c6994e.m13970h(c6998i.f39532b.get(i10));
                i10++;
            }
            Iterator<Map.Entry<Object, Object>> it = c6998i.m13975c().iterator();
            while (it.hasNext()) {
                c6994e.m13970h((Map.Entry) it.next());
            }
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$d */
    public static final class C6984d implements C6994e.b<C6984d> {

        /* JADX INFO: renamed from: b */
        public final int f39497b;

        /* JADX INFO: renamed from: c */
        public final WireFormat$FieldType f39498c;

        /* JADX INFO: renamed from: d */
        public final boolean f39499d;

        /* JADX INFO: renamed from: a */
        public final C6995f.b<?> f39496a = null;

        /* JADX INFO: renamed from: e */
        public final boolean f39500e = false;

        public C6984d(int i10, WireFormat$FieldType wireFormat$FieldType, boolean z10) {
            this.f39497b = i10;
            this.f39498c = wireFormat$FieldType;
            this.f39499d = z10;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.C6994e.b
        /* JADX INFO: renamed from: b */
        public final AbstractC6982b mo13929b(InterfaceC6997h.a aVar, InterfaceC6997h interfaceC6997h) {
            return ((AbstractC6982b) aVar).mo13792i((GeneratedMessageLite) interfaceC6997h);
        }

        @Override // java.lang.Comparable
        public final int compareTo(Object obj) {
            return this.f39497b - ((C6984d) obj).f39497b;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.C6994e.b
        /* JADX INFO: renamed from: e */
        public final boolean mo13930e() {
            return this.f39499d;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.C6994e.b
        public final int getNumber() {
            return this.f39497b;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.C6994e.b
        /* JADX INFO: renamed from: h */
        public final WireFormat$FieldType mo13931h() {
            return this.f39498c;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.C6994e.b
        public final boolean isPacked() {
            return this.f39500e;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.C6994e.b
        /* JADX INFO: renamed from: j */
        public final WireFormat$JavaType mo13932j() {
            return this.f39498c.getJavaType();
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$e */
    public static class C6985e<ContainingType extends InterfaceC6997h, Type> {

        /* JADX INFO: renamed from: a */
        public final ContainingType f39501a;

        /* JADX INFO: renamed from: b */
        public final Type f39502b;

        /* JADX INFO: renamed from: c */
        public final InterfaceC6997h f39503c;

        /* JADX INFO: renamed from: d */
        public final C6984d f39504d;

        /* JADX INFO: renamed from: e */
        public final Method f39505e;

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
        public C6985e(ExtendableMessage extendableMessage, Object obj, GeneratedMessageLite generatedMessageLite, C6984d c6984d, Class cls) {
            if (extendableMessage == null) {
                throw new IllegalArgumentException("Null containingTypeDefaultInstance");
            }
            if (c6984d.f39498c == WireFormat$FieldType.MESSAGE && generatedMessageLite == null) {
                throw new IllegalArgumentException("Null messageDefaultInstance");
            }
            this.f39501a = extendableMessage;
            this.f39502b = obj;
            this.f39503c = generatedMessageLite;
            this.f39504d = c6984d;
            if (!C6995f.a.class.isAssignableFrom(cls)) {
                this.f39505e = null;
                return;
            }
            try {
                this.f39505e = cls.getMethod("valueOf", Integer.TYPE);
            } catch (NoSuchMethodException e10) {
                String name = cls.getName();
                StringBuilder sb2 = new StringBuilder(name.length() + 45 + 7);
                sb2.append("Generated message class \"");
                sb2.append(name);
                sb2.append("\" missing method \"valueOf\".");
                throw new RuntimeException(sb2.toString(), e10);
            }
        }

        /* JADX WARN: Unreachable blocks removed: 3, instructions: 3 */
        /* JADX INFO: renamed from: a */
        public final Object m13933a(Object obj) {
            if (this.f39504d.mo13932j() != WireFormat$JavaType.ENUM) {
                return obj;
            }
            try {
                return this.f39505e.invoke(null, (Integer) obj);
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

        /* JADX INFO: renamed from: b */
        public final Object m13934b(Object obj) {
            if (this.f39504d.mo13932j() == WireFormat$JavaType.ENUM) {
                obj = Integer.valueOf(((C6995f.a) obj).getNumber());
            }
            return obj;
        }
    }

    public GeneratedMessageLite() {
    }

    public GeneratedMessageLite(int i10) {
    }

    /* JADX INFO: renamed from: k */
    public static C6985e m13917k(ExtendableMessage extendableMessage, GeneratedMessageLite generatedMessageLite, int i10, WireFormat$FieldType wireFormat$FieldType, Class cls) {
        return new C6985e(extendableMessage, Collections.emptyList(), generatedMessageLite, new C6984d(i10, wireFormat$FieldType, true), cls);
    }

    /* JADX INFO: renamed from: l */
    public static C6985e m13918l(ExtendableMessage extendableMessage, Serializable serializable, GeneratedMessageLite generatedMessageLite, int i10, WireFormat$FieldType wireFormat$FieldType, Class cls) {
        return new C6985e(extendableMessage, serializable, generatedMessageLite, new C6984d(i10, wireFormat$FieldType, false), cls);
    }
}
