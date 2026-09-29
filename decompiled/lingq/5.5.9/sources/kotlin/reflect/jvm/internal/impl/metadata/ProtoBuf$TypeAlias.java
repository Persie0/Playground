package kotlin.reflect.jvm.internal.impl.metadata;

import com.android.installreferrer.api.InstallReferrerClient;
import com.kochava.tracker.BuildConfig;
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
public final class ProtoBuf$TypeAlias extends GeneratedMessageLite.ExtendableMessage<ProtoBuf$TypeAlias> {

    /* JADX INFO: renamed from: J */
    public static final ProtoBuf$TypeAlias f39295J;

    /* JADX INFO: renamed from: K */
    public static final C6952a f39296K = new C6952a();

    /* JADX INFO: renamed from: H */
    public byte f39297H;

    /* JADX INFO: renamed from: I */
    public int f39298I;

    /* JADX INFO: renamed from: b */
    public final AbstractC7803a f39299b;

    /* JADX INFO: renamed from: c */
    public int f39300c;

    /* JADX INFO: renamed from: d */
    public int f39301d;

    /* JADX INFO: renamed from: e */
    public int f39302e;

    /* JADX INFO: renamed from: f */
    public List<ProtoBuf$TypeParameter> f39303f;

    /* JADX INFO: renamed from: g */
    public ProtoBuf$Type f39304g;

    /* JADX INFO: renamed from: h */
    public int f39305h;

    /* JADX INFO: renamed from: i */
    public ProtoBuf$Type f39306i;

    /* JADX INFO: renamed from: j */
    public int f39307j;

    /* JADX INFO: renamed from: k */
    public List<ProtoBuf$Annotation> f39308k;

