package com.lingq.core.domain.model.cup;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import p000.bg7;
import p000.df1;
import p000.dj2;
import p000.mk9;
import p000.sk9;
import p000.te1;
import p000.uk9;
import p000.zb2;
import p000.zk3;

/* JADX INFO: loaded from: classes.dex */
@zb2
public final /* synthetic */ class CupChampion$$serializer implements zk3 {
    public static final CupChampion$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        CupChampion$$serializer cupChampion$$serializer = new CupChampion$$serializer();
        INSTANCE = cupChampion$$serializer;
        bg7 bg7Var = new bg7("com.lingq.core.domain.model.cup.CupChampion", cupChampion$$serializer, 3);
        bg7Var.m3702k("teamCode", false);
        bg7Var.m3702k("name", false);
        bg7Var.m3702k("coins", false);
        descriptor = bg7Var;
    }

    private CupChampion$$serializer() {
    }

    @Override // p000.zk3
    public final KSerializer[] childSerializers() {
        sk9 sk9Var = sk9.f60959a;
        return new KSerializer[]{sk9Var, sk9Var, dj2.f35711a};
    }

    @Override // kotlinx.serialization.KSerializer
    public final CupChampion deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        df1 df1VarMo4079b = decoder.mo4079b(serialDescriptor);
        int i = 0;
        String strMo4097x = null;
        String strMo4097x2 = null;
        double dMo4072F = 0.0d;
        boolean z = true;
        while (z) {
            int iMo10319A = df1VarMo4079b.mo10319A(serialDescriptor);
            if (iMo10319A == -1) {
                z = false;
            } else if (iMo10319A == 0) {
                strMo4097x = df1VarMo4079b.mo4097x(serialDescriptor, 0);
                i |= 1;
            } else if (iMo10319A == 1) {
                strMo4097x2 = df1VarMo4079b.mo4097x(serialDescriptor, 1);
                i |= 2;
            } else {
                if (iMo10319A != 2) {
                    uk9.m22771e(iMo10319A);
                    return null;
                }
                dMo4072F = df1VarMo4079b.mo4072F(serialDescriptor, 2);
                i |= 4;
            }
        }
        df1VarMo4079b.mo4086j(serialDescriptor);
        return new CupChampion(dMo4072F, i, strMo4097x, strMo4097x2);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, CupChampion cupChampion) {
        encoder.getClass();
        cupChampion.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        mk9 mk9VarMo15606b = encoder.mo15606b(serialDescriptor);
        mk9VarMo15606b.m16882z(serialDescriptor, 0, cupChampion.f18970a);
        mk9VarMo15606b.m16882z(serialDescriptor, 1, cupChampion.f18971b);
        mk9VarMo15606b.m16874r(serialDescriptor, 2, cupChampion.f18972c);
        mk9VarMo15606b.m16871A(serialDescriptor);
    }

    @Override // p000.zk3
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return te1.f62178b;
    }
}
