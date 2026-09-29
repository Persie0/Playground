package kotlin.reflect.jvm.internal.impl.metadata;

import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.kochava.tracker.BuildConfig;
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
public final class ProtoBuf$Type extends GeneratedMessageLite.ExtendableMessage<ProtoBuf$Type> {

    /* JADX INFO: renamed from: O */
    public static final ProtoBuf$Type f39246O;

    /* JADX INFO: renamed from: P */
    public static final C6950a f39247P = new C6950a();

    /* JADX INFO: renamed from: H */
    public ProtoBuf$Type f39248H;

    /* JADX INFO: renamed from: I */
    public int f39249I;

    /* JADX INFO: renamed from: J */
    public ProtoBuf$Type f39250J;

    /* JADX INFO: renamed from: K */
    public int f39251K;

    /* JADX INFO: renamed from: L */
    public int f39252L;

    /* JADX INFO: renamed from: M */
    public byte f39253M;

    /* JADX INFO: renamed from: N */
    public int f39254N;

    /* JADX INFO: renamed from: b */
    public final AbstractC7803a f39255b;

    /* JADX INFO: renamed from: c */
    public int f39256c;

    /* JADX INFO: renamed from: d */
    public List<Argument> f39257d;

    /* JADX INFO: renamed from: e */
    public boolean f39258e;

    /* JADX INFO: renamed from: f */
    public int f39259f;

    /* JADX INFO: renamed from: g */
    public ProtoBuf$Type f39260g;

    /* JADX INFO: renamed from: h */
    public int f39261h;

    /* JADX INFO: renamed from: i */
    public int f39262i;

    /* JADX INFO: renamed from: j */
    public int f39263j;

    /* JADX INFO: renamed from: k */
    public int f39264k;

    /* JADX INFO: renamed from: l */
    public int f39265l;

    public static final class Argument extends GeneratedMessageLite implements InterfaceC7808f {

        /* JADX INFO: renamed from: h */
        public static final Argument f39266h;

        /* JADX INFO: renamed from: i */
        public static final C6948a f39267i = new C6948a();

        /* JADX INFO: renamed from: a */
        public final AbstractC7803a f39268a;

        /* JADX INFO: renamed from: b */
        public int f39269b;

        /* JADX INFO: renamed from: c */
        public Projection f39270c;

        /* JADX INFO: renamed from: d */
        public ProtoBuf$Type f39271d;

        /* JADX INFO: renamed from: e */
        public int f39272e;

        /* JADX INFO: renamed from: f */
        public byte f39273f;

        /* JADX INFO: renamed from: g */
        public int f39274g;

        public enum Projection implements C6995f.a {
            IN(0, 0),
            OUT(1, 1),
            INV(2, 2),
            STAR(3, 3);

            private static C6995f.b<Projection> internalValueMap = new C6947a();
            private final int value;

            /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type$Argument$Projection$a */
            public static class C6947a implements C6995f.b<Projection> {
                @Override // kotlin.reflect.jvm.internal.impl.protobuf.C6995f.b
                /* JADX INFO: renamed from: a */
                public final C6995f.a mo13786a(int i10) {
                    return Projection.valueOf(i10);
                }
            }

            Projection(int i10, int i11) {
                this.value = i11;
            }

            public static Projection valueOf(int i10) {
                if (i10 == 0) {
                    return IN;
                }
                if (i10 == 1) {
                    return OUT;
                }
                if (i10 == 2) {
                    return INV;
                }
                if (i10 != 3) {
                    return null;
                }
                return STAR;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.C6995f.a
            public final int getNumber() {
                return this.value;
            }
        }

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type$Argument$a */
        public static class C6948a extends AbstractC6991b<Argument> {
            @Override // p282nn.InterfaceC7809g
            /* JADX INFO: renamed from: a */
            public final Object mo13787a(C6992c c6992c, C6993d c6993d) throws InvalidProtocolBufferException {
                return new Argument(c6992c, c6993d);
            }
        }

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type$Argument$b */
        public static final class C6949b extends GeneratedMessageLite.AbstractC6982b<Argument, C6949b> implements InterfaceC7808f {

            /* JADX INFO: renamed from: b */
            public int f39276b;

            /* JADX INFO: renamed from: c */
            public Projection f39277c = Projection.INV;

            /* JADX INFO: renamed from: d */
            public ProtoBuf$Type f39278d = ProtoBuf$Type.f39246O;

