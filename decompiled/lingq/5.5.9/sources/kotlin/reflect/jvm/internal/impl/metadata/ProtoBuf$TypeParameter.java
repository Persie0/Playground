package kotlin.reflect.jvm.internal.impl.metadata;

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
public final class ProtoBuf$TypeParameter extends GeneratedMessageLite.ExtendableMessage<ProtoBuf$TypeParameter> {

    /* JADX INFO: renamed from: H */
    public static final ProtoBuf$TypeParameter f39320H;

    /* JADX INFO: renamed from: I */
    public static final C6955a f39321I = new C6955a();

    /* JADX INFO: renamed from: b */
    public final AbstractC7803a f39322b;

    /* JADX INFO: renamed from: c */
    public int f39323c;

    /* JADX INFO: renamed from: d */
    public int f39324d;

    /* JADX INFO: renamed from: e */
    public int f39325e;

    /* JADX INFO: renamed from: f */
    public boolean f39326f;

    /* JADX INFO: renamed from: g */
    public Variance f39327g;

    /* JADX INFO: renamed from: h */
    public List<ProtoBuf$Type> f39328h;

    /* JADX INFO: renamed from: i */
    public List<Integer> f39329i;

    /* JADX INFO: renamed from: j */
    public int f39330j;

    /* JADX INFO: renamed from: k */
    public byte f39331k;

    /* JADX INFO: renamed from: l */
    public int f39332l;

    public enum Variance implements C6995f.a {
        IN(0, 0),
        OUT(1, 1),
        INV(2, 2);

        private static C6995f.b<Variance> internalValueMap = new C6954a();
        private final int value;

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter$Variance$a */
        public static class C6954a implements C6995f.b<Variance> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.C6995f.b
            /* JADX INFO: renamed from: a */
            public final C6995f.a mo13786a(int i10) {
                return Variance.valueOf(i10);
            }
        }

        Variance(int i10, int i11) {
            this.value = i11;
        }

