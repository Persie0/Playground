package kotlin.reflect.jvm.internal.impl.metadata.jvm;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Constructor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Package;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter;
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
import kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType;
import p282nn.AbstractC7803a;
import p282nn.C7807e;
import p282nn.InterfaceC7808f;

/* JADX INFO: loaded from: classes2.dex */
public final class JvmProtoBuf {

    /* JADX INFO: renamed from: a */
    public static final GeneratedMessageLite.C6985e<ProtoBuf$Constructor, JvmMethodSignature> f39398a;

    /* JADX INFO: renamed from: b */
    public static final GeneratedMessageLite.C6985e<ProtoBuf$Function, JvmMethodSignature> f39399b;

    /* JADX INFO: renamed from: c */
    public static final GeneratedMessageLite.C6985e<ProtoBuf$Function, Integer> f39400c;

    /* JADX INFO: renamed from: d */
    public static final GeneratedMessageLite.C6985e<ProtoBuf$Property, JvmPropertySignature> f39401d;

    /* JADX INFO: renamed from: e */
    public static final GeneratedMessageLite.C6985e<ProtoBuf$Property, Integer> f39402e;

    /* JADX INFO: renamed from: f */
    public static final GeneratedMessageLite.C6985e<ProtoBuf$Type, List<ProtoBuf$Annotation>> f39403f;

    /* JADX INFO: renamed from: g */
    public static final GeneratedMessageLite.C6985e<ProtoBuf$Type, Boolean> f39404g;

    /* JADX INFO: renamed from: h */
    public static final GeneratedMessageLite.C6985e<ProtoBuf$TypeParameter, List<ProtoBuf$Annotation>> f39405h;

    /* JADX INFO: renamed from: i */
    public static final GeneratedMessageLite.C6985e<ProtoBuf$Class, Integer> f39406i;

    /* JADX INFO: renamed from: j */
    public static final GeneratedMessageLite.C6985e<ProtoBuf$Class, List<ProtoBuf$Property>> f39407j;

    /* JADX INFO: renamed from: k */
    public static final GeneratedMessageLite.C6985e<ProtoBuf$Class, Integer> f39408k;

    /* JADX INFO: renamed from: l */
    public static final GeneratedMessageLite.C6985e<ProtoBuf$Class, Integer> f39409l;

    /* JADX INFO: renamed from: m */
    public static final GeneratedMessageLite.C6985e<ProtoBuf$Package, Integer> f39410m;

    /* JADX INFO: renamed from: n */
    public static final GeneratedMessageLite.C6985e<ProtoBuf$Package, List<ProtoBuf$Property>> f39411n;

    public static final class JvmFieldSignature extends GeneratedMessageLite implements InterfaceC7808f {

        /* JADX INFO: renamed from: g */
        public static final JvmFieldSignature f39412g;

        /* JADX INFO: renamed from: h */
        public static final C6968a f39413h = new C6968a();

        /* JADX INFO: renamed from: a */
        public final AbstractC7803a f39414a;

        /* JADX INFO: renamed from: b */
        public int f39415b;

        /* JADX INFO: renamed from: c */
        public int f39416c;

        /* JADX INFO: renamed from: d */
        public int f39417d;

        /* JADX INFO: renamed from: e */
        public byte f39418e;

        /* JADX INFO: renamed from: f */
        public int f39419f;

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmFieldSignature$a */
        public static class C6968a extends AbstractC6991b<JvmFieldSignature> {
            @Override // p282nn.InterfaceC7809g
            /* JADX INFO: renamed from: a */
            public final Object mo13787a(C6992c c6992c, C6993d c6993d) throws InvalidProtocolBufferException {
                return new JvmFieldSignature(c6992c);
            }
        }

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmFieldSignature$b */
        public static final class C6969b extends GeneratedMessageLite.AbstractC6982b<JvmFieldSignature, C6969b> implements InterfaceC7808f {

            /* JADX INFO: renamed from: b */
            public int f39420b;

            /* JADX INFO: renamed from: c */
            public int f39421c;

            /* JADX INFO: renamed from: d */
            public int f39422d;

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC6990a.a, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC6997h.a
            /* JADX INFO: renamed from: Q */
            public final /* bridge */ /* synthetic */ InterfaceC6997h.a mo13788Q(C6992c c6992c, C6993d c6993d) throws Throwable {
                m13877n(c6992c, c6993d);
                return this;
            }

