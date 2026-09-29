package cc;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;

/* JADX INFO: renamed from: cc.s7 */
/* JADX INFO: loaded from: classes.dex */
public final class C1936s7 {

    /* JADX INFO: renamed from: a */
    public final C1897o4 f10200a;

    public C1936s7(C1897o4 c1897o4) {
        this.f10200a = c1897o4;
    }

    /* JADX INFO: renamed from: a */
    public final void m5886a(Bundle bundle, String str) {
        String string;
        C1897o4 c1897o4 = this.f10200a;
        C1879m4 c1879m4 = c1897o4.f10087j;
        C1897o4.m5776k(c1879m4);
        c1879m4.mo5748g();
        if (!c1897o4.m5779g()) {
            if (bundle.isEmpty()) {
                string = null;
            } else {
                if (true == str.isEmpty()) {
                    str = "auto";
                }
                Uri.Builder builder = new Uri.Builder();
                builder.path(str);
                for (String str2 : bundle.keySet()) {
                    builder.appendQueryParameter(str2, bundle.getString(str2));
                }
                string = builder.build().toString();
            }
            if (!TextUtils.isEmpty(string)) {
                C1986y3 c1986y3 = c1897o4.f10085h;
                C1897o4.m5774i(c1986y3);
                c1986y3.f10398P.m5914b(string);
                C1897o4.m5774i(c1986y3);
                c1897o4.f10058I.getClass();
                c1986y3.f10399Q.m5898b(System.currentTimeMillis());
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m5887b() {
        C1986y3 c1986y3 = this.f10200a.f10085h;
        C1897o4.m5774i(c1986y3);
        return c1986y3.f10399Q.m5897a() > 0;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m5888c() {
        if (!m5887b()) {
            return false;
        }
        C1897o4 c1897o4 = this.f10200a;
        c1897o4.f10058I.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        C1986y3 c1986y3 = c1897o4.f10085h;
        C1897o4.m5774i(c1986y3);
        return jCurrentTimeMillis - c1986y3.f10399Q.m5897a() > c1897o4.f10084g.m5579n(null, C1985y2.f10332T);
    }
}
