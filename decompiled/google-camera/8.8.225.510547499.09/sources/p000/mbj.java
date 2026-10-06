package p000;

import com.google.android.apps.camera.bottombar.C0100R;
import com.google.android.libraries.vision.visionkit.f250.internal.uploader.work.F250AutoWorker;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@omh(m18656b = "com.google.android.libraries.vision.visionkit.f250.internal.uploader.work.F250AutoWorker", m18657c = "F250AutoWorker.kt", m18658d = "enqueueNextAutoUploadOrExpireWork", m18659e = {99, C0100R.styleable.AppCompatTheme_windowMinWidthMajor, 102, 104})
public final class mbj extends omf {

    /* JADX INFO: renamed from: a */
    public Object f39798a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f39799b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ F250AutoWorker f39800c;

    /* JADX INFO: renamed from: d */
    public int f39801d;

    /* JADX INFO: renamed from: e */
    public mau f39802e;

    /* JADX INFO: renamed from: f */
    public mav f39803f;

    /* JADX INFO: renamed from: g */
    public oer f39804g;

    /* JADX INFO: renamed from: h */
    public okv f39805h;

    /* JADX INFO: renamed from: i */
    public okv f39806i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mbj(F250AutoWorker f250AutoWorker, ols olsVar) {
        super(olsVar);
        this.f39800c = f250AutoWorker;
    }

    @Override // p000.omd
    /* JADX INFO: renamed from: b */
    public final Object mo561b(Object obj) {
        this.f39799b = obj;
        this.f39801d |= Integer.MIN_VALUE;
        return this.f39800c.m4728j(null, this);
    }
}
