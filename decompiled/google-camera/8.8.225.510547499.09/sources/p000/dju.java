package p000;

import android.database.ContentObserver;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dju extends ContentObserver {

    /* JADX INFO: renamed from: a */
    public boolean f11821a;

    /* JADX INFO: renamed from: b */
    public gtf f11822b;

    /* JADX INFO: renamed from: c */
    private boolean f11823c;

    public dju() {
        super(null);
        this.f11823c = false;
        this.f11821a = false;
    }

    /* JADX INFO: renamed from: a */
    public final void m6261a(boolean z) {
        this.f11823c = z;
        if (z) {
            return;
        }
        this.f11821a = false;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        if (this.f11823c) {
            this.f11821a = true;
        }
    }
}
