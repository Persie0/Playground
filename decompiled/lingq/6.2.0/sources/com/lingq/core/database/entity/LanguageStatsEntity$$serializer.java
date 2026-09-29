package com.lingq.core.database.entity;

import androidx.datastore.preferences.protobuf.DescriptorProtos;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.core.domain.model.language.LanguageStatValue;
import com.lingq.core.domain.model.language.LanguageStatValue$$serializer;
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
public final /* synthetic */ class LanguageStatsEntity$$serializer implements zk3 {
    public static final LanguageStatsEntity$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        LanguageStatsEntity$$serializer languageStatsEntity$$serializer = new LanguageStatsEntity$$serializer();
        INSTANCE = languageStatsEntity$$serializer;
        bg7 bg7Var = new bg7("com.lingq.core.database.entity.LanguageStatsEntity", languageStatsEntity$$serializer, 28);
        bg7Var.m3702k("languageAndPeriod", false);
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

    private LanguageStatsEntity$$serializer() {
    }

    @Override // p000.zk3
    public final KSerializer[] childSerializers() {
        sk9 sk9Var = sk9.f60959a;
        LanguageStatValue$$serializer languageStatValue$$serializer = LanguageStatValue$$serializer.INSTANCE;
        return new KSerializer[]{sk9Var, sk9Var, sk9Var, languageStatValue$$serializer, languageStatValue$$serializer, languageStatValue$$serializer, languageStatValue$$serializer, languageStatValue$$serializer, languageStatValue$$serializer, languageStatValue$$serializer, languageStatValue$$serializer, languageStatValue$$serializer, languageStatValue$$serializer, languageStatValue$$serializer, languageStatValue$$serializer, languageStatValue$$serializer, languageStatValue$$serializer, languageStatValue$$serializer, languageStatValue$$serializer, languageStatValue$$serializer, languageStatValue$$serializer, languageStatValue$$serializer, languageStatValue$$serializer, languageStatValue$$serializer, languageStatValue$$serializer, languageStatValue$$serializer, languageStatValue$$serializer, languageStatValue$$serializer};
    }

    @Override // kotlinx.serialization.KSerializer
    public final LanguageStatsEntity deserialize(Decoder decoder) {
        int i;
        int i2;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        df1 df1VarMo4079b = decoder.mo4079b(serialDescriptor);
        LanguageStatValue languageStatValue = null;
        LanguageStatValue languageStatValue2 = null;
        LanguageStatValue languageStatValue3 = null;
        LanguageStatValue languageStatValue4 = null;
        LanguageStatValue languageStatValue5 = null;
        LanguageStatValue languageStatValue6 = null;
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
        String strMo4097x3 = null;
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
        int i3 = 0;
        while (z) {
            int iMo10319A = df1VarMo4079b.mo10319A(serialDescriptor);
            switch (iMo10319A) {
                case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                    i = i3;
                    z = false;
                    languageStatValue2 = languageStatValue2;
                    i3 = i;
                    languageStatValue9 = languageStatValue9;
                    languageStatValue8 = languageStatValue8;
                    languageStatValue = languageStatValue;
                    break;
                case 0:
                    i = i3 | 1;
                    strMo4097x = df1VarMo4079b.mo4097x(serialDescriptor, 0);
                    languageStatValue2 = languageStatValue2;
                    i3 = i;
                    languageStatValue9 = languageStatValue9;
                    languageStatValue8 = languageStatValue8;
                    languageStatValue = languageStatValue;
                    break;
                case 1:
                    languageStatValue = languageStatValue;
                    languageStatValue8 = languageStatValue8;
                    languageStatValue9 = languageStatValue9;
                    i = i3 | 2;
                    strMo4097x2 = df1VarMo4079b.mo4097x(serialDescriptor, 1);
                    languageStatValue2 = languageStatValue2;
                    i3 = i;
                    languageStatValue9 = languageStatValue9;
                    languageStatValue8 = languageStatValue8;
                    languageStatValue = languageStatValue;
                    break;
                case 2:
                    languageStatValue = languageStatValue;
                    languageStatValue8 = languageStatValue8;
                    strMo4097x3 = df1VarMo4079b.mo4097x(serialDescriptor, 2);
                    languageStatValue2 = languageStatValue2;
                    languageStatValue9 = languageStatValue9;
                    i3 |= 4;
                    languageStatValue8 = languageStatValue8;
                    languageStatValue = languageStatValue;
                    break;
                case 3:
                    languageStatValue = languageStatValue;
                    languageStatValue8 = languageStatValue8;
                    languageStatValue9 = languageStatValue9;
                    i3 |= 8;
                    languageStatValue2 = languageStatValue2;
                    languageStatValue15 = (LanguageStatValue) df1VarMo4079b.mo4073G(serialDescriptor, 3, LanguageStatValue$$serializer.INSTANCE, languageStatValue15);
                    languageStatValue9 = languageStatValue9;
                    languageStatValue8 = languageStatValue8;
                    languageStatValue = languageStatValue;
                    break;
                case 4:
                    languageStatValue = languageStatValue;
                    languageStatValue8 = languageStatValue8;
                    languageStatValue9 = languageStatValue9;
                    i3 |= 16;
                    languageStatValue2 = languageStatValue2;
                    languageStatValue16 = (LanguageStatValue) df1VarMo4079b.mo4073G(serialDescriptor, 4, LanguageStatValue$$serializer.INSTANCE, languageStatValue16);
                    languageStatValue9 = languageStatValue9;
                    languageStatValue8 = languageStatValue8;
                    languageStatValue = languageStatValue;
                    break;
                case 5:
                    languageStatValue = languageStatValue;
                    languageStatValue8 = languageStatValue8;
                    languageStatValue9 = languageStatValue9;
                    i3 |= 32;
                    languageStatValue2 = languageStatValue2;
                    languageStatValue17 = (LanguageStatValue) df1VarMo4079b.mo4073G(serialDescriptor, 5, LanguageStatValue$$serializer.INSTANCE, languageStatValue17);
                    languageStatValue9 = languageStatValue9;
                    languageStatValue8 = languageStatValue8;
                    languageStatValue = languageStatValue;
                    break;
                case 6:
                    languageStatValue = languageStatValue;
                    languageStatValue8 = languageStatValue8;
                    languageStatValue9 = languageStatValue9;
                    i3 |= 64;
                    languageStatValue2 = languageStatValue2;
                    languageStatValue18 = (LanguageStatValue) df1VarMo4079b.mo4073G(serialDescriptor, 6, LanguageStatValue$$serializer.INSTANCE, languageStatValue18);
                    languageStatValue9 = languageStatValue9;
                    languageStatValue8 = languageStatValue8;
                    languageStatValue = languageStatValue;
                    break;
                case 7:
                    languageStatValue = languageStatValue;
                    languageStatValue8 = languageStatValue8;
                    languageStatValue9 = languageStatValue9;
                    i3 |= 128;
                    languageStatValue2 = languageStatValue2;
                    languageStatValue19 = (LanguageStatValue) df1VarMo4079b.mo4073G(serialDescriptor, 7, LanguageStatValue$$serializer.INSTANCE, languageStatValue19);
                    languageStatValue9 = languageStatValue9;
                    languageStatValue8 = languageStatValue8;
                    languageStatValue = languageStatValue;
                    break;
                case 8:
                    languageStatValue = languageStatValue;
                    languageStatValue8 = languageStatValue8;
                    languageStatValue9 = languageStatValue9;
                    i3 |= 256;
                    languageStatValue2 = languageStatValue2;
                    languageStatValue20 = (LanguageStatValue) df1VarMo4079b.mo4073G(serialDescriptor, 8, LanguageStatValue$$serializer.INSTANCE, languageStatValue20);
                    languageStatValue9 = languageStatValue9;
                    languageStatValue8 = languageStatValue8;
                    languageStatValue = languageStatValue;
                    break;
                case 9:
                    languageStatValue = languageStatValue;
                    languageStatValue8 = languageStatValue8;
                    languageStatValue9 = languageStatValue9;
                    i3 |= 512;
                    languageStatValue2 = languageStatValue2;
                    languageStatValue21 = (LanguageStatValue) df1VarMo4079b.mo4073G(serialDescriptor, 9, LanguageStatValue$$serializer.INSTANCE, languageStatValue21);
                    languageStatValue9 = languageStatValue9;
                    languageStatValue8 = languageStatValue8;
                    languageStatValue = languageStatValue;
                    break;
                case 10:
                    languageStatValue = languageStatValue;
                    languageStatValue8 = languageStatValue8;
                    LanguageStatValue languageStatValue26 = languageStatValue9;
                    int i4 = i3;
                    int i5 = i4 | 1024;
                    languageStatValue22 = (LanguageStatValue) df1VarMo4079b.mo4073G(serialDescriptor, 10, LanguageStatValue$$serializer.INSTANCE, languageStatValue22);
                    languageStatValue2 = languageStatValue2;
                    languageStatValue9 = languageStatValue26;
                    i3 = i5;
                    languageStatValue8 = languageStatValue8;
                    languageStatValue = languageStatValue;
                    break;
                case 11:
                    languageStatValue = languageStatValue;
                    languageStatValue8 = languageStatValue8;
                    languageStatValue9 = languageStatValue9;
                    i3 |= 2048;
                    languageStatValue2 = languageStatValue2;
                    languageStatValue23 = (LanguageStatValue) df1VarMo4079b.mo4073G(serialDescriptor, 11, LanguageStatValue$$serializer.INSTANCE, languageStatValue23);
                    languageStatValue9 = languageStatValue9;
                    languageStatValue8 = languageStatValue8;
                    languageStatValue = languageStatValue;
                    break;
                case 12:
                    languageStatValue = languageStatValue;
                    languageStatValue8 = languageStatValue8;
                    languageStatValue9 = languageStatValue9;
                    i3 |= 4096;
                    languageStatValue2 = languageStatValue2;
                    languageStatValue24 = (LanguageStatValue) df1VarMo4079b.mo4073G(serialDescriptor, 12, LanguageStatValue$$serializer.INSTANCE, languageStatValue24);
                    languageStatValue9 = languageStatValue9;
                    languageStatValue8 = languageStatValue8;
                    languageStatValue = languageStatValue;
                    break;
                case 13:
                    languageStatValue = languageStatValue;
                    languageStatValue9 = languageStatValue9;
                    languageStatValue8 = languageStatValue8;
                    i3 |= 8192;
                    languageStatValue2 = languageStatValue2;
                    languageStatValue25 = (LanguageStatValue) df1VarMo4079b.mo4073G(serialDescriptor, 13, LanguageStatValue$$serializer.INSTANCE, languageStatValue25);
                    languageStatValue9 = languageStatValue9;
                    languageStatValue8 = languageStatValue8;
                    languageStatValue = languageStatValue;
                    break;
                case 14:
                    languageStatValue = languageStatValue;
                    languageStatValue9 = languageStatValue9;
                    i3 |= 16384;
                    languageStatValue8 = (LanguageStatValue) df1VarMo4079b.mo4073G(serialDescriptor, 14, LanguageStatValue$$serializer.INSTANCE, languageStatValue8);
                    languageStatValue9 = languageStatValue9;
                    languageStatValue8 = languageStatValue8;
                    languageStatValue = languageStatValue;
                    break;
                case 15:
                    languageStatValue8 = languageStatValue8;
                    languageStatValue = languageStatValue;
                    languageStatValue9 = (LanguageStatValue) df1VarMo4079b.mo4073G(serialDescriptor, 15, LanguageStatValue$$serializer.INSTANCE, languageStatValue9);
                    i3 |= 32768;
                    languageStatValue8 = languageStatValue8;
                    languageStatValue = languageStatValue;
                    break;
                case 16:
                    languageStatValue10 = (LanguageStatValue) df1VarMo4079b.mo4073G(serialDescriptor, 16, LanguageStatValue$$serializer.INSTANCE, languageStatValue10);
                    i2 = 65536;
                    languageStatValue = languageStatValue;
                    i3 |= i2;
                    languageStatValue9 = languageStatValue9;
                    languageStatValue8 = languageStatValue8;
                    languageStatValue = languageStatValue;
                    break;
                case 17:
                    languageStatValue11 = (LanguageStatValue) df1VarMo4079b.mo4073G(serialDescriptor, 17, LanguageStatValue$$serializer.INSTANCE, languageStatValue11);
                    i2 = 131072;
                    languageStatValue = languageStatValue;
                    i3 |= i2;
                    languageStatValue9 = languageStatValue9;
                    languageStatValue8 = languageStatValue8;
                    languageStatValue = languageStatValue;
                    break;
                case 18:
                    languageStatValue12 = (LanguageStatValue) df1VarMo4079b.mo4073G(serialDescriptor, 18, LanguageStatValue$$serializer.INSTANCE, languageStatValue12);
                    i2 = 262144;
                    languageStatValue = languageStatValue;
                    i3 |= i2;
                    languageStatValue9 = languageStatValue9;
                    languageStatValue8 = languageStatValue8;
                    languageStatValue = languageStatValue;
                    break;
                case 19:
                    languageStatValue13 = (LanguageStatValue) df1VarMo4079b.mo4073G(serialDescriptor, 19, LanguageStatValue$$serializer.INSTANCE, languageStatValue13);
                    i2 = 524288;
                    languageStatValue = languageStatValue;
                    i3 |= i2;
                    languageStatValue9 = languageStatValue9;
                    languageStatValue8 = languageStatValue8;
                    languageStatValue = languageStatValue;
                    break;
                case 20:
                    languageStatValue14 = (LanguageStatValue) df1VarMo4079b.mo4073G(serialDescriptor, 20, LanguageStatValue$$serializer.INSTANCE, languageStatValue14);
                    i2 = 1048576;
                    languageStatValue = languageStatValue;
                    i3 |= i2;
                    languageStatValue9 = languageStatValue9;
                    languageStatValue8 = languageStatValue8;
                    languageStatValue = languageStatValue;
                    break;
                case 21:
                    languageStatValue5 = (LanguageStatValue) df1VarMo4079b.mo4073G(serialDescriptor, 21, LanguageStatValue$$serializer.INSTANCE, languageStatValue5);
                    i2 = 2097152;
                    languageStatValue = languageStatValue;
                    i3 |= i2;
                    languageStatValue9 = languageStatValue9;
                    languageStatValue8 = languageStatValue8;
                    languageStatValue = languageStatValue;
                    break;
                case 22:
                    languageStatValue3 = (LanguageStatValue) df1VarMo4079b.mo4073G(serialDescriptor, 22, LanguageStatValue$$serializer.INSTANCE, languageStatValue3);
                    i2 = 4194304;
                    languageStatValue = languageStatValue;
                    i3 |= i2;
                    languageStatValue9 = languageStatValue9;
                    languageStatValue8 = languageStatValue8;
                    languageStatValue = languageStatValue;
                    break;
                case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                    languageStatValue2 = (LanguageStatValue) df1VarMo4079b.mo4073G(serialDescriptor, 23, LanguageStatValue$$serializer.INSTANCE, languageStatValue2);
                    i2 = 8388608;
                    languageStatValue = languageStatValue;
                    i3 |= i2;
                    languageStatValue9 = languageStatValue9;
                    languageStatValue8 = languageStatValue8;
                    languageStatValue = languageStatValue;
                    break;
                case 24:
                    languageStatValue = (LanguageStatValue) df1VarMo4079b.mo4073G(serialDescriptor, 24, LanguageStatValue$$serializer.INSTANCE, languageStatValue);
                    i2 = 16777216;
                    languageStatValue = languageStatValue;
                    i3 |= i2;
                    languageStatValue9 = languageStatValue9;
                    languageStatValue8 = languageStatValue8;
                    languageStatValue = languageStatValue;
                    break;
                case 25:
                    languageStatValue4 = (LanguageStatValue) df1VarMo4079b.mo4073G(serialDescriptor, 25, LanguageStatValue$$serializer.INSTANCE, languageStatValue4);
                    i2 = 33554432;
                    languageStatValue = languageStatValue;
                    i3 |= i2;
                    languageStatValue9 = languageStatValue9;
                    languageStatValue8 = languageStatValue8;
                    languageStatValue = languageStatValue;
                    break;
                case 26:
                    languageStatValue7 = (LanguageStatValue) df1VarMo4079b.mo4073G(serialDescriptor, 26, LanguageStatValue$$serializer.INSTANCE, languageStatValue7);
                    i2 = 67108864;
                    languageStatValue = languageStatValue;
                    i3 |= i2;
                    languageStatValue9 = languageStatValue9;
                    languageStatValue8 = languageStatValue8;
                    languageStatValue = languageStatValue;
                    break;
                case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                    languageStatValue6 = (LanguageStatValue) df1VarMo4079b.mo4073G(serialDescriptor, 27, LanguageStatValue$$serializer.INSTANCE, languageStatValue6);
                    i2 = 134217728;
                    languageStatValue = languageStatValue;
                    i3 |= i2;
                    languageStatValue9 = languageStatValue9;
                    languageStatValue8 = languageStatValue8;
                    languageStatValue = languageStatValue;
                    break;
                default:
                    uk9.m22771e(iMo10319A);
                    return null;
            }
        }
        LanguageStatValue languageStatValue27 = languageStatValue8;
        LanguageStatValue languageStatValue28 = languageStatValue9;
        int i6 = i3;
        LanguageStatValue languageStatValue29 = languageStatValue2;
        LanguageStatValue languageStatValue30 = languageStatValue15;
        df1VarMo4079b.mo4086j(serialDescriptor);
        LanguageStatValue languageStatValue31 = languageStatValue7;
        String str = strMo4097x;
        LanguageStatValue languageStatValue32 = languageStatValue22;
        LanguageStatValue languageStatValue33 = languageStatValue14;
        return new LanguageStatsEntity(i6, str, strMo4097x2, strMo4097x3, languageStatValue30, languageStatValue16, languageStatValue17, languageStatValue18, languageStatValue19, languageStatValue20, languageStatValue21, languageStatValue32, languageStatValue23, languageStatValue24, languageStatValue25, languageStatValue27, languageStatValue28, languageStatValue10, languageStatValue11, languageStatValue12, languageStatValue13, languageStatValue33, languageStatValue5, languageStatValue3, languageStatValue29, languageStatValue, languageStatValue4, languageStatValue31, languageStatValue6);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, LanguageStatsEntity languageStatsEntity) {
        encoder.getClass();
        languageStatsEntity.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        mk9 mk9VarMo15606b = encoder.mo15606b(serialDescriptor);
        mk9VarMo15606b.m16882z(serialDescriptor, 0, languageStatsEntity.f17202a);
        mk9VarMo15606b.m16882z(serialDescriptor, 1, languageStatsEntity.f17203b);
        mk9VarMo15606b.m16882z(serialDescriptor, 2, languageStatsEntity.f17204c);
        LanguageStatValue$$serializer languageStatValue$$serializer = LanguageStatValue$$serializer.INSTANCE;
        mk9VarMo15606b.m16881y(serialDescriptor, 3, languageStatValue$$serializer, languageStatsEntity.f17205d);
        mk9VarMo15606b.m16881y(serialDescriptor, 4, languageStatValue$$serializer, languageStatsEntity.f17206e);
        mk9VarMo15606b.m16881y(serialDescriptor, 5, languageStatValue$$serializer, languageStatsEntity.f17207f);
        mk9VarMo15606b.m16881y(serialDescriptor, 6, languageStatValue$$serializer, languageStatsEntity.f17208g);
        mk9VarMo15606b.m16881y(serialDescriptor, 7, languageStatValue$$serializer, languageStatsEntity.f17209h);
        mk9VarMo15606b.m16881y(serialDescriptor, 8, languageStatValue$$serializer, languageStatsEntity.f17210i);
        mk9VarMo15606b.m16881y(serialDescriptor, 9, languageStatValue$$serializer, languageStatsEntity.f17211j);
        mk9VarMo15606b.m16881y(serialDescriptor, 10, languageStatValue$$serializer, languageStatsEntity.f17212k);
        mk9VarMo15606b.m16881y(serialDescriptor, 11, languageStatValue$$serializer, languageStatsEntity.f17213l);
        mk9VarMo15606b.m16881y(serialDescriptor, 12, languageStatValue$$serializer, languageStatsEntity.f17214m);
        mk9VarMo15606b.m16881y(serialDescriptor, 13, languageStatValue$$serializer, languageStatsEntity.f17215n);
        mk9VarMo15606b.m16881y(serialDescriptor, 14, languageStatValue$$serializer, languageStatsEntity.f17216o);
        mk9VarMo15606b.m16881y(serialDescriptor, 15, languageStatValue$$serializer, languageStatsEntity.f17217p);
        mk9VarMo15606b.m16881y(serialDescriptor, 16, languageStatValue$$serializer, languageStatsEntity.f17218q);
        mk9VarMo15606b.m16881y(serialDescriptor, 17, languageStatValue$$serializer, languageStatsEntity.f17219r);
        mk9VarMo15606b.m16881y(serialDescriptor, 18, languageStatValue$$serializer, languageStatsEntity.f17220s);
        mk9VarMo15606b.m16881y(serialDescriptor, 19, languageStatValue$$serializer, languageStatsEntity.f17221t);
        mk9VarMo15606b.m16881y(serialDescriptor, 20, languageStatValue$$serializer, languageStatsEntity.f17222u);
        mk9VarMo15606b.m16881y(serialDescriptor, 21, languageStatValue$$serializer, languageStatsEntity.f17223v);
        mk9VarMo15606b.m16881y(serialDescriptor, 22, languageStatValue$$serializer, languageStatsEntity.f17224w);
        mk9VarMo15606b.m16881y(serialDescriptor, 23, languageStatValue$$serializer, languageStatsEntity.f17225x);
        mk9VarMo15606b.m16881y(serialDescriptor, 24, languageStatValue$$serializer, languageStatsEntity.f17226y);
        mk9VarMo15606b.m16881y(serialDescriptor, 25, languageStatValue$$serializer, languageStatsEntity.f17227z);
        mk9VarMo15606b.m16881y(serialDescriptor, 26, languageStatValue$$serializer, languageStatsEntity.f17200A);
        mk9VarMo15606b.m16881y(serialDescriptor, 27, languageStatValue$$serializer, languageStatsEntity.f17201B);
        mk9VarMo15606b.m16871A(serialDescriptor);
    }

    @Override // p000.zk3
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return te1.f62178b;
    }
}
