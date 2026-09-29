package p000;

import androidx.compose.runtime.internal.C0282a;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes3.dex */
public abstract class sfc {

    /* JADX INFO: renamed from: a */
    public static final C0282a f60803a = new C0282a(-1857786937, false, new wd1(23));

    /* JADX INFO: renamed from: a */
    public static final KSerializer m21342a(AbstractC3168k1 abstractC3168k1, df1 df1Var, String str) {
        abstractC3168k1.getClass();
        KSerializer kSerializerMo14763a = abstractC3168k1.mo14763a(df1Var, str);
        if (kSerializerMo14763a != null) {
            return kSerializerMo14763a;
        }
        yyc.m25386b(abstractC3168k1.mo14765c(), str);
        throw null;
    }

    /* JADX INFO: renamed from: b */
    public static final KSerializer m21343b(AbstractC3168k1 abstractC3168k1, Encoder encoder, Object obj) {
        abstractC3168k1.getClass();
        obj.getClass();
        KSerializer kSerializerMo14764b = abstractC3168k1.mo14764b(encoder, obj);
        if (kSerializerMo14764b != null) {
            return kSerializerMo14764b;
        }
        z21 z21VarM24933a = y38.m24933a(obj.getClass());
        z21 z21VarMo14765c = abstractC3168k1.mo14765c();
        z21VarMo14765c.getClass();
        String strM25414c = z21VarM24933a.m25414c();
        if (strM25414c == null) {
            strM25414c = String.valueOf(z21VarM24933a);
        }
        yyc.m25386b(z21VarMo14765c, strM25414c);
        throw null;
    }
}
