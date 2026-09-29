package p000;

import android.text.SpannableStringBuilder;

/* JADX INFO: loaded from: classes2.dex */
public final class ic0 {

    /* JADX INFO: renamed from: b */
    public static final String f43912b;

    /* JADX INFO: renamed from: c */
    public static final String f43913c;

    /* JADX INFO: renamed from: d */
    public static final ic0 f43914d;

    /* JADX INFO: renamed from: e */
    public static final ic0 f43915e;

    /* JADX INFO: renamed from: a */
    public final boolean f43916a;

    static {
        hg0 hg0Var = wt9.f67285c;
        f43912b = Character.toString((char) 8206);
        f43913c = Character.toString((char) 8207);
        f43914d = new ic0(false);
        f43915e = new ic0(true);
    }

    public ic0(boolean z) {
        hg0 hg0Var = wt9.f67283a;
        this.f43916a = z;
    }

    /* JADX INFO: renamed from: a */
    public static int m13759a(CharSequence charSequence) {
        byte directionality;
        hc0 hc0Var = new hc0(charSequence);
        hc0Var.f42151c = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int i4 = hc0Var.f42151c;
            if (i4 < hc0Var.f42150b && i == 0) {
                CharSequence charSequence2 = hc0Var.f42149a;
                char cCharAt = charSequence2.charAt(i4);
                hc0Var.f42152d = cCharAt;
                boolean zIsHighSurrogate = Character.isHighSurrogate(cCharAt);
                int i5 = hc0Var.f42151c;
                if (zIsHighSurrogate) {
                    int iCodePointAt = Character.codePointAt(charSequence2, i5);
                    hc0Var.f42151c = Character.charCount(iCodePointAt) + hc0Var.f42151c;
                    directionality = Character.getDirectionality(iCodePointAt);
                } else {
                    hc0Var.f42151c = i5 + 1;
                    char c = hc0Var.f42152d;
                    directionality = c < 1792 ? hc0.f42148e[c] : Character.getDirectionality(c);
                }
                if (directionality != 0) {
                    if (directionality == 1 || directionality == 2) {
                        if (i3 == 0) {
                            return 1;
                        }
                    } else if (directionality != 9) {
                        switch (directionality) {
                            case 14:
                            case 15:
                                i3++;
                                i2 = -1;
                                continue;
                            case 16:
                            case 17:
                                i3++;
                                i2 = 1;
                                continue;
                            case 18:
                                i3--;
                                i2 = 0;
                                continue;
                        }
                    }
                } else if (i3 == 0) {
                    return -1;
                }
                i = i3;
            }
        }
        if (i != 0) {
            if (i2 == 0) {
                while (hc0Var.f42151c > 0) {
                    switch (hc0Var.m13187a()) {
                        case 14:
                        case 15:
                            if (i == i3) {
                                return -1;
                            }
                            i3--;
                            break;
                        case 16:
                        case 17:
                            if (i == i3) {
                                return 1;
                            }
                            i3--;
                            break;
                        case 18:
                            i3++;
                            break;
                        default:
                            break;
                    }
                }
            } else {
                return i2;
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: b */
    public static int m13760b(CharSequence charSequence) {
        hc0 hc0Var = new hc0(charSequence);
        hc0Var.f42151c = hc0Var.f42150b;
        int i = 0;
        while (true) {
            int i2 = i;
            while (hc0Var.f42151c > 0) {
                byte bM13187a = hc0Var.m13187a();
                if (bM13187a == 0) {
                    if (i == 0) {
                        return -1;
                    }
                    if (i2 == 0) {
                    }
                } else if (bM13187a == 1 || bM13187a == 2) {
                    if (i == 0) {
                        return 1;
                    }
                    if (i2 == 0) {
                    }
                } else if (bM13187a != 9) {
                    switch (bM13187a) {
                        case 14:
                        case 15:
                            if (i2 == i) {
                                return -1;
                            }
                            i--;
                            break;
                        case 16:
                        case 17:
                            if (i2 == i) {
                                return 1;
                            }
                            i--;
                            break;
                        case 18:
                            i++;
                            break;
                        default:
                            if (i2 != 0) {
                            }
                            break;
                    }
                } else {
                    continue;
                }
            }
            return 0;
        }
    }

    /* JADX INFO: renamed from: c */
    public final SpannableStringBuilder m13761c(CharSequence charSequence) {
        String str;
        hg0 hg0Var = wt9.f67285c;
        if (charSequence == null) {
            return null;
        }
        boolean zM13222c = hg0Var.m13222c(charSequence, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        boolean zM13222c2 = (zM13222c ? wt9.f67284b : wt9.f67283a).m13222c(charSequence, charSequence.length());
        String str2 = "";
        String str3 = f43913c;
        String str4 = f43912b;
        boolean z = this.f43916a;
        if (z || !(zM13222c2 || m13759a(charSequence) == 1)) {
            str = (!z || (zM13222c2 && m13759a(charSequence) != -1)) ? "" : str3;
        } else {
            str = str4;
        }
        spannableStringBuilder.append((CharSequence) str);
        if (zM13222c != z) {
            spannableStringBuilder.append(zM13222c ? (char) 8235 : (char) 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        boolean zM13222c3 = (zM13222c ? wt9.f67284b : wt9.f67283a).m13222c(charSequence, charSequence.length());
        if (!z && (zM13222c3 || m13760b(charSequence) == 1)) {
            str2 = str4;
        } else if (z && (!zM13222c3 || m13760b(charSequence) == -1)) {
            str2 = str3;
        }
        spannableStringBuilder.append((CharSequence) str2);
        return spannableStringBuilder;
    }
}
