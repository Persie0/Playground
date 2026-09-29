package kotlin.reflect.jvm.internal.impl.metadata;

import java.io.IOException;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC6990a;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC6991b;
import kotlin.reflect.jvm.internal.impl.protobuf.C6992c;
import kotlin.reflect.jvm.internal.impl.protobuf.C6993d;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC6997h;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;
import p282nn.AbstractC7803a;

/* JADX INFO: loaded from: classes2.dex */
public final class ProtoBuf$ValueParameter extends GeneratedMessageLite.ExtendableMessage<ProtoBuf$ValueParameter> {

    /* JADX INFO: renamed from: H */
    public static final C6959a f39352H = new C6959a();

    /* JADX INFO: renamed from: l */
    public static final ProtoBuf$ValueParameter f39353l;

    /* JADX INFO: renamed from: b */
    public final AbstractC7803a f39354b;

    /* JADX INFO: renamed from: c */
    public int f39355c;

    /* JADX INFO: renamed from: d */
    public int f39356d;

    /* JADX INFO: renamed from: e */
    public int f39357e;

    /* JADX INFO: renamed from: f */
    public ProtoBuf$Type f39358f;

    /* JADX INFO: renamed from: g */
    public int f39359g;

    /* JADX INFO: renamed from: h */
    public ProtoBuf$Type f39360h;

    /* JADX INFO: renamed from: i */
    public int f39361i;

    /* JADX INFO: renamed from: j */
    public byte f39362j;

