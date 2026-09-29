package com.lingq.core.network.api.result.worldcup;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import p000.bg7;
import p000.df1;
import p000.dj2;
import p000.fa4;
import p000.l84;
import p000.mk9;
import p000.sk9;
import p000.te1;
import p000.thb;
import p000.uk9;
import p000.zb2;
import p000.zk3;

/* JADX INFO: loaded from: classes2.dex */
@zb2
public final /* synthetic */ class ResultCupTeamStanding$$serializer implements zk3 {
    public static final ResultCupTeamStanding$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ResultCupTeamStanding$$serializer resultCupTeamStanding$$serializer = new ResultCupTeamStanding$$serializer();
        INSTANCE = resultCupTeamStanding$$serializer;
        bg7 bg7Var = new bg7("com.lingq.core.network.api.result.worldcup.ResultCupTeamStanding", resultCupTeamStanding$$serializer, 8);
        bg7Var.m3702k("team", true);
        bg7Var.m3702k("name", true);
        bg7Var.m3702k("total_coins", true);
        bg7Var.m3702k("coins", true);
        bg7Var.m3702k("participant_count", true);
        bg7Var.m3702k("rank", true);
        bg7Var.m3702k("prev_rank", true);
        bg7Var.m3702k("delta", true);
        descriptor = bg7Var;
    }

    private ResultCupTeamStanding$$serializer() {
    }

    @Override // p000.zk3
    public final KSerializer[] childSerializers() {
        l84 l84Var = l84.f49294a;
        KSerializer kSerializerM22059r = thb.m22059r(l84Var);
        KSerializer kSerializerM22059r2 = thb.m22059r(l84Var);
        KSerializer kSerializerM22059r3 = thb.m22059r(l84Var);
        sk9 sk9Var = sk9.f60959a;
        return new KSerializer[]{sk9Var, sk9Var, l84Var, dj2.f35711a, l84Var, kSerializerM22059r, kSerializerM22059r2, kSerializerM22059r3};
    }

    @Override // kotlinx.serialization.KSerializer
    public final ResultCupTeamStanding deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        df1 df1VarMo4079b = decoder.mo4079b(serialDescriptor);
        ResultCupTeamStanding resultCupTeamStanding = null;
        Integer num = null;
        String strMo4097x = null;
        String strMo4097x2 = null;
        Integer num2 = null;
        double dMo4072F = 0.0d;
        int i = 0;
        int iMo4091q = 0;
        int iMo4091q2 = 0;
        boolean z = true;
        Integer num3 = null;
        while (z) {
            int iMo10319A = df1VarMo4079b.mo10319A(serialDescriptor);
            switch (iMo10319A) {
                case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                    z = false;
                    continue;
                case 0:
                    strMo4097x = df1VarMo4079b.mo4097x(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    strMo4097x2 = df1VarMo4079b.mo4097x(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    iMo4091q = df1VarMo4079b.mo4091q(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    dMo4072F = df1VarMo4079b.mo4072F(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    iMo4091q2 = df1VarMo4079b.mo4091q(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    num2 = (Integer) df1VarMo4079b.mo4070D(serialDescriptor, 5, l84.f49294a, num2);
                    i |= 32;
                    break;
                case 6:
                    num3 = (Integer) df1VarMo4079b.mo4070D(serialDescriptor, 6, l84.f49294a, num3);
                    i |= 64;
                    break;
                case 7:
                    num = (Integer) df1VarMo4079b.mo4070D(serialDescriptor, 7, l84.f49294a, num);
                    i |= 128;
                    break;
                default:
                    uk9.m22771e(iMo10319A);
                    return resultCupTeamStanding;
            }
            resultCupTeamStanding = null;
        }
        df1VarMo4079b.mo4086j(serialDescriptor);
        return new ResultCupTeamStanding(i, strMo4097x, strMo4097x2, iMo4091q, dMo4072F, iMo4091q2, num2, num3, num);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, ResultCupTeamStanding resultCupTeamStanding) {
        encoder.getClass();
        resultCupTeamStanding.getClass();
        Integer num = resultCupTeamStanding.f21825h;
        Integer num2 = resultCupTeamStanding.f21824g;
        Integer num3 = resultCupTeamStanding.f21823f;
        int i = resultCupTeamStanding.f21822e;
        double d = resultCupTeamStanding.f21821d;
        int i2 = resultCupTeamStanding.f21820c;
        String str = resultCupTeamStanding.f21819b;
        String str2 = resultCupTeamStanding.f21818a;
        SerialDescriptor serialDescriptor = descriptor;
        mk9 mk9VarMo15606b = encoder.mo15606b(serialDescriptor);
        if (mk9VarMo15606b.m16872B(serialDescriptor) || !fa4.m11650l(str2, "")) {
            mk9VarMo15606b.m16882z(serialDescriptor, 0, str2);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || !fa4.m11650l(str, "")) {
            mk9VarMo15606b.m16882z(serialDescriptor, 1, str);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || i2 != 0) {
            mk9VarMo15606b.m16878v(2, i2, serialDescriptor);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || Double.compare(d, 0.0d) != 0) {
            mk9VarMo15606b.m16874r(serialDescriptor, 3, d);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || i != 0) {
            mk9VarMo15606b.m16878v(4, i, serialDescriptor);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || num3 != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 5, l84.f49294a, num3);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || num2 != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 6, l84.f49294a, num2);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || num != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 7, l84.f49294a, num);
        }
        mk9VarMo15606b.m16871A(serialDescriptor);
    }

    @Override // p000.zk3
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return te1.f62178b;
    }
}
