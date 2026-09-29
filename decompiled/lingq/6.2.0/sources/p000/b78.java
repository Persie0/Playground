package p000;

import java.util.ArrayList;
import java.util.regex.Pattern;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes.dex */
public final class b78 {

    /* JADX INFO: renamed from: l */
    public static final char[] f8048l = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: m */
    public static final Pattern f8049m = Pattern.compile("(.*/)?(\\.|%2e|%2E){1,2}(/.*)?");

    /* JADX INFO: renamed from: a */
    public final String f8050a;

    /* JADX INFO: renamed from: b */
    public final ex3 f8051b;

    /* JADX INFO: renamed from: c */
    public String f8052c;

    /* JADX INFO: renamed from: d */
    public dx3 f8053d;

    /* JADX INFO: renamed from: e */
    public final w41 f8054e = new w41(13);

    /* JADX INFO: renamed from: f */
    public final or3 f8055f;

    /* JADX INFO: renamed from: g */
    public xv5 f8056g;

    /* JADX INFO: renamed from: h */
    public final boolean f8057h;

    /* JADX INFO: renamed from: i */
    public final gv5 f8058i;

    /* JADX INFO: renamed from: j */
    public final bl2 f8059j;

    /* JADX INFO: renamed from: k */
    public z68 f8060k;

    public b78(String str, ex3 ex3Var, String str2, qr3 qr3Var, xv5 xv5Var, boolean z, boolean z2, boolean z3) {
        this.f8050a = str;
        this.f8051b = ex3Var;
        this.f8052c = str2;
        this.f8056g = xv5Var;
        this.f8057h = z;
        if (qr3Var != null) {
            this.f8055f = qr3Var.m20123g();
        } else {
            this.f8055f = new or3(0);
        }
        if (z2) {
            this.f8059j = new bl2(9);
        } else if (z3) {
            gv5 gv5Var = new gv5(26);
            this.f8058i = gv5Var;
            gv5Var.m12898a0(m56.f50605g);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m3399a(String str, String str2, boolean z) {
        bl2 bl2Var = this.f8059j;
        if (z) {
            bl2Var.getClass();
            str.getClass();
            ((ArrayList) bl2Var.f8655a).add(xwc.m24772j(str, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", true, false, true, false, 83));
            ((ArrayList) bl2Var.f8656b).add(xwc.m24772j(str2, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", true, false, true, false, 83));
            return;
        }
        bl2Var.getClass();
        str.getClass();
        ((ArrayList) bl2Var.f8655a).add(xwc.m24772j(str, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", false, false, false, false, 91));
        ((ArrayList) bl2Var.f8656b).add(xwc.m24772j(str2, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", false, false, false, false, 91));
    }

    /* JADX INFO: renamed from: b */
    public final void m3400b(String str, String str2, boolean z) {
        if ("Content-Type".equalsIgnoreCase(str)) {
            try {
                Regex regex = xv5.f68845e;
                this.f8056g = AbstractC3122is.m14103q(str2);
                return;
            } catch (IllegalArgumentException e) {
                throw new IllegalArgumentException(AbstractC3393o1.m17734i("Malformed content type: ", str2), e);
            }
        }
        or3 or3Var = this.f8055f;
        if (z) {
            or3Var.m18308v(str, str2);
        } else {
            or3Var.m18305j(str, str2);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m3401c(String str, String str2, boolean z) {
        dx3 dx3Var;
        String str3 = this.f8052c;
        if (str3 != null) {
            ex3 ex3Var = this.f8051b;
            ex3Var.getClass();
            try {
                dx3Var = new dx3();
                dx3Var.m10737d(ex3Var, str3);
            } catch (IllegalArgumentException unused) {
                dx3Var = null;
            }
            this.f8053d = dx3Var;
            if (dx3Var == null) {
                StringBuilder sb = new StringBuilder("Malformed URL. Base: ");
                sb.append(ex3Var);
                uk9.m22778m(sb, ", Relative: ", this.f8052c);
                return;
            }
            this.f8052c = null;
        }
        dx3 dx3Var2 = this.f8053d;
        if (z) {
            dx3Var2.getClass();
            str.getClass();
            if (dx3Var2.f36365g == null) {
                dx3Var2.f36365g = new ArrayList();
            }
            ArrayList arrayList = dx3Var2.f36365g;
            arrayList.getClass();
            arrayList.add(xwc.m24770i(str, 0, " \"'<>#&=", 0, 83));
            ArrayList arrayList2 = dx3Var2.f36365g;
            arrayList2.getClass();
            arrayList2.add(str2 != null ? xwc.m24770i(str2, 0, " \"'<>#&=", 0, 83) : null);
            return;
        }
        dx3Var2.getClass();
        str.getClass();
        if (dx3Var2.f36365g == null) {
            dx3Var2.f36365g = new ArrayList();
        }
        ArrayList arrayList3 = dx3Var2.f36365g;
        arrayList3.getClass();
        arrayList3.add(xwc.m24770i(str, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", 0, 91));
        ArrayList arrayList4 = dx3Var2.f36365g;
        arrayList4.getClass();
        arrayList4.add(str2 != null ? xwc.m24770i(str2, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", 0, 91) : null);
    }
}
