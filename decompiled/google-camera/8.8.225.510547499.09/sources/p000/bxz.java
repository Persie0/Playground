package p000;

import android.graphics.Bitmap;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bxz implements bsz {

    /* JADX INFO: renamed from: a */
    private final /* synthetic */ int f4730a;

    /* JADX INFO: renamed from: b */
    private final Object f4731b;

    public bxz(Bitmap bitmap, int i) {
        this.f4730a = i;
        this.f4731b = bitmap;
    }

    public bxz(AnimatedImageDrawable animatedImageDrawable, int i) {
        this.f4730a = i;
        this.f4731b = animatedImageDrawable;
    }

    public bxz(byte[] bArr, int i) {
        this.f4730a = i;
        bzq.m3278r(bArr);
        this.f4731b = bArr;
    }

    @Override // p000.bsz
    /* JADX INFO: renamed from: b */
    public final Class mo3015b() {
        switch (this.f4730a) {
            case 0:
                return byte[].class;
            case 1:
                return Bitmap.class;
            default:
                return Drawable.class;
        }
    }

    @Override // p000.bsz
    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object mo3016c() {
        switch (this.f4730a) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.f4731b;
    }

    @Override // p000.bsz
    /* JADX INFO: renamed from: e */
    public final void mo3018e() {
        switch (this.f4730a) {
            case 0:
            case 1:
                break;
            default:
                ((AnimatedImageDrawable) this.f4731b).stop();
                ((AnimatedImageDrawable) this.f4731b).clearAnimationCallbacks();
                break;
        }
    }

    @Override // p000.bsz
    /* JADX INFO: renamed from: a */
    public final int mo3014a() {
        switch (this.f4730a) {
            case 0:
                return ((byte[]) this.f4731b).length;
            case 1:
                return cbi.m3380a((Bitmap) this.f4731b);
            default:
                int intrinsicWidth = ((AnimatedImageDrawable) this.f4731b).getIntrinsicWidth() * ((AnimatedImageDrawable) this.f4731b).getIntrinsicHeight() * cbi.m3381b(Bitmap.Config.ARGB_8888);
                return intrinsicWidth + intrinsicWidth;
        }
    }
}
