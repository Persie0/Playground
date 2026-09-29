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
public final /* synthetic */ class CollectionsFilterProvider$$serializer implements zk3 {
    public static final CollectionsFilterProvider$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        CollectionsFilterProvider$$serializer collectionsFilterProvider$$serializer = new CollectionsFilterProvider$$serializer();
        INSTANCE = collectionsFilterProvider$$serializer;
        bg7 bg7Var = new bg7("com.lingq.core.domain.model.library.CollectionsFilterProvider", collectionsFilterProvider$$serializer, 2);
        bg7Var.m3702k("id", true);
        bg7Var.m3702k("title", true);
        descriptor = bg7Var;
    }

    private CollectionsFilterProvider$$serializer() {
    }

    @Override // p000.zk3
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{thb.m22059r(l84.f49294a), thb.m22059r(sk9.f60959a)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final CollectionsFilterProvider deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        df1 df1VarMo4079b = decoder.mo4079b(serialDescriptor);
        boolean z = true;
        int i = 0;
        Integer num = null;
        String str = null;
        while (z) {
            int iMo10319A = df1VarMo4079b.mo10319A(serialDescriptor);
            if (iMo10319A == -1) {
                z = false;
            } else if (iMo10319A == 0) {
                num = (Integer) df1VarMo4079b.mo4070D(serialDescriptor, 0, l84.f49294a, num);
                i |= 1;
            } else {
                if (iMo10319A != 1) {
                    uk9.m22771e(iMo10319A);
                    return null;
                }
                str = (String) df1VarMo4079b.mo4070D(serialDescriptor, 1, sk9.f60959a, str);
                i |= 2;
            }
        }
        df1VarMo4079b.mo4086j(serialDescriptor);
        return new CollectionsFilterProvider(i, num, str);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, CollectionsFilterProvider collectionsFilterProvider) {
        encoder.getClass();
        collectionsFilterProvider.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        mk9 mk9VarMo15606b = encoder.mo15606b(serialDescriptor);
        CollectionsFilterProvider.m8083b(collectionsFilterProvider, mk9VarMo15606b, serialDescriptor);
        mk9VarMo15606b.m16871A(serialDescriptor);
    }

    @Override // p000.zk3
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return te1.f62178b;
    }
}
