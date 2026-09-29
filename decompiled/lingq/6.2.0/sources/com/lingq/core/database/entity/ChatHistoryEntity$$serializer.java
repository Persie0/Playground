package com.lingq.core.database.entity;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import p000.bg7;
import p000.cs4;
import p000.df1;
import p000.dj2;
import p000.l84;
import p000.mk9;
import p000.sk9;
import p000.te1;
import p000.uk9;
import p000.zb2;
import p000.zk3;

/* JADX INFO: loaded from: classes2.dex */
@zb2
public final /* synthetic */ class ChatHistoryEntity$$serializer implements zk3 {
    public static final ChatHistoryEntity$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ChatHistoryEntity$$serializer chatHistoryEntity$$serializer = new ChatHistoryEntity$$serializer();
        INSTANCE = chatHistoryEntity$$serializer;
        bg7 bg7Var = new bg7("com.lingq.core.database.entity.ChatHistoryEntity", chatHistoryEntity$$serializer, 9);
        bg7Var.m3702k("id", false);
        bg7Var.m3702k("title", false);
        bg7Var.m3702k("image", false);
        bg7Var.m3702k("coins", false);
        bg7Var.m3702k("targetLanguage", false);
        bg7Var.m3702k("dictionaryLanguage", false);
        bg7Var.m3702k("startedAt", false);
        bg7Var.m3702k("updatedAt", false);
        bg7Var.m3702k("history", false);
        descriptor = bg7Var;
    }

    private ChatHistoryEntity$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.zk3
    public final KSerializer[] childSerializers() {
        cs4[] cs4VarArr = ChatHistoryEntity.f17092j;
        sk9 sk9Var = sk9.f60959a;
        return new KSerializer[]{l84.f49294a, sk9Var, sk9Var, dj2.f35711a, sk9Var, sk9Var, sk9Var, sk9Var, cs4VarArr[8].getValue()};
    }

    @Override // kotlinx.serialization.KSerializer
    public final ChatHistoryEntity deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        df1 df1VarMo4079b = decoder.mo4079b(serialDescriptor);
        cs4[] cs4VarArr = ChatHistoryEntity.f17092j;
        ChatHistoryEntity chatHistoryEntity = null;
        int i = 0;
        int iMo4091q = 0;
        String strMo4097x = null;
        String strMo4097x2 = null;
        String strMo4097x3 = null;
        String strMo4097x4 = null;
        String strMo4097x5 = null;
        String strMo4097x6 = null;
        double dMo4072F = 0.0d;
        boolean z = true;
        List list = null;
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
                    strMo4097x = df1VarMo4079b.mo4097x(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    strMo4097x2 = df1VarMo4079b.mo4097x(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    dMo4072F = df1VarMo4079b.mo4072F(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    strMo4097x3 = df1VarMo4079b.mo4097x(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    strMo4097x4 = df1VarMo4079b.mo4097x(serialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    strMo4097x5 = df1VarMo4079b.mo4097x(serialDescriptor, 6);
                    i |= 64;
                    break;
                case 7:
                    strMo4097x6 = df1VarMo4079b.mo4097x(serialDescriptor, 7);
                    i |= 128;
                    break;
                case 8:
                    list = (List) df1VarMo4079b.mo4073G(serialDescriptor, 8, (KSerializer) cs4VarArr[8].getValue(), list);
                    i |= 256;
                    break;
                default:
                    uk9.m22771e(iMo10319A);
                    return chatHistoryEntity;
            }
            chatHistoryEntity = null;
        }
        df1VarMo4079b.mo4086j(serialDescriptor);
        return new ChatHistoryEntity(i, iMo4091q, strMo4097x, strMo4097x2, dMo4072F, strMo4097x3, strMo4097x4, strMo4097x5, strMo4097x6, list);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, ChatHistoryEntity chatHistoryEntity) {
        encoder.getClass();
        chatHistoryEntity.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        mk9 mk9VarMo15606b = encoder.mo15606b(serialDescriptor);
        cs4[] cs4VarArr = ChatHistoryEntity.f17092j;
        mk9VarMo15606b.m16878v(0, chatHistoryEntity.f17093a, serialDescriptor);
        mk9VarMo15606b.m16882z(serialDescriptor, 1, chatHistoryEntity.f17094b);
        mk9VarMo15606b.m16882z(serialDescriptor, 2, chatHistoryEntity.f17095c);
        mk9VarMo15606b.m16874r(serialDescriptor, 3, chatHistoryEntity.f17096d);
        mk9VarMo15606b.m16882z(serialDescriptor, 4, chatHistoryEntity.f17097e);
        mk9VarMo15606b.m16882z(serialDescriptor, 5, chatHistoryEntity.f17098f);
        mk9VarMo15606b.m16882z(serialDescriptor, 6, chatHistoryEntity.f17099g);
        mk9VarMo15606b.m16882z(serialDescriptor, 7, chatHistoryEntity.f17100h);
        mk9VarMo15606b.m16881y(serialDescriptor, 8, (KSerializer) cs4VarArr[8].getValue(), chatHistoryEntity.f17101i);
        mk9VarMo15606b.m16871A(serialDescriptor);
    }

    @Override // p000.zk3
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return te1.f62178b;
    }
}
