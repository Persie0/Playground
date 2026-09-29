package kotlin.reflect.jvm.internal.impl.metadata;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC6990a;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC6991b;
import kotlin.reflect.jvm.internal.impl.protobuf.C6992c;
import kotlin.reflect.jvm.internal.impl.protobuf.C6993d;
import kotlin.reflect.jvm.internal.impl.protobuf.C6995f;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC6997h;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;
import p282nn.AbstractC7803a;
import p282nn.InterfaceC7808f;

/* JADX INFO: loaded from: classes2.dex */
public final class ProtoBuf$Effect extends GeneratedMessageLite implements InterfaceC7808f {

    /* JADX INFO: renamed from: i */
    public static final ProtoBuf$Effect f39068i;

    /* JADX INFO: renamed from: j */
    public static final C6923a f39069j = new C6923a();

    /* JADX INFO: renamed from: a */
    public final AbstractC7803a f39070a;

    /* JADX INFO: renamed from: b */
    public int f39071b;

    /* JADX INFO: renamed from: c */
    public EffectType f39072c;

    /* JADX INFO: renamed from: d */
    public List<ProtoBuf$Expression> f39073d;

    /* JADX INFO: renamed from: e */
    public ProtoBuf$Expression f39074e;

    /* JADX INFO: renamed from: f */
    public InvocationKind f39075f;

    /* JADX INFO: renamed from: g */
    public byte f39076g;

    /* JADX INFO: renamed from: h */
    public int f39077h;

    public enum EffectType implements C6995f.a {
        RETURNS_CONSTANT(0, 0),
        CALLS(1, 1),
        RETURNS_NOT_NULL(2, 2);

        private static C6995f.b<EffectType> internalValueMap = new C6921a();
        private final int value;

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Effect$EffectType$a */
        public static class C6921a implements C6995f.b<EffectType> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.C6995f.b
            /* JADX INFO: renamed from: a */
            public final C6995f.a mo13786a(int i10) {
                return EffectType.valueOf(i10);
            }
        }

        EffectType(int i10, int i11) {
            this.value = i11;
        }

        public static EffectType valueOf(int i10) {
            if (i10 == 0) {
                return RETURNS_CONSTANT;
            }
            if (i10 == 1) {
                return CALLS;
            }
            if (i10 != 2) {
                return null;
            }
            return RETURNS_NOT_NULL;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.C6995f.a
        public final int getNumber() {
            return this.value;
        }
    }

    public enum InvocationKind implements C6995f.a {
        AT_MOST_ONCE(0, 0),
        EXACTLY_ONCE(1, 1),
        AT_LEAST_ONCE(2, 2);

        private static C6995f.b<InvocationKind> internalValueMap = new C6922a();
        private final int value;

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Effect$InvocationKind$a */
        public static class C6922a implements C6995f.b<InvocationKind> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.C6995f.b
            /* JADX INFO: renamed from: a */
            public final C6995f.a mo13786a(int i10) {
                return InvocationKind.valueOf(i10);
            }
        }

        InvocationKind(int i10, int i11) {
            this.value = i11;
        }

