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
import p000.fa4;
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
public final /* synthetic */ class LessonSentence$$serializer implements zk3 {
    public static final LessonSentence$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        LessonSentence$$serializer lessonSentence$$serializer = new LessonSentence$$serializer();
        INSTANCE = lessonSentence$$serializer;
        bg7 bg7Var = new bg7("com.lingq.core.domain.model.lesson.LessonSentence", lessonSentence$$serializer, 8);
        bg7Var.m3702k("tokens", true);
        bg7Var.m3702k("text", false);
        bg7Var.m3702k("normalizedText", false);
        bg7Var.m3702k("index", false);
        bg7Var.m3702k("timestamp", true);
        bg7Var.m3702k("startParagraph", true);
        bg7Var.m3702k("url", true);
        bg7Var.m3702k("opentag", true);
        descriptor = bg7Var;
    }

    private LessonSentence$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.zk3
    public final KSerializer[] childSerializers() {
        cs4[] cs4VarArr = LessonSentence.f19252i;
        sk9 sk9Var = sk9.f60959a;
        return new KSerializer[]{cs4VarArr[0].getValue(), thb.m22059r(sk9Var), thb.m22059r(sk9Var), l84.f49294a, thb.m22059r((KSerializer) cs4VarArr[4].getValue()), lf0.f49579a, thb.m22059r(sk9Var), thb.m22059r(sk9Var)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final LessonSentence deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        df1 df1VarMo4079b = decoder.mo4079b(serialDescriptor);
        cs4[] cs4VarArr = LessonSentence.f19252i;
        LessonSentence lessonSentence = null;
        boolean z = true;
        String str = null;
        List list = null;
        String str2 = null;
        String str3 = null;
        List list2 = null;
        String str4 = null;
        int i = 0;
        int iMo4091q = 0;
        boolean zMo4094v = false;
        while (z) {
            int iMo10319A = df1VarMo4079b.mo10319A(serialDescriptor);
            switch (iMo10319A) {
                case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                    z = false;
                    break;
                case 0:
                    list = (List) df1VarMo4079b.mo4073G(serialDescriptor, 0, (KSerializer) cs4VarArr[0].getValue(), list);
                    i |= 1;
                    break;
                case 1:
                    str2 = (String) df1VarMo4079b.mo4070D(serialDescriptor, 1, sk9.f60959a, str2);
                    i |= 2;
                    break;
                case 2:
                    str3 = (String) df1VarMo4079b.mo4070D(serialDescriptor, 2, sk9.f60959a, str3);
                    i |= 4;
                    break;
                case 3:
                    iMo4091q = df1VarMo4079b.mo4091q(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    list2 = (List) df1VarMo4079b.mo4070D(serialDescriptor, 4, (KSerializer) cs4VarArr[4].getValue(), list2);
                    i |= 16;
                    break;
                case 5:
                    zMo4094v = df1VarMo4079b.mo4094v(serialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    str4 = (String) df1VarMo4079b.mo4070D(serialDescriptor, 6, sk9.f60959a, str4);
                    i |= 64;
                    break;
                case 7:
                    str = (String) df1VarMo4079b.mo4070D(serialDescriptor, 7, sk9.f60959a, str);
                    i |= 128;
                    break;
                default:
                    uk9.m22771e(iMo10319A);
                    return lessonSentence;
            }
            lessonSentence = null;
        }
        df1VarMo4079b.mo4086j(serialDescriptor);
        return new LessonSentence(i, list, str2, str3, iMo4091q, list2, zMo4094v, str4, str);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, LessonSentence lessonSentence) {
        encoder.getClass();
        lessonSentence.getClass();
        List list = lessonSentence.f19253a;
        SerialDescriptor serialDescriptor = descriptor;
        mk9 mk9VarMo15606b = encoder.mo15606b(serialDescriptor);
        cs4[] cs4VarArr = LessonSentence.f19252i;
        boolean zM16872B = mk9VarMo15606b.m16872B(serialDescriptor);
        EmptyList emptyList = EmptyList.f47638a;
        if (zM16872B || !fa4.m11650l(list, emptyList)) {
            mk9VarMo15606b.m16881y(serialDescriptor, 0, (KSerializer) cs4VarArr[0].getValue(), list);
        }
        sk9 sk9Var = sk9.f60959a;
        String str = lessonSentence.f19254b;
        String str2 = lessonSentence.f19260h;
        String str3 = lessonSentence.f19259g;
        boolean z = lessonSentence.f19258f;
        List list2 = lessonSentence.f19257e;
        mk9VarMo15606b.m16880x(serialDescriptor, 1, sk9Var, str);
        mk9VarMo15606b.m16880x(serialDescriptor, 2, sk9Var, lessonSentence.f19255c);
        mk9VarMo15606b.m16878v(3, lessonSentence.f19256d, serialDescriptor);
        if (mk9VarMo15606b.m16872B(serialDescriptor) || !fa4.m11650l(list2, emptyList)) {
            mk9VarMo15606b.m16880x(serialDescriptor, 4, (KSerializer) cs4VarArr[4].getValue(), list2);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || z) {
            mk9VarMo15606b.m16873q(serialDescriptor, 5, z);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || str3 != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 6, sk9Var, str3);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || str2 != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 7, sk9Var, str2);
        }
        mk9VarMo15606b.m16871A(serialDescriptor);
    }

    @Override // p000.zk3
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return te1.f62178b;
    }
}
