package com.lingq.core.analytics.embedded;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import p000.bg7;
import p000.cs4;
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
public final /* synthetic */ class EmbeddedMessageElements$$serializer implements zk3 {
    public static final EmbeddedMessageElements$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        EmbeddedMessageElements$$serializer embeddedMessageElements$$serializer = new EmbeddedMessageElements$$serializer();
        INSTANCE = embeddedMessageElements$$serializer;
        bg7 bg7Var = new bg7("com.lingq.core.analytics.embedded.EmbeddedMessageElements", embeddedMessageElements$$serializer, 8);
        bg7Var.m3702k("title", false);
        bg7Var.m3702k("body", false);
        bg7Var.m3702k("mediaUrl", false);
        bg7Var.m3702k("mediaUrlCaption", false);
        bg7Var.m3702k("defaultAction", false);
        bg7Var.m3702k("buttons", false);
        bg7Var.m3702k("text", false);
        bg7Var.m3702k("payload", true);
        descriptor = bg7Var;
    }

    private EmbeddedMessageElements$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.zk3
    public final KSerializer[] childSerializers() {
        cs4[] cs4VarArr = EmbeddedMessageElements.f14324i;
        sk9 sk9Var = sk9.f60959a;
        return new KSerializer[]{sk9Var, sk9Var, sk9Var, sk9Var, EmbeddedMessageAction$$serializer.INSTANCE, cs4VarArr[5].getValue(), cs4VarArr[6].getValue(), EmbeddedMessagePayload$$serializer.INSTANCE};
    }

    @Override // kotlinx.serialization.KSerializer
    public final EmbeddedMessageElements deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        df1 df1VarMo4079b = decoder.mo4079b(serialDescriptor);
        cs4[] cs4VarArr = EmbeddedMessageElements.f14324i;
        EmbeddedMessageElements embeddedMessageElements = null;
        boolean z = true;
        EmbeddedMessagePayload embeddedMessagePayload = null;
        String strMo4097x = null;
        String strMo4097x2 = null;
        String strMo4097x3 = null;
        String strMo4097x4 = null;
        EmbeddedMessageAction embeddedMessageAction = null;
        List list = null;
        List list2 = null;
        int i = 0;
        while (z) {
            int iMo10319A = df1VarMo4079b.mo10319A(serialDescriptor);
            switch (iMo10319A) {
                case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                    z = false;
                    continue;
                case 0:
                    strMo4097x = df1VarMo4079b.mo4097x(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    strMo4097x2 = df1VarMo4079b.mo4097x(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    strMo4097x3 = df1VarMo4079b.mo4097x(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    strMo4097x4 = df1VarMo4079b.mo4097x(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    embeddedMessageAction = (EmbeddedMessageAction) df1VarMo4079b.mo4073G(serialDescriptor, 4, EmbeddedMessageAction$$serializer.INSTANCE, embeddedMessageAction);
                    i |= 16;
                    break;
                case 5:
                    list = (List) df1VarMo4079b.mo4073G(serialDescriptor, 5, (KSerializer) cs4VarArr[5].getValue(), list);
                    i |= 32;
                    break;
                case 6:
                    list2 = (List) df1VarMo4079b.mo4073G(serialDescriptor, 6, (KSerializer) cs4VarArr[6].getValue(), list2);
                    i |= 64;
                    break;
                case 7:
                    embeddedMessagePayload = (EmbeddedMessagePayload) df1VarMo4079b.mo4073G(serialDescriptor, 7, EmbeddedMessagePayload$$serializer.INSTANCE, embeddedMessagePayload);
                    i |= 128;
                    break;
                default:
                    uk9.m22771e(iMo10319A);
                    return embeddedMessageElements;
            }
            embeddedMessageElements = null;
        }
        df1VarMo4079b.mo4086j(serialDescriptor);
        return new EmbeddedMessageElements(i, strMo4097x, strMo4097x2, strMo4097x3, strMo4097x4, embeddedMessageAction, list, list2, embeddedMessagePayload);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, EmbeddedMessageElements embeddedMessageElements) {
        encoder.getClass();
        embeddedMessageElements.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        mk9 mk9VarMo15606b = encoder.mo15606b(serialDescriptor);
        cs4[] cs4VarArr = EmbeddedMessageElements.f14324i;
        String str = embeddedMessageElements.f14325a;
        EmbeddedMessagePayload embeddedMessagePayload = embeddedMessageElements.f14332h;
        mk9VarMo15606b.m16882z(serialDescriptor, 0, str);
        mk9VarMo15606b.m16882z(serialDescriptor, 1, embeddedMessageElements.f14326b);
        mk9VarMo15606b.m16882z(serialDescriptor, 2, embeddedMessageElements.f14327c);
        mk9VarMo15606b.m16882z(serialDescriptor, 3, embeddedMessageElements.f14328d);
        mk9VarMo15606b.m16881y(serialDescriptor, 4, EmbeddedMessageAction$$serializer.INSTANCE, embeddedMessageElements.f14329e);
        mk9VarMo15606b.m16881y(serialDescriptor, 5, (KSerializer) cs4VarArr[5].getValue(), embeddedMessageElements.f14330f);
        mk9VarMo15606b.m16881y(serialDescriptor, 6, (KSerializer) cs4VarArr[6].getValue(), embeddedMessageElements.f14331g);
        if (mk9VarMo15606b.m16872B(serialDescriptor) || !fa4.m11650l(embeddedMessagePayload, new EmbeddedMessagePayload())) {
            mk9VarMo15606b.m16881y(serialDescriptor, 7, EmbeddedMessagePayload$$serializer.INSTANCE, embeddedMessagePayload);
        }
        mk9VarMo15606b.m16871A(serialDescriptor);
    }

    @Override // p000.zk3
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return te1.f62178b;
    }
}
