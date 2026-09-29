package com.lingq.feature.onboarding.p014v2.domain;

import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import p000.bg7;
import p000.cs4;
import p000.df1;
import p000.l84;
import p000.mk9;
import p000.sk9;
import p000.te1;
import p000.uk9;
import p000.zb2;
import p000.zk3;

/* JADX INFO: loaded from: classes3.dex */
@zb2
public final /* synthetic */ class MiniLessonWord$$serializer implements zk3 {
    public static final int $stable;
    public static final MiniLessonWord$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        MiniLessonWord$$serializer miniLessonWord$$serializer = new MiniLessonWord$$serializer();
        INSTANCE = miniLessonWord$$serializer;
        $stable = 8;
        bg7 bg7Var = new bg7("com.lingq.feature.onboarding.v2.domain.MiniLessonWord", miniLessonWord$$serializer, 3);
        bg7Var.m3702k("word", false);
        bg7Var.m3702k("position", false);
        bg7Var.m3702k("dictionaryTranslations", false);
        descriptor = bg7Var;
    }

    private MiniLessonWord$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.zk3
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{sk9.f60959a, l84.f49294a, MiniLessonWord.f27422d[2].getValue()};
    }

    @Override // kotlinx.serialization.KSerializer
    public final MiniLessonWord deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        df1 df1VarMo4079b = decoder.mo4079b(serialDescriptor);
        cs4[] cs4VarArr = MiniLessonWord.f27422d;
        boolean z = true;
        int i = 0;
        int iMo4091q = 0;
        String strMo4097x = null;
        Map map = null;
        while (z) {
            int iMo10319A = df1VarMo4079b.mo10319A(serialDescriptor);
            if (iMo10319A == -1) {
                z = false;
            } else if (iMo10319A == 0) {
                strMo4097x = df1VarMo4079b.mo4097x(serialDescriptor, 0);
                i |= 1;
            } else if (iMo10319A == 1) {
                iMo4091q = df1VarMo4079b.mo4091q(serialDescriptor, 1);
                i |= 2;
            } else {
                if (iMo10319A != 2) {
                    uk9.m22771e(iMo10319A);
                    return null;
                }
                map = (Map) df1VarMo4079b.mo4073G(serialDescriptor, 2, (KSerializer) cs4VarArr[2].getValue(), map);
                i |= 4;
            }
        }
        df1VarMo4079b.mo4086j(serialDescriptor);
        return new MiniLessonWord(i, strMo4097x, iMo4091q, map);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, MiniLessonWord miniLessonWord) {
        encoder.getClass();
        miniLessonWord.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        mk9 mk9VarMo15606b = encoder.mo15606b(serialDescriptor);
        cs4[] cs4VarArr = MiniLessonWord.f27422d;
        mk9VarMo15606b.m16882z(serialDescriptor, 0, miniLessonWord.f27423a);
        mk9VarMo15606b.m16878v(1, miniLessonWord.f27424b, serialDescriptor);
        mk9VarMo15606b.m16881y(serialDescriptor, 2, (KSerializer) cs4VarArr[2].getValue(), miniLessonWord.f27425c);
        mk9VarMo15606b.m16871A(serialDescriptor);
    }

    @Override // p000.zk3
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return te1.f62178b;
    }
}
