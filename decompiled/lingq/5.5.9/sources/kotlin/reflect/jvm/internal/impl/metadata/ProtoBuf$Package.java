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

/* JADX INFO: loaded from: classes2.dex */
public final class ProtoBuf$Package extends GeneratedMessageLite.ExtendableMessage<ProtoBuf$Package> {

    /* JADX INFO: renamed from: k */
    public static final ProtoBuf$Package f39149k;

    /* JADX INFO: renamed from: l */
    public static final C6934a f39150l = new C6934a();

    /* JADX INFO: renamed from: b */
    public final AbstractC7803a f39151b;

    /* JADX INFO: renamed from: c */
    public int f39152c;

    /* JADX INFO: renamed from: d */
    public List<ProtoBuf$Function> f39153d;

    /* JADX INFO: renamed from: e */
    public List<ProtoBuf$Property> f39154e;

    /* JADX INFO: renamed from: f */
    public List<ProtoBuf$TypeAlias> f39155f;

    /* JADX INFO: renamed from: g */
    public ProtoBuf$TypeTable f39156g;

    /* JADX INFO: renamed from: h */
    public ProtoBuf$VersionRequirementTable f39157h;

    /* JADX INFO: renamed from: i */
    public byte f39158i;

    /* JADX INFO: renamed from: j */
    public int f39159j;

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Package$a */
    public static class C6934a extends AbstractC6991b<ProtoBuf$Package> {
        @Override // p282nn.InterfaceC7809g
        /* JADX INFO: renamed from: a */
        public final Object mo13787a(C6992c c6992c, C6993d c6993d) throws InvalidProtocolBufferException {
            return new ProtoBuf$Package(c6992c, c6993d);
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Package$b */
    public static final class C6935b extends GeneratedMessageLite.AbstractC6983c<ProtoBuf$Package, C6935b> {

        /* JADX INFO: renamed from: d */
        public int f39160d;

        /* JADX INFO: renamed from: e */
        public List<ProtoBuf$Function> f39161e = Collections.emptyList();

        /* JADX INFO: renamed from: f */
        public List<ProtoBuf$Property> f39162f = Collections.emptyList();

        /* JADX INFO: renamed from: g */
        public List<ProtoBuf$TypeAlias> f39163g = Collections.emptyList();

        /* JADX INFO: renamed from: h */
        public ProtoBuf$TypeTable f39164h = ProtoBuf$TypeTable.f39341g;

        /* JADX INFO: renamed from: i */
        public ProtoBuf$VersionRequirementTable f39165i = ProtoBuf$VersionRequirementTable.f39390e;

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC6990a.a, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC6997h.a
        /* JADX INFO: renamed from: Q */
        public final /* bridge */ /* synthetic */ InterfaceC6997h.a mo13788Q(C6992c c6992c, C6993d c6993d) throws Throwable {
            m13827o(c6992c, c6993d);
            return this;
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC6997h.a
        /* JADX INFO: renamed from: a */
        public final InterfaceC6997h mo13789a() {
            ProtoBuf$Package protoBuf$PackageM13825m = m13825m();
            if (protoBuf$PackageM13825m.mo13780b()) {
                return protoBuf$PackageM13825m;
            }
            throw new UninitializedMessageException();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.AbstractC6982b
        public final Object clone() throws CloneNotSupportedException {
            C6935b c6935b = new C6935b();
            c6935b.m13826n(m13825m());
            return c6935b;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC6990a.a
        /* JADX INFO: renamed from: f */
        public final /* bridge */ /* synthetic */ AbstractC6990a.a mo13788Q(C6992c c6992c, C6993d c6993d) throws Throwable {
            m13827o(c6992c, c6993d);
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.AbstractC6982b
        /* JADX INFO: renamed from: g */
        public final GeneratedMessageLite.AbstractC6982b clone() {
            C6935b c6935b = new C6935b();
            c6935b.m13826n(m13825m());
            return c6935b;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.AbstractC6982b
        /* JADX INFO: renamed from: i */
        public final /* bridge */ /* synthetic */ GeneratedMessageLite.AbstractC6982b mo13792i(GeneratedMessageLite generatedMessageLite) {
            m13826n((ProtoBuf$Package) generatedMessageLite);
            return this;
        }

        /* JADX INFO: renamed from: m */
        public final ProtoBuf$Package m13825m() {
            ProtoBuf$Package protoBuf$Package = new ProtoBuf$Package(this);
            int i10 = this.f39160d;
            int i11 = 1;
            if ((i10 & 1) == 1) {
                this.f39161e = Collections.unmodifiableList(this.f39161e);
                this.f39160d &= -2;
            }
            protoBuf$Package.f39153d = this.f39161e;
            if ((this.f39160d & 2) == 2) {
                this.f39162f = Collections.unmodifiableList(this.f39162f);
                this.f39160d &= -3;
            }
            protoBuf$Package.f39154e = this.f39162f;
            if ((this.f39160d & 4) == 4) {
                this.f39163g = Collections.unmodifiableList(this.f39163g);
                this.f39160d &= -5;
            }
            protoBuf$Package.f39155f = this.f39163g;
            if ((i10 & 8) != 8) {
                i11 = 0;
            }
            protoBuf$Package.f39156g = this.f39164h;
            if ((i10 & 16) == 16) {
                i11 |= 2;
            }
            protoBuf$Package.f39157h = this.f39165i;
            protoBuf$Package.f39152c = i11;
            return protoBuf$Package;
        }

        /* JADX INFO: renamed from: n */
        public final void m13826n(ProtoBuf$Package protoBuf$Package) {
            ProtoBuf$VersionRequirementTable protoBuf$VersionRequirementTable;
            ProtoBuf$TypeTable protoBuf$TypeTable;
            if (protoBuf$Package == ProtoBuf$Package.f39149k) {
                return;
            }
            boolean z10 = true;
            if (!protoBuf$Package.f39153d.isEmpty()) {
                if (this.f39161e.isEmpty()) {
                    this.f39161e = protoBuf$Package.f39153d;
                    this.f39160d &= -2;
                } else {
                    if ((this.f39160d & 1) != 1) {
                        this.f39161e = new ArrayList(this.f39161e);
                        this.f39160d |= 1;
                    }
                    this.f39161e.addAll(protoBuf$Package.f39153d);
                }
            }
            if (!protoBuf$Package.f39154e.isEmpty()) {
                if (this.f39162f.isEmpty()) {
                    this.f39162f = protoBuf$Package.f39154e;
                    this.f39160d &= -3;
                } else {
                    if ((this.f39160d & 2) != 2) {
                        this.f39162f = new ArrayList(this.f39162f);
                        this.f39160d |= 2;
                    }
                    this.f39162f.addAll(protoBuf$Package.f39154e);
                }
            }
            if (!protoBuf$Package.f39155f.isEmpty()) {
                if (this.f39163g.isEmpty()) {
                    this.f39163g = protoBuf$Package.f39155f;
                    this.f39160d &= -5;
                } else {
                    if ((this.f39160d & 4) != 4) {
                        this.f39163g = new ArrayList(this.f39163g);
                        this.f39160d |= 4;
                    }
                    this.f39163g.addAll(protoBuf$Package.f39155f);
                }
            }
            if ((protoBuf$Package.f39152c & 1) == 1) {
                ProtoBuf$TypeTable protoBuf$TypeTable2 = protoBuf$Package.f39156g;
                if ((this.f39160d & 8) != 8 || (protoBuf$TypeTable = this.f39164h) == ProtoBuf$TypeTable.f39341g) {
                    this.f39164h = protoBuf$TypeTable2;
                } else {
                    ProtoBuf$TypeTable.C6958b c6958bM13861n = ProtoBuf$TypeTable.m13861n(protoBuf$TypeTable);
                    c6958bM13861n.m13864m(protoBuf$TypeTable2);
                    this.f39164h = c6958bM13861n.m13863k();
                }
                this.f39160d |= 8;
            }
            if ((protoBuf$Package.f39152c & 2) != 2) {
                z10 = false;
            }
            if (z10) {
                ProtoBuf$VersionRequirementTable protoBuf$VersionRequirementTable2 = protoBuf$Package.f39157h;
                if ((this.f39160d & 16) != 16 || (protoBuf$VersionRequirementTable = this.f39165i) == ProtoBuf$VersionRequirementTable.f39390e) {
                    this.f39165i = protoBuf$VersionRequirementTable2;
                } else {
                    ProtoBuf$VersionRequirementTable.C6966b c6966b = new ProtoBuf$VersionRequirementTable.C6966b();
                    c6966b.m13873m(protoBuf$VersionRequirementTable);
                    c6966b.m13873m(protoBuf$VersionRequirementTable2);
                    this.f39165i = c6966b.m13872k();
                }
                this.f39160d |= 16;
            }
            m13928k(protoBuf$Package);
            this.f39493a = this.f39493a.m15519f(protoBuf$Package.f39151b);
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0020  */
        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* JADX INFO: renamed from: o */
        public final void m13827o(C6992c c6992c, C6993d c6993d) throws Throwable {
            ProtoBuf$Package protoBuf$Package;
            try {
                try {
                    ProtoBuf$Package.f39150l.getClass();
                    m13826n(new ProtoBuf$Package(c6992c, c6993d));
                } catch (InvalidProtocolBufferException e10) {
                    protoBuf$Package = (ProtoBuf$Package) e10.f39506a;
                    try {
                        throw e10;
                    } catch (Throwable th2) {
                        th = th2;
                        if (protoBuf$Package != null) {
                            m13826n(protoBuf$Package);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                protoBuf$Package = null;
                if (protoBuf$Package != null) {
                    m13826n(protoBuf$Package);
                }
                throw th;
            }
        }
    }

    static {
        ProtoBuf$Package protoBuf$Package = new ProtoBuf$Package(0);
        f39149k = protoBuf$Package;
        protoBuf$Package.f39153d = Collections.emptyList();
        protoBuf$Package.f39154e = Collections.emptyList();
        protoBuf$Package.f39155f = Collections.emptyList();
        protoBuf$Package.f39156g = ProtoBuf$TypeTable.f39341g;
        protoBuf$Package.f39157h = ProtoBuf$VersionRequirementTable.f39390e;
    }

    public ProtoBuf$Package() {
        throw null;
    }

    public ProtoBuf$Package(int i10) {
        this.f39158i = (byte) -1;
        this.f39159j = -1;
        this.f39151b = AbstractC7803a.f42882a;
    }

    public ProtoBuf$Package(GeneratedMessageLite.AbstractC6983c abstractC6983c) {
        super(abstractC6983c);
        this.f39158i = (byte) -1;
        this.f39159j = -1;
        this.f39151b = abstractC6983c.f39493a;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    public ProtoBuf$Package(C6992c c6992c, C6993d c6993d) throws InvalidProtocolBufferException {
        this.f39158i = (byte) -1;
        this.f39159j = -1;
        this.f39153d = Collections.emptyList();
        this.f39154e = Collections.emptyList();
        this.f39155f = Collections.emptyList();
        this.f39156g = ProtoBuf$TypeTable.f39341g;
        this.f39157h = ProtoBuf$VersionRequirementTable.f39390e;
        AbstractC7803a.b bVar = new AbstractC7803a.b();
        CodedOutputStream codedOutputStreamM13901j = CodedOutputStream.m13901j(bVar, 1);
        boolean z10 = false;
        int i10 = 0;
        loop0: while (true) {
            while (true) {
                if (z10) {
                    break loop0;
                }
                try {
                    try {
                        int iM13952n = c6992c.m13952n();
                        if (iM13952n != 0) {
                            if (iM13952n == 26) {
                                int i11 = (i10 == true ? 1 : 0) & 1;
                                i10 = i10;
                                if (i11 != 1) {
                                    this.f39153d = new ArrayList();
                                    i10 = (i10 == true ? 1 : 0) | 1;
                                }
                                this.f39153d.add((ProtoBuf$Function) c6992c.m13945g(ProtoBuf$Function.f39114Q, c6993d));
                            } else if (iM13952n == 34) {
                                int i12 = (i10 == true ? 1 : 0) & 2;
                                i10 = i10;
                                if (i12 != 2) {
                                    this.f39154e = new ArrayList();
                                    i10 = (i10 == true ? 1 : 0) | 2;
                                }
                                this.f39154e.add((ProtoBuf$Property) c6992c.m13945g(ProtoBuf$Property.f39182Q, c6993d));
                            } else if (iM13952n != 42) {
                                ProtoBuf$VersionRequirementTable.C6966b c6966b = null;
                                ProtoBuf$TypeTable.C6958b c6958bM13861n = null;
                                if (iM13952n == 242) {
                                    if ((this.f39152c & 1) == 1) {
                                        ProtoBuf$TypeTable protoBuf$TypeTable = this.f39156g;
                                        protoBuf$TypeTable.getClass();
                                        c6958bM13861n = ProtoBuf$TypeTable.m13861n(protoBuf$TypeTable);
                                    }
                                    ProtoBuf$TypeTable protoBuf$TypeTable2 = (ProtoBuf$TypeTable) c6992c.m13945g(ProtoBuf$TypeTable.f39342h, c6993d);
                                    this.f39156g = protoBuf$TypeTable2;
                                    if (c6958bM13861n != null) {
                                        c6958bM13861n.m13864m(protoBuf$TypeTable2);
                                        this.f39156g = c6958bM13861n.m13863k();
                                    }
                                    this.f39152c |= 1;
                                } else if (iM13952n == 258) {
                                    if ((this.f39152c & 2) == 2) {
                                        ProtoBuf$VersionRequirementTable protoBuf$VersionRequirementTable = this.f39157h;
                                        protoBuf$VersionRequirementTable.getClass();
                                        c6966b = new ProtoBuf$VersionRequirementTable.C6966b();
                                        c6966b.m13873m(protoBuf$VersionRequirementTable);
                                    }
                                    ProtoBuf$VersionRequirementTable protoBuf$VersionRequirementTable2 = (ProtoBuf$VersionRequirementTable) c6992c.m13945g(ProtoBuf$VersionRequirementTable.f39391f, c6993d);
                                    this.f39157h = protoBuf$VersionRequirementTable2;
                                    if (c6966b != null) {
                                        c6966b.m13873m(protoBuf$VersionRequirementTable2);
                                        this.f39157h = c6966b.m13872k();
                                    }
                                    this.f39152c |= 2;
                                } else if (!m13925x(c6992c, codedOutputStreamM13901j, c6993d, iM13952n)) {
                                }
                            } else {
                                int i13 = (i10 == true ? 1 : 0) & 4;
                                i10 = i10;
                                if (i13 != 4) {
                                    this.f39155f = new ArrayList();
                                    i10 = (i10 == true ? 1 : 0) | 4;
                                }
                                this.f39155f.add((ProtoBuf$TypeAlias) c6992c.m13945g(ProtoBuf$TypeAlias.f39296K, c6993d));
                            }
                        }
                        z10 = true;
                    } catch (InvalidProtocolBufferException e10) {
                        e10.f39506a = this;
                        throw e10;
                    } catch (IOException e11) {
                        InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e11.getMessage());
                        invalidProtocolBufferException.f39506a = this;
                        throw invalidProtocolBufferException;
                    }
                } catch (Throwable th2) {
                    if (((i10 == true ? 1 : 0) & 1) == 1) {
                        this.f39153d = Collections.unmodifiableList(this.f39153d);
                    }
                    if (((i10 == true ? 1 : 0) & 2) == 2) {
                        this.f39154e = Collections.unmodifiableList(this.f39154e);
                    }
                    if (((i10 == true ? 1 : 0) & 4) == 4) {
                        this.f39155f = Collections.unmodifiableList(this.f39155f);
                    }
                    try {
                        codedOutputStreamM13901j.m13902i();
                    } catch (IOException unused) {
                    } catch (Throwable th3) {
                        this.f39151b = bVar.m15533l();
                        throw th3;
                    }
                    this.f39151b = bVar.m15533l();
                    m13923t();
                    throw th2;
                }
            }
        }
        if (((i10 == true ? 1 : 0) & 1) == 1) {
            this.f39153d = Collections.unmodifiableList(this.f39153d);
        }
        if (((i10 == true ? 1 : 0) & 2) == 2) {
            this.f39154e = Collections.unmodifiableList(this.f39154e);
        }
        if (((i10 == true ? 1 : 0) & 4) == 4) {
            this.f39155f = Collections.unmodifiableList(this.f39155f);
        }
        try {
            codedOutputStreamM13901j.m13902i();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f39151b = bVar.m15533l();
            throw th4;
        }
        this.f39151b = bVar.m15533l();
        m13923t();
    }

    @Override // p282nn.InterfaceC7808f
    /* JADX INFO: renamed from: b */
    public final boolean mo13780b() {
        byte b10 = this.f39158i;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        for (int i10 = 0; i10 < this.f39153d.size(); i10++) {
            if (!this.f39153d.get(i10).mo13780b()) {
                this.f39158i = (byte) 0;
                return false;
            }
        }
        for (int i11 = 0; i11 < this.f39154e.size(); i11++) {
            if (!this.f39154e.get(i11).mo13780b()) {
                this.f39158i = (byte) 0;
                return false;
            }
        }
        for (int i12 = 0; i12 < this.f39155f.size(); i12++) {
            if (!this.f39155f.get(i12).mo13780b()) {
                this.f39158i = (byte) 0;
                return false;
            }
        }
        if (((this.f39152c & 1) == 1) && !this.f39156g.mo13780b()) {
            this.f39158i = (byte) 0;
            return false;
        }
        if (m13919n()) {
            this.f39158i = (byte) 1;
            return true;
        }
        this.f39158i = (byte) 0;
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC6997h
    /* JADX INFO: renamed from: c */
    public final InterfaceC6997h.a mo13781c() {
        C6935b c6935b = new C6935b();
        c6935b.m13826n(this);
        return c6935b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC6997h
    /* JADX INFO: renamed from: d */
    public final int mo13782d() {
        int i10 = this.f39159j;
        if (i10 != -1) {
            return i10;
        }
        int iM13896d = 0;
        for (int i11 = 0; i11 < this.f39153d.size(); i11++) {
            iM13896d += CodedOutputStream.m13896d(3, this.f39153d.get(i11));
        }
        for (int i12 = 0; i12 < this.f39154e.size(); i12++) {
            iM13896d += CodedOutputStream.m13896d(4, this.f39154e.get(i12));
        }
        for (int i13 = 0; i13 < this.f39155f.size(); i13++) {
            iM13896d += CodedOutputStream.m13896d(5, this.f39155f.get(i13));
        }
        if ((this.f39152c & 1) == 1) {
            iM13896d += CodedOutputStream.m13896d(30, this.f39156g);
        }
        if ((this.f39152c & 2) == 2) {
            iM13896d += CodedOutputStream.m13896d(32, this.f39157h);
        }
        int size = this.f39151b.size() + m13920q() + iM13896d;
        this.f39159j = size;
        return size;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC6997h
    /* JADX INFO: renamed from: e */
    public final InterfaceC6997h.a mo13783e() {
        return new C6935b();
    }

    @Override // p282nn.InterfaceC7808f
    /* JADX INFO: renamed from: h */
    public final InterfaceC6997h mo13802h() {
        return f39149k;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC6997h
    /* JADX INFO: renamed from: j */
    public final void mo13784j(CodedOutputStream codedOutputStream) throws IOException {
        mo13782d();
        GeneratedMessageLite.ExtendableMessage.C6980a c6980a = new GeneratedMessageLite.ExtendableMessage.C6980a(this);
        for (int i10 = 0; i10 < this.f39153d.size(); i10++) {
            codedOutputStream.m13907o(3, this.f39153d.get(i10));
        }
        for (int i11 = 0; i11 < this.f39154e.size(); i11++) {
            codedOutputStream.m13907o(4, this.f39154e.get(i11));
        }
        for (int i12 = 0; i12 < this.f39155f.size(); i12++) {
            codedOutputStream.m13907o(5, this.f39155f.get(i12));
        }
        if ((this.f39152c & 1) == 1) {
            codedOutputStream.m13907o(30, this.f39156g);
        }
        if ((this.f39152c & 2) == 2) {
            codedOutputStream.m13907o(32, this.f39157h);
        }
        c6980a.m13927a(200, codedOutputStream);
        codedOutputStream.m13910r(this.f39151b);
    }
}
