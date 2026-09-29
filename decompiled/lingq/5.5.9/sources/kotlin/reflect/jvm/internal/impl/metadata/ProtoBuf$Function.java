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
public final class ProtoBuf$Function extends GeneratedMessageLite.ExtendableMessage<ProtoBuf$Function> {

    /* JADX INFO: renamed from: P */
    public static final ProtoBuf$Function f39113P;

    /* JADX INFO: renamed from: Q */
    public static final C6930a f39114Q = new C6930a();

    /* JADX INFO: renamed from: H */
    public List<Integer> f39115H;

    /* JADX INFO: renamed from: I */
    public int f39116I;

    /* JADX INFO: renamed from: J */
    public List<ProtoBuf$ValueParameter> f39117J;

    /* JADX INFO: renamed from: K */
    public ProtoBuf$TypeTable f39118K;

    /* JADX INFO: renamed from: L */
    public List<Integer> f39119L;

    /* JADX INFO: renamed from: M */
    public ProtoBuf$Contract f39120M;

    /* JADX INFO: renamed from: N */
    public byte f39121N;

    /* JADX INFO: renamed from: O */
    public int f39122O;

    /* JADX INFO: renamed from: b */
    public final AbstractC7803a f39123b;

    /* JADX INFO: renamed from: c */
    public int f39124c;

    /* JADX INFO: renamed from: d */
    public int f39125d;

    /* JADX INFO: renamed from: e */
    public int f39126e;

    /* JADX INFO: renamed from: f */
    public int f39127f;

    /* JADX INFO: renamed from: g */
    public ProtoBuf$Type f39128g;

    /* JADX INFO: renamed from: h */
    public int f39129h;

    /* JADX INFO: renamed from: i */
    public List<ProtoBuf$TypeParameter> f39130i;

    /* JADX INFO: renamed from: j */
    public ProtoBuf$Type f39131j;

    /* JADX INFO: renamed from: k */
    public int f39132k;

