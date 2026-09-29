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
import kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC6997h;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;
import p282nn.AbstractC7803a;

/* JADX INFO: loaded from: classes2.dex */
public final class ProtoBuf$Property extends GeneratedMessageLite.ExtendableMessage<ProtoBuf$Property> {

    /* JADX INFO: renamed from: P */
    public static final ProtoBuf$Property f39181P;

    /* JADX INFO: renamed from: Q */
    public static final C6938a f39182Q = new C6938a();

    /* JADX INFO: renamed from: H */
    public List<Integer> f39183H;

    /* JADX INFO: renamed from: I */
    public int f39184I;

    /* JADX INFO: renamed from: J */
    public ProtoBuf$ValueParameter f39185J;

    /* JADX INFO: renamed from: K */
    public int f39186K;

    /* JADX INFO: renamed from: L */
    public int f39187L;

    /* JADX INFO: renamed from: M */
    public List<Integer> f39188M;

    /* JADX INFO: renamed from: N */
    public byte f39189N;

    /* JADX INFO: renamed from: O */
    public int f39190O;

    /* JADX INFO: renamed from: b */
    public final AbstractC7803a f39191b;

    /* JADX INFO: renamed from: c */
    public int f39192c;

    /* JADX INFO: renamed from: d */
    public int f39193d;

    /* JADX INFO: renamed from: e */
    public int f39194e;

    /* JADX INFO: renamed from: f */
    public int f39195f;

    /* JADX INFO: renamed from: g */
    public ProtoBuf$Type f39196g;

    /* JADX INFO: renamed from: h */
    public int f39197h;

    /* JADX INFO: renamed from: i */
    public List<ProtoBuf$TypeParameter> f39198i;

    /* JADX INFO: renamed from: j */
    public ProtoBuf$Type f39199j;

    /* JADX INFO: renamed from: k */
    public int f39200k;

