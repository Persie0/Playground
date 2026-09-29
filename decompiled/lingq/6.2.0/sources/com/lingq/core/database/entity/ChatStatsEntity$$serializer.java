package com.lingq.core.database.entity;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import p000.bg7;
import p000.df1;
import p000.dj2;
import p000.l84;
import p000.mk9;
import p000.te1;
import p000.uk9;
import p000.zb2;
import p000.zk3;

/* JADX INFO: loaded from: classes2.dex */
@zb2
public final /* synthetic */ class ChatStatsEntity$$serializer implements zk3 {
    public static final ChatStatsEntity$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ChatStatsEntity$$serializer chatStatsEntity$$serializer = new ChatStatsEntity$$serializer();
        INSTANCE = chatStatsEntity$$serializer;
        bg7 bg7Var = new bg7("com.lingq.core.database.entity.ChatStatsEntity", chatStatsEntity$$serializer, 7);
        bg7Var.m3702k("id", false);
        bg7Var.m3702k("sentences", false);
        bg7Var.m3702k("knownWords", false);
        bg7Var.m3702k("totalWords", false);
        bg7Var.m3702k("uniqueWords", false);
        bg7Var.m3702k("cards", false);
        bg7Var.m3702k("coins", false);
        descriptor = bg7Var;
    }

    private ChatStatsEntity$$serializer() {
    }

    @Override // p000.zk3
    public final KSerializer[] childSerializers() {
        l84 l84Var = l84.f49294a;
        return new KSerializer[]{l84Var, l84Var, l84Var, l84Var, l84Var, l84Var, dj2.f35711a};
    }

    @Override // kotlinx.serialization.KSerializer
    public final ChatStatsEntity deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        df1 df1VarMo4079b = decoder.mo4079b(serialDescriptor);
        int i = 0;
        int iMo4091q = 0;
        int iMo4091q2 = 0;
        int iMo4091q3 = 0;
        int iMo4091q4 = 0;
        int iMo4091q5 = 0;
        int iMo4091q6 = 0;
        double dMo4072F = 0.0d;
        boolean z = true;
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
                    iMo4091q4 = df1VarMo4079b.mo4091q(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    iMo4091q5 = df1VarMo4079b.mo4091q(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    iMo4091q6 = df1VarMo4079b.mo4091q(serialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    dMo4072F = df1VarMo4079b.mo4072F(serialDescriptor, 6);
                    i |= 64;
                    break;
                default:
                    uk9.m22771e(iMo10319A);
                    return null;
            }
        }
        df1VarMo4079b.mo4086j(serialDescriptor);
        return new ChatStatsEntity(i, iMo4091q, iMo4091q2, iMo4091q3, iMo4091q4, iMo4091q5, iMo4091q6, dMo4072F);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, ChatStatsEntity chatStatsEntity) {
        encoder.getClass();
        chatStatsEntity.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        mk9 mk9VarMo15606b = encoder.mo15606b(serialDescriptor);
        mk9VarMo15606b.m16878v(0, chatStatsEntity.f17113a, serialDescriptor);
        mk9VarMo15606b.m16878v(1, chatStatsEntity.f17114b, serialDescriptor);
        mk9VarMo15606b.m16878v(2, chatStatsEntity.f17115c, serialDescriptor);
        mk9VarMo15606b.m16878v(3, chatStatsEntity.f17116d, serialDescriptor);
        mk9VarMo15606b.m16878v(4, chatStatsEntity.f17117e, serialDescriptor);
        mk9VarMo15606b.m16878v(5, chatStatsEntity.f17118f, serialDescriptor);
        mk9VarMo15606b.m16874r(serialDescriptor, 6, chatStatsEntity.f17119g);
        mk9VarMo15606b.m16871A(serialDescriptor);
    }

    @Override // p000.zk3
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return te1.f62178b;
    }
}
