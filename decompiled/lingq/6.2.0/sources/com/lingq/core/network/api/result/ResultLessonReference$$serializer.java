package com.lingq.core.network.api.result;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import p000.bg7;
import p000.df1;
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
public final /* synthetic */ class ResultLessonReference$$serializer implements zk3 {
    public static final ResultLessonReference$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ResultLessonReference$$serializer resultLessonReference$$serializer = new ResultLessonReference$$serializer();
        INSTANCE = resultLessonReference$$serializer;
        bg7 bg7Var = new bg7("com.lingq.core.network.api.result.ResultLessonReference", resultLessonReference$$serializer, 9);
        bg7Var.m3702k("id", true);
        bg7Var.m3702k("price", true);
        bg7Var.m3702k("collectionTitle", true);
        bg7Var.m3702k("isTaken", true);
        bg7Var.m3702k("sharedById", true);
        bg7Var.m3702k("status", true);
        bg7Var.m3702k("title", true);
        bg7Var.m3702k("image", true);
        bg7Var.m3702k("duration", true);
        descriptor = bg7Var;
    }

    private ResultLessonReference$$serializer() {
    }

    @Override // p000.zk3
    public final KSerializer[] childSerializers() {
        l84 l84Var = l84.f49294a;
        sk9 sk9Var = sk9.f60959a;
        return new KSerializer[]{l84Var, l84Var, thb.m22059r(sk9Var), lf0.f49579a, thb.m22059r(l84Var), thb.m22059r(sk9Var), thb.m22059r(sk9Var), thb.m22059r(sk9Var), thb.m22059r(l84Var)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final ResultLessonReference deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        df1 df1VarMo4079b = decoder.mo4079b(serialDescriptor);
        ResultLessonReference resultLessonReference = null;
        boolean z = true;
        Integer num = null;
        String str = null;
        Integer num2 = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        int i = 0;
        int iMo4091q = 0;
        int iMo4091q2 = 0;
        boolean zMo4094v = false;
        while (z) {
            int iMo10319A = df1VarMo4079b.mo10319A(serialDescriptor);
            switch (iMo10319A) {
                case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                    z = false;
                    continue;
                case 0:
                    iMo4091q = df1VarMo4079b.mo4091q(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    iMo4091q2 = df1VarMo4079b.mo4091q(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    str = (String) df1VarMo4079b.mo4070D(serialDescriptor, 2, sk9.f60959a, str);
                    i |= 4;
                    break;
                case 3:
                    zMo4094v = df1VarMo4079b.mo4094v(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    num2 = (Integer) df1VarMo4079b.mo4070D(serialDescriptor, 4, l84.f49294a, num2);
                    i |= 16;
                    break;
                case 5:
                    str2 = (String) df1VarMo4079b.mo4070D(serialDescriptor, 5, sk9.f60959a, str2);
                    i |= 32;
                    break;
                case 6:
                    str3 = (String) df1VarMo4079b.mo4070D(serialDescriptor, 6, sk9.f60959a, str3);
                    i |= 64;
                    break;
                case 7:
                    str4 = (String) df1VarMo4079b.mo4070D(serialDescriptor, 7, sk9.f60959a, str4);
                    i |= 128;
                    break;
                case 8:
                    num = (Integer) df1VarMo4079b.mo4070D(serialDescriptor, 8, l84.f49294a, num);
                    i |= 256;
                    break;
                default:
                    uk9.m22771e(iMo10319A);
                    return resultLessonReference;
            }
            resultLessonReference = null;
        }
        df1VarMo4079b.mo4086j(serialDescriptor);
        return new ResultLessonReference(i, iMo4091q, iMo4091q2, str, zMo4094v, num2, str2, str3, str4, num);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, ResultLessonReference resultLessonReference) {
        encoder.getClass();
        resultLessonReference.getClass();
        Integer num = resultLessonReference.f21107i;
        String str = resultLessonReference.f21106h;
        String str2 = resultLessonReference.f21105g;
        String str3 = resultLessonReference.f21104f;
        Integer num2 = resultLessonReference.f21103e;
        boolean z = resultLessonReference.f21102d;
        String str4 = resultLessonReference.f21101c;
        int i = resultLessonReference.f21100b;
        int i2 = resultLessonReference.f21099a;
        SerialDescriptor serialDescriptor = descriptor;
        mk9 mk9VarMo15606b = encoder.mo15606b(serialDescriptor);
        if (mk9VarMo15606b.m16872B(serialDescriptor) || i2 != 0) {
            mk9VarMo15606b.m16878v(0, i2, serialDescriptor);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || i != 0) {
            mk9VarMo15606b.m16878v(1, i, serialDescriptor);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || str4 != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 2, sk9.f60959a, str4);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || z) {
            mk9VarMo15606b.m16873q(serialDescriptor, 3, z);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || num2 != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 4, l84.f49294a, num2);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || str3 != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 5, sk9.f60959a, str3);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || str2 != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 6, sk9.f60959a, str2);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || str != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 7, sk9.f60959a, str);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || num != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 8, l84.f49294a, num);
        }
        mk9VarMo15606b.m16871A(serialDescriptor);
    }

    @Override // p000.zk3
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return te1.f62178b;
    }
}
