package p000;

import android.view.View;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;

/* JADX INFO: loaded from: classes.dex */
public final class rk1 {

    /* JADX INFO: renamed from: a */
    public final ContentCaptureSession f59422a;

    /* JADX INFO: renamed from: b */
    public final View f59423b;

    public rk1(ContentCaptureSession contentCaptureSession, View view) {
        this.f59422a = contentCaptureSession;
        this.f59423b = view;
    }

    /* JADX INFO: renamed from: a */
    public final AutofillId m20676a(long j) {
        return s8d.m21156b(this.f59422a, this.f59423b.getAutofillId(), j);
    }
}
