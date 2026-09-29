package p000;

import kotlin.AbstractC3192a;
import kotlin.LazyThreadSafetyMode;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes3.dex */
public final class x02 extends AbstractC3168k1 {

    /* JADX INFO: renamed from: a */
    public static final x02 f67587a = new x02();

    /* JADX INFO: renamed from: b */
    public static final cs4 f67588b = AbstractC3192a.m15357b(LazyThreadSafetyMode.PUBLICATION, new wf1(7));

    @Override // p000.AbstractC3168k1
    /* JADX INFO: renamed from: a */
    public final KSerializer mo14763a(df1 df1Var, String str) {
        return ((lo8) f67588b.getValue()).mo14763a(df1Var, str);
    }

    @Override // p000.AbstractC3168k1
    /* JADX INFO: renamed from: b */
    public final KSerializer mo14764b(Encoder encoder, Object obj) {
        k22 k22Var = (k22) obj;
        k22Var.getClass();
        return ((lo8) f67588b.getValue()).mo14764b(encoder, k22Var);
    }

    @Override // p000.AbstractC3168k1
    /* JADX INFO: renamed from: c */
    public final z21 mo14765c() {
        return y38.m24933a(k22.class);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return ((lo8) f67588b.getValue()).getDescriptor();
    }
}
