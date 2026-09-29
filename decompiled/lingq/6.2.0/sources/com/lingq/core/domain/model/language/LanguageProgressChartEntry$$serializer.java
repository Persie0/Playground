package com.lingq.core.domain.model.language;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import p000.bg7;
import p000.df1;
import p000.dj2;
import p000.mk9;
import p000.sk9;
import p000.te1;
import p000.uk9;
import p000.zb2;
import p000.zk3;

/* JADX INFO: loaded from: classes2.dex */
@zb2
public final /* synthetic */ class LanguageProgressChartEntry$$serializer implements zk3 {
    public static final LanguageProgressChartEntry$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        LanguageProgressChartEntry$$serializer languageProgressChartEntry$$serializer = new LanguageProgressChartEntry$$serializer();
        INSTANCE = languageProgressChartEntry$$serializer;
        bg7 bg7Var = new bg7("com.lingq.core.domain.model.language.LanguageProgressChartEntry", languageProgressChartEntry$$serializer, 5);
        bg7Var.m3702k("metric", false);
        bg7Var.m3702k("languageCode", false);
        bg7Var.m3702k("name", false);
        bg7Var.m3702k("daily", false);
        bg7Var.m3702k("cumulative", false);
        descriptor = bg7Var;
    }

    private LanguageProgressChartEntry$$serializer() {
    }

    @Override // p000.zk3
    public final KSerializer[] childSerializers() {
        sk9 sk9Var = sk9.f60959a;
        dj2 dj2Var = dj2.f35711a;
        return new KSerializer[]{sk9Var, sk9Var, sk9Var, dj2Var, dj2Var};
    }

    @Override // kotlinx.serialization.KSerializer
    public final LanguageProgressChartEntry deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        df1 df1VarMo4079b = decoder.mo4079b(serialDescriptor);
        int i = 0;
        String strMo4097x = null;
        String strMo4097x2 = null;
        String strMo4097x3 = null;
        double dMo4072F = 0.0d;
        double dMo4072F2 = 0.0d;
        boolean z = true;
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
            } else if (iMo10319A == 2) {
                strMo4097x3 = df1VarMo4079b.mo4097x(serialDescriptor, 2);
                i |= 4;
            } else if (iMo10319A == 3) {
                dMo4072F = df1VarMo4079b.mo4072F(serialDescriptor, 3);
                i |= 8;
            } else {
                if (iMo10319A != 4) {
                    uk9.m22771e(iMo10319A);
                    return null;
                }
                dMo4072F2 = df1VarMo4079b.mo4072F(serialDescriptor, 4);
                i |= 16;
            }
        }
        df1VarMo4079b.mo4086j(serialDescriptor);
        return new LanguageProgressChartEntry(i, strMo4097x, strMo4097x2, strMo4097x3, dMo4072F, dMo4072F2);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, LanguageProgressChartEntry languageProgressChartEntry) {
        encoder.getClass();
        languageProgressChartEntry.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        mk9 mk9VarMo15606b = encoder.mo15606b(serialDescriptor);
        mk9VarMo15606b.m16882z(serialDescriptor, 0, languageProgressChartEntry.f19071a);
        mk9VarMo15606b.m16882z(serialDescriptor, 1, languageProgressChartEntry.f19072b);
        mk9VarMo15606b.m16882z(serialDescriptor, 2, languageProgressChartEntry.f19073c);
        mk9VarMo15606b.m16874r(serialDescriptor, 3, languageProgressChartEntry.f19074d);
        mk9VarMo15606b.m16874r(serialDescriptor, 4, languageProgressChartEntry.f19075e);
        mk9VarMo15606b.m16871A(serialDescriptor);
    }

    @Override // p000.zk3
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return te1.f62178b;
    }
}
