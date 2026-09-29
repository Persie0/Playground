package com.lingq.core.domain.model.chat;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import p000.bg7;
import p000.cs4;
import p000.df1;
import p000.fa4;
import p000.l84;
import p000.lf0;
import p000.mk9;
import p000.sk9;
import p000.te1;
import p000.uk9;
import p000.zb2;
import p000.zk3;

/* JADX INFO: loaded from: classes2.dex */
@zb2
public final /* synthetic */ class ChatMessage$$serializer implements zk3 {
    public static final ChatMessage$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ChatMessage$$serializer chatMessage$$serializer = new ChatMessage$$serializer();
        INSTANCE = chatMessage$$serializer;
        bg7 bg7Var = new bg7("com.lingq.core.domain.model.chat.ChatMessage", chatMessage$$serializer, 9);
        bg7Var.m3702k("index", false);
        bg7Var.m3702k("role", false);
        bg7Var.m3702k("name", false);
        bg7Var.m3702k("message", false);
        bg7Var.m3702k("phrases", true);
        bg7Var.m3702k("translation", true);
        bg7Var.m3702k("notes", true);
        bg7Var.m3702k("correction", true);
        bg7Var.m3702k("includedInImport", true);
        descriptor = bg7Var;
    }

    private ChatMessage$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.zk3
    public final KSerializer[] childSerializers() {
        cs4[] cs4VarArr = ChatMessage.f18919j;
        sk9 sk9Var = sk9.f60959a;
        return new KSerializer[]{l84.f49294a, sk9Var, sk9Var, sk9Var, cs4VarArr[4].getValue(), sk9Var, sk9Var, sk9Var, lf0.f49579a};
    }

    @Override // kotlinx.serialization.KSerializer
    public final ChatMessage deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        df1 df1VarMo4079b = decoder.mo4079b(serialDescriptor);
        cs4[] cs4VarArr = ChatMessage.f18919j;
        ChatMessage chatMessage = null;
        boolean z = true;
        int i = 0;
        int iMo4091q = 0;
        boolean zMo4094v = false;
        String strMo4097x = null;
        String strMo4097x2 = null;
        String strMo4097x3 = null;
        List list = null;
        String strMo4097x4 = null;
        String strMo4097x5 = null;
        String strMo4097x6 = null;
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
                    strMo4097x3 = df1VarMo4079b.mo4097x(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    list = (List) df1VarMo4079b.mo4073G(serialDescriptor, 4, (KSerializer) cs4VarArr[4].getValue(), list);
                    i |= 16;
                    break;
                case 5:
                    strMo4097x4 = df1VarMo4079b.mo4097x(serialDescriptor, 5);
                    i |= 32;
                    continue;
                case 6:
                    strMo4097x5 = df1VarMo4079b.mo4097x(serialDescriptor, 6);
                    i |= 64;
                    continue;
                case 7:
                    strMo4097x6 = df1VarMo4079b.mo4097x(serialDescriptor, 7);
                    i |= 128;
                    continue;
                case 8:
                    zMo4094v = df1VarMo4079b.mo4094v(serialDescriptor, 8);
                    i |= 256;
                    continue;
                default:
                    uk9.m22771e(iMo10319A);
                    return chatMessage;
            }
            chatMessage = null;
        }
        df1VarMo4079b.mo4086j(serialDescriptor);
        return new ChatMessage(i, iMo4091q, strMo4097x, strMo4097x2, strMo4097x3, list, strMo4097x4, strMo4097x5, strMo4097x6, zMo4094v);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, ChatMessage chatMessage) {
        encoder.getClass();
        chatMessage.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        mk9 mk9VarMo15606b = encoder.mo15606b(serialDescriptor);
        cs4[] cs4VarArr = ChatMessage.f18919j;
        int i = chatMessage.f18920a;
        boolean z = chatMessage.f18928i;
        String str = chatMessage.f18927h;
        String str2 = chatMessage.f18926g;
        String str3 = chatMessage.f18925f;
        List list = chatMessage.f18924e;
        mk9VarMo15606b.m16878v(0, i, serialDescriptor);
        mk9VarMo15606b.m16882z(serialDescriptor, 1, chatMessage.f18921b);
        mk9VarMo15606b.m16882z(serialDescriptor, 2, chatMessage.f18922c);
        mk9VarMo15606b.m16882z(serialDescriptor, 3, chatMessage.f18923d);
        if (mk9VarMo15606b.m16872B(serialDescriptor) || !fa4.m11650l(list, EmptyList.f47638a)) {
            mk9VarMo15606b.m16881y(serialDescriptor, 4, (KSerializer) cs4VarArr[4].getValue(), list);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || !fa4.m11650l(str3, "")) {
            mk9VarMo15606b.m16882z(serialDescriptor, 5, str3);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || !fa4.m11650l(str2, "")) {
            mk9VarMo15606b.m16882z(serialDescriptor, 6, str2);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || !fa4.m11650l(str, "")) {
            mk9VarMo15606b.m16882z(serialDescriptor, 7, str);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || z) {
            mk9VarMo15606b.m16873q(serialDescriptor, 8, z);
        }
        mk9VarMo15606b.m16871A(serialDescriptor);
    }

    @Override // p000.zk3
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return te1.f62178b;
    }
}
