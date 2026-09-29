package com.lingq.core.domain.model.cup;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import p000.bg7;
import p000.cs4;
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
public final /* synthetic */ class CupPrize$$serializer implements zk3 {
    public static final CupPrize$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        CupPrize$$serializer cupPrize$$serializer = new CupPrize$$serializer();
        INSTANCE = cupPrize$$serializer;
        bg7 bg7Var = new bg7("com.lingq.core.domain.model.cup.CupPrize", cupPrize$$serializer, 6);
        bg7Var.m3702k("date", false);
        bg7Var.m3702k("kind", false);
        bg7Var.m3702k("source", false);
        bg7Var.m3702k("value", false);
        bg7Var.m3702k("label", false);
        bg7Var.m3702k("claim", false);
        descriptor = bg7Var;
    }

    private CupPrize$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.zk3
    public final KSerializer[] childSerializers() {
        cs4[] cs4VarArr = CupPrize.f18986g;
        sk9 sk9Var = sk9.f60959a;
        return new KSerializer[]{thb.m22059r(sk9Var), cs4VarArr[1].getValue(), cs4VarArr[2].getValue(), l84.f49294a, sk9Var, thb.m22059r(CupClaim$$serializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final CupPrize deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        df1 df1VarMo4079b = decoder.mo4079b(serialDescriptor);
        cs4[] cs4VarArr = CupPrize.f18986g;
        boolean z = true;
        int i = 0;
        int iMo4091q = 0;
        String str = null;
        CupPrizeKind cupPrizeKind = null;
        CupPrizeSource cupPrizeSource = null;
        String strMo4097x = null;
        CupClaim cupClaim = null;
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
                    cupPrizeKind = (CupPrizeKind) df1VarMo4079b.mo4073G(serialDescriptor, 1, (KSerializer) cs4VarArr[1].getValue(), cupPrizeKind);
                    i |= 2;
                    break;
                case 2:
                    cupPrizeSource = (CupPrizeSource) df1VarMo4079b.mo4073G(serialDescriptor, 2, (KSerializer) cs4VarArr[2].getValue(), cupPrizeSource);
                    i |= 4;
                    break;
                case 3:
                    iMo4091q = df1VarMo4079b.mo4091q(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    strMo4097x = df1VarMo4079b.mo4097x(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    cupClaim = (CupClaim) df1VarMo4079b.mo4070D(serialDescriptor, 5, CupClaim$$serializer.INSTANCE, cupClaim);
                    i |= 32;
                    break;
                default:
                    uk9.m22771e(iMo10319A);
                    return null;
            }
        }
        df1VarMo4079b.mo4086j(serialDescriptor);
        return new CupPrize(i, str, cupPrizeKind, cupPrizeSource, iMo4091q, strMo4097x, cupClaim);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, CupPrize cupPrize) {
        encoder.getClass();
        cupPrize.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        mk9 mk9VarMo15606b = encoder.mo15606b(serialDescriptor);
        CupPrize.m8018b(cupPrize, mk9VarMo15606b, serialDescriptor);
        mk9VarMo15606b.m16871A(serialDescriptor);
    }

    @Override // p000.zk3
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return te1.f62178b;
    }
}
