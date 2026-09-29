package com.lingq.core.database.entity;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import p000.bg7;
import p000.df1;
import p000.dj2;
import p000.fa4;
import p000.l73;
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
public final /* synthetic */ class LibraryCounterEntity$$serializer implements zk3 {
    public static final LibraryCounterEntity$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        LibraryCounterEntity$$serializer libraryCounterEntity$$serializer = new LibraryCounterEntity$$serializer();
        INSTANCE = libraryCounterEntity$$serializer;
        bg7 bg7Var = new bg7("com.lingq.core.database.entity.LibraryCounterEntity", libraryCounterEntity$$serializer, 18);
        bg7Var.m3702k("id", false);
        bg7Var.m3702k("type", false);
        bg7Var.m3702k("roseGiven", true);
        bg7Var.m3702k("progress", true);
        bg7Var.m3702k("listenTimes", true);
        bg7Var.m3702k("readTimes", true);
        bg7Var.m3702k("isTaken", true);
        bg7Var.m3702k("difficulty", true);
        bg7Var.m3702k("rosesCount", true);
        bg7Var.m3702k("newWordsCount", true);
        bg7Var.m3702k("knownWordsCount", true);
        bg7Var.m3702k("cardsCount", true);
        bg7Var.m3702k("lessonsCount", true);
        bg7Var.m3702k("isCompletelyTaken", true);
        bg7Var.m3702k("totalWordsCount", true);
        bg7Var.m3702k("uniqueWordsCount", true);
        bg7Var.m3702k("audioStart", true);
        bg7Var.m3702k("audioEnd", true);
        descriptor = bg7Var;
    }

    private LibraryCounterEntity$$serializer() {
    }

    @Override // p000.zk3
    public final KSerializer[] childSerializers() {
        l73 l73Var = l73.f49244a;
        KSerializer kSerializerM22059r = thb.m22059r(l73Var);
        dj2 dj2Var = dj2.f35711a;
        KSerializer kSerializerM22059r2 = thb.m22059r(dj2Var);
        KSerializer kSerializerM22059r3 = thb.m22059r(dj2Var);
        KSerializer kSerializerM22059r4 = thb.m22059r(dj2Var);
        KSerializer kSerializerM22059r5 = thb.m22059r(dj2Var);
        l84 l84Var = l84.f49294a;
        lf0 lf0Var = lf0.f49579a;
        return new KSerializer[]{l84Var, sk9.f60959a, lf0Var, kSerializerM22059r, kSerializerM22059r2, kSerializerM22059r3, lf0Var, l73Var, l84Var, l84Var, l84Var, l84Var, l84Var, lf0Var, l84Var, l84Var, kSerializerM22059r4, kSerializerM22059r5};
    }

    @Override // kotlinx.serialization.KSerializer
    public final LibraryCounterEntity deserialize(Decoder decoder) {
        int i;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        df1 df1VarMo4079b = decoder.mo4079b(serialDescriptor);
        float fMo4077L = 0.0f;
        Double d = null;
        boolean z = true;
        Double d2 = null;
        int i2 = 0;
        int iMo4091q = 0;
        String strMo4097x = null;
        boolean zMo4094v = false;
        Float f = null;
        Double d3 = null;
        Double d4 = null;
        boolean zMo4094v2 = false;
        int iMo4091q2 = 0;
        int iMo4091q3 = 0;
        int iMo4091q4 = 0;
        int iMo4091q5 = 0;
        int iMo4091q6 = 0;
        boolean zMo4094v3 = false;
        int iMo4091q7 = 0;
        int iMo4091q8 = 0;
        while (z) {
            int iMo10319A = df1VarMo4079b.mo10319A(serialDescriptor);
            switch (iMo10319A) {
                case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                    z = false;
                    continue;
                case 0:
                    iMo4091q = df1VarMo4079b.mo4091q(serialDescriptor, 0);
                    i2 |= 1;
                    continue;
                case 1:
                    strMo4097x = df1VarMo4079b.mo4097x(serialDescriptor, 1);
                    i2 |= 2;
                    continue;
                case 2:
                    zMo4094v = df1VarMo4079b.mo4094v(serialDescriptor, 2);
                    i2 |= 4;
                    continue;
                case 3:
                    f = (Float) df1VarMo4079b.mo4070D(serialDescriptor, 3, l73.f49244a, f);
                    i2 |= 8;
                    continue;
                case 4:
                    d3 = (Double) df1VarMo4079b.mo4070D(serialDescriptor, 4, dj2.f35711a, d3);
                    i2 |= 16;
                    continue;
                case 5:
                    d4 = (Double) df1VarMo4079b.mo4070D(serialDescriptor, 5, dj2.f35711a, d4);
                    i2 |= 32;
                    continue;
                case 6:
                    zMo4094v2 = df1VarMo4079b.mo4094v(serialDescriptor, 6);
                    i2 |= 64;
                    continue;
                case 7:
                    fMo4077L = df1VarMo4079b.mo4077L(serialDescriptor, 7);
                    i2 |= 128;
                    continue;
                case 8:
                    iMo4091q2 = df1VarMo4079b.mo4091q(serialDescriptor, 8);
                    i2 |= 256;
                    continue;
                case 9:
                    iMo4091q3 = df1VarMo4079b.mo4091q(serialDescriptor, 9);
                    i2 |= 512;
                    continue;
                case 10:
                    iMo4091q4 = df1VarMo4079b.mo4091q(serialDescriptor, 10);
                    i2 |= 1024;
                    continue;
                case 11:
                    iMo4091q5 = df1VarMo4079b.mo4091q(serialDescriptor, 11);
                    i2 |= 2048;
                    continue;
                case 12:
                    iMo4091q6 = df1VarMo4079b.mo4091q(serialDescriptor, 12);
                    i2 |= 4096;
                    continue;
                case 13:
                    zMo4094v3 = df1VarMo4079b.mo4094v(serialDescriptor, 13);
                    i2 |= 8192;
                    continue;
                case 14:
                    iMo4091q7 = df1VarMo4079b.mo4091q(serialDescriptor, 14);
                    i2 |= 16384;
                    continue;
                case 15:
                    iMo4091q8 = df1VarMo4079b.mo4091q(serialDescriptor, 15);
                    i = 32768;
                    break;
                case 16:
                    d2 = (Double) df1VarMo4079b.mo4070D(serialDescriptor, 16, dj2.f35711a, d2);
                    i = 65536;
                    break;
                case 17:
                    d = (Double) df1VarMo4079b.mo4070D(serialDescriptor, 17, dj2.f35711a, d);
                    i = 131072;
                    break;
                default:
                    uk9.m22771e(iMo10319A);
                    return null;
            }
            i2 |= i;
        }
        df1VarMo4079b.mo4086j(serialDescriptor);
        return new LibraryCounterEntity(i2, iMo4091q, strMo4097x, zMo4094v, f, d3, d4, zMo4094v2, fMo4077L, iMo4091q2, iMo4091q3, iMo4091q4, iMo4091q5, iMo4091q6, zMo4094v3, iMo4091q7, iMo4091q8, d2, d);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, LibraryCounterEntity libraryCounterEntity) {
        encoder.getClass();
        libraryCounterEntity.getClass();
        Double d = libraryCounterEntity.f17374r;
        Double d2 = libraryCounterEntity.f17373q;
        int i = libraryCounterEntity.f17372p;
        int i2 = libraryCounterEntity.f17371o;
        boolean z = libraryCounterEntity.f17370n;
        int i3 = libraryCounterEntity.f17369m;
        SerialDescriptor serialDescriptor = descriptor;
        mk9 mk9VarMo15606b = encoder.mo15606b(serialDescriptor);
        Double dValueOf = Double.valueOf(0.0d);
        int i4 = libraryCounterEntity.f17357a;
        int i5 = libraryCounterEntity.f17368l;
        int i6 = libraryCounterEntity.f17367k;
        int i7 = libraryCounterEntity.f17366j;
        int i8 = libraryCounterEntity.f17365i;
        float f = libraryCounterEntity.f17364h;
        boolean z2 = libraryCounterEntity.f17363g;
        Double d3 = libraryCounterEntity.f17362f;
        Double d4 = libraryCounterEntity.f17361e;
        Float f2 = libraryCounterEntity.f17360d;
        boolean z3 = libraryCounterEntity.f17359c;
        mk9VarMo15606b.m16878v(0, i4, serialDescriptor);
        mk9VarMo15606b.m16882z(serialDescriptor, 1, libraryCounterEntity.f17358b);
        if (mk9VarMo15606b.m16872B(serialDescriptor) || z3) {
            mk9VarMo15606b.m16873q(serialDescriptor, 2, z3);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || !fa4.m11650l(f2, Float.valueOf(0.0f))) {
            mk9VarMo15606b.m16880x(serialDescriptor, 3, l73.f49244a, f2);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || !fa4.m11650l(d4, dValueOf)) {
            mk9VarMo15606b.m16880x(serialDescriptor, 4, dj2.f35711a, d4);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || !fa4.m11650l(d3, dValueOf)) {
            mk9VarMo15606b.m16880x(serialDescriptor, 5, dj2.f35711a, d3);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || z2) {
            mk9VarMo15606b.m16873q(serialDescriptor, 6, z2);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || Float.compare(f, 0.0f) != 0) {
            mk9VarMo15606b.m16876t(serialDescriptor, 7, f);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || i8 != 0) {
            mk9VarMo15606b.m16878v(8, i8, serialDescriptor);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || i7 != 0) {
            mk9VarMo15606b.m16878v(9, i7, serialDescriptor);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || i6 != 0) {
            mk9VarMo15606b.m16878v(10, i6, serialDescriptor);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || i5 != 0) {
            mk9VarMo15606b.m16878v(11, i5, serialDescriptor);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || i3 != 0) {
            mk9VarMo15606b.m16878v(12, i3, serialDescriptor);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || z) {
            mk9VarMo15606b.m16873q(serialDescriptor, 13, z);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || i2 != 0) {
            mk9VarMo15606b.m16878v(14, i2, serialDescriptor);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || i != 0) {
            mk9VarMo15606b.m16878v(15, i, serialDescriptor);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || d2 != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 16, dj2.f35711a, d2);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || d != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 17, dj2.f35711a, d);
        }
        mk9VarMo15606b.m16871A(serialDescriptor);
    }

    @Override // p000.zk3
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return te1.f62178b;
    }
}
