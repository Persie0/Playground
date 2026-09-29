package com.airbnb.lottie.parser.moshi;

import java.io.Closeable;
import java.util.Arrays;
import p000.p33;
import p000.ux5;

/* JADX INFO: renamed from: com.airbnb.lottie.parser.moshi.a */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0875a implements Closeable {

    /* JADX INFO: renamed from: e */
    public static final String[] f10735e = new String[128];

    /* JADX INFO: renamed from: a */
    public int f10736a;

    /* JADX INFO: renamed from: b */
    public int[] f10737b;

    /* JADX INFO: renamed from: c */
    public String[] f10738c;

    /* JADX INFO: renamed from: d */
    public int[] f10739d;

    static {
        for (int i = 0; i <= 31; i++) {
            f10735e[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = f10735e;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    /* JADX INFO: renamed from: A */
    public final void m5032A(int i) {
        int i2 = this.f10736a;
        int[] iArr = this.f10737b;
        if (i2 == iArr.length) {
            if (i2 == 256) {
                throw new JsonDataException("Nesting too deep at ".concat(m5041n()));
            }
            this.f10737b = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f10738c;
            this.f10738c = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
            int[] iArr2 = this.f10739d;
            this.f10739d = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f10737b;
        int i3 = this.f10736a;
        this.f10736a = i3 + 1;
        iArr3[i3] = i;
    }

    /* JADX INFO: renamed from: J */
    public abstract int mo5033J(p33 p33Var);

    /* JADX INFO: renamed from: N */
    public abstract void mo5034N();

    /* JADX INFO: renamed from: R */
    public abstract void mo5035R();

    /* JADX INFO: renamed from: T */
    public final void m5036T(String str) throws JsonEncodingException {
        StringBuilder sbM22999v = ux5.m22999v(str, " at path ");
        sbM22999v.append(m5041n());
        throw new JsonEncodingException(sbM22999v.toString());
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo5037a();

    /* JADX INFO: renamed from: b */
    public abstract void mo5038b();

    /* JADX INFO: renamed from: c */
    public abstract void mo5039c();

    /* JADX INFO: renamed from: e */
    public abstract void mo5040e();

    /* JADX INFO: renamed from: n */
    public final String m5041n() {
        int i = this.f10736a;
        int[] iArr = this.f10737b;
        String[] strArr = this.f10738c;
        int[] iArr2 = this.f10739d;
        StringBuilder sb = new StringBuilder("$");
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = iArr[i2];
            if (i3 == 1 || i3 == 2) {
                sb.append('[');
                sb.append(iArr2[i2]);
                sb.append(']');
            } else if (i3 == 3 || i3 == 4 || i3 == 5) {
                sb.append('.');
                String str = strArr[i2];
                if (str != null) {
                    sb.append(str);
                }
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: p */
    public abstract boolean mo5042p();

    /* JADX INFO: renamed from: q */
    public abstract boolean mo5043q();

    /* JADX INFO: renamed from: r */
    public abstract double mo5044r();

    /* JADX INFO: renamed from: u */
    public abstract int mo5045u();

    /* JADX INFO: renamed from: x */
    public abstract String mo5046x();

    /* JADX INFO: renamed from: z */
    public abstract JsonReader$Token mo5047z();
}
