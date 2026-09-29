package com.lingq.core.network.api.result.worldcup;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import p000.bg7;
import p000.df1;
import p000.fa4;
import p000.mk9;
import p000.sk9;
import p000.te1;
import p000.thb;
import p000.uk9;
import p000.zb2;
import p000.zk3;

/* JADX INFO: loaded from: classes2.dex */
@zb2
public final /* synthetic */ class ResultCupBadge$$serializer implements zk3 {
    public static final ResultCupBadge$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ResultCupBadge$$serializer resultCupBadge$$serializer = new ResultCupBadge$$serializer();
        INSTANCE = resultCupBadge$$serializer;
        bg7 bg7Var = new bg7("com.lingq.core.network.api.result.worldcup.ResultCupBadge", resultCupBadge$$serializer, 2);
        bg7Var.m3702k("properties", true);
        bg7Var.m3702k("ctime", true);
        descriptor = bg7Var;
    }

    private ResultCupBadge$$serializer() {
    }

    @Override // p000.zk3
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{ResultCupBadgeProperties$$serializer.INSTANCE, thb.m22059r(sk9.f60959a)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final ResultCupBadge deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        df1 df1VarMo4079b = decoder.mo4079b(serialDescriptor);
        boolean z = true;
        int i = 0;
        ResultCupBadgeProperties resultCupBadgeProperties = null;
        String str = null;
        while (z) {
            int iMo10319A = df1VarMo4079b.mo10319A(serialDescriptor);
            if (iMo10319A == -1) {
                z = false;
            } else if (iMo10319A == 0) {
                resultCupBadgeProperties = (ResultCupBadgeProperties) df1VarMo4079b.mo4073G(serialDescriptor, 0, ResultCupBadgeProperties$$serializer.INSTANCE, resultCupBadgeProperties);
                i |= 1;
            } else {
                if (iMo10319A != 1) {
                    uk9.m22771e(iMo10319A);
                    return null;
                }
                str = (String) df1VarMo4079b.mo4070D(serialDescriptor, 1, sk9.f60959a, str);
                i |= 2;
            }
        }
        df1VarMo4079b.mo4086j(serialDescriptor);
        return new ResultCupBadge(i, resultCupBadgeProperties, str);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, ResultCupBadge resultCupBadge) {
        encoder.getClass();
        resultCupBadge.getClass();
        String str = resultCupBadge.f21748b;
        ResultCupBadgeProperties resultCupBadgeProperties = resultCupBadge.f21747a;
        SerialDescriptor serialDescriptor = descriptor;
        mk9 mk9VarMo15606b = encoder.mo15606b(serialDescriptor);
        if (mk9VarMo15606b.m16872B(serialDescriptor) || !fa4.m11650l(resultCupBadgeProperties, new ResultCupBadgeProperties())) {
            mk9VarMo15606b.m16881y(serialDescriptor, 0, ResultCupBadgeProperties$$serializer.INSTANCE, resultCupBadgeProperties);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || str != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 1, sk9.f60959a, str);
        }
        mk9VarMo15606b.m16871A(serialDescriptor);
    }

    @Override // p000.zk3
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return te1.f62178b;
    }
}
