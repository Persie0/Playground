package com.lingq.core.network.api.requests;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import p000.bg7;
import p000.df1;
import p000.lf0;
import p000.mk9;
import p000.te1;
import p000.uk9;
import p000.zb2;
import p000.zk3;

/* JADX INFO: loaded from: classes2.dex */
@zb2
public final /* synthetic */ class RequestChatUpdateMessage$$serializer implements zk3 {
    public static final RequestChatUpdateMessage$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        RequestChatUpdateMessage$$serializer requestChatUpdateMessage$$serializer = new RequestChatUpdateMessage$$serializer();
        INSTANCE = requestChatUpdateMessage$$serializer;
        bg7 bg7Var = new bg7("com.lingq.core.network.api.requests.RequestChatUpdateMessage", requestChatUpdateMessage$$serializer, 1);
        bg7Var.m3702k("includedInImport", false);
        descriptor = bg7Var;
    }

    private RequestChatUpdateMessage$$serializer() {
    }

    @Override // p000.zk3
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{lf0.f49579a};
    }

    @Override // kotlinx.serialization.KSerializer
    public final RequestChatUpdateMessage deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        df1 df1VarMo4079b = decoder.mo4079b(serialDescriptor);
        boolean z = true;
        int i = 0;
        boolean zMo4094v = false;
        while (z) {
            int iMo10319A = df1VarMo4079b.mo10319A(serialDescriptor);
            if (iMo10319A == -1) {
                z = false;
            } else {
                if (iMo10319A != 0) {
                    uk9.m22771e(iMo10319A);
                    return null;
                }
                zMo4094v = df1VarMo4079b.mo4094v(serialDescriptor, 0);
                i = 1;
            }
        }
        df1VarMo4079b.mo4086j(serialDescriptor);
        return new RequestChatUpdateMessage(i, zMo4094v);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, RequestChatUpdateMessage requestChatUpdateMessage) {
        encoder.getClass();
        requestChatUpdateMessage.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        mk9 mk9VarMo15606b = encoder.mo15606b(serialDescriptor);
        mk9VarMo15606b.m16873q(serialDescriptor, 0, requestChatUpdateMessage.f20336a);
        mk9VarMo15606b.m16871A(serialDescriptor);
    }

    @Override // p000.zk3
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return te1.f62178b;
    }
}
