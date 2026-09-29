package com.lingq.core.database.entity;

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
public final /* synthetic */ class NotificationEntity$$serializer implements zk3 {
    public static final NotificationEntity$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        NotificationEntity$$serializer notificationEntity$$serializer = new NotificationEntity$$serializer();
        INSTANCE = notificationEntity$$serializer;
        bg7 bg7Var = new bg7("com.lingq.core.database.entity.NotificationEntity", notificationEntity$$serializer, 10);
        bg7Var.m3702k("pk", true);
        bg7Var.m3702k("url", false);
        bg7Var.m3702k("language", false);
        bg7Var.m3702k("notificationLanguage", false);
        bg7Var.m3702k("type", false);
        bg7Var.m3702k("title", false);
        bg7Var.m3702k("message", false);
        bg7Var.m3702k("image", false);
        bg7Var.m3702k("isNew", false);
        bg7Var.m3702k("timestamp", false);
        descriptor = bg7Var;
    }

    private NotificationEntity$$serializer() {
    }

    @Override // p000.zk3
    public final KSerializer[] childSerializers() {
        sk9 sk9Var = sk9.f60959a;
        return new KSerializer[]{l84.f49294a, thb.m22059r(sk9Var), thb.m22059r(sk9Var), thb.m22059r(sk9Var), thb.m22059r(sk9Var), thb.m22059r(sk9Var), thb.m22059r(sk9Var), thb.m22059r(sk9Var), thb.m22059r(lf0.f49579a), thb.m22059r(sk9Var)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final NotificationEntity deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        df1 df1VarMo4079b = decoder.mo4079b(serialDescriptor);
        String str = null;
        boolean z = true;
        Boolean bool = null;
        int i = 0;
        int iMo4091q = 0;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
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
                    str2 = (String) df1VarMo4079b.mo4070D(serialDescriptor, 1, sk9.f60959a, str2);
                    i |= 2;
                    break;
                case 2:
                    str3 = (String) df1VarMo4079b.mo4070D(serialDescriptor, 2, sk9.f60959a, str3);
                    i |= 4;
                    break;
                case 3:
                    str4 = (String) df1VarMo4079b.mo4070D(serialDescriptor, 3, sk9.f60959a, str4);
                    i |= 8;
                    break;
                case 4:
                    str5 = (String) df1VarMo4079b.mo4070D(serialDescriptor, 4, sk9.f60959a, str5);
                    i |= 16;
                    break;
                case 5:
                    str6 = (String) df1VarMo4079b.mo4070D(serialDescriptor, 5, sk9.f60959a, str6);
                    i |= 32;
                    break;
                case 6:
                    str7 = (String) df1VarMo4079b.mo4070D(serialDescriptor, 6, sk9.f60959a, str7);
                    i |= 64;
                    break;
                case 7:
                    str8 = (String) df1VarMo4079b.mo4070D(serialDescriptor, 7, sk9.f60959a, str8);
                    i |= 128;
                    break;
                case 8:
                    bool = (Boolean) df1VarMo4079b.mo4070D(serialDescriptor, 8, lf0.f49579a, bool);
                    i |= 256;
                    break;
                case 9:
                    str = (String) df1VarMo4079b.mo4070D(serialDescriptor, 9, sk9.f60959a, str);
                    i |= 512;
                    break;
                default:
                    uk9.m22771e(iMo10319A);
                    return null;
            }
        }
        df1VarMo4079b.mo4086j(serialDescriptor);
        return new NotificationEntity(i, iMo4091q, str2, str3, str4, str5, str6, str7, str8, bool, str);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, NotificationEntity notificationEntity) {
        encoder.getClass();
        notificationEntity.getClass();
        int i = notificationEntity.f17412a;
        SerialDescriptor serialDescriptor = descriptor;
        mk9 mk9VarMo15606b = encoder.mo15606b(serialDescriptor);
        if (mk9VarMo15606b.m16872B(serialDescriptor) || i != 0) {
            mk9VarMo15606b.m16878v(0, i, serialDescriptor);
        }
        sk9 sk9Var = sk9.f60959a;
        mk9VarMo15606b.m16880x(serialDescriptor, 1, sk9Var, notificationEntity.f17413b);
        mk9VarMo15606b.m16880x(serialDescriptor, 2, sk9Var, notificationEntity.f17414c);
        mk9VarMo15606b.m16880x(serialDescriptor, 3, sk9Var, notificationEntity.f17415d);
        mk9VarMo15606b.m16880x(serialDescriptor, 4, sk9Var, notificationEntity.f17416e);
        mk9VarMo15606b.m16880x(serialDescriptor, 5, sk9Var, notificationEntity.f17417f);
        mk9VarMo15606b.m16880x(serialDescriptor, 6, sk9Var, notificationEntity.f17418g);
        mk9VarMo15606b.m16880x(serialDescriptor, 7, sk9Var, notificationEntity.f17419h);
        mk9VarMo15606b.m16880x(serialDescriptor, 8, lf0.f49579a, notificationEntity.f17420i);
        mk9VarMo15606b.m16880x(serialDescriptor, 9, sk9Var, notificationEntity.f17421j);
        mk9VarMo15606b.m16871A(serialDescriptor);
    }

    @Override // p000.zk3
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return te1.f62178b;
    }
}
