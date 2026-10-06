package p000;

import android.database.ContentObserver;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class loy extends ContentObserver {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ loz f38868a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public loy(loz lozVar) {
        super(null);
        this.f38868a = lozVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        this.f38868a.m15795b();
    }
}
