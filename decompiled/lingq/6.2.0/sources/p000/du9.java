package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class du9 extends gna {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f36250e;

    public /* synthetic */ du9(int i) {
        this.f36250e = i;
    }

    @Override // p000.gna
    /* JADX INFO: renamed from: b */
    public final int mo10678b(char c, StringBuilder sb) {
        switch (this.f36250e) {
            case 0:
                if (c == ' ') {
                    sb.append((char) 3);
                } else if (c >= '0' && c <= '9') {
                    sb.append((char) (c - ','));
                } else {
                    if (c < 'a' || c > 'z') {
                        if (c < ' ') {
                            sb.append((char) 0);
                            sb.append(c);
                            return 2;
                        }
                        if (c >= '!' && c <= '/') {
                            sb.append((char) 1);
                            sb.append((char) (c - '!'));
                            return 2;
                        }
                        if (c >= ':' && c <= '@') {
                            sb.append((char) 1);
                            sb.append((char) (c - '+'));
                            return 2;
                        }
                        if (c >= '[' && c <= '_') {
                            sb.append((char) 1);
                            sb.append((char) (c - 'E'));
                            return 2;
                        }
                        if (c == '`') {
                            sb.append((char) 2);
                            sb.append((char) (c - '`'));
                            return 2;
                        }
                        if (c >= 'A' && c <= 'Z') {
                            sb.append((char) 2);
                            sb.append((char) (c - '@'));
                            return 2;
                        }
                        if (c < '{' || c > 127) {
                            sb.append("\u0001\u001e");
                            return 2 + mo10678b((char) (c - 128), sb);
                        }
                        sb.append((char) 2);
                        sb.append((char) (c - '`'));
                        return 2;
                    }
                    sb.append((char) (c - 'S'));
                }
                return 1;
            default:
                if (c == '\r') {
                    sb.append((char) 0);
                } else if (c == ' ') {
                    sb.append((char) 3);
                } else if (c == '*') {
                    sb.append((char) 1);
                } else if (c == '>') {
                    sb.append((char) 2);
                } else if (c >= '0' && c <= '9') {
                    sb.append((char) (c - ','));
                } else {
                    if (c < 'A' || c > 'Z') {
                        zed.m25583b(c);
                        throw null;
                    }
                    sb.append((char) (c - '3'));
                }
                return 1;
        }
    }

    @Override // p000.gna, p000.xr2
    /* JADX INFO: renamed from: d */
    public void mo10679d(as2 as2Var) {
        switch (this.f36250e) {
            case 1:
                StringBuilder sb = new StringBuilder();
                while (as2Var.m3017b()) {
                    char cM3016a = as2Var.m3016a();
                    as2Var.f7420d++;
                    mo10678b(cM3016a, sb);
                    if (sb.length() % 3 == 0) {
                        gna.m12766o(as2Var, sb);
                        if (zed.m25587f(as2Var.f7417a, as2Var.f7420d, 3) != 3) {
                            as2Var.f7421e = 0;
                            mo10681l(as2Var, sb);
                            break;
                        }
                    }
                }
                mo10681l(as2Var, sb);
                break;
            default:
                super.mo10679d(as2Var);
                break;
        }
    }

    @Override // p000.gna
    /* JADX INFO: renamed from: h */
    public final int mo10680h() {
        switch (this.f36250e) {
            case 0:
                return 2;
            default:
                return 3;
        }
    }

    @Override // p000.gna
    /* JADX INFO: renamed from: l */
    public void mo10681l(as2 as2Var, StringBuilder sb) {
        switch (this.f36250e) {
            case 1:
                StringBuilder sb2 = as2Var.f7419c;
                as2Var.m3018c(sb2.length());
                int length = as2Var.f7422f.f34352b - sb2.length();
                as2Var.f7420d -= sb.length();
                String str = as2Var.f7417a;
                if ((str.length() - as2Var.f7423g) - as2Var.f7420d > 1 || length > 1 || (str.length() - as2Var.f7423g) - as2Var.f7420d != length) {
                    as2Var.m3019d((char) 254);
                }
                if (as2Var.f7421e < 0) {
                    as2Var.f7421e = 0;
                }
                break;
            default:
                super.mo10681l(as2Var, sb);
                break;
        }
    }
}
