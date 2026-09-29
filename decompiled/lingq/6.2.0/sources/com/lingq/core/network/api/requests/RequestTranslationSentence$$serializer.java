package com.lingq.core.network.api.requests;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.List;
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
public final /* synthetic */ class RequestTranslationSentence$$serializer implements zk3 {
    public static final RequestTranslationSentence$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        RequestTranslationSentence$$serializer requestTranslationSentence$$serializer = new RequestTranslationSentence$$serializer();
        INSTANCE = requestTranslationSentence$$serializer;
        bg7 bg7Var = new bg7("com.lingq.core.network.api.requests.RequestTranslationSentence", requestTranslationSentence$$serializer, 7);
        bg7Var.m3702k("index", false);
        bg7Var.m3702k("timestamp", false);
        bg7Var.m3702k("text", true);
        bg7Var.m3702k("translations", true);
        bg7Var.m3702k("notes", true);
        bg7Var.m3702k("lone", true);
        bg7Var.m3702k("action", true);
        descriptor = bg7Var;
    }

    private RequestTranslationSentence$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.zk3
    public final KSerializer[] childSerializers() {
        cs4[] cs4VarArr = RequestTranslationSentence.f20468h;
        sk9 sk9Var = sk9.f60959a;
        return new KSerializer[]{l84.f49294a, cs4VarArr[1].getValue(), sk9Var, thb.m22059r((KSerializer) cs4VarArr[3].getValue()), thb.m22059r((KSerializer) cs4VarArr[4].getValue()), lf0.f49579a, sk9Var};
    }

    @Override // kotlinx.serialization.KSerializer
    public final RequestTranslationSentence deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        df1 df1VarMo4079b = decoder.mo4079b(serialDescriptor);
        cs4[] cs4VarArr = RequestTranslationSentence.f20468h;
        RequestTranslationSentence requestTranslationSentence = null;
        boolean z = true;
        int i = 0;
        int iMo4091q = 0;
        boolean zMo4094v = false;
        List list = null;
        String strMo4097x = null;
        List list2 = null;
        List list3 = null;
        String strMo4097x2 = null;
        while (z) {
            int iMo10319A = df1VarMo4079b.mo10319A(serialDescriptor);
            switch (iMo10319A) {
                case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                    z = false;
                    continue;
                case 0:
                    iMo4091q = df1VarMo4079b.mo4091q(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    list = (List) df1VarMo4079b.mo4073G(serialDescriptor, 1, (KSerializer) cs4VarArr[1].getValue(), list);
                    i |= 2;
                    break;
                case 2:
                    strMo4097x = df1VarMo4079b.mo4097x(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    list2 = (List) df1VarMo4079b.mo4070D(serialDescriptor, 3, (KSerializer) cs4VarArr[3].getValue(), list2);
                    i |= 8;
                    break;
                case 4:
                    list3 = (List) df1VarMo4079b.mo4070D(serialDescriptor, 4, (KSerializer) cs4VarArr[4].getValue(), list3);
                    i |= 16;
                    break;
                case 5:
                    zMo4094v = df1VarMo4079b.mo4094v(serialDescriptor, 5);
                    i |= 32;
                    continue;
                case 6:
                    strMo4097x2 = df1VarMo4079b.mo4097x(serialDescriptor, 6);
                    i |= 64;
                    continue;
                default:
                    uk9.m22771e(iMo10319A);
                    return requestTranslationSentence;
            }
            requestTranslationSentence = null;
        }
        df1VarMo4079b.mo4086j(serialDescriptor);
        return new RequestTranslationSentence(i, iMo4091q, list, strMo4097x, list2, list3, zMo4094v, strMo4097x2);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, RequestTranslationSentence requestTranslationSentence) {
        encoder.getClass();
        requestTranslationSentence.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        mk9 mk9VarMo15606b = encoder.mo15606b(serialDescriptor);
        cs4[] cs4VarArr = RequestTranslationSentence.f20468h;
        int i = requestTranslationSentence.f20469a;
        String str = requestTranslationSentence.f20475g;
        boolean z = requestTranslationSentence.f20474f;
        List list = requestTranslationSentence.f20473e;
        List list2 = requestTranslationSentence.f20472d;
        String str2 = requestTranslationSentence.f20471c;
        mk9VarMo15606b.m16878v(0, i, serialDescriptor);
        mk9VarMo15606b.m16881y(serialDescriptor, 1, (KSerializer) cs4VarArr[1].getValue(), requestTranslationSentence.f20470b);
        if (mk9VarMo15606b.m16872B(serialDescriptor) || !fa4.m11650l(str2, "")) {
            mk9VarMo15606b.m16882z(serialDescriptor, 2, str2);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || list2 != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 3, (KSerializer) cs4VarArr[3].getValue(), list2);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || list != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 4, (KSerializer) cs4VarArr[4].getValue(), list);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || !z) {
            mk9VarMo15606b.m16873q(serialDescriptor, 5, z);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || !fa4.m11650l(str, "update")) {
            mk9VarMo15606b.m16882z(serialDescriptor, 6, str);
        }
        mk9VarMo15606b.m16871A(serialDescriptor);
    }

    @Override // p000.zk3
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return te1.f62178b;
    }
}
