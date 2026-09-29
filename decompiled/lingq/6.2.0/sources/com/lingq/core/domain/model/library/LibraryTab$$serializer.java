package com.lingq.core.domain.model.library;

import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.core.domain.model.LearningLevel;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import p000.bg7;
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

/* JADX INFO: loaded from: classes.dex */
@zb2
public final /* synthetic */ class LibraryTab$$serializer implements zk3 {
    public static final LibraryTab$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        LibraryTab$$serializer libraryTab$$serializer = new LibraryTab$$serializer();
        INSTANCE = libraryTab$$serializer;
        bg7 bg7Var = new bg7("com.lingq.core.domain.model.library.LibraryTab", libraryTab$$serializer, 6);
        bg7Var.m3702k("title", true);
        bg7Var.m3702k("display", false);
        bg7Var.m3702k("level", true);
        bg7Var.m3702k("selected", true);
        bg7Var.m3702k("index", true);
        bg7Var.m3702k("apiUrl", false);
        descriptor = bg7Var;
    }

    private LibraryTab$$serializer() {
    }

    @Override // p000.zk3
    public final KSerializer[] childSerializers() {
        sk9 sk9Var = sk9.f60959a;
        l84 l84Var = l84.f49294a;
        return new KSerializer[]{sk9Var, sk9Var, l84Var, lf0.f49579a, l84Var, sk9Var};
    }

    @Override // kotlinx.serialization.KSerializer
    public final LibraryTab deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        df1 df1VarMo4079b = decoder.mo4079b(serialDescriptor);
        boolean z = true;
        int i = 0;
        int iMo4091q = 0;
        boolean zMo4094v = false;
        int iMo4091q2 = 0;
        String strMo4097x = null;
        String strMo4097x2 = null;
        String strMo4097x3 = null;
        while (z) {
            int iMo10319A = df1VarMo4079b.mo10319A(serialDescriptor);
            switch (iMo10319A) {
                case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                    z = false;
                    break;
                case 0:
                    strMo4097x = df1VarMo4079b.mo4097x(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    strMo4097x2 = df1VarMo4079b.mo4097x(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    iMo4091q = df1VarMo4079b.mo4091q(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    zMo4094v = df1VarMo4079b.mo4094v(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    iMo4091q2 = df1VarMo4079b.mo4091q(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    strMo4097x3 = df1VarMo4079b.mo4097x(serialDescriptor, 5);
                    i |= 32;
                    break;
                default:
                    uk9.m22771e(iMo10319A);
                    return null;
            }
        }
        df1VarMo4079b.mo4086j(serialDescriptor);
        return new LibraryTab(i, strMo4097x, strMo4097x2, iMo4091q, zMo4094v, iMo4091q2, strMo4097x3);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, LibraryTab libraryTab) {
        encoder.getClass();
        libraryTab.getClass();
        String str = libraryTab.f19501a;
        SerialDescriptor serialDescriptor = descriptor;
        mk9 mk9VarMo15606b = encoder.mo15606b(serialDescriptor);
        if (mk9VarMo15606b.m16872B(serialDescriptor) || !fa4.m11650l(str, "Lessons")) {
            mk9VarMo15606b.m16882z(serialDescriptor, 0, str);
        }
        String str2 = libraryTab.f19502b;
        int i = libraryTab.f19505e;
        boolean z = libraryTab.f19504d;
        int i2 = libraryTab.f19503c;
        mk9VarMo15606b.m16882z(serialDescriptor, 1, str2);
        if (mk9VarMo15606b.m16872B(serialDescriptor) || i2 != LearningLevel.Beginner1.ordinal()) {
            mk9VarMo15606b.m16878v(2, i2, serialDescriptor);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || z) {
            mk9VarMo15606b.m16873q(serialDescriptor, 3, z);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || i != 0) {
            mk9VarMo15606b.m16878v(4, i, serialDescriptor);
        }
        mk9VarMo15606b.m16882z(serialDescriptor, 5, libraryTab.f19506f);
        mk9VarMo15606b.m16871A(serialDescriptor);
    }

    @Override // p000.zk3
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return te1.f62178b;
    }
}
