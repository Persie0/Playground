package p000;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public abstract class yu0 {

    /* JADX INFO: renamed from: a */
    public static final Charset f70463a;

    /* JADX INFO: renamed from: b */
    public static final Charset f70464b;

    /* JADX INFO: renamed from: c */
    public static final Charset f70465c;

    /* JADX INFO: renamed from: d */
    public static final Charset f70466d;

    /* JADX INFO: renamed from: e */
    public static volatile Charset f70467e;

    /* JADX INFO: renamed from: f */
    public static volatile Charset f70468f;

    static {
        Charset charsetForName = Charset.forName("UTF-8");
        charsetForName.getClass();
        f70463a = charsetForName;
        Charset.forName("UTF-16").getClass();
        Charset charsetForName2 = Charset.forName("UTF-16BE");
        charsetForName2.getClass();
        f70464b = charsetForName2;
        Charset charsetForName3 = Charset.forName("UTF-16LE");
        charsetForName3.getClass();
        f70465c = charsetForName3;
        Charset charsetForName4 = Charset.forName("US-ASCII");
        charsetForName4.getClass();
        f70466d = charsetForName4;
        Charset.forName("ISO-8859-1").getClass();
    }
}
