package p000;

import com.google.android.apps.camera.bottombar.C0100R;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hqc implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ long f29038a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ float f29039b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f29040c;

    /* JADX INFO: renamed from: d */
    private final /* synthetic */ int f29041d;

    public /* synthetic */ hqc(eux euxVar, float f, long j, int i) {
        this.f29041d = i;
        this.f29040c = euxVar;
        this.f29039b = f;
        this.f29038a = j;
    }

    public /* synthetic */ hqc(hqk hqkVar, long j, float f, int i) {
        this.f29041d = i;
        this.f29040c = hqkVar;
        this.f29038a = j;
        this.f29039b = f;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f29041d) {
            case 0:
                Object obj = this.f29040c;
                long j = this.f29038a;
                float f = this.f29039b;
                hqk hqkVar = (hqk) obj;
                if (hqkVar.m10605k()) {
                    long millis = (long) (TimeUnit.SECONDS.toMillis(j) / f);
                    hqkVar.f29085h.mo10854g(millis);
                    hqkVar.f29056D.mo11610l("/video_state_recording_output", millis);
                    if (hqkVar.f29079b.get() != j) {
                        hqkVar.f29093p.mo11229ak();
                        hqkVar.f29079b.set(j);
                    }
                    break;
                }
                break;
            default:
                Object obj2 = this.f29040c;
                float f2 = this.f29039b;
                eux euxVar = (eux) obj2;
                euxVar.f20269a.f20315i.mo11196D((int) (100.0f * f2), this.f29038a, false);
                euxVar.m7917g(f2);
                euxVar.f20269a.f20317k.mo8588a();
                if (f2 == 1.0f) {
                    euxVar.f20269a.f20315i.mo11241m();
                    euxVar.f20269a.f20316j.mo10316b(C0100R.raw.camera_shutter);
                }
                break;
        }
    }
}
