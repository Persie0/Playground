package p000;

import java.io.EOFException;
import java.lang.reflect.Method;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class u37 extends AbstractC3695vr {

    /* JADX INFO: renamed from: p */
    public final Method f63354p;

    /* JADX INFO: renamed from: q */
    public final int f63355q;

    /* JADX INFO: renamed from: r */
    public final String f63356r;

    /* JADX INFO: renamed from: s */
    public final nj0 f63357s;

    /* JADX INFO: renamed from: t */
    public final boolean f63358t;

    public u37(Method method, int i, String str, boolean z) {
        nj0 nj0Var = nj0.f52807b;
        this.f63354p = method;
        this.f63355q = i;
        Objects.requireNonNull(str, "name == null");
        this.f63356r = str;
        this.f63357s = nj0Var;
        this.f63358t = z;
    }

    @Override // p000.AbstractC3695vr
    /* JADX INFO: renamed from: f */
    public final void mo16613f(b78 b78Var, Object obj) throws EOFException {
        String strM472Y;
        String str = this.f63356r;
        if (obj == null) {
            throw ci8.m4699L(this.f63354p, this.f63355q, wq1.m24118n("Path parameter \"", str, "\" value must not be null."), new Object[0]);
        }
        this.f63357s.getClass();
        String string = obj.toString();
        if (b78Var.f8052c == null) {
            uk9.m22780o();
            return;
        }
        int length = string.length();
        int iCharCount = 0;
        while (true) {
            if (iCharCount >= length) {
                strM472Y = string;
                break;
            }
            int iCodePointAt = string.codePointAt(iCharCount);
            boolean z = this.f63358t;
            int i = 47;
            int i2 = -1;
            int i3 = 127;
            int i4 = 32;
            if (iCodePointAt < 32 || iCodePointAt >= 127 || " \"<>^`{}|\\?#".indexOf(iCodePointAt) != -1 || (!z && (iCodePointAt == 47 || iCodePointAt == 37))) {
                aj0 aj0Var = new aj0();
                aj0Var.m493p0(0, string, iCharCount);
                aj0 aj0Var2 = null;
                while (iCharCount < length) {
                    int iCodePointAt2 = string.codePointAt(iCharCount);
                    if (!z || (iCodePointAt2 != 9 && iCodePointAt2 != 10 && iCodePointAt2 != 12 && iCodePointAt2 != 13)) {
                        if (iCodePointAt2 < i4 || iCodePointAt2 >= i3 || " \"<>^`{}|\\?#".indexOf(iCodePointAt2) != i2 || (!z && (iCodePointAt2 == i || iCodePointAt2 == 37))) {
                            if (aj0Var2 == null) {
                                aj0Var2 = new aj0();
                            }
                            aj0Var2.m496r0(iCodePointAt2);
                            long j = aj0Var2.f723b;
                            long j2 = 0;
                            while (j2 < j) {
                                byte bM494q = aj0Var2.m494q(j2);
                                aj0Var.m487k0(37);
                                char[] cArr = b78.f8048l;
                                aj0Var.m487k0(cArr[((bM494q & 255) >> 4) & 15]);
                                aj0Var.m487k0(cArr[bM494q & 15]);
                                j2++;
                                aj0Var2 = aj0Var2;
                            }
                            aj0Var2.m473a();
                        } else {
                            aj0Var.m496r0(iCodePointAt2);
                        }
                    }
                    iCharCount += Character.charCount(iCodePointAt2);
                    i = 47;
                    i2 = -1;
                    i3 = 127;
                    i4 = 32;
                }
                strM472Y = aj0Var.m472Y();
                break;
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
        String strReplace = b78Var.f8052c.replace("{" + str + "}", strM472Y);
        if (b78.f8049m.matcher(strReplace).matches()) {
            C3386nv.m17626m("@Path parameters shouldn't perform path traversal ('.' or '..'): ".concat(string));
        } else {
            b78Var.f8052c = strReplace;
        }
    }
}
