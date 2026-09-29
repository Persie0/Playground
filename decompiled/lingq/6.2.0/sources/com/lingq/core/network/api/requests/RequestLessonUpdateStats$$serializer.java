package com.lingq.core.network.api.requests;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import p000.bg7;
import p000.df1;
import p000.dj2;
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
public final /* synthetic */ class RequestLessonUpdateStats$$serializer implements zk3 {
    public static final RequestLessonUpdateStats$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        RequestLessonUpdateStats$$serializer requestLessonUpdateStats$$serializer = new RequestLessonUpdateStats$$serializer();
        INSTANCE = requestLessonUpdateStats$$serializer;
        bg7 bg7Var = new bg7("com.lingq.core.network.api.requests.RequestLessonUpdateStats", requestLessonUpdateStats$$serializer, 4);
        bg7Var.m3702k("readTimes", true);
        bg7Var.m3702k("listenTimes", true);
        bg7Var.m3702k("automatic", false);
        bg7Var.m3702k("creation_date", true);
        descriptor = bg7Var;
    }

    private RequestLessonUpdateStats$$serializer() {
    }

    @Override // p000.zk3
    public final KSerializer[] childSerializers() {
        KSerializer kSerializerM22059r = thb.m22059r(sk9.f60959a);
        dj2 dj2Var = dj2.f35711a;
        return new KSerializer[]{dj2Var, dj2Var, lf0.f49579a, kSerializerM22059r};
    }

    @Override // kotlinx.serialization.KSerializer
    public final RequestLessonUpdateStats deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        df1 df1VarMo4079b = decoder.mo4079b(serialDescriptor);
        int i = 0;
        boolean zMo4094v = false;
        double dMo4072F = 0.0d;
        double dMo4072F2 = 0.0d;
        String str = null;
        boolean z = true;
        while (z) {
            int iMo10319A = df1VarMo4079b.mo10319A(serialDescriptor);
            if (iMo10319A == -1) {
                z = false;
            } else if (iMo10319A == 0) {
                dMo4072F = df1VarMo4079b.mo4072F(serialDescriptor, 0);
                i |= 1;
            } else if (iMo10319A == 1) {
                dMo4072F2 = df1VarMo4079b.mo4072F(serialDescriptor, 1);
                i |= 2;
            } else if (iMo10319A == 2) {
                zMo4094v = df1VarMo4079b.mo4094v(serialDescriptor, 2);
                i |= 4;
            } else {
                if (iMo10319A != 3) {
                    uk9.m22771e(iMo10319A);
                    return null;
                }
                str = (String) df1VarMo4079b.mo4070D(serialDescriptor, 3, sk9.f60959a, str);
                i |= 8;
            }
        }
        df1VarMo4079b.mo4086j(serialDescriptor);
        return new RequestLessonUpdateStats(dMo4072F, dMo4072F2, i, str, zMo4094v);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, RequestLessonUpdateStats requestLessonUpdateStats) {
        encoder.getClass();
        requestLessonUpdateStats.getClass();
        double d = requestLessonUpdateStats.f20396b;
        double d2 = requestLessonUpdateStats.f20395a;
        SerialDescriptor serialDescriptor = descriptor;
        mk9 mk9VarMo15606b = encoder.mo15606b(serialDescriptor);
        if (mk9VarMo15606b.m16872B(serialDescriptor) || Double.compare(d2, 0.0d) != 0) {
            mk9VarMo15606b.m16874r(serialDescriptor, 0, d2);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || Double.compare(d, 0.0d) != 0) {
            mk9VarMo15606b.m16874r(serialDescriptor, 1, d);
        }
        boolean z = requestLessonUpdateStats.f20397c;
        String str = requestLessonUpdateStats.f20398d;
        mk9VarMo15606b.m16873q(serialDescriptor, 2, z);
        if (mk9VarMo15606b.m16872B(serialDescriptor) || str != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 3, sk9.f60959a, str);
        }
        mk9VarMo15606b.m16871A(serialDescriptor);
    }

    @Override // p000.zk3
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return te1.f62178b;
    }
}
