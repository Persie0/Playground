package com.lingq.core.network.api.result.worldcup;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import p000.bg7;
import p000.df1;
import p000.fa4;
import p000.l84;
import p000.mk9;
import p000.sk9;
import p000.te1;
import p000.uk9;
import p000.zb2;
import p000.zk3;

/* JADX INFO: loaded from: classes2.dex */
@zb2
public final /* synthetic */ class ResultCupJoinTeam$$serializer implements zk3 {
    public static final ResultCupJoinTeam$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ResultCupJoinTeam$$serializer resultCupJoinTeam$$serializer = new ResultCupJoinTeam$$serializer();
        INSTANCE = resultCupJoinTeam$$serializer;
        bg7 bg7Var = new bg7("com.lingq.core.network.api.result.worldcup.ResultCupJoinTeam", resultCupJoinTeam$$serializer, 4);
        bg7Var.m3702k("id", true);
        bg7Var.m3702k("code", true);
        bg7Var.m3702k("name", true);
        bg7Var.m3702k("challenge_id", true);
        descriptor = bg7Var;
    }

    private ResultCupJoinTeam$$serializer() {
    }

    @Override // p000.zk3
    public final KSerializer[] childSerializers() {
        l84 l84Var = l84.f49294a;
        sk9 sk9Var = sk9.f60959a;
        return new KSerializer[]{l84Var, sk9Var, sk9Var, l84Var};
    }

    @Override // kotlinx.serialization.KSerializer
    public final ResultCupJoinTeam deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        df1 df1VarMo4079b = decoder.mo4079b(serialDescriptor);
        boolean z = true;
        int i = 0;
        int iMo4091q = 0;
        int iMo4091q2 = 0;
        String strMo4097x = null;
        String strMo4097x2 = null;
        while (z) {
            int iMo10319A = df1VarMo4079b.mo10319A(serialDescriptor);
            if (iMo10319A == -1) {
                z = false;
            } else if (iMo10319A == 0) {
                iMo4091q = df1VarMo4079b.mo4091q(serialDescriptor, 0);
                i |= 1;
            } else if (iMo10319A == 1) {
                strMo4097x = df1VarMo4079b.mo4097x(serialDescriptor, 1);
                i |= 2;
            } else if (iMo10319A == 2) {
                strMo4097x2 = df1VarMo4079b.mo4097x(serialDescriptor, 2);
                i |= 4;
            } else {
                if (iMo10319A != 3) {
                    uk9.m22771e(iMo10319A);
                    return null;
                }
                iMo4091q2 = df1VarMo4079b.mo4091q(serialDescriptor, 3);
                i |= 8;
            }
        }
        df1VarMo4079b.mo4086j(serialDescriptor);
        return new ResultCupJoinTeam(strMo4097x, i, strMo4097x2, iMo4091q, iMo4091q2);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, ResultCupJoinTeam resultCupJoinTeam) {
        encoder.getClass();
        resultCupJoinTeam.getClass();
        int i = resultCupJoinTeam.f21777d;
        String str = resultCupJoinTeam.f21776c;
        String str2 = resultCupJoinTeam.f21775b;
        int i2 = resultCupJoinTeam.f21774a;
        SerialDescriptor serialDescriptor = descriptor;
        mk9 mk9VarMo15606b = encoder.mo15606b(serialDescriptor);
        if (mk9VarMo15606b.m16872B(serialDescriptor) || i2 != 0) {
            mk9VarMo15606b.m16878v(0, i2, serialDescriptor);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || !fa4.m11650l(str2, "")) {
            mk9VarMo15606b.m16882z(serialDescriptor, 1, str2);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || !fa4.m11650l(str, "")) {
            mk9VarMo15606b.m16882z(serialDescriptor, 2, str);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || i != 0) {
            mk9VarMo15606b.m16878v(3, i, serialDescriptor);
        }
        mk9VarMo15606b.m16871A(serialDescriptor);
    }

    @Override // p000.zk3
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return te1.f62178b;
    }
}
