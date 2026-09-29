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
import p000.mk9;
import p000.te1;
import p000.thb;
import p000.uk9;
import p000.zb2;
import p000.zk3;

/* JADX INFO: loaded from: classes2.dex */
@zb2
public final /* synthetic */ class ResultTokenReadings$$serializer implements zk3 {
    public static final ResultTokenReadings$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ResultTokenReadings$$serializer resultTokenReadings$$serializer = new ResultTokenReadings$$serializer();
        INSTANCE = resultTokenReadings$$serializer;
        bg7 bg7Var = new bg7("com.lingq.core.network.api.result.ResultTokenReadings", resultTokenReadings$$serializer, 6);
        bg7Var.m3702k("romaji", true);
        bg7Var.m3702k("hiragana", true);
        bg7Var.m3702k("pinyin", true);
        bg7Var.m3702k("hant", true);
        bg7Var.m3702k("hans", true);
        bg7Var.m3702k("jyutping", true);
        descriptor = bg7Var;
    }

    private ResultTokenReadings$$serializer() {
    }

    @Override // p000.zk3
    public final KSerializer[] childSerializers() {
        cs4[] cs4VarArr = ResultTokenReadings.f21597g;
        return new KSerializer[]{thb.m22059r((KSerializer) cs4VarArr[0].getValue()), thb.m22059r((KSerializer) cs4VarArr[1].getValue()), thb.m22059r((KSerializer) cs4VarArr[2].getValue()), thb.m22059r((KSerializer) cs4VarArr[3].getValue()), thb.m22059r((KSerializer) cs4VarArr[4].getValue()), thb.m22059r((KSerializer) cs4VarArr[5].getValue())};
    }

    @Override // kotlinx.serialization.KSerializer
    public final ResultTokenReadings deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        df1 df1VarMo4079b = decoder.mo4079b(serialDescriptor);
        cs4[] cs4VarArr = ResultTokenReadings.f21597g;
        boolean z = true;
        int i = 0;
        List list = null;
        List list2 = null;
        List list3 = null;
        List list4 = null;
        List list5 = null;
        List list6 = null;
        while (z) {
            int iMo10319A = df1VarMo4079b.mo10319A(serialDescriptor);
            switch (iMo10319A) {
                case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                    z = false;
                    break;
                case 0:
                    list = (List) df1VarMo4079b.mo4070D(serialDescriptor, 0, (KSerializer) cs4VarArr[0].getValue(), list);
                    i |= 1;
                    break;
                case 1:
                    list2 = (List) df1VarMo4079b.mo4070D(serialDescriptor, 1, (KSerializer) cs4VarArr[1].getValue(), list2);
                    i |= 2;
                    break;
                case 2:
                    list3 = (List) df1VarMo4079b.mo4070D(serialDescriptor, 2, (KSerializer) cs4VarArr[2].getValue(), list3);
                    i |= 4;
                    break;
                case 3:
                    list4 = (List) df1VarMo4079b.mo4070D(serialDescriptor, 3, (KSerializer) cs4VarArr[3].getValue(), list4);
                    i |= 8;
                    break;
                case 4:
                    list5 = (List) df1VarMo4079b.mo4070D(serialDescriptor, 4, (KSerializer) cs4VarArr[4].getValue(), list5);
                    i |= 16;
                    break;
                case 5:
                    list6 = (List) df1VarMo4079b.mo4070D(serialDescriptor, 5, (KSerializer) cs4VarArr[5].getValue(), list6);
                    i |= 32;
                    break;
                default:
                    uk9.m22771e(iMo10319A);
                    return null;
            }
        }
        df1VarMo4079b.mo4086j(serialDescriptor);
        return new ResultTokenReadings(i, list, list2, list3, list4, list5, list6);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, ResultTokenReadings resultTokenReadings) {
        encoder.getClass();
        resultTokenReadings.getClass();
        List list = resultTokenReadings.f21603f;
        List list2 = resultTokenReadings.f21602e;
        List list3 = resultTokenReadings.f21601d;
        List list4 = resultTokenReadings.f21600c;
        List list5 = resultTokenReadings.f21599b;
        List list6 = resultTokenReadings.f21598a;
        SerialDescriptor serialDescriptor = descriptor;
        mk9 mk9VarMo15606b = encoder.mo15606b(serialDescriptor);
        cs4[] cs4VarArr = ResultTokenReadings.f21597g;
        boolean zM16872B = mk9VarMo15606b.m16872B(serialDescriptor);
        EmptyList emptyList = EmptyList.f47638a;
        if (zM16872B || !fa4.m11650l(list6, emptyList)) {
            mk9VarMo15606b.m16880x(serialDescriptor, 0, (KSerializer) cs4VarArr[0].getValue(), list6);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || !fa4.m11650l(list5, emptyList)) {
            mk9VarMo15606b.m16880x(serialDescriptor, 1, (KSerializer) cs4VarArr[1].getValue(), list5);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || !fa4.m11650l(list4, emptyList)) {
            mk9VarMo15606b.m16880x(serialDescriptor, 2, (KSerializer) cs4VarArr[2].getValue(), list4);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || !fa4.m11650l(list3, emptyList)) {
            mk9VarMo15606b.m16880x(serialDescriptor, 3, (KSerializer) cs4VarArr[3].getValue(), list3);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || !fa4.m11650l(list2, emptyList)) {
            mk9VarMo15606b.m16880x(serialDescriptor, 4, (KSerializer) cs4VarArr[4].getValue(), list2);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || !fa4.m11650l(list, emptyList)) {
            mk9VarMo15606b.m16880x(serialDescriptor, 5, (KSerializer) cs4VarArr[5].getValue(), list);
        }
        mk9VarMo15606b.m16871A(serialDescriptor);
    }

    @Override // p000.zk3
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return te1.f62178b;
    }
}
