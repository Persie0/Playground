package com.lingq.core.domain.model.user;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import p000.bg7;
import p000.df1;
import p000.mk9;
import p000.sk9;
import p000.te1;
import p000.uk9;
import p000.zb2;
import p000.zk3;

/* JADX INFO: loaded from: classes.dex */
@zb2
public final /* synthetic */ class Invoice$$serializer implements zk3 {
    public static final Invoice$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        Invoice$$serializer invoice$$serializer = new Invoice$$serializer();
        INSTANCE = invoice$$serializer;
        bg7 bg7Var = new bg7("com.lingq.core.domain.model.user.Invoice", invoice$$serializer, 4);
        bg7Var.m3702k("amount", false);
        bg7Var.m3702k("currency", false);
        bg7Var.m3702k("reference", false);
        bg7Var.m3702k("date", false);
        descriptor = bg7Var;
    }

    private Invoice$$serializer() {
    }

    @Override // p000.zk3
    public final KSerializer[] childSerializers() {
        sk9 sk9Var = sk9.f60959a;
        return new KSerializer[]{sk9Var, sk9Var, sk9Var, sk9Var};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Invoice deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        df1 df1VarMo4079b = decoder.mo4079b(serialDescriptor);
        boolean z = true;
        int i = 0;
        String strMo4097x = null;
        String strMo4097x2 = null;
        String strMo4097x3 = null;
        String strMo4097x4 = null;
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
            } else if (iMo10319A == 2) {
                strMo4097x3 = df1VarMo4079b.mo4097x(serialDescriptor, 2);
                i |= 4;
            } else {
                if (iMo10319A != 3) {
                    uk9.m22771e(iMo10319A);
                    return null;
                }
                strMo4097x4 = df1VarMo4079b.mo4097x(serialDescriptor, 3);
                i |= 8;
            }
        }
        df1VarMo4079b.mo4086j(serialDescriptor);
        return new Invoice(i, strMo4097x, strMo4097x2, strMo4097x3, strMo4097x4);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Invoice invoice) {
        encoder.getClass();
        invoice.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        mk9 mk9VarMo15606b = encoder.mo15606b(serialDescriptor);
        mk9VarMo15606b.m16882z(serialDescriptor, 0, invoice.f19642a);
        mk9VarMo15606b.m16882z(serialDescriptor, 1, invoice.f19643b);
        mk9VarMo15606b.m16882z(serialDescriptor, 2, invoice.f19644c);
        mk9VarMo15606b.m16882z(serialDescriptor, 3, invoice.f19645d);
        mk9VarMo15606b.m16871A(serialDescriptor);
    }

    @Override // p000.zk3
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return te1.f62178b;
    }
}
