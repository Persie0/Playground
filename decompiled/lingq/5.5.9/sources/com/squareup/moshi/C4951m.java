package com.squareup.moshi;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.squareup.moshi.m */
/* JADX INFO: loaded from: classes2.dex */
public final class C4951m extends JsonReader {

    /* JADX INFO: renamed from: h */
    public static final Object f32258h = new Object();

    /* JADX INFO: renamed from: g */
    public Object[] f32259g;

    /* JADX INFO: renamed from: com.squareup.moshi.m$a */
    public static final class a implements Iterator<Object>, Cloneable {

        /* JADX INFO: renamed from: a */
        public final JsonReader.Token f32260a;

        /* JADX INFO: renamed from: b */
        public final Object[] f32261b;

        /* JADX INFO: renamed from: c */
        public int f32262c;

        public a(JsonReader.Token token, Object[] objArr, int i10) {
            this.f32260a = token;
            this.f32261b = objArr;
            this.f32262c = i10;
        }

        public final Object clone() throws CloneNotSupportedException {
            return new a(this.f32260a, this.f32261b, this.f32262c);
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f32262c < this.f32261b.length;
        }

        @Override // java.util.Iterator
        public final Object next() {
            int i10 = this.f32262c;
            this.f32262c = i10 + 1;
            return this.f32261b[i10];
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public C4951m(Object obj) {
        int[] iArr = this.f32176b;
        int i10 = this.f32175a;
        iArr[i10] = 7;
        Object[] objArr = new Object[32];
        this.f32259g = objArr;
        this.f32175a = i10 + 1;
        objArr[i10] = obj;
    }

    @Override // com.squareup.moshi.JsonReader
    /* JADX INFO: renamed from: B0 */
    public final int mo10492B0(JsonReader.C4932a c4932a) throws IOException {
        int i10 = this.f32175a;
        Object obj = i10 != 0 ? this.f32259g[i10 - 1] : null;
        if (!(obj instanceof String)) {
            if (obj != f32258h) {
                return -1;
            }
            throw new IllegalStateException("JsonReader is closed");
        }
        String str = (String) obj;
        int length = c4932a.f32181a.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (c4932a.f32181a[i11].equals(str)) {
                m10549X0();
                return i11;
            }
        }
        return -1;
    }

