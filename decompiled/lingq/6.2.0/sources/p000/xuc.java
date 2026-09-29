package p000;

import com.google.android.gms.measurement.internal.C1043b;

/* JADX INFO: loaded from: classes2.dex */
public final class xuc implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f68831a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ npc f68832b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ long f68833c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ boolean f68834d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C1043b f68835e;

    public /* synthetic */ xuc(C1043b c1043b, npc npcVar, long j, boolean z, int i) {
        this.f68831a = i;
        this.f68832b = npcVar;
        this.f68833c = j;
        this.f68834d = z;
        this.f68835e = c1043b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f68831a;
        long j = this.f68833c;
        boolean z = this.f68834d;
        npc npcVar = this.f68832b;
        C1043b c1043b = this.f68835e;
        switch (i) {
            case 0:
                c1043b.m5873d0(npcVar);
                c1043b.m5863T(npcVar, j, z);
                break;
            default:
                c1043b.m5873d0(npcVar);
                c1043b.m5863T(npcVar, j, z);
                break;
        }
    }
}
