package com.lingq.core.database.entity;

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
import p000.sk9;
import p000.te1;
import p000.thb;
import p000.uk9;
import p000.zb2;
import p000.zk3;

/* JADX INFO: loaded from: classes2.dex */
@zb2
public final /* synthetic */ class StatsCalendarEntity$$serializer implements zk3 {
    public static final StatsCalendarEntity$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        StatsCalendarEntity$$serializer statsCalendarEntity$$serializer = new StatsCalendarEntity$$serializer();
        INSTANCE = statsCalendarEntity$$serializer;
        bg7 bg7Var = new bg7("com.lingq.core.database.entity.StatsCalendarEntity", statsCalendarEntity$$serializer, 5);
        bg7Var.m3702k("language", false);
        bg7Var.m3702k("dailyGoal", true);
        bg7Var.m3702k("month", true);
        bg7Var.m3702k("year", true);
        bg7Var.m3702k("stats", true);
        descriptor = bg7Var;
    }

    private StatsCalendarEntity$$serializer() {
    }

    @Override // p000.zk3
    public final KSerializer[] childSerializers() {
        KSerializer kSerializerM22059r = thb.m22059r((KSerializer) StatsCalendarEntity.f17449f[4].getValue());
        l84 l84Var = l84.f49294a;
        return new KSerializer[]{sk9.f60959a, l84Var, l84Var, l84Var, kSerializerM22059r};
    }

    @Override // kotlinx.serialization.KSerializer
    public final StatsCalendarEntity deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        df1 df1VarMo4079b = decoder.mo4079b(serialDescriptor);
        cs4[] cs4VarArr = StatsCalendarEntity.f17449f;
        boolean z = true;
        int i = 0;
        int iMo4091q = 0;
        int iMo4091q2 = 0;
        int iMo4091q3 = 0;
        String strMo4097x = null;
        List list = null;
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
            } else if (iMo10319A == 3) {
                iMo4091q3 = df1VarMo4079b.mo4091q(serialDescriptor, 3);
                i |= 8;
            } else {
                if (iMo10319A != 4) {
                    uk9.m22771e(iMo10319A);
                    return null;
                }
                list = (List) df1VarMo4079b.mo4070D(serialDescriptor, 4, (KSerializer) cs4VarArr[4].getValue(), list);
                i |= 16;
            }
        }
        df1VarMo4079b.mo4086j(serialDescriptor);
        return new StatsCalendarEntity(i, strMo4097x, iMo4091q, iMo4091q2, iMo4091q3, list);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, StatsCalendarEntity statsCalendarEntity) {
        encoder.getClass();
        statsCalendarEntity.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        mk9 mk9VarMo15606b = encoder.mo15606b(serialDescriptor);
        cs4[] cs4VarArr = StatsCalendarEntity.f17449f;
        String str = statsCalendarEntity.f17450a;
        List list = statsCalendarEntity.f17454e;
        int i = statsCalendarEntity.f17453d;
        int i2 = statsCalendarEntity.f17452c;
        int i3 = statsCalendarEntity.f17451b;
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
        if (mk9VarMo15606b.m16872B(serialDescriptor) || list != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 4, (KSerializer) cs4VarArr[4].getValue(), list);
        }
        mk9VarMo15606b.m16871A(serialDescriptor);
    }

    @Override // p000.zk3
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return te1.f62178b;
    }
}
