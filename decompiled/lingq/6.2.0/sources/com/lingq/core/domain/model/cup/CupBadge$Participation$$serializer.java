package com.lingq.core.domain.model.cup;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import p000.bg7;
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
public final /* synthetic */ class CupBadge$Participation$$serializer implements zk3 {
    public static final CupBadge$Participation$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        CupBadge$Participation$$serializer cupBadge$Participation$$serializer = new CupBadge$Participation$$serializer();
        INSTANCE = cupBadge$Participation$$serializer;
        bg7 bg7Var = new bg7("com.lingq.core.domain.model.cup.CupBadge.Participation", cupBadge$Participation$$serializer, 1);
        bg7Var.m3702k("earnedAt", false);
        descriptor = bg7Var;
    }

    private CupBadge$Participation$$serializer() {
    }

    @Override // p000.zk3
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{thb.m22059r(sk9.f60959a)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final CupBadge$Participation deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        df1 df1VarMo4079b = decoder.mo4079b(serialDescriptor);
        boolean z = true;
        int i = 0;
        String str = null;
        while (z) {
            int iMo10319A = df1VarMo4079b.mo10319A(serialDescriptor);
            if (iMo10319A == -1) {
                z = false;
            } else {
                if (iMo10319A != 0) {
                    uk9.m22771e(iMo10319A);
                    return null;
                }
                str = (String) df1VarMo4079b.mo4070D(serialDescriptor, 0, sk9.f60959a, str);
                i = 1;
            }
        }
        df1VarMo4079b.mo4086j(serialDescriptor);
        return new CupBadge$Participation(i, str);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, CupBadge$Participation cupBadge$Participation) {
        encoder.getClass();
        cupBadge$Participation.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        mk9 mk9VarMo15606b = encoder.mo15606b(serialDescriptor);
        mk9VarMo15606b.m16880x(serialDescriptor, 0, sk9.f60959a, cupBadge$Participation.f18965a);
        mk9VarMo15606b.m16871A(serialDescriptor);
    }

    @Override // p000.zk3
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return te1.f62178b;
    }
}
