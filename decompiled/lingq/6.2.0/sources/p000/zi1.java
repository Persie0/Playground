package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class zi1 extends wo6 {

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f71588c = 0;

    /* JADX INFO: renamed from: d */
    public final Object f71589d;

    public zi1(String str) {
        super(Integer.valueOf(str.length()), "the predefined string ".concat(str));
        this.f71589d = str;
    }

    @Override // p000.wo6
    /* JADX INFO: renamed from: a */
    public final xo6 mo4664a(Object obj, CharSequence charSequence, int i, int i2) {
        int i3 = this.f71588c;
        Object obj2 = this.f71589d;
        charSequence.getClass();
        switch (i3) {
            case 0:
                String str = (String) obj2;
                if (fa4.m11650l(charSequence.subSequence(i, i2).toString(), str)) {
                    return null;
                }
                return new C3366nb(str);
            default:
                int i4 = i2 - i;
                if (i4 < 1) {
                    return new cp3(1, 3);
                }
                if (i4 > 9) {
                    return new cp3(9, 4);
                }
                vn7 vn7Var = (vn7) obj2;
                int iCharAt = 0;
                while (i < i2) {
                    iCharAt = (iCharAt * 10) + (charSequence.charAt(i) - '0');
                    i++;
                }
                Object objM23438b = vn7Var.m23438b(obj, new g32(iCharAt, i4));
                if (objM23438b == null) {
                    return null;
                }
                return new hi8(objM23438b, 24);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zi1(vn7 vn7Var, String str) {
        super(null, str);
        vn7Var.getClass();
        str.getClass();
        this.f71589d = vn7Var;
    }
}
