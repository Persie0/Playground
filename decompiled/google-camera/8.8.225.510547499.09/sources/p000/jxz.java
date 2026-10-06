package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public enum jxz implements jxy {
    H263("video/3gpp"),
    H264("video/avc"),
    MPEG_4_SP("video/mp4v-es"),
    HEVC("video/hevc");


    /* JADX INFO: renamed from: e */
    public final String f35117e;

    jxz(String str) {
        this.f35117e = str;
    }

    @Override // p000.jxy
    /* JADX INFO: renamed from: a */
    public final String mo13672a() {
        return this.f35117e;
    }
}
