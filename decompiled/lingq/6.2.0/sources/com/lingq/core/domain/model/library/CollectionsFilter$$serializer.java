package com.lingq.core.domain.model.library;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import p000.bg7;
import p000.df1;
import p000.l84;
import p000.mk9;
import p000.sk9;
import p000.te1;
import p000.thb;
import p000.uk9;
import p000.zb2;
import p000.zk3;

/* JADX INFO: loaded from: classes.dex */
@zb2
public final /* synthetic */ class CollectionsFilter$$serializer implements zk3 {
    public static final CollectionsFilter$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        CollectionsFilter$$serializer collectionsFilter$$serializer = new CollectionsFilter$$serializer();
        INSTANCE = collectionsFilter$$serializer;
        bg7 bg7Var = new bg7("com.lingq.core.domain.model.library.CollectionsFilter", collectionsFilter$$serializer, 4);
        bg7Var.m3702k("id", true);
        bg7Var.m3702k("username", true);
        bg7Var.m3702k("photo", true);
        bg7Var.m3702k("role", true);
        descriptor = bg7Var;
    }

    private CollectionsFilter$$serializer() {
    }

    @Override // p000.zk3
    public final KSerializer[] childSerializers() {
        sk9 sk9Var = sk9.f60959a;
        return new KSerializer[]{l84.f49294a, sk9Var, sk9Var, thb.m22059r(sk9Var)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final CollectionsFilter deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        df1 df1VarMo4079b = decoder.mo4079b(serialDescriptor);
        boolean z = true;
        int i = 0;
        int iMo4091q = 0;
        String strMo4097x = null;
        String strMo4097x2 = null;
        String str = null;
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
                strMo4097x2 = df1VarMo4079b.mo4097x(serialDescriptor, 2);
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
        return new CollectionsFilter(i, iMo4091q, strMo4097x, strMo4097x2, str);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, CollectionsFilter collectionsFilter) {
        encoder.getClass();
        collectionsFilter.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        mk9 mk9VarMo15606b = encoder.mo15606b(serialDescriptor);
        CollectionsFilter.m8081b(collectionsFilter, mk9VarMo15606b, serialDescriptor);
        mk9VarMo15606b.m16871A(serialDescriptor);
    }

    @Override // p000.zk3
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return te1.f62178b;
    }
}
