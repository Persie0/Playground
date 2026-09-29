package com.lingq.core.domain.model.lesson;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import p000.bg7;
import p000.df1;
import p000.dj2;
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
public final /* synthetic */ class LessonCompleteData$$serializer implements zk3 {
    public static final LessonCompleteData$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        LessonCompleteData$$serializer lessonCompleteData$$serializer = new LessonCompleteData$$serializer();
        INSTANCE = lessonCompleteData$$serializer;
        bg7 bg7Var = new bg7("com.lingq.core.domain.model.lesson.LessonCompleteData", lessonCompleteData$$serializer, 18);
        bg7Var.m3702k("id", true);
        bg7Var.m3702k("nextLessonId", true);
        bg7Var.m3702k("collectionId", true);
        bg7Var.m3702k("collectionTitle", true);
        bg7Var.m3702k("readTimes", true);
        bg7Var.m3702k("listenTimes", true);
        bg7Var.m3702k("duration", true);
        bg7Var.m3702k("wordCount", true);
        bg7Var.m3702k("isFavorite", true);
        bg7Var.m3702k("isRoseGiven", true);
        bg7Var.m3702k("url", true);
        bg7Var.m3702k("audioUrl", false);
        bg7Var.m3702k("originalImageUrl", false);
        bg7Var.m3702k("isCompleted", true);
        bg7Var.m3702k("status", true);
        bg7Var.m3702k("price", true);
        bg7Var.m3702k("nextLesson", true);
        bg7Var.m3702k("previousLesson", true);
        descriptor = bg7Var;
    }

    private LessonCompleteData$$serializer() {
    }

    @Override // p000.zk3
    public final KSerializer[] childSerializers() {
        l84 l84Var = l84.f49294a;
        KSerializer kSerializerM22059r = thb.m22059r(l84Var);
        sk9 sk9Var = sk9.f60959a;
        KSerializer kSerializerM22059r2 = thb.m22059r(sk9Var);
        KSerializer kSerializerM22059r3 = thb.m22059r(sk9Var);
        KSerializer kSerializerM22059r4 = thb.m22059r(sk9Var);
        KSerializer kSerializerM22059r5 = thb.m22059r(sk9Var);
        KSerializer kSerializerM22059r6 = thb.m22059r(sk9Var);
        LessonReference$$serializer lessonReference$$serializer = LessonReference$$serializer.INSTANCE;
        KSerializer kSerializerM22059r7 = thb.m22059r(lessonReference$$serializer);
        KSerializer kSerializerM22059r8 = thb.m22059r(lessonReference$$serializer);
        dj2 dj2Var = dj2.f35711a;
        lf0 lf0Var = lf0.f49579a;
        return new KSerializer[]{l84Var, kSerializerM22059r, l84Var, kSerializerM22059r2, dj2Var, dj2Var, l84Var, l84Var, lf0Var, lf0Var, kSerializerM22059r3, kSerializerM22059r4, kSerializerM22059r5, lf0Var, kSerializerM22059r6, l84Var, kSerializerM22059r7, kSerializerM22059r8};
    }

    @Override // kotlinx.serialization.KSerializer
    public final LessonCompleteData deserialize(Decoder decoder) {
        int i;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        df1 df1VarMo4079b = decoder.mo4079b(serialDescriptor);
        double dMo4072F = 0.0d;
        double dMo4072F2 = 0.0d;
        LessonReference lessonReference = null;
        String str = null;
        String str2 = null;
        LessonReference lessonReference2 = null;
        String str3 = null;
        String str4 = null;
        int i2 = 0;
        int iMo4091q = 0;
        Integer num = null;
        int iMo4091q2 = 0;
        String str5 = null;
        int iMo4091q3 = 0;
        int iMo4091q4 = 0;
        boolean zMo4094v = false;
        boolean zMo4094v2 = false;
        boolean z = true;
        boolean zMo4094v3 = false;
        int iMo4091q5 = 0;
        while (z) {
            int iMo10319A = df1VarMo4079b.mo10319A(serialDescriptor);
            switch (iMo10319A) {
                case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                    z = false;
                    iMo4091q = iMo4091q;
                    break;
                case 0:
                    iMo4091q2 = iMo4091q2;
                    i2 |= 1;
                    iMo4091q = df1VarMo4079b.mo4091q(serialDescriptor, 0);
                    iMo4091q2 = iMo4091q2;
                    break;
                case 1:
                    iMo4091q = iMo4091q;
                    iMo4091q2 = iMo4091q2;
                    num = (Integer) df1VarMo4079b.mo4070D(serialDescriptor, 1, l84.f49294a, num);
                    i2 |= 2;
                    iMo4091q = iMo4091q;
                    iMo4091q2 = iMo4091q2;
                    break;
                case 2:
                    iMo4091q2 = df1VarMo4079b.mo4091q(serialDescriptor, 2);
                    i2 |= 4;
                    iMo4091q = iMo4091q;
                    break;
                case 3:
                    iMo4091q = iMo4091q;
                    iMo4091q2 = iMo4091q2;
                    str5 = (String) df1VarMo4079b.mo4070D(serialDescriptor, 3, sk9.f60959a, str5);
                    i2 |= 8;
                    iMo4091q = iMo4091q;
                    iMo4091q2 = iMo4091q2;
                    break;
                case 4:
                    dMo4072F = df1VarMo4079b.mo4072F(serialDescriptor, 4);
                    i2 |= 16;
                    iMo4091q = iMo4091q;
                    break;
                case 5:
                    dMo4072F2 = df1VarMo4079b.mo4072F(serialDescriptor, 5);
                    i2 |= 32;
                    iMo4091q = iMo4091q;
                    break;
                case 6:
                    iMo4091q3 = df1VarMo4079b.mo4091q(serialDescriptor, 6);
                    i2 |= 64;
                    iMo4091q = iMo4091q;
                    break;
                case 7:
                    iMo4091q4 = df1VarMo4079b.mo4091q(serialDescriptor, 7);
                    i2 |= 128;
                    iMo4091q = iMo4091q;
                    break;
                case 8:
                    zMo4094v = df1VarMo4079b.mo4094v(serialDescriptor, 8);
                    i2 |= 256;
                    iMo4091q = iMo4091q;
                    break;
                case 9:
                    zMo4094v2 = df1VarMo4079b.mo4094v(serialDescriptor, 9);
                    i2 |= 512;
                    iMo4091q = iMo4091q;
                    break;
                case 10:
                    iMo4091q = iMo4091q;
                    iMo4091q2 = iMo4091q2;
                    str3 = (String) df1VarMo4079b.mo4070D(serialDescriptor, 10, sk9.f60959a, str3);
                    i2 |= 1024;
                    iMo4091q = iMo4091q;
                    iMo4091q2 = iMo4091q2;
                    break;
                case 11:
                    iMo4091q = iMo4091q;
                    iMo4091q2 = iMo4091q2;
                    str4 = (String) df1VarMo4079b.mo4070D(serialDescriptor, 11, sk9.f60959a, str4);
                    i2 |= 2048;
                    iMo4091q = iMo4091q;
                    iMo4091q2 = iMo4091q2;
                    break;
                case 12:
                    iMo4091q = iMo4091q;
                    iMo4091q2 = iMo4091q2;
                    str2 = (String) df1VarMo4079b.mo4070D(serialDescriptor, 12, sk9.f60959a, str2);
                    i2 |= 4096;
                    iMo4091q = iMo4091q;
                    iMo4091q2 = iMo4091q2;
                    break;
                case 13:
                    zMo4094v3 = df1VarMo4079b.mo4094v(serialDescriptor, 13);
                    i2 |= 8192;
                    iMo4091q = iMo4091q;
                    break;
                case 14:
                    iMo4091q = iMo4091q;
                    iMo4091q2 = iMo4091q2;
                    str = (String) df1VarMo4079b.mo4070D(serialDescriptor, 14, sk9.f60959a, str);
                    i2 |= 16384;
                    iMo4091q = iMo4091q;
                    iMo4091q2 = iMo4091q2;
                    break;
                case 15:
                    iMo4091q5 = df1VarMo4079b.mo4091q(serialDescriptor, 15);
                    i2 |= 32768;
                    iMo4091q = iMo4091q;
                    break;
                case 16:
                    lessonReference = (LessonReference) df1VarMo4079b.mo4070D(serialDescriptor, 16, LessonReference$$serializer.INSTANCE, lessonReference);
                    i = 65536;
                    i2 |= i;
                    iMo4091q = iMo4091q;
                    iMo4091q2 = iMo4091q2;
                    break;
                case 17:
                    lessonReference2 = (LessonReference) df1VarMo4079b.mo4070D(serialDescriptor, 17, LessonReference$$serializer.INSTANCE, lessonReference2);
                    i = 131072;
                    i2 |= i;
                    iMo4091q = iMo4091q;
                    iMo4091q2 = iMo4091q2;
                    break;
                default:
                    uk9.m22771e(iMo10319A);
                    return null;
            }
        }
        df1VarMo4079b.mo4086j(serialDescriptor);
        return new LessonCompleteData(i2, iMo4091q, num, iMo4091q2, str5, dMo4072F, dMo4072F2, iMo4091q3, iMo4091q4, zMo4094v, zMo4094v2, str3, str4, str2, zMo4094v3, str, iMo4091q5, lessonReference, lessonReference2);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, LessonCompleteData lessonCompleteData) {
        encoder.getClass();
        lessonCompleteData.getClass();
        LessonReference lessonReference = lessonCompleteData.f19221r;
        String str = lessonCompleteData.f19214k;
        boolean z = lessonCompleteData.f19213j;
        boolean z2 = lessonCompleteData.f19212i;
        int i = lessonCompleteData.f19211h;
        int i2 = lessonCompleteData.f19210g;
        double d = lessonCompleteData.f19209f;
        double d2 = lessonCompleteData.f19208e;
        String str2 = lessonCompleteData.f19207d;
        int i3 = lessonCompleteData.f19206c;
        Integer num = lessonCompleteData.f19205b;
        int i4 = lessonCompleteData.f19204a;
        SerialDescriptor serialDescriptor = descriptor;
        mk9 mk9VarMo15606b = encoder.mo15606b(serialDescriptor);
        if (mk9VarMo15606b.m16872B(serialDescriptor) || i4 != 0) {
            mk9VarMo15606b.m16878v(0, i4, serialDescriptor);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || num == null || num.intValue() != 0) {
            mk9VarMo15606b.m16880x(serialDescriptor, 1, l84.f49294a, num);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || i3 != 0) {
            mk9VarMo15606b.m16878v(2, i3, serialDescriptor);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || !fa4.m11650l(str2, "")) {
            mk9VarMo15606b.m16880x(serialDescriptor, 3, sk9.f60959a, str2);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || Double.compare(d2, 0.0d) != 0) {
            mk9VarMo15606b.m16874r(serialDescriptor, 4, d2);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || Double.compare(d, 0.0d) != 0) {
            mk9VarMo15606b.m16874r(serialDescriptor, 5, d);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || i2 != 0) {
            mk9VarMo15606b.m16878v(6, i2, serialDescriptor);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || i != 0) {
            mk9VarMo15606b.m16878v(7, i, serialDescriptor);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || z2) {
            mk9VarMo15606b.m16873q(serialDescriptor, 8, z2);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || z) {
            mk9VarMo15606b.m16873q(serialDescriptor, 9, z);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || !fa4.m11650l(str, "")) {
            mk9VarMo15606b.m16880x(serialDescriptor, 10, sk9.f60959a, str);
        }
        sk9 sk9Var = sk9.f60959a;
        String str3 = lessonCompleteData.f19215l;
        LessonReference lessonReference2 = lessonCompleteData.f19220q;
        int i5 = lessonCompleteData.f19219p;
        String str4 = lessonCompleteData.f19218o;
        boolean z3 = lessonCompleteData.f19217n;
        mk9VarMo15606b.m16880x(serialDescriptor, 11, sk9Var, str3);
        mk9VarMo15606b.m16880x(serialDescriptor, 12, sk9Var, lessonCompleteData.f19216m);
        if (mk9VarMo15606b.m16872B(serialDescriptor) || z3) {
            mk9VarMo15606b.m16873q(serialDescriptor, 13, z3);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || str4 != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 14, sk9Var, str4);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || i5 != 0) {
            mk9VarMo15606b.m16878v(15, i5, serialDescriptor);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || lessonReference2 != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 16, LessonReference$$serializer.INSTANCE, lessonReference2);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || lessonReference != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 17, LessonReference$$serializer.INSTANCE, lessonReference);
        }
        mk9VarMo15606b.m16871A(serialDescriptor);
    }

    @Override // p000.zk3
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return te1.f62178b;
    }
}
