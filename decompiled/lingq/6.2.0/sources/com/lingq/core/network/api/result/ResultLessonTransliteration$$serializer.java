package com.lingq.core.network.api.result;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import p000.a98;
import p000.bg7;
import p000.df1;
import p000.mk9;
import p000.sk9;
import p000.te1;
import p000.thb;
import p000.uk9;
import p000.z88;
import p000.zb2;
import p000.zk3;

/* JADX INFO: loaded from: classes2.dex */
@zb2
public final /* synthetic */ class ResultLessonTransliteration$$serializer implements zk3 {
    public static final ResultLessonTransliteration$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ResultLessonTransliteration$$serializer resultLessonTransliteration$$serializer = new ResultLessonTransliteration$$serializer();
        INSTANCE = resultLessonTransliteration$$serializer;
        bg7 bg7Var = new bg7("com.lingq.core.network.api.result.ResultLessonTransliteration", resultLessonTransliteration$$serializer, 8);
        bg7Var.m3702k("hiragana", true);
        bg7Var.m3702k("romaji", true);
        bg7Var.m3702k("pinyin", true);
        bg7Var.m3702k("hant", true);
        bg7Var.m3702k("hans", true);
        bg7Var.m3702k("jyutping", true);
        bg7Var.m3702k("furigana", true);
        bg7Var.m3702k("latin", true);
        descriptor = bg7Var;
    }

    private ResultLessonTransliteration$$serializer() {
    }

    @Override // p000.zk3
    public final KSerializer[] childSerializers() {
        sk9 sk9Var = sk9.f60959a;
        return new KSerializer[]{thb.m22059r(sk9Var), thb.m22059r(sk9Var), thb.m22059r(sk9Var), thb.m22059r(sk9Var), thb.m22059r(sk9Var), thb.m22059r(sk9Var), thb.m22059r(a98.f384a), thb.m22059r(sk9Var)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final ResultLessonTransliteration deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        df1 df1VarMo4079b = decoder.mo4079b(serialDescriptor);
        ResultLessonTransliteration resultLessonTransliteration = null;
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        z88 z88Var = null;
        String str7 = null;
        while (z) {
            int iMo10319A = df1VarMo4079b.mo10319A(serialDescriptor);
            switch (iMo10319A) {
                case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                    z = false;
                    continue;
                case 0:
                    str = (String) df1VarMo4079b.mo4070D(serialDescriptor, 0, sk9.f60959a, str);
                    i |= 1;
                    break;
                case 1:
                    str2 = (String) df1VarMo4079b.mo4070D(serialDescriptor, 1, sk9.f60959a, str2);
                    i |= 2;
                    break;
                case 2:
                    str3 = (String) df1VarMo4079b.mo4070D(serialDescriptor, 2, sk9.f60959a, str3);
                    i |= 4;
                    break;
                case 3:
                    str4 = (String) df1VarMo4079b.mo4070D(serialDescriptor, 3, sk9.f60959a, str4);
                    i |= 8;
                    break;
                case 4:
                    str5 = (String) df1VarMo4079b.mo4070D(serialDescriptor, 4, sk9.f60959a, str5);
                    i |= 16;
                    break;
                case 5:
                    str6 = (String) df1VarMo4079b.mo4070D(serialDescriptor, 5, sk9.f60959a, str6);
                    i |= 32;
                    break;
                case 6:
                    z88Var = (z88) df1VarMo4079b.mo4070D(serialDescriptor, 6, a98.f384a, z88Var);
                    i |= 64;
                    break;
                case 7:
                    str7 = (String) df1VarMo4079b.mo4070D(serialDescriptor, 7, sk9.f60959a, str7);
                    i |= 128;
                    break;
                default:
                    uk9.m22771e(iMo10319A);
                    return resultLessonTransliteration;
            }
            resultLessonTransliteration = null;
        }
        df1VarMo4079b.mo4086j(serialDescriptor);
        return new ResultLessonTransliteration(i, str, str2, str3, str4, str5, str6, z88Var, str7);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, ResultLessonTransliteration resultLessonTransliteration) {
        encoder.getClass();
        resultLessonTransliteration.getClass();
        String str = resultLessonTransliteration.f21200h;
        z88 z88Var = resultLessonTransliteration.f21199g;
        String str2 = resultLessonTransliteration.f21198f;
        String str3 = resultLessonTransliteration.f21197e;
        String str4 = resultLessonTransliteration.f21196d;
        String str5 = resultLessonTransliteration.f21195c;
        String str6 = resultLessonTransliteration.f21194b;
        String str7 = resultLessonTransliteration.f21193a;
        SerialDescriptor serialDescriptor = descriptor;
        mk9 mk9VarMo15606b = encoder.mo15606b(serialDescriptor);
        if (mk9VarMo15606b.m16872B(serialDescriptor) || str7 != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 0, sk9.f60959a, str7);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || str6 != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 1, sk9.f60959a, str6);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || str5 != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 2, sk9.f60959a, str5);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || str4 != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 3, sk9.f60959a, str4);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || str3 != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 4, sk9.f60959a, str3);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || str2 != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 5, sk9.f60959a, str2);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || z88Var != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 6, a98.f384a, z88Var);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || str != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 7, sk9.f60959a, str);
        }
        mk9VarMo15606b.m16871A(serialDescriptor);
    }

    @Override // p000.zk3
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return te1.f62178b;
    }
}
