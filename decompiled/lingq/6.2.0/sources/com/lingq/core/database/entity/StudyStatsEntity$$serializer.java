package com.lingq.core.database.entity;

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
import p000.lf0;
import p000.mk9;
import p000.sk9;
import p000.te1;
import p000.thb;
import p000.uk9;
import p000.zb2;
import p000.zk3;

/* JADX INFO: loaded from: classes2.dex */
@zb2
public final /* synthetic */ class StudyStatsEntity$$serializer implements zk3 {
    public static final StudyStatsEntity$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        StudyStatsEntity$$serializer studyStatsEntity$$serializer = new StudyStatsEntity$$serializer();
        INSTANCE = studyStatsEntity$$serializer;
        bg7 bg7Var = new bg7("com.lingq.core.database.entity.StudyStatsEntity", studyStatsEntity$$serializer, 11);
        bg7Var.m3702k("code", false);
        bg7Var.m3702k("language", true);
        bg7Var.m3702k("activityApple", true);
        bg7Var.m3702k("notificationsCount", true);
        bg7Var.m3702k("dailyGoal", true);
        bg7Var.m3702k("streakDays", true);
        bg7Var.m3702k("coins", true);
        bg7Var.m3702k("knownWords", true);
        bg7Var.m3702k("isAvatarUpgraded", true);
        bg7Var.m3702k("dailyScores", true);
        bg7Var.m3702k("activityLevel", true);
        descriptor = bg7Var;
    }

    private StudyStatsEntity$$serializer() {
    }

    @Override // p000.zk3
    public final KSerializer[] childSerializers() {
        cs4[] cs4VarArr = StudyStatsEntity.f17461l;
        sk9 sk9Var = sk9.f60959a;
        KSerializer kSerializerM22059r = thb.m22059r(sk9Var);
        KSerializer kSerializerM22059r2 = thb.m22059r(sk9Var);
        KSerializer kSerializerM22059r3 = thb.m22059r((KSerializer) cs4VarArr[9].getValue());
        l84 l84Var = l84.f49294a;
        return new KSerializer[]{sk9Var, kSerializerM22059r, kSerializerM22059r2, l84Var, l84Var, l84Var, l84Var, l84Var, lf0.f49579a, kSerializerM22059r3, l84Var};
    }

    @Override // kotlinx.serialization.KSerializer
    public final StudyStatsEntity deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        df1 df1VarMo4079b = decoder.mo4079b(serialDescriptor);
        cs4[] cs4VarArr = StudyStatsEntity.f17461l;
        StudyStatsEntity studyStatsEntity = null;
        boolean z = true;
        List list = null;
        String strMo4097x = null;
        String str = null;
        String str2 = null;
        int i = 0;
        int iMo4091q = 0;
        int iMo4091q2 = 0;
        int iMo4091q3 = 0;
        int iMo4091q4 = 0;
        int iMo4091q5 = 0;
        boolean zMo4094v = false;
        int iMo4091q6 = 0;
        while (z) {
            int iMo10319A = df1VarMo4079b.mo10319A(serialDescriptor);
            switch (iMo10319A) {
                case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                    z = false;
                    continue;
                case 0:
                    strMo4097x = df1VarMo4079b.mo4097x(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    str = (String) df1VarMo4079b.mo4070D(serialDescriptor, 1, sk9.f60959a, str);
                    i |= 2;
                    break;
                case 2:
                    str2 = (String) df1VarMo4079b.mo4070D(serialDescriptor, 2, sk9.f60959a, str2);
                    i |= 4;
                    break;
                case 3:
                    iMo4091q = df1VarMo4079b.mo4091q(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    iMo4091q2 = df1VarMo4079b.mo4091q(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    iMo4091q3 = df1VarMo4079b.mo4091q(serialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    iMo4091q4 = df1VarMo4079b.mo4091q(serialDescriptor, 6);
                    i |= 64;
                    break;
                case 7:
                    iMo4091q5 = df1VarMo4079b.mo4091q(serialDescriptor, 7);
                    i |= 128;
                    break;
                case 8:
                    zMo4094v = df1VarMo4079b.mo4094v(serialDescriptor, 8);
                    i |= 256;
                    break;
                case 9:
                    list = (List) df1VarMo4079b.mo4070D(serialDescriptor, 9, (KSerializer) cs4VarArr[9].getValue(), list);
                    i |= 512;
                    break;
                case 10:
                    iMo4091q6 = df1VarMo4079b.mo4091q(serialDescriptor, 10);
                    i |= 1024;
                    break;
                default:
                    uk9.m22771e(iMo10319A);
                    return studyStatsEntity;
            }
            studyStatsEntity = null;
        }
        df1VarMo4079b.mo4086j(serialDescriptor);
        return new StudyStatsEntity(i, strMo4097x, str, str2, iMo4091q, iMo4091q2, iMo4091q3, iMo4091q4, iMo4091q5, zMo4094v, list, iMo4091q6);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, StudyStatsEntity studyStatsEntity) {
        encoder.getClass();
        studyStatsEntity.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        mk9 mk9VarMo15606b = encoder.mo15606b(serialDescriptor);
        cs4[] cs4VarArr = StudyStatsEntity.f17461l;
        String str = studyStatsEntity.f17462a;
        int i = studyStatsEntity.f17472k;
        List list = studyStatsEntity.f17471j;
        boolean z = studyStatsEntity.f17470i;
        int i2 = studyStatsEntity.f17469h;
        int i3 = studyStatsEntity.f17468g;
        int i4 = studyStatsEntity.f17467f;
        int i5 = studyStatsEntity.f17466e;
        int i6 = studyStatsEntity.f17465d;
        String str2 = studyStatsEntity.f17464c;
        String str3 = studyStatsEntity.f17463b;
        mk9VarMo15606b.m16882z(serialDescriptor, 0, str);
        if (mk9VarMo15606b.m16872B(serialDescriptor) || str3 != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 1, sk9.f60959a, str3);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || str2 != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 2, sk9.f60959a, str2);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || i6 != 0) {
            mk9VarMo15606b.m16878v(3, i6, serialDescriptor);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || i5 != 0) {
            mk9VarMo15606b.m16878v(4, i5, serialDescriptor);
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
        if (mk9VarMo15606b.m16872B(serialDescriptor) || z) {
            mk9VarMo15606b.m16873q(serialDescriptor, 8, z);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || list != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 9, (KSerializer) cs4VarArr[9].getValue(), list);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || i != 0) {
            mk9VarMo15606b.m16878v(10, i, serialDescriptor);
        }
        mk9VarMo15606b.m16871A(serialDescriptor);
    }

    @Override // p000.zk3
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return te1.f62178b;
    }
}
