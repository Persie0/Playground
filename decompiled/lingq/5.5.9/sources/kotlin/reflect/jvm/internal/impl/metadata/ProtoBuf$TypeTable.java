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
public final class ProtoBuf$TypeTable extends GeneratedMessageLite implements InterfaceC7808f {

    /* JADX INFO: renamed from: g */
    public static final ProtoBuf$TypeTable f39341g;

    /* JADX INFO: renamed from: h */
    public static final C6957a f39342h = new C6957a();

    /* JADX INFO: renamed from: a */
    public final AbstractC7803a f39343a;

    /* JADX INFO: renamed from: b */
    public int f39344b;

    /* JADX INFO: renamed from: c */
    public List<ProtoBuf$Type> f39345c;

    /* JADX INFO: renamed from: d */
    public int f39346d;

    /* JADX INFO: renamed from: e */
    public byte f39347e;

    /* JADX INFO: renamed from: f */
    public int f39348f;

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable$a */
    public static class C6957a extends AbstractC6991b<ProtoBuf$TypeTable> {
        @Override // p282nn.InterfaceC7809g
        /* JADX INFO: renamed from: a */
        public final Object mo13787a(C6992c c6992c, C6993d c6993d) throws InvalidProtocolBufferException {
            return new ProtoBuf$TypeTable(c6992c, c6993d);
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable$b */
    public static final class C6958b extends GeneratedMessageLite.AbstractC6982b<ProtoBuf$TypeTable, C6958b> implements InterfaceC7808f {

        /* JADX INFO: renamed from: b */
        public int f39349b;

        /* JADX INFO: renamed from: c */
        public List<ProtoBuf$Type> f39350c = Collections.emptyList();

        /* JADX INFO: renamed from: d */
        public int f39351d = -1;

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC6990a.a, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC6997h.a
        /* JADX INFO: renamed from: Q */
        public final /* bridge */ /* synthetic */ InterfaceC6997h.a mo13788Q(C6992c c6992c, C6993d c6993d) throws Throwable {
            m13865n(c6992c, c6993d);
            return this;
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC6997h.a
        /* JADX INFO: renamed from: a */
        public final InterfaceC6997h mo13789a() {
            ProtoBuf$TypeTable protoBuf$TypeTableM13863k = m13863k();
            if (protoBuf$TypeTableM13863k.mo13780b()) {
                return protoBuf$TypeTableM13863k;
            }
            throw new UninitializedMessageException();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.AbstractC6982b
        public final Object clone() throws CloneNotSupportedException {
            C6958b c6958b = new C6958b();
            c6958b.m13864m(m13863k());
            return c6958b;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC6990a.a
        /* JADX INFO: renamed from: f */
        public final /* bridge */ /* synthetic */ AbstractC6990a.a mo13788Q(C6992c c6992c, C6993d c6993d) throws Throwable {
            m13865n(c6992c, c6993d);
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.AbstractC6982b
        /* JADX INFO: renamed from: g */
        public final GeneratedMessageLite.AbstractC6982b clone() {
            C6958b c6958b = new C6958b();
            c6958b.m13864m(m13863k());
            return c6958b;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.AbstractC6982b
        /* JADX INFO: renamed from: i */
        public final /* bridge */ /* synthetic */ GeneratedMessageLite.AbstractC6982b mo13792i(GeneratedMessageLite generatedMessageLite) {
            m13864m((ProtoBuf$TypeTable) generatedMessageLite);
            return this;
        }

        /* JADX INFO: renamed from: k */
        public final ProtoBuf$TypeTable m13863k() {
            ProtoBuf$TypeTable protoBuf$TypeTable = new ProtoBuf$TypeTable(this);
            int i10 = this.f39349b;
            int i11 = 1;
            if ((i10 & 1) == 1) {
                this.f39350c = Collections.unmodifiableList(this.f39350c);
                this.f39349b &= -2;
            }
            protoBuf$TypeTable.f39345c = this.f39350c;
            if ((i10 & 2) != 2) {
                i11 = 0;
            }
            protoBuf$TypeTable.f39346d = this.f39351d;
            protoBuf$TypeTable.f39344b = i11;
            return protoBuf$TypeTable;
        }

        /* JADX INFO: renamed from: m */
        public final void m13864m(ProtoBuf$TypeTable protoBuf$TypeTable) {
            if (protoBuf$TypeTable == ProtoBuf$TypeTable.f39341g) {
                return;
            }
            boolean z10 = true;
            if (!protoBuf$TypeTable.f39345c.isEmpty()) {
                if (this.f39350c.isEmpty()) {
                    this.f39350c = protoBuf$TypeTable.f39345c;
                    this.f39349b &= -2;
                } else {
                    if ((this.f39349b & 1) != 1) {
                        this.f39350c = new ArrayList(this.f39350c);
                        this.f39349b |= 1;
                    }
                    this.f39350c.addAll(protoBuf$TypeTable.f39345c);
                }
            }
            if ((protoBuf$TypeTable.f39344b & 1) != 1) {
                z10 = false;
            }
            if (z10) {
                int i10 = protoBuf$TypeTable.f39346d;
                this.f39349b |= 2;
                this.f39351d = i10;
            }
            this.f39493a = this.f39493a.m15519f(protoBuf$TypeTable.f39343a);
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0021  */
        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* JADX INFO: renamed from: n */
        public final void m13865n(C6992c c6992c, C6993d c6993d) throws Throwable {
            ProtoBuf$TypeTable protoBuf$TypeTable;
            try {
                try {
                    ProtoBuf$TypeTable.f39342h.getClass();
                    m13864m(new ProtoBuf$TypeTable(c6992c, c6993d));
                } catch (InvalidProtocolBufferException e10) {
                    protoBuf$TypeTable = (ProtoBuf$TypeTable) e10.f39506a;
                    try {
                        throw e10;
                    } catch (Throwable th2) {
                        th = th2;
                        if (protoBuf$TypeTable != null) {
                            m13864m(protoBuf$TypeTable);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                protoBuf$TypeTable = null;
                if (protoBuf$TypeTable != null) {
                    m13864m(protoBuf$TypeTable);
                }
                throw th;
            }
        }
    }

    static {
        ProtoBuf$TypeTable protoBuf$TypeTable = new ProtoBuf$TypeTable();
        f39341g = protoBuf$TypeTable;
        protoBuf$TypeTable.f39345c = Collections.emptyList();
        protoBuf$TypeTable.f39346d = -1;
    }

    public ProtoBuf$TypeTable() {
        this.f39347e = (byte) -1;
        this.f39348f = -1;
        this.f39343a = AbstractC7803a.f42882a;
    }

    public ProtoBuf$TypeTable(GeneratedMessageLite.AbstractC6982b abstractC6982b) {
        super(0);
        this.f39347e = (byte) -1;
        this.f39348f = -1;
        this.f39343a = abstractC6982b.f39493a;
    }

    /* JADX WARN: Unreachable blocks removed: 3, instructions: 3 */
    public ProtoBuf$TypeTable(C6992c c6992c, C6993d c6993d) throws InvalidProtocolBufferException {
        this.f39347e = (byte) -1;
        this.f39348f = -1;
        this.f39345c = Collections.emptyList();
        this.f39346d = -1;
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
                                    this.f39345c = new ArrayList();
                                    z11 |= true;
                                }
                                this.f39345c.add((ProtoBuf$Type) c6992c.m13945g(ProtoBuf$Type.f39247P, c6993d));
                            } else if (iM13952n == 16) {
                                this.f39344b |= 1;
                                this.f39346d = c6992c.m13949k();
                            } else if (!c6992c.m13955q(iM13952n, codedOutputStreamM13901j)) {
                            }
                        }
                        z10 = true;
                    } catch (Throwable th2) {
                        if (z11 & true) {
                            this.f39345c = Collections.unmodifiableList(this.f39345c);
                        }
                        try {
                            codedOutputStreamM13901j.m13902i();
                        } catch (IOException unused) {
                        } finally {
                            this.f39343a = bVar.m15533l();
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
            this.f39345c = Collections.unmodifiableList(this.f39345c);
        }
        try {
            codedOutputStreamM13901j.m13902i();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f39343a = bVar.m15533l();
            throw th3;
        }
        this.f39343a = bVar.m15533l();
    }

    /* JADX INFO: renamed from: n */
    public static C6958b m13861n(ProtoBuf$TypeTable protoBuf$TypeTable) {
        C6958b c6958b = new C6958b();
        c6958b.m13864m(protoBuf$TypeTable);
        return c6958b;
    }

    @Override // p282nn.InterfaceC7808f
    /* JADX INFO: renamed from: b */
    public final boolean mo13780b() {
        byte b10 = this.f39347e;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        for (int i10 = 0; i10 < this.f39345c.size(); i10++) {
            if (!this.f39345c.get(i10).mo13780b()) {
                this.f39347e = (byte) 0;
                return false;
            }
        }
        this.f39347e = (byte) 1;
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC6997h
    /* JADX INFO: renamed from: c */
    public final InterfaceC6997h.a mo13781c() {
        return m13861n(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC6997h
    /* JADX INFO: renamed from: d */
    public final int mo13782d() {
        int i10 = this.f39348f;
        if (i10 != -1) {
            return i10;
        }
        int iM13894b = 0;
        for (int i11 = 0; i11 < this.f39345c.size(); i11++) {
            iM13894b += CodedOutputStream.m13896d(1, this.f39345c.get(i11));
        }
        if ((this.f39344b & 1) == 1) {
            iM13894b += CodedOutputStream.m13894b(2, this.f39346d);
        }
        int size = this.f39343a.size() + iM13894b;
        this.f39348f = size;
        return size;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC6997h
    /* JADX INFO: renamed from: e */
    public final InterfaceC6997h.a mo13783e() {
        return new C6958b();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC6997h
    /* JADX INFO: renamed from: j */
    public final void mo13784j(CodedOutputStream codedOutputStream) throws IOException {
        mo13782d();
        for (int i10 = 0; i10 < this.f39345c.size(); i10++) {
            codedOutputStream.m13907o(1, this.f39345c.get(i10));
        }
        if ((this.f39344b & 1) == 1) {
            codedOutputStream.m13905m(2, this.f39346d);
        }
        codedOutputStream.m13910r(this.f39343a);
    }

    /* JADX INFO: renamed from: q */
    public final C6958b m13862q() {
        return m13861n(this);
    }
}
