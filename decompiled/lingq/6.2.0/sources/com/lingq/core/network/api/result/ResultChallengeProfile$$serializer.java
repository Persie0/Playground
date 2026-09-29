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
public final /* synthetic */ class ResultChallengeProfile$$serializer implements zk3 {
    public static final ResultChallengeProfile$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ResultChallengeProfile$$serializer resultChallengeProfile$$serializer = new ResultChallengeProfile$$serializer();
        INSTANCE = resultChallengeProfile$$serializer;
        bg7 bg7Var = new bg7("com.lingq.core.network.api.result.ResultChallengeProfile", resultChallengeProfile$$serializer, 8);
        bg7Var.m3702k("id", true);
        bg7Var.m3702k("username", true);
        bg7Var.m3702k("description", true);
        bg7Var.m3702k("blog_url", true);
        bg7Var.m3702k("activity_index", true);
        bg7Var.m3702k("deleted", true);
        bg7Var.m3702k("photo", true);
        bg7Var.m3702k("role", true);
        descriptor = bg7Var;
    }

    private ResultChallengeProfile$$serializer() {
    }

    @Override // p000.zk3
    public final KSerializer[] childSerializers() {
        sk9 sk9Var = sk9.f60959a;
        KSerializer kSerializerM22059r = thb.m22059r(sk9Var);
        KSerializer kSerializerM22059r2 = thb.m22059r(sk9Var);
        KSerializer kSerializerM22059r3 = thb.m22059r(sk9Var);
        KSerializer kSerializerM22059r4 = thb.m22059r(sk9Var);
        KSerializer kSerializerM22059r5 = thb.m22059r(sk9Var);
        l84 l84Var = l84.f49294a;
        return new KSerializer[]{l84Var, kSerializerM22059r, kSerializerM22059r2, kSerializerM22059r3, l84Var, lf0.f49579a, kSerializerM22059r4, kSerializerM22059r5};
    }

    @Override // kotlinx.serialization.KSerializer
    public final ResultChallengeProfile deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        df1 df1VarMo4079b = decoder.mo4079b(serialDescriptor);
        ResultChallengeProfile resultChallengeProfile = null;
        boolean z = true;
        int i = 0;
        int iMo4091q = 0;
        int iMo4091q2 = 0;
        boolean zMo4094v = false;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
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
                    str = (String) df1VarMo4079b.mo4070D(serialDescriptor, 1, sk9.f60959a, str);
                    i |= 2;
                    break;
                case 2:
                    str2 = (String) df1VarMo4079b.mo4070D(serialDescriptor, 2, sk9.f60959a, str2);
                    i |= 4;
                    break;
                case 3:
                    str3 = (String) df1VarMo4079b.mo4070D(serialDescriptor, 3, sk9.f60959a, str3);
                    i |= 8;
                    break;
                case 4:
                    iMo4091q2 = df1VarMo4079b.mo4091q(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    zMo4094v = df1VarMo4079b.mo4094v(serialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    str4 = (String) df1VarMo4079b.mo4070D(serialDescriptor, 6, sk9.f60959a, str4);
                    i |= 64;
                    break;
                case 7:
                    str5 = (String) df1VarMo4079b.mo4070D(serialDescriptor, 7, sk9.f60959a, str5);
                    i |= 128;
                    break;
                default:
                    uk9.m22771e(iMo10319A);
                    return resultChallengeProfile;
            }
            resultChallengeProfile = null;
        }
        df1VarMo4079b.mo4086j(serialDescriptor);
        return new ResultChallengeProfile(i, iMo4091q, str, str2, str3, iMo4091q2, zMo4094v, str4, str5);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, ResultChallengeProfile resultChallengeProfile) {
        encoder.getClass();
        resultChallengeProfile.getClass();
        String str = resultChallengeProfile.f20683h;
        String str2 = resultChallengeProfile.f20682g;
        boolean z = resultChallengeProfile.f20681f;
        int i = resultChallengeProfile.f20680e;
        String str3 = resultChallengeProfile.f20679d;
        String str4 = resultChallengeProfile.f20678c;
        String str5 = resultChallengeProfile.f20677b;
        int i2 = resultChallengeProfile.f20676a;
        SerialDescriptor serialDescriptor = descriptor;
        mk9 mk9VarMo15606b = encoder.mo15606b(serialDescriptor);
        if (mk9VarMo15606b.m16872B(serialDescriptor) || i2 != 0) {
            mk9VarMo15606b.m16878v(0, i2, serialDescriptor);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || str5 != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 1, sk9.f60959a, str5);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || str4 != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 2, sk9.f60959a, str4);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || str3 != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 3, sk9.f60959a, str3);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || i != 0) {
            mk9VarMo15606b.m16878v(4, i, serialDescriptor);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || z) {
            mk9VarMo15606b.m16873q(serialDescriptor, 5, z);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || str2 != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 6, sk9.f60959a, str2);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || str != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 7, sk9.f60959a, str);
        }
        mk9VarMo15606b.m16871A(serialDescriptor);
    }

    @Override // p000.zk3
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return te1.f62178b;
    }
}
