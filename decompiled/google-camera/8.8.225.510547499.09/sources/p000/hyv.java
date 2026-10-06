package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public enum hyv {
    READY_TO_CAPTURE("Ready to capture", 11.0f, "green"),
    DISTANCE_1("distance 1", 18.5f, "#E8C86B"),
    DISTANCE_2("distance 2", 35.0f, "#FFA500"),
    DISTANCE_3("distance 3", 2.1474836E9f, "#FF8C00"),
    DISTANCE_OUTERMOST("distance outer", 2.1474836E9f, "transparent"),
    IDLE("idle", 2.1474836E9f, "transparent"),
    FACE_TOO_FAR("Face too far", 2.1474836E9f, "yellow"),
    FACE_TOO_CLOSE("Face too close", 2.1474836E9f, "yellow"),
    READY_TO_CAPTURE_MULTIPLE_FACES("Ready to capture(multi-faces)", 2.1474836E9f, "transparent");


    /* JADX INFO: renamed from: j */
    public final String f29992j;

    /* JADX INFO: renamed from: k */
    public final float f29993k;

    /* JADX INFO: renamed from: l */
    public final String f29994l;

    hyv(String str, float f, String str2) {
        this.f29992j = str;
        this.f29993k = f;
        this.f29994l = str2;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f29992j;
    }
}
