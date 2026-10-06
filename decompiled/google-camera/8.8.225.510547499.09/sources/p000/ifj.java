package p000;

import android.graphics.Outline;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.apps.camera.p014ui.shutterbutton.ShutterButton;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ifj extends ViewOutlineProvider {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ ShutterButton f30659a;

    public ifj(ShutterButton shutterButton) {
        this.f30659a = shutterButton;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        Rect rect = new Rect();
        this.f30659a.buttonRect.round(rect);
        outline.setRoundRect(rect, this.f30659a.getCurrentSpec().f30842t);
    }
}
