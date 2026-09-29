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
import p000.te1;
import p000.uk9;
import p000.zb2;
import p000.zk3;

/* JADX INFO: loaded from: classes2.dex */
@zb2
public final /* synthetic */ class ResultWords$$serializer implements zk3 {
    public static final ResultWords$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ResultWords$$serializer resultWords$$serializer = new ResultWords$$serializer();
        INSTANCE = resultWords$$serializer;
        bg7 bg7Var = new bg7("com.lingq.core.network.api.result.ResultWords", resultWords$$serializer, 1);
        bg7Var.m3702k("words", true);
        descriptor = bg7Var;
    }

    private ResultWords$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.zk3
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{ResultWords.f21734b[0].getValue()};
    }

    @Override // kotlinx.serialization.KSerializer
    public final ResultWords deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        df1 df1VarMo4079b = decoder.mo4079b(serialDescriptor);
        cs4[] cs4VarArr = ResultWords.f21734b;
        boolean z = true;
        int i = 0;
        List list = null;
        while (z) {
            int iMo10319A = df1VarMo4079b.mo10319A(serialDescriptor);
            if (iMo10319A == -1) {
                z = false;
            } else {
                if (iMo10319A != 0) {
                    uk9.m22771e(iMo10319A);
                    return null;
                }
                list = (List) df1VarMo4079b.mo4073G(serialDescriptor, 0, (KSerializer) cs4VarArr[0].getValue(), list);
                i = 1;
            }
        }
        df1VarMo4079b.mo4086j(serialDescriptor);
        return new ResultWords(i, list);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, ResultWords resultWords) {
        encoder.getClass();
        resultWords.getClass();
        List list = resultWords.f21735a;
        SerialDescriptor serialDescriptor = descriptor;
        mk9 mk9VarMo15606b = encoder.mo15606b(serialDescriptor);
        cs4[] cs4VarArr = ResultWords.f21734b;
        if (mk9VarMo15606b.m16872B(serialDescriptor) || !fa4.m11650l(list, EmptyList.f47638a)) {
            mk9VarMo15606b.m16881y(serialDescriptor, 0, (KSerializer) cs4VarArr[0].getValue(), list);
        }
        mk9VarMo15606b.m16871A(serialDescriptor);
    }

    @Override // p000.zk3
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return te1.f62178b;
    }
}
