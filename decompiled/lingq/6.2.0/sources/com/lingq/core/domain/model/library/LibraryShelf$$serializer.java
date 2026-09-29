package com.lingq.core.domain.model.library;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import p000.bg7;
import p000.cs4;
import p000.df1;
import p000.fa4;
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
public final /* synthetic */ class LibraryShelf$$serializer implements zk3 {
    public static final LibraryShelf$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        LibraryShelf$$serializer libraryShelf$$serializer = new LibraryShelf$$serializer();
        INSTANCE = libraryShelf$$serializer;
        bg7 bg7Var = new bg7("com.lingq.core.domain.model.library.LibraryShelf", libraryShelf$$serializer, 8);
        bg7Var.m3702k("pinned", true);
        bg7Var.m3702k("pinnedHard", true);
        bg7Var.m3702k("tabs", true);
        bg7Var.m3702k("code", false);
        bg7Var.m3702k("id", true);
        bg7Var.m3702k("title", true);
        bg7Var.m3702k("order", true);
        bg7Var.m3702k("originalTitle", true);
        descriptor = bg7Var;
    }

    private LibraryShelf$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.zk3
    public final KSerializer[] childSerializers() {
        cs4[] cs4VarArr = LibraryShelf.f19492i;
        lf0 lf0Var = lf0.f49579a;
        sk9 sk9Var = sk9.f60959a;
        l84 l84Var = l84.f49294a;
        return new KSerializer[]{lf0Var, lf0Var, cs4VarArr[2].getValue(), sk9Var, l84Var, sk9Var, l84Var, sk9Var};
    }

    @Override // kotlinx.serialization.KSerializer
    public final LibraryShelf deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        df1 df1VarMo4079b = decoder.mo4079b(serialDescriptor);
        cs4[] cs4VarArr = LibraryShelf.f19492i;
        LibraryShelf libraryShelf = null;
        boolean z = true;
        int i = 0;
        boolean zMo4094v = false;
        boolean zMo4094v2 = false;
        int iMo4091q = 0;
        int iMo4091q2 = 0;
        List list = null;
        String strMo4097x = null;
        String strMo4097x2 = null;
        String strMo4097x3 = null;
        while (z) {
            int iMo10319A = df1VarMo4079b.mo10319A(serialDescriptor);
            switch (iMo10319A) {
                case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                    z = false;
                    continue;
                case 0:
                    zMo4094v = df1VarMo4079b.mo4094v(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    zMo4094v2 = df1VarMo4079b.mo4094v(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    list = (List) df1VarMo4079b.mo4073G(serialDescriptor, 2, (KSerializer) cs4VarArr[2].getValue(), list);
                    i |= 4;
                    break;
                case 3:
                    strMo4097x = df1VarMo4079b.mo4097x(serialDescriptor, 3);
                    i |= 8;
                    continue;
                case 4:
                    iMo4091q = df1VarMo4079b.mo4091q(serialDescriptor, 4);
                    i |= 16;
                    continue;
                case 5:
                    strMo4097x2 = df1VarMo4079b.mo4097x(serialDescriptor, 5);
                    i |= 32;
                    continue;
                case 6:
                    iMo4091q2 = df1VarMo4079b.mo4091q(serialDescriptor, 6);
                    i |= 64;
                    continue;
                case 7:
                    strMo4097x3 = df1VarMo4079b.mo4097x(serialDescriptor, 7);
                    i |= 128;
                    continue;
                default:
                    uk9.m22771e(iMo10319A);
                    return libraryShelf;
            }
            libraryShelf = null;
        }
        df1VarMo4079b.mo4086j(serialDescriptor);
        return new LibraryShelf(i, zMo4094v, zMo4094v2, list, strMo4097x, iMo4091q, strMo4097x2, iMo4091q2, strMo4097x3);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, LibraryShelf libraryShelf) {
        encoder.getClass();
        libraryShelf.getClass();
        List list = libraryShelf.f19495c;
        boolean z = libraryShelf.f19494b;
        boolean z2 = libraryShelf.f19493a;
        SerialDescriptor serialDescriptor = descriptor;
        mk9 mk9VarMo15606b = encoder.mo15606b(serialDescriptor);
        cs4[] cs4VarArr = LibraryShelf.f19492i;
        if (mk9VarMo15606b.m16872B(serialDescriptor) || z2) {
            mk9VarMo15606b.m16873q(serialDescriptor, 0, z2);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || z) {
            mk9VarMo15606b.m16873q(serialDescriptor, 1, z);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || !fa4.m11650l(list, EmptyList.f47638a)) {
            mk9VarMo15606b.m16881y(serialDescriptor, 2, (KSerializer) cs4VarArr[2].getValue(), list);
        }
        String str = libraryShelf.f19496d;
        String str2 = libraryShelf.f19500h;
        int i = libraryShelf.f19499g;
        String str3 = libraryShelf.f19498f;
        int i2 = libraryShelf.f19497e;
        mk9VarMo15606b.m16882z(serialDescriptor, 3, str);
        if (mk9VarMo15606b.m16872B(serialDescriptor) || i2 != -1) {
            mk9VarMo15606b.m16878v(4, i2, serialDescriptor);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || !fa4.m11650l(str3, "Search")) {
            mk9VarMo15606b.m16882z(serialDescriptor, 5, str3);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || i != 0) {
            mk9VarMo15606b.m16878v(6, i, serialDescriptor);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || !fa4.m11650l(str2, "Search")) {
            mk9VarMo15606b.m16882z(serialDescriptor, 7, str2);
        }
        mk9VarMo15606b.m16871A(serialDescriptor);
    }

    @Override // p000.zk3
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return te1.f62178b;
    }
}
