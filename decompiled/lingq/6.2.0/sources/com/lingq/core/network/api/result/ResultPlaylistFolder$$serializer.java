package com.lingq.core.network.api.result;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import p000.bg7;
import p000.df1;
import p000.l84;
import p000.lf0;
import p000.mk9;
import p000.sk9;
import p000.te1;
import p000.uk9;
import p000.zb2;
import p000.zk3;

/* JADX INFO: loaded from: classes2.dex */
@zb2
public final /* synthetic */ class ResultPlaylistFolder$$serializer implements zk3 {
    public static final ResultPlaylistFolder$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ResultPlaylistFolder$$serializer resultPlaylistFolder$$serializer = new ResultPlaylistFolder$$serializer();
        INSTANCE = resultPlaylistFolder$$serializer;
        bg7 bg7Var = new bg7("com.lingq.core.network.api.result.ResultPlaylistFolder", resultPlaylistFolder$$serializer, 4);
        bg7Var.m3702k("pk", true);
        bg7Var.m3702k("title", false);
        bg7Var.m3702k("isDefault", true);
        bg7Var.m3702k("isFeatured", true);
        descriptor = bg7Var;
    }

    private ResultPlaylistFolder$$serializer() {
    }

    @Override // p000.zk3
    public final KSerializer[] childSerializers() {
        lf0 lf0Var = lf0.f49579a;
        return new KSerializer[]{l84.f49294a, sk9.f60959a, lf0Var, lf0Var};
    }

    @Override // kotlinx.serialization.KSerializer
    public final ResultPlaylistFolder deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        df1 df1VarMo4079b = decoder.mo4079b(serialDescriptor);
        boolean z = true;
        int i = 0;
        int iMo4091q = 0;
        boolean zMo4094v = false;
        boolean zMo4094v2 = false;
        String strMo4097x = null;
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
            } else if (iMo10319A == 2) {
                zMo4094v = df1VarMo4079b.mo4094v(serialDescriptor, 2);
                i |= 4;
            } else {
                if (iMo10319A != 3) {
                    uk9.m22771e(iMo10319A);
                    return null;
                }
                zMo4094v2 = df1VarMo4079b.mo4094v(serialDescriptor, 3);
                i |= 8;
            }
        }
        df1VarMo4079b.mo4086j(serialDescriptor);
        return new ResultPlaylistFolder(i, iMo4091q, strMo4097x, zMo4094v, zMo4094v2);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, ResultPlaylistFolder resultPlaylistFolder) {
        encoder.getClass();
        resultPlaylistFolder.getClass();
        int i = resultPlaylistFolder.f21460a;
        SerialDescriptor serialDescriptor = descriptor;
        mk9 mk9VarMo15606b = encoder.mo15606b(serialDescriptor);
        if (mk9VarMo15606b.m16872B(serialDescriptor) || i != 0) {
            mk9VarMo15606b.m16878v(0, i, serialDescriptor);
        }
        String str = resultPlaylistFolder.f21461b;
        boolean z = resultPlaylistFolder.f21463d;
        boolean z2 = resultPlaylistFolder.f21462c;
        mk9VarMo15606b.m16882z(serialDescriptor, 1, str);
        if (mk9VarMo15606b.m16872B(serialDescriptor) || z2) {
            mk9VarMo15606b.m16873q(serialDescriptor, 2, z2);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || !z) {
            mk9VarMo15606b.m16873q(serialDescriptor, 3, z);
        }
        mk9VarMo15606b.m16871A(serialDescriptor);
    }

    @Override // p000.zk3
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return te1.f62178b;
    }
}
