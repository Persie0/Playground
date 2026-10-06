package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public enum jzf {
    VIDEO_BUFFER_DELAY(true),
    AUDIO_BUFFER_DELAY(false),
    VIDEO_TRACK_FAIL_TO_START(true),
    AUDIO_TRACK_FAIL_TO_START(false),
    f35270e(false),
    AUDIO_RECORD_ERROR(false),
    MUXER_STOP_ERROR(true),
    MEDIA_CODEC_ERROR_AUDIO(true),
    MEDIA_CODEC_ERROR_VIDEO(true),
    FILE_LOST(false),
    OTHER(true);


    /* JADX INFO: renamed from: l */
    public final boolean f35278l;

    jzf(boolean z) {
        this.f35278l = z;
    }
}
