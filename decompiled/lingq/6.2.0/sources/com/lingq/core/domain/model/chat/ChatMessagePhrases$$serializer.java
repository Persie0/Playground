package com.lingq.core.domain.model.chat;

import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import p000.bg7;
import p000.cs4;
import p000.df1;
import p000.l84;
import p000.mk9;
import p000.te1;
import p000.uk9;
import p000.zb2;
import p000.zk3;

/* JADX INFO: loaded from: classes2.dex */
@zb2
public final /* synthetic */ class ChatMessagePhrases$$serializer implements zk3 {
    public static final ChatMessagePhrases$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ChatMessagePhrases$$serializer chatMessagePhrases$$serializer = new ChatMessagePhrases$$serializer();
        INSTANCE = chatMessagePhrases$$serializer;
        bg7 bg7Var = new bg7("com.lingq.core.domain.model.chat.ChatMessagePhrases", chatMessagePhrases$$serializer, 3);
        bg7Var.m3702k("chatId", false);
        bg7Var.m3702k("messageIndex", false);
        bg7Var.m3702k("phrases", false);
        descriptor = bg7Var;
    }

    private ChatMessagePhrases$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.zk3
    public final KSerializer[] childSerializers() {
        cs4[] cs4VarArr = ChatMessagePhrases.f18929d;
        l84 l84Var = l84.f49294a;
        return new KSerializer[]{l84Var, l84Var, cs4VarArr[2].getValue()};
    }

    @Override // kotlinx.serialization.KSerializer
    public final ChatMessagePhrases deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        df1 df1VarMo4079b = decoder.mo4079b(serialDescriptor);
        cs4[] cs4VarArr = ChatMessagePhrases.f18929d;
        boolean z = true;
        int i = 0;
        int iMo4091q = 0;
        int iMo4091q2 = 0;
        List list = null;
        while (z) {
            int iMo10319A = df1VarMo4079b.mo10319A(serialDescriptor);
            if (iMo10319A == -1) {
                z = false;
            } else if (iMo10319A == 0) {
                iMo4091q = df1VarMo4079b.mo4091q(serialDescriptor, 0);
                i |= 1;
            } else if (iMo10319A == 1) {
                iMo4091q2 = df1VarMo4079b.mo4091q(serialDescriptor, 1);
                i |= 2;
            } else {
                if (iMo10319A != 2) {
                    uk9.m22771e(iMo10319A);
                    return null;
                }
                list = (List) df1VarMo4079b.mo4073G(serialDescriptor, 2, (KSerializer) cs4VarArr[2].getValue(), list);
                i |= 4;
            }
        }
        df1VarMo4079b.mo4086j(serialDescriptor);
        return new ChatMessagePhrases(i, iMo4091q, iMo4091q2, list);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, ChatMessagePhrases chatMessagePhrases) {
        encoder.getClass();
        chatMessagePhrases.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        mk9 mk9VarMo15606b = encoder.mo15606b(serialDescriptor);
        cs4[] cs4VarArr = ChatMessagePhrases.f18929d;
        mk9VarMo15606b.m16878v(0, chatMessagePhrases.f18930a, serialDescriptor);
        mk9VarMo15606b.m16878v(1, chatMessagePhrases.f18931b, serialDescriptor);
        mk9VarMo15606b.m16881y(serialDescriptor, 2, (KSerializer) cs4VarArr[2].getValue(), chatMessagePhrases.f18932c);
        mk9VarMo15606b.m16871A(serialDescriptor);
    }

    @Override // p000.zk3
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return te1.f62178b;
    }
}
