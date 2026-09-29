package p000;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes.dex */
public final class yfa implements KSerializer {

    /* JADX INFO: renamed from: b */
    public static final yfa f69798b = new yfa();

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ kp6 f69799a = new kp6();

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        this.f69799a.deserialize(decoder);
        return xfa.f68157a;
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return this.f69799a.getDescriptor();
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        xfa xfaVar = (xfa) obj;
        xfaVar.getClass();
        this.f69799a.serialize(encoder, xfaVar);
    }
}
