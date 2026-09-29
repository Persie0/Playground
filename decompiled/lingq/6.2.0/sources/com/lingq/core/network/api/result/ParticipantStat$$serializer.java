package com.lingq.core.network.api.result;

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
import p000.dj2;
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
public final /* synthetic */ class ParticipantStat$$serializer implements zk3 {
    public static final ParticipantStat$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ParticipantStat$$serializer participantStat$$serializer = new ParticipantStat$$serializer();
        INSTANCE = participantStat$$serializer;
        bg7 bg7Var = new bg7("com.lingq.core.network.api.result.ParticipantStat", participantStat$$serializer, 22);
        bg7Var.m3702k("hitTarget", true);
        bg7Var.m3702k("targets", true);
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

    private ParticipantStat$$serializer() {
    }

    @Override // p000.zk3
    public final KSerializer[] childSerializers() {
        cs4[] cs4VarArr = ParticipantStat.f20573w;
        KSerializer kSerializerM22059r = thb.m22059r(Target$$serializer.INSTANCE);
        KSerializer kSerializerM22059r2 = thb.m22059r((KSerializer) cs4VarArr[1].getValue());
        dj2 dj2Var = dj2.f35711a;
        KSerializer kSerializerM22059r3 = thb.m22059r(dj2Var);
        KSerializer kSerializerM22059r4 = thb.m22059r(dj2Var);
        l84 l84Var = l84.f49294a;
        return new KSerializer[]{kSerializerM22059r, kSerializerM22059r2, kSerializerM22059r3, kSerializerM22059r4, thb.m22059r(l84Var), thb.m22059r(l84Var), thb.m22059r(l84Var), thb.m22059r(l84Var), thb.m22059r(l84Var), thb.m22059r(l84Var), thb.m22059r(l84Var), thb.m22059r(l84Var), thb.m22059r(l84Var), thb.m22059r(l84Var), thb.m22059r(l84Var), thb.m22059r(l84Var), thb.m22059r(l84Var), thb.m22059r(l84Var), thb.m22059r(dj2Var), thb.m22059r(dj2Var), thb.m22059r(l84Var), thb.m22059r(l84Var)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final ParticipantStat deserialize(Decoder decoder) {
        int i;
        Target target;
        Integer num;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        df1 df1VarMo4079b = decoder.mo4079b(serialDescriptor);
        cs4[] cs4VarArr = ParticipantStat.f20573w;
        Integer num2 = null;
        Integer num3 = null;
        Integer num4 = null;
        Integer num5 = null;
        Integer num6 = null;
        Integer num7 = null;
        int i2 = 0;
        Integer num8 = null;
        Integer num9 = null;
        Integer num10 = null;
        Integer num11 = null;
        Integer num12 = null;
        Double d = null;
        Double d2 = null;
        int i3 = 1;
        boolean z = true;
        Target target2 = null;
        List list = null;
        Double d3 = null;
        Double d4 = null;
        Integer num13 = null;
        Integer num14 = null;
        Integer num15 = null;
        Integer num16 = null;
        Integer num17 = null;
        while (z) {
            int iMo10319A = df1VarMo4079b.mo10319A(serialDescriptor);
            switch (iMo10319A) {
                case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                    target = target2;
                    z = false;
                    num4 = num4;
                    i3 = 1;
                    target2 = target;
                    num2 = num2;
                    break;
                case 0:
                    target = (Target) df1VarMo4079b.mo4070D(serialDescriptor, 0, Target$$serializer.INSTANCE, target2);
                    i2 |= 1;
                    list = list;
                    num4 = num4;
                    num3 = num3;
                    i3 = 1;
                    target2 = target;
                    num2 = num2;
                    break;
                case 1:
                    num2 = num2;
                    Integer num18 = num4;
                    int i4 = i3;
                    list = (List) df1VarMo4079b.mo4070D(serialDescriptor, i4, (KSerializer) cs4VarArr[i3].getValue(), list);
                    i2 |= 2;
                    d3 = d3;
                    num4 = num18;
                    num3 = num3;
                    i3 = i4;
                    num2 = num2;
                    break;
                case 2:
                    num = num4;
                    d3 = (Double) df1VarMo4079b.mo4070D(serialDescriptor, 2, dj2.f35711a, d3);
                    i2 |= 4;
                    num4 = num;
                    num3 = num3;
                    num2 = num2;
                    break;
                case 3:
                    num = num4;
                    d4 = (Double) df1VarMo4079b.mo4070D(serialDescriptor, 3, dj2.f35711a, d4);
                    i2 |= 8;
                    num4 = num;
                    num3 = num3;
                    num2 = num2;
                    break;
                case 4:
                    num = num4;
                    num13 = (Integer) df1VarMo4079b.mo4070D(serialDescriptor, 4, l84.f49294a, num13);
                    i2 |= 16;
                    num4 = num;
                    num3 = num3;
                    num2 = num2;
                    break;
                case 5:
                    num = num4;
                    num14 = (Integer) df1VarMo4079b.mo4070D(serialDescriptor, 5, l84.f49294a, num14);
                    i2 |= 32;
                    num4 = num;
                    num3 = num3;
                    num2 = num2;
                    break;
                case 6:
                    num = num4;
                    num15 = (Integer) df1VarMo4079b.mo4070D(serialDescriptor, 6, l84.f49294a, num15);
                    i2 |= 64;
                    num4 = num;
                    num3 = num3;
                    num2 = num2;
                    break;
                case 7:
                    num = num4;
                    num16 = (Integer) df1VarMo4079b.mo4070D(serialDescriptor, 7, l84.f49294a, num16);
                    i2 |= 128;
                    num4 = num;
                    num3 = num3;
                    num2 = num2;
                    break;
                case 8:
                    num = num4;
                    num17 = (Integer) df1VarMo4079b.mo4070D(serialDescriptor, 8, l84.f49294a, num17);
                    i2 |= 256;
                    num4 = num;
                    num3 = num3;
                    num2 = num2;
                    break;
                case 9:
                    num2 = num2;
                    num3 = num3;
                    num4 = (Integer) df1VarMo4079b.mo4070D(serialDescriptor, 9, l84.f49294a, num4);
                    i2 |= 512;
                    num3 = num3;
                    num2 = num2;
                    break;
                case 10:
                    num2 = num2;
                    num3 = (Integer) df1VarMo4079b.mo4070D(serialDescriptor, 10, l84.f49294a, num3);
                    i2 |= 1024;
                    num4 = num4;
                    num2 = num2;
                    break;
                case 11:
                    num3 = num3;
                    num4 = num4;
                    num2 = (Integer) df1VarMo4079b.mo4070D(serialDescriptor, 11, l84.f49294a, num2);
                    i2 |= 2048;
                    num4 = num4;
                    num3 = num3;
                    break;
                case 12:
                    num3 = num3;
                    num4 = num4;
                    num6 = (Integer) df1VarMo4079b.mo4070D(serialDescriptor, 12, l84.f49294a, num6);
                    i2 |= 4096;
                    num4 = num4;
                    num3 = num3;
                    break;
                case 13:
                    num3 = num3;
                    num4 = num4;
                    num8 = (Integer) df1VarMo4079b.mo4070D(serialDescriptor, 13, l84.f49294a, num8);
                    i2 |= 8192;
                    num4 = num4;
                    num3 = num3;
                    break;
                case 14:
                    num3 = num3;
                    num4 = num4;
                    num9 = (Integer) df1VarMo4079b.mo4070D(serialDescriptor, 14, l84.f49294a, num9);
                    i2 |= 16384;
                    num4 = num4;
                    num3 = num3;
                    break;
                case 15:
                    num10 = (Integer) df1VarMo4079b.mo4070D(serialDescriptor, 15, l84.f49294a, num10);
                    i = 32768;
                    i2 |= i;
                    num4 = num4;
                    num3 = num3;
                    break;
                case 16:
                    num11 = (Integer) df1VarMo4079b.mo4070D(serialDescriptor, 16, l84.f49294a, num11);
                    i = 65536;
                    i2 |= i;
                    num4 = num4;
                    num3 = num3;
                    break;
                case 17:
                    num12 = (Integer) df1VarMo4079b.mo4070D(serialDescriptor, 17, l84.f49294a, num12);
                    i = 131072;
                    i2 |= i;
                    num4 = num4;
                    num3 = num3;
                    break;
                case 18:
                    d = (Double) df1VarMo4079b.mo4070D(serialDescriptor, 18, dj2.f35711a, d);
                    i = 262144;
                    i2 |= i;
                    num4 = num4;
                    num3 = num3;
                    break;
                case 19:
                    d2 = (Double) df1VarMo4079b.mo4070D(serialDescriptor, 19, dj2.f35711a, d2);
                    i = 524288;
                    i2 |= i;
                    num4 = num4;
                    num3 = num3;
                    break;
                case 20:
                    num7 = (Integer) df1VarMo4079b.mo4070D(serialDescriptor, 20, l84.f49294a, num7);
                    i = 1048576;
                    i2 |= i;
                    num4 = num4;
                    num3 = num3;
                    break;
                case 21:
                    num5 = (Integer) df1VarMo4079b.mo4070D(serialDescriptor, 21, l84.f49294a, num5);
                    i = 2097152;
                    i2 |= i;
                    num4 = num4;
                    num3 = num3;
                    break;
                default:
                    uk9.m22771e(iMo10319A);
                    return null;
            }
        }
        Integer num19 = num2;
        Integer num20 = num4;
        Target target3 = target2;
        List list2 = list;
        Double d5 = d3;
        df1VarMo4079b.mo4086j(serialDescriptor);
        Double d6 = d2;
        return new ParticipantStat(i2, target3, list2, d5, d4, num13, num14, num15, num16, num17, num20, num3, num19, num6, num8, num9, num10, num11, num12, d, d6, num7, num5);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    /* JADX WARN: Code duplicated, block: B:104:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:109:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:114:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:14:0x007e  */
    /* JADX WARN: Code duplicated, block: B:19:0x0093  */
    /* JADX WARN: Code duplicated, block: B:24:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:29:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:34:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:39:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:44:0x00de  */
    /* JADX WARN: Code duplicated, block: B:49:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:54:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:59:0x010d  */
    /* JADX WARN: Code duplicated, block: B:64:0x011d  */
    /* JADX WARN: Code duplicated, block: B:69:0x012d  */
    /* JADX WARN: Code duplicated, block: B:74:0x013f  */
    /* JADX WARN: Code duplicated, block: B:79:0x0151  */
    /* JADX WARN: Code duplicated, block: B:84:0x0163  */
    /* JADX WARN: Code duplicated, block: B:89:0x0175  */
    /* JADX WARN: Code duplicated, block: B:94:0x0187  */
    /* JADX WARN: Code duplicated, block: B:99:0x0199  */
    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, ParticipantStat participantStat) {
        Integer num;
        encoder.getClass();
        participantStat.getClass();
        Integer num2 = participantStat.f20595v;
        Integer num3 = participantStat.f20594u;
        Double d = participantStat.f20593t;
        Double d2 = participantStat.f20592s;
        Integer num4 = participantStat.f20591r;
        Integer num5 = participantStat.f20590q;
        Integer num6 = participantStat.f20589p;
        Integer num7 = participantStat.f20588o;
        Integer num8 = participantStat.f20587n;
        Integer num9 = participantStat.f20586m;
        Integer num10 = participantStat.f20585l;
        Integer num11 = participantStat.f20584k;
        Integer num12 = participantStat.f20583j;
        Integer num13 = participantStat.f20582i;
        Integer num14 = participantStat.f20581h;
        Integer num15 = participantStat.f20580g;
        Integer num16 = participantStat.f20579f;
        Integer num17 = participantStat.f20578e;
        Double d3 = participantStat.f20577d;
        Double d4 = participantStat.f20576c;
        List list = participantStat.f20575b;
        Target target = participantStat.f20574a;
        SerialDescriptor serialDescriptor = descriptor;
        mk9 mk9VarMo15606b = encoder.mo15606b(serialDescriptor);
        cs4[] cs4VarArr = ParticipantStat.f20573w;
        if (!mk9VarMo15606b.m16872B(serialDescriptor)) {
            num = num8;
            if (!fa4.m11650l(target, new Target())) {
            }
            if (mk9VarMo15606b.m16872B(serialDescriptor) || !fa4.m11650l(list, EmptyList.f47638a)) {
                mk9VarMo15606b.m16880x(serialDescriptor, 1, (KSerializer) cs4VarArr[1].getValue(), list);
            }
            if (mk9VarMo15606b.m16872B(serialDescriptor) || d4 != null) {
                mk9VarMo15606b.m16880x(serialDescriptor, 2, dj2.f35711a, d4);
            }
            if (mk9VarMo15606b.m16872B(serialDescriptor) || d3 != null) {
                mk9VarMo15606b.m16880x(serialDescriptor, 3, dj2.f35711a, d3);
            }
            if (mk9VarMo15606b.m16872B(serialDescriptor) || num17 != null) {
                mk9VarMo15606b.m16880x(serialDescriptor, 4, l84.f49294a, num17);
            }
            if (mk9VarMo15606b.m16872B(serialDescriptor) || num16 != null) {
                mk9VarMo15606b.m16880x(serialDescriptor, 5, l84.f49294a, num16);
            }
            if (mk9VarMo15606b.m16872B(serialDescriptor) || num15 != null) {
                mk9VarMo15606b.m16880x(serialDescriptor, 6, l84.f49294a, num15);
            }
            if (mk9VarMo15606b.m16872B(serialDescriptor) || num14 != null) {
                mk9VarMo15606b.m16880x(serialDescriptor, 7, l84.f49294a, num14);
            }
            if (mk9VarMo15606b.m16872B(serialDescriptor) || num13 != null) {
                mk9VarMo15606b.m16880x(serialDescriptor, 8, l84.f49294a, num13);
            }
            if (mk9VarMo15606b.m16872B(serialDescriptor) || num12 != null) {
                mk9VarMo15606b.m16880x(serialDescriptor, 9, l84.f49294a, num12);
            }
            if (mk9VarMo15606b.m16872B(serialDescriptor) || num11 != null) {
                mk9VarMo15606b.m16880x(serialDescriptor, 10, l84.f49294a, num11);
            }
            if (mk9VarMo15606b.m16872B(serialDescriptor) || num10 != null) {
                mk9VarMo15606b.m16880x(serialDescriptor, 11, l84.f49294a, num10);
            }
            if (mk9VarMo15606b.m16872B(serialDescriptor) || num9 != 0) {
                mk9VarMo15606b.m16880x(serialDescriptor, 12, l84.f49294a, num9);
            }
            if (mk9VarMo15606b.m16872B(serialDescriptor) || num != null) {
                mk9VarMo15606b.m16880x(serialDescriptor, 13, l84.f49294a, num);
            }
            if (mk9VarMo15606b.m16872B(serialDescriptor) || num7 != null) {
                mk9VarMo15606b.m16880x(serialDescriptor, 14, l84.f49294a, num7);
            }
            if (mk9VarMo15606b.m16872B(serialDescriptor) || num6 != null) {
                mk9VarMo15606b.m16880x(serialDescriptor, 15, l84.f49294a, num6);
            }
            if (mk9VarMo15606b.m16872B(serialDescriptor) || num5 != null) {
                mk9VarMo15606b.m16880x(serialDescriptor, 16, l84.f49294a, num5);
            }
            if (mk9VarMo15606b.m16872B(serialDescriptor) || num4 != null) {
                mk9VarMo15606b.m16880x(serialDescriptor, 17, l84.f49294a, num4);
            }
            if (mk9VarMo15606b.m16872B(serialDescriptor) || d2 != null) {
                mk9VarMo15606b.m16880x(serialDescriptor, 18, dj2.f35711a, d2);
            }
            if (mk9VarMo15606b.m16872B(serialDescriptor) || d != null) {
                mk9VarMo15606b.m16880x(serialDescriptor, 19, dj2.f35711a, d);
            }
            if (mk9VarMo15606b.m16872B(serialDescriptor) || num3 != null) {
                mk9VarMo15606b.m16880x(serialDescriptor, 20, l84.f49294a, num3);
            }
            if (mk9VarMo15606b.m16872B(serialDescriptor) || num2 != null) {
                mk9VarMo15606b.m16880x(serialDescriptor, 21, l84.f49294a, num2);
            }
            mk9VarMo15606b.m16871A(serialDescriptor);
        }
        num = num8;
        mk9VarMo15606b.m16880x(serialDescriptor, 0, Target$$serializer.INSTANCE, target);
        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
            mk9VarMo15606b.m16880x(serialDescriptor, 1, (KSerializer) cs4VarArr[1].getValue(), list);
        } else {
            mk9VarMo15606b.m16880x(serialDescriptor, 1, (KSerializer) cs4VarArr[1].getValue(), list);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
            mk9VarMo15606b.m16880x(serialDescriptor, 2, dj2.f35711a, d4);
        } else {
            mk9VarMo15606b.m16880x(serialDescriptor, 2, dj2.f35711a, d4);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
            mk9VarMo15606b.m16880x(serialDescriptor, 3, dj2.f35711a, d3);
        } else {
            mk9VarMo15606b.m16880x(serialDescriptor, 3, dj2.f35711a, d3);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
            mk9VarMo15606b.m16880x(serialDescriptor, 4, l84.f49294a, num17);
        } else {
            mk9VarMo15606b.m16880x(serialDescriptor, 4, l84.f49294a, num17);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
            mk9VarMo15606b.m16880x(serialDescriptor, 5, l84.f49294a, num16);
        } else {
            mk9VarMo15606b.m16880x(serialDescriptor, 5, l84.f49294a, num16);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
            mk9VarMo15606b.m16880x(serialDescriptor, 6, l84.f49294a, num15);
        } else {
            mk9VarMo15606b.m16880x(serialDescriptor, 6, l84.f49294a, num15);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
            mk9VarMo15606b.m16880x(serialDescriptor, 7, l84.f49294a, num14);
        } else {
            mk9VarMo15606b.m16880x(serialDescriptor, 7, l84.f49294a, num14);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
            mk9VarMo15606b.m16880x(serialDescriptor, 8, l84.f49294a, num13);
        } else {
            mk9VarMo15606b.m16880x(serialDescriptor, 8, l84.f49294a, num13);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
            mk9VarMo15606b.m16880x(serialDescriptor, 9, l84.f49294a, num12);
        } else {
            mk9VarMo15606b.m16880x(serialDescriptor, 9, l84.f49294a, num12);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
            mk9VarMo15606b.m16880x(serialDescriptor, 10, l84.f49294a, num11);
        } else {
            mk9VarMo15606b.m16880x(serialDescriptor, 10, l84.f49294a, num11);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
            mk9VarMo15606b.m16880x(serialDescriptor, 11, l84.f49294a, num10);
        } else {
            mk9VarMo15606b.m16880x(serialDescriptor, 11, l84.f49294a, num10);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
            mk9VarMo15606b.m16880x(serialDescriptor, 12, l84.f49294a, num9);
        } else {
            mk9VarMo15606b.m16880x(serialDescriptor, 12, l84.f49294a, num9);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
            mk9VarMo15606b.m16880x(serialDescriptor, 13, l84.f49294a, num);
        } else {
            mk9VarMo15606b.m16880x(serialDescriptor, 13, l84.f49294a, num);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
            mk9VarMo15606b.m16880x(serialDescriptor, 14, l84.f49294a, num7);
        } else {
            mk9VarMo15606b.m16880x(serialDescriptor, 14, l84.f49294a, num7);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
            mk9VarMo15606b.m16880x(serialDescriptor, 15, l84.f49294a, num6);
        } else {
            mk9VarMo15606b.m16880x(serialDescriptor, 15, l84.f49294a, num6);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
            mk9VarMo15606b.m16880x(serialDescriptor, 16, l84.f49294a, num5);
        } else {
            mk9VarMo15606b.m16880x(serialDescriptor, 16, l84.f49294a, num5);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
            mk9VarMo15606b.m16880x(serialDescriptor, 17, l84.f49294a, num4);
        } else {
            mk9VarMo15606b.m16880x(serialDescriptor, 17, l84.f49294a, num4);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
            mk9VarMo15606b.m16880x(serialDescriptor, 18, dj2.f35711a, d2);
        } else {
            mk9VarMo15606b.m16880x(serialDescriptor, 18, dj2.f35711a, d2);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
            mk9VarMo15606b.m16880x(serialDescriptor, 19, dj2.f35711a, d);
        } else {
            mk9VarMo15606b.m16880x(serialDescriptor, 19, dj2.f35711a, d);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
            mk9VarMo15606b.m16880x(serialDescriptor, 20, l84.f49294a, num3);
        } else {
            mk9VarMo15606b.m16880x(serialDescriptor, 20, l84.f49294a, num3);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor)) {
            mk9VarMo15606b.m16880x(serialDescriptor, 21, l84.f49294a, num2);
        } else {
            mk9VarMo15606b.m16880x(serialDescriptor, 21, l84.f49294a, num2);
        }
        mk9VarMo15606b.m16871A(serialDescriptor);
    }

    @Override // p000.zk3
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return te1.f62178b;
    }
}
