package com.lingq.core.network.api.result;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import p000.bg7;
import p000.df1;
import p000.dj2;
import p000.mk9;
import p000.sk9;
import p000.te1;
import p000.thb;
import p000.uk9;
import p000.zb2;
import p000.zk3;

/* JADX INFO: loaded from: classes2.dex */
@zb2
public final /* synthetic */ class Target$$serializer implements zk3 {
    public static final Target$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        Target$$serializer target$$serializer = new Target$$serializer();
        INSTANCE = target$$serializer;
        bg7 bg7Var = new bg7("com.lingq.core.network.api.result.Target", target$$serializer, 4);
        bg7Var.m3702k("progress", true);
        bg7Var.m3702k("goal", true);
        bg7Var.m3702k("actual", true);
        bg7Var.m3702k("code", true);
        descriptor = bg7Var;
    }

    private Target$$serializer() {
    }

    @Override // p000.zk3
    public final KSerializer[] childSerializers() {
        dj2 dj2Var = dj2.f35711a;
        return new KSerializer[]{thb.m22059r(dj2Var), thb.m22059r(dj2Var), thb.m22059r(dj2Var), thb.m22059r(sk9.f60959a)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Target deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        df1 df1VarMo4079b = decoder.mo4079b(serialDescriptor);
        boolean z = true;
        int i = 0;
        Double d = null;
        Double d2 = null;
        Double d3 = null;
        String str = null;
        while (z) {
            int iMo10319A = df1VarMo4079b.mo10319A(serialDescriptor);
            if (iMo10319A == -1) {
                z = false;
            } else if (iMo10319A == 0) {
                d = (Double) df1VarMo4079b.mo4070D(serialDescriptor, 0, dj2.f35711a, d);
                i |= 1;
            } else if (iMo10319A == 1) {
                d2 = (Double) df1VarMo4079b.mo4070D(serialDescriptor, 1, dj2.f35711a, d2);
                i |= 2;
            } else if (iMo10319A == 2) {
                d3 = (Double) df1VarMo4079b.mo4070D(serialDescriptor, 2, dj2.f35711a, d3);
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
        return new Target(i, d, d2, d3, str);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Target target) {
        encoder.getClass();
        target.getClass();
        String str = target.f21743d;
        Double d = target.f21742c;
        Double d2 = target.f21741b;
        Double d3 = target.f21740a;
        SerialDescriptor serialDescriptor = descriptor;
        mk9 mk9VarMo15606b = encoder.mo15606b(serialDescriptor);
        if (mk9VarMo15606b.m16872B(serialDescriptor) || d3 != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 0, dj2.f35711a, d3);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || d2 != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 1, dj2.f35711a, d2);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || d != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 2, dj2.f35711a, d);
        }
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
