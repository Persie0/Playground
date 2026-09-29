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
public final class ProtoBuf$VersionRequirementTable extends GeneratedMessageLite implements InterfaceC7808f {

    /* JADX INFO: renamed from: e */
    public static final ProtoBuf$VersionRequirementTable f39390e;

    /* JADX INFO: renamed from: f */
    public static final C6965a f39391f = new C6965a();

    /* JADX INFO: renamed from: a */
    public final AbstractC7803a f39392a;

    /* JADX INFO: renamed from: b */
    public List<ProtoBuf$VersionRequirement> f39393b;

    /* JADX INFO: renamed from: c */
    public byte f39394c;

    /* JADX INFO: renamed from: d */
    public int f39395d;

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirementTable$a */
    public static class C6965a extends AbstractC6991b<ProtoBuf$VersionRequirementTable> {
        @Override // p282nn.InterfaceC7809g
        /* JADX INFO: renamed from: a */
        public final Object mo13787a(C6992c c6992c, C6993d c6993d) throws InvalidProtocolBufferException {
            return new ProtoBuf$VersionRequirementTable(c6992c, c6993d);
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirementTable$b */
    public static final class C6966b extends GeneratedMessageLite.AbstractC6982b<ProtoBuf$VersionRequirementTable, C6966b> implements InterfaceC7808f {

        /* JADX INFO: renamed from: b */
        public int f39396b;

        /* JADX INFO: renamed from: c */
        public List<ProtoBuf$VersionRequirement> f39397c = Collections.emptyList();

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC6990a.a, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC6997h.a
        /* JADX INFO: renamed from: Q */
        public final /* bridge */ /* synthetic */ InterfaceC6997h.a mo13788Q(C6992c c6992c, C6993d c6993d) throws Throwable {
            m13874n(c6992c, c6993d);
            return this;
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC6997h.a
        /* JADX INFO: renamed from: a */
        public final InterfaceC6997h mo13789a() {
            ProtoBuf$VersionRequirementTable protoBuf$VersionRequirementTableM13872k = m13872k();
            if (protoBuf$VersionRequirementTableM13872k.mo13780b()) {
                return protoBuf$VersionRequirementTableM13872k;
            }
            throw new UninitializedMessageException();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.AbstractC6982b
        public final Object clone() throws CloneNotSupportedException {
            C6966b c6966b = new C6966b();
            c6966b.m13873m(m13872k());
            return c6966b;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC6990a.a
        /* JADX INFO: renamed from: f */
        public final /* bridge */ /* synthetic */ AbstractC6990a.a mo13788Q(C6992c c6992c, C6993d c6993d) throws Throwable {
            m13874n(c6992c, c6993d);
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.AbstractC6982b
        /* JADX INFO: renamed from: g */
        public final GeneratedMessageLite.AbstractC6982b clone() {
            C6966b c6966b = new C6966b();
            c6966b.m13873m(m13872k());
            return c6966b;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.AbstractC6982b
        /* JADX INFO: renamed from: i */
        public final /* bridge */ /* synthetic */ GeneratedMessageLite.AbstractC6982b mo13792i(GeneratedMessageLite generatedMessageLite) {
            m13873m((ProtoBuf$VersionRequirementTable) generatedMessageLite);
            return this;
        }

        /* JADX INFO: renamed from: k */
        public final ProtoBuf$VersionRequirementTable m13872k() {
            ProtoBuf$VersionRequirementTable protoBuf$VersionRequirementTable = new ProtoBuf$VersionRequirementTable(this);
            if ((this.f39396b & 1) == 1) {
                this.f39397c = Collections.unmodifiableList(this.f39397c);
                this.f39396b &= -2;
            }
            protoBuf$VersionRequirementTable.f39393b = this.f39397c;
            return protoBuf$VersionRequirementTable;
        }

        /* JADX INFO: renamed from: m */
        public final void m13873m(ProtoBuf$VersionRequirementTable protoBuf$VersionRequirementTable) {
            if (protoBuf$VersionRequirementTable == ProtoBuf$VersionRequirementTable.f39390e) {
                return;
            }
            if (!protoBuf$VersionRequirementTable.f39393b.isEmpty()) {
                if (this.f39397c.isEmpty()) {
                    this.f39397c = protoBuf$VersionRequirementTable.f39393b;
                    this.f39396b &= -2;
                } else {
                    if ((this.f39396b & 1) != 1) {
                        this.f39397c = new ArrayList(this.f39397c);
                        this.f39396b |= 1;
                    }
                    this.f39397c.addAll(protoBuf$VersionRequirementTable.f39393b);
                }
            }
            this.f39493a = this.f39493a.m15519f(protoBuf$VersionRequirementTable.f39392a);
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0022  */
        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* JADX INFO: renamed from: n */
        public final void m13874n(C6992c c6992c, C6993d c6993d) throws Throwable {
            ProtoBuf$VersionRequirementTable protoBuf$VersionRequirementTable;
            try {
                try {
                    ProtoBuf$VersionRequirementTable.f39391f.getClass();
                    m13873m(new ProtoBuf$VersionRequirementTable(c6992c, c6993d));
                } catch (InvalidProtocolBufferException e10) {
                    protoBuf$VersionRequirementTable = (ProtoBuf$VersionRequirementTable) e10.f39506a;
                    try {
                        throw e10;
                    } catch (Throwable th2) {
                        th = th2;
                        if (protoBuf$VersionRequirementTable != null) {
                            m13873m(protoBuf$VersionRequirementTable);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                protoBuf$VersionRequirementTable = null;
                if (protoBuf$VersionRequirementTable != null) {
                    m13873m(protoBuf$VersionRequirementTable);
                }
                throw th;
            }
        }
    }

    static {
        ProtoBuf$VersionRequirementTable protoBuf$VersionRequirementTable = new ProtoBuf$VersionRequirementTable();
        f39390e = protoBuf$VersionRequirementTable;
        protoBuf$VersionRequirementTable.f39393b = Collections.emptyList();
    }

    public ProtoBuf$VersionRequirementTable() {
        this.f39394c = (byte) -1;
        this.f39395d = -1;
        this.f39392a = AbstractC7803a.f42882a;
    }

    public ProtoBuf$VersionRequirementTable(GeneratedMessageLite.AbstractC6982b abstractC6982b) {
        super(0);
        this.f39394c = (byte) -1;
        this.f39395d = -1;
        this.f39392a = abstractC6982b.f39493a;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    public ProtoBuf$VersionRequirementTable(C6992c c6992c, C6993d c6993d) throws InvalidProtocolBufferException {
        this.f39394c = (byte) -1;
        this.f39395d = -1;
        this.f39393b = Collections.emptyList();
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
                            if (!(z11 & true)) {
                                this.f39393b = new ArrayList();
                                z11 |= true;
                            }
                            this.f39393b.add((ProtoBuf$VersionRequirement) c6992c.m13945g(ProtoBuf$VersionRequirement.f39372l, c6993d));
                        } else if (!c6992c.m13955q(iM13952n, codedOutputStreamM13901j)) {
                        }
                    }
                    z10 = true;
                } catch (Throwable th2) {
                    if (z11 & true) {
                        this.f39393b = Collections.unmodifiableList(this.f39393b);
                    }
                    try {
                        codedOutputStreamM13901j.m13902i();
                    } catch (IOException unused) {
                    } catch (Throwable th3) {
                        this.f39392a = bVar.m15533l();
                        throw th3;
                    }
                    this.f39392a = bVar.m15533l();
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
            this.f39393b = Collections.unmodifiableList(this.f39393b);
        }
        try {
            codedOutputStreamM13901j.m13902i();
        } catch (IOException unused2) {
        } finally {
            this.f39392a = bVar.m15533l();
        }
    }

    @Override // p282nn.InterfaceC7808f
    /* JADX INFO: renamed from: b */
    public final boolean mo13780b() {
        byte b10 = this.f39394c;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        this.f39394c = (byte) 1;
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC6997h
    /* JADX INFO: renamed from: c */
    public final InterfaceC6997h.a mo13781c() {
        C6966b c6966b = new C6966b();
        c6966b.m13873m(this);
        return c6966b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC6997h
    /* JADX INFO: renamed from: d */
    public final int mo13782d() {
        int i10 = this.f39395d;
        if (i10 != -1) {
            return i10;
        }
        int iM13896d = 0;
        for (int i11 = 0; i11 < this.f39393b.size(); i11++) {
            iM13896d += CodedOutputStream.m13896d(1, this.f39393b.get(i11));
        }
        int size = this.f39392a.size() + iM13896d;
        this.f39395d = size;
        return size;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC6997h
    /* JADX INFO: renamed from: e */
    public final InterfaceC6997h.a mo13783e() {
        return new C6966b();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC6997h
    /* JADX INFO: renamed from: j */
    public final void mo13784j(CodedOutputStream codedOutputStream) throws IOException {
        mo13782d();
        for (int i10 = 0; i10 < this.f39393b.size(); i10++) {
            codedOutputStream.m13907o(1, this.f39393b.get(i10));
        }
        codedOutputStream.m13910r(this.f39392a);
    }
}
