package com.lingq.core.domain.model.lesson;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Map;
import kotlin.collections.AbstractC3194a;
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
public final /* synthetic */ class LessonTextToken$$serializer implements zk3 {
    public static final LessonTextToken$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        LessonTextToken$$serializer lessonTextToken$$serializer = new LessonTextToken$$serializer();
        INSTANCE = lessonTextToken$$serializer;
        bg7 bg7Var = new bg7("com.lingq.core.domain.model.lesson.LessonTextToken", lessonTextToken$$serializer, 14);
        bg7Var.m3702k("punct", true);
        bg7Var.m3702k("whitespace", true);
        bg7Var.m3702k("isNumber", true);
        bg7Var.m3702k("opentag", true);
        bg7Var.m3702k("closetag", true);
        bg7Var.m3702k("transliteration", true);
        bg7Var.m3702k("index", true);
        bg7Var.m3702k("indexInSentence", true);
        bg7Var.m3702k("isIgnored", true);
        bg7Var.m3702k("text", true);
        bg7Var.m3702k("isUnknown", true);
        bg7Var.m3702k("isKnown", true);
        bg7Var.m3702k("wordId", true);
        bg7Var.m3702k("translation", true);
        descriptor = bg7Var;
    }

    private LessonTextToken$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.zk3
    public final KSerializer[] childSerializers() {
        cs4[] cs4VarArr = LessonTextToken.f19276o;
        sk9 sk9Var = sk9.f60959a;
        lf0 lf0Var = lf0.f49579a;
        l84 l84Var = l84.f49294a;
        return new KSerializer[]{thb.m22059r(sk9Var), thb.m22059r(sk9Var), lf0Var, thb.m22059r(sk9Var), thb.m22059r(sk9Var), thb.m22059r(LessonTransliteration$$serializer.INSTANCE), l84Var, l84Var, lf0Var, thb.m22059r(sk9Var), lf0Var, lf0Var, l84Var, cs4VarArr[13].getValue()};
    }

    @Override // kotlinx.serialization.KSerializer
    public final LessonTextToken deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        df1 df1VarMo4079b = decoder.mo4079b(serialDescriptor);
        cs4[] cs4VarArr = LessonTextToken.f19276o;
        Map map = null;
        boolean z = true;
        String str = null;
        int i = 0;
        String str2 = null;
        String str3 = null;
        boolean zMo4094v = false;
        String str4 = null;
        String str5 = null;
        LessonTransliteration lessonTransliteration = null;
        int iMo4091q = 0;
        int iMo4091q2 = 0;
        boolean zMo4094v2 = false;
        boolean zMo4094v3 = false;
        boolean zMo4094v4 = false;
        int iMo4091q3 = 0;
        while (z) {
            int iMo10319A = df1VarMo4079b.mo10319A(serialDescriptor);
            switch (iMo10319A) {
                case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                    z = false;
                    break;
                case 0:
                    str2 = (String) df1VarMo4079b.mo4070D(serialDescriptor, 0, sk9.f60959a, str2);
                    i |= 1;
                    break;
                case 1:
                    str3 = (String) df1VarMo4079b.mo4070D(serialDescriptor, 1, sk9.f60959a, str3);
                    i |= 2;
                    break;
                case 2:
                    zMo4094v = df1VarMo4079b.mo4094v(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    str4 = (String) df1VarMo4079b.mo4070D(serialDescriptor, 3, sk9.f60959a, str4);
                    i |= 8;
                    break;
                case 4:
                    str5 = (String) df1VarMo4079b.mo4070D(serialDescriptor, 4, sk9.f60959a, str5);
                    i |= 16;
                    break;
                case 5:
                    lessonTransliteration = (LessonTransliteration) df1VarMo4079b.mo4070D(serialDescriptor, 5, LessonTransliteration$$serializer.INSTANCE, lessonTransliteration);
                    i |= 32;
                    break;
                case 6:
                    iMo4091q = df1VarMo4079b.mo4091q(serialDescriptor, 6);
                    i |= 64;
                    break;
                case 7:
                    iMo4091q2 = df1VarMo4079b.mo4091q(serialDescriptor, 7);
                    i |= 128;
                    break;
                case 8:
                    zMo4094v2 = df1VarMo4079b.mo4094v(serialDescriptor, 8);
                    i |= 256;
                    break;
                case 9:
                    str = (String) df1VarMo4079b.mo4070D(serialDescriptor, 9, sk9.f60959a, str);
                    i |= 512;
                    break;
                case 10:
                    zMo4094v3 = df1VarMo4079b.mo4094v(serialDescriptor, 10);
                    i |= 1024;
                    break;
                case 11:
                    zMo4094v4 = df1VarMo4079b.mo4094v(serialDescriptor, 11);
                    i |= 2048;
                    break;
                case 12:
                    iMo4091q3 = df1VarMo4079b.mo4091q(serialDescriptor, 12);
                    i |= 4096;
                    break;
                case 13:
                    map = (Map) df1VarMo4079b.mo4073G(serialDescriptor, 13, (KSerializer) cs4VarArr[13].getValue(), map);
                    i |= 8192;
                    break;
                default:
                    uk9.m22771e(iMo10319A);
                    return null;
            }
        }
        df1VarMo4079b.mo4086j(serialDescriptor);
        return new LessonTextToken(i, str2, str3, zMo4094v, str4, str5, lessonTransliteration, iMo4091q, iMo4091q2, zMo4094v2, str, zMo4094v3, zMo4094v4, iMo4091q3, map);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, LessonTextToken lessonTextToken) {
        Map map;
        encoder.getClass();
        lessonTextToken.getClass();
        Map map2 = lessonTextToken.f19290n;
        int i = lessonTextToken.f19289m;
        boolean z = lessonTextToken.f19288l;
        boolean z2 = lessonTextToken.f19287k;
        String str = lessonTextToken.f19286j;
        boolean z3 = lessonTextToken.f19285i;
        int i2 = lessonTextToken.f19284h;
        int i3 = lessonTextToken.f19283g;
        LessonTransliteration lessonTransliteration = lessonTextToken.f19282f;
        String str2 = lessonTextToken.f19281e;
        String str3 = lessonTextToken.f19280d;
        boolean z4 = lessonTextToken.f19279c;
        String str4 = lessonTextToken.f19278b;
        String str5 = lessonTextToken.f19277a;
        SerialDescriptor serialDescriptor = descriptor;
        mk9 mk9VarMo15606b = encoder.mo15606b(serialDescriptor);
        cs4[] cs4VarArr = LessonTextToken.f19276o;
        if (mk9VarMo15606b.m16872B(serialDescriptor) || str5 != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 0, sk9.f60959a, str5);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || str4 != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 1, sk9.f60959a, str4);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || z4) {
            mk9VarMo15606b.m16873q(serialDescriptor, 2, z4);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || str3 != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 3, sk9.f60959a, str3);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || str2 != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 4, sk9.f60959a, str2);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || lessonTransliteration != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 5, LessonTransliteration$$serializer.INSTANCE, lessonTransliteration);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || i3 != 0) {
            mk9VarMo15606b.m16878v(6, i3, serialDescriptor);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || i2 != 0) {
            mk9VarMo15606b.m16878v(7, i2, serialDescriptor);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || z3) {
            mk9VarMo15606b.m16873q(serialDescriptor, 8, z3);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || str != null) {
            mk9VarMo15606b.m16880x(serialDescriptor, 9, sk9.f60959a, str);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || z2) {
            mk9VarMo15606b.m16873q(serialDescriptor, 10, z2);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || z) {
            mk9VarMo15606b.m16873q(serialDescriptor, 11, z);
        }
        if (mk9VarMo15606b.m16872B(serialDescriptor) || i != 0) {
            mk9VarMo15606b.m16878v(12, i, serialDescriptor);
        }
        if (!mk9VarMo15606b.m16872B(serialDescriptor)) {
            if (!fa4.m11650l(map, AbstractC3194a.m15360M())) {
            }
            map = map2;
            mk9VarMo15606b.m16871A(serialDescriptor);
        }
        map = map2;
        map = map2;
        mk9VarMo15606b.m16881y(serialDescriptor, 13, (KSerializer) cs4VarArr[13].getValue(), map);
        map = map2;
        mk9VarMo15606b.m16871A(serialDescriptor);
    }

    @Override // p000.zk3
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return te1.f62178b;
    }
}
