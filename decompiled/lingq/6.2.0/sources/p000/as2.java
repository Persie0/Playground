package p000;

import com.google.zxing.datamatrix.encoder.SymbolShapeHint;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes2.dex */
public final class as2 {

    /* JADX INFO: renamed from: a */
    public final String f7417a;

    /* JADX INFO: renamed from: b */
    public SymbolShapeHint f7418b;

    /* JADX INFO: renamed from: c */
    public final StringBuilder f7419c;

    /* JADX INFO: renamed from: d */
    public int f7420d;

    /* JADX INFO: renamed from: e */
    public int f7421e;

    /* JADX INFO: renamed from: f */
    public cp9 f7422f;

    /* JADX INFO: renamed from: g */
    public int f7423g;

    public as2(String str) {
        byte[] bytes = str.getBytes(StandardCharsets.ISO_8859_1);
        StringBuilder sb = new StringBuilder(bytes.length);
        int length = bytes.length;
        for (int i = 0; i < length; i++) {
            char c = (char) (bytes[i] & 255);
            if (c == '?' && str.charAt(i) != '?') {
                C3386nv.m17626m("Message contains characters outside ISO-8859-1 encoding.");
                throw null;
            }
            sb.append(c);
        }
        this.f7417a = sb.toString();
        this.f7418b = SymbolShapeHint.FORCE_NONE;
        this.f7419c = new StringBuilder(str.length());
        this.f7421e = -1;
    }

    /* JADX INFO: renamed from: a */
    public final char m3016a() {
        return this.f7417a.charAt(this.f7420d);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m3017b() {
        return this.f7420d < this.f7417a.length() - this.f7423g;
    }

    /* JADX INFO: renamed from: c */
    public final void m3018c(int i) {
        cp9 cp9Var = this.f7422f;
        if (cp9Var == null || i > cp9Var.f34352b) {
            this.f7422f = cp9.m9835e(i, this.f7418b);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m3019d(char c) {
        this.f7419c.append(c);
    }
}
