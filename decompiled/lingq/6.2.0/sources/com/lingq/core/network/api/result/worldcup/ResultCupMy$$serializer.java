package com.lingq.core.network.api.result.worldcup;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import p000.bg7;
import p000.cs4;
import p000.df1;
import p000.fa4;
import p000.l84;
import p000.mk9;
import p000.te1;
import p000.thb;
import p000.uk9;
import p000.zb2;
import p000.zk3;

/* JADX INFO: loaded from: classes2.dex */
@zb2
public final /* synthetic */ class ResultCupMy$$serializer implements zk3 {
    public static final ResultCupMy$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ResultCupMy$$serializer resultCupMy$$serializer = new ResultCupMy$$serializer();
        INSTANCE = resultCupMy$$serializer;
        bg7 bg7Var = new bg7("com.lingq.core.network.api.result.worldcup.ResultCupMy", resultCupMy$$serializer, 10);
        bg7Var.m3702k("score", true);
        bg7Var.m3702k("global_rank", true);
        bg7Var.m3702k("team_rank", true);
        bg7Var.m3702k("team_rank_prev", true);
        bg7Var.m3702k("team_rank_delta", true);
        bg7Var.m3702k("streak_days", true);
        bg7Var.m3702k("days_opened", true);
        bg7Var.m3702k("streak_tier", true);
        bg7Var.m3702k("current_streak", true);
        bg7Var.m3702k("badges", true);
        descriptor = bg7Var;
    }

    private ResultCupMy$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.zk3
    public final KSerializer[] childSerializers() {
        cs4[] cs4VarArr = ResultCupMy.f21780k;
        l84 l84Var = l84.f49294a;
        return new KSerializer[]{l84Var, thb.m22059r(l84Var), thb.m22059r(l84Var), thb.m22059r(l84Var), thb.m22059r(l84Var), l84Var, l84Var, l84Var, l84Var, cs4VarArr[9].getValue()};
    }

    @Override // kotlinx.serialization.KSerializer
    public final ResultCupMy deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        df1 df1VarMo4079b = decoder.mo4079b(serialDescriptor);
        cs4[] cs4VarArr = ResultCupMy.f21780k;
        ResultCupMy resultCupMy = null;
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
                    return resultCupMy;
            }
            resultCupMy = null;
        }
        df1VarMo4079b.mo4086j(serialDescriptor);
        return new ResultCupMy(i, iMo4091q, num, num2, num3, num4, iMo4091q2, iMo4091q3, iMo4091q4, iMo4091q5, list);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, ResultCupMy resultCupMy) {
        encoder.getClass();
        resultCupMy.getClass();
        List list = resultCupMy.f21790j;
        int i = resultCupMy.f21789i;
        int i2 = resultCupMy.f21788h;
        int i3 = resultCupMy.f21787g;
        int i4 = resultCupMy.f21786f;
        Integer num = resultCupMy.f21785e;
        Integer num2 = resultCupMy.f21784d;
        Integer num3 = resultCupMy.f21783c;
        Integer num4 = resultCupMy.f21782b;
        int i5 = resultCupMy.f21781a;
        SerialDescriptor serialDescriptor = descriptor;
        mk9 mk9VarMo15606b = encoder.mo15606b(serialDescriptor);
        cs4[] cs4VarArr = ResultCupMy.f21780k;
        if (mk9VarMo15606b.m16872B(serialDescriptor) || i5 != 0) {
            mk9VarMo15606b.m16878v(0, i5, serialDescriptor);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || num4 != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 1, l84.f49294a, num4);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || num3 != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 2, l84.f49294a, num3);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || num2 != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 3, l84.f49294a, num2);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || num != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 4, l84.f49294a, num);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || i4 != 0) {
            mk9VarMo15606b.m16878v(5, i4, serialDescriptor);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || i3 != 0) {
            mk9VarMo15606b.m16878v(6, i3, serialDescriptor);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || i2 != 0) {
            mk9VarMo15606b.m16878v(7, i2, serialDescriptor);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || i != 0) {
            mk9VarMo15606b.m16878v(8, i, serialDescriptor);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || !fa4.m11650l(list, EmptyList.f47638a)) {
            mk9VarMo15606b.m16881y(serialDescriptor, 9, (KSerializer) cs4VarArr[9].getValue(), list);
        }
        mk9VarMo15606b.m16871A(serialDescriptor);
    }

    @Override // p000.zk3
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return te1.f62178b;
    }
}
