package com.lingq.core.domain.model.user;

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
public final /* synthetic */ class Tier$$serializer implements zk3 {
    public static final Tier$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        Tier$$serializer tier$$serializer = new Tier$$serializer();
        INSTANCE = tier$$serializer;
        bg7 bg7Var = new bg7("com.lingq.core.domain.model.user.Tier", tier$$serializer, 3);
        bg7Var.m3702k("plan_code", true);
        bg7Var.m3702k("title", false);
        bg7Var.m3702k("level", false);
        descriptor = bg7Var;
    }

    private Tier$$serializer() {
    }

    @Override // p000.zk3
    public final KSerializer[] childSerializers() {
        sk9 sk9Var = sk9.f60959a;
        return new KSerializer[]{thb.m22059r(sk9Var), sk9Var, l84.f49294a};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Tier deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        df1 df1VarMo4079b = decoder.mo4079b(serialDescriptor);
        boolean z = true;
        int i = 0;
        int iMo4091q = 0;
        String str = null;
        String strMo4097x = null;
        while (z) {
            int iMo10319A = df1VarMo4079b.mo10319A(serialDescriptor);
            if (iMo10319A == -1) {
                z = false;
            } else if (iMo10319A == 0) {
                str = (String) df1VarMo4079b.mo4070D(serialDescriptor, 0, sk9.f60959a, str);
                i |= 1;
            } else if (iMo10319A == 1) {
                strMo4097x = df1VarMo4079b.mo4097x(serialDescriptor, 1);
                i |= 2;
            } else {
                if (iMo10319A != 2) {
                    uk9.m22771e(iMo10319A);
                    return null;
                }
                iMo4091q = df1VarMo4079b.mo4091q(serialDescriptor, 2);
                i |= 4;
            }
        }
        df1VarMo4079b.mo4086j(serialDescriptor);
        return new Tier(str, i, iMo4091q, strMo4097x);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Tier tier) {
        encoder.getClass();
        tier.getClass();
        String str = tier.f19855a;
        SerialDescriptor serialDescriptor = descriptor;
        mk9 mk9VarMo15606b = encoder.mo15606b(serialDescriptor);
        if (mk9VarMo15606b.m16872B(serialDescriptor) || str != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 0, sk9.f60959a, str);
        }
        mk9VarMo15606b.m16882z(serialDescriptor, 1, tier.f19856b);
        mk9VarMo15606b.m16878v(2, tier.f19857c, serialDescriptor);
        mk9VarMo15606b.m16871A(serialDescriptor);
    }

    @Override // p000.zk3
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return te1.f62178b;
    }
}
