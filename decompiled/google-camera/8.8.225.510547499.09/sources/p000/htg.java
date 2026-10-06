package p000;

import com.google.android.apps.camera.bottombar.RoundedThumbnailView;
import java.util.Iterator;
import p021j$.time.Instant;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class htg implements RoundedThumbnailView.Callback {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ hth f29499a;

    public htg(hth hthVar) {
        this.f29499a = hthVar;
    }

    @Override // com.google.android.apps.camera.bottombar.RoundedThumbnailView.Callback
    public final void onClickAnimationEnd() {
        hth hthVar = this.f29499a;
        nnf nnfVar = nnf.INSTANCE;
        hthVar.f29502c = Long.valueOf(Instant.now().toEpochMilli());
        this.f29499a.mo10737e(true);
    }

    @Override // com.google.android.apps.camera.bottombar.RoundedThumbnailView.Callback
    public final boolean onLongPress() {
        Iterator it = this.f29499a.f29501b.iterator();
        boolean zMo3804c = false;
        while (it.hasNext()) {
            zMo3804c |= ((hte) it.next()).mo3804c();
        }
        return zMo3804c;
    }
}
