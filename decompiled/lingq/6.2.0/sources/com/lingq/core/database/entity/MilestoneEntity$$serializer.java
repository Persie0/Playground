package com.lingq.core.database.entity;

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
public final /* synthetic */ class MilestoneEntity$$serializer implements zk3 {
    public static final MilestoneEntity$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        MilestoneEntity$$serializer milestoneEntity$$serializer = new MilestoneEntity$$serializer();
        INSTANCE = milestoneEntity$$serializer;
        bg7 bg7Var = new bg7("com.lingq.core.database.entity.MilestoneEntity", milestoneEntity$$serializer, 7);
        bg7Var.m3702k("languageAndSlug", false);
        bg7Var.m3702k("language", false);
        bg7Var.m3702k("slug", false);
        bg7Var.m3702k("name", false);
        bg7Var.m3702k("goal", true);
        bg7Var.m3702k("stat", false);
        bg7Var.m3702k("date", true);
        descriptor = bg7Var;
    }

    private MilestoneEntity$$serializer() {
    }

    @Override // p000.zk3
    public final KSerializer[] childSerializers() {
        sk9 sk9Var = sk9.f60959a;
        return new KSerializer[]{sk9Var, thb.m22059r(sk9Var), thb.m22059r(sk9Var), thb.m22059r(sk9Var), l84.f49294a, thb.m22059r(sk9Var), thb.m22059r(sk9Var)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final MilestoneEntity deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        df1 df1VarMo4079b = decoder.mo4079b(serialDescriptor);
        boolean z = true;
        int i = 0;
        int iMo4091q = 0;
        String strMo4097x = null;
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
                    break;
                case 0:
                    strMo4097x = df1VarMo4079b.mo4097x(serialDescriptor, 0);
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
                    iMo4091q = df1VarMo4079b.mo4091q(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    str4 = (String) df1VarMo4079b.mo4070D(serialDescriptor, 5, sk9.f60959a, str4);
                    i |= 32;
                    break;
                case 6:
                    str5 = (String) df1VarMo4079b.mo4070D(serialDescriptor, 6, sk9.f60959a, str5);
                    i |= 64;
                    break;
                default:
                    uk9.m22771e(iMo10319A);
                    return null;
            }
        }
        df1VarMo4079b.mo4086j(serialDescriptor);
        return new MilestoneEntity(i, iMo4091q, strMo4097x, str, str2, str3, str4, str5);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, MilestoneEntity milestoneEntity) {
        encoder.getClass();
        milestoneEntity.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        mk9 mk9VarMo15606b = encoder.mo15606b(serialDescriptor);
        String str = milestoneEntity.f17392a;
        String str2 = milestoneEntity.f17398g;
        int i = milestoneEntity.f17396e;
        mk9VarMo15606b.m16882z(serialDescriptor, 0, str);
        sk9 sk9Var = sk9.f60959a;
        mk9VarMo15606b.m16880x(serialDescriptor, 1, sk9Var, milestoneEntity.f17393b);
        mk9VarMo15606b.m16880x(serialDescriptor, 2, sk9Var, milestoneEntity.f17394c);
        mk9VarMo15606b.m16880x(serialDescriptor, 3, sk9Var, milestoneEntity.f17395d);
        if (mk9VarMo15606b.m16872B(serialDescriptor) || i != 0) {
            mk9VarMo15606b.m16878v(4, i, serialDescriptor);
        }
        mk9VarMo15606b.m16880x(serialDescriptor, 5, sk9Var, milestoneEntity.f17397f);
        if (mk9VarMo15606b.m16872B(serialDescriptor) || str2 != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 6, sk9Var, str2);
        }
        mk9VarMo15606b.m16871A(serialDescriptor);
    }

    @Override // p000.zk3
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return te1.f62178b;
    }
}
