package com.lingq.core.network.api.result;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import p000.bg7;
import p000.df1;
import p000.fa4;
import p000.mk9;
import p000.sk9;
import p000.te1;
import p000.thb;
import p000.uk9;
import p000.zb2;
import p000.zk3;

/* JADX INFO: loaded from: classes2.dex */
@zb2
public final /* synthetic */ class Book$$serializer implements zk3 {
    public static final Book$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        Book$$serializer book$$serializer = new Book$$serializer();
        INSTANCE = book$$serializer;
        bg7 bg7Var = new bg7("com.lingq.core.network.api.result.Book", book$$serializer, 4);
        bg7Var.m3702k("contentType", true);
        bg7Var.m3702k("mtime", true);
        bg7Var.m3702k("object", true);
        bg7Var.m3702k("data", true);
        descriptor = bg7Var;
    }

    private Book$$serializer() {
    }

    @Override // p000.zk3
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{thb.m22059r(ContentType$$serializer.INSTANCE), thb.m22059r(sk9.f60959a), thb.m22059r(BookObject$$serializer.INSTANCE), thb.m22059r(BookData$$serializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Book deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        df1 df1VarMo4079b = decoder.mo4079b(serialDescriptor);
        boolean z = true;
        int i = 0;
        ContentType contentType = null;
        String str = null;
        BookObject bookObject = null;
        BookData bookData = null;
        while (z) {
            int iMo10319A = df1VarMo4079b.mo10319A(serialDescriptor);
            if (iMo10319A == -1) {
                z = false;
            } else if (iMo10319A == 0) {
                contentType = (ContentType) df1VarMo4079b.mo4070D(serialDescriptor, 0, ContentType$$serializer.INSTANCE, contentType);
                i |= 1;
            } else if (iMo10319A == 1) {
                str = (String) df1VarMo4079b.mo4070D(serialDescriptor, 1, sk9.f60959a, str);
                i |= 2;
            } else if (iMo10319A == 2) {
                bookObject = (BookObject) df1VarMo4079b.mo4070D(serialDescriptor, 2, BookObject$$serializer.INSTANCE, bookObject);
                i |= 4;
            } else {
                if (iMo10319A != 3) {
                    uk9.m22771e(iMo10319A);
                    return null;
                }
                bookData = (BookData) df1VarMo4079b.mo4070D(serialDescriptor, 3, BookData$$serializer.INSTANCE, bookData);
                i |= 8;
            }
        }
        df1VarMo4079b.mo4086j(serialDescriptor);
        return new Book(i, contentType, str, bookObject, bookData);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Book book) {
        encoder.getClass();
        book.getClass();
        BookData bookData = book.f20499d;
        BookObject bookObject = book.f20498c;
        String str = book.f20497b;
        ContentType contentType = book.f20496a;
        SerialDescriptor serialDescriptor = descriptor;
        mk9 mk9VarMo15606b = encoder.mo15606b(serialDescriptor);
        if (mk9VarMo15606b.m16872B(serialDescriptor) || !fa4.m11650l(contentType, new ContentType())) {
            mk9VarMo15606b.m16880x(serialDescriptor, 0, ContentType$$serializer.INSTANCE, contentType);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || !fa4.m11650l(str, "")) {
            mk9VarMo15606b.m16880x(serialDescriptor, 1, sk9.f60959a, str);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || !fa4.m11650l(bookObject, new BookObject())) {
            mk9VarMo15606b.m16880x(serialDescriptor, 2, BookObject$$serializer.INSTANCE, bookObject);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || bookData != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 3, BookData$$serializer.INSTANCE, bookData);
        }
        mk9VarMo15606b.m16871A(serialDescriptor);
    }

    @Override // p000.zk3
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return te1.f62178b;
    }
}
