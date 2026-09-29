package com.lingq.core.network.api.result.worldcup;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import p000.bg7;
import p000.df1;
import p000.dj2;
import p000.fa4;
import p000.mk9;
import p000.sk9;
import p000.te1;
import p000.uk9;
import p000.zb2;
import p000.zk3;

/* JADX INFO: loaded from: classes.dex */
@zb2
public final /* synthetic */ class ResultCupChampion$$serializer implements zk3 {
    public static final ResultCupChampion$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ResultCupChampion$$serializer resultCupChampion$$serializer = new ResultCupChampion$$serializer();
        INSTANCE = resultCupChampion$$serializer;
        bg7 bg7Var = new bg7("com.lingq.core.network.api.result.worldcup.ResultCupChampion", resultCupChampion$$serializer, 3);
        bg7Var.m3702k("team", true);
        bg7Var.m3702k("name", true);
        bg7Var.m3702k("coins", true);
        descriptor = bg7Var;
    }

    private ResultCupChampion$$serializer() {
    }

    @Override // p000.zk3
    public final KSerializer[] childSerializers() {
        sk9 sk9Var = sk9.f60959a;
        return new KSerializer[]{sk9Var, sk9Var, dj2.f35711a};
    }

    @Override // kotlinx.serialization.KSerializer
    public final ResultCupChampion deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        df1 df1VarMo4079b = decoder.mo4079b(serialDescriptor);
        int i = 0;
        String strMo4097x = null;
        String strMo4097x2 = null;
        double dMo4072F = 0.0d;
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
            } else {
                if (iMo10319A != 2) {
                    uk9.m22771e(iMo10319A);
                    return null;
                }
                dMo4072F = df1VarMo4079b.mo4072F(serialDescriptor, 2);
                i |= 4;
            }
        }
        df1VarMo4079b.mo4086j(serialDescriptor);
        return new ResultCupChampion(dMo4072F, i, strMo4097x, strMo4097x2);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, ResultCupChampion resultCupChampion) {
        encoder.getClass();
        resultCupChampion.getClass();
        double d = resultCupChampion.f21754c;
        String str = resultCupChampion.f21753b;
        String str2 = resultCupChampion.f21752a;
        SerialDescriptor serialDescriptor = descriptor;
        mk9 mk9VarMo15606b = encoder.mo15606b(serialDescriptor);
        if (mk9VarMo15606b.m16872B(serialDescriptor) || !fa4.m11650l(str2, "")) {
            mk9VarMo15606b.m16882z(serialDescriptor, 0, str2);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || !fa4.m11650l(str, "")) {
            mk9VarMo15606b.m16882z(serialDescriptor, 1, str);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || Double.compare(d, 0.0d) != 0) {
            mk9VarMo15606b.m16874r(serialDescriptor, 2, d);
        }
        mk9VarMo15606b.m16871A(serialDescriptor);
    }

    @Override // p000.zk3
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return te1.f62178b;
    }
}
