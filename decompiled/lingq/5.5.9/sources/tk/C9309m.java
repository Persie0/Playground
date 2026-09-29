package tk;

import com.kochava.tracker.BuildConfig;
import java.io.IOException;
import p124fp.C5608e;
import p124fp.InterfaceC5609f;

/* JADX INFO: renamed from: tk.m */
/* JADX INFO: loaded from: classes2.dex */
public final class C9309m extends AbstractC9310n {

    /* JADX INFO: renamed from: l */
    public static final String[] f48038l = new String[BuildConfig.SDK_TRUNCATE_LENGTH];

    /* JADX INFO: renamed from: i */
    public final InterfaceC5609f f48039i;

    /* JADX INFO: renamed from: j */
    public final String f48040j = ":";

    /* JADX INFO: renamed from: k */
    public String f48041k;

    static {
        for (int i10 = 0; i10 <= 31; i10++) {
            f48038l[i10] = String.format("\\u%04x", Integer.valueOf(i10));
        }
        String[] strArr = f48038l;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    public C9309m(C5608e c5608e) {
        this.f48039i = c5608e;
        m17653H(6);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0034  */
    /* JADX INFO: renamed from: I0 */
    public static void m17647I0(InterfaceC5609f interfaceC5609f, String str) throws IOException {
        String str2;
        String[] strArr = f48038l;
        interfaceC5609f.mo11937M(34);
        int length = str.length();
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            char cCharAt = str.charAt(i11);
            if (cCharAt < 128) {
                str2 = strArr[cCharAt];
                if (str2 != null) {
                    if (i10 < i11) {
                        interfaceC5609f.mo11974x0(str, i10, i11);
                    }
                    interfaceC5609f.mo11957k0(str2);
                    i10 = i11 + 1;
                }
            } else {
                if (cCharAt == 8232) {
                    str2 = "\\u2028";
                } else if (cCharAt == 8233) {
                    str2 = "\\u2029";
                }
                if (i10 < i11) {
                    interfaceC5609f.mo11974x0(str, i10, i11);
                }
                interfaceC5609f.mo11957k0(str2);
                i10 = i11 + 1;
            }
        }
        if (i10 < length) {
            interfaceC5609f.mo11974x0(str, i10, length);
        }
        interfaceC5609f.mo11937M(34);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: B0 */
    public final void m17648B0(int i10, int i11, char c10) throws IOException {
        int iM17652G = m17652G();
        if (iM17652G != i11 && iM17652G != i10) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.f48041k != null) {
            throw new IllegalStateException("Dangling name: " + this.f48041k);
        }
        int i12 = this.f48042a;
        int i13 = ~this.f48049h;
        if (i12 == i13) {
            this.f48049h = i13;
            return;
        }
        int i14 = i12 - 1;
        this.f48042a = i14;
        this.f48044c[i14] = null;
        int[] iArr = this.f48045d;
        int i15 = i14 - 1;
        iArr[i15] = iArr[i15] + 1;
        this.f48039i.mo11937M(c10);
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
        int iM17652G = m17652G();
        if (iM17652G == 3 || iM17652G == 5) {
            if (this.f48041k == null && !this.f48048g) {
                this.f48041k = str;
                this.f48044c[this.f48042a - 1] = str;
                return this;
            }
        }
        throw new IllegalStateException("Nesting problem.");
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // tk.AbstractC9310n
    /* JADX INFO: renamed from: E */
    public final AbstractC9310n mo10552E() throws IOException {
        if (this.f48048g) {
            throw new IllegalStateException("null cannot be used as a map key in JSON at path " + m17655w());
        }
        if (this.f48041k != null) {
            if (!this.f48047f) {
                this.f48041k = null;
                return this;
            }
            m17650N0();
        }
        m17651y0();
        this.f48039i.mo11957k0("null");
        int[] iArr = this.f48045d;
        int i10 = this.f48042a - 1;
        iArr[i10] = iArr[i10] + 1;
        return this;
    }

    /* JADX INFO: renamed from: G0 */
    public final void m17649G0(int i10, int i11, char c10) throws IOException {
        int i12;
        int i13 = this.f48042a;
        int i14 = this.f48049h;
        if (i13 == i14 && ((i12 = this.f48043b[i13 - 1]) == i10 || i12 == i11)) {
            this.f48049h = ~i14;
            return;
        }
        m17651y0();
        m17654l();
        m17653H(i10);
        this.f48045d[this.f48042a - 1] = 0;
        this.f48039i.mo11937M(c10);
    }

    /* JADX INFO: renamed from: N0 */
    public final void m17650N0() throws IOException {
        if (this.f48041k != null) {
            int iM17652G = m17652G();
            InterfaceC5609f interfaceC5609f = this.f48039i;
            if (iM17652G == 5) {
                interfaceC5609f.mo11937M(44);
            } else if (iM17652G != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            this.f48043b[this.f48042a - 1] = 4;
            m17647I0(interfaceC5609f, this.f48041k);
            this.f48041k = null;
        }
    }

    @Override // tk.AbstractC9310n
    /* JADX INFO: renamed from: Q */
    public final AbstractC9310n mo10553Q(double d10) throws IOException {
        if (!this.f48046e && (Double.isNaN(d10) || Double.isInfinite(d10))) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + d10);
        }
        if (this.f48048g) {
            this.f48048g = false;
            mo10551C(Double.toString(d10));
            return this;
        }
        m17650N0();
        m17651y0();
        this.f48039i.mo11957k0(Double.toString(d10));
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
        m17650N0();
        m17651y0();
        this.f48039i.mo11957k0(Long.toString(j10));
        int[] iArr = this.f48045d;
        int i10 = this.f48042a - 1;
        iArr[i10] = iArr[i10] + 1;
        return this;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // tk.AbstractC9310n
    /* JADX INFO: renamed from: a */
    public final AbstractC9310n mo10555a() throws IOException {
        if (this.f48048g) {
            throw new IllegalStateException("Array cannot be used as a map key in JSON at path " + m17655w());
        }
        m17650N0();
        m17649G0(1, 2, '[');
        return this;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // tk.AbstractC9310n
    /* JADX INFO: renamed from: b */
    public final AbstractC9310n mo10556b() throws IOException {
        if (this.f48048g) {
            throw new IllegalStateException("Object cannot be used as a map key in JSON at path " + m17655w());
        }
        m17650N0();
        m17649G0(3, 5, '{');
        return this;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f48039i.close();
        int i10 = this.f48042a;
        if (i10 > 1 || (i10 == 1 && this.f48043b[i10 - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f48042a = 0;
    }

    @Override // tk.AbstractC9310n
    /* JADX INFO: renamed from: d0 */
    public final AbstractC9310n mo10557d0(Number number) throws IOException {
        if (number == null) {
            mo10552E();
            return this;
        }
        String string = number.toString();
        if (!this.f48046e && (string.equals("-Infinity") || string.equals("Infinity") || string.equals("NaN"))) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + number);
        }
        if (this.f48048g) {
            this.f48048g = false;
            mo10551C(string);
            return this;
        }
        m17650N0();
        m17651y0();
        this.f48039i.mo11957k0(string);
        int[] iArr = this.f48045d;
        int i10 = this.f48042a - 1;
        iArr[i10] = iArr[i10] + 1;
        return this;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.io.Flushable
    public final void flush() throws IOException {
        if (this.f48042a == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f48039i.flush();
    }

    @Override // tk.AbstractC9310n
    /* JADX INFO: renamed from: m0 */
    public final AbstractC9310n mo10558m0(String str) throws IOException {
        if (str == null) {
            mo10552E();
            return this;
        }
        if (this.f48048g) {
            this.f48048g = false;
            mo10551C(str);
            return this;
        }
        m17650N0();
        m17651y0();
        m17647I0(this.f48039i, str);
        int[] iArr = this.f48045d;
        int i10 = this.f48042a - 1;
        iArr[i10] = iArr[i10] + 1;
        return this;
    }

    @Override // tk.AbstractC9310n
    /* JADX INFO: renamed from: q */
    public final AbstractC9310n mo10559q() throws IOException {
        m17648B0(1, 2, ']');
        return this;
    }

    @Override // tk.AbstractC9310n
    /* JADX INFO: renamed from: r */
    public final AbstractC9310n mo10560r() throws IOException {
        this.f48048g = false;
        m17648B0(3, 5, '}');
        return this;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // tk.AbstractC9310n
    /* JADX INFO: renamed from: s0 */
    public final AbstractC9310n mo10561s0(boolean z10) throws IOException {
        if (this.f48048g) {
            throw new IllegalStateException("Boolean cannot be used as a map key in JSON at path " + m17655w());
        }
        m17650N0();
        m17651y0();
        this.f48039i.mo11957k0(z10 ? "true" : "false");
        int[] iArr = this.f48045d;
        int i10 = this.f48042a - 1;
        iArr[i10] = iArr[i10] + 1;
        return this;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: y0 */
    public final void m17651y0() throws IOException {
        int iM17652G = m17652G();
        int i10 = 2;
        if (iM17652G != 1) {
            InterfaceC5609f interfaceC5609f = this.f48039i;
            if (iM17652G == 2) {
                interfaceC5609f.mo11937M(44);
            } else if (iM17652G == 4) {
                interfaceC5609f.mo11957k0(this.f48040j);
                i10 = 5;
            } else {
                if (iM17652G == 9) {
                    throw new IllegalStateException("Sink from valueSink() was not closed");
                }
                i10 = 7;
                if (iM17652G != 6) {
                    if (iM17652G != 7) {
                        throw new IllegalStateException("Nesting problem.");
                    }
                    if (!this.f48046e) {
                        throw new IllegalStateException("JSON must have only one top-level value.");
                    }
                }
            }
        }
        this.f48043b[this.f48042a - 1] = i10;
    }
}
