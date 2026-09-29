package com.lingq.core.database.entity;

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
import p000.uk9;
import p000.zb2;
import p000.zk3;

/* JADX INFO: loaded from: classes2.dex */
@zb2
public final /* synthetic */ class ChatSuggestionEntity$$serializer implements zk3 {
    public static final ChatSuggestionEntity$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ChatSuggestionEntity$$serializer chatSuggestionEntity$$serializer = new ChatSuggestionEntity$$serializer();
        INSTANCE = chatSuggestionEntity$$serializer;
        bg7 bg7Var = new bg7("com.lingq.core.database.entity.ChatSuggestionEntity", chatSuggestionEntity$$serializer, 5);
        bg7Var.m3702k("language", false);
        bg7Var.m3702k("chatId", false);
        bg7Var.m3702k("position", false);
        bg7Var.m3702k("source", false);
        bg7Var.m3702k("target", false);
        descriptor = bg7Var;
    }

    private ChatSuggestionEntity$$serializer() {
    }

    @Override // p000.zk3
    public final KSerializer[] childSerializers() {
        sk9 sk9Var = sk9.f60959a;
        l84 l84Var = l84.f49294a;
        return new KSerializer[]{sk9Var, l84Var, l84Var, sk9Var, sk9Var};
    }

    @Override // kotlinx.serialization.KSerializer
    public final ChatSuggestionEntity deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        df1 df1VarMo4079b = decoder.mo4079b(serialDescriptor);
        boolean z = true;
        int i = 0;
        int iMo4091q = 0;
        int iMo4091q2 = 0;
        String strMo4097x = null;
        String strMo4097x2 = null;
        String strMo4097x3 = null;
        while (z) {
            int iMo10319A = df1VarMo4079b.mo10319A(serialDescriptor);
            if (iMo10319A == -1) {
                z = false;
            } else if (iMo10319A == 0) {
                strMo4097x = df1VarMo4079b.mo4097x(serialDescriptor, 0);
                i |= 1;
            } else if (iMo10319A == 1) {
                iMo4091q = df1VarMo4079b.mo4091q(serialDescriptor, 1);
                i |= 2;
            } else if (iMo10319A == 2) {
                iMo4091q2 = df1VarMo4079b.mo4091q(serialDescriptor, 2);
                i |= 4;
            } else if (iMo10319A == 3) {
                strMo4097x2 = df1VarMo4079b.mo4097x(serialDescriptor, 3);
                i |= 8;
            } else {
                if (iMo10319A != 4) {
                    uk9.m22771e(iMo10319A);
                    return null;
                }
                strMo4097x3 = df1VarMo4079b.mo4097x(serialDescriptor, 4);
                i |= 16;
            }
        }
        df1VarMo4079b.mo4086j(serialDescriptor);
        return new ChatSuggestionEntity(i, iMo4091q, iMo4091q2, strMo4097x, strMo4097x2, strMo4097x3);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, ChatSuggestionEntity chatSuggestionEntity) {
        encoder.getClass();
        chatSuggestionEntity.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        mk9 mk9VarMo15606b = encoder.mo15606b(serialDescriptor);
        mk9VarMo15606b.m16882z(serialDescriptor, 0, chatSuggestionEntity.f17120a);
        mk9VarMo15606b.m16878v(1, chatSuggestionEntity.f17121b, serialDescriptor);
        mk9VarMo15606b.m16878v(2, chatSuggestionEntity.f17122c, serialDescriptor);
        mk9VarMo15606b.m16882z(serialDescriptor, 3, chatSuggestionEntity.f17123d);
        mk9VarMo15606b.m16882z(serialDescriptor, 4, chatSuggestionEntity.f17124e);
        mk9VarMo15606b.m16871A(serialDescriptor);
    }

    @Override // p000.zk3
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return te1.f62178b;
    }
}
