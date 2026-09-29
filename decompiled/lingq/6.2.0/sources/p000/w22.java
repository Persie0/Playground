package p000;

import kotlin.AbstractC3192a;
import kotlin.LazyThreadSafetyMode;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes3.dex */
public final class w22 implements KSerializer {

    /* JADX INFO: renamed from: a */
    public static final w22 f66250a = new w22();

    /* JADX INFO: renamed from: b */
    public static final cs4 f66251b = AbstractC3192a.m15357b(LazyThreadSafetyMode.PUBLICATION, new wf1(9));

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor descriptor = getDescriptor();
        df1 df1VarMo4079b = decoder.mo4079b(descriptor);
        boolean z = false;
        int iMo4091q = 0;
        while (true) {
            w22 w22Var = f66250a;
            int iMo10319A = df1VarMo4079b.mo10319A(w22Var.getDescriptor());
            if (iMo10319A == -1) {
                df1VarMo4079b.mo4086j(descriptor);
                if (z) {
                    return new m22(iMo4091q);
                }
                throw new MissingFieldException("days", getDescriptor().mo3694a());
            }
            if (iMo10319A != 0) {
                pad.m19012b(iMo10319A);
                throw null;
            }
            iMo4091q = df1VarMo4079b.mo4091q(w22Var.getDescriptor(), 0);
            z = true;
        }
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return (SerialDescriptor) f66251b.getValue();
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        m22 m22Var = (m22) obj;
        m22Var.getClass();
        SerialDescriptor descriptor = getDescriptor();
        mk9 mk9VarMo15606b = encoder.mo15606b(descriptor);
        mk9VarMo15606b.m16878v(0, m22Var.f50447d, f66250a.getDescriptor());
        mk9VarMo15606b.m16871A(descriptor);
    }
}
