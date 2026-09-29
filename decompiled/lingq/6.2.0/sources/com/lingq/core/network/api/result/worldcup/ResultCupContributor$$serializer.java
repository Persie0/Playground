package com.lingq.core.network.api.result.worldcup;

import com.android.installreferrer.api.InstallReferrerClient;
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
import p000.thb;
import p000.uk9;
import p000.zb2;
import p000.zk3;

/* JADX INFO: loaded from: classes2.dex */
@zb2
public final /* synthetic */ class ResultCupContributor$$serializer implements zk3 {
    public static final ResultCupContributor$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ResultCupContributor$$serializer resultCupContributor$$serializer = new ResultCupContributor$$serializer();
        INSTANCE = resultCupContributor$$serializer;
        bg7 bg7Var = new bg7("com.lingq.core.network.api.result.worldcup.ResultCupContributor", resultCupContributor$$serializer, 6);
        bg7Var.m3702k("rank", true);
        bg7Var.m3702k("prev_rank", true);
        bg7Var.m3702k("delta", true);
        bg7Var.m3702k("profile", true);
        bg7Var.m3702k("team", true);
        bg7Var.m3702k("score", true);
        descriptor = bg7Var;
    }

    private ResultCupContributor$$serializer() {
    }

    @Override // p000.zk3
    public final KSerializer[] childSerializers() {
        l84 l84Var = l84.f49294a;
        return new KSerializer[]{l84Var, thb.m22059r(l84Var), thb.m22059r(l84Var), ResultCupContributorProfile$$serializer.INSTANCE, sk9.f60959a, l84Var};
    }

    @Override // kotlinx.serialization.KSerializer
    public final ResultCupContributor deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        df1 df1VarMo4079b = decoder.mo4079b(serialDescriptor);
        boolean z = true;
        int i = 0;
        int iMo4091q = 0;
        int iMo4091q2 = 0;
        Integer num = null;
        Integer num2 = null;
        ResultCupContributorProfile resultCupContributorProfile = null;
        String strMo4097x = null;
        while (z) {
            int iMo10319A = df1VarMo4079b.mo10319A(serialDescriptor);
            switch (iMo10319A) {
                case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                    z = false;
                    break;
                case 0:
                    iMo4091q = df1VarMo4079b.mo4091q(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    num = (Integer) df1VarMo4079b.mo4070D(serialDescriptor, 1, l84.f49294a, num);
                    i |= 2;
                    break;
                case 2:
                    num2 = (Integer) df1VarMo4079b.mo4070D(serialDescriptor, 2, l84.f49294a, num2);
                    i |= 4;
                    break;
                case 3:
                    resultCupContributorProfile = (ResultCupContributorProfile) df1VarMo4079b.mo4073G(serialDescriptor, 3, ResultCupContributorProfile$$serializer.INSTANCE, resultCupContributorProfile);
                    i |= 8;
                    break;
                case 4:
                    strMo4097x = df1VarMo4079b.mo4097x(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    iMo4091q2 = df1VarMo4079b.mo4091q(serialDescriptor, 5);
                    i |= 32;
                    break;
                default:
                    uk9.m22771e(iMo10319A);
                    return null;
            }
        }
        df1VarMo4079b.mo4086j(serialDescriptor);
        return new ResultCupContributor(i, iMo4091q, num, num2, resultCupContributorProfile, strMo4097x, iMo4091q2);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, ResultCupContributor resultCupContributor) {
        encoder.getClass();
        resultCupContributor.getClass();
        int i = resultCupContributor.f21765f;
        String str = resultCupContributor.f21764e;
        ResultCupContributorProfile resultCupContributorProfile = resultCupContributor.f21763d;
        Integer num = resultCupContributor.f21762c;
        Integer num2 = resultCupContributor.f21761b;
        int i2 = resultCupContributor.f21760a;
        SerialDescriptor serialDescriptor = descriptor;
        mk9 mk9VarMo15606b = encoder.mo15606b(serialDescriptor);
        if (mk9VarMo15606b.m16872B(serialDescriptor) || i2 != 0) {
            mk9VarMo15606b.m16878v(0, i2, serialDescriptor);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || num2 != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 1, l84.f49294a, num2);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || num != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 2, l84.f49294a, num);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || !fa4.m11650l(resultCupContributorProfile, new ResultCupContributorProfile())) {
            mk9VarMo15606b.m16881y(serialDescriptor, 3, ResultCupContributorProfile$$serializer.INSTANCE, resultCupContributorProfile);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || !fa4.m11650l(str, "")) {
            mk9VarMo15606b.m16882z(serialDescriptor, 4, str);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || i != 0) {
            mk9VarMo15606b.m16878v(5, i, serialDescriptor);
        }
        mk9VarMo15606b.m16871A(serialDescriptor);
    }

    @Override // p000.zk3
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return te1.f62178b;
    }
}
