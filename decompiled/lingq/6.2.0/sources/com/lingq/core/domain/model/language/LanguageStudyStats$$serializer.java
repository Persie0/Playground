package com.lingq.core.domain.model.language;

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
import p000.sk9;
import p000.te1;
import p000.uk9;
import p000.zb2;
import p000.zk3;

/* JADX INFO: loaded from: classes2.dex */
@zb2
public final /* synthetic */ class LanguageStudyStats$$serializer implements zk3 {
    public static final LanguageStudyStats$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        LanguageStudyStats$$serializer languageStudyStats$$serializer = new LanguageStudyStats$$serializer();
        INSTANCE = languageStudyStats$$serializer;
        bg7 bg7Var = new bg7("com.lingq.core.domain.model.language.LanguageStudyStats", languageStudyStats$$serializer, 7);
        bg7Var.m3702k("language", true);
        bg7Var.m3702k("dailyGoal", true);
        bg7Var.m3702k("streakDays", true);
        bg7Var.m3702k("coins", true);
        bg7Var.m3702k("knownWords", true);
        bg7Var.m3702k("dailyScores", true);
        bg7Var.m3702k("activityLevel", true);
        descriptor = bg7Var;
    }

    private LanguageStudyStats$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.zk3
    public final KSerializer[] childSerializers() {
        cs4[] cs4VarArr = LanguageStudyStats.f19105h;
        l84 l84Var = l84.f49294a;
        return new KSerializer[]{sk9.f60959a, l84Var, l84Var, l84Var, l84Var, cs4VarArr[5].getValue(), l84Var};
    }

    @Override // kotlinx.serialization.KSerializer
    public final LanguageStudyStats deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        df1 df1VarMo4079b = decoder.mo4079b(serialDescriptor);
        cs4[] cs4VarArr = LanguageStudyStats.f19105h;
        LanguageStudyStats languageStudyStats = null;
        boolean z = true;
        int i = 0;
        int iMo4091q = 0;
        int iMo4091q2 = 0;
        int iMo4091q3 = 0;
        int iMo4091q4 = 0;
        int iMo4091q5 = 0;
        String strMo4097x = null;
        List list = null;
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
                    iMo4091q4 = df1VarMo4079b.mo4091q(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    list = (List) df1VarMo4079b.mo4073G(serialDescriptor, 5, (KSerializer) cs4VarArr[5].getValue(), list);
                    i |= 32;
                    break;
                case 6:
                    iMo4091q5 = df1VarMo4079b.mo4091q(serialDescriptor, 6);
                    i |= 64;
                    continue;
                default:
                    uk9.m22771e(iMo10319A);
                    return languageStudyStats;
            }
            languageStudyStats = null;
        }
        df1VarMo4079b.mo4086j(serialDescriptor);
        return new LanguageStudyStats(i, strMo4097x, iMo4091q, iMo4091q2, iMo4091q3, iMo4091q4, list, iMo4091q5);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, LanguageStudyStats languageStudyStats) {
        encoder.getClass();
        languageStudyStats.getClass();
        int i = languageStudyStats.f19112g;
        List list = languageStudyStats.f19111f;
        int i2 = languageStudyStats.f19110e;
        int i3 = languageStudyStats.f19109d;
        int i4 = languageStudyStats.f19108c;
        int i5 = languageStudyStats.f19107b;
        String str = languageStudyStats.f19106a;
        SerialDescriptor serialDescriptor = descriptor;
        mk9 mk9VarMo15606b = encoder.mo15606b(serialDescriptor);
        cs4[] cs4VarArr = LanguageStudyStats.f19105h;
        if (mk9VarMo15606b.m16872B(serialDescriptor) || !fa4.m11650l(str, "")) {
            mk9VarMo15606b.m16882z(serialDescriptor, 0, str);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || i5 != 0) {
            mk9VarMo15606b.m16878v(1, i5, serialDescriptor);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || i4 != 0) {
            mk9VarMo15606b.m16878v(2, i4, serialDescriptor);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || i3 != 0) {
            mk9VarMo15606b.m16878v(3, i3, serialDescriptor);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || i2 != 0) {
            mk9VarMo15606b.m16878v(4, i2, serialDescriptor);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || !fa4.m11650l(list, EmptyList.f47638a)) {
            mk9VarMo15606b.m16881y(serialDescriptor, 5, (KSerializer) cs4VarArr[5].getValue(), list);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || i != 0) {
            mk9VarMo15606b.m16878v(6, i, serialDescriptor);
        }
        mk9VarMo15606b.m16871A(serialDescriptor);
    }

    @Override // p000.zk3
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return te1.f62178b;
    }
}
