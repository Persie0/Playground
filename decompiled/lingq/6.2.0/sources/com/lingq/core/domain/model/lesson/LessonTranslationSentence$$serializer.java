package com.lingq.core.domain.model.lesson;

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
import p000.sk9;
import p000.te1;
import p000.thb;
import p000.uk9;
import p000.zb2;
import p000.zk3;

/* JADX INFO: loaded from: classes2.dex */
@zb2
public final /* synthetic */ class LessonTranslationSentence$$serializer implements zk3 {
    public static final LessonTranslationSentence$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        LessonTranslationSentence$$serializer lessonTranslationSentence$$serializer = new LessonTranslationSentence$$serializer();
        INSTANCE = lessonTranslationSentence$$serializer;
        bg7 bg7Var = new bg7("com.lingq.core.domain.model.lesson.LessonTranslationSentence", lessonTranslationSentence$$serializer, 7);
        bg7Var.m3702k("index", false);
        bg7Var.m3702k("lessonId", false);
        bg7Var.m3702k("audio", false);
        bg7Var.m3702k("audioEnd", false);
        bg7Var.m3702k("text", true);
        bg7Var.m3702k("translations", true);
        bg7Var.m3702k("notes", true);
        descriptor = bg7Var;
    }

    private LessonTranslationSentence$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.zk3
    public final KSerializer[] childSerializers() {
        cs4[] cs4VarArr = LessonTranslationSentence.f19291h;
        l84 l84Var = l84.f49294a;
        dj2 dj2Var = dj2.f35711a;
        return new KSerializer[]{l84Var, l84Var, thb.m22059r(dj2Var), thb.m22059r(dj2Var), sk9.f60959a, cs4VarArr[5].getValue(), cs4VarArr[6].getValue()};
    }

    @Override // kotlinx.serialization.KSerializer
    public final LessonTranslationSentence deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        df1 df1VarMo4079b = decoder.mo4079b(serialDescriptor);
        cs4[] cs4VarArr = LessonTranslationSentence.f19291h;
        LessonTranslationSentence lessonTranslationSentence = null;
        boolean z = true;
        int i = 0;
        int iMo4091q = 0;
        int iMo4091q2 = 0;
        Double d = null;
        Double d2 = null;
        String strMo4097x = null;
        List list = null;
        List list2 = null;
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
                    iMo4091q2 = df1VarMo4079b.mo4091q(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    d = (Double) df1VarMo4079b.mo4070D(serialDescriptor, 2, dj2.f35711a, d);
                    i |= 4;
                    break;
                case 3:
                    d2 = (Double) df1VarMo4079b.mo4070D(serialDescriptor, 3, dj2.f35711a, d2);
                    i |= 8;
                    break;
                case 4:
                    strMo4097x = df1VarMo4079b.mo4097x(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    list = (List) df1VarMo4079b.mo4073G(serialDescriptor, 5, (KSerializer) cs4VarArr[5].getValue(), list);
                    i |= 32;
                    break;
                case 6:
                    list2 = (List) df1VarMo4079b.mo4073G(serialDescriptor, 6, (KSerializer) cs4VarArr[6].getValue(), list2);
                    i |= 64;
                    break;
                default:
                    uk9.m22771e(iMo10319A);
                    return lessonTranslationSentence;
            }
            lessonTranslationSentence = null;
        }
        df1VarMo4079b.mo4086j(serialDescriptor);
        return new LessonTranslationSentence(i, iMo4091q, iMo4091q2, d, d2, strMo4097x, list, list2);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, LessonTranslationSentence lessonTranslationSentence) {
        encoder.getClass();
        lessonTranslationSentence.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        mk9 mk9VarMo15606b = encoder.mo15606b(serialDescriptor);
        cs4[] cs4VarArr = LessonTranslationSentence.f19291h;
        int i = lessonTranslationSentence.f19292a;
        List list = lessonTranslationSentence.f19298g;
        List list2 = lessonTranslationSentence.f19297f;
        String str = lessonTranslationSentence.f19296e;
        mk9VarMo15606b.m16878v(0, i, serialDescriptor);
        mk9VarMo15606b.m16878v(1, lessonTranslationSentence.f19293b, serialDescriptor);
        dj2 dj2Var = dj2.f35711a;
        mk9VarMo15606b.m16880x(serialDescriptor, 2, dj2Var, lessonTranslationSentence.f19294c);
        mk9VarMo15606b.m16880x(serialDescriptor, 3, dj2Var, lessonTranslationSentence.f19295d);
        if (mk9VarMo15606b.m16872B(serialDescriptor) || !fa4.m11650l(str, "")) {
            mk9VarMo15606b.m16882z(serialDescriptor, 4, str);
        }
        boolean zM16872B = mk9VarMo15606b.m16872B(serialDescriptor);
        EmptyList emptyList = EmptyList.f47638a;
        if (zM16872B || !fa4.m11650l(list2, emptyList)) {
            mk9VarMo15606b.m16881y(serialDescriptor, 5, (KSerializer) cs4VarArr[5].getValue(), list2);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || !fa4.m11650l(list, emptyList)) {
            mk9VarMo15606b.m16881y(serialDescriptor, 6, (KSerializer) cs4VarArr[6].getValue(), list);
        }
        mk9VarMo15606b.m16871A(serialDescriptor);
    }

    @Override // p000.zk3
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return te1.f62178b;
    }
}
