package com.lingq.core.domain.model.user;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import p000.bg7;
import p000.df1;
import p000.l84;
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
public final /* synthetic */ class AccountTier$$serializer implements zk3 {
    public static final AccountTier$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        AccountTier$$serializer accountTier$$serializer = new AccountTier$$serializer();
        INSTANCE = accountTier$$serializer;
        bg7 bg7Var = new bg7("com.lingq.core.domain.model.user.AccountTier", accountTier$$serializer, 3);
        bg7Var.m3702k("id", false);
        bg7Var.m3702k("title", false);
        bg7Var.m3702k("lifetimePremium", true);
        descriptor = bg7Var;
    }

    private AccountTier$$serializer() {
    }

    @Override // p000.zk3
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{l84.f49294a, sk9.f60959a, thb.m22059r(lf0.f49579a)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final AccountTier deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        df1 df1VarMo4079b = decoder.mo4079b(serialDescriptor);
        boolean z = true;
        int i = 0;
        int iMo4091q = 0;
        String strMo4097x = null;
        Boolean bool = null;
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
            } else {
                if (iMo10319A != 2) {
                    uk9.m22771e(iMo10319A);
                    return null;
                }
                bool = (Boolean) df1VarMo4079b.mo4070D(serialDescriptor, 2, lf0.f49579a, bool);
                i |= 4;
            }
        }
        df1VarMo4079b.mo4086j(serialDescriptor);
        return new AccountTier(i, iMo4091q, strMo4097x, bool);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, AccountTier accountTier) {
        encoder.getClass();
        accountTier.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        mk9 mk9VarMo15606b = encoder.mo15606b(serialDescriptor);
        int i = accountTier.f19627a;
        Boolean bool = accountTier.f19629c;
        mk9VarMo15606b.m16878v(0, i, serialDescriptor);
        mk9VarMo15606b.m16882z(serialDescriptor, 1, accountTier.f19628b);
        if (mk9VarMo15606b.m16872B(serialDescriptor) || bool != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 2, lf0.f49579a, bool);
        }
        mk9VarMo15606b.m16871A(serialDescriptor);
    }

    @Override // p000.zk3
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return te1.f62178b;
    }
}
