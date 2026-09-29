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
import p000.lf0;
import p000.mk9;
import p000.sk9;
import p000.te1;
import p000.thb;
import p000.uk9;
import p000.zb2;
import p000.zk3;

/* JADX INFO: loaded from: classes.dex */
@zb2
public final /* synthetic */ class ResultTtsVoice$$serializer implements zk3 {
    public static final ResultTtsVoice$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ResultTtsVoice$$serializer resultTtsVoice$$serializer = new ResultTtsVoice$$serializer();
        INSTANCE = resultTtsVoice$$serializer;
        bg7 bg7Var = new bg7("com.lingq.core.network.api.result.ResultTtsVoice", resultTtsVoice$$serializer, 10);
        bg7Var.m3702k("name", false);
        bg7Var.m3702k("title", false);
        bg7Var.m3702k("voicesByApp", false);
        bg7Var.m3702k("alternative", true);
        bg7Var.m3702k("premium", true);
        bg7Var.m3702k("freeTrial", true);
        bg7Var.m3702k("priority", true);
        bg7Var.m3702k("accentCode", true);
        bg7Var.m3702k("isSelectable", true);
        bg7Var.m3702k("tags", true);
        descriptor = bg7Var;
    }

    private ResultTtsVoice$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.zk3
    public final KSerializer[] childSerializers() {
        cs4[] cs4VarArr = ResultTtsVoice.f21650k;
        sk9 sk9Var = sk9.f60959a;
        lf0 lf0Var = lf0.f49579a;
        return new KSerializer[]{sk9Var, sk9Var, cs4VarArr[2].getValue(), thb.m22059r(lf0Var), lf0Var, lf0Var, cs4VarArr[6].getValue(), thb.m22059r(sk9Var), lf0Var, cs4VarArr[9].getValue()};
    }

    @Override // kotlinx.serialization.KSerializer
    public final ResultTtsVoice deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        df1 df1VarMo4079b = decoder.mo4079b(serialDescriptor);
        cs4[] cs4VarArr = ResultTtsVoice.f21650k;
        ResultTtsVoice resultTtsVoice = null;
        boolean z = true;
        int i = 0;
        boolean zMo4094v = false;
        boolean zMo4094v2 = false;
        boolean zMo4094v3 = false;
        Boolean bool = null;
        String strMo4097x = null;
        String strMo4097x2 = null;
        String str = null;
        List list = null;
        List list2 = null;
        List list3 = null;
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
                    list = (List) df1VarMo4079b.mo4073G(serialDescriptor, 2, (KSerializer) cs4VarArr[2].getValue(), list);
                    i |= 4;
                    break;
                case 3:
                    bool = (Boolean) df1VarMo4079b.mo4070D(serialDescriptor, 3, lf0.f49579a, bool);
                    i |= 8;
                    break;
                case 4:
                    zMo4094v = df1VarMo4079b.mo4094v(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    zMo4094v2 = df1VarMo4079b.mo4094v(serialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    list2 = (List) df1VarMo4079b.mo4073G(serialDescriptor, 6, (KSerializer) cs4VarArr[6].getValue(), list2);
                    i |= 64;
                    break;
                case 7:
                    str = (String) df1VarMo4079b.mo4070D(serialDescriptor, 7, sk9.f60959a, str);
                    i |= 128;
                    break;
                case 8:
                    zMo4094v3 = df1VarMo4079b.mo4094v(serialDescriptor, 8);
                    i |= 256;
                    break;
                case 9:
                    list3 = (List) df1VarMo4079b.mo4073G(serialDescriptor, 9, (KSerializer) cs4VarArr[9].getValue(), list3);
                    i |= 512;
                    break;
                default:
                    uk9.m22771e(iMo10319A);
                    return resultTtsVoice;
            }
            resultTtsVoice = null;
        }
        df1VarMo4079b.mo4086j(serialDescriptor);
        return new ResultTtsVoice(i, bool, strMo4097x, strMo4097x2, str, list, list2, list3, zMo4094v, zMo4094v2, zMo4094v3);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, ResultTtsVoice resultTtsVoice) {
        encoder.getClass();
        resultTtsVoice.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        mk9 mk9VarMo15606b = encoder.mo15606b(serialDescriptor);
        cs4[] cs4VarArr = ResultTtsVoice.f21650k;
        String str = resultTtsVoice.f21651a;
        List list = resultTtsVoice.f21660j;
        boolean z = resultTtsVoice.f21659i;
        String str2 = resultTtsVoice.f21658h;
        List list2 = resultTtsVoice.f21657g;
        boolean z2 = resultTtsVoice.f21656f;
        boolean z3 = resultTtsVoice.f21655e;
        Boolean bool = resultTtsVoice.f21654d;
        mk9VarMo15606b.m16882z(serialDescriptor, 0, str);
        mk9VarMo15606b.m16882z(serialDescriptor, 1, resultTtsVoice.f21652b);
        mk9VarMo15606b.m16881y(serialDescriptor, 2, (KSerializer) cs4VarArr[2].getValue(), resultTtsVoice.f21653c);
        if (mk9VarMo15606b.m16872B(serialDescriptor) || bool != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 3, lf0.f49579a, bool);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || z3) {
            mk9VarMo15606b.m16873q(serialDescriptor, 4, z3);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || z2) {
            mk9VarMo15606b.m16873q(serialDescriptor, 5, z2);
        }
        boolean zM16872B = mk9VarMo15606b.m16872B(serialDescriptor);
        EmptyList emptyList = EmptyList.f47638a;
        if (zM16872B || !fa4.m11650l(list2, emptyList)) {
            mk9VarMo15606b.m16881y(serialDescriptor, 6, (KSerializer) cs4VarArr[6].getValue(), list2);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || str2 != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 7, sk9.f60959a, str2);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || z) {
            mk9VarMo15606b.m16873q(serialDescriptor, 8, z);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || !fa4.m11650l(list, emptyList)) {
            mk9VarMo15606b.m16881y(serialDescriptor, 9, (KSerializer) cs4VarArr[9].getValue(), list);
        }
        mk9VarMo15606b.m16871A(serialDescriptor);
    }

    @Override // p000.zk3
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return te1.f62178b;
    }
}
