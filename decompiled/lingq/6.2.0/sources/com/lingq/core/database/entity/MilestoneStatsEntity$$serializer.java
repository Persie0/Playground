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
public final /* synthetic */ class MilestoneStatsEntity$$serializer implements zk3 {
    public static final MilestoneStatsEntity$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        MilestoneStatsEntity$$serializer milestoneStatsEntity$$serializer = new MilestoneStatsEntity$$serializer();
        INSTANCE = milestoneStatsEntity$$serializer;
        bg7 bg7Var = new bg7("com.lingq.core.database.entity.MilestoneStatsEntity", milestoneStatsEntity$$serializer, 4);
        bg7Var.m3702k("language", false);
        bg7Var.m3702k("knownWords", true);
        bg7Var.m3702k("lingqs", true);
        bg7Var.m3702k("dailyScore", true);
        descriptor = bg7Var;
    }

    private MilestoneStatsEntity$$serializer() {
    }

    @Override // p000.zk3
    public final KSerializer[] childSerializers() {
        l84 l84Var = l84.f49294a;
        return new KSerializer[]{sk9.f60959a, l84Var, l84Var, l84Var};
    }

    @Override // kotlinx.serialization.KSerializer
    public final MilestoneStatsEntity deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        df1 df1VarMo4079b = decoder.mo4079b(serialDescriptor);
        boolean z = true;
        int i = 0;
        int iMo4091q = 0;
        int iMo4091q2 = 0;
        int iMo4091q3 = 0;
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
            } else if (iMo10319A == 2) {
                iMo4091q2 = df1VarMo4079b.mo4091q(serialDescriptor, 2);
                i |= 4;
            } else {
                if (iMo10319A != 3) {
                    uk9.m22771e(iMo10319A);
                    return null;
                }
                iMo4091q3 = df1VarMo4079b.mo4091q(serialDescriptor, 3);
                i |= 8;
            }
        }
        df1VarMo4079b.mo4086j(serialDescriptor);
        return new MilestoneStatsEntity(i, strMo4097x, iMo4091q, iMo4091q2, iMo4091q3);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, MilestoneStatsEntity milestoneStatsEntity) {
        encoder.getClass();
        milestoneStatsEntity.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        mk9 mk9VarMo15606b = encoder.mo15606b(serialDescriptor);
        String str = milestoneStatsEntity.f17401a;
        int i = milestoneStatsEntity.f17404d;
        int i2 = milestoneStatsEntity.f17403c;
        int i3 = milestoneStatsEntity.f17402b;
        mk9VarMo15606b.m16882z(serialDescriptor, 0, str);
        if (mk9VarMo15606b.m16872B(serialDescriptor) || i3 != 0) {
            mk9VarMo15606b.m16878v(1, i3, serialDescriptor);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || i2 != 0) {
            mk9VarMo15606b.m16878v(2, i2, serialDescriptor);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || i != 0) {
            mk9VarMo15606b.m16878v(3, i, serialDescriptor);
        }
        mk9VarMo15606b.m16871A(serialDescriptor);
    }

    @Override // p000.zk3
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return te1.f62178b;
    }
}
