package com.lingq.core.analytics.embedded;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import p000.bg7;
import p000.df1;
import p000.mk9;
import p000.te1;
import p000.uk9;
import p000.zb2;
import p000.zk3;

/* JADX INFO: loaded from: classes2.dex */
@zb2
public final /* synthetic */ class EmbeddedMessage$$serializer implements zk3 {
    public static final EmbeddedMessage$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        EmbeddedMessage$$serializer embeddedMessage$$serializer = new EmbeddedMessage$$serializer();
        INSTANCE = embeddedMessage$$serializer;
        bg7 bg7Var = new bg7("com.lingq.core.analytics.embedded.EmbeddedMessage", embeddedMessage$$serializer, 2);
        bg7Var.m3702k("metadata", false);
        bg7Var.m3702k("elements", false);
        descriptor = bg7Var;
    }

    private EmbeddedMessage$$serializer() {
    }

    @Override // p000.zk3
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{EmbeddedMessageMetadata$$serializer.INSTANCE, EmbeddedMessageElements$$serializer.INSTANCE};
    }

    @Override // kotlinx.serialization.KSerializer
    public final EmbeddedMessage deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        df1 df1VarMo4079b = decoder.mo4079b(serialDescriptor);
        boolean z = true;
        int i = 0;
        EmbeddedMessageMetadata embeddedMessageMetadata = null;
        EmbeddedMessageElements embeddedMessageElements = null;
        while (z) {
            int iMo10319A = df1VarMo4079b.mo10319A(serialDescriptor);
            if (iMo10319A == -1) {
                z = false;
            } else if (iMo10319A == 0) {
                embeddedMessageMetadata = (EmbeddedMessageMetadata) df1VarMo4079b.mo4073G(serialDescriptor, 0, EmbeddedMessageMetadata$$serializer.INSTANCE, embeddedMessageMetadata);
                i |= 1;
            } else {
                if (iMo10319A != 1) {
                    uk9.m22771e(iMo10319A);
                    return null;
                }
                embeddedMessageElements = (EmbeddedMessageElements) df1VarMo4079b.mo4073G(serialDescriptor, 1, EmbeddedMessageElements$$serializer.INSTANCE, embeddedMessageElements);
                i |= 2;
            }
        }
        df1VarMo4079b.mo4086j(serialDescriptor);
        return new EmbeddedMessage(i, embeddedMessageMetadata, embeddedMessageElements);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, EmbeddedMessage embeddedMessage) {
        encoder.getClass();
        embeddedMessage.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        mk9 mk9VarMo15606b = encoder.mo15606b(serialDescriptor);
        mk9VarMo15606b.m16881y(serialDescriptor, 0, EmbeddedMessageMetadata$$serializer.INSTANCE, embeddedMessage.f14317a);
        mk9VarMo15606b.m16881y(serialDescriptor, 1, EmbeddedMessageElements$$serializer.INSTANCE, embeddedMessage.f14318b);
        mk9VarMo15606b.m16871A(serialDescriptor);
    }

    @Override // p000.zk3
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return te1.f62178b;
    }
}
