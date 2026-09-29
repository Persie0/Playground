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
public final /* synthetic */ class ResultChatMessage$$serializer implements zk3 {
    public static final ResultChatMessage$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ResultChatMessage$$serializer resultChatMessage$$serializer = new ResultChatMessage$$serializer();
        INSTANCE = resultChatMessage$$serializer;
        bg7 bg7Var = new bg7("com.lingq.core.network.api.result.ResultChatMessage", resultChatMessage$$serializer, 9);
        bg7Var.m3702k("index", true);
        bg7Var.m3702k("role", true);
        bg7Var.m3702k("name", true);
        bg7Var.m3702k("message", true);
        bg7Var.m3702k("phrases", true);
        bg7Var.m3702k("translation", true);
        bg7Var.m3702k("notes", true);
        bg7Var.m3702k("correction", true);
        bg7Var.m3702k("tokenizedText", true);
        descriptor = bg7Var;
    }

    private ResultChatMessage$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.zk3
    public final KSerializer[] childSerializers() {
        cs4[] cs4VarArr = ResultChatMessage.f20723j;
        sk9 sk9Var = sk9.f60959a;
        return new KSerializer[]{l84.f49294a, sk9Var, sk9Var, sk9Var, cs4VarArr[4].getValue(), thb.m22059r(sk9Var), thb.m22059r(sk9Var), thb.m22059r(sk9Var), cs4VarArr[8].getValue()};
    }

    @Override // kotlinx.serialization.KSerializer
    public final ResultChatMessage deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        df1 df1VarMo4079b = decoder.mo4079b(serialDescriptor);
        cs4[] cs4VarArr = ResultChatMessage.f20723j;
        List list = null;
        boolean z = true;
        String str = null;
        int i = 0;
        int iMo4091q = 0;
        String strMo4097x = null;
        String strMo4097x2 = null;
        String strMo4097x3 = null;
        List list2 = null;
        String str2 = null;
        String str3 = null;
        while (z) {
            int iMo10319A = df1VarMo4079b.mo10319A(serialDescriptor);
            switch (iMo10319A) {
                case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                    z = false;
                    break;
                case 0:
                    iMo4091q = df1VarMo4079b.mo4091q(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    strMo4097x = df1VarMo4079b.mo4097x(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    strMo4097x2 = df1VarMo4079b.mo4097x(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    strMo4097x3 = df1VarMo4079b.mo4097x(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    list2 = (List) df1VarMo4079b.mo4073G(serialDescriptor, 4, (KSerializer) cs4VarArr[4].getValue(), list2);
                    i |= 16;
                    break;
                case 5:
                    str2 = (String) df1VarMo4079b.mo4070D(serialDescriptor, 5, sk9.f60959a, str2);
                    i |= 32;
                    break;
                case 6:
                    str3 = (String) df1VarMo4079b.mo4070D(serialDescriptor, 6, sk9.f60959a, str3);
                    i |= 64;
                    break;
                case 7:
                    str = (String) df1VarMo4079b.mo4070D(serialDescriptor, 7, sk9.f60959a, str);
                    i |= 128;
                    break;
                case 8:
                    list = (List) df1VarMo4079b.mo4073G(serialDescriptor, 8, (KSerializer) cs4VarArr[8].getValue(), list);
                    i |= 256;
                    break;
                default:
                    uk9.m22771e(iMo10319A);
                    return null;
            }
        }
        df1VarMo4079b.mo4086j(serialDescriptor);
        return new ResultChatMessage(i, iMo4091q, strMo4097x, strMo4097x2, strMo4097x3, list2, str2, str3, str, list);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, ResultChatMessage resultChatMessage) {
        encoder.getClass();
        resultChatMessage.getClass();
        List list = resultChatMessage.f20732i;
        String str = resultChatMessage.f20731h;
        String str2 = resultChatMessage.f20730g;
        String str3 = resultChatMessage.f20729f;
        List list2 = resultChatMessage.f20728e;
        String str4 = resultChatMessage.f20727d;
        String str5 = resultChatMessage.f20726c;
        String str6 = resultChatMessage.f20725b;
        int i = resultChatMessage.f20724a;
        SerialDescriptor serialDescriptor = descriptor;
        mk9 mk9VarMo15606b = encoder.mo15606b(serialDescriptor);
        cs4[] cs4VarArr = ResultChatMessage.f20723j;
        if (mk9VarMo15606b.m16872B(serialDescriptor) || i != 0) {
            mk9VarMo15606b.m16878v(0, i, serialDescriptor);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || !fa4.m11650l(str6, "")) {
            mk9VarMo15606b.m16882z(serialDescriptor, 1, str6);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || !fa4.m11650l(str5, "")) {
            mk9VarMo15606b.m16882z(serialDescriptor, 2, str5);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || !fa4.m11650l(str4, "")) {
            mk9VarMo15606b.m16882z(serialDescriptor, 3, str4);
        }
        boolean zM16872B = mk9VarMo15606b.m16872B(serialDescriptor);
        EmptyList emptyList = EmptyList.f47638a;
        if (zM16872B || !fa4.m11650l(list2, emptyList)) {
            mk9VarMo15606b.m16881y(serialDescriptor, 4, (KSerializer) cs4VarArr[4].getValue(), list2);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || str3 != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 5, sk9.f60959a, str3);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || str2 != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 6, sk9.f60959a, str2);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || str != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 7, sk9.f60959a, str);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || !fa4.m11650l(list, emptyList)) {
            mk9VarMo15606b.m16881y(serialDescriptor, 8, (KSerializer) cs4VarArr[8].getValue(), list);
        }
        mk9VarMo15606b.m16871A(serialDescriptor);
    }

    @Override // p000.zk3
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return te1.f62178b;
    }
}
