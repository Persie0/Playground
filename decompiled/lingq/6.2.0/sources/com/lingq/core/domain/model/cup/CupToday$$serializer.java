package com.lingq.core.domain.model.cup;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import p000.bg7;
import p000.df1;
import p000.mk9;
import p000.sk9;
import p000.te1;
import p000.thb;
import p000.uk9;
import p000.zb2;
import p000.zk3;

/* JADX INFO: loaded from: classes.dex */
@zb2
public final /* synthetic */ class CupToday$$serializer implements zk3 {
    public static final CupToday$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        CupToday$$serializer cupToday$$serializer = new CupToday$$serializer();
        INSTANCE = cupToday$$serializer;
        bg7 bg7Var = new bg7("com.lingq.core.domain.model.cup.CupToday", cupToday$$serializer, 3);
        bg7Var.m3702k("date", false);
        bg7Var.m3702k("prize", false);
        bg7Var.m3702k("claim", false);
        descriptor = bg7Var;
    }

    private CupToday$$serializer() {
    }

    @Override // p000.zk3
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{sk9.f60959a, thb.m22059r(CupPrize$$serializer.INSTANCE), thb.m22059r(CupClaim$$serializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final CupToday deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        df1 df1VarMo4079b = decoder.mo4079b(serialDescriptor);
        boolean z = true;
        int i = 0;
        String strMo4097x = null;
        CupPrize cupPrize = null;
        CupClaim cupClaim = null;
        while (z) {
            int iMo10319A = df1VarMo4079b.mo10319A(serialDescriptor);
            if (iMo10319A == -1) {
                z = false;
            } else if (iMo10319A == 0) {
                strMo4097x = df1VarMo4079b.mo4097x(serialDescriptor, 0);
                i |= 1;
            } else if (iMo10319A == 1) {
                cupPrize = (CupPrize) df1VarMo4079b.mo4070D(serialDescriptor, 1, CupPrize$$serializer.INSTANCE, cupPrize);
                i |= 2;
            } else {
                if (iMo10319A != 2) {
                    uk9.m22771e(iMo10319A);
                    return null;
                }
                cupClaim = (CupClaim) df1VarMo4079b.mo4070D(serialDescriptor, 2, CupClaim$$serializer.INSTANCE, cupClaim);
                i |= 4;
            }
        }
        df1VarMo4079b.mo4086j(serialDescriptor);
        return new CupToday(i, strMo4097x, cupPrize, cupClaim);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, CupToday cupToday) {
        encoder.getClass();
        cupToday.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        mk9 mk9VarMo15606b = encoder.mo15606b(serialDescriptor);
        mk9VarMo15606b.m16882z(serialDescriptor, 0, cupToday.f18999a);
        mk9VarMo15606b.m16880x(serialDescriptor, 1, CupPrize$$serializer.INSTANCE, cupToday.f19000b);
        mk9VarMo15606b.m16880x(serialDescriptor, 2, CupClaim$$serializer.INSTANCE, cupToday.f19001c);
        mk9VarMo15606b.m16871A(serialDescriptor);
    }

    @Override // p000.zk3
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return te1.f62178b;
    }
}
