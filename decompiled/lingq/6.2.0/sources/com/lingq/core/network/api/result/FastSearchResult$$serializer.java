package com.lingq.core.network.api.result;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import p000.bg7;
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
public final /* synthetic */ class FastSearchResult$$serializer implements zk3 {
    public static final FastSearchResult$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        FastSearchResult$$serializer fastSearchResult$$serializer = new FastSearchResult$$serializer();
        INSTANCE = fastSearchResult$$serializer;
        bg7 bg7Var = new bg7("com.lingq.core.network.api.result.FastSearchResult", fastSearchResult$$serializer, 9);
        bg7Var.m3702k("id", true);
        bg7Var.m3702k("title", true);
        bg7Var.m3702k("type", true);
        bg7Var.m3702k("imageUrl", true);
        bg7Var.m3702k("isTaken", true);
        bg7Var.m3702k("status", true);
        bg7Var.m3702k("source", true);
        bg7Var.m3702k("audioUrl", true);
        bg7Var.m3702k("duration", true);
        descriptor = bg7Var;
    }

    private FastSearchResult$$serializer() {
    }

    @Override // p000.zk3
    public final KSerializer[] childSerializers() {
        l84 l84Var = l84.f49294a;
        sk9 sk9Var = sk9.f60959a;
        return new KSerializer[]{l84Var, sk9Var, sk9Var, sk9Var, thb.m22059r(lf0.f49579a), thb.m22059r(sk9Var), thb.m22059r(ResultLessonMediaSource$$serializer.INSTANCE), thb.m22059r(sk9Var), thb.m22059r(l84Var)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final FastSearchResult deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        df1 df1VarMo4079b = decoder.mo4079b(serialDescriptor);
        FastSearchResult fastSearchResult = null;
        boolean z = true;
        Integer num = null;
        String strMo4097x = null;
        String strMo4097x2 = null;
        String strMo4097x3 = null;
        Boolean bool = null;
        String str = null;
        ResultLessonMediaSource resultLessonMediaSource = null;
        String str2 = null;
        int i = 0;
        int iMo4091q = 0;
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
                    bool = (Boolean) df1VarMo4079b.mo4070D(serialDescriptor, 4, lf0.f49579a, bool);
                    i |= 16;
                    break;
                case 5:
                    str = (String) df1VarMo4079b.mo4070D(serialDescriptor, 5, sk9.f60959a, str);
                    i |= 32;
                    break;
                case 6:
                    resultLessonMediaSource = (ResultLessonMediaSource) df1VarMo4079b.mo4070D(serialDescriptor, 6, ResultLessonMediaSource$$serializer.INSTANCE, resultLessonMediaSource);
                    i |= 64;
                    break;
                case 7:
                    str2 = (String) df1VarMo4079b.mo4070D(serialDescriptor, 7, sk9.f60959a, str2);
                    i |= 128;
                    break;
                case 8:
                    num = (Integer) df1VarMo4079b.mo4070D(serialDescriptor, 8, l84.f49294a, num);
                    i |= 256;
                    break;
                default:
                    uk9.m22771e(iMo10319A);
                    return fastSearchResult;
            }
            fastSearchResult = null;
        }
        df1VarMo4079b.mo4086j(serialDescriptor);
        return new FastSearchResult(i, iMo4091q, strMo4097x, strMo4097x2, strMo4097x3, bool, str, resultLessonMediaSource, str2, num);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, FastSearchResult fastSearchResult) {
        encoder.getClass();
        fastSearchResult.getClass();
        Integer num = fastSearchResult.f20532i;
        String str = fastSearchResult.f20531h;
        ResultLessonMediaSource resultLessonMediaSource = fastSearchResult.f20530g;
        String str2 = fastSearchResult.f20529f;
        Boolean bool = fastSearchResult.f20528e;
        String str3 = fastSearchResult.f20527d;
        String str4 = fastSearchResult.f20526c;
        String str5 = fastSearchResult.f20525b;
        int i = fastSearchResult.f20524a;
        SerialDescriptor serialDescriptor = descriptor;
        mk9 mk9VarMo15606b = encoder.mo15606b(serialDescriptor);
        if (mk9VarMo15606b.m16872B(serialDescriptor) || i != 0) {
            mk9VarMo15606b.m16878v(0, i, serialDescriptor);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || !fa4.m11650l(str5, "")) {
            mk9VarMo15606b.m16882z(serialDescriptor, 1, str5);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || !fa4.m11650l(str4, "")) {
            mk9VarMo15606b.m16882z(serialDescriptor, 2, str4);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || !fa4.m11650l(str3, "")) {
            mk9VarMo15606b.m16882z(serialDescriptor, 3, str3);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || bool != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 4, lf0.f49579a, bool);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || str2 != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 5, sk9.f60959a, str2);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || resultLessonMediaSource != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 6, ResultLessonMediaSource$$serializer.INSTANCE, resultLessonMediaSource);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || str != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 7, sk9.f60959a, str);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || num != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 8, l84.f49294a, num);
        }
        mk9VarMo15606b.m16871A(serialDescriptor);
    }

    @Override // p000.zk3
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return te1.f62178b;
    }
}
