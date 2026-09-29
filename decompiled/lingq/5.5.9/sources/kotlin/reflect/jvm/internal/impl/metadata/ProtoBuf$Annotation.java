package kotlin.reflect.jvm.internal.impl.metadata;

import androidx.datastore.preferences.PreferencesProto$Value;
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
public final class ProtoBuf$Annotation extends GeneratedMessageLite implements InterfaceC7808f {

    /* JADX INFO: renamed from: g */
    public static final ProtoBuf$Annotation f38935g;

    /* JADX INFO: renamed from: h */
    public static final C6912a f38936h = new C6912a();

    /* JADX INFO: renamed from: a */
    public final AbstractC7803a f38937a;

    /* JADX INFO: renamed from: b */
    public int f38938b;

    /* JADX INFO: renamed from: c */
    public int f38939c;

    /* JADX INFO: renamed from: d */
    public List<Argument> f38940d;

    /* JADX INFO: renamed from: e */
    public byte f38941e;

    /* JADX INFO: renamed from: f */
    public int f38942f;

    public static final class Argument extends GeneratedMessageLite implements InterfaceC7808f {

        /* JADX INFO: renamed from: g */
        public static final Argument f38943g;

        /* JADX INFO: renamed from: h */
        public static final C6910a f38944h = new C6910a();

        /* JADX INFO: renamed from: a */
        public final AbstractC7803a f38945a;

        /* JADX INFO: renamed from: b */
        public int f38946b;

        /* JADX INFO: renamed from: c */
        public int f38947c;

        /* JADX INFO: renamed from: d */
        public Value f38948d;

        /* JADX INFO: renamed from: e */
        public byte f38949e;

        /* JADX INFO: renamed from: f */
        public int f38950f;

        public static final class Value extends GeneratedMessageLite implements InterfaceC7808f {

            /* JADX INFO: renamed from: K */
            public static final Value f38951K;

            /* JADX INFO: renamed from: L */
            public static final C6908a f38952L = new C6908a();

            /* JADX INFO: renamed from: H */
            public int f38953H;

            /* JADX INFO: renamed from: I */
            public byte f38954I;

            /* JADX INFO: renamed from: J */
            public int f38955J;

            /* JADX INFO: renamed from: a */
            public final AbstractC7803a f38956a;

            /* JADX INFO: renamed from: b */
            public int f38957b;

            /* JADX INFO: renamed from: c */
            public Type f38958c;

            /* JADX INFO: renamed from: d */
            public long f38959d;

            /* JADX INFO: renamed from: e */
            public float f38960e;

            /* JADX INFO: renamed from: f */
            public double f38961f;

            /* JADX INFO: renamed from: g */
            public int f38962g;

            /* JADX INFO: renamed from: h */
            public int f38963h;

            /* JADX INFO: renamed from: i */
            public int f38964i;

            /* JADX INFO: renamed from: j */
            public ProtoBuf$Annotation f38965j;

            /* JADX INFO: renamed from: k */
            public List<Value> f38966k;

            /* JADX INFO: renamed from: l */
            public int f38967l;

            public enum Type implements C6995f.a {
                BYTE(0, 0),
                CHAR(1, 1),
                SHORT(2, 2),
                INT(3, 3),
                LONG(4, 4),
                FLOAT(5, 5),
                DOUBLE(6, 6),
                BOOLEAN(7, 7),
                STRING(8, 8),
                CLASS(9, 9),
                ENUM(10, 10),
                ANNOTATION(11, 11),
                ARRAY(12, 12);

                private static C6995f.b<Type> internalValueMap = new C6907a();
                private final int value;

                /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument$Value$Type$a */
                public static class C6907a implements C6995f.b<Type> {
                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.C6995f.b
                    /* JADX INFO: renamed from: a */
                    public final C6995f.a mo13786a(int i10) {
                        return Type.valueOf(i10);
                    }
                }

                Type(int i10, int i11) {
                    this.value = i11;
                }

                public static Type valueOf(int i10) {
                    switch (i10) {
                        case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                            return BYTE;
                        case 1:
                            return CHAR;
                        case 2:
                            return SHORT;
                        case 3:
                            return INT;
                        case 4:
                            return LONG;
                        case 5:
                            return FLOAT;
                        case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                            return DOUBLE;
                        case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                            return BOOLEAN;
                        case 8:
                            return STRING;
                        case 9:
                            return CLASS;
                        case 10:
                            return ENUM;
                        case 11:
                            return ANNOTATION;
                        case 12:
                            return ARRAY;
                        default:
                            return null;
                    }
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.C6995f.a
                public final int getNumber() {
                    return this.value;
                }
            }

            /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument$Value$a */
            public static class C6908a extends AbstractC6991b<Value> {
                @Override // p282nn.InterfaceC7809g
                /* JADX INFO: renamed from: a */
                public final Object mo13787a(C6992c c6992c, C6993d c6993d) throws InvalidProtocolBufferException {
                    return new Value(c6992c, c6993d);
                }
            }

            /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument$Value$b */
            public static final class C6909b extends GeneratedMessageLite.AbstractC6982b<Value, C6909b> implements InterfaceC7808f {

                /* JADX INFO: renamed from: H */
                public int f38968H;

