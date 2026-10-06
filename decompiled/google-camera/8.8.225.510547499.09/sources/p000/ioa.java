package p000;

import android.graphics.Rect;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.VideoView;
import com.google.android.apps.camera.bottombar.C0100R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ioa extends ComponentCallbacksC0077bw {

    /* JADX INFO: renamed from: a */
    public ipb f31625a;

    /* JADX INFO: renamed from: b */
    public mrm f31626b = mqu.f41450a;

    /* JADX INFO: renamed from: c */
    private ioy f31627c;

    /* JADX INFO: renamed from: c */
    public static ioa m11558c(Bundle bundle, Uri uri) {
        bundle.putParcelable("video_uri", uri);
        ioa ioaVar = new ioa();
        ioaVar.setArguments(bundle);
        return ioaVar;
    }

    @Override // p000.ComponentCallbacksC0077bw
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(C0100R.layout.videoplayer_fragment, viewGroup, false);
        this.f31627c = new ion();
        int i = 6;
        ioe ioeVar = new ioe(new doy(this, i));
        ioj iojVar = new ioj();
        boolean z = this.f4610l.getBoolean("auto_loop_enabled", false);
        ipb ipbVar = new ipb(this.f31627c, ioeVar, iojVar, viewInflate, this.f4610l.getBoolean("no_seek_bar", false));
        this.f31625a = ipbVar;
        ipbVar.f31677f = (VideoView) ipbVar.f31675d.findViewById(C0100R.id.video_view);
        ipbVar.f31677f.setOnTouchListener(new cln(ipbVar, 20));
        ipbVar.f31675d.setOnClickListener(new iec(ipbVar, 8));
        ipbVar.f31677f.setWillNotDraw(false);
        ipbVar.f31679h = (ImageButton) ipbVar.f31675d.findViewById(C0100R.id.videoplayer_pause_button);
        ipbVar.f31679h.setOnClickListener(new iec(ipbVar, 7));
        ipbVar.f31678g = (ImageButton) ipbVar.f31675d.findViewById(C0100R.id.videoplayer_play_button);
        ipbVar.f31678g.setOnClickListener(new iec(ipbVar, i));
        ipbVar.f31683l = ipbVar.f31675d.findViewById(C0100R.id.video_progress_group);
        ipbVar.f31682k = (SeekBar) ipbVar.f31675d.findViewById(C0100R.id.video_player_progress);
        ipbVar.f31682k.setOnSeekBarChangeListener(new hxg(ipbVar, 2));
        ipbVar.f31680i = (TextView) ipbVar.f31675d.findViewById(C0100R.id.video_total_time);
        ipbVar.f31681j = (TextView) ipbVar.f31675d.findViewById(C0100R.id.video_current_time);
        ipbVar.f31686o = ipbVar.f31675d.findViewById(C0100R.id.video_view_holder);
        if (this.f31626b.mo16813g()) {
            this.f31625a.f31677f.setOnInfoListener((MediaPlayer.OnInfoListener) this.f31626b.mo16809c());
        }
        Rect rect = (Rect) this.f4610l.getParcelable("video_view_padding");
        if (rect != null) {
            this.f31625a.m11577d(rect);
        }
        Uri uri = (Uri) this.f4610l.getParcelable("video_uri");
        uri.getClass();
        ipb ipbVar2 = this.f31625a;
        iojVar.mo11564c(ipbVar2, new jwl(ipbVar2));
        iojVar.mo5711f();
        iojVar.mo5712g();
        this.f31627c.mo11571j(this.f31625a, uri, ioeVar, iojVar, bundle == null ? 0 : bundle.getInt("videoplayer_position", 0), bundle == null ? true : bundle.getBoolean("videoplayer_playing_state", true), z);
        this.f31627c.mo5711f();
        ioeVar.mo5711f();
        return viewInflate;
    }

    @Override // p000.ComponentCallbacksC0077bw
    public final void onPause() {
        super.onPause();
        this.f31627c.mo11566b();
    }

    @Override // p000.ComponentCallbacksC0077bw
    public final void onResume() {
        super.onResume();
        this.f31627c.mo11572k();
    }

    @Override // p000.ComponentCallbacksC0077bw
    public final void onSaveInstanceState(Bundle bundle) {
        boolean zIsPlaying = this.f31625a.f31677f.isPlaying();
        int currentPosition = this.f31625a.f31677f.getCurrentPosition();
        bundle.putBoolean("videoplayer_playing_state", zIsPlaying);
        bundle.putInt("videoplayer_position", currentPosition);
    }
}
