package p000;

import android.graphics.Rect;
import android.hardware.HardwareBuffer;
import com.google.android.libraries.lens.lenslite.api.ImageProxy;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class eyu implements ImageProxy {

    /* JADX INFO: renamed from: a */
    private final kpw f21010a;

    public eyu(kpw kpwVar) {
        this.f21010a = kpwVar;
    }

    @Override // com.google.android.libraries.lens.lenslite.api.ImageProxy, java.lang.AutoCloseable
    public final void close() {
        this.f21010a.close();
    }

    @Override // com.google.android.libraries.lens.lenslite.api.ImageProxy
    public final Rect getCropRect() {
        return this.f21010a.mo7249e();
    }

    @Override // com.google.android.libraries.lens.lenslite.api.ImageProxy
    public final int getFormat() {
        return this.f21010a.mo7245a();
    }

    @Override // com.google.android.libraries.lens.lenslite.api.ImageProxy
    public final HardwareBuffer getHardwareBuffer() {
        return this.f21010a.mo7250f();
    }

    @Override // com.google.android.libraries.lens.lenslite.api.ImageProxy
    public final int getHeight() {
        return this.f21010a.mo7246b();
    }

    @Override // com.google.android.libraries.lens.lenslite.api.ImageProxy
    public final List getPlanes() {
        List listMo7251g = this.f21010a.mo7251g();
        mwn mwnVar = new mwn();
        Iterator it = listMo7251g.iterator();
        while (it.hasNext()) {
            mwnVar.m17082g(new eyt((kpv) it.next()));
        }
        return mwnVar.m17081f();
    }

    @Override // com.google.android.libraries.lens.lenslite.api.ImageProxy
    public final long getTimestamp() {
        return this.f21010a.mo7248d();
    }

    @Override // com.google.android.libraries.lens.lenslite.api.ImageProxy
    public final int getWidth() {
        return this.f21010a.mo7247c();
    }

    @Override // com.google.android.libraries.lens.lenslite.api.ImageProxy
    public final void setCropRect(Rect rect) {
        this.f21010a.mo7252h(rect);
    }
}
