package com.lingq.core.network.api.result;

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
public final /* synthetic */ class ResultWord$$serializer implements zk3 {
    public static final ResultWord$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ResultWord$$serializer resultWord$$serializer = new ResultWord$$serializer();
        INSTANCE = resultWord$$serializer;
        bg7 bg7Var = new bg7("com.lingq.core.network.api.result.ResultWord", resultWord$$serializer, 9);
        bg7Var.m3702k("text", true);
        bg7Var.m3702k("id", true);
        bg7Var.m3702k("status", true);
        bg7Var.m3702k("importance", true);
        bg7Var.m3702k("isPhrase", true);
        bg7Var.m3702k("hints", true);
        bg7Var.m3702k("tags", true);
        bg7Var.m3702k("cardId", true);
        bg7Var.m3702k("readings", true);
        descriptor = bg7Var;
    }

    private ResultWord$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.zk3
    public final KSerializer[] childSerializers() {
        cs4[] cs4VarArr = ResultWord.f21724j;
        sk9 sk9Var = sk9.f60959a;
        l84 l84Var = l84.f49294a;
        return new KSerializer[]{thb.m22059r(sk9Var), l84Var, thb.m22059r(sk9Var), l84Var, lf0.f49579a, cs4VarArr[5].getValue(), cs4VarArr[6].getValue(), l84Var, thb.m22059r(ResultTokenReadings$$serializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final ResultWord deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        df1 df1VarMo4079b = decoder.mo4079b(serialDescriptor);
        cs4[] cs4VarArr = ResultWord.f21724j;
        ResultWord resultWord = null;
        boolean z = true;
        ResultTokenReadings resultTokenReadings = null;
        String str = null;
        String str2 = null;
        List list = null;
        List list2 = null;
        int i = 0;
        int iMo4091q = 0;
        int iMo4091q2 = 0;
        boolean zMo4094v = false;
        int iMo4091q3 = 0;
        while (z) {
            int iMo10319A = df1VarMo4079b.mo10319A(serialDescriptor);
            switch (iMo10319A) {
                case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                    z = false;
                    break;
                case 0:
                    str = (String) df1VarMo4079b.mo4070D(serialDescriptor, 0, sk9.f60959a, str);
                    i |= 1;
                    break;
                case 1:
                    iMo4091q = df1VarMo4079b.mo4091q(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    str2 = (String) df1VarMo4079b.mo4070D(serialDescriptor, 2, sk9.f60959a, str2);
                    i |= 4;
                    break;
                case 3:
                    iMo4091q2 = df1VarMo4079b.mo4091q(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    zMo4094v = df1VarMo4079b.mo4094v(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    list = (List) df1VarMo4079b.mo4073G(serialDescriptor, 5, (KSerializer) cs4VarArr[5].getValue(), list);
                    i |= 32;
                    break;
                case 6:
                    list2 = (List) df1VarMo4079b.mo4073G(serialDescriptor, 6, (KSerializer) cs4VarArr[6].getValue(), list2);
                    i |= 64;
                    break;
                case 7:
                    iMo4091q3 = df1VarMo4079b.mo4091q(serialDescriptor, 7);
                    i |= 128;
                    break;
                case 8:
                    resultTokenReadings = (ResultTokenReadings) df1VarMo4079b.mo4070D(serialDescriptor, 8, ResultTokenReadings$$serializer.INSTANCE, resultTokenReadings);
                    i |= 256;
                    break;
                default:
                    uk9.m22771e(iMo10319A);
                    return resultWord;
            }
            resultWord = null;
        }
        df1VarMo4079b.mo4086j(serialDescriptor);
        return new ResultWord(i, str, iMo4091q, str2, iMo4091q2, zMo4094v, list, list2, iMo4091q3, resultTokenReadings);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, ResultWord resultWord) {
        encoder.getClass();
        resultWord.getClass();
        ResultTokenReadings resultTokenReadings = resultWord.f21733i;
        int i = resultWord.f21732h;
        List list = resultWord.f21731g;
        List list2 = resultWord.f21730f;
        boolean z = resultWord.f21729e;
        int i2 = resultWord.f21728d;
        String str = resultWord.f21727c;
        int i3 = resultWord.f21726b;
        String str2 = resultWord.f21725a;
        SerialDescriptor serialDescriptor = descriptor;
        mk9 mk9VarMo15606b = encoder.mo15606b(serialDescriptor);
        cs4[] cs4VarArr = ResultWord.f21724j;
        if (mk9VarMo15606b.m16872B(serialDescriptor) || str2 != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 0, sk9.f60959a, str2);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || i3 != 0) {
            mk9VarMo15606b.m16878v(1, i3, serialDescriptor);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || str != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 2, sk9.f60959a, str);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || i2 != 0) {
            mk9VarMo15606b.m16878v(3, i2, serialDescriptor);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || z) {
            mk9VarMo15606b.m16873q(serialDescriptor, 4, z);
        }
        boolean zM16872B = mk9VarMo15606b.m16872B(serialDescriptor);
        EmptyList emptyList = EmptyList.f47638a;
        if (zM16872B || !fa4.m11650l(list2, emptyList)) {
            mk9VarMo15606b.m16881y(serialDescriptor, 5, (KSerializer) cs4VarArr[5].getValue(), list2);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || !fa4.m11650l(list, emptyList)) {
            mk9VarMo15606b.m16881y(serialDescriptor, 6, (KSerializer) cs4VarArr[6].getValue(), list);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || i != 0) {
            mk9VarMo15606b.m16878v(7, i, serialDescriptor);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || resultTokenReadings != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 8, ResultTokenReadings$$serializer.INSTANCE, resultTokenReadings);
        }
        mk9VarMo15606b.m16871A(serialDescriptor);
    }

    @Override // p000.zk3
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return te1.f62178b;
    }
}
