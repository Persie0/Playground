package p042c6;

import ae.C0062b;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import p087e6.C5374c;
import p392t5.InterfaceC9204j;
import p392t5.InterfaceC9207m;

/* JADX INFO: renamed from: c6.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1731c<T extends Drawable> implements InterfaceC9207m<T>, InterfaceC9204j {

    /* JADX INFO: renamed from: a */
    public final T f9577a;

    public AbstractC1731c(T t10) {
        C0062b.m345f0(t10);
        this.f9577a = t10;
    }

    @Override // p392t5.InterfaceC9204j
    /* JADX INFO: renamed from: a */
    public void mo156a() {
        T t10 = this.f9577a;
        if (t10 instanceof BitmapDrawable) {
            ((BitmapDrawable) t10).getBitmap().prepareToDraw();
        } else if (t10 instanceof C5374c) {
            ((C5374c) t10).f33757a.f33767a.f33780l.prepareToDraw();
        }
    }

    @Override // p392t5.InterfaceC9207m
    public final Object get() {
        T t10 = this.f9577a;
        Drawable.ConstantState constantState = t10.getConstantState();
        return constantState == null ? t10 : constantState.newDrawable();
    }
}
