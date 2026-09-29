package p042c6;

import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: c6.d */
/* JADX INFO: loaded from: classes.dex */
public final class C1732d extends AbstractC1731c<Drawable> {
    public C1732d(Drawable drawable) {
        super(drawable);
    }

    @Override // p392t5.InterfaceC9207m
    /* JADX INFO: renamed from: b */
    public final void mo157b() {
    }

    @Override // p392t5.InterfaceC9207m
    /* JADX INFO: renamed from: c */
    public final int mo158c() {
        T t10 = this.f9577a;
        return Math.max(1, t10.getIntrinsicHeight() * t10.getIntrinsicWidth() * 4);
    }

    @Override // p392t5.InterfaceC9207m
    /* JADX INFO: renamed from: d */
    public final Class<Drawable> mo159d() {
        return this.f9577a.getClass();
    }
}
