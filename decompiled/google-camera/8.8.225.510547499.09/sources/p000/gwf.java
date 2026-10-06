package p000;

import android.content.Context;
import android.os.SystemClock;
import android.view.Choreographer;
import android.view.MotionEvent;
import com.google.android.apps.camera.p014ui.layout.GcaLayout;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class gwf extends GcaLayout {
    public gwf(Context context) {
        super(context);
        setTag(toString());
        setVisibility(8);
    }

    /* JADX INFO: renamed from: a */
    public static final nps m9854a() {
        final nqf nqfVarM17621g = nqf.m17621g();
        Choreographer.getInstance().postFrameCallback(new Choreographer.FrameCallback() { // from class: gwe
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j) {
                nqf nqfVar = nqfVarM17621g;
                jay jayVar = new jay();
                SystemClock.uptimeMillis();
                jayVar.f33635a = SystemClock.elapsedRealtimeNanos();
                nqfVar.mo14894e(jayVar);
            }
        });
        return nqfVarM17621g;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return true;
    }
}
