package com.lingq.core.domain.model.library;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import p000.bg7;
import p000.df1;
import p000.l84;
import p000.lf0;
import p000.mk9;
import p000.te1;
import p000.uk9;
import p000.zb2;
import p000.zk3;

/* JADX INFO: loaded from: classes2.dex */
@zb2
public final /* synthetic */ class LibraryItemDownload$$serializer implements zk3 {
    public static final LibraryItemDownload$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        LibraryItemDownload$$serializer libraryItemDownload$$serializer = new LibraryItemDownload$$serializer();
        INSTANCE = libraryItemDownload$$serializer;
        bg7 bg7Var = new bg7("com.lingq.core.domain.model.library.LibraryItemDownload", libraryItemDownload$$serializer, 3);
        bg7Var.m3702k("id", false);
        bg7Var.m3702k("isDownloaded", false);
        bg7Var.m3702k("downloadProgress", false);
        descriptor = bg7Var;
    }

    private LibraryItemDownload$$serializer() {
    }

    @Override // p000.zk3
    public final KSerializer[] childSerializers() {
        l84 l84Var = l84.f49294a;
        return new KSerializer[]{l84Var, lf0.f49579a, l84Var};
    }

    @Override // kotlinx.serialization.KSerializer
    public final LibraryItemDownload deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        df1 df1VarMo4079b = decoder.mo4079b(serialDescriptor);
        boolean z = true;
        int i = 0;
        int iMo4091q = 0;
        boolean zMo4094v = false;
        int iMo4091q2 = 0;
        while (z) {
            int iMo10319A = df1VarMo4079b.mo10319A(serialDescriptor);
            if (iMo10319A == -1) {
                z = false;
            } else if (iMo10319A == 0) {
                iMo4091q = df1VarMo4079b.mo4091q(serialDescriptor, 0);
                i |= 1;
            } else if (iMo10319A == 1) {
                zMo4094v = df1VarMo4079b.mo4094v(serialDescriptor, 1);
                i |= 2;
            } else {
                if (iMo10319A != 2) {
                    uk9.m22771e(iMo10319A);
                    return null;
                }
                iMo4091q2 = df1VarMo4079b.mo4091q(serialDescriptor, 2);
                i |= 4;
            }
        }
        df1VarMo4079b.mo4086j(serialDescriptor);
        return new LibraryItemDownload(i, iMo4091q, iMo4091q2, zMo4094v);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, LibraryItemDownload libraryItemDownload) {
        encoder.getClass();
        libraryItemDownload.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        mk9 mk9VarMo15606b = encoder.mo15606b(serialDescriptor);
        mk9VarMo15606b.m16878v(0, libraryItemDownload.f19472a, serialDescriptor);
        mk9VarMo15606b.m16873q(serialDescriptor, 1, libraryItemDownload.f19473b);
        mk9VarMo15606b.m16878v(2, libraryItemDownload.f19474c, serialDescriptor);
        mk9VarMo15606b.m16871A(serialDescriptor);
    }

    @Override // p000.zk3
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return te1.f62178b;
    }
}
