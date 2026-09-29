package kotlin.reflect.jvm.internal.impl.metadata;

import java.io.IOException;
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
public final class ProtoBuf$EnumEntry extends GeneratedMessageLite.ExtendableMessage<ProtoBuf$EnumEntry> {

    /* JADX INFO: renamed from: g */
    public static final ProtoBuf$EnumEntry f39083g;

    /* JADX INFO: renamed from: h */
    public static final C6925a f39084h = new C6925a();

    /* JADX INFO: renamed from: b */
    public final AbstractC7803a f39085b;

    /* JADX INFO: renamed from: c */
    public int f39086c;

    /* JADX INFO: renamed from: d */
    public int f39087d;

    /* JADX INFO: renamed from: e */
    public byte f39088e;

    /* JADX INFO: renamed from: f */
    public int f39089f;

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$EnumEntry$a */
    public static class C6925a extends AbstractC6991b<ProtoBuf$EnumEntry> {
        @Override // p282nn.InterfaceC7809g
        /* JADX INFO: renamed from: a */
        public final Object mo13787a(C6992c c6992c, C6993d c6993d) throws InvalidProtocolBufferException {
            return new ProtoBuf$EnumEntry(c6992c, c6993d);
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$EnumEntry$b */
    public static final class C6926b extends GeneratedMessageLite.AbstractC6983c<ProtoBuf$EnumEntry, C6926b> {

        /* JADX INFO: renamed from: d */
        public int f39090d;

        /* JADX INFO: renamed from: e */
        public int f39091e;

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC6990a.a, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC6997h.a
        /* JADX INFO: renamed from: Q */
        public final /* bridge */ /* synthetic */ InterfaceC6997h.a mo13788Q(C6992c c6992c, C6993d c6993d) throws Throwable {
            m13817n(c6992c, c6993d);
            return this;
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC6997h.a
        /* JADX INFO: renamed from: a */
        public final InterfaceC6997h mo13789a() {
            ProtoBuf$EnumEntry protoBuf$EnumEntry = new ProtoBuf$EnumEntry(this);
            int i10 = 1;
            if ((this.f39090d & 1) != 1) {
                i10 = 0;
            }
            protoBuf$EnumEntry.f39087d = this.f39091e;
            protoBuf$EnumEntry.f39086c = i10;
            if (protoBuf$EnumEntry.mo13780b()) {
                return protoBuf$EnumEntry;
            }
            throw new UninitializedMessageException();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.AbstractC6982b
        public final Object clone() throws CloneNotSupportedException {
            C6926b c6926b = new C6926b();
            ProtoBuf$EnumEntry protoBuf$EnumEntry = new ProtoBuf$EnumEntry(this);
            int i10 = 1;
            if ((this.f39090d & 1) != 1) {
                i10 = 0;
            }
            protoBuf$EnumEntry.f39087d = this.f39091e;
            protoBuf$EnumEntry.f39086c = i10;
            c6926b.m13816m(protoBuf$EnumEntry);
            return c6926b;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC6990a.a
        /* JADX INFO: renamed from: f */
        public final /* bridge */ /* synthetic */ AbstractC6990a.a mo13788Q(C6992c c6992c, C6993d c6993d) throws Throwable {
            m13817n(c6992c, c6993d);
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.AbstractC6982b
        /* JADX INFO: renamed from: g */
        public final GeneratedMessageLite.AbstractC6982b clone() {
            C6926b c6926b = new C6926b();
            ProtoBuf$EnumEntry protoBuf$EnumEntry = new ProtoBuf$EnumEntry(this);
            int i10 = 1;
            if ((this.f39090d & 1) != 1) {
                i10 = 0;
            }
            protoBuf$EnumEntry.f39087d = this.f39091e;
            protoBuf$EnumEntry.f39086c = i10;
            c6926b.m13816m(protoBuf$EnumEntry);
            return c6926b;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.AbstractC6982b
        /* JADX INFO: renamed from: i */
        public final /* bridge */ /* synthetic */ GeneratedMessageLite.AbstractC6982b mo13792i(GeneratedMessageLite generatedMessageLite) {
            m13816m((ProtoBuf$EnumEntry) generatedMessageLite);
            return this;
        }

        /* JADX INFO: renamed from: m */
        public final void m13816m(ProtoBuf$EnumEntry protoBuf$EnumEntry) {
            if (protoBuf$EnumEntry == ProtoBuf$EnumEntry.f39083g) {
                return;
            }
            if ((protoBuf$EnumEntry.f39086c & 1) == 1) {
                int i10 = protoBuf$EnumEntry.f39087d;
                this.f39090d = 1 | this.f39090d;
                this.f39091e = i10;
            }
            m13928k(protoBuf$EnumEntry);
            this.f39493a = this.f39493a.m15519f(protoBuf$EnumEntry.f39085b);
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0021  */
        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* JADX INFO: renamed from: n */
        public final void m13817n(C6992c c6992c, C6993d c6993d) throws Throwable {
            ProtoBuf$EnumEntry protoBuf$EnumEntry;
            try {
                try {
                    ProtoBuf$EnumEntry.f39084h.getClass();
                    m13816m(new ProtoBuf$EnumEntry(c6992c, c6993d));
                } catch (InvalidProtocolBufferException e10) {
                    protoBuf$EnumEntry = (ProtoBuf$EnumEntry) e10.f39506a;
                    try {
                        throw e10;
                    } catch (Throwable th2) {
                        th = th2;
                        if (protoBuf$EnumEntry != null) {
                            m13816m(protoBuf$EnumEntry);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                protoBuf$EnumEntry = null;
                if (protoBuf$EnumEntry != null) {
                    m13816m(protoBuf$EnumEntry);
                }
                throw th;
            }
        }
    }

    static {
        ProtoBuf$EnumEntry protoBuf$EnumEntry = new ProtoBuf$EnumEntry(0);
        f39083g = protoBuf$EnumEntry;
        protoBuf$EnumEntry.f39087d = 0;
    }

    public ProtoBuf$EnumEntry() {
        throw null;
    }

    public ProtoBuf$EnumEntry(int i10) {
        this.f39088e = (byte) -1;
        this.f39089f = -1;
        this.f39085b = AbstractC7803a.f42882a;
    }

    public ProtoBuf$EnumEntry(GeneratedMessageLite.AbstractC6983c abstractC6983c) {
        super(abstractC6983c);
        this.f39088e = (byte) -1;
        this.f39089f = -1;
        this.f39085b = abstractC6983c.f39493a;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    public ProtoBuf$EnumEntry(C6992c c6992c, C6993d c6993d) throws InvalidProtocolBufferException {
        this.f39088e = (byte) -1;
        this.f39089f = -1;
        boolean z10 = false;
        this.f39087d = 0;
        AbstractC7803a.b bVar = new AbstractC7803a.b();
        CodedOutputStream codedOutputStreamM13901j = CodedOutputStream.m13901j(bVar, 1);
        while (!z10) {
            try {
                try {
                    try {
                        int iM13952n = c6992c.m13952n();
                        if (iM13952n != 0) {
                            if (iM13952n == 8) {
                                this.f39086c |= 1;
                                this.f39087d = c6992c.m13949k();
                            } else if (!m13925x(c6992c, codedOutputStreamM13901j, c6993d, iM13952n)) {
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
            } catch (Throwable th2) {
                try {
                    codedOutputStreamM13901j.m13902i();
                } catch (IOException unused) {
                } catch (Throwable th3) {
                    this.f39085b = bVar.m15533l();
                    throw th3;
                }
                this.f39085b = bVar.m15533l();
                m13923t();
                throw th2;
            }
        }
        try {
            codedOutputStreamM13901j.m13902i();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f39085b = bVar.m15533l();
            throw th4;
        }
        this.f39085b = bVar.m15533l();
        m13923t();
    }

    @Override // p282nn.InterfaceC7808f
    /* JADX INFO: renamed from: b */
    public final boolean mo13780b() {
        byte b10 = this.f39088e;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        if (m13919n()) {
            this.f39088e = (byte) 1;
            return true;
        }
        this.f39088e = (byte) 0;
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC6997h
    /* JADX INFO: renamed from: c */
    public final InterfaceC6997h.a mo13781c() {
        C6926b c6926b = new C6926b();
        c6926b.m13816m(this);
        return c6926b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC6997h
    /* JADX INFO: renamed from: d */
    public final int mo13782d() {
        int i10 = this.f39089f;
        if (i10 != -1) {
            return i10;
        }
        int iM13894b = 0;
        if ((this.f39086c & 1) == 1) {
            iM13894b = 0 + CodedOutputStream.m13894b(1, this.f39087d);
        }
        int size = this.f39085b.size() + m13920q() + iM13894b;
        this.f39089f = size;
        return size;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC6997h
    /* JADX INFO: renamed from: e */
    public final InterfaceC6997h.a mo13783e() {
        return new C6926b();
    }

    @Override // p282nn.InterfaceC7808f
    /* JADX INFO: renamed from: h */
    public final InterfaceC6997h mo13802h() {
        return f39083g;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC6997h
    /* JADX INFO: renamed from: j */
    public final void mo13784j(CodedOutputStream codedOutputStream) throws IOException {
        mo13782d();
        GeneratedMessageLite.ExtendableMessage<MessageType>.C6980a c6980aM13924w = m13924w();
        if ((this.f39086c & 1) == 1) {
            codedOutputStream.m13905m(1, this.f39087d);
        }
        c6980aM13924w.m13927a(200, codedOutputStream);
        codedOutputStream.m13910r(this.f39085b);
    }
}
