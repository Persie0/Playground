package com.lingq.core.network.api.result;

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

/* JADX INFO: loaded from: classes.dex */
@zb2
public final /* synthetic */ class ResultChatBotMessageInput$$serializer implements zk3 {
    public static final ResultChatBotMessageInput$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ResultChatBotMessageInput$$serializer resultChatBotMessageInput$$serializer = new ResultChatBotMessageInput$$serializer();
        INSTANCE = resultChatBotMessageInput$$serializer;
        bg7 bg7Var = new bg7("com.lingq.core.network.api.result.ResultChatBotMessageInput", resultChatBotMessageInput$$serializer, 1);
        bg7Var.m3702k("placeholder", true);
        descriptor = bg7Var;
    }

    private ResultChatBotMessageInput$$serializer() {
    }

    @Override // p000.zk3
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{sk9.f60959a};
    }

    @Override // kotlinx.serialization.KSerializer
    public final ResultChatBotMessageInput deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        df1 df1VarMo4079b = decoder.mo4079b(serialDescriptor);
        boolean z = true;
        int i = 0;
        String strMo4097x = null;
        while (z) {
            int iMo10319A = df1VarMo4079b.mo10319A(serialDescriptor);
            if (iMo10319A == -1) {
                z = false;
            } else {
                if (iMo10319A != 0) {
                    uk9.m22771e(iMo10319A);
                    return null;
                }
                strMo4097x = df1VarMo4079b.mo4097x(serialDescriptor, 0);
                i = 1;
            }
        }
        df1VarMo4079b.mo4086j(serialDescriptor);
        return new ResultChatBotMessageInput(i, strMo4097x);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, ResultChatBotMessageInput resultChatBotMessageInput) {
        encoder.getClass();
        resultChatBotMessageInput.getClass();
        String str = resultChatBotMessageInput.f20702a;
        SerialDescriptor serialDescriptor = descriptor;
        mk9 mk9VarMo15606b = encoder.mo15606b(serialDescriptor);
        if (mk9VarMo15606b.m16872B(serialDescriptor) || !fa4.m11650l(str, "")) {
            mk9VarMo15606b.m16882z(serialDescriptor, 0, str);
        }
        mk9VarMo15606b.m16871A(serialDescriptor);
    }

    @Override // p000.zk3
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return te1.f62178b;
    }
}
