package p000;

import kotlin.AbstractC3192a;
import kotlin.LazyThreadSafetyMode;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes3.dex */
public final class l0a implements KSerializer {

    /* JADX INFO: renamed from: a */
    public static final l0a f48874a = new l0a();

    /* JADX INFO: renamed from: b */
    public static final cs4 f48875b = AbstractC3192a.m15357b(LazyThreadSafetyMode.PUBLICATION, new ks8(21));

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor descriptor = getDescriptor();
        df1 df1VarMo4079b = decoder.mo4079b(descriptor);
        long jMo4085i = 0;
        boolean z = false;
        while (true) {
            l0a l0aVar = f48874a;
            int iMo10319A = df1VarMo4079b.mo10319A(l0aVar.getDescriptor());
            if (iMo10319A == -1) {
                df1VarMo4079b.mo4086j(descriptor);
                if (z) {
                    return new q22(jMo4085i);
                }
                throw new MissingFieldException("nanoseconds", getDescriptor().mo3694a());
            }
            if (iMo10319A != 0) {
                pad.m19012b(iMo10319A);
                throw null;
            }
            jMo4085i = df1VarMo4079b.mo4085i(l0aVar.getDescriptor(), 0);
            z = true;
        }
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return (SerialDescriptor) f48875b.getValue();
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        q22 q22Var = (q22) obj;
        q22Var.getClass();
        SerialDescriptor descriptor = getDescriptor();
        mk9 mk9VarMo15606b = encoder.mo15606b(descriptor);
        mk9VarMo15606b.m16879w(f48874a.getDescriptor(), 0, q22Var.f57155d);
        mk9VarMo15606b.m16871A(descriptor);
    }
}
