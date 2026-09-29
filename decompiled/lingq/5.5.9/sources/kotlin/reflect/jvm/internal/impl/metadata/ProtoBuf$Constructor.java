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
public final class ProtoBuf$Constructor extends GeneratedMessageLite.ExtendableMessage<ProtoBuf$Constructor> {

    /* JADX INFO: renamed from: i */
    public static final ProtoBuf$Constructor f39047i;

    /* JADX INFO: renamed from: j */
    public static final C6917a f39048j = new C6917a();

    /* JADX INFO: renamed from: b */
    public final AbstractC7803a f39049b;

    /* JADX INFO: renamed from: c */
    public int f39050c;

    /* JADX INFO: renamed from: d */
    public int f39051d;

    /* JADX INFO: renamed from: e */
    public List<ProtoBuf$ValueParameter> f39052e;

    /* JADX INFO: renamed from: f */
    public List<Integer> f39053f;

    /* JADX INFO: renamed from: g */
    public byte f39054g;

    /* JADX INFO: renamed from: h */
    public int f39055h;

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Constructor$a */
    public static class C6917a extends AbstractC6991b<ProtoBuf$Constructor> {
        @Override // p282nn.InterfaceC7809g
        /* JADX INFO: renamed from: a */
        public final Object mo13787a(C6992c c6992c, C6993d c6993d) throws InvalidProtocolBufferException {
            return new ProtoBuf$Constructor(c6992c, c6993d);
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Constructor$b */
    public static final class C6918b extends GeneratedMessageLite.AbstractC6983c<ProtoBuf$Constructor, C6918b> {

        /* JADX INFO: renamed from: d */
        public int f39056d;

        /* JADX INFO: renamed from: e */
        public int f39057e = 6;

        /* JADX INFO: renamed from: f */
        public List<ProtoBuf$ValueParameter> f39058f = Collections.emptyList();

        /* JADX INFO: renamed from: g */
        public List<Integer> f39059g = Collections.emptyList();

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC6990a.a, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC6997h.a
        /* JADX INFO: renamed from: Q */
        public final /* bridge */ /* synthetic */ InterfaceC6997h.a mo13788Q(C6992c c6992c, C6993d c6993d) throws Throwable {
            m13809o(c6992c, c6993d);
            return this;
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC6997h.a
        /* JADX INFO: renamed from: a */
        public final InterfaceC6997h mo13789a() {
            ProtoBuf$Constructor protoBuf$ConstructorM13807m = m13807m();
            if (protoBuf$ConstructorM13807m.mo13780b()) {
                return protoBuf$ConstructorM13807m;
            }
            throw new UninitializedMessageException();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.AbstractC6982b
        public final Object clone() throws CloneNotSupportedException {
            C6918b c6918b = new C6918b();
            c6918b.m13808n(m13807m());
            return c6918b;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC6990a.a
        /* JADX INFO: renamed from: f */
        public final /* bridge */ /* synthetic */ AbstractC6990a.a mo13788Q(C6992c c6992c, C6993d c6993d) throws Throwable {
            m13809o(c6992c, c6993d);
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.AbstractC6982b
        /* JADX INFO: renamed from: g */
        public final GeneratedMessageLite.AbstractC6982b clone() {
            C6918b c6918b = new C6918b();
            c6918b.m13808n(m13807m());
            return c6918b;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.AbstractC6982b
        /* JADX INFO: renamed from: i */
        public final /* bridge */ /* synthetic */ GeneratedMessageLite.AbstractC6982b mo13792i(GeneratedMessageLite generatedMessageLite) {
            m13808n((ProtoBuf$Constructor) generatedMessageLite);
            return this;
        }

        /* JADX INFO: renamed from: m */
        public final ProtoBuf$Constructor m13807m() {
            ProtoBuf$Constructor protoBuf$Constructor = new ProtoBuf$Constructor(this);
            int i10 = this.f39056d;
            int i11 = (i10 & 1) != 1 ? 0 : 1;
            protoBuf$Constructor.f39051d = this.f39057e;
            if ((i10 & 2) == 2) {
                this.f39058f = Collections.unmodifiableList(this.f39058f);
                this.f39056d &= -3;
            }
            protoBuf$Constructor.f39052e = this.f39058f;
            if ((this.f39056d & 4) == 4) {
                this.f39059g = Collections.unmodifiableList(this.f39059g);
                this.f39056d &= -5;
            }
            protoBuf$Constructor.f39053f = this.f39059g;
            protoBuf$Constructor.f39050c = i11;
            return protoBuf$Constructor;
        }

        /* JADX INFO: renamed from: n */
        public final void m13808n(ProtoBuf$Constructor protoBuf$Constructor) {
            if (protoBuf$Constructor == ProtoBuf$Constructor.f39047i) {
                return;
            }
            if ((protoBuf$Constructor.f39050c & 1) == 1) {
                int i10 = protoBuf$Constructor.f39051d;
                this.f39056d = 1 | this.f39056d;
                this.f39057e = i10;
            }
            if (!protoBuf$Constructor.f39052e.isEmpty()) {
                if (this.f39058f.isEmpty()) {
                    this.f39058f = protoBuf$Constructor.f39052e;
                    this.f39056d &= -3;
                } else {
                    if ((this.f39056d & 2) != 2) {
                        this.f39058f = new ArrayList(this.f39058f);
                        this.f39056d |= 2;
                    }
                    this.f39058f.addAll(protoBuf$Constructor.f39052e);
                }
            }
            if (!protoBuf$Constructor.f39053f.isEmpty()) {
                if (this.f39059g.isEmpty()) {
                    this.f39059g = protoBuf$Constructor.f39053f;
                    this.f39056d &= -5;
                } else {
                    if ((this.f39056d & 4) != 4) {
                        this.f39059g = new ArrayList(this.f39059g);
                        this.f39056d |= 4;
                    }
                    this.f39059g.addAll(protoBuf$Constructor.f39053f);
                }
            }
            m13928k(protoBuf$Constructor);
            this.f39493a = this.f39493a.m15519f(protoBuf$Constructor.f39049b);
        }

        /* JADX WARN: Code duplicated, block: B:15:0x001b  */
        /* JADX INFO: renamed from: o */
        public final void m13809o(C6992c c6992c, C6993d c6993d) throws Throwable {
            ProtoBuf$Constructor protoBuf$Constructor;
            try {
                try {
                    m13808n((ProtoBuf$Constructor) ProtoBuf$Constructor.f39048j.mo13787a(c6992c, c6993d));
                } catch (InvalidProtocolBufferException e10) {
                    protoBuf$Constructor = (ProtoBuf$Constructor) e10.f39506a;
                    try {
                        throw e10;
                    } catch (Throwable th2) {
                        th = th2;
                        if (protoBuf$Constructor != null) {
                            m13808n(protoBuf$Constructor);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                protoBuf$Constructor = null;
                if (protoBuf$Constructor != null) {
                    m13808n(protoBuf$Constructor);
                }
                throw th;
            }
        }
    }

    static {
        ProtoBuf$Constructor protoBuf$Constructor = new ProtoBuf$Constructor(0);
        f39047i = protoBuf$Constructor;
        protoBuf$Constructor.f39051d = 6;
        protoBuf$Constructor.f39052e = Collections.emptyList();
        protoBuf$Constructor.f39053f = Collections.emptyList();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public ProtoBuf$Constructor() {
        throw null;
    }

    public ProtoBuf$Constructor(int i10) {
        this.f39054g = (byte) -1;
        this.f39055h = -1;
        this.f39049b = AbstractC7803a.f42882a;
    }

    public ProtoBuf$Constructor(GeneratedMessageLite.AbstractC6983c abstractC6983c) {
        super(abstractC6983c);
        this.f39054g = (byte) -1;
        this.f39055h = -1;
        this.f39049b = abstractC6983c.f39493a;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    public ProtoBuf$Constructor(C6992c c6992c, C6993d c6993d) throws InvalidProtocolBufferException {
        this.f39054g = (byte) -1;
        this.f39055h = -1;
        this.f39051d = 6;
        this.f39052e = Collections.emptyList();
        this.f39053f = Collections.emptyList();
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
                            if (iM13952n == 8) {
                                this.f39050c |= 1;
                                this.f39051d = c6992c.m13949k();
                            } else if (iM13952n == 18) {
                                if ((i10 & 2) != 2) {
                                    this.f39052e = new ArrayList();
                                    i10 |= 2;
                                }
                                this.f39052e.add((ProtoBuf$ValueParameter) c6992c.m13945g(ProtoBuf$ValueParameter.f39352H, c6993d));
                            } else if (iM13952n == 248) {
                                if ((i10 & 4) != 4) {
                                    this.f39053f = new ArrayList();
                                    i10 |= 4;
                                }
                                this.f39053f.add(Integer.valueOf(c6992c.m13949k()));
                            } else if (iM13952n == 250) {
                                int iM13942d = c6992c.m13942d(c6992c.m13949k());
                                if ((i10 & 4) != 4 && c6992c.m13940b() > 0) {
                                    this.f39053f = new ArrayList();
                                    i10 |= 4;
                                }
                                while (c6992c.m13940b() > 0) {
                                    this.f39053f.add(Integer.valueOf(c6992c.m13949k()));
                                }
                                c6992c.m13941c(iM13942d);
                            } else if (!m13925x(c6992c, codedOutputStreamM13901j, c6993d, iM13952n)) {
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
                    if ((i10 & 2) == 2) {
                        this.f39052e = Collections.unmodifiableList(this.f39052e);
                    }
                    if ((i10 & 4) == 4) {
                        this.f39053f = Collections.unmodifiableList(this.f39053f);
                    }
                    try {
                        codedOutputStreamM13901j.m13902i();
                    } catch (IOException unused) {
                    } catch (Throwable th3) {
                        this.f39049b = bVar.m15533l();
                        throw th3;
                    }
                    this.f39049b = bVar.m15533l();
                    m13923t();
                    throw th2;
                }
            }
        }
        if ((i10 & 2) == 2) {
            this.f39052e = Collections.unmodifiableList(this.f39052e);
        }
        if ((i10 & 4) == 4) {
            this.f39053f = Collections.unmodifiableList(this.f39053f);
        }
        try {
            codedOutputStreamM13901j.m13902i();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f39049b = bVar.m15533l();
            throw th4;
        }
        this.f39049b = bVar.m15533l();
        m13923t();
    }

    @Override // p282nn.InterfaceC7808f
    /* JADX INFO: renamed from: b */
    public final boolean mo13780b() {
        byte b10 = this.f39054g;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        for (int i10 = 0; i10 < this.f39052e.size(); i10++) {
            if (!this.f39052e.get(i10).mo13780b()) {
                this.f39054g = (byte) 0;
                return false;
            }
        }
        if (m13919n()) {
            this.f39054g = (byte) 1;
            return true;
        }
        this.f39054g = (byte) 0;
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC6997h
    /* JADX INFO: renamed from: c */
    public final InterfaceC6997h.a mo13781c() {
        C6918b c6918b = new C6918b();
        c6918b.m13808n(this);
        return c6918b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC6997h
    /* JADX INFO: renamed from: d */
    public final int mo13782d() {
        int i10 = this.f39055h;
        if (i10 != -1) {
            return i10;
        }
        int iM13894b = (this.f39050c & 1) == 1 ? CodedOutputStream.m13894b(1, this.f39051d) + 0 : 0;
        for (int i11 = 0; i11 < this.f39052e.size(); i11++) {
            iM13894b += CodedOutputStream.m13896d(2, this.f39052e.get(i11));
        }
        int iM13895c = 0;
        for (int i12 = 0; i12 < this.f39053f.size(); i12++) {
            iM13895c += CodedOutputStream.m13895c(this.f39053f.get(i12).intValue());
        }
        int size = this.f39049b.size() + m13920q() + (this.f39053f.size() * 2) + iM13894b + iM13895c;
        this.f39055h = size;
        return size;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC6997h
    /* JADX INFO: renamed from: e */
    public final InterfaceC6997h.a mo13783e() {
        return new C6918b();
    }

    @Override // p282nn.InterfaceC7808f
    /* JADX INFO: renamed from: h */
    public final InterfaceC6997h mo13802h() {
        return f39047i;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC6997h
    /* JADX INFO: renamed from: j */
    public final void mo13784j(CodedOutputStream codedOutputStream) throws IOException {
        mo13782d();
        GeneratedMessageLite.ExtendableMessage.C6980a c6980a = new GeneratedMessageLite.ExtendableMessage.C6980a(this);
        if ((this.f39050c & 1) == 1) {
            codedOutputStream.m13905m(1, this.f39051d);
        }
        for (int i10 = 0; i10 < this.f39052e.size(); i10++) {
            codedOutputStream.m13907o(2, this.f39052e.get(i10));
        }
        for (int i11 = 0; i11 < this.f39053f.size(); i11++) {
            codedOutputStream.m13905m(31, this.f39053f.get(i11).intValue());
        }
        c6980a.m13927a(19000, codedOutputStream);
        codedOutputStream.m13910r(this.f39049b);
    }
}