            /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC6997h.a
            /* JADX INFO: renamed from: a */
            public final InterfaceC6997h mo13789a() {
                JvmFieldSignature jvmFieldSignatureM13875k = m13875k();
                if (jvmFieldSignatureM13875k.mo13780b()) {
                    return jvmFieldSignatureM13875k;
                }
                throw new UninitializedMessageException();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.AbstractC6982b
            public final Object clone() throws CloneNotSupportedException {
                C6969b c6969b = new C6969b();
                c6969b.m13876m(m13875k());
                return c6969b;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC6990a.a
            /* JADX INFO: renamed from: f */
            public final /* bridge */ /* synthetic */ AbstractC6990a.a mo13788Q(C6992c c6992c, C6993d c6993d) throws Throwable {
                m13877n(c6992c, c6993d);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.AbstractC6982b
            /* JADX INFO: renamed from: g */
            public final GeneratedMessageLite.AbstractC6982b clone() {
                C6969b c6969b = new C6969b();
                c6969b.m13876m(m13875k());
                return c6969b;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.AbstractC6982b
            /* JADX INFO: renamed from: i */
            public final /* bridge */ /* synthetic */ GeneratedMessageLite.AbstractC6982b mo13792i(GeneratedMessageLite generatedMessageLite) {
                m13876m((JvmFieldSignature) generatedMessageLite);
                return this;
            }

            /* JADX INFO: renamed from: k */
            public final JvmFieldSignature m13875k() {
                JvmFieldSignature jvmFieldSignature = new JvmFieldSignature(this);
                int i10 = this.f39420b;
                int i11 = 1;
                if ((i10 & 1) != 1) {
                    i11 = 0;
                }
                jvmFieldSignature.f39416c = this.f39421c;
                if ((i10 & 2) == 2) {
                    i11 |= 2;
                }
                jvmFieldSignature.f39417d = this.f39422d;
                jvmFieldSignature.f39415b = i11;
                return jvmFieldSignature;
            }

            /* JADX INFO: renamed from: m */
            public final void m13876m(JvmFieldSignature jvmFieldSignature) {
                if (jvmFieldSignature == JvmFieldSignature.f39412g) {
                    return;
                }
                int i10 = jvmFieldSignature.f39415b;
                if ((i10 & 1) == 1) {
                    int i11 = jvmFieldSignature.f39416c;
                    this.f39420b |= 1;
                    this.f39421c = i11;
                }
                if ((i10 & 2) == 2) {
                    int i12 = jvmFieldSignature.f39417d;
                    this.f39420b = 2 | this.f39420b;
                    this.f39422d = i12;
                }
                this.f39493a = this.f39493a.m15519f(jvmFieldSignature.f39414a);
            }

            /* JADX WARN: Code duplicated, block: B:16:0x0022  */
            /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
            /* JADX INFO: renamed from: n */
            public final void m13877n(C6992c c6992c, C6993d c6993d) throws Throwable {
                JvmFieldSignature jvmFieldSignature;
                try {
                    try {
                        JvmFieldSignature.f39413h.getClass();
                        m13876m(new JvmFieldSignature(c6992c));
                    } catch (InvalidProtocolBufferException e10) {
                        jvmFieldSignature = (JvmFieldSignature) e10.f39506a;
                        try {
                            throw e10;
                        } catch (Throwable th2) {
                            th = th2;
                            if (jvmFieldSignature != null) {
                                m13876m(jvmFieldSignature);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    jvmFieldSignature = null;
                    if (jvmFieldSignature != null) {
                        m13876m(jvmFieldSignature);
                    }
                    throw th;
                }
            }
        }

        static {
            JvmFieldSignature jvmFieldSignature = new JvmFieldSignature();
            f39412g = jvmFieldSignature;
            jvmFieldSignature.f39416c = 0;
            jvmFieldSignature.f39417d = 0;
        }

        public JvmFieldSignature() {
            this.f39418e = (byte) -1;
            this.f39419f = -1;
            this.f39414a = AbstractC7803a.f42882a;
        }

        public JvmFieldSignature(GeneratedMessageLite.AbstractC6982b abstractC6982b) {
            super(0);
            this.f39418e = (byte) -1;
            this.f39419f = -1;
            this.f39414a = abstractC6982b.f39493a;
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        public JvmFieldSignature(C6992c c6992c) throws InvalidProtocolBufferException {
            this.f39418e = (byte) -1;
            this.f39419f = -1;
            boolean z10 = false;
            this.f39416c = 0;
            this.f39417d = 0;
            AbstractC7803a.b bVar = new AbstractC7803a.b();
            CodedOutputStream codedOutputStreamM13901j = CodedOutputStream.m13901j(bVar, 1);
            loop0: while (true) {
                while (true) {
                    if (z10) {
                        break loop0;
                    }
                    try {
                        try {
                            try {
                                int iM13952n = c6992c.m13952n();
                                if (iM13952n != 0) {
                                    if (iM13952n == 8) {
                                        this.f39415b |= 1;
                                        this.f39416c = c6992c.m13949k();
                                    } else if (iM13952n == 16) {
                                        this.f39415b |= 2;
                                        this.f39417d = c6992c.m13949k();
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
                    } catch (Throwable th2) {
                        try {
                            codedOutputStreamM13901j.m13902i();
                        } catch (IOException unused) {
                        } catch (Throwable th3) {
                            this.f39414a = bVar.m15533l();
                            throw th3;
                        }
                        this.f39414a = bVar.m15533l();
                        throw th2;
                    }
                }
            }
            try {
                codedOutputStreamM13901j.m13902i();
            } catch (IOException unused2) {
            } catch (Throwable th4) {
                this.f39414a = bVar.m15533l();
                throw th4;
            }
            this.f39414a = bVar.m15533l();
        }

        @Override // p282nn.InterfaceC7808f
        /* JADX INFO: renamed from: b */
        public final boolean mo13780b() {
            byte b10 = this.f39418e;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.f39418e = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC6997h
        /* JADX INFO: renamed from: c */
        public final InterfaceC6997h.a mo13781c() {
            C6969b c6969b = new C6969b();
            c6969b.m13876m(this);
            return c6969b;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC6997h
        /* JADX INFO: renamed from: d */
        public final int mo13782d() {
            int i10 = this.f39419f;
            if (i10 != -1) {
                return i10;
            }
            int iM13894b = (this.f39415b & 1) == 1 ? 0 + CodedOutputStream.m13894b(1, this.f39416c) : 0;
            if ((this.f39415b & 2) == 2) {
                iM13894b += CodedOutputStream.m13894b(2, this.f39417d);
            }
            int size = this.f39414a.size() + iM13894b;
            this.f39419f = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC6997h
        /* JADX INFO: renamed from: e */
        public final InterfaceC6997h.a mo13783e() {
            return new C6969b();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC6997h
        /* JADX INFO: renamed from: j */
        public final void mo13784j(CodedOutputStream codedOutputStream) throws IOException {
            mo13782d();
            if ((this.f39415b & 1) == 1) {
                codedOutputStream.m13905m(1, this.f39416c);
            }
            if ((this.f39415b & 2) == 2) {
                codedOutputStream.m13905m(2, this.f39417d);
            }
            codedOutputStream.m13910r(this.f39414a);
        }
    }

    public static final class JvmMethodSignature extends GeneratedMessageLite implements InterfaceC7808f {

        /* JADX INFO: renamed from: g */
        public static final JvmMethodSignature f39423g;

        /* JADX INFO: renamed from: h */
        public static final C6970a f39424h = new C6970a();

        /* JADX INFO: renamed from: a */
        public final AbstractC7803a f39425a;

        /* JADX INFO: renamed from: b */
        public int f39426b;

        /* JADX INFO: renamed from: c */
        public int f39427c;

        /* JADX INFO: renamed from: d */
        public int f39428d;

        /* JADX INFO: renamed from: e */
        public byte f39429e;

        /* JADX INFO: renamed from: f */
        public int f39430f;

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmMethodSignature$a */
        public static class C6970a extends AbstractC6991b<JvmMethodSignature> {
            @Override // p282nn.InterfaceC7809g
            /* JADX INFO: renamed from: a */
            public final Object mo13787a(C6992c c6992c, C6993d c6993d) throws InvalidProtocolBufferException {
                return new JvmMethodSignature(c6992c);
            }
        }

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmMethodSignature$b */
        public static final class C6971b extends GeneratedMessageLite.AbstractC6982b<JvmMethodSignature, C6971b> implements InterfaceC7808f {

            /* JADX INFO: renamed from: b */
            public int f39431b;

            /* JADX INFO: renamed from: c */
            public int f39432c;

            /* JADX INFO: renamed from: d */
            public int f39433d;

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC6990a.a, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC6997h.a
            /* JADX INFO: renamed from: Q */
            public final /* bridge */ /* synthetic */ InterfaceC6997h.a mo13788Q(C6992c c6992c, C6993d c6993d) throws Throwable {
                m13881n(c6992c, c6993d);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC6997h.a
            /* JADX INFO: renamed from: a */
            public final InterfaceC6997h mo13789a() {
                JvmMethodSignature jvmMethodSignatureM13879k = m13879k();
                if (jvmMethodSignatureM13879k.mo13780b()) {
                    return jvmMethodSignatureM13879k;
                }
                throw new UninitializedMessageException();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.AbstractC6982b
            public final Object clone() throws CloneNotSupportedException {
                C6971b c6971b = new C6971b();
                c6971b.m13880m(m13879k());
                return c6971b;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC6990a.a
            /* JADX INFO: renamed from: f */
            public final /* bridge */ /* synthetic */ AbstractC6990a.a mo13788Q(C6992c c6992c, C6993d c6993d) throws Throwable {
                m13881n(c6992c, c6993d);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.AbstractC6982b
            /* JADX INFO: renamed from: g */
            public final GeneratedMessageLite.AbstractC6982b clone() {
                C6971b c6971b = new C6971b();
                c6971b.m13880m(m13879k());
                return c6971b;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.AbstractC6982b
            /* JADX INFO: renamed from: i */
            public final /* bridge */ /* synthetic */ GeneratedMessageLite.AbstractC6982b mo13792i(GeneratedMessageLite generatedMessageLite) {
                m13880m((JvmMethodSignature) generatedMessageLite);
                return this;
            }

            /* JADX INFO: renamed from: k */
            public final JvmMethodSignature m13879k() {
                JvmMethodSignature jvmMethodSignature = new JvmMethodSignature(this);
                int i10 = this.f39431b;
                int i11 = 1;
                if ((i10 & 1) != 1) {
                    i11 = 0;
                }
                jvmMethodSignature.f39427c = this.f39432c;
                if ((i10 & 2) == 2) {
                    i11 |= 2;
                }
                jvmMethodSignature.f39428d = this.f39433d;
                jvmMethodSignature.f39426b = i11;
                return jvmMethodSignature;
            }

            /* JADX INFO: renamed from: m */
            public final void m13880m(JvmMethodSignature jvmMethodSignature) {
                if (jvmMethodSignature == JvmMethodSignature.f39423g) {
                    return;
                }
                int i10 = jvmMethodSignature.f39426b;
                if ((i10 & 1) == 1) {
                    int i11 = jvmMethodSignature.f39427c;
                    this.f39431b |= 1;
                    this.f39432c = i11;
                }
                if ((i10 & 2) == 2) {
                    int i12 = jvmMethodSignature.f39428d;
                    this.f39431b = 2 | this.f39431b;
                    this.f39433d = i12;
                }
                this.f39493a = this.f39493a.m15519f(jvmMethodSignature.f39425a);
            }

            /* JADX WARN: Code duplicated, block: B:16:0x001f  */
            /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
            /* JADX INFO: renamed from: n */
            public final void m13881n(C6992c c6992c, C6993d c6993d) throws Throwable {
                JvmMethodSignature jvmMethodSignature;
                try {
                    try {
                        JvmMethodSignature.f39424h.getClass();
                        m13880m(new JvmMethodSignature(c6992c));
                    } catch (InvalidProtocolBufferException e10) {
                        jvmMethodSignature = (JvmMethodSignature) e10.f39506a;
                        try {
                            throw e10;
                        } catch (Throwable th2) {
                            th = th2;
                            if (jvmMethodSignature != null) {
                                m13880m(jvmMethodSignature);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    jvmMethodSignature = null;
                    if (jvmMethodSignature != null) {
                        m13880m(jvmMethodSignature);
                    }
                    throw th;
                }
            }
        }

        static {
            JvmMethodSignature jvmMethodSignature = new JvmMethodSignature();
            f39423g = jvmMethodSignature;
            jvmMethodSignature.f39427c = 0;
            jvmMethodSignature.f39428d = 0;
        }

        public JvmMethodSignature() {
            this.f39429e = (byte) -1;
            this.f39430f = -1;
            this.f39425a = AbstractC7803a.f42882a;
        }

        public JvmMethodSignature(GeneratedMessageLite.AbstractC6982b abstractC6982b) {
            super(0);
            this.f39429e = (byte) -1;
            this.f39430f = -1;
            this.f39425a = abstractC6982b.f39493a;
        }

        /* JADX WARN: Unreachable blocks removed: 4, instructions: 4 */
        public JvmMethodSignature(C6992c c6992c) throws InvalidProtocolBufferException {
            this.f39429e = (byte) -1;
            this.f39430f = -1;
            boolean z10 = false;
            this.f39427c = 0;
            this.f39428d = 0;
            AbstractC7803a.b bVar = new AbstractC7803a.b();
            CodedOutputStream codedOutputStreamM13901j = CodedOutputStream.m13901j(bVar, 1);
            while (!z10) {
                try {
                    try {
                        int iM13952n = c6992c.m13952n();
                        if (iM13952n != 0) {
                            if (iM13952n == 8) {
                                this.f39426b |= 1;
                                this.f39427c = c6992c.m13949k();
                            } else if (iM13952n == 16) {
                                this.f39426b |= 2;
                                this.f39428d = c6992c.m13949k();
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
                    } catch (Throwable th3) {
                        this.f39425a = bVar.m15533l();
                        throw th3;
                    }
                    this.f39425a = bVar.m15533l();
                    throw th2;
                }
            }
            try {
                codedOutputStreamM13901j.m13902i();
            } catch (IOException unused2) {
            } catch (Throwable th4) {
                this.f39425a = bVar.m15533l();
                throw th4;
            }
            this.f39425a = bVar.m15533l();
        }

        /* JADX INFO: renamed from: n */
        public static C6971b m13878n(JvmMethodSignature jvmMethodSignature) {
            C6971b c6971b = new C6971b();
            c6971b.m13880m(jvmMethodSignature);
            return c6971b;
        }

        @Override // p282nn.InterfaceC7808f
        /* JADX INFO: renamed from: b */
        public final boolean mo13780b() {
            byte b10 = this.f39429e;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.f39429e = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC6997h
        /* JADX INFO: renamed from: c */
        public final InterfaceC6997h.a mo13781c() {
            return m13878n(this);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC6997h
        /* JADX INFO: renamed from: d */
        public final int mo13782d() {
            int i10 = this.f39430f;
            if (i10 != -1) {
                return i10;
            }
            int iM13894b = 0;
            if ((this.f39426b & 1) == 1) {
                iM13894b = 0 + CodedOutputStream.m13894b(1, this.f39427c);
            }
            if ((this.f39426b & 2) == 2) {
                iM13894b += CodedOutputStream.m13894b(2, this.f39428d);
            }
            int size = this.f39425a.size() + iM13894b;
            this.f39430f = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC6997h
        /* JADX INFO: renamed from: e */
        public final InterfaceC6997h.a mo13783e() {
            return new C6971b();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC6997h
        /* JADX INFO: renamed from: j */
        public final void mo13784j(CodedOutputStream codedOutputStream) throws IOException {
            mo13782d();
            if ((this.f39426b & 1) == 1) {
                codedOutputStream.m13905m(1, this.f39427c);
            }
            if ((this.f39426b & 2) == 2) {
                codedOutputStream.m13905m(2, this.f39428d);
            }
            codedOutputStream.m13910r(this.f39425a);
        }
    }

    public static final class JvmPropertySignature extends GeneratedMessageLite implements InterfaceC7808f {

        /* JADX INFO: renamed from: j */
        public static final JvmPropertySignature f39434j;

        /* JADX INFO: renamed from: k */
        public static final C6972a f39435k = new C6972a();

        /* JADX INFO: renamed from: a */
        public final AbstractC7803a f39436a;

        /* JADX INFO: renamed from: b */
        public int f39437b;

        /* JADX INFO: renamed from: c */
        public JvmFieldSignature f39438c;

        /* JADX INFO: renamed from: d */
        public JvmMethodSignature f39439d;

        /* JADX INFO: renamed from: e */
        public JvmMethodSignature f39440e;

        /* JADX INFO: renamed from: f */
        public JvmMethodSignature f39441f;

        /* JADX INFO: renamed from: g */
        public JvmMethodSignature f39442g;

        /* JADX INFO: renamed from: h */
        public byte f39443h;

        /* JADX INFO: renamed from: i */
        public int f39444i;

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmPropertySignature$a */
        public static class C6972a extends AbstractC6991b<JvmPropertySignature> {
            @Override // p282nn.InterfaceC7809g
            /* JADX INFO: renamed from: a */
            public final Object mo13787a(C6992c c6992c, C6993d c6993d) throws InvalidProtocolBufferException {
                return new JvmPropertySignature(c6992c, c6993d);
            }
        }

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmPropertySignature$b */
        public static final class C6973b extends GeneratedMessageLite.AbstractC6982b<JvmPropertySignature, C6973b> implements InterfaceC7808f {

            /* JADX INFO: renamed from: b */
            public int f39445b;

            /* JADX INFO: renamed from: c */
            public JvmFieldSignature f39446c = JvmFieldSignature.f39412g;

            /* JADX INFO: renamed from: d */
            public JvmMethodSignature f39447d;

            /* JADX INFO: renamed from: e */
            public JvmMethodSignature f39448e;

            /* JADX INFO: renamed from: f */
            public JvmMethodSignature f39449f;

            /* JADX INFO: renamed from: g */
            public JvmMethodSignature f39450g;

            public C6973b() {
                JvmMethodSignature jvmMethodSignature = JvmMethodSignature.f39423g;
                this.f39447d = jvmMethodSignature;
                this.f39448e = jvmMethodSignature;
                this.f39449f = jvmMethodSignature;
                this.f39450g = jvmMethodSignature;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC6990a.a, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC6997h.a
            /* JADX INFO: renamed from: Q */
            public final /* bridge */ /* synthetic */ InterfaceC6997h.a mo13788Q(C6992c c6992c, C6993d c6993d) throws Throwable {
                m13884n(c6992c, c6993d);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC6997h.a
            /* JADX INFO: renamed from: a */
            public final InterfaceC6997h mo13789a() {
                JvmPropertySignature jvmPropertySignatureM13882k = m13882k();
                if (jvmPropertySignatureM13882k.mo13780b()) {
                    return jvmPropertySignatureM13882k;
                }
                throw new UninitializedMessageException();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.AbstractC6982b
            public final Object clone() throws CloneNotSupportedException {
                C6973b c6973b = new C6973b();
                c6973b.m13883m(m13882k());
                return c6973b;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC6990a.a
            /* JADX INFO: renamed from: f */
            public final /* bridge */ /* synthetic */ AbstractC6990a.a mo13788Q(C6992c c6992c, C6993d c6993d) throws Throwable {
                m13884n(c6992c, c6993d);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.AbstractC6982b
            /* JADX INFO: renamed from: g */
            public final GeneratedMessageLite.AbstractC6982b clone() {
                C6973b c6973b = new C6973b();
                c6973b.m13883m(m13882k());
                return c6973b;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.AbstractC6982b
            /* JADX INFO: renamed from: i */
            public final /* bridge */ /* synthetic */ GeneratedMessageLite.AbstractC6982b mo13792i(GeneratedMessageLite generatedMessageLite) {
                m13883m((JvmPropertySignature) generatedMessageLite);
                return this;
            }

            /* JADX INFO: renamed from: k */
            public final JvmPropertySignature m13882k() {
                JvmPropertySignature jvmPropertySignature = new JvmPropertySignature(this);
                int i10 = this.f39445b;
                int i11 = 1;
                if ((i10 & 1) != 1) {
                    i11 = 0;
                }
                jvmPropertySignature.f39438c = this.f39446c;
                if ((i10 & 2) == 2) {
                    i11 |= 2;
                }
                jvmPropertySignature.f39439d = this.f39447d;
                if ((i10 & 4) == 4) {
                    i11 |= 4;
                }
                jvmPropertySignature.f39440e = this.f39448e;
                if ((i10 & 8) == 8) {
                    i11 |= 8;
                }
                jvmPropertySignature.f39441f = this.f39449f;
                if ((i10 & 16) == 16) {
                    i11 |= 16;
                }
                jvmPropertySignature.f39442g = this.f39450g;
                jvmPropertySignature.f39437b = i11;
                return jvmPropertySignature;
            }

            /* JADX INFO: renamed from: m */
            public final void m13883m(JvmPropertySignature jvmPropertySignature) {
                JvmMethodSignature jvmMethodSignature;
                JvmMethodSignature jvmMethodSignature2;
                JvmMethodSignature jvmMethodSignature3;
                JvmMethodSignature jvmMethodSignature4;
                JvmFieldSignature jvmFieldSignature;
                if (jvmPropertySignature == JvmPropertySignature.f39434j) {
                    return;
                }
                boolean z10 = true;
                if ((jvmPropertySignature.f39437b & 1) == 1) {
                    JvmFieldSignature jvmFieldSignature2 = jvmPropertySignature.f39438c;
                    if ((this.f39445b & 1) != 1 || (jvmFieldSignature = this.f39446c) == JvmFieldSignature.f39412g) {
                        this.f39446c = jvmFieldSignature2;
                    } else {
                        JvmFieldSignature.C6969b c6969b = new JvmFieldSignature.C6969b();
                        c6969b.m13876m(jvmFieldSignature);
                        c6969b.m13876m(jvmFieldSignature2);
                        this.f39446c = c6969b.m13875k();
                    }
                    this.f39445b |= 1;
                }
                if ((jvmPropertySignature.f39437b & 2) == 2) {
                    JvmMethodSignature jvmMethodSignature5 = jvmPropertySignature.f39439d;
                    if ((this.f39445b & 2) != 2 || (jvmMethodSignature4 = this.f39447d) == JvmMethodSignature.f39423g) {
                        this.f39447d = jvmMethodSignature5;
                    } else {
                        JvmMethodSignature.C6971b c6971bM13878n = JvmMethodSignature.m13878n(jvmMethodSignature4);
                        c6971bM13878n.m13880m(jvmMethodSignature5);
                        this.f39447d = c6971bM13878n.m13879k();
                    }
                    this.f39445b |= 2;
                }
                if ((jvmPropertySignature.f39437b & 4) == 4) {
                    JvmMethodSignature jvmMethodSignature6 = jvmPropertySignature.f39440e;
                    if ((this.f39445b & 4) != 4 || (jvmMethodSignature3 = this.f39448e) == JvmMethodSignature.f39423g) {
                        this.f39448e = jvmMethodSignature6;
                    } else {
                        JvmMethodSignature.C6971b c6971bM13878n2 = JvmMethodSignature.m13878n(jvmMethodSignature3);
                        c6971bM13878n2.m13880m(jvmMethodSignature6);
                        this.f39448e = c6971bM13878n2.m13879k();
                    }
                    this.f39445b |= 4;
                }
                if ((jvmPropertySignature.f39437b & 8) == 8) {
                    JvmMethodSignature jvmMethodSignature7 = jvmPropertySignature.f39441f;
                    if ((this.f39445b & 8) != 8 || (jvmMethodSignature2 = this.f39449f) == JvmMethodSignature.f39423g) {
                        this.f39449f = jvmMethodSignature7;
                    } else {
                        JvmMethodSignature.C6971b c6971bM13878n3 = JvmMethodSignature.m13878n(jvmMethodSignature2);
                        c6971bM13878n3.m13880m(jvmMethodSignature7);
                        this.f39449f = c6971bM13878n3.m13879k();
                    }
                    this.f39445b |= 8;
                }
                if ((jvmPropertySignature.f39437b & 16) != 16) {
                    z10 = false;
                }
                if (z10) {
                    JvmMethodSignature jvmMethodSignature8 = jvmPropertySignature.f39442g;
                    if ((this.f39445b & 16) != 16 || (jvmMethodSignature = this.f39450g) == JvmMethodSignature.f39423g) {
                        this.f39450g = jvmMethodSignature8;
                    } else {
                        JvmMethodSignature.C6971b c6971bM13878n4 = JvmMethodSignature.m13878n(jvmMethodSignature);
                        c6971bM13878n4.m13880m(jvmMethodSignature8);
                        this.f39450g = c6971bM13878n4.m13879k();
                    }
                    this.f39445b |= 16;
                }
                this.f39493a = this.f39493a.m15519f(jvmPropertySignature.f39436a);
            }

            /* JADX WARN: Code duplicated, block: B:17:0x0024  */
            /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
            /* JADX INFO: renamed from: n */
            public final void m13884n(C6992c c6992c, C6993d c6993d) throws Throwable {
                JvmPropertySignature jvmPropertySignature;
                try {
                    try {
                        JvmPropertySignature.f39435k.getClass();
                        m13883m(new JvmPropertySignature(c6992c, c6993d));
                    } catch (InvalidProtocolBufferException e10) {
                        jvmPropertySignature = (JvmPropertySignature) e10.f39506a;
                        try {
                            throw e10;
                        } catch (Throwable th2) {
                            th = th2;
                            if (jvmPropertySignature != null) {
                                m13883m(jvmPropertySignature);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    jvmPropertySignature = null;
                    if (jvmPropertySignature != null) {
                        m13883m(jvmPropertySignature);
                    }
                    throw th;
                }
            }
        }

        static {
            JvmPropertySignature jvmPropertySignature = new JvmPropertySignature();
            f39434j = jvmPropertySignature;
            jvmPropertySignature.f39438c = JvmFieldSignature.f39412g;
            JvmMethodSignature jvmMethodSignature = JvmMethodSignature.f39423g;
            jvmPropertySignature.f39439d = jvmMethodSignature;
            jvmPropertySignature.f39440e = jvmMethodSignature;
            jvmPropertySignature.f39441f = jvmMethodSignature;
            jvmPropertySignature.f39442g = jvmMethodSignature;
        }

        public JvmPropertySignature() {
            this.f39443h = (byte) -1;
            this.f39444i = -1;
            this.f39436a = AbstractC7803a.f42882a;
        }

        public JvmPropertySignature(GeneratedMessageLite.AbstractC6982b abstractC6982b) {
            super(0);
            this.f39443h = (byte) -1;
            this.f39444i = -1;
            this.f39436a = abstractC6982b.f39493a;
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        public JvmPropertySignature(C6992c c6992c, C6993d c6993d) throws InvalidProtocolBufferException {
            this.f39443h = (byte) -1;
            this.f39444i = -1;
            this.f39438c = JvmFieldSignature.f39412g;
            JvmMethodSignature jvmMethodSignature = JvmMethodSignature.f39423g;
            this.f39439d = jvmMethodSignature;
            this.f39440e = jvmMethodSignature;
            this.f39441f = jvmMethodSignature;
            this.f39442g = jvmMethodSignature;
            AbstractC7803a.b bVar = new AbstractC7803a.b();
            CodedOutputStream codedOutputStreamM13901j = CodedOutputStream.m13901j(bVar, 1);
            boolean z10 = false;
            while (!z10) {
                try {
                    try {
                        int iM13952n = c6992c.m13952n();
                        if (iM13952n != 0) {
                            JvmMethodSignature.C6971b c6971bM13878n = null;
                            JvmFieldSignature.C6969b c6969b = null;
                            JvmMethodSignature.C6971b c6971bM13878n2 = null;
                            JvmMethodSignature.C6971b c6971bM13878n3 = null;
                            JvmMethodSignature.C6971b c6971bM13878n4 = null;
                            if (iM13952n == 10) {
                                if ((this.f39437b & 1) == 1) {
                                    JvmFieldSignature jvmFieldSignature = this.f39438c;
                                    jvmFieldSignature.getClass();
                                    c6969b = new JvmFieldSignature.C6969b();
                                    c6969b.m13876m(jvmFieldSignature);
                                }
                                JvmFieldSignature jvmFieldSignature2 = (JvmFieldSignature) c6992c.m13945g(JvmFieldSignature.f39413h, c6993d);
                                this.f39438c = jvmFieldSignature2;
                                if (c6969b != null) {
                                    c6969b.m13876m(jvmFieldSignature2);
                                    this.f39438c = c6969b.m13875k();
                                }
                                this.f39437b |= 1;
                            } else if (iM13952n == 18) {
                                if ((this.f39437b & 2) == 2) {
                                    JvmMethodSignature jvmMethodSignature2 = this.f39439d;
                                    jvmMethodSignature2.getClass();
                                    c6971bM13878n2 = JvmMethodSignature.m13878n(jvmMethodSignature2);
                                }
                                JvmMethodSignature jvmMethodSignature3 = (JvmMethodSignature) c6992c.m13945g(JvmMethodSignature.f39424h, c6993d);
                                this.f39439d = jvmMethodSignature3;
                                if (c6971bM13878n2 != null) {
                                    c6971bM13878n2.m13880m(jvmMethodSignature3);
                                    this.f39439d = c6971bM13878n2.m13879k();
                                }
                                this.f39437b |= 2;
                            } else if (iM13952n == 26) {
                                if ((this.f39437b & 4) == 4) {
                                    JvmMethodSignature jvmMethodSignature4 = this.f39440e;
                                    jvmMethodSignature4.getClass();
                                    c6971bM13878n3 = JvmMethodSignature.m13878n(jvmMethodSignature4);
                                }
                                JvmMethodSignature jvmMethodSignature5 = (JvmMethodSignature) c6992c.m13945g(JvmMethodSignature.f39424h, c6993d);
                                this.f39440e = jvmMethodSignature5;
                                if (c6971bM13878n3 != null) {
                                    c6971bM13878n3.m13880m(jvmMethodSignature5);
                                    this.f39440e = c6971bM13878n3.m13879k();
                                }
                                this.f39437b |= 4;
                            } else if (iM13952n == 34) {
                                if ((this.f39437b & 8) == 8) {
                                    JvmMethodSignature jvmMethodSignature6 = this.f39441f;
                                    jvmMethodSignature6.getClass();
                                    c6971bM13878n4 = JvmMethodSignature.m13878n(jvmMethodSignature6);
                                }
                                JvmMethodSignature jvmMethodSignature7 = (JvmMethodSignature) c6992c.m13945g(JvmMethodSignature.f39424h, c6993d);
                                this.f39441f = jvmMethodSignature7;
                                if (c6971bM13878n4 != null) {
                                    c6971bM13878n4.m13880m(jvmMethodSignature7);
                                    this.f39441f = c6971bM13878n4.m13879k();
                                }
                                this.f39437b |= 8;
                            } else if (iM13952n == 42) {
                                if ((this.f39437b & 16) == 16) {
                                    JvmMethodSignature jvmMethodSignature8 = this.f39442g;
                                    jvmMethodSignature8.getClass();
                                    c6971bM13878n = JvmMethodSignature.m13878n(jvmMethodSignature8);
                                }
                                JvmMethodSignature jvmMethodSignature9 = (JvmMethodSignature) c6992c.m13945g(JvmMethodSignature.f39424h, c6993d);
                                this.f39442g = jvmMethodSignature9;
                                if (c6971bM13878n != null) {
                                    c6971bM13878n.m13880m(jvmMethodSignature9);
                                    this.f39442g = c6971bM13878n.m13879k();
                                }
                                this.f39437b |= 16;
                            } else if (!c6992c.m13955q(iM13952n, codedOutputStreamM13901j)) {
                            }
                        }
                        z10 = true;
                    } catch (Throwable th2) {
                        try {
                            codedOutputStreamM13901j.m13902i();
                        } catch (IOException unused) {
                        } finally {
                            this.f39436a = bVar.m15533l();
                        }
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
            try {
                codedOutputStreamM13901j.m13902i();
            } catch (IOException unused2) {
            } finally {
                this.f39436a = bVar.m15533l();
            }
        }

        @Override // p282nn.InterfaceC7808f
        /* JADX INFO: renamed from: b */
        public final boolean mo13780b() {
            byte b10 = this.f39443h;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.f39443h = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC6997h
        /* JADX INFO: renamed from: c */
        public final InterfaceC6997h.a mo13781c() {
            C6973b c6973b = new C6973b();
            c6973b.m13883m(this);
            return c6973b;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC6997h
        /* JADX INFO: renamed from: d */
        public final int mo13782d() {
            int i10 = this.f39444i;
            if (i10 != -1) {
                return i10;
            }
            int iM13896d = 0;
            if ((this.f39437b & 1) == 1) {
                iM13896d = 0 + CodedOutputStream.m13896d(1, this.f39438c);
            }
            if ((this.f39437b & 2) == 2) {
                iM13896d += CodedOutputStream.m13896d(2, this.f39439d);
            }
            if ((this.f39437b & 4) == 4) {
                iM13896d += CodedOutputStream.m13896d(3, this.f39440e);
            }
            if ((this.f39437b & 8) == 8) {
                iM13896d += CodedOutputStream.m13896d(4, this.f39441f);
            }
            if ((this.f39437b & 16) == 16) {
                iM13896d += CodedOutputStream.m13896d(5, this.f39442g);
            }
            int size = this.f39436a.size() + iM13896d;
            this.f39444i = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC6997h
        /* JADX INFO: renamed from: e */
        public final InterfaceC6997h.a mo13783e() {
            return new C6973b();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC6997h
        /* JADX INFO: renamed from: j */
        public final void mo13784j(CodedOutputStream codedOutputStream) throws IOException {
            mo13782d();
            if ((this.f39437b & 1) == 1) {
                codedOutputStream.m13907o(1, this.f39438c);
            }
            if ((this.f39437b & 2) == 2) {
                codedOutputStream.m13907o(2, this.f39439d);
            }
            if ((this.f39437b & 4) == 4) {
                codedOutputStream.m13907o(3, this.f39440e);
            }
            if ((this.f39437b & 8) == 8) {
                codedOutputStream.m13907o(4, this.f39441f);
            }
            if ((this.f39437b & 16) == 16) {
                codedOutputStream.m13907o(5, this.f39442g);
            }
            codedOutputStream.m13910r(this.f39436a);
        }
    }

    public static final class StringTableTypes extends GeneratedMessageLite implements InterfaceC7808f {

        /* JADX INFO: renamed from: g */
        public static final StringTableTypes f39451g;

        /* JADX INFO: renamed from: h */
        public static final C6977a f39452h = new C6977a();

        /* JADX INFO: renamed from: a */
        public final AbstractC7803a f39453a;

        /* JADX INFO: renamed from: b */
        public List<Record> f39454b;

        /* JADX INFO: renamed from: c */
        public List<Integer> f39455c;

        /* JADX INFO: renamed from: d */
        public int f39456d;

        /* JADX INFO: renamed from: e */
        public byte f39457e;

        /* JADX INFO: renamed from: f */
        public int f39458f;

        public static final class Record extends GeneratedMessageLite implements InterfaceC7808f {

            /* JADX INFO: renamed from: H */
            public static final Record f39459H;

            /* JADX INFO: renamed from: I */
            public static final C6975a f39460I = new C6975a();

            /* JADX INFO: renamed from: a */
            public final AbstractC7803a f39461a;

            /* JADX INFO: renamed from: b */
            public int f39462b;

            /* JADX INFO: renamed from: c */
            public int f39463c;

            /* JADX INFO: renamed from: d */
            public int f39464d;

            /* JADX INFO: renamed from: e */
            public Object f39465e;

            /* JADX INFO: renamed from: f */
            public Operation f39466f;

            /* JADX INFO: renamed from: g */
            public List<Integer> f39467g;

            /* JADX INFO: renamed from: h */
            public int f39468h;

            /* JADX INFO: renamed from: i */
            public List<Integer> f39469i;

            /* JADX INFO: renamed from: j */
            public int f39470j;

            /* JADX INFO: renamed from: k */
            public byte f39471k;

            /* JADX INFO: renamed from: l */
            public int f39472l;

            public enum Operation implements C6995f.a {
                NONE(0, 0),
                INTERNAL_TO_CLASS_ID(1, 1),
                DESC_TO_CLASS_ID(2, 2);

                private static C6995f.b<Operation> internalValueMap = new C6974a();
                private final int value;

                /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$StringTableTypes$Record$Operation$a */
                public static class C6974a implements C6995f.b<Operation> {
                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.C6995f.b
                    /* JADX INFO: renamed from: a */
                    public final C6995f.a mo13786a(int i10) {
                        return Operation.valueOf(i10);
                    }
                }

                Operation(int i10, int i11) {
                    this.value = i11;
                }

                public static Operation valueOf(int i10) {
                    if (i10 == 0) {
                        return NONE;
                    }
                    if (i10 == 1) {
                        return INTERNAL_TO_CLASS_ID;
                    }
                    if (i10 != 2) {
                        return null;
                    }
                    return DESC_TO_CLASS_ID;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.C6995f.a
                public final int getNumber() {
                    return this.value;
                }
            }

            /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$StringTableTypes$Record$a */
            public static class C6975a extends AbstractC6991b<Record> {
                @Override // p282nn.InterfaceC7809g
                /* JADX INFO: renamed from: a */
                public final Object mo13787a(C6992c c6992c, C6993d c6993d) throws InvalidProtocolBufferException {
                    return new Record(c6992c);
                }
            }

            /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$StringTableTypes$Record$b */
            public static final class C6976b extends GeneratedMessageLite.AbstractC6982b<Record, C6976b> implements InterfaceC7808f {

                /* JADX INFO: renamed from: b */
                public int f39473b;

                /* JADX INFO: renamed from: d */
                public int f39475d;

                /* JADX INFO: renamed from: c */
                public int f39474c = 1;

                /* JADX INFO: renamed from: e */
                public Object f39476e = "";

                /* JADX INFO: renamed from: f */
                public Operation f39477f = Operation.NONE;

                /* JADX INFO: renamed from: g */
                public List<Integer> f39478g = Collections.emptyList();

                /* JADX INFO: renamed from: h */
                public List<Integer> f39479h = Collections.emptyList();

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC6990a.a, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC6997h.a
                /* JADX INFO: renamed from: Q */
                public final /* bridge */ /* synthetic */ InterfaceC6997h.a mo13788Q(C6992c c6992c, C6993d c6993d) throws Throwable {
                    m13887n(c6992c, c6993d);
                    return this;
                }

                /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
                @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC6997h.a
                /* JADX INFO: renamed from: a */
                public final InterfaceC6997h mo13789a() {
                    Record recordM13885k = m13885k();
                    if (recordM13885k.mo13780b()) {
                        return recordM13885k;
                    }
                    throw new UninitializedMessageException();
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.AbstractC6982b
                public final Object clone() throws CloneNotSupportedException {
                    C6976b c6976b = new C6976b();
                    c6976b.m13886m(m13885k());
                    return c6976b;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC6990a.a
                /* JADX INFO: renamed from: f */
                public final /* bridge */ /* synthetic */ AbstractC6990a.a mo13788Q(C6992c c6992c, C6993d c6993d) throws Throwable {
                    m13887n(c6992c, c6993d);
                    return this;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.AbstractC6982b
                /* JADX INFO: renamed from: g */
                public final GeneratedMessageLite.AbstractC6982b clone() {
                    C6976b c6976b = new C6976b();
                    c6976b.m13886m(m13885k());
                    return c6976b;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.AbstractC6982b
                /* JADX INFO: renamed from: i */
                public final /* bridge */ /* synthetic */ GeneratedMessageLite.AbstractC6982b mo13792i(GeneratedMessageLite generatedMessageLite) {
                    m13886m((Record) generatedMessageLite);
                    return this;
                }

                /* JADX INFO: renamed from: k */
                public final Record m13885k() {
                    Record record = new Record(this);
                    int i10 = this.f39473b;
                    int i11 = 1;
                    if ((i10 & 1) != 1) {
                        i11 = 0;
                    }
                    record.f39463c = this.f39474c;
                    if ((i10 & 2) == 2) {
                        i11 |= 2;
                    }
                    record.f39464d = this.f39475d;
                    if ((i10 & 4) == 4) {
                        i11 |= 4;
                    }
                    record.f39465e = this.f39476e;
                    if ((i10 & 8) == 8) {
                        i11 |= 8;
                    }
                    record.f39466f = this.f39477f;
                    if ((i10 & 16) == 16) {
                        this.f39478g = Collections.unmodifiableList(this.f39478g);
                        this.f39473b &= -17;
                    }
                    record.f39467g = this.f39478g;
                    if ((this.f39473b & 32) == 32) {
                        this.f39479h = Collections.unmodifiableList(this.f39479h);
                        this.f39473b &= -33;
                    }
                    record.f39469i = this.f39479h;
                    record.f39462b = i11;
                    return record;
                }

                /* JADX INFO: renamed from: m */
                public final void m13886m(Record record) {
                    if (record == Record.f39459H) {
                        return;
                    }
                    int i10 = record.f39462b;
                    boolean z10 = false;
                    if ((i10 & 1) == 1) {
                        int i11 = record.f39463c;
                        this.f39473b |= 1;
                        this.f39474c = i11;
                    }
                    if ((i10 & 2) == 2) {
                        int i12 = record.f39464d;
                        this.f39473b = 2 | this.f39473b;
                        this.f39475d = i12;
                    }
                    if ((i10 & 4) == 4) {
                        this.f39473b |= 4;
                        this.f39476e = record.f39465e;
                    }
                    if ((i10 & 8) == 8) {
                        z10 = true;
                    }
                    if (z10) {
                        Operation operation = record.f39466f;
                        operation.getClass();
                        this.f39473b = 8 | this.f39473b;
                        this.f39477f = operation;
                    }
                    if (!record.f39467g.isEmpty()) {
                        if (this.f39478g.isEmpty()) {
                            this.f39478g = record.f39467g;
                            this.f39473b &= -17;
                        } else {
                            if ((this.f39473b & 16) != 16) {
                                this.f39478g = new ArrayList(this.f39478g);
                                this.f39473b |= 16;
                            }
                            this.f39478g.addAll(record.f39467g);
                        }
                    }
                    if (!record.f39469i.isEmpty()) {
                        if (this.f39479h.isEmpty()) {
                            this.f39479h = record.f39469i;
                            this.f39473b &= -33;
                        } else {
                            if ((this.f39473b & 32) != 32) {
                                this.f39479h = new ArrayList(this.f39479h);
                                this.f39473b |= 32;
                            }
                            this.f39479h.addAll(record.f39469i);
                        }
                    }
                    this.f39493a = this.f39493a.m15519f(record.f39461a);
                }

                /* JADX WARN: Code duplicated, block: B:16:0x0023  */
                /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
                /* JADX INFO: renamed from: n */
                public final void m13887n(C6992c c6992c, C6993d c6993d) throws Throwable {
                    Record record;
                    try {
                        try {
                            Record.f39460I.getClass();
                            m13886m(new Record(c6992c));
                        } catch (InvalidProtocolBufferException e10) {
                            record = (Record) e10.f39506a;
                            try {
                                throw e10;
                            } catch (Throwable th2) {
                                th = th2;
                                if (record != null) {
                                    m13886m(record);
                                }
                                throw th;
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        record = null;
                        if (record != null) {
                            m13886m(record);
                        }
                        throw th;
                    }
                }
            }

            static {
                Record record = new Record();
                f39459H = record;
                record.f39463c = 1;
                record.f39464d = 0;
                record.f39465e = "";
                record.f39466f = Operation.NONE;
                record.f39467g = Collections.emptyList();
                record.f39469i = Collections.emptyList();
            }

            public Record() {
                this.f39468h = -1;
                this.f39470j = -1;
                this.f39471k = (byte) -1;
                this.f39472l = -1;
                this.f39461a = AbstractC7803a.f42882a;
            }

            public Record(GeneratedMessageLite.AbstractC6982b abstractC6982b) {
                super(0);
                this.f39468h = -1;
                this.f39470j = -1;
                this.f39471k = (byte) -1;
                this.f39472l = -1;
                this.f39461a = abstractC6982b.f39493a;
            }

            /* JADX WARN: Unreachable blocks removed: 4, instructions: 4 */
            public Record(C6992c c6992c) throws InvalidProtocolBufferException {
                this.f39468h = -1;
                this.f39470j = -1;
                this.f39471k = (byte) -1;
                this.f39472l = -1;
                this.f39463c = 1;
                boolean z10 = false;
                this.f39464d = 0;
                this.f39465e = "";
                this.f39466f = Operation.NONE;
                this.f39467g = Collections.emptyList();
                this.f39469i = Collections.emptyList();
                AbstractC7803a.b bVar = new AbstractC7803a.b();
                CodedOutputStream codedOutputStreamM13901j = CodedOutputStream.m13901j(bVar, 1);
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
                                        this.f39462b |= 1;
                                        this.f39463c = c6992c.m13949k();
                                    } else if (iM13952n == 16) {
                                        this.f39462b |= 2;
                                        this.f39464d = c6992c.m13949k();
                                    } else if (iM13952n == 24) {
                                        int iM13949k = c6992c.m13949k();
                                        Operation operationValueOf = Operation.valueOf(iM13949k);
                                        if (operationValueOf == null) {
                                            codedOutputStreamM13901j.m13914v(iM13952n);
                                            codedOutputStreamM13901j.m13914v(iM13949k);
                                        } else {
                                            this.f39462b |= 8;
                                            this.f39466f = operationValueOf;
                                        }
                                    } else if (iM13952n == 32) {
                                        if ((i10 & 16) != 16) {
                                            this.f39467g = new ArrayList();
                                            i10 |= 16;
                                        }
                                        this.f39467g.add(Integer.valueOf(c6992c.m13949k()));
                                    } else if (iM13952n == 34) {
                                        int iM13942d = c6992c.m13942d(c6992c.m13949k());
                                        if ((i10 & 16) != 16 && c6992c.m13940b() > 0) {
                                            this.f39467g = new ArrayList();
                                            i10 |= 16;
                                        }
                                        while (c6992c.m13940b() > 0) {
                                            this.f39467g.add(Integer.valueOf(c6992c.m13949k()));
                                        }
                                        c6992c.m13941c(iM13942d);
                                    } else if (iM13952n == 40) {
                                        if ((i10 & 32) != 32) {
                                            this.f39469i = new ArrayList();
                                            i10 |= 32;
                                        }
                                        this.f39469i.add(Integer.valueOf(c6992c.m13949k()));
                                    } else if (iM13952n == 42) {
                                        int iM13942d2 = c6992c.m13942d(c6992c.m13949k());
                                        if ((i10 & 32) != 32 && c6992c.m13940b() > 0) {
                                            this.f39469i = new ArrayList();
                                            i10 |= 32;
                                        }
                                        while (c6992c.m13940b() > 0) {
                                            this.f39469i.add(Integer.valueOf(c6992c.m13949k()));
                                        }
                                        c6992c.m13941c(iM13942d2);
                                    } else if (iM13952n == 50) {
                                        C7807e c7807eM13943e = c6992c.m13943e();
                                        this.f39462b |= 4;
                                        this.f39465e = c7807eM13943e;
                                    } else if (!c6992c.m13955q(iM13952n, codedOutputStreamM13901j)) {
                                    }
                                }
                                z10 = true;
                            } catch (Throwable th2) {
                                if ((i10 & 16) == 16) {
                                    this.f39467g = Collections.unmodifiableList(this.f39467g);
                                }
                                if ((i10 & 32) == 32) {
                                    this.f39469i = Collections.unmodifiableList(this.f39469i);
                                }
                                try {
                                    codedOutputStreamM13901j.m13902i();
                                } catch (IOException unused) {
                                } finally {
                                    this.f39461a = bVar.m15533l();
                                }
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
                }
                if ((i10 & 16) == 16) {
                    this.f39467g = Collections.unmodifiableList(this.f39467g);
                }
                if ((i10 & 32) == 32) {
                    this.f39469i = Collections.unmodifiableList(this.f39469i);
                }
                try {
                    codedOutputStreamM13901j.m13902i();
                } catch (IOException unused2) {
                } finally {
                    this.f39461a = bVar.m15533l();
                }
            }

            @Override // p282nn.InterfaceC7808f
            /* JADX INFO: renamed from: b */
            public final boolean mo13780b() {
                byte b10 = this.f39471k;
                if (b10 == 1) {
                    return true;
                }
                if (b10 == 0) {
                    return false;
                }
                this.f39471k = (byte) 1;
                return true;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC6997h
            /* JADX INFO: renamed from: c */
            public final InterfaceC6997h.a mo13781c() {
                C6976b c6976b = new C6976b();
                c6976b.m13886m(this);
                return c6976b;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC6997h
            /* JADX INFO: renamed from: d */
            public final int mo13782d() {
                AbstractC7803a c7807e;
                int i10 = this.f39472l;
                if (i10 != -1) {
                    return i10;
                }
                int iM13894b = (this.f39462b & 1) == 1 ? CodedOutputStream.m13894b(1, this.f39463c) + 0 : 0;
                if ((this.f39462b & 2) == 2) {
                    iM13894b += CodedOutputStream.m13894b(2, this.f39464d);
                }
                if ((this.f39462b & 8) == 8) {
                    iM13894b += CodedOutputStream.m13893a(3, this.f39466f.getNumber());
                }
                int iM13895c = 0;
                for (int i11 = 0; i11 < this.f39467g.size(); i11++) {
                    iM13895c += CodedOutputStream.m13895c(this.f39467g.get(i11).intValue());
                }
                int iM13895c2 = iM13894b + iM13895c;
                if (!this.f39467g.isEmpty()) {
                    iM13895c2 = iM13895c2 + 1 + CodedOutputStream.m13895c(iM13895c);
                }
                this.f39468h = iM13895c;
                int iM13895c3 = 0;
                for (int i12 = 0; i12 < this.f39469i.size(); i12++) {
                    iM13895c3 += CodedOutputStream.m13895c(this.f39469i.get(i12).intValue());
                }
                int size = iM13895c2 + iM13895c3;
                if (!this.f39469i.isEmpty()) {
                    size = size + 1 + CodedOutputStream.m13895c(iM13895c3);
                }
                this.f39470j = iM13895c3;
                if ((this.f39462b & 4) == 4) {
                    Object obj = this.f39465e;
                    if (obj instanceof String) {
                        try {
                            c7807e = new C7807e(((String) obj).getBytes("UTF-8"));
                            this.f39465e = c7807e;
                        } catch (UnsupportedEncodingException e10) {
                            throw new RuntimeException("UTF-8 not supported?", e10);
                        }
                    } else {
                        c7807e = (AbstractC7803a) obj;
                    }
                    size += c7807e.size() + CodedOutputStream.m13898f(c7807e.size()) + CodedOutputStream.m13900h(6);
                }
                int size2 = this.f39461a.size() + size;
                this.f39472l = size2;
                return size2;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC6997h
            /* JADX INFO: renamed from: e */
            public final InterfaceC6997h.a mo13783e() {
                return new C6976b();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC6997h
            /* JADX INFO: renamed from: j */
            public final void mo13784j(CodedOutputStream codedOutputStream) throws IOException {
                AbstractC7803a c7807e;
                mo13782d();
                if ((this.f39462b & 1) == 1) {
                    codedOutputStream.m13905m(1, this.f39463c);
                }
                if ((this.f39462b & 2) == 2) {
                    codedOutputStream.m13905m(2, this.f39464d);
                }
                if ((this.f39462b & 8) == 8) {
                    codedOutputStream.m13904l(3, this.f39466f.getNumber());
                }
                if (this.f39467g.size() > 0) {
                    codedOutputStream.m13914v(34);
                    codedOutputStream.m13914v(this.f39468h);
                }
                for (int i10 = 0; i10 < this.f39467g.size(); i10++) {
                    codedOutputStream.m13906n(this.f39467g.get(i10).intValue());
                }
                if (this.f39469i.size() > 0) {
                    codedOutputStream.m13914v(42);
                    codedOutputStream.m13914v(this.f39470j);
                }
                for (int i11 = 0; i11 < this.f39469i.size(); i11++) {
                    codedOutputStream.m13906n(this.f39469i.get(i11).intValue());
                }
                if ((this.f39462b & 4) == 4) {
                    Object obj = this.f39465e;
                    if (obj instanceof String) {
                        try {
                            c7807e = new C7807e(((String) obj).getBytes("UTF-8"));
                            this.f39465e = c7807e;
                        } catch (UnsupportedEncodingException e10) {
                            throw new RuntimeException("UTF-8 not supported?", e10);
                        }
                    } else {
                        c7807e = (AbstractC7803a) obj;
                    }
                    codedOutputStream.m13916x(6, 2);
                    codedOutputStream.m13914v(c7807e.size());
                    codedOutputStream.m13910r(c7807e);
                }
                codedOutputStream.m13910r(this.f39461a);
            }
        }

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$StringTableTypes$a */
        public static class C6977a extends AbstractC6991b<StringTableTypes> {
            @Override // p282nn.InterfaceC7809g
            /* JADX INFO: renamed from: a */
            public final Object mo13787a(C6992c c6992c, C6993d c6993d) throws InvalidProtocolBufferException {
                return new StringTableTypes(c6992c, c6993d);
            }
        }

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$StringTableTypes$b */
        public static final class C6978b extends GeneratedMessageLite.AbstractC6982b<StringTableTypes, C6978b> implements InterfaceC7808f {

            /* JADX INFO: renamed from: b */
            public int f39480b;

            /* JADX INFO: renamed from: c */
            public List<Record> f39481c = Collections.emptyList();

            /* JADX INFO: renamed from: d */
            public List<Integer> f39482d = Collections.emptyList();

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC6990a.a, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC6997h.a
            /* JADX INFO: renamed from: Q */
            public final /* bridge */ /* synthetic */ InterfaceC6997h.a mo13788Q(C6992c c6992c, C6993d c6993d) throws Throwable {
                m13890n(c6992c, c6993d);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC6997h.a
            /* JADX INFO: renamed from: a */
            public final InterfaceC6997h mo13789a() {
                StringTableTypes stringTableTypesM13888k = m13888k();
                if (stringTableTypesM13888k.mo13780b()) {
                    return stringTableTypesM13888k;
                }
                throw new UninitializedMessageException();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.AbstractC6982b
            public final Object clone() throws CloneNotSupportedException {
                C6978b c6978b = new C6978b();
                c6978b.m13889m(m13888k());
                return c6978b;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC6990a.a
            /* JADX INFO: renamed from: f */
            public final /* bridge */ /* synthetic */ AbstractC6990a.a mo13788Q(C6992c c6992c, C6993d c6993d) throws Throwable {
                m13890n(c6992c, c6993d);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.AbstractC6982b
            /* JADX INFO: renamed from: g */
            public final GeneratedMessageLite.AbstractC6982b clone() {
                C6978b c6978b = new C6978b();
                c6978b.m13889m(m13888k());
                return c6978b;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.AbstractC6982b
            /* JADX INFO: renamed from: i */
            public final /* bridge */ /* synthetic */ GeneratedMessageLite.AbstractC6982b mo13792i(GeneratedMessageLite generatedMessageLite) {
                m13889m((StringTableTypes) generatedMessageLite);
                return this;
            }

            /* JADX INFO: renamed from: k */
            public final StringTableTypes m13888k() {
                StringTableTypes stringTableTypes = new StringTableTypes(this);
                if ((this.f39480b & 1) == 1) {
                    this.f39481c = Collections.unmodifiableList(this.f39481c);
                    this.f39480b &= -2;
                }
                stringTableTypes.f39454b = this.f39481c;
                if ((this.f39480b & 2) == 2) {
                    this.f39482d = Collections.unmodifiableList(this.f39482d);
                    this.f39480b &= -3;
                }
                stringTableTypes.f39455c = this.f39482d;
                return stringTableTypes;
            }

            /* JADX INFO: renamed from: m */
            public final void m13889m(StringTableTypes stringTableTypes) {
                if (stringTableTypes == StringTableTypes.f39451g) {
                    return;
                }
                if (!stringTableTypes.f39454b.isEmpty()) {
                    if (this.f39481c.isEmpty()) {
                        this.f39481c = stringTableTypes.f39454b;
                        this.f39480b &= -2;
                    } else {
                        if ((this.f39480b & 1) != 1) {
                            this.f39481c = new ArrayList(this.f39481c);
                            this.f39480b |= 1;
                        }
                        this.f39481c.addAll(stringTableTypes.f39454b);
                    }
                }
                if (!stringTableTypes.f39455c.isEmpty()) {
                    if (this.f39482d.isEmpty()) {
                        this.f39482d = stringTableTypes.f39455c;
                        this.f39480b &= -3;
                    } else {
                        if ((this.f39480b & 2) != 2) {
                            this.f39482d = new ArrayList(this.f39482d);
                            this.f39480b |= 2;
                        }
                        this.f39482d.addAll(stringTableTypes.f39455c);
                    }
                }
                this.f39493a = this.f39493a.m15519f(stringTableTypes.f39453a);
            }

            /* JADX WARN: Code duplicated, block: B:17:0x0022  */
            /* JADX INFO: renamed from: n */
            public final void m13890n(C6992c c6992c, C6993d c6993d) throws Throwable {
                StringTableTypes stringTableTypes;
                try {
                    try {
                        StringTableTypes.f39452h.getClass();
                        m13889m(new StringTableTypes(c6992c, c6993d));
                    } catch (InvalidProtocolBufferException e10) {
                        stringTableTypes = (StringTableTypes) e10.f39506a;
                        try {
                            throw e10;
                        } catch (Throwable th2) {
                            th = th2;
                            if (stringTableTypes != null) {
                                m13889m(stringTableTypes);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    stringTableTypes = null;
                    if (stringTableTypes != null) {
                        m13889m(stringTableTypes);
                    }
                    throw th;
                }
            }
        }

        static {
            StringTableTypes stringTableTypes = new StringTableTypes();
            f39451g = stringTableTypes;
            stringTableTypes.f39454b = Collections.emptyList();
            stringTableTypes.f39455c = Collections.emptyList();
        }

        public StringTableTypes() {
            this.f39456d = -1;
            this.f39457e = (byte) -1;
            this.f39458f = -1;
            this.f39453a = AbstractC7803a.f42882a;
        }

        public StringTableTypes(GeneratedMessageLite.AbstractC6982b abstractC6982b) {
            super(0);
            this.f39456d = -1;
            this.f39457e = (byte) -1;
            this.f39458f = -1;
            this.f39453a = abstractC6982b.f39493a;
        }

        /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
        public StringTableTypes(C6992c c6992c, C6993d c6993d) throws InvalidProtocolBufferException {
            this.f39456d = -1;
            this.f39457e = (byte) -1;
            this.f39458f = -1;
            this.f39454b = Collections.emptyList();
            this.f39455c = Collections.emptyList();
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
                            try {
                                int iM13952n = c6992c.m13952n();
                                if (iM13952n != 0) {
                                    if (iM13952n == 10) {
                                        if ((i10 & 1) != 1) {
                                            this.f39454b = new ArrayList();
                                            i10 |= 1;
                                        }
                                        this.f39454b.add((Record) c6992c.m13945g(Record.f39460I, c6993d));
                                    } else if (iM13952n == 40) {
                                        if ((i10 & 2) != 2) {
                                            this.f39455c = new ArrayList();
                                            i10 |= 2;
                                        }
                                        this.f39455c.add(Integer.valueOf(c6992c.m13949k()));
                                    } else if (iM13952n == 42) {
                                        int iM13942d = c6992c.m13942d(c6992c.m13949k());
                                        if ((i10 & 2) != 2 && c6992c.m13940b() > 0) {
                                            this.f39455c = new ArrayList();
                                            i10 |= 2;
                                        }
                                        while (c6992c.m13940b() > 0) {
                                            this.f39455c.add(Integer.valueOf(c6992c.m13949k()));
                                        }
                                        c6992c.m13941c(iM13942d);
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
                    } catch (Throwable th2) {
                        if ((i10 & 1) == 1) {
                            this.f39454b = Collections.unmodifiableList(this.f39454b);
                        }
                        if ((i10 & 2) == 2) {
                            this.f39455c = Collections.unmodifiableList(this.f39455c);
                        }
                        try {
                            codedOutputStreamM13901j.m13902i();
                        } catch (IOException unused) {
                        } finally {
                            this.f39453a = bVar.m15533l();
                        }
                        throw th2;
                    }
                }
            }
            if ((i10 & 1) == 1) {
                this.f39454b = Collections.unmodifiableList(this.f39454b);
            }
            if ((i10 & 2) == 2) {
                this.f39455c = Collections.unmodifiableList(this.f39455c);
            }
            try {
                codedOutputStreamM13901j.m13902i();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.f39453a = bVar.m15533l();
                throw th3;
            }
            this.f39453a = bVar.m15533l();
        }

        @Override // p282nn.InterfaceC7808f
        /* JADX INFO: renamed from: b */
        public final boolean mo13780b() {
            byte b10 = this.f39457e;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.f39457e = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC6997h
        /* JADX INFO: renamed from: c */
        public final InterfaceC6997h.a mo13781c() {
            C6978b c6978b = new C6978b();
            c6978b.m13889m(this);
            return c6978b;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC6997h
        /* JADX INFO: renamed from: d */
        public final int mo13782d() {
            int i10 = this.f39458f;
            if (i10 != -1) {
                return i10;
            }
            int iM13896d = 0;
            for (int i11 = 0; i11 < this.f39454b.size(); i11++) {
                iM13896d += CodedOutputStream.m13896d(1, this.f39454b.get(i11));
            }
            int iM13895c = 0;
            for (int i12 = 0; i12 < this.f39455c.size(); i12++) {
                iM13895c += CodedOutputStream.m13895c(this.f39455c.get(i12).intValue());
            }
            int iM13895c2 = iM13896d + iM13895c;
            if (!this.f39455c.isEmpty()) {
                iM13895c2 = iM13895c2 + 1 + CodedOutputStream.m13895c(iM13895c);
            }
            this.f39456d = iM13895c;
            int size = this.f39453a.size() + iM13895c2;
            this.f39458f = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC6997h
        /* JADX INFO: renamed from: e */
        public final InterfaceC6997h.a mo13783e() {
            return new C6978b();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC6997h
        /* JADX INFO: renamed from: j */
        public final void mo13784j(CodedOutputStream codedOutputStream) throws IOException {
            mo13782d();
            for (int i10 = 0; i10 < this.f39454b.size(); i10++) {
                codedOutputStream.m13907o(1, this.f39454b.get(i10));
            }
            if (this.f39455c.size() > 0) {
                codedOutputStream.m13914v(42);
                codedOutputStream.m13914v(this.f39456d);
            }
            for (int i11 = 0; i11 < this.f39455c.size(); i11++) {
                codedOutputStream.m13906n(this.f39455c.get(i11).intValue());
            }
            codedOutputStream.m13910r(this.f39453a);
        }
    }

    static {
        ProtoBuf$Constructor protoBuf$Constructor = ProtoBuf$Constructor.f39047i;
        JvmMethodSignature jvmMethodSignature = JvmMethodSignature.f39423g;
        WireFormat$FieldType wireFormat$FieldType = WireFormat$FieldType.MESSAGE;
        f39398a = GeneratedMessageLite.m13918l(protoBuf$Constructor, jvmMethodSignature, jvmMethodSignature, 100, wireFormat$FieldType, JvmMethodSignature.class);
        ProtoBuf$Function protoBuf$Function = ProtoBuf$Function.f39113P;
        f39399b = GeneratedMessageLite.m13918l(protoBuf$Function, jvmMethodSignature, jvmMethodSignature, 100, wireFormat$FieldType, JvmMethodSignature.class);
        WireFormat$FieldType wireFormat$FieldType2 = WireFormat$FieldType.INT32;
        f39400c = GeneratedMessageLite.m13918l(protoBuf$Function, 0, null, 101, wireFormat$FieldType2, Integer.class);
        ProtoBuf$Property protoBuf$Property = ProtoBuf$Property.f39181P;
        JvmPropertySignature jvmPropertySignature = JvmPropertySignature.f39434j;
        f39401d = GeneratedMessageLite.m13918l(protoBuf$Property, jvmPropertySignature, jvmPropertySignature, 100, wireFormat$FieldType, JvmPropertySignature.class);
        f39402e = GeneratedMessageLite.m13918l(protoBuf$Property, 0, null, 101, wireFormat$FieldType2, Integer.class);
        ProtoBuf$Type protoBuf$Type = ProtoBuf$Type.f39246O;
        ProtoBuf$Annotation protoBuf$Annotation = ProtoBuf$Annotation.f38935g;
        f39403f = GeneratedMessageLite.m13917k(protoBuf$Type, protoBuf$Annotation, 100, wireFormat$FieldType, ProtoBuf$Annotation.class);
        f39404g = GeneratedMessageLite.m13918l(protoBuf$Type, Boolean.FALSE, null, 101, WireFormat$FieldType.BOOL, Boolean.class);
        f39405h = GeneratedMessageLite.m13917k(ProtoBuf$TypeParameter.f39320H, protoBuf$Annotation, 100, wireFormat$FieldType, ProtoBuf$Annotation.class);
        ProtoBuf$Class protoBuf$Class = ProtoBuf$Class.f38986e0;
        f39406i = GeneratedMessageLite.m13918l(protoBuf$Class, 0, null, 101, wireFormat$FieldType2, Integer.class);
        f39407j = GeneratedMessageLite.m13917k(protoBuf$Class, protoBuf$Property, 102, wireFormat$FieldType, ProtoBuf$Property.class);
        f39408k = GeneratedMessageLite.m13918l(protoBuf$Class, 0, null, 103, wireFormat$FieldType2, Integer.class);
        f39409l = GeneratedMessageLite.m13918l(protoBuf$Class, 0, null, 104, wireFormat$FieldType2, Integer.class);
        ProtoBuf$Package protoBuf$Package = ProtoBuf$Package.f39149k;
        f39410m = GeneratedMessageLite.m13918l(protoBuf$Package, 0, null, 101, wireFormat$FieldType2, Integer.class);
        f39411n = GeneratedMessageLite.m13917k(protoBuf$Package, protoBuf$Property, 102, wireFormat$FieldType, ProtoBuf$Property.class);
    }
}
