package p000;

import kotlin.AbstractC3192a;
import kotlin.LazyThreadSafetyMode;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes3.dex */
public final class v16 implements KSerializer {

    /* JADX INFO: renamed from: a */
    public static final v16 f64697a = new v16();

    /* JADX INFO: renamed from: b */
    public static final cs4 f64698b = AbstractC3192a.m15357b(LazyThreadSafetyMode.PUBLICATION, new tx5(5));

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor descriptor = getDescriptor();
        df1 df1VarMo4079b = decoder.mo4079b(descriptor);
        boolean z = false;
        int iMo4091q = 0;
        while (true) {
            v16 v16Var = f64697a;
            int iMo10319A = df1VarMo4079b.mo10319A(v16Var.getDescriptor());
            if (iMo10319A == -1) {
                df1VarMo4079b.mo4086j(descriptor);
                if (z) {
                    return new o22(iMo4091q);
                }
                throw new MissingFieldException("months", getDescriptor().mo3694a());
            }
            if (iMo10319A != 0) {
                pad.m19012b(iMo10319A);
                throw null;
            }
            iMo4091q = df1VarMo4079b.mo4091q(v16Var.getDescriptor(), 0);
            z = true;
        }
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return (SerialDescriptor) f64698b.getValue();
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        o22 o22Var = (o22) obj;
        o22Var.getClass();
        SerialDescriptor descriptor = getDescriptor();
        mk9 mk9VarMo15606b = encoder.mo15606b(descriptor);
        mk9VarMo15606b.m16878v(0, o22Var.f53648d, f64697a.getDescriptor());
        mk9VarMo15606b.m16871A(descriptor);
    }
}