    /* JADX INFO: renamed from: l */
    public List<Integer> f39309l;

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeAlias$a */
    public static class C6952a extends AbstractC6991b<ProtoBuf$TypeAlias> {
        @Override // p282nn.InterfaceC7809g
        /* JADX INFO: renamed from: a */
        public final Object mo13787a(C6992c c6992c, C6993d c6993d) throws InvalidProtocolBufferException {
            return new ProtoBuf$TypeAlias(c6992c, c6993d);
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeAlias$b */
    public static final class C6953b extends GeneratedMessageLite.AbstractC6983c<ProtoBuf$TypeAlias, C6953b> {

        /* JADX INFO: renamed from: H */
        public List<Integer> f39310H;

        /* JADX INFO: renamed from: d */
        public int f39311d;

        /* JADX INFO: renamed from: f */
        public int f39313f;

        /* JADX INFO: renamed from: h */
        public ProtoBuf$Type f39315h;

        /* JADX INFO: renamed from: i */
        public int f39316i;

        /* JADX INFO: renamed from: j */
        public ProtoBuf$Type f39317j;

        /* JADX INFO: renamed from: k */
        public int f39318k;

        /* JADX INFO: renamed from: l */
        public List<ProtoBuf$Annotation> f39319l;

        /* JADX INFO: renamed from: e */
        public int f39312e = 6;

        /* JADX INFO: renamed from: g */
        public List<ProtoBuf$TypeParameter> f39314g = Collections.emptyList();

        public C6953b() {
            ProtoBuf$Type protoBuf$Type = ProtoBuf$Type.f39246O;
            this.f39315h = protoBuf$Type;
            this.f39317j = protoBuf$Type;
            this.f39319l = Collections.emptyList();
            this.f39310H = Collections.emptyList();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC6990a.a, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC6997h.a
        /* JADX INFO: renamed from: Q */
        public final /* bridge */ /* synthetic */ InterfaceC6997h.a mo13788Q(C6992c c6992c, C6993d c6993d) throws Throwable {
            m13857o(c6992c, c6993d);
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC6997h.a
        /* JADX INFO: renamed from: a */
        public final InterfaceC6997h mo13789a() {
            ProtoBuf$TypeAlias protoBuf$TypeAliasM13855m = m13855m();
            if (protoBuf$TypeAliasM13855m.mo13780b()) {
                return protoBuf$TypeAliasM13855m;
            }
            throw new UninitializedMessageException();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.AbstractC6982b
        public final Object clone() throws CloneNotSupportedException {
            C6953b c6953b = new C6953b();
            c6953b.m13856n(m13855m());
            return c6953b;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC6990a.a
        /* JADX INFO: renamed from: f */
        public final /* bridge */ /* synthetic */ AbstractC6990a.a mo13788Q(C6992c c6992c, C6993d c6993d) throws Throwable {
            m13857o(c6992c, c6993d);
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.AbstractC6982b
        /* JADX INFO: renamed from: g */
        public final GeneratedMessageLite.AbstractC6982b clone() {
            C6953b c6953b = new C6953b();
            c6953b.m13856n(m13855m());
            return c6953b;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.AbstractC6982b
        /* JADX INFO: renamed from: i */
        public final /* bridge */ /* synthetic */ GeneratedMessageLite.AbstractC6982b mo13792i(GeneratedMessageLite generatedMessageLite) {
            m13856n((ProtoBuf$TypeAlias) generatedMessageLite);
            return this;
        }

        /* JADX INFO: renamed from: m */
        public final ProtoBuf$TypeAlias m13855m() {
            ProtoBuf$TypeAlias protoBuf$TypeAlias = new ProtoBuf$TypeAlias(this);
            int i10 = this.f39311d;
            int i11 = (i10 & 1) != 1 ? 0 : 1;
            protoBuf$TypeAlias.f39301d = this.f39312e;
            if ((i10 & 2) == 2) {
                i11 |= 2;
            }
            protoBuf$TypeAlias.f39302e = this.f39313f;
            if ((i10 & 4) == 4) {
                this.f39314g = Collections.unmodifiableList(this.f39314g);
                this.f39311d &= -5;
            }
            protoBuf$TypeAlias.f39303f = this.f39314g;
            if ((i10 & 8) == 8) {
                i11 |= 4;
            }
            protoBuf$TypeAlias.f39304g = this.f39315h;
            if ((i10 & 16) == 16) {
                i11 |= 8;
            }
            protoBuf$TypeAlias.f39305h = this.f39316i;
            if ((i10 & 32) == 32) {
                i11 |= 16;
            }
            protoBuf$TypeAlias.f39306i = this.f39317j;
            if ((i10 & 64) == 64) {
                i11 |= 32;
            }
            protoBuf$TypeAlias.f39307j = this.f39318k;
            if ((this.f39311d & BuildConfig.SDK_TRUNCATE_LENGTH) == 128) {
                this.f39319l = Collections.unmodifiableList(this.f39319l);
                this.f39311d &= -129;
            }
            protoBuf$TypeAlias.f39308k = this.f39319l;
            if ((this.f39311d & 256) == 256) {
                this.f39310H = Collections.unmodifiableList(this.f39310H);
                this.f39311d &= -257;
            }
            protoBuf$TypeAlias.f39309l = this.f39310H;
            protoBuf$TypeAlias.f39300c = i11;
            return protoBuf$TypeAlias;
        }

        /* JADX INFO: renamed from: n */
        public final void m13856n(ProtoBuf$TypeAlias protoBuf$TypeAlias) {
            ProtoBuf$Type protoBuf$Type;
            ProtoBuf$Type protoBuf$Type2;
            if (protoBuf$TypeAlias == ProtoBuf$TypeAlias.f39295J) {
                return;
            }
            int i10 = protoBuf$TypeAlias.f39300c;
            if ((i10 & 1) == 1) {
                int i11 = protoBuf$TypeAlias.f39301d;
                this.f39311d |= 1;
                this.f39312e = i11;
            }
            if ((i10 & 2) == 2) {
                int i12 = protoBuf$TypeAlias.f39302e;
                this.f39311d = 2 | this.f39311d;
                this.f39313f = i12;
            }
            if (!protoBuf$TypeAlias.f39303f.isEmpty()) {
                if (this.f39314g.isEmpty()) {
                    this.f39314g = protoBuf$TypeAlias.f39303f;
                    this.f39311d &= -5;
                } else {
                    if ((this.f39311d & 4) != 4) {
                        this.f39314g = new ArrayList(this.f39314g);
                        this.f39311d |= 4;
                    }
                    this.f39314g.addAll(protoBuf$TypeAlias.f39303f);
                }
            }
            if ((protoBuf$TypeAlias.f39300c & 4) == 4) {
                ProtoBuf$Type protoBuf$Type3 = protoBuf$TypeAlias.f39304g;
                if ((this.f39311d & 8) != 8 || (protoBuf$Type2 = this.f39315h) == ProtoBuf$Type.f39246O) {
                    this.f39315h = protoBuf$Type3;
                } else {
                    ProtoBuf$Type.C6951b c6951bM13844C = ProtoBuf$Type.m13844C(protoBuf$Type2);
                    c6951bM13844C.m13852n(protoBuf$Type3);
                    this.f39315h = c6951bM13844C.m13851m();
                }
                this.f39311d |= 8;
            }
            int i13 = protoBuf$TypeAlias.f39300c;
            if ((i13 & 8) == 8) {
                int i14 = protoBuf$TypeAlias.f39305h;
                this.f39311d |= 16;
                this.f39316i = i14;
            }
            if ((i13 & 16) == 16) {
                ProtoBuf$Type protoBuf$Type4 = protoBuf$TypeAlias.f39306i;
                if ((this.f39311d & 32) != 32 || (protoBuf$Type = this.f39317j) == ProtoBuf$Type.f39246O) {
                    this.f39317j = protoBuf$Type4;
                } else {
                    ProtoBuf$Type.C6951b c6951bM13844C2 = ProtoBuf$Type.m13844C(protoBuf$Type);
                    c6951bM13844C2.m13852n(protoBuf$Type4);
                    this.f39317j = c6951bM13844C2.m13851m();
                }
                this.f39311d |= 32;
            }
            if ((protoBuf$TypeAlias.f39300c & 32) == 32) {
                int i15 = protoBuf$TypeAlias.f39307j;
                this.f39311d |= 64;
                this.f39318k = i15;
            }
            if (!protoBuf$TypeAlias.f39308k.isEmpty()) {
                if (this.f39319l.isEmpty()) {
                    this.f39319l = protoBuf$TypeAlias.f39308k;
                    this.f39311d &= -129;
                } else {
                    if ((this.f39311d & BuildConfig.SDK_TRUNCATE_LENGTH) != 128) {
                        this.f39319l = new ArrayList(this.f39319l);
                        this.f39311d |= BuildConfig.SDK_TRUNCATE_LENGTH;
                    }
                    this.f39319l.addAll(protoBuf$TypeAlias.f39308k);
                }
            }
            if (!protoBuf$TypeAlias.f39309l.isEmpty()) {
                if (this.f39310H.isEmpty()) {
                    this.f39310H = protoBuf$TypeAlias.f39309l;
                    this.f39311d &= -257;
                } else {
                    if ((this.f39311d & 256) != 256) {
                        this.f39310H = new ArrayList(this.f39310H);
                        this.f39311d |= 256;
                    }
                    this.f39310H.addAll(protoBuf$TypeAlias.f39309l);
                }
            }
            m13928k(protoBuf$TypeAlias);
            this.f39493a = this.f39493a.m15519f(protoBuf$TypeAlias.f39299b);
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0022  */
        /* JADX INFO: renamed from: o */
        public final void m13857o(C6992c c6992c, C6993d c6993d) throws Throwable {
            ProtoBuf$TypeAlias protoBuf$TypeAlias;
            try {
                try {
                    ProtoBuf$TypeAlias.f39296K.getClass();
                    m13856n(new ProtoBuf$TypeAlias(c6992c, c6993d));
                } catch (InvalidProtocolBufferException e10) {
                    protoBuf$TypeAlias = (ProtoBuf$TypeAlias) e10.f39506a;
                    try {
                        throw e10;
                    } catch (Throwable th2) {
                        th = th2;
                        if (protoBuf$TypeAlias != null) {
                            m13856n(protoBuf$TypeAlias);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                protoBuf$TypeAlias = null;
                if (protoBuf$TypeAlias != null) {
                    m13856n(protoBuf$TypeAlias);
                }
                throw th;
            }
        }
    }

    static {
        ProtoBuf$TypeAlias protoBuf$TypeAlias = new ProtoBuf$TypeAlias(0);
        f39295J = protoBuf$TypeAlias;
        protoBuf$TypeAlias.m13854z();
    }

    public ProtoBuf$TypeAlias() {
        throw null;
    }

    public ProtoBuf$TypeAlias(int i10) {
        this.f39297H = (byte) -1;
        this.f39298I = -1;
        this.f39299b = AbstractC7803a.f42882a;
    }

    public ProtoBuf$TypeAlias(GeneratedMessageLite.AbstractC6983c abstractC6983c) {
        super(abstractC6983c);
        this.f39297H = (byte) -1;
        this.f39298I = -1;
        this.f39299b = abstractC6983c.f39493a;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public ProtoBuf$TypeAlias(C6992c c6992c, C6993d c6993d) throws InvalidProtocolBufferException {
        this.f39297H = (byte) -1;
        this.f39298I = -1;
        m13854z();
        AbstractC7803a.b bVar = new AbstractC7803a.b();
        CodedOutputStream codedOutputStreamM13901j = CodedOutputStream.m13901j(bVar, 1);
        boolean z10 = false;
        int i10 = 0;
        while (!z10) {
            try {
                try {
                    int iM13952n = c6992c.m13952n();
                    ProtoBuf$Type.C6951b c6951bM13844C = null;
                    switch (iM13952n) {
                        case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                            break;
                        case 8:
                            this.f39300c |= 1;
                            this.f39301d = c6992c.m13949k();
                            continue;
                        case 16:
                            this.f39300c |= 2;
                            this.f39302e = c6992c.m13949k();
                            continue;
                        case 26:
                            if ((i10 & 4) != 4) {
                                this.f39303f = new ArrayList();
                                i10 |= 4;
                            }
                            this.f39303f.add((ProtoBuf$TypeParameter) c6992c.m13945g(ProtoBuf$TypeParameter.f39321I, c6993d));
                            continue;
                        case 34:
                            if ((this.f39300c & 4) == 4) {
                                ProtoBuf$Type protoBuf$Type = this.f39304g;
                                protoBuf$Type.getClass();
                                c6951bM13844C = ProtoBuf$Type.m13844C(protoBuf$Type);
                            }
                            ProtoBuf$Type protoBuf$Type2 = (ProtoBuf$Type) c6992c.m13945g(ProtoBuf$Type.f39247P, c6993d);
                            this.f39304g = protoBuf$Type2;
                            if (c6951bM13844C != null) {
                                c6951bM13844C.m13852n(protoBuf$Type2);
                                this.f39304g = c6951bM13844C.m13851m();
                            }
                            this.f39300c |= 4;
                            continue;
                        case 40:
                            this.f39300c |= 8;
                            this.f39305h = c6992c.m13949k();
                            continue;
                        case 50:
                            if ((this.f39300c & 16) == 16) {
                                ProtoBuf$Type protoBuf$Type3 = this.f39306i;
                                protoBuf$Type3.getClass();
                                c6951bM13844C = ProtoBuf$Type.m13844C(protoBuf$Type3);
                            }
                            ProtoBuf$Type protoBuf$Type4 = (ProtoBuf$Type) c6992c.m13945g(ProtoBuf$Type.f39247P, c6993d);
                            this.f39306i = protoBuf$Type4;
                            if (c6951bM13844C != null) {
                                c6951bM13844C.m13852n(protoBuf$Type4);
                                this.f39306i = c6951bM13844C.m13851m();
                            }
                            this.f39300c |= 16;
                            continue;
                        case 56:
                            this.f39300c |= 32;
                            this.f39307j = c6992c.m13949k();
                            continue;
                        case 66:
                            if ((i10 & BuildConfig.SDK_TRUNCATE_LENGTH) != 128) {
                                this.f39308k = new ArrayList();
                                i10 |= BuildConfig.SDK_TRUNCATE_LENGTH;
                            }
                            this.f39308k.add((ProtoBuf$Annotation) c6992c.m13945g(ProtoBuf$Annotation.f38936h, c6993d));
                            continue;
                        case 248:
                            if ((i10 & 256) != 256) {
                                this.f39309l = new ArrayList();
                                i10 |= 256;
                            }
                            this.f39309l.add(Integer.valueOf(c6992c.m13949k()));
                            continue;
                        case 250:
                            int iM13942d = c6992c.m13942d(c6992c.m13949k());
                            if ((i10 & 256) != 256 && c6992c.m13940b() > 0) {
                                this.f39309l = new ArrayList();
                                i10 |= 256;
                            }
                            while (c6992c.m13940b() > 0) {
                                this.f39309l.add(Integer.valueOf(c6992c.m13949k()));
                            }
                            c6992c.m13941c(iM13942d);
                            continue;
                        default:
                            if (!m13925x(c6992c, codedOutputStreamM13901j, c6993d, iM13952n)) {
                                break;
                            }
                            break;
                    }
                    z10 = true;
                } catch (Throwable th2) {
                    if ((i10 & 4) == 4) {
                        this.f39303f = Collections.unmodifiableList(this.f39303f);
                    }
                    if ((i10 & BuildConfig.SDK_TRUNCATE_LENGTH) == 128) {
                        this.f39308k = Collections.unmodifiableList(this.f39308k);
                    }
                    if ((i10 & 256) == 256) {
                        this.f39309l = Collections.unmodifiableList(this.f39309l);
                    }
                    try {
                        codedOutputStreamM13901j.m13902i();
                    } catch (IOException unused) {
                    } catch (Throwable th3) {
                        this.f39299b = bVar.m15533l();
                        throw th3;
                    }
                    this.f39299b = bVar.m15533l();
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
        if ((i10 & 4) == 4) {
            this.f39303f = Collections.unmodifiableList(this.f39303f);
        }
        if ((i10 & BuildConfig.SDK_TRUNCATE_LENGTH) == 128) {
            this.f39308k = Collections.unmodifiableList(this.f39308k);
        }
        if ((i10 & 256) == 256) {
            this.f39309l = Collections.unmodifiableList(this.f39309l);
        }
        try {
            codedOutputStreamM13901j.m13902i();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f39299b = bVar.m15533l();
            throw th4;
        }
        this.f39299b = bVar.m15533l();
        m13923t();
    }

    @Override // p282nn.InterfaceC7808f
    /* JADX INFO: renamed from: b */
    public final boolean mo13780b() {
        byte b10 = this.f39297H;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        if (!((this.f39300c & 2) == 2)) {
            this.f39297H = (byte) 0;
            return false;
        }
        for (int i10 = 0; i10 < this.f39303f.size(); i10++) {
            if (!this.f39303f.get(i10).mo13780b()) {
                this.f39297H = (byte) 0;
                return false;
            }
        }
        if (((this.f39300c & 4) == 4) && !this.f39304g.mo13780b()) {
            this.f39297H = (byte) 0;
            return false;
        }
        if (((this.f39300c & 16) == 16) && !this.f39306i.mo13780b()) {
            this.f39297H = (byte) 0;
            return false;
        }
        for (int i11 = 0; i11 < this.f39308k.size(); i11++) {
            if (!this.f39308k.get(i11).mo13780b()) {
                this.f39297H = (byte) 0;
                return false;
            }
        }
        if (m13919n()) {
            this.f39297H = (byte) 1;
            return true;
        }
        this.f39297H = (byte) 0;
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC6997h
    /* JADX INFO: renamed from: c */
    public final InterfaceC6997h.a mo13781c() {
        C6953b c6953b = new C6953b();
        c6953b.m13856n(this);
        return c6953b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC6997h
    /* JADX INFO: renamed from: d */
    public final int mo13782d() {
        int i10 = this.f39298I;
        if (i10 != -1) {
            return i10;
        }
        int iM13894b = (this.f39300c & 1) == 1 ? CodedOutputStream.m13894b(1, this.f39301d) + 0 : 0;
        if ((this.f39300c & 2) == 2) {
            iM13894b += CodedOutputStream.m13894b(2, this.f39302e);
        }
        for (int i11 = 0; i11 < this.f39303f.size(); i11++) {
            iM13894b += CodedOutputStream.m13896d(3, this.f39303f.get(i11));
        }
        if ((this.f39300c & 4) == 4) {
            iM13894b += CodedOutputStream.m13896d(4, this.f39304g);
        }
        if ((this.f39300c & 8) == 8) {
            iM13894b += CodedOutputStream.m13894b(5, this.f39305h);
        }
        if ((this.f39300c & 16) == 16) {
            iM13894b += CodedOutputStream.m13896d(6, this.f39306i);
        }
        if ((this.f39300c & 32) == 32) {
            iM13894b += CodedOutputStream.m13894b(7, this.f39307j);
        }
        for (int i12 = 0; i12 < this.f39308k.size(); i12++) {
            iM13894b += CodedOutputStream.m13896d(8, this.f39308k.get(i12));
        }
        int iM13895c = 0;
        for (int i13 = 0; i13 < this.f39309l.size(); i13++) {
            iM13895c += CodedOutputStream.m13895c(this.f39309l.get(i13).intValue());
        }
        int size = this.f39299b.size() + m13920q() + (this.f39309l.size() * 2) + iM13894b + iM13895c;
        this.f39298I = size;
        return size;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC6997h
    /* JADX INFO: renamed from: e */
    public final InterfaceC6997h.a mo13783e() {
        return new C6953b();
    }

    @Override // p282nn.InterfaceC7808f
    /* JADX INFO: renamed from: h */
    public final InterfaceC6997h mo13802h() {
        return f39295J;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC6997h
    /* JADX INFO: renamed from: j */
    public final void mo13784j(CodedOutputStream codedOutputStream) throws IOException {
        mo13782d();
        GeneratedMessageLite.ExtendableMessage.C6980a c6980a = new GeneratedMessageLite.ExtendableMessage.C6980a(this);
        if ((this.f39300c & 1) == 1) {
            codedOutputStream.m13905m(1, this.f39301d);
        }
        if ((this.f39300c & 2) == 2) {
            codedOutputStream.m13905m(2, this.f39302e);
        }
        for (int i10 = 0; i10 < this.f39303f.size(); i10++) {
            codedOutputStream.m13907o(3, this.f39303f.get(i10));
        }
        if ((this.f39300c & 4) == 4) {
            codedOutputStream.m13907o(4, this.f39304g);
        }
        if ((this.f39300c & 8) == 8) {
            codedOutputStream.m13905m(5, this.f39305h);
        }
        if ((this.f39300c & 16) == 16) {
            codedOutputStream.m13907o(6, this.f39306i);
        }
        if ((this.f39300c & 32) == 32) {
            codedOutputStream.m13905m(7, this.f39307j);
        }
        for (int i11 = 0; i11 < this.f39308k.size(); i11++) {
            codedOutputStream.m13907o(8, this.f39308k.get(i11));
        }
        for (int i12 = 0; i12 < this.f39309l.size(); i12++) {
            codedOutputStream.m13905m(31, this.f39309l.get(i12).intValue());
        }
        c6980a.m13927a(200, codedOutputStream);
        codedOutputStream.m13910r(this.f39299b);
    }

    /* JADX INFO: renamed from: z */
    public final void m13854z() {
        this.f39301d = 6;
        this.f39302e = 0;
        this.f39303f = Collections.emptyList();
        ProtoBuf$Type protoBuf$Type = ProtoBuf$Type.f39246O;
        this.f39304g = protoBuf$Type;
        this.f39305h = 0;
        this.f39306i = protoBuf$Type;
        this.f39307j = 0;
        this.f39308k = Collections.emptyList();
        this.f39309l = Collections.emptyList();
    }
}
