package p000;

import com.google.android.libraries.vision.visionkit.f250.internal.uploader.work.F250Worker;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@omh(m18656b = "com.google.android.libraries.vision.visionkit.f250.internal.uploader.work.F250Worker", m18657c = "F250Worker.kt", m18658d = "pauseOrFailInProgressUploads", m18659e = {111, 194, 113, 120, 209, 122, 137, 224, 139})
public final class mbw extends omf {

    /* JADX INFO: renamed from: a */
    public Object f39880a;

    /* JADX INFO: renamed from: b */
    public Object f39881b;

    /* JADX INFO: renamed from: c */
    public Object f39882c;

    /* JADX INFO: renamed from: d */
    public Object f39883d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f39884e;

    /* JADX INFO: renamed from: f */
    final /* synthetic */ F250Worker f39885f;

    /* JADX INFO: renamed from: g */
    public int f39886g;

    /* JADX INFO: renamed from: h */
    public mau f39887h;

    /* JADX INFO: renamed from: i */
    public List f39888i;

    /* JADX INFO: renamed from: j */
    public oer f39889j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mbw(F250Worker f250Worker, ols olsVar) {
        super(olsVar);
        this.f39885f = f250Worker;
    }

    @Override // p000.omd
    /* JADX INFO: renamed from: b */
    public final Object mo561b(Object obj) {
        this.f39884e = obj;
        this.f39886g |= Integer.MIN_VALUE;
        return this.f39885f.m4731j(null, this);
    }
}
