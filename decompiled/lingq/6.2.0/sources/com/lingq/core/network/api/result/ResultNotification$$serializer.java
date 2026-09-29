package com.lingq.core.network.api.result;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import p000.bg7;
import p000.df1;
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
public final /* synthetic */ class ResultNotification$$serializer implements zk3 {
    public static final ResultNotification$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ResultNotification$$serializer resultNotification$$serializer = new ResultNotification$$serializer();
        INSTANCE = resultNotification$$serializer;
        bg7 bg7Var = new bg7("com.lingq.core.network.api.result.ResultNotification", resultNotification$$serializer, 9);
        bg7Var.m3702k("pk", true);
        bg7Var.m3702k("url", true);
        bg7Var.m3702k("language", true);
        bg7Var.m3702k("type", true);
        bg7Var.m3702k("title", true);
        bg7Var.m3702k("message", true);
        bg7Var.m3702k("image", true);
        bg7Var.m3702k("isNew", true);
        bg7Var.m3702k("timestamp", true);
        descriptor = bg7Var;
    }

    private ResultNotification$$serializer() {
    }

    @Override // p000.zk3
    public final KSerializer[] childSerializers() {
        sk9 sk9Var = sk9.f60959a;
        return new KSerializer[]{l84.f49294a, thb.m22059r(sk9Var), thb.m22059r(sk9Var), thb.m22059r(sk9Var), thb.m22059r(sk9Var), thb.m22059r(sk9Var), thb.m22059r(sk9Var), thb.m22059r(lf0.f49579a), thb.m22059r(sk9Var)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final ResultNotification deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        df1 df1VarMo4079b = decoder.mo4079b(serialDescriptor);
        ResultNotification resultNotification = null;
        boolean z = true;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        Boolean bool = null;
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
                    str7 = (String) df1VarMo4079b.mo4070D(serialDescriptor, 6, sk9.f60959a, str7);
                    i |= 64;
                    break;
                case 7:
                    bool = (Boolean) df1VarMo4079b.mo4070D(serialDescriptor, 7, lf0.f49579a, bool);
                    i |= 128;
                    break;
                case 8:
                    str = (String) df1VarMo4079b.mo4070D(serialDescriptor, 8, sk9.f60959a, str);
                    i |= 256;
                    break;
                default:
                    uk9.m22771e(iMo10319A);
                    return resultNotification;
            }
            resultNotification = null;
        }
        df1VarMo4079b.mo4086j(serialDescriptor);
        return new ResultNotification(i, iMo4091q, str2, str3, str4, str5, str6, str7, bool, str);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, ResultNotification resultNotification) {
        encoder.getClass();
        resultNotification.getClass();
        String str = resultNotification.f21351i;
        Boolean bool = resultNotification.f21350h;
        String str2 = resultNotification.f21349g;
        String str3 = resultNotification.f21348f;
        String str4 = resultNotification.f21347e;
        String str5 = resultNotification.f21346d;
        String str6 = resultNotification.f21345c;
        String str7 = resultNotification.f21344b;
        int i = resultNotification.f21343a;
        SerialDescriptor serialDescriptor = descriptor;
        mk9 mk9VarMo15606b = encoder.mo15606b(serialDescriptor);
        if (mk9VarMo15606b.m16872B(serialDescriptor) || i != 0) {
            mk9VarMo15606b.m16878v(0, i, serialDescriptor);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || str7 != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 1, sk9.f60959a, str7);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || str6 != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 2, sk9.f60959a, str6);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || str5 != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 3, sk9.f60959a, str5);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || str4 != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 4, sk9.f60959a, str4);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || str3 != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 5, sk9.f60959a, str3);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || str2 != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 6, sk9.f60959a, str2);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || bool != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 7, lf0.f49579a, bool);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || str != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 8, sk9.f60959a, str);
        }
        mk9VarMo15606b.m16871A(serialDescriptor);
    }

    @Override // p000.zk3
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return te1.f62178b;
    }
}
