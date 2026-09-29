package p352r1;

import p003a2.C0009a;

/* JADX INFO: renamed from: r1.h */
/* JADX INFO: loaded from: classes.dex */
public final class C8707h {

    /* JADX INFO: renamed from: f */
    public static final C8707h f46293f = new C8707h();

    /* JADX INFO: renamed from: a */
    public final boolean f46294a = false;

    /* JADX INFO: renamed from: b */
    public final int f46295b = 0;

    /* JADX INFO: renamed from: c */
    public final boolean f46296c = true;

    /* JADX INFO: renamed from: d */
    public final int f46297d = 1;

    /* JADX INFO: renamed from: e */
    public final int f46298e = 1;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8707h)) {
            return false;
        }
        C8707h c8707h = (C8707h) obj;
        if (this.f46294a != c8707h.f46294a) {
            return false;
        }
        if (!(this.f46295b == c8707h.f46295b) || this.f46296c != c8707h.f46296c) {
            return false;
        }
        if (this.f46297d == c8707h.f46297d) {
            return this.f46298e == c8707h.f46298e;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f46298e) + C0009a.m16d(this.f46297d, (Boolean.hashCode(this.f46296c) + C0009a.m16d(this.f46295b, Boolean.hashCode(this.f46294a) * 31, 31)) * 31, 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("ImeOptions(singleLine=");
        sb2.append(this.f46294a);
        sb2.append(", capitalization=");
        boolean z10 = true;
        int i10 = this.f46295b;
        String str2 = "Invalid";
        if (i10 == 0) {
            str = "None";
        } else {
            if (i10 == 1) {
                str = "Characters";
            } else {
                if (i10 == 2) {
                    str = "Words";
                } else {
                    str = i10 == 3 ? "Sentences" : "Invalid";
                }
            }
        }
        sb2.append((Object) str);
        sb2.append(", autoCorrect=");
        sb2.append(this.f46296c);
        sb2.append(", keyboardType=");
        int i11 = this.f46297d;
        if (i11 == 1) {
            str2 = "Text";
        } else {
            if (i11 == 2) {
                str2 = "Ascii";
            } else {
                if (i11 == 3) {
                    str2 = "Number";
                } else {
                    if (i11 == 4) {
                        str2 = "Phone";
                    } else {
                        if (i11 == 5) {
                            str2 = "Uri";
                        } else {
                            if (i11 == 6) {
                                str2 = "Email";
                            } else {
                                if (i11 == 7) {
                                    str2 = "Password";
                                } else {
                                    if (i11 == 8) {
                                        str2 = "NumberPassword";
                                    } else {
                                        if (i11 != 9) {
                                            z10 = false;
                                        }
                                        if (z10) {
                                            str2 = "Decimal";
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        sb2.append((Object) str2);
        sb2.append(", imeAction=");
        sb2.append((Object) C8706g.m16950a(this.f46298e));
        sb2.append(')');
        return sb2.toString();
    }
}
