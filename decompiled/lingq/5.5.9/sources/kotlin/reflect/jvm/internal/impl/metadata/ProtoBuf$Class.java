package kotlin.reflect.jvm.internal.impl.metadata;

import androidx.datastore.preferences.PreferencesProto$Value;
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
import kotlin.reflect.jvm.internal.impl.protobuf.C6995f;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC6997h;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;
import p282nn.AbstractC7803a;

/* JADX INFO: loaded from: classes2.dex */
public final class ProtoBuf$Class extends GeneratedMessageLite.ExtendableMessage<ProtoBuf$Class> {

    /* JADX INFO: renamed from: e0 */
    public static final ProtoBuf$Class f38986e0;

    /* JADX INFO: renamed from: f0 */
    public static final C6915a f38987f0 = new C6915a();

    /* JADX INFO: renamed from: H */
    public List<ProtoBuf$Type> f38988H;

    /* JADX INFO: renamed from: I */
    public List<Integer> f38989I;

    /* JADX INFO: renamed from: J */
    public int f38990J;

    /* JADX INFO: renamed from: K */
    public List<ProtoBuf$Constructor> f38991K;

    /* JADX INFO: renamed from: L */
    public List<ProtoBuf$Function> f38992L;

    /* JADX INFO: renamed from: M */
    public List<ProtoBuf$Property> f38993M;

    /* JADX INFO: renamed from: N */
    public List<ProtoBuf$TypeAlias> f38994N;

    /* JADX INFO: renamed from: O */
    public List<ProtoBuf$EnumEntry> f38995O;

    /* JADX INFO: renamed from: P */
    public List<Integer> f38996P;

    /* JADX INFO: renamed from: Q */
    public int f38997Q;

    /* JADX INFO: renamed from: R */
    public int f38998R;

    /* JADX INFO: renamed from: S */
    public ProtoBuf$Type f38999S;

    /* JADX INFO: renamed from: T */
    public int f39000T;

    /* JADX INFO: renamed from: U */
    public List<Integer> f39001U;

    /* JADX INFO: renamed from: V */
    public int f39002V;

    /* JADX INFO: renamed from: W */
    public List<ProtoBuf$Type> f39003W;

    /* JADX INFO: renamed from: X */
    public List<Integer> f39004X;

    /* JADX INFO: renamed from: Y */
    public int f39005Y;

    /* JADX INFO: renamed from: Z */
    public ProtoBuf$TypeTable f39006Z;

    /* JADX INFO: renamed from: a0 */
    public List<Integer> f39007a0;

    /* JADX INFO: renamed from: b */
    public final AbstractC7803a f39008b;

    /* JADX INFO: renamed from: b0 */
    public ProtoBuf$VersionRequirementTable f39009b0;

    /* JADX INFO: renamed from: c */
    public int f39010c;

    /* JADX INFO: renamed from: c0 */
    public byte f39011c0;

    /* JADX INFO: renamed from: d */
    public int f39012d;

    /* JADX INFO: renamed from: d0 */
    public int f39013d0;

    /* JADX INFO: renamed from: e */
    public int f39014e;

    /* JADX INFO: renamed from: f */
    public int f39015f;

    /* JADX INFO: renamed from: g */
    public List<ProtoBuf$TypeParameter> f39016g;

    /* JADX INFO: renamed from: h */
    public List<ProtoBuf$Type> f39017h;

    /* JADX INFO: renamed from: i */
    public List<Integer> f39018i;

    /* JADX INFO: renamed from: j */
    public int f39019j;

    /* JADX INFO: renamed from: k */
    public List<Integer> f39020k;

    /* JADX INFO: renamed from: l */
    public int f39021l;

    public enum Kind implements C6995f.a {
        CLASS(0, 0),
        INTERFACE(1, 1),
        ENUM_CLASS(2, 2),
        ENUM_ENTRY(3, 3),
        ANNOTATION_CLASS(4, 4),
        OBJECT(5, 5),
        COMPANION_OBJECT(6, 6);

        private static C6995f.b<Kind> internalValueMap = new C6914a();
        private final int value;

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class$Kind$a */
        public static class C6914a implements C6995f.b<Kind> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.C6995f.b
            /* JADX INFO: renamed from: a */
            public final C6995f.a mo13786a(int i10) {
                return Kind.valueOf(i10);
            }
        }

        Kind(int i10, int i11) {
            this.value = i11;
        }