    /* JADX INFO: renamed from: l */
    public List<ProtoBuf$Type> f39201l;

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property$a */
    public static class C6938a extends AbstractC6991b<ProtoBuf$Property> {
        @Override // p282nn.InterfaceC7809g
        /* JADX INFO: renamed from: a */
        public final Object mo13787a(C6992c c6992c, C6993d c6993d) throws InvalidProtocolBufferException {
            return new ProtoBuf$Property(c6992c, c6993d);
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property$b */
    public static final class C6939b extends GeneratedMessageLite.AbstractC6983c<ProtoBuf$Property, C6939b> {

        /* JADX INFO: renamed from: H */
        public List<ProtoBuf$Type> f39202H;

        /* JADX INFO: renamed from: I */
        public List<Integer> f39203I;

        /* JADX INFO: renamed from: J */
        public ProtoBuf$ValueParameter f39204J;

        /* JADX INFO: renamed from: K */
        public int f39205K;

        /* JADX INFO: renamed from: L */
        public int f39206L;

        /* JADX INFO: renamed from: M */
        public List<Integer> f39207M;

        /* JADX INFO: renamed from: d */
        public int f39208d;

        /* JADX INFO: renamed from: e */
        public int f39209e = 518;

        /* JADX INFO: renamed from: f */
        public int f39210f = 2054;

        /* JADX INFO: renamed from: g */
        public int f39211g;

        /* JADX INFO: renamed from: h */
        public ProtoBuf$Type f39212h;

        /* JADX INFO: renamed from: i */
        public int f39213i;

        /* JADX INFO: renamed from: j */
        public List<ProtoBuf$TypeParameter> f39214j;

        /* JADX INFO: renamed from: k */
        public ProtoBuf$Type f39215k;

        /* JADX INFO: renamed from: l */
        public int f39216l;

        public C6939b() {
            ProtoBuf$Type protoBuf$Type = ProtoBuf$Type.f39246O;
            this.f39212h = protoBuf$Type;
            this.f39214j = Collections.emptyList();
            this.f39215k = protoBuf$Type;
            this.f39202H = Collections.emptyList();
            this.f39203I = Collections.emptyList();
            this.f39204J = ProtoBuf$ValueParameter.f39353l;
            this.f39207M = Collections.emptyList();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC6990a.a, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC6997h.a
        /* JADX INFO: renamed from: Q */
        public final /* bridge */ /* synthetic */ InterfaceC6997h.a mo13788Q(C6992c c6992c, C6993d c6993d) throws Throwable {
            m13834o(c6992c, c6993d);
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC6997h.a
        /* JADX INFO: renamed from: a */
        public final InterfaceC6997h mo13789a() {
            ProtoBuf$Property protoBuf$PropertyM13832m = m13832m();
            if (protoBuf$PropertyM13832m.mo13780b()) {
                return protoBuf$PropertyM13832m;
            }
            throw new UninitializedMessageException();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.AbstractC6982b
        public final Object clone() throws CloneNotSupportedException {
            C6939b c6939b = new C6939b();
            c6939b.m13833n(m13832m());
            return c6939b;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC6990a.a
        /* JADX INFO: renamed from: f */
        public final /* bridge */ /* synthetic */ AbstractC6990a.a mo13788Q(C6992c c6992c, C6993d c6993d) throws Throwable {
            m13834o(c6992c, c6993d);
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.AbstractC6982b
        /* JADX INFO: renamed from: g */
        public final GeneratedMessageLite.AbstractC6982b clone() {
            C6939b c6939b = new C6939b();
            c6939b.m13833n(m13832m());
            return c6939b;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.AbstractC6982b
        /* JADX INFO: renamed from: i */
        public final /* bridge */ /* synthetic */ GeneratedMessageLite.AbstractC6982b mo13792i(GeneratedMessageLite generatedMessageLite) {
            m13833n((ProtoBuf$Property) generatedMessageLite);
            return this;
        }

        /* JADX INFO: renamed from: m */
        public final ProtoBuf$Property m13832m() {
            ProtoBuf$Property protoBuf$Property = new ProtoBuf$Property(this);
            int i10 = this.f39208d;
            int i11 = 1;
            if ((i10 & 1) != 1) {
                i11 = 0;
            }
            protoBuf$Property.f39193d = this.f39209e;
            if ((i10 & 2) == 2) {
                i11 |= 2;
            }
            protoBuf$Property.f39194e = this.f39210f;
            if ((i10 & 4) == 4) {
                i11 |= 4;
            }
            protoBuf$Property.f39195f = this.f39211g;
            if ((i10 & 8) == 8) {
                i11 |= 8;
            }
            protoBuf$Property.f39196g = this.f39212h;
            if ((i10 & 16) == 16) {
                i11 |= 16;
            }
            protoBuf$Property.f39197h = this.f39213i;
            if ((i10 & 32) == 32) {
                this.f39214j = Collections.unmodifiableList(this.f39214j);
                this.f39208d &= -33;
            }
            protoBuf$Property.f39198i = this.f39214j;
            if ((i10 & 64) == 64) {
                i11 |= 32;
            }
            protoBuf$Property.f39199j = this.f39215k;
            if ((i10 & BuildConfig.SDK_TRUNCATE_LENGTH) == 128) {
                i11 |= 64;
            }
            protoBuf$Property.f39200k = this.f39216l;
            if ((this.f39208d & 256) == 256) {
                this.f39202H = Collections.unmodifiableList(this.f39202H);
                this.f39208d &= -257;
            }
            protoBuf$Property.f39201l = this.f39202H;
            if ((this.f39208d & 512) == 512) {
                this.f39203I = Collections.unmodifiableList(this.f39203I);
                this.f39208d &= -513;
            }
            protoBuf$Property.f39183H = this.f39203I;
            if ((i10 & 1024) == 1024) {
                i11 |= BuildConfig.SDK_TRUNCATE_LENGTH;
            }
            protoBuf$Property.f39185J = this.f39204J;
            if ((i10 & 2048) == 2048) {
                i11 |= 256;
            }
            protoBuf$Property.f39186K = this.f39205K;
            if ((i10 & 4096) == 4096) {
                i11 |= 512;
            }
            protoBuf$Property.f39187L = this.f39206L;
            if ((this.f39208d & 8192) == 8192) {
                this.f39207M = Collections.unmodifiableList(this.f39207M);
                this.f39208d &= -8193;
            }
            protoBuf$Property.f39188M = this.f39207M;
            protoBuf$Property.f39192c = i11;
            return protoBuf$Property;
        }

        /* JADX INFO: renamed from: n */
        public final void m13833n(ProtoBuf$Property protoBuf$Property) {
            ProtoBuf$ValueParameter protoBuf$ValueParameter;
            ProtoBuf$Type protoBuf$Type;
            ProtoBuf$Type protoBuf$Type2;
            if (protoBuf$Property == ProtoBuf$Property.f39181P) {
                return;
            }
            int i10 = protoBuf$Property.f39192c;
            boolean z10 = false;
            if ((i10 & 1) == 1) {
                int i11 = protoBuf$Property.f39193d;
                this.f39208d |= 1;
                this.f39209e = i11;
            }
            if ((i10 & 2) == 2) {
                int i12 = protoBuf$Property.f39194e;
                this.f39208d = 2 | this.f39208d;
                this.f39210f = i12;
            }
            if ((i10 & 4) == 4) {
                int i13 = protoBuf$Property.f39195f;
                this.f39208d = 4 | this.f39208d;
                this.f39211g = i13;
            }
            if ((i10 & 8) == 8) {
                ProtoBuf$Type protoBuf$Type3 = protoBuf$Property.f39196g;
                if ((this.f39208d & 8) != 8 || (protoBuf$Type2 = this.f39212h) == ProtoBuf$Type.f39246O) {
                    this.f39212h = protoBuf$Type3;
                } else {
                    ProtoBuf$Type.C6951b c6951bM13844C = ProtoBuf$Type.m13844C(protoBuf$Type2);
                    c6951bM13844C.m13852n(protoBuf$Type3);
                    this.f39212h = c6951bM13844C.m13851m();
                }
                this.f39208d |= 8;
            }
            if ((protoBuf$Property.f39192c & 16) == 16) {
                int i14 = protoBuf$Property.f39197h;
                this.f39208d = 16 | this.f39208d;
                this.f39213i = i14;
            }
            if (!protoBuf$Property.f39198i.isEmpty()) {
                if (this.f39214j.isEmpty()) {
                    this.f39214j = protoBuf$Property.f39198i;
                    this.f39208d &= -33;
                } else {
                    if ((this.f39208d & 32) != 32) {
                        this.f39214j = new ArrayList(this.f39214j);
                        this.f39208d |= 32;
                    }
                    this.f39214j.addAll(protoBuf$Property.f39198i);
                }
            }
            if ((protoBuf$Property.f39192c & 32) == 32) {
                ProtoBuf$Type protoBuf$Type4 = protoBuf$Property.f39199j;
                if ((this.f39208d & 64) != 64 || (protoBuf$Type = this.f39215k) == ProtoBuf$Type.f39246O) {
                    this.f39215k = protoBuf$Type4;
                } else {
                    ProtoBuf$Type.C6951b c6951bM13844C2 = ProtoBuf$Type.m13844C(protoBuf$Type);
                    c6951bM13844C2.m13852n(protoBuf$Type4);
                    this.f39215k = c6951bM13844C2.m13851m();
                }
                this.f39208d |= 64;
            }
            if ((protoBuf$Property.f39192c & 64) == 64) {
                int i15 = protoBuf$Property.f39200k;
                this.f39208d |= BuildConfig.SDK_TRUNCATE_LENGTH;
                this.f39216l = i15;
            }
            if (!protoBuf$Property.f39201l.isEmpty()) {
                if (this.f39202H.isEmpty()) {
                    this.f39202H = protoBuf$Property.f39201l;
                    this.f39208d &= -257;
                } else {
                    if ((this.f39208d & 256) != 256) {
                        this.f39202H = new ArrayList(this.f39202H);
                        this.f39208d |= 256;
                    }
                    this.f39202H.addAll(protoBuf$Property.f39201l);
                }
            }
            if (!protoBuf$Property.f39183H.isEmpty()) {
                if (this.f39203I.isEmpty()) {
                    this.f39203I = protoBuf$Property.f39183H;
                    this.f39208d &= -513;
                } else {
                    if ((this.f39208d & 512) != 512) {
                        this.f39203I = new ArrayList(this.f39203I);
                        this.f39208d |= 512;
                    }
                    this.f39203I.addAll(protoBuf$Property.f39183H);
                }
            }
            if ((protoBuf$Property.f39192c & BuildConfig.SDK_TRUNCATE_LENGTH) == 128) {
                ProtoBuf$ValueParameter protoBuf$ValueParameter2 = protoBuf$Property.f39185J;
                if ((this.f39208d & 1024) != 1024 || (protoBuf$ValueParameter = this.f39204J) == ProtoBuf$ValueParameter.f39353l) {
                    this.f39204J = protoBuf$ValueParameter2;
                } else {
                    ProtoBuf$ValueParameter.C6960b c6960b = new ProtoBuf$ValueParameter.C6960b();
                    c6960b.m13867n(protoBuf$ValueParameter);
                    c6960b.m13867n(protoBuf$ValueParameter2);
                    this.f39204J = c6960b.m13866m();
                }
                this.f39208d |= 1024;
            }
            int i16 = protoBuf$Property.f39192c;
            if ((i16 & 256) == 256) {
                int i17 = protoBuf$Property.f39186K;
                this.f39208d |= 2048;
                this.f39205K = i17;
            }
            if ((i16 & 512) == 512) {
                z10 = true;
            }
            if (z10) {
                int i18 = protoBuf$Property.f39187L;
                this.f39208d |= 4096;
                this.f39206L = i18;
            }
            if (!protoBuf$Property.f39188M.isEmpty()) {
                if (this.f39207M.isEmpty()) {
                    this.f39207M = protoBuf$Property.f39188M;
                    this.f39208d &= -8193;
                } else {
                    if ((this.f39208d & 8192) != 8192) {
                        this.f39207M = new ArrayList(this.f39207M);
                        this.f39208d |= 8192;
                    }
                    this.f39207M.addAll(protoBuf$Property.f39188M);
                }
            }
            m13928k(protoBuf$Property);
            this.f39493a = this.f39493a.m15519f(protoBuf$Property.f39191b);
        }

        /* JADX WARN: Code duplicated, block: B:17:0x0020  */
        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* JADX INFO: renamed from: o */
        public final void m13834o(C6992c c6992c, C6993d c6993d) throws Throwable {
            ProtoBuf$Property protoBuf$Property;
            try {
                try {
                    ProtoBuf$Property.f39182Q.getClass();
                    m13833n(new ProtoBuf$Property(c6992c, c6993d));
                } catch (InvalidProtocolBufferException e10) {
                    protoBuf$Property = (ProtoBuf$Property) e10.f39506a;
                    try {
                        throw e10;
                    } catch (Throwable th2) {
                        th = th2;
                        if (protoBuf$Property != null) {
                            m13833n(protoBuf$Property);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                protoBuf$Property = null;
                if (protoBuf$Property != null) {
                    m13833n(protoBuf$Property);
                }
                throw th;
            }
        }
    }

    static {
        ProtoBuf$Property protoBuf$Property = new ProtoBuf$Property(0);
        f39181P = protoBuf$Property;
        protoBuf$Property.m13831z();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public ProtoBuf$Property() {
        throw null;
    }

    public ProtoBuf$Property(int i10) {
        this.f39184I = -1;
        this.f39189N = (byte) -1;
        this.f39190O = -1;
        this.f39191b = AbstractC7803a.f42882a;
    }

    public ProtoBuf$Property(GeneratedMessageLite.AbstractC6983c abstractC6983c) {
        super(abstractC6983c);
        this.f39184I = -1;
        this.f39189N = (byte) -1;
        this.f39190O = -1;
        this.f39191b = abstractC6983c.f39493a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unreachable blocks removed: 4, instructions: 4 */
    public ProtoBuf$Property(C6992c c6992c, C6993d c6993d) throws InvalidProtocolBufferException {
        this.f39184I = -1;
        this.f39189N = (byte) -1;
        this.f39190O = -1;
        m13831z();
        AbstractC7803a.b bVar = new AbstractC7803a.b();
        CodedOutputStream codedOutputStreamM13901j = CodedOutputStream.m13901j(bVar, 1);
        boolean z10 = false;
        int i10 = 0;
        while (!z10) {
            try {
                try {
                    int iM13952n = c6992c.m13952n();
                    ProtoBuf$Type.C6951b c6951b = null;
                    switch (iM13952n) {
                        case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                            break;
                        case 8:
                            this.f39192c |= 2;
                            this.f39194e = c6992c.m13949k();
                            continue;
                        case 16:
                            this.f39192c |= 4;
                            this.f39195f = c6992c.m13949k();
                            continue;
                        case 26:
                            ProtoBuf$Type.C6951b c6951bM13844C = c6951b;
                            if ((this.f39192c & 8) == 8) {
                                ProtoBuf$Type protoBuf$Type = this.f39196g;
                                protoBuf$Type.getClass();
                                c6951bM13844C = ProtoBuf$Type.m13844C(protoBuf$Type);
                            }
                            ProtoBuf$Type protoBuf$Type2 = (ProtoBuf$Type) c6992c.m13945g(ProtoBuf$Type.f39247P, c6993d);
                            this.f39196g = protoBuf$Type2;
                            if (c6951bM13844C != null) {
                                c6951bM13844C.m13852n(protoBuf$Type2);
                                this.f39196g = c6951bM13844C.m13851m();
                            }
                            this.f39192c |= 8;
                            continue;
                        case 34:
                            if ((i10 & 32) != 32) {
                                this.f39198i = new ArrayList();
                                i10 |= 32;
                            }
                            this.f39198i.add((ProtoBuf$TypeParameter) c6992c.m13945g(ProtoBuf$TypeParameter.f39321I, c6993d));
                            continue;
                        case 42:
                            ProtoBuf$Type.C6951b c6951bM13844C2 = c6951b;
                            if ((this.f39192c & 32) == 32) {
                                ProtoBuf$Type protoBuf$Type3 = this.f39199j;
                                protoBuf$Type3.getClass();
                                c6951bM13844C2 = ProtoBuf$Type.m13844C(protoBuf$Type3);
                            }
                            ProtoBuf$Type protoBuf$Type4 = (ProtoBuf$Type) c6992c.m13945g(ProtoBuf$Type.f39247P, c6993d);
                            this.f39199j = protoBuf$Type4;
                            if (c6951bM13844C2 != null) {
                                c6951bM13844C2.m13852n(protoBuf$Type4);
                                this.f39199j = c6951bM13844C2.m13851m();
                            }
                            this.f39192c |= 32;
                            continue;
                        case 50:
                            ProtoBuf$ValueParameter.C6960b c6960b = c6951b;
                            if ((this.f39192c & BuildConfig.SDK_TRUNCATE_LENGTH) == 128) {
                                ProtoBuf$ValueParameter protoBuf$ValueParameter = this.f39185J;
                                protoBuf$ValueParameter.getClass();
                                ProtoBuf$ValueParameter.C6960b c6960b2 = new ProtoBuf$ValueParameter.C6960b();
                                c6960b2.m13867n(protoBuf$ValueParameter);
                                c6960b = c6960b2;
                            }
                            ProtoBuf$ValueParameter protoBuf$ValueParameter2 = (ProtoBuf$ValueParameter) c6992c.m13945g(ProtoBuf$ValueParameter.f39352H, c6993d);
                            this.f39185J = protoBuf$ValueParameter2;
                            if (c6960b != 0) {
                                c6960b.m13867n(protoBuf$ValueParameter2);
                                this.f39185J = c6960b.m13866m();
                            }
                            this.f39192c |= BuildConfig.SDK_TRUNCATE_LENGTH;
                            continue;
                        case 56:
                            this.f39192c |= 256;
                            this.f39186K = c6992c.m13949k();
                            continue;
                        case 64:
                            this.f39192c |= 512;
                            this.f39187L = c6992c.m13949k();
                            continue;
                        case 72:
                            this.f39192c |= 16;
                            this.f39197h = c6992c.m13949k();
                            continue;
                        case 80:
                            this.f39192c |= 64;
                            this.f39200k = c6992c.m13949k();
                            continue;
                        case ModuleDescriptor.MODULE_VERSION /* 88 */:
                            this.f39192c |= 1;
                            this.f39193d = c6992c.m13949k();
                            continue;
                        case 98:
                            if ((i10 & 256) != 256) {
                                this.f39201l = new ArrayList();
                                i10 |= 256;
                            }
                            this.f39201l.add((ProtoBuf$Type) c6992c.m13945g(ProtoBuf$Type.f39247P, c6993d));
                            continue;
                        case 104:
                            if ((i10 & 512) != 512) {
                                this.f39183H = new ArrayList();
                                i10 |= 512;
                            }
                            this.f39183H.add(Integer.valueOf(c6992c.m13949k()));
                            continue;
                        case 106:
                            int iM13942d = c6992c.m13942d(c6992c.m13949k());
                            if ((i10 & 512) != 512 && c6992c.m13940b() > 0) {
                                this.f39183H = new ArrayList();
                                i10 |= 512;
                            }
                            while (c6992c.m13940b() > 0) {
                                this.f39183H.add(Integer.valueOf(c6992c.m13949k()));
                            }
                            c6992c.m13941c(iM13942d);
                            continue;
                        case 248:
                            if ((i10 & 8192) != 8192) {
                                this.f39188M = new ArrayList();
                                i10 |= 8192;
                            }
                            this.f39188M.add(Integer.valueOf(c6992c.m13949k()));
                            continue;
                        case 250:
                            int iM13942d2 = c6992c.m13942d(c6992c.m13949k());
                            if ((i10 & 8192) != 8192 && c6992c.m13940b() > 0) {
                                this.f39188M = new ArrayList();
                                i10 |= 8192;
                            }
                            while (c6992c.m13940b() > 0) {
                                this.f39188M.add(Integer.valueOf(c6992c.m13949k()));
                            }
                            c6992c.m13941c(iM13942d2);
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
                } catch (IOException e11) {
                    InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e11.getMessage());
                    invalidProtocolBufferException.f39506a = this;
                    throw invalidProtocolBufferException;
                }
            } catch (Throwable th2) {
                if ((i10 & 32) == 32) {
                    this.f39198i = Collections.unmodifiableList(this.f39198i);
                }
                if ((i10 & 256) == 256) {
                    this.f39201l = Collections.unmodifiableList(this.f39201l);
                }
                if ((i10 & 512) == 512) {
                    this.f39183H = Collections.unmodifiableList(this.f39183H);
                }
                if ((i10 & 8192) == 8192) {
                    this.f39188M = Collections.unmodifiableList(this.f39188M);
                }
                try {
                    codedOutputStreamM13901j.m13902i();
                } catch (IOException unused) {
                } catch (Throwable th3) {
                    this.f39191b = bVar.m15533l();
                    throw th3;
                }
                this.f39191b = bVar.m15533l();
                m13923t();
                throw th2;
            }
        }
        if ((i10 & 32) == 32) {
            this.f39198i = Collections.unmodifiableList(this.f39198i);
        }
        if ((i10 & 256) == 256) {
            this.f39201l = Collections.unmodifiableList(this.f39201l);
        }
        if ((i10 & 512) == 512) {
            this.f39183H = Collections.unmodifiableList(this.f39183H);
        }
        if ((i10 & 8192) == 8192) {
            this.f39188M = Collections.unmodifiableList(this.f39188M);
        }
        try {
            codedOutputStreamM13901j.m13902i();
        } catch (IOException unused2) {
        } finally {
            this.f39191b = bVar.m15533l();
        }
        this.f39191b = bVar.m15533l();
        m13923t();
    }

    @Override // p282nn.InterfaceC7808f
    /* JADX INFO: renamed from: b */
    public final boolean mo13780b() {
        byte b10 = this.f39189N;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        int i10 = this.f39192c;
        if (!((i10 & 4) == 4)) {
            this.f39189N = (byte) 0;
            return false;
        }
        if (((i10 & 8) == 8) && !this.f39196g.mo13780b()) {
            this.f39189N = (byte) 0;
            return false;
        }
        for (int i11 = 0; i11 < this.f39198i.size(); i11++) {
            if (!this.f39198i.get(i11).mo13780b()) {
                this.f39189N = (byte) 0;
                return false;
            }
        }
        if (((this.f39192c & 32) == 32) && !this.f39199j.mo13780b()) {
            this.f39189N = (byte) 0;
            return false;
        }
        for (int i12 = 0; i12 < this.f39201l.size(); i12++) {
            if (!this.f39201l.get(i12).mo13780b()) {
                this.f39189N = (byte) 0;
                return false;
            }
        }
        if (((this.f39192c & BuildConfig.SDK_TRUNCATE_LENGTH) == 128) && !this.f39185J.mo13780b()) {
            this.f39189N = (byte) 0;
            return false;
        }
        if (m13919n()) {
            this.f39189N = (byte) 1;
            return true;
        }
        this.f39189N = (byte) 0;
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC6997h
    /* JADX INFO: renamed from: c */
    public final InterfaceC6997h.a mo13781c() {
        C6939b c6939b = new C6939b();
        c6939b.m13833n(this);
        return c6939b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC6997h
    /* JADX INFO: renamed from: d */
    public final int mo13782d() {
        int i10 = this.f39190O;
        if (i10 != -1) {
            return i10;
        }
        int iM13894b = (this.f39192c & 2) == 2 ? CodedOutputStream.m13894b(1, this.f39194e) + 0 : 0;
        if ((this.f39192c & 4) == 4) {
            iM13894b += CodedOutputStream.m13894b(2, this.f39195f);
        }
        if ((this.f39192c & 8) == 8) {
            iM13894b += CodedOutputStream.m13896d(3, this.f39196g);
        }
        for (int i11 = 0; i11 < this.f39198i.size(); i11++) {
            iM13894b += CodedOutputStream.m13896d(4, this.f39198i.get(i11));
        }
        if ((this.f39192c & 32) == 32) {
            iM13894b += CodedOutputStream.m13896d(5, this.f39199j);
        }
        if ((this.f39192c & BuildConfig.SDK_TRUNCATE_LENGTH) == 128) {
            iM13894b += CodedOutputStream.m13896d(6, this.f39185J);
        }
        if ((this.f39192c & 256) == 256) {
            iM13894b += CodedOutputStream.m13894b(7, this.f39186K);
        }
        if ((this.f39192c & 512) == 512) {
            iM13894b += CodedOutputStream.m13894b(8, this.f39187L);
        }
        if ((this.f39192c & 16) == 16) {
            iM13894b += CodedOutputStream.m13894b(9, this.f39197h);
        }
        if ((this.f39192c & 64) == 64) {
            iM13894b += CodedOutputStream.m13894b(10, this.f39200k);
        }
        if ((this.f39192c & 1) == 1) {
            iM13894b += CodedOutputStream.m13894b(11, this.f39193d);
        }
        for (int i12 = 0; i12 < this.f39201l.size(); i12++) {
            iM13894b += CodedOutputStream.m13896d(12, this.f39201l.get(i12));
        }
        int iM13895c = 0;
        for (int i13 = 0; i13 < this.f39183H.size(); i13++) {
            iM13895c += CodedOutputStream.m13895c(this.f39183H.get(i13).intValue());
        }
        int iM13895c2 = iM13894b + iM13895c;
        if (!this.f39183H.isEmpty()) {
            iM13895c2 = iM13895c2 + 1 + CodedOutputStream.m13895c(iM13895c);
        }
        this.f39184I = iM13895c;
        int iM13895c3 = 0;
        for (int i14 = 0; i14 < this.f39188M.size(); i14++) {
            iM13895c3 += CodedOutputStream.m13895c(this.f39188M.get(i14).intValue());
        }
        int size = this.f39191b.size() + m13920q() + (this.f39188M.size() * 2) + iM13895c2 + iM13895c3;
        this.f39190O = size;
        return size;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC6997h
    /* JADX INFO: renamed from: e */
    public final InterfaceC6997h.a mo13783e() {
        return new C6939b();
    }

    @Override // p282nn.InterfaceC7808f
    /* JADX INFO: renamed from: h */
    public final InterfaceC6997h mo13802h() {
        return f39181P;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC6997h
    /* JADX INFO: renamed from: j */
    public final void mo13784j(CodedOutputStream codedOutputStream) throws IOException {
        mo13782d();
        GeneratedMessageLite.ExtendableMessage.C6980a c6980a = new GeneratedMessageLite.ExtendableMessage.C6980a(this);
        if ((this.f39192c & 2) == 2) {
            codedOutputStream.m13905m(1, this.f39194e);
        }
        if ((this.f39192c & 4) == 4) {
            codedOutputStream.m13905m(2, this.f39195f);
        }
        if ((this.f39192c & 8) == 8) {
            codedOutputStream.m13907o(3, this.f39196g);
        }
        for (int i10 = 0; i10 < this.f39198i.size(); i10++) {
            codedOutputStream.m13907o(4, this.f39198i.get(i10));
        }
        if ((this.f39192c & 32) == 32) {
            codedOutputStream.m13907o(5, this.f39199j);
        }
        if ((this.f39192c & BuildConfig.SDK_TRUNCATE_LENGTH) == 128) {
            codedOutputStream.m13907o(6, this.f39185J);
        }
        if ((this.f39192c & 256) == 256) {
            codedOutputStream.m13905m(7, this.f39186K);
        }
        if ((this.f39192c & 512) == 512) {
            codedOutputStream.m13905m(8, this.f39187L);
        }
        if ((this.f39192c & 16) == 16) {
            codedOutputStream.m13905m(9, this.f39197h);
        }
        if ((this.f39192c & 64) == 64) {
            codedOutputStream.m13905m(10, this.f39200k);
        }
        if ((this.f39192c & 1) == 1) {
            codedOutputStream.m13905m(11, this.f39193d);
        }
        for (int i11 = 0; i11 < this.f39201l.size(); i11++) {
            codedOutputStream.m13907o(12, this.f39201l.get(i11));
        }
        if (this.f39183H.size() > 0) {
            codedOutputStream.m13914v(106);
            codedOutputStream.m13914v(this.f39184I);
        }
        for (int i12 = 0; i12 < this.f39183H.size(); i12++) {
            codedOutputStream.m13906n(this.f39183H.get(i12).intValue());
        }
        for (int i13 = 0; i13 < this.f39188M.size(); i13++) {
            codedOutputStream.m13905m(31, this.f39188M.get(i13).intValue());
        }
        c6980a.m13927a(19000, codedOutputStream);
        codedOutputStream.m13910r(this.f39191b);
    }

    /* JADX INFO: renamed from: z */
    public final void m13831z() {
        this.f39193d = 518;
        this.f39194e = 2054;
        this.f39195f = 0;
        ProtoBuf$Type protoBuf$Type = ProtoBuf$Type.f39246O;
        this.f39196g = protoBuf$Type;
        this.f39197h = 0;
        this.f39198i = Collections.emptyList();
        this.f39199j = protoBuf$Type;
        this.f39200k = 0;
        this.f39201l = Collections.emptyList();
        this.f39183H = Collections.emptyList();
        this.f39185J = ProtoBuf$ValueParameter.f39353l;
        this.f39186K = 0;
        this.f39187L = 0;
        this.f39188M = Collections.emptyList();
    }
}
