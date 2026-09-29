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
import p000.l84;
import p000.mk9;
import p000.sk9;
import p000.te1;
import p000.thb;
import p000.uk9;
import p000.zb2;
import p000.zk3;

/* JADX INFO: loaded from: classes2.dex */
@zb2
public final /* synthetic */ class ResultCardChat$$serializer implements zk3 {
    public static final ResultCardChat$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ResultCardChat$$serializer resultCardChat$$serializer = new ResultCardChat$$serializer();
        INSTANCE = resultCardChat$$serializer;
        bg7 bg7Var = new bg7("com.lingq.core.network.api.result.ResultCardChat", resultCardChat$$serializer, 15);
        bg7Var.m3702k("term", true);
        bg7Var.m3702k("pk", true);
        bg7Var.m3702k("url", true);
        bg7Var.m3702k("fragment", true);
        bg7Var.m3702k("status", true);
        bg7Var.m3702k("extended_status", true);
        bg7Var.m3702k("last_reviewed_correct", true);
        bg7Var.m3702k("srs_due_date", true);
        bg7Var.m3702k("notes", true);
        bg7Var.m3702k("audio", true);
        bg7Var.m3702k("importance", true);
        bg7Var.m3702k("hints", true);
        bg7Var.m3702k("tags", true);
        bg7Var.m3702k("gTags", true);
        bg7Var.m3702k("words", true);
        descriptor = bg7Var;
    }

    private ResultCardChat$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.zk3
    public final KSerializer[] childSerializers() {
        cs4[] cs4VarArr = ResultCardChat.f20636p;
        sk9 sk9Var = sk9.f60959a;
        l84 l84Var = l84.f49294a;
        return new KSerializer[]{sk9Var, l84Var, thb.m22059r(sk9Var), thb.m22059r(sk9Var), l84Var, thb.m22059r(l84Var), thb.m22059r(sk9Var), thb.m22059r(sk9Var), thb.m22059r(sk9Var), thb.m22059r(sk9Var), l84Var, cs4VarArr[11].getValue(), cs4VarArr[12].getValue(), cs4VarArr[13].getValue(), cs4VarArr[14].getValue()};
    }

    @Override // kotlinx.serialization.KSerializer
    public final ResultCardChat deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        df1 df1VarMo4079b = decoder.mo4079b(serialDescriptor);
        cs4[] cs4VarArr = ResultCardChat.f20636p;
        List list = null;
        List list2 = null;
        String str = null;
        String str2 = null;
        List list3 = null;
        String str3 = null;
        int i = 0;
        List list4 = null;
        int iMo4091q = 0;
        String str4 = null;
        String str5 = null;
        int iMo4091q2 = 0;
        Integer num = null;
        String str6 = null;
        boolean z = true;
        int iMo4091q3 = 0;
        String strMo4097x = null;
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
                    iMo4091q2 = iMo4091q2;
                    i |= 2;
                    iMo4091q = df1VarMo4079b.mo4091q(serialDescriptor, 1);
                    iMo4091q2 = iMo4091q2;
                    break;
                case 2:
                    str4 = (String) df1VarMo4079b.mo4070D(serialDescriptor, 2, sk9.f60959a, str4);
                    i |= 4;
                    iMo4091q = iMo4091q;
                    iMo4091q2 = iMo4091q2;
                    break;
                case 3:
                    str5 = (String) df1VarMo4079b.mo4070D(serialDescriptor, 3, sk9.f60959a, str5);
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
                    num = (Integer) df1VarMo4079b.mo4070D(serialDescriptor, 5, l84.f49294a, num);
                    i |= 32;
                    iMo4091q = iMo4091q;
                    iMo4091q2 = iMo4091q2;
                    break;
                case 6:
                    str6 = (String) df1VarMo4079b.mo4070D(serialDescriptor, 6, sk9.f60959a, str6);
                    i |= 64;
                    iMo4091q = iMo4091q;
                    iMo4091q2 = iMo4091q2;
                    break;
                case 7:
                    str3 = (String) df1VarMo4079b.mo4070D(serialDescriptor, 7, sk9.f60959a, str3);
                    i |= 128;
                    iMo4091q = iMo4091q;
                    iMo4091q2 = iMo4091q2;
                    break;
                case 8:
                    str2 = (String) df1VarMo4079b.mo4070D(serialDescriptor, 8, sk9.f60959a, str2);
                    i |= 256;
                    iMo4091q = iMo4091q;
                    iMo4091q2 = iMo4091q2;
                    break;
                case 9:
                    str = (String) df1VarMo4079b.mo4070D(serialDescriptor, 9, sk9.f60959a, str);
                    i |= 512;
                    iMo4091q = iMo4091q;
                    iMo4091q2 = iMo4091q2;
                    break;
                case 10:
                    iMo4091q3 = df1VarMo4079b.mo4091q(serialDescriptor, 10);
                    i |= 1024;
                    iMo4091q = iMo4091q;
                    break;
                case 11:
                    list2 = (List) df1VarMo4079b.mo4073G(serialDescriptor, 11, (KSerializer) cs4VarArr[11].getValue(), list2);
                    i |= 2048;
                    iMo4091q = iMo4091q;
                    iMo4091q2 = iMo4091q2;
                    break;
                case 12:
                    list = (List) df1VarMo4079b.mo4073G(serialDescriptor, 12, (KSerializer) cs4VarArr[12].getValue(), list);
                    i |= 4096;
                    iMo4091q = iMo4091q;
                    iMo4091q2 = iMo4091q2;
                    break;
                case 13:
                    list3 = (List) df1VarMo4079b.mo4073G(serialDescriptor, 13, (KSerializer) cs4VarArr[13].getValue(), list3);
                    i |= 8192;
                    iMo4091q = iMo4091q;
                    iMo4091q2 = iMo4091q2;
                    break;
                case 14:
                    list4 = (List) df1VarMo4079b.mo4073G(serialDescriptor, 14, (KSerializer) cs4VarArr[14].getValue(), list4);
                    i |= 16384;
                    iMo4091q = iMo4091q;
                    iMo4091q2 = iMo4091q2;
                    break;
                default:
                    uk9.m22771e(iMo10319A);
                    return null;
            }
        }
        df1VarMo4079b.mo4086j(serialDescriptor);
        return new ResultCardChat(i, strMo4097x, iMo4091q, str4, str5, iMo4091q2, num, str6, str3, str2, str, iMo4091q3, list2, list, list3, list4);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0052  */
    /* JADX WARN: Code duplicated, block: B:17:0x005f  */
    /* JADX WARN: Code duplicated, block: B:22:0x006e  */
    /* JADX WARN: Code duplicated, block: B:27:0x007d  */
    /* JADX WARN: Code duplicated, block: B:32:0x008a  */
    /* JADX WARN: Code duplicated, block: B:37:0x0099  */
    /* JADX WARN: Code duplicated, block: B:42:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:47:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:52:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:57:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:63:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:69:0x0105  */
    /* JADX WARN: Code duplicated, block: B:72:0x0118  */
    /* JADX WARN: Code duplicated, block: B:73:0x011b  */
    /* JADX WARN: Code duplicated, block: B:78:0x0136  */
    /* JADX WARN: Code duplicated, block: B:79:0x0139  */
    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, ResultCardChat resultCardChat) {
        List list;
        boolean zM16872B;
        EmptyList emptyList;
        List list2;
        List list3;
        encoder.getClass();
        resultCardChat.getClass();
        List list4 = resultCardChat.f20651o;
        List list5 = resultCardChat.f20650n;
        List list6 = resultCardChat.f20649m;
        List list7 = resultCardChat.f20648l;
        int i = resultCardChat.f20647k;
        String str = resultCardChat.f20646j;
        String str2 = resultCardChat.f20645i;
        String str3 = resultCardChat.f20644h;
        String str4 = resultCardChat.f20643g;
        Integer num = resultCardChat.f20642f;
        int i2 = resultCardChat.f20641e;
        String str5 = resultCardChat.f20640d;
        String str6 = resultCardChat.f20639c;
        int i3 = resultCardChat.f20638b;
        String str7 = resultCardChat.f20637a;
        SerialDescriptor serialDescriptor = descriptor;
        mk9 mk9VarMo15606b = encoder.mo15606b(serialDescriptor);
        cs4[] cs4VarArr = ResultCardChat.f20636p;
        if (!mk9VarMo15606b.m16872B(serialDescriptor)) {
            list = list5;
            if (!fa4.m11650l(str7, "")) {
            }
            if (mk9VarMo15606b.m16872B(serialDescriptor) || i3 != 0) {
                mk9VarMo15606b.m16878v(1, i3, serialDescriptor);
            }
            if (mk9VarMo15606b.m16872B(serialDescriptor) || str6 != null) {
                mk9VarMo15606b.m16880x(serialDescriptor, 2, sk9.f60959a, str6);
            }
            if (mk9VarMo15606b.m16872B(serialDescriptor) || str5 != null) {
                mk9VarMo15606b.m16880x(serialDescriptor, 3, sk9.f60959a, str5);
            }
            if (mk9VarMo15606b.m16872B(serialDescriptor) || i2 != 0) {
                mk9VarMo15606b.m16878v(4, i2, serialDescriptor);
            }
            if (mk9VarMo15606b.m16872B(serialDescriptor) || num != null) {
                mk9VarMo15606b.m16880x(serialDescriptor, 5, l84.f49294a, num);
            }
            if (mk9VarMo15606b.m16872B(serialDescriptor) || str4 != null) {
                mk9VarMo15606b.m16880x(serialDescriptor, 6, sk9.f60959a, str4);
            }
            if (mk9VarMo15606b.m16872B(serialDescriptor) || str3 != null) {
                mk9VarMo15606b.m16880x(serialDescriptor, 7, sk9.f60959a, str3);
            }
            if (mk9VarMo15606b.m16872B(serialDescriptor) || str2 != null) {
                mk9VarMo15606b.m16880x(serialDescriptor, 8, sk9.f60959a, str2);
            }
            if (mk9VarMo15606b.m16872B(serialDescriptor) || str != null) {
                mk9VarMo15606b.m16880x(serialDescriptor, 9, sk9.f60959a, str);
            }
            if (mk9VarMo15606b.m16872B(serialDescriptor) || i != 0) {
                mk9VarMo15606b.m16878v(10, i, serialDescriptor);
            }
            zM16872B = mk9VarMo15606b.m16872B(serialDescriptor);
            emptyList = EmptyList.f47638a;
            if (zM16872B || !fa4.m11650l(list7, emptyList)) {
                mk9VarMo15606b.m16881y(serialDescriptor, 11, (KSerializer) cs4VarArr[11].getValue(), list7);
            }
            if (mk9VarMo15606b.m16872B(serialDescriptor) || !fa4.m11650l(list6, emptyList)) {
                mk9VarMo15606b.m16881y(serialDescriptor, 12, (KSerializer) cs4VarArr[12].getValue(), list6);
            }
            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                list2 = list;
                if (!fa4.m11650l(list2, emptyList)) {
                }
                if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                    list3 = list4;
                    if (!fa4.m11650l(list3, emptyList)) {
                    }
                    mk9VarMo15606b.m16871A(serialDescriptor);
                }
                list3 = list4;
                mk9VarMo15606b.m16881y(serialDescriptor, 14, (KSerializer) cs4VarArr[14].getValue(), list3);
                mk9VarMo15606b.m16871A(serialDescriptor);
            }
            list2 = list;
            mk9VarMo15606b.m16881y(serialDescriptor, 13, (KSerializer) cs4VarArr[13].getValue(), list2);
            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                list3 = list4;
                if (!fa4.m11650l(list3, emptyList)) {
                }
                mk9VarMo15606b.m16871A(serialDescriptor);
            }
            list3 = list4;
            mk9VarMo15606b.m16881y(serialDescriptor, 14, (KSerializer) cs4VarArr[14].getValue(), list3);
            mk9VarMo15606b.m16871A(serialDescriptor);
        }
        list = list5;
        mk9VarMo15606b.m16882z(serialDescriptor, 0, str7);
        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
            mk9VarMo15606b.m16878v(1, i3, serialDescriptor);
        } else {
            mk9VarMo15606b.m16878v(1, i3, serialDescriptor);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
            mk9VarMo15606b.m16880x(serialDescriptor, 2, sk9.f60959a, str6);
        } else {
            mk9VarMo15606b.m16880x(serialDescriptor, 2, sk9.f60959a, str6);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
            mk9VarMo15606b.m16880x(serialDescriptor, 3, sk9.f60959a, str5);
        } else {
            mk9VarMo15606b.m16880x(serialDescriptor, 3, sk9.f60959a, str5);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
            mk9VarMo15606b.m16878v(4, i2, serialDescriptor);
        } else {
            mk9VarMo15606b.m16878v(4, i2, serialDescriptor);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
            mk9VarMo15606b.m16880x(serialDescriptor, 5, l84.f49294a, num);
        } else {
            mk9VarMo15606b.m16880x(serialDescriptor, 5, l84.f49294a, num);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
            mk9VarMo15606b.m16880x(serialDescriptor, 6, sk9.f60959a, str4);
        } else {
            mk9VarMo15606b.m16880x(serialDescriptor, 6, sk9.f60959a, str4);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
            mk9VarMo15606b.m16880x(serialDescriptor, 7, sk9.f60959a, str3);
        } else {
            mk9VarMo15606b.m16880x(serialDescriptor, 7, sk9.f60959a, str3);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
            mk9VarMo15606b.m16880x(serialDescriptor, 8, sk9.f60959a, str2);
        } else {
            mk9VarMo15606b.m16880x(serialDescriptor, 8, sk9.f60959a, str2);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
            mk9VarMo15606b.m16880x(serialDescriptor, 9, sk9.f60959a, str);
        } else {
            mk9VarMo15606b.m16880x(serialDescriptor, 9, sk9.f60959a, str);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
            mk9VarMo15606b.m16878v(10, i, serialDescriptor);
        } else {
            mk9VarMo15606b.m16878v(10, i, serialDescriptor);
        }
        zM16872B = mk9VarMo15606b.m16872B(serialDescriptor);
        emptyList = EmptyList.f47638a;
        if (zM16872B) {
            mk9VarMo15606b.m16881y(serialDescriptor, 11, (KSerializer) cs4VarArr[11].getValue(), list7);
        } else {
            mk9VarMo15606b.m16881y(serialDescriptor, 11, (KSerializer) cs4VarArr[11].getValue(), list7);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
            mk9VarMo15606b.m16881y(serialDescriptor, 12, (KSerializer) cs4VarArr[12].getValue(), list6);
        } else {
            mk9VarMo15606b.m16881y(serialDescriptor, 12, (KSerializer) cs4VarArr[12].getValue(), list6);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
            list2 = list;
            if (!fa4.m11650l(list2, emptyList)) {
            }
            if (mk9VarMo15606b.m16872B(serialDescriptor)) {
                list3 = list4;
                if (!fa4.m11650l(list3, emptyList)) {
                }
                mk9VarMo15606b.m16871A(serialDescriptor);
            }
            list3 = list4;
            mk9VarMo15606b.m16881y(serialDescriptor, 14, (KSerializer) cs4VarArr[14].getValue(), list3);
            mk9VarMo15606b.m16871A(serialDescriptor);
        }
        list2 = list;
        mk9VarMo15606b.m16881y(serialDescriptor, 13, (KSerializer) cs4VarArr[13].getValue(), list2);
        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
            list3 = list4;
            if (!fa4.m11650l(list3, emptyList)) {
            }
            mk9VarMo15606b.m16871A(serialDescriptor);
        }
        list3 = list4;
        mk9VarMo15606b.m16881y(serialDescriptor, 14, (KSerializer) cs4VarArr[14].getValue(), list3);
        mk9VarMo15606b.m16871A(serialDescriptor);
    }

    @Override // p000.zk3
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return te1.f62178b;
    }
}
