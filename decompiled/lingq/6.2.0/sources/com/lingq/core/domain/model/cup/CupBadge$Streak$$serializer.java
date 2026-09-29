package com.lingq.core.domain.model.cup;

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
import p000.thb;
import p000.uk9;
import p000.zb2;
import p000.zk3;

/* JADX INFO: loaded from: classes2.dex */
@zb2
public final /* synthetic */ class CupBadge$Streak$$serializer implements zk3 {
    public static final CupBadge$Streak$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        CupBadge$Streak$$serializer cupBadge$Streak$$serializer = new CupBadge$Streak$$serializer();
        INSTANCE = cupBadge$Streak$$serializer;
        bg7 bg7Var = new bg7("com.lingq.core.domain.model.cup.CupBadge.Streak", cupBadge$Streak$$serializer, 2);
        bg7Var.m3702k("tier", false);
        bg7Var.m3702k("earnedAt", false);
        descriptor = bg7Var;
    }

    private CupBadge$Streak$$serializer() {
    }

    @Override // p000.zk3
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{l84.f49294a, thb.m22059r(sk9.f60959a)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final CupBadge$Streak deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        df1 df1VarMo4079b = decoder.mo4079b(serialDescriptor);
        boolean z = true;
        int i = 0;
        int iMo4091q = 0;
        String str = null;
        while (z) {
            int iMo10319A = df1VarMo4079b.mo10319A(serialDescriptor);
            if (iMo10319A == -1) {
                z = false;
            } else if (iMo10319A == 0) {
                iMo4091q = df1VarMo4079b.mo4091q(serialDescriptor, 0);
                i |= 1;
            } else {
                if (iMo10319A != 1) {
                    uk9.m22771e(iMo10319A);
                    return null;
                }
                str = (String) df1VarMo4079b.mo4070D(serialDescriptor, 1, sk9.f60959a, str);
                i |= 2;
            }
        }
        df1VarMo4079b.mo4086j(serialDescriptor);
        return new CupBadge$Streak(i, str, iMo4091q);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, CupBadge$Streak cupBadge$Streak) {
        encoder.getClass();
        cupBadge$Streak.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        mk9 mk9VarMo15606b = encoder.mo15606b(serialDescriptor);
        mk9VarMo15606b.m16878v(0, cupBadge$Streak.f18966a, serialDescriptor);
        mk9VarMo15606b.m16880x(serialDescriptor, 1, sk9.f60959a, cupBadge$Streak.f18967b);
        mk9VarMo15606b.m16871A(serialDescriptor);
    }

    @Override // p000.zk3
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return te1.f62178b;
    }
}
