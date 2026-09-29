package com.lingq.core.database.entity;

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
import p000.uk9;
import p000.zb2;
import p000.zk3;

/* JADX INFO: loaded from: classes2.dex */
@zb2
public final /* synthetic */ class CourseBlacklistEntity$$serializer implements zk3 {
    public static final CourseBlacklistEntity$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        CourseBlacklistEntity$$serializer courseBlacklistEntity$$serializer = new CourseBlacklistEntity$$serializer();
        INSTANCE = courseBlacklistEntity$$serializer;
        bg7 bg7Var = new bg7("com.lingq.core.database.entity.CourseBlacklistEntity", courseBlacklistEntity$$serializer, 3);
        bg7Var.m3702k("id", false);
        bg7Var.m3702k("language", false);
        bg7Var.m3702k("title", false);
        descriptor = bg7Var;
    }

    private CourseBlacklistEntity$$serializer() {
    }

    @Override // p000.zk3
    public final KSerializer[] childSerializers() {
        sk9 sk9Var = sk9.f60959a;
        return new KSerializer[]{l84.f49294a, sk9Var, sk9Var};
    }

    @Override // kotlinx.serialization.KSerializer
    public final CourseBlacklistEntity deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        df1 df1VarMo4079b = decoder.mo4079b(serialDescriptor);
        boolean z = true;
        int i = 0;
        int iMo4091q = 0;
        String strMo4097x = null;
        String strMo4097x2 = null;
        while (z) {
            int iMo10319A = df1VarMo4079b.mo10319A(serialDescriptor);
            if (iMo10319A == -1) {
                z = false;
            } else if (iMo10319A == 0) {
                iMo4091q = df1VarMo4079b.mo4091q(serialDescriptor, 0);
                i |= 1;
            } else if (iMo10319A == 1) {
                strMo4097x = df1VarMo4079b.mo4097x(serialDescriptor, 1);
                i |= 2;
            } else {
                if (iMo10319A != 2) {
                    uk9.m22771e(iMo10319A);
                    return null;
                }
                strMo4097x2 = df1VarMo4079b.mo4097x(serialDescriptor, 2);
                i |= 4;
            }
        }
        df1VarMo4079b.mo4086j(serialDescriptor);
        return new CourseBlacklistEntity(strMo4097x, i, iMo4091q, strMo4097x2);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, CourseBlacklistEntity courseBlacklistEntity) {
        encoder.getClass();
        courseBlacklistEntity.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        mk9 mk9VarMo15606b = encoder.mo15606b(serialDescriptor);
        mk9VarMo15606b.m16878v(0, courseBlacklistEntity.f17125a, serialDescriptor);
        mk9VarMo15606b.m16882z(serialDescriptor, 1, courseBlacklistEntity.f17126b);
        mk9VarMo15606b.m16882z(serialDescriptor, 2, courseBlacklistEntity.f17127c);
        mk9VarMo15606b.m16871A(serialDescriptor);
    }

    @Override // p000.zk3
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return te1.f62178b;
    }
}
