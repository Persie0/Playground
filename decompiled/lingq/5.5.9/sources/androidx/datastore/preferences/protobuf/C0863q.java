package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.datastore.preferences.protobuf.C0863q.b;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Map;
import java.util.logging.Logger;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.q */
/* JADX INFO: loaded from: classes.dex */
public final class C0863q<T extends b<T>> {

    /* JADX INFO: renamed from: d */
    public static final C0863q f5918d = new C0863q(0);

    /* JADX INFO: renamed from: a */
    public final C0882z0<T, Object> f5919a;

    /* JADX INFO: renamed from: b */
    public boolean f5920b;

    /* JADX INFO: renamed from: c */
    public boolean f5921c;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.q$a */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f5922a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f5923b;

        static {
            int[] iArr = new int[WireFormat$FieldType.values().length];
            f5923b = iArr;
            try {
                iArr[WireFormat$FieldType.DOUBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5923b[WireFormat$FieldType.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f5923b[WireFormat$FieldType.INT64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f5923b[WireFormat$FieldType.UINT64.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f5923b[WireFormat$FieldType.INT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f5923b[WireFormat$FieldType.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f5923b[WireFormat$FieldType.FIXED32.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f5923b[WireFormat$FieldType.BOOL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f5923b[WireFormat$FieldType.GROUP.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f5923b[WireFormat$FieldType.MESSAGE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f5923b[WireFormat$FieldType.STRING.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f5923b[WireFormat$FieldType.BYTES.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f5923b[WireFormat$FieldType.UINT32.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f5923b[WireFormat$FieldType.SFIXED32.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f5923b[WireFormat$FieldType.SFIXED64.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f5923b[WireFormat$FieldType.SINT32.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f5923b[WireFormat$FieldType.SINT64.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f5923b[WireFormat$FieldType.ENUM.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr2 = new int[WireFormat$JavaType.values().length];
            f5922a = iArr2;
            try {
                iArr2[WireFormat$JavaType.INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f5922a[WireFormat$JavaType.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f5922a[WireFormat$JavaType.FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f5922a[WireFormat$JavaType.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f5922a[WireFormat$JavaType.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f5922a[WireFormat$JavaType.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f5922a[WireFormat$JavaType.BYTE_STRING.ordinal()] = 7;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f5922a[WireFormat$JavaType.ENUM.ordinal()] = 8;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f5922a[WireFormat$JavaType.MESSAGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.q$b */
    public interface b<T extends b<T>> extends Comparable<T> {
        /* JADX INFO: renamed from: e */
        void mo3139e();

        void getNumber();

        /* JADX INFO: renamed from: h */
        void mo3140h();

        void isPacked();

        /* JADX INFO: renamed from: j */
        WireFormat$JavaType mo3141j();

        /* JADX INFO: renamed from: r */
        GeneratedMessageLite.AbstractC0811a mo3142r(InterfaceC0848i0.a aVar, InterfaceC0848i0 interfaceC0848i0);
    }

    public C0863q() {
        int i10 = C0882z0.f5953h;
        this.f5919a = new C0880y0(16);
    }

    public C0863q(int i10) {
        int i11 = C0882z0.f5953h;
        C0880y0 c0880y0 = new C0880y0(0);
        this.f5919a = c0880y0;
        if (!this.f5920b) {
            c0880y0.mo3495g();
            this.f5920b = true;
        }
        if (this.f5920b) {
            return;
        }
        c0880y0.mo3495g();
        this.f5920b = true;
    }

    /* JADX INFO: renamed from: b */
    public static int m3419b(WireFormat$FieldType wireFormat$FieldType, int i10, Object obj) {
        int iM3084t = CodedOutputStream.m3084t(i10);
        if (wireFormat$FieldType == WireFormat$FieldType.GROUP) {
            iM3084t *= 2;
        }
        return m3420c(wireFormat$FieldType, obj) + iM3084t;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: c */
    public static int m3420c(WireFormat$FieldType wireFormat$FieldType, Object obj) {
        switch (a.f5923b[wireFormat$FieldType.ordinal()]) {
            case 1:
                ((Double) obj).doubleValue();
                Logger logger = CodedOutputStream.f5797b;
                return 8;
            case 2:
                ((Float) obj).floatValue();
                Logger logger2 = CodedOutputStream.f5797b;
                return 4;
            case 3:
                return CodedOutputStream.m3088x(((Long) obj).longValue());
            case 4:
                return CodedOutputStream.m3088x(((Long) obj).longValue());
            case 5:
                return CodedOutputStream.m3075k(((Integer) obj).intValue());
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                ((Long) obj).longValue();
                Logger logger3 = CodedOutputStream.f5797b;
                return 8;
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                ((Integer) obj).intValue();
                Logger logger4 = CodedOutputStream.f5797b;
                return 4;
            case 8:
                ((Boolean) obj).booleanValue();
                Logger logger5 = CodedOutputStream.f5797b;
                return 1;
            case 9:
                Logger logger6 = CodedOutputStream.f5797b;
                return ((InterfaceC0848i0) obj).mo3130d();
            case 10:
                if (obj instanceof C0873v) {
                    return CodedOutputStream.m3077m((C0873v) obj);
                }
                Logger logger7 = CodedOutputStream.f5797b;
                int iMo3130d = ((InterfaceC0848i0) obj).mo3130d();
                return CodedOutputStream.m3086v(iMo3130d) + iMo3130d;
            case 11:
                if (!(obj instanceof ByteString)) {
                    return CodedOutputStream.m3083s((String) obj);
                }
                Logger logger8 = CodedOutputStream.f5797b;
                int size = ((ByteString) obj).size();
                return CodedOutputStream.m3086v(size) + size;
            case 12:
                if (obj instanceof ByteString) {
                    Logger logger9 = CodedOutputStream.f5797b;
                    int size2 = ((ByteString) obj).size();
                    return CodedOutputStream.m3086v(size2) + size2;
                }
                Logger logger10 = CodedOutputStream.f5797b;
                int length = ((byte[]) obj).length;
                return CodedOutputStream.m3086v(length) + length;
            case 13:
                return CodedOutputStream.m3086v(((Integer) obj).intValue());
            case 14:
                ((Integer) obj).intValue();
                Logger logger11 = CodedOutputStream.f5797b;
                return 4;
            case 15:
                ((Long) obj).longValue();
                Logger logger12 = CodedOutputStream.f5797b;
                return 8;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                return CodedOutputStream.m3086v((iIntValue >> 31) ^ (iIntValue << 1));
            case 17:
                long jLongValue = ((Long) obj).longValue();
                return CodedOutputStream.m3088x((jLongValue >> 63) ^ (jLongValue << 1));
            case 18:
                return obj instanceof C0871u.a ? CodedOutputStream.m3075k(((C0871u.a) obj).getNumber()) : CodedOutputStream.m3075k(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    /* JADX INFO: renamed from: d */
    public static int m3421d(b<?> bVar, Object obj) {
        bVar.mo3140h();
        bVar.getNumber();
        bVar.mo3139e();
        return m3419b(null, 0, obj);
    }

    /* JADX INFO: renamed from: f */
    public static int m3422f(Map.Entry entry) {
        b bVar = (b) entry.getKey();
        Object value = entry.getValue();
        if (bVar.mo3141j() != WireFormat$JavaType.MESSAGE) {
            return m3421d(bVar, value);
        }
        bVar.mo3139e();
        bVar.isPacked();
        if (value instanceof C0873v) {
            ((b) entry.getKey()).getNumber();
            return CodedOutputStream.m3077m((C0873v) value) + CodedOutputStream.m3084t(3) + CodedOutputStream.m3085u(2, 0) + (CodedOutputStream.m3084t(1) * 2);
        }
        ((b) entry.getKey()).getNumber();
        int iM3085u = CodedOutputStream.m3085u(2, 0) + (CodedOutputStream.m3084t(1) * 2);
        int iM3084t = CodedOutputStream.m3084t(3);
        int iMo3130d = ((InterfaceC0848i0) value).mo3130d();
        return CodedOutputStream.m3086v(iMo3130d) + iMo3130d + iM3084t + iM3085u;
    }

    /* JADX INFO: renamed from: j */
    public static <T extends b<T>> boolean m3423j(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        if (key.mo3141j() == WireFormat$JavaType.MESSAGE) {
            key.mo3139e();
            Object value = entry.getValue();
            if (!(value instanceof InterfaceC0848i0)) {
                if (value instanceof C0873v) {
                    return true;
                }
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            if (!((InterfaceC0848i0) value).mo3128b()) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0036  */
    /* JADX WARN: Code duplicated, block: B:27:0x0051 A[PHI: r0
      0x0051: PHI (r0v11 boolean) = (r0v4 boolean), (r0v2 boolean), (r0v2 boolean), (r0v2 boolean) binds: [B:26:0x004e, B:18:0x0034, B:13:0x0029, B:8:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: n */
    public static void m3424n(WireFormat$FieldType wireFormat$FieldType, Object obj) {
        Charset charset = C0871u.f5935a;
        obj.getClass();
        boolean z10 = false;
        switch (a.f5922a[wireFormat$FieldType.getJavaType().ordinal()]) {
            case 1:
                z10 = obj instanceof Integer;
                break;
            case 2:
                z10 = obj instanceof Long;
                break;
            case 3:
                z10 = obj instanceof Float;
                break;
            case 4:
                z10 = obj instanceof Double;
                break;
            case 5:
                z10 = obj instanceof Boolean;
                break;
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                z10 = obj instanceof String;
                break;
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                if ((obj instanceof ByteString) || (obj instanceof byte[])) {
                    z10 = true;
                }
                break;
            case 8:
                if (!(obj instanceof Integer)) {
                    if (!(obj instanceof C0871u.a)) {
                        break;
                    }
                }
                z10 = true;
                break;
            case 9:
                if (!(obj instanceof InterfaceC0848i0)) {
                    if (!(obj instanceof C0873v)) {
                        break;
                    }
                }
                z10 = true;
                break;
        }
        if (!z10) {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: o */
    public static void m3425o(CodedOutputStream codedOutputStream, WireFormat$FieldType wireFormat$FieldType, int i10, Object obj) throws IOException {
        if (wireFormat$FieldType == WireFormat$FieldType.GROUP) {
            codedOutputStream.mo3105Q(i10, 3);
            ((InterfaceC0848i0) obj).mo3133h(codedOutputStream);
            codedOutputStream.mo3105Q(i10, 4);
            return;
        }
        codedOutputStream.mo3105Q(i10, wireFormat$FieldType.getWireType());
        switch (a.f5923b[wireFormat$FieldType.ordinal()]) {
            case 1:
                codedOutputStream.mo3096H(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 2:
                codedOutputStream.mo3094F(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 3:
                codedOutputStream.mo3109U(((Long) obj).longValue());
                break;
            case 4:
                codedOutputStream.mo3109U(((Long) obj).longValue());
                break;
            case 5:
                codedOutputStream.mo3098J(((Integer) obj).intValue());
                break;
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                codedOutputStream.mo3096H(((Long) obj).longValue());
                break;
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                codedOutputStream.mo3094F(((Integer) obj).intValue());
                break;
            case 8:
                codedOutputStream.mo3111z(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 9:
                ((InterfaceC0848i0) obj).mo3133h(codedOutputStream);
                break;
            case 10:
                codedOutputStream.mo3100L((InterfaceC0848i0) obj);
                break;
            case 11:
                if (!(obj instanceof ByteString)) {
                    codedOutputStream.mo3104P((String) obj);
                } else {
                    codedOutputStream.mo3092D((ByteString) obj);
                }
                break;
            case 12:
                if (!(obj instanceof ByteString)) {
                    byte[] bArr = (byte[]) obj;
                    codedOutputStream.mo3090B(bArr, bArr.length);
                } else {
                    codedOutputStream.mo3092D((ByteString) obj);
                }
                break;
            case 13:
                codedOutputStream.mo3107S(((Integer) obj).intValue());
                break;
            case 14:
                codedOutputStream.mo3094F(((Integer) obj).intValue());
                break;
            case 15:
                codedOutputStream.mo3096H(((Long) obj).longValue());
                break;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                codedOutputStream.mo3107S((iIntValue >> 31) ^ (iIntValue << 1));
                break;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                codedOutputStream.mo3109U((jLongValue >> 63) ^ (jLongValue << 1));
                break;
            case 18:
                if (!(obj instanceof C0871u.a)) {
                    codedOutputStream.mo3098J(((Integer) obj).intValue());
                } else {
                    codedOutputStream.mo3098J(((C0871u.a) obj).getNumber());
                }
                break;
        }
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0863q<T> clone() {
        C0882z0<T, Object> c0882z0;
        C0863q<T> c0863q = new C0863q<>();
        int i10 = 0;
        while (true) {
            c0882z0 = this.f5919a;
            if (i10 >= c0882z0.m3503d()) {
                break;
            }
            Map.Entry<K, Object> entryM3502c = c0882z0.m3502c(i10);
            c0863q.m3433m((b) entryM3502c.getKey(), entryM3502c.getValue());
            i10++;
        }
        Iterator it = c0882z0.m3504e().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            c0863q.m3433m((b) entry.getKey(), entry.getValue());
        }
        c0863q.f5921c = this.f5921c;
        return c0863q;
    }

    /* JADX INFO: renamed from: e */
    public final Object m3427e(T t10) {
        Object obj = this.f5919a.get(t10);
        return obj instanceof C0873v ? ((C0873v) obj).m3445a(null) : obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0863q) {
            return this.f5919a.equals(((C0863q) obj).f5919a);
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public final int m3428g() {
        C0882z0<T, Object> c0882z0;
        int i10 = 0;
        int iM3421d = 0;
        while (true) {
            c0882z0 = this.f5919a;
            if (i10 >= c0882z0.m3503d()) {
                break;
            }
            Map.Entry<K, Object> entryM3502c = c0882z0.m3502c(i10);
            iM3421d += m3421d((b) entryM3502c.getKey(), entryM3502c.getValue());
            i10++;
        }
        Iterator it = c0882z0.m3504e().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            iM3421d += m3421d((b) entry.getKey(), entry.getValue());
        }
        return iM3421d;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m3429h() {
        return this.f5919a.isEmpty();
    }

    public final int hashCode() {
        return this.f5919a.hashCode();
    }

    /* JADX INFO: renamed from: i */
    public final boolean m3430i() {
        int i10 = 0;
        while (true) {
            C0882z0<T, Object> c0882z0 = this.f5919a;
            if (i10 >= c0882z0.m3503d()) {
                Iterator it = c0882z0.m3504e().iterator();
                while (it.hasNext()) {
                    if (!m3423j((Map.Entry) it.next())) {
                        return false;
                    }
                }
                return true;
            }
            if (!m3423j(c0882z0.m3502c(i10))) {
                return false;
            }
            i10++;
        }
    }

    /* JADX INFO: renamed from: k */
    public final Iterator<Map.Entry<T, Object>> m3431k() {
        boolean z10 = this.f5921c;
        C0882z0<T, Object> c0882z0 = this.f5919a;
        return z10 ? new C0873v.b(c0882z0.entrySet().iterator()) : c0882z0.entrySet().iterator();
    }

    /* JADX INFO: renamed from: l */
    public final void m3432l(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof C0873v) {
            value = ((C0873v) value).m3445a(null);
        }
        key.mo3139e();
        WireFormat$JavaType wireFormat$JavaTypeMo3141j = key.mo3141j();
        WireFormat$JavaType wireFormat$JavaType = WireFormat$JavaType.MESSAGE;
        C0882z0<T, Object> c0882z0 = this.f5919a;
        if (wireFormat$JavaTypeMo3141j != wireFormat$JavaType) {
            if (value instanceof byte[]) {
                byte[] bArr = (byte[]) value;
                byte[] bArr2 = new byte[bArr.length];
                System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                value = bArr2;
            }
            c0882z0.put(key, value);
            return;
        }
        Object objM3427e = m3427e(key);
        if (objM3427e != null) {
            c0882z0.put(key, key.mo3142r(((InterfaceC0848i0) objM3427e).mo3129c(), (InterfaceC0848i0) value).m3136i());
            return;
        }
        if (value instanceof byte[]) {
            byte[] bArr3 = (byte[]) value;
            byte[] bArr4 = new byte[bArr3.length];
            System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
            value = bArr4;
        }
        c0882z0.put(key, value);
    }

    /* JADX INFO: renamed from: m */
    public final void m3433m(T t10, Object obj) {
        t10.mo3139e();
        t10.mo3140h();
        m3424n(null, obj);
        if (obj instanceof C0873v) {
            this.f5921c = true;
        }
        this.f5919a.put(t10, obj);
    }
}
