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
public final class ProtoBuf$Expression extends GeneratedMessageLite implements InterfaceC7808f {

    /* JADX INFO: renamed from: H */
    public static final C6928a f39092H = new C6928a();

    /* JADX INFO: renamed from: l */
    public static final ProtoBuf$Expression f39093l;

    /* JADX INFO: renamed from: a */
    public final AbstractC7803a f39094a;

    /* JADX INFO: renamed from: b */
    public int f39095b;

    /* JADX INFO: renamed from: c */
    public int f39096c;

    /* JADX INFO: renamed from: d */
    public int f39097d;

    /* JADX INFO: renamed from: e */
    public ConstantValue f39098e;

    /* JADX INFO: renamed from: f */
    public ProtoBuf$Type f39099f;

    /* JADX INFO: renamed from: g */
    public int f39100g;

    /* JADX INFO: renamed from: h */
    public List<ProtoBuf$Expression> f39101h;

    /* JADX INFO: renamed from: i */
    public List<ProtoBuf$Expression> f39102i;

    /* JADX INFO: renamed from: j */
    public byte f39103j;

    /* JADX INFO: renamed from: k */
    public int f39104k;

    public enum ConstantValue implements C6995f.a {
        TRUE(0, 0),
        FALSE(1, 1),
        NULL(2, 2);

        private static C6995f.b<ConstantValue> internalValueMap = new C6927a();
        private final int value;

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Expression$ConstantValue$a */
        public static class C6927a implements C6995f.b<ConstantValue> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.C6995f.b
            /* JADX INFO: renamed from: a */
            public final C6995f.a mo13786a(int i10) {
                return ConstantValue.valueOf(i10);
            }
        }

        ConstantValue(int i10, int i11) {
            this.value = i11;
        }

