package com.lingq.core.domain.model.user;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import p000.bg7;
import p000.df1;
import p000.lf0;
import p000.mk9;
import p000.sk9;
import p000.te1;
import p000.thb;
import p000.uk9;
import p000.zb2;
import p000.zk3;

/* JADX INFO: loaded from: classes.dex */
@zb2
public final /* synthetic */ class FreeTrialDetails$$serializer implements zk3 {
    public static final FreeTrialDetails$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        FreeTrialDetails$$serializer freeTrialDetails$$serializer = new FreeTrialDetails$$serializer();
        INSTANCE = freeTrialDetails$$serializer;
        bg7 bg7Var = new bg7("com.lingq.core.domain.model.user.FreeTrialDetails", freeTrialDetails$$serializer, 2);
        bg7Var.m3702k("endDate", true);
        bg7Var.m3702k("isActive", true);
        descriptor = bg7Var;
    }

    private FreeTrialDetails$$serializer() {
    }

    @Override // p000.zk3
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{thb.m22059r(sk9.f60959a), thb.m22059r(lf0.f49579a)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final FreeTrialDetails deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        df1 df1VarMo4079b = decoder.mo4079b(serialDescriptor);
        boolean z = true;
        int i = 0;
        String str = null;
        Boolean bool = null;
        while (z) {
            int iMo10319A = df1VarMo4079b.mo10319A(serialDescriptor);
            if (iMo10319A == -1) {
                z = false;
            } else if (iMo10319A == 0) {
                str = (String) df1VarMo4079b.mo4070D(serialDescriptor, 0, sk9.f60959a, str);
                i |= 1;
            } else {
                if (iMo10319A != 1) {
                    uk9.m22771e(iMo10319A);
                    return null;
                }
                bool = (Boolean) df1VarMo4079b.mo4070D(serialDescriptor, 1, lf0.f49579a, bool);
                i |= 2;
            }
        }
        df1VarMo4079b.mo4086j(serialDescriptor);
        return new FreeTrialDetails(i, str, bool);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, FreeTrialDetails freeTrialDetails) {
        encoder.getClass();
        freeTrialDetails.getClass();
        Boolean bool = freeTrialDetails.f19636b;
        String str = freeTrialDetails.f19635a;
        SerialDescriptor serialDescriptor = descriptor;
        mk9 mk9VarMo15606b = encoder.mo15606b(serialDescriptor);
        if (mk9VarMo15606b.m16872B(serialDescriptor) || str != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 0, sk9.f60959a, str);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || bool != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 1, lf0.f49579a, bool);
        }
        mk9VarMo15606b.m16871A(serialDescriptor);
    }

    @Override // p000.zk3
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return te1.f62178b;
    }
}