    @Override // com.squareup.moshi.JsonReader
    /* JADX INFO: renamed from: C */
    public final boolean mo10493C() throws IOException {
        Boolean bool = (Boolean) m10550c1(Boolean.class, JsonReader.Token.BOOLEAN);
        m10549X0();
        return bool.booleanValue();
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // com.squareup.moshi.JsonReader
    /* JADX INFO: renamed from: E */
    public final double mo10494E() throws IOException {
        double dDoubleValue;
        JsonReader.Token token = JsonReader.Token.NUMBER;
        Object objM10550c1 = m10550c1(Object.class, token);
        if (objM10550c1 instanceof Number) {
            dDoubleValue = ((Number) objM10550c1).doubleValue();
        } else {
            if (!(objM10550c1 instanceof String)) {
                throw m10500P0(objM10550c1, token);
            }
            try {
                dDoubleValue = Double.parseDouble((String) objM10550c1);
            } catch (NumberFormatException unused) {
                throw m10500P0(objM10550c1, JsonReader.Token.NUMBER);
            }
        }
        if (this.f32179e || !(Double.isNaN(dDoubleValue) || Double.isInfinite(dDoubleValue))) {
            m10549X0();
            return dDoubleValue;
        }
        throw new JsonEncodingException("JSON forbids NaN and infinities: " + dDoubleValue + " at path " + m10509r());
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // com.squareup.moshi.JsonReader
    /* JADX INFO: renamed from: G */
    public final int mo10495G() throws IOException {
        int iIntValueExact;
        JsonReader.Token token = JsonReader.Token.NUMBER;
        Object objM10550c1 = m10550c1(Object.class, token);
        if (objM10550c1 instanceof Number) {
            iIntValueExact = ((Number) objM10550c1).intValue();
        } else {
            if (!(objM10550c1 instanceof String)) {
                throw m10500P0(objM10550c1, token);
            }
            try {
                try {
                    iIntValueExact = Integer.parseInt((String) objM10550c1);
                } catch (NumberFormatException unused) {
                    throw m10500P0(objM10550c1, JsonReader.Token.NUMBER);
                }
            } catch (NumberFormatException unused2) {
                iIntValueExact = new BigDecimal((String) objM10550c1).intValueExact();
            }
        }
        m10549X0();
        return iIntValueExact;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.squareup.moshi.JsonReader
    /* JADX INFO: renamed from: G0 */
    public final void mo10496G0() throws IOException {
        if (!this.f32180f) {
            this.f32259g[this.f32175a - 1] = ((Map.Entry) m10550c1(Map.Entry.class, JsonReader.Token.NAME)).getValue();
            this.f32177c[this.f32175a - 2] = "null";
        } else {
            JsonReader.Token tokenMo10505d0 = mo10505d0();
            m10547Q0();
            throw new JsonDataException("Cannot skip unexpected " + tokenMo10505d0 + " at " + m10509r());
        }
    }

    @Override // com.squareup.moshi.JsonReader
    /* JADX INFO: renamed from: H */
    public final long mo10497H() throws IOException {
        long jLongValueExact;
        JsonReader.Token token = JsonReader.Token.NUMBER;
        Object objM10550c1 = m10550c1(Object.class, token);
        if (objM10550c1 instanceof Number) {
            jLongValueExact = ((Number) objM10550c1).longValue();
        } else {
            if (!(objM10550c1 instanceof String)) {
                throw m10500P0(objM10550c1, token);
            }
            try {
                try {
                    jLongValueExact = Long.parseLong((String) objM10550c1);
                } catch (NumberFormatException unused) {
                    jLongValueExact = new BigDecimal((String) objM10550c1).longValueExact();
                }
            } catch (NumberFormatException unused2) {
                throw m10500P0(objM10550c1, JsonReader.Token.NUMBER);
            }
        }
        m10549X0();
        return jLongValueExact;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // com.squareup.moshi.JsonReader
    /* JADX INFO: renamed from: I0 */
    public final void mo10498I0() throws IOException {
        if (this.f32180f) {
            throw new JsonDataException("Cannot skip unexpected " + mo10505d0() + " at " + m10509r());
        }
        int i10 = this.f32175a;
        if (i10 > 1) {
            this.f32177c[i10 - 2] = "null";
        }
        Object obj = i10 != 0 ? this.f32259g[i10 - 1] : null;
        if (obj instanceof a) {
            throw new JsonDataException("Expected a value but was " + mo10505d0() + " at path " + m10509r());
        }
        if (obj instanceof Map.Entry) {
            Object[] objArr = this.f32259g;
            objArr[i10 - 1] = ((Map.Entry) objArr[i10 - 1]).getValue();
        } else {
            if (i10 > 0) {
                m10549X0();
                return;
            }
            throw new JsonDataException("Expected a value but was " + mo10505d0() + " at path " + m10509r());
        }
    }

    @Override // com.squareup.moshi.JsonReader
    /* JADX INFO: renamed from: Q */
    public final void mo10501Q() throws IOException {
        m10550c1(Void.class, JsonReader.Token.NULL);
        m10549X0();
    }

    /* JADX INFO: renamed from: Q0 */
    public final String m10547Q0() throws IOException {
        JsonReader.Token token = JsonReader.Token.NAME;
        Map.Entry entry = (Map.Entry) m10550c1(Map.Entry.class, token);
        Object key = entry.getKey();
        if (!(key instanceof String)) {
            throw m10500P0(key, token);
        }
        String str = (String) key;
        this.f32259g[this.f32175a - 1] = entry.getValue();
        this.f32177c[this.f32175a - 2] = str;
        return str;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // com.squareup.moshi.JsonReader
    /* JADX INFO: renamed from: U */
    public final String mo10502U() throws IOException {
        int i10 = this.f32175a;
        Object obj = i10 != 0 ? this.f32259g[i10 - 1] : null;
        if (obj instanceof String) {
            m10549X0();
            return (String) obj;
        }
        if (obj instanceof Number) {
            m10549X0();
            return obj.toString();
        }
        if (obj == f32258h) {
            throw new IllegalStateException("JsonReader is closed");
        }
        throw m10500P0(obj, JsonReader.Token.STRING);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: W0 */
    public final void m10548W0(Object obj) {
        int i10 = this.f32175a;
        if (i10 == this.f32259g.length) {
            if (i10 == 256) {
                throw new JsonDataException("Nesting too deep at " + m10509r());
            }
            int[] iArr = this.f32176b;
            this.f32176b = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f32177c;
            this.f32177c = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
            int[] iArr2 = this.f32178d;
            this.f32178d = Arrays.copyOf(iArr2, iArr2.length * 2);
            Object[] objArr = this.f32259g;
            this.f32259g = Arrays.copyOf(objArr, objArr.length * 2);
        }
        Object[] objArr2 = this.f32259g;
        int i11 = this.f32175a;
        this.f32175a = i11 + 1;
        objArr2[i11] = obj;
    }

    /* JADX INFO: renamed from: X0 */
    public final void m10549X0() {
        int i10 = this.f32175a - 1;
        this.f32175a = i10;
        Object[] objArr = this.f32259g;
        objArr[i10] = null;
        this.f32176b[i10] = 0;
        if (i10 > 0) {
            int[] iArr = this.f32178d;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
            Object obj = objArr[i10 - 1];
            if (obj instanceof Iterator) {
                Iterator it = (Iterator) obj;
                if (it.hasNext()) {
                    m10548W0(it.next());
                }
            }
        }
    }

    @Override // com.squareup.moshi.JsonReader
    /* JADX INFO: renamed from: a */
    public final void mo10503a() throws IOException {
        List list = (List) m10550c1(List.class, JsonReader.Token.BEGIN_ARRAY);
        a aVar = new a(JsonReader.Token.END_ARRAY, list.toArray(new Object[list.size()]), 0);
        Object[] objArr = this.f32259g;
        int i10 = this.f32175a;
        int i11 = i10 - 1;
        objArr[i11] = aVar;
        this.f32176b[i11] = 1;
        this.f32178d[i10 - 1] = 0;
        if (aVar.hasNext()) {
            m10548W0(aVar.next());
        }
    }

    @Override // com.squareup.moshi.JsonReader
    /* JADX INFO: renamed from: b */
    public final void mo10504b() throws IOException {
        Map map = (Map) m10550c1(Map.class, JsonReader.Token.BEGIN_OBJECT);
        a aVar = new a(JsonReader.Token.END_OBJECT, map.entrySet().toArray(new Object[map.size()]), 0);
        Object[] objArr = this.f32259g;
        int i10 = this.f32175a;
        objArr[i10 - 1] = aVar;
        this.f32176b[i10 - 1] = 3;
        if (aVar.hasNext()) {
            m10548W0(aVar.next());
        }
    }

    /* JADX INFO: renamed from: c1 */
    public final <T> T m10550c1(Class<T> cls, JsonReader.Token token) throws IOException {
        int i10 = this.f32175a;
        Object obj = i10 != 0 ? this.f32259g[i10 - 1] : null;
        if (cls.isInstance(obj)) {
            return cls.cast(obj);
        }
        if (obj == null && token == JsonReader.Token.NULL) {
            return null;
        }
        if (obj == f32258h) {
            throw new IllegalStateException("JsonReader is closed");
        }
        throw m10500P0(obj, token);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        Arrays.fill(this.f32259g, 0, this.f32175a, (Object) null);
        this.f32259g[0] = f32258h;
        this.f32176b[0] = 8;
        this.f32175a = 1;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.squareup.moshi.JsonReader
    /* JADX INFO: renamed from: d0 */
    public final JsonReader.Token mo10505d0() throws IOException {
        int i10 = this.f32175a;
        if (i10 == 0) {
            return JsonReader.Token.END_DOCUMENT;
        }
        Object obj = this.f32259g[i10 - 1];
        if (obj instanceof a) {
            return ((a) obj).f32260a;
        }
        if (obj instanceof List) {
            return JsonReader.Token.BEGIN_ARRAY;
        }
        if (obj instanceof Map) {
            return JsonReader.Token.BEGIN_OBJECT;
        }
        if (obj instanceof Map.Entry) {
            return JsonReader.Token.NAME;
        }
        if (obj instanceof String) {
            return JsonReader.Token.STRING;
        }
        if (obj instanceof Boolean) {
            return JsonReader.Token.BOOLEAN;
        }
        if (obj instanceof Number) {
            return JsonReader.Token.NUMBER;
        }
        if (obj == null) {
            return JsonReader.Token.NULL;
        }
        if (obj == f32258h) {
            throw new IllegalStateException("JsonReader is closed");
        }
        throw m10500P0(obj, "a JSON value");
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.squareup.moshi.JsonReader
    /* JADX INFO: renamed from: l */
    public final void mo10506l() throws IOException {
        JsonReader.Token token = JsonReader.Token.END_ARRAY;
        a aVar = (a) m10550c1(a.class, token);
        if (aVar.f32260a != token || aVar.hasNext()) {
            throw m10500P0(aVar, token);
        }
        m10549X0();
    }

    @Override // com.squareup.moshi.JsonReader
    /* JADX INFO: renamed from: m0 */
    public final void mo10507m0() throws IOException {
        if (mo10511w()) {
            m10548W0(m10547Q0());
        }
    }

    @Override // com.squareup.moshi.JsonReader
    /* JADX INFO: renamed from: q */
    public final void mo10508q() throws IOException {
        JsonReader.Token token = JsonReader.Token.END_OBJECT;
        a aVar = (a) m10550c1(a.class, token);
        if (aVar.f32260a != token || aVar.hasNext()) {
            throw m10500P0(aVar, token);
        }
        this.f32177c[this.f32175a - 1] = null;
        m10549X0();
    }

    @Override // com.squareup.moshi.JsonReader
    /* JADX INFO: renamed from: w */
    public final boolean mo10511w() throws IOException {
        int i10 = this.f32175a;
        boolean z10 = false;
        if (i10 == 0) {
            return false;
        }
        Object obj = this.f32259g[i10 - 1];
        if (!(obj instanceof Iterator) || ((Iterator) obj).hasNext()) {
            z10 = true;
        }
        return z10;
    }

    @Override // com.squareup.moshi.JsonReader
    /* JADX INFO: renamed from: y0 */
    public final int mo10512y0(JsonReader.C4932a c4932a) throws IOException {
        JsonReader.Token token = JsonReader.Token.NAME;
        Map.Entry entry = (Map.Entry) m10550c1(Map.Entry.class, token);
        Object key = entry.getKey();
        if (!(key instanceof String)) {
            throw m10500P0(key, token);
        }
        String str = (String) key;
        int length = c4932a.f32181a.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (c4932a.f32181a[i10].equals(str)) {
                this.f32259g[this.f32175a - 1] = entry.getValue();
                this.f32177c[this.f32175a - 2] = str;
                return i10;
            }
        }
        return -1;
    }
}
