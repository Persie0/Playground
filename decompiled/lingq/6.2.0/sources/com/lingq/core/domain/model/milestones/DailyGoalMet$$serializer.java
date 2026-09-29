package com.lingq.core.domain.model.milestones;

import com.android.installreferrer.api.InstallReferrerClient;
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

/* JADX INFO: loaded from: classes2.dex */
@zb2
public final /* synthetic */ class DailyGoalMet$$serializer implements zk3 {
    public static final DailyGoalMet$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        DailyGoalMet$$serializer dailyGoalMet$$serializer = new DailyGoalMet$$serializer();
        INSTANCE = dailyGoalMet$$serializer;
        bg7 bg7Var = new bg7("com.lingq.core.domain.model.milestones.DailyGoalMet", dailyGoalMet$$serializer, 7);
        bg7Var.m3702k("date", false);
        bg7Var.m3702k("met", false);
        bg7Var.m3702k("goal", false);
        bg7Var.m3702k("activityId", false);
        bg7Var.m3702k("isDouble", false);
        bg7Var.m3702k("slug", false);
        bg7Var.m3702k("streak", true);
        descriptor = bg7Var;
    }

    private DailyGoalMet$$serializer() {
    }

    @Override // p000.zk3
    public final KSerializer[] childSerializers() {
        sk9 sk9Var = sk9.f60959a;
        l84 l84Var = l84.f49294a;
        return new KSerializer[]{sk9Var, l84Var, l84Var, l84Var, lf0.f49579a, sk9Var, l84Var};
    }

    @Override // kotlinx.serialization.KSerializer
    public final DailyGoalMet deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        df1 df1VarMo4079b = decoder.mo4079b(serialDescriptor);
        boolean z = true;
        int i = 0;
        int iMo4091q = 0;
        int iMo4091q2 = 0;
        int iMo4091q3 = 0;
        boolean zMo4094v = false;
        int iMo4091q4 = 0;
        String strMo4097x = null;
        String strMo4097x2 = null;
        while (z) {
            int iMo10319A = df1VarMo4079b.mo10319A(serialDescriptor);
            switch (iMo10319A) {
                case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                    z = false;
                    break;
                case 0:
                    strMo4097x = df1VarMo4079b.mo4097x(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    iMo4091q = df1VarMo4079b.mo4091q(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    iMo4091q2 = df1VarMo4079b.mo4091q(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    iMo4091q3 = df1VarMo4079b.mo4091q(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    zMo4094v = df1VarMo4079b.mo4094v(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    strMo4097x2 = df1VarMo4079b.mo4097x(serialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    iMo4091q4 = df1VarMo4079b.mo4091q(serialDescriptor, 6);
                    i |= 64;
                    break;
                default:
                    uk9.m22771e(iMo10319A);
                    return null;
            }
        }
        df1VarMo4079b.mo4086j(serialDescriptor);
        return new DailyGoalMet(i, strMo4097x, iMo4091q, iMo4091q2, iMo4091q3, zMo4094v, strMo4097x2, iMo4091q4);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, DailyGoalMet dailyGoalMet) {
        encoder.getClass();
        dailyGoalMet.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        mk9 mk9VarMo15606b = encoder.mo15606b(serialDescriptor);
        String str = dailyGoalMet.f19514a;
        int i = dailyGoalMet.f19520g;
        mk9VarMo15606b.m16882z(serialDescriptor, 0, str);
        mk9VarMo15606b.m16878v(1, dailyGoalMet.f19515b, serialDescriptor);
        mk9VarMo15606b.m16878v(2, dailyGoalMet.f19516c, serialDescriptor);
        mk9VarMo15606b.m16878v(3, dailyGoalMet.f19517d, serialDescriptor);
        mk9VarMo15606b.m16873q(serialDescriptor, 4, dailyGoalMet.f19518e);
        mk9VarMo15606b.m16882z(serialDescriptor, 5, dailyGoalMet.f19519f);
        if (mk9VarMo15606b.m16872B(serialDescriptor) || i != -1) {
            mk9VarMo15606b.m16878v(6, i, serialDescriptor);
        }
        mk9VarMo15606b.m16871A(serialDescriptor);
    }

    @Override // p000.zk3
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return te1.f62178b;
    }
}
