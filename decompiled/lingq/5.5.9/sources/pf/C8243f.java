package pf;

import com.google.zxing.datamatrix.encoder.SymbolShapeHint;
import p242lf.C7356a;

/* JADX INFO: renamed from: pf.f */
/* JADX INFO: loaded from: classes.dex */
public class C8243f {

    /* JADX INFO: renamed from: i */
    public static final C8243f[] f44523i = {new C8243f(false, 3, 5, 8, 8, 1), new C8243f(false, 5, 7, 10, 10, 1), new C8243f(true, 5, 7, 16, 6, 1), new C8243f(false, 8, 10, 12, 12, 1), new C8243f(true, 10, 11, 14, 6, 2), new C8243f(false, 12, 12, 14, 14, 1), new C8243f(true, 16, 14, 24, 10, 1), new C8243f(false, 18, 14, 16, 16, 1), new C8243f(false, 22, 18, 18, 18, 1), new C8243f(true, 22, 18, 16, 10, 2), new C8243f(false, 30, 20, 20, 20, 1), new C8243f(true, 32, 24, 16, 14, 2), new C8243f(false, 36, 24, 22, 22, 1), new C8243f(false, 44, 28, 24, 24, 1), new C8243f(true, 49, 28, 22, 14, 2), new C8243f(false, 62, 36, 14, 14, 4), new C8243f(false, 86, 42, 16, 16, 4), new C8243f(false, 114, 48, 18, 18, 4), new C8243f(false, 144, 56, 20, 20, 4), new C8243f(false, 174, 68, 22, 22, 4), new C8243f(false, 204, 84, 24, 24, 4, 102, 42), new C8243f(false, 280, 112, 14, 14, 16, 140, 56), new C8243f(false, 368, 144, 16, 16, 16, 92, 36), new C8243f(false, 456, 192, 18, 18, 16, 114, 48), new C8243f(false, 576, 224, 20, 20, 16, 144, 56), new C8243f(false, 696, 272, 22, 22, 16, 174, 68), new C8243f(false, 816, 336, 24, 24, 16, 136, 56), new C8243f(false, 1050, 408, 18, 18, 36, 175, 68), new C8243f(false, 1304, 496, 20, 20, 36, 163, 62), new C8238a()};

    /* JADX INFO: renamed from: a */
    public final boolean f44524a;

    /* JADX INFO: renamed from: b */
    public final int f44525b;

    /* JADX INFO: renamed from: c */
    public final int f44526c;

    /* JADX INFO: renamed from: d */
    public final int f44527d;

    /* JADX INFO: renamed from: e */
    public final int f44528e;

    /* JADX INFO: renamed from: f */
    public final int f44529f;

    /* JADX INFO: renamed from: g */
    public final int f44530g;

    /* JADX INFO: renamed from: h */
    public final int f44531h;

    public C8243f(boolean z10, int i10, int i11, int i12, int i13, int i14) {
        this(z10, i10, i11, i12, i13, i14, i10, i11);
    }

    public C8243f(boolean z10, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        this.f44524a = z10;
        this.f44525b = i10;
        this.f44526c = i11;
        this.f44527d = i12;
        this.f44528e = i13;
        this.f44529f = i14;
        this.f44530g = i15;
        this.f44531h = i16;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: f */
    public static C8243f m16390f(int i10, SymbolShapeHint symbolShapeHint, C7356a c7356a, C7356a c7356a2) {
        C8243f[] c8243fArr = f44523i;
        for (int i11 = 0; i11 < 30; i11++) {
            C8243f c8243f = c8243fArr[i11];
            if (symbolShapeHint != SymbolShapeHint.FORCE_SQUARE || !c8243f.f44524a) {
                if ((symbolShapeHint != SymbolShapeHint.FORCE_RECTANGLE || c8243f.f44524a) && (c7356a == null || (c8243f.m16392d() >= 0 && (c8243f.m16393e() * c8243f.f44528e) + (c8243f.m16393e() << 1) >= 0))) {
                    if ((c7356a2 == null || (c8243f.m16392d() <= 0 && (c8243f.m16393e() * c8243f.f44528e) + (c8243f.m16393e() << 1) <= 0)) && i10 <= c8243f.f44525b) {
                        return c8243f;
                    }
                }
            }
        }
        throw new IllegalArgumentException("Can't find a symbol arrangement that matches the message. Data codewords: ".concat(String.valueOf(i10)));
    }

    /* JADX INFO: renamed from: a */
    public int mo16380a(int i10) {
        return this.f44530g;
    }

    /* JADX INFO: renamed from: b */
    public final int m16391b() {
        int i10 = 1;
        int i11 = this.f44529f;
        if (i11 != 1) {
            i10 = 2;
            if (i11 != 2 && i11 != 4) {
                if (i11 == 16) {
                    return 4;
                }
                if (i11 == 36) {
                    return 6;
                }
                throw new IllegalStateException("Cannot handle this number of data regions");
            }
        }
        return i10;
    }

    /* JADX INFO: renamed from: c */
    public int mo16381c() {
        return this.f44525b / this.f44530g;
    }

    /* JADX INFO: renamed from: d */
    public final int m16392d() {
        return (m16391b() * this.f44527d) + (m16391b() << 1);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: e */
    public final int m16393e() {
        int i10 = this.f44529f;
        if (i10 == 1 || i10 == 2) {
            return 1;
        }
        if (i10 == 4) {
            return 2;
        }
        if (i10 == 16) {
            return 4;
        }
        if (i10 == 36) {
            return 6;
        }
        throw new IllegalStateException("Cannot handle this number of data regions");
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f44524a ? "Rectangular Symbol:" : "Square Symbol:");
        sb2.append(" data region ");
        int i10 = this.f44527d;
        sb2.append(i10);
        sb2.append('x');
        int i11 = this.f44528e;
        sb2.append(i11);
        sb2.append(", symbol size ");
        sb2.append(m16392d());
        sb2.append('x');
        sb2.append((m16393e() * i11) + (m16393e() << 1));
        sb2.append(", symbol data size ");
        sb2.append(m16391b() * i10);
        sb2.append('x');
        sb2.append(m16393e() * i11);
        sb2.append(", codewords ");
        sb2.append(this.f44525b);
        sb2.append('+');
        sb2.append(this.f44526c);
        return sb2.toString();
    }
}
