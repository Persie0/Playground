package com.lingq.core.domain.model.milestones;

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
import p000.uk9;
import p000.zb2;
import p000.zk3;

/* JADX INFO: loaded from: classes2.dex */
@zb2
public final /* synthetic */ class LessonAchievement$$serializer implements zk3 {
    public static final LessonAchievement$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        LessonAchievement$$serializer lessonAchievement$$serializer = new LessonAchievement$$serializer();
        INSTANCE = lessonAchievement$$serializer;
        bg7 bg7Var = new bg7("com.lingq.core.domain.model.milestones.LessonAchievement", lessonAchievement$$serializer, 4);
        bg7Var.m3702k("lessonId", false);
        bg7Var.m3702k("language", false);
        bg7Var.m3702k("type", false);
        bg7Var.m3702k("data", false);
        descriptor = bg7Var;
    }

    private LessonAchievement$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.zk3
    public final KSerializer[] childSerializers() {
        cs4[] cs4VarArr = LessonAchievement.f19521e;
        return new KSerializer[]{l84.f49294a, sk9.f60959a, cs4VarArr[2].getValue(), cs4VarArr[3].getValue()};
    }

    @Override // kotlinx.serialization.KSerializer
    public final LessonAchievement deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        df1 df1VarMo4079b = decoder.mo4079b(serialDescriptor);
        cs4[] cs4VarArr = LessonAchievement.f19521e;
        boolean z = true;
        int i = 0;
        int iMo4091q = 0;
        String strMo4097x = null;
        LessonAchievementType lessonAchievementType = null;
        AbstractC1479h abstractC1479h = null;
        while (z) {
            int iMo10319A = df1VarMo4079b.mo10319A(serialDescriptor);
            if (iMo10319A == -1) {
                z = false;
            } else if (iMo10319A == 0) {
                iMo4091q = df1VarMo4079b.mo4091q(serialDescriptor, 0);
                i |= 1;
            } else if (iMo10319A == 1) {
                strMo4097x = df1VarMo4079b.mo4097x(serialDescriptor, 1);
                i |= 2;
            } else if (iMo10319A == 2) {
                lessonAchievementType = (LessonAchievementType) df1VarMo4079b.mo4073G(serialDescriptor, 2, (KSerializer) cs4VarArr[2].getValue(), lessonAchievementType);
                i |= 4;
            } else {
                if (iMo10319A != 3) {
                    uk9.m22771e(iMo10319A);
                    return null;
                }
                abstractC1479h = (AbstractC1479h) df1VarMo4079b.mo4073G(serialDescriptor, 3, (KSerializer) cs4VarArr[3].getValue(), abstractC1479h);
                i |= 8;
            }
        }
        df1VarMo4079b.mo4086j(serialDescriptor);
        return new LessonAchievement(i, iMo4091q, strMo4097x, lessonAchievementType, abstractC1479h);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, LessonAchievement lessonAchievement) {
        encoder.getClass();
        lessonAchievement.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        mk9 mk9VarMo15606b = encoder.mo15606b(serialDescriptor);
        cs4[] cs4VarArr = LessonAchievement.f19521e;
        mk9VarMo15606b.m16878v(0, lessonAchievement.f19522a, serialDescriptor);
        mk9VarMo15606b.m16882z(serialDescriptor, 1, lessonAchievement.f19523b);
        mk9VarMo15606b.m16881y(serialDescriptor, 2, (KSerializer) cs4VarArr[2].getValue(), lessonAchievement.f19524c);
        mk9VarMo15606b.m16881y(serialDescriptor, 3, (KSerializer) cs4VarArr[3].getValue(), lessonAchievement.f19525d);
        mk9VarMo15606b.m16871A(serialDescriptor);
    }

    @Override // p000.zk3
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return te1.f62178b;
    }
}