    /* JADX INFO: renamed from: l */
    public List<ProtoBuf$Type> f39133l;

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function$a */
    public static class C6930a extends AbstractC6991b<ProtoBuf$Function> {
        @Override // p282nn.InterfaceC7809g
        /* JADX INFO: renamed from: a */
        public final Object mo13787a(C6992c c6992c, C6993d c6993d) throws InvalidProtocolBufferException {
            return new ProtoBuf$Function(c6992c, c6993d);
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function$b */
    public static final class C6931b extends GeneratedMessageLite.AbstractC6983c<ProtoBuf$Function, C6931b> {

        /* JADX INFO: renamed from: H */
        public List<ProtoBuf$Type> f39134H;

        /* JADX INFO: renamed from: I */
        public List<Integer> f39135I;

        /* JADX INFO: renamed from: J */
        public List<ProtoBuf$ValueParameter> f39136J;

        /* JADX INFO: renamed from: K */
        public ProtoBuf$TypeTable f39137K;

        /* JADX INFO: renamed from: L */
        public List<Integer> f39138L;

        /* JADX INFO: renamed from: M */
        public ProtoBuf$Contract f39139M;

        /* JADX INFO: renamed from: d */
        public int f39140d;

        /* JADX INFO: renamed from: e */
        public int f39141e = 6;

        /* JADX INFO: renamed from: f */
        public int f39142f = 6;

        /* JADX INFO: renamed from: g */
        public int f39143g;

        /* JADX INFO: renamed from: h */
        public ProtoBuf$Type f39144h;

        /* JADX INFO: renamed from: i */
        public int f39145i;

        /* JADX INFO: renamed from: j */
        public List<ProtoBuf$TypeParameter> f39146j;

        /* JADX INFO: renamed from: k */
        public ProtoBuf$Type f39147k;

        /* JADX INFO: renamed from: l */
        public int f39148l;

        public C6931b() {
            ProtoBuf$Type protoBuf$Type = ProtoBuf$Type.f39246O;
            this.f39144h = protoBuf$Type;
            this.f39146j = Collections.emptyList();
            this.f39147k = protoBuf$Type;
            this.f39134H = Collections.emptyList();
            this.f39135I = Collections.emptyList();
            this.f39136J = Collections.emptyList();
            this.f39137K = ProtoBuf$TypeTable.f39341g;
            this.f39138L = Collections.emptyList();
            this.f39139M = ProtoBuf$Contract.f39060e;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC6990a.a, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC6997h.a
        /* JADX INFO: renamed from: Q */
        public final /* bridge */ /* synthetic */ InterfaceC6997h.a mo13788Q(C6992c c6992c, C6993d c6993d) throws Throwable {
            m13824o(c6992c, c6993d);
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC6997h.a
        /* JADX INFO: renamed from: a */
        public final InterfaceC6997h mo13789a() {
            ProtoBuf$Function protoBuf$FunctionM13822m = m13822m();
            if (protoBuf$FunctionM13822m.mo13780b()) {
                return protoBuf$FunctionM13822m;
            }
            throw new UninitializedMessageException();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.AbstractC6982b
        public final Object clone() throws CloneNotSupportedException {
            C6931b c6931b = new C6931b();
            c6931b.m13823n(m13822m());
            return c6931b;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC6990a.a
        /* JADX INFO: renamed from: f */
        public final /* bridge */ /* synthetic */ AbstractC6990a.a mo13788Q(C6992c c6992c, C6993d c6993d) throws Throwable {
            m13824o(c6992c, c6993d);
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.AbstractC6982b
        /* JADX INFO: renamed from: g */
        public final GeneratedMessageLite.AbstractC6982b clone() {
            C6931b c6931b = new C6931b();
            c6931b.m13823n(m13822m());
            return c6931b;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.AbstractC6982b
        /* JADX INFO: renamed from: i */
        public final /* bridge */ /* synthetic */ GeneratedMessageLite.AbstractC6982b mo13792i(GeneratedMessageLite generatedMessageLite) {
            m13823n((ProtoBuf$Function) generatedMessageLite);
            return this;
        }

        /* JADX INFO: renamed from: m */
        public final ProtoBuf$Function m13822m() {
            ProtoBuf$Function protoBuf$Function = new ProtoBuf$Function(this);
            int i10 = this.f39140d;
            int i11 = 1;
            if ((i10 & 1) != 1) {
                i11 = 0;
            }
            protoBuf$Function.f39125d = this.f39141e;
            if ((i10 & 2) == 2) {
                i11 |= 2;
            }
            protoBuf$Function.f39126e = this.f39142f;
            if ((i10 & 4) == 4) {
                i11 |= 4;
            }
            protoBuf$Function.f39127f = this.f39143g;
            if ((i10 & 8) == 8) {
                i11 |= 8;
            }
            protoBuf$Function.f39128g = this.f39144h;
            if ((i10 & 16) == 16) {
                i11 |= 16;
            }
            protoBuf$Function.f39129h = this.f39145i;
            if ((i10 & 32) == 32) {
                this.f39146j = Collections.unmodifiableList(this.f39146j);
                this.f39140d &= -33;
            }
            protoBuf$Function.f39130i = this.f39146j;
            if ((i10 & 64) == 64) {
                i11 |= 32;
            }
            protoBuf$Function.f39131j = this.f39147k;
            if ((i10 & BuildConfig.SDK_TRUNCATE_LENGTH) == 128) {
                i11 |= 64;
            }
            protoBuf$Function.f39132k = this.f39148l;
            if ((this.f39140d & 256) == 256) {
                this.f39134H = Collections.unmodifiableList(this.f39134H);
                this.f39140d &= -257;
            }
            protoBuf$Function.f39133l = this.f39134H;
            if ((this.f39140d & 512) == 512) {
                this.f39135I = Collections.unmodifiableList(this.f39135I);
                this.f39140d &= -513;
            }
            protoBuf$Function.f39115H = this.f39135I;
            if ((this.f39140d & 1024) == 1024) {
                this.f39136J = Collections.unmodifiableList(this.f39136J);
                this.f39140d &= -1025;
            }
            protoBuf$Function.f39117J = this.f39136J;
            if ((i10 & 2048) == 2048) {
                i11 |= BuildConfig.SDK_TRUNCATE_LENGTH;
            }
            protoBuf$Function.f39118K = this.f39137K;
            if ((this.f39140d & 4096) == 4096) {
                this.f39138L = Collections.unmodifiableList(this.f39138L);
                this.f39140d &= -4097;
            }
            protoBuf$Function.f39119L = this.f39138L;
            if ((i10 & 8192) == 8192) {
                i11 |= 256;
            }
            protoBuf$Function.f39120M = this.f39139M;
            protoBuf$Function.f39124c = i11;
            return protoBuf$Function;
        }

        /* JADX INFO: renamed from: n */
        public final void m13823n(ProtoBuf$Function protoBuf$Function) {
            ProtoBuf$Contract protoBuf$Contract;
            ProtoBuf$TypeTable protoBuf$TypeTable;
            ProtoBuf$Type protoBuf$Type;
            ProtoBuf$Type protoBuf$Type2;
            if (protoBuf$Function == ProtoBuf$Function.f39113P) {
                return;
            }
            int i10 = protoBuf$Function.f39124c;
            if ((i10 & 1) == 1) {
                int i11 = protoBuf$Function.f39125d;
                this.f39140d |= 1;
                this.f39141e = i11;
            }
            if ((i10 & 2) == 2) {
                int i12 = protoBuf$Function.f39126e;
                this.f39140d = 2 | this.f39140d;
                this.f39142f = i12;
            }
            if ((i10 & 4) == 4) {
                int i13 = protoBuf$Function.f39127f;
                this.f39140d = 4 | this.f39140d;
                this.f39143g = i13;
            }
            if ((i10 & 8) == 8) {
                ProtoBuf$Type protoBuf$Type3 = protoBuf$Function.f39128g;
                if ((this.f39140d & 8) != 8 || (protoBuf$Type2 = this.f39144h) == ProtoBuf$Type.f39246O) {
                    this.f39144h = protoBuf$Type3;
                } else {
                    ProtoBuf$Type.C6951b c6951bM13844C = ProtoBuf$Type.m13844C(protoBuf$Type2);
                    c6951bM13844C.m13852n(protoBuf$Type3);
                    this.f39144h = c6951bM13844C.m13851m();
                }
                this.f39140d |= 8;
            }
            if ((protoBuf$Function.f39124c & 16) == 16) {
                int i14 = protoBuf$Function.f39129h;
                this.f39140d = 16 | this.f39140d;
                this.f39145i = i14;
            }
            if (!protoBuf$Function.f39130i.isEmpty()) {
                if (this.f39146j.isEmpty()) {
                    this.f39146j = protoBuf$Function.f39130i;
                    this.f39140d &= -33;
                } else {
                    if ((this.f39140d & 32) != 32) {
                        this.f39146j = new ArrayList(this.f39146j);
                        this.f39140d |= 32;
                    }
                    this.f39146j.addAll(protoBuf$Function.f39130i);
                }
            }
            if ((protoBuf$Function.f39124c & 32) == 32) {
                ProtoBuf$Type protoBuf$Type4 = protoBuf$Function.f39131j;
                if ((this.f39140d & 64) != 64 || (protoBuf$Type = this.f39147k) == ProtoBuf$Type.f39246O) {
                    this.f39147k = protoBuf$Type4;
                } else {
                    ProtoBuf$Type.C6951b c6951bM13844C2 = ProtoBuf$Type.m13844C(protoBuf$Type);
                    c6951bM13844C2.m13852n(protoBuf$Type4);
                    this.f39147k = c6951bM13844C2.m13851m();
                }
                this.f39140d |= 64;
            }
            if ((protoBuf$Function.f39124c & 64) == 64) {
                int i15 = protoBuf$Function.f39132k;
                this.f39140d |= BuildConfig.SDK_TRUNCATE_LENGTH;
                this.f39148l = i15;
            }
            if (!protoBuf$Function.f39133l.isEmpty()) {
                if (this.f39134H.isEmpty()) {
                    this.f39134H = protoBuf$Function.f39133l;
                    this.f39140d &= -257;
                } else {
                    if ((this.f39140d & 256) != 256) {
                        this.f39134H = new ArrayList(this.f39134H);
                        this.f39140d |= 256;
                    }
                    this.f39134H.addAll(protoBuf$Function.f39133l);
                }
            }
            if (!protoBuf$Function.f39115H.isEmpty()) {
                if (this.f39135I.isEmpty()) {
                    this.f39135I = protoBuf$Function.f39115H;
                    this.f39140d &= -513;
                } else {
                    if ((this.f39140d & 512) != 512) {
                        this.f39135I = new ArrayList(this.f39135I);
                        this.f39140d |= 512;
                    }
                    this.f39135I.addAll(protoBuf$Function.f39115H);
                }
            }
            if (!protoBuf$Function.f39117J.isEmpty()) {
                if (this.f39136J.isEmpty()) {
                    this.f39136J = protoBuf$Function.f39117J;
                    this.f39140d &= -1025;
                } else {
                    if ((this.f39140d & 1024) != 1024) {
                        this.f39136J = new ArrayList(this.f39136J);
                        this.f39140d |= 1024;
                    }
                    this.f39136J.addAll(protoBuf$Function.f39117J);
                }
            }
            if ((protoBuf$Function.f39124c & BuildConfig.SDK_TRUNCATE_LENGTH) == 128) {
                ProtoBuf$TypeTable protoBuf$TypeTable2 = protoBuf$Function.f39118K;
                if ((this.f39140d & 2048) != 2048 || (protoBuf$TypeTable = this.f39137K) == ProtoBuf$TypeTable.f39341g) {
                    this.f39137K = protoBuf$TypeTable2;
                } else {
                    ProtoBuf$TypeTable.C6958b c6958bM13861n = ProtoBuf$TypeTable.m13861n(protoBuf$TypeTable);
                    c6958bM13861n.m13864m(protoBuf$TypeTable2);
                    this.f39137K = c6958bM13861n.m13863k();
                }
                this.f39140d |= 2048;
            }
            if (!protoBuf$Function.f39119L.isEmpty()) {
                if (this.f39138L.isEmpty()) {
                    this.f39138L = protoBuf$Function.f39119L;
                    this.f39140d &= -4097;
                } else {
                    if ((this.f39140d & 4096) != 4096) {
                        this.f39138L = new ArrayList(this.f39138L);
                        this.f39140d |= 4096;
                    }
                    this.f39138L.addAll(protoBuf$Function.f39119L);
                }
            }
            if ((protoBuf$Function.f39124c & 256) == 256) {
                ProtoBuf$Contract protoBuf$Contract2 = protoBuf$Function.f39120M;
                if ((this.f39140d & 8192) != 8192 || (protoBuf$Contract = this.f39139M) == ProtoBuf$Contract.f39060e) {
                    this.f39139M = protoBuf$Contract2;
                } else {
                    ProtoBuf$Contract.C6920b c6920b = new ProtoBuf$Contract.C6920b();
                    c6920b.m13811m(protoBuf$Contract);
                    c6920b.m13811m(protoBuf$Contract2);
                    this.f39139M = c6920b.m13810k();
                }
                this.f39140d |= 8192;
            }
            m13928k(protoBuf$Function);
            this.f39493a = this.f39493a.m15519f(protoBuf$Function.f39123b);
        }

        /* JADX WARN: Code duplicated, block: B:15:0x0020  */
        /* JADX INFO: renamed from: o */
        public final void m13824o(C6992c c6992c, C6993d c6993d) throws Throwable {
            ProtoBuf$Function protoBuf$Function;
            try {
                try {
                    ProtoBuf$Function.f39114Q.getClass();
                    m13823n(new ProtoBuf$Function(c6992c, c6993d));
                } catch (InvalidProtocolBufferException e10) {
                    protoBuf$Function = (ProtoBuf$Function) e10.f39506a;
                    try {
                        throw e10;
                    } catch (Throwable th2) {
                        th = th2;
                        if (protoBuf$Function != null) {
                            m13823n(protoBuf$Function);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                protoBuf$Function = null;
                if (protoBuf$Function != null) {
                    m13823n(protoBuf$Function);
                }
                throw th;
            }
        }
    }

    static {
        ProtoBuf$Function protoBuf$Function = new ProtoBuf$Function(0);
        f39113P = protoBuf$Function;
        protoBuf$Function.m13821z();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public ProtoBuf$Function() {
        throw null;
    }

    public ProtoBuf$Function(int i10) {
        this.f39116I = -1;
        this.f39121N = (byte) -1;
        this.f39122O = -1;
        this.f39123b = AbstractC7803a.f42882a;
    }

    public ProtoBuf$Function(GeneratedMessageLite.AbstractC6983c abstractC6983c) {
        super(abstractC6983c);
        this.f39116I = -1;
        this.f39121N = (byte) -1;
        this.f39122O = -1;
        this.f39123b = abstractC6983c.f39493a;
    }

    public ProtoBuf$Function(C6992c c6992c, C6993d c6993d) throws InvalidProtocolBufferException {
        this.f39116I = -1;
        this.f39121N = (byte) -1;
        this.f39122O = -1;
        m13821z();
        AbstractC7803a.b bVar = new AbstractC7803a.b();
        CodedOutputStream codedOutputStreamM13901j = CodedOutputStream.m13901j(bVar, 1);
        boolean z10 = false;
        int i10 = 0;
        while (!z10) {
            try {
                try {
                    int iM13952n = c6992c.m13952n();
                    ProtoBuf$Type.C6951b c6951bM13844C = null;
                    ProtoBuf$Contract.C6920b c6920b = null;
                    ProtoBuf$TypeTable.C6958b c6958bM13861n = null;
                    ProtoBuf$Type.C6951b c6951bM13844C2 = null;
                    switch (iM13952n) {
                        case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                            break;
                        case 8:
                            this.f39124c |= 2;
                            this.f39126e = c6992c.m13949k();
                            continue;
                        case 16:
                            this.f39124c |= 4;
                            this.f39127f = c6992c.m13949k();
                            continue;
                        case 26:
                            if ((this.f39124c & 8) == 8) {
                                ProtoBuf$Type protoBuf$Type = this.f39128g;
                                protoBuf$Type.getClass();
                                c6951bM13844C = ProtoBuf$Type.m13844C(protoBuf$Type);
                            }
                            ProtoBuf$Type protoBuf$Type2 = (ProtoBuf$Type) c6992c.m13945g(ProtoBuf$Type.f39247P, c6993d);
                            this.f39128g = protoBuf$Type2;
                            if (c6951bM13844C != null) {
                                c6951bM13844C.m13852n(protoBuf$Type2);
                                this.f39128g = c6951bM13844C.m13851m();
                            }
                            this.f39124c |= 8;
                            continue;
                        case 34:
                            int i11 = (i10 == true ? 1 : 0) & 32;
                            i10 = i10;
                            if (i11 != 32) {
                                this.f39130i = new ArrayList();
                                i10 = (i10 == true ? 1 : 0) | 32;
                            }
                            this.f39130i.add((ProtoBuf$TypeParameter) c6992c.m13945g(ProtoBuf$TypeParameter.f39321I, c6993d));
                            continue;
                        case 42:
                            if ((this.f39124c & 32) == 32) {
                                ProtoBuf$Type protoBuf$Type3 = this.f39131j;
                                protoBuf$Type3.getClass();
                                c6951bM13844C2 = ProtoBuf$Type.m13844C(protoBuf$Type3);
                            }
                            ProtoBuf$Type protoBuf$Type4 = (ProtoBuf$Type) c6992c.m13945g(ProtoBuf$Type.f39247P, c6993d);
                            this.f39131j = protoBuf$Type4;
                            if (c6951bM13844C2 != null) {
                                c6951bM13844C2.m13852n(protoBuf$Type4);
                                this.f39131j = c6951bM13844C2.m13851m();
                            }
                            this.f39124c |= 32;
                            continue;
                        case 50:
                            int i12 = (i10 == true ? 1 : 0) & 1024;
                            i10 = i10;
                            if (i12 != 1024) {
                                this.f39117J = new ArrayList();
                                i10 = (i10 == true ? 1 : 0) | 1024;
                            }
                            this.f39117J.add((ProtoBuf$ValueParameter) c6992c.m13945g(ProtoBuf$ValueParameter.f39352H, c6993d));
                            continue;
                        case 56:
                            this.f39124c |= 16;
                            this.f39129h = c6992c.m13949k();
                            continue;
                        case 64:
                            this.f39124c |= 64;
                            this.f39132k = c6992c.m13949k();
                            continue;
                        case 72:
                            this.f39124c |= 1;
                            this.f39125d = c6992c.m13949k();
                            continue;
                        case 82:
                            int i13 = (i10 == true ? 1 : 0) & 256;
                            i10 = i10;
                            if (i13 != 256) {
                                this.f39133l = new ArrayList();
                                i10 = (i10 == true ? 1 : 0) | 256;
                            }
                            this.f39133l.add((ProtoBuf$Type) c6992c.m13945g(ProtoBuf$Type.f39247P, c6993d));
                            continue;
                        case ModuleDescriptor.MODULE_VERSION /* 88 */:
                            int i14 = (i10 == true ? 1 : 0) & 512;
                            i10 = i10;
                            if (i14 != 512) {
                                this.f39115H = new ArrayList();
                                i10 = (i10 == true ? 1 : 0) | 512;
                            }
                            this.f39115H.add(Integer.valueOf(c6992c.m13949k()));
                            continue;
                        case 90:
                            int iM13942d = c6992c.m13942d(c6992c.m13949k());
                            int i15 = (i10 == true ? 1 : 0) & 512;
                            i10 = i10;
                            if (i15 != 512 && c6992c.m13940b() > 0) {
                                i10 = i10;
                                this.f39115H = new ArrayList();
                                i10 = (i10 == true ? 1 : 0) | 512;
                            }
                            i10 = i10;
                            while (c6992c.m13940b() > 0) {
                                this.f39115H.add(Integer.valueOf(c6992c.m13949k()));
                            }
                            c6992c.m13941c(iM13942d);
                            continue;
                        case 242:
                            if ((this.f39124c & BuildConfig.SDK_TRUNCATE_LENGTH) == 128) {
                                ProtoBuf$TypeTable protoBuf$TypeTable = this.f39118K;
                                protoBuf$TypeTable.getClass();
                                c6958bM13861n = ProtoBuf$TypeTable.m13861n(protoBuf$TypeTable);
                            }
                            ProtoBuf$TypeTable protoBuf$TypeTable2 = (ProtoBuf$TypeTable) c6992c.m13945g(ProtoBuf$TypeTable.f39342h, c6993d);
                            this.f39118K = protoBuf$TypeTable2;
                            if (c6958bM13861n != null) {
                                c6958bM13861n.m13864m(protoBuf$TypeTable2);
                                this.f39118K = c6958bM13861n.m13863k();
                            }
                            this.f39124c |= BuildConfig.SDK_TRUNCATE_LENGTH;
                            continue;
                        case 248:
                            int i16 = (i10 == true ? 1 : 0) & 4096;
                            i10 = i10;
                            if (i16 != 4096) {
                                this.f39119L = new ArrayList();
                                i10 = (i10 == true ? 1 : 0) | 4096;
                            }
                            this.f39119L.add(Integer.valueOf(c6992c.m13949k()));
                            continue;
                        case 250:
                            int iM13942d2 = c6992c.m13942d(c6992c.m13949k());
                            int i17 = (i10 == true ? 1 : 0) & 4096;
                            i10 = i10;
                            if (i17 != 4096 && c6992c.m13940b() > 0) {
                                i10 = i10;
                                this.f39119L = new ArrayList();
                                i10 = (i10 == true ? 1 : 0) | 4096;
                            }
                            i10 = i10;
                            while (c6992c.m13940b() > 0) {
                                this.f39119L.add(Integer.valueOf(c6992c.m13949k()));
                            }
                            c6992c.m13941c(iM13942d2);
                            continue;
                        case 258:
                            if ((this.f39124c & 256) == 256) {
                                ProtoBuf$Contract protoBuf$Contract = this.f39120M;
                                protoBuf$Contract.getClass();
                                c6920b = new ProtoBuf$Contract.C6920b();
                                c6920b.m13811m(protoBuf$Contract);
                            }
                            ProtoBuf$Contract protoBuf$Contract2 = (ProtoBuf$Contract) c6992c.m13945g(ProtoBuf$Contract.f39061f, c6993d);
                            this.f39120M = protoBuf$Contract2;
                            if (c6920b != null) {
                                c6920b.m13811m(protoBuf$Contract2);
                                this.f39120M = c6920b.m13810k();
                            }
                            this.f39124c |= 256;
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
                if (((i10 == true ? 1 : 0) & 32) == 32) {
                    this.f39130i = Collections.unmodifiableList(this.f39130i);
                }
                if (((i10 == true ? 1 : 0) & 1024) == 1024) {
                    this.f39117J = Collections.unmodifiableList(this.f39117J);
                }
                if (((i10 == true ? 1 : 0) & 256) == 256) {
                    this.f39133l = Collections.unmodifiableList(this.f39133l);
                }
                if (((i10 == true ? 1 : 0) & 512) == 512) {
                    this.f39115H = Collections.unmodifiableList(this.f39115H);
                }
                if (((i10 == true ? 1 : 0) & 4096) == 4096) {
                    this.f39119L = Collections.unmodifiableList(this.f39119L);
                }
                try {
                    codedOutputStreamM13901j.m13902i();
                } catch (IOException unused) {
                } catch (Throwable th3) {
                    this.f39123b = bVar.m15533l();
                    throw th3;
                }
                this.f39123b = bVar.m15533l();
                m13923t();
                throw th2;
            }
        }
        if (((i10 == true ? 1 : 0) & 32) == 32) {
            this.f39130i = Collections.unmodifiableList(this.f39130i);
        }
        if (((i10 == true ? 1 : 0) & 1024) == 1024) {
            this.f39117J = Collections.unmodifiableList(this.f39117J);
        }
        if (((i10 == true ? 1 : 0) & 256) == 256) {
            this.f39133l = Collections.unmodifiableList(this.f39133l);
        }
        if (((i10 == true ? 1 : 0) & 512) == 512) {
            this.f39115H = Collections.unmodifiableList(this.f39115H);
        }
        if (((i10 == true ? 1 : 0) & 4096) == 4096) {
            this.f39119L = Collections.unmodifiableList(this.f39119L);
        }
        try {
            codedOutputStreamM13901j.m13902i();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f39123b = bVar.m15533l();
            throw th4;
        }
        this.f39123b = bVar.m15533l();
        m13923t();
    }

    @Override // p282nn.InterfaceC7808f
    /* JADX INFO: renamed from: b */
    public final boolean mo13780b() {
        byte b10 = this.f39121N;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        int i10 = this.f39124c;
        if (!((i10 & 4) == 4)) {
            this.f39121N = (byte) 0;
            return false;
        }
        if (((i10 & 8) == 8) && !this.f39128g.mo13780b()) {
            this.f39121N = (byte) 0;
            return false;
        }
        for (int i11 = 0; i11 < this.f39130i.size(); i11++) {
            if (!this.f39130i.get(i11).mo13780b()) {
                this.f39121N = (byte) 0;
                return false;
            }
        }
        if (((this.f39124c & 32) == 32) && !this.f39131j.mo13780b()) {
            this.f39121N = (byte) 0;
            return false;
        }
        for (int i12 = 0; i12 < this.f39133l.size(); i12++) {
            if (!this.f39133l.get(i12).mo13780b()) {
                this.f39121N = (byte) 0;
                return false;
            }
        }
        for (int i13 = 0; i13 < this.f39117J.size(); i13++) {
            if (!this.f39117J.get(i13).mo13780b()) {
                this.f39121N = (byte) 0;
                return false;
            }
        }
        if (((this.f39124c & BuildConfig.SDK_TRUNCATE_LENGTH) == 128) && !this.f39118K.mo13780b()) {
            this.f39121N = (byte) 0;
            return false;
        }
        if (((this.f39124c & 256) == 256) && !this.f39120M.mo13780b()) {
            this.f39121N = (byte) 0;
            return false;
        }
        if (m13919n()) {
            this.f39121N = (byte) 1;
            return true;
        }
        this.f39121N = (byte) 0;
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC6997h
    /* JADX INFO: renamed from: c */
    public final InterfaceC6997h.a mo13781c() {
        C6931b c6931b = new C6931b();
        c6931b.m13823n(this);
        return c6931b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC6997h
    /* JADX INFO: renamed from: d */
    public final int mo13782d() {
        int i10 = this.f39122O;
        if (i10 != -1) {
            return i10;
        }
        int iM13894b = (this.f39124c & 2) == 2 ? CodedOutputStream.m13894b(1, this.f39126e) + 0 : 0;
        if ((this.f39124c & 4) == 4) {
            iM13894b += CodedOutputStream.m13894b(2, this.f39127f);
        }
        if ((this.f39124c & 8) == 8) {
            iM13894b += CodedOutputStream.m13896d(3, this.f39128g);
        }
        for (int i11 = 0; i11 < this.f39130i.size(); i11++) {
            iM13894b += CodedOutputStream.m13896d(4, this.f39130i.get(i11));
        }
        if ((this.f39124c & 32) == 32) {
            iM13894b += CodedOutputStream.m13896d(5, this.f39131j);
        }
        for (int i12 = 0; i12 < this.f39117J.size(); i12++) {
            iM13894b += CodedOutputStream.m13896d(6, this.f39117J.get(i12));
        }
        if ((this.f39124c & 16) == 16) {
            iM13894b += CodedOutputStream.m13894b(7, this.f39129h);
        }
        if ((this.f39124c & 64) == 64) {
            iM13894b += CodedOutputStream.m13894b(8, this.f39132k);
        }
        if ((this.f39124c & 1) == 1) {
            iM13894b += CodedOutputStream.m13894b(9, this.f39125d);
        }
        for (int i13 = 0; i13 < this.f39133l.size(); i13++) {
            iM13894b += CodedOutputStream.m13896d(10, this.f39133l.get(i13));
        }
        int iM13895c = 0;
        for (int i14 = 0; i14 < this.f39115H.size(); i14++) {
            iM13895c += CodedOutputStream.m13895c(this.f39115H.get(i14).intValue());
        }
        int iM13896d = iM13894b + iM13895c;
        if (!this.f39115H.isEmpty()) {
            iM13896d = iM13896d + 1 + CodedOutputStream.m13895c(iM13895c);
        }
        this.f39116I = iM13895c;
        if ((this.f39124c & BuildConfig.SDK_TRUNCATE_LENGTH) == 128) {
            iM13896d += CodedOutputStream.m13896d(30, this.f39118K);
        }
        int iM13895c2 = 0;
        for (int i15 = 0; i15 < this.f39119L.size(); i15++) {
            iM13895c2 += CodedOutputStream.m13895c(this.f39119L.get(i15).intValue());
        }
        int size = (this.f39119L.size() * 2) + iM13896d + iM13895c2;
        if ((this.f39124c & 256) == 256) {
            size += CodedOutputStream.m13896d(32, this.f39120M);
        }
        int size2 = this.f39123b.size() + m13920q() + size;
        this.f39122O = size2;
        return size2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC6997h
    /* JADX INFO: renamed from: e */
    public final InterfaceC6997h.a mo13783e() {
        return new C6931b();
    }

    @Override // p282nn.InterfaceC7808f
    /* JADX INFO: renamed from: h */
    public final InterfaceC6997h mo13802h() {
        return f39113P;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC6997h
    /* JADX INFO: renamed from: j */
    public final void mo13784j(CodedOutputStream codedOutputStream) throws IOException {
        mo13782d();
        GeneratedMessageLite.ExtendableMessage.C6980a c6980a = new GeneratedMessageLite.ExtendableMessage.C6980a(this);
        if ((this.f39124c & 2) == 2) {
            codedOutputStream.m13905m(1, this.f39126e);
        }
        if ((this.f39124c & 4) == 4) {
            codedOutputStream.m13905m(2, this.f39127f);
        }
        if ((this.f39124c & 8) == 8) {
            codedOutputStream.m13907o(3, this.f39128g);
        }
        for (int i10 = 0; i10 < this.f39130i.size(); i10++) {
            codedOutputStream.m13907o(4, this.f39130i.get(i10));
        }
        if ((this.f39124c & 32) == 32) {
            codedOutputStream.m13907o(5, this.f39131j);
        }
        for (int i11 = 0; i11 < this.f39117J.size(); i11++) {
            codedOutputStream.m13907o(6, this.f39117J.get(i11));
        }
        if ((this.f39124c & 16) == 16) {
            codedOutputStream.m13905m(7, this.f39129h);
        }
        if ((this.f39124c & 64) == 64) {
            codedOutputStream.m13905m(8, this.f39132k);
        }
        if ((this.f39124c & 1) == 1) {
            codedOutputStream.m13905m(9, this.f39125d);
        }
        for (int i12 = 0; i12 < this.f39133l.size(); i12++) {
            codedOutputStream.m13907o(10, this.f39133l.get(i12));
        }
        if (this.f39115H.size() > 0) {
            codedOutputStream.m13914v(90);
            codedOutputStream.m13914v(this.f39116I);
        }
        for (int i13 = 0; i13 < this.f39115H.size(); i13++) {
            codedOutputStream.m13906n(this.f39115H.get(i13).intValue());
        }
        if ((this.f39124c & BuildConfig.SDK_TRUNCATE_LENGTH) == 128) {
            codedOutputStream.m13907o(30, this.f39118K);
        }
        for (int i14 = 0; i14 < this.f39119L.size(); i14++) {
            codedOutputStream.m13905m(31, this.f39119L.get(i14).intValue());
        }
        if ((this.f39124c & 256) == 256) {
            codedOutputStream.m13907o(32, this.f39120M);
        }
        c6980a.m13927a(19000, codedOutputStream);
        codedOutputStream.m13910r(this.f39123b);
    }

    /* JADX INFO: renamed from: z */
    public final void m13821z() {
        this.f39125d = 6;
        this.f39126e = 6;
        this.f39127f = 0;
        ProtoBuf$Type protoBuf$Type = ProtoBuf$Type.f39246O;
        this.f39128g = protoBuf$Type;
        this.f39129h = 0;
        this.f39130i = Collections.emptyList();
        this.f39131j = protoBuf$Type;
        this.f39132k = 0;
        this.f39133l = Collections.emptyList();
        this.f39115H = Collections.emptyList();
        this.f39117J = Collections.emptyList();
        this.f39118K = ProtoBuf$TypeTable.f39341g;
        this.f39119L = Collections.emptyList();
        this.f39120M = ProtoBuf$Contract.f39060e;
    }
}
