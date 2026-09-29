package p000;

import java.util.Arrays;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes.dex */
public final class am1 implements KSerializer {

    /* JADX INFO: renamed from: a */
    public final z21 f822a;

    /* JADX INFO: renamed from: b */
    public final KSerializer f823b;

    /* JADX INFO: renamed from: c */
    public final List f824c;

    /* JADX INFO: renamed from: d */
    public final ql1 f825d;

    public am1(z21 z21Var, KSerializer kSerializer, KSerializer[] kSerializerArr) {
        this.f822a = z21Var;
        this.f823b = kSerializer;
        List listAsList = Arrays.asList(kSerializerArr);
        listAsList.getClass();
        this.f824c = listAsList;
        this.f825d = new ql1(pb1.m19041k("kotlinx.serialization.ContextualSerializer", cy8.f34711y, new SerialDescriptor[0], new C0011a9(this, 5)), z21Var);
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        w41 w41VarMo10320a = decoder.mo10320a();
        List list = this.f824c;
        z21 z21Var = this.f822a;
        KSerializer kSerializerM23727o = w41VarMo10320a.m23727o(z21Var, list);
        if (kSerializerM23727o == null && (kSerializerM23727o = this.f823b) == null) {
            throw new SerializationException(eh0.m11108E(z21Var));
        }
        return decoder.mo15604w(kSerializerM23727o);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return this.f825d;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        obj.getClass();
        w41 w41VarMo15605a = encoder.mo15605a();
        List list = this.f824c;
        z21 z21Var = this.f822a;
        KSerializer kSerializerM23727o = w41VarMo15605a.m23727o(z21Var, list);
        if (kSerializerM23727o == null && (kSerializerM23727o = this.f823b) == null) {
            throw new SerializationException(eh0.m11108E(z21Var));
        }
        encoder.mo15617m(kSerializerM23727o, obj);
    }
}
