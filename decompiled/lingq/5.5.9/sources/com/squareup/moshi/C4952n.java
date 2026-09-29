package com.squareup.moshi;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import tk.AbstractC9310n;

/* JADX INFO: renamed from: com.squareup.moshi.n */
/* JADX INFO: loaded from: classes2.dex */
public final class C4952n extends AbstractC9310n {

    /* JADX INFO: renamed from: i */
    public Object[] f32263i = new Object[32];

    /* JADX INFO: renamed from: j */
    public String f32264j;

    public C4952n() {
        m17653H(6);
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // tk.AbstractC9310n
    /* JADX INFO: renamed from: C */
    public final AbstractC9310n mo10551C(String str) throws IOException {
        if (str == null) {
            throw new NullPointerException("name == null");
        }
        if (this.f48042a == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        if (m17652G() != 3 || this.f32264j != null || this.f48048g) {
            throw new IllegalStateException("Nesting problem.");
        }
        this.f32264j = str;
        this.f48044c[this.f48042a - 1] = str;
        return this;
    }

    @Override // tk.AbstractC9310n
    /* JADX INFO: renamed from: E */
    public final AbstractC9310n mo10552E() throws IOException {
        if (this.f48048g) {
            throw new IllegalStateException("null cannot be used as a map key in JSON at path " + m17655w());
        }
        m10562y0(null);
        int[] iArr = this.f48045d;
        int i10 = this.f48042a - 1;
        iArr[i10] = iArr[i10] + 1;
        return this;
    }

    @Override // tk.AbstractC9310n
    /* JADX INFO: renamed from: Q */
    public final AbstractC9310n mo10553Q(double d10) throws IOException {
        if (!this.f48046e && (Double.isNaN(d10) || d10 == Double.NEGATIVE_INFINITY || d10 == Double.POSITIVE_INFINITY)) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + d10);
        }
        if (this.f48048g) {
            this.f48048g = false;
            mo10551C(Double.toString(d10));
            return this;
        }
        m10562y0(Double.valueOf(d10));
        int[] iArr = this.f48045d;
        int i10 = this.f48042a - 1;
        iArr[i10] = iArr[i10] + 1;
        return this;
    }

    @Override // tk.AbstractC9310n
    /* JADX INFO: renamed from: U */
    public final AbstractC9310n mo10554U(long j10) throws IOException {
        if (this.f48048g) {
            this.f48048g = false;
            mo10551C(Long.toString(j10));
            return this;
        }
        m10562y0(Long.valueOf(j10));
        int[] iArr = this.f48045d;
        int i10 = this.f48042a - 1;
        iArr[i10] = iArr[i10] + 1;
        return this;
    }

    @Override // tk.AbstractC9310n
    /* JADX INFO: renamed from: a */
    public final AbstractC9310n mo10555a() throws IOException {
        if (this.f48048g) {
            throw new IllegalStateException("Array cannot be used as a map key in JSON at path " + m17655w());
        }
        int i10 = this.f48042a;
        int i11 = this.f48049h;
        if (i10 == i11 && this.f48043b[i10 - 1] == 1) {
            this.f48049h = ~i11;
            return this;
        }
        m17654l();
        ArrayList arrayList = new ArrayList();
        m10562y0(arrayList);
        Object[] objArr = this.f32263i;
        int i12 = this.f48042a;
        objArr[i12] = arrayList;
        this.f48045d[i12] = 0;
        m17653H(1);
        return this;
    }

