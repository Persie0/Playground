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
public final /* synthetic */ class CourseForImportEntity$$serializer implements zk3 {
    public static final CourseForImportEntity$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        CourseForImportEntity$$serializer courseForImportEntity$$serializer = new CourseForImportEntity$$serializer();
        INSTANCE = courseForImportEntity$$serializer;
        bg7 bg7Var = new bg7("com.lingq.core.database.entity.CourseForImportEntity", courseForImportEntity$$serializer, 4);
        bg7Var.m3702k("language", false);
        bg7Var.m3702k("pk", false);
        bg7Var.m3702k("title", false);
        bg7Var.m3702k("order", true);
        descriptor = bg7Var;
    }

    private CourseForImportEntity$$serializer() {
    }

    @Override // p000.zk3
    public final KSerializer[] childSerializers() {
        sk9 sk9Var = sk9.f60959a;
        l84 l84Var = l84.f49294a;
        return new KSerializer[]{sk9Var, l84Var, sk9Var, l84Var};
    }

    @Override // kotlinx.serialization.KSerializer
    public final CourseForImportEntity deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        df1 df1VarMo4079b = decoder.mo4079b(serialDescriptor);
        boolean z = true;
        int i = 0;
        int iMo4091q = 0;
        int iMo4091q2 = 0;
        String strMo4097x = null;
        String strMo4097x2 = null;
        while (z) {
            int iMo10319A = df1VarMo4079b.mo10319A(serialDescriptor);
            if (iMo10319A == -1) {
                z = false;
            } else if (iMo10319A == 0) {
                strMo4097x = df1VarMo4079b.mo4097x(serialDescriptor, 0);
                i |= 1;
            } else if (iMo10319A == 1) {
                iMo4091q = df1VarMo4079b.mo4091q(serialDescriptor, 1);
                i |= 2;
            } else if (iMo10319A == 2) {
                strMo4097x2 = df1VarMo4079b.mo4097x(serialDescriptor, 2);
                i |= 4;
            } else {
                if (iMo10319A != 3) {
                    uk9.m22771e(iMo10319A);
                    return null;
                }
                iMo4091q2 = df1VarMo4079b.mo4091q(serialDescriptor, 3);
                i |= 8;
            }
        }
        df1VarMo4079b.mo4086j(serialDescriptor);
        return new CourseForImportEntity(strMo4097x, i, strMo4097x2, iMo4091q, iMo4091q2);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, CourseForImportEntity courseForImportEntity) {
        encoder.getClass();
        courseForImportEntity.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        mk9 mk9VarMo15606b = encoder.mo15606b(serialDescriptor);
        String str = courseForImportEntity.f17128a;
        int i = courseForImportEntity.f17131d;
        mk9VarMo15606b.m16882z(serialDescriptor, 0, str);
        mk9VarMo15606b.m16878v(1, courseForImportEntity.f17129b, serialDescriptor);
        mk9VarMo15606b.m16882z(serialDescriptor, 2, courseForImportEntity.f17130c);
        if (mk9VarMo15606b.m16872B(serialDescriptor) || i != 0) {
            mk9VarMo15606b.m16878v(3, i, serialDescriptor);
        }
        mk9VarMo15606b.m16871A(serialDescriptor);
    }

    @Override // p000.zk3
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return te1.f62178b;
    }
}
