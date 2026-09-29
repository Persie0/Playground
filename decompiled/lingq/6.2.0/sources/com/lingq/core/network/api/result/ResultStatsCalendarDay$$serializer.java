package com.lingq.core.network.api.result;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import p000.bg7;
import p000.df1;
import p000.dj2;
import p000.fa4;
import p000.mk9;
import p000.sk9;
import p000.te1;
import p000.thb;
import p000.uk9;
import p000.zb2;
import p000.zk3;

/* JADX INFO: loaded from: classes2.dex */
@zb2
public final /* synthetic */ class ResultStatsCalendarDay$$serializer implements zk3 {
    public static final ResultStatsCalendarDay$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ResultStatsCalendarDay$$serializer resultStatsCalendarDay$$serializer = new ResultStatsCalendarDay$$serializer();
        INSTANCE = resultStatsCalendarDay$$serializer;
        bg7 bg7Var = new bg7("com.lingq.core.network.api.result.ResultStatsCalendarDay", resultStatsCalendarDay$$serializer, 2);
        bg7Var.m3702k("date", true);
        bg7Var.m3702k("value", true);
        descriptor = bg7Var;
    }

    private ResultStatsCalendarDay$$serializer() {
    }

    @Override // p000.zk3
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{sk9.f60959a, thb.m22059r(dj2.f35711a)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final ResultStatsCalendarDay deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        df1 df1VarMo4079b = decoder.mo4079b(serialDescriptor);
        boolean z = true;
        int i = 0;
        String strMo4097x = null;
        Double d = null;
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
                d = (Double) df1VarMo4079b.mo4070D(serialDescriptor, 1, dj2.f35711a, d);
                i |= 2;
            }
        }
        df1VarMo4079b.mo4086j(serialDescriptor);
        return new ResultStatsCalendarDay(i, strMo4097x, d);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, ResultStatsCalendarDay resultStatsCalendarDay) {
        encoder.getClass();
        resultStatsCalendarDay.getClass();
        Double d = resultStatsCalendarDay.f21522b;
        String str = resultStatsCalendarDay.f21521a;
        SerialDescriptor serialDescriptor = descriptor;
        mk9 mk9VarMo15606b = encoder.mo15606b(serialDescriptor);
        if (mk9VarMo15606b.m16872B(serialDescriptor) || !fa4.m11650l(str, "")) {
            mk9VarMo15606b.m16882z(serialDescriptor, 0, str);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || d != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 1, dj2.f35711a, d);
        }
        mk9VarMo15606b.m16871A(serialDescriptor);
    }

    @Override // p000.zk3
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return te1.f62178b;
    }
}
