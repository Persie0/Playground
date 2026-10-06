package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.apps.camera.videoplayer.VideoPlayerActivity;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class inz extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ VideoPlayerActivity f31621a;

    public inz(VideoPlayerActivity videoPlayerActivity) {
        this.f31621a = videoPlayerActivity;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.f31621a.finish();
    }
}
