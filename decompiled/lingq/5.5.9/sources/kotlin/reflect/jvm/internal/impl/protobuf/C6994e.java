package kotlin.reflect.jvm.internal.impl.protobuf;

import androidx.datastore.preferences.PreferencesProto$Value;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.protobuf.C6994e.b;
import p282nn.AbstractC7803a;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.protobuf.e */
/* JADX INFO: loaded from: classes2.dex */
public final class C6994e<FieldDescriptorType extends b<FieldDescriptorType>> {

    /* JADX INFO: renamed from: d */
    public static final C6994e f39521d = new C6994e(0);

    /* JADX INFO: renamed from: a */
    public final C6998i f39522a;

    /* JADX INFO: renamed from: b */
    public boolean f39523b;

    /* JADX INFO: renamed from: c */
    public boolean f39524c = false;

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.protobuf.e$a */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f39525a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f39526b;

        static {
            int[] iArr = new int[WireFormat$FieldType.values().length];
            f39526b = iArr;
            try {
                iArr[WireFormat$FieldType.DOUBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f39526b[WireFormat$FieldType.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f39526b[WireFormat$FieldType.INT64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f39526b[WireFormat$FieldType.UINT64.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f39526b[WireFormat$FieldType.INT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f39526b[WireFormat$FieldType.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f39526b[WireFormat$FieldType.FIXED32.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f39526b[WireFormat$FieldType.BOOL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f39526b[WireFormat$FieldType.STRING.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f39526b[WireFormat$FieldType.BYTES.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f39526b[WireFormat$FieldType.UINT32.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f39526b[WireFormat$FieldType.SFIXED32.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f39526b[WireFormat$FieldType.SFIXED64.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f39526b[WireFormat$FieldType.SINT32.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f39526b[WireFormat$FieldType.SINT64.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f39526b[WireFormat$FieldType.GROUP.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f39526b[WireFormat$FieldType.MESSAGE.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f39526b[WireFormat$FieldType.ENUM.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr2 = new int[WireFormat$JavaType.values().length];
            f39525a = iArr2;
            try {
                iArr2[WireFormat$JavaType.INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f39525a[WireFormat$JavaType.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f39525a[WireFormat$JavaType.FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f39525a[WireFormat$JavaType.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f39525a[WireFormat$JavaType.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f39525a[WireFormat$JavaType.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f39525a[WireFormat$JavaType.BYTE_STRING.ordinal()] = 7;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f39525a[WireFormat$JavaType.ENUM.ordinal()] = 8;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f39525a[WireFormat$JavaType.MESSAGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.protobuf.e$b */
    public interface b<T extends b<T>> extends Comparable<T> {
        /* JADX INFO: renamed from: b */
        GeneratedMessageLite.AbstractC6982b mo13929b(InterfaceC6997h.a aVar, InterfaceC6997h interfaceC6997h);

        /* JADX INFO: renamed from: e */
        boolean mo13930e();

        int getNumber();

        /* JADX INFO: renamed from: h */
        WireFormat$FieldType mo13931h();

        boolean isPacked();

        /* JADX INFO: renamed from: j */
        WireFormat$JavaType mo13932j();
    }

    public C6994e() {
        int i10 = C6999j.f39530f;
        this.f39522a = new C6998i(16);
    }

    public C6994e(int i10) {
        int i11 = C6999j.f39530f;
        this.f39522a = new C6998i(0);
        m13969g();
    }

    /* JADX WARN: Unreachable blocks removed: 3, instructions: 3 */
    /* JADX INFO: renamed from: c */
    public static int m13959c(WireFormat$FieldType wireFormat$FieldType, Object obj) {
        switch (a.f39526b[wireFormat$FieldType.ordinal()]) {
            case 1:
                ((Double) obj).doubleValue();
                return 8;
            case 2:
                ((Float) obj).floatValue();
                return 4;
            case 3:
                return CodedOutputStream.m13899g(((Long) obj).longValue());
            case 4:
                return CodedOutputStream.m13899g(((Long) obj).longValue());
            case 5:
                return CodedOutputStream.m13895c(((Integer) obj).intValue());
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                ((Long) obj).longValue();
                return 8;
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                ((Integer) obj).intValue();
                return 4;
            case 8:
                ((Boolean) obj).booleanValue();
                return 1;
            case 9:
                try {
                    byte[] bytes = ((String) obj).getBytes("UTF-8");
                    return CodedOutputStream.m13898f(bytes.length) + bytes.length;
                } catch (UnsupportedEncodingException e10) {
                    throw new RuntimeException("UTF-8 not supported.", e10);
                }
            case 10:
                if (obj instanceof AbstractC7803a) {
                    AbstractC7803a abstractC7803a = (AbstractC7803a) obj;
                    return abstractC7803a.size() + CodedOutputStream.m13898f(abstractC7803a.size());
                }
                byte[] bArr = (byte[]) obj;
                return CodedOutputStream.m13898f(bArr.length) + bArr.length;
            case 11:
                return CodedOutputStream.m13898f(((Integer) obj).intValue());
            case 12:
                ((Integer) obj).intValue();
                return 4;
            case 13:
                ((Long) obj).longValue();
                return 8;
            case 14:
                int iIntValue = ((Integer) obj).intValue();
                return CodedOutputStream.m13898f((iIntValue >> 31) ^ (iIntValue << 1));
            case 15:
                long jLongValue = ((Long) obj).longValue();
                return CodedOutputStream.m13899g((jLongValue >> 63) ^ (jLongValue << 1));
            case 16:
                return ((InterfaceC6997h) obj).mo13782d();
            case 17:
                if (!(obj instanceof C6996g)) {
                    return CodedOutputStream.m13897e((InterfaceC6997h) obj);
                }
                C6996g c6996g = (C6996g) obj;
                if (!c6996g.f42889a) {
                    throw null;
                }
                int iMo13782d = c6996g.f42890b.mo13782d();
                return CodedOutputStream.m13898f(iMo13782d) + iMo13782d;
            case 18:
                return obj instanceof C6995f.a ? CodedOutputStream.m13895c(((C6995f.a) obj).getNumber()) : CodedOutputStream.m13895c(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    /* JADX INFO: renamed from: d */
    public static int m13960d(b<?> bVar, Object obj) {
        WireFormat$FieldType wireFormat$FieldTypeMo13931h = bVar.mo13931h();
        int number = bVar.getNumber();
        if (!bVar.mo13930e()) {
            int iM13900h = CodedOutputStream.m13900h(number);
            if (wireFormat$FieldTypeMo13931h == WireFormat$FieldType.GROUP) {
                iM13900h *= 2;
            }
            return m13959c(wireFormat$FieldTypeMo13931h, obj) + iM13900h;
        }
        int iM13959c = 0;
        if (bVar.isPacked()) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                iM13959c += m13959c(wireFormat$FieldTypeMo13931h, it.next());
            }
            return CodedOutputStream.m13898f(iM13959c) + CodedOutputStream.m13900h(number) + iM13959c;
        }
        for (Object obj2 : (List) obj) {
            int iM13900h2 = CodedOutputStream.m13900h(number);
            if (wireFormat$FieldTypeMo13931h == WireFormat$FieldType.GROUP) {
                iM13900h2 *= 2;
            }
            iM13959c += m13959c(wireFormat$FieldTypeMo13931h, obj2) + iM13900h2;
        }
        return iM13959c;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: f */
    public static boolean m13961f(Map.Entry entry) {
        b bVar = (b) entry.getKey();
        if (bVar.mo13932j() == WireFormat$JavaType.MESSAGE) {
            if (bVar.mo13930e()) {
                Iterator it = ((List) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (!((InterfaceC6997h) it.next()).mo13780b()) {
                        return false;
                    }
                }
            } else {
                Object value = entry.getValue();
                if (!(value instanceof InterfaceC6997h)) {
                    if (value instanceof C6996g) {
                        return true;
                    }
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
                if (!((InterfaceC6997h) value).mo13780b()) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX WARN: Unreachable blocks removed: 3, instructions: 3 */
    /* JADX INFO: renamed from: i */
    public static Object m13962i(C6992c c6992c, WireFormat$FieldType wireFormat$FieldType) throws IOException {
        boolean z10 = true;
        switch (a.f39526b[wireFormat$FieldType.ordinal()]) {
            case 1:
                return Double.valueOf(Double.longBitsToDouble(c6992c.m13948j()));
            case 2:
                return Float.valueOf(Float.intBitsToFloat(c6992c.m13947i()));
            case 3:
                return Long.valueOf(c6992c.m13950l());
            case 4:
                return Long.valueOf(c6992c.m13950l());
            case 5:
                return Integer.valueOf(c6992c.m13949k());
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                return Long.valueOf(c6992c.m13948j());
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                return Integer.valueOf(c6992c.m13947i());
            case 8:
                if (c6992c.m13950l() == 0) {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            case 9:
                int iM13949k = c6992c.m13949k();
                int i10 = c6992c.f39509b;
                int i11 = c6992c.f39511d;
                if (iM13949k > i10 - i11 || iM13949k <= 0) {
                    return iM13949k == 0 ? "" : new String(c6992c.m13946h(iM13949k), "UTF-8");
                }
                String str = new String(c6992c.f39508a, i11, iM13949k, "UTF-8");
                c6992c.f39511d += iM13949k;
                return str;
            case 10:
                return c6992c.m13943e();
            case 11:
                return Integer.valueOf(c6992c.m13949k());
            case 12:
                return Integer.valueOf(c6992c.m13947i());
            case 13:
                return Long.valueOf(c6992c.m13948j());
            case 14:
                int iM13949k2 = c6992c.m13949k();
                return Integer.valueOf((-(iM13949k2 & 1)) ^ (iM13949k2 >>> 1));
            case 15:
                long jM13950l = c6992c.m13950l();
                return Long.valueOf((-(jM13950l & 1)) ^ (jM13950l >>> 1));
            case 16:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle nested groups.");
            case 17:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle embedded messages.");
            case 18:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle enums.");
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x003f  */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003c, code lost:
    
        if ((r6 instanceof byte[]) != false) goto L22;
     */
    /* JADX INFO: renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m13963k(WireFormat$FieldType wireFormat$FieldType, Object obj) {
        obj.getClass();
        boolean z10 = true;
        boolean z11 = false;
        switch (a.f39525a[wireFormat$FieldType.getJavaType().ordinal()]) {
            case 1:
                z11 = obj instanceof Integer;
                break;
            case 2:
                z11 = obj instanceof Long;
                break;
            case 3:
                z11 = obj instanceof Float;
                break;
            case 4:
                z11 = obj instanceof Double;
                break;
            case 5:
                z11 = obj instanceof Boolean;
                break;
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                z11 = obj instanceof String;
                break;
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                if (!(obj instanceof AbstractC7803a)) {
                    break;
                }
                z11 = z10;
                break;
            case 8:
                if (!(obj instanceof Integer) && !(obj instanceof C6995f.a)) {
                    z10 = false;
                }
                z11 = z10;
                break;
            case 9:
                if (!(obj instanceof InterfaceC6997h) && !(obj instanceof C6996g)) {
                    z10 = false;
                }
                z11 = z10;
                break;
        }
        if (!z11) {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
    }

    /* JADX INFO: renamed from: l */
    public static void m13964l(CodedOutputStream codedOutputStream, WireFormat$FieldType wireFormat$FieldType, int i10, Object obj) throws IOException {
        if (wireFormat$FieldType != WireFormat$FieldType.GROUP) {
            codedOutputStream.m13916x(i10, wireFormat$FieldType.getWireType());
            m13965m(codedOutputStream, wireFormat$FieldType, obj);
        } else {
            codedOutputStream.m13916x(i10, 3);
            ((InterfaceC6997h) obj).mo13784j(codedOutputStream);
            codedOutputStream.m13916x(i10, 4);
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: m */
    public static void m13965m(CodedOutputStream codedOutputStream, WireFormat$FieldType wireFormat$FieldType, Object obj) throws IOException {
        switch (a.f39526b[wireFormat$FieldType.ordinal()]) {
            case 1:
                double dDoubleValue = ((Double) obj).doubleValue();
                codedOutputStream.getClass();
                codedOutputStream.m13913u(Double.doubleToRawLongBits(dDoubleValue));
                break;
            case 2:
                float fFloatValue = ((Float) obj).floatValue();
                codedOutputStream.getClass();
                codedOutputStream.m13912t(Float.floatToRawIntBits(fFloatValue));
                break;
            case 3:
                codedOutputStream.m13915w(((Long) obj).longValue());
                break;
            case 4:
                codedOutputStream.m13915w(((Long) obj).longValue());
                break;
            case 5:
                codedOutputStream.m13906n(((Integer) obj).intValue());
                break;
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                codedOutputStream.m13913u(((Long) obj).longValue());
                break;
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                codedOutputStream.m13912t(((Integer) obj).intValue());
                break;
            case 8:
                codedOutputStream.m13909q(((Boolean) obj).booleanValue() ? 1 : 0);
                break;
            case 9:
                codedOutputStream.getClass();
                byte[] bytes = ((String) obj).getBytes("UTF-8");
                codedOutputStream.m13914v(bytes.length);
                codedOutputStream.m13911s(bytes);
                break;
            case 10:
                if (!(obj instanceof AbstractC7803a)) {
                    byte[] bArr = (byte[]) obj;
                    codedOutputStream.getClass();
                    codedOutputStream.m13914v(bArr.length);
                    codedOutputStream.m13911s(bArr);
                } else {
                    AbstractC7803a abstractC7803a = (AbstractC7803a) obj;
                    codedOutputStream.getClass();
                    codedOutputStream.m13914v(abstractC7803a.size());
                    codedOutputStream.m13910r(abstractC7803a);
                }
                break;
            case 11:
                codedOutputStream.m13914v(((Integer) obj).intValue());
                break;
            case 12:
                codedOutputStream.m13912t(((Integer) obj).intValue());
                break;
            case 13:
                codedOutputStream.m13913u(((Long) obj).longValue());
                break;
            case 14:
                int iIntValue = ((Integer) obj).intValue();
                codedOutputStream.m13914v((iIntValue >> 31) ^ (iIntValue << 1));
                break;
            case 15:
                long jLongValue = ((Long) obj).longValue();
                codedOutputStream.m13915w((jLongValue >> 63) ^ (jLongValue << 1));
                break;
            case 16:
                codedOutputStream.getClass();
                ((InterfaceC6997h) obj).mo13784j(codedOutputStream);
                break;
            case 17:
                codedOutputStream.m13908p((InterfaceC6997h) obj);
                break;
            case 18:
                if (!(obj instanceof C6995f.a)) {
                    codedOutputStream.m13906n(((Integer) obj).intValue());
                } else {
                    codedOutputStream.m13906n(((C6995f.a) obj).getNumber());
                }
                break;
            default:
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m13966a(GeneratedMessageLite.C6984d c6984d, Object obj) {
        List arrayList;
        if (!c6984d.f39499d) {
            throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
        }
        m13963k(c6984d.f39498c, obj);
        Object objM13968e = m13968e(c6984d);
        if (objM13968e == null) {
            arrayList = new ArrayList();
            this.f39522a.m13977e(c6984d, arrayList);
        } else {
            arrayList = (List) objM13968e;
        }
        arrayList.add(obj);
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C6994e<FieldDescriptorType> clone() {
        C6998i c6998i;
        C6994e<FieldDescriptorType> c6994e = new C6994e<>();
        int i10 = 0;
        while (true) {
            c6998i = this.f39522a;
            if (i10 >= c6998i.f39532b.size()) {
                break;
            }
            C6999j<K, V>.b bVar = c6998i.f39532b.get(i10);
            c6994e.m13971j((b) bVar.getKey(), bVar.getValue());
            i10++;
        }
        for (Map.Entry<Object, Object> entry : c6998i.m13975c()) {
            c6994e.m13971j((b) entry.getKey(), entry.getValue());
        }
        c6994e.f39524c = this.f39524c;
        return c6994e;
    }

    /* JADX INFO: renamed from: e */
    public final Object m13968e(FieldDescriptorType fielddescriptortype) {
        Object obj = this.f39522a.get(fielddescriptortype);
        return obj instanceof C6996g ? ((C6996g) obj).m13972a() : obj;
    }

    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object, java.util.List] */
    /* JADX INFO: renamed from: g */
    public final void m13969g() {
        if (this.f39523b) {
            return;
        }
        C6998i c6998i = this.f39522a;
        if (!c6998i.f39534d) {
            for (int i10 = 0; i10 < c6998i.f39532b.size(); i10++) {
                C6999j<K, V>.b bVar = c6998i.f39532b.get(i10);
                if (((b) bVar.getKey()).mo13930e()) {
                    bVar.setValue(Collections.unmodifiableList((List) bVar.getValue()));
                }
            }
            for (Map.Entry<Object, Object> entry : c6998i.m13975c()) {
                if (((b) entry.getKey()).mo13930e()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        if (!c6998i.f39534d) {
            c6998i.f39533c = c6998i.f39533c.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(c6998i.f39533c);
            c6998i.f39534d = true;
        }
        this.f39523b = true;
    }

    /* JADX INFO: renamed from: h */
    public final void m13970h(Map.Entry<FieldDescriptorType, Object> entry) {
        FieldDescriptorType key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof C6996g) {
            value = ((C6996g) value).m13972a();
        }
        boolean zMo13930e = key.mo13930e();
        C6998i c6998i = this.f39522a;
        if (zMo13930e) {
            Object objM13968e = m13968e(key);
            if (objM13968e == null) {
                objM13968e = new ArrayList();
            }
            for (Object obj : (List) value) {
                List list = (List) objM13968e;
                if (obj instanceof byte[]) {
                    byte[] bArr = (byte[]) obj;
                    byte[] bArr2 = new byte[bArr.length];
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    obj = bArr2;
                }
                list.add(obj);
            }
            c6998i.m13977e(key, objM13968e);
            return;
        }
        if (key.mo13932j() != WireFormat$JavaType.MESSAGE) {
            if (value instanceof byte[]) {
                byte[] bArr3 = (byte[]) value;
                byte[] bArr4 = new byte[bArr3.length];
                System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
                value = bArr4;
            }
            c6998i.m13977e(key, value);
            return;
        }
        Object objM13968e2 = m13968e(key);
        if (objM13968e2 != null) {
            c6998i.m13977e(key, key.mo13929b(((InterfaceC6997h) objM13968e2).mo13781c(), (InterfaceC6997h) value).mo13789a());
            return;
        }
        if (value instanceof byte[]) {
            byte[] bArr5 = (byte[]) value;
            byte[] bArr6 = new byte[bArr5.length];
            System.arraycopy(bArr5, 0, bArr6, 0, bArr5.length);
            value = bArr6;
        }
        c6998i.m13977e(key, value);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: j */
    public final void m13971j(FieldDescriptorType fielddescriptortype, Object obj) {
        if (!fielddescriptortype.mo13930e()) {
            m13963k(fielddescriptortype.mo13931h(), obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                m13963k(fielddescriptortype.mo13931h(), it.next());
            }
            obj = arrayList;
        }
        if (obj instanceof C6996g) {
            this.f39524c = true;
        }
        this.f39522a.m13977e(fielddescriptortype, obj);
    }
}
