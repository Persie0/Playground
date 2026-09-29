package com.lingq.core.database.entity;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import p000.bg7;
import p000.df1;
import p000.mk9;
import p000.sk9;
import p000.te1;
import p000.uk9;
import p000.zb2;
import p000.zk3;

/* JADX INFO: loaded from: classes2.dex */
@zb2
public final /* synthetic */ class MilestoneMetEntity$$serializer implements zk3 {
    public static final MilestoneMetEntity$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        MilestoneMetEntity$$serializer milestoneMetEntity$$serializer = new MilestoneMetEntity$$serializer();
        INSTANCE = milestoneMetEntity$$serializer;
        bg7 bg7Var = new bg7("com.lingq.core.database.entity.MilestoneMetEntity", milestoneMetEntity$$serializer, 2);
        bg7Var.m3702k("languageAndSlug", false);
        bg7Var.m3702k("metAt", false);
        descriptor = bg7Var;
    }

    private MilestoneMetEntity$$serializer() {
    }

    @Override // p000.zk3
    public final KSerializer[] childSerializers() {
        sk9 sk9Var = sk9.f60959a;
        return new KSerializer[]{sk9Var, sk9Var};
    }

    @Override // kotlinx.serialization.KSerializer
    public final MilestoneMetEntity deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        df1 df1VarMo4079b = decoder.mo4079b(serialDescriptor);
        boolean z = true;
        int i = 0;
        String strMo4097x = null;
        String strMo4097x2 = null;
        while (z) {
            int iMo10319A = df1VarMo4079b.mo10319A(serialDescriptor);
            if (iMo10319A == -1) {
                z = false;
            } else if (iMo10319A == 0) {
                strMo4097x = df1VarMo4079b.mo4097x(serialDescriptor, 0);
                i |= 1;
            } else {
                if (iMo10319A != 1) {
                    uk9.m22771e(iMo10319A);
                    return null;
                }
                strMo4097x2 = df1VarMo4079b.mo4097x(serialDescriptor, 1);
                i |= 2;
            }
        }
        df1VarMo4079b.mo4086j(serialDescriptor);
        return new MilestoneMetEntity(strMo4097x, i, strMo4097x2);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, MilestoneMetEntity milestoneMetEntity) {
        encoder.getClass();
        milestoneMetEntity.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        mk9 mk9VarMo15606b = encoder.mo15606b(serialDescriptor);
        mk9VarMo15606b.m16882z(serialDescriptor, 0, milestoneMetEntity.f17399a);
        mk9VarMo15606b.m16882z(serialDescriptor, 1, milestoneMetEntity.f17400b);
        mk9VarMo15606b.m16871A(serialDescriptor);
    }

    @Override // p000.zk3
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return te1.f62178b;
    }
}
