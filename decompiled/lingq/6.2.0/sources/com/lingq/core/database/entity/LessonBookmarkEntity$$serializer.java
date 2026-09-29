package com.lingq.core.database.entity;

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
import p000.sk9;
import p000.te1;
import p000.thb;
import p000.uk9;
import p000.zb2;
import p000.zk3;

/* JADX INFO: loaded from: classes2.dex */
@zb2
public final /* synthetic */ class LessonBookmarkEntity$$serializer implements zk3 {
    public static final LessonBookmarkEntity$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        LessonBookmarkEntity$$serializer lessonBookmarkEntity$$serializer = new LessonBookmarkEntity$$serializer();
        INSTANCE = lessonBookmarkEntity$$serializer;
        bg7 bg7Var = new bg7("com.lingq.core.database.entity.LessonBookmarkEntity", lessonBookmarkEntity$$serializer, 7);
        bg7Var.m3702k("contentId", false);
        bg7Var.m3702k("wordIndex", true);
        bg7Var.m3702k("completedWordIndex", true);
        bg7Var.m3702k("audioPosition", true);
        bg7Var.m3702k("client", true);
        bg7Var.m3702k("timestamp", true);
        bg7Var.m3702k("languageTimestamp", true);
        descriptor = bg7Var;
    }

    private LessonBookmarkEntity$$serializer() {
    }

    @Override // p000.zk3
    public final KSerializer[] childSerializers() {
        l84 l84Var = l84.f49294a;
        KSerializer kSerializerM22059r = thb.m22059r(l84Var);
        KSerializer kSerializerM22059r2 = thb.m22059r(l84Var);
        KSerializer kSerializerM22059r3 = thb.m22059r(dj2.f35711a);
        sk9 sk9Var = sk9.f60959a;
        return new KSerializer[]{l84Var, kSerializerM22059r, kSerializerM22059r2, kSerializerM22059r3, thb.m22059r(sk9Var), thb.m22059r(sk9Var), thb.m22059r(sk9Var)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final LessonBookmarkEntity deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        df1 df1VarMo4079b = decoder.mo4079b(serialDescriptor);
        boolean z = true;
        int i = 0;
        int iMo4091q = 0;
        Double d = null;
        Integer num = null;
        Integer num2 = null;
        String str = null;
        String str2 = null;
        String str3 = null;
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
                    num = (Integer) df1VarMo4079b.mo4070D(serialDescriptor, 1, l84.f49294a, num);
                    i |= 2;
                    break;
                case 2:
                    num2 = (Integer) df1VarMo4079b.mo4070D(serialDescriptor, 2, l84.f49294a, num2);
                    i |= 4;
                    break;
                case 3:
                    d = (Double) df1VarMo4079b.mo4070D(serialDescriptor, 3, dj2.f35711a, d);
                    i |= 8;
                    break;
                case 4:
                    str = (String) df1VarMo4079b.mo4070D(serialDescriptor, 4, sk9.f60959a, str);
                    i |= 16;
                    break;
                case 5:
                    str2 = (String) df1VarMo4079b.mo4070D(serialDescriptor, 5, sk9.f60959a, str2);
                    i |= 32;
                    break;
                case 6:
                    str3 = (String) df1VarMo4079b.mo4070D(serialDescriptor, 6, sk9.f60959a, str3);
                    i |= 64;
                    break;
                default:
                    uk9.m22771e(iMo10319A);
                    return null;
            }
        }
        df1VarMo4079b.mo4086j(serialDescriptor);
        return new LessonBookmarkEntity(i, iMo4091q, d, num, num2, str, str2, str3);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, LessonBookmarkEntity lessonBookmarkEntity) {
        encoder.getClass();
        lessonBookmarkEntity.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        mk9 mk9VarMo15606b = encoder.mo15606b(serialDescriptor);
        int i = lessonBookmarkEntity.f17232a;
        String str = lessonBookmarkEntity.f17238g;
        String str2 = lessonBookmarkEntity.f17237f;
        String str3 = lessonBookmarkEntity.f17236e;
        Double d = lessonBookmarkEntity.f17235d;
        Integer num = lessonBookmarkEntity.f17234c;
        Integer num2 = lessonBookmarkEntity.f17233b;
        mk9VarMo15606b.m16878v(0, i, serialDescriptor);
        if (mk9VarMo15606b.m16872B(serialDescriptor) || num2 != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 1, l84.f49294a, num2);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || num != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 2, l84.f49294a, num);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || d != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 3, dj2.f35711a, d);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || str3 != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 4, sk9.f60959a, str3);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || str2 != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 5, sk9.f60959a, str2);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || str != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 6, sk9.f60959a, str);
        }
        mk9VarMo15606b.m16871A(serialDescriptor);
    }

    @Override // p000.zk3
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return te1.f62178b;
    }
}
