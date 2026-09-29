package p000;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class pf9 extends nf9 {

    /* JADX INFO: renamed from: a */
    public final long f56065a;

    /* JADX INFO: renamed from: b */
    public final long f56066b;

    /* JADX INFO: renamed from: c */
    public final List f56067c;

    public pf9(long j, long j2, List list) {
        this.f56065a = j;
        this.f56066b = j2;
        this.f56067c = Collections.unmodifiableList(list);
    }

    @Override // p000.nf9
    public final String toString() {
        StringBuilder sb = new StringBuilder("SCTE-35 SpliceInsertCommand { programSplicePts=");
        sb.append(this.f56065a);
        sb.append(", programSplicePlaybackPositionUs= ");
        return wq1.m24113i(this.f56066b, " }", sb);
    }
}
