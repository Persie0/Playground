package com.lingq.core.network.api.result;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import p000.bg7;
import p000.cs4;
import p000.df1;
import p000.mk9;
import p000.sk9;
import p000.te1;
import p000.thb;
import p000.uk9;
import p000.zb2;
import p000.zk3;

/* JADX INFO: loaded from: classes2.dex */
@zb2
public final /* synthetic */ class MessageProfile$$serializer implements zk3 {
    public static final MessageProfile$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        MessageProfile$$serializer messageProfile$$serializer = new MessageProfile$$serializer();
        INSTANCE = messageProfile$$serializer;
        bg7 bg7Var = new bg7("com.lingq.core.network.api.result.MessageProfile", messageProfile$$serializer, 6);
        bg7Var.m3702k("body", true);
        bg7Var.m3702k("image", true);
        bg7Var.m3702k("title", true);
        bg7Var.m3702k("type", true);
        bg7Var.m3702k("url", true);
        bg7Var.m3702k("extra", true);
        descriptor = bg7Var;
    }

    private MessageProfile$$serializer() {
    }

    @Override // p000.zk3
    public final KSerializer[] childSerializers() {
        cs4[] cs4VarArr = MessageProfile.f20557g;
        sk9 sk9Var = sk9.f60959a;
        return new KSerializer[]{thb.m22059r(sk9Var), thb.m22059r(sk9Var), thb.m22059r(sk9Var), thb.m22059r(sk9Var), thb.m22059r(sk9Var), thb.m22059r((KSerializer) cs4VarArr[5].getValue())};
    }

    @Override // kotlinx.serialization.KSerializer
    public final MessageProfile deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        df1 df1VarMo4079b = decoder.mo4079b(serialDescriptor);
        cs4[] cs4VarArr = MessageProfile.f20557g;
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        Map map = null;
        while (z) {
            int iMo10319A = df1VarMo4079b.mo10319A(serialDescriptor);
            switch (iMo10319A) {
                case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                    z = false;
                    break;
                case 0:
                    str = (String) df1VarMo4079b.mo4070D(serialDescriptor, 0, sk9.f60959a, str);
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
                    map = (Map) df1VarMo4079b.mo4070D(serialDescriptor, 5, (KSerializer) cs4VarArr[5].getValue(), map);
                    i |= 32;
                    break;
                default:
                    uk9.m22771e(iMo10319A);
                    return null;
            }
        }
        df1VarMo4079b.mo4086j(serialDescriptor);
        return new MessageProfile(i, str, str2, str3, str4, str5, map);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, MessageProfile messageProfile) {
        encoder.getClass();
        messageProfile.getClass();
        Map map = messageProfile.f20563f;
        String str = messageProfile.f20562e;
        String str2 = messageProfile.f20561d;
        String str3 = messageProfile.f20560c;
        String str4 = messageProfile.f20559b;
        String str5 = messageProfile.f20558a;
        SerialDescriptor serialDescriptor = descriptor;
        mk9 mk9VarMo15606b = encoder.mo15606b(serialDescriptor);
        cs4[] cs4VarArr = MessageProfile.f20557g;
        if (mk9VarMo15606b.m16872B(serialDescriptor) || str5 != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 0, sk9.f60959a, str5);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || str4 != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 1, sk9.f60959a, str4);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || str3 != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 2, sk9.f60959a, str3);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || str2 != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 3, sk9.f60959a, str2);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || str != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 4, sk9.f60959a, str);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || map != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 5, (KSerializer) cs4VarArr[5].getValue(), map);
        }
        mk9VarMo15606b.m16871A(serialDescriptor);
    }

    @Override // p000.zk3
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return te1.f62178b;
    }
}
