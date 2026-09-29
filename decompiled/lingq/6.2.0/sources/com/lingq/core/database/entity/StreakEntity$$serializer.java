package com.lingq.core.database.entity;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import p000.bg7;
import p000.df1;
import p000.dj2;
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
public final /* synthetic */ class StreakEntity$$serializer implements zk3 {
    public static final StreakEntity$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        StreakEntity$$serializer streakEntity$$serializer = new StreakEntity$$serializer();
        INSTANCE = streakEntity$$serializer;
        bg7 bg7Var = new bg7("com.lingq.core.database.entity.StreakEntity", streakEntity$$serializer, 6);
        bg7Var.m3702k("language", false);
        bg7Var.m3702k("streakDays", false);
        bg7Var.m3702k("coins", false);
        bg7Var.m3702k("latestStreakDays", false);
        bg7Var.m3702k("isStreakBroken", false);
        bg7Var.m3702k("brokenStreakDate", true);
        descriptor = bg7Var;
    }

    private StreakEntity$$serializer() {
    }

    @Override // p000.zk3
    public final KSerializer[] childSerializers() {
        sk9 sk9Var = sk9.f60959a;
        l84 l84Var = l84.f49294a;
        return new KSerializer[]{sk9Var, thb.m22059r(l84Var), thb.m22059r(dj2.f35711a), thb.m22059r(l84Var), thb.m22059r(lf0.f49579a), thb.m22059r(sk9Var)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final StreakEntity deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        df1 df1VarMo4079b = decoder.mo4079b(serialDescriptor);
        boolean z = true;
        int i = 0;
        String strMo4097x = null;
        Integer num = null;
        Double d = null;
        Integer num2 = null;
        Boolean bool = null;
        String str = null;
        while (z) {
            int iMo10319A = df1VarMo4079b.mo10319A(serialDescriptor);
            switch (iMo10319A) {
                case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                    z = false;
                    break;
                case 0:
                    strMo4097x = df1VarMo4079b.mo4097x(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    num = (Integer) df1VarMo4079b.mo4070D(serialDescriptor, 1, l84.f49294a, num);
                    i |= 2;
                    break;
                case 2:
                    d = (Double) df1VarMo4079b.mo4070D(serialDescriptor, 2, dj2.f35711a, d);
                    i |= 4;
                    break;
                case 3:
                    num2 = (Integer) df1VarMo4079b.mo4070D(serialDescriptor, 3, l84.f49294a, num2);
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
                default:
                    uk9.m22771e(iMo10319A);
                    return null;
            }
        }
        df1VarMo4079b.mo4086j(serialDescriptor);
        return new StreakEntity(i, strMo4097x, num, d, num2, bool, str);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, StreakEntity streakEntity) {
        encoder.getClass();
        streakEntity.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        mk9 mk9VarMo15606b = encoder.mo15606b(serialDescriptor);
        String str = streakEntity.f17455a;
        String str2 = streakEntity.f17460f;
        mk9VarMo15606b.m16882z(serialDescriptor, 0, str);
        l84 l84Var = l84.f49294a;
        mk9VarMo15606b.m16880x(serialDescriptor, 1, l84Var, streakEntity.f17456b);
        mk9VarMo15606b.m16880x(serialDescriptor, 2, dj2.f35711a, streakEntity.f17457c);
        mk9VarMo15606b.m16880x(serialDescriptor, 3, l84Var, streakEntity.f17458d);
        mk9VarMo15606b.m16880x(serialDescriptor, 4, lf0.f49579a, streakEntity.f17459e);
        if (mk9VarMo15606b.m16872B(serialDescriptor) || str2 != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 5, sk9.f60959a, str2);
        }
        mk9VarMo15606b.m16871A(serialDescriptor);
    }

    @Override // p000.zk3
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return te1.f62178b;
    }
}
