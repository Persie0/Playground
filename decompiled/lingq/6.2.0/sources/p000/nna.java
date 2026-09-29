package p000;

import kotlin.uuid.AbstractC3207a;
import kotlin.uuid.Uuid;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes.dex */
public final class nna implements KSerializer {

    /* JADX INFO: renamed from: a */
    public static final nna f53005a = new nna();

    /* JADX INFO: renamed from: b */
    public static final gk7 f53006b = new gk7("kotlin.uuid.Uuid", ak7.f772G);

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        String strMo4092s = decoder.mo4092s();
        strMo4092s.getClass();
        int length = strMo4092s.length();
        if (length == 32) {
            return AbstractC3207a.m15432c(strMo4092s);
        }
        if (length == 36) {
            return AbstractC3207a.m15433d(strMo4092s);
        }
        throw new IllegalArgumentException("Expected either a 36-char string in the standard hex-and-dash UUID format or a 32-char hexadecimal string, but was \"" + mna.m16945e(strMo4092s) + "\" of length " + strMo4092s.length());
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f53006b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        Uuid uuid = (Uuid) obj;
        uuid.getClass();
        encoder.mo15620p(uuid.toString());
    }
}
