package com.lingq.core.network.api.requests;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import p000.bg7;
import p000.df1;
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
public final /* synthetic */ class RequestDailyStreakTarget$$serializer implements zk3 {
    public static final RequestDailyStreakTarget$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        RequestDailyStreakTarget$$serializer requestDailyStreakTarget$$serializer = new RequestDailyStreakTarget$$serializer();
        INSTANCE = requestDailyStreakTarget$$serializer;
        bg7 bg7Var = new bg7("com.lingq.core.network.api.requests.RequestDailyStreakTarget", requestDailyStreakTarget$$serializer, 2);
        bg7Var.m3702k("intense", false);
        bg7Var.m3702k("streak_goal", true);
        descriptor = bg7Var;
    }

    private RequestDailyStreakTarget$$serializer() {
    }

    @Override // p000.zk3
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{sk9.f60959a, thb.m22059r(l84.f49294a)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final RequestDailyStreakTarget deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        df1 df1VarMo4079b = decoder.mo4079b(serialDescriptor);
        boolean z = true;
        int i = 0;
        String strMo4097x = null;
        Integer num = null;
        while (z) {
            int iMo10319A = df1VarMo4079b.mo10319A(serialDescriptor);
            if (iMo10319A == -1) {
                z = false;
            } else if (iMo10319A == 0) {
                strMo4097x = df1VarMo4079b.mo4097x(serialDescriptor, 0);
                i |= 1;
            } else {
                if (iMo10319A != 1) {
                    uk9.m22771e(iMo10319A);
                    return null;
                }
                num = (Integer) df1VarMo4079b.mo4070D(serialDescriptor, 1, l84.f49294a, num);
                i |= 2;
            }
        }
        df1VarMo4079b.mo4086j(serialDescriptor);
        return new RequestDailyStreakTarget(i, num, strMo4097x);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, RequestDailyStreakTarget requestDailyStreakTarget) {
        encoder.getClass();
        requestDailyStreakTarget.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        mk9 mk9VarMo15606b = encoder.mo15606b(serialDescriptor);
        String str = requestDailyStreakTarget.f20342a;
        Integer num = requestDailyStreakTarget.f20343b;
        mk9VarMo15606b.m16882z(serialDescriptor, 0, str);
        if (mk9VarMo15606b.m16872B(serialDescriptor) || num != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 1, l84.f49294a, num);
        }
        mk9VarMo15606b.m16871A(serialDescriptor);
    }

    @Override // p000.zk3
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return te1.f62178b;
    }
}
