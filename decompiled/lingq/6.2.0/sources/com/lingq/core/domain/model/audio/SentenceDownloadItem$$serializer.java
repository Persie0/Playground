package com.lingq.core.domain.model.audio;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import p000.bg7;
import p000.df1;
import p000.dj2;
import p000.l84;
import p000.lf0;
import p000.mk9;
import p000.sk9;
import p000.te1;
import p000.uk9;
import p000.zb2;
import p000.zk3;

/* JADX INFO: loaded from: classes2.dex */
@zb2
public final /* synthetic */ class SentenceDownloadItem$$serializer implements zk3 {
    public static final SentenceDownloadItem$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        SentenceDownloadItem$$serializer sentenceDownloadItem$$serializer = new SentenceDownloadItem$$serializer();
        INSTANCE = sentenceDownloadItem$$serializer;
        bg7 bg7Var = new bg7("com.lingq.core.domain.model.audio.SentenceDownloadItem", sentenceDownloadItem$$serializer, 8);
        bg7Var.m3702k("language", false);
        bg7Var.m3702k("lessonId", false);
        bg7Var.m3702k("audioUrl", false);
        bg7Var.m3702k("sentenceIndex", false);
        bg7Var.m3702k("currentIndex", false);
        bg7Var.m3702k("lastIndex", false);
        bg7Var.m3702k("shouldAutoPlay", false);
        bg7Var.m3702k("audioDuration", true);
        descriptor = bg7Var;
    }

    private SentenceDownloadItem$$serializer() {
    }

    @Override // p000.zk3
    public final KSerializer[] childSerializers() {
        sk9 sk9Var = sk9.f60959a;
        l84 l84Var = l84.f49294a;
        return new KSerializer[]{sk9Var, l84Var, sk9Var, l84Var, l84Var, l84Var, lf0.f49579a, dj2.f35711a};
    }

    @Override // kotlinx.serialization.KSerializer
    public final SentenceDownloadItem deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        df1 df1VarMo4079b = decoder.mo4079b(serialDescriptor);
        int i = 0;
        int iMo4091q = 0;
        int iMo4091q2 = 0;
        int iMo4091q3 = 0;
        int iMo4091q4 = 0;
        boolean zMo4094v = false;
        String strMo4097x = null;
        String strMo4097x2 = null;
        double dMo4072F = 0.0d;
        boolean z = true;
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
                    iMo4091q = df1VarMo4079b.mo4091q(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    strMo4097x2 = df1VarMo4079b.mo4097x(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    iMo4091q2 = df1VarMo4079b.mo4091q(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    iMo4091q3 = df1VarMo4079b.mo4091q(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    iMo4091q4 = df1VarMo4079b.mo4091q(serialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    zMo4094v = df1VarMo4079b.mo4094v(serialDescriptor, 6);
                    i |= 64;
                    break;
                case 7:
                    dMo4072F = df1VarMo4079b.mo4072F(serialDescriptor, 7);
                    i |= 128;
                    break;
                default:
                    uk9.m22771e(iMo10319A);
                    return null;
            }
        }
        df1VarMo4079b.mo4086j(serialDescriptor);
        return new SentenceDownloadItem(i, strMo4097x, iMo4091q, strMo4097x2, iMo4091q2, iMo4091q3, iMo4091q4, zMo4094v, dMo4072F);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, SentenceDownloadItem sentenceDownloadItem) {
        encoder.getClass();
        sentenceDownloadItem.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        mk9 mk9VarMo15606b = encoder.mo15606b(serialDescriptor);
        String str = sentenceDownloadItem.f18845a;
        double d = sentenceDownloadItem.f18852h;
        mk9VarMo15606b.m16882z(serialDescriptor, 0, str);
        mk9VarMo15606b.m16878v(1, sentenceDownloadItem.f18846b, serialDescriptor);
        mk9VarMo15606b.m16882z(serialDescriptor, 2, sentenceDownloadItem.f18847c);
        mk9VarMo15606b.m16878v(3, sentenceDownloadItem.f18848d, serialDescriptor);
        mk9VarMo15606b.m16878v(4, sentenceDownloadItem.f18849e, serialDescriptor);
        mk9VarMo15606b.m16878v(5, sentenceDownloadItem.f18850f, serialDescriptor);
        mk9VarMo15606b.m16873q(serialDescriptor, 6, sentenceDownloadItem.f18851g);
        if (mk9VarMo15606b.m16872B(serialDescriptor) || Double.compare(d, 0.0d) != 0) {
            mk9VarMo15606b.m16874r(serialDescriptor, 7, d);
        }
        mk9VarMo15606b.m16871A(serialDescriptor);
    }

    @Override // p000.zk3
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return te1.f62178b;
    }
}
