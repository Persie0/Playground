package com.lingq.core.network.api.requests;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import p000.bg7;
import p000.df1;
import p000.lf0;
import p000.mk9;
import p000.n3c;
import p000.sk9;
import p000.te1;
import p000.uk9;
import p000.zb2;
import p000.zk3;

/* JADX INFO: loaded from: classes2.dex */
@zb2
public final /* synthetic */ class RequestPushNotificationRegistration$$serializer implements zk3 {
    public static final RequestPushNotificationRegistration$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        RequestPushNotificationRegistration$$serializer requestPushNotificationRegistration$$serializer = new RequestPushNotificationRegistration$$serializer();
        INSTANCE = requestPushNotificationRegistration$$serializer;
        bg7 bg7Var = new bg7("com.lingq.core.network.api.requests.RequestPushNotificationRegistration", requestPushNotificationRegistration$$serializer, 4);
        bg7Var.m3702k("dev_id", false);
        bg7Var.m3702k("reg_id", false);
        bg7Var.m3702k("name", false);
        bg7Var.m3702k("isActive", true);
        descriptor = bg7Var;
    }

    private RequestPushNotificationRegistration$$serializer() {
    }

    @Override // p000.zk3
    public final KSerializer[] childSerializers() {
        sk9 sk9Var = sk9.f60959a;
        return new KSerializer[]{sk9Var, sk9Var, sk9Var, lf0.f49579a};
    }

    @Override // kotlinx.serialization.KSerializer
    public final RequestPushNotificationRegistration deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        df1 df1VarMo4079b = decoder.mo4079b(serialDescriptor);
        boolean z = true;
        int i = 0;
        boolean zMo4094v = false;
        String strMo4097x = null;
        String strMo4097x2 = null;
        String strMo4097x3 = null;
        while (z) {
            int iMo10319A = df1VarMo4079b.mo10319A(serialDescriptor);
            if (iMo10319A == -1) {
                z = false;
            } else if (iMo10319A == 0) {
                strMo4097x = df1VarMo4079b.mo4097x(serialDescriptor, 0);
                i |= 1;
            } else if (iMo10319A == 1) {
                strMo4097x2 = df1VarMo4079b.mo4097x(serialDescriptor, 1);
                i |= 2;
            } else if (iMo10319A == 2) {
                strMo4097x3 = df1VarMo4079b.mo4097x(serialDescriptor, 2);
                i |= 4;
            } else {
                if (iMo10319A != 3) {
                    uk9.m22771e(iMo10319A);
                    return null;
                }
                zMo4094v = df1VarMo4079b.mo4094v(serialDescriptor, 3);
                i |= 8;
            }
        }
        df1VarMo4079b.mo4086j(serialDescriptor);
        if (7 != (i & 7)) {
            n3c.m17204b(i, 7, INSTANCE.getDescriptor());
            throw null;
        }
        RequestPushNotificationRegistration requestPushNotificationRegistration = new RequestPushNotificationRegistration();
        requestPushNotificationRegistration.f20423a = strMo4097x;
        requestPushNotificationRegistration.f20424b = strMo4097x2;
        requestPushNotificationRegistration.f20425c = strMo4097x3;
        if ((i & 8) == 0) {
            requestPushNotificationRegistration.f20426d = false;
            return requestPushNotificationRegistration;
        }
        requestPushNotificationRegistration.f20426d = zMo4094v;
        return requestPushNotificationRegistration;
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, RequestPushNotificationRegistration requestPushNotificationRegistration) {
        encoder.getClass();
        requestPushNotificationRegistration.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        mk9 mk9VarMo15606b = encoder.mo15606b(serialDescriptor);
        String str = requestPushNotificationRegistration.f20423a;
        boolean z = requestPushNotificationRegistration.f20426d;
        mk9VarMo15606b.m16882z(serialDescriptor, 0, str);
        mk9VarMo15606b.m16882z(serialDescriptor, 1, requestPushNotificationRegistration.f20424b);
        mk9VarMo15606b.m16882z(serialDescriptor, 2, requestPushNotificationRegistration.f20425c);
        if (mk9VarMo15606b.m16872B(serialDescriptor) || z) {
            mk9VarMo15606b.m16873q(serialDescriptor, 3, z);
        }
        mk9VarMo15606b.m16871A(serialDescriptor);
    }

    @Override // p000.zk3
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return te1.f62178b;
    }
}
