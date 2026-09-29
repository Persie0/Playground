package kotlin.reflect.jvm.internal.impl.metadata;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
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
import p282nn.InterfaceC7808f;

/* JADX INFO: loaded from: classes2.dex */
public final class ProtoBuf$Contract extends GeneratedMessageLite implements InterfaceC7808f {

    /* JADX INFO: renamed from: e */
    public static final ProtoBuf$Contract f39060e;

    /* JADX INFO: renamed from: f */
    public static final C6919a f39061f = new C6919a();

    /* JADX INFO: renamed from: a */
    public final AbstractC7803a f39062a;

    /* JADX INFO: renamed from: b */
    public List<ProtoBuf$Effect> f39063b;

    /* JADX INFO: renamed from: c */
    public byte f39064c;

    /* JADX INFO: renamed from: d */
    public int f39065d;

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Contract$a */
    public static class C6919a extends AbstractC6991b<ProtoBuf$Contract> {
        @Override // p282nn.InterfaceC7809g
        /* JADX INFO: renamed from: a */
        public final Object mo13787a(C6992c c6992c, C6993d c6993d) throws InvalidProtocolBufferException {
            return new ProtoBuf$Contract(c6992c, c6993d);
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Contract$b */
    public static final class C6920b extends GeneratedMessageLite.AbstractC6982b<ProtoBuf$Contract, C6920b> implements InterfaceC7808f {

        /* JADX INFO: renamed from: b */
        public int f39066b;

        /* JADX INFO: renamed from: c */
        public List<ProtoBuf$Effect> f39067c = Collections.emptyList();

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC6990a.a, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC6997h.a
        /* JADX INFO: renamed from: Q */
        public final /* bridge */ /* synthetic */ InterfaceC6997h.a mo13788Q(C6992c c6992c, C6993d c6993d) throws Throwable {
            m13812n(c6992c, c6993d);
            return this;
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC6997h.a
        /* JADX INFO: renamed from: a */
        public final InterfaceC6997h mo13789a() {
            ProtoBuf$Contract protoBuf$ContractM13810k = m13810k();
            if (protoBuf$ContractM13810k.mo13780b()) {
                return protoBuf$ContractM13810k;
            }
            throw new UninitializedMessageException();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.AbstractC6982b
        public final Object clone() throws CloneNotSupportedException {
            C6920b c6920b = new C6920b();
            c6920b.m13811m(m13810k());
            return c6920b;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC6990a.a
        /* JADX INFO: renamed from: f */
        public final /* bridge */ /* synthetic */ AbstractC6990a.a mo13788Q(C6992c c6992c, C6993d c6993d) throws Throwable {
            m13812n(c6992c, c6993d);
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.AbstractC6982b
        /* JADX INFO: renamed from: g */
        public final GeneratedMessageLite.AbstractC6982b clone() {
            C6920b c6920b = new C6920b();
            c6920b.m13811m(m13810k());
            return c6920b;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.AbstractC6982b
        /* JADX INFO: renamed from: i */
        public final /* bridge */ /* synthetic */ GeneratedMessageLite.AbstractC6982b mo13792i(GeneratedMessageLite generatedMessageLite) {
            m13811m((ProtoBuf$Contract) generatedMessageLite);
            return this;
        }

        /* JADX INFO: renamed from: k */
        public final ProtoBuf$Contract m13810k() {
            ProtoBuf$Contract protoBuf$Contract = new ProtoBuf$Contract(this);
            if ((this.f39066b & 1) == 1) {
                this.f39067c = Collections.unmodifiableList(this.f39067c);
                this.f39066b &= -2;
            }
            protoBuf$Contract.f39063b = this.f39067c;
            return protoBuf$Contract;
        }

        /* JADX INFO: renamed from: m */
        public final void m13811m(ProtoBuf$Contract protoBuf$Contract) {
            if (protoBuf$Contract == ProtoBuf$Contract.f39060e) {
                return;
            }
            if (!protoBuf$Contract.f39063b.isEmpty()) {
                if (this.f39067c.isEmpty()) {
                    this.f39067c = protoBuf$Contract.f39063b;
                    this.f39066b &= -2;
                } else {
                    if ((this.f39066b & 1) != 1) {
                        this.f39067c = new ArrayList(this.f39067c);
                        this.f39066b |= 1;
                    }
                    this.f39067c.addAll(protoBuf$Contract.f39063b);
                }
            }
            this.f39493a = this.f39493a.m15519f(protoBuf$Contract.f39062a);
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0021  */
        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* JADX INFO: renamed from: n */
        public final void m13812n(C6992c c6992c, C6993d c6993d) throws Throwable {
            ProtoBuf$Contract protoBuf$Contract;
            try {
                try {
                    ProtoBuf$Contract.f39061f.getClass();
                    m13811m(new ProtoBuf$Contract(c6992c, c6993d));
                } catch (InvalidProtocolBufferException e10) {
                    protoBuf$Contract = (ProtoBuf$Contract) e10.f39506a;
                    try {
                        throw e10;
                    } catch (Throwable th2) {
                        th = th2;
                        if (protoBuf$Contract != null) {
                            m13811m(protoBuf$Contract);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                protoBuf$Contract = null;
                if (protoBuf$Contract != null) {
                    m13811m(protoBuf$Contract);
                }
                throw th;
            }
        }
    }

    static {
        ProtoBuf$Contract protoBuf$Contract = new ProtoBuf$Contract();
        f39060e = protoBuf$Contract;
        protoBuf$Contract.f39063b = Collections.emptyList();
    }

    public ProtoBuf$Contract() {
        this.f39064c = (byte) -1;
        this.f39065d = -1;
        this.f39062a = AbstractC7803a.f42882a;
    }

    public ProtoBuf$Contract(GeneratedMessageLite.AbstractC6982b abstractC6982b) {
        super(0);
        this.f39064c = (byte) -1;
        this.f39065d = -1;
        this.f39062a = abstractC6982b.f39493a;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public ProtoBuf$Contract(C6992c c6992c, C6993d c6993d) throws InvalidProtocolBufferException {
        this.f39064c = (byte) -1;
        this.f39065d = -1;
        this.f39063b = Collections.emptyList();
        AbstractC7803a.b bVar = new AbstractC7803a.b();
        CodedOutputStream codedOutputStreamM13901j = CodedOutputStream.m13901j(bVar, 1);
        boolean z10 = false;
        boolean z11 = false;
        loop0: while (true) {
            while (true) {
                if (z10) {
                    break loop0;
                }
                try {
                    try {
                        int iM13952n = c6992c.m13952n();
                        if (iM13952n != 0) {
                            if (iM13952n == 10) {
                                if (!(z11 & true)) {
                                    this.f39063b = new ArrayList();
                                    z11 |= true;
                                }
                                this.f39063b.add((ProtoBuf$Effect) c6992c.m13945g(ProtoBuf$Effect.f39069j, c6993d));
                            } else if (!c6992c.m13955q(iM13952n, codedOutputStreamM13901j)) {
                            }
                        }
                        z10 = true;
                    } catch (Throwable th2) {
                        if (z11 & true) {
                            this.f39063b = Collections.unmodifiableList(this.f39063b);
                        }
                        try {
                            codedOutputStreamM13901j.m13902i();
                        } catch (IOException unused) {
                        } finally {
                            this.f39062a = bVar.m15533l();
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
        }
        if (z11 & true) {
            this.f39063b = Collections.unmodifiableList(this.f39063b);
        }
        try {
            codedOutputStreamM13901j.m13902i();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f39062a = bVar.m15533l();
            throw th3;
        }
        this.f39062a = bVar.m15533l();
    }

    @Override // p282nn.InterfaceC7808f
    /* JADX INFO: renamed from: b */
    public final boolean mo13780b() {
        byte b10 = this.f39064c;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        for (int i10 = 0; i10 < this.f39063b.size(); i10++) {
            if (!this.f39063b.get(i10).mo13780b()) {
                this.f39064c = (byte) 0;
                return false;
            }
        }
        this.f39064c = (byte) 1;
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC6997h
    /* JADX INFO: renamed from: c */
    public final InterfaceC6997h.a mo13781c() {
        C6920b c6920b = new C6920b();
        c6920b.m13811m(this);
        return c6920b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC6997h
    /* JADX INFO: renamed from: d */
    public final int mo13782d() {
        int i10 = this.f39065d;
        if (i10 != -1) {
            return i10;
        }
        int iM13896d = 0;
        for (int i11 = 0; i11 < this.f39063b.size(); i11++) {
            iM13896d += CodedOutputStream.m13896d(1, this.f39063b.get(i11));
        }
        int size = this.f39062a.size() + iM13896d;
        this.f39065d = size;
        return size;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC6997h
    /* JADX INFO: renamed from: e */
    public final InterfaceC6997h.a mo13783e() {
        return new C6920b();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC6997h
    /* JADX INFO: renamed from: j */
    public final void mo13784j(CodedOutputStream codedOutputStream) throws IOException {
        mo13782d();
        for (int i10 = 0; i10 < this.f39063b.size(); i10++) {
            codedOutputStream.m13907o(1, this.f39063b.get(i10));
        }
        codedOutputStream.m13910r(this.f39062a);
    }
}
