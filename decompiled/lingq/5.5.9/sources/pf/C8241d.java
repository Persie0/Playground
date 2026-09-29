package pf;

import com.google.zxing.datamatrix.encoder.SymbolShapeHint;
import java.nio.charset.StandardCharsets;
import p242lf.C7356a;

/* JADX INFO: renamed from: pf.d */
/* JADX INFO: loaded from: classes.dex */
public final class C8241d {

    /* JADX INFO: renamed from: a */
    public final String f44510a;

    /* JADX INFO: renamed from: b */
    public SymbolShapeHint f44511b;

    /* JADX INFO: renamed from: c */
    public C7356a f44512c;

    /* JADX INFO: renamed from: d */
    public C7356a f44513d;

    /* JADX INFO: renamed from: e */
    public final StringBuilder f44514e;

    /* JADX INFO: renamed from: f */
    public int f44515f;

    /* JADX INFO: renamed from: g */
    public int f44516g;

    /* JADX INFO: renamed from: h */
    public C8243f f44517h;

    /* JADX INFO: renamed from: i */
    public int f44518i;

    public C8241d(String str) {
        byte[] bytes = str.getBytes(StandardCharsets.ISO_8859_1);
        StringBuilder sb2 = new StringBuilder(bytes.length);
        int length = bytes.length;
        for (int i10 = 0; i10 < length; i10++) {
            char c10 = (char) (bytes[i10] & 255);
            if (c10 == '?' && str.charAt(i10) != '?') {
                throw new IllegalArgumentException("Message contains characters outside ISO-8859-1 encoding.");
            }
            sb2.append(c10);
        }
        this.f44510a = sb2.toString();
        this.f44511b = SymbolShapeHint.FORCE_NONE;
        this.f44514e = new StringBuilder(str.length());
        this.f44516g = -1;
    }

    /* JADX INFO: renamed from: a */
    public final int m16384a() {
        return this.f44514e.length();
    }

    /* JADX INFO: renamed from: b */
    public final char m16385b() {
        return this.f44510a.charAt(this.f44515f);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m16386c() {
        return this.f44515f < this.f44510a.length() - this.f44518i;
    }

    /* JADX INFO: renamed from: d */
    public final void m16387d(int i10) {
        C8243f c8243f = this.f44517h;
        if (c8243f == null || i10 > c8243f.f44525b) {
            this.f44517h = C8243f.m16390f(i10, this.f44511b, this.f44512c, this.f44513d);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m16388e(char c10) {
        this.f44514e.append(c10);
    }
}
