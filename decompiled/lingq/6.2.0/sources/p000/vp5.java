package p000;

import java.util.Map;
import kotlin.Pair;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes3.dex */
public final class vp5 implements KSerializer {

    /* JADX INFO: renamed from: a */
    public final KSerializer f65760a;

    /* JADX INFO: renamed from: b */
    public final KSerializer f65761b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f65762c;

    /* JADX INFO: renamed from: d */
    public final zx8 f65763d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public vp5(KSerializer kSerializer, KSerializer kSerializer2, int i) {
        this(kSerializer, kSerializer2, (byte) 0);
        this.f65762c = i;
        switch (i) {
            case 1:
                this(kSerializer, kSerializer2, (byte) 0);
                SerialDescriptor[] serialDescriptorArr = new SerialDescriptor[0];
                if (vk9.m23391n0("kotlin.Pair")) {
                    C3386nv.m17626m("Blank serial names are prohibited");
                    throw null;
                }
                a31 a31Var = new a31("kotlin.Pair");
                a31Var.m56a("first", kSerializer.getDescriptor());
                a31Var.m56a("second", kSerializer2.getDescriptor());
                this.f65763d = new zx8("kotlin.Pair", hl9.f42585y, a31Var.f165c.size(), AbstractC3550rv.m20852t0(serialDescriptorArr), a31Var);
                return;
            default:
                this.f65763d = pb1.m19041k("kotlin.collections.Map.Entry", hl9.f42583A, new SerialDescriptor[0], new h85(7, kSerializer, kSerializer2));
                return;
        }
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        Object up5Var;
        SerialDescriptor descriptor = getDescriptor();
        df1 df1VarMo4079b = decoder.mo4079b(descriptor);
        Object obj = jxc.f46370a;
        Object objMo4073G = obj;
        Object objMo4073G2 = objMo4073G;
        while (true) {
            int iMo10319A = df1VarMo4079b.mo10319A(getDescriptor());
            if (iMo10319A == -1) {
                if (objMo4073G == obj) {
                    throw new SerializationException("Element 'key' is missing");
                }
                if (objMo4073G2 == obj) {
                    throw new SerializationException("Element 'value' is missing");
                }
                switch (this.f65762c) {
                    case 0:
                        up5Var = new up5(objMo4073G, objMo4073G2);
                        break;
                    default:
                        up5Var = new Pair(objMo4073G, objMo4073G2);
                        break;
                }
                df1VarMo4079b.mo4086j(descriptor);
                return up5Var;
            }
            if (iMo10319A == 0) {
                objMo4073G = df1VarMo4079b.mo4073G(getDescriptor(), 0, this.f65760a, null);
            } else {
                if (iMo10319A != 1) {
                    throw new SerializationException(ux5.m22988k(iMo10319A, "Invalid index: "));
                }
                objMo4073G2 = df1VarMo4079b.mo4073G(getDescriptor(), 1, this.f65761b, null);
            }
        }
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        switch (this.f65762c) {
            case 0:
                break;
        }
        return this.f65763d;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        Object key;
        Object value;
        mk9 mk9VarMo15606b = encoder.mo15606b(getDescriptor());
        SerialDescriptor descriptor = getDescriptor();
        KSerializer kSerializer = this.f65760a;
        int i = this.f65762c;
        switch (i) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                key = entry.getKey();
                break;
            default:
                Pair pair = (Pair) obj;
                pair.getClass();
                key = pair.f47623a;
                break;
        }
        mk9VarMo15606b.m16881y(descriptor, 0, kSerializer, key);
        SerialDescriptor descriptor2 = getDescriptor();
        KSerializer kSerializer2 = this.f65761b;
        switch (i) {
            case 0:
                Map.Entry entry2 = (Map.Entry) obj;
                entry2.getClass();
                value = entry2.getValue();
                break;
            default:
                Pair pair2 = (Pair) obj;
                pair2.getClass();
                value = pair2.f47624b;
                break;
        }
        mk9VarMo15606b.m16881y(descriptor2, 1, kSerializer2, value);
        mk9VarMo15606b.m16871A(getDescriptor());
    }

    public vp5(KSerializer kSerializer, KSerializer kSerializer2, byte b) {
        this.f65760a = kSerializer;
        this.f65761b = kSerializer2;
    }
}