        public static InvocationKind valueOf(int i10) {
            if (i10 == 0) {
                return AT_MOST_ONCE;
            }
            if (i10 == 1) {
                return EXACTLY_ONCE;
            }
            if (i10 != 2) {
                return null;
            }
            return AT_LEAST_ONCE;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.C6995f.a
        public final int getNumber() {
            return this.value;
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Effect$a */
    public static class C6923a extends AbstractC6991b<ProtoBuf$Effect> {
        @Override // p282nn.InterfaceC7809g
        /* JADX INFO: renamed from: a */
        public final Object mo13787a(C6992c c6992c, C6993d c6993d) throws InvalidProtocolBufferException {
            return new ProtoBuf$Effect(c6992c, c6993d);
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Effect$b */
    public static final class C6924b extends GeneratedMessageLite.AbstractC6982b<ProtoBuf$Effect, C6924b> implements InterfaceC7808f {

        /* JADX INFO: renamed from: b */
        public int f39078b;

        /* JADX INFO: renamed from: c */
        public EffectType f39079c = EffectType.RETURNS_CONSTANT;

        /* JADX INFO: renamed from: d */
        public List<ProtoBuf$Expression> f39080d = Collections.emptyList();

        /* JADX INFO: renamed from: e */
        public ProtoBuf$Expression f39081e = ProtoBuf$Expression.f39093l;

        /* JADX INFO: renamed from: f */
        public InvocationKind f39082f = InvocationKind.AT_MOST_ONCE;

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC6990a.a, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC6997h.a
        /* JADX INFO: renamed from: Q */
        public final /* bridge */ /* synthetic */ InterfaceC6997h.a mo13788Q(C6992c c6992c, C6993d c6993d) throws Throwable {
            m13815n(c6992c, c6993d);
            return this;
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC6997h.a
        /* JADX INFO: renamed from: a */
        public final InterfaceC6997h mo13789a() {
            ProtoBuf$Effect protoBuf$EffectM13813k = m13813k();
            if (protoBuf$EffectM13813k.mo13780b()) {
                return protoBuf$EffectM13813k;
            }
            throw new UninitializedMessageException();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.AbstractC6982b
        public final Object clone() throws CloneNotSupportedException {
            C6924b c6924b = new C6924b();
            c6924b.m13814m(m13813k());
            return c6924b;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC6990a.a
        /* JADX INFO: renamed from: f */
        public final /* bridge */ /* synthetic */ AbstractC6990a.a mo13788Q(C6992c c6992c, C6993d c6993d) throws Throwable {
            m13815n(c6992c, c6993d);
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.AbstractC6982b
        /* JADX INFO: renamed from: g */
        public final GeneratedMessageLite.AbstractC6982b clone() {
            C6924b c6924b = new C6924b();
            c6924b.m13814m(m13813k());
            return c6924b;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.AbstractC6982b
        /* JADX INFO: renamed from: i */
        public final /* bridge */ /* synthetic */ GeneratedMessageLite.AbstractC6982b mo13792i(GeneratedMessageLite generatedMessageLite) {
            m13814m((ProtoBuf$Effect) generatedMessageLite);
            return this;
        }

        /* JADX INFO: renamed from: k */
        public final ProtoBuf$Effect m13813k() {
            ProtoBuf$Effect protoBuf$Effect = new ProtoBuf$Effect(this);
            int i10 = this.f39078b;
            int i11 = 1;
            if ((i10 & 1) != 1) {
                i11 = 0;
            }
            protoBuf$Effect.f39072c = this.f39079c;
            if ((i10 & 2) == 2) {
                this.f39080d = Collections.unmodifiableList(this.f39080d);
                this.f39078b &= -3;
            }
            protoBuf$Effect.f39073d = this.f39080d;
            if ((i10 & 4) == 4) {
                i11 |= 2;
            }
            protoBuf$Effect.f39074e = this.f39081e;
            if ((i10 & 8) == 8) {
                i11 |= 4;
            }
            protoBuf$Effect.f39075f = this.f39082f;
            protoBuf$Effect.f39071b = i11;
            return protoBuf$Effect;
        }

        /* JADX INFO: renamed from: m */
        public final void m13814m(ProtoBuf$Effect protoBuf$Effect) {
            ProtoBuf$Expression protoBuf$Expression;
            if (protoBuf$Effect == ProtoBuf$Effect.f39068i) {
                return;
            }
            boolean z10 = true;
            if ((protoBuf$Effect.f39071b & 1) == 1) {
                EffectType effectType = protoBuf$Effect.f39072c;
                effectType.getClass();
                this.f39078b |= 1;
                this.f39079c = effectType;
            }
            if (!protoBuf$Effect.f39073d.isEmpty()) {
                if (this.f39080d.isEmpty()) {
                    this.f39080d = protoBuf$Effect.f39073d;
                    this.f39078b &= -3;
                } else {
                    if ((this.f39078b & 2) != 2) {
                        this.f39080d = new ArrayList(this.f39080d);
                        this.f39078b |= 2;
                    }
                    this.f39080d.addAll(protoBuf$Effect.f39073d);
                }
            }
            if ((protoBuf$Effect.f39071b & 2) == 2) {
                ProtoBuf$Expression protoBuf$Expression2 = protoBuf$Effect.f39074e;
                if ((this.f39078b & 4) != 4 || (protoBuf$Expression = this.f39081e) == ProtoBuf$Expression.f39093l) {
                    this.f39081e = protoBuf$Expression2;
                } else {
                    ProtoBuf$Expression.C6929b c6929b = new ProtoBuf$Expression.C6929b();
                    c6929b.m13819m(protoBuf$Expression);
                    c6929b.m13819m(protoBuf$Expression2);
                    this.f39081e = c6929b.m13818k();
                }
                this.f39078b |= 4;
            }
            if ((protoBuf$Effect.f39071b & 4) != 4) {
                z10 = false;
            }
            if (z10) {
                InvocationKind invocationKind = protoBuf$Effect.f39075f;
                invocationKind.getClass();
                this.f39078b |= 8;
                this.f39082f = invocationKind;
            }
            this.f39493a = this.f39493a.m15519f(protoBuf$Effect.f39070a);
        }

        /* JADX WARN: Code duplicated, block: B:15:0x001f  */
        /* JADX INFO: renamed from: n */
        public final void m13815n(C6992c c6992c, C6993d c6993d) throws Throwable {
            ProtoBuf$Effect protoBuf$Effect;
            try {
                try {
                    ProtoBuf$Effect.f39069j.getClass();
                    m13814m(new ProtoBuf$Effect(c6992c, c6993d));
                } catch (Throwable th2) {
                    th = th2;
                    protoBuf$Effect = null;
                    if (protoBuf$Effect != null) {
                        m13814m(protoBuf$Effect);
                    }
                    throw th;
                }
            } catch (InvalidProtocolBufferException e10) {
                protoBuf$Effect = (ProtoBuf$Effect) e10.f39506a;
                try {
                    throw e10;
                } catch (Throwable th3) {
                    th = th3;
                    if (protoBuf$Effect != null) {
                        m13814m(protoBuf$Effect);
                    }
                    throw th;
                }
            }
        }
    }

    static {
        ProtoBuf$Effect protoBuf$Effect = new ProtoBuf$Effect();
        f39068i = protoBuf$Effect;
        protoBuf$Effect.f39072c = EffectType.RETURNS_CONSTANT;
        protoBuf$Effect.f39073d = Collections.emptyList();
        protoBuf$Effect.f39074e = ProtoBuf$Expression.f39093l;
        protoBuf$Effect.f39075f = InvocationKind.AT_MOST_ONCE;
    }

    public ProtoBuf$Effect() {
        this.f39076g = (byte) -1;
        this.f39077h = -1;
        this.f39070a = AbstractC7803a.f42882a;
    }

    public ProtoBuf$Effect(GeneratedMessageLite.AbstractC6982b abstractC6982b) {
        super(0);
        this.f39076g = (byte) -1;
        this.f39077h = -1;
        this.f39070a = abstractC6982b.f39493a;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    public ProtoBuf$Effect(C6992c c6992c, C6993d c6993d) throws InvalidProtocolBufferException {
        ProtoBuf$Expression.C6929b c6929b;
        this.f39076g = (byte) -1;
        this.f39077h = -1;
        this.f39072c = EffectType.RETURNS_CONSTANT;
        this.f39073d = Collections.emptyList();
        this.f39074e = ProtoBuf$Expression.f39093l;
        this.f39075f = InvocationKind.AT_MOST_ONCE;
        AbstractC7803a.b bVar = new AbstractC7803a.b();
        CodedOutputStream codedOutputStreamM13901j = CodedOutputStream.m13901j(bVar, 1);
        boolean z10 = false;
        int i10 = 0;
        while (!z10) {
            try {
                try {
                    int iM13952n = c6992c.m13952n();
                    if (iM13952n != 0) {
                        if (iM13952n == 8) {
                            int iM13949k = c6992c.m13949k();
                            EffectType effectTypeValueOf = EffectType.valueOf(iM13949k);
                            if (effectTypeValueOf == null) {
                                codedOutputStreamM13901j.m13914v(iM13952n);
                                codedOutputStreamM13901j.m13914v(iM13949k);
                            } else {
                                this.f39071b |= 1;
                                this.f39072c = effectTypeValueOf;
                            }
                        } else if (iM13952n == 18) {
                            if ((i10 & 2) != 2) {
                                this.f39073d = new ArrayList();
                                i10 |= 2;
                            }
                            this.f39073d.add((ProtoBuf$Expression) c6992c.m13945g(ProtoBuf$Expression.f39092H, c6993d));
                        } else if (iM13952n == 26) {
                            if ((this.f39071b & 2) == 2) {
                                ProtoBuf$Expression protoBuf$Expression = this.f39074e;
                                protoBuf$Expression.getClass();
                                c6929b = new ProtoBuf$Expression.C6929b();
                                c6929b.m13819m(protoBuf$Expression);
                            } else {
                                c6929b = null;
                            }
                            ProtoBuf$Expression protoBuf$Expression2 = (ProtoBuf$Expression) c6992c.m13945g(ProtoBuf$Expression.f39092H, c6993d);
                            this.f39074e = protoBuf$Expression2;
                            if (c6929b != null) {
                                c6929b.m13819m(protoBuf$Expression2);
                                this.f39074e = c6929b.m13818k();
                            }
                            this.f39071b |= 2;
                        } else if (iM13952n == 32) {
                            int iM13949k2 = c6992c.m13949k();
                            InvocationKind invocationKindValueOf = InvocationKind.valueOf(iM13949k2);
                            if (invocationKindValueOf == null) {
                                codedOutputStreamM13901j.m13914v(iM13952n);
                                codedOutputStreamM13901j.m13914v(iM13949k2);
                            } else {
                                this.f39071b |= 4;
                                this.f39075f = invocationKindValueOf;
                            }
                        } else if (!c6992c.m13955q(iM13952n, codedOutputStreamM13901j)) {
                        }
                    }
                    z10 = true;
                } catch (Throwable th2) {
                    if ((i10 & 2) == 2) {
                        this.f39073d = Collections.unmodifiableList(this.f39073d);
                    }
                    try {
                        codedOutputStreamM13901j.m13902i();
                    } catch (IOException unused) {
                    } finally {
                        this.f39070a = bVar.m15533l();
                    }
                    throw th2;
                }
            } catch (InvalidProtocolBufferException e10) {
                e10.f39506a = this;
                throw e10;
            } catch (IOException e11) {
                InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e11.getMessage());
                invalidProtocolBufferException.f39506a = this;
                throw invalidProtocolBufferException;
            }
        }
        if ((i10 & 2) == 2) {
            this.f39073d = Collections.unmodifiableList(this.f39073d);
        }
        try {
            codedOutputStreamM13901j.m13902i();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f39070a = bVar.m15533l();
            throw th3;
        }
        this.f39070a = bVar.m15533l();
    }

    @Override // p282nn.InterfaceC7808f
    /* JADX INFO: renamed from: b */
    public final boolean mo13780b() {
        byte b10 = this.f39076g;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        for (int i10 = 0; i10 < this.f39073d.size(); i10++) {
            if (!this.f39073d.get(i10).mo13780b()) {
                this.f39076g = (byte) 0;
                return false;
            }
        }
        if (!((this.f39071b & 2) == 2) || this.f39074e.mo13780b()) {
            this.f39076g = (byte) 1;
            return true;
        }
        this.f39076g = (byte) 0;
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC6997h
    /* JADX INFO: renamed from: c */
    public final InterfaceC6997h.a mo13781c() {
        C6924b c6924b = new C6924b();
        c6924b.m13814m(this);
        return c6924b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC6997h
    /* JADX INFO: renamed from: d */
    public final int mo13782d() {
        int i10 = this.f39077h;
        if (i10 != -1) {
            return i10;
        }
        int iM13893a = (this.f39071b & 1) == 1 ? CodedOutputStream.m13893a(1, this.f39072c.getNumber()) + 0 : 0;
        for (int i11 = 0; i11 < this.f39073d.size(); i11++) {
            iM13893a += CodedOutputStream.m13896d(2, this.f39073d.get(i11));
        }
        if ((this.f39071b & 2) == 2) {
            iM13893a += CodedOutputStream.m13896d(3, this.f39074e);
        }
        if ((this.f39071b & 4) == 4) {
            iM13893a += CodedOutputStream.m13893a(4, this.f39075f.getNumber());
        }
        int size = this.f39070a.size() + iM13893a;
        this.f39077h = size;
        return size;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC6997h
    /* JADX INFO: renamed from: e */
    public final InterfaceC6997h.a mo13783e() {
        return new C6924b();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC6997h
    /* JADX INFO: renamed from: j */
    public final void mo13784j(CodedOutputStream codedOutputStream) throws IOException {
        mo13782d();
        if ((this.f39071b & 1) == 1) {
            codedOutputStream.m13904l(1, this.f39072c.getNumber());
        }
        for (int i10 = 0; i10 < this.f39073d.size(); i10++) {
            codedOutputStream.m13907o(2, this.f39073d.get(i10));
        }
        if ((this.f39071b & 2) == 2) {
            codedOutputStream.m13907o(3, this.f39074e);
        }
        if ((this.f39071b & 4) == 4) {
            codedOutputStream.m13904l(4, this.f39075f.getNumber());
        }
        codedOutputStream.m13910r(this.f39070a);
    }
}
