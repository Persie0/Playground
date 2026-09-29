package com.lingq.core.domain.model.lesson;

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
import p000.thb;
import p000.uk9;
import p000.zb2;
import p000.zk3;

/* JADX INFO: loaded from: classes2.dex */
@zb2
public final /* synthetic */ class LessonTransliteration$$serializer implements zk3 {
    public static final LessonTransliteration$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        LessonTransliteration$$serializer lessonTransliteration$$serializer = new LessonTransliteration$$serializer();
        INSTANCE = lessonTransliteration$$serializer;
        bg7 bg7Var = new bg7("com.lingq.core.domain.model.lesson.LessonTransliteration", lessonTransliteration$$serializer, 8);
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

    private LessonTransliteration$$serializer() {
    }

    @Override // p000.zk3
    public final KSerializer[] childSerializers() {
        sk9 sk9Var = sk9.f60959a;
        return new KSerializer[]{thb.m22059r(sk9Var), thb.m22059r(sk9Var), thb.m22059r(sk9Var), thb.m22059r(sk9Var), thb.m22059r(sk9Var), thb.m22059r(sk9Var), thb.m22059r(LessonFurigana$$serializer.INSTANCE), thb.m22059r(sk9Var)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final LessonTransliteration deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        df1 df1VarMo4079b = decoder.mo4079b(serialDescriptor);
        LessonTransliteration lessonTransliteration = null;
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        LessonFurigana lessonFurigana = null;
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
                    lessonFurigana = (LessonFurigana) df1VarMo4079b.mo4070D(serialDescriptor, 6, LessonFurigana$$serializer.INSTANCE, lessonFurigana);
                    i |= 64;
                    break;
                case 7:
                    str7 = (String) df1VarMo4079b.mo4070D(serialDescriptor, 7, sk9.f60959a, str7);
                    i |= 128;
                    break;
                default:
                    uk9.m22771e(iMo10319A);
                    return lessonTransliteration;
            }
            lessonTransliteration = null;
        }
        df1VarMo4079b.mo4086j(serialDescriptor);
        return new LessonTransliteration(i, str, str2, str3, str4, str5, str6, lessonFurigana, str7);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, LessonTransliteration lessonTransliteration) {
        encoder.getClass();
        lessonTransliteration.getClass();
        String str = lessonTransliteration.f19306h;
        LessonFurigana lessonFurigana = lessonTransliteration.f19305g;
        String str2 = lessonTransliteration.f19304f;
        String str3 = lessonTransliteration.f19303e;
        String str4 = lessonTransliteration.f19302d;
        String str5 = lessonTransliteration.f19301c;
        String str6 = lessonTransliteration.f19300b;
        String str7 = lessonTransliteration.f19299a;
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
        if (mk9VarMo15606b.m16872B(serialDescriptor) || lessonFurigana != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 6, LessonFurigana$$serializer.INSTANCE, lessonFurigana);
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
