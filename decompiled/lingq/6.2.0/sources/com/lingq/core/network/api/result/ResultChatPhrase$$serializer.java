package com.lingq.core.network.api.result;

import java.util.List;
import kotlin.collections.EmptyList;
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
import p000.thb;
import p000.uk9;
import p000.zb2;
import p000.zk3;

/* JADX INFO: loaded from: classes2.dex */
@zb2
public final /* synthetic */ class ResultChatPhrase$$serializer implements zk3 {
    public static final ResultChatPhrase$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ResultChatPhrase$$serializer resultChatPhrase$$serializer = new ResultChatPhrase$$serializer();
        INSTANCE = resultChatPhrase$$serializer;
        bg7 bg7Var = new bg7("com.lingq.core.network.api.result.ResultChatPhrase", resultChatPhrase$$serializer, 5);
        bg7Var.m3702k("phrase", true);
        bg7Var.m3702k("fragment", true);
        bg7Var.m3702k("translation", true);
        bg7Var.m3702k("hints", true);
        bg7Var.m3702k("card", true);
        descriptor = bg7Var;
    }

    private ResultChatPhrase$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.zk3
    public final KSerializer[] childSerializers() {
        cs4[] cs4VarArr = ResultChatPhrase.f20742f;
        sk9 sk9Var = sk9.f60959a;
        return new KSerializer[]{sk9Var, thb.m22059r(sk9Var), sk9Var, cs4VarArr[3].getValue(), thb.m22059r(ResultChatPhraseCard$$serializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final ResultChatPhrase deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        df1 df1VarMo4079b = decoder.mo4079b(serialDescriptor);
        cs4[] cs4VarArr = ResultChatPhrase.f20742f;
        boolean z = true;
        int i = 0;
        String strMo4097x = null;
        String str = null;
        String strMo4097x2 = null;
        List list = null;
        ResultChatPhraseCard resultChatPhraseCard = null;
        while (z) {
            int iMo10319A = df1VarMo4079b.mo10319A(serialDescriptor);
            if (iMo10319A == -1) {
                z = false;
            } else if (iMo10319A == 0) {
                strMo4097x = df1VarMo4079b.mo4097x(serialDescriptor, 0);
                i |= 1;
            } else if (iMo10319A == 1) {
                str = (String) df1VarMo4079b.mo4070D(serialDescriptor, 1, sk9.f60959a, str);
                i |= 2;
            } else if (iMo10319A == 2) {
                strMo4097x2 = df1VarMo4079b.mo4097x(serialDescriptor, 2);
                i |= 4;
            } else if (iMo10319A == 3) {
                list = (List) df1VarMo4079b.mo4073G(serialDescriptor, 3, (KSerializer) cs4VarArr[3].getValue(), list);
                i |= 8;
            } else {
                if (iMo10319A != 4) {
                    uk9.m22771e(iMo10319A);
                    return null;
                }
                resultChatPhraseCard = (ResultChatPhraseCard) df1VarMo4079b.mo4070D(serialDescriptor, 4, ResultChatPhraseCard$$serializer.INSTANCE, resultChatPhraseCard);
                i |= 16;
            }
        }
        df1VarMo4079b.mo4086j(serialDescriptor);
        return new ResultChatPhrase(i, strMo4097x, str, strMo4097x2, list, resultChatPhraseCard);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, ResultChatPhrase resultChatPhrase) {
        encoder.getClass();
        resultChatPhrase.getClass();
        ResultChatPhraseCard resultChatPhraseCard = resultChatPhrase.f20747e;
        List list = resultChatPhrase.f20746d;
        String str = resultChatPhrase.f20745c;
        String str2 = resultChatPhrase.f20744b;
        String str3 = resultChatPhrase.f20743a;
        SerialDescriptor serialDescriptor = descriptor;
        mk9 mk9VarMo15606b = encoder.mo15606b(serialDescriptor);
        cs4[] cs4VarArr = ResultChatPhrase.f20742f;
        if (mk9VarMo15606b.m16872B(serialDescriptor) || !fa4.m11650l(str3, "")) {
            mk9VarMo15606b.m16882z(serialDescriptor, 0, str3);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || str2 != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 1, sk9.f60959a, str2);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || !fa4.m11650l(str, "")) {
            mk9VarMo15606b.m16882z(serialDescriptor, 2, str);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || !fa4.m11650l(list, EmptyList.f47638a)) {
            mk9VarMo15606b.m16881y(serialDescriptor, 3, (KSerializer) cs4VarArr[3].getValue(), list);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || resultChatPhraseCard != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 4, ResultChatPhraseCard$$serializer.INSTANCE, resultChatPhraseCard);
        }
        mk9VarMo15606b.m16871A(serialDescriptor);
    }

    @Override // p000.zk3
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return te1.f62178b;
    }
}
