package com.lingq.core.database.entity;

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
public final /* synthetic */ class WordEntity$$serializer implements zk3 {
    public static final WordEntity$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        WordEntity$$serializer wordEntity$$serializer = new WordEntity$$serializer();
        INSTANCE = wordEntity$$serializer;
        bg7 bg7Var = new bg7("com.lingq.core.database.entity.WordEntity", wordEntity$$serializer, 16);
        bg7Var.m3702k("termWithLanguage", false);
        bg7Var.m3702k("term", false);
        bg7Var.m3702k("id", true);
        bg7Var.m3702k("status", false);
        bg7Var.m3702k("importance", true);
        bg7Var.m3702k("isPhrase", true);
        bg7Var.m3702k("meanings", true);
        bg7Var.m3702k("tags", true);
        bg7Var.m3702k("gTags", true);
        bg7Var.m3702k("romaji", true);
        bg7Var.m3702k("hiragana", true);
        bg7Var.m3702k("pinyin", true);
        bg7Var.m3702k("hant", true);
        bg7Var.m3702k("hans", true);
        bg7Var.m3702k("jyutping", true);
        bg7Var.m3702k("cardId", true);
        descriptor = bg7Var;
    }

    private WordEntity$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.zk3
    public final KSerializer[] childSerializers() {
        cs4[] cs4VarArr = WordEntity.f17488q;
        sk9 sk9Var = sk9.f60959a;
        l84 l84Var = l84.f49294a;
        return new KSerializer[]{sk9Var, sk9Var, l84Var, thb.m22059r(sk9Var), l84Var, lf0.f49579a, cs4VarArr[6].getValue(), cs4VarArr[7].getValue(), cs4VarArr[8].getValue(), thb.m22059r((KSerializer) cs4VarArr[9].getValue()), thb.m22059r((KSerializer) cs4VarArr[10].getValue()), thb.m22059r((KSerializer) cs4VarArr[11].getValue()), thb.m22059r((KSerializer) cs4VarArr[12].getValue()), thb.m22059r((KSerializer) cs4VarArr[13].getValue()), thb.m22059r((KSerializer) cs4VarArr[14].getValue()), l84Var};
    }

    @Override // kotlinx.serialization.KSerializer
    public final WordEntity deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        df1 df1VarMo4079b = decoder.mo4079b(serialDescriptor);
        cs4[] cs4VarArr = WordEntity.f17488q;
        List list = null;
        List list2 = null;
        List list3 = null;
        List list4 = null;
        List list5 = null;
        List list6 = null;
        int i = 0;
        List list7 = null;
        List list8 = null;
        int iMo4091q = 0;
        String str = null;
        int iMo4091q2 = 0;
        boolean zMo4094v = false;
        List list9 = null;
        boolean z = true;
        String strMo4097x = null;
        String strMo4097x2 = null;
        int iMo4091q3 = 0;
        while (z) {
            int iMo10319A = df1VarMo4079b.mo10319A(serialDescriptor);
            switch (iMo10319A) {
                case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                    iMo4091q2 = iMo4091q2;
                    z = false;
                    iMo4091q2 = iMo4091q2;
                    break;
                case 0:
                    strMo4097x = df1VarMo4079b.mo4097x(serialDescriptor, 0);
                    i |= 1;
                    iMo4091q = iMo4091q;
                    iMo4091q2 = iMo4091q2;
                    break;
                case 1:
                    strMo4097x2 = df1VarMo4079b.mo4097x(serialDescriptor, 1);
                    i |= 2;
                    iMo4091q = iMo4091q;
                    break;
                case 2:
                    iMo4091q = df1VarMo4079b.mo4091q(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    str = (String) df1VarMo4079b.mo4070D(serialDescriptor, 3, sk9.f60959a, str);
                    i |= 8;
                    iMo4091q = iMo4091q;
                    iMo4091q2 = iMo4091q2;
                    break;
                case 4:
                    iMo4091q2 = df1VarMo4079b.mo4091q(serialDescriptor, 4);
                    i |= 16;
                    iMo4091q = iMo4091q;
                    break;
                case 5:
                    zMo4094v = df1VarMo4079b.mo4094v(serialDescriptor, 5);
                    i |= 32;
                    iMo4091q = iMo4091q;
                    break;
                case 6:
                    list9 = (List) df1VarMo4079b.mo4073G(serialDescriptor, 6, (KSerializer) cs4VarArr[6].getValue(), list9);
                    i |= 64;
                    iMo4091q = iMo4091q;
                    iMo4091q2 = iMo4091q2;
                    break;
                case 7:
                    list6 = (List) df1VarMo4079b.mo4073G(serialDescriptor, 7, (KSerializer) cs4VarArr[7].getValue(), list6);
                    i |= 128;
                    iMo4091q = iMo4091q;
                    iMo4091q2 = iMo4091q2;
                    break;
                case 8:
                    list4 = (List) df1VarMo4079b.mo4073G(serialDescriptor, 8, (KSerializer) cs4VarArr[8].getValue(), list4);
                    i |= 256;
                    iMo4091q = iMo4091q;
                    iMo4091q2 = iMo4091q2;
                    break;
                case 9:
                    list3 = (List) df1VarMo4079b.mo4070D(serialDescriptor, 9, (KSerializer) cs4VarArr[9].getValue(), list3);
                    i |= 512;
                    iMo4091q = iMo4091q;
                    iMo4091q2 = iMo4091q2;
                    break;
                case 10:
                    list2 = (List) df1VarMo4079b.mo4070D(serialDescriptor, 10, (KSerializer) cs4VarArr[10].getValue(), list2);
                    i |= 1024;
                    iMo4091q = iMo4091q;
                    iMo4091q2 = iMo4091q2;
                    break;
                case 11:
                    list = (List) df1VarMo4079b.mo4070D(serialDescriptor, 11, (KSerializer) cs4VarArr[11].getValue(), list);
                    i |= 2048;
                    iMo4091q = iMo4091q;
                    iMo4091q2 = iMo4091q2;
                    break;
                case 12:
                    list5 = (List) df1VarMo4079b.mo4070D(serialDescriptor, 12, (KSerializer) cs4VarArr[12].getValue(), list5);
                    i |= 4096;
                    iMo4091q = iMo4091q;
                    iMo4091q2 = iMo4091q2;
                    break;
                case 13:
                    list7 = (List) df1VarMo4079b.mo4070D(serialDescriptor, 13, (KSerializer) cs4VarArr[13].getValue(), list7);
                    i |= 8192;
                    iMo4091q = iMo4091q;
                    iMo4091q2 = iMo4091q2;
                    break;
                case 14:
                    list8 = (List) df1VarMo4079b.mo4070D(serialDescriptor, 14, (KSerializer) cs4VarArr[14].getValue(), list8);
                    i |= 16384;
                    iMo4091q = iMo4091q;
                    iMo4091q2 = iMo4091q2;
                    break;
                case 15:
                    iMo4091q3 = df1VarMo4079b.mo4091q(serialDescriptor, 15);
                    i |= 32768;
                    iMo4091q = iMo4091q;
                    break;
                default:
                    uk9.m22771e(iMo10319A);
                    return null;
            }
        }
        df1VarMo4079b.mo4086j(serialDescriptor);
        return new WordEntity(i, strMo4097x, strMo4097x2, iMo4091q, str, iMo4091q2, zMo4094v, list9, list6, list4, list3, list2, list, list5, list7, list8, iMo4091q3);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    /* JADX WARN: Code duplicated, block: B:75:0x0164  */
    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, WordEntity wordEntity) {
        List list;
        encoder.getClass();
        wordEntity.getClass();
        int i = wordEntity.f17504p;
        List list2 = wordEntity.f17503o;
        List list3 = wordEntity.f17502n;
        List list4 = wordEntity.f17501m;
        SerialDescriptor serialDescriptor = descriptor;
        mk9 mk9VarMo15606b = encoder.mo15606b(serialDescriptor);
        cs4[] cs4VarArr = WordEntity.f17488q;
        String str = wordEntity.f17489a;
        List list5 = wordEntity.f17500l;
        List list6 = wordEntity.f17499k;
        List list7 = wordEntity.f17498j;
        List list8 = wordEntity.f17497i;
        List list9 = wordEntity.f17496h;
        List list10 = wordEntity.f17495g;
        boolean z = wordEntity.f17494f;
        int i2 = wordEntity.f17493e;
        int i3 = wordEntity.f17491c;
        mk9VarMo15606b.m16882z(serialDescriptor, 0, str);
        mk9VarMo15606b.m16882z(serialDescriptor, 1, wordEntity.f17490b);
        if (mk9VarMo15606b.m16872B(serialDescriptor) || i3 != 0) {
            mk9VarMo15606b.m16878v(2, i3, serialDescriptor);
        }
        mk9VarMo15606b.m16880x(serialDescriptor, 3, sk9.f60959a, wordEntity.f17492d);
        if (mk9VarMo15606b.m16872B(serialDescriptor) || i2 != 0) {
            mk9VarMo15606b.m16878v(4, i2, serialDescriptor);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || z) {
            mk9VarMo15606b.m16873q(serialDescriptor, 5, z);
        }
        boolean zM16872B = mk9VarMo15606b.m16872B(serialDescriptor);
        EmptyList emptyList = EmptyList.f47638a;
        if (zM16872B || !fa4.m11650l(list10, emptyList)) {
            mk9VarMo15606b.m16881y(serialDescriptor, 6, (KSerializer) cs4VarArr[6].getValue(), list10);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || !fa4.m11650l(list9, emptyList)) {
            mk9VarMo15606b.m16881y(serialDescriptor, 7, (KSerializer) cs4VarArr[7].getValue(), list9);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || !fa4.m11650l(list8, emptyList)) {
            mk9VarMo15606b.m16881y(serialDescriptor, 8, (KSerializer) cs4VarArr[8].getValue(), list8);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || !fa4.m11650l(list7, emptyList)) {
            mk9VarMo15606b.m16880x(serialDescriptor, 9, (KSerializer) cs4VarArr[9].getValue(), list7);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || !fa4.m11650l(list6, emptyList)) {
            mk9VarMo15606b.m16880x(serialDescriptor, 10, (KSerializer) cs4VarArr[10].getValue(), list6);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || !fa4.m11650l(list5, emptyList)) {
            mk9VarMo15606b.m16880x(serialDescriptor, 11, (KSerializer) cs4VarArr[11].getValue(), list5);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || !fa4.m11650l(list4, emptyList)) {
            mk9VarMo15606b.m16880x(serialDescriptor, 12, (KSerializer) cs4VarArr[12].getValue(), list4);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || !fa4.m11650l(list3, emptyList)) {
            mk9VarMo15606b.m16880x(serialDescriptor, 13, (KSerializer) cs4VarArr[13].getValue(), list3);
        }
        if (!mk9VarMo15606b.m16872B(serialDescriptor)) {
            list = list2;
            if (!fa4.m11650l(list, emptyList)) {
            }
            if (mk9VarMo15606b.m16872B(serialDescriptor) || i != 0) {
                mk9VarMo15606b.m16878v(15, i, serialDescriptor);
            }
            mk9VarMo15606b.m16871A(serialDescriptor);
        }
        list = list2;
        mk9VarMo15606b.m16880x(serialDescriptor, 14, (KSerializer) cs4VarArr[14].getValue(), list);
        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
            mk9VarMo15606b.m16878v(15, i, serialDescriptor);
        } else {
            mk9VarMo15606b.m16878v(15, i, serialDescriptor);
        }
        mk9VarMo15606b.m16871A(serialDescriptor);
    }

    @Override // p000.zk3
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return te1.f62178b;
    }
}
