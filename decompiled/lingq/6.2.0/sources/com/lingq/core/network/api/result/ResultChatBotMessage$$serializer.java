package com.lingq.core.network.api.result;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import p000.bg7;
import p000.df1;
import p000.fa4;
import p000.mk9;
import p000.te1;
import p000.uk9;
import p000.zb2;
import p000.zk3;

/* JADX INFO: loaded from: classes.dex */
@zb2
public final /* synthetic */ class ResultChatBotMessage$$serializer implements zk3 {
    public static final ResultChatBotMessage$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ResultChatBotMessage$$serializer resultChatBotMessage$$serializer = new ResultChatBotMessage$$serializer();
        INSTANCE = resultChatBotMessage$$serializer;
        bg7 bg7Var = new bg7("com.lingq.core.network.api.result.ResultChatBotMessage", resultChatBotMessage$$serializer, 3);
        bg7Var.m3702k("translation", true);
        bg7Var.m3702k("suggestedTerms", true);
        bg7Var.m3702k("correction", true);
        descriptor = bg7Var;
    }

    private ResultChatBotMessage$$serializer() {
    }

    @Override // p000.zk3
    public final KSerializer[] childSerializers() {
        ResultChatBotLabel$$serializer resultChatBotLabel$$serializer = ResultChatBotLabel$$serializer.INSTANCE;
        return new KSerializer[]{resultChatBotLabel$$serializer, resultChatBotLabel$$serializer, resultChatBotLabel$$serializer};
    }

    @Override // kotlinx.serialization.KSerializer
    public final ResultChatBotMessage deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        df1 df1VarMo4079b = decoder.mo4079b(serialDescriptor);
        boolean z = true;
        int i = 0;
        ResultChatBotLabel resultChatBotLabel = null;
        ResultChatBotLabel resultChatBotLabel2 = null;
        ResultChatBotLabel resultChatBotLabel3 = null;
        while (z) {
            int iMo10319A = df1VarMo4079b.mo10319A(serialDescriptor);
            if (iMo10319A == -1) {
                z = false;
            } else if (iMo10319A == 0) {
                resultChatBotLabel = (ResultChatBotLabel) df1VarMo4079b.mo4073G(serialDescriptor, 0, ResultChatBotLabel$$serializer.INSTANCE, resultChatBotLabel);
                i |= 1;
            } else if (iMo10319A == 1) {
                resultChatBotLabel2 = (ResultChatBotLabel) df1VarMo4079b.mo4073G(serialDescriptor, 1, ResultChatBotLabel$$serializer.INSTANCE, resultChatBotLabel2);
                i |= 2;
            } else {
                if (iMo10319A != 2) {
                    uk9.m22771e(iMo10319A);
                    return null;
                }
                resultChatBotLabel3 = (ResultChatBotLabel) df1VarMo4079b.mo4073G(serialDescriptor, 2, ResultChatBotLabel$$serializer.INSTANCE, resultChatBotLabel3);
                i |= 4;
            }
        }
        df1VarMo4079b.mo4086j(serialDescriptor);
        return new ResultChatBotMessage(i, resultChatBotLabel, resultChatBotLabel2, resultChatBotLabel3);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, ResultChatBotMessage resultChatBotMessage) {
        encoder.getClass();
        resultChatBotMessage.getClass();
        ResultChatBotLabel resultChatBotLabel = resultChatBotMessage.f20701c;
        ResultChatBotLabel resultChatBotLabel2 = resultChatBotMessage.f20700b;
        ResultChatBotLabel resultChatBotLabel3 = resultChatBotMessage.f20699a;
        SerialDescriptor serialDescriptor = descriptor;
        mk9 mk9VarMo15606b = encoder.mo15606b(serialDescriptor);
        if (mk9VarMo15606b.m16872B(serialDescriptor) || !fa4.m11650l(resultChatBotLabel3, new ResultChatBotLabel())) {
            mk9VarMo15606b.m16881y(serialDescriptor, 0, ResultChatBotLabel$$serializer.INSTANCE, resultChatBotLabel3);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || !fa4.m11650l(resultChatBotLabel2, new ResultChatBotLabel())) {
            mk9VarMo15606b.m16881y(serialDescriptor, 1, ResultChatBotLabel$$serializer.INSTANCE, resultChatBotLabel2);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || !fa4.m11650l(resultChatBotLabel, new ResultChatBotLabel())) {
            mk9VarMo15606b.m16881y(serialDescriptor, 2, ResultChatBotLabel$$serializer.INSTANCE, resultChatBotLabel);
        }
        mk9VarMo15606b.m16871A(serialDescriptor);
    }

    @Override // p000.zk3
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return te1.f62178b;
    }
}
