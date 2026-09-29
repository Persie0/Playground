package p152hb;

import com.google.android.gms.common.api.AbstractC2543b;
import com.google.android.gms.common.api.C2542a;
import com.google.android.gms.common.api.C2542a.c;
import com.google.android.gms.common.api.internal.AbstractC2546a;
import gb.InterfaceC5740d;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;
import p070db.AbstractC5132l;
import p412ub.HandlerC9517f;

/* JADX INFO: renamed from: hb.w0 */
/* JADX INFO: loaded from: classes.dex */
public final class C6020w0<O extends C2542a.c> extends C6007s {

    /* JADX INFO: renamed from: c */
    @NotOnlyInitialized
    public final AbstractC2543b<O> f35620c;

    public C6020w0(AbstractC2543b<O> abstractC2543b) {
        this.f35620c = abstractC2543b;
    }

    /* JADX INFO: renamed from: j */
    public final <A, T extends AbstractC2546a<? extends InterfaceC5740d, A>> T m12471j(T t10) {
        AbstractC2543b<O> abstractC2543b = this.f35620c;
        abstractC2543b.getClass();
        t10.m7570i();
        C5961d c5961d = abstractC2543b.f13896j;
        c5961d.getClass();
        C5988l1 c5988l1 = new C5988l1((AbstractC5132l) t10);
        HandlerC9517f handlerC9517f = c5961d.f35440I;
        handlerC9517f.sendMessage(handlerC9517f.obtainMessage(4, new C5963d1(c5988l1, c5961d.f35450i.get(), abstractC2543b)));
        return t10;
    }
}
