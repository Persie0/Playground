package com.lingq.core.network.api.result;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import p000.bg7;
import p000.df1;
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
public final /* synthetic */ class MoreLesson$$serializer implements zk3 {
    public static final MoreLesson$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        MoreLesson$$serializer moreLesson$$serializer = new MoreLesson$$serializer();
        INSTANCE = moreLesson$$serializer;
        bg7 bg7Var = new bg7("com.lingq.core.network.api.result.MoreLesson", moreLesson$$serializer, 5);
        bg7Var.m3702k("id", true);
        bg7Var.m3702k("image", true);
        bg7Var.m3702k("source", true);
        bg7Var.m3702k("status", true);
        bg7Var.m3702k("title", true);
        descriptor = bg7Var;
    }

    private MoreLesson$$serializer() {
    }

    @Override // p000.zk3
    public final KSerializer[] childSerializers() {
        KSerializer kSerializerM22059r = thb.m22059r(l84.f49294a);
        sk9 sk9Var = sk9.f60959a;
        return new KSerializer[]{kSerializerM22059r, thb.m22059r(sk9Var), thb.m22059r(ResultLessonMediaSource$$serializer.INSTANCE), thb.m22059r(sk9Var), thb.m22059r(sk9Var)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final MoreLesson deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        df1 df1VarMo4079b = decoder.mo4079b(serialDescriptor);
        boolean z = true;
        int i = 0;
        Integer num = null;
        String str = null;
        ResultLessonMediaSource resultLessonMediaSource = null;
        String str2 = null;
        String str3 = null;
        while (z) {
            int iMo10319A = df1VarMo4079b.mo10319A(serialDescriptor);
            if (iMo10319A == -1) {
                z = false;
            } else if (iMo10319A == 0) {
                num = (Integer) df1VarMo4079b.mo4070D(serialDescriptor, 0, l84.f49294a, num);
                i |= 1;
            } else if (iMo10319A == 1) {
                str = (String) df1VarMo4079b.mo4070D(serialDescriptor, 1, sk9.f60959a, str);
                i |= 2;
            } else if (iMo10319A == 2) {
                resultLessonMediaSource = (ResultLessonMediaSource) df1VarMo4079b.mo4070D(serialDescriptor, 2, ResultLessonMediaSource$$serializer.INSTANCE, resultLessonMediaSource);
                i |= 4;
            } else if (iMo10319A == 3) {
                str2 = (String) df1VarMo4079b.mo4070D(serialDescriptor, 3, sk9.f60959a, str2);
                i |= 8;
            } else {
                if (iMo10319A != 4) {
                    uk9.m22771e(iMo10319A);
                    return null;
                }
                str3 = (String) df1VarMo4079b.mo4070D(serialDescriptor, 4, sk9.f60959a, str3);
                i |= 16;
            }
        }
        df1VarMo4079b.mo4086j(serialDescriptor);
        return new MoreLesson(i, num, str, resultLessonMediaSource, str2, str3);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, MoreLesson moreLesson) {
        encoder.getClass();
        moreLesson.getClass();
        String str = moreLesson.f20568e;
        String str2 = moreLesson.f20567d;
        ResultLessonMediaSource resultLessonMediaSource = moreLesson.f20566c;
        String str3 = moreLesson.f20565b;
        Integer num = moreLesson.f20564a;
        SerialDescriptor serialDescriptor = descriptor;
        mk9 mk9VarMo15606b = encoder.mo15606b(serialDescriptor);
        if (mk9VarMo15606b.m16872B(serialDescriptor) || num != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 0, l84.f49294a, num);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || str3 != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 1, sk9.f60959a, str3);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || resultLessonMediaSource != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 2, ResultLessonMediaSource$$serializer.INSTANCE, resultLessonMediaSource);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || str2 != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 3, sk9.f60959a, str2);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || str != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 4, sk9.f60959a, str);
        }
        mk9VarMo15606b.m16871A(serialDescriptor);
    }

    @Override // p000.zk3
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return te1.f62178b;
    }
}
