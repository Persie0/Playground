package p000;

import android.content.ContentProvider;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class djo implements ohi {

    /* JADX INFO: renamed from: a */
    private final djm f11792a;

    public djo(djm djmVar) {
        this.f11792a = djmVar;
    }

    @Override // p000.oju
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ContentProvider get() {
        return (ContentProvider) this.f11792a.f11787a;
    }
}
