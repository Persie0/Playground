package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class cha extends wo6 {

    /* JADX INFO: renamed from: c */
    public final Integer f10099c;

    /* JADX INFO: renamed from: d */
    public final Integer f10100d;

    /* JADX INFO: renamed from: e */
    public final vn7 f10101e;

    /* JADX INFO: renamed from: f */
    public final boolean f10102f;

    /* JADX WARN: Illegal instructions before constructor call */
    public cha(Integer num, Integer num2, vn7 vn7Var, String str, boolean z) {
        Integer num3 = num.equals(num2) ? num : null;
        super(num3, str);
        this.f10099c = num;
        this.f10100d = num2;
        this.f10101e = vn7Var;
        this.f10102f = z;
        if (num3 != null) {
            i84 i84Var = new i84(1, 9, 1);
            int iIntValue = num3.intValue();
            if (1 > iIntValue || iIntValue > i84Var.f40380b) {
                ij6.m13963u("Invalid length for field ", str, ": ", num3);
                throw null;
            }
        }
    }

    @Override // p000.wo6
    /* JADX INFO: renamed from: a */
    public final xo6 mo4664a(Object obj, CharSequence charSequence, int i, int i2) {
        Integer numValueOf;
        charSequence.getClass();
        Integer num = this.f10100d;
        if (num != null && i2 - i > num.intValue()) {
            return new cp3(num.intValue(), 4);
        }
        Integer num2 = this.f10099c;
        if (num2 != null && i2 - i < num2.intValue()) {
            return new cp3(num2.intValue(), 3);
        }
        int iCharAt = 0;
        while (true) {
            if (i >= i2) {
                numValueOf = Integer.valueOf(iCharAt);
                break;
            }
            iCharAt = (iCharAt * 10) + (charSequence.charAt(i) - '0');
            if (iCharAt < 0) {
                numValueOf = null;
                break;
            }
            i++;
        }
        if (numValueOf == null) {
            return n58.f52376d;
        }
        boolean z = this.f10102f;
        int iIntValue = numValueOf.intValue();
        if (z) {
            iIntValue = -iIntValue;
        }
        Object objM23438b = this.f10101e.m23438b(obj, Integer.valueOf(iIntValue));
        if (objM23438b == null) {
            return null;
        }
        return new hi8(objM23438b, 24);
    }
}
