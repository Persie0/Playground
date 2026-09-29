package com.lingq.core.domain.model.milestones;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import p000.bg7;
import p000.df1;
import p000.mk9;
import p000.te1;
import p000.uk9;
import p000.zb2;
import p000.zk3;

/* JADX INFO: loaded from: classes2.dex */
@zb2
public final /* synthetic */ class LessonAchievementData$DailyGoal$$serializer implements zk3 {
    public static final LessonAchievementData$DailyGoal$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        LessonAchievementData$DailyGoal$$serializer lessonAchievementData$DailyGoal$$serializer = new LessonAchievementData$DailyGoal$$serializer();
        INSTANCE = lessonAchievementData$DailyGoal$$serializer;
        bg7 bg7Var = new bg7("com.lingq.core.domain.model.milestones.LessonAchievementData.DailyGoal", lessonAchievementData$DailyGoal$$serializer, 1);
        bg7Var.m3702k("dailyGoalMet", false);
        descriptor = bg7Var;
    }

    private LessonAchievementData$DailyGoal$$serializer() {
    }

    @Override // p000.zk3
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{DailyGoalMet$$serializer.INSTANCE};
    }

    @Override // kotlinx.serialization.KSerializer
    public final LessonAchievementData$DailyGoal deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        df1 df1VarMo4079b = decoder.mo4079b(serialDescriptor);
        boolean z = true;
        int i = 0;
        DailyGoalMet dailyGoalMet = null;
        while (z) {
            int iMo10319A = df1VarMo4079b.mo10319A(serialDescriptor);
            if (iMo10319A == -1) {
                z = false;
            } else {
                if (iMo10319A != 0) {
                    uk9.m22771e(iMo10319A);
                    return null;
                }
                dailyGoalMet = (DailyGoalMet) df1VarMo4079b.mo4073G(serialDescriptor, 0, DailyGoalMet$$serializer.INSTANCE, dailyGoalMet);
                i = 1;
            }
        }
        df1VarMo4079b.mo4086j(serialDescriptor);
        return new LessonAchievementData$DailyGoal(i, dailyGoalMet);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, LessonAchievementData$DailyGoal lessonAchievementData$DailyGoal) {
        encoder.getClass();
        lessonAchievementData$DailyGoal.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        mk9 mk9VarMo15606b = encoder.mo15606b(serialDescriptor);
        mk9VarMo15606b.m16881y(serialDescriptor, 0, DailyGoalMet$$serializer.INSTANCE, lessonAchievementData$DailyGoal.f19526b);
        mk9VarMo15606b.m16871A(serialDescriptor);
    }

    @Override // p000.zk3
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return te1.f62178b;
    }
}
