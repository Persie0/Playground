package p000;

import android.media.MediaCodecInfo;
import com.google.android.libraries.lens.lenslite.dynamicloading.QSK.hIAHJKEnGsNbz;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class jxu implements jxt {

    /* JADX INFO: renamed from: a */
    private static final mxk f35091a = mxk.m17138J(kbc.m13903h(720, 480), kbc.m13903h(704, 480), kbc.m13903h(640, 480));

    /* JADX INFO: renamed from: b */
    private static final mxk f35092b = mxk.m17137I(jxp.RES_720P.m13661b(), jxp.RES_720P_3X4.m13661b());

    /* JADX INFO: renamed from: c */
    private static final mxk f35093c = mxk.m17137I(jxp.RES_1080P.m13661b(), jxp.RES_1080P_3X4.m13661b());

    /* JADX INFO: renamed from: d */
    private static final mxk f35094d = mxk.m17137I(jxp.RES_2160P.m13661b(), jxp.RES_2160P_3X4.m13661b());

    /* JADX INFO: renamed from: e */
    private final int[] f35095e = {8000, 11025, 12000, 16000, 22050, 24000, 44100, 48000, 192000};

    /* JADX INFO: renamed from: f */
    private final khb f35096f;

    public jxu(khb khbVar, byte[] bArr) {
        this.f35096f = khbVar;
    }

    @Override // p000.jxt
    /* JADX INFO: renamed from: a */
    public final jxs mo13664a(jxn jxnVar, jyg jygVar) {
        int i = jygVar.f35163d;
        return new jxs(jxk.m13652a(jygVar.f35162c), jygVar.f35160a, i, i * jxnVar.m13655a(), jygVar.f35161b);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Map] */
    @Override // p000.jxt
    /* JADX INFO: renamed from: b */
    public final jxs mo13665b(jxn jxnVar, jyg jygVar) {
        int iM13655a;
        int i;
        int i2 = jygVar.f35163d;
        jxk jxkVarM13652a = jxk.m13652a(jygVar.f35162c);
        jxm jxmVar = jxkVarM13652a.f35035h;
        MediaCodecInfo mediaCodecInfo = (MediaCodecInfo) this.f35096f.f36008a.get(jxmVar.f35048e);
        lku.m15662p(mediaCodecInfo);
        MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(jxmVar.f35048e);
        lku.m15662p(capabilitiesForType);
        MediaCodecInfo.AudioCapabilities audioCapabilities = capabilitiesForType.getAudioCapabilities();
        lku.m15662p(audioCapabilities);
        int[] iArr = this.f35095e;
        int i3 = 0;
        for (int i4 = 0; i4 < 9; i4++) {
            int i5 = iArr[i4];
            if (audioCapabilities.isSampleRateSupported(i5)) {
                if (i5 >= i2) {
                    i3 = i5;
                    break;
                }
                i3 = i5;
            }
        }
        int iM13655a2 = jxnVar.m13655a() * i3;
        if (iM13655a2 > 192000) {
            iM13655a = 192000 / jxnVar.m13655a();
            i = 192000;
        } else {
            iM13655a = i3;
            i = iM13655a2;
        }
        lku.m15657k(iM13655a > 0);
        lku.m15657k(i > 0);
        return new jxs(jxkVarM13652a, jygVar.f35160a, iM13655a, i, jygVar.f35161b);
    }

    @Override // p000.jxt
    /* JADX INFO: renamed from: c */
    public final jxv mo13666c(jyg jygVar, jxn jxnVar, jxp jxpVar) {
        return mo13667d(jygVar, jxnVar, jxpVar, jxnVar == jxn.FPS_AUTO ? 2.0f : 1.0f);
    }

    @Override // p000.jxt
    /* JADX INFO: renamed from: d */
    public final jxv mo13667d(jyg jygVar, jxn jxnVar, jxp jxpVar, float f) {
        jxo jxoVar;
        lku.m15669w(mo13668e(jygVar, jxnVar, jxpVar));
        int i = jygVar.f35171l;
        int i2 = jxnVar.f35058i;
        int i3 = jygVar.f35166g;
        if (jxnVar.m13657e()) {
            if (i2 < i) {
                i3 = (int) (i3 * (i2 / i));
            }
        } else {
            if (!jxnVar.m13658f()) {
                throw new IllegalArgumentException("unsupported capture frame rate =" + jxnVar.f35058i + " and encoding frame rate=" + jxnVar.f35059j);
            }
            if (i2 == 30 && i == 60) {
                double d = i3;
                Double.isNaN(d);
                i3 = (int) (d / 1.5d);
            }
        }
        lku.m15669w(jxo.m13659a(jygVar));
        int i4 = jygVar.f35164e;
        switch (i4) {
            case 1:
                jxoVar = jxo.THREE_GPP;
                break;
            case 2:
                jxoVar = jxo.MPEG_4;
                break;
            default:
                throw new IllegalArgumentException(hIAHJKEnGsNbz.zVzjiHHcOT + i4);
        }
        return new jxv(jxoVar, jxpVar, i3, jxnVar, jygVar.f35167h, jygVar.f35168i, jygVar.f35169j, f);
    }

    @Override // p000.jxt
    /* JADX INFO: renamed from: e */
    public final boolean mo13668e(jyg jygVar, jxn jxnVar, jxp jxpVar) {
        boolean zContains;
        if (jxnVar.f35060k > jygVar.f35171l) {
            return false;
        }
        int i = jygVar.f35165f;
        if (i == 4) {
            zContains = f35091a.contains(jxpVar.m13661b());
        } else if (i == 5 || i == 2003) {
            zContains = f35092b.contains(jxpVar.m13661b());
        } else if (i == 6 || i == 2004) {
            zContains = f35093c.contains(jxpVar.m13661b());
        } else {
            zContains = (i == 8 || i == 2005) ? f35094d.contains(jxpVar.m13661b()) : new kbc(jygVar.f35172m, jygVar.f35170k).equals(jxpVar.m13661b());
        }
        return zContains && jxo.m13659a(jygVar);
    }
}
