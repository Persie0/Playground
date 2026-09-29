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

/* JADX INFO: loaded from: classes2.dex */
@zb2
public final /* synthetic */ class ResultChatMessageRating$$serializer implements zk3 {
    public static final ResultChatMessageRating$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ResultChatMessageRating$$serializer resultChatMessageRating$$serializer = new ResultChatMessageRating$$serializer();
        INSTANCE = resultChatMessageRating$$serializer;
        bg7 bg7Var = new bg7("com.lingq.core.network.api.result.ResultChatMessageRating", resultChatMessageRating$$serializer, 3);
        bg7Var.m3702k("value", false);
        bg7Var.m3702k("reason", true);
        bg7Var.m3702k("reason_text", true);
        descriptor = bg7Var;
    }

    private ResultChatMessageRating$$serializer() {
    }

    @Override // p000.zk3
    public final KSerializer[] childSerializers() {
        sk9 sk9Var = sk9.f60959a;
        return new KSerializer[]{sk9Var, sk9Var, sk9Var};
    }

    @Override // kotlinx.serialization.KSerializer
    public final ResultChatMessageRating deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        df1 df1VarMo4079b = decoder.mo4079b(serialDescriptor);
        boolean z = true;
        int i = 0;
        String strMo4097x = null;
        String strMo4097x2 = null;
        String strMo4097x3 = null;
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
                strMo4097x3 = df1VarMo4079b.mo4097x(serialDescriptor, 2);
                i |= 4;
            }
        }
        df1VarMo4079b.mo4086j(serialDescriptor);
        return new ResultChatMessageRating(strMo4097x, i, strMo4097x2, strMo4097x3);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, ResultChatMessageRating resultChatMessageRating) {
        encoder.getClass();
        resultChatMessageRating.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        mk9 mk9VarMo15606b = encoder.mo15606b(serialDescriptor);
        String str = resultChatMessageRating.f20733a;
        String str2 = resultChatMessageRating.f20735c;
        String str3 = resultChatMessageRating.f20734b;
        mk9VarMo15606b.m16882z(serialDescriptor, 0, str);
        if (mk9VarMo15606b.m16872B(serialDescriptor) || !fa4.m11650l(str3, "")) {
            mk9VarMo15606b.m16882z(serialDescriptor, 1, str3);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || !fa4.m11650l(str2, "")) {
            mk9VarMo15606b.m16882z(serialDescriptor, 2, str2);
        }
        mk9VarMo15606b.m16871A(serialDescriptor);
    }

    @Override // p000.zk3
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return te1.f62178b;
    }
}
