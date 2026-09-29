package com.lingq.core.database.entity;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import p000.bg7;
import p000.df1;
import p000.dj2;
import p000.l84;
import p000.mk9;
import p000.sk9;
import p000.te1;
import p000.uk9;
import p000.zb2;
import p000.zk3;

/* JADX INFO: loaded from: classes2.dex */
@zb2
public final /* synthetic */ class LanguageProgressChartEntryEntity$$serializer implements zk3 {
    public static final LanguageProgressChartEntryEntity$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        LanguageProgressChartEntryEntity$$serializer languageProgressChartEntryEntity$$serializer = new LanguageProgressChartEntryEntity$$serializer();
        INSTANCE = languageProgressChartEntryEntity$$serializer;
        bg7 bg7Var = new bg7("com.lingq.core.database.entity.LanguageProgressChartEntryEntity", languageProgressChartEntryEntity$$serializer, 7);
        bg7Var.m3702k("metric", false);
        bg7Var.m3702k("languageCode", false);
        bg7Var.m3702k("period", false);
        bg7Var.m3702k("name", false);
        bg7Var.m3702k("daily", false);
        bg7Var.m3702k("cumulative", false);
        bg7Var.m3702k("position", false);
        descriptor = bg7Var;
    }

    private LanguageProgressChartEntryEntity$$serializer() {
    }

    @Override // p000.zk3
    public final KSerializer[] childSerializers() {
        sk9 sk9Var = sk9.f60959a;
        dj2 dj2Var = dj2.f35711a;
        return new KSerializer[]{sk9Var, sk9Var, sk9Var, sk9Var, dj2Var, dj2Var, l84.f49294a};
    }

    @Override // kotlinx.serialization.KSerializer
    public final LanguageProgressChartEntryEntity deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        df1 df1VarMo4079b = decoder.mo4079b(serialDescriptor);
        int i = 0;
        int iMo4091q = 0;
        String strMo4097x = null;
        String strMo4097x2 = null;
        String strMo4097x3 = null;
        String strMo4097x4 = null;
        double dMo4072F = 0.0d;
        double dMo4072F2 = 0.0d;
        boolean z = true;
        while (z) {
            int iMo10319A = df1VarMo4079b.mo10319A(serialDescriptor);
            switch (iMo10319A) {
                case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                    z = false;
                    break;
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
                    dMo4072F = df1VarMo4079b.mo4072F(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    dMo4072F2 = df1VarMo4079b.mo4072F(serialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    iMo4091q = df1VarMo4079b.mo4091q(serialDescriptor, 6);
                    i |= 64;
                    break;
                default:
                    uk9.m22771e(iMo10319A);
                    return null;
            }
        }
        df1VarMo4079b.mo4086j(serialDescriptor);
        return new LanguageProgressChartEntryEntity(i, strMo4097x, strMo4097x2, strMo4097x3, strMo4097x4, dMo4072F, dMo4072F2, iMo4091q);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, LanguageProgressChartEntryEntity languageProgressChartEntryEntity) {
        encoder.getClass();
        languageProgressChartEntryEntity.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        mk9 mk9VarMo15606b = encoder.mo15606b(serialDescriptor);
        mk9VarMo15606b.m16882z(serialDescriptor, 0, languageProgressChartEntryEntity.f17168a);
        mk9VarMo15606b.m16882z(serialDescriptor, 1, languageProgressChartEntryEntity.f17169b);
        mk9VarMo15606b.m16882z(serialDescriptor, 2, languageProgressChartEntryEntity.f17170c);
        mk9VarMo15606b.m16882z(serialDescriptor, 3, languageProgressChartEntryEntity.f17171d);
        mk9VarMo15606b.m16874r(serialDescriptor, 4, languageProgressChartEntryEntity.f17172e);
        mk9VarMo15606b.m16874r(serialDescriptor, 5, languageProgressChartEntryEntity.f17173f);
        mk9VarMo15606b.m16878v(6, languageProgressChartEntryEntity.f17174g, serialDescriptor);
        mk9VarMo15606b.m16871A(serialDescriptor);
    }

    @Override // p000.zk3
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return te1.f62178b;
    }
}
