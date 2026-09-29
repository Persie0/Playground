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
import p282nn.InterfaceC7808f;

/* JADX INFO: loaded from: classes2.dex */
public final class ProtoBuf$QualifiedNameTable extends GeneratedMessageLite implements InterfaceC7808f {

    /* JADX INFO: renamed from: e */
    public static final ProtoBuf$QualifiedNameTable f39217e;

    /* JADX INFO: renamed from: f */
    public static final C6943a f39218f = new C6943a();

    /* JADX INFO: renamed from: a */
    public final AbstractC7803a f39219a;

    /* JADX INFO: renamed from: b */
    public List<QualifiedName> f39220b;

    /* JADX INFO: renamed from: c */
    public byte f39221c;

    /* JADX INFO: renamed from: d */
    public int f39222d;

    public static final class QualifiedName extends GeneratedMessageLite implements InterfaceC7808f {

        /* JADX INFO: renamed from: h */
        public static final QualifiedName f39223h;

        /* JADX INFO: renamed from: i */
        public static final C6941a f39224i = new C6941a();

        /* JADX INFO: renamed from: a */
        public final AbstractC7803a f39225a;

        /* JADX INFO: renamed from: b */
        public int f39226b;

        /* JADX INFO: renamed from: c */
        public int f39227c;

        /* JADX INFO: renamed from: d */
        public int f39228d;

        /* JADX INFO: renamed from: e */
        public Kind f39229e;

        /* JADX INFO: renamed from: f */
        public byte f39230f;

        /* JADX INFO: renamed from: g */
        public int f39231g;

        public enum Kind implements C6995f.a {
            CLASS(0, 0),
            PACKAGE(1, 1),
            LOCAL(2, 2);

            private static C6995f.b<Kind> internalValueMap = new C6940a();
            private final int value;

            /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$QualifiedNameTable$QualifiedName$Kind$a */
            public static class C6940a implements C6995f.b<Kind> {
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
                if (i10 == 0) {
                    return CLASS;
                }
                if (i10 == 1) {
                    return PACKAGE;
                }
                if (i10 != 2) {
                    return null;
                }
                return LOCAL;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.C6995f.a
            public final int getNumber() {
                return this.value;
            }
        }

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$QualifiedNameTable$QualifiedName$a */
        public static class C6941a extends AbstractC6991b<QualifiedName> {
            @Override // p282nn.InterfaceC7809g
            /* JADX INFO: renamed from: a */
            public final Object mo13787a(C6992c c6992c, C6993d c6993d) throws InvalidProtocolBufferException {
                return new QualifiedName(c6992c);
            }
        }

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$QualifiedNameTable$QualifiedName$b */
        public static final class C6942b extends GeneratedMessageLite.AbstractC6982b<QualifiedName, C6942b> implements InterfaceC7808f {

            /* JADX INFO: renamed from: b */
            public int f39232b;

            /* JADX INFO: renamed from: d */
            public int f39234d;

            /* JADX INFO: renamed from: c */
            public int f39233c = -1;

