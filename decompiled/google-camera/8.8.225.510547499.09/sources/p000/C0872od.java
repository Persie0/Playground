package p000;

import android.support.wearable.complications.rendering.ComplicationDrawable;

/* JADX INFO: renamed from: od */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class C0872od implements InterfaceC0875og {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ ComplicationDrawable f45572a;

    public C0872od(ComplicationDrawable complicationDrawable) {
        this.f45572a = complicationDrawable;
    }

    @Override // p000.InterfaceC0875og
    /* JADX INFO: renamed from: a */
    public final void mo18401a() {
        this.f45572a.invalidateSelf();
    }
}
