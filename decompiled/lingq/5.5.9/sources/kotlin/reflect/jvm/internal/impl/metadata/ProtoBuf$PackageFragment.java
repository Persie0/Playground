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
public final class ProtoBuf$PackageFragment extends GeneratedMessageLite.ExtendableMessage<ProtoBuf$PackageFragment> {

    /* JADX INFO: renamed from: j */
    public static final ProtoBuf$PackageFragment f39166j;

    /* JADX INFO: renamed from: k */
    public static final C6936a f39167k = new C6936a();

    /* JADX INFO: renamed from: b */
    public final AbstractC7803a f39168b;

    /* JADX INFO: renamed from: c */
    public int f39169c;

    /* JADX INFO: renamed from: d */
    public ProtoBuf$StringTable f39170d;

    /* JADX INFO: renamed from: e */
    public ProtoBuf$QualifiedNameTable f39171e;

    /* JADX INFO: renamed from: f */
    public ProtoBuf$Package f39172f;

    /* JADX INFO: renamed from: g */
    public List<ProtoBuf$Class> f39173g;

    /* JADX INFO: renamed from: h */
    public byte f39174h;

    /* JADX INFO: renamed from: i */
    public int f39175i;

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$PackageFragment$a */
    public static class C6936a extends AbstractC6991b<ProtoBuf$PackageFragment> {
        @Override // p282nn.InterfaceC7809g
        /* JADX INFO: renamed from: a */
        public final Object mo13787a(C6992c c6992c, C6993d c6993d) throws InvalidProtocolBufferException {
            return new ProtoBuf$PackageFragment(c6992c, c6993d);
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$PackageFragment$b */
    public static final class C6937b extends GeneratedMessageLite.AbstractC6983c<ProtoBuf$PackageFragment, C6937b> {

        /* JADX INFO: renamed from: d */
        public int f39176d;

        /* JADX INFO: renamed from: e */
        public ProtoBuf$StringTable f39177e = ProtoBuf$StringTable.f39238e;

        /* JADX INFO: renamed from: f */
        public ProtoBuf$QualifiedNameTable f39178f = ProtoBuf$QualifiedNameTable.f39217e;

        /* JADX INFO: renamed from: g */
        public ProtoBuf$Package f39179g = ProtoBuf$Package.f39149k;

        /* JADX INFO: renamed from: h */
        public List<ProtoBuf$Class> f39180h = Collections.emptyList();

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC6990a.a, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC6997h.a
        /* JADX INFO: renamed from: Q */
        public final /* bridge */ /* synthetic */ InterfaceC6997h.a mo13788Q(C6992c c6992c, C6993d c6993d) throws Throwable {
            m13830o(c6992c, c6993d);
            return this;
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC6997h.a
        /* JADX INFO: renamed from: a */
        public final InterfaceC6997h mo13789a() {
            ProtoBuf$PackageFragment protoBuf$PackageFragmentM13828m = m13828m();
            if (protoBuf$PackageFragmentM13828m.mo13780b()) {
                return protoBuf$PackageFragmentM13828m;
            }
            throw new UninitializedMessageException();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.AbstractC6982b
        public final Object clone() throws CloneNotSupportedException {
            C6937b c6937b = new C6937b();
            c6937b.m13829n(m13828m());
            return c6937b;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC6990a.a
        /* JADX INFO: renamed from: f */
        public final /* bridge */ /* synthetic */ AbstractC6990a.a mo13788Q(C6992c c6992c, C6993d c6993d) throws Throwable {
            m13830o(c6992c, c6993d);
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.AbstractC6982b
        /* JADX INFO: renamed from: g */
        public final GeneratedMessageLite.AbstractC6982b clone() {
            C6937b c6937b = new C6937b();
            c6937b.m13829n(m13828m());
            return c6937b;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.AbstractC6982b
        /* JADX INFO: renamed from: i */
        public final /* bridge */ /* synthetic */ GeneratedMessageLite.AbstractC6982b mo13792i(GeneratedMessageLite generatedMessageLite) {
            m13829n((ProtoBuf$PackageFragment) generatedMessageLite);
            return this;
        }

        /* JADX INFO: renamed from: m */
        public final ProtoBuf$PackageFragment m13828m() {
            ProtoBuf$PackageFragment protoBuf$PackageFragment = new ProtoBuf$PackageFragment(this);
            int i10 = this.f39176d;
            int i11 = 1;
            if ((i10 & 1) != 1) {
                i11 = 0;
            }
            protoBuf$PackageFragment.f39170d = this.f39177e;
            if ((i10 & 2) == 2) {
                i11 |= 2;
            }
            protoBuf$PackageFragment.f39171e = this.f39178f;
            if ((i10 & 4) == 4) {
                i11 |= 4;
            }
            protoBuf$PackageFragment.f39172f = this.f39179g;
            if ((i10 & 8) == 8) {
                this.f39180h = Collections.unmodifiableList(this.f39180h);
                this.f39176d &= -9;
            }
            protoBuf$PackageFragment.f39173g = this.f39180h;
            protoBuf$PackageFragment.f39169c = i11;
            return protoBuf$PackageFragment;
        }

        /* JADX INFO: renamed from: n */
        public final void m13829n(ProtoBuf$PackageFragment protoBuf$PackageFragment) {
            ProtoBuf$Package protoBuf$Package;
            ProtoBuf$QualifiedNameTable protoBuf$QualifiedNameTable;
            ProtoBuf$StringTable protoBuf$StringTable;
            if (protoBuf$PackageFragment == ProtoBuf$PackageFragment.f39166j) {
                return;
            }
            boolean z10 = true;
            if ((protoBuf$PackageFragment.f39169c & 1) == 1) {
                ProtoBuf$StringTable protoBuf$StringTable2 = protoBuf$PackageFragment.f39170d;
                if ((this.f39176d & 1) != 1 || (protoBuf$StringTable = this.f39177e) == ProtoBuf$StringTable.f39238e) {
                    this.f39177e = protoBuf$StringTable2;
                } else {
                    ProtoBuf$StringTable.C6946b c6946b = new ProtoBuf$StringTable.C6946b();
                    c6946b.m13842m(protoBuf$StringTable);
                    c6946b.m13842m(protoBuf$StringTable2);
                    this.f39177e = c6946b.m13841k();
                }
                this.f39176d |= 1;
            }
            if ((protoBuf$PackageFragment.f39169c & 2) == 2) {
                ProtoBuf$QualifiedNameTable protoBuf$QualifiedNameTable2 = protoBuf$PackageFragment.f39171e;
                if ((this.f39176d & 2) != 2 || (protoBuf$QualifiedNameTable = this.f39178f) == ProtoBuf$QualifiedNameTable.f39217e) {
                    this.f39178f = protoBuf$QualifiedNameTable2;
                } else {
                    ProtoBuf$QualifiedNameTable.C6944b c6944b = new ProtoBuf$QualifiedNameTable.C6944b();
                    c6944b.m13839m(protoBuf$QualifiedNameTable);
                    c6944b.m13839m(protoBuf$QualifiedNameTable2);
                    this.f39178f = c6944b.m13838k();
                }
                this.f39176d |= 2;
            }
            if ((protoBuf$PackageFragment.f39169c & 4) != 4) {
                z10 = false;
            }
            if (z10) {
                ProtoBuf$Package protoBuf$Package2 = protoBuf$PackageFragment.f39172f;
                if ((this.f39176d & 4) != 4 || (protoBuf$Package = this.f39179g) == ProtoBuf$Package.f39149k) {
                    this.f39179g = protoBuf$Package2;
                } else {
                    ProtoBuf$Package.C6935b c6935b = new ProtoBuf$Package.C6935b();
                    c6935b.m13826n(protoBuf$Package);
                    c6935b.m13826n(protoBuf$Package2);
                    this.f39179g = c6935b.m13825m();
                }
                this.f39176d |= 4;
            }
            if (!protoBuf$PackageFragment.f39173g.isEmpty()) {
                if (this.f39180h.isEmpty()) {
                    this.f39180h = protoBuf$PackageFragment.f39173g;
                    this.f39176d &= -9;
                } else {
                    if ((this.f39176d & 8) != 8) {
                        this.f39180h = new ArrayList(this.f39180h);
                        this.f39176d |= 8;
                    }
                    this.f39180h.addAll(protoBuf$PackageFragment.f39173g);
                }
            }
            m13928k(protoBuf$PackageFragment);
            this.f39493a = this.f39493a.m15519f(protoBuf$PackageFragment.f39168b);
        }

        /* JADX WARN: Code duplicated, block: B:17:0x0021  */
        /* JADX INFO: renamed from: o */
        public final void m13830o(C6992c c6992c, C6993d c6993d) throws Throwable {
            ProtoBuf$PackageFragment protoBuf$PackageFragment;
            try {
                try {
                    ProtoBuf$PackageFragment.f39167k.getClass();
                    m13829n(new ProtoBuf$PackageFragment(c6992c, c6993d));
                } catch (InvalidProtocolBufferException e10) {
                    protoBuf$PackageFragment = (ProtoBuf$PackageFragment) e10.f39506a;
                    try {
                        throw e10;
                    } catch (Throwable th2) {
                        th = th2;
                        if (protoBuf$PackageFragment != null) {
                            m13829n(protoBuf$PackageFragment);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                protoBuf$PackageFragment = null;
                if (protoBuf$PackageFragment != null) {
                    m13829n(protoBuf$PackageFragment);
                }
                throw th;
            }
        }
    }

    static {
        ProtoBuf$PackageFragment protoBuf$PackageFragment = new ProtoBuf$PackageFragment(0);
        f39166j = protoBuf$PackageFragment;
        protoBuf$PackageFragment.f39170d = ProtoBuf$StringTable.f39238e;
        protoBuf$PackageFragment.f39171e = ProtoBuf$QualifiedNameTable.f39217e;
        protoBuf$PackageFragment.f39172f = ProtoBuf$Package.f39149k;
        protoBuf$PackageFragment.f39173g = Collections.emptyList();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public ProtoBuf$PackageFragment() {
        throw null;
    }

    public ProtoBuf$PackageFragment(int i10) {
        this.f39174h = (byte) -1;
        this.f39175i = -1;
        this.f39168b = AbstractC7803a.f42882a;
    }

    public ProtoBuf$PackageFragment(GeneratedMessageLite.AbstractC6983c abstractC6983c) {
        super(abstractC6983c);
        this.f39174h = (byte) -1;
        this.f39175i = -1;
        this.f39168b = abstractC6983c.f39493a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public ProtoBuf$PackageFragment(C6992c c6992c, C6993d c6993d) throws InvalidProtocolBufferException {
        this.f39174h = (byte) -1;
        this.f39175i = -1;
        this.f39170d = ProtoBuf$StringTable.f39238e;
        this.f39171e = ProtoBuf$QualifiedNameTable.f39217e;
        this.f39172f = ProtoBuf$Package.f39149k;
        this.f39173g = Collections.emptyList();
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
                            ProtoBuf$Package.C6935b c6935b = null;
                            if (iM13952n == 10) {
                                ProtoBuf$StringTable.C6946b c6946b = c6935b;
                                if ((this.f39169c & 1) == 1) {
                                    ProtoBuf$StringTable protoBuf$StringTable = this.f39170d;
                                    protoBuf$StringTable.getClass();
                                    ProtoBuf$StringTable.C6946b c6946b2 = new ProtoBuf$StringTable.C6946b();
                                    c6946b2.m13842m(protoBuf$StringTable);
                                    c6946b = c6946b2;
                                }
                                ProtoBuf$StringTable protoBuf$StringTable2 = (ProtoBuf$StringTable) c6992c.m13945g(ProtoBuf$StringTable.f39239f, c6993d);
                                this.f39170d = protoBuf$StringTable2;
                                if (c6946b != 0) {
                                    c6946b.m13842m(protoBuf$StringTable2);
                                    this.f39170d = c6946b.m13841k();
                                }
                                this.f39169c |= 1;
                            } else if (iM13952n == 18) {
                                ProtoBuf$QualifiedNameTable.C6944b c6944b = c6935b;
                                if ((this.f39169c & 2) == 2) {
                                    ProtoBuf$QualifiedNameTable protoBuf$QualifiedNameTable = this.f39171e;
                                    protoBuf$QualifiedNameTable.getClass();
                                    ProtoBuf$QualifiedNameTable.C6944b c6944b2 = new ProtoBuf$QualifiedNameTable.C6944b();
                                    c6944b2.m13839m(protoBuf$QualifiedNameTable);
                                    c6944b = c6944b2;
                                }
                                ProtoBuf$QualifiedNameTable protoBuf$QualifiedNameTable2 = (ProtoBuf$QualifiedNameTable) c6992c.m13945g(ProtoBuf$QualifiedNameTable.f39218f, c6993d);
                                this.f39171e = protoBuf$QualifiedNameTable2;
                                if (c6944b != 0) {
                                    c6944b.m13839m(protoBuf$QualifiedNameTable2);
                                    this.f39171e = c6944b.m13838k();
                                }
                                this.f39169c |= 2;
                            } else if (iM13952n == 26) {
                                ProtoBuf$Package.C6935b c6935b2 = c6935b;
                                if ((this.f39169c & 4) == 4) {
                                    ProtoBuf$Package protoBuf$Package = this.f39172f;
                                    protoBuf$Package.getClass();
                                    ProtoBuf$Package.C6935b c6935b3 = new ProtoBuf$Package.C6935b();
                                    c6935b3.m13826n(protoBuf$Package);
                                    c6935b2 = c6935b3;
                                }
                                ProtoBuf$Package protoBuf$Package2 = (ProtoBuf$Package) c6992c.m13945g(ProtoBuf$Package.f39150l, c6993d);
                                this.f39172f = protoBuf$Package2;
                                if (c6935b2 != null) {
                                    c6935b2.m13826n(protoBuf$Package2);
                                    this.f39172f = c6935b2.m13825m();
                                }
                                this.f39169c |= 4;
                            } else if (iM13952n == 34) {
                                if ((i10 & 8) != 8) {
                                    this.f39173g = new ArrayList();
                                    i10 |= 8;
                                }
                                this.f39173g.add((ProtoBuf$Class) c6992c.m13945g(ProtoBuf$Class.f38987f0, c6993d));
                            } else if (!m13925x(c6992c, codedOutputStreamM13901j, c6993d, iM13952n)) {
                            }
                        }
                        z10 = true;
                    } catch (Throwable th2) {
                        if ((i10 & 8) == 8) {
                            this.f39173g = Collections.unmodifiableList(this.f39173g);
                        }
                        try {
                            codedOutputStreamM13901j.m13902i();
                        } catch (IOException unused) {
                        } catch (Throwable th3) {
                            this.f39168b = bVar.m15533l();
                            throw th3;
                        }
                        this.f39168b = bVar.m15533l();
                        m13923t();
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
        if ((i10 & 8) == 8) {
            this.f39173g = Collections.unmodifiableList(this.f39173g);
        }
        try {
            codedOutputStreamM13901j.m13902i();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f39168b = bVar.m15533l();
            throw th4;
        }
        this.f39168b = bVar.m15533l();
        m13923t();
    }

    @Override // p282nn.InterfaceC7808f
    /* JADX INFO: renamed from: b */
    public final boolean mo13780b() {
        byte b10 = this.f39174h;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        if (((this.f39169c & 2) == 2) && !this.f39171e.mo13780b()) {
            this.f39174h = (byte) 0;
            return false;
        }
        if (((this.f39169c & 4) == 4) && !this.f39172f.mo13780b()) {
            this.f39174h = (byte) 0;
            return false;
        }
        for (int i10 = 0; i10 < this.f39173g.size(); i10++) {
            if (!this.f39173g.get(i10).mo13780b()) {
                this.f39174h = (byte) 0;
                return false;
            }
        }
        if (m13919n()) {
            this.f39174h = (byte) 1;
            return true;
        }
        this.f39174h = (byte) 0;
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC6997h
    /* JADX INFO: renamed from: c */
    public final InterfaceC6997h.a mo13781c() {
        C6937b c6937b = new C6937b();
        c6937b.m13829n(this);
        return c6937b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC6997h
    /* JADX INFO: renamed from: d */
    public final int mo13782d() {
        int i10 = this.f39175i;
        if (i10 != -1) {
            return i10;
        }
        int iM13896d = (this.f39169c & 1) == 1 ? CodedOutputStream.m13896d(1, this.f39170d) + 0 : 0;
        if ((this.f39169c & 2) == 2) {
            iM13896d += CodedOutputStream.m13896d(2, this.f39171e);
        }
        if ((this.f39169c & 4) == 4) {
            iM13896d += CodedOutputStream.m13896d(3, this.f39172f);
        }
        for (int i11 = 0; i11 < this.f39173g.size(); i11++) {
            iM13896d += CodedOutputStream.m13896d(4, this.f39173g.get(i11));
        }
        int size = this.f39168b.size() + m13920q() + iM13896d;
        this.f39175i = size;
        return size;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC6997h
    /* JADX INFO: renamed from: e */
    public final InterfaceC6997h.a mo13783e() {
        return new C6937b();
    }

    @Override // p282nn.InterfaceC7808f
    /* JADX INFO: renamed from: h */
    public final InterfaceC6997h mo13802h() {
        return f39166j;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC6997h
    /* JADX INFO: renamed from: j */
    public final void mo13784j(CodedOutputStream codedOutputStream) throws IOException {
        mo13782d();
        GeneratedMessageLite.ExtendableMessage.C6980a c6980a = new GeneratedMessageLite.ExtendableMessage.C6980a(this);
        if ((this.f39169c & 1) == 1) {
            codedOutputStream.m13907o(1, this.f39170d);
        }
        if ((this.f39169c & 2) == 2) {
            codedOutputStream.m13907o(2, this.f39171e);
        }
        if ((this.f39169c & 4) == 4) {
            codedOutputStream.m13907o(3, this.f39172f);
        }
        for (int i10 = 0; i10 < this.f39173g.size(); i10++) {
            codedOutputStream.m13907o(4, this.f39173g.get(i10));
        }
        c6980a.m13927a(200, codedOutputStream);
        codedOutputStream.m13910r(this.f39168b);
    }
}
