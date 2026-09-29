package p000;

/* JADX INFO: loaded from: classes.dex */
public final class p12 implements s94 {

    /* JADX INFO: renamed from: a */
    public final s94[] f55424a;

    /* JADX INFO: renamed from: b */
    public final int f55425b;

    public p12(s94[] s94VarArr) {
        int iEstimateParsedLength;
        this.f55424a = s94VarArr;
        int length = s94VarArr.length;
        int i = 0;
        while (true) {
            length--;
            if (length < 0) {
                this.f55425b = i;
                return;
            }
            s94 s94Var = s94VarArr[length];
            if (s94Var != null && (iEstimateParsedLength = s94Var.estimateParsedLength()) > i) {
                i = iEstimateParsedLength;
            }
        }
    }

    @Override // p000.s94
    public final int estimateParsedLength() {
        return this.f55425b;
    }

    @Override // p000.s94
    public final int parseInto(b22 b22Var, CharSequence charSequence, int i) {
        int i2;
        int i3;
        s94[] s94VarArr = this.f55424a;
        int length = s94VarArr.length;
        Object objM3191l = b22Var.m3191l();
        boolean z = false;
        Object objM3191l2 = null;
        int i4 = i;
        int i5 = i4;
        for (int i6 = 0; i6 < length; i6++) {
            s94 s94Var = s94VarArr[i6];
            if (s94Var == null) {
                if (i4 > i) {
                    z = true;
                    break;
                }
                return i;
            }
            int into = s94Var.parseInto(b22Var, charSequence, i);
            if (into >= i) {
                if (into <= i4) {
                    continue;
                } else {
                    if (into >= charSequence.length() || (i3 = i6 + 1) >= length || s94VarArr[i3] == null) {
                        return into;
                    }
                    objM3191l2 = b22Var.m3191l();
                    i4 = into;
                }
            } else if (into < 0 && (i2 = ~into) > i5) {
                i5 = i2;
            }
            b22Var.m3188i(objM3191l);
        }
        if (i4 <= i && (i4 != i || !z)) {
            return ~i5;
        }
        if (objM3191l2 != null) {
            b22Var.m3188i(objM3191l2);
        }
        return i4;
    }
}
