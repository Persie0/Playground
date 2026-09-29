package com.lingq.core.analytics.embedded;

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
import p000.uk9;
import p000.zb2;
import p000.zk3;

/* JADX INFO: loaded from: classes2.dex */
@zb2
public final /* synthetic */ class EmbeddedMessagePayload$$serializer implements zk3 {
    public static final EmbeddedMessagePayload$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        EmbeddedMessagePayload$$serializer embeddedMessagePayload$$serializer = new EmbeddedMessagePayload$$serializer();
        INSTANCE = embeddedMessagePayload$$serializer;
        bg7 bg7Var = new bg7("com.lingq.core.analytics.embedded.EmbeddedMessagePayload", embeddedMessagePayload$$serializer, 4);
        bg7Var.m3702k("layout", true);
        bg7Var.m3702k("narrow_image", true);
        bg7Var.m3702k("wide_image", true);
        bg7Var.m3702k("text_color", true);
        descriptor = bg7Var;
    }

    private EmbeddedMessagePayload$$serializer() {
    }

    @Override // p000.zk3
    public final KSerializer[] childSerializers() {
        sk9 sk9Var = sk9.f60959a;
        return new KSerializer[]{sk9Var, sk9Var, sk9Var, sk9Var};
    }

    @Override // kotlinx.serialization.KSerializer
    public final EmbeddedMessagePayload deserialize(Decoder decoder) {
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
        return new EmbeddedMessagePayload(i, strMo4097x, strMo4097x2, strMo4097x3, strMo4097x4);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, EmbeddedMessagePayload embeddedMessagePayload) {
        encoder.getClass();
        embeddedMessagePayload.getClass();
        String str = embeddedMessagePayload.f14340d;
        String str2 = embeddedMessagePayload.f14339c;
        String str3 = embeddedMessagePayload.f14338b;
        String str4 = embeddedMessagePayload.f14337a;
        SerialDescriptor serialDescriptor = descriptor;
        mk9 mk9VarMo15606b = encoder.mo15606b(serialDescriptor);
        if (mk9VarMo15606b.m16872B(serialDescriptor) || !fa4.m11650l(str4, "")) {
            mk9VarMo15606b.m16882z(serialDescriptor, 0, str4);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || !fa4.m11650l(str3, "")) {
            mk9VarMo15606b.m16882z(serialDescriptor, 1, str3);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || !fa4.m11650l(str2, "")) {
            mk9VarMo15606b.m16882z(serialDescriptor, 2, str2);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || !fa4.m11650l(str, "")) {
            mk9VarMo15606b.m16882z(serialDescriptor, 3, str);
        }
        mk9VarMo15606b.m16871A(serialDescriptor);
    }

    @Override // p000.zk3
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return te1.f62178b;
    }
}