            /* JADX INFO: renamed from: e */
            public Kind f39235e = Kind.PACKAGE;

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC6990a.a, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC6997h.a
            /* JADX INFO: renamed from: Q */
            public final /* bridge */ /* synthetic */ InterfaceC6997h.a mo13788Q(C6992c c6992c, C6993d c6993d) throws Throwable {
                m13837n(c6992c, c6993d);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC6997h.a
            /* JADX INFO: renamed from: a */
            public final InterfaceC6997h mo13789a() {
                QualifiedName qualifiedNameM13835k = m13835k();
                if (qualifiedNameM13835k.mo13780b()) {
                    return qualifiedNameM13835k;
                }
                throw new UninitializedMessageException();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.AbstractC6982b
            public final Object clone() throws CloneNotSupportedException {
                C6942b c6942b = new C6942b();
                c6942b.m13836m(m13835k());
                return c6942b;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC6990a.a
            /* JADX INFO: renamed from: f */
            public final /* bridge */ /* synthetic */ AbstractC6990a.a mo13788Q(C6992c c6992c, C6993d c6993d) throws Throwable {
                m13837n(c6992c, c6993d);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.AbstractC6982b
            /* JADX INFO: renamed from: g */
            public final GeneratedMessageLite.AbstractC6982b clone() {
                C6942b c6942b = new C6942b();
                c6942b.m13836m(m13835k());
                return c6942b;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.AbstractC6982b
            /* JADX INFO: renamed from: i */
            public final /* bridge */ /* synthetic */ GeneratedMessageLite.AbstractC6982b mo13792i(GeneratedMessageLite generatedMessageLite) {
                m13836m((QualifiedName) generatedMessageLite);
                return this;
            }

            /* JADX INFO: renamed from: k */
            public final QualifiedName m13835k() {
                QualifiedName qualifiedName = new QualifiedName(this);
                int i10 = this.f39232b;
                int i11 = (i10 & 1) != 1 ? 0 : 1;
                qualifiedName.f39227c = this.f39233c;
                if ((i10 & 2) == 2) {
                    i11 |= 2;
                }
                qualifiedName.f39228d = this.f39234d;
                if ((i10 & 4) == 4) {
                    i11 |= 4;
                }
                qualifiedName.f39229e = this.f39235e;
                qualifiedName.f39226b = i11;
                return qualifiedName;
            }

            /* JADX INFO: renamed from: m */
            public final void m13836m(QualifiedName qualifiedName) {
                if (qualifiedName == QualifiedName.f39223h) {
                    return;
                }
                int i10 = qualifiedName.f39226b;
                if ((i10 & 1) == 1) {
                    int i11 = qualifiedName.f39227c;
                    this.f39232b |= 1;
                    this.f39233c = i11;
                }
                if ((i10 & 2) == 2) {
                    int i12 = qualifiedName.f39228d;
                    this.f39232b = 2 | this.f39232b;
                    this.f39234d = i12;
                }
                if ((i10 & 4) == 4) {
                    Kind kind = qualifiedName.f39229e;
                    kind.getClass();
                    this.f39232b = 4 | this.f39232b;
                    this.f39235e = kind;
                }
                this.f39493a = this.f39493a.m15519f(qualifiedName.f39225a);
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001e  */
            /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
            /* JADX INFO: renamed from: n */
            public final void m13837n(C6992c c6992c, C6993d c6993d) throws Throwable {
                QualifiedName qualifiedName;
                try {
                    try {
                        QualifiedName.f39224i.getClass();
                        m13836m(new QualifiedName(c6992c));
                    } catch (Throwable th2) {
                        th = th2;
                        qualifiedName = null;
                        if (qualifiedName != null) {
                            m13836m(qualifiedName);
                        }
                        throw th;
                    }
                } catch (InvalidProtocolBufferException e10) {
                    qualifiedName = (QualifiedName) e10.f39506a;
                    try {
                        throw e10;
                    } catch (Throwable th3) {
                        th = th3;
                        if (qualifiedName != null) {
                            m13836m(qualifiedName);
                        }
                        throw th;
                    }
                }
            }
        }

        static {
            QualifiedName qualifiedName = new QualifiedName();
            f39223h = qualifiedName;
            qualifiedName.f39227c = -1;
            qualifiedName.f39228d = 0;
            qualifiedName.f39229e = Kind.PACKAGE;
        }

        public QualifiedName() {
            this.f39230f = (byte) -1;
            this.f39231g = -1;
            this.f39225a = AbstractC7803a.f42882a;
        }

        public QualifiedName(GeneratedMessageLite.AbstractC6982b abstractC6982b) {
            super(0);
            this.f39230f = (byte) -1;
            this.f39231g = -1;
            this.f39225a = abstractC6982b.f39493a;
        }

        /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
        public QualifiedName(C6992c c6992c) throws InvalidProtocolBufferException {
            this.f39230f = (byte) -1;
            this.f39231g = -1;
            this.f39227c = -1;
            boolean z10 = false;
            this.f39228d = 0;
            this.f39229e = Kind.PACKAGE;
            AbstractC7803a.b bVar = new AbstractC7803a.b();
            CodedOutputStream codedOutputStreamM13901j = CodedOutputStream.m13901j(bVar, 1);
            while (!z10) {
                try {
                    try {
                        try {
                            int iM13952n = c6992c.m13952n();
                            if (iM13952n != 0) {
                                if (iM13952n == 8) {
                                    this.f39226b |= 1;
                                    this.f39227c = c6992c.m13949k();
                                } else if (iM13952n == 16) {
                                    this.f39226b |= 2;
                                    this.f39228d = c6992c.m13949k();
                                } else if (iM13952n == 24) {
                                    int iM13949k = c6992c.m13949k();
                                    Kind kindValueOf = Kind.valueOf(iM13949k);
                                    if (kindValueOf == null) {
                                        codedOutputStreamM13901j.m13914v(iM13952n);
                                        codedOutputStreamM13901j.m13914v(iM13949k);
                                    } else {
                                        this.f39226b |= 4;
                                        this.f39229e = kindValueOf;
                                    }
                                } else if (!c6992c.m13955q(iM13952n, codedOutputStreamM13901j)) {
                                }
                            }
                            z10 = true;
                        } catch (IOException e10) {
                            InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e10.getMessage());
                            invalidProtocolBufferException.f39506a = this;
                            throw invalidProtocolBufferException;
                        }
                    } catch (InvalidProtocolBufferException e11) {
                        e11.f39506a = this;
                        throw e11;
                    }
                } catch (Throwable th2) {
                    try {
                        codedOutputStreamM13901j.m13902i();
                    } catch (IOException unused) {
                    } catch (Throwable th3) {
                        this.f39225a = bVar.m15533l();
                        throw th3;
                    }
                    this.f39225a = bVar.m15533l();
                    throw th2;
                }
            }
            try {
                codedOutputStreamM13901j.m13902i();
            } catch (IOException unused2) {
            } catch (Throwable th4) {
                this.f39225a = bVar.m15533l();
                throw th4;
            }
            this.f39225a = bVar.m15533l();
        }

        @Override // p282nn.InterfaceC7808f
        /* JADX INFO: renamed from: b */
        public final boolean mo13780b() {
            byte b10 = this.f39230f;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            if ((this.f39226b & 2) == 2) {
                this.f39230f = (byte) 1;
                return true;
            }
            this.f39230f = (byte) 0;
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC6997h
        /* JADX INFO: renamed from: c */
        public final InterfaceC6997h.a mo13781c() {
            C6942b c6942b = new C6942b();
            c6942b.m13836m(this);
            return c6942b;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC6997h
        /* JADX INFO: renamed from: d */
        public final int mo13782d() {
            int i10 = this.f39231g;
            if (i10 != -1) {
                return i10;
            }
            int iM13894b = (this.f39226b & 1) == 1 ? 0 + CodedOutputStream.m13894b(1, this.f39227c) : 0;
            if ((this.f39226b & 2) == 2) {
                iM13894b += CodedOutputStream.m13894b(2, this.f39228d);
            }
            if ((this.f39226b & 4) == 4) {
                iM13894b += CodedOutputStream.m13893a(3, this.f39229e.getNumber());
            }
            int size = this.f39225a.size() + iM13894b;
            this.f39231g = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC6997h
        /* JADX INFO: renamed from: e */
        public final InterfaceC6997h.a mo13783e() {
            return new C6942b();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC6997h
        /* JADX INFO: renamed from: j */
        public final void mo13784j(CodedOutputStream codedOutputStream) throws IOException {
            mo13782d();
            if ((this.f39226b & 1) == 1) {
                codedOutputStream.m13905m(1, this.f39227c);
            }
            if ((this.f39226b & 2) == 2) {
                codedOutputStream.m13905m(2, this.f39228d);
            }
            if ((this.f39226b & 4) == 4) {
                codedOutputStream.m13904l(3, this.f39229e.getNumber());
            }
            codedOutputStream.m13910r(this.f39225a);
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$QualifiedNameTable$a */
    public static class C6943a extends AbstractC6991b<ProtoBuf$QualifiedNameTable> {
        @Override // p282nn.InterfaceC7809g
        /* JADX INFO: renamed from: a */
        public final Object mo13787a(C6992c c6992c, C6993d c6993d) throws InvalidProtocolBufferException {
            return new ProtoBuf$QualifiedNameTable(c6992c, c6993d);
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$QualifiedNameTable$b */
    public static final class C6944b extends GeneratedMessageLite.AbstractC6982b<ProtoBuf$QualifiedNameTable, C6944b> implements InterfaceC7808f {

        /* JADX INFO: renamed from: b */
        public int f39236b;

        /* JADX INFO: renamed from: c */
        public List<QualifiedName> f39237c = Collections.emptyList();

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC6990a.a, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC6997h.a
        /* JADX INFO: renamed from: Q */
        public final /* bridge */ /* synthetic */ InterfaceC6997h.a mo13788Q(C6992c c6992c, C6993d c6993d) throws Throwable {
            m13840n(c6992c, c6993d);
            return this;
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC6997h.a
        /* JADX INFO: renamed from: a */
        public final InterfaceC6997h mo13789a() {
            ProtoBuf$QualifiedNameTable protoBuf$QualifiedNameTableM13838k = m13838k();
            if (protoBuf$QualifiedNameTableM13838k.mo13780b()) {
                return protoBuf$QualifiedNameTableM13838k;
            }
            throw new UninitializedMessageException();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.AbstractC6982b
        public final Object clone() throws CloneNotSupportedException {
            C6944b c6944b = new C6944b();
            c6944b.m13839m(m13838k());
            return c6944b;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC6990a.a
        /* JADX INFO: renamed from: f */
        public final /* bridge */ /* synthetic */ AbstractC6990a.a mo13788Q(C6992c c6992c, C6993d c6993d) throws Throwable {
            m13840n(c6992c, c6993d);
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.AbstractC6982b
        /* JADX INFO: renamed from: g */
        public final GeneratedMessageLite.AbstractC6982b clone() {
            C6944b c6944b = new C6944b();
            c6944b.m13839m(m13838k());
            return c6944b;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.AbstractC6982b
        /* JADX INFO: renamed from: i */
        public final /* bridge */ /* synthetic */ GeneratedMessageLite.AbstractC6982b mo13792i(GeneratedMessageLite generatedMessageLite) {
            m13839m((ProtoBuf$QualifiedNameTable) generatedMessageLite);
            return this;
        }

        /* JADX INFO: renamed from: k */
        public final ProtoBuf$QualifiedNameTable m13838k() {
            ProtoBuf$QualifiedNameTable protoBuf$QualifiedNameTable = new ProtoBuf$QualifiedNameTable(this);
            if ((this.f39236b & 1) == 1) {
                this.f39237c = Collections.unmodifiableList(this.f39237c);
                this.f39236b &= -2;
            }
            protoBuf$QualifiedNameTable.f39220b = this.f39237c;
            return protoBuf$QualifiedNameTable;
        }

        /* JADX INFO: renamed from: m */
        public final void m13839m(ProtoBuf$QualifiedNameTable protoBuf$QualifiedNameTable) {
            if (protoBuf$QualifiedNameTable == ProtoBuf$QualifiedNameTable.f39217e) {
                return;
            }
            if (!protoBuf$QualifiedNameTable.f39220b.isEmpty()) {
                if (this.f39237c.isEmpty()) {
                    this.f39237c = protoBuf$QualifiedNameTable.f39220b;
                    this.f39236b &= -2;
                } else {
                    if ((this.f39236b & 1) != 1) {
                        this.f39237c = new ArrayList(this.f39237c);
                        this.f39236b |= 1;
                    }
                    this.f39237c.addAll(protoBuf$QualifiedNameTable.f39220b);
                }
            }
            this.f39493a = this.f39493a.m15519f(protoBuf$QualifiedNameTable.f39219a);
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0021  */
        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* JADX INFO: renamed from: n */
        public final void m13840n(C6992c c6992c, C6993d c6993d) throws Throwable {
            ProtoBuf$QualifiedNameTable protoBuf$QualifiedNameTable;
            try {
                try {
                    ProtoBuf$QualifiedNameTable.f39218f.getClass();
                    m13839m(new ProtoBuf$QualifiedNameTable(c6992c, c6993d));
                } catch (InvalidProtocolBufferException e10) {
                    protoBuf$QualifiedNameTable = (ProtoBuf$QualifiedNameTable) e10.f39506a;
                    try {
                        throw e10;
                    } catch (Throwable th2) {
                        th = th2;
                        if (protoBuf$QualifiedNameTable != null) {
                            m13839m(protoBuf$QualifiedNameTable);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                protoBuf$QualifiedNameTable = null;
                if (protoBuf$QualifiedNameTable != null) {
                    m13839m(protoBuf$QualifiedNameTable);
                }
                throw th;
            }
        }
    }

    static {
        ProtoBuf$QualifiedNameTable protoBuf$QualifiedNameTable = new ProtoBuf$QualifiedNameTable();
        f39217e = protoBuf$QualifiedNameTable;
        protoBuf$QualifiedNameTable.f39220b = Collections.emptyList();
    }

    public ProtoBuf$QualifiedNameTable() {
        this.f39221c = (byte) -1;
        this.f39222d = -1;
        this.f39219a = AbstractC7803a.f42882a;
    }

    public ProtoBuf$QualifiedNameTable(GeneratedMessageLite.AbstractC6982b abstractC6982b) {
        super(0);
        this.f39221c = (byte) -1;
        this.f39222d = -1;
        this.f39219a = abstractC6982b.f39493a;
    }

    /* JADX WARN: Unreachable blocks removed: 3, instructions: 3 */
    public ProtoBuf$QualifiedNameTable(C6992c c6992c, C6993d c6993d) throws InvalidProtocolBufferException {
        this.f39221c = (byte) -1;
        this.f39222d = -1;
        this.f39220b = Collections.emptyList();
        AbstractC7803a.b bVar = new AbstractC7803a.b();
        CodedOutputStream codedOutputStreamM13901j = CodedOutputStream.m13901j(bVar, 1);
        boolean z10 = false;
        boolean z11 = false;
        while (!z10) {
            try {
                try {
                    try {
                        int iM13952n = c6992c.m13952n();
                        if (iM13952n != 0) {
                            if (iM13952n == 10) {
                                if (!(z11 & true)) {
                                    this.f39220b = new ArrayList();
                                    z11 |= true;
                                }
                                this.f39220b.add((QualifiedName) c6992c.m13945g(QualifiedName.f39224i, c6993d));
                            } else if (!c6992c.m13955q(iM13952n, codedOutputStreamM13901j)) {
                            }
                        }
                        z10 = true;
                    } catch (IOException e10) {
                        InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e10.getMessage());
                        invalidProtocolBufferException.f39506a = this;
                        throw invalidProtocolBufferException;
                    }
                } catch (InvalidProtocolBufferException e11) {
                    e11.f39506a = this;
                    throw e11;
                }
            } catch (Throwable th2) {
                if (z11 & true) {
                    this.f39220b = Collections.unmodifiableList(this.f39220b);
                }
                try {
                    codedOutputStreamM13901j.m13902i();
                } catch (IOException unused) {
                } catch (Throwable th3) {
                    this.f39219a = bVar.m15533l();
                    throw th3;
                }
                this.f39219a = bVar.m15533l();
                throw th2;
            }
        }
        if (z11 & true) {
            this.f39220b = Collections.unmodifiableList(this.f39220b);
        }
        try {
            codedOutputStreamM13901j.m13902i();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f39219a = bVar.m15533l();
            throw th4;
        }
        this.f39219a = bVar.m15533l();
    }

    @Override // p282nn.InterfaceC7808f
    /* JADX INFO: renamed from: b */
    public final boolean mo13780b() {
        byte b10 = this.f39221c;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        for (int i10 = 0; i10 < this.f39220b.size(); i10++) {
            if (!this.f39220b.get(i10).mo13780b()) {
                this.f39221c = (byte) 0;
                return false;
            }
        }
        this.f39221c = (byte) 1;
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC6997h
    /* JADX INFO: renamed from: c */
    public final InterfaceC6997h.a mo13781c() {
        C6944b c6944b = new C6944b();
        c6944b.m13839m(this);
        return c6944b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC6997h
    /* JADX INFO: renamed from: d */
    public final int mo13782d() {
        int i10 = this.f39222d;
        if (i10 != -1) {
            return i10;
        }
        int iM13896d = 0;
        for (int i11 = 0; i11 < this.f39220b.size(); i11++) {
            iM13896d += CodedOutputStream.m13896d(1, this.f39220b.get(i11));
        }
        int size = this.f39219a.size() + iM13896d;
        this.f39222d = size;
        return size;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC6997h
    /* JADX INFO: renamed from: e */
    public final InterfaceC6997h.a mo13783e() {
        return new C6944b();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC6997h
    /* JADX INFO: renamed from: j */
    public final void mo13784j(CodedOutputStream codedOutputStream) throws IOException {
        mo13782d();
        for (int i10 = 0; i10 < this.f39220b.size(); i10++) {
            codedOutputStream.m13907o(1, this.f39220b.get(i10));
        }
        codedOutputStream.m13910r(this.f39219a);
    }
}