                /* JADX INFO: renamed from: b */
                public int f38969b;

                /* JADX INFO: renamed from: d */
                public long f38971d;

                /* JADX INFO: renamed from: e */
                public float f38972e;

                /* JADX INFO: renamed from: f */
                public double f38973f;

                /* JADX INFO: renamed from: g */
                public int f38974g;

                /* JADX INFO: renamed from: h */
                public int f38975h;

                /* JADX INFO: renamed from: i */
                public int f38976i;

                /* JADX INFO: renamed from: l */
                public int f38979l;

                /* JADX INFO: renamed from: c */
                public Type f38970c = Type.BYTE;

                /* JADX INFO: renamed from: j */
                public ProtoBuf$Annotation f38977j = ProtoBuf$Annotation.f38935g;

                /* JADX INFO: renamed from: k */
                public List<Value> f38978k = Collections.emptyList();

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC6990a.a, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC6997h.a
                /* JADX INFO: renamed from: Q */
                public final /* bridge */ /* synthetic */ InterfaceC6997h.a mo13788Q(C6992c c6992c, C6993d c6993d) throws Throwable {
                    m13795n(c6992c, c6993d);
                    return this;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC6997h.a
                /* JADX INFO: renamed from: a */
                public final InterfaceC6997h mo13789a() {
                    Value valueM13793k = m13793k();
                    if (valueM13793k.mo13780b()) {
                        return valueM13793k;
                    }
                    throw new UninitializedMessageException();
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.AbstractC6982b
                public final Object clone() throws CloneNotSupportedException {
                    C6909b c6909b = new C6909b();
                    c6909b.m13794m(m13793k());
                    return c6909b;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC6990a.a
                /* JADX INFO: renamed from: f */
                public final /* bridge */ /* synthetic */ AbstractC6990a.a mo13788Q(C6992c c6992c, C6993d c6993d) throws Throwable {
                    m13795n(c6992c, c6993d);
                    return this;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.AbstractC6982b
                /* JADX INFO: renamed from: g */
                public final GeneratedMessageLite.AbstractC6982b clone() {
                    C6909b c6909b = new C6909b();
                    c6909b.m13794m(m13793k());
                    return c6909b;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.AbstractC6982b
                /* JADX INFO: renamed from: i */
                public final /* bridge */ /* synthetic */ GeneratedMessageLite.AbstractC6982b mo13792i(GeneratedMessageLite generatedMessageLite) {
                    m13794m((Value) generatedMessageLite);
                    return this;
                }

                /* JADX INFO: renamed from: k */
                public final Value m13793k() {
                    Value value = new Value(this);
                    int i10 = this.f38969b;
                    int i11 = (i10 & 1) != 1 ? 0 : 1;
                    value.f38958c = this.f38970c;
                    if ((i10 & 2) == 2) {
                        i11 |= 2;
                    }
                    value.f38959d = this.f38971d;
                    if ((i10 & 4) == 4) {
                        i11 |= 4;
                    }
                    value.f38960e = this.f38972e;
                    if ((i10 & 8) == 8) {
                        i11 |= 8;
                    }
                    value.f38961f = this.f38973f;
                    if ((i10 & 16) == 16) {
                        i11 |= 16;
                    }
                    value.f38962g = this.f38974g;
                    if ((i10 & 32) == 32) {
                        i11 |= 32;
                    }
                    value.f38963h = this.f38975h;
                    if ((i10 & 64) == 64) {
                        i11 |= 64;
                    }
                    value.f38964i = this.f38976i;
                    if ((i10 & BuildConfig.SDK_TRUNCATE_LENGTH) == 128) {
                        i11 |= BuildConfig.SDK_TRUNCATE_LENGTH;
                    }
                    value.f38965j = this.f38977j;
                    if ((i10 & 256) == 256) {
                        this.f38978k = Collections.unmodifiableList(this.f38978k);
                        this.f38969b &= -257;
                    }
                    value.f38966k = this.f38978k;
                    if ((i10 & 512) == 512) {
                        i11 |= 256;
                    }
                    value.f38967l = this.f38979l;
                    if ((i10 & 1024) == 1024) {
                        i11 |= 512;
                    }
                    value.f38953H = this.f38968H;
                    value.f38957b = i11;
                    return value;
                }

                /* JADX INFO: renamed from: m */
                public final void m13794m(Value value) {
                    ProtoBuf$Annotation protoBuf$Annotation;
                    if (value == Value.f38951K) {
                        return;
                    }
                    boolean z10 = true;
                    if ((value.f38957b & 1) == 1) {
                        Type type = value.f38958c;
                        type.getClass();
                        this.f38969b |= 1;
                        this.f38970c = type;
                    }
                    int i10 = value.f38957b;
                    if ((i10 & 2) == 2) {
                        long j10 = value.f38959d;
                        this.f38969b |= 2;
                        this.f38971d = j10;
                    }
                    if ((i10 & 4) == 4) {
                        float f3 = value.f38960e;
                        this.f38969b = 4 | this.f38969b;
                        this.f38972e = f3;
                    }
                    if ((i10 & 8) == 8) {
                        double d10 = value.f38961f;
                        this.f38969b |= 8;
                        this.f38973f = d10;
                    }
                    if ((i10 & 16) == 16) {
                        int i11 = value.f38962g;
                        this.f38969b = 16 | this.f38969b;
                        this.f38974g = i11;
                    }
                    if ((i10 & 32) == 32) {
                        int i12 = value.f38963h;
                        this.f38969b = 32 | this.f38969b;
                        this.f38975h = i12;
                    }
                    if ((i10 & 64) == 64) {
                        int i13 = value.f38964i;
                        this.f38969b = 64 | this.f38969b;
                        this.f38976i = i13;
                    }
                    if ((i10 & BuildConfig.SDK_TRUNCATE_LENGTH) == 128) {
                        ProtoBuf$Annotation protoBuf$Annotation2 = value.f38965j;
                        if ((this.f38969b & BuildConfig.SDK_TRUNCATE_LENGTH) != 128 || (protoBuf$Annotation = this.f38977j) == ProtoBuf$Annotation.f38935g) {
                            this.f38977j = protoBuf$Annotation2;
                        } else {
                            C6913b c6913b = new C6913b();
                            c6913b.m13800m(protoBuf$Annotation);
                            c6913b.m13800m(protoBuf$Annotation2);
                            this.f38977j = c6913b.m13799k();
                        }
                        this.f38969b |= BuildConfig.SDK_TRUNCATE_LENGTH;
                    }
                    if (!value.f38966k.isEmpty()) {
                        if (this.f38978k.isEmpty()) {
                            this.f38978k = value.f38966k;
                            this.f38969b &= -257;
                        } else {
                            if ((this.f38969b & 256) != 256) {
                                this.f38978k = new ArrayList(this.f38978k);
                                this.f38969b |= 256;
                            }
                            this.f38978k.addAll(value.f38966k);
                        }
                    }
                    int i14 = value.f38957b;
                    if ((i14 & 256) == 256) {
                        int i15 = value.f38967l;
                        this.f38969b |= 512;
                        this.f38979l = i15;
                    }
                    if ((i14 & 512) != 512) {
                        z10 = false;
                    }
                    if (z10) {
                        int i16 = value.f38953H;
                        this.f38969b |= 1024;
                        this.f38968H = i16;
                    }
                    this.f39493a = this.f39493a.m15519f(value.f38956a);
                }

                /* JADX WARN: Code duplicated, block: B:16:0x0022  */
                /* JADX INFO: renamed from: n */
                public final void m13795n(C6992c c6992c, C6993d c6993d) throws Throwable {
                    Value value;
                    try {
                        try {
                            Value.f38952L.getClass();
                            m13794m(new Value(c6992c, c6993d));
                        } catch (InvalidProtocolBufferException e10) {
                            value = (Value) e10.f39506a;
                            try {
                                throw e10;
                            } catch (Throwable th2) {
                                th = th2;
                                if (value != null) {
                                    m13794m(value);
                                }
                                throw th;
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        value = null;
                        if (value != null) {
                            m13794m(value);
                        }
                        throw th;
                    }
                }
            }

            static {
                Value value = new Value();
                f38951K = value;
                value.m13785n();
            }

            public Value() {
                this.f38954I = (byte) -1;
                this.f38955J = -1;
                this.f38956a = AbstractC7803a.f42882a;
            }

            public Value(GeneratedMessageLite.AbstractC6982b abstractC6982b) {
                super(0);
                this.f38954I = (byte) -1;
                this.f38955J = -1;
                this.f38956a = abstractC6982b.f39493a;
            }

            /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
            public Value(C6992c c6992c, C6993d c6993d) throws InvalidProtocolBufferException {
                C6913b c6913b;
                this.f38954I = (byte) -1;
                this.f38955J = -1;
                m13785n();
                AbstractC7803a.b bVar = new AbstractC7803a.b();
                CodedOutputStream codedOutputStreamM13901j = CodedOutputStream.m13901j(bVar, 1);
                boolean z10 = false;
                int i10 = 0;
                while (!z10) {
                    try {
                        try {
                            int iM13952n = c6992c.m13952n();
                            switch (iM13952n) {
                                case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                                    break;
                                case 8:
                                    int iM13949k = c6992c.m13949k();
                                    Type typeValueOf = Type.valueOf(iM13949k);
                                    if (typeValueOf == null) {
                                        codedOutputStreamM13901j.m13914v(iM13952n);
                                        codedOutputStreamM13901j.m13914v(iM13949k);
                                    } else {
                                        this.f38957b |= 1;
                                        this.f38958c = typeValueOf;
                                        continue;
                                    }
                                    break;
                                case 16:
                                    this.f38957b |= 2;
                                    long jM13950l = c6992c.m13950l();
                                    this.f38959d = (-(jM13950l & 1)) ^ (jM13950l >>> 1);
                                    continue;
                                case 29:
                                    this.f38957b |= 4;
                                    this.f38960e = Float.intBitsToFloat(c6992c.m13947i());
                                    continue;
                                case 33:
                                    this.f38957b |= 8;
                                    this.f38961f = Double.longBitsToDouble(c6992c.m13948j());
                                    continue;
                                case 40:
                                    this.f38957b |= 16;
                                    this.f38962g = c6992c.m13949k();
                                    continue;
                                case 48:
                                    this.f38957b |= 32;
                                    this.f38963h = c6992c.m13949k();
                                    continue;
                                case 56:
                                    this.f38957b |= 64;
                                    this.f38964i = c6992c.m13949k();
                                    continue;
                                case 66:
                                    if ((this.f38957b & BuildConfig.SDK_TRUNCATE_LENGTH) == 128) {
                                        ProtoBuf$Annotation protoBuf$Annotation = this.f38965j;
                                        protoBuf$Annotation.getClass();
                                        c6913b = new C6913b();
                                        c6913b.m13800m(protoBuf$Annotation);
                                    } else {
                                        c6913b = null;
                                    }
                                    ProtoBuf$Annotation protoBuf$Annotation2 = (ProtoBuf$Annotation) c6992c.m13945g(ProtoBuf$Annotation.f38936h, c6993d);
                                    this.f38965j = protoBuf$Annotation2;
                                    if (c6913b != null) {
                                        c6913b.m13800m(protoBuf$Annotation2);
                                        this.f38965j = c6913b.m13799k();
                                    }
                                    this.f38957b |= BuildConfig.SDK_TRUNCATE_LENGTH;
                                    continue;
                                case 74:
                                    if ((i10 & 256) != 256) {
                                        this.f38966k = new ArrayList();
                                        i10 |= 256;
                                    }
                                    this.f38966k.add((Value) c6992c.m13945g(f38952L, c6993d));
                                    continue;
                                case 80:
                                    this.f38957b |= 512;
                                    this.f38953H = c6992c.m13949k();
                                    continue;
                                case ModuleDescriptor.MODULE_VERSION /* 88 */:
                                    this.f38957b |= 256;
                                    this.f38967l = c6992c.m13949k();
                                    continue;
                                default:
                                    if (!c6992c.m13955q(iM13952n, codedOutputStreamM13901j)) {
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
                        if ((i10 & 256) == 256) {
                            this.f38966k = Collections.unmodifiableList(this.f38966k);
                        }
                        try {
                            codedOutputStreamM13901j.m13902i();
                        } catch (IOException unused) {
                        } catch (Throwable th3) {
                            this.f38956a = bVar.m15533l();
                            throw th3;
                        }
                        this.f38956a = bVar.m15533l();
                        throw th2;
                    }
                }
                if ((i10 & 256) == 256) {
                    this.f38966k = Collections.unmodifiableList(this.f38966k);
                }
                try {
                    codedOutputStreamM13901j.m13902i();
                } catch (IOException unused2) {
                } catch (Throwable th4) {
                    this.f38956a = bVar.m15533l();
                    throw th4;
                }
                this.f38956a = bVar.m15533l();
            }

            @Override // p282nn.InterfaceC7808f
            /* JADX INFO: renamed from: b */
            public final boolean mo13780b() {
                byte b10 = this.f38954I;
                if (b10 == 1) {
                    return true;
                }
                if (b10 == 0) {
                    return false;
                }
                if (((this.f38957b & BuildConfig.SDK_TRUNCATE_LENGTH) == 128) && !this.f38965j.mo13780b()) {
                    this.f38954I = (byte) 0;
                    return false;
                }
                for (int i10 = 0; i10 < this.f38966k.size(); i10++) {
                    if (!this.f38966k.get(i10).mo13780b()) {
                        this.f38954I = (byte) 0;
                        return false;
                    }
                }
                this.f38954I = (byte) 1;
                return true;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC6997h
            /* JADX INFO: renamed from: c */
            public final InterfaceC6997h.a mo13781c() {
                C6909b c6909b = new C6909b();
                c6909b.m13794m(this);
                return c6909b;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC6997h
            /* JADX INFO: renamed from: d */
            public final int mo13782d() {
                int i10 = this.f38955J;
                if (i10 != -1) {
                    return i10;
                }
                int iM13893a = (this.f38957b & 1) == 1 ? CodedOutputStream.m13893a(1, this.f38958c.getNumber()) + 0 : 0;
                if ((this.f38957b & 2) == 2) {
                    long j10 = this.f38959d;
                    iM13893a += CodedOutputStream.m13899g((j10 >> 63) ^ (j10 << 1)) + CodedOutputStream.m13900h(2);
                }
                if ((this.f38957b & 4) == 4) {
                    iM13893a += CodedOutputStream.m13900h(3) + 4;
                }
                if ((this.f38957b & 8) == 8) {
                    iM13893a += CodedOutputStream.m13900h(4) + 8;
                }
                if ((this.f38957b & 16) == 16) {
                    iM13893a += CodedOutputStream.m13894b(5, this.f38962g);
                }
                if ((this.f38957b & 32) == 32) {
                    iM13893a += CodedOutputStream.m13894b(6, this.f38963h);
                }
                if ((this.f38957b & 64) == 64) {
                    iM13893a += CodedOutputStream.m13894b(7, this.f38964i);
                }
                if ((this.f38957b & BuildConfig.SDK_TRUNCATE_LENGTH) == 128) {
                    iM13893a += CodedOutputStream.m13896d(8, this.f38965j);
                }
                for (int i11 = 0; i11 < this.f38966k.size(); i11++) {
                    iM13893a += CodedOutputStream.m13896d(9, this.f38966k.get(i11));
                }
                if ((this.f38957b & 512) == 512) {
                    iM13893a += CodedOutputStream.m13894b(10, this.f38953H);
                }
                if ((this.f38957b & 256) == 256) {
                    iM13893a += CodedOutputStream.m13894b(11, this.f38967l);
                }
                int size = this.f38956a.size() + iM13893a;
                this.f38955J = size;
                return size;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC6997h
            /* JADX INFO: renamed from: e */
            public final InterfaceC6997h.a mo13783e() {
                return new C6909b();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC6997h
            /* JADX INFO: renamed from: j */
            public final void mo13784j(CodedOutputStream codedOutputStream) throws IOException {
                mo13782d();
                if ((this.f38957b & 1) == 1) {
                    codedOutputStream.m13904l(1, this.f38958c.getNumber());
                }
                if ((this.f38957b & 2) == 2) {
                    long j10 = this.f38959d;
                    codedOutputStream.m13916x(2, 0);
                    codedOutputStream.m13915w((j10 >> 63) ^ (j10 << 1));
                }
                if ((this.f38957b & 4) == 4) {
                    float f3 = this.f38960e;
                    codedOutputStream.m13916x(3, 5);
                    codedOutputStream.m13912t(Float.floatToRawIntBits(f3));
                }
                if ((this.f38957b & 8) == 8) {
                    double d10 = this.f38961f;
                    codedOutputStream.m13916x(4, 1);
                    codedOutputStream.m13913u(Double.doubleToRawLongBits(d10));
                }
                if ((this.f38957b & 16) == 16) {
                    codedOutputStream.m13905m(5, this.f38962g);
                }
                if ((this.f38957b & 32) == 32) {
                    codedOutputStream.m13905m(6, this.f38963h);
                }
                if ((this.f38957b & 64) == 64) {
                    codedOutputStream.m13905m(7, this.f38964i);
                }
                if ((this.f38957b & BuildConfig.SDK_TRUNCATE_LENGTH) == 128) {
                    codedOutputStream.m13907o(8, this.f38965j);
                }
                for (int i10 = 0; i10 < this.f38966k.size(); i10++) {
                    codedOutputStream.m13907o(9, this.f38966k.get(i10));
                }
                if ((this.f38957b & 512) == 512) {
                    codedOutputStream.m13905m(10, this.f38953H);
                }
                if ((this.f38957b & 256) == 256) {
                    codedOutputStream.m13905m(11, this.f38967l);
                }
                codedOutputStream.m13910r(this.f38956a);
            }

            /* JADX INFO: renamed from: n */
            public final void m13785n() {
                this.f38958c = Type.BYTE;
                this.f38959d = 0L;
                this.f38960e = 0.0f;
                this.f38961f = 0.0d;
                this.f38962g = 0;
                this.f38963h = 0;
                this.f38964i = 0;
                this.f38965j = ProtoBuf$Annotation.f38935g;
                this.f38966k = Collections.emptyList();
                this.f38967l = 0;
                this.f38953H = 0;
            }
        }

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument$a */
        public static class C6910a extends AbstractC6991b<Argument> {
            @Override // p282nn.InterfaceC7809g
            /* JADX INFO: renamed from: a */
            public final Object mo13787a(C6992c c6992c, C6993d c6993d) throws InvalidProtocolBufferException {
                return new Argument(c6992c, c6993d);
            }
        }

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument$b */
        public static final class C6911b extends GeneratedMessageLite.AbstractC6982b<Argument, C6911b> implements InterfaceC7808f {

            /* JADX INFO: renamed from: b */
            public int f38980b;

            /* JADX INFO: renamed from: c */
            public int f38981c;

            /* JADX INFO: renamed from: d */
            public Value f38982d = Value.f38951K;

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC6990a.a, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC6997h.a
            /* JADX INFO: renamed from: Q */
            public final /* bridge */ /* synthetic */ InterfaceC6997h.a mo13788Q(C6992c c6992c, C6993d c6993d) throws Throwable {
                m13798n(c6992c, c6993d);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC6997h.a
            /* JADX INFO: renamed from: a */
            public final InterfaceC6997h mo13789a() {
                Argument argumentM13796k = m13796k();
                if (argumentM13796k.mo13780b()) {
                    return argumentM13796k;
                }
                throw new UninitializedMessageException();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.AbstractC6982b
            public final Object clone() throws CloneNotSupportedException {
                C6911b c6911b = new C6911b();
                c6911b.m13797m(m13796k());
                return c6911b;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC6990a.a
            /* JADX INFO: renamed from: f */
            public final /* bridge */ /* synthetic */ AbstractC6990a.a mo13788Q(C6992c c6992c, C6993d c6993d) throws Throwable {
                m13798n(c6992c, c6993d);
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.AbstractC6982b
            /* JADX INFO: renamed from: g */
            public final GeneratedMessageLite.AbstractC6982b clone() {
                C6911b c6911b = new C6911b();
                c6911b.m13797m(m13796k());
                return c6911b;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.AbstractC6982b
            /* JADX INFO: renamed from: i */
            public final /* bridge */ /* synthetic */ GeneratedMessageLite.AbstractC6982b mo13792i(GeneratedMessageLite generatedMessageLite) {
                m13797m((Argument) generatedMessageLite);
                return this;
            }

            /* JADX INFO: renamed from: k */
            public final Argument m13796k() {
                Argument argument = new Argument(this);
                int i10 = this.f38980b;
                int i11 = (i10 & 1) != 1 ? 0 : 1;
                argument.f38947c = this.f38981c;
                if ((i10 & 2) == 2) {
                    i11 |= 2;
                }
                argument.f38948d = this.f38982d;
                argument.f38946b = i11;
                return argument;
            }

            /* JADX INFO: renamed from: m */
            public final void m13797m(Argument argument) {
                Value value;
                if (argument == Argument.f38943g) {
                    return;
                }
                int i10 = argument.f38946b;
                boolean z10 = false;
                if ((i10 & 1) == 1) {
                    int i11 = argument.f38947c;
                    this.f38980b |= 1;
                    this.f38981c = i11;
                }
                if ((i10 & 2) == 2) {
                    z10 = true;
                }
                if (z10) {
                    Value value2 = argument.f38948d;
                    if ((this.f38980b & 2) != 2 || (value = this.f38982d) == Value.f38951K) {
                        this.f38982d = value2;
                    } else {
                        Value.C6909b c6909b = new Value.C6909b();
                        c6909b.m13794m(value);
                        c6909b.m13794m(value2);
                        this.f38982d = c6909b.m13793k();
                    }
                    this.f38980b |= 2;
                }
                this.f39493a = this.f39493a.m15519f(argument.f38945a);
            }

            /* JADX WARN: Code duplicated, block: B:16:0x0020  */
            /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
            /* JADX INFO: renamed from: n */
            public final void m13798n(C6992c c6992c, C6993d c6993d) throws Throwable {
                Argument argument;
                try {
                    try {
                        Argument.f38944h.getClass();
                        m13797m(new Argument(c6992c, c6993d));
                    } catch (InvalidProtocolBufferException e10) {
                        argument = (Argument) e10.f39506a;
                        try {
                            throw e10;
                        } catch (Throwable th2) {
                            th = th2;
                            if (argument != null) {
                                m13797m(argument);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    argument = null;
                    if (argument != null) {
                        m13797m(argument);
                    }
                    throw th;
                }
            }
        }

        static {
            Argument argument = new Argument();
            f38943g = argument;
            argument.f38947c = 0;
            argument.f38948d = Value.f38951K;
        }

        public Argument() {
            this.f38949e = (byte) -1;
            this.f38950f = -1;
            this.f38945a = AbstractC7803a.f42882a;
        }

        public Argument(GeneratedMessageLite.AbstractC6982b abstractC6982b) {
            super(0);
            this.f38949e = (byte) -1;
            this.f38950f = -1;
            this.f38945a = abstractC6982b.f39493a;
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        public Argument(C6992c c6992c, C6993d c6993d) throws InvalidProtocolBufferException {
            Value.C6909b c6909b;
            this.f38949e = (byte) -1;
            this.f38950f = -1;
            boolean z10 = false;
            this.f38947c = 0;
            this.f38948d = Value.f38951K;
            AbstractC7803a.b bVar = new AbstractC7803a.b();
            CodedOutputStream codedOutputStreamM13901j = CodedOutputStream.m13901j(bVar, 1);
            while (!z10) {
                try {
                    try {
                        try {
                            int iM13952n = c6992c.m13952n();
                            if (iM13952n != 0) {
                                if (iM13952n == 8) {
                                    this.f38946b |= 1;
                                    this.f38947c = c6992c.m13949k();
                                } else if (iM13952n == 18) {
                                    if ((this.f38946b & 2) == 2) {
                                        Value value = this.f38948d;
                                        value.getClass();
                                        c6909b = new Value.C6909b();
                                        c6909b.m13794m(value);
                                    } else {
                                        c6909b = null;
                                    }
                                    Value value2 = (Value) c6992c.m13945g(Value.f38952L, c6993d);
                                    this.f38948d = value2;
                                    if (c6909b != null) {
                                        c6909b.m13794m(value2);
                                        this.f38948d = c6909b.m13793k();
                                    }
                                    this.f38946b |= 2;
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
                        this.f38945a = bVar.m15533l();
                        throw th3;
                    }
                    this.f38945a = bVar.m15533l();
                    throw th2;
                }
            }
            try {
                codedOutputStreamM13901j.m13902i();
            } catch (IOException unused2) {
            } finally {
                this.f38945a = bVar.m15533l();
            }
        }

        @Override // p282nn.InterfaceC7808f
        /* JADX INFO: renamed from: b */
        public final boolean mo13780b() {
            byte b10 = this.f38949e;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            int i10 = this.f38946b;
            if (!((i10 & 1) == 1)) {
                this.f38949e = (byte) 0;
                return false;
            }
            if (!((i10 & 2) == 2)) {
                this.f38949e = (byte) 0;
                return false;
            }
            if (this.f38948d.mo13780b()) {
                this.f38949e = (byte) 1;
                return true;
            }
            this.f38949e = (byte) 0;
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC6997h
        /* JADX INFO: renamed from: c */
        public final InterfaceC6997h.a mo13781c() {
            C6911b c6911b = new C6911b();
            c6911b.m13797m(this);
            return c6911b;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC6997h
        /* JADX INFO: renamed from: d */
        public final int mo13782d() {
            int i10 = this.f38950f;
            if (i10 != -1) {
                return i10;
            }
            int iM13896d = 0;
            if ((this.f38946b & 1) == 1) {
                iM13896d = 0 + CodedOutputStream.m13894b(1, this.f38947c);
            }
            if ((this.f38946b & 2) == 2) {
                iM13896d += CodedOutputStream.m13896d(2, this.f38948d);
            }
            int size = this.f38945a.size() + iM13896d;
            this.f38950f = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC6997h
        /* JADX INFO: renamed from: e */
        public final InterfaceC6997h.a mo13783e() {
            return new C6911b();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC6997h
        /* JADX INFO: renamed from: j */
        public final void mo13784j(CodedOutputStream codedOutputStream) throws IOException {
            mo13782d();
            if ((this.f38946b & 1) == 1) {
                codedOutputStream.m13905m(1, this.f38947c);
            }
            if ((this.f38946b & 2) == 2) {
                codedOutputStream.m13907o(2, this.f38948d);
            }
            codedOutputStream.m13910r(this.f38945a);
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$a */
    public static class C6912a extends AbstractC6991b<ProtoBuf$Annotation> {
        @Override // p282nn.InterfaceC7809g
        /* JADX INFO: renamed from: a */
        public final Object mo13787a(C6992c c6992c, C6993d c6993d) throws InvalidProtocolBufferException {
            return new ProtoBuf$Annotation(c6992c, c6993d);
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$b */
    public static final class C6913b extends GeneratedMessageLite.AbstractC6982b<ProtoBuf$Annotation, C6913b> implements InterfaceC7808f {

        /* JADX INFO: renamed from: b */
        public int f38983b;

        /* JADX INFO: renamed from: c */
        public int f38984c;

        /* JADX INFO: renamed from: d */
        public List<Argument> f38985d = Collections.emptyList();

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC6990a.a, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC6997h.a
        /* JADX INFO: renamed from: Q */
        public final /* bridge */ /* synthetic */ InterfaceC6997h.a mo13788Q(C6992c c6992c, C6993d c6993d) throws Throwable {
            m13801n(c6992c, c6993d);
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC6997h.a
        /* JADX INFO: renamed from: a */
        public final InterfaceC6997h mo13789a() {
            ProtoBuf$Annotation protoBuf$AnnotationM13799k = m13799k();
            if (protoBuf$AnnotationM13799k.mo13780b()) {
                return protoBuf$AnnotationM13799k;
            }
            throw new UninitializedMessageException();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.AbstractC6982b
        public final Object clone() throws CloneNotSupportedException {
            C6913b c6913b = new C6913b();
            c6913b.m13800m(m13799k());
            return c6913b;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC6990a.a
        /* JADX INFO: renamed from: f */
        public final /* bridge */ /* synthetic */ AbstractC6990a.a mo13788Q(C6992c c6992c, C6993d c6993d) throws Throwable {
            m13801n(c6992c, c6993d);
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.AbstractC6982b
        /* JADX INFO: renamed from: g */
        public final GeneratedMessageLite.AbstractC6982b clone() {
            C6913b c6913b = new C6913b();
            c6913b.m13800m(m13799k());
            return c6913b;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.AbstractC6982b
        /* JADX INFO: renamed from: i */
        public final /* bridge */ /* synthetic */ GeneratedMessageLite.AbstractC6982b mo13792i(GeneratedMessageLite generatedMessageLite) {
            m13800m((ProtoBuf$Annotation) generatedMessageLite);
            return this;
        }

        /* JADX INFO: renamed from: k */
        public final ProtoBuf$Annotation m13799k() {
            ProtoBuf$Annotation protoBuf$Annotation = new ProtoBuf$Annotation(this);
            int i10 = this.f38983b;
            int i11 = 1;
            if ((i10 & 1) != 1) {
                i11 = 0;
            }
            protoBuf$Annotation.f38939c = this.f38984c;
            if ((i10 & 2) == 2) {
                this.f38985d = Collections.unmodifiableList(this.f38985d);
                this.f38983b &= -3;
            }
            protoBuf$Annotation.f38940d = this.f38985d;
            protoBuf$Annotation.f38938b = i11;
            return protoBuf$Annotation;
        }

        /* JADX INFO: renamed from: m */
        public final void m13800m(ProtoBuf$Annotation protoBuf$Annotation) {
            if (protoBuf$Annotation == ProtoBuf$Annotation.f38935g) {
                return;
            }
            if ((protoBuf$Annotation.f38938b & 1) == 1) {
                int i10 = protoBuf$Annotation.f38939c;
                this.f38983b = 1 | this.f38983b;
                this.f38984c = i10;
            }
            if (!protoBuf$Annotation.f38940d.isEmpty()) {
                if (this.f38985d.isEmpty()) {
                    this.f38985d = protoBuf$Annotation.f38940d;
                    this.f38983b &= -3;
                } else {
                    if ((this.f38983b & 2) != 2) {
                        this.f38985d = new ArrayList(this.f38985d);
                        this.f38983b |= 2;
                    }
                    this.f38985d.addAll(protoBuf$Annotation.f38940d);
                }
            }
            this.f39493a = this.f39493a.m15519f(protoBuf$Annotation.f38937a);
        }

        /* JADX WARN: Code duplicated, block: B:15:0x0020  */
        /* JADX INFO: renamed from: n */
        public final void m13801n(C6992c c6992c, C6993d c6993d) throws Throwable {
            ProtoBuf$Annotation protoBuf$Annotation;
            try {
                try {
                    m13800m((ProtoBuf$Annotation) ProtoBuf$Annotation.f38936h.mo13787a(c6992c, c6993d));
                } catch (InvalidProtocolBufferException e10) {
                    protoBuf$Annotation = (ProtoBuf$Annotation) e10.f39506a;
                    try {
                        throw e10;
                    } catch (Throwable th2) {
                        th = th2;
                        if (protoBuf$Annotation != null) {
                            m13800m(protoBuf$Annotation);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                protoBuf$Annotation = null;
                if (protoBuf$Annotation != null) {
                    m13800m(protoBuf$Annotation);
                }
                throw th;
            }
        }
    }

    static {
        ProtoBuf$Annotation protoBuf$Annotation = new ProtoBuf$Annotation();
        f38935g = protoBuf$Annotation;
        protoBuf$Annotation.f38939c = 0;
        protoBuf$Annotation.f38940d = Collections.emptyList();
    }

    public ProtoBuf$Annotation() {
        this.f38941e = (byte) -1;
        this.f38942f = -1;
        this.f38937a = AbstractC7803a.f42882a;
    }

    public ProtoBuf$Annotation(GeneratedMessageLite.AbstractC6982b abstractC6982b) {
        super(0);
        this.f38941e = (byte) -1;
        this.f38942f = -1;
        this.f38937a = abstractC6982b.f39493a;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    public ProtoBuf$Annotation(C6992c c6992c, C6993d c6993d) throws InvalidProtocolBufferException {
        this.f38941e = (byte) -1;
        this.f38942f = -1;
        boolean z10 = false;
        this.f38939c = 0;
        this.f38940d = Collections.emptyList();
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
                                this.f38938b |= 1;
                                this.f38939c = c6992c.m13949k();
                            } else if (iM13952n == 18) {
                                if ((i10 & 2) != 2) {
                                    this.f38940d = new ArrayList();
                                    i10 |= 2;
                                }
                                this.f38940d.add((Argument) c6992c.m13945g(Argument.f38944h, c6993d));
                            } else if (!c6992c.m13955q(iM13952n, codedOutputStreamM13901j)) {
                            }
                        }
                        z10 = true;
                    } catch (Throwable th2) {
                        if ((i10 & 2) == 2) {
                            this.f38940d = Collections.unmodifiableList(this.f38940d);
                        }
                        try {
                            codedOutputStreamM13901j.m13902i();
                        } catch (IOException unused) {
                        } finally {
                            this.f38937a = bVar.m15533l();
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
        if ((i10 & 2) == 2) {
            this.f38940d = Collections.unmodifiableList(this.f38940d);
        }
        try {
            codedOutputStreamM13901j.m13902i();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f38937a = bVar.m15533l();
            throw th3;
        }
        this.f38937a = bVar.m15533l();
    }

    @Override // p282nn.InterfaceC7808f
    /* JADX INFO: renamed from: b */
    public final boolean mo13780b() {
        byte b10 = this.f38941e;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        if (!((this.f38938b & 1) == 1)) {
            this.f38941e = (byte) 0;
            return false;
        }
        for (int i10 = 0; i10 < this.f38940d.size(); i10++) {
            if (!this.f38940d.get(i10).mo13780b()) {
                this.f38941e = (byte) 0;
                return false;
            }
        }
        this.f38941e = (byte) 1;
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC6997h
    /* JADX INFO: renamed from: c */
    public final InterfaceC6997h.a mo13781c() {
        C6913b c6913b = new C6913b();
        c6913b.m13800m(this);
        return c6913b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC6997h
    /* JADX INFO: renamed from: d */
    public final int mo13782d() {
        int i10 = this.f38942f;
        if (i10 != -1) {
            return i10;
        }
        int iM13894b = (this.f38938b & 1) == 1 ? CodedOutputStream.m13894b(1, this.f38939c) + 0 : 0;
        for (int i11 = 0; i11 < this.f38940d.size(); i11++) {
            iM13894b += CodedOutputStream.m13896d(2, this.f38940d.get(i11));
        }
        int size = this.f38937a.size() + iM13894b;
        this.f38942f = size;
        return size;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC6997h
    /* JADX INFO: renamed from: e */
    public final InterfaceC6997h.a mo13783e() {
        return new C6913b();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC6997h
    /* JADX INFO: renamed from: j */
    public final void mo13784j(CodedOutputStream codedOutputStream) throws IOException {
        mo13782d();
        if ((this.f38938b & 1) == 1) {
            codedOutputStream.m13905m(1, this.f38939c);
        }
        for (int i10 = 0; i10 < this.f38940d.size(); i10++) {
            codedOutputStream.m13907o(2, this.f38940d.get(i10));
        }
        codedOutputStream.m13910r(this.f38937a);
    }
}
