package androidx.compose.p002ui.platform;

import android.os.Build;
import android.view.View;
import android.view.contentcapture.ContentCaptureSession;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p000.AbstractC3708w3;
import p000.rk1;
import p000.ui3;

/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class AndroidComposeView$contentCaptureManager$1 extends FunctionReferenceImpl implements ui3 {
    @Override // p000.ui3
    /* JADX INFO: renamed from: a */
    public final Object mo0a() {
        View view = (View) this.f47704b;
        if (Build.VERSION.SDK_INT >= 30) {
            AbstractC3708w3.m23696e(view);
        }
        ContentCaptureSession contentCaptureSession = view.getContentCaptureSession();
        if (contentCaptureSession == null) {
            return null;
        }
        return new rk1(contentCaptureSession, view);
    }
}
