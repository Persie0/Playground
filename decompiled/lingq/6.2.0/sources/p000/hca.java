package p000;

import kotlin.Triple;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes3.dex */
public final class hca implements KSerializer {

    /* JADX INFO: renamed from: a */
    public final KSerializer f42189a;

    /* JADX INFO: renamed from: b */
    public final KSerializer f42190b;

    /* JADX INFO: renamed from: c */
    public final KSerializer f42191c;

    /* JADX INFO: renamed from: d */
    public final zx8 f42192d = pb1.m19040j("kotlin.Triple", new SerialDescriptor[0], new gca(this, 0));

    public hca(KSerializer kSerializer, KSerializer kSerializer2, KSerializer kSerializer3) {
        this.f42189a = kSerializer;
        this.f42190b = kSerializer2;
        this.f42191c = kSerializer3;
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        zx8 zx8Var = this.f42192d;
        df1 df1VarMo4079b = decoder.mo4079b(zx8Var);
        Object obj = jxc.f46370a;
        Object objMo4073G = obj;
        Object objMo4073G2 = objMo4073G;
        Object objMo4073G3 = objMo4073G2;
        while (true) {
            int iMo10319A = df1VarMo4079b.mo10319A(zx8Var);
            if (iMo10319A == -1) {
                df1VarMo4079b.mo4086j(zx8Var);
                if (objMo4073G == obj) {
                    throw new SerializationException("Element 'first' is missing");
                }
                if (objMo4073G2 == obj) {
                    throw new SerializationException("Element 'second' is missing");
                }
                if (objMo4073G3 != obj) {
                    return new Triple(objMo4073G, objMo4073G2, objMo4073G3);
                }
                throw new SerializationException("Element 'third' is missing");
            }
            if (iMo10319A == 0) {
                objMo4073G = df1VarMo4079b.mo4073G(zx8Var, 0, this.f42189a, null);
            } else if (iMo10319A == 1) {
                objMo4073G2 = df1VarMo4079b.mo4073G(zx8Var, 1, this.f42190b, null);
            } else {
                if (iMo10319A != 2) {
                    throw new SerializationException(ux5.m22988k(iMo10319A, "Unexpected index "));
                }
                objMo4073G3 = df1VarMo4079b.mo4073G(zx8Var, 2, this.f42191c, null);
            }
        }
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return this.f42192d;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        Triple triple = (Triple) obj;
        triple.getClass();
        zx8 zx8Var = this.f42192d;
        mk9 mk9VarMo15606b = encoder.mo15606b(zx8Var);
        mk9VarMo15606b.m16881y(zx8Var, 0, this.f42189a, triple.f47633a);
        mk9VarMo15606b.m16881y(zx8Var, 1, this.f42190b, triple.f47634b);
        mk9VarMo15606b.m16881y(zx8Var, 2, this.f42191c, triple.f47635c);
        mk9VarMo15606b.m16871A(zx8Var);
    }
}
