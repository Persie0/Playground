package p000;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xy8 implements zk3 {

    /* JADX INFO: renamed from: a */
    public static final xy8 f68973a;
    private static final SerialDescriptor descriptor;

    static {
        xy8 xy8Var = new xy8();
        f68973a = xy8Var;
        bg7 bg7Var = new bg7("com.google.firebase.sessions.SessionDetails", xy8Var, 4);
        bg7Var.m3702k("sessionId", false);
        bg7Var.m3702k("firstSessionId", false);
        bg7Var.m3702k("sessionIndex", false);
        bg7Var.m3702k("sessionStartTimestampUs", false);
        descriptor = bg7Var;
    }

    @Override // p000.zk3
    public final KSerializer[] childSerializers() {
        sk9 sk9Var = sk9.f60959a;
        return new KSerializer[]{sk9Var, sk9Var, l84.f49294a, rk5.f59434a};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        df1 df1VarMo4079b = decoder.mo4079b(serialDescriptor);
        int i = 0;
        int iMo4091q = 0;
        String strMo4097x = null;
        String strMo4097x2 = null;
        long jMo4085i = 0;
        boolean z = true;
        while (z) {
            int iMo10319A = df1VarMo4079b.mo10319A(serialDescriptor);
            if (iMo10319A == -1) {
                z = false;
            } else if (iMo10319A == 0) {
                strMo4097x = df1VarMo4079b.mo4097x(serialDescriptor, 0);
                i |= 1;
            } else if (iMo10319A == 1) {
                strMo4097x2 = df1VarMo4079b.mo4097x(serialDescriptor, 1);
                i |= 2;
            } else if (iMo10319A == 2) {
                iMo4091q = df1VarMo4079b.mo4091q(serialDescriptor, 2);
                i |= 4;
            } else {
                if (iMo10319A != 3) {
                    uk9.m22771e(iMo10319A);
                    return null;
                }
                jMo4085i = df1VarMo4079b.mo4085i(serialDescriptor, 3);
                i |= 8;
            }
        }
        df1VarMo4079b.mo4086j(serialDescriptor);
        return new zy8(i, strMo4097x, strMo4097x2, iMo4091q, jMo4085i);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        zy8 zy8Var = (zy8) obj;
        zy8Var.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        mk9 mk9VarMo15606b = encoder.mo15606b(serialDescriptor);
        mk9VarMo15606b.m16882z(serialDescriptor, 0, zy8Var.f72388a);
        mk9VarMo15606b.m16882z(serialDescriptor, 1, zy8Var.f72389b);
        mk9VarMo15606b.m16878v(2, zy8Var.f72390c, serialDescriptor);
        mk9VarMo15606b.m16879w(serialDescriptor, 3, zy8Var.f72391d);
        mk9VarMo15606b.m16871A(serialDescriptor);
    }

    @Override // p000.zk3
    public final KSerializer[] typeParametersSerializers() {
        return te1.f62178b;
    }
}
