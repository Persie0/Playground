package p000;

import com.google.zxing.datamatrix.encoder.SymbolShapeHint;

/* JADX INFO: loaded from: classes2.dex */
public class cp9 {

    /* JADX INFO: renamed from: i */
    public static final cp9[] f34350i = {new cp9(false, 3, 5, 8, 8, 1, 3, 5), new cp9(false, 5, 7, 10, 10, 1, 5, 7), new cp9(true, 5, 7, 16, 6, 1, 5, 7), new cp9(false, 8, 10, 12, 12, 1, 8, 10), new cp9(true, 10, 11, 14, 6, 2, 10, 11), new cp9(false, 12, 12, 14, 14, 1, 12, 12), new cp9(true, 16, 14, 24, 10, 1, 16, 14), new cp9(false, 18, 14, 16, 16, 1, 18, 14), new cp9(false, 22, 18, 18, 18, 1, 22, 18), new cp9(true, 22, 18, 16, 10, 2, 22, 18), new cp9(false, 30, 20, 20, 20, 1, 30, 20), new cp9(true, 32, 24, 16, 14, 2, 32, 24), new cp9(false, 36, 24, 22, 22, 1, 36, 24), new cp9(false, 44, 28, 24, 24, 1, 44, 28), new cp9(true, 49, 28, 22, 14, 2, 49, 28), new cp9(false, 62, 36, 14, 14, 4, 62, 36), new cp9(false, 86, 42, 16, 16, 4, 86, 42), new cp9(false, 114, 48, 18, 18, 4, 114, 48), new cp9(false, 144, 56, 20, 20, 4, 144, 56), new cp9(false, 174, 68, 22, 22, 4, 174, 68), new cp9(false, 204, 84, 24, 24, 4, 102, 42), new cp9(false, 280, 112, 14, 14, 16, 140, 56), new cp9(false, 368, 144, 16, 16, 16, 92, 36), new cp9(false, 456, 192, 18, 18, 16, 114, 48), new cp9(false, 576, 224, 20, 20, 16, 144, 56), new cp9(false, 696, 272, 22, 22, 16, 174, 68), new cp9(false, 816, 336, 24, 24, 16, 136, 56), new cp9(false, 1050, 408, 18, 18, 36, 175, 68), new cp9(false, 1304, 496, 20, 20, 36, 163, 62), new zz1(false, 1558, 620, 22, 22, 36, -1, 62)};

    /* JADX INFO: renamed from: a */
    public final boolean f34351a;

    /* JADX INFO: renamed from: b */
    public final int f34352b;

    /* JADX INFO: renamed from: c */
    public final int f34353c;

    /* JADX INFO: renamed from: d */
    public final int f34354d;

    /* JADX INFO: renamed from: e */
    public final int f34355e;

    /* JADX INFO: renamed from: f */
    public final int f34356f;

    /* JADX INFO: renamed from: g */
    public final int f34357g;

    /* JADX INFO: renamed from: h */
    public final int f34358h;

    public cp9(boolean z, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.f34351a = z;
        this.f34352b = i;
        this.f34353c = i2;
        this.f34354d = i3;
        this.f34355e = i4;
        this.f34356f = i5;
        this.f34357g = i6;
        this.f34358h = i7;
    }

    /* JADX INFO: renamed from: e */
    public static cp9 m9835e(int i, SymbolShapeHint symbolShapeHint) {
        for (int i2 = 0; i2 < 30; i2++) {
            cp9 cp9Var = f34350i[i2];
            if (!(symbolShapeHint == SymbolShapeHint.FORCE_SQUARE && cp9Var.f34351a) && ((symbolShapeHint != SymbolShapeHint.FORCE_RECTANGLE || cp9Var.f34351a) && i <= cp9Var.f34352b)) {
                return cp9Var;
            }
        }
        C3386nv.m17626m("Can't find a symbol arrangement that matches the message. Data codewords: ".concat(String.valueOf(i)));
        return null;
    }

    /* JADX INFO: renamed from: a */
    public int mo9836a(int i) {
        return this.f34357g;
    }

    /* JADX INFO: renamed from: b */
    public final int m9837b() {
        int i = this.f34356f;
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2 && i != 4) {
                if (i == 16) {
                    return 4;
                }
                if (i == 36) {
                    return 6;
                }
                C3386nv.m17633t("Cannot handle this number of data regions");
                return 0;
            }
        }
        return i2;
    }

    /* JADX INFO: renamed from: c */
    public int mo9838c() {
        return this.f34352b / this.f34357g;
    }

    /* JADX INFO: renamed from: d */
    public final int m9839d() {
        int i = this.f34356f;
        if (i == 1 || i == 2) {
            return 1;
        }
        if (i == 4) {
            return 2;
        }
        if (i == 16) {
            return 4;
        }
        if (i == 36) {
            return 6;
        }
        C3386nv.m17633t("Cannot handle this number of data regions");
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f34351a ? "Rectangular Symbol:" : "Square Symbol:");
        sb.append(" data region ");
        int i = this.f34354d;
        sb.append(i);
        sb.append('x');
        int i2 = this.f34355e;
        sb.append(i2);
        sb.append(", symbol size ");
        sb.append((m9837b() * i) + (m9837b() << 1));
        sb.append('x');
        sb.append((m9839d() * i2) + (m9839d() << 1));
        sb.append(", symbol data size ");
        sb.append(m9837b() * i);
        sb.append('x');
        sb.append(m9839d() * i2);
        sb.append(", codewords ");
        sb.append(this.f34352b);
        sb.append('+');
        sb.append(this.f34353c);
        return sb.toString();
    }
}
