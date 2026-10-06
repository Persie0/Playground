package p000;

import android.media.MediaFormat;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class jyu implements Comparable {

    /* JADX INFO: renamed from: f */
    private final int f35205f;

    /* JADX INFO: renamed from: a */
    public boolean f35200a = false;

    /* JADX INFO: renamed from: b */
    public volatile boolean f35201b = false;

    /* JADX INFO: renamed from: e */
    private int f35204e = -1;

    /* JADX INFO: renamed from: c */
    public boolean f35202c = true;

    /* JADX INFO: renamed from: d */
    public MediaFormat f35203d = null;

    public jyu(int i) {
        this.f35205f = i;
    }

    /* JADX INFO: renamed from: a */
    public final int m13736a() {
        if (this.f35200a) {
            return this.f35204e;
        }
        throw new IllegalStateException("Track is not yet added");
    }

    /* JADX INFO: renamed from: b */
    public final void m13737b() {
        this.f35202c = false;
    }

    /* JADX INFO: renamed from: c */
    public final void m13738c(int i) {
        if (this.f35205f == 3) {
            throw new IllegalStateException("This track is forbidden.");
        }
        this.f35204e = i;
        this.f35200a = true;
        this.f35201b = false;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return m13736a() - ((jyu) obj).m13736a();
    }

    /* JADX INFO: renamed from: d */
    public final boolean m13739d() {
        return this.f35205f == 3;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m13740e() {
        switch (this.f35205f - 1) {
            case 0:
                return this.f35200a;
            case 1:
                return this.f35201b || this.f35200a;
            default:
                return true;
        }
    }
}
