package p000;

import java.util.Iterator;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.encoding.Decoder;

/* JADX INFO: renamed from: z */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3815z implements KSerializer {
    /* JADX INFO: renamed from: a */
    public abstract Object mo11356a();

    /* JADX INFO: renamed from: b */
    public abstract int mo11357b(Object obj);

    /* JADX INFO: renamed from: c */
    public abstract Iterator mo14415c(Object obj);

    /* JADX INFO: renamed from: d */
    public abstract int mo12404d(Object obj);

    @Override // kotlinx.serialization.KSerializer
    public Object deserialize(Decoder decoder) {
        return m25393e(decoder);
    }

    /* JADX INFO: renamed from: e */
    public final Object m25393e(Decoder decoder) {
        Object objMo11356a = mo11356a();
        int iMo11357b = mo11357b(objMo11356a);
        df1 df1VarMo4079b = decoder.mo4079b(getDescriptor());
        while (true) {
            int iMo10319A = df1VarMo4079b.mo10319A(getDescriptor());
            if (iMo10319A == -1) {
                df1VarMo4079b.mo4086j(getDescriptor());
                return mo11359h(objMo11356a);
            }
            mo12405f(df1VarMo4079b, iMo10319A + iMo11357b, objMo11356a);
        }
    }

    /* JADX INFO: renamed from: f */
    public abstract void mo12405f(df1 df1Var, int i, Object obj);

    /* JADX INFO: renamed from: g */
    public abstract Object mo11358g(Object obj);

    /* JADX INFO: renamed from: h */
    public abstract Object mo11359h(Object obj);
}
