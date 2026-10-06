package p000;

import android.media.MediaPlayer;
import com.google.android.apps.camera.p014ui.compositevideoview.CompositeVideoView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class iov implements MediaPlayer.OnCompletionListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f31653a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f31654b;

    public /* synthetic */ iov(CompositeVideoView compositeVideoView, int i) {
        this.f31654b = i;
        this.f31653a = compositeVideoView;
    }

    public /* synthetic */ iov(iox ioxVar, int i) {
        this.f31654b = i;
        this.f31653a = ioxVar;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        switch (this.f31654b) {
            case 0:
                iox ioxVar = (iox) this.f31653a;
                ioxVar.f31657b.mo11567c();
                ioxVar.f31657b.f31660f.mo11559a();
                break;
            default:
                htq htqVar = ((CompositeVideoView) this.f31653a).f6998b;
                if (htqVar != null) {
                    htqVar.onCompletion(mediaPlayer);
                }
                break;
        }
    }
}
