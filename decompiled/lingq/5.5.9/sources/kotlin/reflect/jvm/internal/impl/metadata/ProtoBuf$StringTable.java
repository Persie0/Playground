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
import p282nn.C7805c;
import p282nn.C7807e;
import p282nn.InterfaceC7806d;
import p282nn.InterfaceC7808f;

/* JADX INFO: loaded from: classes2.dex */
public final class ProtoBuf$StringTable extends GeneratedMessageLite implements InterfaceC7808f {

    /* JADX INFO: renamed from: e */
    public static final ProtoBuf$StringTable f39238e;

    /* JADX INFO: renamed from: f */
    public static final C6945a f39239f = new C6945a();

    /* JADX INFO: renamed from: a */
    public final AbstractC7803a f39240a;

    /* JADX INFO: renamed from: b */
    public InterfaceC7806d f39241b;

    /* JADX INFO: renamed from: c */
    public byte f39242c;

    /* JADX INFO: renamed from: d */
    public int f39243d;

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$StringTable$a */
    public static class C6945a extends AbstractC6991b<ProtoBuf$StringTable> {
        @Override // p282nn.InterfaceC7809g
        /* JADX INFO: renamed from: a */
        public final Object mo13787a(C6992c c6992c, C6993d c6993d) throws InvalidProtocolBufferException {
            return new ProtoBuf$StringTable(c6992c);
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$StringTable$b */
    public static final class C6946b extends GeneratedMessageLite.AbstractC6982b<ProtoBuf$StringTable, C6946b> implements InterfaceC7808f {

        /* JADX INFO: renamed from: b */
        public int f39244b;

        /* JADX INFO: renamed from: c */
        public InterfaceC7806d f39245c = C7805c.f42891b;

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC6990a.a, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC6997h.a
        /* JADX INFO: renamed from: Q */
        public final /* bridge */ /* synthetic */ InterfaceC6997h.a mo13788Q(C6992c c6992c, C6993d c6993d) throws Throwable {
            m13843n(c6992c, c6993d);
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC6997h.a
        /* JADX INFO: renamed from: a */
        public final InterfaceC6997h mo13789a() {
            ProtoBuf$StringTable protoBuf$StringTableM13841k = m13841k();
            if (protoBuf$StringTableM13841k.mo13780b()) {
                return protoBuf$StringTableM13841k;
            }
            throw new UninitializedMessageException();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.AbstractC6982b
        public final Object clone() throws CloneNotSupportedException {
            C6946b c6946b = new C6946b();
            c6946b.m13842m(m13841k());
            return c6946b;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC6990a.a
        /* JADX INFO: renamed from: f */
        public final /* bridge */ /* synthetic */ AbstractC6990a.a mo13788Q(C6992c c6992c, C6993d c6993d) throws Throwable {
            m13843n(c6992c, c6993d);
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.AbstractC6982b
        /* JADX INFO: renamed from: g */
        public final GeneratedMessageLite.AbstractC6982b clone() {
            C6946b c6946b = new C6946b();
            c6946b.m13842m(m13841k());
            return c6946b;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.AbstractC6982b
        /* JADX INFO: renamed from: i */
        public final /* bridge */ /* synthetic */ GeneratedMessageLite.AbstractC6982b mo13792i(GeneratedMessageLite generatedMessageLite) {
            m13842m((ProtoBuf$StringTable) generatedMessageLite);
            return this;
        }

        /* JADX INFO: renamed from: k */
        public final ProtoBuf$StringTable m13841k() {
            ProtoBuf$StringTable protoBuf$StringTable = new ProtoBuf$StringTable(this);
            if ((this.f39244b & 1) == 1) {
                this.f39245c = this.f39245c.mo15537n();
                this.f39244b &= -2;
            }
            protoBuf$StringTable.f39241b = this.f39245c;
            return protoBuf$StringTable;
        }

        /* JADX INFO: renamed from: m */
        public final void m13842m(ProtoBuf$StringTable protoBuf$StringTable) {
            if (protoBuf$StringTable == ProtoBuf$StringTable.f39238e) {
                return;
            }
            if (!protoBuf$StringTable.f39241b.isEmpty()) {
                if (this.f39245c.isEmpty()) {
                    this.f39245c = protoBuf$StringTable.f39241b;
                    this.f39244b &= -2;
                } else {
                    if ((this.f39244b & 1) != 1) {
                        this.f39245c = new C7805c(this.f39245c);
                        this.f39244b |= 1;
                    }
                    this.f39245c.addAll(protoBuf$StringTable.f39241b);
                }
            }
            this.f39493a = this.f39493a.m15519f(protoBuf$StringTable.f39240a);
        }

        /* JADX WARN: Code duplicated, block: B:15:0x0021  */
        /* JADX INFO: renamed from: n */
        public final void m13843n(C6992c c6992c, C6993d c6993d) throws Throwable {
            ProtoBuf$StringTable protoBuf$StringTable;
            try {
                try {
                    ProtoBuf$StringTable.f39239f.getClass();
                    m13842m(new ProtoBuf$StringTable(c6992c));
                } catch (InvalidProtocolBufferException e10) {
                    protoBuf$StringTable = (ProtoBuf$StringTable) e10.f39506a;
                    try {
                        throw e10;
                    } catch (Throwable th2) {
                        th = th2;
                        if (protoBuf$StringTable != null) {
                            m13842m(protoBuf$StringTable);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                protoBuf$StringTable = null;
                if (protoBuf$StringTable != null) {
                    m13842m(protoBuf$StringTable);
                }
                throw th;
            }
        }
    }

    static {
        ProtoBuf$StringTable protoBuf$StringTable = new ProtoBuf$StringTable();
        f39238e = protoBuf$StringTable;
        protoBuf$StringTable.f39241b = C7805c.f42891b;
    }

    public ProtoBuf$StringTable() {
        this.f39242c = (byte) -1;
        this.f39243d = -1;
        this.f39240a = AbstractC7803a.f42882a;
    }

    public ProtoBuf$StringTable(GeneratedMessageLite.AbstractC6982b abstractC6982b) {
        super(0);
        this.f39242c = (byte) -1;
        this.f39243d = -1;
        this.f39240a = abstractC6982b.f39493a;
    }

    /* JADX WARN: Unreachable blocks removed: 3, instructions: 3 */
    public ProtoBuf$StringTable(C6992c c6992c) throws InvalidProtocolBufferException {
        this.f39242c = (byte) -1;
        this.f39243d = -1;
        this.f39241b = C7805c.f42891b;
        AbstractC7803a.b bVar = new AbstractC7803a.b();
        CodedOutputStream codedOutputStreamM13901j = CodedOutputStream.m13901j(bVar, 1);
        boolean z10 = false;
        boolean z11 = false;
        while (!z10) {
            try {
                try {
                    int iM13952n = c6992c.m13952n();
                    if (iM13952n != 0) {
                        if (iM13952n == 10) {
                            C7807e c7807eM13943e = c6992c.m13943e();
                            if (!(z11 & true)) {
                                this.f39241b = new C7805c();
                                z11 |= true;
                            }
                            this.f39241b.mo15534R(c7807eM13943e);
                        } else if (!c6992c.m13955q(iM13952n, codedOutputStreamM13901j)) {
                        }
                    }
                    z10 = true;
                } catch (Throwable th2) {
                    if (z11 & true) {
                        this.f39241b = this.f39241b.mo15537n();
                    }
                    try {
                        codedOutputStreamM13901j.m13902i();
                    } catch (IOException unused) {
                    } finally {
                        this.f39240a = bVar.m15533l();
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
        if (z11 & true) {
            this.f39241b = this.f39241b.mo15537n();
        }
        try {
            codedOutputStreamM13901j.m13902i();
        } catch (IOException unused2) {
        } finally {
            this.f39240a = bVar.m15533l();
        }
    }

    @Override // p282nn.InterfaceC7808f
    /* JADX INFO: renamed from: b */
    public final boolean mo13780b() {
        byte b10 = this.f39242c;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        this.f39242c = (byte) 1;
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC6997h
    /* JADX INFO: renamed from: c */
    public final InterfaceC6997h.a mo13781c() {
        C6946b c6946b = new C6946b();
        c6946b.m13842m(this);
        return c6946b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC6997h
    /* JADX INFO: renamed from: d */
    public final int mo13782d() {
        int i10 = this.f39243d;
        if (i10 != -1) {
            return i10;
        }
        int size = 0;
        for (int i11 = 0; i11 < this.f39241b.size(); i11++) {
            AbstractC7803a abstractC7803aMo15535c0 = this.f39241b.mo15535c0(i11);
            size += abstractC7803aMo15535c0.size() + CodedOutputStream.m13898f(abstractC7803aMo15535c0.size());
        }
        int size2 = this.f39240a.size() + (this.f39241b.size() * 1) + 0 + size;
        this.f39243d = size2;
        return size2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC6997h
    /* JADX INFO: renamed from: e */
    public final InterfaceC6997h.a mo13783e() {
        return new C6946b();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC6997h
    /* JADX INFO: renamed from: j */
    public final void mo13784j(CodedOutputStream codedOutputStream) throws IOException {
        mo13782d();
        for (int i10 = 0; i10 < this.f39241b.size(); i10++) {
            AbstractC7803a abstractC7803aMo15535c0 = this.f39241b.mo15535c0(i10);
            codedOutputStream.m13916x(1, 2);
            codedOutputStream.m13914v(abstractC7803aMo15535c0.size());
            codedOutputStream.m13910r(abstractC7803aMo15535c0);
        }
        codedOutputStream.m13910r(this.f39240a);
    }
}
