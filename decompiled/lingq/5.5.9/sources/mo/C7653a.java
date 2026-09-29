package mo;

import dm.C5207g;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: mo.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C7653a {

    /* JADX INFO: renamed from: a */
    public static final C7653a f42115a = new C7653a();

    /* JADX INFO: renamed from: b */
    public static final Charset f42116b;

    /* JADX INFO: renamed from: c */
    public static final Charset f42117c;

    /* JADX INFO: renamed from: d */
    public static volatile Charset f42118d;

    /* JADX INFO: renamed from: e */
    public static volatile Charset f42119e;

    static {
        Charset charsetForName = Charset.forName("UTF-8");
        C5207g.m11110e(charsetForName, "forName(\"UTF-8\")");
        f42116b = charsetForName;
        C5207g.m11110e(Charset.forName("UTF-16"), "forName(\"UTF-16\")");
        C5207g.m11110e(Charset.forName("UTF-16BE"), "forName(\"UTF-16BE\")");
        C5207g.m11110e(Charset.forName("UTF-16LE"), "forName(\"UTF-16LE\")");
        Charset charsetForName2 = Charset.forName("US-ASCII");
        C5207g.m11110e(charsetForName2, "forName(\"US-ASCII\")");
        f42117c = charsetForName2;
        C5207g.m11110e(Charset.forName("ISO-8859-1"), "forName(\"ISO-8859-1\")");
    }
}
