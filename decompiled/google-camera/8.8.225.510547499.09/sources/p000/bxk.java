package p000;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bxk implements bsz, bsw {

    /* JADX INFO: renamed from: a */
    private final /* synthetic */ int f4701a;

    /* JADX INFO: renamed from: b */
    private final Object f4702b;

    /* JADX INFO: renamed from: c */
    private final Object f4703c;

    public bxk(Bitmap bitmap, bti btiVar, int i) {
        this.f4701a = i;
        bzq.m3277q(bitmap, "Bitmap must not be null");
        this.f4702b = bitmap;
        this.f4703c = btiVar;
    }

    /* JADX INFO: renamed from: f */
    public static bsz m3161f(Resources resources, bsz bszVar) {
        if (bszVar == null) {
            return null;
        }
        return new bxk(resources, bszVar, 0);
    }

    /* JADX INFO: renamed from: g */
    public static bxk m3162g(Bitmap bitmap, bti btiVar) {
        if (bitmap == null) {
            return null;
        }
        return new bxk(bitmap, btiVar, 1);
    }

    @Override // p000.bsz
    /* JADX INFO: renamed from: b */
    public final Class mo3015b() {
        switch (this.f4701a) {
            case 0:
                return BitmapDrawable.class;
            default:
                return Bitmap.class;
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [bsz, java.lang.Object] */
    @Override // p000.bsz
    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object mo3016c() {
        switch (this.f4701a) {
            case 0:
                return new BitmapDrawable((Resources) this.f4702b, (Bitmap) this.f4703c.mo3016c());
            default:
                return this.f4702b;
        }
    }

    @Override // p000.bsw
    /* JADX INFO: renamed from: d */
    public final void mo3026d() {
        switch (this.f4701a) {
            case 0:
                Object obj = this.f4703c;
                if (obj instanceof bsw) {
                    ((bsw) obj).mo3026d();
                }
                break;
            default:
                ((Bitmap) this.f4702b).prepareToDraw();
                break;
        }
    }

    private bxk(Resources resources, bsz bszVar, int i) {
        this.f4701a = i;
        bzq.m3278r(resources);
        this.f4702b = resources;
        bzq.m3278r(bszVar);
        this.f4703c = bszVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [bsz, java.lang.Object] */
    @Override // p000.bsz
    /* JADX INFO: renamed from: a */
    public final int mo3014a() {
        switch (this.f4701a) {
            case 0:
                return this.f4703c.mo3014a();
            default:
                return cbi.m3380a((Bitmap) this.f4702b);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [bsz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [bti, java.lang.Object] */
    @Override // p000.bsz
    /* JADX INFO: renamed from: e */
    public final void mo3018e() {
        switch (this.f4701a) {
            case 0:
                this.f4703c.mo3018e();
                break;
            default:
                this.f4703c.mo3045d((Bitmap) this.f4702b);
                break;
        }
    }
}
