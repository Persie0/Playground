package com.lingq.core.domain.model.lesson;

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
import p000.uk9;
import p000.zb2;
import p000.zk3;

/* JADX INFO: loaded from: classes2.dex */
@zb2
public final /* synthetic */ class LessonStats$$serializer implements zk3 {
    public static final LessonStats$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        LessonStats$$serializer lessonStats$$serializer = new LessonStats$$serializer();
        INSTANCE = lessonStats$$serializer;
        bg7 bg7Var = new bg7("com.lingq.core.domain.model.lesson.LessonStats", lessonStats$$serializer, 9);
        bg7Var.m3702k("contentId", false);
        bg7Var.m3702k("readWords", false);
        bg7Var.m3702k("lingqsCreated", false);
        bg7Var.m3702k("knownWords", false);
        bg7Var.m3702k("listeningTime", false);
        bg7Var.m3702k("coinsNew", false);
        bg7Var.m3702k("earnedCoins", false);
        bg7Var.m3702k("studyTime", true);
        bg7Var.m3702k("wpm", true);
        descriptor = bg7Var;
    }

    private LessonStats$$serializer() {
    }

    @Override // p000.zk3
    public final KSerializer[] childSerializers() {
        dj2 dj2Var = dj2.f35711a;
        return new KSerializer[]{l84.f49294a, dj2Var, dj2Var, dj2Var, dj2Var, dj2Var, dj2Var, dj2Var, dj2Var};
    }

    @Override // kotlinx.serialization.KSerializer
    public final LessonStats deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        df1 df1VarMo4079b = decoder.mo4079b(serialDescriptor);
        int i = 0;
        int iMo4091q = 0;
        double dMo4072F = 0.0d;
        double dMo4072F2 = 0.0d;
        double dMo4072F3 = 0.0d;
        double dMo4072F4 = 0.0d;
        double dMo4072F5 = 0.0d;
        double dMo4072F6 = 0.0d;
        double dMo4072F7 = 0.0d;
        double dMo4072F8 = 0.0d;
        boolean z = true;
        while (z) {
            int iMo10319A = df1VarMo4079b.mo10319A(serialDescriptor);
            switch (iMo10319A) {
                case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                    z = false;
                    break;
                case 0:
                    iMo4091q = df1VarMo4079b.mo4091q(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    dMo4072F = df1VarMo4079b.mo4072F(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    dMo4072F2 = df1VarMo4079b.mo4072F(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    dMo4072F3 = df1VarMo4079b.mo4072F(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    dMo4072F4 = df1VarMo4079b.mo4072F(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    dMo4072F5 = df1VarMo4079b.mo4072F(serialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    dMo4072F6 = df1VarMo4079b.mo4072F(serialDescriptor, 6);
                    i |= 64;
                    break;
                case 7:
                    dMo4072F7 = df1VarMo4079b.mo4072F(serialDescriptor, 7);
                    i |= 128;
                    break;
                case 8:
                    dMo4072F8 = df1VarMo4079b.mo4072F(serialDescriptor, 8);
                    i |= 256;
                    break;
                default:
                    uk9.m22771e(iMo10319A);
                    return null;
            }
        }
        df1VarMo4079b.mo4086j(serialDescriptor);
        return new LessonStats(i, iMo4091q, dMo4072F, dMo4072F2, dMo4072F3, dMo4072F4, dMo4072F5, dMo4072F6, dMo4072F7, dMo4072F8);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, LessonStats lessonStats) {
        encoder.getClass();
        lessonStats.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        mk9 mk9VarMo15606b = encoder.mo15606b(serialDescriptor);
        int i = lessonStats.f19267a;
        double d = lessonStats.f19275i;
        double d2 = lessonStats.f19274h;
        mk9VarMo15606b.m16878v(0, i, serialDescriptor);
        mk9VarMo15606b.m16874r(serialDescriptor, 1, lessonStats.f19268b);
        mk9VarMo15606b.m16874r(serialDescriptor, 2, lessonStats.f19269c);
        mk9VarMo15606b.m16874r(serialDescriptor, 3, lessonStats.f19270d);
        mk9VarMo15606b.m16874r(serialDescriptor, 4, lessonStats.f19271e);
        mk9VarMo15606b.m16874r(serialDescriptor, 5, lessonStats.f19272f);
        mk9VarMo15606b.m16874r(serialDescriptor, 6, lessonStats.f19273g);
        if (mk9VarMo15606b.m16872B(serialDescriptor) || Double.compare(d2, 0.0d) != 0) {
            mk9VarMo15606b.m16874r(serialDescriptor, 7, d2);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || Double.compare(d, 0.0d) != 0) {
            mk9VarMo15606b.m16874r(serialDescriptor, 8, d);
        }
        mk9VarMo15606b.m16871A(serialDescriptor);
    }

    @Override // p000.zk3
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return te1.f62178b;
    }
}
