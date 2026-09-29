package org.joda.time.format;

import java.io.IOException;

/* JADX INFO: renamed from: org.joda.time.format.f */
/* JADX INFO: loaded from: classes2.dex */
public final class C8144f {

    /* JADX INFO: renamed from: a */
    public static final double f44182a = Math.log(10.0d);

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int f44183b = 0;

    /* JADX INFO: renamed from: a */
    public static void m16127a(Appendable appendable, int i10, int i11) throws IOException {
        int iLog;
        if (i10 < 0) {
            appendable.append('-');
            if (i10 == Integer.MIN_VALUE) {
                while (i11 > 10) {
                    appendable.append('0');
                    i11--;
                }
                appendable.append("2147483648");
                return;
            }
            i10 = -i10;
        }
        if (i10 < 10) {
            while (i11 > 1) {
                appendable.append('0');
                i11--;
            }
            appendable.append((char) (i10 + 48));
            return;
        }
        if (i10 < 100) {
            while (i11 > 2) {
                appendable.append('0');
                i11--;
            }
            int i12 = ((i10 + 1) * 13421772) >> 27;
            appendable.append((char) (i12 + 48));
            appendable.append((char) (((i10 - (i12 << 3)) - (i12 << 1)) + 48));
            return;
        }
        if (i10 < 1000) {
            iLog = 3;
        } else {
            iLog = i10 < 10000 ? 4 : ((int) (Math.log(i10) / f44182a)) + 1;
        }
        while (i11 > iLog) {
            appendable.append('0');
            i11--;
        }
        appendable.append(Integer.toString(i10));
    }

    /* JADX INFO: renamed from: b */
    public static int m16128b(int i10, CharSequence charSequence) {
        int iCharAt = charSequence.charAt(i10) - '0';
        return (charSequence.charAt(i10 + 1) + ((iCharAt << 3) + (iCharAt << 1))) - 48;
    }
}
