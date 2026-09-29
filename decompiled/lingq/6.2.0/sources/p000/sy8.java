package p000;

import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class sy8 implements zk3 {

    /* JADX INFO: renamed from: a */
    public static final sy8 f61631a;
    private static final SerialDescriptor descriptor;

    static {
        sy8 sy8Var = new sy8();
        f61631a = sy8Var;
        bg7 bg7Var = new bg7("com.google.firebase.sessions.SessionData", sy8Var, 3);
        bg7Var.m3702k("sessionDetails", false);
        bg7Var.m3702k("backgroundTime", true);
        bg7Var.m3702k("processDataMap", true);
        descriptor = bg7Var;
    }

    @Override // p000.zk3
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{xy8.f68973a, thb.m22059r(i0a.f43300a), thb.m22059r((KSerializer) uy8.f64542d[2].getValue())};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        df1 df1VarMo4079b = decoder.mo4079b(serialDescriptor);
        cs4[] cs4VarArr = uy8.f64542d;
        boolean z = true;
        int i = 0;
        zy8 zy8Var = null;
        k0a k0aVar = null;
        Map map = null;
        while (z) {
            int iMo10319A = df1VarMo4079b.mo10319A(serialDescriptor);
            if (iMo10319A == -1) {
                z = false;
            } else if (iMo10319A == 0) {
                zy8Var = (zy8) df1VarMo4079b.mo4073G(serialDescriptor, 0, xy8.f68973a, zy8Var);
                i |= 1;
            } else if (iMo10319A == 1) {
                k0aVar = (k0a) df1VarMo4079b.mo4070D(serialDescriptor, 1, i0a.f43300a, k0aVar);
                i |= 2;
            } else {
                if (iMo10319A != 2) {
                    uk9.m22771e(iMo10319A);
                    return null;
                }
                map = (Map) df1VarMo4079b.mo4070D(serialDescriptor, 2, (KSerializer) cs4VarArr[2].getValue(), map);
                i |= 4;
            }
        }
        df1VarMo4079b.mo4086j(serialDescriptor);
        return new uy8(i, zy8Var, k0aVar, map);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        uy8 uy8Var = (uy8) obj;
        uy8Var.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        mk9 mk9VarMo15606b = encoder.mo15606b(serialDescriptor);
        cs4[] cs4VarArr = uy8.f64542d;
        xy8 xy8Var = xy8.f68973a;
        zy8 zy8Var = uy8Var.f64543a;
        Map map = uy8Var.f64545c;
        k0a k0aVar = uy8Var.f64544b;
        mk9VarMo15606b.m16881y(serialDescriptor, 0, xy8Var, zy8Var);
        if (mk9VarMo15606b.m16872B(serialDescriptor) || k0aVar != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 1, i0a.f43300a, k0aVar);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || map != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 2, (KSerializer) cs4VarArr[2].getValue(), map);
        }
        mk9VarMo15606b.m16871A(serialDescriptor);
    }

    @Override // p000.zk3
    public final KSerializer[] typeParametersSerializers() {
        return te1.f62178b;
    }
}
