package com.lingq.core.network.api.requests;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import p000.bg7;
import p000.df1;
import p000.l84;
import p000.mk9;
import p000.te1;
import p000.thb;
import p000.uk9;
import p000.zb2;
import p000.zk3;

/* JADX INFO: loaded from: classes2.dex */
@zb2
public final /* synthetic */ class RequestBookChallengeJoin$$serializer implements zk3 {
    public static final RequestBookChallengeJoin$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        RequestBookChallengeJoin$$serializer requestBookChallengeJoin$$serializer = new RequestBookChallengeJoin$$serializer();
        INSTANCE = requestBookChallengeJoin$$serializer;
        bg7 bg7Var = new bg7("com.lingq.core.network.api.requests.RequestBookChallengeJoin", requestBookChallengeJoin$$serializer, 2);
        bg7Var.m3702k("book", false);
        bg7Var.m3702k("replace", true);
        descriptor = bg7Var;
    }

    private RequestBookChallengeJoin$$serializer() {
    }

    @Override // p000.zk3
    public final KSerializer[] childSerializers() {
        l84 l84Var = l84.f49294a;
        return new KSerializer[]{l84Var, thb.m22059r(l84Var)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final RequestBookChallengeJoin deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        df1 df1VarMo4079b = decoder.mo4079b(serialDescriptor);
        boolean z = true;
        int i = 0;
        int iMo4091q = 0;
        Integer num = null;
        while (z) {
            int iMo10319A = df1VarMo4079b.mo10319A(serialDescriptor);
            if (iMo10319A == -1) {
                z = false;
            } else if (iMo10319A == 0) {
                iMo4091q = df1VarMo4079b.mo4091q(serialDescriptor, 0);
                i |= 1;
            } else {
                if (iMo10319A != 1) {
                    uk9.m22771e(iMo10319A);
                    return null;
                }
                num = (Integer) df1VarMo4079b.mo4070D(serialDescriptor, 1, l84.f49294a, num);
                i |= 2;
            }
        }
        df1VarMo4079b.mo4086j(serialDescriptor);
        return new RequestBookChallengeJoin(i, iMo4091q, num);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, RequestBookChallengeJoin requestBookChallengeJoin) {
        encoder.getClass();
        requestBookChallengeJoin.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        mk9 mk9VarMo15606b = encoder.mo15606b(serialDescriptor);
        int i = requestBookChallengeJoin.f20316a;
        Integer num = requestBookChallengeJoin.f20317b;
        mk9VarMo15606b.m16878v(0, i, serialDescriptor);
        if (mk9VarMo15606b.m16872B(serialDescriptor) || num != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 1, l84.f49294a, num);
        }
        mk9VarMo15606b.m16871A(serialDescriptor);
    }

    @Override // p000.zk3
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return te1.f62178b;
    }
}
