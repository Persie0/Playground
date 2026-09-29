package com.lingq.core.database.entity;

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
import p000.thb;
import p000.uk9;
import p000.zb2;
import p000.zk3;

/* JADX INFO: loaded from: classes2.dex */
@zb2
public final /* synthetic */ class LibraryShelfEntity$$serializer implements zk3 {
    public static final LibraryShelfEntity$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        LibraryShelfEntity$$serializer libraryShelfEntity$$serializer = new LibraryShelfEntity$$serializer();
        INSTANCE = libraryShelfEntity$$serializer;
        bg7 bg7Var = new bg7("com.lingq.core.database.entity.LibraryShelfEntity", libraryShelfEntity$$serializer, 11);
        bg7Var.m3702k("codeWithLanguage", false);
        bg7Var.m3702k("language", false);
        bg7Var.m3702k("pinned", false);
        bg7Var.m3702k("pinnedHard", false);
        bg7Var.m3702k("tabs", true);
        bg7Var.m3702k("code", false);
        bg7Var.m3702k("id", false);
        bg7Var.m3702k("title", false);
        bg7Var.m3702k("order", false);
        bg7Var.m3702k("levels", true);
        bg7Var.m3702k("originalTitle", true);
        descriptor = bg7Var;
    }

    private LibraryShelfEntity$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.zk3
    public final KSerializer[] childSerializers() {
        cs4[] cs4VarArr = LibraryShelfEntity.f17380l;
        sk9 sk9Var = sk9.f60959a;
        lf0 lf0Var = lf0.f49579a;
        l84 l84Var = l84.f49294a;
        return new KSerializer[]{sk9Var, sk9Var, thb.m22059r(lf0Var), thb.m22059r(lf0Var), cs4VarArr[4].getValue(), sk9Var, l84Var, sk9Var, l84Var, sk9Var, sk9Var};
    }

    @Override // kotlinx.serialization.KSerializer
    public final LibraryShelfEntity deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        df1 df1VarMo4079b = decoder.mo4079b(serialDescriptor);
        cs4[] cs4VarArr = LibraryShelfEntity.f17380l;
        LibraryShelfEntity libraryShelfEntity = null;
        boolean z = true;
        int i = 0;
        int iMo4091q = 0;
        int iMo4091q2 = 0;
        String strMo4097x = null;
        String strMo4097x2 = null;
        Boolean bool = null;
        Boolean bool2 = null;
        List list = null;
        String strMo4097x3 = null;
        String strMo4097x4 = null;
        String strMo4097x5 = null;
        String strMo4097x6 = null;
        while (z) {
            int iMo10319A = df1VarMo4079b.mo10319A(serialDescriptor);
            switch (iMo10319A) {
                case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                    z = false;
                    continue;
                case 0:
                    strMo4097x = df1VarMo4079b.mo4097x(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    strMo4097x2 = df1VarMo4079b.mo4097x(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    bool = (Boolean) df1VarMo4079b.mo4070D(serialDescriptor, 2, lf0.f49579a, bool);
                    i |= 4;
                    break;
                case 3:
                    bool2 = (Boolean) df1VarMo4079b.mo4070D(serialDescriptor, 3, lf0.f49579a, bool2);
                    i |= 8;
                    break;
                case 4:
                    list = (List) df1VarMo4079b.mo4073G(serialDescriptor, 4, (KSerializer) cs4VarArr[4].getValue(), list);
                    i |= 16;
                    break;
                case 5:
                    strMo4097x3 = df1VarMo4079b.mo4097x(serialDescriptor, 5);
                    i |= 32;
                    continue;
                case 6:
                    iMo4091q = df1VarMo4079b.mo4091q(serialDescriptor, 6);
                    i |= 64;
                    continue;
                case 7:
                    strMo4097x4 = df1VarMo4079b.mo4097x(serialDescriptor, 7);
                    i |= 128;
                    continue;
                case 8:
                    iMo4091q2 = df1VarMo4079b.mo4091q(serialDescriptor, 8);
                    i |= 256;
                    continue;
                case 9:
                    strMo4097x5 = df1VarMo4079b.mo4097x(serialDescriptor, 9);
                    i |= 512;
                    continue;
                case 10:
                    strMo4097x6 = df1VarMo4079b.mo4097x(serialDescriptor, 10);
                    i |= 1024;
                    continue;
                default:
                    uk9.m22771e(iMo10319A);
                    return libraryShelfEntity;
            }
            libraryShelfEntity = null;
        }
        df1VarMo4079b.mo4086j(serialDescriptor);
        return new LibraryShelfEntity(i, strMo4097x, strMo4097x2, bool, bool2, list, strMo4097x3, iMo4091q, strMo4097x4, iMo4091q2, strMo4097x5, strMo4097x6);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, LibraryShelfEntity libraryShelfEntity) {
        encoder.getClass();
        libraryShelfEntity.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        mk9 mk9VarMo15606b = encoder.mo15606b(serialDescriptor);
        cs4[] cs4VarArr = LibraryShelfEntity.f17380l;
        String str = libraryShelfEntity.f17381a;
        String str2 = libraryShelfEntity.f17391k;
        String str3 = libraryShelfEntity.f17390j;
        List list = libraryShelfEntity.f17385e;
        mk9VarMo15606b.m16882z(serialDescriptor, 0, str);
        mk9VarMo15606b.m16882z(serialDescriptor, 1, libraryShelfEntity.f17382b);
        lf0 lf0Var = lf0.f49579a;
        mk9VarMo15606b.m16880x(serialDescriptor, 2, lf0Var, libraryShelfEntity.f17383c);
        mk9VarMo15606b.m16880x(serialDescriptor, 3, lf0Var, libraryShelfEntity.f17384d);
        if (mk9VarMo15606b.m16872B(serialDescriptor) || !fa4.m11650l(list, EmptyList.f47638a)) {
            mk9VarMo15606b.m16881y(serialDescriptor, 4, (KSerializer) cs4VarArr[4].getValue(), list);
        }
        mk9VarMo15606b.m16882z(serialDescriptor, 5, libraryShelfEntity.f17386f);
        mk9VarMo15606b.m16878v(6, libraryShelfEntity.f17387g, serialDescriptor);
        mk9VarMo15606b.m16882z(serialDescriptor, 7, libraryShelfEntity.f17388h);
        mk9VarMo15606b.m16878v(8, libraryShelfEntity.f17389i, serialDescriptor);
        if (mk9VarMo15606b.m16872B(serialDescriptor) || !fa4.m11650l(str3, "")) {
            mk9VarMo15606b.m16882z(serialDescriptor, 9, str3);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || !fa4.m11650l(str2, "")) {
            mk9VarMo15606b.m16882z(serialDescriptor, 10, str2);
        }
        mk9VarMo15606b.m16871A(serialDescriptor);
    }

    @Override // p000.zk3
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return te1.f62178b;
    }
}
