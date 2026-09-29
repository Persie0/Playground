package com.lingq.core.analytics.embedded;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import p000.bg7;
import p000.df1;
import p000.l84;
import p000.lf0;
import p000.mk9;
import p000.rk5;
import p000.sk9;
import p000.te1;
import p000.uk9;
import p000.zb2;
import p000.zk3;

/* JADX INFO: loaded from: classes2.dex */
@zb2
public final /* synthetic */ class EmbeddedMessageMetadata$$serializer implements zk3 {
    public static final EmbeddedMessageMetadata$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        EmbeddedMessageMetadata$$serializer embeddedMessageMetadata$$serializer = new EmbeddedMessageMetadata$$serializer();
        INSTANCE = embeddedMessageMetadata$$serializer;
        bg7 bg7Var = new bg7("com.lingq.core.analytics.embedded.EmbeddedMessageMetadata", embeddedMessageMetadata$$serializer, 4);
        bg7Var.m3702k("messageId", false);
        bg7Var.m3702k("placementId", false);
        bg7Var.m3702k("campaignId", false);
        bg7Var.m3702k("isProof", false);
        descriptor = bg7Var;
    }

    private EmbeddedMessageMetadata$$serializer() {
    }

    @Override // p000.zk3
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{sk9.f60959a, rk5.f59434a, l84.f49294a, lf0.f49579a};
    }

    @Override // kotlinx.serialization.KSerializer
    public final EmbeddedMessageMetadata deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        df1 df1VarMo4079b = decoder.mo4079b(serialDescriptor);
        int i = 0;
        int iMo4091q = 0;
        boolean zMo4094v = false;
        String strMo4097x = null;
        long jMo4085i = 0;
        boolean z = true;
        while (z) {
            int iMo10319A = df1VarMo4079b.mo10319A(serialDescriptor);
            if (iMo10319A == -1) {
                z = false;
            } else if (iMo10319A == 0) {
                strMo4097x = df1VarMo4079b.mo4097x(serialDescriptor, 0);
                i |= 1;
            } else if (iMo10319A == 1) {
                jMo4085i = df1VarMo4079b.mo4085i(serialDescriptor, 1);
                i |= 2;
            } else if (iMo10319A == 2) {
                iMo4091q = df1VarMo4079b.mo4091q(serialDescriptor, 2);
                i |= 4;
            } else {
                if (iMo10319A != 3) {
                    uk9.m22771e(iMo10319A);
                    return null;
                }
                zMo4094v = df1VarMo4079b.mo4094v(serialDescriptor, 3);
                i |= 8;
            }
        }
        df1VarMo4079b.mo4086j(serialDescriptor);
        return new EmbeddedMessageMetadata(i, iMo4091q, jMo4085i, strMo4097x, zMo4094v);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, EmbeddedMessageMetadata embeddedMessageMetadata) {
        encoder.getClass();
        embeddedMessageMetadata.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        mk9 mk9VarMo15606b = encoder.mo15606b(serialDescriptor);
        mk9VarMo15606b.m16882z(serialDescriptor, 0, embeddedMessageMetadata.f14333a);
        mk9VarMo15606b.m16879w(serialDescriptor, 1, embeddedMessageMetadata.f14334b);
        mk9VarMo15606b.m16878v(2, embeddedMessageMetadata.f14335c, serialDescriptor);
        mk9VarMo15606b.m16873q(serialDescriptor, 3, embeddedMessageMetadata.f14336d);
        mk9VarMo15606b.m16871A(serialDescriptor);
    }

    @Override // p000.zk3
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return te1.f62178b;
    }
}
