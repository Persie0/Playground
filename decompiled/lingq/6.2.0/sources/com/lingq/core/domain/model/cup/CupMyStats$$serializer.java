package com.lingq.core.domain.model.cup;

import com.android.installreferrer.api.InstallReferrerClient;
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
import p000.te1;
import p000.thb;
import p000.uk9;
import p000.zb2;
import p000.zk3;

/* JADX INFO: loaded from: classes2.dex */
@zb2
public final /* synthetic */ class CupMyStats$$serializer implements zk3 {
    public static final CupMyStats$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        CupMyStats$$serializer cupMyStats$$serializer = new CupMyStats$$serializer();
        INSTANCE = cupMyStats$$serializer;
        bg7 bg7Var = new bg7("com.lingq.core.domain.model.cup.CupMyStats", cupMyStats$$serializer, 10);
        bg7Var.m3702k("score", false);
        bg7Var.m3702k("globalRank", false);
        bg7Var.m3702k("teamRank", false);
        bg7Var.m3702k("teamRankPrev", false);
        bg7Var.m3702k("teamRankDelta", false);
        bg7Var.m3702k("streakDays", false);
        bg7Var.m3702k("daysOpened", false);
        bg7Var.m3702k("streakTier", false);
        bg7Var.m3702k("currentStreak", false);
        bg7Var.m3702k("badges", false);
        descriptor = bg7Var;
    }

    private CupMyStats$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.zk3
    public final KSerializer[] childSerializers() {
        cs4[] cs4VarArr = CupMyStats.f18975k;
        l84 l84Var = l84.f49294a;
        return new KSerializer[]{l84Var, thb.m22059r(l84Var), thb.m22059r(l84Var), thb.m22059r(l84Var), thb.m22059r(l84Var), l84Var, l84Var, l84Var, l84Var, cs4VarArr[9].getValue()};
    }

    @Override // kotlinx.serialization.KSerializer
    public final CupMyStats deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        df1 df1VarMo4079b = decoder.mo4079b(serialDescriptor);
        cs4[] cs4VarArr = CupMyStats.f18975k;
        CupMyStats cupMyStats = null;
        boolean z = true;
        List list = null;
        Integer num = null;
        Integer num2 = null;
        Integer num3 = null;
        Integer num4 = null;
        int i = 0;
        int iMo4091q = 0;
        int iMo4091q2 = 0;
        int iMo4091q3 = 0;
        int iMo4091q4 = 0;
        int iMo4091q5 = 0;
        while (z) {
            int iMo10319A = df1VarMo4079b.mo10319A(serialDescriptor);
            switch (iMo10319A) {
                case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                    z = false;
                    continue;
                case 0:
                    iMo4091q = df1VarMo4079b.mo4091q(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    num = (Integer) df1VarMo4079b.mo4070D(serialDescriptor, 1, l84.f49294a, num);
                    i |= 2;
                    break;
                case 2:
                    num2 = (Integer) df1VarMo4079b.mo4070D(serialDescriptor, 2, l84.f49294a, num2);
                    i |= 4;
                    break;
                case 3:
                    num3 = (Integer) df1VarMo4079b.mo4070D(serialDescriptor, 3, l84.f49294a, num3);
                    i |= 8;
                    break;
                case 4:
                    num4 = (Integer) df1VarMo4079b.mo4070D(serialDescriptor, 4, l84.f49294a, num4);
                    i |= 16;
                    break;
                case 5:
                    iMo4091q2 = df1VarMo4079b.mo4091q(serialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    iMo4091q3 = df1VarMo4079b.mo4091q(serialDescriptor, 6);
                    i |= 64;
                    break;
                case 7:
                    iMo4091q4 = df1VarMo4079b.mo4091q(serialDescriptor, 7);
                    i |= 128;
                    break;
                case 8:
                    iMo4091q5 = df1VarMo4079b.mo4091q(serialDescriptor, 8);
                    i |= 256;
                    break;
                case 9:
                    list = (List) df1VarMo4079b.mo4073G(serialDescriptor, 9, (KSerializer) cs4VarArr[9].getValue(), list);
                    i |= 512;
                    break;
                default:
                    uk9.m22771e(iMo10319A);
                    return cupMyStats;
            }
            cupMyStats = null;
        }
        df1VarMo4079b.mo4086j(serialDescriptor);
        return new CupMyStats(i, iMo4091q, num, num2, num3, num4, iMo4091q2, iMo4091q3, iMo4091q4, iMo4091q5, list);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, CupMyStats cupMyStats) {
        encoder.getClass();
        cupMyStats.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        mk9 mk9VarMo15606b = encoder.mo15606b(serialDescriptor);
        cs4[] cs4VarArr = CupMyStats.f18975k;
        mk9VarMo15606b.m16878v(0, cupMyStats.f18976a, serialDescriptor);
        l84 l84Var = l84.f49294a;
        mk9VarMo15606b.m16880x(serialDescriptor, 1, l84Var, cupMyStats.f18977b);
        mk9VarMo15606b.m16880x(serialDescriptor, 2, l84Var, cupMyStats.f18978c);
        mk9VarMo15606b.m16880x(serialDescriptor, 3, l84Var, cupMyStats.f18979d);
        mk9VarMo15606b.m16880x(serialDescriptor, 4, l84Var, cupMyStats.f18980e);
        mk9VarMo15606b.m16878v(5, cupMyStats.f18981f, serialDescriptor);
        mk9VarMo15606b.m16878v(6, cupMyStats.f18982g, serialDescriptor);
        mk9VarMo15606b.m16878v(7, cupMyStats.f18983h, serialDescriptor);
        mk9VarMo15606b.m16878v(8, cupMyStats.f18984i, serialDescriptor);
        mk9VarMo15606b.m16881y(serialDescriptor, 9, (KSerializer) cs4VarArr[9].getValue(), cupMyStats.f18985j);
        mk9VarMo15606b.m16871A(serialDescriptor);
    }

    @Override // p000.zk3
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return te1.f62178b;
    }
}
