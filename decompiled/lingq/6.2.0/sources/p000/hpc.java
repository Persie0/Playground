package p000;

import androidx.compose.runtime.internal.C0282a;
import java.nio.charset.Charset;
import kotlin.Pair;

/* JADX INFO: loaded from: classes2.dex */
public abstract class hpc {

    /* JADX INFO: renamed from: a */
    public static final C0282a f42761a = new C0282a(1591268360, false, new fe1(1));

    /* JADX INFO: renamed from: a */
    public static y68 m13428a(String str, xv5 xv5Var) {
        str.getClass();
        Pair pairM19044n = pb1.m19044n(xv5Var);
        Charset charset = (Charset) pairM19044n.f47623a;
        xv5 xv5Var2 = (xv5) pairM19044n.f47624b;
        byte[] bytes = str.getBytes(charset);
        bytes.getClass();
        int length = bytes.length;
        icb.m13765a(bytes.length, 0L, length);
        return new y68(xv5Var2, length, bytes);
    }
}
