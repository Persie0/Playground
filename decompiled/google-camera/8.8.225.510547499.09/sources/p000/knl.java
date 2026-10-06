package p000;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class knl implements knh {

    /* JADX INFO: renamed from: a */
    public final String f36614a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ Object f36615b;

    /* JADX INFO: renamed from: c */
    private final List f36616c = new ArrayList(100);

    /* JADX INFO: renamed from: d */
    private boolean f36617d = true;

    /* JADX INFO: renamed from: e */
    private final /* synthetic */ int f36618e;

    public knl(kne kneVar, String str, int i) {
        this.f36618e = i;
        this.f36615b = kneVar;
        this.f36614a = str;
    }

    @Override // p000.knh
    /* JADX INFO: renamed from: a */
    public final String mo6998a() {
        switch (this.f36618e) {
            case 0:
                break;
        }
        return this.f36614a;
    }

    public knl(knn knnVar, String str, int i) {
        this.f36618e = i;
        this.f36615b = knnVar;
        this.f36614a = str;
    }

    @Override // p000.knh, p000.kba, java.lang.AutoCloseable
    public final synchronized void close() {
        switch (this.f36618e) {
            case 0:
                this.f36617d = false;
                ((knn) this.f36615b).m14601b(this);
                return;
            default:
                ((kne) this.f36615b).f36589a.mo13940b("Closing session : ".concat(this.f36614a));
                this.f36617d = false;
                ((kne) this.f36615b).m14592b(this);
                return;
        }
    }

    @Override // p000.knh
    /* JADX INFO: renamed from: b */
    public final synchronized void mo6999b(long j, long j2, kng kngVar) {
        int i;
        int i2;
        switch (this.f36618e) {
            case 0:
                if (!this.f36617d) {
                    int i3 = mws.f41739d;
                    kngVar.mo6759a(mzr.f41857a);
                    return;
                }
                synchronized (this.f36615b) {
                    this.f36616c.clear();
                    int i4 = ((knn) this.f36615b).f36623c;
                    while (true) {
                        if (i4 < 6000) {
                            knj knjVar = (knj) ((knn) this.f36615b).f36621a.get(i4);
                            long j3 = knjVar.f36607e;
                            if (j3 > j2) {
                                i2 = 0;
                            } else {
                                if (j3 >= j) {
                                    knj knjVar2 = (knj) ((knn) this.f36615b).f36622b.m13931a();
                                    knjVar2.m14598a(knjVar);
                                    this.f36616c.add(knjVar2);
                                }
                                i4++;
                            }
                        } else {
                            i2 = 0;
                        }
                    }
                    while (true) {
                        Object obj = this.f36615b;
                        if (i2 < ((knn) obj).f36623c) {
                            knj knjVar3 = (knj) ((knn) obj).f36621a.get(i2);
                            long j4 = knjVar3.f36607e;
                            if (j4 <= j2) {
                                if (j4 >= j) {
                                    knj knjVar4 = (knj) ((knn) this.f36615b).f36622b.m13931a();
                                    knjVar4.m14598a(knjVar3);
                                    this.f36616c.add(knjVar4);
                                }
                                i2++;
                            }
                        }
                    }
                    break;
                }
                kngVar.mo6759a(this.f36616c);
                synchronized (this.f36615b) {
                    for (i = 0; i < this.f36616c.size(); i++) {
                        ((knn) this.f36615b).f36622b.m13932b((knj) this.f36616c.get(i));
                    }
                    this.f36616c.clear();
                    break;
                }
                return;
            default:
                if (!this.f36617d) {
                    int i5 = mws.f41739d;
                    kngVar.mo6759a(mzr.f41857a);
                    return;
                }
                synchronized (this.f36615b) {
                    ktz ktzVar = ((kne) this.f36615b).f36590b;
                    if (ktzVar != null) {
                        ((knf) ktzVar.f37198a).m14596a(j, j2, this.f36616c);
                    }
                    break;
                }
                kngVar.mo6759a(this.f36616c);
                synchronized (this.f36615b) {
                    ktz ktzVar2 = ((kne) this.f36615b).f36590b;
                    if (ktzVar2 != null) {
                        ((knf) ktzVar2.f37198a).m14597b(this.f36616c);
                    }
                    break;
                }
                return;
        }
        throw th;
    }
}
