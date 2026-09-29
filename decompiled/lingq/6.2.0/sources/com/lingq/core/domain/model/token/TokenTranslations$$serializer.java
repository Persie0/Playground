package com.lingq.core.domain.model.token;

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
import p000.uk9;
import p000.zb2;
import p000.zk3;

/* JADX INFO: loaded from: classes2.dex */
@zb2
public final /* synthetic */ class TokenTranslations$$serializer implements zk3 {
    public static final TokenTranslations$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        TokenTranslations$$serializer tokenTranslations$$serializer = new TokenTranslations$$serializer();
        INSTANCE = tokenTranslations$$serializer;
        bg7 bg7Var = new bg7("com.lingq.core.domain.model.token.TokenTranslations", tokenTranslations$$serializer, 2);
        bg7Var.m3702k("termWithLanguageAndTarget", false);
        bg7Var.m3702k("translations", true);
        descriptor = bg7Var;
    }

    private TokenTranslations$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.zk3
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{sk9.f60959a, TokenTranslations.f19616c[1].getValue()};
    }

    @Override // kotlinx.serialization.KSerializer
    public final TokenTranslations deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        df1 df1VarMo4079b = decoder.mo4079b(serialDescriptor);
        cs4[] cs4VarArr = TokenTranslations.f19616c;
        boolean z = true;
        int i = 0;
        String strMo4097x = null;
        List list = null;
        while (z) {
            int iMo10319A = df1VarMo4079b.mo10319A(serialDescriptor);
            if (iMo10319A == -1) {
                z = false;
            } else if (iMo10319A == 0) {
                strMo4097x = df1VarMo4079b.mo4097x(serialDescriptor, 0);
                i |= 1;
            } else {
                if (iMo10319A != 1) {
                    uk9.m22771e(iMo10319A);
                    return null;
                }
                list = (List) df1VarMo4079b.mo4073G(serialDescriptor, 1, (KSerializer) cs4VarArr[1].getValue(), list);
                i |= 2;
            }
        }
        df1VarMo4079b.mo4086j(serialDescriptor);
        return new TokenTranslations(i, strMo4097x, list);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, TokenTranslations tokenTranslations) {
        encoder.getClass();
        tokenTranslations.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        mk9 mk9VarMo15606b = encoder.mo15606b(serialDescriptor);
        cs4[] cs4VarArr = TokenTranslations.f19616c;
        String str = tokenTranslations.f19617a;
        List list = tokenTranslations.f19618b;
        mk9VarMo15606b.m16882z(serialDescriptor, 0, str);
        if (mk9VarMo15606b.m16872B(serialDescriptor) || !fa4.m11650l(list, EmptyList.f47638a)) {
            mk9VarMo15606b.m16881y(serialDescriptor, 1, (KSerializer) cs4VarArr[1].getValue(), list);
        }
        mk9VarMo15606b.m16871A(serialDescriptor);
    }

    @Override // p000.zk3
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return te1.f62178b;
    }
}
