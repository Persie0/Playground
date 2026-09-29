package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class s87 implements s47 {

    /* JADX INFO: renamed from: a */
    public final String f60513a;

    public s87(String str) {
        str.getClass();
        this.f60513a = str;
        if (str.length() <= 0) {
            C3386nv.m17626m("Empty string is not allowed");
            throw null;
        }
        if (ead.m11005b(str.charAt(0))) {
            C3386nv.m17624j(wq1.m24118n("String '", str, "' starts with a digit"));
            throw null;
        }
        if (ead.m11005b(str.charAt(str.length() - 1))) {
            C3386nv.m17624j(wq1.m24118n("String '", str, "' ends with a digit"));
            throw null;
        }
    }

    @Override // p000.s47
    /* JADX INFO: renamed from: a */
    public final Object mo10912a(nm1 nm1Var, CharSequence charSequence, int i) {
        charSequence.getClass();
        String str = this.f60513a;
        if (str.length() + i > charSequence.length()) {
            return new m47(i, new hz4(this, 12));
        }
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            if (charSequence.charAt(i + i2) != str.charAt(i2)) {
                return new m47(i, new iw3(this, charSequence, i, i2));
            }
        }
        return Integer.valueOf(str.length() + i);
    }

    public final String toString() {
        return ux5.m22992o(new StringBuilder("'"), this.f60513a, '\'');
    }
}
