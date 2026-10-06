package p000;

import android.content.Context;
import android.net.Uri;
import com.google.android.apps.camera.p014ui.compositevideoview.CompositeVideoView;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class czv {

    /* JADX INFO: renamed from: a */
    public final Context f10162a;

    /* JADX INFO: renamed from: b */
    public final CompositeVideoView f10163b;

    /* JADX INFO: renamed from: c */
    public final CompositeVideoView f10164c;

    /* JADX INFO: renamed from: d */
    public final Uri f10165d;

    /* JADX INFO: renamed from: e */
    public final ScheduledExecutorService f10166e;

    /* JADX INFO: renamed from: f */
    public Runnable f10167f = cik.f5796d;

    /* JADX INFO: renamed from: g */
    public ScheduledFuture f10168g;

    /* JADX INFO: renamed from: h */
    public final ihk f10169h;

    /* JADX INFO: renamed from: i */
    private final Executor f10170i;

    /* JADX INFO: renamed from: j */
    private nps f10171j;

    public czv(CompositeVideoView compositeVideoView, CompositeVideoView compositeVideoView2, ihk ihkVar, Context context, Executor executor, Uri uri, ScheduledExecutorService scheduledExecutorService, byte[] bArr, byte[] bArr2) {
        this.f10163b = compositeVideoView;
        this.f10164c = compositeVideoView2;
        this.f10169h = ihkVar;
        this.f10162a = context;
        this.f10170i = executor;
        this.f10165d = uri;
        this.f10166e = scheduledExecutorService;
    }

    /* JADX INFO: renamed from: a */
    public final void m5753a() {
        nps npsVar = this.f10171j;
        if (npsVar == null || npsVar.isDone()) {
            return;
        }
        this.f10171j.cancel(false);
    }

    /* JADX INFO: renamed from: b */
    public final void m5754b() {
        this.f10169h.m11341f(this.f10165d);
        m5755c();
    }

    /* JADX INFO: renamed from: c */
    public final void m5755c() {
        nps npsVarM11340e = this.f10169h.m11340e(this.f10165d);
        this.f10171j = npsVarM11340e;
        jvh.m13562j(npsVarM11340e, new cis(this, 3), this.f10170i);
    }

    /* JADX INFO: renamed from: d */
    public final void m5756d() {
        m5757e();
        this.f10164c.m4318b();
        this.f10163b.m4318b();
        this.f10164c.mo4317a();
        this.f10163b.mo4317a();
    }

    /* JADX INFO: renamed from: e */
    public final void m5757e() {
        this.f10163b.mo4329m();
        this.f10164c.mo4329m();
    }

    /* JADX INFO: renamed from: f */
    public final void m5758f() {
        this.f10163b.f6998b = new czu(this);
    }
}
