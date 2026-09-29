package com.lingq.core.database.entity;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import p000.bg7;
import p000.df1;
import p000.l84;
import p000.lf0;
import p000.mk9;
import p000.te1;
import p000.thb;
import p000.uk9;
import p000.zb2;
import p000.zk3;

/* JADX INFO: loaded from: classes2.dex */
@zb2
public final /* synthetic */ class LessonsSimplifiedJoin$$serializer implements zk3 {
    public static final LessonsSimplifiedJoin$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        LessonsSimplifiedJoin$$serializer lessonsSimplifiedJoin$$serializer = new LessonsSimplifiedJoin$$serializer();
        INSTANCE = lessonsSimplifiedJoin$$serializer;
        bg7 bg7Var = new bg7("com.lingq.core.database.entity.LessonsSimplifiedJoin", lessonsSimplifiedJoin$$serializer, 3);
        bg7Var.m3702k("fromId", false);
        bg7Var.m3702k("toId", true);
        bg7Var.m3702k("isLocked", true);
        descriptor = bg7Var;
    }

    private LessonsSimplifiedJoin$$serializer() {
    }

    @Override // p000.zk3
    public final KSerializer[] childSerializers() {
        l84 l84Var = l84.f49294a;
        return new KSerializer[]{l84Var, thb.m22059r(l84Var), lf0.f49579a};
    }

    @Override // kotlinx.serialization.KSerializer
    public final LessonsSimplifiedJoin deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        df1 df1VarMo4079b = decoder.mo4079b(serialDescriptor);
        boolean z = true;
        int i = 0;
        int iMo4091q = 0;
        boolean zMo4094v = false;
        Integer num = null;
        while (z) {
            int iMo10319A = df1VarMo4079b.mo10319A(serialDescriptor);
            if (iMo10319A == -1) {
                z = false;
            } else if (iMo10319A == 0) {
                iMo4091q = df1VarMo4079b.mo4091q(serialDescriptor, 0);
                i |= 1;
            } else if (iMo10319A == 1) {
                num = (Integer) df1VarMo4079b.mo4070D(serialDescriptor, 1, l84.f49294a, num);
                i |= 2;
            } else {
                if (iMo10319A != 2) {
                    uk9.m22771e(iMo10319A);
                    return null;
                }
                zMo4094v = df1VarMo4079b.mo4094v(serialDescriptor, 2);
                i |= 4;
            }
        }
        df1VarMo4079b.mo4086j(serialDescriptor);
        return new LessonsSimplifiedJoin(i, iMo4091q, num, zMo4094v);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, LessonsSimplifiedJoin lessonsSimplifiedJoin) {
        encoder.getClass();
        lessonsSimplifiedJoin.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        mk9 mk9VarMo15606b = encoder.mo15606b(serialDescriptor);
        int i = lessonsSimplifiedJoin.f17354a;
        boolean z = lessonsSimplifiedJoin.f17356c;
        Integer num = lessonsSimplifiedJoin.f17355b;
        mk9VarMo15606b.m16878v(0, i, serialDescriptor);
        if (mk9VarMo15606b.m16872B(serialDescriptor) || num != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 1, l84.f49294a, num);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || !z) {
            mk9VarMo15606b.m16873q(serialDescriptor, 2, z);
        }
        mk9VarMo15606b.m16871A(serialDescriptor);
    }

    @Override // p000.zk3
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return te1.f62178b;
    }
}
