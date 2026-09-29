package com.lingq.core.database.entity;

import com.android.installreferrer.api.InstallReferrerClient;
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
public final /* synthetic */ class PlaylistEntity$$serializer implements zk3 {
    public static final PlaylistEntity$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        PlaylistEntity$$serializer playlistEntity$$serializer = new PlaylistEntity$$serializer();
        INSTANCE = playlistEntity$$serializer;
        bg7 bg7Var = new bg7("com.lingq.core.database.entity.PlaylistEntity", playlistEntity$$serializer, 7);
        bg7Var.m3702k("nameWithLanguage", false);
        bg7Var.m3702k("language", false);
        bg7Var.m3702k("name", false);
        bg7Var.m3702k("pk", true);
        bg7Var.m3702k("isDefault", true);
        bg7Var.m3702k("isFeatured", true);
        bg7Var.m3702k("order", true);
        descriptor = bg7Var;
    }

    private PlaylistEntity$$serializer() {
    }

    @Override // p000.zk3
    public final KSerializer[] childSerializers() {
        sk9 sk9Var = sk9.f60959a;
        l84 l84Var = l84.f49294a;
        lf0 lf0Var = lf0.f49579a;
        return new KSerializer[]{sk9Var, sk9Var, sk9Var, l84Var, lf0Var, lf0Var, l84Var};
    }

    @Override // kotlinx.serialization.KSerializer
    public final PlaylistEntity deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        df1 df1VarMo4079b = decoder.mo4079b(serialDescriptor);
        boolean z = true;
        int i = 0;
        int iMo4091q = 0;
        boolean zMo4094v = false;
        boolean zMo4094v2 = false;
        int iMo4091q2 = 0;
        String strMo4097x = null;
        String strMo4097x2 = null;
        String strMo4097x3 = null;
        while (z) {
            int iMo10319A = df1VarMo4079b.mo10319A(serialDescriptor);
            switch (iMo10319A) {
                case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                    z = false;
                    break;
                case 0:
                    strMo4097x = df1VarMo4079b.mo4097x(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    strMo4097x2 = df1VarMo4079b.mo4097x(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    strMo4097x3 = df1VarMo4079b.mo4097x(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    iMo4091q = df1VarMo4079b.mo4091q(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    zMo4094v = df1VarMo4079b.mo4094v(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    zMo4094v2 = df1VarMo4079b.mo4094v(serialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    iMo4091q2 = df1VarMo4079b.mo4091q(serialDescriptor, 6);
                    i |= 64;
                    break;
                default:
                    uk9.m22771e(iMo10319A);
                    return null;
            }
        }
        df1VarMo4079b.mo4086j(serialDescriptor);
        return new PlaylistEntity(i, strMo4097x, strMo4097x2, strMo4097x3, iMo4091q, zMo4094v, zMo4094v2, iMo4091q2);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, PlaylistEntity playlistEntity) {
        encoder.getClass();
        playlistEntity.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        mk9 mk9VarMo15606b = encoder.mo15606b(serialDescriptor);
        String str = playlistEntity.f17422a;
        int i = playlistEntity.f17428g;
        boolean z = playlistEntity.f17427f;
        boolean z2 = playlistEntity.f17426e;
        int i2 = playlistEntity.f17425d;
        mk9VarMo15606b.m16882z(serialDescriptor, 0, str);
        mk9VarMo15606b.m16882z(serialDescriptor, 1, playlistEntity.f17423b);
        mk9VarMo15606b.m16882z(serialDescriptor, 2, playlistEntity.f17424c);
        if (mk9VarMo15606b.m16872B(serialDescriptor) || i2 != 0) {
            mk9VarMo15606b.m16878v(3, i2, serialDescriptor);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || z2) {
            mk9VarMo15606b.m16873q(serialDescriptor, 4, z2);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || !z) {
            mk9VarMo15606b.m16873q(serialDescriptor, 5, z);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || i != 0) {
            mk9VarMo15606b.m16878v(6, i, serialDescriptor);
        }
        mk9VarMo15606b.m16871A(serialDescriptor);
    }

    @Override // p000.zk3
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return te1.f62178b;
    }
}
