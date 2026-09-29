package p000;

import kotlin.AbstractC3192a;
import kotlin.LazyThreadSafetyMode;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes3.dex */
public final class s22 extends AbstractC3168k1 {

    /* JADX INFO: renamed from: a */
    public static final s22 f60175a = new s22();

    /* JADX INFO: renamed from: b */
    public static final cs4 f60176b = AbstractC3192a.m15357b(LazyThreadSafetyMode.PUBLICATION, new wf1(8));

    @Override // p000.AbstractC3168k1
    /* JADX INFO: renamed from: a */
    public final KSerializer mo14763a(df1 df1Var, String str) {
        return ((lo8) f60176b.getValue()).mo14763a(df1Var, str);
    }

    @Override // p000.AbstractC3168k1
    /* JADX INFO: renamed from: b */
    public final KSerializer mo14764b(Encoder encoder, Object obj) {
        r22 r22Var = (r22) obj;
        r22Var.getClass();
        return ((lo8) f60176b.getValue()).mo14764b(encoder, r22Var);
    }

    @Override // p000.AbstractC3168k1
    /* JADX INFO: renamed from: c */
    public final z21 mo14765c() {
        return y38.m24933a(r22.class);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return ((lo8) f60176b.getValue()).getDescriptor();
    }
}
