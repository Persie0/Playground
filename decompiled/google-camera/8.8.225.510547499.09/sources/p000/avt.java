package p000;

import androidx.window.extensions.area.WindowAreaComponent;
import java.util.function.Consumer;
import p021j$.util.function.Consumer$CC;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class avt implements Consumer {

    /* JADX INFO: renamed from: a */
    private final WindowAreaComponent f2546a;

    /* JADX INFO: renamed from: b */
    private avp f2547b;

    /* JADX INFO: renamed from: c */
    private final eno f2548c;

    public avt(eno enoVar, WindowAreaComponent windowAreaComponent) {
        this.f2548c = enoVar;
        this.f2546a = windowAreaComponent;
    }

    /* JADX INFO: renamed from: a */
    private final void m2064a() {
        this.f2547b = null;
        eno enoVar = this.f2548c;
        enoVar.f14781e = null;
        enoVar.f14778b.mo3415bf(false);
        enoVar.f14780d = false;
    }

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        switch (((Number) obj).intValue()) {
            case 0:
                m2064a();
                break;
            case 1:
                avp avpVar = new avp(this.f2546a);
                this.f2547b = avpVar;
                eno enoVar = this.f2548c;
                enoVar.f14781e = avpVar;
                enoVar.f14778b.mo3415bf(true);
                enoVar.f14780d = false;
                break;
            default:
                m2064a();
                break;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }
}
