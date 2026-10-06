package p000;

import android.content.Context;
import android.content.DialogInterface;
import android.media.MediaPlayer;
import android.net.Uri;
import com.google.android.apps.camera.p014ui.eduimageview.EduImageView;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hjh implements DialogInterface.OnDismissListener, htq {

    /* JADX INFO: renamed from: a */
    public final Context f28039a;

    /* JADX INFO: renamed from: b */
    public final htr f28040b;

    /* JADX INFO: renamed from: c */
    public final Uri f28041c;

    /* JADX INFO: renamed from: d */
    public final ScheduledExecutorService f28042d;

    /* JADX INFO: renamed from: e */
    public ScheduledFuture f28043e;

    /* JADX INFO: renamed from: f */
    public final ihk f28044f;

    /* JADX INFO: renamed from: g */
    private final hiz f28045g;

    /* JADX INFO: renamed from: h */
    private final Executor f28046h;

    public hjh(htr htrVar, Uri uri, Context context, ihk ihkVar, hiz hizVar, Executor executor, ScheduledExecutorService scheduledExecutorService, byte[] bArr, byte[] bArr2) {
        this.f28039a = context;
        this.f28044f = ihkVar;
        this.f28040b = htrVar;
        this.f28041c = uri;
        this.f28045g = hizVar;
        this.f28046h = executor;
        this.f28042d = scheduledExecutorService;
    }

    @Override // p000.htq
    /* JADX INFO: renamed from: a */
    public final void mo5750a() {
        if (inr.m11534f(this.f28039a) == 1) {
            EduImageView.m4359d(this.f28039a);
            return;
        }
        this.f28044f.m11341f(this.f28041c);
        this.f28040b.mo4328l();
        m10377e();
    }

    @Override // p000.htq
    /* JADX INFO: renamed from: b */
    public final void mo5751b() {
        if (this.f28040b.mo4331o()) {
            this.f28040b.mo4319c();
            this.f28040b.mo4327k();
        }
    }

    @Override // p000.htq
    /* JADX INFO: renamed from: c */
    public final void mo5752c() {
        this.f28040b.mo4317a();
        hiz hizVar = this.f28045g;
        if (equals(hizVar.f27969d)) {
            hizVar.f27968c.mo5751b();
        } else if (equals(hizVar.f27968c)) {
            hizVar.f27969d.mo5751b();
        }
        this.f28040b.mo4329m();
    }

    /* JADX INFO: renamed from: d */
    public final void m10376d() {
        ScheduledFuture scheduledFuture = this.f28043e;
        if (scheduledFuture == null || scheduledFuture.isDone()) {
            return;
        }
        this.f28043e.cancel(false);
    }

    /* JADX INFO: renamed from: e */
    public final void m10377e() {
        jvh.m13562j(this.f28044f.m11340e(this.f28041c), new gjd(this, 7), this.f28046h);
    }

    /* JADX INFO: renamed from: f */
    public final void m10378f(String str) {
        this.f28040b.mo4325i(str);
    }

    /* JADX INFO: renamed from: g */
    public final void m10379g() {
        this.f28040b.mo4321e(this);
        jvh.m13562j(this.f28044f.m11340e(this.f28041c), new gjd(this, 8), this.f28046h);
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        this.f28040b.mo4327k();
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.f28040b.mo4330n();
        m10376d();
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) {
        this.f28040b.mo4320d(41);
        this.f28040b.mo4327k();
    }
}
