package p000;

import android.media.MediaPlayer;
import com.google.android.apps.camera.p014ui.eduimageview.EduImageView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class czu implements htq {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ czv f10161a;

    public czu(czv czvVar) {
        this.f10161a = czvVar;
    }

    @Override // p000.htq
    /* JADX INFO: renamed from: a */
    public final void mo5750a() {
        if (inr.m11534f(this.f10161a.f10162a) == 1) {
            EduImageView.m4359d(this.f10161a.f10162a);
        } else {
            this.f10161a.f10163b.mo4317a();
            this.f10161a.m5754b();
        }
    }

    @Override // p000.htq
    /* JADX INFO: renamed from: b */
    public final void mo5751b() {
    }

    @Override // p000.htq
    /* JADX INFO: renamed from: c */
    public final void mo5752c() {
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        this.f10161a.f10163b.mo4320d(0);
        this.f10161a.f10164c.mo4320d(0);
        this.f10161a.m5757e();
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) {
        this.f10161a.f10167f.run();
    }
}