    /* JADX INFO: renamed from: k */
    public int f39363k;

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$ValueParameter$a */
    public static class C6959a extends AbstractC6991b<ProtoBuf$ValueParameter> {
        @Override // p282nn.InterfaceC7809g
        /* JADX INFO: renamed from: a */
        public final Object mo13787a(C6992c c6992c, C6993d c6993d) throws InvalidProtocolBufferException {
            return new ProtoBuf$ValueParameter(c6992c, c6993d);
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$ValueParameter$b */
    public static final class C6960b extends GeneratedMessageLite.AbstractC6983c<ProtoBuf$ValueParameter, C6960b> {

        /* JADX INFO: renamed from: d */
        public int f39364d;

        /* JADX INFO: renamed from: e */
        public int f39365e;

        /* JADX INFO: renamed from: f */
        public int f39366f;

        /* JADX INFO: renamed from: g */
        public ProtoBuf$Type f39367g;

        /* JADX INFO: renamed from: h */
        public int f39368h;

        /* JADX INFO: renamed from: i */
        public ProtoBuf$Type f39369i;

        /* JADX INFO: renamed from: j */
        public int f39370j;

        public C6960b() {
            ProtoBuf$Type protoBuf$Type = ProtoBuf$Type.f39246O;
            this.f39367g = protoBuf$Type;
            this.f39369i = protoBuf$Type;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC6990a.a, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC6997h.a
        /* JADX INFO: renamed from: Q */
        public final /* bridge */ /* synthetic */ InterfaceC6997h.a mo13788Q(C6992c c6992c, C6993d c6993d) throws Throwable {
            m13868o(c6992c, c6993d);
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC6997h.a
        /* JADX INFO: renamed from: a */
        public final InterfaceC6997h mo13789a() {
            ProtoBuf$ValueParameter protoBuf$ValueParameterM13866m = m13866m();
            if (protoBuf$ValueParameterM13866m.mo13780b()) {
                return protoBuf$ValueParameterM13866m;
            }
            throw new UninitializedMessageException();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.AbstractC6982b
        public final Object clone() throws CloneNotSupportedException {
            C6960b c6960b = new C6960b();
            c6960b.m13867n(m13866m());
            return c6960b;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC6990a.a
        /* JADX INFO: renamed from: f */
        public final /* bridge */ /* synthetic */ AbstractC6990a.a mo13788Q(C6992c c6992c, C6993d c6993d) throws Throwable {
            m13868o(c6992c, c6993d);
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.AbstractC6982b
        /* JADX INFO: renamed from: g */
        public final GeneratedMessageLite.AbstractC6982b clone() {
            C6960b c6960b = new C6960b();
            c6960b.m13867n(m13866m());
            return c6960b;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.AbstractC6982b
        /* JADX INFO: renamed from: i */
        public final /* bridge */ /* synthetic */ GeneratedMessageLite.AbstractC6982b mo13792i(GeneratedMessageLite generatedMessageLite) {
            m13867n((ProtoBuf$ValueParameter) generatedMessageLite);
            return this;
        }

        /* JADX INFO: renamed from: m */
        public final ProtoBuf$ValueParameter m13866m() {
            ProtoBuf$ValueParameter protoBuf$ValueParameter = new ProtoBuf$ValueParameter(this);
            int i10 = this.f39364d;
            int i11 = 1;
            if ((i10 & 1) != 1) {
                i11 = 0;
            }
            protoBuf$ValueParameter.f39356d = this.f39365e;
            if ((i10 & 2) == 2) {
                i11 |= 2;
            }
            protoBuf$ValueParameter.f39357e = this.f39366f;
            if ((i10 & 4) == 4) {
                i11 |= 4;
            }
            protoBuf$ValueParameter.f39358f = this.f39367g;
            if ((i10 & 8) == 8) {
                i11 |= 8;
            }
            protoBuf$ValueParameter.f39359g = this.f39368h;
            if ((i10 & 16) == 16) {
                i11 |= 16;
            }
            protoBuf$ValueParameter.f39360h = this.f39369i;
            if ((i10 & 32) == 32) {
                i11 |= 32;
            }
            protoBuf$ValueParameter.f39361i = this.f39370j;
            protoBuf$ValueParameter.f39355c = i11;
            return protoBuf$ValueParameter;
        }

        /* JADX INFO: renamed from: n */
        public final void m13867n(ProtoBuf$ValueParameter protoBuf$ValueParameter) {
            ProtoBuf$Type protoBuf$Type;
            ProtoBuf$Type protoBuf$Type2;
            if (protoBuf$ValueParameter == ProtoBuf$ValueParameter.f39353l) {
                return;
            }
            int i10 = protoBuf$ValueParameter.f39355c;
            if ((i10 & 1) == 1) {
                int i11 = protoBuf$ValueParameter.f39356d;
                this.f39364d |= 1;
                this.f39365e = i11;
            }
            if ((i10 & 2) == 2) {
                int i12 = protoBuf$ValueParameter.f39357e;
                this.f39364d = 2 | this.f39364d;
                this.f39366f = i12;
            }
            if ((i10 & 4) == 4) {
                ProtoBuf$Type protoBuf$Type3 = protoBuf$ValueParameter.f39358f;
                if ((this.f39364d & 4) != 4 || (protoBuf$Type2 = this.f39367g) == ProtoBuf$Type.f39246O) {
                    this.f39367g = protoBuf$Type3;
                } else {
                    ProtoBuf$Type.C6951b c6951bM13844C = ProtoBuf$Type.m13844C(protoBuf$Type2);
                    c6951bM13844C.m13852n(protoBuf$Type3);
                    this.f39367g = c6951bM13844C.m13851m();
                }
                this.f39364d |= 4;
            }
            int i13 = protoBuf$ValueParameter.f39355c;
            if ((i13 & 8) == 8) {
                int i14 = protoBuf$ValueParameter.f39359g;
                this.f39364d = 8 | this.f39364d;
                this.f39368h = i14;
            }
            if ((i13 & 16) == 16) {
                ProtoBuf$Type protoBuf$Type4 = protoBuf$ValueParameter.f39360h;
                if ((this.f39364d & 16) != 16 || (protoBuf$Type = this.f39369i) == ProtoBuf$Type.f39246O) {
                    this.f39369i = protoBuf$Type4;
                } else {
                    ProtoBuf$Type.C6951b c6951bM13844C2 = ProtoBuf$Type.m13844C(protoBuf$Type);
                    c6951bM13844C2.m13852n(protoBuf$Type4);
                    this.f39369i = c6951bM13844C2.m13851m();
                }
                this.f39364d |= 16;
            }
            if ((protoBuf$ValueParameter.f39355c & 32) == 32) {
                int i15 = protoBuf$ValueParameter.f39361i;
                this.f39364d = 32 | this.f39364d;
                this.f39370j = i15;
            }
            m13928k(protoBuf$ValueParameter);
            this.f39493a = this.f39493a.m15519f(protoBuf$ValueParameter.f39354b);
        }

        /* JADX WARN: Code duplicated, block: B:15:0x0020  */
        /* JADX INFO: renamed from: o */
        public final void m13868o(C6992c c6992c, C6993d c6993d) throws Throwable {
            ProtoBuf$ValueParameter protoBuf$ValueParameter;
            try {
                try {
                    ProtoBuf$ValueParameter.f39352H.getClass();
                    m13867n(new ProtoBuf$ValueParameter(c6992c, c6993d));
                } catch (InvalidProtocolBufferException e10) {
                    protoBuf$ValueParameter = (ProtoBuf$ValueParameter) e10.f39506a;
                    try {
                        throw e10;
                    } catch (Throwable th2) {
                        th = th2;
                        if (protoBuf$ValueParameter != null) {
                            m13867n(protoBuf$ValueParameter);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                protoBuf$ValueParameter = null;
                if (protoBuf$ValueParameter != null) {
                    m13867n(protoBuf$ValueParameter);
                }
                throw th;
            }
        }
    }

    static {
        ProtoBuf$ValueParameter protoBuf$ValueParameter = new ProtoBuf$ValueParameter(0);
        f39353l = protoBuf$ValueParameter;
        protoBuf$ValueParameter.f39356d = 0;
        protoBuf$ValueParameter.f39357e = 0;
        ProtoBuf$Type protoBuf$Type = ProtoBuf$Type.f39246O;
        protoBuf$ValueParameter.f39358f = protoBuf$Type;
        protoBuf$ValueParameter.f39359g = 0;
        protoBuf$ValueParameter.f39360h = protoBuf$Type;
        protoBuf$ValueParameter.f39361i = 0;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public ProtoBuf$ValueParameter() {
        throw null;
    }

    public ProtoBuf$ValueParameter(int i10) {
        this.f39362j = (byte) -1;
        this.f39363k = -1;
        this.f39354b = AbstractC7803a.f42882a;
    }

    public ProtoBuf$ValueParameter(GeneratedMessageLite.AbstractC6983c abstractC6983c) {
        super(abstractC6983c);
        this.f39362j = (byte) -1;
        this.f39363k = -1;
        this.f39354b = abstractC6983c.f39493a;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public ProtoBuf$ValueParameter(C6992c c6992c, C6993d c6993d) throws InvalidProtocolBufferException {
        this.f39362j = (byte) -1;
        this.f39363k = -1;
        boolean z10 = false;
        this.f39356d = 0;
        this.f39357e = 0;
        ProtoBuf$Type protoBuf$Type = ProtoBuf$Type.f39246O;
        this.f39358f = protoBuf$Type;
        this.f39359g = 0;
        this.f39360h = protoBuf$Type;
        this.f39361i = 0;
        AbstractC7803a.b bVar = new AbstractC7803a.b();
        CodedOutputStream codedOutputStreamM13901j = CodedOutputStream.m13901j(bVar, 1);
        loop0: while (true) {
            while (true) {
                if (z10) {
                    try {
                        break loop0;
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.f39354b = bVar.m15533l();
                        throw th2;
                    }
                } else {
                    try {
                        try {
                            try {
                                int iM13952n = c6992c.m13952n();
                                if (iM13952n != 0) {
                                    if (iM13952n == 8) {
                                        this.f39355c |= 1;
                                        this.f39356d = c6992c.m13949k();
                                    } else if (iM13952n != 16) {
                                        ProtoBuf$Type.C6951b c6951bM13844C = null;
                                        if (iM13952n == 26) {
                                            if ((this.f39355c & 4) == 4) {
                                                ProtoBuf$Type protoBuf$Type2 = this.f39358f;
                                                protoBuf$Type2.getClass();
                                                c6951bM13844C = ProtoBuf$Type.m13844C(protoBuf$Type2);
                                            }
                                            ProtoBuf$Type protoBuf$Type3 = (ProtoBuf$Type) c6992c.m13945g(ProtoBuf$Type.f39247P, c6993d);
                                            this.f39358f = protoBuf$Type3;
                                            if (c6951bM13844C != null) {
                                                c6951bM13844C.m13852n(protoBuf$Type3);
                                                this.f39358f = c6951bM13844C.m13851m();
                                            }
                                            this.f39355c |= 4;
                                        } else if (iM13952n == 34) {
                                            if ((this.f39355c & 16) == 16) {
                                                ProtoBuf$Type protoBuf$Type4 = this.f39360h;
                                                protoBuf$Type4.getClass();
                                                c6951bM13844C = ProtoBuf$Type.m13844C(protoBuf$Type4);
                                            }
                                            ProtoBuf$Type protoBuf$Type5 = (ProtoBuf$Type) c6992c.m13945g(ProtoBuf$Type.f39247P, c6993d);
                                            this.f39360h = protoBuf$Type5;
                                            if (c6951bM13844C != null) {
                                                c6951bM13844C.m13852n(protoBuf$Type5);
                                                this.f39360h = c6951bM13844C.m13851m();
                                            }
                                            this.f39355c |= 16;
                                        } else if (iM13952n == 40) {
                                            this.f39355c |= 8;
                                            this.f39359g = c6992c.m13949k();
                                        } else if (iM13952n == 48) {
                                            this.f39355c |= 32;
                                            this.f39361i = c6992c.m13949k();
                                        } else if (!m13925x(c6992c, codedOutputStreamM13901j, c6993d, iM13952n)) {
                                        }
                                    } else {
                                        this.f39355c |= 2;
                                        this.f39357e = c6992c.m13949k();
                                    }
                                }
                                z10 = true;
                            } catch (IOException e10) {
                                InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e10.getMessage());
                                invalidProtocolBufferException.f39506a = this;
                                throw invalidProtocolBufferException;
                            }
                        } catch (InvalidProtocolBufferException e11) {
                            e11.f39506a = this;
                            throw e11;
                        }
                    } catch (Throwable th3) {
                        try {
                            codedOutputStreamM13901j.m13902i();
                        } catch (IOException unused2) {
                        } catch (Throwable th4) {
                            this.f39354b = bVar.m15533l();
                            throw th4;
                        }
                        this.f39354b = bVar.m15533l();
                        m13923t();
                        throw th3;
                    }
                }
            }
        }
        codedOutputStreamM13901j.m13902i();
        this.f39354b = bVar.m15533l();
        m13923t();
    }

    @Override // p282nn.InterfaceC7808f
    /* JADX INFO: renamed from: b */
    public final boolean mo13780b() {
        byte b10 = this.f39362j;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        int i10 = this.f39355c;
        if (!((i10 & 2) == 2)) {
            this.f39362j = (byte) 0;
            return false;
        }
        if (((i10 & 4) == 4) && !this.f39358f.mo13780b()) {
            this.f39362j = (byte) 0;
            return false;
        }
        if (((this.f39355c & 16) == 16) && !this.f39360h.mo13780b()) {
            this.f39362j = (byte) 0;
            return false;
        }
        if (m13919n()) {
            this.f39362j = (byte) 1;
            return true;
        }
        this.f39362j = (byte) 0;
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC6997h
    /* JADX INFO: renamed from: c */
    public final InterfaceC6997h.a mo13781c() {
        C6960b c6960b = new C6960b();
        c6960b.m13867n(this);
        return c6960b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC6997h
    /* JADX INFO: renamed from: d */
    public final int mo13782d() {
        int i10 = this.f39363k;
        if (i10 != -1) {
            return i10;
        }
        int iM13894b = (this.f39355c & 1) == 1 ? 0 + CodedOutputStream.m13894b(1, this.f39356d) : 0;
        if ((this.f39355c & 2) == 2) {
            iM13894b += CodedOutputStream.m13894b(2, this.f39357e);
        }
        if ((this.f39355c & 4) == 4) {
            iM13894b += CodedOutputStream.m13896d(3, this.f39358f);
        }
        if ((this.f39355c & 16) == 16) {
            iM13894b += CodedOutputStream.m13896d(4, this.f39360h);
        }
        if ((this.f39355c & 8) == 8) {
            iM13894b += CodedOutputStream.m13894b(5, this.f39359g);
        }
        if ((this.f39355c & 32) == 32) {
            iM13894b += CodedOutputStream.m13894b(6, this.f39361i);
        }
        int size = this.f39354b.size() + m13920q() + iM13894b;
        this.f39363k = size;
        return size;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC6997h
    /* JADX INFO: renamed from: e */
    public final InterfaceC6997h.a mo13783e() {
        return new C6960b();
    }

    @Override // p282nn.InterfaceC7808f
    /* JADX INFO: renamed from: h */
    public final InterfaceC6997h mo13802h() {
        return f39353l;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC6997h
    /* JADX INFO: renamed from: j */
    public final void mo13784j(CodedOutputStream codedOutputStream) throws IOException {
        mo13782d();
        GeneratedMessageLite.ExtendableMessage.C6980a c6980a = new GeneratedMessageLite.ExtendableMessage.C6980a(this);
        if ((this.f39355c & 1) == 1) {
            codedOutputStream.m13905m(1, this.f39356d);
        }
        if ((this.f39355c & 2) == 2) {
            codedOutputStream.m13905m(2, this.f39357e);
        }
        if ((this.f39355c & 4) == 4) {
            codedOutputStream.m13907o(3, this.f39358f);
        }
        if ((this.f39355c & 16) == 16) {
            codedOutputStream.m13907o(4, this.f39360h);
        }
        if ((this.f39355c & 8) == 8) {
            codedOutputStream.m13905m(5, this.f39359g);
        }
        if ((this.f39355c & 32) == 32) {
            codedOutputStream.m13905m(6, this.f39361i);
        }
        c6980a.m13927a(200, codedOutputStream);
        codedOutputStream.m13910r(this.f39354b);
    }
}
