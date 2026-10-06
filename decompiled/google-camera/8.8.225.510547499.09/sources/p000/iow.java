package p000;

import android.media.MediaPlayer;
import com.google.android.apps.camera.p014ui.compositevideoview.CompositeVideoView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class iow implements MediaPlayer.OnPreparedListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f31655a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f31656b;

    public /* synthetic */ iow(CompositeVideoView compositeVideoView, int i) {
        this.f31656b = i;
        this.f31655a = compositeVideoView;
    }

    public /* synthetic */ iow(iox ioxVar, int i) {
        this.f31656b = i;
        this.f31655a = ioxVar;
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) {
        switch (this.f31656b) {
            case 0:
                iox ioxVar = (iox) this.f31655a;
                mediaPlayer.setLooping(ioxVar.f31657b.f31665k);
                ioy ioyVar = ioxVar.f31657b;
                if (!ioyVar.f31664j) {
                    ioyVar.mo11569cg();
                } else {
                    ioyVar.mo11570i();
                }
                break;
            default:
                htq htqVar = ((CompositeVideoView) this.f31655a).f6998b;
                if (htqVar != null) {
                    htqVar.onPrepared(mediaPlayer);
                }
                break;
        }
    }
}
