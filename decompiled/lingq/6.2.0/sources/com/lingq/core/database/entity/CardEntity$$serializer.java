package com.lingq.core.database.entity;

import androidx.datastore.preferences.protobuf.DescriptorProtos;
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
import p000.t7d;
import p000.te1;
import p000.thb;
import p000.uk9;
import p000.zb2;
import p000.zk3;

/* JADX INFO: loaded from: classes2.dex */
@zb2
public final /* synthetic */ class CardEntity$$serializer implements zk3 {
    public static final CardEntity$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        CardEntity$$serializer cardEntity$$serializer = new CardEntity$$serializer();
        INSTANCE = cardEntity$$serializer;
        bg7 bg7Var = new bg7("com.lingq.core.database.entity.CardEntity", cardEntity$$serializer, 28);
        bg7Var.m3702k("term", false);
        bg7Var.m3702k("termWithLanguage", false);
        bg7Var.m3702k("id", true);
        bg7Var.m3702k("url", false);
        bg7Var.m3702k("fragment", false);
        bg7Var.m3702k("status", true);
        bg7Var.m3702k("extendedStatus", false);
        bg7Var.m3702k("lastReviewedCorrect", false);
        bg7Var.m3702k("srsDueDate", false);
        bg7Var.m3702k("notes", false);
        bg7Var.m3702k("audio", false);
        bg7Var.m3702k("importance", true);
        bg7Var.m3702k("meanings", true);
        bg7Var.m3702k("meaningTerms", true);
        bg7Var.m3702k("tags", true);
        bg7Var.m3702k("gTags", true);
        bg7Var.m3702k("words", true);
        bg7Var.m3702k("hiragana", true);
        bg7Var.m3702k("romaji", true);
        bg7Var.m3702k("pinyin", true);
        bg7Var.m3702k("hant", true);
        bg7Var.m3702k("hans", true);
        bg7Var.m3702k("jyutping", true);
        bg7Var.m3702k("furiganaChunk", true);
        bg7Var.m3702k("furiganaFurigana", true);
        bg7Var.m3702k("latin", true);
        bg7Var.m3702k("isPhrase", true);
        bg7Var.m3702k("creationDate", true);
        descriptor = bg7Var;
    }

    private CardEntity$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.zk3
    public final KSerializer[] childSerializers() {
        cs4[] cs4VarArr = CardEntity.f17051C;
        sk9 sk9Var = sk9.f60959a;
        l84 l84Var = l84.f49294a;
        return new KSerializer[]{sk9Var, sk9Var, l84Var, thb.m22059r(sk9Var), thb.m22059r(sk9Var), l84Var, thb.m22059r(l84Var), thb.m22059r(sk9Var), thb.m22059r(sk9Var), thb.m22059r(sk9Var), thb.m22059r(sk9Var), l84Var, cs4VarArr[12].getValue(), sk9Var, cs4VarArr[14].getValue(), cs4VarArr[15].getValue(), cs4VarArr[16].getValue(), thb.m22059r(sk9Var), thb.m22059r(sk9Var), thb.m22059r(sk9Var), thb.m22059r(sk9Var), thb.m22059r(sk9Var), thb.m22059r(sk9Var), thb.m22059r(sk9Var), thb.m22059r(sk9Var), thb.m22059r(sk9Var), lf0.f49579a, thb.m22059r(sk9Var)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final CardEntity deserialize(Decoder decoder) {
        int i;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        df1 df1VarMo4079b = decoder.mo4079b(serialDescriptor);
        cs4[] cs4VarArr = CardEntity.f17051C;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        List list = null;
        String str5 = null;
        int i2 = 0;
        List list2 = null;
        List list3 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        int iMo4091q = 0;
        boolean z = true;
        int iMo4091q2 = 0;
        String strMo4097x = null;
        int iMo4091q3 = 0;
        String strMo4097x2 = null;
        String strMo4097x3 = null;
        String str11 = null;
        String str12 = null;
        Integer num = null;
        String str13 = null;
        String str14 = null;
        String str15 = null;
        String str16 = null;
        List list4 = null;
        boolean zMo4094v = false;
        while (z) {
            int iMo10319A = df1VarMo4079b.mo10319A(serialDescriptor);
            switch (iMo10319A) {
                case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                    z = false;
                    str2 = str2;
                    list = list;
                    str = str;
                    break;
                case 0:
                    i2 |= 1;
                    strMo4097x2 = df1VarMo4079b.mo4097x(serialDescriptor, 0);
                    str2 = str2;
                    list = list;
                    str = str;
                    break;
                case 1:
                    str = str;
                    list = list;
                    i2 |= 2;
                    strMo4097x3 = df1VarMo4079b.mo4097x(serialDescriptor, 1);
                    str2 = str2;
                    list = list;
                    str = str;
                    break;
                case 2:
                    list = list;
                    i2 |= 4;
                    iMo4091q2 = df1VarMo4079b.mo4091q(serialDescriptor, 2);
                    str2 = str2;
                    list = list;
                    str = str;
                    break;
                case 3:
                    list = list;
                    i2 |= 8;
                    str11 = (String) df1VarMo4079b.mo4070D(serialDescriptor, 3, sk9.f60959a, str11);
                    str2 = str2;
                    list = list;
                    str = str;
                    break;
                case 4:
                    list = list;
                    i2 |= 16;
                    str12 = (String) df1VarMo4079b.mo4070D(serialDescriptor, 4, sk9.f60959a, str12);
                    str2 = str2;
                    list = list;
                    str = str;
                    break;
                case 5:
                    list = list;
                    i2 |= 32;
                    iMo4091q3 = df1VarMo4079b.mo4091q(serialDescriptor, 5);
                    str2 = str2;
                    list = list;
                    str = str;
                    break;
                case 6:
                    list = list;
                    i2 |= 64;
                    num = (Integer) df1VarMo4079b.mo4070D(serialDescriptor, 6, l84.f49294a, num);
                    str2 = str2;
                    list = list;
                    str = str;
                    break;
                case 7:
                    list = list;
                    i2 |= 128;
                    str13 = (String) df1VarMo4079b.mo4070D(serialDescriptor, 7, sk9.f60959a, str13);
                    str2 = str2;
                    list = list;
                    str = str;
                    break;
                case 8:
                    list = list;
                    i2 |= 256;
                    str14 = (String) df1VarMo4079b.mo4070D(serialDescriptor, 8, sk9.f60959a, str14);
                    str2 = str2;
                    list = list;
                    str = str;
                    break;
                case 9:
                    list = list;
                    i2 |= 512;
                    str15 = (String) df1VarMo4079b.mo4070D(serialDescriptor, 9, sk9.f60959a, str15);
                    str2 = str2;
                    list = list;
                    str = str;
                    break;
                case 10:
                    list = list;
                    i2 |= 1024;
                    str16 = (String) df1VarMo4079b.mo4070D(serialDescriptor, 10, sk9.f60959a, str16);
                    str2 = str2;
                    list = list;
                    str = str;
                    break;
                case 11:
                    list = list;
                    iMo4091q = df1VarMo4079b.mo4091q(serialDescriptor, 11);
                    i2 |= 2048;
                    str2 = str2;
                    list = list;
                    str = str;
                    break;
                case 12:
                    list = list;
                    i2 |= 4096;
                    list4 = (List) df1VarMo4079b.mo4073G(serialDescriptor, 12, (KSerializer) cs4VarArr[12].getValue(), list4);
                    str2 = str2;
                    list = list;
                    str = str;
                    break;
                case 13:
                    str = str;
                    strMo4097x = df1VarMo4079b.mo4097x(serialDescriptor, 13);
                    i2 |= 8192;
                    list = list;
                    list = list;
                    str = str;
                    break;
                case 14:
                    str = str;
                    i2 |= 16384;
                    list = (List) df1VarMo4079b.mo4073G(serialDescriptor, 14, (KSerializer) cs4VarArr[14].getValue(), list);
                    list = list;
                    str = str;
                    break;
                case 15:
                    list2 = (List) df1VarMo4079b.mo4073G(serialDescriptor, 15, (KSerializer) cs4VarArr[15].getValue(), list2);
                    i = 32768;
                    i2 |= i;
                    str = str;
                    list = list;
                    str = str;
                    break;
                case 16:
                    list3 = (List) df1VarMo4079b.mo4073G(serialDescriptor, 16, (KSerializer) cs4VarArr[16].getValue(), list3);
                    i = 65536;
                    i2 |= i;
                    str = str;
                    list = list;
                    str = str;
                    break;
                case 17:
                    str8 = (String) df1VarMo4079b.mo4070D(serialDescriptor, 17, sk9.f60959a, str8);
                    i = 131072;
                    i2 |= i;
                    str = str;
                    list = list;
                    str = str;
                    break;
                case 18:
                    str9 = (String) df1VarMo4079b.mo4070D(serialDescriptor, 18, sk9.f60959a, str9);
                    i = 262144;
                    i2 |= i;
                    str = str;
                    list = list;
                    str = str;
                    break;
                case 19:
                    str10 = (String) df1VarMo4079b.mo4070D(serialDescriptor, 19, sk9.f60959a, str10);
                    i = 524288;
                    i2 |= i;
                    str = str;
                    list = list;
                    str = str;
                    break;
                case 20:
                    str5 = (String) df1VarMo4079b.mo4070D(serialDescriptor, 20, sk9.f60959a, str5);
                    i = 1048576;
                    i2 |= i;
                    str = str;
                    list = list;
                    str = str;
                    break;
                case 21:
                    str7 = (String) df1VarMo4079b.mo4070D(serialDescriptor, 21, sk9.f60959a, str7);
                    i = 2097152;
                    i2 |= i;
                    str = str;
                    list = list;
                    str = str;
                    break;
                case 22:
                    str6 = (String) df1VarMo4079b.mo4070D(serialDescriptor, 22, sk9.f60959a, str6);
                    i = 4194304;
                    i2 |= i;
                    str = str;
                    list = list;
                    str = str;
                    break;
                case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                    str4 = (String) df1VarMo4079b.mo4070D(serialDescriptor, 23, sk9.f60959a, str4);
                    i = 8388608;
                    i2 |= i;
                    str = str;
                    list = list;
                    str = str;
                    break;
                case 24:
                    str3 = (String) df1VarMo4079b.mo4070D(serialDescriptor, 24, sk9.f60959a, str3);
                    i = 16777216;
                    i2 |= i;
                    str = str;
                    list = list;
                    str = str;
                    break;
                case 25:
                    str2 = (String) df1VarMo4079b.mo4070D(serialDescriptor, 25, sk9.f60959a, str2);
                    i = 33554432;
                    i2 |= i;
                    str = str;
                    list = list;
                    str = str;
                    break;
                case 26:
                    zMo4094v = df1VarMo4079b.mo4094v(serialDescriptor, 26);
                    i = 67108864;
                    i2 |= i;
                    str = str;
                    list = list;
                    str = str;
                    break;
                case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                    str = (String) df1VarMo4079b.mo4070D(serialDescriptor, 27, sk9.f60959a, str);
                    i = 134217728;
                    i2 |= i;
                    str = str;
                    list = list;
                    str = str;
                    break;
                default:
                    uk9.m22771e(iMo10319A);
                    return null;
            }
        }
        String str17 = str2;
        String str18 = str11;
        df1VarMo4079b.mo4086j(serialDescriptor);
        String str19 = str12;
        String str20 = str7;
        List list5 = list3;
        int i3 = iMo4091q3;
        String str21 = str8;
        return new CardEntity(i2, iMo4091q2, i3, iMo4091q, num, strMo4097x2, strMo4097x3, str18, str19, str13, str14, str15, str16, strMo4097x, str21, str9, str10, str5, str20, str6, str4, str3, str17, str, list4, list, list2, list5, zMo4094v);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, CardEntity cardEntity) {
        encoder.getClass();
        cardEntity.getClass();
        String str = cardEntity.f17053B;
        boolean z = cardEntity.f17052A;
        String str2 = cardEntity.f17079z;
        String str3 = cardEntity.f17078y;
        String str4 = cardEntity.f17077x;
        String str5 = cardEntity.f17076w;
        String str6 = cardEntity.f17075v;
        String str7 = cardEntity.f17074u;
        String str8 = cardEntity.f17073t;
        SerialDescriptor serialDescriptor = descriptor;
        mk9 mk9VarMo15606b = encoder.mo15606b(serialDescriptor);
        cs4[] cs4VarArr = CardEntity.f17051C;
        String str9 = cardEntity.f17054a;
        String str10 = cardEntity.f17072s;
        String str11 = cardEntity.f17071r;
        List list = cardEntity.f17070q;
        List list2 = cardEntity.f17069p;
        List list3 = cardEntity.f17068o;
        String str12 = cardEntity.f17067n;
        int i = cardEntity.f17065l;
        int i2 = cardEntity.f17059f;
        int i3 = cardEntity.f17056c;
        List list4 = cardEntity.f17066m;
        mk9VarMo15606b.m16882z(serialDescriptor, 0, str9);
        mk9VarMo15606b.m16882z(serialDescriptor, 1, cardEntity.f17055b);
        if (mk9VarMo15606b.m16872B(serialDescriptor) || i3 != 0) {
            mk9VarMo15606b.m16878v(2, i3, serialDescriptor);
        }
        sk9 sk9Var = sk9.f60959a;
        mk9VarMo15606b.m16880x(serialDescriptor, 3, sk9Var, cardEntity.f17057d);
        mk9VarMo15606b.m16880x(serialDescriptor, 4, sk9Var, cardEntity.f17058e);
        if (mk9VarMo15606b.m16872B(serialDescriptor) || i2 != 0) {
            mk9VarMo15606b.m16878v(5, i2, serialDescriptor);
        }
        mk9VarMo15606b.m16880x(serialDescriptor, 6, l84.f49294a, cardEntity.f17060g);
        mk9VarMo15606b.m16880x(serialDescriptor, 7, sk9Var, cardEntity.f17061h);
        mk9VarMo15606b.m16880x(serialDescriptor, 8, sk9Var, cardEntity.f17062i);
        mk9VarMo15606b.m16880x(serialDescriptor, 9, sk9Var, cardEntity.f17063j);
        mk9VarMo15606b.m16880x(serialDescriptor, 10, sk9Var, cardEntity.f17064k);
        if (mk9VarMo15606b.m16872B(serialDescriptor) || i != 0) {
            mk9VarMo15606b.m16878v(11, i, serialDescriptor);
        }
        boolean zM16872B = mk9VarMo15606b.m16872B(serialDescriptor);
        EmptyList emptyList = EmptyList.f47638a;
        if (zM16872B || !fa4.m11650l(list4, emptyList)) {
            mk9VarMo15606b.m16881y(serialDescriptor, 12, (KSerializer) cs4VarArr[12].getValue(), list4);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || !fa4.m11650l(str12, t7d.m21899d(list4))) {
            mk9VarMo15606b.m16882z(serialDescriptor, 13, str12);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || !fa4.m11650l(list3, emptyList)) {
            mk9VarMo15606b.m16881y(serialDescriptor, 14, (KSerializer) cs4VarArr[14].getValue(), list3);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || !fa4.m11650l(list2, emptyList)) {
            mk9VarMo15606b.m16881y(serialDescriptor, 15, (KSerializer) cs4VarArr[15].getValue(), list2);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || !fa4.m11650l(list, emptyList)) {
            mk9VarMo15606b.m16881y(serialDescriptor, 16, (KSerializer) cs4VarArr[16].getValue(), list);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || str11 != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 17, sk9Var, str11);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || str10 != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 18, sk9Var, str10);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || str8 != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 19, sk9Var, str8);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || str7 != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 20, sk9Var, str7);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || str6 != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 21, sk9Var, str6);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || str5 != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 22, sk9Var, str5);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || str4 != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 23, sk9Var, str4);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || str3 != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 24, sk9Var, str3);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || str2 != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 25, sk9Var, str2);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || z) {
            mk9VarMo15606b.m16873q(serialDescriptor, 26, z);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || str != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 27, sk9Var, str);
        }
        mk9VarMo15606b.m16871A(serialDescriptor);
    }

    @Override // p000.zk3
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return te1.f62178b;
    }
}
