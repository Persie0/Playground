package com.lingq.core.domain.model.cup;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import p000.bg7;
import p000.df1;
import p000.l84;
import p000.lf0;
import p000.mk9;
import p000.sk9;
import p000.te1;
import p000.uk9;
import p000.zb2;
import p000.zk3;

/* JADX INFO: loaded from: classes.dex */
@zb2
public final /* synthetic */ class CupTeamEntry$$serializer implements zk3 {
    public static final CupTeamEntry$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        CupTeamEntry$$serializer cupTeamEntry$$serializer = new CupTeamEntry$$serializer();
        INSTANCE = cupTeamEntry$$serializer;
        bg7 bg7Var = new bg7("com.lingq.core.domain.model.cup.CupTeamEntry", cupTeamEntry$$serializer, 3);
        bg7Var.m3702k("code", false);
        bg7Var.m3702k("participants", false);
        bg7Var.m3702k("canJoinTeam", true);
        descriptor = bg7Var;
    }

    private CupTeamEntry$$serializer() {
    }

    @Override // p000.zk3
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{sk9.f60959a, l84.f49294a, lf0.f49579a};
    }

    @Override // kotlinx.serialization.KSerializer
    public final CupTeamEntry deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        df1 df1VarMo4079b = decoder.mo4079b(serialDescriptor);
        boolean z = true;
        int i = 0;
        int iMo4091q = 0;
        boolean zMo4094v = false;
        String strMo4097x = null;
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
            } else {
                if (iMo10319A != 2) {
                    uk9.m22771e(iMo10319A);
                    return null;
                }
                zMo4094v = df1VarMo4079b.mo4094v(serialDescriptor, 2);
                i |= 4;
            }
        }
        df1VarMo4079b.mo4086j(serialDescriptor);
        return new CupTeamEntry(i, iMo4091q, strMo4097x, zMo4094v);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, CupTeamEntry cupTeamEntry) {
        encoder.getClass();
        cupTeamEntry.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        mk9 mk9VarMo15606b = encoder.mo15606b(serialDescriptor);
        String str = cupTeamEntry.f18996a;
        boolean z = cupTeamEntry.f18998c;
        mk9VarMo15606b.m16882z(serialDescriptor, 0, str);
        mk9VarMo15606b.m16878v(1, cupTeamEntry.f18997b, serialDescriptor);
        if (mk9VarMo15606b.m16872B(serialDescriptor) || z) {
            mk9VarMo15606b.m16873q(serialDescriptor, 2, z);
        }
        mk9VarMo15606b.m16871A(serialDescriptor);
    }

    @Override // p000.zk3
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return te1.f62178b;
    }
}
