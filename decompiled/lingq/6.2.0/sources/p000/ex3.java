package p000;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes.dex */
public final class ex3 {

    /* JADX INFO: renamed from: a */
    public final String f38024a;

    /* JADX INFO: renamed from: b */
    public final String f38025b;

    /* JADX INFO: renamed from: c */
    public final String f38026c;

    /* JADX INFO: renamed from: d */
    public final String f38027d;

    /* JADX INFO: renamed from: e */
    public final int f38028e;

    /* JADX INFO: renamed from: f */
    public final ArrayList f38029f;

    /* JADX INFO: renamed from: g */
    public final List f38030g;

    /* JADX INFO: renamed from: h */
    public final String f38031h;

    /* JADX INFO: renamed from: i */
    public final String f38032i;

    public ex3(String str, String str2, String str3, String str4, int i, ArrayList arrayList, ArrayList arrayList2, String str5, String str6) {
        this.f38024a = str;
        this.f38025b = str2;
        this.f38026c = str3;
        this.f38027d = str4;
        this.f38028e = i;
        this.f38029f = arrayList;
        this.f38030g = arrayList2;
        this.f38031h = str5;
        this.f38032i = str6;
    }

    /* JADX INFO: renamed from: a */
    public final String m11375a() {
        if (this.f38026c.length() == 0) {
            return "";
        }
        int length = this.f38024a.length() + 3;
        String str = this.f38032i;
        return str.substring(vk9.m23388k0(str, ':', length, 4) + 1, vk9.m23388k0(str, '@', 0, 6));
    }

    /* JADX INFO: renamed from: b */
    public final String m11376b() {
        int length = this.f38024a.length() + 3;
        String str = this.f38032i;
        int iM23388k0 = vk9.m23388k0(str, '/', length, 4);
        return str.substring(iM23388k0, icb.m13770f(str, iM23388k0, str.length(), "?#"));
    }

    /* JADX INFO: renamed from: c */
    public final ArrayList m11377c() {
        int length = this.f38024a.length() + 3;
        String str = this.f38032i;
        int iM23388k0 = vk9.m23388k0(str, '/', length, 4);
        int iM13770f = icb.m13770f(str, iM23388k0, str.length(), "?#");
        ArrayList arrayList = new ArrayList();
        while (iM23388k0 < iM13770f) {
            int i = iM23388k0 + 1;
            int iM13769e = icb.m13769e(str, '/', i, iM13770f);
            arrayList.add(str.substring(i, iM13769e));
            iM23388k0 = iM13769e;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: d */
    public final String m11378d() {
        if (this.f38030g == null) {
            return null;
        }
        String str = this.f38032i;
        int iM23388k0 = vk9.m23388k0(str, '?', 0, 6) + 1;
        return str.substring(iM23388k0, icb.m13769e(str, '#', iM23388k0, str.length()));
    }

    /* JADX INFO: renamed from: e */
    public final String m11379e() {
        if (this.f38025b.length() == 0) {
            return "";
        }
        int length = this.f38024a.length() + 3;
        String str = this.f38032i;
        return str.substring(length, icb.m13770f(str, length, str.length(), ":@"));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ex3) && ((ex3) obj).f38032i.equals(this.f38032i);
    }

    /* JADX INFO: renamed from: f */
    public final boolean m11380f() {
        return fa4.m11650l(this.f38024a, "https");
    }

    /* JADX INFO: renamed from: g */
    public final dx3 m11381g() {
        int i;
        dx3 dx3Var = new dx3();
        String str = this.f38024a;
        dx3Var.f36359a = str;
        dx3Var.f36360b = m11379e();
        dx3Var.f36361c = m11375a();
        dx3Var.f36362d = this.f38027d;
        str.getClass();
        if (str.equals("http")) {
            i = 80;
        } else {
            i = str.equals("https") ? 443 : -1;
        }
        int i2 = this.f38028e;
        dx3Var.f36363e = i2 != i ? i2 : -1;
        ArrayList arrayList = dx3Var.f36364f;
        arrayList.clear();
        arrayList.addAll(m11377c());
        String strM11378d = m11378d();
        String strSubstring = null;
        dx3Var.f36365g = strM11378d != null ? dx3.m10733g(xwc.m24770i(strM11378d, 0, " \"'<>#", 0, 83)) : null;
        if (this.f38031h != null) {
            String str2 = this.f38032i;
            strSubstring = str2.substring(vk9.m23388k0(str2, '#', 0, 6) + 1);
        }
        dx3Var.f36366h = strSubstring;
        return dx3Var;
    }

    /* JADX INFO: renamed from: h */
    public final String m11382h() {
        dx3 dx3Var;
        try {
            dx3Var = new dx3();
            dx3Var.m10737d(this, "/...");
        } catch (IllegalArgumentException unused) {
            dx3Var = null;
        }
        dx3Var.getClass();
        dx3Var.f36360b = xwc.m24770i("", 0, " \"':;<=>@[]^`{}|/\\?#", 0, 123);
        dx3Var.f36361c = xwc.m24770i("", 0, " \"':;<=>@[]^`{}|/\\?#", 0, 123);
        return dx3Var.m10734a().f38032i;
    }

    public final int hashCode() {
        return this.f38032i.hashCode();
    }

    /* JADX INFO: renamed from: i */
    public final URI m11383i() {
        dx3 dx3VarM11381g = m11381g();
        ArrayList arrayList = dx3VarM11381g.f36364f;
        String str = dx3VarM11381g.f36362d;
        dx3VarM11381g.f36362d = str != null ? new Regex("[\"<>^`{|}]").m15428g(str, "") : null;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList.set(i, xwc.m24770i((String) arrayList.get(i), 0, "[]", 0, 99));
        }
        ArrayList arrayList2 = dx3VarM11381g.f36365g;
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                String str2 = (String) arrayList2.get(i2);
                arrayList2.set(i2, str2 != null ? xwc.m24770i(str2, 0, "\\^`{|}", 0, 67) : null);
            }
        }
        String str3 = dx3VarM11381g.f36366h;
        dx3VarM11381g.f36366h = str3 != null ? xwc.m24770i(str3, 0, " \"#<>\\^`{|}", 0, 35) : null;
        String string = dx3VarM11381g.toString();
        try {
            return new URI(string);
        } catch (URISyntaxException e) {
            try {
                URI uriCreate = URI.create(new Regex("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]").m15428g(string, ""));
                uriCreate.getClass();
                return uriCreate;
            } catch (Exception unused) {
                v63.m23141s(e);
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public final URL m11384j() {
        try {
            return new URL(this.f38032i);
        } catch (MalformedURLException e) {
            v63.m23141s(e);
            return null;
        }
    }

    public final String toString() {
        return this.f38032i;
    }
}
