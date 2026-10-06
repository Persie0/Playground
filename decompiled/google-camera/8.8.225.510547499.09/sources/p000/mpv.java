package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public interface mpv {
    void flush();

    mqb getSpeechEnhancerModelInfo();

    void initialize();

    void provideRawAudio(byte[] bArr);

    void provideVideoFrame(mqi mqiVar);

    void setAllSpeechMixingRatio(double d);

    void setRawAudioMixingRatio(double d);
}
