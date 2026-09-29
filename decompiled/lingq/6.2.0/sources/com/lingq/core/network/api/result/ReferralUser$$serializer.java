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
public final /* synthetic */ class ReferralUser$$serializer implements zk3 {
    public static final ReferralUser$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ReferralUser$$serializer referralUser$$serializer = new ReferralUser$$serializer();
        INSTANCE = referralUser$$serializer;
        bg7 bg7Var = new bg7("com.lingq.core.network.api.result.ReferralUser", referralUser$$serializer, 6);
        bg7Var.m3702k("activity_index", true);
        bg7Var.m3702k("deleted", true);
        bg7Var.m3702k("description", true);
        bg7Var.m3702k("id", true);
        bg7Var.m3702k("photo", true);
        bg7Var.m3702k("username", true);
        descriptor = bg7Var;
    }

    private ReferralUser$$serializer() {
    }

    @Override // p000.zk3
    public final KSerializer[] childSerializers() {
        l84 l84Var = l84.f49294a;
        KSerializer kSerializerM22059r = thb.m22059r(l84Var);
        KSerializer kSerializerM22059r2 = thb.m22059r(lf0.f49579a);
        sk9 sk9Var = sk9.f60959a;
        return new KSerializer[]{kSerializerM22059r, kSerializerM22059r2, thb.m22059r(sk9Var), thb.m22059r(l84Var), thb.m22059r(sk9Var), thb.m22059r(sk9Var)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final ReferralUser deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        df1 df1VarMo4079b = decoder.mo4079b(serialDescriptor);
        boolean z = true;
        int i = 0;
        Integer num = null;
        Boolean bool = null;
        String str = null;
        Integer num2 = null;
        String str2 = null;
        String str3 = null;
        while (z) {
            int iMo10319A = df1VarMo4079b.mo10319A(serialDescriptor);
            switch (iMo10319A) {
                case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                    z = false;
                    break;
                case 0:
                    num = (Integer) df1VarMo4079b.mo4070D(serialDescriptor, 0, l84.f49294a, num);
                    i |= 1;
                    break;
                case 1:
                    bool = (Boolean) df1VarMo4079b.mo4070D(serialDescriptor, 1, lf0.f49579a, bool);
                    i |= 2;
                    break;
                case 2:
                    str = (String) df1VarMo4079b.mo4070D(serialDescriptor, 2, sk9.f60959a, str);
                    i |= 4;
                    break;
                case 3:
                    num2 = (Integer) df1VarMo4079b.mo4070D(serialDescriptor, 3, l84.f49294a, num2);
                    i |= 8;
                    break;
                case 4:
                    str2 = (String) df1VarMo4079b.mo4070D(serialDescriptor, 4, sk9.f60959a, str2);
                    i |= 16;
                    break;
                case 5:
                    str3 = (String) df1VarMo4079b.mo4070D(serialDescriptor, 5, sk9.f60959a, str3);
                    i |= 32;
                    break;
                default:
                    uk9.m22771e(iMo10319A);
                    return null;
            }
        }
        df1VarMo4079b.mo4086j(serialDescriptor);
        return new ReferralUser(i, num, bool, str, num2, str2, str3);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, ReferralUser referralUser) {
        encoder.getClass();
        referralUser.getClass();
        String str = referralUser.f20601f;
        String str2 = referralUser.f20600e;
        Integer num = referralUser.f20599d;
        String str3 = referralUser.f20598c;
        Boolean bool = referralUser.f20597b;
        Integer num2 = referralUser.f20596a;
        SerialDescriptor serialDescriptor = descriptor;
        mk9 mk9VarMo15606b = encoder.mo15606b(serialDescriptor);
        if (mk9VarMo15606b.m16872B(serialDescriptor) || num2 != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 0, l84.f49294a, num2);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || bool != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 1, lf0.f49579a, bool);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || str3 != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 2, sk9.f60959a, str3);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || num != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 3, l84.f49294a, num);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || str2 != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 4, sk9.f60959a, str2);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || str != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 5, sk9.f60959a, str);
        }
        mk9VarMo15606b.m16871A(serialDescriptor);
    }

    @Override // p000.zk3
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return te1.f62178b;
    }
}
