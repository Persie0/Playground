package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public enum jxm {
    AAC("audio/mp4a-latm"),
    AMR_NB("audio/amr-wb"),
    AMR_WB("audio/3gpp"),
    VORBIS("audio/vorbis");


    /* JADX INFO: renamed from: e */
    public final String f35048e;

    jxm(String str) {
        this.f35048e = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f35048e;
    }
}
