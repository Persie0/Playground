package com.lingq.core.network.api.result;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import p000.bg7;
import p000.df1;
import p000.mk9;
import p000.sk9;
import p000.te1;
import p000.thb;
import p000.uk9;
import p000.zb2;
import p000.zk3;

/* JADX INFO: loaded from: classes.dex */
@zb2
public final /* synthetic */ class LessonSourceBlacklist$$serializer implements zk3 {
    public static final LessonSourceBlacklist$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        LessonSourceBlacklist$$serializer lessonSourceBlacklist$$serializer = new LessonSourceBlacklist$$serializer();
        INSTANCE = lessonSourceBlacklist$$serializer;
        bg7 bg7Var = new bg7("com.lingq.core.network.api.result.LessonSourceBlacklist", lessonSourceBlacklist$$serializer, 1);
        bg7Var.m3702k("name", true);
        descriptor = bg7Var;
    }

    private LessonSourceBlacklist$$serializer() {
    }

    @Override // p000.zk3
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{thb.m22059r(sk9.f60959a)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final LessonSourceBlacklist deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        df1 df1VarMo4079b = decoder.mo4079b(serialDescriptor);
        boolean z = true;
        int i = 0;
        String str = null;
        while (z) {
            int iMo10319A = df1VarMo4079b.mo10319A(serialDescriptor);
            if (iMo10319A == -1) {
                z = false;
            } else {
                if (iMo10319A != 0) {
                    uk9.m22771e(iMo10319A);
                    return null;
                }
                str = (String) df1VarMo4079b.mo4070D(serialDescriptor, 0, sk9.f60959a, str);
                i = 1;
            }
        }
        df1VarMo4079b.mo4086j(serialDescriptor);
        return new LessonSourceBlacklist(i, str);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, LessonSourceBlacklist lessonSourceBlacklist) {
        encoder.getClass();
        lessonSourceBlacklist.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        mk9 mk9VarMo15606b = encoder.mo15606b(serialDescriptor);
        LessonSourceBlacklist.m8304b(lessonSourceBlacklist, mk9VarMo15606b, serialDescriptor);
        mk9VarMo15606b.m16871A(serialDescriptor);
    }

    @Override // p000.zk3
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return te1.f62178b;
    }
}
