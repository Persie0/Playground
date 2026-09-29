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
public final /* synthetic */ class ProviderEntity$$serializer implements zk3 {
    public static final ProviderEntity$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ProviderEntity$$serializer providerEntity$$serializer = new ProviderEntity$$serializer();
        INSTANCE = providerEntity$$serializer;
        bg7 bg7Var = new bg7("com.lingq.core.database.entity.ProviderEntity", providerEntity$$serializer, 6);
        bg7Var.m3702k("id", false);
        bg7Var.m3702k("language", false);
        bg7Var.m3702k("description", false);
        bg7Var.m3702k("image", false);
        bg7Var.m3702k("title", false);
        bg7Var.m3702k("url", false);
        descriptor = bg7Var;
    }

    private ProviderEntity$$serializer() {
    }

    @Override // p000.zk3
    public final KSerializer[] childSerializers() {
        sk9 sk9Var = sk9.f60959a;
        return new KSerializer[]{l84.f49294a, sk9Var, thb.m22059r(sk9Var), thb.m22059r(sk9Var), thb.m22059r(sk9Var), thb.m22059r(sk9Var)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final ProviderEntity deserialize(Decoder decoder) {
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
        while (z) {
            int iMo10319A = df1VarMo4079b.mo10319A(serialDescriptor);
            switch (iMo10319A) {
                case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                    z = false;
                    break;
                case 0:
                    iMo4091q = df1VarMo4079b.mo4091q(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    strMo4097x = df1VarMo4079b.mo4097x(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    str = (String) df1VarMo4079b.mo4070D(serialDescriptor, 2, sk9.f60959a, str);
                    i |= 4;
                    break;
                case 3:
                    str2 = (String) df1VarMo4079b.mo4070D(serialDescriptor, 3, sk9.f60959a, str2);
                    i |= 8;
                    break;
                case 4:
                    str3 = (String) df1VarMo4079b.mo4070D(serialDescriptor, 4, sk9.f60959a, str3);
                    i |= 16;
                    break;
                case 5:
                    str4 = (String) df1VarMo4079b.mo4070D(serialDescriptor, 5, sk9.f60959a, str4);
                    i |= 32;
                    break;
                default:
                    uk9.m22771e(iMo10319A);
                    return null;
            }
        }
        df1VarMo4079b.mo4086j(serialDescriptor);
        return new ProviderEntity(i, iMo4091q, strMo4097x, str, str2, str3, str4);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, ProviderEntity providerEntity) {
        encoder.getClass();
        providerEntity.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        mk9 mk9VarMo15606b = encoder.mo15606b(serialDescriptor);
        mk9VarMo15606b.m16878v(0, providerEntity.f17429a, serialDescriptor);
        mk9VarMo15606b.m16882z(serialDescriptor, 1, providerEntity.f17430b);
        sk9 sk9Var = sk9.f60959a;
        mk9VarMo15606b.m16880x(serialDescriptor, 2, sk9Var, providerEntity.f17431c);
        mk9VarMo15606b.m16880x(serialDescriptor, 3, sk9Var, providerEntity.f17432d);
        mk9VarMo15606b.m16880x(serialDescriptor, 4, sk9Var, providerEntity.f17433e);
        mk9VarMo15606b.m16880x(serialDescriptor, 5, sk9Var, providerEntity.f17434f);
        mk9VarMo15606b.m16871A(serialDescriptor);
    }

    @Override // p000.zk3
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return te1.f62178b;
    }
}
