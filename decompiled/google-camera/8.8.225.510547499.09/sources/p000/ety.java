package p000;

import com.google.android.apps.camera.bottombar.BottomBarListener;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ety extends BottomBarListener {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ dbr f19893a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ euf f19894b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ ikt f19895c;

    public ety(euf eufVar, ikt iktVar, dbr dbrVar) {
        this.f19894b = eufVar;
        this.f19895c = iktVar;
        this.f19893a = dbrVar;
    }

    @Override // com.google.android.apps.camera.bottombar.BottomBarListener
    public final void onCameraSwitchButtonClicked() {
        if (this.f19895c.f31381h) {
            return;
        }
        this.f19893a.m5899h(new ekr(this, this.f19893a.mo5895d(), 18));
    }

    @Override // com.google.android.apps.camera.bottombar.BottomBarListener
    public final void onThumbnailButtonClicked() {
    }
}
