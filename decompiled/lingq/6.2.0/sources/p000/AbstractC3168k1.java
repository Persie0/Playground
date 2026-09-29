package p000;

import java.util.Map;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: renamed from: k1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3168k1 implements KSerializer {
    /* JADX INFO: renamed from: a */
    public KSerializer mo14763a(df1 df1Var, String str) {
        w41 w41VarMo10320a = df1Var.mo10320a();
        z21 z21VarMo14765c = mo14765c();
        w41VarMo10320a.getClass();
        z21VarMo14765c.getClass();
        Map map = (Map) ((Map) w41VarMo10320a.f66368d).get(z21VarMo14765c);
        KSerializer kSerializer = map != null ? (KSerializer) map.get(str) : null;
        if (!(kSerializer instanceof KSerializer)) {
            kSerializer = null;
        }
        if (kSerializer != null) {
            return kSerializer;
        }
        Object obj = ((Map) w41VarMo10320a.f66369e).get(z21VarMo14765c);
        vi3 vi3Var = lda.m16105E(1, obj) ? (vi3) obj : null;
        if (vi3Var != null) {
            return (KSerializer) vi3Var.invoke(str);
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public KSerializer mo14764b(Encoder encoder, Object obj) {
        obj.getClass();
        w41 w41VarMo15605a = encoder.mo15605a();
        z21 z21VarMo14765c = mo14765c();
        w41VarMo15605a.getClass();
        z21VarMo14765c.getClass();
        if (z21VarMo14765c.m25415d(obj)) {
            Map map = (Map) ((Map) w41VarMo15605a.f66366b).get(z21VarMo14765c);
            KSerializer kSerializer = map != null ? (KSerializer) map.get(y38.m24933a(obj.getClass())) : null;
            KSerializer kSerializer2 = kSerializer instanceof KSerializer ? kSerializer : null;
            if (kSerializer2 != null) {
                return kSerializer2;
            }
            Object obj2 = ((Map) w41VarMo15605a.f66367c).get(z21VarMo14765c);
            vi3 vi3Var = lda.m16105E(1, obj2) ? (vi3) obj2 : null;
            if (vi3Var != null) {
                return (KSerializer) vi3Var.invoke(obj);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public abstract z21 mo14765c();

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor descriptor = getDescriptor();
        df1 df1VarMo4079b = decoder.mo4079b(descriptor);
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        Object objMo4073G = null;
        while (true) {
            int iMo10319A = df1VarMo4079b.mo10319A(getDescriptor());
            if (iMo10319A == -1) {
                if (objMo4073G != null) {
                    df1VarMo4079b.mo4086j(descriptor);
                    return objMo4073G;
                }
                ij6.m13961s((String) ref$ObjectRef.f47718a, "Polymorphic value has not been read for class ");
                return null;
            }
            if (iMo10319A != 0) {
                Object obj = ref$ObjectRef.f47718a;
                if (iMo10319A != 1) {
                    StringBuilder sb = new StringBuilder("Invalid index in polymorphic deserialization of ");
                    String str = (String) obj;
                    if (str == null) {
                        str = "unknown class";
                    }
                    sb.append(str);
                    sb.append("\n Expected 0, 1 or DECODE_DONE(-1), but found ");
                    sb.append(iMo10319A);
                    throw new SerializationException(sb.toString());
                }
                if (obj == null) {
                    C3386nv.m17626m("Cannot read polymorphic value before its type token");
                    return null;
                }
                ref$ObjectRef.f47718a = obj;
                objMo4073G = df1VarMo4079b.mo4073G(getDescriptor(), iMo10319A, sfc.m21342a(this, df1VarMo4079b, (String) obj), null);
            } else {
                ref$ObjectRef.f47718a = df1VarMo4079b.mo4097x(getDescriptor(), iMo10319A);
            }
        }
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        obj.getClass();
        KSerializer kSerializerM21343b = sfc.m21343b(this, encoder, obj);
        SerialDescriptor descriptor = getDescriptor();
        mk9 mk9VarMo15606b = encoder.mo15606b(descriptor);
        mk9VarMo15606b.m16882z(getDescriptor(), 0, kSerializerM21343b.getDescriptor().mo3694a());
        mk9VarMo15606b.m16881y(getDescriptor(), 1, kSerializerM21343b, obj);
        mk9VarMo15606b.m16871A(descriptor);
    }
}
