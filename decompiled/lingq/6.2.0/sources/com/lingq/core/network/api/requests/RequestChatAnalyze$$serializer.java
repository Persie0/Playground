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
import p000.uk9;
import p000.zb2;
import p000.zk3;

/* JADX INFO: loaded from: classes2.dex */
@zb2
public final /* synthetic */ class RequestChatAnalyze$$serializer implements zk3 {
    public static final RequestChatAnalyze$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        RequestChatAnalyze$$serializer requestChatAnalyze$$serializer = new RequestChatAnalyze$$serializer();
        INSTANCE = requestChatAnalyze$$serializer;
        bg7 bg7Var = new bg7("com.lingq.core.network.api.requests.RequestChatAnalyze", requestChatAnalyze$$serializer, 1);
        bg7Var.m3702k("index", false);
        descriptor = bg7Var;
    }

    private RequestChatAnalyze$$serializer() {
    }

    @Override // p000.zk3
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{l84.f49294a};
    }

    @Override // kotlinx.serialization.KSerializer
    public final RequestChatAnalyze deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        df1 df1VarMo4079b = decoder.mo4079b(serialDescriptor);
        boolean z = true;
        int i = 0;
        int iMo4091q = 0;
        while (z) {
            int iMo10319A = df1VarMo4079b.mo10319A(serialDescriptor);
            if (iMo10319A == -1) {
                z = false;
            } else {
                if (iMo10319A != 0) {
                    uk9.m22771e(iMo10319A);
                    return null;
                }
                iMo4091q = df1VarMo4079b.mo4091q(serialDescriptor, 0);
                i = 1;
            }
        }
        df1VarMo4079b.mo4086j(serialDescriptor);
        return new RequestChatAnalyze(i, iMo4091q);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, RequestChatAnalyze requestChatAnalyze) {
        encoder.getClass();
        requestChatAnalyze.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        mk9 mk9VarMo15606b = encoder.mo15606b(serialDescriptor);
        mk9VarMo15606b.m16878v(0, requestChatAnalyze.f20323a, serialDescriptor);
        mk9VarMo15606b.m16871A(serialDescriptor);
    }

    @Override // p000.zk3
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return te1.f62178b;
    }
}
