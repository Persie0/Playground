package com.lingq.core.database.entity;

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
import p000.thb;
import p000.uk9;
import p000.zb2;
import p000.zk3;

/* JADX INFO: loaded from: classes2.dex */
@zb2
public final /* synthetic */ class ChatSentenceEntity$$serializer implements zk3 {
    public static final ChatSentenceEntity$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ChatSentenceEntity$$serializer chatSentenceEntity$$serializer = new ChatSentenceEntity$$serializer();
        INSTANCE = chatSentenceEntity$$serializer;
        bg7 bg7Var = new bg7("com.lingq.core.database.entity.ChatSentenceEntity", chatSentenceEntity$$serializer, 10);
        bg7Var.m3702k("chatId", false);
        bg7Var.m3702k("messageIndex", false);
        bg7Var.m3702k("index", false);
        bg7Var.m3702k("tokens", true);
        bg7Var.m3702k("text", false);
        bg7Var.m3702k("normalizedText", false);
        bg7Var.m3702k("timestamp", true);
        bg7Var.m3702k("startParagraph", true);
        bg7Var.m3702k("url", true);
        bg7Var.m3702k("opentag", true);
        descriptor = bg7Var;
    }

    private ChatSentenceEntity$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.zk3
    public final KSerializer[] childSerializers() {
        cs4[] cs4VarArr = ChatSentenceEntity.f17102k;
        l84 l84Var = l84.f49294a;
        sk9 sk9Var = sk9.f60959a;
        return new KSerializer[]{l84Var, l84Var, l84Var, cs4VarArr[3].getValue(), thb.m22059r(sk9Var), thb.m22059r(sk9Var), thb.m22059r((KSerializer) cs4VarArr[6].getValue()), lf0.f49579a, thb.m22059r(sk9Var), thb.m22059r(sk9Var)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final ChatSentenceEntity deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        df1 df1VarMo4079b = decoder.mo4079b(serialDescriptor);
        cs4[] cs4VarArr = ChatSentenceEntity.f17102k;
        String str = null;
        boolean z = true;
        String str2 = null;
        int i = 0;
        int iMo4091q = 0;
        int iMo4091q2 = 0;
        int iMo4091q3 = 0;
        List list = null;
        String str3 = null;
        String str4 = null;
        List list2 = null;
        boolean zMo4094v = false;
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
                    iMo4091q2 = df1VarMo4079b.mo4091q(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    iMo4091q3 = df1VarMo4079b.mo4091q(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    list = (List) df1VarMo4079b.mo4073G(serialDescriptor, 3, (KSerializer) cs4VarArr[3].getValue(), list);
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
                case 6:
                    list2 = (List) df1VarMo4079b.mo4070D(serialDescriptor, 6, (KSerializer) cs4VarArr[6].getValue(), list2);
                    i |= 64;
                    break;
                case 7:
                    zMo4094v = df1VarMo4079b.mo4094v(serialDescriptor, 7);
                    i |= 128;
                    break;
                case 8:
                    str2 = (String) df1VarMo4079b.mo4070D(serialDescriptor, 8, sk9.f60959a, str2);
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
        return new ChatSentenceEntity(i, iMo4091q, iMo4091q2, iMo4091q3, list, str3, str4, list2, zMo4094v, str2, str);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, ChatSentenceEntity chatSentenceEntity) {
        encoder.getClass();
        chatSentenceEntity.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        mk9 mk9VarMo15606b = encoder.mo15606b(serialDescriptor);
        cs4[] cs4VarArr = ChatSentenceEntity.f17102k;
        int i = chatSentenceEntity.f17103a;
        String str = chatSentenceEntity.f17112j;
        String str2 = chatSentenceEntity.f17111i;
        boolean z = chatSentenceEntity.f17110h;
        List list = chatSentenceEntity.f17109g;
        List list2 = chatSentenceEntity.f17106d;
        mk9VarMo15606b.m16878v(0, i, serialDescriptor);
        mk9VarMo15606b.m16878v(1, chatSentenceEntity.f17104b, serialDescriptor);
        mk9VarMo15606b.m16878v(2, chatSentenceEntity.f17105c, serialDescriptor);
        boolean zM16872B = mk9VarMo15606b.m16872B(serialDescriptor);
        EmptyList emptyList = EmptyList.f47638a;
        if (zM16872B || !fa4.m11650l(list2, emptyList)) {
            mk9VarMo15606b.m16881y(serialDescriptor, 3, (KSerializer) cs4VarArr[3].getValue(), list2);
        }
        sk9 sk9Var = sk9.f60959a;
        mk9VarMo15606b.m16880x(serialDescriptor, 4, sk9Var, chatSentenceEntity.f17107e);
        mk9VarMo15606b.m16880x(serialDescriptor, 5, sk9Var, chatSentenceEntity.f17108f);
        if (mk9VarMo15606b.m16872B(serialDescriptor) || !fa4.m11650l(list, emptyList)) {
            mk9VarMo15606b.m16880x(serialDescriptor, 6, (KSerializer) cs4VarArr[6].getValue(), list);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || z) {
            mk9VarMo15606b.m16873q(serialDescriptor, 7, z);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || str2 != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 8, sk9Var, str2);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || str != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 9, sk9Var, str);
        }
        mk9VarMo15606b.m16871A(serialDescriptor);
    }

    @Override // p000.zk3
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return te1.f62178b;
    }
}
