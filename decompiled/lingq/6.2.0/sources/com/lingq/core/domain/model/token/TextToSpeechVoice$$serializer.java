package com.lingq.core.domain.model.token;

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

/* JADX INFO: loaded from: classes2.dex */
@zb2
public final /* synthetic */ class TextToSpeechVoice$$serializer implements zk3 {
    public static final TextToSpeechVoice$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        TextToSpeechVoice$$serializer textToSpeechVoice$$serializer = new TextToSpeechVoice$$serializer();
        INSTANCE = textToSpeechVoice$$serializer;
        bg7 bg7Var = new bg7("com.lingq.core.domain.model.token.TextToSpeechVoice", textToSpeechVoice$$serializer, 10);
        bg7Var.m3702k("name", false);
        bg7Var.m3702k("title", false);
        bg7Var.m3702k("voicesByApp", false);
        bg7Var.m3702k("alternative", true);
        bg7Var.m3702k("priority", false);
        bg7Var.m3702k("isPremium", true);
        bg7Var.m3702k("freeTrial", true);
        bg7Var.m3702k("isSelectable", true);
        bg7Var.m3702k("tags", true);
        bg7Var.m3702k("accentCode", true);
        descriptor = bg7Var;
    }

    private TextToSpeechVoice$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.zk3
    public final KSerializer[] childSerializers() {
        cs4[] cs4VarArr = TextToSpeechVoice.f19569k;
        sk9 sk9Var = sk9.f60959a;
        lf0 lf0Var = lf0.f49579a;
        return new KSerializer[]{sk9Var, sk9Var, cs4VarArr[2].getValue(), thb.m22059r(lf0Var), cs4VarArr[4].getValue(), lf0Var, lf0Var, lf0Var, cs4VarArr[8].getValue(), thb.m22059r(sk9Var)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final TextToSpeechVoice deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        df1 df1VarMo4079b = decoder.mo4079b(serialDescriptor);
        cs4[] cs4VarArr = TextToSpeechVoice.f19569k;
        TextToSpeechVoice textToSpeechVoice = null;
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
                    list2 = (List) df1VarMo4079b.mo4073G(serialDescriptor, 4, (KSerializer) cs4VarArr[4].getValue(), list2);
                    i |= 16;
                    break;
                case 5:
                    zMo4094v = df1VarMo4079b.mo4094v(serialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    zMo4094v2 = df1VarMo4079b.mo4094v(serialDescriptor, 6);
                    i |= 64;
                    break;
                case 7:
                    zMo4094v3 = df1VarMo4079b.mo4094v(serialDescriptor, 7);
                    i |= 128;
                    break;
                case 8:
                    list3 = (List) df1VarMo4079b.mo4073G(serialDescriptor, 8, (KSerializer) cs4VarArr[8].getValue(), list3);
                    i |= 256;
                    break;
                case 9:
                    str = (String) df1VarMo4079b.mo4070D(serialDescriptor, 9, sk9.f60959a, str);
                    i |= 512;
                    break;
                default:
                    uk9.m22771e(iMo10319A);
                    return textToSpeechVoice;
            }
            textToSpeechVoice = null;
        }
        df1VarMo4079b.mo4086j(serialDescriptor);
        return new TextToSpeechVoice(i, bool, strMo4097x, strMo4097x2, str, list, list2, list3, zMo4094v, zMo4094v2, zMo4094v3);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, TextToSpeechVoice textToSpeechVoice) {
        encoder.getClass();
        textToSpeechVoice.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        mk9 mk9VarMo15606b = encoder.mo15606b(serialDescriptor);
        cs4[] cs4VarArr = TextToSpeechVoice.f19569k;
        String str = textToSpeechVoice.f19570a;
        String str2 = textToSpeechVoice.f19579j;
        List list = textToSpeechVoice.f19578i;
        boolean z = textToSpeechVoice.f19577h;
        boolean z2 = textToSpeechVoice.f19576g;
        boolean z3 = textToSpeechVoice.f19575f;
        Boolean bool = textToSpeechVoice.f19573d;
        mk9VarMo15606b.m16882z(serialDescriptor, 0, str);
        mk9VarMo15606b.m16882z(serialDescriptor, 1, textToSpeechVoice.f19571b);
        mk9VarMo15606b.m16881y(serialDescriptor, 2, (KSerializer) cs4VarArr[2].getValue(), textToSpeechVoice.f19572c);
        if (mk9VarMo15606b.m16872B(serialDescriptor) || bool != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 3, lf0.f49579a, bool);
        }
        mk9VarMo15606b.m16881y(serialDescriptor, 4, (KSerializer) cs4VarArr[4].getValue(), textToSpeechVoice.f19574e);
        if (mk9VarMo15606b.m16872B(serialDescriptor) || z3) {
            mk9VarMo15606b.m16873q(serialDescriptor, 5, z3);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || z2) {
            mk9VarMo15606b.m16873q(serialDescriptor, 6, z2);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || z) {
            mk9VarMo15606b.m16873q(serialDescriptor, 7, z);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || !fa4.m11650l(list, EmptyList.f47638a)) {
            mk9VarMo15606b.m16881y(serialDescriptor, 8, (KSerializer) cs4VarArr[8].getValue(), list);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || str2 != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 9, sk9.f60959a, str2);
        }
        mk9VarMo15606b.m16871A(serialDescriptor);
    }

    @Override // p000.zk3
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return te1.f62178b;
    }
}
