package p000;

import android.graphics.Bitmap;
import java.util.function.Consumer;
import p021j$.util.function.Consumer$CC;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class cue implements Consumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f9596a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f9597b;

    /* JADX INFO: renamed from: c */
    private final /* synthetic */ int f9598c;

    public /* synthetic */ cue(Bitmap bitmap, int i, int i2) {
        this.f9598c = i2;
        this.f9597b = bitmap;
        this.f9596a = i;
    }

    public /* synthetic */ cue(cug cugVar, int i, int i2) {
        this.f9598c = i2;
        this.f9597b = cugVar;
        this.f9596a = i;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.f9598c) {
            case 0:
                break;
            case 1:
                break;
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.f9598c) {
            case 0:
                Object obj2 = this.f9597b;
                if (this.f9596a >= ((Integer) obj).intValue()) {
                    ((cug) obj2).f9613g.m5744b();
                }
                break;
            case 1:
                Object obj3 = this.f9597b;
                if (this.f9596a >= ((Integer) obj).intValue()) {
                    cug cugVar = (cug) obj3;
                    cugVar.f9612f.mo13961e("Successive Frame Drops Trigger: ".concat(bzq.m3252Y(cugVar.f9609c, cugVar.f9611e, ((Float) cugVar.f9610d.f9272b.mo3831be()).floatValue())));
                    cugVar.f9612f.mo13962f();
                    cugVar.f9614h.m2632z();
                }
                break;
            default:
                ((gyi) obj).mo3962o((Bitmap) this.f9597b, this.f9596a);
                break;
        }
    }
}
