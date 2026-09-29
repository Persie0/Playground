package com.lingq.core.network.api.result;

import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import p000.bg7;
import p000.cs4;
import p000.df1;
import p000.mk9;
import p000.sk9;
import p000.te1;
import p000.thb;
import p000.uk9;
import p000.zb2;
import p000.zk3;

/* JADX INFO: loaded from: classes2.dex */
@zb2
public final /* synthetic */ class ResultLessonSentencesTranslation$$serializer implements zk3 {
    public static final ResultLessonSentencesTranslation$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ResultLessonSentencesTranslation$$serializer resultLessonSentencesTranslation$$serializer = new ResultLessonSentencesTranslation$$serializer();
        INSTANCE = resultLessonSentencesTranslation$$serializer;
        bg7 bg7Var = new bg7("com.lingq.core.network.api.result.ResultLessonSentencesTranslation", resultLessonSentencesTranslation$$serializer, 2);
        bg7Var.m3702k("language", true);
        bg7Var.m3702k("sentences", true);
        descriptor = bg7Var;
    }

    private ResultLessonSentencesTranslation$$serializer() {
    }

    @Override // p000.zk3
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{thb.m22059r(sk9.f60959a), thb.m22059r((KSerializer) ResultLessonSentencesTranslation.f21108c[1].getValue())};
    }

    @Override // kotlinx.serialization.KSerializer
    public final ResultLessonSentencesTranslation deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        df1 df1VarMo4079b = decoder.mo4079b(serialDescriptor);
        cs4[] cs4VarArr = ResultLessonSentencesTranslation.f21108c;
        boolean z = true;
        int i = 0;
        String str = null;
        List list = null;
        while (z) {
            int iMo10319A = df1VarMo4079b.mo10319A(serialDescriptor);
            if (iMo10319A == -1) {
                z = false;
            } else if (iMo10319A == 0) {
                str = (String) df1VarMo4079b.mo4070D(serialDescriptor, 0, sk9.f60959a, str);
                i |= 1;
            } else {
                if (iMo10319A != 1) {
                    uk9.m22771e(iMo10319A);
                    return null;
                }
                list = (List) df1VarMo4079b.mo4070D(serialDescriptor, 1, (KSerializer) cs4VarArr[1].getValue(), list);
                i |= 2;
            }
        }
        df1VarMo4079b.mo4086j(serialDescriptor);
        return new ResultLessonSentencesTranslation(i, str, list);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, ResultLessonSentencesTranslation resultLessonSentencesTranslation) {
        encoder.getClass();
        resultLessonSentencesTranslation.getClass();
        List list = resultLessonSentencesTranslation.f21110b;
        String str = resultLessonSentencesTranslation.f21109a;
        SerialDescriptor serialDescriptor = descriptor;
        mk9 mk9VarMo15606b = encoder.mo15606b(serialDescriptor);
        cs4[] cs4VarArr = ResultLessonSentencesTranslation.f21108c;
        if (mk9VarMo15606b.m16872B(serialDescriptor) || str != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 0, sk9.f60959a, str);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || list != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 1, (KSerializer) cs4VarArr[1].getValue(), list);
        }
        mk9VarMo15606b.m16871A(serialDescriptor);
    }

    @Override // p000.zk3
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return te1.f62178b;
    }
}
