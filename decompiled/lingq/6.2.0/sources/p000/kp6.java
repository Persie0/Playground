package p000;

import kotlin.AbstractC3192a;
import kotlin.LazyThreadSafetyMode;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes.dex */
public final class kp6 implements KSerializer {

    /* JADX INFO: renamed from: a */
    public final cs4 f48284a = AbstractC3192a.m15357b(LazyThreadSafetyMode.PUBLICATION, new ri5(this));

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor descriptor = getDescriptor();
        df1 df1VarMo4079b = decoder.mo4079b(descriptor);
        int iMo10319A = df1VarMo4079b.mo10319A(getDescriptor());
        if (iMo10319A != -1) {
            throw new SerializationException(ux5.m22988k(iMo10319A, "Unexpected index "));
        }
        df1VarMo4079b.mo4086j(descriptor);
        return xfa.f68157a;
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return (SerialDescriptor) this.f48284a.getValue();
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        obj.getClass();
        encoder.mo15606b(getDescriptor()).m16871A(getDescriptor());
    }
}
