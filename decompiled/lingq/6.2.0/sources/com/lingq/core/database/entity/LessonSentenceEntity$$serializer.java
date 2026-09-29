package com.lingq.core.database.entity;

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
public final /* synthetic */ class LessonSentenceEntity$$serializer implements zk3 {
    public static final LessonSentenceEntity$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        LessonSentenceEntity$$serializer lessonSentenceEntity$$serializer = new LessonSentenceEntity$$serializer();
        INSTANCE = lessonSentenceEntity$$serializer;
        bg7 bg7Var = new bg7("com.lingq.core.database.entity.LessonSentenceEntity", lessonSentenceEntity$$serializer, 9);
        bg7Var.m3702k("lessonId", false);
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

    private LessonSentenceEntity$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.zk3
    public final KSerializer[] childSerializers() {
        cs4[] cs4VarArr = LessonSentenceEntity.f17334j;
        l84 l84Var = l84.f49294a;
        sk9 sk9Var = sk9.f60959a;
        return new KSerializer[]{l84Var, cs4VarArr[1].getValue(), thb.m22059r(sk9Var), thb.m22059r(sk9Var), l84Var, thb.m22059r((KSerializer) cs4VarArr[5].getValue()), lf0.f49579a, thb.m22059r(sk9Var), thb.m22059r(sk9Var)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final LessonSentenceEntity deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        df1 df1VarMo4079b = decoder.mo4079b(serialDescriptor);
        cs4[] cs4VarArr = LessonSentenceEntity.f17334j;
        LessonSentenceEntity lessonSentenceEntity = null;
        boolean z = true;
        List list = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        List list2 = null;
        int i = 0;
        int iMo4091q = 0;
        int iMo4091q2 = 0;
        boolean zMo4094v = false;
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
                    list2 = (List) df1VarMo4079b.mo4073G(serialDescriptor, 1, (KSerializer) cs4VarArr[1].getValue(), list2);
                    i |= 2;
                    break;
                case 2:
                    str = (String) df1VarMo4079b.mo4070D(serialDescriptor, 2, sk9.f60959a, str);
                    i |= 4;
                    break;
                case 3:
                    str2 = (String) df1VarMo4079b.mo4070D(serialDescriptor, 3, sk9.f60959a, str2);
                    i |= 8;
                    break;
                case 4:
                    iMo4091q2 = df1VarMo4079b.mo4091q(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    list = (List) df1VarMo4079b.mo4070D(serialDescriptor, 5, (KSerializer) cs4VarArr[5].getValue(), list);
                    i |= 32;
                    break;
                case 6:
                    zMo4094v = df1VarMo4079b.mo4094v(serialDescriptor, 6);
                    i |= 64;
                    break;
                case 7:
                    str3 = (String) df1VarMo4079b.mo4070D(serialDescriptor, 7, sk9.f60959a, str3);
                    i |= 128;
                    break;
                case 8:
                    str4 = (String) df1VarMo4079b.mo4070D(serialDescriptor, 8, sk9.f60959a, str4);
                    i |= 256;
                    break;
                default:
                    uk9.m22771e(iMo10319A);
                    return lessonSentenceEntity;
            }
            lessonSentenceEntity = null;
        }
        df1VarMo4079b.mo4086j(serialDescriptor);
        return new LessonSentenceEntity(i, iMo4091q, iMo4091q2, str, str2, str3, str4, list2, list, zMo4094v);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, LessonSentenceEntity lessonSentenceEntity) {
        encoder.getClass();
        lessonSentenceEntity.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        mk9 mk9VarMo15606b = encoder.mo15606b(serialDescriptor);
        cs4[] cs4VarArr = LessonSentenceEntity.f17334j;
        int i = lessonSentenceEntity.f17335a;
        String str = lessonSentenceEntity.f17343i;
        String str2 = lessonSentenceEntity.f17342h;
        boolean z = lessonSentenceEntity.f17341g;
        List list = lessonSentenceEntity.f17340f;
        List list2 = lessonSentenceEntity.f17336b;
        mk9VarMo15606b.m16878v(0, i, serialDescriptor);
        boolean zM16872B = mk9VarMo15606b.m16872B(serialDescriptor);
        EmptyList emptyList = EmptyList.f47638a;
        if (zM16872B || !fa4.m11650l(list2, emptyList)) {
            mk9VarMo15606b.m16881y(serialDescriptor, 1, (KSerializer) cs4VarArr[1].getValue(), list2);
        }
        sk9 sk9Var = sk9.f60959a;
        mk9VarMo15606b.m16880x(serialDescriptor, 2, sk9Var, lessonSentenceEntity.f17337c);
        mk9VarMo15606b.m16880x(serialDescriptor, 3, sk9Var, lessonSentenceEntity.f17338d);
        mk9VarMo15606b.m16878v(4, lessonSentenceEntity.f17339e, serialDescriptor);
        if (mk9VarMo15606b.m16872B(serialDescriptor) || !fa4.m11650l(list, emptyList)) {
            mk9VarMo15606b.m16880x(serialDescriptor, 5, (KSerializer) cs4VarArr[5].getValue(), list);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || z) {
            mk9VarMo15606b.m16873q(serialDescriptor, 6, z);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || str2 != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 7, sk9Var, str2);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || str != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 8, sk9Var, str);
        }
        mk9VarMo15606b.m16871A(serialDescriptor);
    }

    @Override // p000.zk3
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return te1.f62178b;
    }
}
