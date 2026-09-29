package com.lingq.core.network.api.result;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import p000.bg7;
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
public final /* synthetic */ class Participant$$serializer implements zk3 {
    public static final Participant$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        Participant$$serializer participant$$serializer = new Participant$$serializer();
        INSTANCE = participant$$serializer;
        bg7 bg7Var = new bg7("com.lingq.core.network.api.result.Participant", participant$$serializer, 4);
        bg7Var.m3702k("extra", true);
        bg7Var.m3702k("stats", true);
        bg7Var.m3702k("rank", true);
        bg7Var.m3702k("status", true);
        descriptor = bg7Var;
    }

    private Participant$$serializer() {
    }

    @Override // p000.zk3
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{thb.m22059r(Extra$$serializer.INSTANCE), thb.m22059r(ParticipantStat$$serializer.INSTANCE), thb.m22059r(l84.f49294a), thb.m22059r(sk9.f60959a)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Participant deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        df1 df1VarMo4079b = decoder.mo4079b(serialDescriptor);
        boolean z = true;
        int i = 0;
        Extra extra = null;
        ParticipantStat participantStat = null;
        Integer num = null;
        String str = null;
        while (z) {
            int iMo10319A = df1VarMo4079b.mo10319A(serialDescriptor);
            if (iMo10319A == -1) {
                z = false;
            } else if (iMo10319A == 0) {
                extra = (Extra) df1VarMo4079b.mo4070D(serialDescriptor, 0, Extra$$serializer.INSTANCE, extra);
                i |= 1;
            } else if (iMo10319A == 1) {
                participantStat = (ParticipantStat) df1VarMo4079b.mo4070D(serialDescriptor, 1, ParticipantStat$$serializer.INSTANCE, participantStat);
                i |= 2;
            } else if (iMo10319A == 2) {
                num = (Integer) df1VarMo4079b.mo4070D(serialDescriptor, 2, l84.f49294a, num);
                i |= 4;
            } else {
                if (iMo10319A != 3) {
                    uk9.m22771e(iMo10319A);
                    return null;
                }
                str = (String) df1VarMo4079b.mo4070D(serialDescriptor, 3, sk9.f60959a, str);
                i |= 8;
            }
        }
        df1VarMo4079b.mo4086j(serialDescriptor);
        return new Participant(i, extra, participantStat, num, str);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Participant participant) {
        encoder.getClass();
        participant.getClass();
        String str = participant.f20572d;
        Integer num = participant.f20571c;
        ParticipantStat participantStat = participant.f20570b;
        Extra extra = participant.f20569a;
        SerialDescriptor serialDescriptor = descriptor;
        mk9 mk9VarMo15606b = encoder.mo15606b(serialDescriptor);
        if (mk9VarMo15606b.m16872B(serialDescriptor) || !fa4.m11650l(extra, new Extra())) {
            mk9VarMo15606b.m16880x(serialDescriptor, 0, Extra$$serializer.INSTANCE, extra);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || !fa4.m11650l(participantStat, new ParticipantStat())) {
            mk9VarMo15606b.m16880x(serialDescriptor, 1, ParticipantStat$$serializer.INSTANCE, participantStat);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || num != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 2, l84.f49294a, num);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || str != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 3, sk9.f60959a, str);
        }
        mk9VarMo15606b.m16871A(serialDescriptor);
    }

    @Override // p000.zk3
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return te1.f62178b;
    }
}