        public static ConstantValue valueOf(int i10) {
            if (i10 == 0) {
                return TRUE;
            }
            if (i10 == 1) {
                return FALSE;
            }
            if (i10 != 2) {
                return null;
            }
            return NULL;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.C6995f.a
        public final int getNumber() {
            return this.value;
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Expression$a */
    public static class C6928a extends AbstractC6991b<ProtoBuf$Expression> {
        @Override // p282nn.InterfaceC7809g
        /* JADX INFO: renamed from: a */
        public final Object mo13787a(C6992c c6992c, C6993d c6993d) throws InvalidProtocolBufferException {
            return new ProtoBuf$Expression(c6992c, c6993d);
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Expression$b */
    public static final class C6929b extends GeneratedMessageLite.AbstractC6982b<ProtoBuf$Expression, C6929b> implements InterfaceC7808f {

        /* JADX INFO: renamed from: b */
        public int f39105b;

        /* JADX INFO: renamed from: c */
        public int f39106c;

        /* JADX INFO: renamed from: d */
        public int f39107d;

        /* JADX INFO: renamed from: g */
        public int f39110g;

        /* JADX INFO: renamed from: e */
        public ConstantValue f39108e = ConstantValue.TRUE;

        /* JADX INFO: renamed from: f */
        public ProtoBuf$Type f39109f = ProtoBuf$Type.f39246O;

        /* JADX INFO: renamed from: h */
        public List<ProtoBuf$Expression> f39111h = Collections.emptyList();

        /* JADX INFO: renamed from: i */
        public List<ProtoBuf$Expression> f39112i = Collections.emptyList();

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC6990a.a, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC6997h.a
        /* JADX INFO: renamed from: Q */
        public final /* bridge */ /* synthetic */ InterfaceC6997h.a mo13788Q(C6992c c6992c, C6993d c6993d) throws Throwable {
            m13820n(c6992c, c6993d);
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC6997h.a
        /* JADX INFO: renamed from: a */
        public final InterfaceC6997h mo13789a() {
            ProtoBuf$Expression protoBuf$ExpressionM13818k = m13818k();
            if (protoBuf$ExpressionM13818k.mo13780b()) {
                return protoBuf$ExpressionM13818k;
            }
            throw new UninitializedMessageException();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.AbstractC6982b
        public final Object clone() throws CloneNotSupportedException {
            C6929b c6929b = new C6929b();
            c6929b.m13819m(m13818k());
            return c6929b;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC6990a.a
        /* JADX INFO: renamed from: f */
        public final /* bridge */ /* synthetic */ AbstractC6990a.a mo13788Q(C6992c c6992c, C6993d c6993d) throws Throwable {
            m13820n(c6992c, c6993d);
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.AbstractC6982b
        /* JADX INFO: renamed from: g */
        public final GeneratedMessageLite.AbstractC6982b clone() {
            C6929b c6929b = new C6929b();
            c6929b.m13819m(m13818k());
            return c6929b;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.AbstractC6982b
        /* JADX INFO: renamed from: i */
        public final /* bridge */ /* synthetic */ GeneratedMessageLite.AbstractC6982b mo13792i(GeneratedMessageLite generatedMessageLite) {
            m13819m((ProtoBuf$Expression) generatedMessageLite);
            return this;
        }

        /* JADX INFO: renamed from: k */
        public final ProtoBuf$Expression m13818k() {
            ProtoBuf$Expression protoBuf$Expression = new ProtoBuf$Expression(this);
            int i10 = this.f39105b;
            int i11 = 1;
            if ((i10 & 1) != 1) {
                i11 = 0;
            }
            protoBuf$Expression.f39096c = this.f39106c;
            if ((i10 & 2) == 2) {
                i11 |= 2;
            }
            protoBuf$Expression.f39097d = this.f39107d;
            if ((i10 & 4) == 4) {
                i11 |= 4;
            }
            protoBuf$Expression.f39098e = this.f39108e;
            if ((i10 & 8) == 8) {
                i11 |= 8;
            }
            protoBuf$Expression.f39099f = this.f39109f;
            if ((i10 & 16) == 16) {
                i11 |= 16;
            }
            protoBuf$Expression.f39100g = this.f39110g;
            if ((i10 & 32) == 32) {
                this.f39111h = Collections.unmodifiableList(this.f39111h);
                this.f39105b &= -33;
            }
            protoBuf$Expression.f39101h = this.f39111h;
            if ((this.f39105b & 64) == 64) {
                this.f39112i = Collections.unmodifiableList(this.f39112i);
                this.f39105b &= -65;
            }
            protoBuf$Expression.f39102i = this.f39112i;
            protoBuf$Expression.f39095b = i11;
            return protoBuf$Expression;
        }

        /* JADX INFO: renamed from: m */
        public final void m13819m(ProtoBuf$Expression protoBuf$Expression) {
            ProtoBuf$Type protoBuf$Type;
            if (protoBuf$Expression == ProtoBuf$Expression.f39093l) {
                return;
            }
            int i10 = protoBuf$Expression.f39095b;
            boolean z10 = false;
            if ((i10 & 1) == 1) {
                int i11 = protoBuf$Expression.f39096c;
                this.f39105b |= 1;
                this.f39106c = i11;
            }
            if ((i10 & 2) == 2) {
                int i12 = protoBuf$Expression.f39097d;
                this.f39105b = 2 | this.f39105b;
                this.f39107d = i12;
            }
            if ((i10 & 4) == 4) {
                ConstantValue constantValue = protoBuf$Expression.f39098e;
                constantValue.getClass();
                this.f39105b = 4 | this.f39105b;
                this.f39108e = constantValue;
            }
            if ((protoBuf$Expression.f39095b & 8) == 8) {
                ProtoBuf$Type protoBuf$Type2 = protoBuf$Expression.f39099f;
                if ((this.f39105b & 8) != 8 || (protoBuf$Type = this.f39109f) == ProtoBuf$Type.f39246O) {
                    this.f39109f = protoBuf$Type2;
                } else {
                    ProtoBuf$Type.C6951b c6951bM13844C = ProtoBuf$Type.m13844C(protoBuf$Type);
                    c6951bM13844C.m13852n(protoBuf$Type2);
                    this.f39109f = c6951bM13844C.m13851m();
                }
                this.f39105b |= 8;
            }
            if ((protoBuf$Expression.f39095b & 16) == 16) {
                z10 = true;
            }
            if (z10) {
                int i13 = protoBuf$Expression.f39100g;
                this.f39105b = 16 | this.f39105b;
                this.f39110g = i13;
            }
            if (!protoBuf$Expression.f39101h.isEmpty()) {
                if (this.f39111h.isEmpty()) {
                    this.f39111h = protoBuf$Expression.f39101h;
                    this.f39105b &= -33;
                } else {
                    if ((this.f39105b & 32) != 32) {
                        this.f39111h = new ArrayList(this.f39111h);
                        this.f39105b |= 32;
                    }
                    this.f39111h.addAll(protoBuf$Expression.f39101h);
                }
            }
            if (!protoBuf$Expression.f39102i.isEmpty()) {
                if (this.f39112i.isEmpty()) {
                    this.f39112i = protoBuf$Expression.f39102i;
                    this.f39105b &= -65;
                } else {
                    if ((this.f39105b & 64) != 64) {
                        this.f39112i = new ArrayList(this.f39112i);
                        this.f39105b |= 64;
                    }
                    this.f39112i.addAll(protoBuf$Expression.f39102i);
                }
            }
            this.f39493a = this.f39493a.m15519f(protoBuf$Expression.f39094a);
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0022  */
        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* JADX INFO: renamed from: n */
        public final void m13820n(C6992c c6992c, C6993d c6993d) throws Throwable {
            ProtoBuf$Expression protoBuf$Expression;
            try {
                try {
                    ProtoBuf$Expression.f39092H.getClass();
                    m13819m(new ProtoBuf$Expression(c6992c, c6993d));
                } catch (InvalidProtocolBufferException e10) {
                    protoBuf$Expression = (ProtoBuf$Expression) e10.f39506a;
                    try {
                        throw e10;
                    } catch (Throwable th2) {
                        th = th2;
                        if (protoBuf$Expression != null) {
                            m13819m(protoBuf$Expression);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                protoBuf$Expression = null;
                if (protoBuf$Expression != null) {
                    m13819m(protoBuf$Expression);
                }
                throw th;
            }
        }
    }

    static {
        ProtoBuf$Expression protoBuf$Expression = new ProtoBuf$Expression();
        f39093l = protoBuf$Expression;
        protoBuf$Expression.f39096c = 0;
        protoBuf$Expression.f39097d = 0;
        protoBuf$Expression.f39098e = ConstantValue.TRUE;
        protoBuf$Expression.f39099f = ProtoBuf$Type.f39246O;
        protoBuf$Expression.f39100g = 0;
        protoBuf$Expression.f39101h = Collections.emptyList();
        protoBuf$Expression.f39102i = Collections.emptyList();
    }

    public ProtoBuf$Expression() {
        this.f39103j = (byte) -1;
        this.f39104k = -1;
        this.f39094a = AbstractC7803a.f42882a;
    }

    public ProtoBuf$Expression(GeneratedMessageLite.AbstractC6982b abstractC6982b) {
        super(0);
        this.f39103j = (byte) -1;
        this.f39104k = -1;
        this.f39094a = abstractC6982b.f39493a;
    }

    /* JADX WARN: Unreachable blocks removed: 3, instructions: 3 */
    public ProtoBuf$Expression(C6992c c6992c, C6993d c6993d) throws InvalidProtocolBufferException {
        ProtoBuf$Type.C6951b c6951bM13844C;
        this.f39103j = (byte) -1;
        this.f39104k = -1;
        boolean z10 = false;
        this.f39096c = 0;
        this.f39097d = 0;
        this.f39098e = ConstantValue.TRUE;
        this.f39099f = ProtoBuf$Type.f39246O;
        this.f39100g = 0;
        this.f39101h = Collections.emptyList();
        this.f39102i = Collections.emptyList();
        AbstractC7803a.b bVar = new AbstractC7803a.b();
        CodedOutputStream codedOutputStreamM13901j = CodedOutputStream.m13901j(bVar, 1);
        int i10 = 0;
        loop0: while (true) {
            while (true) {
                if (z10) {
                    break loop0;
                }
                try {
                    try {
                        try {
                            int iM13952n = c6992c.m13952n();
                            if (iM13952n != 0) {
                                if (iM13952n == 8) {
                                    this.f39095b |= 1;
                                    this.f39096c = c6992c.m13949k();
                                } else if (iM13952n == 16) {
                                    this.f39095b |= 2;
                                    this.f39097d = c6992c.m13949k();
                                } else if (iM13952n == 24) {
                                    int iM13949k = c6992c.m13949k();
                                    ConstantValue constantValueValueOf = ConstantValue.valueOf(iM13949k);
                                    if (constantValueValueOf == null) {
                                        codedOutputStreamM13901j.m13914v(iM13952n);
                                        codedOutputStreamM13901j.m13914v(iM13949k);
                                    } else {
                                        this.f39095b |= 4;
                                        this.f39098e = constantValueValueOf;
                                    }
                                } else if (iM13952n == 34) {
                                    if ((this.f39095b & 8) == 8) {
                                        ProtoBuf$Type protoBuf$Type = this.f39099f;
                                        protoBuf$Type.getClass();
                                        c6951bM13844C = ProtoBuf$Type.m13844C(protoBuf$Type);
                                    } else {
                                        c6951bM13844C = null;
                                    }
                                    ProtoBuf$Type protoBuf$Type2 = (ProtoBuf$Type) c6992c.m13945g(ProtoBuf$Type.f39247P, c6993d);
                                    this.f39099f = protoBuf$Type2;
                                    if (c6951bM13844C != null) {
                                        c6951bM13844C.m13852n(protoBuf$Type2);
                                        this.f39099f = c6951bM13844C.m13851m();
                                    }
                                    this.f39095b |= 8;
                                } else if (iM13952n != 40) {
                                    C6928a c6928a = f39092H;
                                    if (iM13952n == 50) {
                                        if ((i10 & 32) != 32) {
                                            this.f39101h = new ArrayList();
                                            i10 |= 32;
                                        }
                                        this.f39101h.add((ProtoBuf$Expression) c6992c.m13945g(c6928a, c6993d));
                                    } else if (iM13952n == 58) {
                                        if ((i10 & 64) != 64) {
                                            this.f39102i = new ArrayList();
                                            i10 |= 64;
                                        }
                                        this.f39102i.add((ProtoBuf$Expression) c6992c.m13945g(c6928a, c6993d));
                                    } else if (!c6992c.m13955q(iM13952n, codedOutputStreamM13901j)) {
                                    }
                                } else {
                                    this.f39095b |= 16;
                                    this.f39100g = c6992c.m13949k();
                                }
                            }
                            z10 = true;
                        } catch (InvalidProtocolBufferException e10) {
                            e10.f39506a = this;
                            throw e10;
                        }
                    } catch (IOException e11) {
                        InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e11.getMessage());
                        invalidProtocolBufferException.f39506a = this;
                        throw invalidProtocolBufferException;
                    }
                } catch (Throwable th2) {
                    if ((i10 & 32) == 32) {
                        this.f39101h = Collections.unmodifiableList(this.f39101h);
                    }
                    if ((i10 & 64) == 64) {
                        this.f39102i = Collections.unmodifiableList(this.f39102i);
                    }
                    try {
                        codedOutputStreamM13901j.m13902i();
                    } catch (IOException unused) {
                    } catch (Throwable th3) {
                        this.f39094a = bVar.m15533l();
                        throw th3;
                    }
                    this.f39094a = bVar.m15533l();
                    throw th2;
                }
            }
        }
        if ((i10 & 32) == 32) {
            this.f39101h = Collections.unmodifiableList(this.f39101h);
        }
        if ((i10 & 64) == 64) {
            this.f39102i = Collections.unmodifiableList(this.f39102i);
        }
        try {
            codedOutputStreamM13901j.m13902i();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f39094a = bVar.m15533l();
            throw th4;
        }
        this.f39094a = bVar.m15533l();
    }

    @Override // p282nn.InterfaceC7808f
    /* JADX INFO: renamed from: b */
    public final boolean mo13780b() {
        byte b10 = this.f39103j;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        if (((this.f39095b & 8) == 8) && !this.f39099f.mo13780b()) {
            this.f39103j = (byte) 0;
            return false;
        }
        for (int i10 = 0; i10 < this.f39101h.size(); i10++) {
            if (!this.f39101h.get(i10).mo13780b()) {
                this.f39103j = (byte) 0;
                return false;
            }
        }
        for (int i11 = 0; i11 < this.f39102i.size(); i11++) {
            if (!this.f39102i.get(i11).mo13780b()) {
                this.f39103j = (byte) 0;
                return false;
            }
        }
        this.f39103j = (byte) 1;
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC6997h
    /* JADX INFO: renamed from: c */
    public final InterfaceC6997h.a mo13781c() {
        C6929b c6929b = new C6929b();
        c6929b.m13819m(this);
        return c6929b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC6997h
    /* JADX INFO: renamed from: d */
    public final int mo13782d() {
        int i10 = this.f39104k;
        if (i10 != -1) {
            return i10;
        }
        int iM13894b = (this.f39095b & 1) == 1 ? CodedOutputStream.m13894b(1, this.f39096c) + 0 : 0;
        if ((this.f39095b & 2) == 2) {
            iM13894b += CodedOutputStream.m13894b(2, this.f39097d);
        }
        if ((this.f39095b & 4) == 4) {
            iM13894b += CodedOutputStream.m13893a(3, this.f39098e.getNumber());
        }
        if ((this.f39095b & 8) == 8) {
            iM13894b += CodedOutputStream.m13896d(4, this.f39099f);
        }
        if ((this.f39095b & 16) == 16) {
            iM13894b += CodedOutputStream.m13894b(5, this.f39100g);
        }
        for (int i11 = 0; i11 < this.f39101h.size(); i11++) {
            iM13894b += CodedOutputStream.m13896d(6, this.f39101h.get(i11));
        }
        for (int i12 = 0; i12 < this.f39102i.size(); i12++) {
            iM13894b += CodedOutputStream.m13896d(7, this.f39102i.get(i12));
        }
        int size = this.f39094a.size() + iM13894b;
        this.f39104k = size;
        return size;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC6997h
    /* JADX INFO: renamed from: e */
    public final InterfaceC6997h.a mo13783e() {
        return new C6929b();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC6997h
    /* JADX INFO: renamed from: j */
    public final void mo13784j(CodedOutputStream codedOutputStream) throws IOException {
        mo13782d();
        if ((this.f39095b & 1) == 1) {
            codedOutputStream.m13905m(1, this.f39096c);
        }
        if ((this.f39095b & 2) == 2) {
            codedOutputStream.m13905m(2, this.f39097d);
        }
        if ((this.f39095b & 4) == 4) {
            codedOutputStream.m13904l(3, this.f39098e.getNumber());
        }
        if ((this.f39095b & 8) == 8) {
            codedOutputStream.m13907o(4, this.f39099f);
        }
        if ((this.f39095b & 16) == 16) {
            codedOutputStream.m13905m(5, this.f39100g);
        }
        for (int i10 = 0; i10 < this.f39101h.size(); i10++) {
            codedOutputStream.m13907o(6, this.f39101h.get(i10));
        }
        for (int i11 = 0; i11 < this.f39102i.size(); i11++) {
            codedOutputStream.m13907o(7, this.f39102i.get(i11));
        }
        codedOutputStream.m13910r(this.f39094a);
    }
}
