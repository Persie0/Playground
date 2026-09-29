package com.lingq.core.network.api.requests;

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
public final /* synthetic */ class RequestHintUpdate$$serializer implements zk3 {
    public static final RequestHintUpdate$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        RequestHintUpdate$$serializer requestHintUpdate$$serializer = new RequestHintUpdate$$serializer();
        INSTANCE = requestHintUpdate$$serializer;
        bg7 bg7Var = new bg7("com.lingq.core.network.api.requests.RequestHintUpdate", requestHintUpdate$$serializer, 5);
        bg7Var.m3702k("locale", true);
        bg7Var.m3702k("text", true);
        bg7Var.m3702k("term", true);
        bg7Var.m3702k("is_google_translate", true);
        bg7Var.m3702k("popularity", true);
        descriptor = bg7Var;
    }

    private RequestHintUpdate$$serializer() {
    }

    @Override // p000.zk3
    public final KSerializer[] childSerializers() {
        sk9 sk9Var = sk9.f60959a;
        return new KSerializer[]{thb.m22059r(sk9Var), thb.m22059r(sk9Var), thb.m22059r(sk9Var), thb.m22059r(lf0.f49579a), thb.m22059r(l84.f49294a)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final RequestHintUpdate deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        df1 df1VarMo4079b = decoder.mo4079b(serialDescriptor);
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        Boolean bool = null;
        Integer num = null;
        while (z) {
            int iMo10319A = df1VarMo4079b.mo10319A(serialDescriptor);
            if (iMo10319A == -1) {
                z = false;
            } else if (iMo10319A == 0) {
                str = (String) df1VarMo4079b.mo4070D(serialDescriptor, 0, sk9.f60959a, str);
                i |= 1;
            } else if (iMo10319A == 1) {
                str2 = (String) df1VarMo4079b.mo4070D(serialDescriptor, 1, sk9.f60959a, str2);
                i |= 2;
            } else if (iMo10319A == 2) {
                str3 = (String) df1VarMo4079b.mo4070D(serialDescriptor, 2, sk9.f60959a, str3);
                i |= 4;
            } else if (iMo10319A == 3) {
                bool = (Boolean) df1VarMo4079b.mo4070D(serialDescriptor, 3, lf0.f49579a, bool);
                i |= 8;
            } else {
                if (iMo10319A != 4) {
                    uk9.m22771e(iMo10319A);
                    return null;
                }
                num = (Integer) df1VarMo4079b.mo4070D(serialDescriptor, 4, l84.f49294a, num);
                i |= 16;
            }
        }
        df1VarMo4079b.mo4086j(serialDescriptor);
        return new RequestHintUpdate(i, str, str2, str3, bool, num);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, RequestHintUpdate requestHintUpdate) {
        encoder.getClass();
        requestHintUpdate.getClass();
        Integer num = requestHintUpdate.f20370e;
        Boolean bool = requestHintUpdate.f20369d;
        String str = requestHintUpdate.f20368c;
        String str2 = requestHintUpdate.f20367b;
        String str3 = requestHintUpdate.f20366a;
        SerialDescriptor serialDescriptor = descriptor;
        mk9 mk9VarMo15606b = encoder.mo15606b(serialDescriptor);
        if (mk9VarMo15606b.m16872B(serialDescriptor) || str3 != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 0, sk9.f60959a, str3);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || str2 != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 1, sk9.f60959a, str2);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || str != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 2, sk9.f60959a, str);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || !fa4.m11650l(bool, Boolean.FALSE)) {
            mk9VarMo15606b.m16880x(serialDescriptor, 3, lf0.f49579a, bool);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || num != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 4, l84.f49294a, num);
        }
        mk9VarMo15606b.m16871A(serialDescriptor);
    }

    @Override // p000.zk3
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return te1.f62178b;
    }
}
