package com.lingq.core.network.api.result;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import p000.bg7;
import p000.df1;
import p000.dj2;
import p000.l84;
import p000.mk9;
import p000.te1;
import p000.thb;
import p000.uk9;
import p000.zb2;
import p000.zk3;

/* JADX INFO: loaded from: classes2.dex */
@zb2
public final /* synthetic */ class JoinedChallengeStats$$serializer implements zk3 {
    public static final JoinedChallengeStats$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        JoinedChallengeStats$$serializer joinedChallengeStats$$serializer = new JoinedChallengeStats$$serializer();
        INSTANCE = joinedChallengeStats$$serializer;
        bg7 bg7Var = new bg7("com.lingq.core.network.api.result.JoinedChallengeStats", joinedChallengeStats$$serializer, 20);
        bg7Var.m3702k("readProgressGoal", true);
        bg7Var.m3702k("readProgress", true);
        bg7Var.m3702k("knownWords", true);
        bg7Var.m3702k("knownWordsGoal", true);
        bg7Var.m3702k("wordsEarnedCoins", true);
        bg7Var.m3702k("wordsEarnedCoinsGoal", true);
        bg7Var.m3702k("readEarnedCoins", true);
        bg7Var.m3702k("readEarnedCoinsGoal", true);
        bg7Var.m3702k("listenEarnedCoins", true);
        bg7Var.m3702k("listenEarnedCoinsGoal", true);
        bg7Var.m3702k("earnedCoins", true);
        bg7Var.m3702k("earnedCoinsGoal", true);
        bg7Var.m3702k("readWords", true);
        bg7Var.m3702k("readWordsGoal", true);
        bg7Var.m3702k("cardsCreated", true);
        bg7Var.m3702k("cardsCreatedGoal", true);
        bg7Var.m3702k("listeningTime", true);
        bg7Var.m3702k("listeningTimeGoal", true);
        bg7Var.m3702k("cardsLearned", true);
        bg7Var.m3702k("cardsLearnedGoal", true);
        descriptor = bg7Var;
    }

    private JoinedChallengeStats$$serializer() {
    }

    @Override // p000.zk3
    public final KSerializer[] childSerializers() {
        dj2 dj2Var = dj2.f35711a;
        KSerializer kSerializerM22059r = thb.m22059r(dj2Var);
        KSerializer kSerializerM22059r2 = thb.m22059r(dj2Var);
        l84 l84Var = l84.f49294a;
        return new KSerializer[]{kSerializerM22059r, kSerializerM22059r2, thb.m22059r(l84Var), thb.m22059r(l84Var), thb.m22059r(l84Var), thb.m22059r(l84Var), thb.m22059r(l84Var), thb.m22059r(l84Var), thb.m22059r(l84Var), thb.m22059r(l84Var), thb.m22059r(l84Var), thb.m22059r(l84Var), thb.m22059r(l84Var), thb.m22059r(l84Var), thb.m22059r(l84Var), thb.m22059r(l84Var), thb.m22059r(dj2Var), thb.m22059r(dj2Var), thb.m22059r(l84Var), thb.m22059r(l84Var)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final JoinedChallengeStats deserialize(Decoder decoder) {
        int i;
        Double d;
        Integer num;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        df1 df1VarMo4079b = decoder.mo4079b(serialDescriptor);
        Integer num2 = null;
        Integer num3 = null;
        Integer num4 = null;
        Integer num5 = null;
        Integer num6 = null;
        int i2 = 0;
        Integer num7 = null;
        Integer num8 = null;
        Integer num9 = null;
        Double d2 = null;
        Double d3 = null;
        Integer num10 = null;
        Integer num11 = null;
        Integer num12 = null;
        boolean z = true;
        Double d4 = null;
        Double d5 = null;
        Integer num13 = null;
        Integer num14 = null;
        Integer num15 = null;
        Integer num16 = null;
        Integer num17 = null;
        while (z) {
            int iMo10319A = df1VarMo4079b.mo10319A(serialDescriptor);
            switch (iMo10319A) {
                case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                    d = d4;
                    z = false;
                    num3 = num3;
                    num12 = num12;
                    d4 = d;
                    num2 = num2;
                    break;
                case 0:
                    d = (Double) df1VarMo4079b.mo4070D(serialDescriptor, 0, dj2.f35711a, d4);
                    i2 |= 1;
                    num3 = num3;
                    num12 = num12;
                    num6 = num6;
                    d4 = d;
                    num2 = num2;
                    break;
                case 1:
                    num = num12;
                    d5 = (Double) df1VarMo4079b.mo4070D(serialDescriptor, 1, dj2.f35711a, d5);
                    i2 |= 2;
                    num13 = num13;
                    num12 = num;
                    num6 = num6;
                    num2 = num2;
                    break;
                case 2:
                    num = num12;
                    num13 = (Integer) df1VarMo4079b.mo4070D(serialDescriptor, 2, l84.f49294a, num13);
                    i2 |= 4;
                    num12 = num;
                    num6 = num6;
                    num2 = num2;
                    break;
                case 3:
                    num = num12;
                    num14 = (Integer) df1VarMo4079b.mo4070D(serialDescriptor, 3, l84.f49294a, num14);
                    i2 |= 8;
                    num12 = num;
                    num6 = num6;
                    num2 = num2;
                    break;
                case 4:
                    num = num12;
                    num15 = (Integer) df1VarMo4079b.mo4070D(serialDescriptor, 4, l84.f49294a, num15);
                    i2 |= 16;
                    num12 = num;
                    num6 = num6;
                    num2 = num2;
                    break;
                case 5:
                    num = num12;
                    num16 = (Integer) df1VarMo4079b.mo4070D(serialDescriptor, 5, l84.f49294a, num16);
                    i2 |= 32;
                    num12 = num;
                    num6 = num6;
                    num2 = num2;
                    break;
                case 6:
                    num = num12;
                    num17 = (Integer) df1VarMo4079b.mo4070D(serialDescriptor, 6, l84.f49294a, num17);
                    i2 |= 64;
                    num12 = num;
                    num6 = num6;
                    num2 = num2;
                    break;
                case 7:
                    num2 = num2;
                    num6 = num6;
                    num12 = (Integer) df1VarMo4079b.mo4070D(serialDescriptor, 7, l84.f49294a, num12);
                    i2 |= 128;
                    num6 = num6;
                    num2 = num2;
                    break;
                case 8:
                    num2 = num2;
                    num6 = (Integer) df1VarMo4079b.mo4070D(serialDescriptor, 8, l84.f49294a, num6);
                    i2 |= 256;
                    num12 = num12;
                    num2 = num2;
                    break;
                case 9:
                    num6 = num6;
                    num12 = num12;
                    num4 = (Integer) df1VarMo4079b.mo4070D(serialDescriptor, 9, l84.f49294a, num4);
                    i2 |= 512;
                    num12 = num12;
                    num6 = num6;
                    break;
                case 10:
                    num6 = num6;
                    num12 = num12;
                    num3 = (Integer) df1VarMo4079b.mo4070D(serialDescriptor, 10, l84.f49294a, num3);
                    i2 |= 1024;
                    num12 = num12;
                    num6 = num6;
                    break;
                case 11:
                    num6 = num6;
                    num12 = num12;
                    num2 = (Integer) df1VarMo4079b.mo4070D(serialDescriptor, 11, l84.f49294a, num2);
                    i2 |= 2048;
                    num12 = num12;
                    num6 = num6;
                    break;
                case 12:
                    num6 = num6;
                    num12 = num12;
                    num5 = (Integer) df1VarMo4079b.mo4070D(serialDescriptor, 12, l84.f49294a, num5);
                    i2 |= 4096;
                    num12 = num12;
                    num6 = num6;
                    break;
                case 13:
                    num6 = num6;
                    num12 = num12;
                    num7 = (Integer) df1VarMo4079b.mo4070D(serialDescriptor, 13, l84.f49294a, num7);
                    i2 |= 8192;
                    num12 = num12;
                    num6 = num6;
                    break;
                case 14:
                    num6 = num6;
                    num12 = num12;
                    num8 = (Integer) df1VarMo4079b.mo4070D(serialDescriptor, 14, l84.f49294a, num8);
                    i2 |= 16384;
                    num12 = num12;
                    num6 = num6;
                    break;
                case 15:
                    num9 = (Integer) df1VarMo4079b.mo4070D(serialDescriptor, 15, l84.f49294a, num9);
                    i = 32768;
                    i2 |= i;
                    num12 = num12;
                    num6 = num6;
                    break;
                case 16:
                    d2 = (Double) df1VarMo4079b.mo4070D(serialDescriptor, 16, dj2.f35711a, d2);
                    i = 65536;
                    i2 |= i;
                    num12 = num12;
                    num6 = num6;
                    break;
                case 17:
                    d3 = (Double) df1VarMo4079b.mo4070D(serialDescriptor, 17, dj2.f35711a, d3);
                    i = 131072;
                    i2 |= i;
                    num12 = num12;
                    num6 = num6;
                    break;
                case 18:
                    num10 = (Integer) df1VarMo4079b.mo4070D(serialDescriptor, 18, l84.f49294a, num10);
                    i = 262144;
                    i2 |= i;
                    num12 = num12;
                    num6 = num6;
                    break;
                case 19:
                    num11 = (Integer) df1VarMo4079b.mo4070D(serialDescriptor, 19, l84.f49294a, num11);
                    i = 524288;
                    i2 |= i;
                    num12 = num12;
                    num6 = num6;
                    break;
                default:
                    uk9.m22771e(iMo10319A);
                    return null;
            }
        }
        Integer num18 = num2;
        Integer num19 = num12;
        Double d6 = d4;
        Double d7 = d5;
        Integer num20 = num13;
        df1VarMo4079b.mo4086j(serialDescriptor);
        Integer num21 = num11;
        return new JoinedChallengeStats(i2, d6, d7, num20, num14, num15, num16, num17, num19, num6, num4, num3, num18, num5, num7, num8, num9, d2, d3, num10, num21);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, JoinedChallengeStats joinedChallengeStats) {
        encoder.getClass();
        joinedChallengeStats.getClass();
        Integer num = joinedChallengeStats.f20552t;
        Integer num2 = joinedChallengeStats.f20551s;
        Double d = joinedChallengeStats.f20550r;
        Double d2 = joinedChallengeStats.f20549q;
        Integer num3 = joinedChallengeStats.f20548p;
        Integer num4 = joinedChallengeStats.f20547o;
        Integer num5 = joinedChallengeStats.f20546n;
        Integer num6 = joinedChallengeStats.f20545m;
        Integer num7 = joinedChallengeStats.f20544l;
        Integer num8 = joinedChallengeStats.f20543k;
        Integer num9 = joinedChallengeStats.f20542j;
        Integer num10 = joinedChallengeStats.f20541i;
        Integer num11 = joinedChallengeStats.f20540h;
        Integer num12 = joinedChallengeStats.f20539g;
        Integer num13 = joinedChallengeStats.f20538f;
        Integer num14 = joinedChallengeStats.f20537e;
        Integer num15 = joinedChallengeStats.f20536d;
        Integer num16 = joinedChallengeStats.f20535c;
        Double d3 = joinedChallengeStats.f20534b;
        Double d4 = joinedChallengeStats.f20533a;
        SerialDescriptor serialDescriptor = descriptor;
        mk9 mk9VarMo15606b = encoder.mo15606b(serialDescriptor);
        if (mk9VarMo15606b.m16872B(serialDescriptor) || d4 != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 0, dj2.f35711a, d4);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || d3 != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 1, dj2.f35711a, d3);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || num16 != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 2, l84.f49294a, num16);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || num15 != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 3, l84.f49294a, num15);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || num14 != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 4, l84.f49294a, num14);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || num13 != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 5, l84.f49294a, num13);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || num12 != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 6, l84.f49294a, num12);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || num11 != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 7, l84.f49294a, num11);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || num10 != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 8, l84.f49294a, num10);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || num9 != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 9, l84.f49294a, num9);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || num8 != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 10, l84.f49294a, num8);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || num7 != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 11, l84.f49294a, num7);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || num6 != 0) {
            mk9VarMo15606b.m16880x(serialDescriptor, 12, l84.f49294a, num6);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || num5 != 0) {
            mk9VarMo15606b.m16880x(serialDescriptor, 13, l84.f49294a, num5);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || num4 != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 14, l84.f49294a, num4);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || num3 != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 15, l84.f49294a, num3);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || d2 != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 16, dj2.f35711a, d2);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || d != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 17, dj2.f35711a, d);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || num2 != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 18, l84.f49294a, num2);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || num != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 19, l84.f49294a, num);
        }
        mk9VarMo15606b.m16871A(serialDescriptor);
    }

    @Override // p000.zk3
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return te1.f62178b;
    }
}
