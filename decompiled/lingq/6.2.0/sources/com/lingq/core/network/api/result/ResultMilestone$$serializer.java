package com.lingq.core.network.api.result;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import p000.bg7;
import p000.df1;
import p000.fa4;
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
public final /* synthetic */ class ResultMilestone$$serializer implements zk3 {
    public static final ResultMilestone$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ResultMilestone$$serializer resultMilestone$$serializer = new ResultMilestone$$serializer();
        INSTANCE = resultMilestone$$serializer;
        bg7 bg7Var = new bg7("com.lingq.core.network.api.result.ResultMilestone", resultMilestone$$serializer, 4);
        bg7Var.m3702k("slug", true);
        bg7Var.m3702k("name", true);
        bg7Var.m3702k("goal", true);
        bg7Var.m3702k("stat", true);
        descriptor = bg7Var;
    }

    private ResultMilestone$$serializer() {
    }

    @Override // p000.zk3
    public final KSerializer[] childSerializers() {
        sk9 sk9Var = sk9.f60959a;
        return new KSerializer[]{sk9Var, thb.m22059r(sk9Var), l84.f49294a, thb.m22059r(sk9Var)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final ResultMilestone deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        df1 df1VarMo4079b = decoder.mo4079b(serialDescriptor);
        boolean z = true;
        int i = 0;
        int iMo4091q = 0;
        String strMo4097x = null;
        String str = null;
        String str2 = null;
        while (z) {
            int iMo10319A = df1VarMo4079b.mo10319A(serialDescriptor);
            if (iMo10319A == -1) {
                z = false;
            } else if (iMo10319A == 0) {
                strMo4097x = df1VarMo4079b.mo4097x(serialDescriptor, 0);
                i |= 1;
            } else if (iMo10319A == 1) {
                str = (String) df1VarMo4079b.mo4070D(serialDescriptor, 1, sk9.f60959a, str);
                i |= 2;
            } else if (iMo10319A == 2) {
                iMo4091q = df1VarMo4079b.mo4091q(serialDescriptor, 2);
                i |= 4;
            } else {
                if (iMo10319A != 3) {
                    uk9.m22771e(iMo10319A);
                    return null;
                }
                str2 = (String) df1VarMo4079b.mo4070D(serialDescriptor, 3, sk9.f60959a, str2);
                i |= 8;
            }
        }
        df1VarMo4079b.mo4086j(serialDescriptor);
        ResultMilestone resultMilestone = new ResultMilestone();
        if ((i & 1) == 0) {
            resultMilestone.f21326a = "";
        } else {
            resultMilestone.f21326a = strMo4097x;
        }
        if ((i & 2) == 0) {
            resultMilestone.f21327b = null;
        } else {
            resultMilestone.f21327b = str;
        }
        if ((i & 4) == 0) {
            resultMilestone.f21328c = 0;
        } else {
            resultMilestone.f21328c = iMo4091q;
        }
        if ((i & 8) == 0) {
            resultMilestone.f21329d = null;
            return resultMilestone;
        }
        resultMilestone.f21329d = str2;
        return resultMilestone;
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, ResultMilestone resultMilestone) {
        encoder.getClass();
        resultMilestone.getClass();
        String str = resultMilestone.f21329d;
        int i = resultMilestone.f21328c;
        String str2 = resultMilestone.f21327b;
        String str3 = resultMilestone.f21326a;
        SerialDescriptor serialDescriptor = descriptor;
        mk9 mk9VarMo15606b = encoder.mo15606b(serialDescriptor);
        if (mk9VarMo15606b.m16872B(serialDescriptor) || !fa4.m11650l(str3, "")) {
            mk9VarMo15606b.m16882z(serialDescriptor, 0, str3);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || str2 != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 1, sk9.f60959a, str2);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || i != 0) {
            mk9VarMo15606b.m16878v(2, i, serialDescriptor);
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
