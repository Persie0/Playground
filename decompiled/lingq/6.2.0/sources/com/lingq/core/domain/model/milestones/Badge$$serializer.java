package com.lingq.core.domain.model.milestones;

import com.android.installreferrer.api.InstallReferrerClient;
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
public final /* synthetic */ class Badge$$serializer implements zk3 {
    public static final Badge$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        Badge$$serializer badge$$serializer = new Badge$$serializer();
        INSTANCE = badge$$serializer;
        bg7 bg7Var = new bg7("com.lingq.core.domain.model.milestones.Badge", badge$$serializer, 7);
        bg7Var.m3702k("languageAndSlug", false);
        bg7Var.m3702k("language", false);
        bg7Var.m3702k("slug", false);
        bg7Var.m3702k("name", false);
        bg7Var.m3702k("goal", true);
        bg7Var.m3702k("gainedAt", false);
        bg7Var.m3702k("imageUrl", true);
        descriptor = bg7Var;
    }

    private Badge$$serializer() {
    }

    @Override // p000.zk3
    public final KSerializer[] childSerializers() {
        sk9 sk9Var = sk9.f60959a;
        return new KSerializer[]{sk9Var, sk9Var, sk9Var, sk9Var, l84.f49294a, sk9Var, thb.m22059r(sk9Var)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Badge deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        df1 df1VarMo4079b = decoder.mo4079b(serialDescriptor);
        boolean z = true;
        int i = 0;
        int iMo4091q = 0;
        String strMo4097x = null;
        String strMo4097x2 = null;
        String strMo4097x3 = null;
        String strMo4097x4 = null;
        String strMo4097x5 = null;
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
                    strMo4097x2 = df1VarMo4079b.mo4097x(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    strMo4097x3 = df1VarMo4079b.mo4097x(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    strMo4097x4 = df1VarMo4079b.mo4097x(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    iMo4091q = df1VarMo4079b.mo4091q(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    strMo4097x5 = df1VarMo4079b.mo4097x(serialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    str = (String) df1VarMo4079b.mo4070D(serialDescriptor, 6, sk9.f60959a, str);
                    i |= 64;
                    break;
                default:
                    uk9.m22771e(iMo10319A);
                    return null;
            }
        }
        df1VarMo4079b.mo4086j(serialDescriptor);
        return new Badge(i, iMo4091q, strMo4097x, strMo4097x2, strMo4097x3, strMo4097x4, strMo4097x5, str);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Badge badge) {
        encoder.getClass();
        badge.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        mk9 mk9VarMo15606b = encoder.mo15606b(serialDescriptor);
        String str = badge.f19507a;
        String str2 = badge.f19513g;
        int i = badge.f19511e;
        mk9VarMo15606b.m16882z(serialDescriptor, 0, str);
        mk9VarMo15606b.m16882z(serialDescriptor, 1, badge.f19508b);
        mk9VarMo15606b.m16882z(serialDescriptor, 2, badge.f19509c);
        mk9VarMo15606b.m16882z(serialDescriptor, 3, badge.f19510d);
        if (mk9VarMo15606b.m16872B(serialDescriptor) || i != 0) {
            mk9VarMo15606b.m16878v(4, i, serialDescriptor);
        }
        mk9VarMo15606b.m16882z(serialDescriptor, 5, badge.f19512f);
        if (mk9VarMo15606b.m16872B(serialDescriptor) || str2 != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 6, sk9.f60959a, str2);
        }
        mk9VarMo15606b.m16871A(serialDescriptor);
    }

    @Override // p000.zk3
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return te1.f62178b;
    }
}