            /* JADX INFO: renamed from: e */
            public int f39279e;

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC6990a.a, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC6997h.a
            /* JADX INFO: renamed from: Q */
            public final /* bridge */ /* synthetic */ InterfaceC6997h.a mo13788Q(C6992c c6992c, C6993d c6993d) throws Throwable {
                m13850n(c6992c, c6993d);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC6997h.a
            /* JADX INFO: renamed from: a */
            public final InterfaceC6997h mo13789a() {
                Argument argumentM13848k = m13848k();
                if (argumentM13848k.mo13780b()) {
                    return argumentM13848k;
                }
                throw new UninitializedMessageException();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.AbstractC6982b
            public final Object clone() throws CloneNotSupportedException {
                C6949b c6949b = new C6949b();
                c6949b.m13849m(m13848k());
                return c6949b;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC6990a.a
            /* JADX INFO: renamed from: f */
            public final /* bridge */ /* synthetic */ AbstractC6990a.a mo13788Q(C6992c c6992c, C6993d c6993d) throws Throwable {
                m13850n(c6992c, c6993d);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.AbstractC6982b
            /* JADX INFO: renamed from: g */
            public final GeneratedMessageLite.AbstractC6982b clone() {
                C6949b c6949b = new C6949b();
                c6949b.m13849m(m13848k());
                return c6949b;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.AbstractC6982b
            /* JADX INFO: renamed from: i */
            public final /* bridge */ /* synthetic */ GeneratedMessageLite.AbstractC6982b mo13792i(GeneratedMessageLite generatedMessageLite) {
                m13849m((Argument) generatedMessageLite);
                return this;
            }

            /* JADX INFO: renamed from: k */
            public final Argument m13848k() {
                Argument argument = new Argument(this);
                int i10 = this.f39276b;
                int i11 = 1;
                if ((i10 & 1) != 1) {
                    i11 = 0;
                }
                argument.f39270c = this.f39277c;
                if ((i10 & 2) == 2) {
                    i11 |= 2;
                }
                argument.f39271d = this.f39278d;
                if ((i10 & 4) == 4) {
                    i11 |= 4;
                }
                argument.f39272e = this.f39279e;
                argument.f39269b = i11;
                return argument;
            }

            /* JADX INFO: renamed from: m */
            public final void m13849m(Argument argument) {
                ProtoBuf$Type protoBuf$Type;
                if (argument == Argument.f39266h) {
                    return;
                }
                boolean z10 = true;
                if ((argument.f39269b & 1) == 1) {
                    Projection projection = argument.f39270c;
                    projection.getClass();
                    this.f39276b |= 1;
                    this.f39277c = projection;
                }
                if ((argument.f39269b & 2) == 2) {
                    ProtoBuf$Type protoBuf$Type2 = argument.f39271d;
                    if ((this.f39276b & 2) != 2 || (protoBuf$Type = this.f39278d) == ProtoBuf$Type.f39246O) {
                        this.f39278d = protoBuf$Type2;
                    } else {
                        C6951b c6951bM13844C = ProtoBuf$Type.m13844C(protoBuf$Type);
                        c6951bM13844C.m13852n(protoBuf$Type2);
                        this.f39278d = c6951bM13844C.m13851m();
                    }
                    this.f39276b |= 2;
                }
                if ((argument.f39269b & 4) != 4) {
                    z10 = false;
                }
                if (z10) {
                    int i10 = argument.f39272e;
                    this.f39276b |= 4;
                    this.f39279e = i10;
                }
                this.f39493a = this.f39493a.m15519f(argument.f39268a);
            }

            /* JADX WARN: Code duplicated, block: B:15:0x0021  */
            /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
            /* JADX INFO: renamed from: n */
            public final void m13850n(C6992c c6992c, C6993d c6993d) throws Throwable {
                Argument argument;
                try {
                    try {
                        Argument.f39267i.getClass();
                        m13849m(new Argument(c6992c, c6993d));
                    } catch (InvalidProtocolBufferException e10) {
                        argument = (Argument) e10.f39506a;
                        try {
                            throw e10;
                        } catch (Throwable th2) {
                            th = th2;
                            if (argument != null) {
                                m13849m(argument);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    argument = null;
                    if (argument != null) {
                        m13849m(argument);
                    }
                    throw th;
                }
            }
        }

        static {
            Argument argument = new Argument();
            f39266h = argument;
            argument.f39270c = Projection.INV;
            argument.f39271d = ProtoBuf$Type.f39246O;
            argument.f39272e = 0;
        }

        public Argument() {
            this.f39273f = (byte) -1;
            this.f39274g = -1;
            this.f39268a = AbstractC7803a.f42882a;
        }

        public Argument(GeneratedMessageLite.AbstractC6982b abstractC6982b) {
            super(0);
            this.f39273f = (byte) -1;
            this.f39274g = -1;
            this.f39268a = abstractC6982b.f39493a;
        }

        /* JADX WARN: Unreachable blocks removed: 3, instructions: 3 */
        public Argument(C6992c c6992c, C6993d c6993d) throws InvalidProtocolBufferException {
            C6951b c6951bM13844C;
            this.f39273f = (byte) -1;
            this.f39274g = -1;
            this.f39270c = Projection.INV;
            this.f39271d = ProtoBuf$Type.f39246O;
            boolean z10 = false;
            this.f39272e = 0;
            AbstractC7803a.b bVar = new AbstractC7803a.b();
            CodedOutputStream codedOutputStreamM13901j = CodedOutputStream.m13901j(bVar, 1);
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
                                    int iM13949k = c6992c.m13949k();
                                    Projection projectionValueOf = Projection.valueOf(iM13949k);
                                    if (projectionValueOf == null) {
                                        codedOutputStreamM13901j.m13914v(iM13952n);
                                        codedOutputStreamM13901j.m13914v(iM13949k);
                                    } else {
                                        this.f39269b |= 1;
                                        this.f39270c = projectionValueOf;
                                    }
                                } else if (iM13952n == 18) {
                                    if ((this.f39269b & 2) == 2) {
                                        ProtoBuf$Type protoBuf$Type = this.f39271d;
                                        protoBuf$Type.getClass();
                                        c6951bM13844C = ProtoBuf$Type.m13844C(protoBuf$Type);
                                    } else {
                                        c6951bM13844C = null;
                                    }
                                    ProtoBuf$Type protoBuf$Type2 = (ProtoBuf$Type) c6992c.m13945g(ProtoBuf$Type.f39247P, c6993d);
                                    this.f39271d = protoBuf$Type2;
                                    if (c6951bM13844C != null) {
                                        c6951bM13844C.m13852n(protoBuf$Type2);
                                        this.f39271d = c6951bM13844C.m13851m();
                                    }
                                    this.f39269b |= 2;
                                } else if (iM13952n == 24) {
                                    this.f39269b |= 4;
                                    this.f39272e = c6992c.m13949k();
                                } else if (!c6992c.m13955q(iM13952n, codedOutputStreamM13901j)) {
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
                        try {
                            codedOutputStreamM13901j.m13902i();
                        } catch (IOException unused) {
                        } finally {
                            this.f39268a = bVar.m15533l();
                        }
                        throw th2;
                    }
                }
            }
            try {
                codedOutputStreamM13901j.m13902i();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.f39268a = bVar.m15533l();
                throw th3;
            }
            this.f39268a = bVar.m15533l();
        }

        @Override // p282nn.InterfaceC7808f
        /* JADX INFO: renamed from: b */
        public final boolean mo13780b() {
            byte b10 = this.f39273f;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            if (!((this.f39269b & 2) == 2) || this.f39271d.mo13780b()) {
                this.f39273f = (byte) 1;
                return true;
            }
            this.f39273f = (byte) 0;
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC6997h
        /* JADX INFO: renamed from: c */
        public final InterfaceC6997h.a mo13781c() {
            C6949b c6949b = new C6949b();
            c6949b.m13849m(this);
            return c6949b;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC6997h
        /* JADX INFO: renamed from: d */
        public final int mo13782d() {
            int i10 = this.f39274g;
            if (i10 != -1) {
                return i10;
            }
            int iM13893a = (this.f39269b & 1) == 1 ? 0 + CodedOutputStream.m13893a(1, this.f39270c.getNumber()) : 0;
            if ((this.f39269b & 2) == 2) {
                iM13893a += CodedOutputStream.m13896d(2, this.f39271d);
            }
            if ((this.f39269b & 4) == 4) {
                iM13893a += CodedOutputStream.m13894b(3, this.f39272e);
            }
            int size = this.f39268a.size() + iM13893a;
            this.f39274g = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC6997h
        /* JADX INFO: renamed from: e */
        public final InterfaceC6997h.a mo13783e() {
            return new C6949b();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC6997h
        /* JADX INFO: renamed from: j */
        public final void mo13784j(CodedOutputStream codedOutputStream) throws IOException {
            mo13782d();
            if ((this.f39269b & 1) == 1) {
                codedOutputStream.m13904l(1, this.f39270c.getNumber());
            }
            if ((this.f39269b & 2) == 2) {
                codedOutputStream.m13907o(2, this.f39271d);
            }
            if ((this.f39269b & 4) == 4) {
                codedOutputStream.m13905m(3, this.f39272e);
            }
            codedOutputStream.m13910r(this.f39268a);
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type$a */
    public static class C6950a extends AbstractC6991b<ProtoBuf$Type> {
        @Override // p282nn.InterfaceC7809g
        /* JADX INFO: renamed from: a */
        public final Object mo13787a(C6992c c6992c, C6993d c6993d) throws InvalidProtocolBufferException {
            return new ProtoBuf$Type(c6992c, c6993d);
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type$b */
    public static final class C6951b extends GeneratedMessageLite.AbstractC6983c<ProtoBuf$Type, C6951b> {

        /* JADX INFO: renamed from: H */
        public int f39280H;

        /* JADX INFO: renamed from: I */
        public ProtoBuf$Type f39281I;

        /* JADX INFO: renamed from: J */
        public int f39282J;

        /* JADX INFO: renamed from: K */
        public ProtoBuf$Type f39283K;

        /* JADX INFO: renamed from: L */
        public int f39284L;

        /* JADX INFO: renamed from: M */
        public int f39285M;

        /* JADX INFO: renamed from: d */
        public int f39286d;

        /* JADX INFO: renamed from: e */
        public List<Argument> f39287e = Collections.emptyList();

        /* JADX INFO: renamed from: f */
        public boolean f39288f;

        /* JADX INFO: renamed from: g */
        public int f39289g;

        /* JADX INFO: renamed from: h */
        public ProtoBuf$Type f39290h;

        /* JADX INFO: renamed from: i */
        public int f39291i;

        /* JADX INFO: renamed from: j */
        public int f39292j;

        /* JADX INFO: renamed from: k */
        public int f39293k;

        /* JADX INFO: renamed from: l */
        public int f39294l;

        public C6951b() {
            ProtoBuf$Type protoBuf$Type = ProtoBuf$Type.f39246O;
            this.f39290h = protoBuf$Type;
            this.f39281I = protoBuf$Type;
            this.f39283K = protoBuf$Type;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC6990a.a, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC6997h.a
        /* JADX INFO: renamed from: Q */
        public final /* bridge */ /* synthetic */ InterfaceC6997h.a mo13788Q(C6992c c6992c, C6993d c6993d) throws Throwable {
            m13853o(c6992c, c6993d);
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC6997h.a
        /* JADX INFO: renamed from: a */
        public final InterfaceC6997h mo13789a() {
            ProtoBuf$Type protoBuf$TypeM13851m = m13851m();
            if (protoBuf$TypeM13851m.mo13780b()) {
                return protoBuf$TypeM13851m;
            }
            throw new UninitializedMessageException();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.AbstractC6982b
        public final Object clone() throws CloneNotSupportedException {
            C6951b c6951b = new C6951b();
            c6951b.m13852n(m13851m());
            return c6951b;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC6990a.a
        /* JADX INFO: renamed from: f */
        public final /* bridge */ /* synthetic */ AbstractC6990a.a mo13788Q(C6992c c6992c, C6993d c6993d) throws Throwable {
            m13853o(c6992c, c6993d);
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.AbstractC6982b
        /* JADX INFO: renamed from: g */
        public final GeneratedMessageLite.AbstractC6982b clone() {
            C6951b c6951b = new C6951b();
            c6951b.m13852n(m13851m());
            return c6951b;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.AbstractC6982b
        /* JADX INFO: renamed from: i */
        public final /* bridge */ /* synthetic */ GeneratedMessageLite.AbstractC6982b mo13792i(GeneratedMessageLite generatedMessageLite) {
            m13852n((ProtoBuf$Type) generatedMessageLite);
            return this;
        }

        /* JADX INFO: renamed from: m */
        public final ProtoBuf$Type m13851m() {
            ProtoBuf$Type protoBuf$Type = new ProtoBuf$Type(this);
            int i10 = this.f39286d;
            int i11 = 1;
            if ((i10 & 1) == 1) {
                this.f39287e = Collections.unmodifiableList(this.f39287e);
                this.f39286d &= -2;
            }
            protoBuf$Type.f39257d = this.f39287e;
            if ((i10 & 2) != 2) {
                i11 = 0;
            }
            protoBuf$Type.f39258e = this.f39288f;
            if ((i10 & 4) == 4) {
                i11 |= 2;
            }
            protoBuf$Type.f39259f = this.f39289g;
            if ((i10 & 8) == 8) {
                i11 |= 4;
            }
            protoBuf$Type.f39260g = this.f39290h;
            if ((i10 & 16) == 16) {
                i11 |= 8;
            }
            protoBuf$Type.f39261h = this.f39291i;
            if ((i10 & 32) == 32) {
                i11 |= 16;
            }
            protoBuf$Type.f39262i = this.f39292j;
            if ((i10 & 64) == 64) {
                i11 |= 32;
            }
            protoBuf$Type.f39263j = this.f39293k;
            if ((i10 & BuildConfig.SDK_TRUNCATE_LENGTH) == 128) {
                i11 |= 64;
            }
            protoBuf$Type.f39264k = this.f39294l;
            if ((i10 & 256) == 256) {
                i11 |= BuildConfig.SDK_TRUNCATE_LENGTH;
            }
            protoBuf$Type.f39265l = this.f39280H;
            if ((i10 & 512) == 512) {
                i11 |= 256;
            }
            protoBuf$Type.f39248H = this.f39281I;
            if ((i10 & 1024) == 1024) {
                i11 |= 512;
            }
            protoBuf$Type.f39249I = this.f39282J;
            if ((i10 & 2048) == 2048) {
                i11 |= 1024;
            }
            protoBuf$Type.f39250J = this.f39283K;
            if ((i10 & 4096) == 4096) {
                i11 |= 2048;
            }
            protoBuf$Type.f39251K = this.f39284L;
            if ((i10 & 8192) == 8192) {
                i11 |= 4096;
            }
            protoBuf$Type.f39252L = this.f39285M;
            protoBuf$Type.f39256c = i11;
            return protoBuf$Type;
        }

        /* JADX INFO: renamed from: n */
        public final C6951b m13852n(ProtoBuf$Type protoBuf$Type) {
            ProtoBuf$Type protoBuf$Type2;
            ProtoBuf$Type protoBuf$Type3;
            ProtoBuf$Type protoBuf$Type4;
            ProtoBuf$Type protoBuf$Type5 = ProtoBuf$Type.f39246O;
            if (protoBuf$Type == protoBuf$Type5) {
                return this;
            }
            boolean z10 = true;
            if (!protoBuf$Type.f39257d.isEmpty()) {
                if (this.f39287e.isEmpty()) {
                    this.f39287e = protoBuf$Type.f39257d;
                    this.f39286d &= -2;
                } else {
                    if ((this.f39286d & 1) != 1) {
                        this.f39287e = new ArrayList(this.f39287e);
                        this.f39286d |= 1;
                    }
                    this.f39287e.addAll(protoBuf$Type.f39257d);
                }
            }
            int i10 = protoBuf$Type.f39256c;
            if ((i10 & 1) == 1) {
                boolean z11 = protoBuf$Type.f39258e;
                this.f39286d |= 2;
                this.f39288f = z11;
            }
            if ((i10 & 2) == 2) {
                int i11 = protoBuf$Type.f39259f;
                this.f39286d |= 4;
                this.f39289g = i11;
            }
            if ((i10 & 4) == 4) {
                ProtoBuf$Type protoBuf$Type6 = protoBuf$Type.f39260g;
                if ((this.f39286d & 8) != 8 || (protoBuf$Type4 = this.f39290h) == protoBuf$Type5) {
                    this.f39290h = protoBuf$Type6;
                } else {
                    C6951b c6951bM13844C = ProtoBuf$Type.m13844C(protoBuf$Type4);
                    c6951bM13844C.m13852n(protoBuf$Type6);
                    this.f39290h = c6951bM13844C.m13851m();
                }
                this.f39286d |= 8;
            }
            if ((protoBuf$Type.f39256c & 8) == 8) {
                int i12 = protoBuf$Type.f39261h;
                this.f39286d |= 16;
                this.f39291i = i12;
            }
            if (protoBuf$Type.m13847z()) {
                int i13 = protoBuf$Type.f39262i;
                this.f39286d |= 32;
                this.f39292j = i13;
            }
            int i14 = protoBuf$Type.f39256c;
            if ((i14 & 32) == 32) {
                int i15 = protoBuf$Type.f39263j;
                this.f39286d |= 64;
                this.f39293k = i15;
            }
            if ((i14 & 64) == 64) {
                int i16 = protoBuf$Type.f39264k;
                this.f39286d |= BuildConfig.SDK_TRUNCATE_LENGTH;
                this.f39294l = i16;
            }
            if ((i14 & BuildConfig.SDK_TRUNCATE_LENGTH) == 128) {
                int i17 = protoBuf$Type.f39265l;
                this.f39286d |= 256;
                this.f39280H = i17;
            }
            if ((i14 & 256) == 256) {
                ProtoBuf$Type protoBuf$Type7 = protoBuf$Type.f39248H;
                if ((this.f39286d & 512) != 512 || (protoBuf$Type3 = this.f39281I) == protoBuf$Type5) {
                    this.f39281I = protoBuf$Type7;
                } else {
                    C6951b c6951bM13844C2 = ProtoBuf$Type.m13844C(protoBuf$Type3);
                    c6951bM13844C2.m13852n(protoBuf$Type7);
                    this.f39281I = c6951bM13844C2.m13851m();
                }
                this.f39286d |= 512;
            }
            int i18 = protoBuf$Type.f39256c;
            if ((i18 & 512) == 512) {
                int i19 = protoBuf$Type.f39249I;
                this.f39286d |= 1024;
                this.f39282J = i19;
            }
            if ((i18 & 1024) == 1024) {
                ProtoBuf$Type protoBuf$Type8 = protoBuf$Type.f39250J;
                if ((this.f39286d & 2048) != 2048 || (protoBuf$Type2 = this.f39283K) == protoBuf$Type5) {
                    this.f39283K = protoBuf$Type8;
                } else {
                    C6951b c6951bM13844C3 = ProtoBuf$Type.m13844C(protoBuf$Type2);
                    c6951bM13844C3.m13852n(protoBuf$Type8);
                    this.f39283K = c6951bM13844C3.m13851m();
                }
                this.f39286d |= 2048;
            }
            int i20 = protoBuf$Type.f39256c;
            if ((i20 & 2048) == 2048) {
                int i21 = protoBuf$Type.f39251K;
                this.f39286d |= 4096;
                this.f39284L = i21;
            }
            if ((i20 & 4096) != 4096) {
                z10 = false;
            }
            if (z10) {
                int i22 = protoBuf$Type.f39252L;
                this.f39286d |= 8192;
                this.f39285M = i22;
            }
            m13928k(protoBuf$Type);
            this.f39493a = this.f39493a.m15519f(protoBuf$Type.f39255b);
            return this;
        }

        /* JADX WARN: Code duplicated, block: B:16:0x001e  */
        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* JADX INFO: renamed from: o */
        public final void m13853o(C6992c c6992c, C6993d c6993d) throws Throwable {
            ProtoBuf$Type protoBuf$Type;
            try {
                try {
                    ProtoBuf$Type.f39247P.getClass();
                    m13852n(new ProtoBuf$Type(c6992c, c6993d));
                } catch (InvalidProtocolBufferException e10) {
                    protoBuf$Type = (ProtoBuf$Type) e10.f39506a;
                    try {
                        throw e10;
                    } catch (Throwable th2) {
                        th = th2;
                        if (protoBuf$Type != null) {
                            m13852n(protoBuf$Type);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                protoBuf$Type = null;
                if (protoBuf$Type != null) {
                    m13852n(protoBuf$Type);
                }
                throw th;
            }
        }
    }

    static {
        ProtoBuf$Type protoBuf$Type = new ProtoBuf$Type(0);
        f39246O = protoBuf$Type;
        protoBuf$Type.m13845A();
    }

    public ProtoBuf$Type() {
        throw null;
    }

    public ProtoBuf$Type(int i10) {
        this.f39253M = (byte) -1;
        this.f39254N = -1;
        this.f39255b = AbstractC7803a.f42882a;
    }

    public ProtoBuf$Type(GeneratedMessageLite.AbstractC6983c abstractC6983c) {
        super(abstractC6983c);
        this.f39253M = (byte) -1;
        this.f39254N = -1;
        this.f39255b = abstractC6983c.f39493a;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public ProtoBuf$Type(C6992c c6992c, C6993d c6993d) throws InvalidProtocolBufferException {
        this.f39253M = (byte) -1;
        this.f39254N = -1;
        m13845A();
        AbstractC7803a.b bVar = new AbstractC7803a.b();
        CodedOutputStream codedOutputStreamM13901j = CodedOutputStream.m13901j(bVar, 1);
        boolean z10 = false;
        boolean z11 = false;
        while (!z10) {
            try {
                try {
                    try {
                        int iM13952n = c6992c.m13952n();
                        C6950a c6950a = f39247P;
                        C6951b c6951bM13844C = null;
                        switch (iM13952n) {
                            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                                break;
                            case 8:
                                this.f39256c |= 4096;
                                this.f39252L = c6992c.m13949k();
                                continue;
                            case 18:
                                if (!(z11 & true)) {
                                    this.f39257d = new ArrayList();
                                    z11 |= true;
                                }
                                this.f39257d.add((Argument) c6992c.m13945g(Argument.f39267i, c6993d));
                                continue;
                            case 24:
                                this.f39256c |= 1;
                                this.f39258e = c6992c.m13950l() != 0;
                                continue;
                            case 32:
                                this.f39256c |= 2;
                                this.f39259f = c6992c.m13949k();
                                continue;
                            case 42:
                                if ((this.f39256c & 4) == 4) {
                                    ProtoBuf$Type protoBuf$Type = this.f39260g;
                                    protoBuf$Type.getClass();
                                    c6951bM13844C = m13844C(protoBuf$Type);
                                }
                                ProtoBuf$Type protoBuf$Type2 = (ProtoBuf$Type) c6992c.m13945g(c6950a, c6993d);
                                this.f39260g = protoBuf$Type2;
                                if (c6951bM13844C != null) {
                                    c6951bM13844C.m13852n(protoBuf$Type2);
                                    this.f39260g = c6951bM13844C.m13851m();
                                }
                                this.f39256c |= 4;
                                continue;
                            case 48:
                                this.f39256c |= 16;
                                this.f39262i = c6992c.m13949k();
                                continue;
                            case 56:
                                this.f39256c |= 32;
                                this.f39263j = c6992c.m13949k();
                                continue;
                            case 64:
                                this.f39256c |= 8;
                                this.f39261h = c6992c.m13949k();
                                continue;
                            case 72:
                                this.f39256c |= 64;
                                this.f39264k = c6992c.m13949k();
                                continue;
                            case 82:
                                if ((this.f39256c & 256) == 256) {
                                    ProtoBuf$Type protoBuf$Type3 = this.f39248H;
                                    protoBuf$Type3.getClass();
                                    c6951bM13844C = m13844C(protoBuf$Type3);
                                }
                                ProtoBuf$Type protoBuf$Type4 = (ProtoBuf$Type) c6992c.m13945g(c6950a, c6993d);
                                this.f39248H = protoBuf$Type4;
                                if (c6951bM13844C != null) {
                                    c6951bM13844C.m13852n(protoBuf$Type4);
                                    this.f39248H = c6951bM13844C.m13851m();
                                }
                                this.f39256c |= 256;
                                continue;
                            case ModuleDescriptor.MODULE_VERSION /* 88 */:
                                this.f39256c |= 512;
                                this.f39249I = c6992c.m13949k();
                                continue;
                            case 96:
                                this.f39256c |= BuildConfig.SDK_TRUNCATE_LENGTH;
                                this.f39265l = c6992c.m13949k();
                                continue;
                            case 106:
                                if ((this.f39256c & 1024) == 1024) {
                                    ProtoBuf$Type protoBuf$Type5 = this.f39250J;
                                    protoBuf$Type5.getClass();
                                    c6951bM13844C = m13844C(protoBuf$Type5);
                                }
                                ProtoBuf$Type protoBuf$Type6 = (ProtoBuf$Type) c6992c.m13945g(c6950a, c6993d);
                                this.f39250J = protoBuf$Type6;
                                if (c6951bM13844C != null) {
                                    c6951bM13844C.m13852n(protoBuf$Type6);
                                    this.f39250J = c6951bM13844C.m13851m();
                                }
                                this.f39256c |= 1024;
                                continue;
                            case 112:
                                this.f39256c |= 2048;
                                this.f39251K = c6992c.m13949k();
                                continue;
                            default:
                                if (!m13925x(c6992c, codedOutputStreamM13901j, c6993d, iM13952n)) {
                                    break;
                                }
                                break;
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
                if (z11 & true) {
                    this.f39257d = Collections.unmodifiableList(this.f39257d);
                }
                try {
                    codedOutputStreamM13901j.m13902i();
                } catch (IOException unused) {
                } catch (Throwable th3) {
                    this.f39255b = bVar.m15533l();
                    throw th3;
                }
                this.f39255b = bVar.m15533l();
                m13923t();
                throw th2;
            }
        }
        if (z11 & true) {
            this.f39257d = Collections.unmodifiableList(this.f39257d);
        }
        try {
            codedOutputStreamM13901j.m13902i();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f39255b = bVar.m15533l();
            throw th4;
        }
        this.f39255b = bVar.m15533l();
        m13923t();
    }

    /* JADX INFO: renamed from: C */
    public static C6951b m13844C(ProtoBuf$Type protoBuf$Type) {
        return new C6951b().m13852n(protoBuf$Type);
    }

    /* JADX INFO: renamed from: A */
    public final void m13845A() {
        this.f39257d = Collections.emptyList();
        this.f39258e = false;
        this.f39259f = 0;
        ProtoBuf$Type protoBuf$Type = f39246O;
        this.f39260g = protoBuf$Type;
        this.f39261h = 0;
        this.f39262i = 0;
        this.f39263j = 0;
        this.f39264k = 0;
        this.f39265l = 0;
        this.f39248H = protoBuf$Type;
        this.f39249I = 0;
        this.f39250J = protoBuf$Type;
        this.f39251K = 0;
        this.f39252L = 0;
    }

    /* JADX INFO: renamed from: D */
    public final C6951b m13846D() {
        return m13844C(this);
    }

    @Override // p282nn.InterfaceC7808f
    /* JADX INFO: renamed from: b */
    public final boolean mo13780b() {
        byte b10 = this.f39253M;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        for (int i10 = 0; i10 < this.f39257d.size(); i10++) {
            if (!this.f39257d.get(i10).mo13780b()) {
                this.f39253M = (byte) 0;
                return false;
            }
        }
        if (((this.f39256c & 4) == 4) && !this.f39260g.mo13780b()) {
            this.f39253M = (byte) 0;
            return false;
        }
        if (((this.f39256c & 256) == 256) && !this.f39248H.mo13780b()) {
            this.f39253M = (byte) 0;
            return false;
        }
        if (((this.f39256c & 1024) == 1024) && !this.f39250J.mo13780b()) {
            this.f39253M = (byte) 0;
            return false;
        }
        if (m13919n()) {
            this.f39253M = (byte) 1;
            return true;
        }
        this.f39253M = (byte) 0;
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC6997h
    /* JADX INFO: renamed from: c */
    public final InterfaceC6997h.a mo13781c() {
        return m13844C(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC6997h
    /* JADX INFO: renamed from: d */
    public final int mo13782d() {
        int i10 = this.f39254N;
        if (i10 != -1) {
            return i10;
        }
        int iM13894b = (this.f39256c & 4096) == 4096 ? CodedOutputStream.m13894b(1, this.f39252L) + 0 : 0;
        for (int i11 = 0; i11 < this.f39257d.size(); i11++) {
            iM13894b += CodedOutputStream.m13896d(2, this.f39257d.get(i11));
        }
        if ((this.f39256c & 1) == 1) {
            iM13894b += CodedOutputStream.m13900h(3) + 1;
        }
        if ((this.f39256c & 2) == 2) {
            iM13894b += CodedOutputStream.m13894b(4, this.f39259f);
        }
        if ((this.f39256c & 4) == 4) {
            iM13894b += CodedOutputStream.m13896d(5, this.f39260g);
        }
        if ((this.f39256c & 16) == 16) {
            iM13894b += CodedOutputStream.m13894b(6, this.f39262i);
        }
        if ((this.f39256c & 32) == 32) {
            iM13894b += CodedOutputStream.m13894b(7, this.f39263j);
        }
        if ((this.f39256c & 8) == 8) {
            iM13894b += CodedOutputStream.m13894b(8, this.f39261h);
        }
        if ((this.f39256c & 64) == 64) {
            iM13894b += CodedOutputStream.m13894b(9, this.f39264k);
        }
        if ((this.f39256c & 256) == 256) {
            iM13894b += CodedOutputStream.m13896d(10, this.f39248H);
        }
        if ((this.f39256c & 512) == 512) {
            iM13894b += CodedOutputStream.m13894b(11, this.f39249I);
        }
        if ((this.f39256c & BuildConfig.SDK_TRUNCATE_LENGTH) == 128) {
            iM13894b += CodedOutputStream.m13894b(12, this.f39265l);
        }
        if ((this.f39256c & 1024) == 1024) {
            iM13894b += CodedOutputStream.m13896d(13, this.f39250J);
        }
        if ((this.f39256c & 2048) == 2048) {
            iM13894b += CodedOutputStream.m13894b(14, this.f39251K);
        }
        int size = this.f39255b.size() + m13920q() + iM13894b;
        this.f39254N = size;
        return size;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC6997h
    /* JADX INFO: renamed from: e */
    public final InterfaceC6997h.a mo13783e() {
        return new C6951b();
    }

    @Override // p282nn.InterfaceC7808f
    /* JADX INFO: renamed from: h */
    public final InterfaceC6997h mo13802h() {
        return f39246O;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC6997h
    /* JADX INFO: renamed from: j */
    public final void mo13784j(CodedOutputStream codedOutputStream) throws IOException {
        mo13782d();
        GeneratedMessageLite.ExtendableMessage.C6980a c6980a = new GeneratedMessageLite.ExtendableMessage.C6980a(this);
        if ((this.f39256c & 4096) == 4096) {
            codedOutputStream.m13905m(1, this.f39252L);
        }
        for (int i10 = 0; i10 < this.f39257d.size(); i10++) {
            codedOutputStream.m13907o(2, this.f39257d.get(i10));
        }
        if ((this.f39256c & 1) == 1) {
            boolean z10 = this.f39258e;
            codedOutputStream.m13916x(3, 0);
            codedOutputStream.m13909q(z10 ? 1 : 0);
        }
        if ((this.f39256c & 2) == 2) {
            codedOutputStream.m13905m(4, this.f39259f);
        }
        if ((this.f39256c & 4) == 4) {
            codedOutputStream.m13907o(5, this.f39260g);
        }
        if ((this.f39256c & 16) == 16) {
            codedOutputStream.m13905m(6, this.f39262i);
        }
        if ((this.f39256c & 32) == 32) {
            codedOutputStream.m13905m(7, this.f39263j);
        }
        if ((this.f39256c & 8) == 8) {
            codedOutputStream.m13905m(8, this.f39261h);
        }
        if ((this.f39256c & 64) == 64) {
            codedOutputStream.m13905m(9, this.f39264k);
        }
        if ((this.f39256c & 256) == 256) {
            codedOutputStream.m13907o(10, this.f39248H);
        }
        if ((this.f39256c & 512) == 512) {
            codedOutputStream.m13905m(11, this.f39249I);
        }
        if ((this.f39256c & BuildConfig.SDK_TRUNCATE_LENGTH) == 128) {
            codedOutputStream.m13905m(12, this.f39265l);
        }
        if ((this.f39256c & 1024) == 1024) {
            codedOutputStream.m13907o(13, this.f39250J);
        }
        if ((this.f39256c & 2048) == 2048) {
            codedOutputStream.m13905m(14, this.f39251K);
        }
        c6980a.m13927a(200, codedOutputStream);
        codedOutputStream.m13910r(this.f39255b);
    }

    /* JADX INFO: renamed from: z */
    public final boolean m13847z() {
        return (this.f39256c & 16) == 16;
    }
}
