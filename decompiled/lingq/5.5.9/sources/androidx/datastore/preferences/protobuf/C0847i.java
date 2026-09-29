package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.PreferencesProto$Value;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.i */
/* JADX INFO: loaded from: classes.dex */
public final class C0847i implements InterfaceC0874v0 {

    /* JADX INFO: renamed from: a */
    public final AbstractC0845h f5876a;

    /* JADX INFO: renamed from: b */
    public int f5877b;

    /* JADX INFO: renamed from: c */
    public int f5878c;

    /* JADX INFO: renamed from: d */
    public int f5879d = 0;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.i$a */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f5880a;

        static {
            int[] iArr = new int[WireFormat$FieldType.values().length];
            f5880a = iArr;
            try {
                iArr[WireFormat$FieldType.BOOL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5880a[WireFormat$FieldType.BYTES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f5880a[WireFormat$FieldType.DOUBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f5880a[WireFormat$FieldType.ENUM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f5880a[WireFormat$FieldType.FIXED32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f5880a[WireFormat$FieldType.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f5880a[WireFormat$FieldType.FLOAT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f5880a[WireFormat$FieldType.INT32.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f5880a[WireFormat$FieldType.INT64.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f5880a[WireFormat$FieldType.MESSAGE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f5880a[WireFormat$FieldType.SFIXED32.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f5880a[WireFormat$FieldType.SFIXED64.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f5880a[WireFormat$FieldType.SINT32.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f5880a[WireFormat$FieldType.SINT64.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f5880a[WireFormat$FieldType.STRING.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f5880a[WireFormat$FieldType.UINT32.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f5880a[WireFormat$FieldType.UINT64.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    public C0847i(AbstractC0845h abstractC0845h) {
        Charset charset = C0871u.f5935a;
        if (abstractC0845h == null) {
            throw new NullPointerException("input");
        }
        this.f5876a = abstractC0845h;
        abstractC0845h.f5860d = this;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0874v0
    /* JADX INFO: renamed from: A */
    public final void mo3296A(List<String> list) throws IOException {
        m3313R(list, true);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0874v0
    /* JADX INFO: renamed from: B */
    public final ByteString mo3297B() throws IOException {
        m3315T(2);
        return this.f5876a.mo3260g();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // androidx.datastore.preferences.protobuf.InterfaceC0874v0
    /* JADX INFO: renamed from: C */
    public final void mo3298C(List<Float> list) throws IOException {
        int iMo3274u;
        int iMo3274u2;
        boolean z10 = list instanceof C0865r;
        AbstractC0845h abstractC0845h = this.f5876a;
        if (!z10) {
            int i10 = this.f5877b & 7;
            if (i10 == 2) {
                int iMo3275v = abstractC0845h.mo3275v();
                m3316U(iMo3275v);
                int iMo3255b = abstractC0845h.mo3255b() + iMo3275v;
                do {
                    list.add(Float.valueOf(abstractC0845h.mo3265l()));
                } while (abstractC0845h.mo3255b() < iMo3255b);
                return;
            }
            if (i10 != 5) {
                throw InvalidProtocolBufferException.m3144b();
            }
            do {
                list.add(Float.valueOf(abstractC0845h.mo3265l()));
                if (abstractC0845h.mo3256c()) {
                    return;
                } else {
                    iMo3274u = abstractC0845h.mo3274u();
                }
            } while (iMo3274u == this.f5877b);
            this.f5879d = iMo3274u;
            return;
        }
        C0865r c0865r = (C0865r) list;
        int i11 = this.f5877b & 7;
        if (i11 == 2) {
            int iMo3275v2 = abstractC0845h.mo3275v();
            m3316U(iMo3275v2);
            int iMo3255b2 = abstractC0845h.mo3255b() + iMo3275v2;
            do {
                c0865r.m3434f(abstractC0845h.mo3265l());
            } while (abstractC0845h.mo3255b() < iMo3255b2);
            return;
        }
        if (i11 != 5) {
            throw InvalidProtocolBufferException.m3144b();
        }
        do {
            c0865r.m3434f(abstractC0845h.mo3265l());
            if (abstractC0845h.mo3256c()) {
                return;
            } else {
                iMo3274u2 = abstractC0845h.mo3274u();
            }
        } while (iMo3274u2 == this.f5877b);
        this.f5879d = iMo3274u2;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0874v0
    /* JADX INFO: renamed from: D */
    public final int mo3299D() throws IOException {
        m3315T(0);
        return this.f5876a.mo3266m();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // androidx.datastore.preferences.protobuf.InterfaceC0874v0
    /* JADX INFO: renamed from: E */
    public final <T> void mo3300E(List<T> list, InterfaceC0876w0<T> interfaceC0876w0, C0855m c0855m) throws IOException {
        int iMo3274u;
        int i10 = this.f5877b;
        if ((i10 & 7) != 3) {
            int i11 = InvalidProtocolBufferException.f5813a;
            throw new InvalidProtocolBufferException.InvalidWireTypeException();
        }
        do {
            list.add(m3311P(interfaceC0876w0, c0855m));
            AbstractC0845h abstractC0845h = this.f5876a;
            if (!abstractC0845h.mo3256c() && this.f5879d == 0) {
                iMo3274u = abstractC0845h.mo3274u();
            }
            return;
        } while (iMo3274u == i10);
        this.f5879d = iMo3274u;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0874v0
    /* JADX INFO: renamed from: F */
    public final boolean mo3301F() throws IOException {
        int i10;
        AbstractC0845h abstractC0845h = this.f5876a;
        if (!abstractC0845h.mo3256c() && (i10 = this.f5877b) != this.f5878c) {
            return abstractC0845h.mo3277x(i10);
        }
        return false;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0874v0
    /* JADX INFO: renamed from: G */
    public final int mo3302G() throws IOException {
        m3315T(5);
        return this.f5876a.mo3268o();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // androidx.datastore.preferences.protobuf.InterfaceC0874v0
    /* JADX INFO: renamed from: H */
    public final void mo3303H(List<ByteString> list) throws IOException {
        int iMo3274u;
        if ((this.f5877b & 7) != 2) {
            throw InvalidProtocolBufferException.m3144b();
        }
        do {
            list.add(mo3297B());
            AbstractC0845h abstractC0845h = this.f5876a;
            if (abstractC0845h.mo3256c()) {
                return;
            } else {
                iMo3274u = abstractC0845h.mo3274u();
            }
        } while (iMo3274u == this.f5877b);
        this.f5879d = iMo3274u;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // androidx.datastore.preferences.protobuf.InterfaceC0874v0
    /* JADX INFO: renamed from: I */
    public final void mo3304I(List<Double> list) throws IOException {
        int iMo3274u;
        int iMo3274u2;
        boolean z10 = list instanceof C0851k;
        AbstractC0845h abstractC0845h = this.f5876a;
        if (!z10) {
            int i10 = this.f5877b & 7;
            if (i10 == 1) {
                do {
                    list.add(Double.valueOf(abstractC0845h.mo3261h()));
                    if (abstractC0845h.mo3256c()) {
                        return;
                    } else {
                        iMo3274u = abstractC0845h.mo3274u();
                    }
                } while (iMo3274u == this.f5877b);
                this.f5879d = iMo3274u;
                return;
            }
            if (i10 != 2) {
                throw InvalidProtocolBufferException.m3144b();
            }
            int iMo3275v = abstractC0845h.mo3275v();
            m3317V(iMo3275v);
            int iMo3255b = abstractC0845h.mo3255b() + iMo3275v;
            do {
                list.add(Double.valueOf(abstractC0845h.mo3261h()));
            } while (abstractC0845h.mo3255b() < iMo3255b);
            return;
        }
        C0851k c0851k = (C0851k) list;
        int i11 = this.f5877b & 7;
        if (i11 == 1) {
            do {
                c0851k.m3362f(abstractC0845h.mo3261h());
                if (abstractC0845h.mo3256c()) {
                    return;
                } else {
                    iMo3274u2 = abstractC0845h.mo3274u();
                }
            } while (iMo3274u2 == this.f5877b);
            this.f5879d = iMo3274u2;
            return;
        }
        if (i11 != 2) {
            throw InvalidProtocolBufferException.m3144b();
        }
        int iMo3275v2 = abstractC0845h.mo3275v();
        m3317V(iMo3275v2);
        int iMo3255b2 = abstractC0845h.mo3255b() + iMo3275v2;
        do {
            c0851k.m3362f(abstractC0845h.mo3261h());
        } while (abstractC0845h.mo3255b() < iMo3255b2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // androidx.datastore.preferences.protobuf.InterfaceC0874v0
    /* JADX INFO: renamed from: J */
    public final <T> void mo3305J(List<T> list, InterfaceC0876w0<T> interfaceC0876w0, C0855m c0855m) throws IOException {
        int iMo3274u;
        int i10 = this.f5877b;
        if ((i10 & 7) != 2) {
            int i11 = InvalidProtocolBufferException.f5813a;
            throw new InvalidProtocolBufferException.InvalidWireTypeException();
        }
        do {
            list.add(m3312Q(interfaceC0876w0, c0855m));
            AbstractC0845h abstractC0845h = this.f5876a;
            if (!abstractC0845h.mo3256c()) {
                if (this.f5879d != 0) {
                    return;
                } else {
                    iMo3274u = abstractC0845h.mo3274u();
                }
            }
        } while (iMo3274u == i10);
        this.f5879d = iMo3274u;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0874v0
    /* JADX INFO: renamed from: K */
    public final long mo3306K() throws IOException {
        m3315T(0);
        return this.f5876a.mo3267n();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0874v0
    /* JADX INFO: renamed from: L */
    public final String mo3307L() throws IOException {
        m3315T(2);
        return this.f5876a.mo3273t();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // androidx.datastore.preferences.protobuf.InterfaceC0874v0
    /* JADX INFO: renamed from: M */
    public final void mo3308M(List<Long> list) throws IOException {
        int iMo3274u;
        int iMo3274u2;
        boolean z10 = list instanceof C0825a0;
        AbstractC0845h abstractC0845h = this.f5876a;
        if (!z10) {
            int i10 = this.f5877b & 7;
            if (i10 == 1) {
                do {
                    list.add(Long.valueOf(abstractC0845h.mo3264k()));
                    if (abstractC0845h.mo3256c()) {
                        return;
                    } else {
                        iMo3274u = abstractC0845h.mo3274u();
                    }
                } while (iMo3274u == this.f5877b);
                this.f5879d = iMo3274u;
                return;
            }
            if (i10 != 2) {
                throw InvalidProtocolBufferException.m3144b();
            }
            int iMo3275v = abstractC0845h.mo3275v();
            m3317V(iMo3275v);
            int iMo3255b = abstractC0845h.mo3255b() + iMo3275v;
            do {
                list.add(Long.valueOf(abstractC0845h.mo3264k()));
            } while (abstractC0845h.mo3255b() < iMo3255b);
            return;
        }
        C0825a0 c0825a0 = (C0825a0) list;
        int i11 = this.f5877b & 7;
        if (i11 == 1) {
            do {
                c0825a0.m3166f(abstractC0845h.mo3264k());
                if (abstractC0845h.mo3256c()) {
                    return;
                } else {
                    iMo3274u2 = abstractC0845h.mo3274u();
                }
            } while (iMo3274u2 == this.f5877b);
            this.f5879d = iMo3274u2;
            return;
        }
        if (i11 != 2) {
            throw InvalidProtocolBufferException.m3144b();
        }
        int iMo3275v2 = abstractC0845h.mo3275v();
        m3317V(iMo3275v2);
        int iMo3255b2 = abstractC0845h.mo3255b() + iMo3275v2;
        do {
            c0825a0.m3166f(abstractC0845h.mo3264k());
        } while (abstractC0845h.mo3255b() < iMo3255b2);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0874v0
    /* JADX INFO: renamed from: N */
    public final <T> T mo3309N(InterfaceC0876w0<T> interfaceC0876w0, C0855m c0855m) throws IOException {
        m3315T(3);
        return (T) m3311P(interfaceC0876w0, c0855m);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: O */
    public final Object m3310O(WireFormat$FieldType wireFormat$FieldType, Class<?> cls, C0855m c0855m) throws IOException {
        switch (a.f5880a[wireFormat$FieldType.ordinal()]) {
            case 1:
                return Boolean.valueOf(mo3327j());
            case 2:
                return mo3297B();
            case 3:
                return Double.valueOf(readDouble());
            case 4:
                return Integer.valueOf(mo3336s());
            case 5:
                return Integer.valueOf(mo3326i());
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                return Long.valueOf(mo3321d());
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                return Float.valueOf(readFloat());
            case 8:
                return Integer.valueOf(mo3299D());
            case 9:
                return Long.valueOf(mo3306K());
            case 10:
                m3315T(2);
                return m3312Q(C0868s0.f5927c.m3436a(cls), c0855m);
            case 11:
                return Integer.valueOf(mo3302G());
            case 12:
                return Long.valueOf(mo3328k());
            case 13:
                return Integer.valueOf(mo3338u());
            case 14:
                return Long.valueOf(mo3339v());
            case 15:
                return mo3307L();
            case 16:
                return Integer.valueOf(mo3330m());
            case 17:
                return Long.valueOf(mo3320c());
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    /* JADX INFO: renamed from: P */
    public final <T> T m3311P(InterfaceC0876w0<T> interfaceC0876w0, C0855m c0855m) throws IOException {
        int i10 = this.f5878c;
        this.f5878c = ((this.f5877b >>> 3) << 3) | 4;
        try {
            T tMo3392h = interfaceC0876w0.mo3392h();
            interfaceC0876w0.mo3386b(tMo3392h, this, c0855m);
            interfaceC0876w0.mo3387c(tMo3392h);
            if (this.f5877b != this.f5878c) {
                throw InvalidProtocolBufferException.m3147e();
            }
            this.f5878c = i10;
            return tMo3392h;
        } catch (Throwable th2) {
            this.f5878c = i10;
            throw th2;
        }
    }

    /* JADX INFO: renamed from: Q */
    public final <T> T m3312Q(InterfaceC0876w0<T> interfaceC0876w0, C0855m c0855m) throws IOException {
        AbstractC0845h abstractC0845h = this.f5876a;
        int iMo3275v = abstractC0845h.mo3275v();
        if (abstractC0845h.f5857a >= abstractC0845h.f5858b) {
            throw new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        int iMo3258e = abstractC0845h.mo3258e(iMo3275v);
        T tMo3392h = interfaceC0876w0.mo3392h();
        abstractC0845h.f5857a++;
        interfaceC0876w0.mo3386b(tMo3392h, this, c0855m);
        interfaceC0876w0.mo3387c(tMo3392h);
        abstractC0845h.mo3254a(0);
        abstractC0845h.f5857a--;
        abstractC0845h.mo3257d(iMo3258e);
        return tMo3392h;
    }

    /* JADX INFO: renamed from: R */
    public final void m3313R(List<String> list, boolean z10) throws IOException {
        int iMo3274u;
        int iMo3274u2;
        if ((this.f5877b & 7) != 2) {
            throw InvalidProtocolBufferException.m3144b();
        }
        boolean z11 = list instanceof InterfaceC0879y;
        AbstractC0845h abstractC0845h = this.f5876a;
        if (!z11 || z10) {
            do {
                list.add(z10 ? mo3307L() : mo3341x());
                if (abstractC0845h.mo3256c()) {
                    return;
                } else {
                    iMo3274u = abstractC0845h.mo3274u();
                }
            } while (iMo3274u == this.f5877b);
            this.f5879d = iMo3274u;
            return;
        }
        InterfaceC0879y interfaceC0879y = (InterfaceC0879y) list;
        do {
            interfaceC0879y.mo3211J(mo3297B());
            if (abstractC0845h.mo3256c()) {
                return;
            } else {
                iMo3274u2 = abstractC0845h.mo3274u();
            }
        } while (iMo3274u2 == this.f5877b);
        this.f5879d = iMo3274u2;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: S */
    public final void m3314S(int i10) throws IOException {
        if (this.f5876a.mo3255b() != i10) {
            throw InvalidProtocolBufferException.m3148h();
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: T */
    public final void m3315T(int i10) throws IOException {
        if ((this.f5877b & 7) != i10) {
            throw InvalidProtocolBufferException.m3144b();
        }
    }

    /* JADX INFO: renamed from: U */
    public final void m3316U(int i10) throws IOException {
        if ((i10 & 3) != 0) {
            throw InvalidProtocolBufferException.m3147e();
        }
    }

    /* JADX INFO: renamed from: V */
    public final void m3317V(int i10) throws IOException {
        if ((i10 & 7) != 0) {
            throw InvalidProtocolBufferException.m3147e();
        }
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0874v0
    /* JADX INFO: renamed from: a */
    public final <T> T mo3318a(InterfaceC0876w0<T> interfaceC0876w0, C0855m c0855m) throws IOException {
        m3315T(2);
        return (T) m3312Q(interfaceC0876w0, c0855m);
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // androidx.datastore.preferences.protobuf.InterfaceC0874v0
    /* JADX INFO: renamed from: b */
    public final void mo3319b(List<Integer> list) throws IOException {
        int iMo3274u;
        int iMo3274u2;
        boolean z10 = list instanceof C0869t;
        AbstractC0845h abstractC0845h = this.f5876a;
        if (!z10) {
            int i10 = this.f5877b & 7;
            if (i10 == 0) {
                do {
                    list.add(Integer.valueOf(abstractC0845h.mo3270q()));
                    if (abstractC0845h.mo3256c()) {
                        return;
                    } else {
                        iMo3274u = abstractC0845h.mo3274u();
                    }
                } while (iMo3274u == this.f5877b);
                this.f5879d = iMo3274u;
                return;
            }
            if (i10 != 2) {
                throw InvalidProtocolBufferException.m3144b();
            }
            int iMo3255b = abstractC0845h.mo3255b() + abstractC0845h.mo3275v();
            do {
                list.add(Integer.valueOf(abstractC0845h.mo3270q()));
            } while (abstractC0845h.mo3255b() < iMo3255b);
            m3314S(iMo3255b);
            return;
        }
        C0869t c0869t = (C0869t) list;
        int i11 = this.f5877b & 7;
        if (i11 == 0) {
            do {
                c0869t.m3437f(abstractC0845h.mo3270q());
                if (abstractC0845h.mo3256c()) {
                    return;
                } else {
                    iMo3274u2 = abstractC0845h.mo3274u();
                }
            } while (iMo3274u2 == this.f5877b);
            this.f5879d = iMo3274u2;
            return;
        }
        if (i11 != 2) {
            throw InvalidProtocolBufferException.m3144b();
        }
        int iMo3255b2 = abstractC0845h.mo3255b() + abstractC0845h.mo3275v();
        do {
            c0869t.m3437f(abstractC0845h.mo3270q());
        } while (abstractC0845h.mo3255b() < iMo3255b2);
        m3314S(iMo3255b2);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0874v0
    /* JADX INFO: renamed from: c */
    public final long mo3320c() throws IOException {
        m3315T(0);
        return this.f5876a.mo3276w();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0874v0
    /* JADX INFO: renamed from: d */
    public final long mo3321d() throws IOException {
        m3315T(1);
        return this.f5876a.mo3264k();
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // androidx.datastore.preferences.protobuf.InterfaceC0874v0
    /* JADX INFO: renamed from: e */
    public final void mo3322e(List<Integer> list) throws IOException {
        int iMo3274u;
        int iMo3274u2;
        boolean z10 = list instanceof C0869t;
        AbstractC0845h abstractC0845h = this.f5876a;
        if (!z10) {
            int i10 = this.f5877b & 7;
            if (i10 == 2) {
                int iMo3275v = abstractC0845h.mo3275v();
                m3316U(iMo3275v);
                int iMo3255b = abstractC0845h.mo3255b() + iMo3275v;
                do {
                    list.add(Integer.valueOf(abstractC0845h.mo3268o()));
                } while (abstractC0845h.mo3255b() < iMo3255b);
                return;
            }
            if (i10 != 5) {
                throw InvalidProtocolBufferException.m3144b();
            }
            do {
                list.add(Integer.valueOf(abstractC0845h.mo3268o()));
                if (abstractC0845h.mo3256c()) {
                    return;
                } else {
                    iMo3274u = abstractC0845h.mo3274u();
                }
            } while (iMo3274u == this.f5877b);
            this.f5879d = iMo3274u;
            return;
        }
        C0869t c0869t = (C0869t) list;
        int i11 = this.f5877b & 7;
        if (i11 == 2) {
            int iMo3275v2 = abstractC0845h.mo3275v();
            m3316U(iMo3275v2);
            int iMo3255b2 = abstractC0845h.mo3255b() + iMo3275v2;
            do {
                c0869t.m3437f(abstractC0845h.mo3268o());
            } while (abstractC0845h.mo3255b() < iMo3255b2);
            return;
        }
        if (i11 != 5) {
            throw InvalidProtocolBufferException.m3144b();
        }
        do {
            c0869t.m3437f(abstractC0845h.mo3268o());
            if (abstractC0845h.mo3256c()) {
                return;
            } else {
                iMo3274u2 = abstractC0845h.mo3274u();
            }
        } while (iMo3274u2 == this.f5877b);
        this.f5879d = iMo3274u2;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0874v0
    /* JADX INFO: renamed from: f */
    public final void mo3323f(List<Long> list) throws IOException {
        int iMo3274u;
        int iMo3274u2;
        boolean z10 = list instanceof C0825a0;
        AbstractC0845h abstractC0845h = this.f5876a;
        if (!z10) {
            int i10 = this.f5877b & 7;
            if (i10 == 0) {
                do {
                    list.add(Long.valueOf(abstractC0845h.mo3271r()));
                    if (abstractC0845h.mo3256c()) {
                        return;
                    } else {
                        iMo3274u = abstractC0845h.mo3274u();
                    }
                } while (iMo3274u == this.f5877b);
                this.f5879d = iMo3274u;
                return;
            }
            if (i10 != 2) {
                throw InvalidProtocolBufferException.m3144b();
            }
            int iMo3255b = abstractC0845h.mo3255b() + abstractC0845h.mo3275v();
            do {
                list.add(Long.valueOf(abstractC0845h.mo3271r()));
            } while (abstractC0845h.mo3255b() < iMo3255b);
            m3314S(iMo3255b);
            return;
        }
        C0825a0 c0825a0 = (C0825a0) list;
        int i11 = this.f5877b & 7;
        if (i11 == 0) {
            do {
                c0825a0.m3166f(abstractC0845h.mo3271r());
                if (abstractC0845h.mo3256c()) {
                    return;
                } else {
                    iMo3274u2 = abstractC0845h.mo3274u();
                }
            } while (iMo3274u2 == this.f5877b);
            this.f5879d = iMo3274u2;
            return;
        }
        if (i11 != 2) {
            throw InvalidProtocolBufferException.m3144b();
        }
        int iMo3255b2 = abstractC0845h.mo3255b() + abstractC0845h.mo3275v();
        do {
            c0825a0.m3166f(abstractC0845h.mo3271r());
        } while (abstractC0845h.mo3255b() < iMo3255b2);
        m3314S(iMo3255b2);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0874v0
    /* JADX INFO: renamed from: g */
    public final int mo3324g() {
        return this.f5877b;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // androidx.datastore.preferences.protobuf.InterfaceC0874v0
    /* JADX INFO: renamed from: h */
    public final void mo3325h(List<Integer> list) throws IOException {
        int iMo3274u;
        int iMo3274u2;
        boolean z10 = list instanceof C0869t;
        AbstractC0845h abstractC0845h = this.f5876a;
        if (!z10) {
            int i10 = this.f5877b & 7;
            if (i10 == 0) {
                do {
                    list.add(Integer.valueOf(abstractC0845h.mo3275v()));
                    if (abstractC0845h.mo3256c()) {
                        return;
                    } else {
                        iMo3274u = abstractC0845h.mo3274u();
                    }
                } while (iMo3274u == this.f5877b);
                this.f5879d = iMo3274u;
                return;
            }
            if (i10 != 2) {
                throw InvalidProtocolBufferException.m3144b();
            }
            int iMo3255b = abstractC0845h.mo3255b() + abstractC0845h.mo3275v();
            do {
                list.add(Integer.valueOf(abstractC0845h.mo3275v()));
            } while (abstractC0845h.mo3255b() < iMo3255b);
            m3314S(iMo3255b);
            return;
        }
        C0869t c0869t = (C0869t) list;
        int i11 = this.f5877b & 7;
        if (i11 == 0) {
            do {
                c0869t.m3437f(abstractC0845h.mo3275v());
                if (abstractC0845h.mo3256c()) {
                    return;
                } else {
                    iMo3274u2 = abstractC0845h.mo3274u();
                }
            } while (iMo3274u2 == this.f5877b);
            this.f5879d = iMo3274u2;
            return;
        }
        if (i11 != 2) {
            throw InvalidProtocolBufferException.m3144b();
        }
        int iMo3255b2 = abstractC0845h.mo3255b() + abstractC0845h.mo3275v();
        do {
            c0869t.m3437f(abstractC0845h.mo3275v());
        } while (abstractC0845h.mo3255b() < iMo3255b2);
        m3314S(iMo3255b2);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0874v0
    /* JADX INFO: renamed from: i */
    public final int mo3326i() throws IOException {
        m3315T(5);
        return this.f5876a.mo3263j();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0874v0
    /* JADX INFO: renamed from: j */
    public final boolean mo3327j() throws IOException {
        m3315T(0);
        return this.f5876a.mo3259f();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0874v0
    /* JADX INFO: renamed from: k */
    public final long mo3328k() throws IOException {
        m3315T(1);
        return this.f5876a.mo3269p();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // androidx.datastore.preferences.protobuf.InterfaceC0874v0
    /* JADX INFO: renamed from: l */
    public final void mo3329l(List<Long> list) throws IOException {
        int iMo3274u;
        int iMo3274u2;
        boolean z10 = list instanceof C0825a0;
        AbstractC0845h abstractC0845h = this.f5876a;
        if (!z10) {
            int i10 = this.f5877b & 7;
            if (i10 == 0) {
                do {
                    list.add(Long.valueOf(abstractC0845h.mo3276w()));
                    if (abstractC0845h.mo3256c()) {
                        return;
                    } else {
                        iMo3274u = abstractC0845h.mo3274u();
                    }
                } while (iMo3274u == this.f5877b);
                this.f5879d = iMo3274u;
                return;
            }
            if (i10 != 2) {
                throw InvalidProtocolBufferException.m3144b();
            }
            int iMo3255b = abstractC0845h.mo3255b() + abstractC0845h.mo3275v();
            do {
                list.add(Long.valueOf(abstractC0845h.mo3276w()));
            } while (abstractC0845h.mo3255b() < iMo3255b);
            m3314S(iMo3255b);
            return;
        }
        C0825a0 c0825a0 = (C0825a0) list;
        int i11 = this.f5877b & 7;
        if (i11 == 0) {
            do {
                c0825a0.m3166f(abstractC0845h.mo3276w());
                if (abstractC0845h.mo3256c()) {
                    return;
                } else {
                    iMo3274u2 = abstractC0845h.mo3274u();
                }
            } while (iMo3274u2 == this.f5877b);
            this.f5879d = iMo3274u2;
            return;
        }
        if (i11 != 2) {
            throw InvalidProtocolBufferException.m3144b();
        }
        int iMo3255b2 = abstractC0845h.mo3255b() + abstractC0845h.mo3275v();
        do {
            c0825a0.m3166f(abstractC0845h.mo3276w());
        } while (abstractC0845h.mo3255b() < iMo3255b2);
        m3314S(iMo3255b2);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0874v0
    /* JADX INFO: renamed from: m */
    public final int mo3330m() throws IOException {
        m3315T(0);
        return this.f5876a.mo3275v();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // androidx.datastore.preferences.protobuf.InterfaceC0874v0
    /* JADX INFO: renamed from: n */
    public final void mo3331n(List<Long> list) throws IOException {
        int iMo3274u;
        int iMo3274u2;
        boolean z10 = list instanceof C0825a0;
        AbstractC0845h abstractC0845h = this.f5876a;
        if (!z10) {
            int i10 = this.f5877b & 7;
            if (i10 == 0) {
                do {
                    list.add(Long.valueOf(abstractC0845h.mo3267n()));
                    if (abstractC0845h.mo3256c()) {
                        return;
                    } else {
                        iMo3274u = abstractC0845h.mo3274u();
                    }
                } while (iMo3274u == this.f5877b);
                this.f5879d = iMo3274u;
                return;
            }
            if (i10 != 2) {
                throw InvalidProtocolBufferException.m3144b();
            }
            int iMo3255b = abstractC0845h.mo3255b() + abstractC0845h.mo3275v();
            do {
                list.add(Long.valueOf(abstractC0845h.mo3267n()));
            } while (abstractC0845h.mo3255b() < iMo3255b);
            m3314S(iMo3255b);
            return;
        }
        C0825a0 c0825a0 = (C0825a0) list;
        int i11 = this.f5877b & 7;
        if (i11 == 0) {
            do {
                c0825a0.m3166f(abstractC0845h.mo3267n());
                if (abstractC0845h.mo3256c()) {
                    return;
                } else {
                    iMo3274u2 = abstractC0845h.mo3274u();
                }
            } while (iMo3274u2 == this.f5877b);
            this.f5879d = iMo3274u2;
            return;
        }
        if (i11 != 2) {
            throw InvalidProtocolBufferException.m3144b();
        }
        int iMo3255b2 = abstractC0845h.mo3255b() + abstractC0845h.mo3275v();
        do {
            c0825a0.m3166f(abstractC0845h.mo3267n());
        } while (abstractC0845h.mo3255b() < iMo3255b2);
        m3314S(iMo3255b2);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // androidx.datastore.preferences.protobuf.InterfaceC0874v0
    /* JADX INFO: renamed from: o */
    public final void mo3332o(List<Long> list) throws IOException {
        int iMo3274u;
        int iMo3274u2;
        boolean z10 = list instanceof C0825a0;
        AbstractC0845h abstractC0845h = this.f5876a;
        if (!z10) {
            int i10 = this.f5877b & 7;
            if (i10 == 1) {
                do {
                    list.add(Long.valueOf(abstractC0845h.mo3269p()));
                    if (abstractC0845h.mo3256c()) {
                        return;
                    } else {
                        iMo3274u = abstractC0845h.mo3274u();
                    }
                } while (iMo3274u == this.f5877b);
                this.f5879d = iMo3274u;
                return;
            }
            if (i10 != 2) {
                throw InvalidProtocolBufferException.m3144b();
            }
            int iMo3275v = abstractC0845h.mo3275v();
            m3317V(iMo3275v);
            int iMo3255b = abstractC0845h.mo3255b() + iMo3275v;
            do {
                list.add(Long.valueOf(abstractC0845h.mo3269p()));
            } while (abstractC0845h.mo3255b() < iMo3255b);
            return;
        }
        C0825a0 c0825a0 = (C0825a0) list;
        int i11 = this.f5877b & 7;
        if (i11 == 1) {
            do {
                c0825a0.m3166f(abstractC0845h.mo3269p());
                if (abstractC0845h.mo3256c()) {
                    return;
                } else {
                    iMo3274u2 = abstractC0845h.mo3274u();
                }
            } while (iMo3274u2 == this.f5877b);
            this.f5879d = iMo3274u2;
            return;
        }
        if (i11 != 2) {
            throw InvalidProtocolBufferException.m3144b();
        }
        int iMo3275v2 = abstractC0845h.mo3275v();
        m3317V(iMo3275v2);
        int iMo3255b2 = abstractC0845h.mo3255b() + iMo3275v2;
        do {
            c0825a0.m3166f(abstractC0845h.mo3269p());
        } while (abstractC0845h.mo3255b() < iMo3255b2);
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // androidx.datastore.preferences.protobuf.InterfaceC0874v0
    /* JADX INFO: renamed from: p */
    public final void mo3333p(List<Integer> list) throws IOException {
        int iMo3274u;
        int iMo3274u2;
        boolean z10 = list instanceof C0869t;
        AbstractC0845h abstractC0845h = this.f5876a;
        if (!z10) {
            int i10 = this.f5877b & 7;
            if (i10 == 0) {
                do {
                    list.add(Integer.valueOf(abstractC0845h.mo3266m()));
                    if (abstractC0845h.mo3256c()) {
                        return;
                    } else {
                        iMo3274u = abstractC0845h.mo3274u();
                    }
                } while (iMo3274u == this.f5877b);
                this.f5879d = iMo3274u;
                return;
            }
            if (i10 != 2) {
                throw InvalidProtocolBufferException.m3144b();
            }
            int iMo3255b = abstractC0845h.mo3255b() + abstractC0845h.mo3275v();
            do {
                list.add(Integer.valueOf(abstractC0845h.mo3266m()));
            } while (abstractC0845h.mo3255b() < iMo3255b);
            m3314S(iMo3255b);
            return;
        }
        C0869t c0869t = (C0869t) list;
        int i11 = this.f5877b & 7;
        if (i11 == 0) {
            do {
                c0869t.m3437f(abstractC0845h.mo3266m());
                if (abstractC0845h.mo3256c()) {
                    return;
                } else {
                    iMo3274u2 = abstractC0845h.mo3274u();
                }
            } while (iMo3274u2 == this.f5877b);
            this.f5879d = iMo3274u2;
            return;
        }
        if (i11 != 2) {
            throw InvalidProtocolBufferException.m3144b();
        }
        int iMo3255b2 = abstractC0845h.mo3255b() + abstractC0845h.mo3275v();
        do {
            c0869t.m3437f(abstractC0845h.mo3266m());
        } while (abstractC0845h.mo3255b() < iMo3255b2);
        m3314S(iMo3255b2);
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // androidx.datastore.preferences.protobuf.InterfaceC0874v0
    /* JADX INFO: renamed from: q */
    public final void mo3334q(List<Integer> list) throws IOException {
        int iMo3274u;
        int iMo3274u2;
        boolean z10 = list instanceof C0869t;
        AbstractC0845h abstractC0845h = this.f5876a;
        if (!z10) {
            int i10 = this.f5877b & 7;
            if (i10 == 0) {
                do {
                    list.add(Integer.valueOf(abstractC0845h.mo3262i()));
                    if (abstractC0845h.mo3256c()) {
                        return;
                    } else {
                        iMo3274u = abstractC0845h.mo3274u();
                    }
                } while (iMo3274u == this.f5877b);
                this.f5879d = iMo3274u;
                return;
            }
            if (i10 != 2) {
                throw InvalidProtocolBufferException.m3144b();
            }
            int iMo3255b = abstractC0845h.mo3255b() + abstractC0845h.mo3275v();
            do {
                list.add(Integer.valueOf(abstractC0845h.mo3262i()));
            } while (abstractC0845h.mo3255b() < iMo3255b);
            m3314S(iMo3255b);
            return;
        }
        C0869t c0869t = (C0869t) list;
        int i11 = this.f5877b & 7;
        if (i11 == 0) {
            do {
                c0869t.m3437f(abstractC0845h.mo3262i());
                if (abstractC0845h.mo3256c()) {
                    return;
                } else {
                    iMo3274u2 = abstractC0845h.mo3274u();
                }
            } while (iMo3274u2 == this.f5877b);
            this.f5879d = iMo3274u2;
            return;
        }
        if (i11 != 2) {
            throw InvalidProtocolBufferException.m3144b();
        }
        int iMo3255b2 = abstractC0845h.mo3255b() + abstractC0845h.mo3275v();
        do {
            c0869t.m3437f(abstractC0845h.mo3262i());
        } while (abstractC0845h.mo3255b() < iMo3255b2);
        m3314S(iMo3255b2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // androidx.datastore.preferences.protobuf.InterfaceC0874v0
    /* JADX INFO: renamed from: r */
    public final <K, V> void mo3335r(Map<K, V> map, C0831c0.a<K, V> aVar, C0855m c0855m) throws IOException {
        m3315T(2);
        AbstractC0845h abstractC0845h = this.f5876a;
        int iMo3258e = abstractC0845h.mo3258e(abstractC0845h.mo3275v());
        Object objM3310O = aVar.f5827b;
        V v10 = aVar.f5829d;
        Object objM3310O2 = v10;
        while (true) {
            try {
                int iMo3342y = mo3342y();
                if (iMo3342y == Integer.MAX_VALUE || abstractC0845h.mo3256c()) {
                    break;
                    break;
                }
                if (iMo3342y == 1) {
                    objM3310O = m3310O(aVar.f5826a, null, null);
                } else if (iMo3342y != 2) {
                    try {
                        if (!mo3301F()) {
                            throw new InvalidProtocolBufferException("Unable to parse map entry.");
                        }
                    } catch (InvalidProtocolBufferException.InvalidWireTypeException unused) {
                        if (!mo3301F()) {
                            throw new InvalidProtocolBufferException("Unable to parse map entry.");
                        }
                    }
                } else {
                    objM3310O2 = m3310O(aVar.f5828c, v10.getClass(), c0855m);
                }
            } catch (Throwable th2) {
                abstractC0845h.mo3257d(iMo3258e);
                throw th2;
            }
        }
        map.put(objM3310O, objM3310O2);
        abstractC0845h.mo3257d(iMo3258e);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0874v0
    public final double readDouble() throws IOException {
        m3315T(1);
        return this.f5876a.mo3261h();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0874v0
    public final float readFloat() throws IOException {
        m3315T(5);
        return this.f5876a.mo3265l();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0874v0
    /* JADX INFO: renamed from: s */
    public final int mo3336s() throws IOException {
        m3315T(0);
        return this.f5876a.mo3262i();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0874v0
    /* JADX INFO: renamed from: t */
    public final void mo3337t(List<Integer> list) throws IOException {
        int iMo3274u;
        int iMo3274u2;
        boolean z10 = list instanceof C0869t;
        AbstractC0845h abstractC0845h = this.f5876a;
        if (!z10) {
            int i10 = this.f5877b & 7;
            if (i10 == 2) {
                int iMo3275v = abstractC0845h.mo3275v();
                m3316U(iMo3275v);
                int iMo3255b = abstractC0845h.mo3255b() + iMo3275v;
                do {
                    list.add(Integer.valueOf(abstractC0845h.mo3263j()));
                } while (abstractC0845h.mo3255b() < iMo3255b);
                return;
            }
            if (i10 != 5) {
                throw InvalidProtocolBufferException.m3144b();
            }
            do {
                list.add(Integer.valueOf(abstractC0845h.mo3263j()));
                if (abstractC0845h.mo3256c()) {
                    return;
                } else {
                    iMo3274u = abstractC0845h.mo3274u();
                }
            } while (iMo3274u == this.f5877b);
            this.f5879d = iMo3274u;
            return;
        }
        C0869t c0869t = (C0869t) list;
        int i11 = this.f5877b & 7;
        if (i11 == 2) {
            int iMo3275v2 = abstractC0845h.mo3275v();
            m3316U(iMo3275v2);
            int iMo3255b2 = abstractC0845h.mo3255b() + iMo3275v2;
            do {
                c0869t.m3437f(abstractC0845h.mo3263j());
            } while (abstractC0845h.mo3255b() < iMo3255b2);
            return;
        }
        if (i11 != 5) {
            throw InvalidProtocolBufferException.m3144b();
        }
        do {
            c0869t.m3437f(abstractC0845h.mo3263j());
            if (abstractC0845h.mo3256c()) {
                return;
            } else {
                iMo3274u2 = abstractC0845h.mo3274u();
            }
        } while (iMo3274u2 == this.f5877b);
        this.f5879d = iMo3274u2;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0874v0
    /* JADX INFO: renamed from: u */
    public final int mo3338u() throws IOException {
        m3315T(0);
        return this.f5876a.mo3270q();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0874v0
    /* JADX INFO: renamed from: v */
    public final long mo3339v() throws IOException {
        m3315T(0);
        return this.f5876a.mo3271r();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // androidx.datastore.preferences.protobuf.InterfaceC0874v0
    /* JADX INFO: renamed from: w */
    public final void mo3340w(List<Boolean> list) throws IOException {
        int iMo3274u;
        int iMo3274u2;
        boolean z10 = list instanceof C0836e;
        AbstractC0845h abstractC0845h = this.f5876a;
        if (!z10) {
            int i10 = this.f5877b & 7;
            if (i10 == 0) {
                do {
                    list.add(Boolean.valueOf(abstractC0845h.mo3259f()));
                    if (abstractC0845h.mo3256c()) {
                        return;
                    } else {
                        iMo3274u = abstractC0845h.mo3274u();
                    }
                } while (iMo3274u == this.f5877b);
                this.f5879d = iMo3274u;
                return;
            }
            if (i10 != 2) {
                throw InvalidProtocolBufferException.m3144b();
            }
            int iMo3255b = abstractC0845h.mo3255b() + abstractC0845h.mo3275v();
            do {
                list.add(Boolean.valueOf(abstractC0845h.mo3259f()));
            } while (abstractC0845h.mo3255b() < iMo3255b);
            m3314S(iMo3255b);
            return;
        }
        C0836e c0836e = (C0836e) list;
        int i11 = this.f5877b & 7;
        if (i11 == 0) {
            do {
                c0836e.m3209f(abstractC0845h.mo3259f());
                if (abstractC0845h.mo3256c()) {
                    return;
                } else {
                    iMo3274u2 = abstractC0845h.mo3274u();
                }
            } while (iMo3274u2 == this.f5877b);
            this.f5879d = iMo3274u2;
            return;
        }
        if (i11 != 2) {
            throw InvalidProtocolBufferException.m3144b();
        }
        int iMo3255b2 = abstractC0845h.mo3255b() + abstractC0845h.mo3275v();
        do {
            c0836e.m3209f(abstractC0845h.mo3259f());
        } while (abstractC0845h.mo3255b() < iMo3255b2);
        m3314S(iMo3255b2);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0874v0
    /* JADX INFO: renamed from: x */
    public final String mo3341x() throws IOException {
        m3315T(2);
        return this.f5876a.mo3272s();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0874v0
    /* JADX INFO: renamed from: y */
    public final int mo3342y() throws IOException {
        int i10 = this.f5879d;
        if (i10 != 0) {
            this.f5877b = i10;
            this.f5879d = 0;
        } else {
            this.f5877b = this.f5876a.mo3274u();
        }
        int i11 = this.f5877b;
        if (i11 == 0 || i11 == this.f5878c) {
            return Integer.MAX_VALUE;
        }
        return i11 >>> 3;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0874v0
    /* JADX INFO: renamed from: z */
    public final void mo3343z(List<String> list) throws IOException {
        m3313R(list, false);
    }
}
