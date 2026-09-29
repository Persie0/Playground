package com.lingq.feature.onboarding.p014v2.domain;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import p000.bg7;
import p000.cs4;
import p000.df1;
import p000.fa4;
import p000.mk9;
import p000.sk9;
import p000.te1;
import p000.uk9;
import p000.zb2;
import p000.zk3;

/* JADX INFO: loaded from: classes3.dex */
@zb2
public final /* synthetic */ class MiniLessonTemplate$$serializer implements zk3 {
    public static final int $stable;
    public static final MiniLessonTemplate$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        MiniLessonTemplate$$serializer miniLessonTemplate$$serializer = new MiniLessonTemplate$$serializer();
        INSTANCE = miniLessonTemplate$$serializer;
        $stable = 8;
        bg7 bg7Var = new bg7("com.lingq.feature.onboarding.v2.domain.MiniLessonTemplate", miniLessonTemplate$$serializer, 6);
        bg7Var.m3702k("languageCode", false);
        bg7Var.m3702k("languageTitle", false);
        bg7Var.m3702k("sentence", false);
        bg7Var.m3702k("words", false);
        bg7Var.m3702k("lynxUserMessage", true);
        bg7Var.m3702k("lynxBotMessage", true);
        descriptor = bg7Var;
    }

    private MiniLessonTemplate$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.zk3
    public final KSerializer[] childSerializers() {
        cs4[] cs4VarArr = MiniLessonTemplate.f27415g;
        sk9 sk9Var = sk9.f60959a;
        return new KSerializer[]{sk9Var, sk9Var, sk9Var, cs4VarArr[3].getValue(), sk9Var, sk9Var};
    }

    @Override // kotlinx.serialization.KSerializer
    public final MiniLessonTemplate deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        df1 df1VarMo4079b = decoder.mo4079b(serialDescriptor);
        cs4[] cs4VarArr = MiniLessonTemplate.f27415g;
        boolean z = true;
        int i = 0;
        String strMo4097x = null;
        String strMo4097x2 = null;
        String strMo4097x3 = null;
        List list = null;
        String strMo4097x4 = null;
        String strMo4097x5 = null;
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
                    strMo4097x2 = df1VarMo4079b.mo4097x(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    strMo4097x3 = df1VarMo4079b.mo4097x(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    list = (List) df1VarMo4079b.mo4073G(serialDescriptor, 3, (KSerializer) cs4VarArr[3].getValue(), list);
                    i |= 8;
                    break;
                case 4:
                    strMo4097x4 = df1VarMo4079b.mo4097x(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    strMo4097x5 = df1VarMo4079b.mo4097x(serialDescriptor, 5);
                    i |= 32;
                    break;
                default:
                    uk9.m22771e(iMo10319A);
                    return null;
            }
        }
        df1VarMo4079b.mo4086j(serialDescriptor);
        return new MiniLessonTemplate(i, strMo4097x, strMo4097x2, strMo4097x3, list, strMo4097x4, strMo4097x5);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, MiniLessonTemplate miniLessonTemplate) {
        encoder.getClass();
        miniLessonTemplate.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        mk9 mk9VarMo15606b = encoder.mo15606b(serialDescriptor);
        cs4[] cs4VarArr = MiniLessonTemplate.f27415g;
        String str = miniLessonTemplate.f27416a;
        String str2 = miniLessonTemplate.f27421f;
        String str3 = miniLessonTemplate.f27420e;
        mk9VarMo15606b.m16882z(serialDescriptor, 0, str);
        mk9VarMo15606b.m16882z(serialDescriptor, 1, miniLessonTemplate.f27417b);
        mk9VarMo15606b.m16882z(serialDescriptor, 2, miniLessonTemplate.f27418c);
        mk9VarMo15606b.m16881y(serialDescriptor, 3, (KSerializer) cs4VarArr[3].getValue(), miniLessonTemplate.f27419d);
        if (mk9VarMo15606b.m16872B(serialDescriptor) || !fa4.m11650l(str3, "")) {
            mk9VarMo15606b.m16882z(serialDescriptor, 4, str3);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || !fa4.m11650l(str2, "")) {
            mk9VarMo15606b.m16882z(serialDescriptor, 5, str2);
        }
        mk9VarMo15606b.m16871A(serialDescriptor);
    }

    @Override // p000.zk3
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return te1.f62178b;
    }
}
