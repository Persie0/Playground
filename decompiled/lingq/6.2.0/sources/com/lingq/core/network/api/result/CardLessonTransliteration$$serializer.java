package com.lingq.core.network.api.result;

import com.android.installreferrer.api.InstallReferrerClient;
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
import p000.thb;
import p000.uk9;
import p000.zb2;
import p000.zk3;

/* JADX INFO: loaded from: classes2.dex */
@zb2
public final /* synthetic */ class CardLessonTransliteration$$serializer implements zk3 {
    public static final CardLessonTransliteration$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        CardLessonTransliteration$$serializer cardLessonTransliteration$$serializer = new CardLessonTransliteration$$serializer();
        INSTANCE = cardLessonTransliteration$$serializer;
        bg7 bg7Var = new bg7("com.lingq.core.network.api.result.CardLessonTransliteration", cardLessonTransliteration$$serializer, 8);
        bg7Var.m3702k("romaji", true);
        bg7Var.m3702k("hiragana", true);
        bg7Var.m3702k("pinyin", true);
        bg7Var.m3702k("hant", true);
        bg7Var.m3702k("hans", true);
        bg7Var.m3702k("jyutping", true);
        bg7Var.m3702k("furigana", true);
        bg7Var.m3702k("latin", true);
        descriptor = bg7Var;
    }

    private CardLessonTransliteration$$serializer() {
    }

    @Override // p000.zk3
    public final KSerializer[] childSerializers() {
        cs4[] cs4VarArr = CardLessonTransliteration.f20507i;
        return new KSerializer[]{thb.m22059r((KSerializer) cs4VarArr[0].getValue()), thb.m22059r((KSerializer) cs4VarArr[1].getValue()), thb.m22059r((KSerializer) cs4VarArr[2].getValue()), thb.m22059r((KSerializer) cs4VarArr[3].getValue()), thb.m22059r((KSerializer) cs4VarArr[4].getValue()), thb.m22059r((KSerializer) cs4VarArr[5].getValue()), thb.m22059r((KSerializer) cs4VarArr[6].getValue()), thb.m22059r((KSerializer) cs4VarArr[7].getValue())};
    }

    @Override // kotlinx.serialization.KSerializer
    public final CardLessonTransliteration deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        df1 df1VarMo4079b = decoder.mo4079b(serialDescriptor);
        cs4[] cs4VarArr = CardLessonTransliteration.f20507i;
        CardLessonTransliteration cardLessonTransliteration = null;
        boolean z = true;
        List list = null;
        List list2 = null;
        List list3 = null;
        List list4 = null;
        List list5 = null;
        List list6 = null;
        List list7 = null;
        List list8 = null;
        int i = 0;
        while (z) {
            int iMo10319A = df1VarMo4079b.mo10319A(serialDescriptor);
            switch (iMo10319A) {
                case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                    z = false;
                    break;
                case 0:
                    list2 = (List) df1VarMo4079b.mo4070D(serialDescriptor, 0, (KSerializer) cs4VarArr[0].getValue(), list2);
                    i |= 1;
                    break;
                case 1:
                    list3 = (List) df1VarMo4079b.mo4070D(serialDescriptor, 1, (KSerializer) cs4VarArr[1].getValue(), list3);
                    i |= 2;
                    break;
                case 2:
                    list4 = (List) df1VarMo4079b.mo4070D(serialDescriptor, 2, (KSerializer) cs4VarArr[2].getValue(), list4);
                    i |= 4;
                    break;
                case 3:
                    list5 = (List) df1VarMo4079b.mo4070D(serialDescriptor, 3, (KSerializer) cs4VarArr[3].getValue(), list5);
                    i |= 8;
                    break;
                case 4:
                    list6 = (List) df1VarMo4079b.mo4070D(serialDescriptor, 4, (KSerializer) cs4VarArr[4].getValue(), list6);
                    i |= 16;
                    break;
                case 5:
                    list7 = (List) df1VarMo4079b.mo4070D(serialDescriptor, 5, (KSerializer) cs4VarArr[5].getValue(), list7);
                    i |= 32;
                    break;
                case 6:
                    list8 = (List) df1VarMo4079b.mo4070D(serialDescriptor, 6, (KSerializer) cs4VarArr[6].getValue(), list8);
                    i |= 64;
                    break;
                case 7:
                    list = (List) df1VarMo4079b.mo4070D(serialDescriptor, 7, (KSerializer) cs4VarArr[7].getValue(), list);
                    i |= 128;
                    break;
                default:
                    uk9.m22771e(iMo10319A);
                    return cardLessonTransliteration;
            }
            cardLessonTransliteration = null;
        }
        df1VarMo4079b.mo4086j(serialDescriptor);
        return new CardLessonTransliteration(i, list2, list3, list4, list5, list6, list7, list8, list);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, CardLessonTransliteration cardLessonTransliteration) {
        encoder.getClass();
        cardLessonTransliteration.getClass();
        List list = cardLessonTransliteration.f20515h;
        List list2 = cardLessonTransliteration.f20514g;
        List list3 = cardLessonTransliteration.f20513f;
        List list4 = cardLessonTransliteration.f20512e;
        List list5 = cardLessonTransliteration.f20511d;
        List list6 = cardLessonTransliteration.f20510c;
        List list7 = cardLessonTransliteration.f20509b;
        List list8 = cardLessonTransliteration.f20508a;
        SerialDescriptor serialDescriptor = descriptor;
        mk9 mk9VarMo15606b = encoder.mo15606b(serialDescriptor);
        cs4[] cs4VarArr = CardLessonTransliteration.f20507i;
        boolean zM16872B = mk9VarMo15606b.m16872B(serialDescriptor);
        EmptyList emptyList = EmptyList.f47638a;
        if (zM16872B || !fa4.m11650l(list8, emptyList)) {
            mk9VarMo15606b.m16880x(serialDescriptor, 0, (KSerializer) cs4VarArr[0].getValue(), list8);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || !fa4.m11650l(list7, emptyList)) {
            mk9VarMo15606b.m16880x(serialDescriptor, 1, (KSerializer) cs4VarArr[1].getValue(), list7);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || !fa4.m11650l(list6, emptyList)) {
            mk9VarMo15606b.m16880x(serialDescriptor, 2, (KSerializer) cs4VarArr[2].getValue(), list6);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || !fa4.m11650l(list5, emptyList)) {
            mk9VarMo15606b.m16880x(serialDescriptor, 3, (KSerializer) cs4VarArr[3].getValue(), list5);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || !fa4.m11650l(list4, emptyList)) {
            mk9VarMo15606b.m16880x(serialDescriptor, 4, (KSerializer) cs4VarArr[4].getValue(), list4);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || !fa4.m11650l(list3, emptyList)) {
            mk9VarMo15606b.m16880x(serialDescriptor, 5, (KSerializer) cs4VarArr[5].getValue(), list3);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || !fa4.m11650l(list2, emptyList)) {
            mk9VarMo15606b.m16880x(serialDescriptor, 6, (KSerializer) cs4VarArr[6].getValue(), list2);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || !fa4.m11650l(list, emptyList)) {
            mk9VarMo15606b.m16880x(serialDescriptor, 7, (KSerializer) cs4VarArr[7].getValue(), list);
        }
        mk9VarMo15606b.m16871A(serialDescriptor);
    }

    @Override // p000.zk3
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return te1.f62178b;
    }
}
