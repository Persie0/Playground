package kotlin.reflect.jvm.internal.impl.metadata;

import java.io.IOException;
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
public final class ProtoBuf$VersionRequirement extends GeneratedMessageLite implements InterfaceC7808f {

    /* JADX INFO: renamed from: k */
    public static final ProtoBuf$VersionRequirement f39371k;

    /* JADX INFO: renamed from: l */
    public static final C6963a f39372l = new C6963a();

    /* JADX INFO: renamed from: a */
    public final AbstractC7803a f39373a;

    /* JADX INFO: renamed from: b */
    public int f39374b;

    /* JADX INFO: renamed from: c */
    public int f39375c;

    /* JADX INFO: renamed from: d */
    public int f39376d;

    /* JADX INFO: renamed from: e */
    public Level f39377e;

    /* JADX INFO: renamed from: f */
    public int f39378f;

    /* JADX INFO: renamed from: g */
    public int f39379g;

    /* JADX INFO: renamed from: h */
    public VersionKind f39380h;

    /* JADX INFO: renamed from: i */
    public byte f39381i;

    /* JADX INFO: renamed from: j */
    public int f39382j;

    public enum Level implements C6995f.a {
        WARNING(0, 0),
        ERROR(1, 1),
        HIDDEN(2, 2);

        private static C6995f.b<Level> internalValueMap = new C6961a();
        private final int value;

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirement$Level$a */
        public static class C6961a implements C6995f.b<Level> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.C6995f.b
            /* JADX INFO: renamed from: a */
            public final C6995f.a mo13786a(int i10) {
                return Level.valueOf(i10);
            }
        }

        Level(int i10, int i11) {
            this.value = i11;
        }

        public static Level valueOf(int i10) {
            if (i10 == 0) {
                return WARNING;
            }
            if (i10 == 1) {
                return ERROR;
            }
            if (i10 != 2) {
                return null;
            }
            return HIDDEN;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.C6995f.a
        public final int getNumber() {
            return this.value;
        }
    }

    public enum VersionKind implements C6995f.a {
        LANGUAGE_VERSION(0, 0),
        COMPILER_VERSION(1, 1),
        API_VERSION(2, 2);

        private static C6995f.b<VersionKind> internalValueMap = new C6962a();
        private final int value;

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirement$VersionKind$a */
        public static class C6962a implements C6995f.b<VersionKind> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.C6995f.b
            /* JADX INFO: renamed from: a */
            public final C6995f.a mo13786a(int i10) {
                return VersionKind.valueOf(i10);
            }
        }

        VersionKind(int i10, int i11) {
            this.value = i11;
        }

