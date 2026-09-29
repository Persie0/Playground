package p000;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes3.dex */
public final class d12 implements KSerializer {

    /* JADX INFO: renamed from: a */
    public static final d12 f34825a = new d12();

    /* JADX INFO: renamed from: b */
    public static final gk7 f34826b = pb1.m19035e("kotlinx.datetime.DatePeriod/ISO");

    @Override // kotlinx.serialization.KSerializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final c12 deserialize(Decoder decoder) {
        d22 d22Var = e22.Companion;
        String strMo4092s = decoder.mo4092s();
        d22Var.getClass();
        e22 e22VarM9997a = d22.m9997a(strMo4092s);
        if (e22VarM9997a instanceof c12) {
            return (c12) e22VarM9997a;
        }
        throw new SerializationException(e22VarM9997a + " is not a date-based period");
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f34826b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        c12 c12Var = (c12) obj;
        c12Var.getClass();
        encoder.mo15620p(c12Var.toString());
    }
}
