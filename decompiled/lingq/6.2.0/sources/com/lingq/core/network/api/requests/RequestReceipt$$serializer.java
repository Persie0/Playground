package com.lingq.core.network.api.requests;

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
import p000.rk5;
import p000.sk9;
import p000.te1;
import p000.thb;
import p000.uk9;
import p000.zb2;
import p000.zk3;

/* JADX INFO: loaded from: classes2.dex */
@zb2
public final /* synthetic */ class RequestReceipt$$serializer implements zk3 {
    public static final RequestReceipt$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        RequestReceipt$$serializer requestReceipt$$serializer = new RequestReceipt$$serializer();
        INSTANCE = requestReceipt$$serializer;
        bg7 bg7Var = new bg7("com.lingq.core.network.api.requests.RequestReceipt", requestReceipt$$serializer, 7);
        bg7Var.m3702k("orderId", true);
        bg7Var.m3702k("packageName", true);
        bg7Var.m3702k("productId", true);
        bg7Var.m3702k("purchaseTime", true);
        bg7Var.m3702k("purchaseState", true);
        bg7Var.m3702k("purchaseToken", true);
        bg7Var.m3702k("isAutoRenewing", true);
        descriptor = bg7Var;
    }

    private RequestReceipt$$serializer() {
    }

    @Override // p000.zk3
    public final KSerializer[] childSerializers() {
        sk9 sk9Var = sk9.f60959a;
        return new KSerializer[]{thb.m22059r(sk9Var), thb.m22059r(sk9Var), thb.m22059r(sk9Var), rk5.f59434a, l84.f49294a, thb.m22059r(sk9Var), lf0.f49579a};
    }

    @Override // kotlinx.serialization.KSerializer
    public final RequestReceipt deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        df1 df1VarMo4079b = decoder.mo4079b(serialDescriptor);
        int i = 0;
        int iMo4091q = 0;
        boolean zMo4094v = false;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        long jMo4085i = 0;
        boolean z = true;
        while (z) {
            int iMo10319A = df1VarMo4079b.mo10319A(serialDescriptor);
            switch (iMo10319A) {
                case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                    z = false;
                    break;
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
                    jMo4085i = df1VarMo4079b.mo4085i(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    iMo4091q = df1VarMo4079b.mo4091q(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    str4 = (String) df1VarMo4079b.mo4070D(serialDescriptor, 5, sk9.f60959a, str4);
                    i |= 32;
                    break;
                case 6:
                    zMo4094v = df1VarMo4079b.mo4094v(serialDescriptor, 6);
                    i |= 64;
                    break;
                default:
                    uk9.m22771e(iMo10319A);
                    return null;
            }
        }
        df1VarMo4079b.mo4086j(serialDescriptor);
        return new RequestReceipt(i, str, str2, str3, jMo4085i, iMo4091q, str4, zMo4094v);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, RequestReceipt requestReceipt) {
        encoder.getClass();
        requestReceipt.getClass();
        boolean z = requestReceipt.f20446g;
        String str = requestReceipt.f20445f;
        int i = requestReceipt.f20444e;
        long j = requestReceipt.f20443d;
        String str2 = requestReceipt.f20442c;
        String str3 = requestReceipt.f20441b;
        String str4 = requestReceipt.f20440a;
        SerialDescriptor serialDescriptor = descriptor;
        mk9 mk9VarMo15606b = encoder.mo15606b(serialDescriptor);
        if (mk9VarMo15606b.m16872B(serialDescriptor) || str4 != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 0, sk9.f60959a, str4);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || str3 != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 1, sk9.f60959a, str3);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || str2 != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 2, sk9.f60959a, str2);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || j != 0) {
            mk9VarMo15606b.m16879w(serialDescriptor, 3, j);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || i != 0) {
            mk9VarMo15606b.m16878v(4, i, serialDescriptor);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || str != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 5, sk9.f60959a, str);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || z) {
            mk9VarMo15606b.m16873q(serialDescriptor, 6, z);
        }
        mk9VarMo15606b.m16871A(serialDescriptor);
    }

    @Override // p000.zk3
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return te1.f62178b;
    }
}
