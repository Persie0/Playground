package com.lingq.core.domain.model.lesson;

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
import p000.l84;
import p000.lf0;
import p000.mk9;
import p000.sk9;
import p000.te1;
import p000.thb;
import p000.uk9;
import p000.zb2;
import p000.zk3;

/* JADX INFO: loaded from: classes2.dex */
@zb2
public final /* synthetic */ class LessonWord$$serializer implements zk3 {
    public static final LessonWord$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        LessonWord$$serializer lessonWord$$serializer = new LessonWord$$serializer();
        INSTANCE = lessonWord$$serializer;
        bg7 bg7Var = new bg7("com.lingq.core.domain.model.lesson.LessonWord", lessonWord$$serializer, 15);
        bg7Var.m3702k("term", false);
        bg7Var.m3702k("isPhrase", true);
        bg7Var.m3702k("tags", true);
        bg7Var.m3702k("gTags", true);
        bg7Var.m3702k("termWithLanguage", true);
        bg7Var.m3702k("meanings", true);
        bg7Var.m3702k("importance", true);
        bg7Var.m3702k("id", true);
        bg7Var.m3702k("status", false);
        bg7Var.m3702k("romaji", true);
        bg7Var.m3702k("hiragana", true);
        bg7Var.m3702k("pinyin", true);
        bg7Var.m3702k("hant", true);
        bg7Var.m3702k("hans", true);
        bg7Var.m3702k("jyutping", true);
        descriptor = bg7Var;
    }

    private LessonWord$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.zk3
    public final KSerializer[] childSerializers() {
        cs4[] cs4VarArr = LessonWord.f19313p;
        sk9 sk9Var = sk9.f60959a;
        l84 l84Var = l84.f49294a;
        return new KSerializer[]{sk9Var, lf0.f49579a, cs4VarArr[2].getValue(), cs4VarArr[3].getValue(), sk9Var, cs4VarArr[5].getValue(), l84Var, l84Var, sk9Var, thb.m22059r((KSerializer) cs4VarArr[9].getValue()), thb.m22059r((KSerializer) cs4VarArr[10].getValue()), thb.m22059r((KSerializer) cs4VarArr[11].getValue()), thb.m22059r((KSerializer) cs4VarArr[12].getValue()), thb.m22059r((KSerializer) cs4VarArr[13].getValue()), thb.m22059r((KSerializer) cs4VarArr[14].getValue())};
    }

    @Override // kotlinx.serialization.KSerializer
    public final LessonWord deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        df1 df1VarMo4079b = decoder.mo4079b(serialDescriptor);
        cs4[] cs4VarArr = LessonWord.f19313p;
        List list = null;
        List list2 = null;
        List list3 = null;
        List list4 = null;
        List list5 = null;
        List list6 = null;
        int i = 0;
        List list7 = null;
        int iMo4091q = 0;
        String strMo4097x = null;
        String strMo4097x2 = null;
        String strMo4097x3 = null;
        List list8 = null;
        List list9 = null;
        boolean z = true;
        int iMo4091q2 = 0;
        boolean zMo4094v = false;
        while (z) {
            int iMo10319A = df1VarMo4079b.mo10319A(serialDescriptor);
            switch (iMo10319A) {
                case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                    strMo4097x = strMo4097x;
                    z = false;
                    strMo4097x = strMo4097x;
                    break;
                case 0:
                    i |= 1;
                    strMo4097x = df1VarMo4079b.mo4097x(serialDescriptor, 0);
                    iMo4091q = iMo4091q;
                    break;
                case 1:
                    zMo4094v = df1VarMo4079b.mo4094v(serialDescriptor, 1);
                    i |= 2;
                    iMo4091q = iMo4091q;
                    break;
                case 2:
                    list8 = (List) df1VarMo4079b.mo4073G(serialDescriptor, 2, (KSerializer) cs4VarArr[2].getValue(), list8);
                    i |= 4;
                    iMo4091q = iMo4091q;
                    strMo4097x = strMo4097x;
                    break;
                case 3:
                    list9 = (List) df1VarMo4079b.mo4073G(serialDescriptor, 3, (KSerializer) cs4VarArr[3].getValue(), list9);
                    i |= 8;
                    iMo4091q = iMo4091q;
                    strMo4097x = strMo4097x;
                    break;
                case 4:
                    strMo4097x2 = df1VarMo4079b.mo4097x(serialDescriptor, 4);
                    i |= 16;
                    iMo4091q = iMo4091q;
                    break;
                case 5:
                    list6 = (List) df1VarMo4079b.mo4073G(serialDescriptor, 5, (KSerializer) cs4VarArr[5].getValue(), list6);
                    i |= 32;
                    iMo4091q = iMo4091q;
                    strMo4097x = strMo4097x;
                    break;
                case 6:
                    iMo4091q2 = df1VarMo4079b.mo4091q(serialDescriptor, 6);
                    i |= 64;
                    iMo4091q = iMo4091q;
                    break;
                case 7:
                    iMo4091q = df1VarMo4079b.mo4091q(serialDescriptor, 7);
                    i |= 128;
                    break;
                case 8:
                    strMo4097x3 = df1VarMo4079b.mo4097x(serialDescriptor, 8);
                    i |= 256;
                    iMo4091q = iMo4091q;
                    break;
                case 9:
                    list4 = (List) df1VarMo4079b.mo4070D(serialDescriptor, 9, (KSerializer) cs4VarArr[9].getValue(), list4);
                    i |= 512;
                    iMo4091q = iMo4091q;
                    strMo4097x = strMo4097x;
                    break;
                case 10:
                    list3 = (List) df1VarMo4079b.mo4070D(serialDescriptor, 10, (KSerializer) cs4VarArr[10].getValue(), list3);
                    i |= 1024;
                    iMo4091q = iMo4091q;
                    strMo4097x = strMo4097x;
                    break;
                case 11:
                    list2 = (List) df1VarMo4079b.mo4070D(serialDescriptor, 11, (KSerializer) cs4VarArr[11].getValue(), list2);
                    i |= 2048;
                    iMo4091q = iMo4091q;
                    strMo4097x = strMo4097x;
                    break;
                case 12:
                    list = (List) df1VarMo4079b.mo4070D(serialDescriptor, 12, (KSerializer) cs4VarArr[12].getValue(), list);
                    i |= 4096;
                    iMo4091q = iMo4091q;
                    strMo4097x = strMo4097x;
                    break;
                case 13:
                    list5 = (List) df1VarMo4079b.mo4070D(serialDescriptor, 13, (KSerializer) cs4VarArr[13].getValue(), list5);
                    i |= 8192;
                    iMo4091q = iMo4091q;
                    strMo4097x = strMo4097x;
                    break;
                case 14:
                    list7 = (List) df1VarMo4079b.mo4070D(serialDescriptor, 14, (KSerializer) cs4VarArr[14].getValue(), list7);
                    i |= 16384;
                    iMo4091q = iMo4091q;
                    strMo4097x = strMo4097x;
                    break;
                default:
                    uk9.m22771e(iMo10319A);
                    return null;
            }
        }
        df1VarMo4079b.mo4086j(serialDescriptor);
        return new LessonWord(i, iMo4091q2, iMo4091q, strMo4097x, strMo4097x2, strMo4097x3, list8, list9, list6, list4, list3, list2, list, list5, list7, zMo4094v);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    /* JADX WARN: Code duplicated, block: B:73:0x0152  */
    /* JADX WARN: Code duplicated, block: B:74:0x0155  */
    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, LessonWord lessonWord) {
        List list;
        List list2;
        encoder.getClass();
        lessonWord.getClass();
        List list3 = lessonWord.f19328o;
        List list4 = lessonWord.f19327n;
        List list5 = lessonWord.f19326m;
        List list6 = lessonWord.f19325l;
        List list7 = lessonWord.f19324k;
        SerialDescriptor serialDescriptor = descriptor;
        mk9 mk9VarMo15606b = encoder.mo15606b(serialDescriptor);
        cs4[] cs4VarArr = LessonWord.f19313p;
        String str = lessonWord.f19314a;
        List list8 = lessonWord.f19323j;
        int i = lessonWord.f19321h;
        int i2 = lessonWord.f19320g;
        List list9 = lessonWord.f19319f;
        String str2 = lessonWord.f19318e;
        List list10 = lessonWord.f19317d;
        List list11 = lessonWord.f19316c;
        boolean z = lessonWord.f19315b;
        mk9VarMo15606b.m16882z(serialDescriptor, 0, str);
        if (mk9VarMo15606b.m16872B(serialDescriptor) || z) {
            mk9VarMo15606b.m16873q(serialDescriptor, 1, z);
        }
        boolean zM16872B = mk9VarMo15606b.m16872B(serialDescriptor);
        EmptyList emptyList = EmptyList.f47638a;
        if (zM16872B || !fa4.m11650l(list11, emptyList)) {
            mk9VarMo15606b.m16881y(serialDescriptor, 2, (KSerializer) cs4VarArr[2].getValue(), list11);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || !fa4.m11650l(list10, emptyList)) {
            mk9VarMo15606b.m16881y(serialDescriptor, 3, (KSerializer) cs4VarArr[3].getValue(), list10);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || !fa4.m11650l(str2, "")) {
            mk9VarMo15606b.m16882z(serialDescriptor, 4, str2);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || !fa4.m11650l(list9, emptyList)) {
            mk9VarMo15606b.m16881y(serialDescriptor, 5, (KSerializer) cs4VarArr[5].getValue(), list9);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || i2 != 0) {
            mk9VarMo15606b.m16878v(6, i2, serialDescriptor);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || i != 0) {
            mk9VarMo15606b.m16878v(7, i, serialDescriptor);
        }
        mk9VarMo15606b.m16882z(serialDescriptor, 8, lessonWord.f19322i);
        if (mk9VarMo15606b.m16872B(serialDescriptor) || !fa4.m11650l(list8, emptyList)) {
            mk9VarMo15606b.m16880x(serialDescriptor, 9, (KSerializer) cs4VarArr[9].getValue(), list8);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || !fa4.m11650l(list7, emptyList)) {
            mk9VarMo15606b.m16880x(serialDescriptor, 10, (KSerializer) cs4VarArr[10].getValue(), list7);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || !fa4.m11650l(list6, emptyList)) {
            mk9VarMo15606b.m16880x(serialDescriptor, 11, (KSerializer) cs4VarArr[11].getValue(), list6);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || !fa4.m11650l(list5, emptyList)) {
            mk9VarMo15606b.m16880x(serialDescriptor, 12, (KSerializer) cs4VarArr[12].getValue(), list5);
        }
        if (!mk9VarMo15606b.m16872B(serialDescriptor)) {
            list = list4;
            if (!fa4.m11650l(list, emptyList)) {
            }
            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                list2 = list3;
                if (!fa4.m11650l(list2, emptyList)) {
                }
                mk9VarMo15606b.m16871A(serialDescriptor);
            }
            list2 = list3;
            mk9VarMo15606b.m16880x(serialDescriptor, 14, (KSerializer) cs4VarArr[14].getValue(), list2);
            mk9VarMo15606b.m16871A(serialDescriptor);
        }
        list = list4;
        mk9VarMo15606b.m16880x(serialDescriptor, 13, (KSerializer) cs4VarArr[13].getValue(), list);
        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
            list2 = list3;
            if (!fa4.m11650l(list2, emptyList)) {
            }
            mk9VarMo15606b.m16871A(serialDescriptor);
        }
        list2 = list3;
        mk9VarMo15606b.m16880x(serialDescriptor, 14, (KSerializer) cs4VarArr[14].getValue(), list2);
        mk9VarMo15606b.m16871A(serialDescriptor);
    }

    @Override // p000.zk3
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return te1.f62178b;
    }
}