        public static Kind valueOf(int i10) {
            switch (i10) {
                case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                    return CLASS;
                case 1:
                    return INTERFACE;
                case 2:
                    return ENUM_CLASS;
                case 3:
                    return ENUM_ENTRY;
                case 4:
                    return ANNOTATION_CLASS;
                case 5:
                    return OBJECT;
                case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                    return COMPANION_OBJECT;
                default:
                    return null;
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.C6995f.a
        public final int getNumber() {
            return this.value;
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class$a */
    public static class C6915a extends AbstractC6991b<ProtoBuf$Class> {
        @Override // p282nn.InterfaceC7809g
        /* JADX INFO: renamed from: a */
        public final Object mo13787a(C6992c c6992c, C6993d c6993d) throws InvalidProtocolBufferException {
            return new ProtoBuf$Class(c6992c, c6993d);
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class$b */
    public static final class C6916b extends GeneratedMessageLite.AbstractC6983c<ProtoBuf$Class, C6916b> {

        /* JADX INFO: renamed from: O */
        public int f39029O;

        /* JADX INFO: renamed from: Q */
        public int f39031Q;

        /* JADX INFO: renamed from: d */
        public int f39038d;

        /* JADX INFO: renamed from: f */
        public int f39040f;

        /* JADX INFO: renamed from: g */
        public int f39041g;

        /* JADX INFO: renamed from: e */
        public int f39039e = 6;

        /* JADX INFO: renamed from: h */
        public List<ProtoBuf$TypeParameter> f39042h = Collections.emptyList();

        /* JADX INFO: renamed from: i */
        public List<ProtoBuf$Type> f39043i = Collections.emptyList();

        /* JADX INFO: renamed from: j */
        public List<Integer> f39044j = Collections.emptyList();

        /* JADX INFO: renamed from: k */
        public List<Integer> f39045k = Collections.emptyList();

        /* JADX INFO: renamed from: l */
        public List<ProtoBuf$Type> f39046l = Collections.emptyList();

        /* JADX INFO: renamed from: H */
        public List<Integer> f39022H = Collections.emptyList();

        /* JADX INFO: renamed from: I */
        public List<ProtoBuf$Constructor> f39023I = Collections.emptyList();

        /* JADX INFO: renamed from: J */
        public List<ProtoBuf$Function> f39024J = Collections.emptyList();

        /* JADX INFO: renamed from: K */
        public List<ProtoBuf$Property> f39025K = Collections.emptyList();

        /* JADX INFO: renamed from: L */
        public List<ProtoBuf$TypeAlias> f39026L = Collections.emptyList();

        /* JADX INFO: renamed from: M */
        public List<ProtoBuf$EnumEntry> f39027M = Collections.emptyList();

        /* JADX INFO: renamed from: N */
        public List<Integer> f39028N = Collections.emptyList();

        /* JADX INFO: renamed from: P */
        public ProtoBuf$Type f39030P = ProtoBuf$Type.f39246O;

        /* JADX INFO: renamed from: R */
        public List<Integer> f39032R = Collections.emptyList();

        /* JADX INFO: renamed from: S */
        public List<ProtoBuf$Type> f39033S = Collections.emptyList();

        /* JADX INFO: renamed from: T */
        public List<Integer> f39034T = Collections.emptyList();

        /* JADX INFO: renamed from: U */
        public ProtoBuf$TypeTable f39035U = ProtoBuf$TypeTable.f39341g;

        /* JADX INFO: renamed from: V */
        public List<Integer> f39036V = Collections.emptyList();

        /* JADX INFO: renamed from: W */
        public ProtoBuf$VersionRequirementTable f39037W = ProtoBuf$VersionRequirementTable.f39390e;

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC6990a.a, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC6997h.a
        /* JADX INFO: renamed from: Q */
        public final /* bridge */ /* synthetic */ InterfaceC6997h.a mo13788Q(C6992c c6992c, C6993d c6993d) throws Throwable {
            m13806o(c6992c, c6993d);
            return this;
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC6997h.a
        /* JADX INFO: renamed from: a */
        public final InterfaceC6997h mo13789a() {
            ProtoBuf$Class protoBuf$ClassM13804m = m13804m();
            if (protoBuf$ClassM13804m.mo13780b()) {
                return protoBuf$ClassM13804m;
            }
            throw new UninitializedMessageException();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.AbstractC6982b
        public final Object clone() throws CloneNotSupportedException {
            C6916b c6916b = new C6916b();
            c6916b.m13805n(m13804m());
            return c6916b;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC6990a.a
        /* JADX INFO: renamed from: f */
        public final /* bridge */ /* synthetic */ AbstractC6990a.a mo13788Q(C6992c c6992c, C6993d c6993d) throws Throwable {
            m13806o(c6992c, c6993d);
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.AbstractC6982b
        /* JADX INFO: renamed from: g */
        public final GeneratedMessageLite.AbstractC6982b clone() {
            C6916b c6916b = new C6916b();
            c6916b.m13805n(m13804m());
            return c6916b;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.AbstractC6982b
        /* JADX INFO: renamed from: i */
        public final /* bridge */ /* synthetic */ GeneratedMessageLite.AbstractC6982b mo13792i(GeneratedMessageLite generatedMessageLite) {
            m13805n((ProtoBuf$Class) generatedMessageLite);
            return this;
        }

        /* JADX INFO: renamed from: m */
        public final ProtoBuf$Class m13804m() {
            ProtoBuf$Class protoBuf$Class = new ProtoBuf$Class(this);
            int i10 = this.f39038d;
            int i11 = 1;
            if ((i10 & 1) != 1) {
                i11 = 0;
            }
            protoBuf$Class.f39012d = this.f39039e;
            if ((i10 & 2) == 2) {
                i11 |= 2;
            }
            protoBuf$Class.f39014e = this.f39040f;
            if ((i10 & 4) == 4) {
                i11 |= 4;
            }
            protoBuf$Class.f39015f = this.f39041g;
            if ((i10 & 8) == 8) {
                this.f39042h = Collections.unmodifiableList(this.f39042h);
                this.f39038d &= -9;
            }
            protoBuf$Class.f39016g = this.f39042h;
            if ((this.f39038d & 16) == 16) {
                this.f39043i = Collections.unmodifiableList(this.f39043i);
                this.f39038d &= -17;
            }
            protoBuf$Class.f39017h = this.f39043i;
            if ((this.f39038d & 32) == 32) {
                this.f39044j = Collections.unmodifiableList(this.f39044j);
                this.f39038d &= -33;
            }
            protoBuf$Class.f39018i = this.f39044j;
            if ((this.f39038d & 64) == 64) {
                this.f39045k = Collections.unmodifiableList(this.f39045k);
                this.f39038d &= -65;
            }
            protoBuf$Class.f39020k = this.f39045k;
            if ((this.f39038d & BuildConfig.SDK_TRUNCATE_LENGTH) == 128) {
                this.f39046l = Collections.unmodifiableList(this.f39046l);
                this.f39038d &= -129;
            }
            protoBuf$Class.f38988H = this.f39046l;
            if ((this.f39038d & 256) == 256) {
                this.f39022H = Collections.unmodifiableList(this.f39022H);
                this.f39038d &= -257;
            }
            protoBuf$Class.f38989I = this.f39022H;
            if ((this.f39038d & 512) == 512) {
                this.f39023I = Collections.unmodifiableList(this.f39023I);
                this.f39038d &= -513;
            }
            protoBuf$Class.f38991K = this.f39023I;
            if ((this.f39038d & 1024) == 1024) {
                this.f39024J = Collections.unmodifiableList(this.f39024J);
                this.f39038d &= -1025;
            }
            protoBuf$Class.f38992L = this.f39024J;
            if ((this.f39038d & 2048) == 2048) {
                this.f39025K = Collections.unmodifiableList(this.f39025K);
                this.f39038d &= -2049;
            }
            protoBuf$Class.f38993M = this.f39025K;
            if ((this.f39038d & 4096) == 4096) {
                this.f39026L = Collections.unmodifiableList(this.f39026L);
                this.f39038d &= -4097;
            }
            protoBuf$Class.f38994N = this.f39026L;
            if ((this.f39038d & 8192) == 8192) {
                this.f39027M = Collections.unmodifiableList(this.f39027M);
                this.f39038d &= -8193;
            }
            protoBuf$Class.f38995O = this.f39027M;
            if ((this.f39038d & 16384) == 16384) {
                this.f39028N = Collections.unmodifiableList(this.f39028N);
                this.f39038d &= -16385;
            }
            protoBuf$Class.f38996P = this.f39028N;
            if ((i10 & 32768) == 32768) {
                i11 |= 8;
            }
            protoBuf$Class.f38998R = this.f39029O;
            if ((i10 & 65536) == 65536) {
                i11 |= 16;
            }
            protoBuf$Class.f38999S = this.f39030P;
            if ((i10 & 131072) == 131072) {
                i11 |= 32;
            }
            protoBuf$Class.f39000T = this.f39031Q;
            if ((this.f39038d & 262144) == 262144) {
                this.f39032R = Collections.unmodifiableList(this.f39032R);
                this.f39038d &= -262145;
            }
            protoBuf$Class.f39001U = this.f39032R;
            if ((this.f39038d & 524288) == 524288) {
                this.f39033S = Collections.unmodifiableList(this.f39033S);
                this.f39038d &= -524289;
            }
            protoBuf$Class.f39003W = this.f39033S;
            if ((this.f39038d & 1048576) == 1048576) {
                this.f39034T = Collections.unmodifiableList(this.f39034T);
                this.f39038d &= -1048577;
            }
            protoBuf$Class.f39004X = this.f39034T;
            if ((i10 & 2097152) == 2097152) {
                i11 |= 64;
            }
            protoBuf$Class.f39006Z = this.f39035U;
            if ((this.f39038d & 4194304) == 4194304) {
                this.f39036V = Collections.unmodifiableList(this.f39036V);
                this.f39038d &= -4194305;
            }
            protoBuf$Class.f39007a0 = this.f39036V;
            if ((i10 & 8388608) == 8388608) {
                i11 |= BuildConfig.SDK_TRUNCATE_LENGTH;
            }
            protoBuf$Class.f39009b0 = this.f39037W;
            protoBuf$Class.f39010c = i11;
            return protoBuf$Class;
        }

        /* JADX INFO: renamed from: n */
        public final C6916b m13805n(ProtoBuf$Class protoBuf$Class) {
            ProtoBuf$VersionRequirementTable protoBuf$VersionRequirementTable;
            ProtoBuf$TypeTable protoBuf$TypeTable;
            ProtoBuf$Type protoBuf$Type;
            if (protoBuf$Class == ProtoBuf$Class.f38986e0) {
                return this;
            }
            int i10 = protoBuf$Class.f39010c;
            if ((i10 & 1) == 1) {
                int i11 = protoBuf$Class.f39012d;
                this.f39038d |= 1;
                this.f39039e = i11;
            }
            if ((i10 & 2) == 2) {
                int i12 = protoBuf$Class.f39014e;
                this.f39038d = 2 | this.f39038d;
                this.f39040f = i12;
            }
            if ((i10 & 4) == 4) {
                int i13 = protoBuf$Class.f39015f;
                this.f39038d = 4 | this.f39038d;
                this.f39041g = i13;
            }
            if (!protoBuf$Class.f39016g.isEmpty()) {
                if (this.f39042h.isEmpty()) {
                    this.f39042h = protoBuf$Class.f39016g;
                    this.f39038d &= -9;
                } else {
                    if ((this.f39038d & 8) != 8) {
                        this.f39042h = new ArrayList(this.f39042h);
                        this.f39038d |= 8;
                    }
                    this.f39042h.addAll(protoBuf$Class.f39016g);
                }
            }
            if (!protoBuf$Class.f39017h.isEmpty()) {
                if (this.f39043i.isEmpty()) {
                    this.f39043i = protoBuf$Class.f39017h;
                    this.f39038d &= -17;
                } else {
                    if ((this.f39038d & 16) != 16) {
                        this.f39043i = new ArrayList(this.f39043i);
                        this.f39038d |= 16;
                    }
                    this.f39043i.addAll(protoBuf$Class.f39017h);
                }
            }
            if (!protoBuf$Class.f39018i.isEmpty()) {
                if (this.f39044j.isEmpty()) {
                    this.f39044j = protoBuf$Class.f39018i;
                    this.f39038d &= -33;
                } else {
                    if ((this.f39038d & 32) != 32) {
                        this.f39044j = new ArrayList(this.f39044j);
                        this.f39038d |= 32;
                    }
                    this.f39044j.addAll(protoBuf$Class.f39018i);
                }
            }
            if (!protoBuf$Class.f39020k.isEmpty()) {
                if (this.f39045k.isEmpty()) {
                    this.f39045k = protoBuf$Class.f39020k;
                    this.f39038d &= -65;
                } else {
                    if ((this.f39038d & 64) != 64) {
                        this.f39045k = new ArrayList(this.f39045k);
                        this.f39038d |= 64;
                    }
                    this.f39045k.addAll(protoBuf$Class.f39020k);
                }
            }
            if (!protoBuf$Class.f38988H.isEmpty()) {
                if (this.f39046l.isEmpty()) {
                    this.f39046l = protoBuf$Class.f38988H;
                    this.f39038d &= -129;
                } else {
                    if ((this.f39038d & BuildConfig.SDK_TRUNCATE_LENGTH) != 128) {
                        this.f39046l = new ArrayList(this.f39046l);
                        this.f39038d |= BuildConfig.SDK_TRUNCATE_LENGTH;
                    }
                    this.f39046l.addAll(protoBuf$Class.f38988H);
                }
            }
            if (!protoBuf$Class.f38989I.isEmpty()) {
                if (this.f39022H.isEmpty()) {
                    this.f39022H = protoBuf$Class.f38989I;
                    this.f39038d &= -257;
                } else {
                    if ((this.f39038d & 256) != 256) {
                        this.f39022H = new ArrayList(this.f39022H);
                        this.f39038d |= 256;
                    }
                    this.f39022H.addAll(protoBuf$Class.f38989I);
                }
            }
            if (!protoBuf$Class.f38991K.isEmpty()) {
                if (this.f39023I.isEmpty()) {
                    this.f39023I = protoBuf$Class.f38991K;
                    this.f39038d &= -513;
                } else {
                    if ((this.f39038d & 512) != 512) {
                        this.f39023I = new ArrayList(this.f39023I);
                        this.f39038d |= 512;
                    }
                    this.f39023I.addAll(protoBuf$Class.f38991K);
                }
            }
            if (!protoBuf$Class.f38992L.isEmpty()) {
                if (this.f39024J.isEmpty()) {
                    this.f39024J = protoBuf$Class.f38992L;
                    this.f39038d &= -1025;
                } else {
                    if ((this.f39038d & 1024) != 1024) {
                        this.f39024J = new ArrayList(this.f39024J);
                        this.f39038d |= 1024;
                    }
                    this.f39024J.addAll(protoBuf$Class.f38992L);
                }
            }
            if (!protoBuf$Class.f38993M.isEmpty()) {
                if (this.f39025K.isEmpty()) {
                    this.f39025K = protoBuf$Class.f38993M;
                    this.f39038d &= -2049;
                } else {
                    if ((this.f39038d & 2048) != 2048) {
                        this.f39025K = new ArrayList(this.f39025K);
                        this.f39038d |= 2048;
                    }
                    this.f39025K.addAll(protoBuf$Class.f38993M);
                }
            }
            if (!protoBuf$Class.f38994N.isEmpty()) {
                if (this.f39026L.isEmpty()) {
                    this.f39026L = protoBuf$Class.f38994N;
                    this.f39038d &= -4097;
                } else {
                    if ((this.f39038d & 4096) != 4096) {
                        this.f39026L = new ArrayList(this.f39026L);
                        this.f39038d |= 4096;
                    }
                    this.f39026L.addAll(protoBuf$Class.f38994N);
                }
            }
            if (!protoBuf$Class.f38995O.isEmpty()) {
                if (this.f39027M.isEmpty()) {
                    this.f39027M = protoBuf$Class.f38995O;
                    this.f39038d &= -8193;
                } else {
                    if ((this.f39038d & 8192) != 8192) {
                        this.f39027M = new ArrayList(this.f39027M);
                        this.f39038d |= 8192;
                    }
                    this.f39027M.addAll(protoBuf$Class.f38995O);
                }
            }
            if (!protoBuf$Class.f38996P.isEmpty()) {
                if (this.f39028N.isEmpty()) {
                    this.f39028N = protoBuf$Class.f38996P;
                    this.f39038d &= -16385;
                } else {
                    if ((this.f39038d & 16384) != 16384) {
                        this.f39028N = new ArrayList(this.f39028N);
                        this.f39038d |= 16384;
                    }
                    this.f39028N.addAll(protoBuf$Class.f38996P);
                }
            }
            int i14 = protoBuf$Class.f39010c;
            if ((i14 & 8) == 8) {
                int i15 = protoBuf$Class.f38998R;
                this.f39038d |= 32768;
                this.f39029O = i15;
            }
            if ((i14 & 16) == 16) {
                ProtoBuf$Type protoBuf$Type2 = protoBuf$Class.f38999S;
                if ((this.f39038d & 65536) != 65536 || (protoBuf$Type = this.f39030P) == ProtoBuf$Type.f39246O) {
                    this.f39030P = protoBuf$Type2;
                } else {
                    ProtoBuf$Type.C6951b c6951bM13844C = ProtoBuf$Type.m13844C(protoBuf$Type);
                    c6951bM13844C.m13852n(protoBuf$Type2);
                    this.f39030P = c6951bM13844C.m13851m();
                }
                this.f39038d |= 65536;
            }
            if ((protoBuf$Class.f39010c & 32) == 32) {
                int i16 = protoBuf$Class.f39000T;
                this.f39038d |= 131072;
                this.f39031Q = i16;
            }
            if (!protoBuf$Class.f39001U.isEmpty()) {
                if (this.f39032R.isEmpty()) {
                    this.f39032R = protoBuf$Class.f39001U;
                    this.f39038d &= -262145;
                } else {
                    if ((this.f39038d & 262144) != 262144) {
                        this.f39032R = new ArrayList(this.f39032R);
                        this.f39038d |= 262144;
                    }
                    this.f39032R.addAll(protoBuf$Class.f39001U);
                }
            }
            if (!protoBuf$Class.f39003W.isEmpty()) {
                if (this.f39033S.isEmpty()) {
                    this.f39033S = protoBuf$Class.f39003W;
                    this.f39038d &= -524289;
                } else {
                    if ((this.f39038d & 524288) != 524288) {
                        this.f39033S = new ArrayList(this.f39033S);
                        this.f39038d |= 524288;
                    }
                    this.f39033S.addAll(protoBuf$Class.f39003W);
                }
            }
            if (!protoBuf$Class.f39004X.isEmpty()) {
                if (this.f39034T.isEmpty()) {
                    this.f39034T = protoBuf$Class.f39004X;
                    this.f39038d &= -1048577;
                } else {
                    if ((this.f39038d & 1048576) != 1048576) {
                        this.f39034T = new ArrayList(this.f39034T);
                        this.f39038d |= 1048576;
                    }
                    this.f39034T.addAll(protoBuf$Class.f39004X);
                }
            }
            if ((protoBuf$Class.f39010c & 64) == 64) {
                ProtoBuf$TypeTable protoBuf$TypeTable2 = protoBuf$Class.f39006Z;
                if ((this.f39038d & 2097152) != 2097152 || (protoBuf$TypeTable = this.f39035U) == ProtoBuf$TypeTable.f39341g) {
                    this.f39035U = protoBuf$TypeTable2;
                } else {
                    ProtoBuf$TypeTable.C6958b c6958bM13861n = ProtoBuf$TypeTable.m13861n(protoBuf$TypeTable);
                    c6958bM13861n.m13864m(protoBuf$TypeTable2);
                    this.f39035U = c6958bM13861n.m13863k();
                }
                this.f39038d |= 2097152;
            }
            if (!protoBuf$Class.f39007a0.isEmpty()) {
                if (this.f39036V.isEmpty()) {
                    this.f39036V = protoBuf$Class.f39007a0;
                    this.f39038d &= -4194305;
                } else {
                    if ((this.f39038d & 4194304) != 4194304) {
                        this.f39036V = new ArrayList(this.f39036V);
                        this.f39038d |= 4194304;
                    }
                    this.f39036V.addAll(protoBuf$Class.f39007a0);
                }
            }
            if ((protoBuf$Class.f39010c & BuildConfig.SDK_TRUNCATE_LENGTH) == 128) {
                ProtoBuf$VersionRequirementTable protoBuf$VersionRequirementTable2 = protoBuf$Class.f39009b0;
                if ((this.f39038d & 8388608) != 8388608 || (protoBuf$VersionRequirementTable = this.f39037W) == ProtoBuf$VersionRequirementTable.f39390e) {
                    this.f39037W = protoBuf$VersionRequirementTable2;
                } else {
                    ProtoBuf$VersionRequirementTable.C6966b c6966b = new ProtoBuf$VersionRequirementTable.C6966b();
                    c6966b.m13873m(protoBuf$VersionRequirementTable);
                    c6966b.m13873m(protoBuf$VersionRequirementTable2);
                    this.f39037W = c6966b.m13872k();
                }
                this.f39038d |= 8388608;
            }
            m13928k(protoBuf$Class);
            this.f39493a = this.f39493a.m15519f(protoBuf$Class.f39008b);
            return this;
        }

        /* JADX WARN: Code duplicated, block: B:15:0x001e  */
        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* JADX INFO: renamed from: o */
        public final void m13806o(C6992c c6992c, C6993d c6993d) throws Throwable {
            ProtoBuf$Class protoBuf$Class;
            try {
                try {
                    ProtoBuf$Class.f38987f0.getClass();
                    m13805n(new ProtoBuf$Class(c6992c, c6993d));
                } catch (InvalidProtocolBufferException e10) {
                    protoBuf$Class = (ProtoBuf$Class) e10.f39506a;
                    try {
                        throw e10;
                    } catch (Throwable th2) {
                        th = th2;
                        if (protoBuf$Class != null) {
                            m13805n(protoBuf$Class);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                protoBuf$Class = null;
                if (protoBuf$Class != null) {
                    m13805n(protoBuf$Class);
                }
                throw th;
            }
        }
    }

    static {
        ProtoBuf$Class protoBuf$Class = new ProtoBuf$Class(0);
        f38986e0 = protoBuf$Class;
        protoBuf$Class.m13803z();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public ProtoBuf$Class() {
        throw null;
    }

    public ProtoBuf$Class(int i10) {
        this.f39019j = -1;
        this.f39021l = -1;
        this.f38990J = -1;
        this.f38997Q = -1;
        this.f39002V = -1;
        this.f39005Y = -1;
        this.f39011c0 = (byte) -1;
        this.f39013d0 = -1;
        this.f39008b = AbstractC7803a.f42882a;
    }

    public ProtoBuf$Class(GeneratedMessageLite.AbstractC6983c abstractC6983c) {
        super(abstractC6983c);
        this.f39019j = -1;
        this.f39021l = -1;
        this.f38990J = -1;
        this.f38997Q = -1;
        this.f39002V = -1;
        this.f39005Y = -1;
        this.f39011c0 = (byte) -1;
        this.f39013d0 = -1;
        this.f39008b = abstractC6983c.f39493a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ProtoBuf$Class(C6992c c6992c, C6993d c6993d) throws InvalidProtocolBufferException {
        boolean z10;
        ProtoBuf$VersionRequirementTable.C6966b c6966b;
        this.f39019j = -1;
        this.f39021l = -1;
        this.f38990J = -1;
        this.f38997Q = -1;
        this.f39002V = -1;
        this.f39005Y = -1;
        this.f39011c0 = (byte) -1;
        this.f39013d0 = -1;
        m13803z();
        AbstractC7803a.b bVarM15518q = AbstractC7803a.m15518q();
        CodedOutputStream codedOutputStreamM13901j = CodedOutputStream.m13901j(bVarM15518q, 1);
        boolean z11 = false;
        int i10 = 0;
        while (!z11) {
            try {
                try {
                    int iM13952n = c6992c.m13952n();
                    switch (iM13952n) {
                        case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                            z10 = true;
                            z11 = z10;
                            break;
                        case 8:
                            z10 = true;
                            this.f39010c |= 1;
                            this.f39012d = c6992c.m13944f();
                            break;
                        case 16:
                            if ((i10 & 32) != 32) {
                                this.f39018i = new ArrayList();
                                i10 |= 32;
                            }
                            this.f39018i.add(Integer.valueOf(c6992c.m13944f()));
                            z10 = true;
                            break;
                        case 18:
                            int iM13942d = c6992c.m13942d(c6992c.m13949k());
                            if ((i10 & 32) != 32 && c6992c.m13940b() > 0) {
                                this.f39018i = new ArrayList();
                                i10 |= 32;
                            }
                            while (c6992c.m13940b() > 0) {
                                this.f39018i.add(Integer.valueOf(c6992c.m13944f()));
                            }
                            c6992c.m13941c(iM13942d);
                            z10 = true;
                            break;
                        case 24:
                            this.f39010c |= 2;
                            this.f39014e = c6992c.m13944f();
                            z10 = true;
                            break;
                        case 32:
                            this.f39010c |= 4;
                            this.f39015f = c6992c.m13944f();
                            z10 = true;
                            break;
                        case 42:
                            if ((i10 & 8) != 8) {
                                this.f39016g = new ArrayList();
                                i10 |= 8;
                            }
                            this.f39016g.add((ProtoBuf$TypeParameter) c6992c.m13945g(ProtoBuf$TypeParameter.f39321I, c6993d));
                            z10 = true;
                            break;
                        case 50:
                            if ((i10 & 16) != 16) {
                                this.f39017h = new ArrayList();
                                i10 |= 16;
                            }
                            this.f39017h.add((ProtoBuf$Type) c6992c.m13945g(ProtoBuf$Type.f39247P, c6993d));
                            z10 = true;
                            break;
                        case 56:
                            if ((i10 & 64) != 64) {
                                this.f39020k = new ArrayList();
                                i10 |= 64;
                            }
                            this.f39020k.add(Integer.valueOf(c6992c.m13944f()));
                            z10 = true;
                            break;
                        case 58:
                            int iM13942d2 = c6992c.m13942d(c6992c.m13949k());
                            if ((i10 & 64) != 64 && c6992c.m13940b() > 0) {
                                this.f39020k = new ArrayList();
                                i10 |= 64;
                            }
                            while (c6992c.m13940b() > 0) {
                                this.f39020k.add(Integer.valueOf(c6992c.m13944f()));
                            }
                            c6992c.m13941c(iM13942d2);
                            z10 = true;
                            break;
                        case 66:
                            if ((i10 & 512) != 512) {
                                this.f38991K = new ArrayList();
                                i10 |= 512;
                            }
                            this.f38991K.add((ProtoBuf$Constructor) c6992c.m13945g(ProtoBuf$Constructor.f39048j, c6993d));
                            z10 = true;
                            break;
                        case 74:
                            if ((i10 & 1024) != 1024) {
                                this.f38992L = new ArrayList();
                                i10 |= 1024;
                            }
                            this.f38992L.add((ProtoBuf$Function) c6992c.m13945g(ProtoBuf$Function.f39114Q, c6993d));
                            z10 = true;
                            break;
                        case 82:
                            if ((i10 & 2048) != 2048) {
                                this.f38993M = new ArrayList();
                                i10 |= 2048;
                            }
                            this.f38993M.add((ProtoBuf$Property) c6992c.m13945g(ProtoBuf$Property.f39182Q, c6993d));
                            z10 = true;
                            break;
                        case 90:
                            if ((i10 & 4096) != 4096) {
                                this.f38994N = new ArrayList();
                                i10 |= 4096;
                            }
                            this.f38994N.add((ProtoBuf$TypeAlias) c6992c.m13945g(ProtoBuf$TypeAlias.f39296K, c6993d));
                            z10 = true;
                            break;
                        case 106:
                            if ((i10 & 8192) != 8192) {
                                this.f38995O = new ArrayList();
                                i10 |= 8192;
                            }
                            this.f38995O.add((ProtoBuf$EnumEntry) c6992c.m13945g(ProtoBuf$EnumEntry.f39084h, c6993d));
                            z10 = true;
                            break;
                        case BuildConfig.SDK_TRUNCATE_LENGTH /* 128 */:
                            if ((i10 & 16384) != 16384) {
                                this.f38996P = new ArrayList();
                                i10 |= 16384;
                            }
                            this.f38996P.add(Integer.valueOf(c6992c.m13944f()));
                            z10 = true;
                            break;
                        case 130:
                            int iM13942d3 = c6992c.m13942d(c6992c.m13949k());
                            if ((i10 & 16384) != 16384 && c6992c.m13940b() > 0) {
                                this.f38996P = new ArrayList();
                                i10 |= 16384;
                            }
                            while (c6992c.m13940b() > 0) {
                                this.f38996P.add(Integer.valueOf(c6992c.m13944f()));
                            }
                            c6992c.m13941c(iM13942d3);
                            z10 = true;
                            break;
                        case 136:
                            this.f39010c |= 8;
                            this.f38998R = c6992c.m13944f();
                            z10 = true;
                            break;
                        case 146:
                            ProtoBuf$Type.C6951b c6951bM13846D = (this.f39010c & 16) == 16 ? this.f38999S.m13846D() : null;
                            ProtoBuf$Type protoBuf$Type = (ProtoBuf$Type) c6992c.m13945g(ProtoBuf$Type.f39247P, c6993d);
                            this.f38999S = protoBuf$Type;
                            if (c6951bM13846D != 0) {
                                c6951bM13846D.m13852n(protoBuf$Type);
                                this.f38999S = c6951bM13846D.m13851m();
                            }
                            this.f39010c |= 16;
                            z10 = true;
                            break;
                        case 152:
                            this.f39010c |= 32;
                            this.f39000T = c6992c.m13944f();
                            z10 = true;
                            break;
                        case 162:
                            if ((i10 & BuildConfig.SDK_TRUNCATE_LENGTH) != 128) {
                                this.f38988H = new ArrayList();
                                i10 |= BuildConfig.SDK_TRUNCATE_LENGTH;
                            }
                            this.f38988H.add((ProtoBuf$Type) c6992c.m13945g(ProtoBuf$Type.f39247P, c6993d));
                            z10 = true;
                            break;
                        case 168:
                            if ((i10 & 256) != 256) {
                                this.f38989I = new ArrayList();
                                i10 |= 256;
                            }
                            this.f38989I.add(Integer.valueOf(c6992c.m13944f()));
                            z10 = true;
                            break;
                        case 170:
                            int iM13942d4 = c6992c.m13942d(c6992c.m13949k());
                            if ((i10 & 256) != 256 && c6992c.m13940b() > 0) {
                                this.f38989I = new ArrayList();
                                i10 |= 256;
                            }
                            while (c6992c.m13940b() > 0) {
                                this.f38989I.add(Integer.valueOf(c6992c.m13944f()));
                            }
                            c6992c.m13941c(iM13942d4);
                            z10 = true;
                            break;
                        case 176:
                            if ((i10 & 262144) != 262144) {
                                this.f39001U = new ArrayList();
                                i10 |= 262144;
                            }
                            this.f39001U.add(Integer.valueOf(c6992c.m13944f()));
                            z10 = true;
                            break;
                        case 178:
                            int iM13942d5 = c6992c.m13942d(c6992c.m13949k());
                            if ((i10 & 262144) != 262144 && c6992c.m13940b() > 0) {
                                this.f39001U = new ArrayList();
                                i10 |= 262144;
                            }
                            while (c6992c.m13940b() > 0) {
                                this.f39001U.add(Integer.valueOf(c6992c.m13944f()));
                            }
                            c6992c.m13941c(iM13942d5);
                            z10 = true;
                            break;
                        case 186:
                            if ((i10 & 524288) != 524288) {
                                this.f39003W = new ArrayList();
                                i10 |= 524288;
                            }
                            this.f39003W.add((ProtoBuf$Type) c6992c.m13945g(ProtoBuf$Type.f39247P, c6993d));
                            z10 = true;
                            break;
                        case 192:
                            if ((i10 & 1048576) != 1048576) {
                                this.f39004X = new ArrayList();
                                i10 |= 1048576;
                            }
                            this.f39004X.add(Integer.valueOf(c6992c.m13944f()));
                            z10 = true;
                            break;
                        case 194:
                            int iM13942d6 = c6992c.m13942d(c6992c.m13949k());
                            if ((i10 & 1048576) != 1048576 && c6992c.m13940b() > 0) {
                                this.f39004X = new ArrayList();
                                i10 |= 1048576;
                            }
                            while (c6992c.m13940b() > 0) {
                                this.f39004X.add(Integer.valueOf(c6992c.m13944f()));
                            }
                            c6992c.m13941c(iM13942d6);
                            z10 = true;
                            break;
                        case 242:
                            ProtoBuf$TypeTable.C6958b c6958bM13862q = (this.f39010c & 64) == 64 ? this.f39006Z.m13862q() : null;
                            ProtoBuf$TypeTable protoBuf$TypeTable = (ProtoBuf$TypeTable) c6992c.m13945g(ProtoBuf$TypeTable.f39342h, c6993d);
                            this.f39006Z = protoBuf$TypeTable;
                            if (c6958bM13862q != 0) {
                                c6958bM13862q.m13864m(protoBuf$TypeTable);
                                this.f39006Z = c6958bM13862q.m13863k();
                            }
                            this.f39010c |= 64;
                            z10 = true;
                            break;
                        case 248:
                            if ((i10 & 4194304) != 4194304) {
                                this.f39007a0 = new ArrayList();
                                i10 |= 4194304;
                            }
                            this.f39007a0.add(Integer.valueOf(c6992c.m13944f()));
                            z10 = true;
                            break;
                        case 250:
                            int iM13942d7 = c6992c.m13942d(c6992c.m13949k());
                            if ((i10 & 4194304) != 4194304 && c6992c.m13940b() > 0) {
                                this.f39007a0 = new ArrayList();
                                i10 |= 4194304;
                            }
                            while (c6992c.m13940b() > 0) {
                                this.f39007a0.add(Integer.valueOf(c6992c.m13944f()));
                            }
                            c6992c.m13941c(iM13942d7);
                            z10 = true;
                            break;
                        case 258:
                            if ((this.f39010c & BuildConfig.SDK_TRUNCATE_LENGTH) == 128) {
                                ProtoBuf$VersionRequirementTable protoBuf$VersionRequirementTable = this.f39009b0;
                                protoBuf$VersionRequirementTable.getClass();
                                c6966b = new ProtoBuf$VersionRequirementTable.C6966b();
                                c6966b.m13873m(protoBuf$VersionRequirementTable);
                            } else {
                                c6966b = null;
                            }
                            ProtoBuf$VersionRequirementTable protoBuf$VersionRequirementTable2 = (ProtoBuf$VersionRequirementTable) c6992c.m13945g(ProtoBuf$VersionRequirementTable.f39391f, c6993d);
                            this.f39009b0 = protoBuf$VersionRequirementTable2;
                            if (c6966b != null) {
                                c6966b.m13873m(protoBuf$VersionRequirementTable2);
                                this.f39009b0 = c6966b.m13872k();
                            }
                            this.f39010c |= BuildConfig.SDK_TRUNCATE_LENGTH;
                            z10 = true;
                            break;
                        default:
                            z10 = true;
                            if (!m13925x(c6992c, codedOutputStreamM13901j, c6993d, iM13952n)) {
                                z11 = z10;
                            }
                            break;
                    }
                } catch (InvalidProtocolBufferException e10) {
                    e10.m13936a(this);
                    throw e10;
                } catch (IOException e11) {
                    InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e11.getMessage());
                    invalidProtocolBufferException.m13936a(this);
                    throw invalidProtocolBufferException;
                }
            } catch (Throwable th2) {
                if ((i10 & 32) == 32) {
                    this.f39018i = Collections.unmodifiableList(this.f39018i);
                }
                if ((i10 & 8) == 8) {
                    this.f39016g = Collections.unmodifiableList(this.f39016g);
                }
                if ((i10 & 16) == 16) {
                    this.f39017h = Collections.unmodifiableList(this.f39017h);
                }
                if ((i10 & 64) == 64) {
                    this.f39020k = Collections.unmodifiableList(this.f39020k);
                }
                if ((i10 & 512) == 512) {
                    this.f38991K = Collections.unmodifiableList(this.f38991K);
                }
                if ((i10 & 1024) == 1024) {
                    this.f38992L = Collections.unmodifiableList(this.f38992L);
                }
                if ((i10 & 2048) == 2048) {
                    this.f38993M = Collections.unmodifiableList(this.f38993M);
                }
                if ((i10 & 4096) == 4096) {
                    this.f38994N = Collections.unmodifiableList(this.f38994N);
                }
                if ((i10 & 8192) == 8192) {
                    this.f38995O = Collections.unmodifiableList(this.f38995O);
                }
                if ((i10 & 16384) == 16384) {
                    this.f38996P = Collections.unmodifiableList(this.f38996P);
                }
                if ((i10 & BuildConfig.SDK_TRUNCATE_LENGTH) == 128) {
                    this.f38988H = Collections.unmodifiableList(this.f38988H);
                }
                if ((i10 & 256) == 256) {
                    this.f38989I = Collections.unmodifiableList(this.f38989I);
                }
                if ((i10 & 262144) == 262144) {
                    this.f39001U = Collections.unmodifiableList(this.f39001U);
                }
                if ((i10 & 524288) == 524288) {
                    this.f39003W = Collections.unmodifiableList(this.f39003W);
                }
                if ((i10 & 1048576) == 1048576) {
                    this.f39004X = Collections.unmodifiableList(this.f39004X);
                }
                if ((i10 & 4194304) == 4194304) {
                    this.f39007a0 = Collections.unmodifiableList(this.f39007a0);
                }
                try {
                    codedOutputStreamM13901j.m13902i();
                } catch (IOException unused) {
                } catch (Throwable th3) {
                    this.f39008b = bVarM15518q.m15533l();
                    throw th3;
                }
                this.f39008b = bVarM15518q.m15533l();
                m13923t();
                throw th2;
            }
        }
        if ((i10 & 32) == 32) {
            this.f39018i = Collections.unmodifiableList(this.f39018i);
        }
        if ((i10 & 8) == 8) {
            this.f39016g = Collections.unmodifiableList(this.f39016g);
        }
        if ((i10 & 16) == 16) {
            this.f39017h = Collections.unmodifiableList(this.f39017h);
        }
        if ((i10 & 64) == 64) {
            this.f39020k = Collections.unmodifiableList(this.f39020k);
        }
        if ((i10 & 512) == 512) {
            this.f38991K = Collections.unmodifiableList(this.f38991K);
        }
        if ((i10 & 1024) == 1024) {
            this.f38992L = Collections.unmodifiableList(this.f38992L);
        }
        if ((i10 & 2048) == 2048) {
            this.f38993M = Collections.unmodifiableList(this.f38993M);
        }
        if ((i10 & 4096) == 4096) {
            this.f38994N = Collections.unmodifiableList(this.f38994N);
        }
        if ((i10 & 8192) == 8192) {
            this.f38995O = Collections.unmodifiableList(this.f38995O);
        }
        if ((i10 & 16384) == 16384) {
            this.f38996P = Collections.unmodifiableList(this.f38996P);
        }
        if ((i10 & BuildConfig.SDK_TRUNCATE_LENGTH) == 128) {
            this.f38988H = Collections.unmodifiableList(this.f38988H);
        }
        if ((i10 & 256) == 256) {
            this.f38989I = Collections.unmodifiableList(this.f38989I);
        }
        if ((i10 & 262144) == 262144) {
            this.f39001U = Collections.unmodifiableList(this.f39001U);
        }
        if ((i10 & 524288) == 524288) {
            this.f39003W = Collections.unmodifiableList(this.f39003W);
        }
        if ((i10 & 1048576) == 1048576) {
            this.f39004X = Collections.unmodifiableList(this.f39004X);
        }
        if ((i10 & 4194304) == 4194304) {
            this.f39007a0 = Collections.unmodifiableList(this.f39007a0);
        }
        try {
            codedOutputStreamM13901j.m13902i();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f39008b = bVarM15518q.m15533l();
            throw th4;
        }
        this.f39008b = bVarM15518q.m15533l();
        m13923t();
    }

    @Override // p282nn.InterfaceC7808f
    /* JADX INFO: renamed from: b */
    public final boolean mo13780b() {
        byte b10 = this.f39011c0;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        if (!((this.f39010c & 2) == 2)) {
            this.f39011c0 = (byte) 0;
            return false;
        }
        for (int i10 = 0; i10 < this.f39016g.size(); i10++) {
            if (!this.f39016g.get(i10).mo13780b()) {
                this.f39011c0 = (byte) 0;
                return false;
            }
        }
        for (int i11 = 0; i11 < this.f39017h.size(); i11++) {
            if (!this.f39017h.get(i11).mo13780b()) {
                this.f39011c0 = (byte) 0;
                return false;
            }
        }
        for (int i12 = 0; i12 < this.f38988H.size(); i12++) {
            if (!this.f38988H.get(i12).mo13780b()) {
                this.f39011c0 = (byte) 0;
                return false;
            }
        }
        for (int i13 = 0; i13 < this.f38991K.size(); i13++) {
            if (!this.f38991K.get(i13).mo13780b()) {
                this.f39011c0 = (byte) 0;
                return false;
            }
        }
        for (int i14 = 0; i14 < this.f38992L.size(); i14++) {
            if (!this.f38992L.get(i14).mo13780b()) {
                this.f39011c0 = (byte) 0;
                return false;
            }
        }
        for (int i15 = 0; i15 < this.f38993M.size(); i15++) {
            if (!this.f38993M.get(i15).mo13780b()) {
                this.f39011c0 = (byte) 0;
                return false;
            }
        }
        for (int i16 = 0; i16 < this.f38994N.size(); i16++) {
            if (!this.f38994N.get(i16).mo13780b()) {
                this.f39011c0 = (byte) 0;
                return false;
            }
        }
        for (int i17 = 0; i17 < this.f38995O.size(); i17++) {
            if (!this.f38995O.get(i17).mo13780b()) {
                this.f39011c0 = (byte) 0;
                return false;
            }
        }
        if (((this.f39010c & 16) == 16) && !this.f38999S.mo13780b()) {
            this.f39011c0 = (byte) 0;
            return false;
        }
        for (int i18 = 0; i18 < this.f39003W.size(); i18++) {
            if (!this.f39003W.get(i18).mo13780b()) {
                this.f39011c0 = (byte) 0;
                return false;
            }
        }
        if (((this.f39010c & 64) == 64) && !this.f39006Z.mo13780b()) {
            this.f39011c0 = (byte) 0;
            return false;
        }
        if (m13919n()) {
            this.f39011c0 = (byte) 1;
            return true;
        }
        this.f39011c0 = (byte) 0;
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC6997h
    /* JADX INFO: renamed from: c */
    public final InterfaceC6997h.a mo13781c() {
        C6916b c6916b = new C6916b();
        c6916b.m13805n(this);
        return c6916b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC6997h
    /* JADX INFO: renamed from: d */
    public final int mo13782d() {
        int i10 = this.f39013d0;
        if (i10 != -1) {
            return i10;
        }
        int iM13894b = (this.f39010c & 1) == 1 ? CodedOutputStream.m13894b(1, this.f39012d) + 0 : 0;
        int iM13895c = 0;
        for (int i11 = 0; i11 < this.f39018i.size(); i11++) {
            iM13895c += CodedOutputStream.m13895c(this.f39018i.get(i11).intValue());
        }
        int iM13896d = iM13894b + iM13895c;
        if (!this.f39018i.isEmpty()) {
            iM13896d = iM13896d + 1 + CodedOutputStream.m13895c(iM13895c);
        }
        this.f39019j = iM13895c;
        if ((this.f39010c & 2) == 2) {
            iM13896d += CodedOutputStream.m13894b(3, this.f39014e);
        }
        if ((this.f39010c & 4) == 4) {
            iM13896d += CodedOutputStream.m13894b(4, this.f39015f);
        }
        for (int i12 = 0; i12 < this.f39016g.size(); i12++) {
            iM13896d += CodedOutputStream.m13896d(5, this.f39016g.get(i12));
        }
        for (int i13 = 0; i13 < this.f39017h.size(); i13++) {
            iM13896d += CodedOutputStream.m13896d(6, this.f39017h.get(i13));
        }
        int iM13895c2 = 0;
        for (int i14 = 0; i14 < this.f39020k.size(); i14++) {
            iM13895c2 += CodedOutputStream.m13895c(this.f39020k.get(i14).intValue());
        }
        int iM13896d2 = iM13896d + iM13895c2;
        if (!this.f39020k.isEmpty()) {
            iM13896d2 = iM13896d2 + 1 + CodedOutputStream.m13895c(iM13895c2);
        }
        this.f39021l = iM13895c2;
        for (int i15 = 0; i15 < this.f38991K.size(); i15++) {
            iM13896d2 += CodedOutputStream.m13896d(8, this.f38991K.get(i15));
        }
        for (int i16 = 0; i16 < this.f38992L.size(); i16++) {
            iM13896d2 += CodedOutputStream.m13896d(9, this.f38992L.get(i16));
        }
        for (int i17 = 0; i17 < this.f38993M.size(); i17++) {
            iM13896d2 += CodedOutputStream.m13896d(10, this.f38993M.get(i17));
        }
        for (int i18 = 0; i18 < this.f38994N.size(); i18++) {
            iM13896d2 += CodedOutputStream.m13896d(11, this.f38994N.get(i18));
        }
        for (int i19 = 0; i19 < this.f38995O.size(); i19++) {
            iM13896d2 += CodedOutputStream.m13896d(13, this.f38995O.get(i19));
        }
        int iM13895c3 = 0;
        for (int i20 = 0; i20 < this.f38996P.size(); i20++) {
            iM13895c3 += CodedOutputStream.m13895c(this.f38996P.get(i20).intValue());
        }
        int iM13896d3 = iM13896d2 + iM13895c3;
        if (!this.f38996P.isEmpty()) {
            iM13896d3 = iM13896d3 + 2 + CodedOutputStream.m13895c(iM13895c3);
        }
        this.f38997Q = iM13895c3;
        if ((this.f39010c & 8) == 8) {
            iM13896d3 += CodedOutputStream.m13894b(17, this.f38998R);
        }
        if ((this.f39010c & 16) == 16) {
            iM13896d3 += CodedOutputStream.m13896d(18, this.f38999S);
        }
        if ((this.f39010c & 32) == 32) {
            iM13896d3 += CodedOutputStream.m13894b(19, this.f39000T);
        }
        for (int i21 = 0; i21 < this.f38988H.size(); i21++) {
            iM13896d3 += CodedOutputStream.m13896d(20, this.f38988H.get(i21));
        }
        int iM13895c4 = 0;
        for (int i22 = 0; i22 < this.f38989I.size(); i22++) {
            iM13895c4 += CodedOutputStream.m13895c(this.f38989I.get(i22).intValue());
        }
        int iM13895c5 = iM13896d3 + iM13895c4;
        if (!this.f38989I.isEmpty()) {
            iM13895c5 = iM13895c5 + 2 + CodedOutputStream.m13895c(iM13895c4);
        }
        this.f38990J = iM13895c4;
        int iM13895c6 = 0;
        for (int i23 = 0; i23 < this.f39001U.size(); i23++) {
            iM13895c6 += CodedOutputStream.m13895c(this.f39001U.get(i23).intValue());
        }
        int iM13896d4 = iM13895c5 + iM13895c6;
        if (!this.f39001U.isEmpty()) {
            iM13896d4 = iM13896d4 + 2 + CodedOutputStream.m13895c(iM13895c6);
        }
        this.f39002V = iM13895c6;
        for (int i24 = 0; i24 < this.f39003W.size(); i24++) {
            iM13896d4 += CodedOutputStream.m13896d(23, this.f39003W.get(i24));
        }
        int iM13895c7 = 0;
        for (int i25 = 0; i25 < this.f39004X.size(); i25++) {
            iM13895c7 += CodedOutputStream.m13895c(this.f39004X.get(i25).intValue());
        }
        int iM13896d5 = iM13896d4 + iM13895c7;
        if (!this.f39004X.isEmpty()) {
            iM13896d5 = iM13896d5 + 2 + CodedOutputStream.m13895c(iM13895c7);
        }
        this.f39005Y = iM13895c7;
        if ((this.f39010c & 64) == 64) {
            iM13896d5 += CodedOutputStream.m13896d(30, this.f39006Z);
        }
        int iM13895c8 = 0;
        for (int i26 = 0; i26 < this.f39007a0.size(); i26++) {
            iM13895c8 += CodedOutputStream.m13895c(this.f39007a0.get(i26).intValue());
        }
        int size = (this.f39007a0.size() * 2) + iM13896d5 + iM13895c8;
        if ((this.f39010c & BuildConfig.SDK_TRUNCATE_LENGTH) == 128) {
            size += CodedOutputStream.m13896d(32, this.f39009b0);
        }
        int size2 = this.f39008b.size() + m13920q() + size;
        this.f39013d0 = size2;
        return size2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC6997h
    /* JADX INFO: renamed from: e */
    public final InterfaceC6997h.a mo13783e() {
        return new C6916b();
    }

    @Override // p282nn.InterfaceC7808f
    /* JADX INFO: renamed from: h */
    public final InterfaceC6997h mo13802h() {
        return f38986e0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC6997h
    /* JADX INFO: renamed from: j */
    public final void mo13784j(CodedOutputStream codedOutputStream) throws IOException {
        mo13782d();
        GeneratedMessageLite.ExtendableMessage.C6980a c6980a = new GeneratedMessageLite.ExtendableMessage.C6980a(this);
        if ((this.f39010c & 1) == 1) {
            codedOutputStream.m13905m(1, this.f39012d);
        }
        if (this.f39018i.size() > 0) {
            codedOutputStream.m13914v(18);
            codedOutputStream.m13914v(this.f39019j);
        }
        for (int i10 = 0; i10 < this.f39018i.size(); i10++) {
            codedOutputStream.m13906n(this.f39018i.get(i10).intValue());
        }
        if ((this.f39010c & 2) == 2) {
            codedOutputStream.m13905m(3, this.f39014e);
        }
        if ((this.f39010c & 4) == 4) {
            codedOutputStream.m13905m(4, this.f39015f);
        }
        for (int i11 = 0; i11 < this.f39016g.size(); i11++) {
            codedOutputStream.m13907o(5, this.f39016g.get(i11));
        }
        for (int i12 = 0; i12 < this.f39017h.size(); i12++) {
            codedOutputStream.m13907o(6, this.f39017h.get(i12));
        }
        if (this.f39020k.size() > 0) {
            codedOutputStream.m13914v(58);
            codedOutputStream.m13914v(this.f39021l);
        }
        for (int i13 = 0; i13 < this.f39020k.size(); i13++) {
            codedOutputStream.m13906n(this.f39020k.get(i13).intValue());
        }
        for (int i14 = 0; i14 < this.f38991K.size(); i14++) {
            codedOutputStream.m13907o(8, this.f38991K.get(i14));
        }
        for (int i15 = 0; i15 < this.f38992L.size(); i15++) {
            codedOutputStream.m13907o(9, this.f38992L.get(i15));
        }
        for (int i16 = 0; i16 < this.f38993M.size(); i16++) {
            codedOutputStream.m13907o(10, this.f38993M.get(i16));
        }
        for (int i17 = 0; i17 < this.f38994N.size(); i17++) {
            codedOutputStream.m13907o(11, this.f38994N.get(i17));
        }
        for (int i18 = 0; i18 < this.f38995O.size(); i18++) {
            codedOutputStream.m13907o(13, this.f38995O.get(i18));
        }
        if (this.f38996P.size() > 0) {
            codedOutputStream.m13914v(130);
            codedOutputStream.m13914v(this.f38997Q);
        }
        for (int i19 = 0; i19 < this.f38996P.size(); i19++) {
            codedOutputStream.m13906n(this.f38996P.get(i19).intValue());
        }
        if ((this.f39010c & 8) == 8) {
            codedOutputStream.m13905m(17, this.f38998R);
        }
        if ((this.f39010c & 16) == 16) {
            codedOutputStream.m13907o(18, this.f38999S);
        }
        if ((this.f39010c & 32) == 32) {
            codedOutputStream.m13905m(19, this.f39000T);
        }
        for (int i20 = 0; i20 < this.f38988H.size(); i20++) {
            codedOutputStream.m13907o(20, this.f38988H.get(i20));
        }
        if (this.f38989I.size() > 0) {
            codedOutputStream.m13914v(170);
            codedOutputStream.m13914v(this.f38990J);
        }
        for (int i21 = 0; i21 < this.f38989I.size(); i21++) {
            codedOutputStream.m13906n(this.f38989I.get(i21).intValue());
        }
        if (this.f39001U.size() > 0) {
            codedOutputStream.m13914v(178);
            codedOutputStream.m13914v(this.f39002V);
        }
        for (int i22 = 0; i22 < this.f39001U.size(); i22++) {
            codedOutputStream.m13906n(this.f39001U.get(i22).intValue());
        }
        for (int i23 = 0; i23 < this.f39003W.size(); i23++) {
            codedOutputStream.m13907o(23, this.f39003W.get(i23));
        }
        if (this.f39004X.size() > 0) {
            codedOutputStream.m13914v(194);
            codedOutputStream.m13914v(this.f39005Y);
        }
        for (int i24 = 0; i24 < this.f39004X.size(); i24++) {
            codedOutputStream.m13906n(this.f39004X.get(i24).intValue());
        }
        if ((this.f39010c & 64) == 64) {
            codedOutputStream.m13907o(30, this.f39006Z);
        }
        for (int i25 = 0; i25 < this.f39007a0.size(); i25++) {
            codedOutputStream.m13905m(31, this.f39007a0.get(i25).intValue());
        }
        if ((this.f39010c & BuildConfig.SDK_TRUNCATE_LENGTH) == 128) {
            codedOutputStream.m13907o(32, this.f39009b0);
        }
        c6980a.m13927a(19000, codedOutputStream);
        codedOutputStream.m13910r(this.f39008b);
    }

    /* JADX INFO: renamed from: z */
    public final void m13803z() {
        this.f39012d = 6;
        this.f39014e = 0;
        this.f39015f = 0;
        this.f39016g = Collections.emptyList();
        this.f39017h = Collections.emptyList();
        this.f39018i = Collections.emptyList();
        this.f39020k = Collections.emptyList();
        this.f38988H = Collections.emptyList();
        this.f38989I = Collections.emptyList();
        this.f38991K = Collections.emptyList();
        this.f38992L = Collections.emptyList();
        this.f38993M = Collections.emptyList();
        this.f38994N = Collections.emptyList();
        this.f38995O = Collections.emptyList();
        this.f38996P = Collections.emptyList();
        this.f38998R = 0;
        this.f38999S = ProtoBuf$Type.f39246O;
        this.f39000T = 0;
        this.f39001U = Collections.emptyList();
        this.f39003W = Collections.emptyList();
        this.f39004X = Collections.emptyList();
        this.f39006Z = ProtoBuf$TypeTable.f39341g;
        this.f39007a0 = Collections.emptyList();
        this.f39009b0 = ProtoBuf$VersionRequirementTable.f39390e;
    }
}
