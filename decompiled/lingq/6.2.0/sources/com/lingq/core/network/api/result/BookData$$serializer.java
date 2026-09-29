package com.lingq.core.network.api.result;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import p000.bg7;
import p000.df1;
import p000.dj2;
import p000.mk9;
import p000.sk9;
import p000.te1;
import p000.thb;
import p000.uk9;
import p000.zb2;
import p000.zk3;

/* JADX INFO: loaded from: classes2.dex */
@zb2
public final /* synthetic */ class BookData$$serializer implements zk3 {
    public static final BookData$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        BookData$$serializer bookData$$serializer = new BookData$$serializer();
        INSTANCE = bookData$$serializer;
        bg7 bg7Var = new bg7("com.lingq.core.network.api.result.BookData", bookData$$serializer, 3);
        bg7Var.m3702k("language", true);
        bg7Var.m3702k("readProgress", true);
        bg7Var.m3702k("status", true);
        descriptor = bg7Var;
    }

    private BookData$$serializer() {
    }

    @Override // p000.zk3
    public final KSerializer[] childSerializers() {
        sk9 sk9Var = sk9.f60959a;
        return new KSerializer[]{thb.m22059r(sk9Var), thb.m22059r(dj2.f35711a), thb.m22059r(sk9Var)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final BookData deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        df1 df1VarMo4079b = decoder.mo4079b(serialDescriptor);
        boolean z = true;
        int i = 0;
        String str = null;
        Double d = null;
        String str2 = null;
        while (z) {
            int iMo10319A = df1VarMo4079b.mo10319A(serialDescriptor);
            if (iMo10319A == -1) {
                z = false;
            } else if (iMo10319A == 0) {
                str = (String) df1VarMo4079b.mo4070D(serialDescriptor, 0, sk9.f60959a, str);
                i |= 1;
            } else if (iMo10319A == 1) {
                d = (Double) df1VarMo4079b.mo4070D(serialDescriptor, 1, dj2.f35711a, d);
                i |= 2;
            } else {
                if (iMo10319A != 2) {
                    uk9.m22771e(iMo10319A);
                    return null;
                }
                str2 = (String) df1VarMo4079b.mo4070D(serialDescriptor, 2, sk9.f60959a, str2);
                i |= 4;
            }
        }
        df1VarMo4079b.mo4086j(serialDescriptor);
        return new BookData(i, str, d, str2);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, BookData bookData) {
        encoder.getClass();
        bookData.getClass();
        String str = bookData.f20502c;
        Double d = bookData.f20501b;
        String str2 = bookData.f20500a;
        SerialDescriptor serialDescriptor = descriptor;
        mk9 mk9VarMo15606b = encoder.mo15606b(serialDescriptor);
        if (mk9VarMo15606b.m16872B(serialDescriptor) || str2 != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 0, sk9.f60959a, str2);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || d != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 1, dj2.f35711a, d);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || str != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 2, sk9.f60959a, str);
        }
        mk9VarMo15606b.m16871A(serialDescriptor);
    }

    @Override // p000.zk3
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return te1.f62178b;
    }
}
