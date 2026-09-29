package p030b9;

import java.util.concurrent.Executor;
import java.util.logging.Logger;
import p045c9.InterfaceC1757k;
import p068d9.InterfaceC5090d;
import p090e9.InterfaceC5385a;
import p395t8.InterfaceC9225g;
import p452w8.C9827h;
import p452w8.C9829j;
import p452w8.C9842w;
import p477x8.InterfaceC10117d;

/* JADX INFO: renamed from: b9.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1344c implements InterfaceC1345d {

    /* JADX INFO: renamed from: f */
    public static final Logger f8168f = Logger.getLogger(C9842w.class.getName());

    /* JADX INFO: renamed from: a */
    public final InterfaceC1757k f8169a;

    /* JADX INFO: renamed from: b */
    public final Executor f8170b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC10117d f8171c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC5090d f8172d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC5385a f8173e;

    public C1344c(Executor executor, InterfaceC10117d interfaceC10117d, InterfaceC1757k interfaceC1757k, InterfaceC5090d interfaceC5090d, InterfaceC5385a interfaceC5385a) {
        this.f8170b = executor;
        this.f8171c = interfaceC10117d;
        this.f8169a = interfaceC1757k;
        this.f8172d = interfaceC5090d;
        this.f8173e = interfaceC5385a;
    }

    @Override // p030b9.InterfaceC1345d
    /* JADX INFO: renamed from: a */
    public final void mo4926a(InterfaceC9225g interfaceC9225g, C9827h c9827h, C9829j c9829j) {
        this.f8170b.execute(new RunnableC1342a(this, c9829j, interfaceC9225g, c9827h, 0));
    }
}
