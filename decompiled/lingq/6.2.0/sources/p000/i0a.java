package p000;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i0a implements zk3 {

    /* JADX INFO: renamed from: a */
    public static final i0a f43300a;
    private static final SerialDescriptor descriptor;

    static {
        i0a i0aVar = new i0a();
        f43300a = i0aVar;
        bg7 bg7Var = new bg7("com.google.firebase.sessions.Time", i0aVar, 3);
        bg7Var.m3702k("ms", false);
        bg7Var.m3702k("us", true);
        bg7Var.m3702k("seconds", true);
        descriptor = bg7Var;
    }

    @Override // p000.zk3
    public final KSerializer[] childSerializers() {
        rk5 rk5Var = rk5.f59434a;
        return new KSerializer[]{rk5Var, rk5Var, rk5Var};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        df1 df1VarMo4079b = decoder.mo4079b(serialDescriptor);
        int i = 0;
        long jMo4085i = 0;
        long jMo4085i2 = 0;
        long jMo4085i3 = 0;
        boolean z = true;
        while (z) {
            int iMo10319A = df1VarMo4079b.mo10319A(serialDescriptor);
            if (iMo10319A == -1) {
                z = false;
            } else if (iMo10319A == 0) {
                jMo4085i = df1VarMo4079b.mo4085i(serialDescriptor, 0);
                i |= 1;
            } else if (iMo10319A == 1) {
                jMo4085i2 = df1VarMo4079b.mo4085i(serialDescriptor, 1);
                i |= 2;
            } else {
                if (iMo10319A != 2) {
                    uk9.m22771e(iMo10319A);
                    return null;
                }
                jMo4085i3 = df1VarMo4079b.mo4085i(serialDescriptor, 2);
                i |= 4;
            }
        }
        df1VarMo4079b.mo4086j(serialDescriptor);
        return new k0a(i, jMo4085i, jMo4085i2, jMo4085i3);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        k0a k0aVar = (k0a) obj;
        k0aVar.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        mk9 mk9VarMo15606b = encoder.mo15606b(serialDescriptor);
        long j = k0aVar.f46519a;
        long j2 = k0aVar.f46521c;
        long j3 = k0aVar.f46520b;
        mk9VarMo15606b.m16879w(serialDescriptor, 0, j);
        if (mk9VarMo15606b.m16872B(serialDescriptor) || j3 != j * 1000) {
            mk9VarMo15606b.m16879w(serialDescriptor, 1, j3);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || j2 != j / 1000) {
            mk9VarMo15606b.m16879w(serialDescriptor, 2, j2);
        }
        mk9VarMo15606b.m16871A(serialDescriptor);
    }

    @Override // p000.zk3
    public final KSerializer[] typeParametersSerializers() {
        return te1.f62178b;
    }
}