        public static VersionKind valueOf(int i10) {
            if (i10 == 0) {
                return LANGUAGE_VERSION;
            }
            if (i10 == 1) {
                return COMPILER_VERSION;
            }
            if (i10 != 2) {
                return null;
            }
            return API_VERSION;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.C6995f.a
        public final int getNumber() {
            return this.value;
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirement$a */
    public static class C6963a extends AbstractC6991b<ProtoBuf$VersionRequirement> {
        @Override // p282nn.InterfaceC7809g
        /* JADX INFO: renamed from: a */
        public final Object mo13787a(C6992c c6992c, C6993d c6993d) throws InvalidProtocolBufferException {
            return new ProtoBuf$VersionRequirement(c6992c);
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirement$b */
    public static final class C6964b extends GeneratedMessageLite.AbstractC6982b<ProtoBuf$VersionRequirement, C6964b> implements InterfaceC7808f {

        /* JADX INFO: renamed from: b */
        public int f39383b;

        /* JADX INFO: renamed from: c */
        public int f39384c;

        /* JADX INFO: renamed from: d */
        public int f39385d;

        /* JADX INFO: renamed from: f */
        public int f39387f;

        /* JADX INFO: renamed from: g */
        public int f39388g;

        /* JADX INFO: renamed from: e */
        public Level f39386e = Level.ERROR;

        /* JADX INFO: renamed from: h */
        public VersionKind f39389h = VersionKind.LANGUAGE_VERSION;

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC6990a.a, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC6997h.a
        /* JADX INFO: renamed from: Q */
        public final /* bridge */ /* synthetic */ InterfaceC6997h.a mo13788Q(C6992c c6992c, C6993d c6993d) throws Throwable {
            m13871n(c6992c, c6993d);
            return this;
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC6997h.a
        /* JADX INFO: renamed from: a */
        public final InterfaceC6997h mo13789a() {
            ProtoBuf$VersionRequirement protoBuf$VersionRequirementM13869k = m13869k();
            if (protoBuf$VersionRequirementM13869k.mo13780b()) {
                return protoBuf$VersionRequirementM13869k;
            }
            throw new UninitializedMessageException();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.AbstractC6982b
        public final Object clone() throws CloneNotSupportedException {
            C6964b c6964b = new C6964b();
            c6964b.m13870m(m13869k());
            return c6964b;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC6990a.a
        /* JADX INFO: renamed from: f */
        public final /* bridge */ /* synthetic */ AbstractC6990a.a mo13788Q(C6992c c6992c, C6993d c6993d) throws Throwable {
            m13871n(c6992c, c6993d);
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.AbstractC6982b
        /* JADX INFO: renamed from: g */
        public final GeneratedMessageLite.AbstractC6982b clone() {
            C6964b c6964b = new C6964b();
            c6964b.m13870m(m13869k());
            return c6964b;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.AbstractC6982b
        /* JADX INFO: renamed from: i */
        public final /* bridge */ /* synthetic */ GeneratedMessageLite.AbstractC6982b mo13792i(GeneratedMessageLite generatedMessageLite) {
            m13870m((ProtoBuf$VersionRequirement) generatedMessageLite);
            return this;
        }

        /* JADX INFO: renamed from: k */
        public final ProtoBuf$VersionRequirement m13869k() {
            ProtoBuf$VersionRequirement protoBuf$VersionRequirement = new ProtoBuf$VersionRequirement(this);
            int i10 = this.f39383b;
            int i11 = (i10 & 1) != 1 ? 0 : 1;
            protoBuf$VersionRequirement.f39375c = this.f39384c;
            if ((i10 & 2) == 2) {
                i11 |= 2;
            }
            protoBuf$VersionRequirement.f39376d = this.f39385d;
            if ((i10 & 4) == 4) {
                i11 |= 4;
            }
            protoBuf$VersionRequirement.f39377e = this.f39386e;
            if ((i10 & 8) == 8) {
                i11 |= 8;
            }
            protoBuf$VersionRequirement.f39378f = this.f39387f;
            if ((i10 & 16) == 16) {
                i11 |= 16;
            }
            protoBuf$VersionRequirement.f39379g = this.f39388g;
            if ((i10 & 32) == 32) {
                i11 |= 32;
            }
            protoBuf$VersionRequirement.f39380h = this.f39389h;
            protoBuf$VersionRequirement.f39374b = i11;
            return protoBuf$VersionRequirement;
        }

        /* JADX INFO: renamed from: m */
        public final void m13870m(ProtoBuf$VersionRequirement protoBuf$VersionRequirement) {
            if (protoBuf$VersionRequirement == ProtoBuf$VersionRequirement.f39371k) {
                return;
            }
            int i10 = protoBuf$VersionRequirement.f39374b;
            boolean z10 = true;
            if ((i10 & 1) == 1) {
                int i11 = protoBuf$VersionRequirement.f39375c;
                this.f39383b |= 1;
                this.f39384c = i11;
            }
            if ((i10 & 2) == 2) {
                int i12 = protoBuf$VersionRequirement.f39376d;
                this.f39383b = 2 | this.f39383b;
                this.f39385d = i12;
            }
            if ((i10 & 4) == 4) {
                Level level = protoBuf$VersionRequirement.f39377e;
                level.getClass();
                this.f39383b = 4 | this.f39383b;
                this.f39386e = level;
            }
            int i13 = protoBuf$VersionRequirement.f39374b;
            if ((i13 & 8) == 8) {
                int i14 = protoBuf$VersionRequirement.f39378f;
                this.f39383b = 8 | this.f39383b;
                this.f39387f = i14;
            }
            if ((i13 & 16) == 16) {
                int i15 = protoBuf$VersionRequirement.f39379g;
                this.f39383b = 16 | this.f39383b;
                this.f39388g = i15;
            }
            if ((i13 & 32) != 32) {
                z10 = false;
            }
            if (z10) {
                VersionKind versionKind = protoBuf$VersionRequirement.f39380h;
                versionKind.getClass();
                this.f39383b = 32 | this.f39383b;
                this.f39389h = versionKind;
            }
            this.f39493a = this.f39493a.m15519f(protoBuf$VersionRequirement.f39373a);
        }

        /* JADX WARN: Code duplicated, block: B:15:0x001f  */
        /* JADX INFO: renamed from: n */
        public final void m13871n(C6992c c6992c, C6993d c6993d) throws Throwable {
            ProtoBuf$VersionRequirement protoBuf$VersionRequirement;
            try {
                try {
                    ProtoBuf$VersionRequirement.f39372l.getClass();
                    m13870m(new ProtoBuf$VersionRequirement(c6992c));
                } catch (InvalidProtocolBufferException e10) {
                    protoBuf$VersionRequirement = (ProtoBuf$VersionRequirement) e10.f39506a;
                    try {
                        throw e10;
                    } catch (Throwable th2) {
                        th = th2;
                        if (protoBuf$VersionRequirement != null) {
                            m13870m(protoBuf$VersionRequirement);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                protoBuf$VersionRequirement = null;
                if (protoBuf$VersionRequirement != null) {
                    m13870m(protoBuf$VersionRequirement);
                }
                throw th;
            }
        }
    }

    static {
        ProtoBuf$VersionRequirement protoBuf$VersionRequirement = new ProtoBuf$VersionRequirement();
        f39371k = protoBuf$VersionRequirement;
        protoBuf$VersionRequirement.f39375c = 0;
        protoBuf$VersionRequirement.f39376d = 0;
        protoBuf$VersionRequirement.f39377e = Level.ERROR;
        protoBuf$VersionRequirement.f39378f = 0;
        protoBuf$VersionRequirement.f39379g = 0;
        protoBuf$VersionRequirement.f39380h = VersionKind.LANGUAGE_VERSION;
    }

    public ProtoBuf$VersionRequirement() {
        this.f39381i = (byte) -1;
        this.f39382j = -1;
        this.f39373a = AbstractC7803a.f42882a;
    }

    public ProtoBuf$VersionRequirement(GeneratedMessageLite.AbstractC6982b abstractC6982b) {
        super(0);
        this.f39381i = (byte) -1;
        this.f39382j = -1;
        this.f39373a = abstractC6982b.f39493a;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public ProtoBuf$VersionRequirement(C6992c c6992c) throws InvalidProtocolBufferException {
        this.f39381i = (byte) -1;
        this.f39382j = -1;
        boolean z10 = false;
        this.f39375c = 0;
        this.f39376d = 0;
        this.f39377e = Level.ERROR;
        this.f39378f = 0;
        this.f39379g = 0;
        this.f39380h = VersionKind.LANGUAGE_VERSION;
        AbstractC7803a.b bVar = new AbstractC7803a.b();
        CodedOutputStream codedOutputStreamM13901j = CodedOutputStream.m13901j(bVar, 1);
        loop0: while (true) {
            while (true) {
                if (z10) {
                    try {
                        break loop0;
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.f39373a = bVar.m15533l();
                        throw th2;
                    }
                } else {
                    try {
                        try {
                            try {
                                int iM13952n = c6992c.m13952n();
                                if (iM13952n != 0) {
                                    if (iM13952n == 8) {
                                        this.f39374b |= 1;
                                        this.f39375c = c6992c.m13949k();
                                    } else if (iM13952n == 16) {
                                        this.f39374b |= 2;
                                        this.f39376d = c6992c.m13949k();
                                    } else if (iM13952n == 24) {
                                        int iM13949k = c6992c.m13949k();
                                        Level levelValueOf = Level.valueOf(iM13949k);
                                        if (levelValueOf == null) {
                                            codedOutputStreamM13901j.m13914v(iM13952n);
                                            codedOutputStreamM13901j.m13914v(iM13949k);
                                        } else {
                                            this.f39374b |= 4;
                                            this.f39377e = levelValueOf;
                                        }
                                    } else if (iM13952n == 32) {
                                        this.f39374b |= 8;
                                        this.f39378f = c6992c.m13949k();
                                    } else if (iM13952n == 40) {
                                        this.f39374b |= 16;
                                        this.f39379g = c6992c.m13949k();
                                    } else if (iM13952n == 48) {
                                        int iM13949k2 = c6992c.m13949k();
                                        VersionKind versionKindValueOf = VersionKind.valueOf(iM13949k2);
                                        if (versionKindValueOf == null) {
                                            codedOutputStreamM13901j.m13914v(iM13952n);
                                            codedOutputStreamM13901j.m13914v(iM13949k2);
                                        } else {
                                            this.f39374b |= 32;
                                            this.f39380h = versionKindValueOf;
                                        }
                                    } else if (!c6992c.m13955q(iM13952n, codedOutputStreamM13901j)) {
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
                    } catch (Throwable th3) {
                        try {
                            codedOutputStreamM13901j.m13902i();
                        } catch (IOException unused2) {
                        } catch (Throwable th4) {
                            this.f39373a = bVar.m15533l();
                            throw th4;
                        }
                        this.f39373a = bVar.m15533l();
                        throw th3;
                    }
                }
            }
        }
        codedOutputStreamM13901j.m13902i();
        this.f39373a = bVar.m15533l();
    }

    @Override // p282nn.InterfaceC7808f
    /* JADX INFO: renamed from: b */
    public final boolean mo13780b() {
        byte b10 = this.f39381i;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        this.f39381i = (byte) 1;
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC6997h
    /* JADX INFO: renamed from: c */
    public final InterfaceC6997h.a mo13781c() {
        C6964b c6964b = new C6964b();
        c6964b.m13870m(this);
        return c6964b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC6997h
    /* JADX INFO: renamed from: d */
    public final int mo13782d() {
        int i10 = this.f39382j;
        if (i10 != -1) {
            return i10;
        }
        int iM13894b = (this.f39374b & 1) == 1 ? 0 + CodedOutputStream.m13894b(1, this.f39375c) : 0;
        if ((this.f39374b & 2) == 2) {
            iM13894b += CodedOutputStream.m13894b(2, this.f39376d);
        }
        if ((this.f39374b & 4) == 4) {
            iM13894b += CodedOutputStream.m13893a(3, this.f39377e.getNumber());
        }
        if ((this.f39374b & 8) == 8) {
            iM13894b += CodedOutputStream.m13894b(4, this.f39378f);
        }
        if ((this.f39374b & 16) == 16) {
            iM13894b += CodedOutputStream.m13894b(5, this.f39379g);
        }
        if ((this.f39374b & 32) == 32) {
            iM13894b += CodedOutputStream.m13893a(6, this.f39380h.getNumber());
        }
        int size = this.f39373a.size() + iM13894b;
        this.f39382j = size;
        return size;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC6997h
    /* JADX INFO: renamed from: e */
    public final InterfaceC6997h.a mo13783e() {
        return new C6964b();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC6997h
    /* JADX INFO: renamed from: j */
    public final void mo13784j(CodedOutputStream codedOutputStream) throws IOException {
        mo13782d();
        if ((this.f39374b & 1) == 1) {
            codedOutputStream.m13905m(1, this.f39375c);
        }
        if ((this.f39374b & 2) == 2) {
            codedOutputStream.m13905m(2, this.f39376d);
        }
        if ((this.f39374b & 4) == 4) {
            codedOutputStream.m13904l(3, this.f39377e.getNumber());
        }
        if ((this.f39374b & 8) == 8) {
            codedOutputStream.m13905m(4, this.f39378f);
        }
        if ((this.f39374b & 16) == 16) {
            codedOutputStream.m13905m(5, this.f39379g);
        }
        if ((this.f39374b & 32) == 32) {
            codedOutputStream.m13904l(6, this.f39380h.getNumber());
        }
        codedOutputStream.m13910r(this.f39373a);
    }
}
