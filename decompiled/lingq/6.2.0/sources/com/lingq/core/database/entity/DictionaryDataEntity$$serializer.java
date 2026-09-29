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
public final /* synthetic */ class DictionaryDataEntity$$serializer implements zk3 {
    public static final DictionaryDataEntity$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        DictionaryDataEntity$$serializer dictionaryDataEntity$$serializer = new DictionaryDataEntity$$serializer();
        INSTANCE = dictionaryDataEntity$$serializer;
        bg7 bg7Var = new bg7("com.lingq.core.database.entity.DictionaryDataEntity", dictionaryDataEntity$$serializer, 13);
        bg7Var.m3702k("id", false);
        bg7Var.m3702k("name", false);
        bg7Var.m3702k("order", false);
        bg7Var.m3702k("url_trans", false);
        bg7Var.m3702k("url_def", false);
        bg7Var.m3702k("popup_window", true);
        bg7Var.m3702k("langTo", false);
        bg7Var.m3702k("var1", false);
        bg7Var.m3702k("var2", false);
        bg7Var.m3702k("var3", false);
        bg7Var.m3702k("var4", false);
        bg7Var.m3702k("var5", false);
        bg7Var.m3702k("override_url", false);
        descriptor = bg7Var;
    }

    private DictionaryDataEntity$$serializer() {
    }

    @Override // p000.zk3
    public final KSerializer[] childSerializers() {
        l84 l84Var = l84.f49294a;
        sk9 sk9Var = sk9.f60959a;
        return new KSerializer[]{l84Var, sk9Var, l84Var, sk9Var, sk9Var, lf0.f49579a, sk9Var, sk9Var, sk9Var, sk9Var, sk9Var, sk9Var, sk9Var};
    }

    @Override // kotlinx.serialization.KSerializer
    public final DictionaryDataEntity deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        df1 df1VarMo4079b = decoder.mo4079b(serialDescriptor);
        boolean z = true;
        int i = 0;
        int iMo4091q = 0;
        int iMo4091q2 = 0;
        boolean zMo4094v = false;
        String strMo4097x = null;
        String strMo4097x2 = null;
        String strMo4097x3 = null;
        String strMo4097x4 = null;
        String strMo4097x5 = null;
        String strMo4097x6 = null;
        String strMo4097x7 = null;
        String strMo4097x8 = null;
        String strMo4097x9 = null;
        String strMo4097x10 = null;
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
                    iMo4091q2 = df1VarMo4079b.mo4091q(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    strMo4097x2 = df1VarMo4079b.mo4097x(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    strMo4097x3 = df1VarMo4079b.mo4097x(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    zMo4094v = df1VarMo4079b.mo4094v(serialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    strMo4097x4 = df1VarMo4079b.mo4097x(serialDescriptor, 6);
                    i |= 64;
                    break;
                case 7:
                    strMo4097x5 = df1VarMo4079b.mo4097x(serialDescriptor, 7);
                    i |= 128;
                    break;
                case 8:
                    strMo4097x6 = df1VarMo4079b.mo4097x(serialDescriptor, 8);
                    i |= 256;
                    break;
                case 9:
                    strMo4097x7 = df1VarMo4079b.mo4097x(serialDescriptor, 9);
                    i |= 512;
                    break;
                case 10:
                    strMo4097x8 = df1VarMo4079b.mo4097x(serialDescriptor, 10);
                    i |= 1024;
                    break;
                case 11:
                    strMo4097x9 = df1VarMo4079b.mo4097x(serialDescriptor, 11);
                    i |= 2048;
                    break;
                case 12:
                    strMo4097x10 = df1VarMo4079b.mo4097x(serialDescriptor, 12);
                    i |= 4096;
                    break;
                default:
                    uk9.m22771e(iMo10319A);
                    return null;
            }
        }
        df1VarMo4079b.mo4086j(serialDescriptor);
        return new DictionaryDataEntity(i, iMo4091q, strMo4097x, iMo4091q2, strMo4097x2, strMo4097x3, zMo4094v, strMo4097x4, strMo4097x5, strMo4097x6, strMo4097x7, strMo4097x8, strMo4097x9, strMo4097x10);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, DictionaryDataEntity dictionaryDataEntity) {
        encoder.getClass();
        dictionaryDataEntity.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        mk9 mk9VarMo15606b = encoder.mo15606b(serialDescriptor);
        int i = dictionaryDataEntity.f17132a;
        boolean z = dictionaryDataEntity.f17137f;
        mk9VarMo15606b.m16878v(0, i, serialDescriptor);
        mk9VarMo15606b.m16882z(serialDescriptor, 1, dictionaryDataEntity.f17133b);
        mk9VarMo15606b.m16878v(2, dictionaryDataEntity.f17134c, serialDescriptor);
        mk9VarMo15606b.m16882z(serialDescriptor, 3, dictionaryDataEntity.f17135d);
        mk9VarMo15606b.m16882z(serialDescriptor, 4, dictionaryDataEntity.f17136e);
        if (mk9VarMo15606b.m16872B(serialDescriptor) || z) {
            mk9VarMo15606b.m16873q(serialDescriptor, 5, z);
        }
        mk9VarMo15606b.m16882z(serialDescriptor, 6, dictionaryDataEntity.f17138g);
        mk9VarMo15606b.m16882z(serialDescriptor, 7, dictionaryDataEntity.f17139h);
        mk9VarMo15606b.m16882z(serialDescriptor, 8, dictionaryDataEntity.f17140i);
        mk9VarMo15606b.m16882z(serialDescriptor, 9, dictionaryDataEntity.f17141j);
        mk9VarMo15606b.m16882z(serialDescriptor, 10, dictionaryDataEntity.f17142k);
        mk9VarMo15606b.m16882z(serialDescriptor, 11, dictionaryDataEntity.f17143l);
        mk9VarMo15606b.m16882z(serialDescriptor, 12, dictionaryDataEntity.f17144m);
        mk9VarMo15606b.m16871A(serialDescriptor);
    }

    @Override // p000.zk3
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return te1.f62178b;
    }
}