        public static Variance valueOf(int i10) {
            if (i10 == 0) {
                return IN;
            }
            if (i10 == 1) {
                return OUT;
            }
            if (i10 != 2) {
                return null;
            }
            return INV;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.C6995f.a
        public final int getNumber() {
            return this.value;
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter$a */
    public static class C6955a extends AbstractC6991b<ProtoBuf$TypeParameter> {
        @Override // p282nn.InterfaceC7809g
        /* JADX INFO: renamed from: a */
        public final Object mo13787a(C6992c c6992c, C6993d c6993d) throws InvalidProtocolBufferException {
            return new ProtoBuf$TypeParameter(c6992c, c6993d);
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter$b */
    public static final class C6956b extends GeneratedMessageLite.AbstractC6983c<ProtoBuf$TypeParameter, C6956b> {

        /* JADX INFO: renamed from: d */
        public int f39334d;

        /* JADX INFO: renamed from: e */
        public int f39335e;

        /* JADX INFO: renamed from: f */
        public int f39336f;

        /* JADX INFO: renamed from: g */
        public boolean f39337g;

        /* JADX INFO: renamed from: h */
        public Variance f39338h = Variance.INV;

        /* JADX INFO: renamed from: i */
        public List<ProtoBuf$Type> f39339i = Collections.emptyList();

        /* JADX INFO: renamed from: j */
        public List<Integer> f39340j = Collections.emptyList();

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC6990a.a, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC6997h.a
        /* JADX INFO: renamed from: Q */
        public final /* bridge */ /* synthetic */ InterfaceC6997h.a mo13788Q(C6992c c6992c, C6993d c6993d) throws Throwable {
            m13860o(c6992c, c6993d);
            return this;
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC6997h.a
        /* JADX INFO: renamed from: a */
        public final InterfaceC6997h mo13789a() {
            ProtoBuf$TypeParameter protoBuf$TypeParameterM13858m = m13858m();
            if (protoBuf$TypeParameterM13858m.mo13780b()) {
                return protoBuf$TypeParameterM13858m;
            }
            throw new UninitializedMessageException();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.AbstractC6982b
        public final Object clone() throws CloneNotSupportedException {
            C6956b c6956b = new C6956b();
            c6956b.m13859n(m13858m());
            return c6956b;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC6990a.a
        /* JADX INFO: renamed from: f */
        public final /* bridge */ /* synthetic */ AbstractC6990a.a mo13788Q(C6992c c6992c, C6993d c6993d) throws Throwable {
            m13860o(c6992c, c6993d);
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.AbstractC6982b
        /* JADX INFO: renamed from: g */
        public final GeneratedMessageLite.AbstractC6982b clone() {
            C6956b c6956b = new C6956b();
            c6956b.m13859n(m13858m());
            return c6956b;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.AbstractC6982b
        /* JADX INFO: renamed from: i */
        public final /* bridge */ /* synthetic */ GeneratedMessageLite.AbstractC6982b mo13792i(GeneratedMessageLite generatedMessageLite) {
            m13859n((ProtoBuf$TypeParameter) generatedMessageLite);
            return this;
        }

        /* JADX INFO: renamed from: m */
        public final ProtoBuf$TypeParameter m13858m() {
            ProtoBuf$TypeParameter protoBuf$TypeParameter = new ProtoBuf$TypeParameter(this);
            int i10 = this.f39334d;
            int i11 = (i10 & 1) != 1 ? 0 : 1;
            protoBuf$TypeParameter.f39324d = this.f39335e;
            if ((i10 & 2) == 2) {
                i11 |= 2;
            }
            protoBuf$TypeParameter.f39325e = this.f39336f;
            if ((i10 & 4) == 4) {
                i11 |= 4;
            }
            protoBuf$TypeParameter.f39326f = this.f39337g;
            if ((i10 & 8) == 8) {
                i11 |= 8;
            }
            protoBuf$TypeParameter.f39327g = this.f39338h;
            if ((i10 & 16) == 16) {
                this.f39339i = Collections.unmodifiableList(this.f39339i);
                this.f39334d &= -17;
            }
            protoBuf$TypeParameter.f39328h = this.f39339i;
            if ((this.f39334d & 32) == 32) {
                this.f39340j = Collections.unmodifiableList(this.f39340j);
                this.f39334d &= -33;
            }
            protoBuf$TypeParameter.f39329i = this.f39340j;
            protoBuf$TypeParameter.f39323c = i11;
            return protoBuf$TypeParameter;
        }

        /* JADX INFO: renamed from: n */
        public final void m13859n(ProtoBuf$TypeParameter protoBuf$TypeParameter) {
            if (protoBuf$TypeParameter == ProtoBuf$TypeParameter.f39320H) {
                return;
            }
            int i10 = protoBuf$TypeParameter.f39323c;
            if ((i10 & 1) == 1) {
                int i11 = protoBuf$TypeParameter.f39324d;
                this.f39334d |= 1;
                this.f39335e = i11;
            }
            if ((i10 & 2) == 2) {
                int i12 = protoBuf$TypeParameter.f39325e;
                this.f39334d = 2 | this.f39334d;
                this.f39336f = i12;
            }
            if ((i10 & 4) == 4) {
                boolean z10 = protoBuf$TypeParameter.f39326f;
                this.f39334d = 4 | this.f39334d;
                this.f39337g = z10;
            }
            if ((i10 & 8) == 8) {
                Variance variance = protoBuf$TypeParameter.f39327g;
                variance.getClass();
                this.f39334d = 8 | this.f39334d;
                this.f39338h = variance;
            }
            if (!protoBuf$TypeParameter.f39328h.isEmpty()) {
                if (this.f39339i.isEmpty()) {
                    this.f39339i = protoBuf$TypeParameter.f39328h;
                    this.f39334d &= -17;
                } else {
                    if ((this.f39334d & 16) != 16) {
                        this.f39339i = new ArrayList(this.f39339i);
                        this.f39334d |= 16;
                    }
                    this.f39339i.addAll(protoBuf$TypeParameter.f39328h);
                }
            }
            if (!protoBuf$TypeParameter.f39329i.isEmpty()) {
                if (this.f39340j.isEmpty()) {
                    this.f39340j = protoBuf$TypeParameter.f39329i;
                    this.f39334d &= -33;
                } else {
                    if ((this.f39334d & 32) != 32) {
                        this.f39340j = new ArrayList(this.f39340j);
                        this.f39334d |= 32;
                    }
                    this.f39340j.addAll(protoBuf$TypeParameter.f39329i);
                }
            }
            m13928k(protoBuf$TypeParameter);
            this.f39493a = this.f39493a.m15519f(protoBuf$TypeParameter.f39322b);
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0022  */
        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* JADX INFO: renamed from: o */
        public final void m13860o(C6992c c6992c, C6993d c6993d) throws Throwable {
            ProtoBuf$TypeParameter protoBuf$TypeParameter;
            try {
                try {
                    ProtoBuf$TypeParameter.f39321I.getClass();
                    m13859n(new ProtoBuf$TypeParameter(c6992c, c6993d));
                } catch (InvalidProtocolBufferException e10) {
                    protoBuf$TypeParameter = (ProtoBuf$TypeParameter) e10.f39506a;
                    try {
                        throw e10;
                    } catch (Throwable th2) {
                        th = th2;
                        if (protoBuf$TypeParameter != null) {
                            m13859n(protoBuf$TypeParameter);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                protoBuf$TypeParameter = null;
                if (protoBuf$TypeParameter != null) {
                    m13859n(protoBuf$TypeParameter);
                }
                throw th;
            }
        }
    }

    static {
        ProtoBuf$TypeParameter protoBuf$TypeParameter = new ProtoBuf$TypeParameter(0);
        f39320H = protoBuf$TypeParameter;
        protoBuf$TypeParameter.f39324d = 0;
        protoBuf$TypeParameter.f39325e = 0;
        protoBuf$TypeParameter.f39326f = false;
        protoBuf$TypeParameter.f39327g = Variance.INV;
        protoBuf$TypeParameter.f39328h = Collections.emptyList();
        protoBuf$TypeParameter.f39329i = Collections.emptyList();
    }

    public ProtoBuf$TypeParameter() {
        throw null;
    }

    public ProtoBuf$TypeParameter(int i10) {
        this.f39330j = -1;
        this.f39331k = (byte) -1;
        this.f39332l = -1;
        this.f39322b = AbstractC7803a.f42882a;
    }

    public ProtoBuf$TypeParameter(GeneratedMessageLite.AbstractC6983c abstractC6983c) {
        super(abstractC6983c);
        this.f39330j = -1;
        this.f39331k = (byte) -1;
        this.f39332l = -1;
        this.f39322b = abstractC6983c.f39493a;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public ProtoBuf$TypeParameter(C6992c c6992c, C6993d c6993d) throws InvalidProtocolBufferException {
        this.f39330j = -1;
        this.f39331k = (byte) -1;
        this.f39332l = -1;
        this.f39324d = 0;
        this.f39325e = 0;
        this.f39326f = false;
        this.f39327g = Variance.INV;
        this.f39328h = Collections.emptyList();
        this.f39329i = Collections.emptyList();
        AbstractC7803a.b bVar = new AbstractC7803a.b();
        CodedOutputStream codedOutputStreamM13901j = CodedOutputStream.m13901j(bVar, 1);
        boolean z10 = false;
        int i10 = 0;
        while (!z10) {
            try {
                try {
                    int iM13952n = c6992c.m13952n();
                    if (iM13952n != 0) {
                        if (iM13952n == 8) {
                            this.f39323c |= 1;
                            this.f39324d = c6992c.m13949k();
                        } else if (iM13952n == 16) {
                            this.f39323c |= 2;
                            this.f39325e = c6992c.m13949k();
                        } else if (iM13952n == 24) {
                            this.f39323c |= 4;
                            this.f39326f = c6992c.m13950l() != 0;
                        } else if (iM13952n == 32) {
                            int iM13949k = c6992c.m13949k();
                            Variance varianceValueOf = Variance.valueOf(iM13949k);
                            if (varianceValueOf == null) {
                                codedOutputStreamM13901j.m13914v(iM13952n);
                                codedOutputStreamM13901j.m13914v(iM13949k);
                            } else {
                                this.f39323c |= 8;
                                this.f39327g = varianceValueOf;
                            }
                        } else if (iM13952n == 42) {
                            if ((i10 & 16) != 16) {
                                this.f39328h = new ArrayList();
                                i10 |= 16;
                            }
                            this.f39328h.add((ProtoBuf$Type) c6992c.m13945g(ProtoBuf$Type.f39247P, c6993d));
                        } else if (iM13952n == 48) {
                            if ((i10 & 32) != 32) {
                                this.f39329i = new ArrayList();
                                i10 |= 32;
                            }
                            this.f39329i.add(Integer.valueOf(c6992c.m13949k()));
                        } else if (iM13952n == 50) {
                            int iM13942d = c6992c.m13942d(c6992c.m13949k());
                            if ((i10 & 32) != 32 && c6992c.m13940b() > 0) {
                                this.f39329i = new ArrayList();
                                i10 |= 32;
                            }
                            while (c6992c.m13940b() > 0) {
                                this.f39329i.add(Integer.valueOf(c6992c.m13949k()));
                            }
                            c6992c.m13941c(iM13942d);
                        } else if (!m13925x(c6992c, codedOutputStreamM13901j, c6993d, iM13952n)) {
                        }
                    }
                    z10 = true;
                } catch (Throwable th2) {
                    if ((i10 & 16) == 16) {
                        this.f39328h = Collections.unmodifiableList(this.f39328h);
                    }
                    if ((i10 & 32) == 32) {
                        this.f39329i = Collections.unmodifiableList(this.f39329i);
                    }
                    try {
                        codedOutputStreamM13901j.m13902i();
                    } catch (IOException unused) {
                    } catch (Throwable th3) {
                        this.f39322b = bVar.m15533l();
                        throw th3;
                    }
                    this.f39322b = bVar.m15533l();
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
        if ((i10 & 16) == 16) {
            this.f39328h = Collections.unmodifiableList(this.f39328h);
        }
        if ((i10 & 32) == 32) {
            this.f39329i = Collections.unmodifiableList(this.f39329i);
        }
        try {
            codedOutputStreamM13901j.m13902i();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f39322b = bVar.m15533l();
            throw th4;
        }
        this.f39322b = bVar.m15533l();
        m13923t();
    }

    @Override // p282nn.InterfaceC7808f
    /* JADX INFO: renamed from: b */
    public final boolean mo13780b() {
        byte b10 = this.f39331k;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        int i10 = this.f39323c;
        if (!((i10 & 1) == 1)) {
            this.f39331k = (byte) 0;
            return false;
        }
        if (!((i10 & 2) == 2)) {
            this.f39331k = (byte) 0;
            return false;
        }
        for (int i11 = 0; i11 < this.f39328h.size(); i11++) {
            if (!this.f39328h.get(i11).mo13780b()) {
                this.f39331k = (byte) 0;
                return false;
            }
        }
        if (m13919n()) {
            this.f39331k = (byte) 1;
            return true;
        }
        this.f39331k = (byte) 0;
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC6997h
    /* JADX INFO: renamed from: c */
    public final InterfaceC6997h.a mo13781c() {
        C6956b c6956b = new C6956b();
        c6956b.m13859n(this);
        return c6956b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC6997h
    /* JADX INFO: renamed from: d */
    public final int mo13782d() {
        int i10 = this.f39332l;
        if (i10 != -1) {
            return i10;
        }
        int iM13894b = (this.f39323c & 1) == 1 ? CodedOutputStream.m13894b(1, this.f39324d) + 0 : 0;
        if ((this.f39323c & 2) == 2) {
            iM13894b += CodedOutputStream.m13894b(2, this.f39325e);
        }
        if ((this.f39323c & 4) == 4) {
            iM13894b += CodedOutputStream.m13900h(3) + 1;
        }
        if ((this.f39323c & 8) == 8) {
            iM13894b += CodedOutputStream.m13893a(4, this.f39327g.getNumber());
        }
        for (int i11 = 0; i11 < this.f39328h.size(); i11++) {
            iM13894b += CodedOutputStream.m13896d(5, this.f39328h.get(i11));
        }
        int iM13895c = 0;
        for (int i12 = 0; i12 < this.f39329i.size(); i12++) {
            iM13895c += CodedOutputStream.m13895c(this.f39329i.get(i12).intValue());
        }
        int iM13895c2 = iM13894b + iM13895c;
        if (!this.f39329i.isEmpty()) {
            iM13895c2 = iM13895c2 + 1 + CodedOutputStream.m13895c(iM13895c);
        }
        this.f39330j = iM13895c;
        int size = this.f39322b.size() + m13920q() + iM13895c2;
        this.f39332l = size;
        return size;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC6997h
    /* JADX INFO: renamed from: e */
    public final InterfaceC6997h.a mo13783e() {
        return new C6956b();
    }

    @Override // p282nn.InterfaceC7808f
    /* JADX INFO: renamed from: h */
    public final InterfaceC6997h mo13802h() {
        return f39320H;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC6997h
    /* JADX INFO: renamed from: j */
    public final void mo13784j(CodedOutputStream codedOutputStream) throws IOException {
        mo13782d();
        GeneratedMessageLite.ExtendableMessage.C6980a c6980a = new GeneratedMessageLite.ExtendableMessage.C6980a(this);
        if ((this.f39323c & 1) == 1) {
            codedOutputStream.m13905m(1, this.f39324d);
        }
        if ((this.f39323c & 2) == 2) {
            codedOutputStream.m13905m(2, this.f39325e);
        }
        if ((this.f39323c & 4) == 4) {
            boolean z10 = this.f39326f;
            codedOutputStream.m13916x(3, 0);
            codedOutputStream.m13909q(z10 ? 1 : 0);
        }
        if ((this.f39323c & 8) == 8) {
            codedOutputStream.m13904l(4, this.f39327g.getNumber());
        }
        for (int i10 = 0; i10 < this.f39328h.size(); i10++) {
            codedOutputStream.m13907o(5, this.f39328h.get(i10));
        }
        if (this.f39329i.size() > 0) {
            codedOutputStream.m13914v(50);
            codedOutputStream.m13914v(this.f39330j);
        }
        for (int i11 = 0; i11 < this.f39329i.size(); i11++) {
            codedOutputStream.m13906n(this.f39329i.get(i11).intValue());
        }
        c6980a.m13927a(1000, codedOutputStream);
        codedOutputStream.m13910r(this.f39322b);
    }
}
