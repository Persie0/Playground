package com.lingq.core.domain.model.language;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import p000.bg7;
import p000.df1;
import p000.dj2;
import p000.mk9;
import p000.te1;
import p000.uk9;
import p000.zb2;
import p000.zk3;

/* JADX INFO: loaded from: classes2.dex */
@zb2
public final /* synthetic */ class LanguageStatValue$$serializer implements zk3 {
    public static final LanguageStatValue$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        LanguageStatValue$$serializer languageStatValue$$serializer = new LanguageStatValue$$serializer();
        INSTANCE = languageStatValue$$serializer;
        bg7 bg7Var = new bg7("com.lingq.core.domain.model.language.LanguageStatValue", languageStatValue$$serializer, 2);
        bg7Var.m3702k("overall", false);
        bg7Var.m3702k("change", false);
        descriptor = bg7Var;
    }

    private LanguageStatValue$$serializer() {
    }

    @Override // p000.zk3
    public final KSerializer[] childSerializers() {
        dj2 dj2Var = dj2.f35711a;
        return new KSerializer[]{dj2Var, dj2Var};
    }

    @Override // kotlinx.serialization.KSerializer
    public final LanguageStatValue deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        df1 df1VarMo4079b = decoder.mo4079b(serialDescriptor);
        int i = 0;
        double dMo4072F = 0.0d;
        double dMo4072F2 = 0.0d;
        boolean z = true;
        while (z) {
            int iMo10319A = df1VarMo4079b.mo10319A(serialDescriptor);
            if (iMo10319A == -1) {
                z = false;
            } else if (iMo10319A == 0) {
                dMo4072F = df1VarMo4079b.mo4072F(serialDescriptor, 0);
                i |= 1;
            } else {
                if (iMo10319A != 1) {
                    uk9.m22771e(iMo10319A);
                    return null;
                }
                dMo4072F2 = df1VarMo4079b.mo4072F(serialDescriptor, 1);
                i |= 2;
            }
        }
        df1VarMo4079b.mo4086j(serialDescriptor);
        return new LanguageStatValue(dMo4072F, dMo4072F2, i);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, LanguageStatValue languageStatValue) {
        encoder.getClass();
        languageStatValue.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        mk9 mk9VarMo15606b = encoder.mo15606b(serialDescriptor);
        mk9VarMo15606b.m16874r(serialDescriptor, 0, languageStatValue.f19076a);
        mk9VarMo15606b.m16874r(serialDescriptor, 1, languageStatValue.f19077b);
        mk9VarMo15606b.m16871A(serialDescriptor);
    }

    @Override // p000.zk3
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return te1.f62178b;
    }
}