    @Override // tk.AbstractC9310n
    /* JADX INFO: renamed from: b */
    public final AbstractC9310n mo10556b() throws IOException {
        if (this.f48048g) {
            throw new IllegalStateException("Object cannot be used as a map key in JSON at path " + m17655w());
        }
        int i10 = this.f48042a;
        int i11 = this.f48049h;
        if (i10 == i11 && this.f48043b[i10 - 1] == 3) {
            this.f48049h = ~i11;
            return this;
        }
        m17654l();
        LinkedHashTreeMap linkedHashTreeMap = new LinkedHashTreeMap();
        m10562y0(linkedHashTreeMap);
        this.f32263i[this.f48042a] = linkedHashTreeMap;
        m17653H(3);
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        int i10 = this.f48042a;
        if (i10 > 1 || (i10 == 1 && this.f48043b[i10 - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f48042a = 0;
    }

    @Override // tk.AbstractC9310n
    /* JADX INFO: renamed from: d0 */
    public final AbstractC9310n mo10557d0(Number number) throws IOException {
        if (!(number instanceof Byte) && !(number instanceof Short) && !(number instanceof Integer) && !(number instanceof Long)) {
            if ((number instanceof Float) || (number instanceof Double)) {
                mo10553Q(number.doubleValue());
                return this;
            }
            if (number == null) {
                mo10552E();
                return this;
            }
            BigDecimal bigDecimal = number instanceof BigDecimal ? (BigDecimal) number : new BigDecimal(number.toString());
            if (this.f48048g) {
                this.f48048g = false;
                mo10551C(bigDecimal.toString());
                return this;
            }
            m10562y0(bigDecimal);
            int[] iArr = this.f48045d;
            int i10 = this.f48042a - 1;
            iArr[i10] = iArr[i10] + 1;
            return this;
        }
        mo10554U(number.longValue());
        return this;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.io.Flushable
    public final void flush() throws IOException {
        if (this.f48042a == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
    }

    @Override // tk.AbstractC9310n
    /* JADX INFO: renamed from: m0 */
    public final AbstractC9310n mo10558m0(String str) throws IOException {
        if (this.f48048g) {
            this.f48048g = false;
            mo10551C(str);
            return this;
        }
        m10562y0(str);
        int[] iArr = this.f48045d;
        int i10 = this.f48042a - 1;
        iArr[i10] = iArr[i10] + 1;
        return this;
    }

    @Override // tk.AbstractC9310n
    /* JADX INFO: renamed from: q */
    public final AbstractC9310n mo10559q() throws IOException {
        if (m17652G() != 1) {
            throw new IllegalStateException("Nesting problem.");
        }
        int i10 = this.f48042a;
        int i11 = this.f48049h;
        if (i10 == (~i11)) {
            this.f48049h = ~i11;
            return this;
        }
        int i12 = i10 - 1;
        this.f48042a = i12;
        this.f32263i[i12] = null;
        int[] iArr = this.f48045d;
        int i13 = i12 - 1;
        iArr[i13] = iArr[i13] + 1;
        return this;
    }

    @Override // tk.AbstractC9310n
    /* JADX INFO: renamed from: r */
    public final AbstractC9310n mo10560r() throws IOException {
        if (m17652G() != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.f32264j != null) {
            throw new IllegalStateException("Dangling name: " + this.f32264j);
        }
        int i10 = this.f48042a;
        int i11 = this.f48049h;
        if (i10 == (~i11)) {
            this.f48049h = ~i11;
            return this;
        }
        this.f48048g = false;
        int i12 = i10 - 1;
        this.f48042a = i12;
        this.f32263i[i12] = null;
        this.f48044c[i12] = null;
        int[] iArr = this.f48045d;
        int i13 = i12 - 1;
        iArr[i13] = iArr[i13] + 1;
        return this;
    }

    @Override // tk.AbstractC9310n
    /* JADX INFO: renamed from: s0 */
    public final AbstractC9310n mo10561s0(boolean z10) throws IOException {
        if (this.f48048g) {
            throw new IllegalStateException("Boolean cannot be used as a map key in JSON at path " + m17655w());
        }
        m10562y0(Boolean.valueOf(z10));
        int[] iArr = this.f48045d;
        int i10 = this.f48042a - 1;
        iArr[i10] = iArr[i10] + 1;
        return this;
    }

    /* JADX WARN: Unreachable blocks removed: 3, instructions: 3 */
    /* JADX INFO: renamed from: y0 */
    public final void m10562y0(Object obj) {
        String str;
        int iM17652G = m17652G();
        int i10 = this.f48042a;
        if (i10 == 1) {
            if (iM17652G != 6) {
                throw new IllegalStateException("JSON must have only one top-level value.");
            }
            this.f48043b[i10 - 1] = 7;
            this.f32263i[i10 - 1] = obj;
            return;
        }
        if (iM17652G != 3 || (str = this.f32264j) == null) {
            if (iM17652G == 1) {
                ((List) this.f32263i[i10 - 1]).add(obj);
                return;
            } else {
                if (iM17652G != 9) {
                    throw new IllegalStateException("Nesting problem.");
                }
                throw new IllegalStateException("Sink from valueSink() was not closed");
            }
        }
        if (obj != null || this.f48047f) {
            Object objPut = ((Map) this.f32263i[i10 - 1]).put(str, obj);
            if (objPut != null) {
                throw new IllegalArgumentException("Map key '" + this.f32264j + "' has multiple values at path " + m17655w() + ": " + objPut + " and " + obj);
            }
        }
        this.f32264j = null;
    }
}
