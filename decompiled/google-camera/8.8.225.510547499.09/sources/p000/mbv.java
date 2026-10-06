package p000;

import com.google.android.libraries.vision.visionkit.f250.internal.uploader.work.F250Worker;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@omh(m18656b = "com.google.android.libraries.vision.visionkit.f250.internal.uploader.work.F250Worker", m18657c = "F250Worker.kt", m18658d = "failPermanentlyInvalidUploads", m18659e = {95, 194, 98})
public final class mbv extends omf {

    /* JADX INFO: renamed from: a */
    public Object f39871a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f39872b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ F250Worker f39873c;

    /* JADX INFO: renamed from: d */
    public int f39874d;

    /* JADX INFO: renamed from: e */
    public mau f39875e;

    /* JADX INFO: renamed from: f */
    public mav f39876f;

    /* JADX INFO: renamed from: g */
    public oer f39877g;

    /* JADX INFO: renamed from: h */
    public okv f39878h;

    /* JADX INFO: renamed from: i */
    public okv f39879i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mbv(F250Worker f250Worker, ols olsVar) {
        super(olsVar);
        this.f39873c = f250Worker;
    }

    @Override // p000.omd
    /* JADX INFO: renamed from: b */
    public final Object mo561b(Object obj) {
        this.f39872b = obj;
        this.f39874d |= Integer.MIN_VALUE;
        return this.f39873c.m4730i(null, this);
    }
}
