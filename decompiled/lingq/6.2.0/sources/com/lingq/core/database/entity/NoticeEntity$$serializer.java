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
public final /* synthetic */ class NoticeEntity$$serializer implements zk3 {
    public static final NoticeEntity$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        NoticeEntity$$serializer noticeEntity$$serializer = new NoticeEntity$$serializer();
        INSTANCE = noticeEntity$$serializer;
        bg7 bg7Var = new bg7("com.lingq.core.database.entity.NoticeEntity", noticeEntity$$serializer, 7);
        bg7Var.m3702k("id", false);
        bg7Var.m3702k("language", false);
        bg7Var.m3702k("title", false);
        bg7Var.m3702k("startDate", false);
        bg7Var.m3702k("endDate", false);
        bg7Var.m3702k("noticeType", false);
        bg7Var.m3702k("isShown", false);
        descriptor = bg7Var;
    }

    private NoticeEntity$$serializer() {
    }

    @Override // p000.zk3
    public final KSerializer[] childSerializers() {
        sk9 sk9Var = sk9.f60959a;
        return new KSerializer[]{l84.f49294a, sk9Var, sk9Var, sk9Var, sk9Var, sk9Var, lf0.f49579a};
    }

    @Override // kotlinx.serialization.KSerializer
    public final NoticeEntity deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        df1 df1VarMo4079b = decoder.mo4079b(serialDescriptor);
        boolean z = true;
        int i = 0;
        int iMo4091q = 0;
        boolean zMo4094v = false;
        String strMo4097x = null;
        String strMo4097x2 = null;
        String strMo4097x3 = null;
        String strMo4097x4 = null;
        String strMo4097x5 = null;
        while (z) {
            int iMo10319A = df1VarMo4079b.mo10319A(serialDescriptor);
            switch (iMo10319A) {
                case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                    z = false;
                    break;
                case 0:
                    iMo4091q = df1VarMo4079b.mo4091q(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    strMo4097x = df1VarMo4079b.mo4097x(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    strMo4097x2 = df1VarMo4079b.mo4097x(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    strMo4097x3 = df1VarMo4079b.mo4097x(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    strMo4097x4 = df1VarMo4079b.mo4097x(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    strMo4097x5 = df1VarMo4079b.mo4097x(serialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    zMo4094v = df1VarMo4079b.mo4094v(serialDescriptor, 6);
                    i |= 64;
                    break;
                default:
                    uk9.m22771e(iMo10319A);
                    return null;
            }
        }
        df1VarMo4079b.mo4086j(serialDescriptor);
        return new NoticeEntity(i, iMo4091q, strMo4097x, strMo4097x2, strMo4097x3, strMo4097x4, strMo4097x5, zMo4094v);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, NoticeEntity noticeEntity) {
        encoder.getClass();
        noticeEntity.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        mk9 mk9VarMo15606b = encoder.mo15606b(serialDescriptor);
        mk9VarMo15606b.m16878v(0, noticeEntity.f17405a, serialDescriptor);
        mk9VarMo15606b.m16882z(serialDescriptor, 1, noticeEntity.f17406b);
        mk9VarMo15606b.m16882z(serialDescriptor, 2, noticeEntity.f17407c);
        mk9VarMo15606b.m16882z(serialDescriptor, 3, noticeEntity.f17408d);
        mk9VarMo15606b.m16882z(serialDescriptor, 4, noticeEntity.f17409e);
        mk9VarMo15606b.m16882z(serialDescriptor, 5, noticeEntity.f17410f);
        mk9VarMo15606b.m16873q(serialDescriptor, 6, noticeEntity.f17411g);
        mk9VarMo15606b.m16871A(serialDescriptor);
    }

    @Override // p000.zk3
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return te1.f62178b;
    }
}
