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
import p000.mk9;
import p000.sk9;
import p000.te1;
import p000.thb;
import p000.uk9;
import p000.zb2;
import p000.zk3;

/* JADX INFO: loaded from: classes2.dex */
@zb2
public final /* synthetic */ class ChatPhrase$$serializer implements zk3 {
    public static final ChatPhrase$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ChatPhrase$$serializer chatPhrase$$serializer = new ChatPhrase$$serializer();
        INSTANCE = chatPhrase$$serializer;
        bg7 bg7Var = new bg7("com.lingq.core.domain.model.chat.ChatPhrase", chatPhrase$$serializer, 6);
        bg7Var.m3702k("phrase", false);
        bg7Var.m3702k("translation", false);
        bg7Var.m3702k("status", false);
        bg7Var.m3702k("fragment", false);
        bg7Var.m3702k("card", true);
        bg7Var.m3702k("hints", true);
        descriptor = bg7Var;
    }

    private ChatPhrase$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.zk3
    public final KSerializer[] childSerializers() {
        cs4[] cs4VarArr = ChatPhrase.f18936g;
        sk9 sk9Var = sk9.f60959a;
        return new KSerializer[]{sk9Var, sk9Var, l84.f49294a, sk9Var, thb.m22059r(ChatPhraseCard$$serializer.INSTANCE), cs4VarArr[5].getValue()};
    }

    @Override // kotlinx.serialization.KSerializer
    public final ChatPhrase deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        df1 df1VarMo4079b = decoder.mo4079b(serialDescriptor);
        cs4[] cs4VarArr = ChatPhrase.f18936g;
        boolean z = true;
        int i = 0;
        int iMo4091q = 0;
        String strMo4097x = null;
        String strMo4097x2 = null;
        String strMo4097x3 = null;
        ChatPhraseCard chatPhraseCard = null;
        List list = null;
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
                    iMo4091q = df1VarMo4079b.mo4091q(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    strMo4097x3 = df1VarMo4079b.mo4097x(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    chatPhraseCard = (ChatPhraseCard) df1VarMo4079b.mo4070D(serialDescriptor, 4, ChatPhraseCard$$serializer.INSTANCE, chatPhraseCard);
                    i |= 16;
                    break;
                case 5:
                    list = (List) df1VarMo4079b.mo4073G(serialDescriptor, 5, (KSerializer) cs4VarArr[5].getValue(), list);
                    i |= 32;
                    break;
                default:
                    uk9.m22771e(iMo10319A);
                    return null;
            }
        }
        df1VarMo4079b.mo4086j(serialDescriptor);
        return new ChatPhrase(i, strMo4097x, strMo4097x2, iMo4091q, strMo4097x3, chatPhraseCard, list);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, ChatPhrase chatPhrase) {
        encoder.getClass();
        chatPhrase.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        mk9 mk9VarMo15606b = encoder.mo15606b(serialDescriptor);
        cs4[] cs4VarArr = ChatPhrase.f18936g;
        String str = chatPhrase.f18937a;
        List list = chatPhrase.f18942f;
        ChatPhraseCard chatPhraseCard = chatPhrase.f18941e;
        mk9VarMo15606b.m16882z(serialDescriptor, 0, str);
        mk9VarMo15606b.m16882z(serialDescriptor, 1, chatPhrase.f18938b);
        mk9VarMo15606b.m16878v(2, chatPhrase.f18939c, serialDescriptor);
        mk9VarMo15606b.m16882z(serialDescriptor, 3, chatPhrase.f18940d);
        if (mk9VarMo15606b.m16872B(serialDescriptor) || chatPhraseCard != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 4, ChatPhraseCard$$serializer.INSTANCE, chatPhraseCard);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || !fa4.m11650l(list, EmptyList.f47638a)) {
            mk9VarMo15606b.m16881y(serialDescriptor, 5, (KSerializer) cs4VarArr[5].getValue(), list);
        }
        mk9VarMo15606b.m16871A(serialDescriptor);
    }

    @Override // p000.zk3
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return te1.f62178b;
    }
}
