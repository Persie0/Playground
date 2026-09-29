package p426v2;

import android.text.SpannableStringBuilder;

/* JADX INFO: renamed from: v2.a */
/* JADX INFO: loaded from: classes.dex */
public final class C9627a {

    /* JADX INFO: renamed from: d */
    public static final String f49305d;

    /* JADX INFO: renamed from: e */
    public static final String f49306e;

    /* JADX INFO: renamed from: f */
    public static final C9627a f49307f;

    /* JADX INFO: renamed from: g */
    public static final C9627a f49308g;

    /* JADX INFO: renamed from: a */
    public final boolean f49309a;

    /* JADX INFO: renamed from: b */
    public final int f49310b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC9631e f49311c;

    /* JADX INFO: renamed from: v2.a$a */
    public static class a {

        /* JADX INFO: renamed from: e */
        public static final byte[] f49312e = new byte[1792];

        /* JADX INFO: renamed from: a */
        public final CharSequence f49313a;

        /* JADX INFO: renamed from: b */
        public final int f49314b;

        /* JADX INFO: renamed from: c */
        public int f49315c;

        /* JADX INFO: renamed from: d */
        public char f49316d;

        static {
            for (int i10 = 0; i10 < 1792; i10++) {
                f49312e[i10] = Character.getDirectionality(i10);
            }
        }

        public a(CharSequence charSequence) {
            this.f49313a = charSequence;
            this.f49314b = charSequence.length();
        }

        /* JADX INFO: renamed from: a */
        public final byte m18098a() {
            int i10 = this.f49315c - 1;
            CharSequence charSequence = this.f49313a;
            char cCharAt = charSequence.charAt(i10);
            this.f49316d = cCharAt;
            if (Character.isLowSurrogate(cCharAt)) {
                int iCodePointBefore = Character.codePointBefore(charSequence, this.f49315c);
                this.f49315c -= Character.charCount(iCodePointBefore);
                return Character.getDirectionality(iCodePointBefore);
            }
            this.f49315c--;
            char c10 = this.f49316d;
            return c10 < 1792 ? f49312e[c10] : Character.getDirectionality(c10);
        }
    }

    static {
        C9632f.d dVar = C9632f.f49323c;
        f49305d = Character.toString((char) 8206);
        f49306e = Character.toString((char) 8207);
        f49307f = new C9627a(false, 2, dVar);
        f49308g = new C9627a(true, 2, dVar);
    }

    public C9627a(boolean z10, int i10, C9632f.d dVar) {
        this.f49309a = z10;
        this.f49310b = i10;
        this.f49311c = dVar;
    }

    /* JADX INFO: renamed from: a */
    public static int m18095a(CharSequence charSequence) {
        byte directionality;
        a aVar = new a(charSequence);
        aVar.f49315c = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int i13 = aVar.f49315c;
            if (i13 < aVar.f49314b && i10 == 0) {
                CharSequence charSequence2 = aVar.f49313a;
                char cCharAt = charSequence2.charAt(i13);
                aVar.f49316d = cCharAt;
                if (Character.isHighSurrogate(cCharAt)) {
                    int iCodePointAt = Character.codePointAt(charSequence2, aVar.f49315c);
                    aVar.f49315c = Character.charCount(iCodePointAt) + aVar.f49315c;
                    directionality = Character.getDirectionality(iCodePointAt);
                } else {
                    aVar.f49315c++;
                    char c10 = aVar.f49316d;
                    directionality = c10 < 1792 ? a.f49312e[c10] : Character.getDirectionality(c10);
                }
                if (directionality != 0) {
                    if (directionality == 1 || directionality == 2) {
                        if (i12 == 0) {
                            return 1;
                        }
                    } else if (directionality != 9) {
                        switch (directionality) {
                            case 14:
                            case 15:
                                i12++;
                                i11 = -1;
                                continue;
                            case 16:
                            case 17:
                                i12++;
                                i11 = 1;
                                continue;
                            case 18:
                                i12--;
                                i11 = 0;
                                continue;
                        }
                    }
                } else if (i12 == 0) {
                    return -1;
                }
                i10 = i12;
            }
        }
        if (i10 == 0) {
            return 0;
        }
        if (i11 != 0) {
            return i11;
        }
        while (aVar.f49315c > 0) {
            switch (aVar.m18098a()) {
                case 14:
                case 15:
                    if (i10 == i12) {
                        return -1;
                    }
                    i12--;
                    break;
                case 16:
                case 17:
                    if (i10 == i12) {
                        return 1;
                    }
                    i12--;
                    break;
                case 18:
                    i12++;
                    break;
                default:
                    break;
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: b */
    public static int m18096b(CharSequence charSequence) {
        a aVar = new a(charSequence);
        aVar.f49315c = aVar.f49314b;
        int i10 = 0;
        while (true) {
            int i11 = i10;
            while (true) {
                while (aVar.f49315c > 0) {
                    byte bM18098a = aVar.m18098a();
                    if (bM18098a == 0) {
                        if (i11 == 0) {
                            return -1;
                        }
                        if (i10 == 0) {
                            break;
                        }
                    } else if (bM18098a == 1 || bM18098a == 2) {
                        if (i11 == 0) {
                            return 1;
                        }
                        if (i10 == 0) {
                            break;
                        }
                    } else if (bM18098a != 9) {
                        switch (bM18098a) {
                            case 14:
                            case 15:
                                if (i10 == i11) {
                                    return -1;
                                }
                                i11--;
                                break;
                            case 16:
                            case 17:
                                if (i10 == i11) {
                                    return 1;
                                }
                                i11--;
                                break;
                            case 18:
                                i11++;
                                break;
                            default:
                                if (i10 != 0) {
                                }
                                break;
                        }
                    } else {
                        continue;
                    }
                }
                return 0;
            }
            i10 = i11;
        }
    }

    /* JADX INFO: renamed from: c */
    public final SpannableStringBuilder m18097c(CharSequence charSequence, InterfaceC9631e interfaceC9631e) {
        String str;
        if (charSequence == null) {
            return null;
        }
        boolean zM18108b = ((C9632f.c) interfaceC9631e).m18108b(charSequence, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        boolean z10 = (this.f49310b & 2) != 0;
        String str2 = f49306e;
        String str3 = f49305d;
        boolean z11 = this.f49309a;
        if (z10) {
            boolean zM18108b2 = (zM18108b ? C9632f.f49322b : C9632f.f49321a).m18108b(charSequence, charSequence.length());
            if (z11 || !(zM18108b2 || m18095a(charSequence) == 1)) {
                str = (!z11 || (zM18108b2 && m18095a(charSequence) != -1)) ? "" : str2;
            } else {
                str = str3;
            }
            spannableStringBuilder.append((CharSequence) str);
        }
        if (zM18108b != z11) {
            spannableStringBuilder.append(zM18108b ? (char) 8235 : (char) 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        boolean zM18108b3 = (zM18108b ? C9632f.f49322b : C9632f.f49321a).m18108b(charSequence, charSequence.length());
        if (!z11 && (zM18108b3 || m18096b(charSequence) == 1)) {
            str2 = str3;
        } else if (!z11 || (zM18108b3 && m18096b(charSequence) != -1)) {
            str2 = "";
        }
        spannableStringBuilder.append((CharSequence) str2);
        return spannableStringBuilder;
    }
}
