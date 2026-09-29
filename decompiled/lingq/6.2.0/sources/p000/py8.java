package p000;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class py8 implements zk3 {

    /* JADX INFO: renamed from: a */
    public static final py8 f56999a;
    private static final SerialDescriptor descriptor;

    static {
        py8 py8Var = new py8();
        f56999a = py8Var;
        bg7 bg7Var = new bg7("com.google.firebase.sessions.settings.SessionConfigs", py8Var, 5);
        bg7Var.m3702k("sessionsEnabled", false);
        bg7Var.m3702k("sessionSamplingRate", false);
        bg7Var.m3702k("sessionTimeoutSeconds", false);
        bg7Var.m3702k("cacheDurationSeconds", false);
        bg7Var.m3702k("cacheUpdatedTimeSeconds", false);
        descriptor = bg7Var;
    }

    @Override // p000.zk3
    public final KSerializer[] childSerializers() {
        KSerializer kSerializerM22059r = thb.m22059r(lf0.f49579a);
        KSerializer kSerializerM22059r2 = thb.m22059r(dj2.f35711a);
        l84 l84Var = l84.f49294a;
        return new KSerializer[]{kSerializerM22059r, kSerializerM22059r2, thb.m22059r(l84Var), thb.m22059r(l84Var), thb.m22059r(rk5.f59434a)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        df1 df1VarMo4079b = decoder.mo4079b(serialDescriptor);
        boolean z = true;
        int i = 0;
        Boolean bool = null;
        Double d = null;
        Integer num = null;
        Integer num2 = null;
        Long l = null;
        while (z) {
            int iMo10319A = df1VarMo4079b.mo10319A(serialDescriptor);
            if (iMo10319A == -1) {
                z = false;
            } else if (iMo10319A == 0) {
                bool = (Boolean) df1VarMo4079b.mo4070D(serialDescriptor, 0, lf0.f49579a, bool);
                i |= 1;
            } else if (iMo10319A == 1) {
                d = (Double) df1VarMo4079b.mo4070D(serialDescriptor, 1, dj2.f35711a, d);
                i |= 2;
            } else if (iMo10319A == 2) {
                num = (Integer) df1VarMo4079b.mo4070D(serialDescriptor, 2, l84.f49294a, num);
                i |= 4;
            } else if (iMo10319A == 3) {
                num2 = (Integer) df1VarMo4079b.mo4070D(serialDescriptor, 3, l84.f49294a, num2);
                i |= 8;
            } else {
                if (iMo10319A != 4) {
                    uk9.m22771e(iMo10319A);
                    return null;
                }
                l = (Long) df1VarMo4079b.mo4070D(serialDescriptor, 4, rk5.f59434a, l);
                i |= 16;
            }
        }
        df1VarMo4079b.mo4086j(serialDescriptor);
        return new ry8(i, bool, d, num, num2, l);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        ry8 ry8Var = (ry8) obj;
        ry8Var.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        mk9 mk9VarMo15606b = encoder.mo15606b(serialDescriptor);
        mk9VarMo15606b.m16880x(serialDescriptor, 0, lf0.f49579a, ry8Var.f60044a);
        mk9VarMo15606b.m16880x(serialDescriptor, 1, dj2.f35711a, ry8Var.f60045b);
        l84 l84Var = l84.f49294a;
        mk9VarMo15606b.m16880x(serialDescriptor, 2, l84Var, ry8Var.f60046c);
        mk9VarMo15606b.m16880x(serialDescriptor, 3, l84Var, ry8Var.f60047d);
        mk9VarMo15606b.m16880x(serialDescriptor, 4, rk5.f59434a, ry8Var.f60048e);
        mk9VarMo15606b.m16871A(serialDescriptor);
    }

    @Override // p000.zk3
    public final KSerializer[] typeParametersSerializers() {
        return te1.f62178b;
    }
}
