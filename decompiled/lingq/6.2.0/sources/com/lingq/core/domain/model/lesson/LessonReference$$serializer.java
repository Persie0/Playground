package com.lingq.core.domain.model.lesson;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import p000.bg7;
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
public final /* synthetic */ class LessonReference$$serializer implements zk3 {
    public static final LessonReference$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        LessonReference$$serializer lessonReference$$serializer = new LessonReference$$serializer();
        INSTANCE = lessonReference$$serializer;
        bg7 bg7Var = new bg7("com.lingq.core.domain.model.lesson.LessonReference", lessonReference$$serializer, 11);
        bg7Var.m3702k("id", false);
        bg7Var.m3702k("price", true);
        bg7Var.m3702k("collectionTitle", false);
        bg7Var.m3702k("isTaken", true);
        bg7Var.m3702k("sharedById", true);
        bg7Var.m3702k("status", false);
        bg7Var.m3702k("title", false);
        bg7Var.m3702k("image", false);
        bg7Var.m3702k("duration", true);
        bg7Var.m3702k("source", true);
        bg7Var.m3702k("url", true);
        descriptor = bg7Var;
    }

    private LessonReference$$serializer() {
    }

    @Override // p000.zk3
    public final KSerializer[] childSerializers() {
        l84 l84Var = l84.f49294a;
        sk9 sk9Var = sk9.f60959a;
        return new KSerializer[]{l84Var, l84Var, thb.m22059r(sk9Var), lf0.f49579a, thb.m22059r(l84Var), thb.m22059r(sk9Var), thb.m22059r(sk9Var), thb.m22059r(sk9Var), thb.m22059r(l84Var), thb.m22059r(sk9Var), thb.m22059r(sk9Var)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final LessonReference deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        df1 df1VarMo4079b = decoder.mo4079b(serialDescriptor);
        String str = null;
        String str2 = null;
        boolean z = true;
        Integer num = null;
        int i = 0;
        int iMo4091q = 0;
        int iMo4091q2 = 0;
        String str3 = null;
        boolean zMo4094v = false;
        Integer num2 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
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
                    continue;
                case 2:
                    str3 = (String) df1VarMo4079b.mo4070D(serialDescriptor, 2, sk9.f60959a, str3);
                    i |= 4;
                    break;
                case 3:
                    zMo4094v = df1VarMo4079b.mo4094v(serialDescriptor, 3);
                    i |= 8;
                    continue;
                case 4:
                    num2 = (Integer) df1VarMo4079b.mo4070D(serialDescriptor, 4, l84.f49294a, num2);
                    i |= 16;
                    break;
                case 5:
                    str4 = (String) df1VarMo4079b.mo4070D(serialDescriptor, 5, sk9.f60959a, str4);
                    i |= 32;
                    break;
                case 6:
                    str5 = (String) df1VarMo4079b.mo4070D(serialDescriptor, 6, sk9.f60959a, str5);
                    i |= 64;
                    break;
                case 7:
                    str6 = (String) df1VarMo4079b.mo4070D(serialDescriptor, 7, sk9.f60959a, str6);
                    i |= 128;
                    break;
                case 8:
                    num = (Integer) df1VarMo4079b.mo4070D(serialDescriptor, 8, l84.f49294a, num);
                    i |= 256;
                    break;
                case 9:
                    str2 = (String) df1VarMo4079b.mo4070D(serialDescriptor, 9, sk9.f60959a, str2);
                    i |= 512;
                    break;
                case 10:
                    str = (String) df1VarMo4079b.mo4070D(serialDescriptor, 10, sk9.f60959a, str);
                    i |= 1024;
                    break;
                default:
                    uk9.m22771e(iMo10319A);
                    return null;
            }
            z = z;
        }
        df1VarMo4079b.mo4086j(serialDescriptor);
        return new LessonReference(i, iMo4091q, iMo4091q2, str3, zMo4094v, num2, str4, str5, str6, num, str2, str);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, LessonReference lessonReference) {
        encoder.getClass();
        lessonReference.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        mk9 mk9VarMo15606b = encoder.mo15606b(serialDescriptor);
        int i = lessonReference.f19241a;
        String str = lessonReference.f19251k;
        String str2 = lessonReference.f19250j;
        Integer num = lessonReference.f19249i;
        Integer num2 = lessonReference.f19245e;
        boolean z = lessonReference.f19244d;
        int i2 = lessonReference.f19242b;
        mk9VarMo15606b.m16878v(0, i, serialDescriptor);
        if (mk9VarMo15606b.m16872B(serialDescriptor) || i2 != 0) {
            mk9VarMo15606b.m16878v(1, i2, serialDescriptor);
        }
        sk9 sk9Var = sk9.f60959a;
        mk9VarMo15606b.m16880x(serialDescriptor, 2, sk9Var, lessonReference.f19243c);
        if (mk9VarMo15606b.m16872B(serialDescriptor) || z) {
            mk9VarMo15606b.m16873q(serialDescriptor, 3, z);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || num2 == null || num2.intValue() != 0) {
            mk9VarMo15606b.m16880x(serialDescriptor, 4, l84.f49294a, num2);
        }
        mk9VarMo15606b.m16880x(serialDescriptor, 5, sk9Var, lessonReference.f19246f);
        mk9VarMo15606b.m16880x(serialDescriptor, 6, sk9Var, lessonReference.f19247g);
        mk9VarMo15606b.m16880x(serialDescriptor, 7, sk9Var, lessonReference.f19248h);
        if (mk9VarMo15606b.m16872B(serialDescriptor) || num != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 8, l84.f49294a, num);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || str2 != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 9, sk9Var, str2);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || str != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 10, sk9Var, str);
        }
        mk9VarMo15606b.m16871A(serialDescriptor);
    }

    @Override // p000.zk3
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return te1.f62178b;
    }
}
