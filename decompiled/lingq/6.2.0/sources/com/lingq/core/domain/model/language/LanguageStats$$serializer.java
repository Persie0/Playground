package com.lingq.core.domain.model.language;

import androidx.datastore.preferences.protobuf.DescriptorProtos;
import com.android.installreferrer.api.InstallReferrerClient;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import p000.bg7;
import p000.df1;
import p000.mk9;
import p000.sk9;
import p000.te1;
import p000.uk9;
import p000.zb2;
import p000.zk3;

/* JADX INFO: loaded from: classes2.dex */
@zb2
public final /* synthetic */ class LanguageStats$$serializer implements zk3 {
    public static final LanguageStats$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        LanguageStats$$serializer languageStats$$serializer = new LanguageStats$$serializer();
        INSTANCE = languageStats$$serializer;
        bg7 bg7Var = new bg7("com.lingq.core.domain.model.language.LanguageStats", languageStats$$serializer, 27);
        bg7Var.m3702k("language", false);
        bg7Var.m3702k("period", false);
        bg7Var.m3702k("lessonCompleted", false);
        bg7Var.m3702k("speakingUsage", false);
        bg7Var.m3702k("coinsWords", false);
        bg7Var.m3702k("lessonShared", false);
        bg7Var.m3702k("translationsShared", false);
        bg7Var.m3702k("lessonPublished", false);
        bg7Var.m3702k("studyTime", false);
        bg7Var.m3702k("wpm", false);
        bg7Var.m3702k("lessonTaken", false);
        bg7Var.m3702k("translationsCreated", false);
        bg7Var.m3702k("learnedWords", false);
        bg7Var.m3702k("readingUsage", false);
        bg7Var.m3702k("listening", false);
        bg7Var.m3702k("earnedCoins", false);
        bg7Var.m3702k("coinsRead", false);
        bg7Var.m3702k("reviewUsage", false);
        bg7Var.m3702k("listeningUsage", false);
        bg7Var.m3702k("writing", false);
        bg7Var.m3702k("createdLingQs", false);
        bg7Var.m3702k("knownWords", false);
        bg7Var.m3702k("lessonImported", false);
        bg7Var.m3702k("translationsUsed", false);
        bg7Var.m3702k("reading", false);
        bg7Var.m3702k("coinsListen", false);
        bg7Var.m3702k("speaking", false);
        descriptor = bg7Var;
    }

    private LanguageStats$$serializer() {
    }

    @Override // p000.zk3
    public final KSerializer[] childSerializers() {
        sk9 sk9Var = sk9.f60959a;
        LanguageStatValue$$serializer languageStatValue$$serializer = LanguageStatValue$$serializer.INSTANCE;
        return new KSerializer[]{sk9Var, sk9Var, languageStatValue$$serializer, languageStatValue$$serializer, languageStatValue$$serializer, languageStatValue$$serializer, languageStatValue$$serializer, languageStatValue$$serializer, languageStatValue$$serializer, languageStatValue$$serializer, languageStatValue$$serializer, languageStatValue$$serializer, languageStatValue$$serializer, languageStatValue$$serializer, languageStatValue$$serializer, languageStatValue$$serializer, languageStatValue$$serializer, languageStatValue$$serializer, languageStatValue$$serializer, languageStatValue$$serializer, languageStatValue$$serializer, languageStatValue$$serializer, languageStatValue$$serializer, languageStatValue$$serializer, languageStatValue$$serializer, languageStatValue$$serializer, languageStatValue$$serializer};
    }

    @Override // kotlinx.serialization.KSerializer
    public final LanguageStats deserialize(Decoder decoder) {
        int i;
        LanguageStatValue languageStatValue;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        df1 df1VarMo4079b = decoder.mo4079b(serialDescriptor);
        LanguageStatValue languageStatValue2 = null;
        LanguageStatValue languageStatValue3 = null;
        LanguageStatValue languageStatValue4 = null;
        LanguageStatValue languageStatValue5 = null;
        LanguageStatValue languageStatValue6 = null;
        int i2 = 0;
        LanguageStatValue languageStatValue7 = null;
        LanguageStatValue languageStatValue8 = null;
        LanguageStatValue languageStatValue9 = null;
        LanguageStatValue languageStatValue10 = null;
        LanguageStatValue languageStatValue11 = null;
        LanguageStatValue languageStatValue12 = null;
        LanguageStatValue languageStatValue13 = null;
        LanguageStatValue languageStatValue14 = null;
        boolean z = true;
        String strMo4097x = null;
        String strMo4097x2 = null;
        LanguageStatValue languageStatValue15 = null;
        LanguageStatValue languageStatValue16 = null;
        LanguageStatValue languageStatValue17 = null;
        LanguageStatValue languageStatValue18 = null;
        LanguageStatValue languageStatValue19 = null;
        LanguageStatValue languageStatValue20 = null;
        LanguageStatValue languageStatValue21 = null;
        LanguageStatValue languageStatValue22 = null;
        LanguageStatValue languageStatValue23 = null;
        LanguageStatValue languageStatValue24 = null;
        LanguageStatValue languageStatValue25 = null;
        LanguageStatValue languageStatValue26 = null;
        while (z) {
            int iMo10319A = df1VarMo4079b.mo10319A(serialDescriptor);
            switch (iMo10319A) {
                case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                    languageStatValue8 = languageStatValue8;
                    z = false;
                    languageStatValue3 = languageStatValue3;
                    languageStatValue8 = languageStatValue8;
                    break;
                case 0:
                    languageStatValue = languageStatValue8;
                    strMo4097x = df1VarMo4079b.mo4097x(serialDescriptor, 0);
                    i2 |= 1;
                    languageStatValue3 = languageStatValue3;
                    languageStatValue8 = languageStatValue;
                    languageStatValue2 = languageStatValue2;
                    break;
                case 1:
                    languageStatValue2 = languageStatValue2;
                    strMo4097x2 = df1VarMo4079b.mo4097x(serialDescriptor, 1);
                    i2 |= 2;
                    languageStatValue3 = languageStatValue3;
                    languageStatValue2 = languageStatValue2;
                    break;
                case 2:
                    languageStatValue = languageStatValue8;
                    languageStatValue15 = (LanguageStatValue) df1VarMo4079b.mo4073G(serialDescriptor, 2, LanguageStatValue$$serializer.INSTANCE, languageStatValue15);
                    i2 |= 4;
                    languageStatValue3 = languageStatValue3;
                    languageStatValue8 = languageStatValue;
                    languageStatValue2 = languageStatValue2;
                    break;
                case 3:
                    languageStatValue = languageStatValue8;
                    languageStatValue16 = (LanguageStatValue) df1VarMo4079b.mo4073G(serialDescriptor, 3, LanguageStatValue$$serializer.INSTANCE, languageStatValue16);
                    i2 |= 8;
                    languageStatValue3 = languageStatValue3;
                    languageStatValue8 = languageStatValue;
                    languageStatValue2 = languageStatValue2;
                    break;
                case 4:
                    languageStatValue = languageStatValue8;
                    languageStatValue17 = (LanguageStatValue) df1VarMo4079b.mo4073G(serialDescriptor, 4, LanguageStatValue$$serializer.INSTANCE, languageStatValue17);
                    i2 |= 16;
                    languageStatValue3 = languageStatValue3;
                    languageStatValue8 = languageStatValue;
                    languageStatValue2 = languageStatValue2;
                    break;
                case 5:
                    languageStatValue = languageStatValue8;
                    languageStatValue18 = (LanguageStatValue) df1VarMo4079b.mo4073G(serialDescriptor, 5, LanguageStatValue$$serializer.INSTANCE, languageStatValue18);
                    i2 |= 32;
                    languageStatValue3 = languageStatValue3;
                    languageStatValue8 = languageStatValue;
                    languageStatValue2 = languageStatValue2;
                    break;
                case 6:
                    languageStatValue = languageStatValue8;
                    languageStatValue19 = (LanguageStatValue) df1VarMo4079b.mo4073G(serialDescriptor, 6, LanguageStatValue$$serializer.INSTANCE, languageStatValue19);
                    i2 |= 64;
                    languageStatValue3 = languageStatValue3;
                    languageStatValue8 = languageStatValue;
                    languageStatValue2 = languageStatValue2;
                    break;
                case 7:
                    languageStatValue = languageStatValue8;
                    languageStatValue20 = (LanguageStatValue) df1VarMo4079b.mo4073G(serialDescriptor, 7, LanguageStatValue$$serializer.INSTANCE, languageStatValue20);
                    i2 |= 128;
                    languageStatValue3 = languageStatValue3;
                    languageStatValue8 = languageStatValue;
                    languageStatValue2 = languageStatValue2;
                    break;
                case 8:
                    languageStatValue = languageStatValue8;
                    languageStatValue21 = (LanguageStatValue) df1VarMo4079b.mo4073G(serialDescriptor, 8, LanguageStatValue$$serializer.INSTANCE, languageStatValue21);
                    i2 |= 256;
                    languageStatValue3 = languageStatValue3;
                    languageStatValue8 = languageStatValue;
                    languageStatValue2 = languageStatValue2;
                    break;
                case 9:
                    languageStatValue = languageStatValue8;
                    languageStatValue22 = (LanguageStatValue) df1VarMo4079b.mo4073G(serialDescriptor, 9, LanguageStatValue$$serializer.INSTANCE, languageStatValue22);
                    i2 |= 512;
                    languageStatValue3 = languageStatValue3;
                    languageStatValue8 = languageStatValue;
                    languageStatValue2 = languageStatValue2;
                    break;
                case 10:
                    languageStatValue = languageStatValue8;
                    languageStatValue23 = (LanguageStatValue) df1VarMo4079b.mo4073G(serialDescriptor, 10, LanguageStatValue$$serializer.INSTANCE, languageStatValue23);
                    i2 |= 1024;
                    languageStatValue3 = languageStatValue3;
                    languageStatValue8 = languageStatValue;
                    languageStatValue2 = languageStatValue2;
                    break;
                case 11:
                    languageStatValue = languageStatValue8;
                    languageStatValue24 = (LanguageStatValue) df1VarMo4079b.mo4073G(serialDescriptor, 11, LanguageStatValue$$serializer.INSTANCE, languageStatValue24);
                    i2 |= 2048;
                    languageStatValue3 = languageStatValue3;
                    languageStatValue8 = languageStatValue;
                    languageStatValue2 = languageStatValue2;
                    break;
                case 12:
                    languageStatValue = languageStatValue8;
                    languageStatValue25 = (LanguageStatValue) df1VarMo4079b.mo4073G(serialDescriptor, 12, LanguageStatValue$$serializer.INSTANCE, languageStatValue25);
                    i2 |= 4096;
                    languageStatValue3 = languageStatValue3;
                    languageStatValue8 = languageStatValue;
                    languageStatValue2 = languageStatValue2;
                    break;
                case 13:
                    languageStatValue = languageStatValue8;
                    languageStatValue26 = (LanguageStatValue) df1VarMo4079b.mo4073G(serialDescriptor, 13, LanguageStatValue$$serializer.INSTANCE, languageStatValue26);
                    i2 |= 8192;
                    languageStatValue3 = languageStatValue3;
                    languageStatValue8 = languageStatValue;
                    languageStatValue2 = languageStatValue2;
                    break;
                case 14:
                    languageStatValue2 = languageStatValue2;
                    languageStatValue8 = (LanguageStatValue) df1VarMo4079b.mo4073G(serialDescriptor, 14, LanguageStatValue$$serializer.INSTANCE, languageStatValue8);
                    i2 |= 16384;
                    languageStatValue2 = languageStatValue2;
                    break;
                case 15:
                    languageStatValue9 = (LanguageStatValue) df1VarMo4079b.mo4073G(serialDescriptor, 15, LanguageStatValue$$serializer.INSTANCE, languageStatValue9);
                    i = 32768;
                    i2 |= i;
                    languageStatValue8 = languageStatValue8;
                    break;
                case 16:
                    languageStatValue10 = (LanguageStatValue) df1VarMo4079b.mo4073G(serialDescriptor, 16, LanguageStatValue$$serializer.INSTANCE, languageStatValue10);
                    i = 65536;
                    i2 |= i;
                    languageStatValue8 = languageStatValue8;
                    break;
                case 17:
                    languageStatValue11 = (LanguageStatValue) df1VarMo4079b.mo4073G(serialDescriptor, 17, LanguageStatValue$$serializer.INSTANCE, languageStatValue11);
                    i = 131072;
                    i2 |= i;
                    languageStatValue8 = languageStatValue8;
                    break;
                case 18:
                    languageStatValue12 = (LanguageStatValue) df1VarMo4079b.mo4073G(serialDescriptor, 18, LanguageStatValue$$serializer.INSTANCE, languageStatValue12);
                    i = 262144;
                    i2 |= i;
                    languageStatValue8 = languageStatValue8;
                    break;
                case 19:
                    languageStatValue13 = (LanguageStatValue) df1VarMo4079b.mo4073G(serialDescriptor, 19, LanguageStatValue$$serializer.INSTANCE, languageStatValue13);
                    i = 524288;
                    i2 |= i;
                    languageStatValue8 = languageStatValue8;
                    break;
                case 20:
                    languageStatValue14 = (LanguageStatValue) df1VarMo4079b.mo4073G(serialDescriptor, 20, LanguageStatValue$$serializer.INSTANCE, languageStatValue14);
                    i = 1048576;
                    i2 |= i;
                    languageStatValue8 = languageStatValue8;
                    break;
                case 21:
                    languageStatValue6 = (LanguageStatValue) df1VarMo4079b.mo4073G(serialDescriptor, 21, LanguageStatValue$$serializer.INSTANCE, languageStatValue6);
                    i = 2097152;
                    i2 |= i;
                    languageStatValue8 = languageStatValue8;
                    break;
                case 22:
                    languageStatValue4 = (LanguageStatValue) df1VarMo4079b.mo4073G(serialDescriptor, 22, LanguageStatValue$$serializer.INSTANCE, languageStatValue4);
                    i = 4194304;
                    i2 |= i;
                    languageStatValue8 = languageStatValue8;
                    break;
                case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                    languageStatValue3 = (LanguageStatValue) df1VarMo4079b.mo4073G(serialDescriptor, 23, LanguageStatValue$$serializer.INSTANCE, languageStatValue3);
                    i = 8388608;
                    i2 |= i;
                    languageStatValue8 = languageStatValue8;
                    break;
                case 24:
                    languageStatValue2 = (LanguageStatValue) df1VarMo4079b.mo4073G(serialDescriptor, 24, LanguageStatValue$$serializer.INSTANCE, languageStatValue2);
                    i = 16777216;
                    i2 |= i;
                    languageStatValue8 = languageStatValue8;
                    break;
                case 25:
                    languageStatValue5 = (LanguageStatValue) df1VarMo4079b.mo4073G(serialDescriptor, 25, LanguageStatValue$$serializer.INSTANCE, languageStatValue5);
                    i = 33554432;
                    i2 |= i;
                    languageStatValue8 = languageStatValue8;
                    break;
                case 26:
                    languageStatValue7 = (LanguageStatValue) df1VarMo4079b.mo4073G(serialDescriptor, 26, LanguageStatValue$$serializer.INSTANCE, languageStatValue7);
                    i = 67108864;
                    i2 |= i;
                    languageStatValue8 = languageStatValue8;
                    break;
                default:
                    uk9.m22771e(iMo10319A);
                    return null;
            }
        }
        LanguageStatValue languageStatValue27 = languageStatValue3;
        LanguageStatValue languageStatValue28 = languageStatValue8;
        LanguageStatValue languageStatValue29 = languageStatValue15;
        df1VarMo4079b.mo4086j(serialDescriptor);
        LanguageStatValue languageStatValue30 = languageStatValue22;
        LanguageStatValue languageStatValue31 = languageStatValue13;
        LanguageStatValue languageStatValue32 = languageStatValue7;
        String str = strMo4097x;
        LanguageStatValue languageStatValue33 = languageStatValue23;
        LanguageStatValue languageStatValue34 = languageStatValue14;
        return new LanguageStats(i2, str, strMo4097x2, languageStatValue29, languageStatValue16, languageStatValue17, languageStatValue18, languageStatValue19, languageStatValue20, languageStatValue21, languageStatValue30, languageStatValue33, languageStatValue24, languageStatValue25, languageStatValue26, languageStatValue28, languageStatValue9, languageStatValue10, languageStatValue11, languageStatValue12, languageStatValue31, languageStatValue34, languageStatValue6, languageStatValue4, languageStatValue27, languageStatValue2, languageStatValue5, languageStatValue32);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, LanguageStats languageStats) {
        encoder.getClass();
        languageStats.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        mk9 mk9VarMo15606b = encoder.mo15606b(serialDescriptor);
        mk9VarMo15606b.m16882z(serialDescriptor, 0, languageStats.f19079a);
        mk9VarMo15606b.m16882z(serialDescriptor, 1, languageStats.f19080b);
        LanguageStatValue$$serializer languageStatValue$$serializer = LanguageStatValue$$serializer.INSTANCE;
        mk9VarMo15606b.m16881y(serialDescriptor, 2, languageStatValue$$serializer, languageStats.f19081c);
        mk9VarMo15606b.m16881y(serialDescriptor, 3, languageStatValue$$serializer, languageStats.f19082d);
        mk9VarMo15606b.m16881y(serialDescriptor, 4, languageStatValue$$serializer, languageStats.f19083e);
        mk9VarMo15606b.m16881y(serialDescriptor, 5, languageStatValue$$serializer, languageStats.f19084f);
        mk9VarMo15606b.m16881y(serialDescriptor, 6, languageStatValue$$serializer, languageStats.f19085g);
        mk9VarMo15606b.m16881y(serialDescriptor, 7, languageStatValue$$serializer, languageStats.f19086h);
        mk9VarMo15606b.m16881y(serialDescriptor, 8, languageStatValue$$serializer, languageStats.f19087i);
        mk9VarMo15606b.m16881y(serialDescriptor, 9, languageStatValue$$serializer, languageStats.f19088j);
        mk9VarMo15606b.m16881y(serialDescriptor, 10, languageStatValue$$serializer, languageStats.f19089k);
        mk9VarMo15606b.m16881y(serialDescriptor, 11, languageStatValue$$serializer, languageStats.f19090l);
        mk9VarMo15606b.m16881y(serialDescriptor, 12, languageStatValue$$serializer, languageStats.f19091m);
        mk9VarMo15606b.m16881y(serialDescriptor, 13, languageStatValue$$serializer, languageStats.f19092n);
        mk9VarMo15606b.m16881y(serialDescriptor, 14, languageStatValue$$serializer, languageStats.f19093o);
        mk9VarMo15606b.m16881y(serialDescriptor, 15, languageStatValue$$serializer, languageStats.f19094p);
        mk9VarMo15606b.m16881y(serialDescriptor, 16, languageStatValue$$serializer, languageStats.f19095q);
        mk9VarMo15606b.m16881y(serialDescriptor, 17, languageStatValue$$serializer, languageStats.f19096r);
        mk9VarMo15606b.m16881y(serialDescriptor, 18, languageStatValue$$serializer, languageStats.f19097s);
        mk9VarMo15606b.m16881y(serialDescriptor, 19, languageStatValue$$serializer, languageStats.f19098t);
        mk9VarMo15606b.m16881y(serialDescriptor, 20, languageStatValue$$serializer, languageStats.f19099u);
        mk9VarMo15606b.m16881y(serialDescriptor, 21, languageStatValue$$serializer, languageStats.f19100v);
        mk9VarMo15606b.m16881y(serialDescriptor, 22, languageStatValue$$serializer, languageStats.f19101w);
        mk9VarMo15606b.m16881y(serialDescriptor, 23, languageStatValue$$serializer, languageStats.f19102x);
        mk9VarMo15606b.m16881y(serialDescriptor, 24, languageStatValue$$serializer, languageStats.f19103y);
        mk9VarMo15606b.m16881y(serialDescriptor, 25, languageStatValue$$serializer, languageStats.f19104z);
        mk9VarMo15606b.m16881y(serialDescriptor, 26, languageStatValue$$serializer, languageStats.f19078A);
        mk9VarMo15606b.m16871A(serialDescriptor);
    }

    @Override // p000.zk3
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return te1.f62178b;
    }
}
