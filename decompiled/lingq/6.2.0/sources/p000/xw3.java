package p000;

import okio.ByteString;

/* JADX INFO: loaded from: classes.dex */
public abstract class xw3 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f68902a = 0;

    static {
        ByteString byteString = ByteString.f54513d;
        iy5.m14193h("\"\\");
        iy5.m14193h("\t ,=");
    }

    /* JADX INFO: renamed from: a */
    public static final boolean m24724a(j88 j88Var) {
        if (fa4.m11650l((String) j88Var.f45201a.f10359b, "HEAD")) {
            return false;
        }
        int i = j88Var.f45204d;
        if (((i < 100 || i >= 200) && i != 204 && i != 304) || kcb.m15114e(j88Var) != -1) {
            return true;
        }
        String strM20121d = j88Var.f45206f.m20121d("Transfer-Encoding");
        if (strM20121d == null) {
            strM20121d = null;
        }
        return "chunked".equalsIgnoreCase(strM20121d);
    }
}
