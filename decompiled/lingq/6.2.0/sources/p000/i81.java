package p000;

import java.util.Iterator;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes.dex */
public abstract class i81 extends AbstractC3815z {

    /* JADX INFO: renamed from: a */
    public final KSerializer f43676a;

    public i81(KSerializer kSerializer) {
        this.f43676a = kSerializer;
    }

    @Override // p000.AbstractC3815z
    /* JADX INFO: renamed from: f */
    public void mo12405f(df1 df1Var, int i, Object obj) {
        mo11360i(i, obj, df1Var.mo4073G(getDescriptor(), i, this.f43676a, null));
    }

    /* JADX INFO: renamed from: i */
    public abstract void mo11360i(int i, Object obj, Object obj2);

    @Override // kotlinx.serialization.KSerializer
    public void serialize(Encoder encoder, Object obj) {
        int iMo12404d = mo12404d(obj);
        SerialDescriptor descriptor = getDescriptor();
        mk9 mk9VarM15618n = encoder.m15618n(descriptor);
        Iterator itMo14415c = mo14415c(obj);
        for (int i = 0; i < iMo12404d; i++) {
            mk9VarM15618n.m16881y(getDescriptor(), i, this.f43676a, itMo14415c.next());
        }
        mk9VarM15618n.m16871A(descriptor);
    }
}
