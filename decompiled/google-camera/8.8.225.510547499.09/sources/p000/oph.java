package p000;

import java.nio.charset.Charset;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class oph {

    /* JADX INFO: renamed from: a */
    public static final Charset f46377a;

    static {
        Charset charsetForName = Charset.forName("UTF-8");
        charsetForName.getClass();
        f46377a = charsetForName;
        Charset.forName("UTF-16").getClass();
        Charset.forName("UTF-16BE").getClass();
        Charset.forName("UTF-16LE").getClass();
        Charset.forName("US-ASCII").getClass();
        Charset.forName("ISO-8859-1").getClass();
    }
}
