package com.lingq.core.network.api.result.worldcup;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import p000.bg7;
import p000.df1;
import p000.l84;
import p000.mk9;
import p000.sk9;
import p000.te1;
import p000.thb;
import p000.uk9;
import p000.zb2;
import p000.zk3;

/* JADX INFO: loaded from: classes.dex */
@zb2
public final /* synthetic */ class ResultCupPrize$$serializer implements zk3 {
    public static final ResultCupPrize$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ResultCupPrize$$serializer resultCupPrize$$serializer = new ResultCupPrize$$serializer();
        INSTANCE = resultCupPrize$$serializer;
        bg7 bg7Var = new bg7("com.lingq.core.network.api.result.worldcup.ResultCupPrize", resultCupPrize$$serializer, 6);
        bg7Var.m3702k("date", true);
        bg7Var.m3702k("kind", true);
        bg7Var.m3702k("source", true);
        bg7Var.m3702k("value", true);
        bg7Var.m3702k("label", true);
        bg7Var.m3702k("my_claim", true);
        descriptor = bg7Var;
    }

    private ResultCupPrize$$serializer() {
    }

    @Override // p000.zk3
    public final KSerializer[] childSerializers() {
        sk9 sk9Var = sk9.f60959a;
        return new KSerializer[]{thb.m22059r(sk9Var), sk9Var, sk9Var, l84.f49294a, sk9Var, thb.m22059r(ResultCupClaimState$$serializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final ResultCupPrize deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        df1 df1VarMo4079b = decoder.mo4079b(serialDescriptor);
        boolean z = true;
        int i = 0;
        int iMo4091q = 0;
        String str = null;
        String strMo4097x = null;
        String strMo4097x2 = null;
        String strMo4097x3 = null;
        ResultCupClaimState resultCupClaimState = null;
        while (z) {
            int iMo10319A = df1VarMo4079b.mo10319A(serialDescriptor);
            switch (iMo10319A) {
                case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                    z = false;
                    break;
                case 0:
                    str = (String) df1VarMo4079b.mo4070D(serialDescriptor, 0, sk9.f60959a, str);
                    i |= 1;
                    break;
                case 1:
                    strMo4097x = df1VarMo4079b.mo4097x(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    strMo4097x2 = df1VarMo4079b.mo4097x(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    iMo4091q = df1VarMo4079b.mo4091q(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    strMo4097x3 = df1VarMo4079b.mo4097x(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    resultCupClaimState = (ResultCupClaimState) df1VarMo4079b.mo4070D(serialDescriptor, 5, ResultCupClaimState$$serializer.INSTANCE, resultCupClaimState);
                    i |= 32;
                    break;
                default:
                    uk9.m22771e(iMo10319A);
                    return null;
            }
        }
        df1VarMo4079b.mo4086j(serialDescriptor);
        return new ResultCupPrize(i, str, strMo4097x, strMo4097x2, iMo4091q, strMo4097x3, resultCupClaimState);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, ResultCupPrize resultCupPrize) {
        encoder.getClass();
        resultCupPrize.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        mk9 mk9VarMo15606b = encoder.mo15606b(serialDescriptor);
        ResultCupPrize.m8429a(resultCupPrize, mk9VarMo15606b, serialDescriptor);
        mk9VarMo15606b.m16871A(serialDescriptor);
    }

    @Override // p000.zk3
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return te1.f62178b;
    }
}
