package com.lingq.core.domain.model.offer;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import p000.bg7;
import p000.cs4;
import p000.df1;
import p000.mk9;
import p000.sk9;
import p000.te1;
import p000.uk9;
import p000.zb2;
import p000.zk3;

/* JADX INFO: loaded from: classes2.dex */
@zb2
public final /* synthetic */ class OfferBanner$$serializer implements zk3 {
    public static final OfferBanner$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        OfferBanner$$serializer offerBanner$$serializer = new OfferBanner$$serializer();
        INSTANCE = offerBanner$$serializer;
        bg7 bg7Var = new bg7("com.lingq.core.domain.model.offer.OfferBanner", offerBanner$$serializer, 3);
        bg7Var.m3702k("type", false);
        bg7Var.m3702k("imageUrl", false);
        bg7Var.m3702k("locale", false);
        descriptor = bg7Var;
    }

    private OfferBanner$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.zk3
    public final KSerializer[] childSerializers() {
        sk9 sk9Var = sk9.f60959a;
        return new KSerializer[]{OfferBanner.f19544d[0].getValue(), sk9Var, sk9Var};
    }

    @Override // kotlinx.serialization.KSerializer
    public final OfferBanner deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        df1 df1VarMo4079b = decoder.mo4079b(serialDescriptor);
        cs4[] cs4VarArr = OfferBanner.f19544d;
        boolean z = true;
        int i = 0;
        BannerType bannerType = null;
        String strMo4097x = null;
        String strMo4097x2 = null;
        while (z) {
            int iMo10319A = df1VarMo4079b.mo10319A(serialDescriptor);
            if (iMo10319A == -1) {
                z = false;
            } else if (iMo10319A == 0) {
                bannerType = (BannerType) df1VarMo4079b.mo4073G(serialDescriptor, 0, (KSerializer) cs4VarArr[0].getValue(), bannerType);
                i |= 1;
            } else if (iMo10319A == 1) {
                strMo4097x = df1VarMo4079b.mo4097x(serialDescriptor, 1);
                i |= 2;
            } else {
                if (iMo10319A != 2) {
                    uk9.m22771e(iMo10319A);
                    return null;
                }
                strMo4097x2 = df1VarMo4079b.mo4097x(serialDescriptor, 2);
                i |= 4;
            }
        }
        df1VarMo4079b.mo4086j(serialDescriptor);
        return new OfferBanner(i, bannerType, strMo4097x, strMo4097x2);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, OfferBanner offerBanner) {
        encoder.getClass();
        offerBanner.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        mk9 mk9VarMo15606b = encoder.mo15606b(serialDescriptor);
        mk9VarMo15606b.m16881y(serialDescriptor, 0, (KSerializer) OfferBanner.f19544d[0].getValue(), offerBanner.f19545a);
        mk9VarMo15606b.m16882z(serialDescriptor, 1, offerBanner.f19546b);
        mk9VarMo15606b.m16882z(serialDescriptor, 2, offerBanner.f19547c);
        mk9VarMo15606b.m16871A(serialDescriptor);
    }

    @Override // p000.zk3
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return te1.f62178b;
    }
}
